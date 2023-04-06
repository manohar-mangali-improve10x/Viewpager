package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private WhatsAppAdapter whatsAppAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setUpAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        viewPager.setAdapter(whatsAppAdapter);
    }
    private void setUpAdapter() {
        whatsAppAdapter = new WhatsAppAdapter(this);
    }

    private void initViews() {
            viewPager = findViewById(R.id.view_pager);
    }
}