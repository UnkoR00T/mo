package f3;

import java.util.concurrent.atomic.AtomicReference;
import ju.d2;
import ju.g2;
import ju.p0;
import ju.q0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B1\b\u0002\u0012&\u0010\b\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¢\u0006\u0004\b\t\u0010\nJN\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\b\u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¨\u0006\u0017"}, d2 = {"Lf3/s;", "T", "", "a", "()Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lf3/s$a;", "Landroidx/compose/ui/AtomicReference;", "currentSessionHolder", "b", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "R", "Lkotlin/Function1;", "Lju/p0;", "sessionInitializer", "Lkotlin/Function2;", "Ltq/e;", "session", "d", "(Ljava/util/concurrent/atomic/AtomicReference;Ler/l;Ler/p;Ltq/e;)Ljava/lang/Object;", "c", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "currentSession", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s<T> {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lf3/s$a;", "T", "", "Lju/d2;", "job", "value", "<init>", "(Lju/d2;Ljava/lang/Object;)V", "a", "Lju/d2;", "()Lju/d2;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d2 job;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final T value;

        public a(d2 d2Var, T t15) {
            this.job = d2Var;
            this.value = t15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d2 getJob() {
            return this.job;
        }

        public final T b() {
            return this.value;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class b<R> extends vq.k implements er.p<p0, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f58814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.l<p0, T> f58815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ AtomicReference<a<T>> f58816h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.p<T, tq.e<? super R>, Object> f58817j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.l<? super p0, ? extends T> lVar, AtomicReference<a<T>> atomicReference, er.p<? super T, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f58815g = lVar;
            this.f58816h = atomicReference;
            this.f58817j = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a<T> aVar;
            d2 job;
            a<T> aVar2;
            Object objE = uq.b.e();
            int i15 = this.f58813e;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    p0 p0Var = (p0) this.f58814f;
                    aVar = new a<>(g2.k(p0Var.getCoroutineContext()), this.f58815g.b(p0Var));
                    a<T> andSet = this.f58816h.getAndSet(aVar);
                    if (andSet != null && (job = andSet.getJob()) != null) {
                        this.f58814f = aVar;
                        this.f58813e = 1;
                        if (g2.g(job, this) != objE) {
                        }
                    }
                    return objE;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (a) this.f58814f;
                    try {
                        oq.u.b(obj);
                        androidx.camera.view.i.a(this.f58816h, aVar2, null);
                        return obj;
                    } catch (Throwable th4) {
                        th = th4;
                        androidx.camera.view.i.a(this.f58816h, aVar2, null);
                        throw th;
                    }
                }
                aVar = (a) this.f58814f;
                oq.u.b(obj);
                er.p<T, tq.e<? super R>, Object> pVar = this.f58817j;
                T tB = aVar.b();
                this.f58814f = aVar;
                this.f58813e = 2;
                obj = pVar.B(tB, this);
                if (obj != objE) {
                    aVar2 = aVar;
                    androidx.camera.view.i.a(this.f58816h, aVar2, null);
                    return obj;
                }
                return objE;
            } catch (Throwable th5) {
                th = th5;
                aVar2 = aVar;
                androidx.camera.view.i.a(this.f58816h, aVar2, null);
                throw th;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super R> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f58815g, this.f58816h, this.f58817j, eVar);
            bVar.f58814f = obj;
            return bVar;
        }
    }

    public static <T> AtomicReference<a<T>> a() {
        return b(new AtomicReference(null));
    }

    private static <T> AtomicReference<a<T>> b(AtomicReference<a<T>> atomicReference) {
        return atomicReference;
    }

    public static final T c(AtomicReference<a<T>> atomicReference) {
        a<T> aVar = atomicReference.get();
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public static final <R> Object d(AtomicReference<a<T>> atomicReference, er.l<? super p0, ? extends T> lVar, er.p<? super T, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super R> eVar) {
        return q0.e(new b(lVar, atomicReference, pVar, null), eVar);
    }
}
