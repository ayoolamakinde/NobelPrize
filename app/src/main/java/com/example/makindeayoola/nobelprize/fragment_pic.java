package com.example.makindeayoola.nobelprize;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_pic extends Fragment {

    public static String[] name = {
            "Gérard Mourou",
            "George Smith",
            "Denis Mukwege",
            "Sir Kazuo Ishiguro"
    };

    public static String[] shortOv = {
            "Nobel Physics Prize Winner 2018 ",
            "Nobel Chemistry Prize Winner 2018",
            "Nobel Peace Prize Winner 2018",
            "Nobel Literature Prize Winner 2017"
    };

    public static String[] bio = {
            "He is a French scientist and pioneer in the field of electrical engineering and lasers. He was awarded a Nobel Prize in Physics in 2018, along with Donna Strickland, for the invention of chirped pulse amplification, a technique later used to create ultrashort-pulse, very high-intensity (petawatt) laser pulses.",
            "Born in Norwalk, Connecticut, he earned his A.B. degree from Haverford College in biology, was a high school teacher and lab technician for a year, and earned his Ph.D. degree in bacteriology and immunology from Harvard University.He was a postdoc at the University of Wisconsin before moving to Missouri and joining the University of Missouri.",
            "He founded and works in Panzi Hospital in Bukavu, where he specializes in the treatment of women who have been raped by armed rebels.He has treated thousands of women who were victims of rape since the Second Congo War, some of them more than once, performing up to ten operations a day during his 18-hour working days.",
            "British novelist, screenwriter, and short-story writer. He was born in Nagasaki, Japan; his family moved to the UK in 1960 when he was five. Ishiguro graduated from the University of Kent with a bachelor's degree in English and Philosophy in 1978 and gained his master's from the University of East Anglia's creative writing course in 1980."
    };

    public void setDetails(int value, int bonus) {
        ImageView imageNobel = (ImageView) getActivity().findViewById(R.id.picView);
        ImageView imageNobel2 = (ImageView) getActivity().findViewById(R.id.picView2);
        TextView nameNobel = (TextView) getActivity().findViewById(R.id.nameView);
        TextView nameNobel2 = (TextView) getActivity().findViewById(R.id.nameView2);
        TextView priNobel = (TextView) getActivity().findViewById(R.id.priView);
        //  TextView priNobel2= (TextView) getActivity().findViewById(R.id.picView2);
        TextView bioNobel = (TextView) getActivity().findViewById(R.id.textView4);
        TextView bioNobel2 = (TextView) getActivity().findViewById(R.id.textView2);
        bioFragment frag = (bioFragment) getFragmentManager().findFragmentById(R.id.bioFragment);
        frag.setDetails(value,1);
        if (value == 3) {

            if (bonus == 1) {
                nameNobel2.setText(name[0]);
               // bioNobel2.setText(bio[0]);
                imageNobel2.setImageResource(R.drawable.physicsw2);
            } else {
                imageNobel.setImageResource(R.drawable.physicsw2);
                nameNobel.setText(name[0]);
                priNobel.setText(shortOv[0]);
                bioNobel.setText(bio[0]);
            }
        } else if (value == 4) {

            if (bonus == 1) {
                nameNobel2.setText(name[1]);
             //   bioNobel2.setText(bio[1]);
                imageNobel2.setImageResource(R.drawable.chemistryw2);
            } else {

                imageNobel.setImageResource(R.drawable.chemistryw2);
                nameNobel.setText(name[1]);
                priNobel.setText(shortOv[1]);
                bioNobel.setText(bio[1]);
            }
        } else if (value == 5) {
            if (bonus == 1) {
                nameNobel2.setText(name[2]);
               // bioNobel2.setText(bio[2]);
                imageNobel2.setImageResource(R.drawable.peacew);
            } else {
                imageNobel.setImageResource(R.drawable.peacew);
                nameNobel.setText(name[2]);
                priNobel.setText(shortOv[2]);
                bioNobel.setText(bio[2]);
            }
        } else if (value == 6) {
            if (bonus == 1) {
                nameNobel2.setText(name[3]);
                //bioNobel2.setText(bio[3]);
                imageNobel2.setImageResource(R.drawable.literaturew);
            } else {
                imageNobel.setImageResource(R.drawable.literaturew);
                nameNobel.setText(name[3]);
                priNobel.setText(shortOv[3]);
                bioNobel.setText(bio[3]);
            }
        }
    }

    public fragment_pic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_pic, container, false);
    }

}
