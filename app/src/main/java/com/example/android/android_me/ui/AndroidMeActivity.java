/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.android_me.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);


        if (savedInstanceState == null){

        BodyPartFragment headFragment = new BodyPartFragment();

        headFragment.setImageIds(AndroidImageAssets.getHeads());

//       Getting index from the intent. Default value = 0;
        int headIndex = getIntent().getIntExtra("headIndex", 0);
        headFragment.setListIndex(headIndex);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.head_container, headFragment)
                .commit();



        BodyPartFragment bodyFragment = new BodyPartFragment();

        bodyFragment.setImageIds(AndroidImageAssets.getBodies());
        int bodyIndex = getIntent().getIntExtra("bodyIndex", 0);
        bodyFragment.setListIndex(bodyIndex);

        FragmentManager fragmentManager1 = getSupportFragmentManager();
        fragmentManager1.beginTransaction()
                .add(R.id.body_container,bodyFragment)
                .commit();



        BodyPartFragment legsFragment = new BodyPartFragment();

        legsFragment.setImageIds(AndroidImageAssets.getLegs());
        int legIndex = getIntent().getIntExtra("legIndex", 0);
        legsFragment.setListIndex(legIndex);

        FragmentManager fragmentManager2 = getSupportFragmentManager();
        fragmentManager2.beginTransaction()
                .add(R.id.legs_container, legsFragment)
                .commit();
        }

    }
}






















