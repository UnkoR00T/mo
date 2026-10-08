package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lju/n;", "Lju/m;", "handler", "Loq/i0;", "c", "(Lju/n;Lju/m;)V", "Ltq/e;", "delegate", "Lju/p;", "b", "(Ltq/e;)Lju/p;", "Lju/i1;", "handle", "a", "(Lju/n;Lju/i1;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    public static final void a(n<?> nVar, i1 i1Var) {
        c(nVar, new j1(i1Var));
    }

    public static final <T> p<T> b(tq.e<? super T> eVar) {
        if (!(eVar instanceof ou.i)) {
            return new p<>(eVar, 1);
        }
        p<T> pVarM = ((ou.i) eVar).m();
        if (pVarM != null) {
            if (!pVarM.O()) {
                pVarM = null;
            }
            if (pVarM != null) {
                return pVarM;
            }
        }
        return new p<>(eVar, 2);
    }

    public static final <T> void c(n<? super T> nVar, m mVar) {
        if (!(nVar instanceof p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((p) nVar).I(mVar);
    }
}
