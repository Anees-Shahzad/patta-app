package com.dscvu.patta.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.dscvu.patta.Listeners.LoginListener;
import com.dscvu.patta.R;
import com.dscvu.patta.databinding.ActivityLoginBinding;
import com.dscvu.patta.viewmodels.LoginViewModel;

public class LoginActivity extends AppCompatActivity implements LoginListener {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        LoginViewModel viewModel = new ViewModelProvider(this).get(LoginViewModel.class);

        binding.setViewModel(viewModel);
        viewModel.loginListener = this;
        progressBar = findViewById(R.id.progressBar);
    }

    @Override
    public void onLoginStart() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void onLoginSuccess() {
        progressBar.setVisibility(View.INVISIBLE);
//        Intent intent = new Intent(LoginActivity.this, SomeActivity.class);
//        startActivity(intent);
    }

    @Override
    public void onLoginFailure(String error) {
        progressBar.setVisibility(View.INVISIBLE);
        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_LONG).show();
    }
}
