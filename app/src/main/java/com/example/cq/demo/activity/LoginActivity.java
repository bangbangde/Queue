package com.example.cq.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.cq.demo.R;
import com.example.cq.demo.http.entity.listener.OnLoginListener;
import com.example.cq.demo.http.entity.response.LoginResponse;
import com.example.cq.demo.model.CLoginModel;
import com.example.cq.demo.model.ILoginModel;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private EditText etUid, etPwd;
    private Button btLogin;
    private ProgressBar progressBar;

    private ILoginModel loginModel;

    private OnLoginListener onLoginListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        init();
    }

    private void initView() {
        etUid = (EditText) findViewById(R.id.etUid);
        etPwd = (EditText) findViewById(R.id.etPwd);
        btLogin = (Button) findViewById(R.id.btLogin);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
    }

    private void init() {
        loginModel = new CLoginModel();
        btLogin.setOnClickListener(this);
        onLoginListener = new OnLoginListener(){

            @Override
            public void onSuccess(LoginResponse loginResponse) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }

            @Override
            public void onError(String error) {
                Toast.makeText(LoginActivity.this, error, Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.INVISIBLE);
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        };
    }

    @Override
    public void onClick(View v) {
        progressBar.setVisibility(View.VISIBLE);
        loginModel.login(null,onLoginListener);
    }
}
