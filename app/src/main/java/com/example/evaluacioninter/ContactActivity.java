package com.example.evaluacioninter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.evaluacioninter.databinding.ActivityContactBinding;
import com.example.evaluacioninter.databinding.FragmentMessageBinding;

public class ContactActivity extends AppCompatActivity {
    private ActivityContactBinding mbinding;
    private String Facebook = "https://www.facebook.com";
    private String Instagram = "https://www.instagram.com";
    private String Linkeding = "https://www.linkeding.com";
    private String Whatapps = "https://www.whatapps.com;";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mbinding = ActivityContactBinding.inflate(inflater, container, false);
        return mbinding.getRoot();
        mbinding.ifButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(Facebook);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        });
        mbinding.iIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(Instagram);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }


        });
        mbinding.imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(Linkeding);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        mbinding.iWButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(Whatapps);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}