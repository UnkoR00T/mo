package com.google.android.libraries.places.internal;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class c61 {
    public static final Parcelable a(Bundle bundle, String str, Class cls) {
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(str, cls) : bundle.getParcelable(str);
        if (parcelable != null) {
            return parcelable;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
