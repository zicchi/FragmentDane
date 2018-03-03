package id.sch.smktelkom_mlg.www.fragmentdane.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import id.sch.smktelkom_mlg.www.fragmentdane.R;
/**
 * Created by Evolved on 3/2/2018.
 */

public class MenuFragment extends Fragment {
    Button btnpanther, btnyowis, btndoctor;
    Fragment frag;
    FragmentTransaction fragTransaction;
    public MenuFragment(){
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =
                inflater.inflate(R.layout.menu_fragment,container,false);
        frag = new PantherFragment();
        fragTransaction =
                getFragmentManager().beginTransaction().add(R.id.container, frag);
        fragTransaction.commit();

        Button btnkoala = (Button)view.findViewById(R.id.btnpanther);
        Button btnpenguin = (Button)view.findViewById(R.id.btnyowis);
        Button btntulip = (Button)view.findViewById(R.id.btndoctor);
        btnkoala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new PantherFragment();
                fragTransaction =
                        getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
            }
        });
        btnpenguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new YowisFragment();
                fragTransaction =
                        getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
            }
        });
        btntulip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new DoctorFragment();
                fragTransaction =
                        getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
            }
        });
        return view;
    }
}
