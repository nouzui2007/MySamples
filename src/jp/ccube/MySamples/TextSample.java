package jp.ccube.MySamples;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class TextSample extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.object_screen);
		
		if ((savedInstanceState == null) || (savedInstanceState.isEmpty())) {
			MyEntity param = (MyEntity)getIntent().getExtras().get("param");
			TextView text1 = (TextView)findViewById(R.id.TextView01);
			EditText text2 = (EditText)findViewById(R.id.EditText01);
			
			text1.setText(Integer.toString(param.getProperty1()));
			text2.setText(param.getProperty2());
		}
	}
}
