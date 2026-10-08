package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class a50 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a50 f31564c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f31565a = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31566b = 0;

    a50() {
    }

    public static synchronized a50 a() {
        try {
            if (f31564c == null) {
                f31564c = new a50();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f31564c;
    }

    public final synchronized List b() {
        this.f31566b++;
        return this.f31565a;
    }

    public final synchronized boolean c() {
        return false;
    }
}
