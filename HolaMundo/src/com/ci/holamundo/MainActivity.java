package com.ci.holamundo;

import java.io.InputStream;

import org.json.JSONArray;

import android.os.Bundle;
import android.widget.ListView;
import android.app.Activity;

public class MainActivity extends Activity {
	private ListView mContaxtList;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list);
        initContactList();
    }
    
    private void initContactList() {
    	mContaxtList = (ListView) findViewById(R.id.contact_list_lista);
    	
    	try {
    		InputStream is = getAssets().open("json/contacts.txt");
    		JSONArray jsonArray = new JSONArray(json);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}
