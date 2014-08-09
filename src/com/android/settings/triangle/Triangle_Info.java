package com.android.settings.triangle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;

import com.android.settings.R;

public class Triangle_Info extends PreferenceFragment {


	Preference mGithubAddress;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		addPreferencesFromResource(R.xml.triangle_settings);
		mGithubAddress = findPreference("github_webview");
		
	}
	
	@Override
	public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
	    if (preference == mGithubAddress) {
                    webintent("https://github.com/Triangles");
	    }
	        return super.onPreferenceTreeClick(preferenceScreen, preference);
	}

	private void webintent(String url) {
	    Uri uri = Uri.parse(url);
		Intent webintent = new Intent(Intent.ACTION_VIEW, uri);
		getActivity().startActivity(webintent);
	}
}




