package ja;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "T", "Lmu/g;", "Lja/n0;", "Lju/p0;", "scope", "a", "(Lmu/g;Lju/p0;)Lmu/g;", "Lja/a;", "tracker", "b", "(Lmu/g;Lju/p0;Lja/a;)Lmu/g;", "paging-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements mu.g<n0<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f100607a;

        /* JADX INFO: renamed from: ja.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C2368a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f100608a;

            /* JADX INFO: renamed from: ja.d$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C2369a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f100609d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f100610e;

                public C2369a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f100609d = obj;
                    this.f100610e |= PKIFailureInfo.systemUnavail;
                    return C2368a.this.F(null, this);
                }
            }

            public C2368a(mu.h hVar) {
                this.f100608a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2369a c2369a;
                if (eVar instanceof C2369a) {
                    c2369a = (C2369a) eVar;
                    int i15 = c2369a.f100610e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2369a.f100610e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2369a = new C2369a(eVar);
                    }
                } else {
                    c2369a = new C2369a(eVar);
                }
                Object obj2 = c2369a.f100609d;
                Object objE = uq.b.e();
                int i16 = c2369a.f100610e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f100608a;
                    n0<T> n0VarB = ((a0) obj).b();
                    c2369a.f100610e = 1;
                    if (hVar.F(n0VarB, c2369a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar) {
            this.f100607a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h hVar, tq.e eVar) {
            Object objA = this.f100607a.a(new C2368a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lmu/h;", "it", "Loq/i0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class b<T> extends vq.k implements er.q<mu.h<? super a0<T>>, n0<T>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f100613f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f100614g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ju.p0 f100615h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tq.e eVar, ju.p0 p0Var, ja.a aVar) {
            super(3, eVar);
            this.f100615h = p0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f100612e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.h hVar = (mu.h) this.f100613f;
                a0 a0Var = new a0(this.f100615h, (n0) this.f100614g, null);
                this.f100612e = 1;
                if (hVar.F(a0Var, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mu.h<? super a0<T>> hVar, n0<T> n0Var, tq.e<? super oq.i0> eVar) {
            b bVar = new b(eVar, this.f100615h, null);
            bVar.f100613f = hVar;
            bVar.f100614g = n0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lja/a0;", "prev", "next", "<anonymous>", "(Lja/a0;Lja/a0;)Lja/a0;"}, k = 3, mv = {2, 0, 0})
    static final class c<T> extends vq.k implements er.q<a0<T>, a0<T>, tq.e<? super a0<T>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100617f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f100618g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f100616e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0 a0Var = (a0) this.f100617f;
                oq.u.b(obj);
                return a0Var;
            }
            oq.u.b(obj);
            a0 a0Var2 = (a0) this.f100617f;
            a0 a0Var3 = (a0) this.f100618g;
            this.f100617f = a0Var3;
            this.f100616e = 1;
            return a0Var2.d(this) == objE ? objE : a0Var3;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a0<T> a0Var, a0<T> a0Var2, tq.e<? super a0<T>> eVar) {
            c cVar = new c(eVar);
            cVar.f100617f = a0Var;
            cVar.f100618g = a0Var2;
            return cVar.J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ja.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lmu/h;", "Lja/n0;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 0, 0})
    static final class C2370d<T> extends vq.k implements er.p<mu.h<? super n0<T>>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100619e;

        C2370d(ja.a aVar, tq.e<? super C2370d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            int i15 = this.f100619e;
            if (i15 != 0 && i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super n0<T>> hVar, tq.e<? super oq.i0> eVar) {
            return ((C2370d) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new C2370d(null, eVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "Lmu/h;", "Lja/n0;", "", "it", "Loq/i0;", "<anonymous>", "(Lmu/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    static final class e<T> extends vq.k implements er.q<mu.h<? super n0<T>>, Throwable, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100620e;

        e(ja.a aVar, tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            int i15 = this.f100620e;
            if (i15 != 0 && i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mu.h<? super n0<T>> hVar, Throwable th4, tq.e<? super oq.i0> eVar) {
            return new e(null, eVar).J(oq.i0.f148189a);
        }
    }

    public static final <T> mu.g<n0<T>> a(mu.g<n0<T>> gVar, ju.p0 p0Var) {
        return b(gVar, p0Var, null);
    }

    public static final <T> mu.g<n0<T>> b(mu.g<n0<T>> gVar, ju.p0 p0Var, ja.a aVar) {
        return mu.i.a0(mu.i.R(mu.i.U(new a(n.b(n.d(gVar, new b(null, p0Var, aVar)), new c(null))), new C2370d(aVar, null)), new e(aVar, null)), p0Var, mu.l0.INSTANCE.d(), 1);
    }
}
