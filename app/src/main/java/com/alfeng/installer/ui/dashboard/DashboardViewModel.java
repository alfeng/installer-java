package com.alfeng.installer.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel
{
    private MutableLiveData<String> mText;
    public LiveData<String> getText() { return mText; }

    public DashboardViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is the dashboard fragment");
    }
}
