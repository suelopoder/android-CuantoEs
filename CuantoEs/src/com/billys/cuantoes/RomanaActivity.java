package com.billys.cuantoes;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class RomanaActivity extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.romana);

        if (findViewById(R.id.fragment_container) != null) {

            if (savedInstanceState != null) {
                return;
            }

            GastoFragment firstFragment = new GastoFragment();
            getSupportFragmentManager()
            	.beginTransaction()
                .add(R.id.fragment_container, firstFragment)
                .commit();
        }
    }
}
