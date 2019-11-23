package com.example.testtrasmontano.ui.notifications;

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

public class CarteirinhaFragment extends Fragment {

    private CarteirinhaViewModel carteirinhaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        carteirinhaViewModel =
                ViewModelProviders.of(this).get(CarteirinhaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_carteirinha, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        carteirinhaViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}