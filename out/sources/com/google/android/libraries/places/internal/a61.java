package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes4.dex */
public final class a61 {
    public static final int a(Context context, int i15) {
        b61 b61Var = b61.WHITE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i15, fi.j.f64103a);
        int i16 = typedArrayObtainStyledAttributes.getInt((typedArrayObtainStyledAttributes.getResources().getConfiguration().uiMode & 48) == 32 ? fi.j.f64104b : fi.j.f64105c, -1);
        b61 b61Var2 = b61.WHITE;
        if (i16 != b61Var2.zza()) {
            b61Var2 = b61.GRAY;
            if (i16 != b61Var2.zza()) {
                b61 b61Var3 = b61.BLACK;
                if (i16 == b61Var3.zza()) {
                    b61Var2 = b61Var3;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return context.getColor(b61Var2.b());
    }
}
