package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Loq/t;", "", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lju/n;", "caller", "c", "(Ljava/lang/Object;Lju/n;)Ljava/lang/Object;", "state", "Ltq/e;", "uCont", "a", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {
    public static final <T> Object a(Object obj, tq.e<? super T> eVar) {
        if (!(obj instanceof c0)) {
            return oq.t.b(obj);
        }
        oq.t.Companion companion = oq.t.INSTANCE;
        return oq.t.b(oq.u.a(((c0) obj).cause));
    }

    public static final <T> Object b(Object obj) {
        Throwable thD = oq.t.d(obj);
        return thD == null ? obj : new c0(thD, false, 2, null);
    }

    public static final <T> Object c(Object obj, n<?> nVar) {
        Throwable thD = oq.t.d(obj);
        return thD == null ? obj : new c0(thD, false, 2, null);
    }
}
