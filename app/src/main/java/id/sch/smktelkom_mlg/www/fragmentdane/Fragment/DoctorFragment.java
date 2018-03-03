package id.sch.smktelkom_mlg.www.fragmentdane.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import id.sch.smktelkom_mlg.www.fragmentdane.R;
/**
 * Created by Evolved on 3/2/2018.
 */
public class DoctorFragment extends Fragment {
    public DoctorFragment(){
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_multiple_doctor,
                container,false);
        Button btnTulip = (Button)rootView.findViewById(R.id.btnDoctor);
        btnTulip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Kamu Telah Klik Film Doctor Strange",Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
