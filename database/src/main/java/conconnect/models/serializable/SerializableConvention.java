
package conconnect.models.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializableConvention {

    private String conID;
    private String title;
    private String logo;
    private ArrayList<String> categories;
    private ArrayList<String> location;
    private ArrayList<Double> price;
}
