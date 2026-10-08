package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class i81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f32536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f32537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    i81 f32538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f32539d = new HashMap(0);

    i81(int i15, int i16, i81 i81Var) {
        if (i15 > i16) {
            throw new IllegalArgumentException();
        }
        this.f32536a = i15;
        this.f32537b = i16;
        this.f32538c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        StringBuilder sb5 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4);
        sb5.append("Node");
        sb5.append(iIdentityHashCode);
        return sb5.toString();
    }
}
