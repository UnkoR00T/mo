package pu;

import er.p;
import fr.w0;
import ju.b1;
import ju.c0;
import ju.e3;
import ju.k2;
import oq.t;
import oq.u;
import ou.a0;
import ou.l0;
import p071kotlin.Metadata;
import tq.e;
import tq.i;
import vq.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\u000e\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a[\u0010\u0011\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0019\u001a\u00020\u0018*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"R", "T", "Lkotlin/Function2;", "Ltq/e;", "", "receiver", "completion", "Loq/i0;", "c", "(Ler/p;Ljava/lang/Object;Ltq/e;)V", "Lou/a0;", "block", "d", "(Lou/a0;Ljava/lang/Object;Ler/p;)Ljava/lang/Object;", "e", "", "alwaysRethrow", "f", "(Lou/a0;ZLjava/lang/Object;Ler/p;)Ljava/lang/Object;", "", "cause", "b", "(Lou/a0;Ljava/lang/Throwable;)Z", "Lju/b1;", "", "a", "(Lou/a0;Lju/b1;)Ljava/lang/Void;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    private static final Void a(a0<?> a0Var, b1 b1Var) throws Throwable {
        a0Var.F0(new c0(b1Var.getCause(), false, 2, null));
        throw b1Var.getCause();
    }

    private static final boolean b(a0<?> a0Var, Throwable th4) {
        return ((th4 instanceof e3) && ((e3) th4).coroutine == a0Var) ? false : true;
    }

    public static final <R, T> void c(p<? super R, ? super e<? super T>, ? extends Object> pVar, R r15, e<? super T> eVar) {
        e eVarA = g.a(eVar);
        try {
            i context = eVarA.getContext();
            Object objI = l0.i(context, null);
            try {
                g.b(eVarA);
                Object objD = !(pVar instanceof vq.a) ? uq.b.d(pVar, r15, eVarA) : ((p) w0.g(pVar, 2)).B(r15, eVarA);
                l0.f(context, objI);
                if (objD != uq.b.e()) {
                    eVarA.i(t.b(objD));
                }
            } catch (Throwable th4) {
                l0.f(context, objI);
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
            if (th instanceof b1) {
                th = ((b1) th).getCause();
            }
            t.Companion companion = t.INSTANCE;
            eVarA.i(t.b(u.a(th)));
        }
    }

    public static final <T, R> Object d(a0<? super T> a0Var, R r15, p<? super R, ? super e<? super T>, ? extends Object> pVar) {
        return f(a0Var, true, r15, pVar);
    }

    public static final <T, R> Object e(a0<? super T> a0Var, R r15, p<? super R, ? super e<? super T>, ? extends Object> pVar) {
        return f(a0Var, false, r15, pVar);
    }

    private static final <T, R> Object f(a0<? super T> a0Var, boolean z15, R r15, p<? super R, ? super e<? super T>, ? extends Object> pVar) throws Throwable {
        Object c0Var;
        Object objG0;
        try {
            c0Var = !(pVar instanceof vq.a) ? uq.b.d(pVar, r15, a0Var) : ((p) w0.g(pVar, 2)).B(r15, a0Var);
        } catch (b1 e15) {
            a(a0Var, e15);
            throw new oq.g();
        } catch (Throwable th4) {
            c0Var = new c0(th4, false, 2, null);
        }
        if (c0Var != uq.b.e() && (objG0 = a0Var.G0(c0Var)) != k2.f105735b) {
            a0Var.p1();
            if (!(objG0 instanceof c0)) {
                return k2.h(objG0);
            }
            if (z15 || b(a0Var, ((c0) objG0).cause)) {
                throw ((c0) objG0).cause;
            }
            if (c0Var instanceof c0) {
                throw ((c0) c0Var).cause;
            }
            return c0Var;
        }
        return uq.b.e();
    }
}
