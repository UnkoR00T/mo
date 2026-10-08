package w82;

import androidx.p016lifecycle.u0;
import fr.q0;
import java.util.List;
import k10.c0;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import vy.Coordinates;
import w04.LocationCoordinates;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u008b\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J&\u0010/\u001a\u00020.2\u0006\u0010*\u001a\u00020)2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0082@¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\u0002H\u0002¢\u0006\u0004\b3\u00104J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0096\u0001¢\u0006\u0004\b7\u00108J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020905H\u0096\u0001¢\u0006\u0004\b:\u00108J\u0018\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020;H\u0096\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020=H\u0096\u0001¢\u0006\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010h\u001a\u00020c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR&\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030i8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR \u0010r\u001a\b\u0012\u0004\u0012\u00020o058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bP\u00108R \u0010y\u001a\b\u0012\u0004\u0012\u00020t0s8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR \u00101\u001a\b\u0012\u0004\u0012\u0002020z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010{\u001a\u0004\b|\u0010}¨\u0006~"}, d2 = {"Lw82/h;", "Ll00/g;", "Lw82/b;", "Lw82/a;", "Lw82/c;", "", "Lnx/b;", "Li70/e;", "Lmx/c;", "labelProvider", "Lx82/e;", "mapScreenMapper", "Lyy/a;", "stateMachineFactory", "Li70/n;", "snackBarManagerStateHolder", "Le14/g;", "getLocationUseCase", "Le14/d;", "getAddressUseCase", "Le14/a;", "checkAllConditionsToGetLocationUseCase", "Lay/k;", "networkConnectionManager", "Lx82/c;", "mapErrorMapper", "Li14/b;", "getGpsCurrentStatus", "Luy/d;", "gpsManager", "Loz/q;", "ownerViewLifecycleManager", "globalSnackBarManager", "La14/m;", "goToApplicationDetailsSettingsUseCase", "La14/n;", "goToDeviceLocationSettingsUseCase", "Lt82/a;", "contract", "<init>", "(Lmx/c;Lx82/e;Lyy/a;Li70/n;Le14/g;Le14/d;Le14/a;Lay/k;Lx82/c;Li14/b;Luy/d;Loz/q;Li70/e;La14/m;La14/n;Lt82/a;)V", "Lvy/c;", "coordinates", "", "Lmx/a;", "voivodeshipNames", "Lw04/c;", "y9", "(Lvy/c;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "state", "Lw82/c$a;", "z9", "(Lw82/b;)Lw82/c$a;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lmx/c;", "c", "Lx82/e;", "d", "Li70/n;", "e", "Le14/g;", "f", "Le14/d;", "g", "Le14/a;", "h", "Lay/k;", "j", "Lx82/c;", "k", "Li14/b;", "l", "Luy/d;", "m", "Loz/q;", "n", "Li70/e;", "p", "La14/m;", "q", "La14/n;", "r", "Lt82/a;", "s", "Lw82/b;", "initialState", "Loz/j;", "t", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "v", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Li70/p;", "w", "Lmu/g;", "snackBarVisibilityState", "Lxw/b;", "Lw82/a$d;", "x", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lmu/p0;", "getState", "()Lmu/p0;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h extends l00.g<State, w82.a> implements w82.c, zx.d, nx.b, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x82.e mapScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e14.g getLocationUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e14.d getAddressUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e14.a checkAllConditionsToGetLocationUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ay.k networkConnectionManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final x82.c mapErrorMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i14.b getGpsCurrentStatus;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final uy.d gpsManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a14.n goToDeviceLocationSettingsUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final t82.a contract;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, w82.a> stateMachine;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final mu.g<i70.p> snackBarVisibilityState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final xw.b<w82.a.d> navAction;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final p0<w82.c.Data> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f210976e;

        /* JADX INFO: renamed from: w82.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnx/a;", "viewLifecycle", "Loq/i0;", "<anonymous>", "(Lnx/a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C5542a extends vq.k implements er.p<nx.a, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f210978e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f210979f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ h f210980g;

            /* JADX INFO: renamed from: w82.h$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C5543a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f210981a;

                static {
                    int[] iArr = new int[nx.a.values().length];
                    try {
                        iArr[nx.a.RESUMED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[nx.a.PAUSED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f210981a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5542a(h hVar, tq.e<? super C5542a> eVar) {
                super(2, eVar);
                this.f210980g = hVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                nx.a aVar = (nx.a) this.f210979f;
                uq.b.e();
                if (this.f210978e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                int i15 = C5543a.f210981a[aVar.ordinal()];
                if (i15 == 1) {
                    this.f210980g.d9(w82.a.g.f210927a);
                } else if (i15 == 2) {
                    this.f210980g.d9(w82.a.f.f210926a);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(nx.a aVar, tq.e<? super i0> eVar) {
                return ((C5542a) v(aVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C5542a c5542a = new C5542a(this.f210980g, eVar);
                c5542a.f210979f = obj;
                return c5542a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f210976e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarS = mu.i.S(h.this.x8(), new C5542a(h.this, null));
                this.f210976e = 1;
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
            return h.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<w82.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f210982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f210983b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f210984a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f210985b;

            /* JADX INFO: renamed from: w82.h$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5544a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f210986d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f210987e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f210988f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f210990h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f210991j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f210992k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f210993l;

                public C5544a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f210986d = obj;
                    this.f210987e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, h hVar2) {
                this.f210984a = hVar;
                this.f210985b = hVar2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5544a c5544a;
                if (eVar instanceof C5544a) {
                    c5544a = (C5544a) eVar;
                    int i15 = c5544a.f210987e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5544a.f210987e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5544a = new C5544a(eVar);
                    }
                } else {
                    c5544a = new C5544a(eVar);
                }
                Object obj2 = c5544a.f210986d;
                Object objE = uq.b.e();
                int i16 = c5544a.f210987e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f210984a;
                    w82.c.Data dataZ9 = this.f210985b.z9((State) obj);
                    c5544a.f210988f = vq.j.a(obj);
                    c5544a.f210990h = vq.j.a(c5544a);
                    c5544a.f210991j = vq.j.a(obj);
                    c5544a.f210992k = vq.j.a(hVar);
                    c5544a.f210993l = 0;
                    c5544a.f210987e = 1;
                    if (hVar.F(dataZ9, c5544a) == objE) {
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

        public b(mu.g gVar, h hVar) {
            this.f210982a = gVar;
            this.f210983b = hVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super w82.c.Data> hVar, tq.e eVar) {
            Object objA = this.f210982a.a(new a(hVar, this.f210983b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lw82/a$g;", "<unused var>", "Lk10/c0;", "Lw82/b;", "state", "Lk10/l;", "<anonymous>", "(Lw82/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<w82.a.g, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f210994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f210995f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(e14.a.InterfaceC1068a interfaceC1068a, State state) {
            LocationCoordinates locationCoordinatesB;
            LocationCoordinates locationCoordinates = state.getLocationCoordinates();
            if (locationCoordinates != null) {
                boolean z15 = false;
                boolean z16 = true;
                if (!state.getLocationCoordinates().getHadGpsPermission() || interfaceC1068a == e14.a.InterfaceC1068a.EnumC1069a.NO_PERMISSIONS) {
                    z16 = false;
                }
                if (state.getLocationCoordinates().getIsMyLocationEnabled() && interfaceC1068a != e14.a.InterfaceC1068a.EnumC1069a.NO_GPS_ENABLED) {
                    z15 = true;
                }
                locationCoordinatesB = LocationCoordinates.b(locationCoordinates, null, z15, z16, 1, null);
            } else {
                locationCoordinatesB = null;
            }
            return State.b(state, locationCoordinatesB, null, null, false, null, false, 62, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            LocationCoordinates locationCoordinates = state.getLocationCoordinates();
            return State.b(state, locationCoordinates != null ? LocationCoordinates.b(locationCoordinates, null, true, true, 1, null) : null, null, null, false, null, false, 62, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f210995f;
            Object objE = uq.b.e();
            int i15 = this.f210994e;
            if (i15 == 0) {
                oq.u.b(obj);
                h.this.gpsManager.a();
                e14.a aVar = h.this.checkAllConditionsToGetLocationUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f210995f = c0Var;
                this.f210994e = 1;
                obj = aVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final e14.a.InterfaceC1068a interfaceC1068a = (e14.a.InterfaceC1068a) obj;
            if (interfaceC1068a instanceof e14.a.InterfaceC1068a.EnumC1069a) {
                return c0Var.b(new er.l() { // from class: w82.j
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h.c.V(interfaceC1068a, (State) obj2);
                    }
                });
            }
            if (fr.t.c(interfaceC1068a, e14.a.InterfaceC1068a.b.f46876a)) {
                return c0Var.b(new er.l() { // from class: w82.k
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h.c.X((State) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(w82.a.g gVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = h.this.new c(eVar);
            cVar.f210995f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw82/a$f;", "<unused var>", "Lw82/b;", "Loq/i0;", "<anonymous>", "(Lw82/a$f;Lw82/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<w82.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f210997e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f210997e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h.this.gpsManager.e();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(w82.a.f fVar, State state, tq.e<? super i0> eVar) {
            return h.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lw82/a$h;", "<unused var>", "Lk10/c0;", "Lw82/b;", "state", "Lk10/l;", "<anonymous>", "(Lw82/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<w82.a.h, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f210999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211000f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f211000f;
            uq.b.e();
            if (this.f210999e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h.this.snackBarManagerStateHolder.B0();
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(w82.a.h hVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = h.this.new e(eVar);
            eVar2.f211000f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw82/a$e;", "<unused var>", "Lw82/b;", "state", "Loq/i0;", "<anonymous>", "(Lw82/a$e;Lw82/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<w82.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211002e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211003f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f211003f;
            Object objE = uq.b.e();
            int i15 = this.f211002e;
            if (i15 == 0) {
                oq.u.b(obj);
                h.this.contract.P8(state.getViolationAddress());
                xw.b<w82.a.d> bVarY1 = h.this.Y1();
                w82.a.d.C5541a c5541a = w82.a.d.C5541a.f210923a;
                this.f211003f = vq.j.a(state);
                this.f211002e = 1;
                if (bVarY1.F(c5541a, this) == objE) {
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
        public final Object w(w82.a.e eVar, State state, tq.e<? super i0> eVar2) {
            f fVar = h.this.new f(eVar2);
            fVar.f211003f = state;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lw82/b;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f211006f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f211007g;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(LocationCoordinates locationCoordinates, LocationDetails locationDetails, State state) {
            return State.b(state, locationCoordinates, locationCoordinates.getCoordinates(), null, true, locationDetails, false, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final LocationCoordinates locationCoordinates;
            c0 c0Var = (c0) this.f211007g;
            Object objE = uq.b.e();
            int i15 = this.f211006f;
            if (i15 != 0) {
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    locationCoordinates = (LocationCoordinates) this.f211005e;
                    oq.u.b(obj);
                }
                final LocationDetails locationDetails = (LocationDetails) obj;
                return c0Var.b(new er.l() { // from class: w82.i
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h.g.O(locationCoordinates, locationDetails, (State) obj2);
                    }
                });
            }
            oq.u.b(obj);
            e14.g gVar = h.this.getLocationUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            this.f211007g = c0Var;
            this.f211006f = 1;
            obj = gVar.a(c1792a, this);
            if (obj != objE) {
            }
            return objE;
            LocationCoordinates locationCoordinates2 = (LocationCoordinates) obj;
            h hVar = h.this;
            Coordinates coordinates = locationCoordinates2.getCoordinates();
            List<Label> listD = h.this.labelProvider.d(v72.a.f204237a);
            this.f211007g = c0Var;
            this.f211005e = locationCoordinates2;
            this.f211006f = 2;
            Object objY9 = hVar.y9(coordinates, listD, this);
            if (objY9 != objE) {
                locationCoordinates = locationCoordinates2;
                obj = objY9;
                final LocationDetails locationDetails2 = (LocationDetails) obj;
                return c0Var.b(new er.l() { // from class: w82.i
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h.g.O(locationCoordinates, locationDetails2, (State) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((g) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = h.this.new g(eVar);
            gVar.f211007g = obj;
            return gVar;
        }
    }

    /* JADX INFO: renamed from: w82.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "isGpsActive", "Lk10/c0;", "Lw82/b;", "state", "Lk10/l;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C5545h extends vq.k implements er.q<Boolean, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f211010f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f211011g;

        C5545h(tq.e<? super C5545h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(boolean z15, State state) {
            LocationCoordinates locationCoordinates = state.getLocationCoordinates();
            return State.b(state, locationCoordinates != null ? LocationCoordinates.b(locationCoordinates, null, z15, false, 5, null) : null, null, null, false, null, false, 62, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15 = this.f211010f;
            c0 c0Var = (c0) this.f211011g;
            uq.b.e();
            if (this.f211009e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: w82.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return h.C5545h.O(z15, (State) obj2);
                }
            });
        }

        public final Object N(boolean z15, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            C5545h c5545h = new C5545h(eVar);
            c5545h.f211010f = z15;
            c5545h.f211011g = c0Var;
            return c5545h.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, c0<State> c0Var, tq.e<? super k10.l<? extends State>> eVar) {
            return N(bool.booleanValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lw82/a$i;", "action", "Lk10/c0;", "Lw82/b;", "state", "Lk10/l;", "<anonymous>", "(Lw82/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<w82.a.PinChosen, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f211014g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(w82.a.PinChosen pinChosen, LocationDetails locationDetails, State state) {
            return State.b(state, null, pinChosen.getCoordinates(), null, true, locationDetails, true, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final w82.a.PinChosen pinChosen = (w82.a.PinChosen) this.f211013f;
            c0 c0Var = (c0) this.f211014g;
            Object objE = uq.b.e();
            int i15 = this.f211012e;
            if (i15 == 0) {
                oq.u.b(obj);
                h hVar = h.this;
                Coordinates coordinates = pinChosen.getCoordinates();
                List<Label> listB = pinChosen.b();
                this.f211013f = pinChosen;
                this.f211014g = c0Var;
                this.f211012e = 1;
                obj = hVar.y9(coordinates, listB, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final LocationDetails locationDetails = (LocationDetails) obj;
            return c0Var.b(new er.l() { // from class: w82.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return h.i.O(pinChosen, locationDetails, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w82.a.PinChosen pinChosen, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = h.this.new i(eVar);
            iVar.f211013f = pinChosen;
            iVar.f211014g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lw82/a$a;", "action", "Lk10/c0;", "Lw82/b;", "state", "Lk10/l;", "<anonymous>", "(Lw82/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<w82.a.GetLocation, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f211017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f211018g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f211019h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f211020j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f211021k;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(e14.a.InterfaceC1068a interfaceC1068a, State state) {
            LocationCoordinates locationCoordinatesB;
            LocationCoordinates locationCoordinates = state.getLocationCoordinates();
            if (locationCoordinates != null) {
                boolean z15 = false;
                boolean z16 = true;
                if (!state.getLocationCoordinates().getHadGpsPermission() || interfaceC1068a == e14.a.InterfaceC1068a.EnumC1069a.NO_PERMISSIONS) {
                    z16 = false;
                }
                if (state.getLocationCoordinates().getIsMyLocationEnabled() && interfaceC1068a != e14.a.InterfaceC1068a.EnumC1069a.NO_GPS_ENABLED) {
                    z15 = true;
                }
                locationCoordinatesB = LocationCoordinates.b(locationCoordinates, null, z15, z16, 1, null);
            } else {
                locationCoordinatesB = null;
            }
            return State.b(state, locationCoordinatesB, null, null, false, null, false, 62, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(LocationCoordinates locationCoordinates, LocationDetails locationDetails, State state) {
            return State.b(state, locationCoordinates, locationCoordinates.getCoordinates(), null, true, locationDetails, false, 4, null);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0130  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e14.a.InterfaceC1068a interfaceC1068a;
            final e14.a.InterfaceC1068a interfaceC1068a2;
            LocationCoordinates locationCoordinates;
            Object objY9;
            final LocationCoordinates locationCoordinates2;
            w82.a.GetLocation getLocation = (w82.a.GetLocation) this.f211020j;
            c0 c0Var = (c0) this.f211021k;
            Object objE = uq.b.e();
            int i15 = this.f211019h;
            if (i15 == 0) {
                oq.u.b(obj);
                e14.a aVar = h.this.checkAllConditionsToGetLocationUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f211020j = getLocation;
                this.f211021k = c0Var;
                this.f211019h = 1;
                obj = aVar.a(c1792a, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 != 1) {
                if (i15 == 2) {
                    interfaceC1068a2 = (e14.a.InterfaceC1068a) this.f211016e;
                    oq.u.b(obj);
                    return c0Var.b(new er.l() { // from class: w82.n
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h.j.V(interfaceC1068a2, (State) obj2);
                        }
                    });
                }
                if (i15 == 3) {
                    interfaceC1068a = (e14.a.InterfaceC1068a) this.f211016e;
                    oq.u.b(obj);
                    locationCoordinates = (LocationCoordinates) obj;
                    h hVar = h.this;
                    Coordinates coordinates = locationCoordinates.getCoordinates();
                    List<Label> listA = getLocation.a();
                    this.f211020j = vq.j.a(getLocation);
                    this.f211021k = c0Var;
                    this.f211016e = vq.j.a(interfaceC1068a);
                    this.f211017f = locationCoordinates;
                    this.f211019h = 4;
                    objY9 = hVar.y9(coordinates, listA, this);
                    if (objY9 != objE) {
                        locationCoordinates2 = locationCoordinates;
                        obj = objY9;
                    }
                    return objE;
                }
                if (i15 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                locationCoordinates2 = (LocationCoordinates) this.f211017f;
                oq.u.b(obj);
                final LocationDetails locationDetails = (LocationDetails) obj;
                return c0Var.b(new er.l() { // from class: w82.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h.j.X(locationCoordinates2, locationDetails, (State) obj2);
                    }
                });
            }
            oq.u.b(obj);
            interfaceC1068a = (e14.a.InterfaceC1068a) obj;
            if (interfaceC1068a instanceof e14.a.InterfaceC1068a.EnumC1069a) {
                x82.c.Result resultB = h.this.mapErrorMapper.b(new x82.c.Params((e14.a.InterfaceC1068a.EnumC1069a) interfaceC1068a, h.this.b9(w82.a.c.f210922a), h.this.b9(w82.a.b.f210921a)));
                h hVar2 = h.this;
                w82.a.d.ShowDialog showDialog = new w82.a.d.ShowDialog(resultB.getDialog());
                this.f211020j = vq.j.a(getLocation);
                this.f211021k = c0Var;
                this.f211016e = interfaceC1068a;
                this.f211017f = vq.j.a(resultB);
                this.f211018g = 0;
                this.f211019h = 2;
                if (hVar2.F(showDialog, this) != objE) {
                    interfaceC1068a2 = interfaceC1068a;
                    return c0Var.b(new er.l() { // from class: w82.n
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h.j.V(interfaceC1068a2, (State) obj2);
                        }
                    });
                }
            } else {
                if (!fr.t.c(interfaceC1068a, e14.a.InterfaceC1068a.b.f46876a)) {
                    throw new oq.p();
                }
                LocationCoordinates locationCoordinates3 = ((State) c0Var.a()).getLocationCoordinates();
                if (locationCoordinates3 == null || !locationCoordinates3.getIsMyLocationEnabled()) {
                    h.this.d9(new w82.a.ShowGlobalSnackBar(h.this.labelProvider.c(v72.b.f204262i)));
                }
                e14.g gVar = h.this.getLocationUseCase;
                gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                this.f211020j = getLocation;
                this.f211021k = c0Var;
                this.f211016e = vq.j.a(interfaceC1068a);
                this.f211019h = 3;
                obj = gVar.a(c1792a2, this);
                if (obj != objE) {
                    locationCoordinates = (LocationCoordinates) obj;
                    h hVar3 = h.this;
                    Coordinates coordinates2 = locationCoordinates.getCoordinates();
                    List<Label> listA2 = getLocation.a();
                    this.f211020j = vq.j.a(getLocation);
                    this.f211021k = c0Var;
                    this.f211016e = vq.j.a(interfaceC1068a);
                    this.f211017f = locationCoordinates;
                    this.f211019h = 4;
                    objY9 = hVar3.y9(coordinates2, listA2, this);
                    if (objY9 != objE) {
                        locationCoordinates2 = locationCoordinates;
                        obj = objY9;
                        final LocationDetails locationDetails2 = (LocationDetails) obj;
                        return c0Var.b(new er.l() { // from class: w82.o
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return h.j.X(locationCoordinates2, locationDetails2, (State) obj2);
                            }
                        });
                    }
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(w82.a.GetLocation getLocation, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = h.this.new j(eVar);
            jVar.f211020j = getLocation;
            jVar.f211021k = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw82/a$c;", "<unused var>", "Lw82/b;", "Loq/i0;", "<anonymous>", "(Lw82/a$c;Lw82/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<w82.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211023e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f211023e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = h.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            h hVar = h.this;
            if (iVarA instanceof dx.i.Left) {
                hVar.d9(new w82.a.ShowSnackBar(hVar.labelProvider.c(v72.b.N1)));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(w82.a.c cVar, State state, tq.e<? super i0> eVar) {
            return h.this.new k(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw82/a$b;", "<unused var>", "Lw82/b;", "Loq/i0;", "<anonymous>", "(Lw82/a$b;Lw82/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<w82.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211025e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f211025e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.n nVar = h.this.goToDeviceLocationSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f211025e = 1;
                obj = nVar.c(c1792a, this);
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
            h hVar = h.this;
            if (iVar instanceof dx.i.Left) {
                hVar.d9(new w82.a.ShowSnackBar(hVar.labelProvider.c(v72.b.N1)));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(w82.a.b bVar, State state, tq.e<? super i0> eVar) {
            return h.this.new l(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw82/a$k;", "action", "Lw82/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lw82/a$k;Lw82/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<w82.a.ShowSnackBar, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211028f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            w82.a.ShowSnackBar showSnackBar = (w82.a.ShowSnackBar) this.f211028f;
            uq.b.e();
            if (this.f211027e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h.this.snackBarManagerStateHolder.y(new p50.a.DefaultWithIcon(showSnackBar.getMessageLabel(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(w82.a.ShowSnackBar showSnackBar, State state, tq.e<? super i0> eVar) {
            m mVar = h.this.new m(eVar);
            mVar.f211028f = showSnackBar;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw82/a$j;", "action", "Lw82/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lw82/a$j;Lw82/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<w82.a.ShowGlobalSnackBar, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211031f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            w82.a.ShowGlobalSnackBar showGlobalSnackBar = (w82.a.ShowGlobalSnackBar) this.f211031f;
            uq.b.e();
            if (this.f211030e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h.this.y(new p50.a.DefaultWithIcon(showGlobalSnackBar.getMessageLabel(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(w82.a.ShowGlobalSnackBar showGlobalSnackBar, State state, tq.e<? super i0> eVar) {
            n nVar = h.this.new n(eVar);
            nVar.f211031f = showGlobalSnackBar;
            return nVar.J(i0.f148189a);
        }
    }

    public h(mx.c cVar, x82.e eVar, yy.a aVar, i70.n nVar, e14.g gVar, e14.d dVar, e14.a aVar2, ay.k kVar, x82.c cVar2, i14.b bVar, uy.d dVar2, oz.q qVar, i70.e eVar2, a14.m mVar, a14.n nVar2, t82.a aVar3) {
        this.labelProvider = cVar;
        this.mapScreenMapper = eVar;
        this.snackBarManagerStateHolder = nVar;
        this.getLocationUseCase = gVar;
        this.getAddressUseCase = dVar;
        this.checkAllConditionsToGetLocationUseCase = aVar2;
        this.networkConnectionManager = kVar;
        this.mapErrorMapper = cVar2;
        this.getGpsCurrentStatus = bVar;
        this.gpsManager = dVar2;
        this.ownerViewLifecycleManager = qVar;
        this.globalSnackBarManager = eVar2;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.goToDeviceLocationSettingsUseCase = nVar2;
        this.contract = aVar3;
        State state = new State(null, null, null, false, null, false, 16, null);
        this.initialState = state;
        this.lifecycleConnector = qVar;
        ju.k.d(u0.a(this), null, null, new a(null), 3, null);
        this.stateMachine = aVar.a(state, new er.l() { // from class: w82.g
            @Override // er.l
            public final Object b(Object obj) {
                return h.C9(this.f210954a, (k10.v) obj);
            }
        });
        this.snackBarVisibilityState = a9(nVar.j(), i70.p.a.f89857a);
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), z9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(h hVar, Coordinates coordinates) {
        hVar.d9(new w82.a.PinChosen(coordinates, hVar.labelProvider.d(v72.a.f204237a)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(final h hVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: w82.d
            @Override // er.l
            public final Object b(Object obj) {
                return h.D9(this.f210951a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(final h hVar, k10.z zVar) {
        zVar.A(hVar.new g(null));
        k10.k.m(zVar, mu.i.q((mu.g) hVar.getGpsCurrentStatus.a(gz.b.a.C1792a.f78542a), new er.p() { // from class: w82.f
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Boolean.valueOf(h.E9(this.f210953a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue()));
            }
        }), null, new C5545h(null), 2, null);
        i iVar = hVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(w82.a.PinChosen.class), oVar, iVar);
        zVar.v(q0.c(w82.a.GetLocation.class), oVar, hVar.new j(null));
        zVar.x(q0.c(w82.a.c.class), oVar, hVar.new k(null));
        zVar.x(q0.c(w82.a.b.class), oVar, hVar.new l(null));
        zVar.x(q0.c(w82.a.ShowSnackBar.class), oVar, hVar.new m(null));
        zVar.x(q0.c(w82.a.ShowGlobalSnackBar.class), oVar, hVar.new n(null));
        zVar.v(q0.c(w82.a.g.class), oVar, hVar.new c(null));
        zVar.x(q0.c(w82.a.f.class), oVar, hVar.new d(null));
        zVar.v(q0.c(w82.a.h.class), oVar, hVar.new e(null));
        zVar.x(q0.c(w82.a.e.class), oVar, hVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E9(h hVar, boolean z15, boolean z16) {
        LocationCoordinates locationCoordinates = hVar.getState().getValue().getLocationCoordinates();
        return (locationCoordinates != null ? locationCoordinates.getIsMyLocationEnabled() : false) == z16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y9(Coordinates coordinates, List<Label> list, tq.e<? super LocationDetails> eVar) {
        boolean zE = this.networkConnectionManager.e();
        if (zE) {
            return this.getAddressUseCase.b(new e14.d.Params(coordinates, list), eVar);
        }
        if (zE) {
            throw new oq.p();
        }
        return new LocationDetails(null, null, null, null, null, null, null, coordinates, CertificateBody.profileType, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w82.c.Data z9(State state) {
        return this.mapScreenMapper.b(new x82.e.Params(state, new er.l() { // from class: w82.e
            @Override // er.l
            public final Object b(Object obj) {
                return h.A9(this.f210952a, (Coordinates) obj);
            }
        }, b9(new w82.a.GetLocation(this.labelProvider.d(v72.a.f204237a))), b9(w82.a.h.f210928a), b9(w82.a.e.f210925a), b9(w82.a.c.f210922a), b9(w82.a.b.f210921a)));
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(t82.a aVar) {
        super.P5(aVar);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<w82.a.d> Y1() {
        return this.navAction;
    }

    @Override // w82.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<State, w82.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<w82.c.Data> getState() {
        return this.state;
    }

    @Override // w82.c
    public mu.g<i70.p> j() {
        return this.snackBarVisibilityState;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(w82.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
