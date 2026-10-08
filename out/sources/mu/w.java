package mu;

import java.util.NoSuchElementException;
import ju.g2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003\u001aF\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"T", "Lmu/g;", "b", "(Lmu/g;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "Ltq/e;", "", "", "predicate", "a", "(Lmu/g;Ler/p;Ltq/e;)Ljava/lang/Object;", "d", "c", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"mu/w$a", "Lmu/h;", "value", "Loq/i0;", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements mu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fr.p0 f128444a;

        public a(fr.p0 p0Var) {
            this.f128444a = p0Var;
        }

        @Override // mu.h
        public Object F(T t15, tq.e<? super oq.i0> eVar) {
            this.f128444a.f66410a = t15;
            throw new p086nu.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"mu/w$b", "Lmu/h;", "value", "Loq/i0;", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements mu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.p f128445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fr.p0 f128446b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f128447d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f128448e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f128449f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f128451h;

            public a(tq.e eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128448e = obj;
                this.f128449f |= PKIFailureInfo.systemUnavail;
                return b.this.F(null, this);
            }
        }

        public b(er.p pVar, fr.p0 p0Var) {
            this.f128445a = pVar;
            this.f128446b = p0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // mu.h
        public Object F(T t15, tq.e<? super oq.i0> eVar) throws Throwable {
            a aVar;
            b<T> bVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f128449f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f128449f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objB = aVar.f128448e;
            Object objE = uq.b.e();
            int i16 = aVar.f128449f;
            if (i16 == 0) {
                oq.u.b(objB);
                er.p pVar = this.f128445a;
                aVar.f128447d = this;
                aVar.f128451h = t15;
                aVar.f128449f = 1;
                fr.r.c(6);
                objB = pVar.B(t15, aVar);
                fr.r.c(7);
                if (objB == objE) {
                    return objE;
                }
                bVar = this;
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t15 = (T) aVar.f128451h;
                bVar = (b) aVar.f128447d;
                oq.u.b(objB);
            }
            if (!((Boolean) objB).booleanValue()) {
                return oq.i0.f148189a;
            }
            bVar.f128446b.f66410a = t15;
            throw new p086nu.a(bVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f128453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f128455g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128454f = obj;
            this.f128455g |= PKIFailureInfo.systemUnavail;
            return i.z(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f128457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f128459g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128458f = obj;
            this.f128459g |= PKIFailureInfo.systemUnavail;
            return i.y(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"mu/w$e", "Lmu/h;", "value", "Loq/i0;", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements mu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fr.p0 f128460a;

        public e(fr.p0 p0Var) {
            this.f128460a = p0Var;
        }

        @Override // mu.h
        public Object F(T t15, tq.e<? super oq.i0> eVar) {
            this.f128460a.f66410a = t15;
            throw new p086nu.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"mu/w$f", "Lmu/h;", "value", "Loq/i0;", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements mu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.p f128461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fr.p0 f128462b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f128463d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f128464e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f128465f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f128467h;

            public a(tq.e eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128464e = obj;
                this.f128465f |= PKIFailureInfo.systemUnavail;
                return f.this.F(null, this);
            }
        }

        public f(er.p pVar, fr.p0 p0Var) {
            this.f128461a = pVar;
            this.f128462b = p0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // mu.h
        public Object F(T t15, tq.e<? super oq.i0> eVar) throws Throwable {
            a aVar;
            f<T> fVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f128465f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f128465f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objB = aVar.f128464e;
            Object objE = uq.b.e();
            int i16 = aVar.f128465f;
            if (i16 == 0) {
                oq.u.b(objB);
                er.p pVar = this.f128461a;
                aVar.f128463d = this;
                aVar.f128467h = t15;
                aVar.f128465f = 1;
                fr.r.c(6);
                objB = pVar.B(t15, aVar);
                fr.r.c(7);
                if (objB == objE) {
                    return objE;
                }
                fVar = this;
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t15 = (T) aVar.f128467h;
                fVar = (f) aVar.f128463d;
                oq.u.b(objB);
            }
            if (!((Boolean) objB).booleanValue()) {
                return oq.i0.f148189a;
            }
            fVar.f128462b.f66410a = t15;
            throw new p086nu.a(fVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f128469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f128471g;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128470f = obj;
            this.f128471g |= PKIFailureInfo.systemUnavail;
            return i.B(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f128473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f128475g;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128474f = obj;
            this.f128475g |= PKIFailureInfo.systemUnavail;
            return i.A(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object a(mu.g<? extends T> gVar, er.p<? super T, ? super tq.e<? super Boolean>, ? extends Object> pVar, tq.e<? super T> eVar) throws Throwable {
        d dVar;
        fr.p0 p0Var;
        p086nu.a e15;
        mu.h<? super Object> hVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f128459g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f128459g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f128458f;
        Object objE = uq.b.e();
        int i16 = dVar.f128459g;
        if (i16 == 0) {
            oq.u.b(obj);
            fr.p0 p0Var2 = new fr.p0();
            p0Var2.f66410a = (T) p086nu.u.f138790a;
            mu.h<? super Object> bVar = new b<>(pVar, p0Var2);
            try {
                dVar.f128456d = p0Var2;
                dVar.f128457e = bVar;
                dVar.f128459g = 1;
                if (gVar.a(bVar, dVar) == objE) {
                    return objE;
                }
                p0Var = p0Var2;
            } catch (p086nu.a e16) {
                p0Var = p0Var2;
                e15 = e16;
                hVar = bVar;
                p086nu.q.a(e15, hVar);
                g2.j(dVar.getContext());
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (b) dVar.f128457e;
            p0Var = (fr.p0) dVar.f128456d;
            try {
                oq.u.b(obj);
            } catch (p086nu.a e17) {
                e15 = e17;
                p086nu.q.a(e15, hVar);
                g2.j(dVar.getContext());
            }
        }
        T t15 = p0Var.f66410a;
        if (t15 != p086nu.u.f138790a) {
            return t15;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object b(mu.g<? extends T> gVar, tq.e<? super T> eVar) throws Throwable {
        c cVar;
        fr.p0 p0Var;
        p086nu.a e15;
        mu.h<? super Object> hVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f128455g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f128455g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f128454f;
        Object objE = uq.b.e();
        int i16 = cVar.f128455g;
        if (i16 == 0) {
            oq.u.b(obj);
            fr.p0 p0Var2 = new fr.p0();
            p0Var2.f66410a = (T) p086nu.u.f138790a;
            mu.h<? super Object> aVar = new a<>(p0Var2);
            try {
                cVar.f128452d = p0Var2;
                cVar.f128453e = aVar;
                cVar.f128455g = 1;
                if (gVar.a(aVar, cVar) == objE) {
                    return objE;
                }
                p0Var = p0Var2;
            } catch (p086nu.a e16) {
                p0Var = p0Var2;
                e15 = e16;
                hVar = aVar;
                p086nu.q.a(e15, hVar);
                g2.j(cVar.getContext());
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (a) cVar.f128453e;
            p0Var = (fr.p0) cVar.f128452d;
            try {
                oq.u.b(obj);
            } catch (p086nu.a e17) {
                e15 = e17;
                p086nu.q.a(e15, hVar);
                g2.j(cVar.getContext());
            }
        }
        T t15 = p0Var.f66410a;
        if (t15 != p086nu.u.f138790a) {
            return t15;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object c(mu.g<? extends T> gVar, er.p<? super T, ? super tq.e<? super Boolean>, ? extends Object> pVar, tq.e<? super T> eVar) throws Throwable {
        h hVar;
        fr.p0 p0Var;
        p086nu.a e15;
        mu.h<? super Object> hVar2;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f128475g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f128475g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object obj = hVar.f128474f;
        Object objE = uq.b.e();
        int i16 = hVar.f128475g;
        if (i16 == 0) {
            oq.u.b(obj);
            fr.p0 p0Var2 = new fr.p0();
            mu.h<? super Object> fVar = new f<>(pVar, p0Var2);
            try {
                hVar.f128472d = p0Var2;
                hVar.f128473e = fVar;
                hVar.f128475g = 1;
                if (gVar.a(fVar, hVar) == objE) {
                    return objE;
                }
                p0Var = p0Var2;
            } catch (p086nu.a e16) {
                p0Var = p0Var2;
                e15 = e16;
                hVar2 = fVar;
                p086nu.q.a(e15, hVar2);
                g2.j(hVar.getContext());
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar2 = (f) hVar.f128473e;
            p0Var = (fr.p0) hVar.f128472d;
            try {
                oq.u.b(obj);
            } catch (p086nu.a e17) {
                e15 = e17;
                p086nu.q.a(e15, hVar2);
                g2.j(hVar.getContext());
            }
        }
        return p0Var.f66410a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object d(mu.g<? extends T> gVar, tq.e<? super T> eVar) throws Throwable {
        g gVar2;
        fr.p0 p0Var;
        p086nu.a e15;
        mu.h<? super Object> hVar;
        if (eVar instanceof g) {
            gVar2 = (g) eVar;
            int i15 = gVar2.f128471g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar2.f128471g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar2 = new g(eVar);
            }
        } else {
            gVar2 = new g(eVar);
        }
        Object obj = gVar2.f128470f;
        Object objE = uq.b.e();
        int i16 = gVar2.f128471g;
        if (i16 == 0) {
            oq.u.b(obj);
            fr.p0 p0Var2 = new fr.p0();
            mu.h<? super Object> eVar2 = new e<>(p0Var2);
            try {
                gVar2.f128468d = p0Var2;
                gVar2.f128469e = eVar2;
                gVar2.f128471g = 1;
                if (gVar.a(eVar2, gVar2) == objE) {
                    return objE;
                }
                p0Var = p0Var2;
            } catch (p086nu.a e16) {
                p0Var = p0Var2;
                e15 = e16;
                hVar = eVar2;
                p086nu.q.a(e15, hVar);
                g2.j(gVar2.getContext());
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (e) gVar2.f128469e;
            p0Var = (fr.p0) gVar2.f128468d;
            try {
                oq.u.b(obj);
            } catch (p086nu.a e17) {
                e15 = e17;
                p086nu.q.a(e15, hVar);
                g2.j(gVar2.getContext());
            }
        }
        return p0Var.f66410a;
    }
}
