package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by dmitrybondarenko on 31.01.18.
 */

public class LegsBodyPartFragment extends Fragment {


    public LegsBodyPartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_legs_body_part, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.legs_part_image_view);

        imageView.setImageResource(AndroidImageAssets.getLegs().get(0));

        return rootView;

    }
}
