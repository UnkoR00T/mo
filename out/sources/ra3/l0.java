package ra3;

import android.graphics.Bitmap;
import jb4.PayloadErrorData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v93.CountryDetailsFormatted;
import v93.InfoItem;
import ya3.SetupData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 m2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001TB\u0083\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u0004\u0018\u00010,*\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0016\u00101\u001a\b\u0012\u0004\u0012\u0002000/H\u0096\u0001¢\u0006\u0004\b1\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010V\u001a\u00020Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR \u0010]\u001a\b\u0012\u0004\u0012\u00020X0W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030^8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR \u0010'\u001a\b\u0012\u0004\u0012\u00020(0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0018\u0010l\u001a\u00020i*\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006n"}, d2 = {"Lra3/l0;", "Ll00/g;", "Lra3/k;", "Lra3/e;", "Lra3/l;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lta3/e;", "mapper", "Lx93/d;", "travelAbroadServiceInteractor", "Lac4/a;", "callActionWithLoaderUseCase", "Lw93/a;", "getCountryDetailsFormattedUC", "Lhb4/d;", "errorVmsFactory", "Lcb4/j;", "dialogVMSFactory", "Lib4/c;", "errorMapper", "La14/w;", "openUrlUseCase", "Li70/e;", "globalSnackBarManager", "Lta3/a;", "dialogMapper", "Ldy/a;", "notificationSettingsManager", "La14/p;", "goToNotificationSettingsUseCase", "Loz/q;", "ownerViewLifecycleManager", "Lra3/f;", "data", "<init>", "(Lyy/a;Lta3/e;Lx93/d;Lac4/a;Lw93/a;Lhb4/d;Lcb4/j;Lib4/c;La14/w;Li70/e;Lta3/a;Ldy/a;La14/p;Loz/q;Lra3/f;)V", "state", "Lra3/l$a;", "O9", "(Lra3/k;)Lra3/l$a;", "Ldx/b;", "Ljb4/f;", "N9", "(Ldx/b;)Ljb4/f;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "b", "Lta3/e;", "c", "Lx93/d;", "d", "Lac4/a;", "e", "Lw93/a;", "f", "Lhb4/d;", "g", "Lcb4/j;", "h", "Lib4/c;", "j", "La14/w;", "k", "Li70/e;", "l", "Lta3/a;", "m", "Ldy/a;", "n", "La14/p;", "p", "Loz/q;", "Lra3/h;", "q", "Lra3/h;", "initialState", "Loz/j;", "r", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lxw/b;", "Lra3/e$a;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "Ljb4/b;", "M9", "(Ldx/b;)Ljb4/b;", "errorData", "w", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 extends l00.g<ra3.k, ra3.e> implements ra3.l, zx.d, nx.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final a f172635w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f172636x = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ta3.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x93.d travelAbroadServiceInteractor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w93.a getCountryDetailsFormattedUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVmsFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ta3.a dialogMapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final dy.a notificationSettingsManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a14.p goToNotificationSettingsUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Fetching initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ra3.e.a> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ra3.k, ra3.e> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ra3.l.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lra3/l0$a;", "", "<init>", "()V", "", "BUSINESS_SUBSCRIPTIONS_EXCEEDED", "Ljava/lang/String;", "BUSINESS_REQUEST_LIMIT_EXCEEDED", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ra3.l.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f172655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f172656b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f172657a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0 f172658b;

            /* JADX INFO: renamed from: ra3.l0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4405a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f172659d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f172660e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f172661f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f172663h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f172664j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f172665k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f172666l;

                public C4405a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f172659d = obj;
                    this.f172660e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, l0 l0Var) {
                this.f172657a = hVar;
                this.f172658b = l0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4405a c4405a;
                if (eVar instanceof C4405a) {
                    c4405a = (C4405a) eVar;
                    int i15 = c4405a.f172660e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4405a.f172660e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4405a = new C4405a(eVar);
                    }
                } else {
                    c4405a = new C4405a(eVar);
                }
                Object obj2 = c4405a.f172659d;
                Object objE = uq.b.e();
                int i16 = c4405a.f172660e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f172657a;
                    ra3.l.a aVarO9 = this.f172658b.O9((ra3.k) obj);
                    c4405a.f172661f = vq.j.a(obj);
                    c4405a.f172663h = vq.j.a(c4405a);
                    c4405a.f172664j = vq.j.a(obj);
                    c4405a.f172665k = vq.j.a(hVar);
                    c4405a.f172666l = 0;
                    c4405a.f172660e = 1;
                    if (hVar.F(aVarO9, c4405a) == objE) {
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

        public b(mu.g gVar, l0 l0Var) {
            this.f172655a = gVar;
            this.f172656b = l0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super ra3.l.a> hVar, tq.e eVar) {
            Object objA = this.f172655a.a(new a(hVar, this.f172656b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lra3/e$b;", "<unused var>", "Lra3/k;", "state", "Loq/i0;", "<anonymous>", "(Lra3/e$b;Lra3/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ra3.e.b, ra3.k, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172668f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ SetupData f172670h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SetupData setupData, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f172670h = setupData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ra3.k kVar = (ra3.k) this.f172668f;
            Object objE = uq.b.e();
            int i15 = this.f172667e;
            if (i15 == 0) {
                oq.u.b(obj);
                l0 l0Var = l0.this;
                ra3.e.a.ToCountryList toCountryList = new ra3.e.a.ToCountryList(this.f172670h.getIsoCode(), kVar.getIsSubscribed());
                this.f172668f = vq.j.a(kVar);
                this.f172667e = 1;
                if (l0Var.F(toCountryList, this) == objE) {
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
        public final Object w(ra3.e.b bVar, ra3.k kVar, tq.e<? super oq.i0> eVar) {
            c cVar = l0.this.new c(this.f172670h, eVar);
            cVar.f172668f = kVar;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lra3/i;", "state", "Lk10/l;", "Lra3/k;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<Changing>, tq.e<? super k10.l<? extends ra3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172672f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lra3/k$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ra3.k.a>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f172674e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f172675f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Changing> f172676g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ l0 f172677h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k10.c0<Changing> c0Var, l0 l0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f172676g = c0Var;
                this.f172677h = l0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error Y(k10.c0 c0Var, l0 l0Var, dx.b bVar, Changing changing) {
                return new Error(((Changing) c0Var.a()).getIsSubscribed(), ((Changing) c0Var.a()).getCountryDetails(), l0Var.errorVmsFactory.a(l0Var.M9(bVar)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ra3.k.a.Initialized Z(k10.c0 c0Var, Changing changing) {
                return new ra3.k.a.Initialized(((Changing) c0Var.a()).getIsSubscribed(), ((Changing) c0Var.a()).getCountryDetails());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ra3.k.a.Initialized a0(boolean z15, k10.c0 c0Var, Changing changing) {
                return new ra3.k.a.Initialized(z15, ((Changing) c0Var.a()).getCountryDetails());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                int i15;
                Object objE = uq.b.e();
                int i16 = this.f172675f;
                if (i16 == 0) {
                    oq.u.b(obj);
                    boolean z15 = !this.f172676g.a().getIsSubscribed();
                    x93.d dVar = this.f172677h.travelAbroadServiceInteractor;
                    String isoCode = this.f172676g.a().getCountryDetails().getIsoCode();
                    this.f172674e = z15 ? 1 : 0;
                    this.f172675f = 1;
                    Object objG = dVar.g(z15, isoCode, this);
                    if (objG == objE) {
                        return objE;
                    }
                    i15 = z15 ? 1 : 0;
                    obj = objG;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i15 = this.f172674e;
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                final l0 l0Var = this.f172677h;
                final k10.c0<Changing> c0Var = this.f172676g;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final boolean z16 = i15 != 0;
                    return c0Var.d(new er.l() { // from class: ra3.o0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l0.d.a.a0(z16, c0Var, (Changing) obj2);
                        }
                    });
                }
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                PayloadErrorData payloadErrorDataN9 = l0Var.N9(bVar);
                if (payloadErrorDataN9 == null || (!fr.t.c(payloadErrorDataN9.getCode(), "ALLOWED_SUBSCRIPTIONS_EXCEEDED") && !fr.t.c(payloadErrorDataN9.getCode(), "LIMIT_EXCEEDED"))) {
                    payloadErrorDataN9 = null;
                }
                if (payloadErrorDataN9 == null) {
                    return c0Var.d(new er.l() { // from class: ra3.m0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l0.d.a.Y(c0Var, l0Var, bVar, (Changing) obj2);
                        }
                    });
                }
                String title = payloadErrorDataN9.getTitle();
                if (title != null) {
                    l0Var.globalSnackBarManager.y(new p50.a.Default(mx.b.b(title, "snackbarTitle"), false, null, 6, null));
                }
                return c0Var.d(new er.l() { // from class: ra3.n0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l0.d.a.Z(c0Var, (Changing) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f172676g, this.f172677h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ra3.k.a>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f172672f;
            Object objE = uq.b.e();
            int i15 = this.f172671e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = l0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(c0Var, l0.this, null);
            this.f172672f = vq.j.a(c0Var);
            this.f172671e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Changing> c0Var, tq.e<? super k10.l<? extends ra3.k>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = l0.this.new d(eVar);
            dVar.f172672f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lra3/h;", "state", "Lk10/l;", "Lra3/k;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<Fetching>, tq.e<? super k10.l<? extends ra3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172679f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ SetupData f172681h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lra3/k;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ra3.k>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f172682e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l0 f172683f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ SetupData f172684g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<Fetching> f172685h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var, SetupData setupData, k10.c0<Fetching> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f172683f = l0Var;
                this.f172684g = setupData;
                this.f172685h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(k10.c0 c0Var, l0 l0Var, dx.b bVar, Fetching fetching) {
                return new Error(((Fetching) c0Var.a()).getIsSubscribed(), l0Var.errorVmsFactory.a(l0Var.M9(bVar)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ra3.k.a.Initialized Y(k10.c0 c0Var, CountryDetailsFormatted countryDetailsFormatted, Fetching fetching) {
                return new ra3.k.a.Initialized(((Fetching) c0Var.a()).getIsSubscribed(), countryDetailsFormatted);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f172682e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    w93.a aVar = this.f172683f.getCountryDetailsFormattedUC;
                    w93.a.Params params = new w93.a.Params(this.f172684g.getIsoCode());
                    this.f172682e = 1;
                    obj = aVar.e(params, this);
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
                final k10.c0<Fetching> c0Var = this.f172685h;
                final l0 l0Var = this.f172683f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ra3.p0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l0.e.a.X(c0Var, l0Var, bVar, (Fetching) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final CountryDetailsFormatted countryDetailsFormatted = (CountryDetailsFormatted) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ra3.q0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l0.e.a.Y(c0Var, countryDetailsFormatted, (Fetching) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f172683f, this.f172684g, this.f172685h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ra3.k>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SetupData setupData, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f172681h = setupData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f172679f;
            Object objE = uq.b.e();
            int i15 = this.f172678e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = l0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(l0.this, this.f172681h, c0Var, null);
            this.f172679f = vq.j.a(c0Var);
            this.f172678e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Fetching> c0Var, tq.e<? super k10.l<? extends ra3.k>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = l0.this.new e(this.f172681h, eVar);
            eVar2.f172679f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lra3/d;", "<unused var>", "Lk10/c0;", "Lra3/g;", "state", "Lk10/l;", "Lra3/k;", "<anonymous>", "(Lra3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ra3.d, k10.c0<Error>, tq.e<? super k10.l<? extends ra3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172687f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(k10.c0 c0Var, Error error) {
            return new Fetching(((Error) c0Var.a()).getIsSubscribed());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f172687f;
            uq.b.e();
            if (this.f172686e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ra3.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.f.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ra3.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ra3.k>> eVar) {
            f fVar = new f(eVar);
            fVar.f172687f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lra3/c;", "<unused var>", "Lra3/g;", "Loq/i0;", "<anonymous>", "(Lra3/c;Lra3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ra3.c, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172688e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f172688e;
            if (i15 == 0) {
                oq.u.b(obj);
                l0 l0Var = l0.this;
                ra3.e.a.C4398a c4398a = ra3.e.a.C4398a.f172579a;
                this.f172688e = 1;
                if (l0Var.F(c4398a, this) == objE) {
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
        public final Object w(ra3.c cVar, Error error, tq.e<? super oq.i0> eVar) {
            return l0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lra3/e$e;", "action", "Lra3/k$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lra3/e$e;Lra3/k$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ra3.e.OnInfoItemClick, ra3.k.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f172690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f172691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f172692g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
        
            if (r2.F(r3, r7) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
        
            if (r2.F(r4, r7) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f172692g
                ra3.e$e r0 = (ra3.e.OnInfoItemClick) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f172691f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r0 = r7.f172690e
                v93.f r0 = (v93.f) r0
                oq.u.b(r8)
                goto L86
            L23:
                oq.u.b(r8)
                v93.g r8 = r0.getInfoItem()
                v93.f r8 = r8.getContent()
                boolean r2 = r8 instanceof v93.f.Profile
                if (r2 == 0) goto L5a
                ra3.l0 r2 = ra3.l0.this
                ra3.e$a$e r3 = new ra3.e$a$e
                cb3.d r5 = new cb3.d
                r6 = r8
                v93.f$b r6 = (v93.f.Profile) r6
                v93.i r6 = r6.getData()
                r5.<init>(r6)
                r3.<init>(r5)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f172692g = r0
                java.lang.Object r8 = vq.j.a(r8)
                r7.f172690e = r8
                r7.f172691f = r4
                java.lang.Object r8 = r2.F(r3, r7)
                if (r8 != r1) goto L86
                goto L85
            L5a:
                boolean r2 = r8 instanceof v93.f.Contact
                if (r2 == 0) goto L89
                ra3.l0 r2 = ra3.l0.this
                ra3.e$a$c r4 = new ra3.e$a$c
                ua3.f r5 = new ua3.f
                r6 = r8
                v93.f$a r6 = (v93.f.Contact) r6
                java.util.Map r6 = r6.a()
                r5.<init>(r6)
                r4.<init>(r5)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f172692g = r0
                java.lang.Object r8 = vq.j.a(r8)
                r7.f172690e = r8
                r7.f172691f = r3
                java.lang.Object r8 = r2.F(r4, r7)
                if (r8 != r1) goto L86
            L85:
                return r1
            L86:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            L89:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ra3.l0.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ra3.e.OnInfoItemClick onInfoItemClick, ra3.k.a aVar, tq.e<? super oq.i0> eVar) {
            h hVar = l0.this.new h(eVar);
            hVar.f172692g = onInfoItemClick;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lra3/e$g;", "action", "Lra3/k$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lra3/e$g;Lra3/k$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ra3.e.OnUrlClick, ra3.k.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172695f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ra3.e.OnUrlClick onUrlClick = (ra3.e.OnUrlClick) this.f172695f;
            Object objE = uq.b.e();
            int i15 = this.f172694e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = l0.this.openUrlUseCase;
                a14.w.Params params = new a14.w.Params(onUrlClick.getUrl(), false, 2, null);
                this.f172695f = vq.j.a(onUrlClick);
                this.f172694e = 1;
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
            l0 l0Var = l0.this;
            if (iVar instanceof dx.i.Left) {
                l0Var.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ra3.e.OnUrlClick onUrlClick, ra3.k.a aVar, tq.e<? super oq.i0> eVar) {
            i iVar = l0.this.new i(eVar);
            iVar.f172695f = onUrlClick;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lra3/e$c;", "<unused var>", "Lk10/c0;", "Lra3/k$a$b;", "state", "Lk10/l;", "Lra3/k;", "<anonymous>", "(Lra3/e$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ra3.e.c, k10.c0<ra3.k.a.Initialized>, tq.e<? super k10.l<? extends ra3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172698f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ra3.k.a O(k10.c0 c0Var, ra3.k.a.Initialized initialized) {
            boolean isSubscribed = ((ra3.k.a.Initialized) c0Var.a()).getIsSubscribed();
            if (isSubscribed) {
                return new Changing(((ra3.k.a.Initialized) c0Var.a()).getIsSubscribed(), ((ra3.k.a.Initialized) c0Var.a()).getCountryDetails());
            }
            if (isSubscribed) {
                throw new oq.p();
            }
            return new ra3.k.a.InterfaceC4401a.Checking(((ra3.k.a.Initialized) c0Var.a()).getIsSubscribed(), ((ra3.k.a.Initialized) c0Var.a()).getCountryDetails());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f172698f;
            uq.b.e();
            if (this.f172697e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ra3.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.j.O(c0Var, (k.a.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ra3.e.c cVar, k10.c0<ra3.k.a.Initialized> c0Var, tq.e<? super k10.l<? extends ra3.k>> eVar) {
            j jVar = new j(eVar);
            jVar.f172698f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lra3/e$f;", "action", "Lra3/k$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lra3/e$f;Lra3/k$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ra3.e.OnMapClick, ra3.k.a.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172700f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ra3.e.OnMapClick onMapClick = (ra3.e.OnMapClick) this.f172700f;
            Object objE = uq.b.e();
            int i15 = this.f172699e;
            if (i15 == 0) {
                oq.u.b(obj);
                l0 l0Var = l0.this;
                ra3.e.a.ToMapPreview toMapPreview = new ra3.e.a.ToMapPreview(new SetupData(onMapClick.getBitmap()));
                this.f172700f = vq.j.a(onMapClick);
                this.f172699e = 1;
                if (l0Var.F(toMapPreview, this) == objE) {
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
        public final Object w(ra3.e.OnMapClick onMapClick, ra3.k.a.Initialized initialized, tq.e<? super oq.i0> eVar) {
            k kVar = l0.this.new k(eVar);
            kVar.f172700f = onMapClick;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lra3/e$d;", "<unused var>", "Lk10/c0;", "Lra3/k$a$a;", "state", "Lk10/l;", "Lra3/k;", "<anonymous>", "(Lra3/e$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ra3.e.d, k10.c0<ra3.k.a.InterfaceC4401a>, tq.e<? super k10.l<? extends ra3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172703f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Changing V(ra3.k.a.InterfaceC4401a interfaceC4401a) {
            return new Changing(interfaceC4401a.getIsSubscribed(), interfaceC4401a.getCountryDetails());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ra3.k.a.InterfaceC4401a.Dialog X(l0 l0Var, ra3.k.a.InterfaceC4401a interfaceC4401a) {
            return new ra3.k.a.InterfaceC4401a.Dialog(interfaceC4401a.getIsSubscribed(), interfaceC4401a.getCountryDetails(), l0Var.dialogVMSFactory.a(l0Var.dialogMapper.b(new ta3.a.Params(l0Var.b9(ra3.b.f172570a), l0Var.b9(ra3.a.f172567a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f172703f;
            uq.b.e();
            if (this.f172702e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            boolean zE = l0.this.notificationSettingsManager.e();
            if (zE) {
                return c0Var.d(new er.l() { // from class: ra3.t0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l0.l.V((k.a.InterfaceC4401a) obj2);
                    }
                });
            }
            if (zE) {
                throw new oq.p();
            }
            final l0 l0Var = l0.this;
            return c0Var.d(new er.l() { // from class: ra3.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.l.X(l0Var, (k.a.InterfaceC4401a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ra3.e.d dVar, k10.c0<ra3.k.a.InterfaceC4401a> c0Var, tq.e<? super k10.l<? extends ra3.k>> eVar) {
            l lVar = l0.this.new l(eVar);
            lVar.f172703f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lra3/k$a$a$a;", "it", "Loq/i0;", "<anonymous>", "(Lra3/k$a$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<ra3.k.a.InterfaceC4401a.Checking, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172705e;

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f172705e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            l0.this.d9(ra3.e.d.f172587a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ra3.k.a.InterfaceC4401a.Checking checking, tq.e<? super oq.i0> eVar) {
            return ((m) v(checking, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return l0.this.new m(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lra3/a;", "<unused var>", "Lk10/c0;", "Lra3/k$a$a$b;", "state", "Lk10/l;", "Lra3/k;", "<anonymous>", "(Lra3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ra3.a, k10.c0<ra3.k.a.InterfaceC4401a.Dialog>, tq.e<? super k10.l<? extends ra3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172708f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ra3.k.a.Initialized O(ra3.k.a.InterfaceC4401a.Dialog dialog) {
            return new ra3.k.a.Initialized(dialog.getIsSubscribed(), dialog.getCountryDetails());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f172708f;
            uq.b.e();
            if (this.f172707e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ra3.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.n.O((k.a.InterfaceC4401a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ra3.a aVar, k10.c0<ra3.k.a.InterfaceC4401a.Dialog> c0Var, tq.e<? super k10.l<? extends ra3.k>> eVar) {
            n nVar = new n(eVar);
            nVar.f172708f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lra3/b;", "<unused var>", "Lk10/c0;", "Lra3/k$a$a$b;", "state", "Lk10/l;", "Lra3/k;", "<anonymous>", "(Lra3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ra3.b, k10.c0<ra3.k.a.InterfaceC4401a.Dialog>, tq.e<? super k10.l<? extends ra3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172710f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ra3.k.a.InterfaceC4401a.Error V(k10.c0 c0Var, l0 l0Var, dx.b.Business business, ra3.k.a.InterfaceC4401a.Dialog dialog) {
            return new ra3.k.a.InterfaceC4401a.Error(((ra3.k.a.InterfaceC4401a.Dialog) c0Var.a()).getIsSubscribed(), ((ra3.k.a.InterfaceC4401a.Dialog) c0Var.a()).getCountryDetails(), l0Var.errorVmsFactory.a(l0Var.M9(business)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ra3.k.a.Initialized X(ra3.k.a.InterfaceC4401a.Dialog dialog) {
            return new ra3.k.a.Initialized(dialog.getIsSubscribed(), dialog.getCountryDetails());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f172710f;
            Object objE = uq.b.e();
            int i15 = this.f172709e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.p pVar = l0.this.goToNotificationSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f172710f = c0Var;
                this.f172709e = 1;
                obj = pVar.c(c1792a, this);
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
            final l0 l0Var = l0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: ra3.w0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l0.o.V(c0Var, l0Var, business, (k.a.InterfaceC4401a.Dialog) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.d(new er.l() { // from class: ra3.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.o.X((k.a.InterfaceC4401a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ra3.b bVar, k10.c0<ra3.k.a.InterfaceC4401a.Dialog> c0Var, tq.e<? super k10.l<? extends ra3.k>> eVar) {
            o oVar = l0.this.new o(eVar);
            oVar.f172710f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lra3/c;", "<unused var>", "Lk10/c0;", "Lra3/k$a$a$c;", "state", "Lk10/l;", "Lra3/k;", "<anonymous>", "(Lra3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<ra3.c, k10.c0<ra3.k.a.InterfaceC4401a.Error>, tq.e<? super k10.l<? extends ra3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172713f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ra3.k.a.Initialized O(ra3.k.a.InterfaceC4401a.Error error) {
            return new ra3.k.a.Initialized(error.getIsSubscribed(), error.getCountryDetails());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f172713f;
            uq.b.e();
            if (this.f172712e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ra3.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.p.O((k.a.InterfaceC4401a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ra3.c cVar, k10.c0<ra3.k.a.InterfaceC4401a.Error> c0Var, tq.e<? super k10.l<? extends ra3.k>> eVar) {
            p pVar = new p(eVar);
            pVar.f172713f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    public l0(yy.a aVar, ta3.e eVar, x93.d dVar, ac4.a aVar2, w93.a aVar3, hb4.d dVar2, cb4.j jVar, ib4.c cVar, a14.w wVar, i70.e eVar2, ta3.a aVar4, dy.a aVar5, a14.p pVar, oz.q qVar, final SetupData setupData) {
        this.mapper = eVar;
        this.travelAbroadServiceInteractor = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getCountryDetailsFormattedUC = aVar3;
        this.errorVmsFactory = dVar2;
        this.dialogVMSFactory = jVar;
        this.errorMapper = cVar;
        this.openUrlUseCase = wVar;
        this.globalSnackBarManager = eVar2;
        this.dialogMapper = aVar4;
        this.notificationSettingsManager = aVar5;
        this.goToNotificationSettingsUseCase = pVar;
        this.ownerViewLifecycleManager = qVar;
        Fetching fetching = new Fetching(setupData.getIsSubscribed());
        this.initialState = fetching;
        this.lifecycleConnector = qVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(fetching, new er.l() { // from class: ra3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.T9(this.f172571a, setupData, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), O9(fetching));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b M9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ra3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.v9(this.f172568a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PayloadErrorData N9(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ra3.l.a O9(ra3.k state) {
        return this.mapper.b(new ta3.e.Params(state, b9(ra3.e.b.f172585a), new er.l() { // from class: ra3.x
            @Override // er.l
            public final Object b(Object obj) {
                return l0.P9(this.f172760a, (InfoItem) obj);
            }
        }, b9(ra3.e.c.f172586a), new er.l() { // from class: ra3.y
            @Override // er.l
            public final Object b(Object obj) {
                return l0.Q9(this.f172761a, (Bitmap) obj);
            }
        }, new er.l() { // from class: ra3.z
            @Override // er.l
            public final Object b(Object obj) {
                return l0.R9(this.f172762a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(l0 l0Var, InfoItem infoItem) {
        l0Var.d9(new ra3.e.OnInfoItemClick(infoItem));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(l0 l0Var, Bitmap bitmap) {
        l0Var.d9(new ra3.e.OnMapClick(bitmap));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(l0 l0Var, String str) {
        l0Var.d9(new ra3.e.OnUrlClick(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(final l0 l0Var, final SetupData setupData, k10.v vVar) {
        vVar.c(fr.q0.c(ra3.k.class), new er.l() { // from class: ra3.w
            @Override // er.l
            public final Object b(Object obj) {
                return l0.U9(this.f172755a, setupData, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Fetching.class), new er.l() { // from class: ra3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.V9(this.f172575a, setupData, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: ra3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.W9(this.f172578a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ra3.k.a.class), new er.l() { // from class: ra3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.X9(this.f172591a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ra3.k.a.Initialized.class), new er.l() { // from class: ra3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.Y9(this.f172594a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ra3.k.a.InterfaceC4401a.class), new er.l() { // from class: ra3.g0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.Z9(this.f172597a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ra3.k.a.InterfaceC4401a.Checking.class), new er.l() { // from class: ra3.h0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.aa(this.f172599a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ra3.k.a.InterfaceC4401a.Dialog.class), new er.l() { // from class: ra3.i0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.ba(this.f172602a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ra3.k.a.InterfaceC4401a.Error.class), new er.l() { // from class: ra3.j0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.ca((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Changing.class), new er.l() { // from class: ra3.k0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.da(this.f172616a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(l0 l0Var, SetupData setupData, k10.z zVar) {
        c cVar = l0Var.new c(setupData, null);
        zVar.x(fr.q0.c(ra3.e.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(l0 l0Var, SetupData setupData, k10.z zVar) {
        zVar.A(l0Var.new e(setupData, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(l0 l0Var, k10.z zVar) {
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ra3.d.class), oVar, fVar);
        zVar.x(fr.q0.c(ra3.c.class), oVar, l0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(l0 l0Var, k10.z zVar) {
        h hVar = l0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ra3.e.OnInfoItemClick.class), oVar, hVar);
        zVar.x(fr.q0.c(ra3.e.OnUrlClick.class), oVar, l0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(l0 l0Var, k10.z zVar) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ra3.e.c.class), oVar, jVar);
        zVar.x(fr.q0.c(ra3.e.OnMapClick.class), oVar, l0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(l0 l0Var, k10.z zVar) {
        l lVar = l0Var.new l(null);
        zVar.v(fr.q0.c(ra3.e.d.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(l0 l0Var, k10.z zVar) {
        zVar.C(l0Var.new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(l0 l0Var, k10.z zVar) {
        n nVar = new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ra3.a.class), oVar, nVar);
        zVar.v(fr.q0.c(ra3.b.class), oVar, l0Var.new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(k10.z zVar) {
        p pVar = new p(null);
        zVar.v(fr.q0.c(ra3.c.class), k10.o.CANCEL_PREVIOUS, pVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(l0 l0Var, k10.z zVar) {
        zVar.A(l0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v9(l0 l0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            l0Var.d9(ra3.c.f172574a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            l0Var.d9(ra3.d.f172577a);
        }
        return oq.i0.f148189a;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: L9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ra3.e.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: S9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<ra3.e.a> Y1() {
        return this.navAction;
    }

    @Override // ra3.l
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<ra3.k, ra3.e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ra3.l.a> getState() {
        return this.state;
    }
}
