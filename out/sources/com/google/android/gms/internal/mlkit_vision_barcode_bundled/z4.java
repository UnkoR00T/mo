package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class z4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final z4 f30338c = new z4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f30339d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f30341b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l5 f30340a = new j4();

    private z4() {
    }

    public static z4 a() {
        return f30338c;
    }

    public final k5 b(Class cls) {
        t3.c(cls, "messageType");
        k5 k5Var = (k5) this.f30341b.get(cls);
        if (k5Var != null) {
            return k5Var;
        }
        k5 k5VarA = this.f30340a.a(cls);
        t3.c(cls, "messageType");
        k5 k5Var2 = (k5) this.f30341b.putIfAbsent(cls, k5VarA);
        return k5Var2 == null ? k5VarA : k5Var2;
    }
}
