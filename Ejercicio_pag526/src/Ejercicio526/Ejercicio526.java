package Ejercicio526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ejercicio526 {

	public static void main(String[] args) {
		Connection connection;
		final String url = "jdbc:mysql://localhost:3306/db_test";
		final String user = "admin";
		final String pass = "admin";
		
		int opcion = 0;
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		Usuario usuario;
		int columnasAfectadas;
		int opcionUsuario = 0;

		try {
			connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();

			do {
				System.out.println("***Creacion de usuarios en Java***");
				System.out.println("1.- Crear usuario");
				System.out.println("2.- Leer base de datos");
				System.out.println("3.- Actualizar usuario");
				System.out.println("4.- Borrar usuario");
				System.out.println("0.- Salir del programa");
				opcion = scInt.nextInt();
				System.out.println();
				
				switch(opcion) {
				case 1:
					usuario = new Usuario();
					System.out.print("Indica el nombre del usuario: ");
					usuario.setNombre(scString.nextLine());
					System.out.print("Indica la edad del usuario: ");
					usuario.setEdad(scInt.nextInt());
					System.out.print("Indica la nacionalidad del usuario: ");
					usuario.setNacionalidad(scString.nextLine());
					
					columnasAfectadas = statement.executeUpdate("INSERT IGNORE INTO db_test.usuarios (nombre, edad, nacionalidad) VALUES ('" + usuario.getNombre() + "', " + usuario.getEdad() + ", '" + usuario.getNacionalidad() + "')");
					if (columnasAfectadas > 0) {
						System.out.println("\nSe ha insertado correctamente al usuario " + usuario.getNombre());
					} else {
						System.out.println("\nHa habido un error");
					}
					System.out.println("\n");
					break;
					
				case 2:
					ImprimirUsuarios(connection, statement);
					System.out.println("\n");
					break;
					
				case 3:
					do {
						ImprimirUsuarios(connection, statement);
						System.out.print("\nSelecciona a un usuario por su id (0 = salir): ");
						opcionUsuario = scInt.nextInt();
						
						if (opcionUsuario > 0 && opcionUsuario <= CantidadUsuarios(connection, statement)) {
							usuario = new Usuario();
							System.out.print("Indica el nombre del usuario: ");
							usuario.setNombre(scString.nextLine());
							System.out.print("Indica la edad del usuario: ");
							usuario.setEdad(scInt.nextInt());
							System.out.print("Indica la nacionalidad del usuario: ");
							usuario.setNacionalidad(scString.nextLine());
							
							PreparedStatement statementUpdate = connection.prepareStatement("UPDATE db_test.usuarios SET Nombre = ?, Edad = ?, Nacionalidad = ? WHERE id_usuarios = ?");
							statementUpdate.setInt(4, opcionUsuario);
							statementUpdate.setString(1, usuario.getNombre());
							statementUpdate.setInt(2, usuario.getEdad());
							statementUpdate.setString(3, usuario.getNacionalidad());
							
							columnasAfectadas = statementUpdate.executeUpdate();
							if (columnasAfectadas > 0) {
								System.out.println("\nSe ha actualizado correctamente al usuario " + usuario.getNombre() + ": \n");
								ImprimirUsuarios(connection, statement);
							} else {
								System.out.println("\nHa habido un error");
							}
							
							opcionUsuario = 0;
						} else {
							System.out.println("No has seleccionado a un usuario correcto\n");
						}
					} while(opcionUsuario != 0);

					System.out.println("\n");
					break;
					
				case 4:
					do {
						ImprimirUsuarios(connection, statement);
						System.out.print("\nSelecciona a un usuario por su id (0 = salir): ");
						opcionUsuario = scInt.nextInt();
						
						if (opcionUsuario > 0 && opcionUsuario <= CantidadUsuarios(connection, statement)) {
							PreparedStatement statementDelete = connection.prepareStatement("DELETE FROM db_test.usuarios WHERE id_usuarios = ?");
			                statementDelete.setInt(1, opcionUsuario);

			                int filasAfectadas = statementDelete.executeUpdate();
			                if (filasAfectadas > 0) {
			                    System.out.println("\nUsuario eliminado correctamente.");
			                } else {
			                    System.out.println("\nHa habido un error");
			                }
			                
			                opcionUsuario = 0;
						} else {
							System.out.println("No has seleccionado a un usuario correcto\n");
						}
					} while(opcionUsuario != 0);
					
					System.out.println("\n");
					break;
					
				case 0:
					System.out.println("Saliendo del programa...");
					Thread.sleep(3000);
					break;
				default:
					System.out.println("No has introducido una opcion correcta.");
					break;
				}
			} while (opcion != 0);

			connection.close();
			statement.close();

			System.out.println("Connection closed.");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	private static int CantidadUsuarios(Connection connection, Statement statement) throws SQLException {
		ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) as total FROM db_test.usuarios");
		resultSet.next();
		return resultSet.getInt("total");
	}
	
	private static void ImprimirUsuarios(Connection connection, Statement statement) {
		try {
			ResultSet resultado = statement.executeQuery("SELECT * FROM db_test.usuarios");
			ResultSetMetaData rsmd = resultado.getMetaData();
			int columnCount = rsmd.getColumnCount();
			
			for(int i = 1; i < columnCount + 1; i++) {
				System.out.printf("%15s", rsmd.getColumnName(i).toString());
			}
			
			int spacing = (columnCount * 16);
			String textoFormateado = String.format("%n%" + spacing + "s", " ", " ").replace(' ', '-');
			System.out.println(textoFormateado);

			while (resultado.next()) {
				int id_usuarios = resultado.getInt("id_usuarios");
				String nombre = resultado.getString("Nombre");
				int edad = resultado.getInt("Edad");
				String nacionalidad = resultado.getString("Nacionalidad");
				System.out.printf("%15d%15s%15d%15s%n", id_usuarios, nombre, edad, nacionalidad);
			}
			
			resultado.close();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
