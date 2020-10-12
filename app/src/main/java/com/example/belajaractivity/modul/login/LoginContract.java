package com.example.belajaractivity.modul.login;

import com.example.belajaractivity.base.BasePresenter;
import com.example.belajaractivity.base.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
