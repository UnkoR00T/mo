package ou;

import java.util.concurrent.CancellationException;
import ju.b1;
import ju.c3;
import ju.d2;
import ju.i3;
import ju.m1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u001a"}, d2 = {"Lju/l0;", "Ltq/i;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runnable", "Loq/i0;", "c", "(Lju/l0;Ltq/i;Ljava/lang/Runnable;)V", "", "d", "(Lju/l0;Ltq/i;)Z", "T", "Ltq/e;", "Loq/t;", "result", "b", "(Ltq/e;Ljava/lang/Object;)V", "Lou/i;", "e", "(Lou/i;)Z", "Lou/e0;", "a", "Lou/e0;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f150042a = new e0("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f150043b = new e0("REUSABLE_CLAIMED");

    public static final <T> void b(tq.e<? super T> eVar, Object obj) {
        if (!(eVar instanceof i)) {
            eVar.i(obj);
            return;
        }
        i iVar = (i) eVar;
        Object objB = ju.e0.b(obj);
        if (d(iVar.dispatcher, iVar.getContext())) {
            iVar._state = objB;
            iVar.resumeMode = 1;
            c(iVar.dispatcher, iVar.getContext(), iVar);
            return;
        }
        m1 m1VarB = c3.f105666a.b();
        if (m1VarB.I2()) {
            iVar._state = objB;
            iVar.resumeMode = 1;
            m1VarB.t2(iVar);
            return;
        }
        m1VarB.y2(true);
        try {
            d2 d2Var = (d2) iVar.getContext().m(d2.INSTANCE);
            if (d2Var == null || d2Var.h()) {
                tq.e<T> eVar2 = iVar.continuation;
                Object obj2 = iVar.countOrElement;
                tq.i iVarC = eVar2.getContext();
                Object objI = l0.i(iVarC, obj2);
                i3<?> i3VarM = objI != l0.f150053a ? ju.j0.m(eVar2, iVarC, objI) : null;
                try {
                    iVar.continuation.i(obj);
                    oq.i0 i0Var = oq.i0.f148189a;
                    if (i3VarM == null || i3VarM.q1()) {
                        l0.f(iVarC, objI);
                    }
                } catch (Throwable th4) {
                    if (i3VarM == null || i3VarM.q1()) {
                        l0.f(iVarC, objI);
                    }
                    throw th4;
                }
            } else {
                CancellationException cancellationExceptionN = d2Var.N();
                iVar.a(objB, cancellationExceptionN);
                oq.t.Companion companion = oq.t.INSTANCE;
                iVar.i(oq.t.b(oq.u.a(cancellationExceptionN)));
            }
            while (m1VarB.Q2()) {
            }
        } catch (Throwable th5) {
            try {
                iVar.j(th5);
            } finally {
                m1VarB.d2(true);
            }
        }
    }

    public static final void c(ju.l0 l0Var, tq.i iVar, Runnable runnable) {
        try {
            l0Var.F1(iVar, runnable);
        } catch (Throwable th4) {
            throw new b1(th4, l0Var, iVar);
        }
    }

    public static final boolean d(ju.l0 l0Var, tq.i iVar) throws b1 {
        try {
            return l0Var.P1(iVar);
        } catch (Throwable th4) {
            throw new b1(th4, l0Var, iVar);
        }
    }

    public static final boolean e(i<? super oq.i0> iVar) {
        oq.i0 i0Var = oq.i0.f148189a;
        m1 m1VarB = c3.f105666a.b();
        if (m1VarB.N2()) {
            return false;
        }
        if (m1VarB.I2()) {
            iVar._state = i0Var;
            iVar.resumeMode = 1;
            m1VarB.t2(iVar);
            return true;
        }
        m1VarB.y2(true);
        try {
            iVar.run();
            do {
            } while (m1VarB.Q2());
        } catch (Throwable th4) {
            try {
                iVar.j(th4);
            } finally {
                m1VarB.d2(true);
            }
        }
        return false;
    }
}
