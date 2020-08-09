package com.example.nilkesh.jsonvolley;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  
    ListView list;
    List<ModelData> detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView)findViewById(R.id.list);
        StringRequest req = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e(">>>", response);
                try {
                    JSONObject o = new JSONObject(response);
                    JSONArray couy = o.optJSONArray("contacts");
                    detail = new ArrayList<ModelData>();
                    for (int i = 0;i<couy.length();i++) {
                        JSONObject obj = couy.optJSONObject(i);
                        String nm = obj.optString("name");
                        String email = obj.optString("email");
                        String add = obj.optString("address");
                        String gender = obj.optString("gender");
                        JSONObject phone = obj.optJSONObject("phone");
                        String mobile = phone.optString("mobile");
                        String home = phone.optString("home");
                        String office = phone.optString("office");
                        Log.e("name",nm);
                        Log.e("email",email);
                        Log.e("gender",gender);
                        Log.e("mobile",mobile);
                        ModelData m = new ModelData(nm, email, gender,add,mobile,home,office);
                        detail.add(m);
                    }
                            CustomBaseAdapter arrayAdapter= new CustomBaseAdapter(MainActivity.this,R.layout.list_item_1,detail);
                            list.setAdapter(arrayAdapter);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
        requestQueue.add(req);
    }
}
