package abhishekp.example.com.bunkmoniter;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Abhishek on 03-07-2015.
 */
public class Testing extends Activity implements View.OnClickListener {
    private TextView text[][] = new TextView[7][8];
    Intent p;
    Bundle b;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetableentry);
        initialize();
/*
        NavigationDrawer fr = new NavigationDrawer();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.timetableentry,fr,"text");
        ft.commit();*/
    }

    private void initialize() {

        text[1][1] = (TextView) findViewById(R.id.tv11);
        text[2][1] = (TextView) findViewById(R.id.tv21);
        text[3][1] = (TextView) findViewById(R.id.tv31);
        text[4][1] = (TextView) findViewById(R.id.tv41);
        text[5][1] = (TextView) findViewById(R.id.tv51);
        text[6][1] = (TextView) findViewById(R.id.tv61);
        text[1][2] = (TextView) findViewById(R.id.tv12);
        text[2][2] = (TextView) findViewById(R.id.tv22);
        text[3][2] = (TextView) findViewById(R.id.tv32);
        text[4][2] = (TextView) findViewById(R.id.tv42);
        text[5][2] = (TextView) findViewById(R.id.tv52);
        text[6][2] = (TextView) findViewById(R.id.tv62);
        text[1][3] = (TextView) findViewById(R.id.tv13);
        text[2][3] = (TextView) findViewById(R.id.tv23);
        text[3][3] = (TextView) findViewById(R.id.tv33);
        text[4][3] = (TextView) findViewById(R.id.tv43);
        text[5][3] = (TextView) findViewById(R.id.tv53);
        text[6][3] = (TextView) findViewById(R.id.tv63);
        text[1][4] = (TextView) findViewById(R.id.tv14);
        text[2][4] = (TextView) findViewById(R.id.tv24);
        text[3][4] = (TextView) findViewById(R.id.tv34);
        text[4][4] = (TextView) findViewById(R.id.tv44);
        text[5][4] = (TextView) findViewById(R.id.tv54);
        text[6][4] = (TextView) findViewById(R.id.tv64);
        text[1][5] = (TextView) findViewById(R.id.tv15);
        text[2][5] = (TextView) findViewById(R.id.tv25);
        text[3][5] = (TextView) findViewById(R.id.tv35);
        text[4][5] = (TextView) findViewById(R.id.tv45);
        text[5][5] = (TextView) findViewById(R.id.tv55);
        text[6][5] = (TextView) findViewById(R.id.tv65);
        text[1][6] = (TextView) findViewById(R.id.tv16);
        text[2][6] = (TextView) findViewById(R.id.tv26);
        text[3][6] = (TextView) findViewById(R.id.tv36);
        text[4][6] = (TextView) findViewById(R.id.tv46);
        text[5][6] = (TextView) findViewById(R.id.tv56);
        text[6][6] = (TextView) findViewById(R.id.tv66);
        text[1][7] = (TextView) findViewById(R.id.tv17);
        text[2][7] = (TextView) findViewById(R.id.tv27);
        text[3][7] = (TextView) findViewById(R.id.tv37);
        text[4][7] = (TextView) findViewById(R.id.tv47);
        text[5][7] = (TextView) findViewById(R.id.tv57);
        text[6][7] = (TextView) findViewById(R.id.tv67);


        text[1][1].setOnClickListener(this);
        text[2][1].setOnClickListener(this);
        text[3][1].setOnClickListener(this);
        text[4][1].setOnClickListener(this);
        text[5][1].setOnClickListener(this);
        text[6][1].setOnClickListener(this);
        text[1][2].setOnClickListener(this);
        text[2][2].setOnClickListener(this);
        text[3][2].setOnClickListener(this);
        text[4][2].setOnClickListener(this);
        text[5][2].setOnClickListener(this);
        text[6][2].setOnClickListener(this);
        text[1][3].setOnClickListener(this);
        text[2][3].setOnClickListener(this);
        text[3][3].setOnClickListener(this);
        text[4][3].setOnClickListener(this);
        text[5][3].setOnClickListener(this);
        text[6][3].setOnClickListener(this);
        text[1][4].setOnClickListener(this);
        text[2][4].setOnClickListener(this);
        text[3][4].setOnClickListener(this);
        text[4][4].setOnClickListener(this);
        text[5][4].setOnClickListener(this);
        text[6][4].setOnClickListener(this);
        text[1][5].setOnClickListener(this);
        text[2][5].setOnClickListener(this);
        text[3][5].setOnClickListener(this);
        text[4][5].setOnClickListener(this);
        text[5][5].setOnClickListener(this);
        text[6][5].setOnClickListener(this);
        text[1][6].setOnClickListener(this);
        text[2][6].setOnClickListener(this);
        text[3][6].setOnClickListener(this);
        text[4][6].setOnClickListener(this);
        text[5][6].setOnClickListener(this);
        text[6][1].setOnClickListener(this);
        text[1][7].setOnClickListener(this);
        text[2][7].setOnClickListener(this);
        text[3][7].setOnClickListener(this);
        text[4][7].setOnClickListener(this);
        text[5][7].setOnClickListener(this);
        text[6][7].setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.tv11:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,11);
                break;
            case R.id.tv21:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,21);
                break;
            case R.id.tv31:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,31);
                break;
            case R.id.tv41:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,41);
                break;
            case R.id.tv51:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,51);
                break;
            case R.id.tv61:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,61);
                break;
            case R.id.tv12:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,12);
                break;
            case R.id.tv22:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,22);
                break;
            case R.id.tv32:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,32);
                break;
            case R.id.tv42:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,42);
                break;
            case R.id.tv52:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,52);
                break;
            case R.id.tv62:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,62);
                break;
            case R.id.tv13:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,13);
                break;
            case R.id.tv23:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,23);
                break;
            case R.id.tv33:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,33);
                break;
            case R.id.tv43:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,43);
                break;
            case R.id.tv53:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,53);
                break;
            case R.id.tv63:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,63);
                break;
            case R.id.tv14:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,14);
                break;
            case R.id.tv24:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,24);
                break;
            case R.id.tv34:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,34);
                break;
            case R.id.tv44:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,44);
                break;
            case R.id.tv54:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,54);
                break;
            case R.id.tv64:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,64);
                break;
            case R.id.tv15:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,15);
                break;
            case R.id.tv25:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,25);
                break;
            case R.id.tv35:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,35);
                break;
            case R.id.tv45:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,45);
                break;
            case R.id.tv55:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,55);
                break;
            case R.id.tv65:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,65);
                break;
            case R.id.tv16:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,16);
                break;
            case R.id.tv26:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,26);
                break;
            case R.id.tv36:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,36);
                break;
            case R.id.tv46:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,46);
                break;
            case R.id.tv56:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,56);
                break;
            case R.id.tv66:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,66);
                break;
            case R.id.tv17:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,17);
                break;
            case R.id.tv27:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,27);
                break;
            case R.id.tv37:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,37);
                break;
            case R.id.tv47:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,47);
                break;
            case R.id.tv57:
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,57);
                break;
            case R.id.tv67  :
                p = new Intent(Testing.this,Preference.class);
                startActivityForResult(p,67);
                break;


        }



    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch(requestCode){
                case 11:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[1][1].setText(name);
                    break;
                case 21:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[2][1].setText(name);
                    break;
                case 31:
                     b = data.getExtras();
                     name = b.getString("nameoftopic");
                    text[3][1].setText(name);
                    break;
                case 41:
                     b = data.getExtras();
                     name = b.getString("nameoftopic");
                    text[4][1].setText(name);
                    break;
                case 51:
                     b = data.getExtras();
                     name = b.getString("nameoftopic");
                    text[5][1].setText(name);
                    break;
                case 61:
                     b = data.getExtras();
                     name = b.getString("nameoftopic");
                    text[6][1].setText(name);
                    break;
                case 12:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[1][2].setText(name);
                    break;
                case 22:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[2][2].setText(name);
                    break;
                case 32:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[3][2].setText(name);
                    break;
                case 42:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[4][2].setText(name);
                    break;
                case 52:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[5][2].setText(name);
                    break;
                case 62:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[6][2].setText(name);
                    break;
                case 13:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[1][3].setText(name);
                    break;
                case 23:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[2][3].setText(name);
                    break;
                case 33:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[3][3].setText(name);
                    break;
                case 43:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[4][3].setText(name);
                    break;
                case 53:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[5][3].setText(name);
                    break;
                case 63:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[6][3].setText(name);
                    break;
                case 14:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[1][4].setText(name);
                    break;
                case 24:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[2][4].setText(name);
                    break;
                case 34:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[3][4].setText(name);
                    break;
                case 44:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[4][4].setText(name);
                    break;
                case 54:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[5][4].setText(name);
                    break;
                case 64:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[6][4].setText(name);
                    break;
                case 15:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[1][5].setText(name);
                    break;
                case 25:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[2][5].setText(name);
                    break;
                case 35:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[3][5].setText(name);
                    break;
                case 45:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[4][5].setText(name);
                    break;
                case 55:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[5][5].setText(name);
                    break;
                case 65:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[6][5].setText(name);
                    break;
                case 16:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[1][6].setText(name);
                    break;
                case 26:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[2][6].setText(name);
                    break;
                case 36:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[3][6].setText(name);
                    break;
                case 46:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[4][6].setText(name);
                    break;
                case 56:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[5][6].setText(name);
                    break;
                case 66:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[6][6].setText(name);
                    break;
                case 17:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[1][7].setText(name);
                    break;
                case 27:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[2][7].setText(name);
                    break;
                case 37:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[3][7].setText(name);
                    break;
                case 47:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[4][7].setText(name);
                    break;
                case 57:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[5][7].setText(name);
                    break;
                case 67:
                    b = data.getExtras();
                    name = b.getString("nameoftopic");
                    text[6][7].setText(name);
                    break;

            }



            Bundle b = data.getExtras();
            String name = b.getString("nameoftopic");
            text[1][1].setText(name);

        }
    }
}
