package com.example.testtrasmontano.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CarteirinhaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CarteirinhaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}