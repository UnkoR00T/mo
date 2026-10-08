package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class j implements DynamiteModule.b {
    j() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0742b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0742b c0742b = new DynamiteModule.b.C0742b();
        c0742b.f29093a = aVar.b(context, str);
        int i15 = 1;
        int iA = aVar.a(context, str, true);
        c0742b.f29094b = iA;
        int i16 = c0742b.f29093a;
        if (i16 == 0) {
            i16 = 0;
            if (iA == 0) {
                i15 = 0;
            } else if (iA < i16) {
                i15 = -1;
            }
        } else if (iA < i16) {
            i15 = -1;
        }
        c0742b.f29095c = i15;
        return c0742b;
    }
}
