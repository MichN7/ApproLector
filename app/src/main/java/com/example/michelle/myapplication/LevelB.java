package com.example.michelle.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;

public class LevelB extends AppCompatActivity {


    private SectionsPagerAdapter mSectionsPagerAdapter;


    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_b);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


    }

    public static class PlaceholderFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_level_b, container, false);
            Button button = (Button) rootView.findViewById(R.id.btnZorra);
            button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Context context;
                    context = getActivity();
                    Intent intent = new Intent(context, ZorraHistoriaActivity.class);
                    startActivity(intent);
                }
            });
            return rootView;
        }
    }

    public static class BearFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public BearFragment() {
        }

        public static BearFragment newInstance(int sectionNumber) {
            BearFragment fragment = new BearFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_bear, container, false);
            Button button = (Button) rootView.findViewById(R.id.btnOso);
            button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Context context;
                    context = getActivity();
                    Intent intent = new Intent(context, OsoHistoriaActivity.class);
                    startActivity(intent);
                }
            });
            return rootView;
        }
    }
    public static class milkMaidFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public milkMaidFragment() {
        }

        public static milkMaidFragment newInstance(int sectionNumber) {
            milkMaidFragment fragment = new milkMaidFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_milkmaid, container, false);
            Button button = (Button) rootView.findViewById(R.id.btnMilk);
            button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Context context;
                    context = getActivity();
                    Intent intent = new Intent(context, LecheraHistoriaActivity.class);
                    startActivity(intent);
                }
            });
            return rootView;
        }
    }
    public static class mouseFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public mouseFragment() {
        }

        public static mouseFragment newInstance(int sectionNumber) {
            mouseFragment fragment = new  mouseFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_mouse, container, false);
            Button button = (Button) rootView.findViewById(R.id.btnRaton);
            button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Context context;
                    context = getActivity();
                    Intent intent = new Intent(context, RatonHistoriaActivity.class);
                    startActivity(intent);
                }
            });
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position==0){
                return PlaceholderFragment.newInstance(position + 1);
            }else if(position ==1){
                return BearFragment.newInstance(position + 1);
            }else if(position ==2){
                return milkMaidFragment.newInstance(position + 1);
            }else{
                return mouseFragment.newInstance(position + 1);
            }

        }

        @Override
        public int getCount() {

            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
            }
            return null;
        }
    }
}
