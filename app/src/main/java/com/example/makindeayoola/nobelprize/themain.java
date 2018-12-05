package com.example.makindeayoola.nobelprize;


import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class themain extends Fragment {

    public static final int REQUEST_CODE_DETAILS_ACTIVITY = 1234;

   private int value =1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_themain, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        ImageButton exit = (ImageButton) getActivity().findViewById(R.id.exitButton);
        ImageButton bonus = (ImageButton) getActivity().findViewById(R.id.bonusButton);
        ImageButton physics = (ImageButton) getActivity().findViewById(R.id.physicsButton);
        ImageButton chemistry = (ImageButton) getActivity().findViewById(R.id.chemistryButton);
        ImageButton peace = (ImageButton) getActivity().findViewById(R.id.peaceButton);
        ImageButton literature = (ImageButton) getActivity().findViewById(R.id.literatureButton);

        TextView exita = (TextView) getActivity().findViewById(R.id.exita);
        TextView bonusa = (TextView) getActivity().findViewById(R.id.bonusa);
        TextView physicsa = (TextView) getActivity().findViewById(R.id.physicsa);
        TextView chemistrya = (TextView) getActivity().findViewById(R.id.chemistrya);
        TextView peacea = (TextView) getActivity().findViewById(R.id.peacea);
        TextView literaturea = (TextView) getActivity().findViewById(R.id.literaturea);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // android.os.Process.killProcess(android.os.Process.myPid());
              //  ((MainActivity)getActivity()).closeApplication(v);
               // ((MainActivity)getActivity()).closeApplication(v);

                getActivity().finishAffinity();

            }
        });



        bonusa.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         //value = 2;
                                         Intent mainIntent = new Intent(getActivity(), bonus.class);
                                         startActivity(mainIntent);
                                         //updateDetails(value,0);
                                     }
                                 }
        );

        physicsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 3;
                updateDetails(value,0);
            }
        });

        chemistrya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 4;
                updateDetails(value,0);
            }
        });

        peacea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 5;
                updateDetails(value,0);
            }
        });

        literaturea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 6;
                updateDetails(value,0);
            }

        });

        exita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });

        bonus.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         //value = 2;
                                         Intent mainIntent = new Intent(getActivity(), bonus.class);
                                         startActivity(mainIntent);
                                         //updateDetails(value,0);
                                     }
                                 }
        );

        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 3;
                updateDetails(value,0);
            }
        });

        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 4;
                updateDetails(value,0);
            }
        });

        peace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 5;
                updateDetails(value,0);
            }
        });

        literature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 6;
                updateDetails(value,0);
            }

        });


    }

    public void updateDetails(int num,int n){
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE && getActivity() instanceof bonus)
        {
            fragment_pic frag = (fragment_pic) getFragmentManager().findFragmentById(R.id.fragmentPic);
            frag.setDetails(value,1);
        }
        else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            details_fragment frag = (details_fragment) getFragmentManager().findFragmentById(R.id.fragmentDetails);
                    frag.setDetails(value,n);
        }
        else if (getActivity() instanceof bonus)
        {
            fragment_pic frag = (fragment_pic) getFragmentManager().findFragmentById(R.id.fragmentPic);
            frag.setDetails(value,1);
        }
        else {

            Intent intent = new Intent(getActivity(), DetailsActivity.class);
            intent.putExtra("value", value);
            startActivity(intent);
        }


    }

    public themain() {
        // Required empty public constructor
    }





}
