package u0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lu0/g1;", "", "<init>", "()V", "Lu0/g1$a;", "mutator", "Loq/i0;", "f", "(Lu0/g1$a;)V", "R", "Lu0/e1;", "priority", "Lkotlin/Function1;", "Ltq/e;", "block", "d", "(Lu0/e1;Ler/l;Ltq/e;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/animation/core/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lsu/a;", "b", "Lsu/a;", "mutex", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = su.g.b(false, 1, null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lu0/g1$a;", "", "Lu0/e1;", "priority", "Lju/d2;", "job", "<init>", "(Lu0/e1;Lju/d2;)V", "other", "", "a", "(Lu0/g1$a;)Z", "Loq/i0;", "b", "()V", "Lu0/e1;", "getPriority", "()Lu0/e1;", "Lju/d2;", "getJob", "()Lju/d2;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final e1 priority;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ju.d2 job;

        public a(e1 e1Var, ju.d2 d2Var) {
            this.priority = e1Var;
            this.job = d2Var;
        }

        public final boolean a(a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            this.job.u(new f1());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class b<R> extends vq.k implements er.p<ju.p0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193633e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193634f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f193635g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f193636h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f193637j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ e1 f193638k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ g1 f193639l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super R>, Object> f193640m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(e1 e1Var, g1 g1Var, er.l<? super tq.e<? super R>, ? extends Object> lVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f193638k = e1Var;
            this.f193639l = g1Var;
            this.f193640m = lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, su.a] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            su.a aVar;
            a aVar2;
            g1 g1Var;
            er.l<tq.e<? super R>, Object> lVar;
            Throwable th4;
            g1 g1Var2;
            a aVar3;
            su.a aVar4;
            Object objE = uq.b.e();
            ?? r15 = this.f193636h;
            try {
                try {
                    if (r15 == 0) {
                        oq.u.b(obj);
                        a aVar5 = new a(this.f193638k, (ju.d2) ((ju.p0) this.f193637j).getCoroutineContext().m(ju.d2.INSTANCE));
                        this.f193639l.f(aVar5);
                        aVar = this.f193639l.mutex;
                        er.l<tq.e<? super R>, Object> lVar2 = this.f193640m;
                        g1 g1Var3 = this.f193639l;
                        this.f193637j = aVar5;
                        this.f193633e = aVar;
                        this.f193634f = lVar2;
                        this.f193635g = g1Var3;
                        this.f193636h = 1;
                        if (aVar.h(null, this) != objE) {
                            aVar2 = aVar5;
                            g1Var = g1Var3;
                            lVar = lVar2;
                        }
                        return objE;
                    }
                    if (r15 != 1) {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g1Var2 = (g1) this.f193634f;
                        aVar4 = (su.a) this.f193633e;
                        aVar3 = (a) this.f193637j;
                        try {
                            oq.u.b(obj);
                            androidx.camera.view.i.a(g1Var2.currentMutator, aVar3, null);
                            aVar4.r(null);
                            return obj;
                        } catch (Throwable th5) {
                            th4 = th5;
                            androidx.camera.view.i.a(g1Var2.currentMutator, aVar3, null);
                            throw th4;
                        }
                    }
                    g1Var = (g1) this.f193635g;
                    lVar = (er.l) this.f193634f;
                    su.a aVar6 = (su.a) this.f193633e;
                    aVar2 = (a) this.f193637j;
                    oq.u.b(obj);
                    aVar = aVar6;
                    this.f193637j = aVar2;
                    this.f193633e = aVar;
                    this.f193634f = g1Var;
                    this.f193635g = null;
                    this.f193636h = 2;
                    Object objB = lVar.b(this);
                    if (objB != objE) {
                        g1Var2 = g1Var;
                        aVar4 = aVar;
                        obj = objB;
                        aVar3 = aVar2;
                        androidx.camera.view.i.a(g1Var2.currentMutator, aVar3, null);
                        aVar4.r(null);
                        return obj;
                    }
                    return objE;
                } catch (Throwable th6) {
                    th4 = th6;
                    g1Var2 = g1Var;
                    aVar3 = aVar2;
                    androidx.camera.view.i.a(g1Var2.currentMutator, aVar3, null);
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
            b bVar = new b(this.f193638k, this.f193639l, this.f193640m, eVar);
            bVar.f193637j = obj;
            return bVar;
        }
    }

    public static /* synthetic */ Object e(g1 g1Var, e1 e1Var, er.l lVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            e1Var = e1.Default;
        }
        return g1Var.d(e1Var, lVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(a mutator) {
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

    public final <R> Object d(e1 e1Var, er.l<? super tq.e<? super R>, ? extends Object> lVar, tq.e<? super R> eVar) {
        return ju.q0.e(new b(e1Var, this, lVar, null), eVar);
    }
}
