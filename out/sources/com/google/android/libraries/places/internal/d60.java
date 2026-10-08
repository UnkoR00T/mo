package com.google.android.libraries.places.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class d60 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f31974d = Logger.getLogger(d60.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d60 f31975e = new d60();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31976f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentNavigableMap f31977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f31978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentMap f31979c;

    public d60() {
        new ConcurrentSkipListMap();
        this.f31977a = new ConcurrentSkipListMap();
        this.f31978b = new ConcurrentHashMap();
        this.f31979c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static d60 a() {
        return f31975e;
    }

    private static void i(Map map, l60 l60Var) {
    }

    private static void j(Map map, l60 l60Var) {
    }

    public final void b(l60 l60Var) {
        i(this.f31978b, l60Var);
    }

    public final void c(l60 l60Var) {
        i(this.f31977a, l60Var);
    }

    public final void d(l60 l60Var) {
        i(this.f31979c, l60Var);
    }

    public final void e(l60 l60Var) {
        j(this.f31978b, l60Var);
    }

    public final void f(l60 l60Var) {
        j(this.f31977a, l60Var);
    }

    public final void g(l60 l60Var) {
        j(this.f31979c, l60Var);
    }
}
