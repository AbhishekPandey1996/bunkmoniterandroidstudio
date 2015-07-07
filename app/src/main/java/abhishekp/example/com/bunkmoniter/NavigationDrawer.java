package abhishekp.example.com.bunkmoniter;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class NavigationDrawer extends Fragment implements AdapterView.OnItemClickListener {

    private DrawerLayout drawerLayout1;
    private ListView listView1;
private String[] content;
    View v;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.navdrawerlayojut, container, false);
        return v;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView1 = (ListView) v.findViewById(R.id.drawerlist);
        content = v.getResources().getStringArray(R.array.navdraweroptionlist);
        listView1.setAdapter(new ArrayAdapter<>(v.getContext(),android.R.layout.simple_list_item_1,content));
        listView1.setOnItemClickListener(this);
    }

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navdrawerlayojut);
        drawerLayout1 = (DrawerLayout) findViewById(R.id.navdrawerlayout);



    }*/

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

}
