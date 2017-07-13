package com.csform.android.uiapptemplate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.csform.android.uiapptemplate.util.DialogUniversalInfoUtils;

public class DialogUniversalInfoActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dialog);
		
		DialogUniversalInfoUtils dialog = new DialogUniversalInfoUtils(this);
		dialog.showDialog();

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setTitle("Dialog universal info");
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
