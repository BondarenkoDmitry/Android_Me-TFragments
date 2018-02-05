package com.example.android.android_me.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by dmitrybondarenko on 02.02.18.
 */

public class MasterListFragment extends Fragment {

//    Define a new interface that triggers a call in MainActivity
    OnImageClickListener mCallback;

// OnImageClickListener interface, calls a method in the host activity - onImageSelected
    public interface OnImageClickListener {
        void onImageSelected(int position);
    }

//  Overriding onAttach to make sure that the container activity has implemented the callback
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
//        The fragment attaches itself to the host activity

        try {
            mCallback = (OnImageClickListener) context;
        } catch (ClassCastException e){
            throw new ClassCastException(context.toString()
                    + "must implement OnImageClickListener");
        }
    }




    // Mandatory empty constructor
    public MasterListFragment() {

    }


    // Inflates the GridView of all AndroidMe images
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        final View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);


        // Get a reference to the GridView in the fragment_master_list xml layout file
        GridView gridView = (GridView) rootView.findViewById(R.id.images_grid_view);

        // Create a MasterListAdapter (What is it?) =? ListAdapter Or is it because of the fragment name?

        // This adapter takes in the context and an ArrayList of ALL the image resources to display
        MasterListAdapter mAdapter = new MasterListAdapter(getContext(), AndroidImageAssets.getAll());

        // Set the adapter on the GridView
        gridView.setAdapter(mAdapter);




//        Trigger the callback on a click
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
               mCallback.onImageSelected(position);
            }
        });


        return rootView;
    }
}
