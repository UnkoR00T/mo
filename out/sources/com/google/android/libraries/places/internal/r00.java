package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
final class r00 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r00 f33476c = new r00();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f33478b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xz f33477a = new xz();

    private r00() {
    }

    static r00 a() {
        return f33476c;
    }

    private <T> v00<T> c(Class<T> cls) {
        ConcurrentHashMap concurrentHashMap = this.f33478b;
        v00<T> v00VarA = this.f33477a.a(cls);
        v00<T> v00Var = (v00) concurrentHashMap.putIfAbsent(cls, v00VarA);
        return v00Var != null ? v00Var : v00VarA;
    }

    final v00 b(Class cls) {
        Object obj = this.f33478b.get(cls);
        return obj == null ? c(cls) : (v00) obj;
    }
}
