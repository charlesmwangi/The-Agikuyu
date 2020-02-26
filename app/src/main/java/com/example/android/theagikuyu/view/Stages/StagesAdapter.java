/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.theagikuyu.view.Stages;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.theagikuyu.R;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class StagesAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public StagesAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ManStagesFragment();
        }  else if (position==1) {
            return new WomanStagesFragment();
        } else {
            return new CouncilStagesFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
          case 0:
              return mContext.getString(R.string.man_stages);
            case 1:
                return mContext.getString(R.string.woman_stages);
            case 2:
                return mContext.getString(R.string.ngwiko_rules);

        }
        return null;
    }
}