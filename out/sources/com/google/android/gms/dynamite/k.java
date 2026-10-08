package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class k implements DynamiteModule.b {
    k() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0742b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iA;
        DynamiteModule.b.C0742b c0742b = new DynamiteModule.b.C0742b();
        int iB = aVar.b(context, str);
        c0742b.f29093a = iB;
        int i15 = 1;
        int i16 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0742b.f29094b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0742b.f29094b = iA;
        }
        int i17 = c0742b.f29093a;
        if (i17 == 0) {
            if (iA == 0) {
                i15 = 0;
            }
            c0742b.f29095c = i15;
            return c0742b;
        }
        i16 = i17;
        if (iA < i16) {
            i15 = -1;
        }
        c0742b.f29095c = i15;
        return c0742b;
    }
}
