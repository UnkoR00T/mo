package i53;

import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import w53.BiometricLoginNavResultData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B9\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0096\u0001¢\u0006\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00109\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u00108R&\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030:8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010F\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020H0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010'¨\u0006O"}, d2 = {"Li53/o;", "Ll00/g;", "Li53/b;", "Li53/a;", "Li53/c;", "", "Lnx/b;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Loz/q;", "ownerViewLifecycleManager", "Lib4/c;", "genericDomainErrorMapper", "Lj53/a;", "biometricLoginMapper", "Lg04/g;", "checkBiometricStatusUseCase", "snackBarManagerStateHolder", "<init>", "(Lyy/a;Loz/q;Lib4/c;Lj53/a;Lg04/g;Li70/n;)V", "state", "Li53/c$a$a;", "p9", "(Li53/b;)Li53/c$a$a;", "Lw53/a;", "resultData", "Loq/i0;", "q9", "(Lw53/a;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "b", "Loz/q;", "c", "Lib4/c;", "d", "Lj53/a;", "e", "Lg04/g;", "f", "Li70/n;", "Li53/b$a;", "g", "Li53/b$a;", "initialState", "h", "o9", "()Loz/q;", "lifecycleConnector", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Li53/a$d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Li53/c$a;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "Li70/p;", "snackBarVisibilityState", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<i53.b, i53.a> implements i53.c, zx.b, nx.b, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j53.a biometricLoginMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g04.g checkBiometricStatusUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i53.b.Initialized initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oz.q lifecycleConnector;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<i53.b, i53.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i53.a.d> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<i53.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<i53.c.a.Initialized> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f89619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f89620b;

        /* JADX INFO: renamed from: i53.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2121a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f89621a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f89622b;

            /* JADX INFO: renamed from: i53.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2122a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f89623d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f89624e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f89625f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f89627h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f89628j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f89629k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f89630l;

                public C2122a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f89623d = obj;
                    this.f89624e |= PKIFailureInfo.systemUnavail;
                    return C2121a.this.F(null, this);
                }
            }

            public C2121a(mu.h hVar, o oVar) {
                this.f89621a = hVar;
                this.f89622b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2122a c2122a;
                if (eVar instanceof C2122a) {
                    c2122a = (C2122a) eVar;
                    int i15 = c2122a.f89624e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2122a.f89624e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2122a = new C2122a(eVar);
                    }
                } else {
                    c2122a = new C2122a(eVar);
                }
                Object obj2 = c2122a.f89623d;
                Object objE = uq.b.e();
                int i16 = c2122a.f89624e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f89621a;
                    i53.c.a.Initialized initializedP9 = this.f89622b.p9((i53.b) obj);
                    c2122a.f89625f = vq.j.a(obj);
                    c2122a.f89627h = vq.j.a(c2122a);
                    c2122a.f89628j = vq.j.a(obj);
                    c2122a.f89629k = vq.j.a(hVar);
                    c2122a.f89630l = 0;
                    c2122a.f89624e = 1;
                    if (hVar.F(initializedP9, c2122a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, o oVar) {
            this.f89619a = gVar;
            this.f89620b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i53.c.a.Initialized> hVar, tq.e eVar) {
            Object objA = this.f89619a.a(new C2121a(hVar, this.f89620b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/c;", "visibility", "Li53/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/c;Li53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<nx.c, i53.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89632f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.c cVar = (nx.c) this.f89632f;
            uq.b.e();
            if (this.f89631e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (cVar == nx.c.FOREGROUND) {
                o.this.d9(i53.a.c.f89578a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.c cVar, i53.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = o.this.new b(eVar);
            bVar2.f89632f = cVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li53/a$a;", "<unused var>", "Li53/b;", "Loq/i0;", "<anonymous>", "(Li53/a$a;Li53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<i53.a.C2117a, i53.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89634e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89634e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                i53.a.d.C2118a c2118a = i53.a.d.C2118a.f89579a;
                this.f89634e = 1;
                if (oVar.F(c2118a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i53.a.C2117a c2117a, i53.b bVar, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li53/a$b;", "action", "Li53/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Li53/a$b;Li53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<i53.a.Error, i53.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89637f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i53.a.Error error = (i53.a.Error) this.f89637f;
            Object objE = uq.b.e();
            int i15 = this.f89636e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i53.a.d> bVarY1 = o.this.Y1();
                i53.a.d.Error error2 = new i53.a.d.Error(o.this.genericDomainErrorMapper.b(ib4.c.Params.INSTANCE.b(error.getDomainError())));
                this.f89637f = vq.j.a(error);
                this.f89636e = 1;
                if (bVarY1.F(error2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i53.a.Error error, i53.b bVar, tq.e<? super i0> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f89637f = error;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li53/b$a;", "it", "Loq/i0;", "<anonymous>", "(Li53/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<i53.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89639e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f89639e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            o.this.d9(i53.a.c.f89578a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(i53.b.Initialized initialized, tq.e<? super i0> eVar) {
            return ((e) v(initialized, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return o.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li53/a$e;", "<unused var>", "Li53/b$a;", "Loq/i0;", "<anonymous>", "(Li53/a$e;Li53/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<i53.a.e, i53.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89641e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89641e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                i53.a.d.b bVar = i53.a.d.b.f89580a;
                this.f89641e = 1;
                if (oVar.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i53.a.e eVar, i53.b.Initialized initialized, tq.e<? super i0> eVar2) {
            return o.this.new f(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li53/a$g;", "<unused var>", "Li53/b$a;", "Loq/i0;", "<anonymous>", "(Li53/a$g;Li53/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<i53.a.g, i53.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89643e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89643e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                i53.a.d.e eVar = i53.a.d.e.f89583a;
                this.f89643e = 1;
                if (oVar.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i53.a.g gVar, i53.b.Initialized initialized, tq.e<? super i0> eVar) {
            return o.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li53/a$f;", "<unused var>", "Li53/b$a;", "Loq/i0;", "<anonymous>", "(Li53/a$f;Li53/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<i53.a.f, i53.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89645e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89645e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                i53.a.d.C2119d c2119d = i53.a.d.C2119d.f89582a;
                this.f89645e = 1;
                if (oVar.F(c2119d, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i53.a.f fVar, i53.b.Initialized initialized, tq.e<? super i0> eVar) {
            return o.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Li53/a$c;", "<unused var>", "Lk10/c0;", "Li53/b$a;", "state", "Lk10/l;", "Li53/b;", "<anonymous>", "(Li53/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<i53.a.c, c0<i53.b.Initialized>, tq.e<? super k10.l<? extends i53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89648f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i53.b.Initialized O(e04.e eVar, i53.b.Initialized initialized) {
            return initialized.a(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f89648f;
            Object objE = uq.b.e();
            int i15 = this.f89647e;
            if (i15 == 0) {
                u.b(obj);
                g04.g gVar = o.this.checkBiometricStatusUseCase;
                g04.g.Params params = new g04.g.Params(true);
                this.f89648f = c0Var;
                this.f89647e = 1;
                obj = gVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            o oVar = o.this;
            if (iVar instanceof dx.i.Left) {
                oVar.d9(new i53.a.Error((dx.b) ((dx.i.Left) iVar).b()));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final e04.e eVar = (e04.e) ((dx.i.Right) iVar).b();
            if (!(eVar instanceof e04.e.a.System)) {
                return c0Var.b(new er.l() { // from class: i53.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o.i.O(eVar, (b.Initialized) obj2);
                    }
                });
            }
            oVar.d9(new i53.a.Error(((e04.e.a.System) eVar).getDomainError()));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i53.a.c cVar, c0<i53.b.Initialized> c0Var, tq.e<? super k10.l<? extends i53.b>> eVar) {
            i iVar = o.this.new i(eVar);
            iVar.f89648f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, oz.q qVar, ib4.c cVar, j53.a aVar2, g04.g gVar, i70.n nVar) {
        this.ownerViewLifecycleManager = qVar;
        this.genericDomainErrorMapper = cVar;
        this.biometricLoginMapper = aVar2;
        this.checkBiometricStatusUseCase = gVar;
        this.snackBarManagerStateHolder = nVar;
        i53.b.Initialized initialized = new i53.b.Initialized(null, 1, null);
        this.initialState = initialized;
        this.lifecycleConnector = qVar;
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: i53.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9(this.f89606a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), p9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i53.c.a.Initialized p9(i53.b state) {
        return this.biometricLoginMapper.b(new j53.a.Params(state, b9(i53.a.C2117a.f89576a), b9(i53.a.g.f89586a), b9(i53.a.e.f89584a), b9(i53.a.f.f89585a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final o oVar, v vVar) {
        vVar.c(q0.c(i53.b.class), new er.l() { // from class: i53.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.t9(this.f89607a, (z) obj);
            }
        });
        vVar.c(q0.c(i53.b.Initialized.class), new er.l() { // from class: i53.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.u9(this.f89608a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(o oVar, z zVar) {
        k10.k.s(zVar, oVar.G2(), null, oVar.new b(null), 2, null);
        c cVar = oVar.new c(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(i53.a.C2117a.class), oVar2, cVar);
        zVar.x(q0.c(i53.a.Error.class), oVar2, oVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(o oVar, z zVar) {
        zVar.C(oVar.new e(null));
        f fVar = oVar.new f(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(i53.a.e.class), oVar2, fVar);
        zVar.x(q0.c(i53.a.g.class), oVar2, oVar.new g(null));
        zVar.x(q0.c(i53.a.f.class), oVar2, oVar.new h(null));
        zVar.v(q0.c(i53.a.c.class), oVar2, oVar.new i(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<i53.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<i53.b, i53.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i53.c.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(i53.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // i53.c
    /* JADX INFO: renamed from: o9, reason: from getter and merged with bridge method [inline-methods] */
    public oz.q a() {
        return this.lifecycleConnector;
    }

    public final void q9(BiometricLoginNavResultData resultData) {
        this.snackBarManagerStateHolder.y(new p50.a.Default(resultData.getSnackBarLabel(), false, null, 6, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
