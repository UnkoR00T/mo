package bt;

import bt.q;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<MessageType extends q> implements s<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f21382a = g.c();

    private MessageType e(MessageType messagetype) throws k {
        if (messagetype == null || messagetype.c()) {
            return messagetype;
        }
        throw f(messagetype).a().i(messagetype);
    }

    private w f(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).a() : new w(messagetype);
    }

    @Override // bt.s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType a(InputStream inputStream, g gVar) {
        return (MessageType) e(j(inputStream, gVar));
    }

    @Override // bt.s
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType d(d dVar, g gVar) {
        return (MessageType) e(k(dVar, gVar));
    }

    @Override // bt.s
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType c(InputStream inputStream, g gVar) {
        return (MessageType) e(l(inputStream, gVar));
    }

    public MessageType j(InputStream inputStream, g gVar) throws k {
        try {
            int i15 = inputStream.read();
            if (i15 == -1) {
                return null;
            }
            return (MessageType) l(new a.AbstractC0557a.C0558a(inputStream, e.B(i15, inputStream)), gVar);
        } catch (IOException e15) {
            throw new k(e15.getMessage());
        }
    }

    public MessageType k(d dVar, g gVar) throws k {
        e eVarT = dVar.t();
        MessageType messagetypeB = b(eVarT, gVar);
        try {
            eVarT.a(0);
            return messagetypeB;
        } catch (k e15) {
            throw e15.i(messagetypeB);
        }
    }

    public MessageType l(InputStream inputStream, g gVar) throws k {
        e eVarH = e.h(inputStream);
        MessageType messagetypeB = b(eVarH, gVar);
        try {
            eVarH.a(0);
            return messagetypeB;
        } catch (k e15) {
            throw e15.i(messagetypeB);
        }
    }
}
