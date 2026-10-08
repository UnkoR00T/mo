package oe;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class e implements c {
    @Override // oe.c
    public b a(Context context, b.a aVar) {
        return u5.a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new d(context, aVar) : new n();
    }
}
