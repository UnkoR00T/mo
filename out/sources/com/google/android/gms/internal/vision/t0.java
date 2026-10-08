package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.t0;
import com.google.android.gms.internal.vision.u0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0<MessageType extends u0<MessageType, BuilderType>, BuilderType extends t0<MessageType, BuilderType>> implements x3 {
    @Override // com.google.android.gms.internal.vision.x3
    public final /* synthetic */ x3 Q1(u3 u3Var) {
        if (e().getClass().isInstance(u3Var)) {
            return j((u0) u3Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType j(MessageType messagetype);

    public abstract BuilderType l(byte[] bArr, int i15, int i16, y1 y1Var);
}
