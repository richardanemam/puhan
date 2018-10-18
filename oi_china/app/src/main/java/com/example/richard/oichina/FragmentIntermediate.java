package com.example.richard.oichina;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Richard on 9/23/2018.
 */

public class FragmentIntermediate extends Fragment{
    View view;

    public FragmentIntermediate() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.intermediate_fragment, container, false);
        return view;
    }
}
