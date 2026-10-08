package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class g implements DynamiteModule.b {
    g() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0742b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0742b c0742b = new DynamiteModule.b.C0742b();
        int iA = aVar.a(context, str, false);
        c0742b.f29094b = iA;
        c0742b.f29095c = iA != 0 ? 1 : 0;
        return c0742b;
    }
}
