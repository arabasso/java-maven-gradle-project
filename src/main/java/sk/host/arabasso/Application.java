package sk.host.arabasso;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by arabasso on 01/10/2016.
 *
 */
public class Application {
    public static void main(String [] args){
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("messages");

            System.out.println(bundle.getString("title"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
