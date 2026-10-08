package m;

import ju.a0;
import ju.d2;
import ju.g2;
import ju.p0;
import ju.q0;
import ju.r0;
import ju.w0;
import k.d0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00020\r2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0000¢\u0006\u0004\b\u0013\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lm/p;", "", "<init>", "()V", "T", "Lju/p0;", "scope", "Lkotlin/Function2;", "Ltq/e;", "block", "Lju/w0;", "e", "(Lju/p0;Ler/p;)Lju/w0;", "Lk/d0;", "g", "(Lk/d0;Ler/p;Ltq/e;)Ljava/lang/Object;", "d", "(Ltq/e;)Ljava/lang/Object;", "action", "h", "Lsu/a;", "a", "Lsu/a;", "mutex", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = su.g.b(false, 1, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f121882e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f121884g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121882e = obj;
            this.f121884g |= PKIFailureInfo.systemUnavail;
            return p.this.d(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class b<T> extends vq.k implements er.p<p0, tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f121886f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.p<p0, tq.e<? super T>, Object> f121887g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f121887g = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121885e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            p0 p0Var = (p0) this.f121886f;
            q0.f(p0Var);
            er.p<p0, tq.e<? super T>, Object> pVar = this.f121887g;
            this.f121885e = 1;
            Object objB = pVar.B(p0Var, this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super T> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f121887g, eVar);
            bVar.f121886f = obj;
            return bVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f121889e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f121891g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121889e = obj;
            this.f121891g |= PKIFailureInfo.systemUnavail;
            return p.this.g(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class d<T> extends vq.k implements er.p<p0, tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f121892e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f121893f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f121894g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f121895h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ er.p<d0, tq.e<? super w0<? extends T>>, Object> f121897k;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lk/d0;", "token", "Lju/w0;", "<anonymous>", "(Lk/d0;)Lju/w0;"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<d0, tq.e<? super w0<? extends T>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f121898e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f121899f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.p<d0, tq.e<? super w0<? extends T>>, Object> f121900g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(er.p<? super d0, ? super tq.e<? super w0<? extends T>>, ? extends Object> pVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f121900g = pVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f121898e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                d0 d0Var = (d0) this.f121899f;
                er.p<d0, tq.e<? super w0<? extends T>>, Object> pVar = this.f121900g;
                this.f121898e = 1;
                Object objB = pVar.B(d0Var, this);
                return objB == objE ? objE : objB;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(d0 d0Var, tq.e<? super w0<? extends T>> eVar) {
                return ((a) v(d0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f121900g, eVar);
                aVar.f121899f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(er.p<? super d0, ? super tq.e<? super w0<? extends T>>, ? extends Object> pVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f121897k = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0082 A[RETURN] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var;
            p pVar;
            su.a aVar;
            p0 p0Var2;
            Object objI;
            Object objE = uq.b.e();
            int i15 = this.f121894g;
            if (i15 == 0) {
                u.b(obj);
                p0Var = (p0) this.f121895h;
                pVar = p.this;
                su.a aVar2 = pVar.mutex;
                this.f121895h = p0Var;
                this.f121892e = aVar2;
                this.f121893f = pVar;
                this.f121894g = 1;
                if (k.m.c(aVar2, this) != objE) {
                    aVar = aVar2;
                }
                return objE;
            }
            if (i15 == 1) {
                pVar = (p) this.f121893f;
                aVar = (su.a) this.f121892e;
                p0 p0Var3 = (p0) this.f121895h;
                u.b(obj);
                p0Var = p0Var3;
            } else {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                p0Var2 = (p0) this.f121895h;
                u.b(obj);
            }
            q0.f(p0Var2);
            this.f121895h = null;
            this.f121894g = 3;
            objI = ((w0) obj).I(this);
            if (objI != objE) {
                return objE;
            }
            return objI;
            k.l lVar = new k.l(aVar);
            a aVar3 = new a(this.f121897k, null);
            this.f121895h = p0Var;
            this.f121892e = null;
            this.f121893f = null;
            this.f121894g = 2;
            Object objG = pVar.g(lVar, aVar3, this);
            if (objG != objE) {
                p0Var2 = p0Var;
                obj = objG;
                q0.f(p0Var2);
                this.f121895h = null;
                this.f121894g = 3;
                objI = ((w0) obj).I(this);
                if (objI != objE) {
                    return objI;
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super T> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = p.this.new d(this.f121897k, eVar);
            dVar.f121895h = obj;
            return dVar;
        }
    }

    private final <T> w0<T> e(p0 scope, er.p<? super p0, ? super tq.e<? super T>, ? extends Object> block) {
        final a0 a0VarA = g2.a((d2) scope.getCoroutineContext().m(d2.INSTANCE));
        w0<T> w0VarA = ju.i.a(scope, scope.getCoroutineContext().n0(a0VarA), r0.UNDISPATCHED, new b(block, null));
        w0VarA.C0(new er.l() { // from class: m.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.f(a0VarA, (Throwable) obj);
            }
        });
        return w0VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(a0 a0Var, Throwable th4) {
        a0Var.y();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T> Object g(d0 d0Var, er.p<? super d0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f121891g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f121891g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f121889e;
        Object objE = uq.b.e();
        int i16 = cVar.f121891g;
        try {
            if (i16 == 0) {
                u.b(objB);
                cVar.f121888d = d0Var;
                cVar.f121891g = 1;
                objB = pVar.B(d0Var, cVar);
                if (objB == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d0Var = (d0) cVar.f121888d;
                u.b(objB);
            }
            d0Var.b();
            return objB;
        } catch (Throwable th4) {
            d0Var.b();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(tq.e<? super d0> eVar) throws Throwable {
        a aVar;
        su.a aVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f121884g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f121884g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f121882e;
        Object objE = uq.b.e();
        int i16 = aVar.f121884g;
        if (i16 == 0) {
            u.b(obj);
            su.a aVar3 = this.mutex;
            aVar.f121881d = aVar3;
            aVar.f121884g = 1;
            if (su.a.C4762a.a(aVar3, null, aVar, 1, null) == objE) {
                return objE;
            }
            aVar2 = aVar3;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (su.a) aVar.f121881d;
            u.b(obj);
        }
        return new k.l(aVar2);
    }

    public final <T> w0<T> h(p0 scope, er.p<? super d0, ? super tq.e<? super w0<? extends T>>, ? extends Object> action) {
        return e(scope, new d(action, null));
    }
}
