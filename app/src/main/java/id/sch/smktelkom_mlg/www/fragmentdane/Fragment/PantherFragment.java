package id.sch.smktelkom_mlg.www.fragmentdane.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.sch.smktelkom_mlg.www.fragmentdane.R;
/**
 * Created by Evolved on 3/2/2018.
 */


public class PantherFragment extends Fragment {
    public PantherFragment (){
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_multiple_panther,
                container, false);
        return rootView;
    }
}