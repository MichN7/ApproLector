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
import android.widget.Toast;

public class LevelA extends AppCompatActivity {


    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);




    }



    /**
     * A placeholder fragment containing a simple view.
     */
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
            View rootView = inflater.inflate(R.layout.fragment_level, container, false);
            Button button = (Button) rootView.findViewById(R.id.btnLeon);
            button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Context context;
                    context = getActivity();
                    Intent intent = new Intent(context, LeonHistoriaActivity.class);
                    startActivity(intent);
                }
            });
            return rootView;
        }
    }

    public static class FragmentoLobo extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public FragmentoLobo() {
        }

        public static FragmentoLobo newInstance(int sectionNumber) {
            FragmentoLobo fragment = new FragmentoLobo();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_lobo, container, false);
            Button button = (Button) rootView.findViewById(R.id.btnLobo);
            button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Context context;
                    context = getActivity();
                    Intent intent = new Intent(context, LoboHistoriaActivity.class);
                    startActivity(intent);
                }
            });
            return rootView;
        }
    }

    public static class FragmentoCisne extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public FragmentoCisne() {
        }

        public static FragmentoCisne newInstance(int sectionNumber) {
            FragmentoCisne fragment = new FragmentoCisne();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_cisne, container, false);
            Button button = (Button) rootView.findViewById(R.id.btnLobo);
            button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Context context;
                    context = getActivity();
                    Intent intent = new Intent(context, CisneHistoriaActivity.class);
                    startActivity(intent);
                }
            });
            return rootView;
        }
    }

    public static class FragmentoAstro extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public FragmentoAstro() {
        }

        public static FragmentoAstro newInstance(int sectionNumber) {
            FragmentoAstro fragment = new FragmentoAstro();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_astros, container, false);
            Button button = (Button) rootView.findViewById(R.id.btnAstro);
            button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Context context;
                    context = getActivity();
                    Intent intent = new Intent(context, AstroHistoriaActivity.class);
                    startActivity(intent);
                }
            });
            return rootView;
        }
    }




    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position == 1) {
                return PlaceholderFragment.newInstance(position + 1);
            }else if(position == 2){
                return FragmentoLobo.newInstance(position + 1);
            }else if(position == 3){
                return FragmentoCisne.newInstance(position + 1);
            }else{
                return FragmentoAstro.newInstance(position+1);
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
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
                case 3:
                    return "SECTION 3";
            }
            return null;
        }
    }
}
