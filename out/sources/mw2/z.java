package mw2;

import al0.ApplicantDataModel;
import al0.ApplicantDataResultData;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005BS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010+\u001a\u00020#2\u0006\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R,\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030B8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u0010.\u001a\u0004\bE\u0010FR \u0010O\u001a\b\u0012\u0004\u0012\u00020J0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020&0P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lmw2/z;", "Ll00/g;", "Lmw2/j;", "", "Lmw2/k;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Low2/h;", "mapper", "Lpv2/a;", "getApplicantDataUseCase", "Lg14/a;", "getInfoFromPeselUC", "Lac4/a;", "callActionWithLoaderUseCase", "La14/w;", "openUrlUseCase", "globalSnackBarManager", "Low2/g;", "errorMapper", "Lmw2/i;", "setupData", "<init>", "(Lyy/a;Low2/h;Lpv2/a;Lg14/a;Lac4/a;La14/w;Li70/e;Low2/g;Lmw2/i;)V", "Lk10/c0;", "Lmw2/j$b;", "state", "Lk10/l;", "t9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Lmw2/l;", "dataRequester", "Loq/i0;", "v9", "(Ldx/b;Lmw2/l;Ltq/e;)Ljava/lang/Object;", "Lmw2/k$a;", "x9", "(Lmw2/j;)Lmw2/k$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Low2/h;", "c", "Lpv2/a;", "d", "Lg14/a;", "e", "Lac4/a;", "f", "La14/w;", "g", "Li70/e;", "h", "Low2/g;", "j", "Lmw2/i;", "k", "Lmw2/j$b;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lmw2/d;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<mw2.j, Object> implements mw2.k, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ow2.h mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pv2.a getApplicantDataUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g14.a getInfoFromPeselUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ow2.g errorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mw2.j.Loading initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<mw2.j, Object> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<mw2.d> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<mw2.k.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f128883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f128884f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f128885g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f128886h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f128887j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f128888k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f128889l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f128890m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f128891n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f128892p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f128893q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f128895s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128893q = obj;
            this.f128895s |= PKIFailureInfo.systemUnavail;
            return z.this.t9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lal0/e;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends ApplicantDataModel>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128896e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k10.c0<mw2.j.Loading> f128898g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k10.c0<mw2.j.Loading> c0Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f128898g = c0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f128896e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            pv2.a aVar = z.this.getApplicantDataUseCase;
            pv2.a.Params params = new pv2.a.Params(this.f128898g.a().getApplicantDataRequester());
            this.f128896e = 1;
            Object objD = aVar.d(params, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return z.this.new b(this.f128898g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, ApplicantDataModel>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<mw2.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f128899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f128900b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f128901a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f128902b;

            /* JADX INFO: renamed from: mw2.z$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3196a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f128903d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f128904e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f128905f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f128907h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f128908j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f128909k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f128910l;

                public C3196a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f128903d = obj;
                    this.f128904e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f128901a = hVar;
                this.f128902b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3196a c3196a;
                if (eVar instanceof C3196a) {
                    c3196a = (C3196a) eVar;
                    int i15 = c3196a.f128904e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3196a.f128904e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3196a = new C3196a(eVar);
                    }
                } else {
                    c3196a = new C3196a(eVar);
                }
                Object obj2 = c3196a.f128903d;
                Object objE = uq.b.e();
                int i16 = c3196a.f128904e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f128901a;
                    mw2.k.a aVarX9 = this.f128902b.x9((mw2.j) obj);
                    c3196a.f128905f = vq.j.a(obj);
                    c3196a.f128907h = vq.j.a(c3196a);
                    c3196a.f128908j = vq.j.a(obj);
                    c3196a.f128909k = vq.j.a(hVar);
                    c3196a.f128910l = 0;
                    c3196a.f128904e = 1;
                    if (hVar.F(aVarX9, c3196a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public c(mu.g gVar, z zVar) {
            this.f128899a = gVar;
            this.f128900b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super mw2.k.a> hVar, tq.e eVar) {
            Object objA = this.f128899a.a(new a(hVar, this.f128900b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmw2/e;", "<unused var>", "Lmw2/j;", "Loq/i0;", "<anonymous>", "(Lmw2/e;Lmw2/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<mw2.e, mw2.j, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128911e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f128911e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                mw2.d.a aVar = mw2.d.a.f128822a;
                this.f128911e = 1;
                if (zVar.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mw2.e eVar, mw2.j jVar, tq.e<? super i0> eVar2) {
            return z.this.new d(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lmw2/j$b;", "state", "Lk10/l;", "Lmw2/j;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<mw2.j.Loading>, tq.e<? super k10.l<? extends mw2.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128914f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f128914f;
            Object objE = uq.b.e();
            int i15 = this.f128913e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            z zVar = z.this;
            this.f128914f = vq.j.a(c0Var);
            this.f128913e = 1;
            Object objT9 = zVar.t9(c0Var, this);
            return objT9 == objE ? objE : objT9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<mw2.j.Loading> c0Var, tq.e<? super k10.l<? extends mw2.j>> eVar) {
            return ((e) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = z.this.new e(eVar);
            eVar2.f128914f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmw2/h;", "<unused var>", "Lk10/c0;", "Lmw2/j$b;", "state", "Lk10/l;", "Lmw2/j;", "<anonymous>", "(Lmw2/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<mw2.h, k10.c0<mw2.j.Loading>, tq.e<? super k10.l<? extends mw2.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128917f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f128917f;
            Object objE = uq.b.e();
            int i15 = this.f128916e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            z zVar = z.this;
            this.f128917f = vq.j.a(c0Var);
            this.f128916e = 1;
            Object objT9 = zVar.t9(c0Var, this);
            return objT9 == objE ? objE : objT9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mw2.h hVar, k10.c0<mw2.j.Loading> c0Var, tq.e<? super k10.l<? extends mw2.j>> eVar) {
            f fVar = z.this.new f(eVar);
            fVar.f128917f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmw2/b;", "<unused var>", "Lmw2/j$b;", "Loq/i0;", "<anonymous>", "(Lmw2/b;Lmw2/j$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<mw2.b, mw2.j.Loading, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128919e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f128919e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mw2.d> bVarY1 = z.this.Y1();
                mw2.d.b bVar = mw2.d.b.f128823a;
                this.f128919e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mw2.b bVar, mw2.j.Loading loading, tq.e<? super i0> eVar) {
            return z.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmw2/f;", "<unused var>", "Lmw2/j$a;", "Loq/i0;", "<anonymous>", "(Lmw2/f;Lmw2/j$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<mw2.f, mw2.j.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128921e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f128921e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                mw2.d.c cVar = mw2.d.c.f128824a;
                this.f128921e = 1;
                if (zVar.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mw2.f fVar, mw2.j.Initialized initialized, tq.e<? super i0> eVar) {
            return z.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmw2/a;", "<unused var>", "Lk10/c0;", "Lmw2/j$a;", "state", "Lk10/l;", "Lmw2/j;", "<anonymous>", "(Lmw2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<mw2.a, k10.c0<mw2.j.Initialized>, tq.e<? super k10.l<? extends mw2.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128924f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mw2.j.Initialized O(mw2.j.Initialized initialized) {
            return mw2.j.Initialized.b(initialized, null, 0, null, false, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f128924f;
            uq.b.e();
            if (this.f128923e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mw2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.i.O((j.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mw2.a aVar, k10.c0<mw2.j.Initialized> c0Var, tq.e<? super k10.l<? extends mw2.j>> eVar) {
            i iVar = new i(eVar);
            iVar.f128924f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmw2/g;", "action", "Lmw2/j$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmw2/g;Lmw2/j$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<OnUrlClick, mw2.j.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128926f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnUrlClick onUrlClick = (OnUrlClick) this.f128926f;
            Object objE = uq.b.e();
            int i15 = this.f128925e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = z.this.openUrlUseCase;
                a14.w.Params params = new a14.w.Params(onUrlClick.getUrl(), false, 2, null);
                this.f128926f = vq.j.a(onUrlClick);
                this.f128925e = 1;
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
            z zVar = z.this;
            if (iVar instanceof dx.i.Left) {
                zVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnUrlClick onUrlClick, mw2.j.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = z.this.new j(eVar);
            jVar.f128926f = onUrlClick;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmw2/c;", "<unused var>", "Lmw2/j$a;", "state", "Loq/i0;", "<anonymous>", "(Lmw2/c;Lmw2/j$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<mw2.c, mw2.j.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128929f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mw2.j.Initialized initialized = (mw2.j.Initialized) this.f128929f;
            Object objE = uq.b.e();
            int i15 = this.f128928e;
            if (i15 == 0) {
                oq.u.b(obj);
                z.this.setupData.getContract().r(new ApplicantDataResultData(initialized.getApplicantDataModel().getPersonalId(), new ApplicantDataResultData.BasicInfo(initialized.getApplicantDataModel().getFirstName(), initialized.getApplicantDataModel().getSecondName(), initialized.getApplicantDataModel().getSurname(), initialized.getApplicantDataModel().getFamilyName(), xw.g.c(initialized.getApplicantDataModel().getPesel()), initialized.getApplicantDataModel().getPlaceOfBirth(), initialized.getAge(), initialized.getApplicantDataModel().getGender(), initialized.getApplicantDataModel().getDateOfBirth(), initialized.getApplicantDataModel().getNationality(), null), new ApplicantDataResultData.ParentInfo(initialized.getApplicantDataModel().getFathersName(), initialized.getApplicantDataModel().getMothersName(), initialized.getApplicantDataModel().getMothersMaidenName())));
                z zVar = z.this;
                mw2.d.f fVar = mw2.d.f.f128826a;
                this.f128929f = vq.j.a(initialized);
                this.f128928e = 1;
                if (zVar.F(fVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mw2.c cVar, mw2.j.Initialized initialized, tq.e<? super i0> eVar) {
            k kVar = z.this.new k(eVar);
            kVar.f128929f = initialized;
            return kVar.J(i0.f148189a);
        }
    }

    public z(yy.a aVar, ow2.h hVar, pv2.a aVar2, g14.a aVar3, ac4.a aVar4, a14.w wVar, i70.e eVar, ow2.g gVar, SetupData setupData) {
        this.mapper = hVar;
        this.getApplicantDataUseCase = aVar2;
        this.getInfoFromPeselUC = aVar3;
        this.callActionWithLoaderUseCase = aVar4;
        this.openUrlUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.errorMapper = gVar;
        this.setupData = setupData;
        mw2.j.Loading loading = new mw2.j.Loading(setupData.getApplicantDataRequester());
        this.initialState = loading;
        this.stateMachine = aVar.a(loading, new er.l() { // from class: mw2.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.A9(this.f128869a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), x9(loading));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(mw2.j.class), new er.l() { // from class: mw2.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.B9(this.f128861a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mw2.j.Loading.class), new er.l() { // from class: mw2.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.C9(this.f128862a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mw2.j.Initialized.class), new er.l() { // from class: mw2.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.D9(this.f128863a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(z zVar, k10.z zVar2) {
        d dVar = zVar.new d(null);
        zVar2.x(q0.c(mw2.e.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new e(null));
        f fVar = zVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(mw2.h.class), oVar, fVar);
        zVar2.x(q0.c(mw2.b.class), oVar, zVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(z zVar, k10.z zVar2) {
        h hVar = zVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(mw2.f.class), oVar, hVar);
        zVar2.v(q0.c(mw2.a.class), oVar, new i(null));
        zVar2.x(q0.c(OnUrlClick.class), oVar, zVar.new j(null));
        zVar2.x(q0.c(mw2.c.class), oVar, zVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object t9(k10.c0<mw2.j.Loading> c0Var, tq.e<? super k10.l<? extends mw2.j>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f128895s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f128895s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object objA = aVar2.f128893q;
        Object objE = uq.b.e();
        int i16 = aVar2.f128895s;
        if (i16 == 0) {
            oq.u.b(objA);
            ac4.a aVar3 = this.callActionWithLoaderUseCase;
            b bVar = new b(c0Var, null);
            aVar2.f128882d = c0Var;
            aVar2.f128895s = 1;
            objA = ac4.a.a(aVar3, null, bVar, aVar2, 1, null);
            if (objA != objE) {
            }
            return objE;
        }
        if (i16 != 1) {
            if (i16 == 2) {
                k10.l lVar = (k10.l) aVar2.f128885g;
                oq.u.b(objA);
                return lVar;
            }
            if (i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10.l lVar2 = (k10.l) aVar2.f128887j;
            oq.u.b(objA);
            return lVar2;
        }
        c0Var = (k10.c0) aVar2.f128882d;
        oq.u.b(objA);
        dx.i iVar = (dx.i) objA;
        if (iVar instanceof dx.i.Left) {
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            Object objC = c0Var.c();
            l applicantDataRequester = c0Var.a().getApplicantDataRequester();
            aVar2.f128882d = vq.j.a(c0Var);
            aVar2.f128883e = vq.j.a(iVar);
            aVar2.f128884f = vq.j.a(bVar2);
            aVar2.f128885g = objC;
            aVar2.f128886h = vq.j.a(objC);
            aVar2.f128889l = 0;
            aVar2.f128890m = 0;
            aVar2.f128891n = 0;
            aVar2.f128895s = 2;
            if (v9(bVar2, applicantDataRequester, aVar2) != objE) {
                return objC;
            }
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final ApplicantDataModel applicantDataModel = (ApplicantDataModel) ((dx.i.Right) iVar).b();
            final l applicantDataRequester2 = c0Var.a().getApplicantDataRequester();
            g14.a.b bVarA = this.getInfoFromPeselUC.a(new g14.a.Params(xw.g.c(applicantDataModel.getPesel()), null));
            if (bVarA instanceof g14.a.b.Success) {
                final int age = ((g14.a.b.Success) bVarA).getAge();
                return c0Var.d(new er.l() { // from class: mw2.w
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z.u9(applicantDataRequester2, age, applicantDataModel, (j.Loading) obj);
                    }
                });
            }
            Object objC2 = c0Var.c();
            dx.b generic = new dx.b.Generic(null, 1, null);
            aVar2.f128882d = vq.j.a(c0Var);
            aVar2.f128883e = vq.j.a(iVar);
            aVar2.f128884f = vq.j.a(applicantDataModel);
            aVar2.f128885g = vq.j.a(applicantDataRequester2);
            aVar2.f128886h = vq.j.a(bVarA);
            aVar2.f128887j = objC2;
            aVar2.f128888k = vq.j.a(objC2);
            aVar2.f128889l = 0;
            aVar2.f128890m = 0;
            aVar2.f128891n = 0;
            aVar2.f128892p = 0;
            aVar2.f128895s = 3;
            if (v9(generic, applicantDataRequester2, aVar2) != objE) {
                return objC2;
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mw2.j.Initialized u9(l lVar, int i15, ApplicantDataModel applicantDataModel, mw2.j.Loading loading) {
        return new mw2.j.Initialized(lVar, i15, applicantDataModel, false, 8, null);
    }

    private final Object v9(dx.b bVar, final l lVar, tq.e<? super i0> eVar) {
        Object objF = F(new mw2.d.GoToError(this.errorMapper.b(new ow2.g.Params(lVar, bVar, new er.l() { // from class: mw2.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.w9(lVar, this, (ib4.c.b) obj);
            }
        }))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(l lVar, z zVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                if (lVar instanceof l.b) {
                    zVar.d9(mw2.e.f128828a);
                } else {
                    zVar.d9(mw2.b.f128819a);
                }
            } else {
                if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    throw new oq.p();
                }
                zVar.d9(mw2.h.f128831a);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mw2.k.a x9(mw2.j state) {
        ow2.h hVar = this.mapper;
        er.a<i0> aVarB9 = b9(mw2.c.f128820a);
        return hVar.b(new ow2.h.Params(state, new er.l() { // from class: mw2.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.y9(this.f128860a, (String) obj);
            }
        }, b9(mw2.a.f128818a), aVarB9, b9(mw2.e.f128828a), b9(mw2.f.f128829a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(z zVar, String str) {
        zVar.d9(new OnUrlClick(str));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<mw2.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<mw2.j, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<mw2.k.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(mw2.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
