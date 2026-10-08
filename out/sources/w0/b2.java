package w0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JR\u0010\u0014\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0019\u0010\u0003R(\u0010\u001e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001aj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lw0/b2;", "", "<init>", "()V", "Lw0/b2$a;", "mutator", "Loq/i0;", "h", "(Lw0/b2$a;)V", "R", "Lw0/z1;", "priority", "Lkotlin/Function1;", "Ltq/e;", "block", "d", "(Lw0/z1;Ler/l;Ltq/e;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "f", "(Ljava/lang/Object;Lw0/z1;Ler/p;Ltq/e;)Ljava/lang/Object;", "", "g", "()Z", "i", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lsu/a;", "b", "Lsu/a;", "mutex", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = su.g.b(false, 1, null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lw0/b2$a;", "", "Lw0/z1;", "priority", "Lju/d2;", "job", "<init>", "(Lw0/z1;Lju/d2;)V", "other", "", "a", "(Lw0/b2$a;)Z", "Loq/i0;", "b", "()V", "Lw0/z1;", "getPriority", "()Lw0/z1;", "Lju/d2;", "getJob", "()Lju/d2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final z1 priority;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ju.d2 job;

        public a(z1 z1Var, ju.d2 d2Var) {
            this.priority = z1Var;
            this.job = d2Var;
        }

        public final boolean a(a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            this.job.u(new a2());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class b<R> extends vq.k implements er.p<ju.p0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f208828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f208829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f208830g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f208831h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f208832j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ z1 f208833k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ b2 f208834l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super R>, Object> f208835m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(z1 z1Var, b2 b2Var, er.l<? super tq.e<? super R>, ? extends Object> lVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f208833k = z1Var;
            this.f208834l = b2Var;
            this.f208835m = lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, su.a] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            su.a aVar;
            a aVar2;
            b2 b2Var;
            er.l<tq.e<? super R>, Object> lVar;
            Throwable th4;
            b2 b2Var2;
            a aVar3;
            su.a aVar4;
            Object objE = uq.b.e();
            ?? r15 = this.f208831h;
            try {
                try {
                    if (r15 == 0) {
                        oq.u.b(obj);
                        a aVar5 = new a(this.f208833k, (ju.d2) ((ju.p0) this.f208832j).getCoroutineContext().m(ju.d2.INSTANCE));
                        this.f208834l.h(aVar5);
                        aVar = this.f208834l.mutex;
                        er.l<tq.e<? super R>, Object> lVar2 = this.f208835m;
                        b2 b2Var3 = this.f208834l;
                        this.f208832j = aVar5;
                        this.f208828e = aVar;
                        this.f208829f = lVar2;
                        this.f208830g = b2Var3;
                        this.f208831h = 1;
                        if (aVar.h(null, this) != objE) {
                            aVar2 = aVar5;
                            b2Var = b2Var3;
                            lVar = lVar2;
                        }
                        return objE;
                    }
                    if (r15 != 1) {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b2Var2 = (b2) this.f208829f;
                        aVar4 = (su.a) this.f208828e;
                        aVar3 = (a) this.f208832j;
                        try {
                            oq.u.b(obj);
                            androidx.camera.view.i.a(b2Var2.currentMutator, aVar3, null);
                            aVar4.r(null);
                            return obj;
                        } catch (Throwable th5) {
                            th4 = th5;
                            androidx.camera.view.i.a(b2Var2.currentMutator, aVar3, null);
                            throw th4;
                        }
                    }
                    b2Var = (b2) this.f208830g;
                    lVar = (er.l) this.f208829f;
                    su.a aVar6 = (su.a) this.f208828e;
                    aVar2 = (a) this.f208832j;
                    oq.u.b(obj);
                    aVar = aVar6;
                    this.f208832j = aVar2;
                    this.f208828e = aVar;
                    this.f208829f = b2Var;
                    this.f208830g = null;
                    this.f208831h = 2;
                    Object objB = lVar.b(this);
                    if (objB != objE) {
                        b2Var2 = b2Var;
                        aVar4 = aVar;
                        obj = objB;
                        aVar3 = aVar2;
                        androidx.camera.view.i.a(b2Var2.currentMutator, aVar3, null);
                        aVar4.r(null);
                        return obj;
                    }
                    return objE;
                } catch (Throwable th6) {
                    th4 = th6;
                    b2Var2 = b2Var;
                    aVar3 = aVar2;
                    androidx.camera.view.i.a(b2Var2.currentMutator, aVar3, null);
                    throw th4;
                }
            } catch (Throwable th7) {
                r15.r(null);
                throw th7;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super R> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f208833k, this.f208834l, this.f208835m, eVar);
            bVar.f208832j = obj;
            return bVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class c<R> extends vq.k implements er.p<ju.p0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f208836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f208837f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f208838g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f208839h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f208840j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f208841k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ z1 f208842l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ b2 f208843m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ er.p<T, tq.e<? super R>, Object> f208844n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ T f208845p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(z1 z1Var, b2 b2Var, er.p<? super T, ? super tq.e<? super R>, ? extends Object> pVar, T t15, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f208842l = z1Var;
            this.f208843m = b2Var;
            this.f208844n = pVar;
            this.f208845p = t15;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, su.a] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            su.a aVar;
            er.p pVar;
            a aVar2;
            b2 b2Var;
            Object obj2;
            Throwable th4;
            b2 b2Var2;
            a aVar3;
            su.a aVar4;
            Object objE = uq.b.e();
            ?? r15 = this.f208840j;
            try {
                try {
                    if (r15 == 0) {
                        oq.u.b(obj);
                        a aVar5 = new a(this.f208842l, (ju.d2) ((ju.p0) this.f208841k).getCoroutineContext().m(ju.d2.INSTANCE));
                        this.f208843m.h(aVar5);
                        aVar = this.f208843m.mutex;
                        pVar = this.f208844n;
                        Object obj3 = this.f208845p;
                        b2 b2Var3 = this.f208843m;
                        this.f208841k = aVar5;
                        this.f208836e = aVar;
                        this.f208837f = pVar;
                        this.f208838g = obj3;
                        this.f208839h = b2Var3;
                        this.f208840j = 1;
                        if (aVar.h(null, this) != objE) {
                            aVar2 = aVar5;
                            b2Var = b2Var3;
                            obj2 = obj3;
                        }
                        return objE;
                    }
                    if (r15 != 1) {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b2Var2 = (b2) this.f208837f;
                        aVar4 = (su.a) this.f208836e;
                        aVar3 = (a) this.f208841k;
                        try {
                            oq.u.b(obj);
                            androidx.camera.view.i.a(b2Var2.currentMutator, aVar3, null);
                            aVar4.r(null);
                            return obj;
                        } catch (Throwable th5) {
                            th4 = th5;
                            androidx.camera.view.i.a(b2Var2.currentMutator, aVar3, null);
                            throw th4;
                        }
                    }
                    b2Var = (b2) this.f208839h;
                    obj2 = this.f208838g;
                    pVar = (er.p) this.f208837f;
                    su.a aVar6 = (su.a) this.f208836e;
                    aVar2 = (a) this.f208841k;
                    oq.u.b(obj);
                    aVar = aVar6;
                    this.f208841k = aVar2;
                    this.f208836e = aVar;
                    this.f208837f = b2Var;
                    this.f208838g = null;
                    this.f208839h = null;
                    this.f208840j = 2;
                    Object objB = pVar.B(obj2, this);
                    if (objB != objE) {
                        b2Var2 = b2Var;
                        aVar4 = aVar;
                        obj = objB;
                        aVar3 = aVar2;
                        androidx.camera.view.i.a(b2Var2.currentMutator, aVar3, null);
                        aVar4.r(null);
                        return obj;
                    }
                    return objE;
                } catch (Throwable th6) {
                    th4 = th6;
                    b2Var2 = b2Var;
                    aVar3 = aVar2;
                    androidx.camera.view.i.a(b2Var2.currentMutator, aVar3, null);
                    throw th4;
                }
            } catch (Throwable th7) {
                r15.r(null);
                throw th7;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super R> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f208842l, this.f208843m, this.f208844n, this.f208845p, eVar);
            cVar.f208841k = obj;
            return cVar;
        }
    }

    public static /* synthetic */ Object e(b2 b2Var, z1 z1Var, er.l lVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z1Var = z1.Default;
        }
        return b2Var.d(z1Var, lVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(a mutator) {
        a aVar;
        do {
            aVar = this.currentMutator.get();
            if (aVar != null && !mutator.a(aVar)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!androidx.camera.view.i.a(this.currentMutator, aVar, mutator));
        if (aVar != null) {
            aVar.b();
        }
    }

    public final <R> Object d(z1 z1Var, er.l<? super tq.e<? super R>, ? extends Object> lVar, tq.e<? super R> eVar) {
        return ju.q0.e(new b(z1Var, this, lVar, null), eVar);
    }

    public final <T, R> Object f(T t15, z1 z1Var, er.p<? super T, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super R> eVar) {
        return ju.q0.e(new c(z1Var, this, pVar, t15, null), eVar);
    }

    public final boolean g() {
        return su.a.C4762a.b(this.mutex, null, 1, null);
    }

    public final void i() {
        su.a.C4762a.c(this.mutex, null, 1, null);
    }
}
