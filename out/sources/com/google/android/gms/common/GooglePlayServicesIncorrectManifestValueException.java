package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
import gg.e;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i15) {
        int i16 = e.f72733a;
        StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 104 + String.valueOf(i15).length() + 194);
        sb5.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        sb5.append(i16);
        sb5.append(" but found ");
        sb5.append(i15);
        sb5.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(i15, sb5.toString());
    }
}
