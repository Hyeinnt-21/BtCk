package com.example.btck;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FeaturedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

    // Default fragment
    loadFragment(new HomeFragment());

    BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(item -> {
        Fragment fragment = null;

        if (item.getItemId() == R.id.nav_home) {
            fragment = new HomeFragment();
        } else if (item.getItemId() == R.id.nav_bookmarks) {
            fragment = new FeaturedFragment();
        } else if (item.getItemId() == R.id.nav_profile) {
            fragment = new ProfileFragment();
        }

        if (fragment != null) {
            loadFragment(fragment);
        }
        return true;
    });
}

private void loadFragment(Fragment fragment) {
    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.fragment_container, fragment);
    transaction.commit();
}
}
