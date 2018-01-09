package piyathep.krirk.ac.th.gamecalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import piyathep.krirk.ac.th.gamecalculate.MainActivity;
import piyathep.krirk.ac.th.gamecalculate.R;

/**
 * Created by Piyathep on 9/1/2561.
 */

public class MainFragment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();

//        ShowName Controller
        showNameController();

//        Calculate controller
        calculateController();

//        Clear Controller
        clearController();

    }   // Main Method

    private void clearController() {
        Button button = getView().findViewById(R.id.btnClear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                TextView textView = getView().findViewById(R.id.txtShowName);
//                textView.setText("Click Show Name");
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment, new MainFragment())
                        .addToBackStack(null).commit();
        }
        });
    }

    private void calculateController() {
        Button button = getView().findViewById(R.id.btnCalculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment, new CalculateFragment())
                        .addToBackStack(null).commit();

            }
        });

    }

    private void showNameController() {

        Button button = getView().findViewById(R.id.btnShowName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView textView = getView().findViewById(R.id.txtShowName);
                textView.setText("Game");

            }
        });
    }

    private void createToolbar() {

        Toolbar toolbar = getView().findViewById(R.id.ToolbarMain);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}   // Main Class
