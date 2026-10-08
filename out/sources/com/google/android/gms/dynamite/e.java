package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class e implements DynamiteModule.b {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0742b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0742b c0742b = new DynamiteModule.b.C0742b();
        int iA = aVar.a(context, str, true);
        c0742b.f29094b = iA;
        if (iA != 0) {
            c0742b.f29095c = 1;
            return c0742b;
        }
        int iB = aVar.b(context, str);
        c0742b.f29093a = iB;
        if (iB != 0) {
            c0742b.f29095c = -1;
        }
        return c0742b;
    }
}
