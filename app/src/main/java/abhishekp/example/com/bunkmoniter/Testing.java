package abhishekp.example.com.bunkmoniter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Abhishek on 03-07-2015.
 */
public class Testing extends Activity implements View.OnClickListener {
    private TextView text[][] = new TextView[7][7];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetableentry);
        initialize();
    }

    private void initialize() {

        text[1][1] = (TextView) findViewById(R.id.tv11);
        text[2][1] = (TextView) findViewById(R.id.tv21);
        text[3][1] = (TextView) findViewById(R.id.tv31);
        text[4][1] = (TextView) findViewById(R.id.tv41);
        text[5][1] = (TextView) findViewById(R.id.tv51);
        text[6][1] = (TextView) findViewById(R.id.tv61);
        text[1][2] = (TextView) findViewById(R.id.tv11);
        text[2][2] = (TextView) findViewById(R.id.tv21);
        text[3][2] = (TextView) findViewById(R.id.tv31);
        text[4][2] = (TextView) findViewById(R.id.tv41);
        text[5][2] = (TextView) findViewById(R.id.tv51);
        text[6][2] = (TextView) findViewById(R.id.tv61);
        text[1][3] = (TextView) findViewById(R.id.tv11);
        text[2][3] = (TextView) findViewById(R.id.tv21);
        text[3][3] = (TextView) findViewById(R.id.tv31);
        text[4][3] = (TextView) findViewById(R.id.tv41);
        text[5][3] = (TextView) findViewById(R.id.tv51);
        text[6][3] = (TextView) findViewById(R.id.tv61);

        text[1][1].setOnClickListener(this);
        text[2][1].setOnClickListener(this);
        text[3][1].setOnClickListener(this);
        text[4][1].setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        Intent p = new Intent(Testing.this,Preference.class);
        startActivityForResult(p, 0);



    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            Bundle b = data.getExtras();
            String name = b.getString("nameoftopic");
            text[1][1].setText(name);

        }
    }
}
