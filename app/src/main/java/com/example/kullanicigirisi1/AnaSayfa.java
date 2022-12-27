package com.example.kullanicigirisi1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.kullanicigirisi1.databinding.ActivityMainBinding;

public class AnaSayfa extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        String kullaniciAdi = Singleton.getInstance().getKullaniciAdi();
        String parola = Singleton.getInstance().getKullaniciParola();
        binding.editTextTextKullaniciAdi.setText(kullaniciAdi);
        binding.editTextTextKullaniciParola.setText(parola);
    }
}