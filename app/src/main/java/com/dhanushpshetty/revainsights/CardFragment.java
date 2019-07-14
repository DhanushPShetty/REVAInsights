package com.dhanushpshetty.revainsights;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Objects;

public class CardFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.card_fragment, container, false);

        ImageView cardDetail = view.findViewById(R.id.CardBackButton);
        cardDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapFragment();
            }
        });
        return view;
    }

    private void swapFragment() {
        Fragment CardViewBack = new DepartmentFragment();
        FragmentTransaction fragmentTransaction = Objects.requireNonNull(getActivity()).
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, CardViewBack);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }
}
