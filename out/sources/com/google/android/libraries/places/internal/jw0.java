package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class jw0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ jw0 f32676a = new jw0();

    private /* synthetic */ jw0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i15 = kw0.f32762d;
        return ((ScanResult) obj2).level - ((ScanResult) obj).level;
    }
}
