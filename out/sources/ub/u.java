package ub;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ju.d2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Ltq/i;", "context", "Lju/r0;", "start", "Lkotlin/Function2;", "Lju/p0;", "Ltq/e;", "", "block", "Lcom/google/common/util/concurrent/q;", "j", "(Ltq/i;Lju/r0;Ler/p;)Lcom/google/common/util/concurrent/q;", "V", "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "f", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Ler/a;)Lcom/google/common/util/concurrent/q;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f197183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.p<ju.p0, tq.e<? super T>, Object> f197184g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a<T> f197185h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.p<? super ju.p0, ? super tq.e<? super T>, ? extends Object> pVar, androidx.concurrent.futures.c.a<T> aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f197184g = pVar;
            this.f197185h = aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to ub.u$a for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r3.f197182e
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                oq.u.b(r4)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                goto L2b
            Lf:
                r4 = move-exception
                goto L31
            L11:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L19:
                oq.u.b(r4)
                java.lang.Object r4 = r3.f197183f
                ju.p0 r4 = (ju.p0) r4
                er.p<ju.p0, tq.e<? super T>, java.lang.Object> r1 = r3.f197184g     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                r3.f197182e = r2     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                java.lang.Object r4 = r1.B(r4, r3)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                if (r4 != r0) goto L2b
                return r0
            L2b:
                androidx.concurrent.futures.c$a<T> r0 = r3.f197185h     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                r0.c(r4)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                goto L3c
            L31:
                androidx.concurrent.futures.c$a<T> r0 = r3.f197185h
                r0.f(r4)
                goto L3c
            L37:
                androidx.concurrent.futures.c$a<T> r4 = r3.f197185h
                r4.d()
            L3c:
                oq.i0 r4 = oq.i0.f148189a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ub.u.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f197184g, this.f197185h, eVar);
            aVar.f197183f = obj;
            return aVar;
        }
    }

    public static final <V> com.google.common.util.concurrent.q<V> f(final Executor executor, final String str, final er.a<? extends V> aVar) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: ub.r
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar2) {
                return u.g(executor, str, aVar, aVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(Executor executor, String str, final er.a aVar, final androidx.concurrent.futures.c.a aVar2) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        aVar2.a(new Runnable() { // from class: ub.s
            @Override // java.lang.Runnable
            public final void run() {
                u.h(atomicBoolean);
            }
        }, h.INSTANCE);
        executor.execute(new Runnable() { // from class: ub.t
            @Override // java.lang.Runnable
            public final void run() {
                u.i(atomicBoolean, aVar2, aVar);
            }
        });
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AtomicBoolean atomicBoolean, androidx.concurrent.futures.c.a aVar, er.a aVar2) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(aVar2.a());
        } catch (Throwable th4) {
            aVar.f(th4);
        }
    }

    public static final <T> com.google.common.util.concurrent.q<T> j(final tq.i iVar, final ju.r0 r0Var, final er.p<? super ju.p0, ? super tq.e<? super T>, ? extends Object> pVar) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: ub.p
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return u.l(iVar, r0Var, pVar, aVar);
            }
        });
    }

    public static /* synthetic */ com.google.common.util.concurrent.q k(tq.i iVar, ju.r0 r0Var, er.p pVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            iVar = tq.j.f191408a;
        }
        if ((i15 & 2) != 0) {
            r0Var = ju.r0.DEFAULT;
        }
        return j(iVar, r0Var, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(tq.i iVar, ju.r0 r0Var, er.p pVar, androidx.concurrent.futures.c.a aVar) {
        final d2 d2Var = (d2) iVar.m(d2.INSTANCE);
        aVar.a(new Runnable() { // from class: ub.q
            @Override // java.lang.Runnable
            public final void run() {
                u.m(d2Var);
            }
        }, h.INSTANCE);
        return ju.k.d(ju.q0.a(iVar), null, r0Var, new a(pVar, aVar, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(d2 d2Var) {
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
    }
}
