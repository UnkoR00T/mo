package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.r0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<MessageType extends r0> implements z0<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f36005a = p.b();

    private MessageType c(MessageType messagetype) throws b0 {
        if (messagetype == null || messagetype.c()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    private m1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).h() : new m1(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType b(h hVar, p pVar) {
        return (MessageType) c(f(hVar, pVar));
    }

    public MessageType f(h hVar, p pVar) throws b0 {
        i iVarV = hVar.v();
        MessageType messagetypeA = a(iVarV, pVar);
        try {
            iVarV.a(0);
            return messagetypeA;
        } catch (b0 e15) {
            throw e15.k(messagetypeA);
        }
    }
}
