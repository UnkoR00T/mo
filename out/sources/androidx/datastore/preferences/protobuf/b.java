package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<MessageType extends r0> implements z0<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o f11908a = o.b();

    private MessageType c(MessageType messagetype) throws a0 {
        if (messagetype == null || messagetype.c()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    private m1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).k() : new m1(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(g gVar, o oVar) {
        return (MessageType) c(f(gVar, oVar));
    }

    public MessageType f(g gVar, o oVar) throws a0 {
        h hVarU = gVar.u();
        MessageType messagetypeB = b(hVarU, oVar);
        try {
            hVarU.a(0);
            return messagetypeB;
        } catch (a0 e15) {
            throw e15.k(messagetypeB);
        }
    }
}
