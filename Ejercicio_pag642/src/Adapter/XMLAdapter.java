package Adapter;

public class XMLAdapter implements DataReader {
	private XMLReader xmlReader;
	
	public XMLAdapter(XMLReader xmlReader) {
		this.xmlReader = xmlReader;
	}
	
	@Override
	public void ReadData() {
		xmlReader.ParseXML();
	}
}
