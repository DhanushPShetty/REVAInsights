package com.dhanushpshetty.revainsights;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.Objects;


public class AboutFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_fragment, container, false);

        ImageButton AboutBackButton = view.findViewById(R.id.AboutBackButton);
        AboutBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapFragment();
            }
        });
        return view;
    }

    private void swapFragment() {
        Fragment returnHome = new HomeFragment();
        FragmentTransaction fragmentTransaction = Objects.requireNonNull(getActivity()).
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, returnHome);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}



