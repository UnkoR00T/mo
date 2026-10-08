package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class ea1 extends ha1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ga1 f32184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fa1 f32185d;

    /* synthetic */ ea1(da1 da1Var, byte[] bArr) {
        HashMap map = new HashMap();
        this.f32182a = map;
        HashMap map2 = new HashMap();
        this.f32183b = map2;
        map.putAll(da1Var.d());
        map2.putAll(da1Var.e());
        this.f32184c = da1Var.f();
        this.f32185d = da1Var.g();
    }
}
