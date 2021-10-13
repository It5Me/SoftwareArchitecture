package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {
    public BookMetadataFormatter initFormatter() throws ParserConfigurationException, IOException {
        return new CSVBookMetadataFormatter();
    }

}
