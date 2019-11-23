package com.example.testtrasmontano.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.testtrasmontano.CentrosMedicosFragment;
import com.example.testtrasmontano.MainActivity;
import com.example.testtrasmontano.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RelativeLayout btnCentroMedico;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        this.btnCentroMedico = root.findViewById(R.id.centro_medico);
        setBtnCentroMedico();

        return root;
    }

    private void setBtnCentroMedico() {

        FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        this.btnCentroMedico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CentrosMedicosFragment centros = new CentrosMedicosFragment();
                fragmentTransaction.replace(R.id.nav_host_fragment, centros);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                return;
            }
        });
    }
}