package uk.ac.napier.mobileapplicationscoursework.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uk.ac.napier.mobileapplicationscoursework.R;

/**
 * Created by ryanthomson on 03/04/2016.
 */
public class BreakfastFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootview = inflater.inflate(R.layout.fragment_breakfast, container,false);

        return rootview;
    }

}
