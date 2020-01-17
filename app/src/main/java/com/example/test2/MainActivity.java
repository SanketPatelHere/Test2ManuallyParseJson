package com.example.test2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView tvData;
    FrameLayout fm;
    Button btnF1, btnF2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvData = (TextView)findViewById(R.id.tvData);
        btnF1 = (Button) findViewById(R.id.btnF1);
        btnF2 = (Button) findViewById(R.id.btnF2);
        //fm = (FrameLayout) findViewById(R.id.fm);


        try
        {

            /*String s1 = "{\"User\":"[{\"name\":\"sanket\", \"rollno\":\"110\"}], [{\"name\":\"sandip\", \"rollno\":\"\"}]," +
                    " [{\"name\":\"raj\", \"rollno\":\"120\"}], [{\"name\":\"jay\", \"rollno\":\"\"}]}";*/
            //json object
            String strJson="{ \"User\" :[{\"id\":\"101\",\"name\":\"Sanket Ramani\",\"salary\":\"150000\"},{\"id\":\"102\",\"name\":\"Jay Patel\",\"salary\":\"\"}] }";
            //json array
            String strJson2="[{\"id\":\"101\",\"name\":\"Sanket Ramani\",\"salary\":\"150000\"},{\"id\":\"102\",\"name\":\"Jay Patel\",\"salary\":\"\"}]";
            //String strJson3="{[\"id\":\"101\",\"name\":\"Sanket Ramani\",\"salary\":\"150000\"],[\"id\":\"102\",\"name\":\"Jay Patel\",\"salary\":\"\"]}";
            //String strJson4="{[{\"id\":\"101\",\"name\":\"Sanket Ramani\",\"salary\":\"150000\"}],[{\"id\":\"102\",\"name\":\"Jay Patel\",\"salary\":\"\"}]}";
            String data = "";
            String id="", name="", salary="";

            JSONArray ja1 = new JSONArray(strJson2);
            Log.i("My ja1 = ",ja1+"");
            for(int i=0;i<ja1.length();i++)
            {
                JSONObject jo1 = ja1.getJSONObject(i);
                String name2 = jo1.getString("name");
                Log.i("My name2 = ",name2+"");

            }
            //not working
            /*JSONObject jo2 = new JSONObject(strJson3);
            Log.i("My jo2 = ",jo2+"");
            for(int i=0;i<jo2.length();i++)
            {
                JSONArray ja2 = jo2.getJSONArray("name");
                String name3 = ja2.getString(0);
                Log.i("My name3 = ",name3+"");

            }*/
            //or


            JSONObject jo = new JSONObject(strJson);
            /*jo.put("name","sanket");
            jo.put("salary","10000");*/
            if(jo!=null)
            {
                Log.i("My jo = ",jo+"");
                JSONArray ja = jo.getJSONArray("User");
                for(int i=0;i<ja.length();i++)
                {
                    JSONObject jsonObject = ja.getJSONObject(i);
                    if(jsonObject.has("id"))
                    {
                         id = jsonObject.getString("id");
                    }
                    if(jsonObject.has("name"))
                    {
                         name = jsonObject.getString("name");
                    }
                    if(jsonObject.has("salary"))
                    {
                        salary = jsonObject.getString("salary");

                    }
                    else if(!jsonObject.has("salary"))
                    //else
                    {
                        salary = "aaaa";  //not work
                    }

                    data += id+" "+name+" "+salary+"\n";
                    Log.i("My id = ",id+", Name = "+name+", salary = "+salary);
                }
                //tvData.setText("Name = "+name+", rollno = "+rollno);
                tvData.setText(data);
            }

        }
        catch (Exception e)
        {
            Log.i("My Error = ",e+"");
        }





        //for fragment
        btnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft1 = fm.beginTransaction();
                Fragment f1 = new MyFragment();
                String backStateName1 = f1.getClass().getName();
                Log.i("My backStateName1 = ",backStateName1); //com.example.test2.MyFragment1
                //ft2.addToBackStack("bbb"); //or
                ft1.add(R.id.fm, f1, "aaa");
                //ft1.replace(R.id.fm, f1, "aaa");
                ft1.addToBackStack(backStateName1);
                ft1.commit();
            }
        });

        btnF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm2 = getSupportFragmentManager();
                FragmentTransaction ft2 = fm2.beginTransaction();
                Fragment f2 = new MyFragment2();
                String backStateName2 = f2.getClass().getName();
                Log.i("My backStateName2 = ",backStateName2); //com.example.test2.MyFragment2
                ft2.add(R.id.fm, f2, "aaa");
                //ft2.replace(R.id.fm, f2, "aaa");
                //ft2.addToBackStack("bbb"); //or
                ft2.addToBackStack(backStateName2);
                ft2.commit();
            }
        });


    }

    @Override
    public void onBackPressed() {
        int count = getSupportFragmentManager().getBackStackEntryCount();
        Log.i("My Count = ",count+"");
        if(count==0)
        {
            super.onBackPressed();
        }
        else
        {
            //getSupportFragmentManager().popBackStack();
            getSupportFragmentManager().popBackStackImmediate();
        }
    }
}
