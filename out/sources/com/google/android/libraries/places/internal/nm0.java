package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface nm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nm0 f33069a;

    static {
        nm0 ub0Var;
        try {
            Class.forName("java.time.Instant");
            ub0Var = new gf0();
        } catch (ClassNotFoundException unused) {
            ub0Var = new ub0();
        }
        f33069a = ub0Var;
    }

    long zza();
}
