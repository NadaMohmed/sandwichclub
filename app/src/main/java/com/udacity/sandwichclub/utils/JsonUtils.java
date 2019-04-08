package com.udacity.sandwichclub.utils;

import android.util.Log;

import com.udacity.sandwichclub.model.Sandwich;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

public class JsonUtils {

    public static Sandwich parseSandwichJson(String json)
            throws JSONException    {
 // add any data to
        /*final String List = "list" ;
        final String mainName="chicken parpeque";
        final List<String> alsoKnownAs = null ;
        alsoKnownAs.add("friedchickensandwich") ;
        final  String placeOfOrigin ="america";
        final String description="it have fried chicken and paprpequie sauce";
        final String image = "";
        final List<String> ingredients =null;
        ingredients.add("fried chicken, tomato , parpeque sauce ") ;*/

        Sandwich sandwich /*= new Sandwich()*/ ;
        // make json object
        JSONObject jsonObject = new JSONObject(json) ;

        JSONObject variable = jsonObject.getJSONObject("name") ;

        // first varibale in class
        String firstvariable =variable.getString("mainName") ;
      //  sandwich.setMainName(firstvariable);

        // second variable in class
       // JSONObject  secondvariable = jsonObject.getJSONObject("alsoKnownAs") ;
        //JSONArray AlsoKnownAsArray = new JSONArray(name.getString("alsoKnownAs"));
        // det beta3te
        JSONArray also_KnownAs =variable.getJSONArray("alsoKnownAs") ;
        //JSONArray also_KnownAs = new JSONArray(variable.getString("alsoKnownAs")) ;
        List<String> array1 = new ArrayList<String>() {
        } ;
        for (int i=0 ; i< also_KnownAs.length();i++)
        {

                array1.add(also_KnownAs.getString(i));
        }
        //sandwich.setAlsoKnownAs(array1);

       String thirdvariable = jsonObject.getString("placeOfOrigin");
       //sandwich.setPlaceOfOrigin(thirdvariable);

        String fourthvariable = jsonObject.getString("description");
        //sandwich.setPlaceOfOrigin(thirdvariable);

        String fifthvariable = jsonObject.getString("image");
        //sandwich.setPlaceOfOrigin(fifthvariable);


// last object
        // JSONArray ingred = new JSONArray(variable.getString("ingredients")) ;

        JSONArray ingred = jsonObject.getJSONArray("ingredients") ;
        List<String> array2 = new ArrayList<String>() {
        } ;
        for (int i=0 ; i< ingred.length();i++)
        {

            array2.add(ingred.getString(i));
        }
        //sandwich.setAlsoKnownAs(array2);

      sandwich = new Sandwich(firstvariable,array1,thirdvariable,fourthvariable,fifthvariable,array2);
Log.e("i",sandwich.getMainName()+ " " + sandwich.getAlsoKnownAs() +" " + sandwich.getPlaceOfOrigin()) ;

        return sandwich;
    }
}
