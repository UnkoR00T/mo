package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class p5 extends jg.h<t5> {
    public p5(Context context, Looper looper, jg.e eVar, hg.f.a aVar, hg.f.b bVar) {
        super(context, looper, 40, eVar, aVar, bVar);
    }

    @Override // jg.c
    protected final String B() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // jg.c
    protected final String C() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override // jg.c, hg.a.f
    public final int l() {
        return 11925000;
    }

    @Override // jg.c
    protected final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return iInterfaceQueryLocalInterface instanceof t5 ? (t5) iInterfaceQueryLocalInterface : new u5(iBinder);
    }
}
