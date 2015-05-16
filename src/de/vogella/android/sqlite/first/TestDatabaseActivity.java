package de.vogella.android.sqlite.first;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;

public class TestDatabaseActivity extends ListActivity {
	private CommentsDataSource datasource;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
	}

	public void onClick(View view) {

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
}
