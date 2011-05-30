package jp.ccube.MySamples;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListSample extends Activity {
    
	private int CUST_DLG = 1;
	
	//resourceへ移動
//	private String[] data = {"ButtonSample", "Intent", "Intent(Object)", "CustomDlg"};
	private String[] data;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        //resourceから配列取得
        data = getResources().getStringArray(R.array.sample_menu);
        
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_row_item, data);
        ListView view = (ListView)findViewById(R.id.ListView01);
        view.setAdapter(adapter);
        view.setOnItemClickListener(itemClickListener);
    }
    
    protected android.app.Dialog onCreateDialog(int id) {
    	LayoutInflater inflater = LayoutInflater.from(this);
    	final View view = inflater.inflate(R.layout.object_screen, null);
    	return new AlertDialog.Builder(this)
    				.setView(view)
    				.create();
    };
    
    OnItemClickListener itemClickListener = new OnItemClickListener() {
    	public void onItemClick(AdapterView<?> parent, View view, int position,
    			long id) {

    		Intent intent = new Intent();
    		
    		switch (position) {
    		case 0:
    			intent.setClass(ListSample.this, ButtonSample.class);
    			startActivity(intent);
    			break;
    		case 2:
    			intent.setClass(ListSample.this, TextSample.class);
    			
    			MyEntity param = new MyEntity(1, "OK");
    			intent.putExtra("param", param);
    			
    			startActivity(intent);
    			break;
    		case 3:
    			showDialog(CUST_DLG);
    			break;
    		}
    	}
	};
}