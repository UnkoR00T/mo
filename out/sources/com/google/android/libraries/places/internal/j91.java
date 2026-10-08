package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class j91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f32651a = new i91();

    static char[] a() {
        char[] cArr = (char[]) f32651a.get();
        Objects.requireNonNull(cArr);
        return cArr;
    }
}
