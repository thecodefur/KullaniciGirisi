package com.example.kullanicigirisi1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;


import androidx.appcompat.app.AppCompatActivity;


import com.example.kullanicigirisi1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();
        setContentView(view);
    }

    public void kullaniciGirisi(View view){
        String kullaniciAdi = binding.editTextTextKullaniciAdi.getText().toString();
        String parola = binding.editTextTextKullaniciParola.getText().toString();

        Singleton singleton = Singleton.getInstance();
        singleton.setKullaniciAdi(kullaniciAdi);
        singleton.setKullaniciParola(parola);

        Intent intent = new Intent(this,AnaSayfa.class);
        startActivity(intent);
    }
}