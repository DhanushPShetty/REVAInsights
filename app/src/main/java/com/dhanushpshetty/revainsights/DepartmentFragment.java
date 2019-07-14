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

public class DepartmentFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.department_fragment, container, false);


        ImageView card = view.findViewById(R.id.post_image);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapFragment();
            }
        });
        return view;
    }

    private void swapFragment() {
        Fragment CardView = new CardFragment();
        FragmentTransaction fragmentTransaction = Objects.requireNonNull(getActivity()).
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, CardView);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


}

