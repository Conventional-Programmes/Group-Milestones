
package conconnect.models.parse;

import conconnect.models.serializable.SerializableConvention;
import org.json.JSONArray;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;



import java.util.ArrayList;

@ParseClassName("Convention")
public class Convention extends ParseObject {

    private final String CONID = "conID";
    private final String TITLE = "title";
    private final String LOGO = "logo";
    private final String CATS = "categories";
    private final String LOC = "location";
    private final String PRICE = "price";

    public String getConID(){
        return getString("CONID");
    }

    public void setConID(String conID){
        put(CONID, conID);
    }

    public String getConTitle(){
        return getString("TITLE");
    }

    public void setConTitle(String title){
        put(TITLE, title);
    }

    public String getConLogo(){
        return getString("LOGO");
    }

    public void setConLogo(String logo){
        put(LOGO, logo);
    }

    public ArrayList<String> getConCats(){
        return (ArrayList<String>) get(CATS);
    }

    public void setConCats(ArrayList<String> categories){
        put("CATS", createJSONArray(categories));
    }


    public ArrayList<String> getConLoc(){
        return (ArrayList<String>) get(LOC);
    }


    public void setConLoc(ArrayList<String> location){
        put("LOC", createJSONArray(location));
    }

    public ArrayList<Double> getConPrice(){
        return (ArrayList<Double>) get(PRICE);
    }

    public void setConPrice(ArrayList<Double> price){
        put("PRICE", createJSONArray(price));
    }




    private JSONArray createJSONArray(ArrayList<?> arr) {

        JSONArray     list = new JSONArray();

        for(Object c: arr)
            list.put(c);
        return list;
    }

    public SerializableConvention getSerializable(){
        return new SerializableConvention(
                getConID(), getConTitle(), getConLogo(),
                getConCats(), getConLoc(), getConPrice()
        );
    }
}
