package jg;

import android.os.IBinder;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends xg.a implements m {
    m1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // jg.m
    public final void cancel() {
        m3(2, n3());
    }
}
