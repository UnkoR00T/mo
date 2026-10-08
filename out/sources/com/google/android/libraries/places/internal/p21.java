package com.google.android.libraries.places.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class p21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Locale f33259c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f33260d = new HashMap();

    p21(String str, String str2) {
        this.f33257a = str;
        zj.p.e(!TextUtils.isEmpty(str2), "API key cannot be empty.");
        this.f33258b = str2;
    }

    final p21 a(Locale locale) {
        this.f33259c = locale;
        return this;
    }

    final p21 b(Map map) {
        this.f33260d = new HashMap(map);
        return this;
    }

    public final String c() {
        Uri.Builder builderBuildUpon = Uri.parse("https://maps.googleapis.com/").buildUpon();
        builderBuildUpon.appendEncodedPath("maps/api/place/");
        builderBuildUpon.appendEncodedPath(this.f33257a);
        builderBuildUpon.appendQueryParameter("key", this.f33258b);
        Locale locale = this.f33259c;
        if (locale != null) {
            String languageTag = locale.toLanguageTag();
            if (!TextUtils.isEmpty(languageTag)) {
                builderBuildUpon.appendQueryParameter("language", languageTag);
            }
        }
        Map map = this.f33260d;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builderBuildUpon.build().toString();
    }
}
