package f83;

import androidx.p016lifecycle.u0;
import fr.q0;
import iy.b0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0089\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0001\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0096\u0001¢\u0006\u0004\b3\u00104J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020501H\u0096\u0001¢\u0006\u0004\b6\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010Y\u001a\u00020T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR&\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030Z8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R \u0010(\u001a\b\u0012\u0004\u0012\u00020)0`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR \u0010k\u001a\b\u0012\u0004\u0012\u00020f0e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j¨\u0006l"}, d2 = {"Lf83/o;", "Ll00/g;", "Lf83/b;", "Lf83/a;", "Lf83/c;", "", "Lnx/b;", "Lg83/q;", "scannerMapper", "La14/x;", "requestCameraPermissionUseCase", "Lt73/b;", "validateQrCodeUseCase", "Lgp0/c;", "getPackageUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "La14/q;", "goToStoreIntentUseCase", "Lg83/l;", "genericDomainErrorMapper", "Lsz/d;", "connector", "Lyy/a;", "stateMachineFactory", "Lac4/r;", "", "scanCameraUseCase", "Loz/q;", "ownerViewLifecycleManager", "Lh14/b;", "isCameraPermissionGrantedUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lmz3/j;", "generateDocumentsAsyncUseCase", "Lk83/a;", "activationProcessType", "<init>", "(Lg83/q;La14/x;Lt73/b;Lgp0/c;Lac4/a;La14/q;Lg83/l;Lsz/d;Lyy/a;Lac4/r;Loz/q;Lh14/b;La14/m;Lmz3/j;Lk83/a;)V", "state", "Lf83/c$a;", "A9", "(Lf83/b;)Lf83/c$a;", "Ldx/b;", "error", "Ljb4/b;", "x9", "(Ldx/b;)Ljb4/b;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lg83/q;", "c", "La14/x;", "d", "Lt73/b;", "e", "Lgp0/c;", "f", "Lac4/a;", "g", "La14/q;", "h", "Lg83/l;", "j", "Lac4/r;", "k", "Loz/q;", "l", "Lh14/b;", "m", "La14/m;", "n", "Lmz3/j;", "p", "Lk83/a;", "q", "Lf83/b;", "initialState", "Loz/j;", "r", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lf83/a$l;", "v", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, f83.a> implements f83.c, zx.d, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g83.q scannerMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.x requestCameraPermissionUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t73.b validateQrCodeUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final gp0.c getPackageUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a14.q goToStoreIntentUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g83.l genericDomainErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.r<String> scanCameraUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final h14.b isCameraPermissionGrantedUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mz3.j generateDocumentsAsyncUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k83.a activationProcessType;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, f83.a> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p0<f83.c.Data> state;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final xw.b<f83.a.l> navAction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60228e;

        /* JADX INFO: renamed from: f83.o$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnx/a;", "viewLifecycle", "Loq/i0;", "<anonymous>", "(Lnx/a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C1359a extends vq.k implements er.p<nx.a, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f60230e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f60231f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ o f60232g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1359a(o oVar, tq.e<? super C1359a> eVar) {
                super(2, eVar);
                this.f60232g = oVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                nx.a aVar = (nx.a) this.f60231f;
                uq.b.e();
                if (this.f60230e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                if (aVar == nx.a.RESUMED) {
                    this.f60232g.d9(f83.a.d.f60139a);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(nx.a aVar, tq.e<? super i0> eVar) {
                return ((C1359a) v(aVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C1359a c1359a = new C1359a(this.f60232g, eVar);
                c1359a.f60231f = obj;
                return c1359a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f60228e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarS = mu.i.S(o.this.x8(), new C1359a(o.this, null));
                this.f60228e = 1;
                if (mu.i.i(gVarS, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return o.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<f83.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f60233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f60234b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f60235a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f60236b;

            /* JADX INFO: renamed from: f83.o$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1360a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f60237d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f60238e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f60239f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f60241h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f60242j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f60243k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f60244l;

                public C1360a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f60237d = obj;
                    this.f60238e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f60235a = hVar;
                this.f60236b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1360a c1360a;
                if (eVar instanceof C1360a) {
                    c1360a = (C1360a) eVar;
                    int i15 = c1360a.f60238e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1360a.f60238e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1360a = new C1360a(eVar);
                    }
                } else {
                    c1360a = new C1360a(eVar);
                }
                Object obj2 = c1360a.f60237d;
                Object objE = uq.b.e();
                int i16 = c1360a.f60238e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f60235a;
                    f83.c.Data dataA9 = this.f60236b.A9((State) obj);
                    c1360a.f60239f = vq.j.a(obj);
                    c1360a.f60241h = vq.j.a(c1360a);
                    c1360a.f60242j = vq.j.a(obj);
                    c1360a.f60243k = vq.j.a(hVar);
                    c1360a.f60244l = 0;
                    c1360a.f60238e = 1;
                    if (hVar.F(dataA9, c1360a) == objE) {
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

        public b(mu.g gVar, o oVar) {
            this.f60233a = gVar;
            this.f60234b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f83.c.Data> hVar, tq.e eVar) {
            Object objA = this.f60233a.a(new a(hVar, this.f60234b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf83/a$j;", "<unused var>", "Lf83/b;", "Loq/i0;", "<anonymous>", "(Lf83/a$j;Lf83/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<f83.a.j, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60245e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f60245e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(f83.a.j jVar, State state, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf83/a$m;", "action", "Lk10/c0;", "Lf83/b;", "state", "Lk10/l;", "<anonymous>", "(Lf83/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<f83.a.ProcessCode, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f60248f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f60249g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f60251e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f60252f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ o f60253g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ f83.a.ProcessCode f60254h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o oVar, f83.a.ProcessCode processCode, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f60253g = oVar;
                this.f60254h = processCode;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x005c  */
            /* JADX WARN: Code duplicated, block: B:19:0x006d  */
            /* JADX WARN: Code duplicated, block: B:21:0x0071  */
            /* JADX WARN: Code duplicated, block: B:24:0x0091  */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
            
                if (r7 == r0) goto L30;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 254
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: f83.o.d.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f60253g, this.f60254h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, false, false, null, null, false, false, null, 111, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f83.a.ProcessCode processCode = (f83.a.ProcessCode) this.f60248f;
            c0 c0Var = (c0) this.f60249g;
            Object objE = uq.b.e();
            int i15 = this.f60247e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = o.this.callActionWithLoaderUseCase;
                a aVar2 = new a(o.this, processCode, null);
                this.f60248f = vq.j.a(processCode);
                this.f60249g = c0Var;
                this.f60247e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: f83.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.d.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f83.a.ProcessCode processCode, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f60248f = processCode;
            dVar.f60249g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf83/a$i;", "action", "Lf83/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lf83/a$i;Lf83/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<f83.a.GoToActivationCode, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f60256f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f83.a.GoToActivationCode goToActivationCode = (f83.a.GoToActivationCode) this.f60256f;
            Object objE = uq.b.e();
            int i15 = this.f60255e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<f83.a.l> bVarY1 = o.this.Y1();
                f83.a.l.GoToActivationCode goToActivationCode2 = new f83.a.l.GoToActivationCode(goToActivationCode.getSetupData());
                this.f60256f = vq.j.a(goToActivationCode);
                this.f60255e = 1;
                if (bVarY1.F(goToActivationCode2, this) == objE) {
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
        public final Object w(f83.a.GoToActivationCode goToActivationCode, State state, tq.e<? super i0> eVar) {
            e eVar2 = o.this.new e(eVar);
            eVar2.f60256f = goToActivationCode;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf83/a$g;", "action", "Lf83/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lf83/a$g;Lf83/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<f83.a.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f60259f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f83.a.Error error = (f83.a.Error) this.f60259f;
            Object objE = uq.b.e();
            int i15 = this.f60258e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<f83.a.l> bVarY1 = o.this.Y1();
                f83.a.l.GoToError goToError = new f83.a.l.GoToError(o.this.x9(error.getError()));
                this.f60259f = vq.j.a(error);
                this.f60258e = 1;
                if (bVarY1.F(goToError, this) == objE) {
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
        public final Object w(f83.a.Error error, State state, tq.e<? super i0> eVar) {
            f fVar = o.this.new f(eVar);
            fVar.f60259f = error;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf83/a$k;", "<unused var>", "Lf83/b;", "Loq/i0;", "<anonymous>", "(Lf83/a$k;Lf83/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<f83.a.k, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f60261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f60262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f60263g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f60264h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f60265j;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
        
            if (r1.F(r4, r5) == r0) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f60265j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f60262f
                oq.i0 r0 = (oq.i0) r0
                java.lang.Object r0 = r5.f60261e
                dx.i r0 = (dx.i) r0
                oq.u.b(r6)
                goto L84
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                oq.u.b(r6)
                goto L3e
            L26:
                oq.u.b(r6)
                f83.o r6 = f83.o.this
                a14.q r6 = f83.o.s9(r6)
                a14.q$a r1 = new a14.q$a
                r4 = 0
                r1.<init>(r4)
                r5.f60265j = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L3e
                goto L83
            L3e:
                dx.i r6 = (dx.i) r6
                f83.o r1 = f83.o.this
                boolean r3 = r6 instanceof dx.i.Left
                if (r3 == 0) goto L57
                dx.i$b r6 = (dx.i.Left) r6
                java.lang.Object r6 = r6.b()
                dx.b$c r6 = (dx.b.Business) r6
                f83.a$g r0 = new f83.a$g
                r0.<init>(r6)
                f83.o.m9(r1, r0)
                goto L84
            L57:
                boolean r3 = r6 instanceof dx.i.Right
                if (r3 == 0) goto L87
                r3 = r6
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                oq.i0 r3 = (oq.i0) r3
                xw.b r1 = r1.Y1()
                f83.a$l$b r4 = f83.a.l.b.f60149a
                java.lang.Object r6 = vq.j.a(r6)
                r5.f60261e = r6
                java.lang.Object r6 = vq.j.a(r3)
                r5.f60262f = r6
                r6 = 0
                r5.f60263g = r6
                r5.f60264h = r6
                r5.f60265j = r2
                java.lang.Object r6 = r1.F(r4, r5)
                if (r6 != r0) goto L84
            L83:
                return r0
            L84:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            L87:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: f83.o.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(f83.a.k kVar, State state, tq.e<? super i0> eVar) {
            return o.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf83/a$h;", "<unused var>", "Lf83/b;", "Loq/i0;", "<anonymous>", "(Lf83/a$h;Lf83/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<f83.a.h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60267e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f60267e;
            if (i15 == 0) {
                oq.u.b(obj);
                o oVar = o.this;
                f83.a.l.C1357a c1357a = f83.a.l.C1357a.f60148a;
                this.f60267e = 1;
                if (oVar.F(c1357a, this) == objE) {
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
        public final Object w(f83.a.h hVar, State state, tq.e<? super i0> eVar) {
            return o.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf83/a$a;", "<unused var>", "Lf83/b;", "Loq/i0;", "<anonymous>", "(Lf83/a$a;Lf83/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<f83.a.C1356a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60269e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f60269e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<f83.a.l> bVarY1 = o.this.Y1();
                f83.a.l.b bVar = f83.a.l.b.f60149a;
                this.f60269e = 1;
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
        public final Object w(f83.a.C1356a c1356a, State state, tq.e<? super i0> eVar) {
            return o.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lf83/b;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f60272f;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(u04.c cVar, State state) {
            return State.b(state, fr.t.c(cVar, u04.c.a.f194071a), cVar instanceof u04.c.b, null, null, false, false, null, 124, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f60272f;
            Object objE = uq.b.e();
            int i15 = this.f60271e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.x xVar = o.this.requestCameraPermissionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f60272f = c0Var;
                this.f60271e = 1;
                obj = xVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final u04.c cVar = (u04.c) obj;
            return c0Var.b(new er.l() { // from class: f83.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.j.O(cVar, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((j) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            j jVar = o.this.new j(eVar);
            jVar.f60272f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldx/i;", "Ldx/b;", "", "data", "Lf83/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldx/i;Lf83/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<dx.i<? extends dx.b, ? extends String>, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f60275f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f60275f;
            uq.b.e();
            if (this.f60274e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o oVar = o.this;
            if (iVar instanceof dx.i.Right) {
                String str = (String) ((dx.i.Right) iVar).b();
                StringBuilder sb5 = new StringBuilder();
                for (int i15 = 0; i15 < str.length(); i15++) {
                    char cCharAt = str.charAt(i15);
                    if (!fu.a.c(cCharAt)) {
                        sb5.append(cCharAt);
                    }
                }
                oVar.d9(new f83.a.VerifyCode(fp0.h.b(iy.c0.g(sb5.toString())), null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, String> iVar, State state, tq.e<? super i0> eVar) {
            k kVar = o.this.new k(eVar);
            kVar.f60275f = iVar;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf83/a$d;", "<unused var>", "Lk10/c0;", "Lf83/b;", "state", "Lk10/l;", "<anonymous>", "(Lf83/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<f83.a.d, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f60278f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(boolean z15, State state) {
            return State.b(state, z15, false, null, null, false, false, null, 126, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f60278f;
            Object objE = uq.b.e();
            int i15 = this.f60277e;
            if (i15 == 0) {
                oq.u.b(obj);
                h14.b bVar = o.this.isCameraPermissionGrantedUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f60278f = c0Var;
                this.f60277e = 1;
                obj = bVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
            return c0Var.b(new er.l() { // from class: f83.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.l.O(zBooleanValue, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f83.a.d dVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = o.this.new l(eVar);
            lVar.f60278f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf83/a$e;", "<unused var>", "Lk10/c0;", "Lf83/b;", "state", "Lk10/l;", "<anonymous>", "(Lf83/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<f83.a.e, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f60281f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, false, false, null, null, false, false, null, 95, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f60281f;
            uq.b.e();
            if (this.f60280e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: f83.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.m.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f83.a.e eVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            m mVar = new m(eVar2);
            mVar.f60281f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf83/a$b;", "action", "Lk10/c0;", "Lf83/b;", "state", "Lk10/l;", "<anonymous>", "(Lf83/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<f83.a.ChangeBottomSheetVisibility, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f60283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f60284g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(f83.a.ChangeBottomSheetVisibility changeBottomSheetVisibility, State state) {
            return State.b(state, false, changeBottomSheetVisibility.getVisible(), null, null, false, false, null, 125, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final f83.a.ChangeBottomSheetVisibility changeBottomSheetVisibility = (f83.a.ChangeBottomSheetVisibility) this.f60283f;
            c0 c0Var = (c0) this.f60284g;
            uq.b.e();
            if (this.f60282e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: f83.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.n.O(changeBottomSheetVisibility, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f83.a.ChangeBottomSheetVisibility changeBottomSheetVisibility, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = new n(eVar);
            nVar.f60283f = changeBottomSheetVisibility;
            nVar.f60284g = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: f83.o$o, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf83/a$c;", "action", "Lk10/c0;", "Lf83/b;", "state", "Lk10/l;", "<anonymous>", "(Lf83/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C1361o extends vq.k implements er.q<f83.a.ChangeInputCode, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f60286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f60287g;

        C1361o(tq.e<? super C1361o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(b0 b0Var, State state) {
            return State.b(state, false, false, hz.b.C2039b.f86846c, b0Var, false, false, null, 115, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f83.a.ChangeInputCode changeInputCode = (f83.a.ChangeInputCode) this.f60286f;
            c0 c0Var = (c0) this.f60287g;
            uq.b.e();
            if (this.f60285e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            String strE = iy.c0.e(changeInputCode.getQrCode());
            StringBuilder sb5 = new StringBuilder();
            for (int i15 = 0; i15 < strE.length(); i15++) {
                char cCharAt = strE.charAt(i15);
                if (!fu.a.c(cCharAt)) {
                    sb5.append(cCharAt);
                }
            }
            final b0 b0VarC = fp0.h.c(sb5.toString());
            return c0Var.b(new er.l() { // from class: f83.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.C1361o.O(b0VarC, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f83.a.ChangeInputCode changeInputCode, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            C1361o c1361o = new C1361o(eVar);
            c1361o.f60286f = changeInputCode;
            c1361o.f60287g = c0Var;
            return c1361o.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf83/a$f;", "<unused var>", "Lk10/c0;", "Lf83/b;", "state", "Lk10/l;", "<anonymous>", "(Lf83/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<f83.a.f, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60288e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f60289f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            return state;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f60289f;
            uq.b.e();
            if (this.f60288e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final State stateB = State.b((State) c0Var.a(), false, false, o.this.validateQrCodeUseCase.b(new t73.b.Params(((State) c0Var.a()).getQrCode(), o.this.activationProcessType instanceof k83.a.InterfaceC2600a, null)), null, false, false, null, 123, null);
            if (!(stateB.getCodeValidationState() instanceof hz.b.d)) {
                return c0Var.b(new er.l() { // from class: f83.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o.p.O(stateB, (State) obj2);
                    }
                });
            }
            o.this.d9(new f83.a.VerifyCode(((State) c0Var.a()).getQrCode(), null));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f83.a.f fVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            p pVar = o.this.new p(eVar);
            pVar.f60289f = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf83/a$n;", "action", "Lk10/c0;", "Lf83/b;", "state", "Lk10/l;", "<anonymous>", "(Lf83/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<f83.a.VerifyCode, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f60292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f60293g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, false, false, null, null, true, false, null, 111, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f83.a.VerifyCode verifyCode = (f83.a.VerifyCode) this.f60292f;
            c0 c0Var = (c0) this.f60293g;
            uq.b.e();
            if (this.f60291e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((State) c0Var.a()).getIsProcessing()) {
                return c0Var.c();
            }
            o.this.d9(new f83.a.ProcessCode(verifyCode.getQrCode(), null));
            return c0Var.b(new er.l() { // from class: f83.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.q.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f83.a.VerifyCode verifyCode, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            q qVar = o.this.new q(eVar);
            qVar.f60292f = verifyCode;
            qVar.f60293g = c0Var;
            return qVar.J(i0.f148189a);
        }
    }

    public o(g83.q qVar, a14.x xVar, t73.b bVar, gp0.c cVar, ac4.a aVar, a14.q qVar2, g83.l lVar, sz.d dVar, yy.a aVar2, ac4.r<String> rVar, oz.q qVar3, h14.b bVar2, a14.m mVar, mz3.j jVar, k83.a aVar3) {
        this.scannerMapper = qVar;
        this.requestCameraPermissionUseCase = xVar;
        this.validateQrCodeUseCase = bVar;
        this.getPackageUseCase = cVar;
        this.callActionWithLoaderUseCase = aVar;
        this.goToStoreIntentUseCase = qVar2;
        this.genericDomainErrorMapper = lVar;
        this.scanCameraUseCase = rVar;
        this.ownerViewLifecycleManager = qVar3;
        this.isCameraPermissionGrantedUseCase = bVar2;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.generateDocumentsAsyncUseCase = jVar;
        this.activationProcessType = aVar3;
        State state = new State(false, false, null, null, false, false, dVar, 63, null);
        this.initialState = state;
        ju.k.d(u0.a(this), null, null, new a(null), 3, null);
        this.lifecycleConnector = qVar3;
        this.stateMachine = aVar2.a(state, new er.l() { // from class: f83.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.E9(this.f60209a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), A9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f83.c.Data A9(State state) {
        g83.q qVar = this.scannerMapper;
        er.a<i0> aVarB9 = b9(f83.a.C1356a.f60135a);
        er.a<i0> aVarB10 = b9(f83.a.e.f60140a);
        return qVar.b(new g83.q.Params(state, new g83.q.Params.ActionsHandler(aVarB9, b9(f83.a.f.f60141a), new er.l() { // from class: f83.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.B9(this.f60205a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: f83.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.C9(this.f60206a, (String) obj);
            }
        }, aVarB10, b9(f83.a.j.f60146a))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(o oVar, boolean z15) {
        oVar.d9(new f83.a.ChangeBottomSheetVisibility(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(o oVar, String str) {
        oVar.d9(new f83.a.ChangeInputCode(fp0.h.b(iy.c0.g(str)), null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(final o oVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: f83.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.F9(this.f60207a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(o oVar, k10.z zVar) {
        i iVar = oVar.new i(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(f83.a.C1356a.class), oVar2, iVar);
        zVar.A(oVar.new j(null));
        k10.k.s(zVar, (mu.g) oVar.scanCameraUseCase.a(new sx.b.Analyzer(sx.d.BACK, 0.0f, new sx.e.SingleQrScanner(null, 1, null), 2, null)), null, oVar.new k(null), 2, null);
        zVar.v(q0.c(f83.a.d.class), oVar2, oVar.new l(null));
        zVar.v(q0.c(f83.a.e.class), oVar2, new m(null));
        zVar.v(q0.c(f83.a.ChangeBottomSheetVisibility.class), oVar2, new n(null));
        zVar.v(q0.c(f83.a.ChangeInputCode.class), oVar2, new C1361o(null));
        zVar.v(q0.c(f83.a.f.class), oVar2, oVar.new p(null));
        zVar.v(q0.c(f83.a.VerifyCode.class), oVar2, oVar.new q(null));
        zVar.x(q0.c(f83.a.j.class), oVar2, oVar.new c(null));
        zVar.v(q0.c(f83.a.ProcessCode.class), oVar2, oVar.new d(null));
        zVar.x(q0.c(f83.a.GoToActivationCode.class), oVar2, oVar.new e(null));
        zVar.x(q0.c(f83.a.Error.class), oVar2, oVar.new f(null));
        zVar.x(q0.c(f83.a.k.class), oVar2, oVar.new g(null));
        zVar.x(q0.c(f83.a.h.class), oVar2, oVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b x9(dx.b error) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: f83.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.y9(this.f60208a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(o oVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Primary) {
            oVar.d9(f83.a.k.f60147a);
        }
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(k83.a aVar) {
        super.P5(aVar);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<f83.a.l> Y1() {
        return this.navAction;
    }

    @Override // f83.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<State, f83.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f83.c.Data> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(f83.a.l lVar, tq.e<? super i0> eVar) {
        return super.F(lVar, eVar);
    }
}
