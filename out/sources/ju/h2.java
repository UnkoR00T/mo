package ju;

import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0016\u001a\u00020\u000f*\u00020\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u000f*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\u000f*\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001f\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 \"\u0015\u0010#\u001a\u00020\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0015\u0010&\u001a\u00020\u0000*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lju/d2;", "", "invokeImmediately", "Lju/i2;", "handler", "Lju/i1;", "l", "(Lju/d2;ZLju/i2;)Lju/i1;", "parent", "Lju/a0;", "a", "(Lju/d2;)Lju/a0;", "handle", "h", "(Lju/d2;Lju/i1;)Lju/i1;", "Loq/i0;", "g", "(Lju/d2;Ltq/e;)Ljava/lang/Object;", "Ltq/i;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "d", "(Ltq/i;Ljava/util/concurrent/CancellationException;)V", "i", "(Lju/d2;)V", "j", "(Ltq/i;)V", "", "message", "", "c", "(Lju/d2;Ljava/lang/String;Ljava/lang/Throwable;)V", "n", "(Ltq/i;)Z", "isActive", "k", "(Ltq/i;)Lju/d2;", "job", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
public final /* synthetic */ class h2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends fr.q implements er.l<Throwable, oq.i0> {
        a(Object obj) {
            super(1, obj, i2.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void E(Throwable th4) {
            ((i2) this.f66391b).x(th4);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(Throwable th4) {
            E(th4);
            return oq.i0.f148189a;
        }
    }

    public static final a0 a(d2 d2Var) {
        return new f2(d2Var);
    }

    public static /* synthetic */ a0 b(d2 d2Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            d2Var = null;
        }
        return g2.a(d2Var);
    }

    public static final void c(d2 d2Var, String str, Throwable th4) {
        d2Var.u(r1.a(str, th4));
    }

    public static final void d(tq.i iVar, CancellationException cancellationException) {
        d2 d2Var = (d2) iVar.m(d2.INSTANCE);
        if (d2Var != null) {
            d2Var.u(cancellationException);
        }
    }

    public static /* synthetic */ void e(d2 d2Var, String str, Throwable th4, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            th4 = null;
        }
        g2.c(d2Var, str, th4);
    }

    public static /* synthetic */ void f(tq.i iVar, CancellationException cancellationException, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            cancellationException = null;
        }
        g2.d(iVar, cancellationException);
    }

    public static final Object g(d2 d2Var, tq.e<? super oq.i0> eVar) {
        d2.a.a(d2Var, null, 1, null);
        Object objT0 = d2Var.T0(eVar);
        return objT0 == uq.b.e() ? objT0 : oq.i0.f148189a;
    }

    public static final i1 h(d2 d2Var, i1 i1Var) {
        return m(d2Var, false, new k1(i1Var), 1, null);
    }

    public static final void i(d2 d2Var) {
        if (!d2Var.h()) {
            throw d2Var.N();
        }
    }

    public static final void j(tq.i iVar) {
        d2 d2Var = (d2) iVar.m(d2.INSTANCE);
        if (d2Var != null) {
            g2.i(d2Var);
        }
    }

    public static final d2 k(tq.i iVar) {
        d2 d2Var = (d2) iVar.m(d2.INSTANCE);
        if (d2Var != null) {
            return d2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final i1 l(d2 d2Var, boolean z15, i2 i2Var) {
        return d2Var instanceof j2 ? ((j2) d2Var).z0(z15, i2Var) : d2Var.J(i2Var.w(), z15, new a(i2Var));
    }

    public static /* synthetic */ i1 m(d2 d2Var, boolean z15, i2 i2Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return g2.l(d2Var, z15, i2Var);
    }

    public static final boolean n(tq.i iVar) {
        d2 d2Var = (d2) iVar.m(d2.INSTANCE);
        if (d2Var != null) {
            return d2Var.h();
        }
        return true;
    }
}
