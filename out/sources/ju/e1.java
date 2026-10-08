package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "Lju/d1;", "", "mode", "Loq/i0;", "a", "(Lju/d1;I)V", "Ltq/e;", "delegate", "", "undispatched", "d", "(Lju/d1;Ltq/e;Z)V", "e", "(Lju/d1;)V", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e1 {
    public static final <T> void a(d1<? super T> d1Var, int i15) {
        tq.e<? super T> eVarB = d1Var.b();
        boolean z15 = i15 == 4;
        if (z15 || !(eVarB instanceof ou.i) || b(i15) != b(d1Var.resumeMode)) {
            d(d1Var, eVarB, z15);
            return;
        }
        ou.i iVar = (ou.i) eVarB;
        l0 l0Var = iVar.dispatcher;
        tq.i context = iVar.getContext();
        if (ou.j.d(l0Var, context)) {
            ou.j.c(l0Var, context, d1Var);
        } else {
            e(d1Var);
        }
    }

    public static final boolean b(int i15) {
        return i15 == 1 || i15 == 2;
    }

    public static final boolean c(int i15) {
        return i15 == 2;
    }

    public static final <T> void d(d1<? super T> d1Var, tq.e<? super T> eVar, boolean z15) {
        Object objF;
        Object objK = d1Var.k();
        Throwable thD = d1Var.d(objK);
        if (thD != null) {
            oq.t.Companion companion = oq.t.INSTANCE;
            objF = oq.u.a(thD);
        } else {
            oq.t.Companion companion2 = oq.t.INSTANCE;
            objF = d1Var.f(objK);
        }
        Object objB = oq.t.b(objF);
        if (!z15) {
            eVar.i(objB);
            return;
        }
        ou.i iVar = (ou.i) eVar;
        tq.e<T> eVar2 = iVar.continuation;
        Object obj = iVar.countOrElement;
        tq.i context = eVar2.getContext();
        Object objI = ou.l0.i(context, obj);
        i3<?> i3VarM = objI != ou.l0.f150053a ? j0.m(eVar2, context, objI) : null;
        try {
            iVar.continuation.i(objB);
            oq.i0 i0Var = oq.i0.f148189a;
        } finally {
            if (i3VarM == null || i3VarM.q1()) {
                ou.l0.f(context, objI);
            }
        }
    }

    private static final void e(d1<?> d1Var) {
        m1 m1VarB = c3.f105666a.b();
        if (m1VarB.I2()) {
            m1VarB.t2(d1Var);
            return;
        }
        m1VarB.y2(true);
        try {
            d(d1Var, d1Var.b(), true);
            do {
            } while (m1VarB.Q2());
        } catch (Throwable th4) {
            try {
                d1Var.j(th4);
            } finally {
                m1VarB.d2(true);
            }
        }
    }
}
