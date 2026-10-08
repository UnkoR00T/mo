package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class e41 implements r30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u30 f32157a;

    private e41(u30 u30Var) {
        this.f32157a = u30Var;
    }

    public static e41 b(u30 u30Var) {
        return new e41(u30Var);
    }

    public static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        t30.a(applicationContext);
        return applicationContext;
    }

    @Override // com.google.android.libraries.places.internal.hr0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Context zzb() {
        return c((Context) this.f32157a.zzb());
    }
}
