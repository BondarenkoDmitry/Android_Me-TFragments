package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;

import java.util.List;

/**
 * Created by dmitrybondarenko on 31.01.18.
 */

public class BodyPartFragment extends Fragment {

    private static final String TAG = "BodyPartFragment";

    private List <Integer> mImageIds;
    private int mListIndex;

    public BodyPartFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        if (mImageIds != null){
            imageView.setImageResource(mImageIds.get(mListIndex));
        } else {
            Log.v(TAG, "This fragment has a null list of images");
        }

        return rootView;
    }

    public void setImageIds(List<Integer> imageIds){
        mImageIds = imageIds;
    }

    public void setListIndex(int index){
        mListIndex = index;
    }

}






























