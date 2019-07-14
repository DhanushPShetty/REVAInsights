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

public class StudentFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.student_fragment, container, false);


        ImageButton MenuButton = view.findViewById(R.id.menu_button);
        MenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapFragment();
            }
        });
        return view;
    }

    private void swapFragment() {
        Fragment aboutApp = new AttendanceFragment();
        FragmentTransaction fragmentTransaction = Objects.requireNonNull(getActivity()).
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, aboutApp);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


}

