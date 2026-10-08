package k10;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {ip.a.f96137b, "Lk10/l;", "state", "a", "(Lk10/l;Ljava/lang/Object;)Ljava/lang/Object;", "statemachine_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d0 {
    public static final <S> S a(l<? extends S> lVar, S s15) {
        if (lVar instanceof a0) {
            return s15;
        }
        if (lVar instanceof b0) {
            return (S) ((b0) lVar).a();
        }
        if (lVar instanceof f0) {
            return (S) ((f0) lVar).a(s15);
        }
        throw new oq.p();
    }
}
