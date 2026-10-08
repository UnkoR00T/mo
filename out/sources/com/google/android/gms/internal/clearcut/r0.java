package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f29527b = a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final r0 f29528c = new r0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Object, Object> f29529a;

    r0() {
        this.f29529a = new HashMap();
    }

    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static r0 b() {
        return q0.b();
    }

    private r0(boolean z15) {
        this.f29529a = Collections.EMPTY_MAP;
    }
}
