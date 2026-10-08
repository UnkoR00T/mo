package com.google.android.libraries.places.internal;

import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class jv0 implements r30 {
    public static jv0 a() {
        return iv0.f32609a;
    }

    public static com.google.common.util.concurrent.s b() {
        com.google.common.util.concurrent.t tVarB = com.google.common.util.concurrent.u.b(Executors.newScheduledThreadPool(4, new com.google.common.util.concurrent.z().f("Maps Platform Background-%d").g(10).b()));
        t30.a(tVarB);
        return tVarB;
    }

    @Override // com.google.android.libraries.places.internal.hr0
    public final /* synthetic */ Object zzb() {
        return b();
    }
}
