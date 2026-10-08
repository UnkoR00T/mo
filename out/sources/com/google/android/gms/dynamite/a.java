package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class a implements DynamiteModule.b {
    a() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0742b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0742b c0742b = new DynamiteModule.b.C0742b();
        int iB = aVar.b(context, str);
        c0742b.f29093a = iB;
        c0742b.f29095c = iB != 0 ? -1 : 0;
        return c0742b;
    }
}
