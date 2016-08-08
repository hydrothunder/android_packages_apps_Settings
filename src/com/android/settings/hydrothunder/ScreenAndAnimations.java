package com.android.settings.hydrothunder;

import android.app.Activity;
import android.os.Bundle;
import android.content.ContentResolver;
import android.content.Context;
import android.os.SystemProperties;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import android.provider.Settings;

import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.R;

import com.android.internal.logging.MetricsLogger;

public class ScreenAndAnimations extends SettingsPreferenceFragment implements
        Preference.OnPreferenceChangeListener {

    private static final String TAG = "ScreenAndAnimations";

    private Context mContext;

    @Override
    protected int getMetricsCategory() {
        return MetricsLogger.APPLICATION;
    }

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        addPreferencesFromResource(R.xml.screen_and_animations);

        ContentResolver resolver = getActivity().getContentResolver();
        Activity activity = getActivity();
        PreferenceScreen prefSet = getPreferenceScreen();

        mContext = getActivity().getApplicationContext();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        ContentResolver resolver = getActivity().getContentResolver();
        return false;
    }
}
