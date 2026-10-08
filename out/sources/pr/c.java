package pr;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "V", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "Lpr/b;", "a", "(Ler/l;)Lpr/b;", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    static {
        Object objB;
        try {
            oq.t.Companion companion = oq.t.INSTANCE;
            objB = oq.t.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th4) {
            oq.t.Companion companion2 = oq.t.INSTANCE;
            objB = oq.t.b(oq.u.a(th4));
        }
        if (oq.t.g(objB)) {
            objB = Boolean.TRUE;
        }
        Object objB2 = oq.t.b(objB);
        Boolean bool = Boolean.FALSE;
        if (oq.t.f(objB2)) {
            objB2 = bool;
        }
        ((Boolean) objB2).getClass();
    }

    public static final <V> b<V> a(er.l<? super Class<?>, ? extends V> lVar) {
        return new j(lVar);
    }
}
