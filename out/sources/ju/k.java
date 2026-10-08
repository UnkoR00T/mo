package ju;

import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000f\u0010\u0010\u001aO\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lju/p0;", "Ltq/i;", "context", "Lju/r0;", "start", "Lkotlin/Function2;", "Ltq/e;", "Loq/i0;", "", "block", "Lju/d2;", "c", "(Lju/p0;Ltq/i;Lju/r0;Ler/p;)Lju/d2;", "T", "Lju/w0;", "a", "(Lju/p0;Ltq/i;Lju/r0;Ler/p;)Lju/w0;", "e", "(Ltq/i;Ler/p;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class k {
    public static final <T> w0<T> a(p0 p0Var, tq.i iVar, r0 r0Var, er.p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar) {
        tq.i iVarJ = j0.j(p0Var, iVar);
        x0 l2Var = r0Var.g() ? new l2(iVarJ, pVar) : new x0(iVarJ, true);
        ((a) l2Var).n1(r0Var, l2Var, pVar);
        return (w0<T>) l2Var;
    }

    public static /* synthetic */ w0 b(p0 p0Var, tq.i iVar, r0 r0Var, er.p pVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            iVar = tq.j.f191408a;
        }
        if ((i15 & 2) != 0) {
            r0Var = r0.DEFAULT;
        }
        return i.a(p0Var, iVar, r0Var, pVar);
    }

    public static final d2 c(p0 p0Var, tq.i iVar, r0 r0Var, er.p<? super p0, ? super tq.e<? super oq.i0>, ? extends Object> pVar) {
        tq.i iVarJ = j0.j(p0Var, iVar);
        a m2Var = r0Var.g() ? new m2(iVarJ, pVar) : new w2(iVarJ, true);
        m2Var.n1(r0Var, m2Var, pVar);
        return m2Var;
    }

    public static /* synthetic */ d2 d(p0 p0Var, tq.i iVar, r0 r0Var, er.p pVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            iVar = tq.j.f191408a;
        }
        if ((i15 & 2) != 0) {
            r0Var = r0.DEFAULT;
        }
        return i.c(p0Var, iVar, r0Var, pVar);
    }

    public static final <T> Object e(tq.i iVar, er.p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        Object objQ1;
        tq.i iVarC = eVar.getContext();
        tq.i iVarK = j0.k(iVarC, iVar);
        g2.j(iVarK);
        if (iVarK == iVarC) {
            ou.a0 a0Var = new ou.a0(iVarK, eVar);
            objQ1 = pu.b.d(a0Var, a0Var, pVar);
        } else {
            tq.f.Companion bVar = tq.f.INSTANCE;
            if (fr.t.c(iVarK.m(bVar), iVarC.m(bVar))) {
                i3 i3Var = new i3(iVarK, eVar);
                tq.i iVarC2 = i3Var.getContext();
                Object objI = ou.l0.i(iVarC2, null);
                try {
                    Object objD = pu.b.d(i3Var, i3Var, pVar);
                    ou.l0.f(iVarC2, objI);
                    objQ1 = objD;
                } catch (Throwable th4) {
                    ou.l0.f(iVarC2, objI);
                    throw th4;
                }
            } else {
                c1 c1Var = new c1(iVarK, eVar);
                pu.a.b(pVar, c1Var, c1Var);
                objQ1 = c1Var.q1();
            }
        }
        if (objQ1 == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objQ1;
    }
}
