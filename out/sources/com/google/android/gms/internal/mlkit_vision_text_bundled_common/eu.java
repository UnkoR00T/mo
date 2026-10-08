package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.du;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.eu;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eu<MessageType extends eu<MessageType, BuilderType>, BuilderType extends du<MessageType, BuilderType>> implements jx {
    protected int zba = 0;

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.jx
    public final yu L() {
        try {
            int iB = b();
            yu yuVar = yu.f30716b;
            byte[] bArr = new byte[iB];
            dv dvVar = new dv(bArr, 0, iB);
            j(dvVar);
            return tu.a(dvVar, bArr);
        } catch (IOException e15) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e15);
        }
    }

    int a(ux uxVar) {
        throw null;
    }

    public final byte[] d() {
        try {
            int iB = b();
            byte[] bArr = new byte[iB];
            dv dvVar = new dv(bArr, 0, iB);
            j(dvVar);
            dvVar.f();
            return bArr;
        } catch (IOException e15) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e15);
        }
    }
}
