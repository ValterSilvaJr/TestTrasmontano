package com.example.testtrasmontano.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.testtrasmontano.R;

public class AlarmeFragment extends Fragment {

    private AlarmeViewModel alarmeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        alarmeViewModel =
                ViewModelProviders.of(this).get(AlarmeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_alarme, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        alarmeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}