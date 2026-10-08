package com.google.android.gms.internal.oss_licenses;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f30882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f30883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    s f30884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f30885d = new HashMap(0);

    s(int i15, int i16, s sVar) {
        if (i15 > i16) {
            throw new IllegalArgumentException();
        }
        this.f30882a = i15;
        this.f30883b = i16;
        this.f30884c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        StringBuilder sb5 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4);
        sb5.append("Node");
        sb5.append(iIdentityHashCode);
        return sb5.toString();
    }
}
