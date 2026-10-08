package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t1<MessageType extends t1<MessageType, BuilderType>, BuilderType extends s1<MessageType, BuilderType>> implements r4 {
    protected int zza = 0;

    int d(k5 k5Var) {
        throw null;
    }

    public final byte[] e() {
        try {
            int iU = u();
            byte[] bArr = new byte[iU];
            o2 o2Var = new o2(bArr, 0, iU);
            v(o2Var);
            o2Var.c();
            return bArr;
        } catch (IOException e15) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r4
    public final j2 x() {
        try {
            int iU = u();
            j2 j2Var = j2.f29738b;
            byte[] bArr = new byte[iU];
            o2 o2Var = new o2(bArr, 0, iU);
            v(o2Var);
            o2Var.c();
            return new i2(bArr);
        } catch (IOException e15) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e15);
        }
    }
}
