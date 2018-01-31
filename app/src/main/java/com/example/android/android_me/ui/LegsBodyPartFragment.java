package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

/**
 * Created by dmitrybondarenko on 31.01.18.
 */

public class LegsBodyPartFragment extends Fragment {

    private static final String TAG = "HeadPartFragment";

    private List<Integer> mImageIds;
    private int mListIndex;

    public LegsBodyPartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_legs_body_part, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.legs_part_image_view);

//        imageView.setImageResource(AndroidImageAssets.getLegs().get(0));
        if (mImageIds != null){
            // Set the image resource to the list item at the stored index
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
