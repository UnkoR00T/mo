package sv3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ov3.AddressData;
import ov3.CentralTokens;
import ov3.JWSSigningParams;
import ov3.OwTokens;
import ov3.OwnerAddress;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bk\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\"*\n\u0012\u0006\b\u0001\u0012\u00020\u00020 2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\"0!H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020(2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010X\u001a\b\u0012\u0004\u0012\u00020S0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lsv3/j0;", "Ll00/g;", "Lsv3/g;", "Lsv3/f;", "Lsv3/s;", "Lmv3/c;", "Lyy/a;", "stateMachineFactory", "Lnv3/a;", "backendInteractor", "Lrv3/b;", "fetchNativeCentralTokenUC", "Lrv3/e;", "saveOwnerAddressUC", "Lrv3/g;", "saveTokensUC", "Lvv3/c;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lvv3/b;", "errorMapper", "Lu04/a;", "commonEndpoints", "La14/w;", "openUrlUseCase", "Li70/e;", "globalSnackBarManager", "Lmv3/a;", "setupData", "<init>", "(Lyy/a;Lnv3/a;Lrv3/b;Lrv3/e;Lrv3/g;Lvv3/c;Lhb4/d;Lvv3/b;Lu04/a;La14/w;Li70/e;Lmv3/a;)V", "Lk10/c0;", "Lkotlin/Function0;", "Lk10/l;", "stateChange", "I9", "(Lk10/c0;Ler/a;)Lk10/l;", "Ldx/b;", "domainError", "Lhb4/c;", "G9", "(Ldx/b;)Lhb4/c;", "Lqv3/a;", "errorType", "H9", "(Lqv3/a;)Lhb4/c;", "b", "Lnv3/a;", "c", "Lrv3/b;", "d", "Lrv3/e;", "e", "Lrv3/g;", "f", "Lvv3/c;", "g", "Lhb4/d;", "h", "Lvv3/b;", "j", "Lu04/a;", "k", "La14/w;", "l", "Li70/e;", "m", "Lmv3/a;", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lsv3/s$a;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lxw/b;", "Lmv3/c$a;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 extends l00.g<sv3.g, sv3.f> implements s, mv3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nv3.a backendInteractor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rv3.b fetchNativeCentralTokenUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final rv3.e saveOwnerAddressUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final rv3.g saveTokensUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final vv3.c mapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final vv3.b errorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mv3.a setupData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<sv3.g, sv3.f> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<s.a> state = a9(new a(e9().getState(), this), s.a.b.f184841a);

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<mv3.c.a> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<s.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f184761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f184762b;

        /* JADX INFO: renamed from: sv3.j0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4771a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f184763a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f184764b;

            /* JADX INFO: renamed from: sv3.j0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4772a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f184765d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f184766e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f184767f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f184769h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f184770j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f184771k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f184772l;

                public C4772a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f184765d = obj;
                    this.f184766e |= PKIFailureInfo.systemUnavail;
                    return C4771a.this.F(null, this);
                }
            }

            public C4771a(mu.h hVar, j0 j0Var) {
                this.f184763a = hVar;
                this.f184764b = j0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4772a c4772a;
                if (eVar instanceof C4772a) {
                    c4772a = (C4772a) eVar;
                    int i15 = c4772a.f184766e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4772a.f184766e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4772a = new C4772a(eVar);
                    }
                } else {
                    c4772a = new C4772a(eVar);
                }
                Object obj2 = c4772a.f184765d;
                Object objE = uq.b.e();
                int i16 = c4772a.f184766e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f184763a;
                    s.a aVarB = this.f184764b.mapper.b(new vv3.c.Params((sv3.g) obj));
                    c4772a.f184767f = vq.j.a(obj);
                    c4772a.f184769h = vq.j.a(c4772a);
                    c4772a.f184770j = vq.j.a(obj);
                    c4772a.f184771k = vq.j.a(hVar);
                    c4772a.f184772l = 0;
                    c4772a.f184766e = 1;
                    if (hVar.F(aVarB, c4772a) == objE) {
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

        public a(mu.g gVar, j0 j0Var) {
            this.f184761a = gVar;
            this.f184762b = j0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super s.a> hVar, tq.e eVar) {
            Object objA = this.f184761a.a(new C4771a(hVar, this.f184762b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsv3/c;", "<unused var>", "Lsv3/g;", "Loq/i0;", "<anonymous>", "(Lsv3/c;Lsv3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<sv3.c, sv3.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184773e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f184773e;
            if (i15 == 0) {
                oq.u.b(obj);
                j0 j0Var = j0.this;
                mv3.c.a.b bVar = mv3.c.a.b.f128687a;
                this.f184773e = 1;
                if (j0Var.F(bVar, this) == objE) {
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
        public final Object w(sv3.c cVar, sv3.g gVar, tq.e<? super oq.i0> eVar) {
            return j0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsv3/b;", "<unused var>", "Lsv3/g;", "Loq/i0;", "<anonymous>", "(Lsv3/b;Lsv3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sv3.b, sv3.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184775e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f184775e;
            if (i15 == 0) {
                oq.u.b(obj);
                j0 j0Var = j0.this;
                mv3.c.a.C3193a c3193a = mv3.c.a.C3193a.f128686a;
                this.f184775e = 1;
                if (j0Var.F(c3193a, this) == objE) {
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
        public final Object w(sv3.b bVar, sv3.g gVar, tq.e<? super oq.i0> eVar) {
            return j0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsv3/e;", "<unused var>", "Lk10/c0;", "Lsv3/l;", "state", "Lk10/l;", "Lsv3/g;", "<anonymous>", "(Lsv3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sv3.e, k10.c0<Error>, tq.e<? super k10.l<? extends sv3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184778f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(Error error) {
            return new Fetching(error.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f184778f;
            uq.b.e();
            if (this.f184777e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sv3.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.d.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sv3.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends sv3.g>> eVar2) {
            d dVar = new d(eVar2);
            dVar.f184778f = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsv3/d;", "action", "Lsv3/l;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsv3/d;Lsv3/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OpenUrl, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184780f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f184780f;
            Object objE = uq.b.e();
            int i15 = this.f184779e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = j0.this.openUrlUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f184780f = vq.j.a(openUrl);
                this.f184779e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            j0 j0Var = j0.this;
            if (iVar instanceof dx.i.Left) {
                j0Var.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, Error error, tq.e<? super oq.i0> eVar) {
            e eVar2 = j0.this.new e(eVar);
            eVar2.f184780f = openUrl;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsv3/g$b;", "state", "Lk10/l;", "Lsv3/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<sv3.g.b>, tq.e<? super k10.l<? extends sv3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184783f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o O(sv3.g.b bVar) {
            return o.f184828a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f184783f;
            uq.b.e();
            if (this.f184782e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sv3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.f.O((g.b) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sv3.g.b> c0Var, tq.e<? super k10.l<? extends sv3.g>> eVar) {
            return ((f) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = new f(eVar);
            fVar.f184783f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsv3/o;", "state", "Lk10/l;", "Lsv3/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<o>, tq.e<? super k10.l<? extends sv3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184785f;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k10.l X(k10.c0 c0Var, final j0 j0Var, final dx.b bVar) {
            return c0Var.d(new er.l() { // from class: sv3.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return j0.g.Y(j0Var, bVar, (o) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error Y(j0 j0Var, dx.b bVar, o oVar) {
            return new Error(j0Var.G9(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching Z(JWSSigningParams jWSSigningParams, o oVar) {
            return new Fetching(new Data(jWSSigningParams));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f184785f;
            Object objE = uq.b.e();
            int i15 = this.f184784e;
            if (i15 == 0) {
                oq.u.b(obj);
                nv3.a aVar = j0.this.backendInteractor;
                this.f184785f = c0Var;
                this.f184784e = 1;
                obj = aVar.e(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            final j0 j0Var = j0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return j0Var.I9(c0Var, new er.a() { // from class: sv3.m0
                    @Override // er.a
                    public final Object a() {
                        return j0.g.X(c0Var, j0Var, bVar);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final JWSSigningParams jWSSigningParams = (JWSSigningParams) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: sv3.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.g.Z(jWSSigningParams, (o) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<o> c0Var, tq.e<? super k10.l<? extends sv3.g>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = j0.this.new g(eVar);
            gVar.f184785f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsv3/e;", "<unused var>", "Lk10/c0;", "Lsv3/n;", "state", "Lk10/l;", "Lsv3/g;", "<anonymous>", "(Lsv3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sv3.e, k10.c0<Error>, tq.e<? super k10.l<? extends sv3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184788f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o O(Error error) {
            return o.f184828a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f184788f;
            uq.b.e();
            if (this.f184787e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sv3.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.h.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sv3.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends sv3.g>> eVar2) {
            h hVar = new h(eVar2);
            hVar.f184788f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsv3/j;", "state", "Lk10/l;", "Lsv3/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<k10.c0<Fetching>, tq.e<? super k10.l<? extends sv3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184790f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k10.l X(final k10.c0 c0Var, final j0 j0Var, final dx.b bVar) {
            return c0Var.d(new er.l() { // from class: sv3.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return j0.i.Y(c0Var, j0Var, bVar, (Fetching) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error Y(k10.c0 c0Var, j0 j0Var, dx.b bVar, Fetching fetching) {
            return new Error(((Fetching) c0Var.a()).getData(), j0Var.G9(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching Z(CentralTokens centralTokens, Fetching fetching) {
            return new Fetching(new Data(centralTokens));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f184790f;
            Object objE = uq.b.e();
            int i15 = this.f184789e;
            if (i15 == 0) {
                oq.u.b(obj);
                rv3.b bVar = j0.this.fetchNativeCentralTokenUC;
                rv3.b.Params aVar = new rv3.b.Params(((Fetching) c0Var.a()).getData().getJwsSigningParams());
                this.f184790f = c0Var;
                this.f184789e = 1;
                obj = bVar.d(aVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            final j0 j0Var = j0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                return j0Var.I9(c0Var, new er.a() { // from class: sv3.q0
                    @Override // er.a
                    public final Object a() {
                        return j0.i.X(c0Var, j0Var, bVar2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final CentralTokens centralTokens = (CentralTokens) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: sv3.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.i.Z(centralTokens, (Fetching) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Fetching> c0Var, tq.e<? super k10.l<? extends sv3.g>> eVar) {
            return ((i) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = j0.this.new i(eVar);
            iVar.f184790f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsv3/e;", "<unused var>", "Lk10/c0;", "Lsv3/i;", "state", "Lk10/l;", "Lsv3/g;", "<anonymous>", "(Lsv3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sv3.e, k10.c0<Error>, tq.e<? super k10.l<? extends sv3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184793f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(Error error) {
            return new Fetching(error.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f184793f;
            uq.b.e();
            if (this.f184792e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sv3.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.j.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sv3.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends sv3.g>> eVar2) {
            j jVar = new j(eVar2);
            jVar.f184793f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsv3/m;", "state", "Lk10/l;", "Lsv3/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<Fetching>, tq.e<? super k10.l<? extends sv3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f184794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f184795f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f184796g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f184797h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f184798j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f184799k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f184800l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f184801m;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k10.l b0(k10.c0 c0Var, final j0 j0Var, final dx.b bVar) {
            return c0Var.d(new er.l() { // from class: sv3.z0
                @Override // er.l
                public final Object b(Object obj) {
                    return j0.k.c0(j0Var, bVar, (Fetching) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error c0(j0 j0Var, dx.b bVar, Fetching fetching) {
            return new Error(fetching.getData(), j0Var.G9(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error d0(k10.c0 c0Var, j0 j0Var, Fetching fetching) {
            return new Error(((Fetching) c0Var.a()).getData(), j0Var.H9(new qv3.a.MissingEdorAddress(j0Var.b9(new OpenUrl(j0Var.commonEndpoints.W())), j0Var.b9(sv3.c.f184730a))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching e0(k10.c0 c0Var, iy.b0 b0Var, j0 j0Var, Fetching fetching) {
            return new Fetching(new Data(((Fetching) c0Var.a()).getData().getCentralTokens(), new sv3.a.Required(b0Var, ((mv3.a.EdorAddressRequired) j0Var.setupData).b())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k10.l f0(final k10.c0 c0Var, final j0 j0Var) {
            return c0Var.d(new er.l() { // from class: sv3.a1
                @Override // er.l
                public final Object b(Object obj) {
                    return j0.k.g0(c0Var, j0Var, (Fetching) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error g0(k10.c0 c0Var, j0 j0Var, Fetching fetching) {
            return new Error(((Fetching) c0Var.a()).getData(), j0Var.G9(new dx.b.Generic(new Exception("OwnerAddress contains no data"))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching h0(k10.c0 c0Var, iy.b0 b0Var, j0 j0Var, Fetching fetching) {
            return new Fetching(new Data(((Fetching) c0Var.a()).getData().getCentralTokens(), new sv3.a.NotRequired(b0Var, ((mv3.a.EdorAddressNotRequired) j0Var.setupData).a())));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j0 j0Var;
            final iy.b0 b0Var;
            final j0 j0Var2;
            final iy.b0 b0Var2;
            final k10.c0 c0Var = (k10.c0) this.f184801m;
            Object objE = uq.b.e();
            int i15 = this.f184800l;
            if (i15 == 0) {
                oq.u.b(obj);
                nv3.a aVar = j0.this.backendInteractor;
                CentralTokens.Access access = ((Fetching) c0Var.a()).getData().getCentralTokens().getAccess();
                this.f184801m = c0Var;
                this.f184800l = 1;
                obj = aVar.b(access, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 != 1) {
                if (i15 == 2) {
                    b0Var2 = (iy.b0) this.f184797h;
                    j0Var = (j0) this.f184795f;
                    oq.u.b(obj);
                    return c0Var.d(new er.l() { // from class: sv3.w0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return j0.k.e0(c0Var, b0Var2, j0Var, (Fetching) obj2);
                        }
                    });
                }
                if (i15 == 3) {
                    j0Var2 = (j0) this.f184795f;
                    oq.u.b(obj);
                    return j0Var2.I9(c0Var, new er.a() { // from class: sv3.x0
                        @Override // er.a
                        public final Object a() {
                            return j0.k.f0(c0Var, j0Var2);
                        }
                    });
                }
                if (i15 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b0Var = (iy.b0) this.f184797h;
                j0Var = (j0) this.f184795f;
                oq.u.b(obj);
                return c0Var.d(new er.l() { // from class: sv3.y0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j0.k.h0(c0Var, b0Var, j0Var, (Fetching) obj2);
                    }
                });
            }
            oq.u.b(obj);
            dx.i iVar = (dx.i) obj;
            j0Var = j0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return j0Var.I9(c0Var, new er.a() { // from class: sv3.u0
                    @Override // er.a
                    public final Object a() {
                        return j0.k.b0(c0Var, j0Var, bVar);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            OwnerAddress ownerAddress = (OwnerAddress) ((dx.i.Right) iVar).b();
            AddressData addressData = ownerAddress.getAddressData();
            iy.b0 edorAddress = addressData != null ? addressData.getEdorAddress() : null;
            mv3.a aVar2 = j0Var.setupData;
            if (aVar2 instanceof mv3.a.EdorAddressRequired) {
                if (edorAddress == null) {
                    return c0Var.d(new er.l() { // from class: sv3.v0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return j0.k.d0(c0Var, j0Var, (Fetching) obj2);
                        }
                    });
                }
                rv3.e eVar = j0Var.saveOwnerAddressUC;
                rv3.e.Params params = new rv3.e.Params(ownerAddress);
                this.f184801m = c0Var;
                this.f184794e = vq.j.a(iVar);
                this.f184795f = j0Var;
                this.f184796g = vq.j.a(ownerAddress);
                this.f184797h = edorAddress;
                this.f184798j = 0;
                this.f184799k = 0;
                this.f184800l = 2;
                if (eVar.d(params, this) != objE) {
                    b0Var2 = edorAddress;
                    return c0Var.d(new er.l() { // from class: sv3.w0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return j0.k.e0(c0Var, b0Var2, j0Var, (Fetching) obj2);
                        }
                    });
                }
            } else {
                if (!(aVar2 instanceof mv3.a.EdorAddressNotRequired)) {
                    throw new oq.p();
                }
                if (ownerAddress.getAddressData() == null) {
                    rv3.e eVar2 = j0Var.saveOwnerAddressUC;
                    rv3.e.Params params2 = new rv3.e.Params(ownerAddress);
                    this.f184801m = c0Var;
                    this.f184794e = vq.j.a(iVar);
                    this.f184795f = j0Var;
                    this.f184796g = vq.j.a(ownerAddress);
                    this.f184797h = vq.j.a(edorAddress);
                    this.f184798j = 0;
                    this.f184799k = 0;
                    this.f184800l = 3;
                    if (eVar2.d(params2, this) != objE) {
                        j0Var2 = j0Var;
                        return j0Var2.I9(c0Var, new er.a() { // from class: sv3.x0
                            @Override // er.a
                            public final Object a() {
                                return j0.k.f0(c0Var, j0Var2);
                            }
                        });
                    }
                } else {
                    rv3.e eVar3 = j0Var.saveOwnerAddressUC;
                    rv3.e.Params params3 = new rv3.e.Params(ownerAddress);
                    this.f184801m = c0Var;
                    this.f184794e = vq.j.a(iVar);
                    this.f184795f = j0Var;
                    this.f184796g = vq.j.a(ownerAddress);
                    this.f184797h = edorAddress;
                    this.f184798j = 0;
                    this.f184799k = 0;
                    this.f184800l = 4;
                    if (eVar3.d(params3, this) != objE) {
                        b0Var = edorAddress;
                        return c0Var.d(new er.l() { // from class: sv3.y0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return j0.k.h0(c0Var, b0Var, j0Var, (Fetching) obj2);
                            }
                        });
                    }
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Fetching> c0Var, tq.e<? super k10.l<? extends sv3.g>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = j0.this.new k(eVar);
            kVar.f184801m = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsv3/r;", "state", "Lk10/l;", "Lsv3/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<k10.c0<Fetching>, tq.e<? super k10.l<? extends sv3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f184803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f184804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f184805g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f184806h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f184807j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f184808k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f184809l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f184810m;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k10.l V(k10.c0 c0Var, final j0 j0Var, final dx.b bVar) {
            return c0Var.d(new er.l() { // from class: sv3.c1
                @Override // er.l
                public final Object b(Object obj) {
                    return j0.l.X(j0Var, bVar, (Fetching) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error X(j0 j0Var, dx.b bVar, Fetching fetching) {
            return new Error(fetching.getData(), j0Var.G9(bVar));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iy.b0 edorAddress;
            j0 j0Var;
            final k10.c0 c0Var = (k10.c0) this.f184810m;
            Object objE = uq.b.e();
            int i15 = this.f184809l;
            if (i15 == 0) {
                oq.u.b(obj);
                edorAddress = ((Fetching) c0Var.a()).getData().getEdorAddressType().getEdorAddress();
                nv3.a aVar = j0.this.backendInteractor;
                String strE = edorAddress != null ? iy.c0.e(edorAddress) : null;
                CentralTokens.Access access = ((Fetching) c0Var.a()).getData().getCentralTokens().getAccess();
                this.f184810m = c0Var;
                this.f184803e = vq.j.a(edorAddress);
                this.f184809l = 1;
                obj = aVar.a(strE, access, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                edorAddress = (iy.b0) this.f184803e;
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j0Var = (j0) this.f184805g;
                oq.u.b(obj);
            }
            k10.l lVarC = c0Var.c();
            j0Var.d9(new sv3.f.Finish(((Fetching) c0Var.a()).getData().getEdorAddressType()));
            return lVarC;
            dx.i iVar = (dx.i) obj;
            final j0 j0Var2 = j0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return j0Var2.I9(c0Var, new er.a() { // from class: sv3.b1
                    @Override // er.a
                    public final Object a() {
                        return j0.l.V(c0Var, j0Var2, bVar);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            OwTokens owTokens = (OwTokens) ((dx.i.Right) iVar).b();
            rv3.g gVar = j0Var2.saveTokensUC;
            rv3.g.Params params = new rv3.g.Params(((Fetching) c0Var.a()).getData().getCentralTokens(), owTokens);
            this.f184810m = c0Var;
            this.f184803e = vq.j.a(edorAddress);
            this.f184804f = vq.j.a(iVar);
            this.f184805g = j0Var2;
            this.f184806h = vq.j.a(owTokens);
            this.f184807j = 0;
            this.f184808k = 0;
            this.f184809l = 2;
            if (gVar.d(params, this) != objE) {
                j0Var = j0Var2;
                k10.l lVarC2 = c0Var.c();
                j0Var.d9(new sv3.f.Finish(((Fetching) c0Var.a()).getData().getEdorAddressType()));
                return lVarC2;
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Fetching> c0Var, tq.e<? super k10.l<? extends sv3.g>> eVar) {
            return ((l) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            l lVar = j0.this.new l(eVar);
            lVar.f184810m = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsv3/f$a;", "action", "Lsv3/r;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsv3/f$a;Lsv3/r;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<sv3.f.Finish, Fetching, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f184812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f184813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f184814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f184815h;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        
            if (r6.F(r2, r5) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
        
            if (r2.F(r4, r5) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f184815h
                sv3.f$a r0 = (sv3.f.Finish) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f184814g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                java.lang.Object r0 = r5.f184812e
                er.a r0 = (er.a) r0
                goto L1f
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1f:
                oq.u.b(r6)
                goto L87
            L23:
                oq.u.b(r6)
                sv3.a r6 = r0.getEdorAddressType()
                boolean r2 = r6 instanceof sv3.a.Required
                if (r2 == 0) goto L58
                sv3.a r6 = r0.getEdorAddressType()
                sv3.a$b r6 = (sv3.a.Required) r6
                er.l r6 = r6.a()
                sv3.a r2 = r0.getEdorAddressType()
                sv3.a$b r2 = (sv3.a.Required) r2
                iy.b0 r2 = r2.getEdorAddress()
                r6.b(r2)
                sv3.j0 r6 = sv3.j0.this
                mv3.c$a$a r2 = mv3.c.a.C3193a.f128686a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f184815h = r0
                r5.f184814g = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L87
                goto L86
            L58:
                boolean r6 = r6 instanceof sv3.a.NotRequired
                if (r6 == 0) goto L8a
                sv3.a r6 = r0.getEdorAddressType()
                sv3.a$a r6 = (sv3.a.NotRequired) r6
                er.a r6 = r6.a()
                if (r6 == 0) goto L87
                sv3.j0 r2 = sv3.j0.this
                r6.a()
                mv3.c$a$a r4 = mv3.c.a.C3193a.f128686a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f184815h = r0
                java.lang.Object r6 = vq.j.a(r6)
                r5.f184812e = r6
                r6 = 0
                r5.f184813f = r6
                r5.f184814g = r3
                java.lang.Object r6 = r2.F(r4, r5)
                if (r6 != r1) goto L87
            L86:
                return r1
            L87:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            L8a:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sv3.j0.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sv3.f.Finish finish, Fetching fetching, tq.e<? super oq.i0> eVar) {
            m mVar = j0.this.new m(eVar);
            mVar.f184815h = finish;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsv3/e;", "<unused var>", "Lk10/c0;", "Lsv3/q;", "state", "Lk10/l;", "Lsv3/g;", "<anonymous>", "(Lsv3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<sv3.e, k10.c0<Error>, tq.e<? super k10.l<? extends sv3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184818f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(Error error) {
            return new Fetching(error.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f184818f;
            uq.b.e();
            if (this.f184817e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sv3.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.n.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sv3.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends sv3.g>> eVar2) {
            n nVar = new n(eVar2);
            nVar.f184818f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    public j0(yy.a aVar, nv3.a aVar2, rv3.b bVar, rv3.e eVar, rv3.g gVar, vv3.c cVar, hb4.d dVar, vv3.b bVar2, u04.a aVar3, a14.w wVar, i70.e eVar2, mv3.a aVar4) {
        this.backendInteractor = aVar2;
        this.fetchNativeCentralTokenUC = bVar;
        this.saveOwnerAddressUC = eVar;
        this.saveTokensUC = gVar;
        this.mapper = cVar;
        this.errorVMSFactory = dVar;
        this.errorMapper = bVar2;
        this.commonEndpoints = aVar3;
        this.openUrlUseCase = wVar;
        this.globalSnackBarManager = eVar2;
        this.setupData = aVar4;
        this.stateMachine = aVar.a(sv3.g.b.f184739a, new er.l() { // from class: sv3.z
            @Override // er.l
            public final Object b(Object obj) {
                return j0.K9(this.f184866a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c G9(dx.b domainError) {
        return H9(new qv3.a.Domain(domainError, b9(sv3.c.f184730a), b9(sv3.e.f184735a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c H9(qv3.a errorType) {
        return this.errorVMSFactory.a(this.errorMapper.b(new vv3.b.Params(errorType)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<sv3.g> I9(k10.c0<? extends sv3.g> c0Var, er.a<? extends k10.l<? extends sv3.g>> aVar) {
        er.a<oq.i0> aVarA;
        mv3.a aVar2 = this.setupData;
        mv3.a.EdorAddressRequired edorAddressRequired = aVar2 instanceof mv3.a.EdorAddressRequired ? (mv3.a.EdorAddressRequired) aVar2 : null;
        if (edorAddressRequired != null && (aVarA = edorAddressRequired.a()) != null) {
            aVarA.a();
            d9(sv3.b.f184725a);
            k10.l lVarC = c0Var.c();
            if (lVarC != null) {
                return lVarC;
            }
        }
        return (k10.l) aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(final j0 j0Var, k10.v vVar) {
        vVar.c(fr.q0.c(sv3.g.class), new er.l() { // from class: sv3.y
            @Override // er.l
            public final Object b(Object obj) {
                return j0.L9(this.f184862a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sv3.g.b.class), new er.l() { // from class: sv3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.M9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(o.class), new er.l() { // from class: sv3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.N9(this.f184726a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: sv3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.O9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Fetching.class), new er.l() { // from class: sv3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.P9(this.f184734a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: sv3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.Q9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Fetching.class), new er.l() { // from class: sv3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.R9(this.f184737a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Fetching.class), new er.l() { // from class: sv3.g0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.S9(this.f184740a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: sv3.h0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.T9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: sv3.i0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.U9(this.f184745a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(j0 j0Var, k10.z zVar) {
        b bVar = j0Var.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(sv3.c.class), oVar, bVar);
        zVar.x(fr.q0.c(sv3.b.class), oVar, j0Var.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(k10.z zVar) {
        zVar.A(new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(j0 j0Var, k10.z zVar) {
        zVar.A(j0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(k10.z zVar) {
        h hVar = new h(null);
        zVar.v(fr.q0.c(sv3.e.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(j0 j0Var, k10.z zVar) {
        zVar.A(j0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(k10.z zVar) {
        j jVar = new j(null);
        zVar.v(fr.q0.c(sv3.e.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(j0 j0Var, k10.z zVar) {
        zVar.A(j0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(j0 j0Var, k10.z zVar) {
        zVar.A(j0Var.new l(null));
        m mVar = j0Var.new m(null);
        zVar.x(fr.q0.c(sv3.f.Finish.class), k10.o.CANCEL_PREVIOUS, mVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(k10.z zVar) {
        n nVar = new n(null);
        zVar.v(fr.q0.c(sv3.e.class), k10.o.CANCEL_PREVIOUS, nVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(j0 j0Var, k10.z zVar) {
        d dVar = new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(sv3.e.class), oVar, dVar);
        zVar.x(fr.q0.c(OpenUrl.class), oVar, j0Var.new e(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(mv3.c.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(mv3.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<mv3.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<sv3.g, sv3.f> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<s.a> getState() {
        return this.state;
    }
}
