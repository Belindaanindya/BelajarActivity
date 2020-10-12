package com.example.belajaractivity.modul.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.belajaractivity.R;
import com.example.belajaractivity.base.BaseFragment;

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View {
    TextView tvUsername;
    TextView tvPassword;
    Bundle bundle;

    public ProfileFragment(Bundle bundle) {
        this.bundle = bundle;
    }

    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        mPresenter = new ProfilePresenter(this);
        mPresenter.start();

        tvUsername = fragmentView.findViewById(R.id.tv_username);
        tvPassword = fragmentView.findViewById(R.id.tv_password);

        mPresenter.getUserInfo(bundle);

        setTitle("My Profile View");

        return fragmentView;
    }


    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        mPresenter = presenter;
    }

    public void showProfile(String email, String password){
        tvUsername.setText(email);
        tvPassword.setText(password);
    }
}
