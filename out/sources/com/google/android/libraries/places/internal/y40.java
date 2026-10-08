package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public final class y40 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final y40 f34339b = new y40(new u40(), v40.f34024a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f34340c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f34341a = new ConcurrentHashMap();

    y40(x40... x40VarArr) {
        for (int i15 = 0; i15 < 2; i15++) {
            x40 x40Var = x40VarArr[i15];
            this.f34341a.put(x40Var.zza(), x40Var);
        }
    }

    public static y40 a() {
        return f34339b;
    }
}
