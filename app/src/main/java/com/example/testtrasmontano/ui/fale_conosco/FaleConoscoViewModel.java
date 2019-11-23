package com.example.testtrasmontano.ui.fale_conosco;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FaleConoscoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FaleConoscoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
