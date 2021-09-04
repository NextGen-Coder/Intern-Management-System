package co.in.nextgencoder.internsmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CompanyLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_login);
    }

    public void goToForgotPassword(View view) {
        Intent intent = new Intent(getApplicationContext(),CompanyForgotPassword.class);
        startActivity(intent);
    }
}