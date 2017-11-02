package com.example.ram.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ram_n on 10/5/2017.
 */

public class DealerViewActivity extends Activity{

    //String DealerName[];
    ArrayList<String> DealerAddress;
    ArrayList<String> DealerName;
    ArrayList<Dealer> dealer;
    ListView listView;
    TextView tv;
    GridView gridview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dealers);

        tv=(TextView) findViewById(R.id.textView3);
        listView=(ListView)findViewById(R.id.listView);
        Intent intent = getIntent();

        //Based on the car name display the dealers
        switch(intent.getStringExtra(MainActivity.DEALER))
        //switch(intent.getExtras().getString(MainActivity.DEALER))
        {
            case "Bentley"  :    DealerName= new ArrayList<String>(Arrays.asList("Howard Orloff Imports","The Import Auto Gallery","Bentley Gold Coast"));
                                DealerAddress=new ArrayList<String>(Arrays.asList("1924 N Paulina St, Chicago, IL 60622, USA","754 Annoreno Dr, Addison, IL 60101, USA","834 N Rush St, Chicago, IL 60611, USA"));
                                dealer=getDealers();
                                tv.setText("Bentley Dealers");
                                listView.setAdapter(new DealersAdapter(this, dealer));
                                break;
            case "Audi"     :    DealerName= new ArrayList<String>(Arrays.asList("Fletcher Jones Audi","Greater Chicago Motors","Audi Morton Grove"));
                                DealerAddress=new ArrayList<String>(Arrays.asList("1523 W North Ave, Chicago, IL 60642, USA","1850 N Elston Ave, Chicago, IL 60642, USA","7000 Golf Rd, Morton Grove, IL 60053, USA"));
                                dealer=getDealers();
                                tv.setText("Audi Dealers");
                                listView.setAdapter(new DealersAdapter(this, dealer));
                                break;
            case "BMW"     :    DealerName= new ArrayList<String>(Arrays.asList("Elmhurst BMW","Laurel BMW of Westmont","Perillo BMW"));
                                DealerAddress=new ArrayList<String>(Arrays.asList("466 W Lake St, Elmhurst, IL 60126, USA","430 E Ogden Ave, Westmont, IL 60559, USA","1035 N Clark St, Chicago, IL 60610, USA"));
                                dealer=getDealers();
                                tv.setText("BMW Dealers");
                                listView.setAdapter(new DealersAdapter(this, dealer));
                                break;
            case"Jeep"     :    DealerName= new ArrayList<String>(Arrays.asList("Sherman Dodge Chrysler Jeep RAM","South Chicago Dodge Chrysler Jeep","Marino Chrysler Jeep Dodge"));
                                DealerAddress=new ArrayList<String>(Arrays.asList("7601 Skokie Blvd, Skokie, IL 60077, USA","7601 Skokie Blvd, Skokie, IL 60077, USA","5133 W Irving Park Rd, Chicago, IL 60641, USA"));
                                dealer=getDealers();
                                tv.setText("Jeep Dealers");
                                listView.setAdapter(new DealersAdapter(this, dealer));
                                break;
            case "Mercedes":    DealerName= new ArrayList<String>(Arrays.asList("Mercedes-Benz of Chicago","Loeber Motors","Mercedes-Benz of Westmont"));
                                DealerAddress=new ArrayList<String>(Arrays.asList("Mercedes-Benz of Chicago\n" +
                                "1520 W North Ave\n" +
                                "Chicago, IL 60642\n" +
                                "(855) 405-3361","4255 W Touhy Ave\n" +
                                "Lincolnwood, IL 60712\n" +
                                "(855) 474-6118","200 E Ogden Ave\n" +
                                "Westmont, IL 60559\n" +
                                "(855) 400-9935"));
                                tv.setText("Mercedes Dealers");
                                dealer=getDealers();
                                listView.setAdapter(new DealersAdapter(this, dealer));
                                break;
            case "Chevrolet":   DealerName= new ArrayList<String>(Arrays.asList("Currie Motors Chevrolet","Rogers Chevrolet","Kingdom Chevy"));
                                DealerAddress=new ArrayList<String>(Arrays.asList("8401 W Roosevelt Rd, Forest Park, IL 60130, USA","2720 S Michigan Ave, Chicago, IL 60616, USA","6603 S Western Ave, Chicago, IL 60636, USA"));
                                dealer=getDealers();
                                tv.setText("Chevrolet Dealers");
                                listView.setAdapter(new DealersAdapter(this, dealer));
                                break;
            case "Honda":    DealerName= new ArrayList<String>(Arrays.asList("Fletcher Jones Honda","Valley Honda","Fletcher Jones Honda"));
                             DealerAddress=new ArrayList<String>(Arrays.asList("Fletcher Jones Honda","4173 Ogden Ave, Aurora, IL 60504, USA","1111 N Clark St Suite 2, Chicago, IL 60610, USA"));
                             dealer=getDealers();
                             tv.setText("Honda Dealers");
                             listView.setAdapter(new DealersAdapter(this, dealer));
                             break;
            case "Skoda":    DealerName= new ArrayList<String>(Arrays.asList("94 NISSAN OF SOUTH HOLLAND","The Import Auto Gallery","New City Alfa Romeo and Fiat of Chicago"));
                            DealerAddress=new ArrayList<String>(Arrays.asList("16269 Van Dam Rd, South Holland, IL 60473, USA","754 Annoreno Dr, Addison, IL 60101, USA","2401 S Michigan Ave A, Chicago, IL 60616, USA"));
                            dealer=getDealers();
                            tv.setText("Skoda Dealers");
                            listView.setAdapter(new DealersAdapter(this, dealer));
                            break;
            case "Jaguar":  DealerName= new ArrayList<String>(Arrays.asList("Jaguar Elmhurst","Howard Orloff Jaguar","Greater Chicago Motors"));
                            DealerAddress=new ArrayList<String>(Arrays.asList("490 W Lake St, Elmhurst, IL 60126, USA","1924 N Paulina St, Chicago, IL 60622, USA","1850 N Elston Ave, Chicago, IL 60642, USA"));
                            dealer=getDealers();
                            tv.setText("Jaguar Dealers");
                            listView.setAdapter(new DealersAdapter(this, dealer));
                            break;
            case "GMC":     DealerName= new ArrayList<String>(Arrays.asList("Castle Buick-GMC","Ettleson Buick GMC","Rogers Buick GMC"));
                            DealerAddress=new ArrayList<String>(Arrays.asList("7400 W Cermak Rd, North Riverside, IL 60546, USA","6201 South La Grange Road, Hodgkins, IL 60525, USA","2720 S Michigan Ave, Chicago, IL 60616, USA"));
                            dealer=getDealers();
                            tv.setText("GMC Dealers");
                            listView.setAdapter(new DealersAdapter(this, dealer));
                            break;
            case "Lexus":   DealerName= new ArrayList<String>(Arrays.asList("Bredemann Lexus","Lexus of Naperville","McGrath Lexus of Chicago"));
                            DealerAddress=new ArrayList<String>(Arrays.asList("2000 Waukegan Rd, Glenview, IL 60025, USA","2480 Aurora Ave, Naperville, IL 60540, USA","1250 W Division St, Chicago, IL 60642, USA"));
                            dealer=getDealers();
                            tv.setText("Lexus Dealers");
                            listView.setAdapter(new DealersAdapter(this, dealer));
                            break;
        }
    }

    //Setting the dealers in an ArrayList to be sent to the Adapter Class to display
    private ArrayList<Dealer> getDealers()
    {
        ArrayList<Dealer> dealers=new ArrayList<Dealer>();
        for(int i=0;i<3;i++)
        {
            dealers.add(new Dealer(DealerName.get(i),DealerAddress.get(i)));
        }
        return dealers;
    }
}
