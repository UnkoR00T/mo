package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.vv;

/* JADX INFO: loaded from: classes3.dex */
public class vv<MessageType extends bw<MessageType, BuilderType>, BuilderType extends vv<MessageType, BuilderType>> extends du<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bw f30654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected bw f30655b;

    protected vv(MessageType messagetype) {
        this.f30654a = messagetype;
        if (messagetype.o()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f30655b = messagetype.x();
    }

    private static void l(Object obj, Object obj2) {
        rx.a().b(obj.getClass()).b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx
    public final boolean c() {
        return bw.n(this.f30655b, false);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final vv clone() {
        vv vvVar = (vv) this.f30654a.p(5, null, null);
        vvVar.f30655b = S1();
        return vvVar;
    }

    public final vv n(bw bwVar) {
        if (!this.f30654a.equals(bwVar)) {
            if (!this.f30655b.o()) {
                s();
            }
            l(this.f30655b, bwVar);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ix
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final MessageType L() {
        MessageType messagetype = (MessageType) S1();
        if (bw.n(messagetype, true)) {
            return messagetype;
        }
        throw new jy(messagetype);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ix
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public MessageType S1() {
        if (!this.f30655b.o()) {
            return (MessageType) this.f30655b;
        }
        this.f30655b.h();
        return (MessageType) this.f30655b;
    }

    protected final void q() {
        if (this.f30655b.o()) {
            return;
        }
        s();
    }

    protected void s() {
        bw bwVarX = this.f30654a.x();
        l(bwVarX, this.f30655b);
        this.f30655b = bwVarX;
    }
}
