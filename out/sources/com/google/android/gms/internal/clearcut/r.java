package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.q;
import com.google.android.gms.internal.clearcut.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r<MessageType extends q<MessageType, BuilderType>, BuilderType extends r<MessageType, BuilderType>> implements m2 {
    protected abstract BuilderType m(MessageType messagetype);

    @Override // com.google.android.gms.internal.clearcut.m2
    public final /* synthetic */ m2 x1(l2 l2Var) {
        if (b().getClass().isInstance(l2Var)) {
            return m((q) l2Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
