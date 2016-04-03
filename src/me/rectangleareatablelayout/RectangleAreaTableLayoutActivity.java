package me.rectangleareatablelayout;

import me.rectangleareatablelayout.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RectangleAreaTableLayoutActivity extends Activity implements OnClickListener {
	
	private EditText lengthView, breadthView, areaView;
	private Button areaButton, clearButton;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	System.out.println("in on create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        lengthView = (EditText) findViewById(R.id.lengthEditText);
        breadthView = (EditText) findViewById(R.id.breadthEditText);
        areaView = (EditText) findViewById(R.id.areaEditText);
        areaButton = (Button) findViewById(R.id.areaButton);
        areaButton.setOnClickListener(this);
        clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		System.out.println("in on click");
		if (v==clearButton) {
			lengthView.setText("");
			breadthView.setText("");
			areaView.setText("");		
		}
		if (v==areaButton) {
			if ((lengthView.getText().length() == 0)||
					(breadthView.getText().length() == 0)) {
				Toast.makeText(this, "Please enter a value for Length/Breadth",
						Toast.LENGTH_LONG).show();
				return;
			}
			float length = Float.parseFloat(lengthView.getText().toString());
			float breadth = Float.parseFloat(breadthView.getText().toString());
			float area = length*breadth;
			areaView.setText(String.valueOf(area));			
		}
		
	}

	
}