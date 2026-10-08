package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class lo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f32878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f32879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ oo f32881d;

    /* synthetic */ lo(oo ooVar, Object obj, byte[] bArr) {
        Objects.requireNonNull(ooVar);
        this.f32881d = ooVar;
        this.f32879b = new LinkedHashMap();
        this.f32878a = obj;
    }

    final boolean a() {
        return this.f32879b.isEmpty() && this.f32880c == this.f32881d.u().d();
    }

    final boolean b() {
        return this.f32879b.isEmpty() && this.f32880c == this.f32881d.u().f() + 1;
    }

    final /* synthetic */ Object c() {
        return this.f32878a;
    }

    final /* synthetic */ LinkedHashMap d() {
        return this.f32879b;
    }

    final /* synthetic */ int e() {
        return this.f32880c;
    }

    final /* synthetic */ void f(int i15) {
        this.f32880c = i15;
    }
}
