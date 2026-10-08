package ju;

import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aN\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Ltq/i;", "context", "Lkotlin/Function2;", "Lju/p0;", "Ltq/e;", "", "block", "a", "(Ltq/i;Ler/p;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class j {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final <T> T a(tq.i iVar, er.p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar) {
        m1 m1VarA;
        tq.i iVarJ;
        Thread threadCurrentThread = Thread.currentThread();
        tq.f fVar = (tq.f) iVar.m(tq.f.INSTANCE);
        if (fVar == null) {
            m1VarA = c3.f105666a.b();
            iVarJ = j0.j(w1.f105795a, iVar.n0(m1VarA));
        } else {
            m1 m1Var = fVar instanceof m1 ? (m1) fVar : null;
            if (m1Var == null) {
                m1VarA = c3.f105666a.a();
            } else {
                m1 m1Var2 = m1Var.R2() ? m1Var : null;
                if (m1Var2 == null) {
                    m1VarA = c3.f105666a.a();
                } else {
                    m1VarA = m1Var2;
                }
            }
            iVarJ = j0.j(w1.f105795a, iVar);
        }
        g gVar = new g(iVarJ, threadCurrentThread, m1VarA);
        gVar.n1(r0.DEFAULT, gVar, pVar);
        return (T) gVar.p1();
    }

    public static /* synthetic */ Object b(tq.i iVar, er.p pVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            iVar = tq.j.f191408a;
        }
        return i.e(iVar, pVar);
    }
}
