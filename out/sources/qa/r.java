package qa;

import ju.p0;
import ju.r0;
import ju.w1;
import ju.x;
import ju.z;
import oq.i0;
import oq.t;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lkotlin/Function2;", "Lju/p0;", "Ltq/e;", "", "block", "a", "(Ler/p;)Ljava/lang/Object;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class a<T> extends vq.k implements er.p<p0, tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f165557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.p<p0, tq.e<? super T>, Object> f165558g;

        /* JADX INFO: renamed from: qa.r$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C4131a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f165559e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f165560f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ x<T> f165561g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ er.p<p0, tq.e<? super T>, Object> f165562h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C4131a(x<T> xVar, er.p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super C4131a> eVar) {
                super(2, eVar);
                this.f165561g = xVar;
                this.f165562h = pVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                x<T> xVar;
                Object objB;
                Object objE = uq.b.e();
                int i15 = this.f165559e;
                if (i15 == 0) {
                    u.b(obj);
                    p0 p0Var = (p0) this.f165560f;
                    x<T> xVar2 = this.f165561g;
                    er.p<p0, tq.e<? super T>, Object> pVar = this.f165562h;
                    try {
                        t.Companion companion = t.INSTANCE;
                        this.f165560f = xVar2;
                        this.f165559e = 1;
                        obj = pVar.B(p0Var, this);
                        if (obj == objE) {
                            return objE;
                        }
                        xVar = xVar2;
                    } catch (Throwable th4) {
                        th = th4;
                        xVar = xVar2;
                        t.Companion companion2 = t.INSTANCE;
                        objB = t.b(u.a(th));
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = (x) this.f165560f;
                    try {
                        u.b(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        t.Companion companion3 = t.INSTANCE;
                        objB = t.b(u.a(th));
                    }
                }
                objB = t.b(obj);
                z.d(xVar, objB);
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C4131a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C4131a c4131a = new C4131a(this.f165561g, this.f165562h, eVar);
                c4131a.f165560f = obj;
                return c4131a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        static final class b extends vq.k implements er.p<p0, tq.e<? super T>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f165563e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ x<T> f165564f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(x<T> xVar, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f165564f = xVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f165563e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                x<T> xVar = this.f165564f;
                this.f165563e = 1;
                Object objI = xVar.I(this);
                return objI == objE ? objE : objI;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super T> eVar) {
                return ((b) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new b(this.f165564f, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f165558g = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f165556e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            tq.f fVar = (tq.f) ((p0) this.f165557f).getCoroutineContext().m(tq.f.INSTANCE);
            x xVarC = z.c(null, 1, null);
            ju.i.c(w1.f105795a, fVar, r0.UNDISPATCHED, new C4131a(xVarC, this.f165558g, null));
            while (!xVarC.r()) {
                try {
                    return ju.i.e(fVar, new b(xVarC, null));
                } catch (InterruptedException unused) {
                }
            }
            return xVarC.C();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super T> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f165558g, eVar);
            aVar.f165557f = obj;
            return aVar;
        }
    }

    public static final <T> T a(er.p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar) {
        Thread.interrupted();
        return (T) ju.j.b(null, new a(pVar, null), 1, null);
    }
}
