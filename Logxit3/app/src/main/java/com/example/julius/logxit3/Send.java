package com.example.julius.logxit3;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by Julius on 10/5/2017.
 */

public class Send extends Fragment {
    public Send(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.send, container, false);

        getActivity().setTitle("Send");

        return view;
    }
}
