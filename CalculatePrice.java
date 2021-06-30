import java.io.*;
import java.util.*;
import jdk.nashorn.internal.parser.*;

public class CalculatePrice {
     CalculatePrice(Date date , String frame , String handlebar , int gear , int geargrip , int seating , int seatingbottle , String wheels , int spokes , int rim , int tube , String tyre , String chain ) {

         int tyred=0;
         int frameprice=0;
        int chainprice=0;
        int tseatingprice=0;
        int wheelprice=0;
        int handlebarprice=0;
        int totalcyclengineprice;


        if(frame=="steel") {
            frameprice = 150;
        } else if(frame=="Aluminium") {
            frameprice = 100;
        }

        if(handlebar=="shockabsorb") {
            handlebarprice = 200 + (gear*100) + geargrip;
        }else {
            handlebarprice = 100 + (gear*100) + geargrip;
        }
        if(seating==1) {
            tseatingprice = 100 + seatingbottle;
        } else {
            tseatingprice = 200 + seatingbottle;
        }
        if(wheels=="steel") {
            wheelprice = 150 + spokes + rim + tyred + 200 + tube;
        } else if(wheels=="Aluminium") {
            wheelprice = 200 + spokes + rim + tyred + 100 + tube;
        }
        if(chain=="onespeed") {
            chainprice = 150;
        } else if(chain=="twospeed") {
            chainprice = 200;
        }

        totalcyclengineprice = frameprice + handlebarprice + wheelprice + chainprice + tseatingprice;

        System.out.print(totalcyclengineprice);



    }

        @SuppressWarnings("unchecked")
        public static void main(String[] args)
        {
            //JSON parser object to parse read file
            JSONParser jsonParser = new JSONParser();

            try (FileReader reader = new FileReader("example.json"))
            {
                //Read JSON file
                Object obj = jsonParser.parse();



                //Iterate over employee array
                employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
