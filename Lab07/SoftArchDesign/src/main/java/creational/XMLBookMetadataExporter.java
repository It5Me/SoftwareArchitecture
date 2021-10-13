package creational;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter {
    public BookMetadataFormatter initFormatter() throws ParserConfigurationException{
        return new XMLBookMetadataFormatter();
    }

}
