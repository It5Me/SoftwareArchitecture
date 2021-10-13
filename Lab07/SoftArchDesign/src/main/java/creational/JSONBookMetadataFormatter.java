package creational;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.Console;
import java.io.IOException;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONObject booksObject;
    private JSONArray booksArray;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }
    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        booksObject = new JSONObject();
        booksArray = new JSONArray();
        booksObject.put(Book.class.getSimpleName()+"s",booksArray);
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject objData = new JSONObject();
        JSONArray authorArray = new JSONArray();
        objData.put(Book.Metadata.ISBN.value,b.getISBN());

        for ( String author :b.getAuthors() ){
            authorArray.add(author);
        }
        objData.put(Book.Metadata.AUTHORS.value,authorArray);
        objData.put(Book.Metadata.TITLE.value,b.getTitle());
        objData.put(Book.Metadata.PUBLISHER.value,b.getPublisher());
        booksArray.add(objData);
//        System.out.println(objData);
        return this;
    }
    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return booksObject.toString();
    }
}
