package sa1;

import java.util.List;
import ma1.CompanyAddresses;
import ma1.CompanyCategory;
import ma1.CompanyData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0085\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0086\u0001B¡\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b5\u00106J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J \u0010@\u001a\u00020?2\u0006\u0010<\u001a\u0002042\u0006\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\b@\u0010AJ\u0018\u0010D\u001a\u00020?2\u0006\u0010C\u001a\u00020BH\u0096\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020?H\u0096\u0001¢\u0006\u0004\bF\u0010GR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR&\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030p8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR \u0010{\u001a\b\u0012\u0004\u0012\u00020w0v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010x\u001a\u0004\by\u0010zR!\u0010.\u001a\b\u0012\u0004\u0012\u00020/0|8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001e\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00018\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bV\u0010\u0083\u0001¨\u0006\u0087\u0001"}, d2 = {"Lsa1/c0;", "Ll00/g;", "Lsa1/b;", "Lsa1/a;", "Lsa1/c;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lla1/a;", "interactor", "Loa1/a;", "downloadCertificateUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "La14/d0;", "shareTextIntentUseCase", "Lja1/a;", "isNewCompanyApplicationFeatureFlagActiveUseCase", "Lua1/j;", "mapper", "Lua1/k;", "downloadCertificateMapper", "snackBarManagerStateHolder", "Lib4/c;", "genericDomainErrorMapper", "La14/w;", "openUrlIntentUseCase", "Lmx/c;", "labelProvider", "Lia1/a;", "companyEndpoints", "La14/d;", "copyToClipboardUseCase", "Loa1/d;", "isCompanySuspensionFeatureFlagActiveUC", "Loa1/c;", "isCompanyRepresentativesFeatureFlagActiveUC", "La14/q;", "goToStoreIntentUseCase", "Lse1/d;", "notAdultDialogMapper", "Lua1/a;", "applicationAlreadyProcessedDialog", "<init>", "(Lyy/a;Lla1/a;Loa1/a;Lac4/a;La14/d0;Lja1/a;Lua1/j;Lua1/k;Li70/n;Lib4/c;La14/w;Lmx/c;Lia1/a;La14/d;Loa1/d;Loa1/c;La14/q;Lse1/d;Lua1/a;)V", "state", "Lsa1/c$a;", "N9", "(Lsa1/b;)Lsa1/c$a;", "Lma1/e;", "companyData", "", "T9", "(Lma1/e;)Ljava/lang/String;", "Ldx/b;", "domainError", "Ljb4/b;", "L9", "(Ldx/b;)Ljb4/b;", "value", "Lva1/b;", "snackbarType", "Loq/i0;", "K9", "(Ljava/lang/String;Lva1/b;Ltq/e;)Ljava/lang/Object;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lla1/a;", "c", "Loa1/a;", "d", "Lac4/a;", "e", "La14/d0;", "f", "Lja1/a;", "g", "Lua1/j;", "h", "Lua1/k;", "j", "Li70/n;", "k", "Lib4/c;", "l", "La14/w;", "m", "Lmx/c;", "n", "Lia1/a;", "p", "La14/d;", "q", "Loa1/d;", "r", "Loa1/c;", "s", "La14/q;", "t", "Lse1/d;", "v", "Lua1/a;", "Lsa1/b$a;", "w", "Lsa1/b$a;", "initialState", "Lk10/t;", "x", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lsa1/a$k;", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "z", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "A", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 extends l00.g<sa1.b, sa1.a> implements sa1.c, zx.b, i70.n {
    private static final a A = new a(null);
    public static final int B = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final la1.a interactor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oa1.a downloadCertificateUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a14.d0 shareTextIntentUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ja1.a isNewCompanyApplicationFeatureFlagActiveUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ua1.j mapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ua1.k downloadCertificateMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ia1.a companyEndpoints;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final oa1.d isCompanySuspensionFeatureFlagActiveUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oa1.c isCompanyRepresentativesFeatureFlagActiveUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final a14.q goToStoreIntentUseCase;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final se1.d notAdultDialogMapper;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final ua1.a applicationAlreadyProcessedDialog;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final sa1.b.a initialState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final k10.t<sa1.b, sa1.a> stateMachine;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sa1.a.k> navAction;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<sa1.c.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lsa1/c0$a;", "", "<init>", "()V", "", "COMPANY_DETAILS_DATA_STATUS_NOT_PRESENT", "Ljava/lang/String;", "NIP_NAME", "REGON_NAME", "ADDRESS_NAME", "STATEMENT", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f179668a;

        static {
            int[] iArr = new int[va1.b.values().length];
            try {
                iArr[va1.b.COMPANY_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[va1.b.NIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[va1.b.REGON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[va1.b.ADDRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f179668a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<sa1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f179669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f179670b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f179671a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f179672b;

            /* JADX INFO: renamed from: sa1.c0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4625a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f179673d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f179674e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f179675f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f179677h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f179678j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f179679k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f179680l;

                public C4625a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f179673d = obj;
                    this.f179674e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, c0 c0Var) {
                this.f179671a = hVar;
                this.f179672b = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4625a c4625a;
                if (eVar instanceof C4625a) {
                    c4625a = (C4625a) eVar;
                    int i15 = c4625a.f179674e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4625a.f179674e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4625a = new C4625a(eVar);
                    }
                } else {
                    c4625a = new C4625a(eVar);
                }
                Object obj2 = c4625a.f179673d;
                Object objE = uq.b.e();
                int i16 = c4625a.f179674e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f179671a;
                    sa1.c.a aVarN9 = this.f179672b.N9((sa1.b) obj);
                    c4625a.f179675f = vq.j.a(obj);
                    c4625a.f179677h = vq.j.a(c4625a);
                    c4625a.f179678j = vq.j.a(obj);
                    c4625a.f179679k = vq.j.a(hVar);
                    c4625a.f179680l = 0;
                    c4625a.f179674e = 1;
                    if (hVar.F(aVarN9, c4625a) == objE) {
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

        public c(mu.g gVar, c0 c0Var) {
            this.f179669a = gVar;
            this.f179670b = c0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super sa1.c.a> hVar, tq.e eVar) {
            Object objA = this.f179669a.a(new a(hVar, this.f179670b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsa1/a$a;", "<unused var>", "Lsa1/b;", "Loq/i0;", "<anonymous>", "(Lsa1/a$a;Lsa1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sa1.a.C4618a, sa1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179681e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179681e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sa1.a.k> bVarY1 = c0.this.Y1();
                sa1.a.k.C4619a c4619a = sa1.a.k.C4619a.f179585a;
                this.f179681e = 1;
                if (bVarY1.F(c4619a, this) == objE) {
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
        public final Object w(sa1.a.C4618a c4618a, sa1.b bVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsa1/a$l;", "action", "Lsa1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsa1/a$l;Lsa1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<sa1.a.OpenUrl, sa1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179684f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sa1.a.OpenUrl openUrl = (sa1.a.OpenUrl) this.f179684f;
            Object objE = uq.b.e();
            int i15 = this.f179683e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = c0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f179684f = vq.j.a(openUrl);
                this.f179683e = 1;
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
            c0 c0Var = c0.this;
            if (iVar instanceof dx.i.Left) {
                c0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sa1.a.OpenUrl openUrl, sa1.b bVar, tq.e<? super oq.i0> eVar) {
            e eVar2 = c0.this.new e(eVar);
            eVar2.f179684f = openUrl;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsa1/a$d;", "<unused var>", "Lk10/c0;", "Lsa1/b;", "state", "Lk10/l;", "<anonymous>", "(Lsa1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sa1.a.d, k10.c0<sa1.b>, tq.e<? super k10.l<? extends sa1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179687f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lsa1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends sa1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f179689e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f179690f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f179691g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f179692h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f179693j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f179694k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            boolean f179695l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f179696m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ c0 f179697n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<sa1.b> f179698p;

            /* JADX INFO: renamed from: sa1.c0$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C4626a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f179699a;

                static {
                    int[] iArr = new int[ma1.j.values().length];
                    try {
                        iArr[ma1.j.COMPANY_EXISTS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ma1.j.COMPANY_APPLICATION_AVAILABLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ma1.j.COMPANY_UNAVAILABLE_BECAUSE_OF_AGE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ma1.j.COMPANY_UNAVAILABLE_BECAUSE_OF_MISSING_TRUSTED_PROFILE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ma1.j.COMPANY_UNAVAILABLE_BECAUSE_OF_UNSUPPORTED_MAIN_DOCUMENT.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ma1.j.COMPANY_APPLICATION_ORDERED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ma1.j.COMPANY_APPLICATION_REJECTED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[ma1.j.COMPANY_APPLICATION_STARTED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[ma1.j.UNKNOWN.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    f179699a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, k10.c0<sa1.b> c0Var2, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f179697n = c0Var;
                this.f179698p = c0Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sa1.b.Initialized d0(ma1.f fVar, c0 c0Var, boolean z15, boolean z16, sa1.b bVar) {
                return new sa1.b.Initialized(fVar, null, c0Var.companyEndpoints.w(), z15, z16, 2, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sa1.b.Initialized e0(ma1.f fVar, c0 c0Var, boolean z15, boolean z16, sa1.b bVar) {
                return new sa1.b.Initialized(fVar, null, c0Var.companyEndpoints.w(), z15, z16, 2, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sa1.b.NoData f0(c0 c0Var, sa1.b bVar) {
                return new sa1.b.NoData(c0Var.companyEndpoints.w());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sa1.b.OpenCompanyPendingStatus g0(ma1.f fVar, sa1.b bVar) {
                return new sa1.b.OpenCompanyPendingStatus(fVar.getInfo().getTitle(), fVar.getInfo().getMessage());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sa1.b.OpenCompanyRejectedStatus h0(ma1.f fVar, sa1.b bVar) {
                return new sa1.b.OpenCompanyRejectedStatus(fVar.getInfo().getTitle(), fVar.getInfo().getMessage());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sa1.b.WorkInProgressNewApplication i0(ma1.f fVar, sa1.b bVar) {
                return new sa1.b.WorkInProgressNewApplication(fVar.getInfo().getStatus());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sa1.b.f j0(sa1.b bVar) {
                return sa1.b.f.f179616a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sa1.b.NoData k0(c0 c0Var, sa1.b bVar) {
                return new sa1.b.NoData(c0Var.companyEndpoints.w());
            }

            /* JADX WARN: Code duplicated, block: B:100:0x02fa  */
            /* JADX WARN: Code duplicated, block: B:102:0x02fe  */
            /* JADX WARN: Code duplicated, block: B:106:0x032d  */
            /* JADX WARN: Code duplicated, block: B:109:0x0337  */
            /* JADX WARN: Code duplicated, block: B:110:0x0344  */
            /* JADX WARN: Code duplicated, block: B:112:0x0348  */
            /* JADX WARN: Code duplicated, block: B:115:0x035e  */
            /* JADX WARN: Code duplicated, block: B:117:0x0364  */
            /* JADX WARN: Code duplicated, block: B:119:0x036a  */
            /* JADX WARN: Code duplicated, block: B:121:0x0370  */
            /* JADX WARN: Code duplicated, block: B:20:0x00e0  */
            /* JADX WARN: Code duplicated, block: B:23:0x0113  */
            /* JADX WARN: Code duplicated, block: B:26:0x0119  */
            /* JADX WARN: Code duplicated, block: B:28:0x011d  */
            /* JADX WARN: Code duplicated, block: B:30:0x0138  */
            /* JADX WARN: Code duplicated, block: B:32:0x014b  */
            /* JADX WARN: Code duplicated, block: B:34:0x0151  */
            /* JADX WARN: Code duplicated, block: B:36:0x015b  */
            /* JADX WARN: Code duplicated, block: B:38:0x0165  */
            /* JADX WARN: Code duplicated, block: B:40:0x016f  */
            /* JADX WARN: Code duplicated, block: B:42:0x0179  */
            /* JADX WARN: Code duplicated, block: B:44:0x0183  */
            /* JADX WARN: Code duplicated, block: B:47:0x01ab  */
            /* JADX WARN: Code duplicated, block: B:50:0x01b1  */
            /* JADX WARN: Code duplicated, block: B:53:0x01d4  */
            /* JADX WARN: Code duplicated, block: B:56:0x01da  */
            /* JADX WARN: Code duplicated, block: B:59:0x0202  */
            /* JADX WARN: Code duplicated, block: B:62:0x0208  */
            /* JADX WARN: Code duplicated, block: B:65:0x0227  */
            /* JADX WARN: Code duplicated, block: B:68:0x0233  */
            /* JADX WARN: Code duplicated, block: B:69:0x0240  */
            /* JADX WARN: Code duplicated, block: B:71:0x0244  */
            /* JADX WARN: Code duplicated, block: B:75:0x0273  */
            /* JADX WARN: Code duplicated, block: B:78:0x027d  */
            /* JADX WARN: Code duplicated, block: B:79:0x028a  */
            /* JADX WARN: Code duplicated, block: B:81:0x028e  */
            /* JADX WARN: Code duplicated, block: B:84:0x02a4  */
            /* JADX WARN: Code duplicated, block: B:86:0x02aa  */
            /* JADX WARN: Code duplicated, block: B:88:0x02b0 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:89:0x02b2  */
            /* JADX WARN: Code duplicated, block: B:91:0x02b8  */
            /* JADX WARN: Code duplicated, block: B:93:0x02c2  */
            /* JADX WARN: Code duplicated, block: B:96:0x02e1  */
            /* JADX WARN: Code duplicated, block: B:99:0x02ed  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                final c0 c0Var;
                k10.c0<sa1.b> c0Var2;
                final ma1.f fVar;
                gz.b.a.C1792a c1792a;
                boolean zBooleanValue;
                Object objA;
                c0 c0Var3;
                k10.c0<sa1.b> c0Var4;
                int i15;
                final ma1.f fVar2;
                int i16;
                Object objA2;
                c0 c0Var5;
                k10.c0<sa1.b> c0Var6;
                int i17;
                final ma1.f fVar3;
                int i18;
                xw.b<sa1.a.k> bVarY1;
                sa1.a.k.GoToWelcomePage goToWelcomePage;
                k10.c0<sa1.b> c0Var7;
                xw.b<sa1.a.k> bVarY2;
                sa1.a.k.g gVar;
                k10.c0<sa1.b> c0Var8;
                xw.b<sa1.a.k> bVarY3;
                sa1.a.k.GoToWelcomePage goToWelcomePage2;
                k10.c0<sa1.b> c0Var9;
                xw.b<sa1.a.k> bVarY4;
                sa1.a.k.Error error;
                k10.c0<sa1.b> c0Var10;
                dx.i iVar2;
                Object objB;
                boolean zBooleanValue2;
                Object objA3;
                final boolean z15;
                k10.c0<sa1.b> c0Var11;
                final c0 c0Var12;
                dx.i iVar3;
                Object objB2;
                dx.i iVar4;
                Object objB3;
                boolean zBooleanValue3;
                Object objA4;
                final boolean z16;
                k10.c0<sa1.b> c0Var13;
                final c0 c0Var14;
                dx.i iVar5;
                Object objB4;
                Object objE = uq.b.e();
                switch (this.f179696m) {
                    case 0:
                        oq.u.b(obj);
                        la1.a aVar = this.f179697n.interactor;
                        this.f179696m = 1;
                        obj = aVar.a(this);
                        if (obj != objE) {
                            iVar = (dx.i) obj;
                            c0Var = this.f179697n;
                            c0Var2 = this.f179698p;
                            if (iVar instanceof dx.i.Left) {
                                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                                bVarY4 = c0Var.Y1();
                                error = new sa1.a.k.Error(c0Var.L9(bVar));
                                this.f179689e = vq.j.a(iVar);
                                this.f179690f = c0Var2;
                                this.f179691g = vq.j.a(bVar);
                                this.f179693j = 0;
                                this.f179694k = 0;
                                this.f179696m = 2;
                                if (bVarY4.F(error, this) != objE) {
                                    c0Var10 = c0Var2;
                                    return c0Var10.c();
                                }
                            } else {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                fVar = (ma1.f) ((dx.i.Right) iVar).b();
                                ja1.a aVar2 = c0Var.isNewCompanyApplicationFeatureFlagActiveUseCase;
                                c1792a = gz.b.a.C1792a.f78542a;
                                zBooleanValue = aVar2.a(c1792a).booleanValue();
                                if (zBooleanValue) {
                                    switch (C4626a.f179699a[fVar.getInfo().getStatus().ordinal()]) {
                                        case 1:
                                            oa1.d dVar = c0Var.isCompanySuspensionFeatureFlagActiveUC;
                                            this.f179689e = vq.j.a(iVar);
                                            this.f179690f = c0Var;
                                            this.f179691g = c0Var2;
                                            this.f179692h = fVar;
                                            this.f179693j = 0;
                                            this.f179694k = 0;
                                            this.f179696m = 3;
                                            objA2 = dVar.a(c1792a, this);
                                            if (objA2 != objE) {
                                                c0Var5 = c0Var;
                                                c0Var6 = c0Var2;
                                                obj = objA2;
                                                i17 = 0;
                                                fVar3 = fVar;
                                                i18 = 0;
                                                iVar2 = (dx.i) obj;
                                                if (iVar2 instanceof dx.i.Left) {
                                                    objB = vq.b.a(false);
                                                } else {
                                                    if (!(iVar2 instanceof dx.i.Right)) {
                                                        throw new oq.p();
                                                    }
                                                    objB = ((dx.i.Right) iVar2).b();
                                                }
                                                zBooleanValue2 = ((Boolean) objB).booleanValue();
                                                oa1.c cVar = c0Var5.isCompanyRepresentativesFeatureFlagActiveUC;
                                                gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                                this.f179689e = vq.j.a(iVar);
                                                this.f179690f = c0Var5;
                                                this.f179691g = c0Var6;
                                                this.f179692h = fVar3;
                                                this.f179693j = i18;
                                                this.f179694k = i17;
                                                this.f179695l = zBooleanValue2;
                                                this.f179696m = 4;
                                                objA3 = cVar.a(c1792a2, this);
                                                if (objA3 != objE) {
                                                    z15 = zBooleanValue2;
                                                    obj = objA3;
                                                    c0Var11 = c0Var6;
                                                    c0Var12 = c0Var5;
                                                    iVar3 = (dx.i) obj;
                                                    if (iVar3 instanceof dx.i.Left) {
                                                        objB2 = vq.b.a(false);
                                                    } else {
                                                        if (iVar3 instanceof dx.i.Right) {
                                                            throw new oq.p();
                                                        }
                                                        objB2 = ((dx.i.Right) iVar3).b();
                                                    }
                                                    final boolean zBooleanValue4 = ((Boolean) objB2).booleanValue();
                                                    return c0Var11.d(new er.l() { // from class: sa1.d0
                                                        @Override // er.l
                                                        public final Object b(Object obj2) {
                                                            return c0.f.a.e0(fVar3, c0Var12, z15, zBooleanValue4, (b) obj2);
                                                        }
                                                    });
                                                }
                                            }
                                            break;
                                        case 2:
                                            bVarY1 = c0Var.Y1();
                                            goToWelcomePage = new sa1.a.k.GoToWelcomePage(ma1.j.COMPANY_APPLICATION_AVAILABLE);
                                            this.f179689e = vq.j.a(iVar);
                                            this.f179690f = c0Var2;
                                            this.f179691g = vq.j.a(fVar);
                                            this.f179693j = 0;
                                            this.f179694k = 0;
                                            this.f179696m = 5;
                                            if (bVarY1.F(goToWelcomePage, this) != objE) {
                                                c0Var7 = c0Var2;
                                                return c0Var7.c();
                                            }
                                            break;
                                        case 3:
                                            bVarY2 = c0Var.Y1();
                                            gVar = sa1.a.k.g.f179593a;
                                            this.f179689e = vq.j.a(iVar);
                                            this.f179690f = c0Var2;
                                            this.f179691g = vq.j.a(fVar);
                                            this.f179693j = 0;
                                            this.f179694k = 0;
                                            this.f179696m = 6;
                                            if (bVarY2.F(gVar, this) != objE) {
                                                c0Var8 = c0Var2;
                                                return c0Var8.c();
                                            }
                                            break;
                                        case 4:
                                            bVarY3 = c0Var.Y1();
                                            goToWelcomePage2 = new sa1.a.k.GoToWelcomePage(ma1.j.COMPANY_UNAVAILABLE_BECAUSE_OF_MISSING_TRUSTED_PROFILE);
                                            this.f179689e = vq.j.a(iVar);
                                            this.f179690f = c0Var2;
                                            this.f179691g = vq.j.a(fVar);
                                            this.f179693j = 0;
                                            this.f179694k = 0;
                                            this.f179696m = 7;
                                            if (bVarY3.F(goToWelcomePage2, this) != objE) {
                                                c0Var9 = c0Var2;
                                                return c0Var9.c();
                                            }
                                            break;
                                        case 5:
                                            return c0Var2.d(new er.l() { // from class: sa1.e0
                                                @Override // er.l
                                                public final Object b(Object obj2) {
                                                    return c0.f.a.f0(c0Var, (b) obj2);
                                                }
                                            });
                                        case 6:
                                            return c0Var2.d(new er.l() { // from class: sa1.f0
                                                @Override // er.l
                                                public final Object b(Object obj2) {
                                                    return c0.f.a.g0(fVar, (b) obj2);
                                                }
                                            });
                                        case 7:
                                            return c0Var2.d(new er.l() { // from class: sa1.g0
                                                @Override // er.l
                                                public final Object b(Object obj2) {
                                                    return c0.f.a.h0(fVar, (b) obj2);
                                                }
                                            });
                                        case 8:
                                            return c0Var2.d(new er.l() { // from class: sa1.h0
                                                @Override // er.l
                                                public final Object b(Object obj2) {
                                                    return c0.f.a.i0(fVar, (b) obj2);
                                                }
                                            });
                                        case 9:
                                            return c0Var2.d(new er.l() { // from class: sa1.i0
                                                @Override // er.l
                                                public final Object b(Object obj2) {
                                                    return c0.f.a.j0((b) obj2);
                                                }
                                            });
                                        default:
                                            throw new oq.p();
                                    }
                                } else {
                                    if (!zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    if (fVar.getCompanyData() == null) {
                                        return c0Var2.d(new er.l() { // from class: sa1.j0
                                            @Override // er.l
                                            public final Object b(Object obj2) {
                                                return c0.f.a.k0(c0Var, (b) obj2);
                                            }
                                        });
                                    }
                                    oa1.d dVar2 = c0Var.isCompanySuspensionFeatureFlagActiveUC;
                                    this.f179689e = vq.j.a(iVar);
                                    this.f179690f = c0Var;
                                    this.f179691g = c0Var2;
                                    this.f179692h = fVar;
                                    this.f179693j = 0;
                                    this.f179694k = 0;
                                    this.f179696m = 8;
                                    objA = dVar2.a(c1792a, this);
                                    if (objA != objE) {
                                        c0Var3 = c0Var;
                                        c0Var4 = c0Var2;
                                        obj = objA;
                                        i15 = 0;
                                        fVar2 = fVar;
                                        i16 = 0;
                                        iVar4 = (dx.i) obj;
                                        if (iVar4 instanceof dx.i.Left) {
                                            objB3 = vq.b.a(false);
                                        } else {
                                            if (!(iVar4 instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB3 = ((dx.i.Right) iVar4).b();
                                        }
                                        zBooleanValue3 = ((Boolean) objB3).booleanValue();
                                        oa1.c cVar2 = c0Var3.isCompanyRepresentativesFeatureFlagActiveUC;
                                        gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                                        this.f179689e = vq.j.a(iVar);
                                        this.f179690f = c0Var3;
                                        this.f179691g = c0Var4;
                                        this.f179692h = fVar2;
                                        this.f179693j = i16;
                                        this.f179694k = i15;
                                        this.f179695l = zBooleanValue3;
                                        this.f179696m = 9;
                                        objA4 = cVar2.a(c1792a3, this);
                                        if (objA4 != objE) {
                                            z16 = zBooleanValue3;
                                            obj = objA4;
                                            c0Var13 = c0Var4;
                                            c0Var14 = c0Var3;
                                            iVar5 = (dx.i) obj;
                                            if (iVar5 instanceof dx.i.Left) {
                                                objB4 = vq.b.a(false);
                                            } else {
                                                if (iVar5 instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                objB4 = ((dx.i.Right) iVar5).b();
                                            }
                                            final boolean zBooleanValue5 = ((Boolean) objB4).booleanValue();
                                            return c0Var13.d(new er.l() { // from class: sa1.k0
                                                @Override // er.l
                                                public final Object b(Object obj2) {
                                                    return c0.f.a.d0(fVar2, c0Var14, z16, zBooleanValue5, (b) obj2);
                                                }
                                            });
                                        }
                                    }
                                }
                            }
                        }
                        return objE;
                    case 1:
                        oq.u.b(obj);
                        iVar = (dx.i) obj;
                        c0Var = this.f179697n;
                        c0Var2 = this.f179698p;
                        if (iVar instanceof dx.i.Left) {
                            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                            bVarY4 = c0Var.Y1();
                            error = new sa1.a.k.Error(c0Var.L9(bVar2));
                            this.f179689e = vq.j.a(iVar);
                            this.f179690f = c0Var2;
                            this.f179691g = vq.j.a(bVar2);
                            this.f179693j = 0;
                            this.f179694k = 0;
                            this.f179696m = 2;
                            if (bVarY4.F(error, this) != objE) {
                                c0Var10 = c0Var2;
                                return c0Var10.c();
                            }
                        } else {
                            if (iVar instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            fVar = (ma1.f) ((dx.i.Right) iVar).b();
                            ja1.a aVar3 = c0Var.isNewCompanyApplicationFeatureFlagActiveUseCase;
                            c1792a = gz.b.a.C1792a.f78542a;
                            zBooleanValue = aVar3.a(c1792a).booleanValue();
                            if (zBooleanValue) {
                                switch (C4626a.f179699a[fVar.getInfo().getStatus().ordinal()]) {
                                    case 1:
                                        oa1.d dVar3 = c0Var.isCompanySuspensionFeatureFlagActiveUC;
                                        this.f179689e = vq.j.a(iVar);
                                        this.f179690f = c0Var;
                                        this.f179691g = c0Var2;
                                        this.f179692h = fVar;
                                        this.f179693j = 0;
                                        this.f179694k = 0;
                                        this.f179696m = 3;
                                        objA2 = dVar3.a(c1792a, this);
                                        if (objA2 != objE) {
                                            c0Var5 = c0Var;
                                            c0Var6 = c0Var2;
                                            obj = objA2;
                                            i17 = 0;
                                            fVar3 = fVar;
                                            i18 = 0;
                                            iVar2 = (dx.i) obj;
                                            if (iVar2 instanceof dx.i.Left) {
                                                objB = vq.b.a(false);
                                            } else {
                                                if (!(iVar2 instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                objB = ((dx.i.Right) iVar2).b();
                                            }
                                            zBooleanValue2 = ((Boolean) objB).booleanValue();
                                            oa1.c cVar3 = c0Var5.isCompanyRepresentativesFeatureFlagActiveUC;
                                            gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                                            this.f179689e = vq.j.a(iVar);
                                            this.f179690f = c0Var5;
                                            this.f179691g = c0Var6;
                                            this.f179692h = fVar3;
                                            this.f179693j = i18;
                                            this.f179694k = i17;
                                            this.f179695l = zBooleanValue2;
                                            this.f179696m = 4;
                                            objA3 = cVar3.a(c1792a4, this);
                                            if (objA3 != objE) {
                                                z15 = zBooleanValue2;
                                                obj = objA3;
                                                c0Var11 = c0Var6;
                                                c0Var12 = c0Var5;
                                                iVar3 = (dx.i) obj;
                                                if (iVar3 instanceof dx.i.Left) {
                                                    objB2 = vq.b.a(false);
                                                } else {
                                                    if (iVar3 instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    objB2 = ((dx.i.Right) iVar3).b();
                                                }
                                                final boolean zBooleanValue6 = ((Boolean) objB2).booleanValue();
                                                return c0Var11.d(new er.l() { // from class: sa1.d0
                                                    @Override // er.l
                                                    public final Object b(Object obj2) {
                                                        return c0.f.a.e0(fVar3, c0Var12, z15, zBooleanValue6, (b) obj2);
                                                    }
                                                });
                                            }
                                        }
                                        break;
                                    case 2:
                                        bVarY1 = c0Var.Y1();
                                        goToWelcomePage = new sa1.a.k.GoToWelcomePage(ma1.j.COMPANY_APPLICATION_AVAILABLE);
                                        this.f179689e = vq.j.a(iVar);
                                        this.f179690f = c0Var2;
                                        this.f179691g = vq.j.a(fVar);
                                        this.f179693j = 0;
                                        this.f179694k = 0;
                                        this.f179696m = 5;
                                        if (bVarY1.F(goToWelcomePage, this) != objE) {
                                            c0Var7 = c0Var2;
                                            return c0Var7.c();
                                        }
                                        break;
                                    case 3:
                                        bVarY2 = c0Var.Y1();
                                        gVar = sa1.a.k.g.f179593a;
                                        this.f179689e = vq.j.a(iVar);
                                        this.f179690f = c0Var2;
                                        this.f179691g = vq.j.a(fVar);
                                        this.f179693j = 0;
                                        this.f179694k = 0;
                                        this.f179696m = 6;
                                        if (bVarY2.F(gVar, this) != objE) {
                                            c0Var8 = c0Var2;
                                            return c0Var8.c();
                                        }
                                        break;
                                    case 4:
                                        bVarY3 = c0Var.Y1();
                                        goToWelcomePage2 = new sa1.a.k.GoToWelcomePage(ma1.j.COMPANY_UNAVAILABLE_BECAUSE_OF_MISSING_TRUSTED_PROFILE);
                                        this.f179689e = vq.j.a(iVar);
                                        this.f179690f = c0Var2;
                                        this.f179691g = vq.j.a(fVar);
                                        this.f179693j = 0;
                                        this.f179694k = 0;
                                        this.f179696m = 7;
                                        if (bVarY3.F(goToWelcomePage2, this) != objE) {
                                            c0Var9 = c0Var2;
                                            return c0Var9.c();
                                        }
                                        break;
                                    case 5:
                                        return c0Var2.d(new er.l() { // from class: sa1.e0
                                            @Override // er.l
                                            public final Object b(Object obj2) {
                                                return c0.f.a.f0(c0Var, (b) obj2);
                                            }
                                        });
                                    case 6:
                                        return c0Var2.d(new er.l() { // from class: sa1.f0
                                            @Override // er.l
                                            public final Object b(Object obj2) {
                                                return c0.f.a.g0(fVar, (b) obj2);
                                            }
                                        });
                                    case 7:
                                        return c0Var2.d(new er.l() { // from class: sa1.g0
                                            @Override // er.l
                                            public final Object b(Object obj2) {
                                                return c0.f.a.h0(fVar, (b) obj2);
                                            }
                                        });
                                    case 8:
                                        return c0Var2.d(new er.l() { // from class: sa1.h0
                                            @Override // er.l
                                            public final Object b(Object obj2) {
                                                return c0.f.a.i0(fVar, (b) obj2);
                                            }
                                        });
                                    case 9:
                                        return c0Var2.d(new er.l() { // from class: sa1.i0
                                            @Override // er.l
                                            public final Object b(Object obj2) {
                                                return c0.f.a.j0((b) obj2);
                                            }
                                        });
                                    default:
                                        throw new oq.p();
                                }
                            } else {
                                if (!zBooleanValue) {
                                    throw new oq.p();
                                }
                                if (fVar.getCompanyData() == null) {
                                    return c0Var2.d(new er.l() { // from class: sa1.j0
                                        @Override // er.l
                                        public final Object b(Object obj2) {
                                            return c0.f.a.k0(c0Var, (b) obj2);
                                        }
                                    });
                                }
                                oa1.d dVar4 = c0Var.isCompanySuspensionFeatureFlagActiveUC;
                                this.f179689e = vq.j.a(iVar);
                                this.f179690f = c0Var;
                                this.f179691g = c0Var2;
                                this.f179692h = fVar;
                                this.f179693j = 0;
                                this.f179694k = 0;
                                this.f179696m = 8;
                                objA = dVar4.a(c1792a, this);
                                if (objA != objE) {
                                    c0Var3 = c0Var;
                                    c0Var4 = c0Var2;
                                    obj = objA;
                                    i15 = 0;
                                    fVar2 = fVar;
                                    i16 = 0;
                                    iVar4 = (dx.i) obj;
                                    if (iVar4 instanceof dx.i.Left) {
                                        objB3 = vq.b.a(false);
                                    } else {
                                        if (!(iVar4 instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB3 = ((dx.i.Right) iVar4).b();
                                    }
                                    zBooleanValue3 = ((Boolean) objB3).booleanValue();
                                    oa1.c cVar4 = c0Var3.isCompanyRepresentativesFeatureFlagActiveUC;
                                    gz.b.a.C1792a c1792a5 = gz.b.a.C1792a.f78542a;
                                    this.f179689e = vq.j.a(iVar);
                                    this.f179690f = c0Var3;
                                    this.f179691g = c0Var4;
                                    this.f179692h = fVar2;
                                    this.f179693j = i16;
                                    this.f179694k = i15;
                                    this.f179695l = zBooleanValue3;
                                    this.f179696m = 9;
                                    objA4 = cVar4.a(c1792a5, this);
                                    if (objA4 != objE) {
                                        z16 = zBooleanValue3;
                                        obj = objA4;
                                        c0Var13 = c0Var4;
                                        c0Var14 = c0Var3;
                                        iVar5 = (dx.i) obj;
                                        if (iVar5 instanceof dx.i.Left) {
                                            objB4 = vq.b.a(false);
                                        } else {
                                            if (iVar5 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            objB4 = ((dx.i.Right) iVar5).b();
                                        }
                                        final boolean zBooleanValue7 = ((Boolean) objB4).booleanValue();
                                        return c0Var13.d(new er.l() { // from class: sa1.k0
                                            @Override // er.l
                                            public final Object b(Object obj2) {
                                                return c0.f.a.d0(fVar2, c0Var14, z16, zBooleanValue7, (b) obj2);
                                            }
                                        });
                                    }
                                }
                            }
                        }
                        return objE;
                    case 2:
                        c0Var10 = (k10.c0) this.f179690f;
                        oq.u.b(obj);
                        return c0Var10.c();
                    case 3:
                        int i19 = this.f179694k;
                        int i25 = this.f179693j;
                        ma1.f fVar4 = (ma1.f) this.f179692h;
                        c0Var6 = (k10.c0) this.f179691g;
                        c0Var5 = (c0) this.f179690f;
                        iVar = (dx.i) this.f179689e;
                        oq.u.b(obj);
                        i17 = i19;
                        fVar3 = fVar4;
                        i18 = i25;
                        iVar2 = (dx.i) obj;
                        if (iVar2 instanceof dx.i.Left) {
                            objB = vq.b.a(false);
                        } else {
                            if (!(iVar2 instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVar2).b();
                        }
                        zBooleanValue2 = ((Boolean) objB).booleanValue();
                        oa1.c cVar5 = c0Var5.isCompanyRepresentativesFeatureFlagActiveUC;
                        gz.b.a.C1792a c1792a6 = gz.b.a.C1792a.f78542a;
                        this.f179689e = vq.j.a(iVar);
                        this.f179690f = c0Var5;
                        this.f179691g = c0Var6;
                        this.f179692h = fVar3;
                        this.f179693j = i18;
                        this.f179694k = i17;
                        this.f179695l = zBooleanValue2;
                        this.f179696m = 4;
                        objA3 = cVar5.a(c1792a6, this);
                        if (objA3 != objE) {
                            z15 = zBooleanValue2;
                            obj = objA3;
                            c0Var11 = c0Var6;
                            c0Var12 = c0Var5;
                            iVar3 = (dx.i) obj;
                            if (iVar3 instanceof dx.i.Left) {
                                objB2 = vq.b.a(false);
                            } else {
                                if (iVar3 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB2 = ((dx.i.Right) iVar3).b();
                            }
                            final boolean zBooleanValue8 = ((Boolean) objB2).booleanValue();
                            return c0Var11.d(new er.l() { // from class: sa1.d0
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return c0.f.a.e0(fVar3, c0Var12, z15, zBooleanValue8, (b) obj2);
                                }
                            });
                        }
                        return objE;
                    case 4:
                        z15 = this.f179695l;
                        fVar3 = (ma1.f) this.f179692h;
                        c0Var11 = (k10.c0) this.f179691g;
                        c0Var12 = (c0) this.f179690f;
                        oq.u.b(obj);
                        iVar3 = (dx.i) obj;
                        if (iVar3 instanceof dx.i.Left) {
                            objB2 = vq.b.a(false);
                        } else {
                            if (iVar3 instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB2 = ((dx.i.Right) iVar3).b();
                        }
                        final boolean zBooleanValue9 = ((Boolean) objB2).booleanValue();
                        return c0Var11.d(new er.l() { // from class: sa1.d0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return c0.f.a.e0(fVar3, c0Var12, z15, zBooleanValue9, (b) obj2);
                            }
                        });
                    case 5:
                        c0Var7 = (k10.c0) this.f179690f;
                        oq.u.b(obj);
                        return c0Var7.c();
                    case 6:
                        c0Var8 = (k10.c0) this.f179690f;
                        oq.u.b(obj);
                        return c0Var8.c();
                    case 7:
                        c0Var9 = (k10.c0) this.f179690f;
                        oq.u.b(obj);
                        return c0Var9.c();
                    case 8:
                        int i26 = this.f179694k;
                        int i27 = this.f179693j;
                        ma1.f fVar5 = (ma1.f) this.f179692h;
                        c0Var4 = (k10.c0) this.f179691g;
                        c0Var3 = (c0) this.f179690f;
                        iVar = (dx.i) this.f179689e;
                        oq.u.b(obj);
                        i15 = i26;
                        fVar2 = fVar5;
                        i16 = i27;
                        iVar4 = (dx.i) obj;
                        if (iVar4 instanceof dx.i.Left) {
                            objB3 = vq.b.a(false);
                        } else {
                            if (!(iVar4 instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB3 = ((dx.i.Right) iVar4).b();
                        }
                        zBooleanValue3 = ((Boolean) objB3).booleanValue();
                        oa1.c cVar6 = c0Var3.isCompanyRepresentativesFeatureFlagActiveUC;
                        gz.b.a.C1792a c1792a7 = gz.b.a.C1792a.f78542a;
                        this.f179689e = vq.j.a(iVar);
                        this.f179690f = c0Var3;
                        this.f179691g = c0Var4;
                        this.f179692h = fVar2;
                        this.f179693j = i16;
                        this.f179694k = i15;
                        this.f179695l = zBooleanValue3;
                        this.f179696m = 9;
                        objA4 = cVar6.a(c1792a7, this);
                        if (objA4 != objE) {
                            z16 = zBooleanValue3;
                            obj = objA4;
                            c0Var13 = c0Var4;
                            c0Var14 = c0Var3;
                            iVar5 = (dx.i) obj;
                            if (iVar5 instanceof dx.i.Left) {
                                objB4 = vq.b.a(false);
                            } else {
                                if (iVar5 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB4 = ((dx.i.Right) iVar5).b();
                            }
                            final boolean zBooleanValue10 = ((Boolean) objB4).booleanValue();
                            return c0Var13.d(new er.l() { // from class: sa1.k0
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return c0.f.a.d0(fVar2, c0Var14, z16, zBooleanValue10, (b) obj2);
                                }
                            });
                        }
                        return objE;
                    case 9:
                        z16 = this.f179695l;
                        fVar2 = (ma1.f) this.f179692h;
                        c0Var13 = (k10.c0) this.f179691g;
                        c0Var14 = (c0) this.f179690f;
                        oq.u.b(obj);
                        iVar5 = (dx.i) obj;
                        if (iVar5 instanceof dx.i.Left) {
                            objB4 = vq.b.a(false);
                        } else {
                            if (iVar5 instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB4 = ((dx.i.Right) iVar5).b();
                        }
                        final boolean zBooleanValue11 = ((Boolean) objB4).booleanValue();
                        return c0Var13.d(new er.l() { // from class: sa1.k0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return c0.f.a.d0(fVar2, c0Var14, z16, zBooleanValue11, (b) obj2);
                            }
                        });
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            public final tq.e<oq.i0> b0(tq.e<?> eVar) {
                return new a(this.f179697n, this.f179698p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends sa1.b>> eVar) {
                return ((a) b0(eVar)).J(oq.i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f179687f;
            Object objE = uq.b.e();
            int i15 = this.f179686e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = c0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(c0.this, c0Var, null);
            this.f179687f = vq.j.a(c0Var);
            this.f179686e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sa1.a.d dVar, k10.c0<sa1.b> c0Var, tq.e<? super k10.l<? extends sa1.b>> eVar) {
            f fVar = c0.this.new f(eVar);
            fVar.f179687f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsa1/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lsa1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<sa1.b.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179700e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f179700e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c0.this.d9(sa1.a.d.f179578a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(sa1.b.a aVar, tq.e<? super oq.i0> eVar) {
            return ((g) v(aVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return c0.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsa1/a$c;", "<unused var>", "Lsa1/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lsa1/a$c;Lsa1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sa1.a.c, sa1.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179703f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f179705e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f179706f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f179707g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f179708h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f179709j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ c0 f179710k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ sa1.b.Initialized f179711l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, sa1.b.Initialized initialized, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f179710k = c0Var;
                this.f179711l = initialized;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
            
                if (r4.F(r5, r11) == r0) goto L24;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r11.f179709j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r11.f179706f
                    dx.b r0 = (dx.b) r0
                    java.lang.Object r0 = r11.f179705e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r12)
                    goto Lb9
                L1b:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L23:
                    oq.u.b(r12)
                    goto L5f
                L27:
                    oq.u.b(r12)
                    sa1.c0 r12 = r11.f179710k
                    oa1.a r12 = sa1.c0.z9(r12)
                    oa1.a$a r1 = new oa1.a$a
                    sa1.b$b r4 = r11.f179711l
                    ma1.f r4 = r4.getCompanyDetails()
                    ma1.e r4 = r4.getCompanyData()
                    if (r4 == 0) goto L51
                    java.lang.String r5 = r4.getName()
                    if (r5 == 0) goto L51
                    r9 = 4
                    r10 = 0
                    java.lang.String r6 = " "
                    java.lang.String r7 = "_"
                    r8 = 0
                    java.lang.String r4 = fu.r.P(r5, r6, r7, r8, r9, r10)
                    if (r4 != 0) goto L53
                L51:
                    java.lang.String r4 = "Zaswiadczenie"
                L53:
                    r1.<init>(r4)
                    r11.f179709j = r3
                    java.lang.Object r12 = r12.f(r1, r11)
                    if (r12 != r0) goto L5f
                    goto L96
                L5f:
                    dx.i r12 = (dx.i) r12
                    sa1.c0 r1 = r11.f179710k
                    boolean r3 = r12 instanceof dx.i.Left
                    if (r3 == 0) goto L97
                    r3 = r12
                    dx.i$b r3 = (dx.i.Left) r3
                    java.lang.Object r3 = r3.b()
                    dx.b r3 = (dx.b) r3
                    xw.b r4 = r1.Y1()
                    sa1.a$k$b r5 = new sa1.a$k$b
                    jb4.b r1 = sa1.c0.t9(r1, r3)
                    r5.<init>(r1)
                    java.lang.Object r12 = vq.j.a(r12)
                    r11.f179705e = r12
                    java.lang.Object r12 = vq.j.a(r3)
                    r11.f179706f = r12
                    r12 = 0
                    r11.f179707g = r12
                    r11.f179708h = r12
                    r11.f179709j = r2
                    java.lang.Object r12 = r4.F(r5, r11)
                    if (r12 != r0) goto Lb9
                L96:
                    return r0
                L97:
                    boolean r0 = r12 instanceof dx.i.Right
                    if (r0 == 0) goto Lbc
                    dx.i$c r12 = (dx.i.Right) r12
                    java.lang.Object r12 = r12.b()
                    ma1.q r12 = (ma1.q) r12
                    p50.a$b r2 = new p50.a$b
                    ua1.k r0 = sa1.c0.y9(r1)
                    mx.a r3 = r0.a(r12)
                    r7 = 14
                    r8 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r2.<init>(r3, r4, r5, r6, r7, r8)
                    r1.y(r2)
                Lb9:
                    oq.i0 r12 = oq.i0.f148189a
                    return r12
                Lbc:
                    oq.p r12 = new oq.p
                    r12.<init>()
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: sa1.c0.h.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f179710k, this.f179711l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sa1.b.Initialized initialized = (sa1.b.Initialized) this.f179703f;
            Object objE = uq.b.e();
            int i15 = this.f179702e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = c0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(c0.this, initialized, null);
                this.f179703f = vq.j.a(initialized);
                this.f179702e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(sa1.a.c cVar, sa1.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            h hVar = c0.this.new h(eVar);
            hVar.f179703f = initialized;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsa1/a$h;", "action", "Lsa1/b$b;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lsa1/a$h;Lsa1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<sa1.a.h, sa1.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f179712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f179713f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f179714g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f179715h;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String entryId;
            sa1.b.Initialized initialized = (sa1.b.Initialized) this.f179715h;
            Object objE = uq.b.e();
            int i15 = this.f179714g;
            if (i15 == 0) {
                oq.u.b(obj);
                CompanyData companyData = initialized.getCompanyDetails().getCompanyData();
                if (companyData != null && (entryId = companyData.getEntryId()) != null) {
                    xw.b<sa1.a.k> bVarY1 = c0.this.Y1();
                    sa1.a.k.GoToRepresentatives goToRepresentatives = new sa1.a.k.GoToRepresentatives(entryId, initialized.getCompanyDetails().getOwnerAdult());
                    this.f179715h = vq.j.a(initialized);
                    this.f179712e = vq.j.a(entryId);
                    this.f179713f = 0;
                    this.f179714g = 1;
                    if (bVarY1.F(goToRepresentatives, this) == objE) {
                        return objE;
                    }
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
        public final Object w(sa1.a.h hVar, sa1.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            i iVar = c0.this.new i(eVar);
            iVar.f179715h = initialized;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsa1/a$n;", "<unused var>", "Lsa1/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lsa1/a$n;Lsa1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sa1.a.n, sa1.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179718f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sa1.b.Initialized initialized = (sa1.b.Initialized) this.f179718f;
            Object objE = uq.b.e();
            int i15 = this.f179717e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.d0 d0Var = c0.this.shareTextIntentUseCase;
                a14.d0.Params params = new a14.d0.Params(c0.this.T9(initialized.getCompanyDetails().getCompanyData()));
                this.f179718f = vq.j.a(initialized);
                this.f179717e = 1;
                obj = d0Var.c(params, this);
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
            c0 c0Var = c0.this;
            if (iVar instanceof dx.i.Left) {
                c0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sa1.a.n nVar, sa1.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            j jVar = c0.this.new j(eVar);
            jVar.f179718f = initialized;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsa1/a$e;", "<unused var>", "Lsa1/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lsa1/a$e;Lsa1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<sa1.a.e, sa1.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179721f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List<String> listN;
            CompanyAddresses addresses;
            sa1.b.Initialized initialized = (sa1.b.Initialized) this.f179721f;
            Object objE = uq.b.e();
            int i15 = this.f179720e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sa1.a.k> bVarY1 = c0.this.Y1();
                CompanyData companyData = initialized.getCompanyDetails().getCompanyData();
                if (companyData == null || (addresses = companyData.getAddresses()) == null || (listN = addresses.a()) == null) {
                    listN = pq.v.n();
                }
                sa1.a.k.GoToAdditionalAddresses goToAdditionalAddresses = new sa1.a.k.GoToAdditionalAddresses(listN);
                this.f179721f = vq.j.a(initialized);
                this.f179720e = 1;
                if (bVarY1.F(goToAdditionalAddresses, this) == objE) {
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
        public final Object w(sa1.a.e eVar, sa1.b.Initialized initialized, tq.e<? super oq.i0> eVar2) {
            k kVar = c0.this.new k(eVar2);
            kVar.f179721f = initialized;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsa1/a$g;", "<unused var>", "Lsa1/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lsa1/a$g;Lsa1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<sa1.a.g, sa1.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179724f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List<CompanyCategory> listN;
            sa1.b.Initialized initialized = (sa1.b.Initialized) this.f179724f;
            Object objE = uq.b.e();
            int i15 = this.f179723e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sa1.a.k> bVarY1 = c0.this.Y1();
                CompanyData companyData = initialized.getCompanyDetails().getCompanyData();
                if (companyData == null || (listN = companyData.l()) == null) {
                    listN = pq.v.n();
                }
                CompanyData companyData2 = initialized.getCompanyDetails().getCompanyData();
                sa1.a.k.GoToPKDs goToPKDs = new sa1.a.k.GoToPKDs(listN, companyData2 != null ? companyData2.getCategoryLabelPostfix() : null);
                this.f179724f = vq.j.a(initialized);
                this.f179723e = 1;
                if (bVarY1.F(goToPKDs, this) == objE) {
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
        public final Object w(sa1.a.g gVar, sa1.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            l lVar = c0.this.new l(eVar);
            lVar.f179724f = initialized;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsa1/a$f;", "action", "Lsa1/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsa1/a$f;Lsa1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<sa1.a.GoToMoreShortcuts, sa1.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179727f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sa1.a.GoToMoreShortcuts goToMoreShortcuts = (sa1.a.GoToMoreShortcuts) this.f179727f;
            Object objE = uq.b.e();
            int i15 = this.f179726e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sa1.a.k> bVarY1 = c0.this.Y1();
                sa1.a.k.GoToMoreShortcuts goToMoreShortcuts2 = new sa1.a.k.GoToMoreShortcuts(goToMoreShortcuts.a());
                this.f179727f = vq.j.a(goToMoreShortcuts);
                this.f179726e = 1;
                if (bVarY1.F(goToMoreShortcuts2, this) == objE) {
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
        public final Object w(sa1.a.GoToMoreShortcuts goToMoreShortcuts, sa1.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            m mVar = c0.this.new m(eVar);
            mVar.f179727f = goToMoreShortcuts;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsa1/a$j;", "action", "Lk10/c0;", "Lsa1/b$b;", "state", "Lk10/l;", "Lsa1/b;", "<anonymous>", "(Lsa1/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<sa1.a.HideAlert, k10.c0<sa1.b.Initialized>, tq.e<? super k10.l<? extends sa1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179730f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f179731g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sa1.b.Initialized O(sa1.a.HideAlert hideAlert, sa1.b.Initialized initialized) {
            return sa1.b.Initialized.b(initialized, null, pq.v.M0(initialized.e(), hideAlert.getMessage()), null, false, false, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sa1.a.HideAlert hideAlert = (sa1.a.HideAlert) this.f179730f;
            k10.c0 c0Var = (k10.c0) this.f179731g;
            uq.b.e();
            if (this.f179729e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sa1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.n.O(hideAlert, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sa1.a.HideAlert hideAlert, k10.c0<sa1.b.Initialized> c0Var, tq.e<? super k10.l<? extends sa1.b>> eVar) {
            n nVar = new n(eVar);
            nVar.f179730f = hideAlert;
            nVar.f179731g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsa1/a$b;", "action", "Lsa1/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsa1/a$b;Lsa1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<sa1.a.CopyToClipBoard, sa1.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179733f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sa1.a.CopyToClipBoard copyToClipBoard = (sa1.a.CopyToClipBoard) this.f179733f;
            Object objE = uq.b.e();
            int i15 = this.f179732e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                String value = copyToClipBoard.getValue();
                va1.b snackbarType = copyToClipBoard.getSnackbarType();
                this.f179733f = vq.j.a(copyToClipBoard);
                this.f179732e = 1;
                if (c0Var.K9(value, snackbarType, this) == objE) {
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
        public final Object w(sa1.a.CopyToClipBoard copyToClipBoard, sa1.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            o oVar = c0.this.new o(eVar);
            oVar.f179733f = copyToClipBoard;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsa1/a$p;", "<unused var>", "Lsa1/b$b;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lsa1/a$p;Lsa1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<sa1.a.p, sa1.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179736f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        
            if (r8.F(r2, r7) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            if (r8.F(r2, r7) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
        
            if (r8.F(r2, r7) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
        
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
                java.lang.Object r0 = r7.f179736f
                sa1.b$b r0 = (sa1.b.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f179735e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L23
                if (r2 == r5) goto L1e
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                oq.u.b(r8)
                goto Lb3
            L23:
                oq.u.b(r8)
                ma1.f r8 = r0.getCompanyDetails()
                na1.b r8 = r8.getSuspensionOptions()
                if (r8 == 0) goto L64
                boolean r8 = r8.getActionBlocked()
                if (r8 != r5) goto L64
                sa1.c0 r8 = sa1.c0.this
                xw.b r8 = r8.Y1()
                sa1.a$k$j r2 = new sa1.a$k$j
                sa1.c0 r3 = sa1.c0.this
                ua1.a r3 = sa1.c0.v9(r3)
                ua1.a$a r4 = new ua1.a$a
                sa1.m0 r6 = new sa1.m0
                r6.<init>()
                r4.<init>(r6)
                cb4.d r3 = r3.b(r4)
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f179736f = r0
                r7.f179735e = r5
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto Lb3
                goto Lb2
            L64:
                ma1.f r8 = r0.getCompanyDetails()
                boolean r8 = r8.getOwnerAdult()
                if (r8 != 0) goto L9c
                sa1.c0 r8 = sa1.c0.this
                xw.b r8 = r8.Y1()
                sa1.a$k$j r2 = new sa1.a$k$j
                sa1.c0 r3 = sa1.c0.this
                se1.d r3 = sa1.c0.C9(r3)
                se1.d$a r5 = new se1.d$a
                sa1.n0 r6 = new sa1.n0
                r6.<init>()
                r5.<init>(r6)
                cb4.d r3 = r3.b(r5)
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f179736f = r0
                r7.f179735e = r4
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto Lb3
                goto Lb2
            L9c:
                sa1.c0 r8 = sa1.c0.this
                xw.b r8 = r8.Y1()
                sa1.a$k$l r2 = sa1.a.k.l.f179598a
                java.lang.Object r0 = vq.j.a(r0)
                r7.f179736f = r0
                r7.f179735e = r3
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto Lb3
            Lb2:
                return r1
            Lb3:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: sa1.c0.p.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(sa1.a.p pVar, sa1.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            p pVar2 = c0.this.new p(eVar);
            pVar2.f179736f = initialized;
            return pVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsa1/a$m;", "<unused var>", "Lsa1/b$b;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lsa1/a$m;Lsa1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<sa1.a.m, sa1.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179738e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179739f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        
            if (r8.F(r2, r7) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            if (r8.F(r2, r7) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
        
            if (r8.F(r2, r7) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
        
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
                java.lang.Object r0 = r7.f179739f
                sa1.b$b r0 = (sa1.b.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f179738e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L23
                if (r2 == r5) goto L1e
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                oq.u.b(r8)
                goto Lb3
            L23:
                oq.u.b(r8)
                ma1.f r8 = r0.getCompanyDetails()
                na1.b r8 = r8.getSuspensionOptions()
                if (r8 == 0) goto L64
                boolean r8 = r8.getActionBlocked()
                if (r8 != r5) goto L64
                sa1.c0 r8 = sa1.c0.this
                xw.b r8 = r8.Y1()
                sa1.a$k$j r2 = new sa1.a$k$j
                sa1.c0 r3 = sa1.c0.this
                ua1.a r3 = sa1.c0.v9(r3)
                ua1.a$a r4 = new ua1.a$a
                sa1.o0 r6 = new sa1.o0
                r6.<init>()
                r4.<init>(r6)
                cb4.d r3 = r3.b(r4)
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f179739f = r0
                r7.f179738e = r5
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto Lb3
                goto Lb2
            L64:
                ma1.f r8 = r0.getCompanyDetails()
                boolean r8 = r8.getOwnerAdult()
                if (r8 != 0) goto L9c
                sa1.c0 r8 = sa1.c0.this
                xw.b r8 = r8.Y1()
                sa1.a$k$j r2 = new sa1.a$k$j
                sa1.c0 r3 = sa1.c0.this
                se1.d r3 = sa1.c0.C9(r3)
                se1.d$a r5 = new se1.d$a
                sa1.p0 r6 = new sa1.p0
                r6.<init>()
                r5.<init>(r6)
                cb4.d r3 = r3.b(r5)
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f179739f = r0
                r7.f179738e = r4
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto Lb3
                goto Lb2
            L9c:
                sa1.c0 r8 = sa1.c0.this
                xw.b r8 = r8.Y1()
                sa1.a$k$i r2 = sa1.a.k.i.f179595a
                java.lang.Object r0 = vq.j.a(r0)
                r7.f179739f = r0
                r7.f179738e = r3
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto Lb3
            Lb2:
                return r1
            Lb3:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: sa1.c0.q.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(sa1.a.m mVar, sa1.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            q qVar = c0.this.new q(eVar);
            qVar.f179739f = initialized;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsa1/a$o;", "<unused var>", "Lsa1/b$e;", "Loq/i0;", "<anonymous>", "(Lsa1/a$o;Lsa1/b$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<sa1.a.o, sa1.b.OpenCompanyRejectedStatus, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179741e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179741e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sa1.a.k> bVarY1 = c0.this.Y1();
                sa1.a.k.C4620k c4620k = sa1.a.k.C4620k.f179597a;
                this.f179741e = 1;
                if (bVarY1.F(c4620k, this) == objE) {
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
        public final Object w(sa1.a.o oVar, sa1.b.OpenCompanyRejectedStatus openCompanyRejectedStatus, tq.e<? super oq.i0> eVar) {
            return c0.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsa1/a$i;", "<unused var>", "Lsa1/b$f;", "Loq/i0;", "<anonymous>", "(Lsa1/a$i;Lsa1/b$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<sa1.a.i, sa1.b.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179743e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179743e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.q qVar = c0.this.goToStoreIntentUseCase;
                a14.q.Params params = new a14.q.Params(null);
                this.f179743e = 1;
                obj = qVar.c(params, this);
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
            c0 c0Var = c0.this;
            if (iVar instanceof dx.i.Left) {
                c0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(oq.i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sa1.a.i iVar, sa1.b.f fVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new s(eVar).J(oq.i0.f148189a);
        }
    }

    public c0(yy.a aVar, la1.a aVar2, oa1.a aVar3, ac4.a aVar4, a14.d0 d0Var, ja1.a aVar5, ua1.j jVar, ua1.k kVar, i70.n nVar, ib4.c cVar, a14.w wVar, mx.c cVar2, ia1.a aVar6, a14.d dVar, oa1.d dVar2, oa1.c cVar3, a14.q qVar, se1.d dVar3, ua1.a aVar7) {
        this.interactor = aVar2;
        this.downloadCertificateUseCase = aVar3;
        this.callActionWithLoaderUseCase = aVar4;
        this.shareTextIntentUseCase = d0Var;
        this.isNewCompanyApplicationFeatureFlagActiveUseCase = aVar5;
        this.mapper = jVar;
        this.downloadCertificateMapper = kVar;
        this.snackBarManagerStateHolder = nVar;
        this.genericDomainErrorMapper = cVar;
        this.openUrlIntentUseCase = wVar;
        this.labelProvider = cVar2;
        this.companyEndpoints = aVar6;
        this.copyToClipboardUseCase = dVar;
        this.isCompanySuspensionFeatureFlagActiveUC = dVar2;
        this.isCompanyRepresentativesFeatureFlagActiveUC = cVar3;
        this.goToStoreIntentUseCase = qVar;
        this.notAdultDialogMapper = dVar3;
        this.applicationAlreadyProcessedDialog = aVar7;
        sa1.b.a aVar8 = sa1.b.a.f179605a;
        this.initialState = aVar8;
        this.stateMachine = aVar.a(aVar8, new er.l() { // from class: sa1.q
            @Override // er.l
            public final Object b(Object obj) {
                return c0.V9(this.f179788a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), N9(aVar8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K9(String str, va1.b bVar, tq.e<? super oq.i0> eVar) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = b.f179668a[bVar.ordinal()];
        if (i16 == 1) {
            i15 = ha1.a.f82512u4;
        } else if (i16 == 2) {
            i15 = ha1.a.f82519v4;
        } else if (i16 == 3) {
            i15 = ha1.a.f82526w4;
        } else {
            if (i16 != 4) {
                throw new oq.p();
            }
            i15 = ha1.a.f82505t4;
        }
        Object objC = this.copyToClipboardUseCase.c(new a14.d.Params(str, cVar.c(i15)), eVar);
        return objC == uq.b.e() ? objC : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b L9(dx.b domainError) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: sa1.s
            @Override // er.l
            public final Object b(Object obj) {
                return c0.M9(this.f179791a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(c0 c0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            c0Var.d9(sa1.a.C4618a.f179574a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            c0Var.d9(sa1.a.d.f179578a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sa1.c.a N9(sa1.b state) {
        return this.mapper.b(new ua1.j.Params(state, b9(sa1.a.c.f179577a), b9(sa1.a.n.f179601a), new er.p() { // from class: sa1.t
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return c0.O9(this.f179793a, (String) obj, (va1.b) obj2);
            }
        }, new er.l() { // from class: sa1.u
            @Override // er.l
            public final Object b(Object obj) {
                return c0.P9(this.f179794a, (String) obj);
            }
        }, b9(sa1.a.e.f179579a), b9(sa1.a.g.f179581a), new er.l() { // from class: sa1.v
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Q9(this.f179795a, (List) obj);
            }
        }, new er.l() { // from class: sa1.w
            @Override // er.l
            public final Object b(Object obj) {
                return c0.R9(this.f179796a, (String) obj);
            }
        }, b9(sa1.a.d.f179578a), b9(sa1.a.o.f179602a), b9(sa1.a.C4618a.f179574a), new er.l() { // from class: sa1.x
            @Override // er.l
            public final Object b(Object obj) {
                return c0.S9(this.f179801a, (String) obj);
            }
        }, b9(sa1.a.p.f179603a), b9(sa1.a.m.f179600a), b9(sa1.a.h.f179582a), b9(sa1.a.i.f179583a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(c0 c0Var, String str, va1.b bVar) {
        c0Var.d9(new sa1.a.CopyToClipBoard(str, bVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(c0 c0Var, String str) {
        c0Var.d9(new sa1.a.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(c0 c0Var, List list) {
        c0Var.d9(new sa1.a.GoToMoreShortcuts(list));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(c0 c0Var, String str) {
        c0Var.d9(new sa1.a.HideAlert(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(c0 c0Var, String str) {
        c0Var.d9(new sa1.a.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String T9(CompanyData companyData) {
        String name;
        String nip;
        String correspondenceAddress;
        CompanyAddresses addresses;
        CompanyAddresses addresses2;
        String regon;
        StringBuilder sb5 = new StringBuilder();
        String str = "-";
        if (companyData == null || (name = companyData.getName()) == null) {
            name = "-";
        }
        sb5.append(name);
        sb5.append("\nNIP: ");
        if (companyData == null || (nip = companyData.getNip()) == null) {
            nip = "-";
        }
        sb5.append(nip);
        sb5.append("\nREGON: ");
        if (companyData != null && (regon = companyData.getRegon()) != null) {
            str = regon;
        }
        sb5.append(str);
        sb5.append("\nADRES: ");
        if (companyData == null || (addresses2 = companyData.getAddresses()) == null || (correspondenceAddress = addresses2.getMainAddress()) == null) {
            correspondenceAddress = (companyData == null || (addresses = companyData.getAddresses()) == null) ? null : addresses.getCorrespondenceAddress();
        }
        sb5.append(correspondenceAddress);
        return sb5.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(final c0 c0Var, k10.v vVar) {
        vVar.c(fr.q0.c(sa1.b.class), new er.l() { // from class: sa1.y
            @Override // er.l
            public final Object b(Object obj) {
                return c0.W9(this.f179802a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sa1.b.a.class), new er.l() { // from class: sa1.z
            @Override // er.l
            public final Object b(Object obj) {
                return c0.X9(this.f179803a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sa1.b.Initialized.class), new er.l() { // from class: sa1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Y9(this.f179604a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sa1.b.OpenCompanyRejectedStatus.class), new er.l() { // from class: sa1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Z9(this.f179618a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sa1.b.f.class), new er.l() { // from class: sa1.r
            @Override // er.l
            public final Object b(Object obj) {
                return c0.aa(this.f179789a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(c0 c0Var, k10.z zVar) {
        d dVar = c0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(sa1.a.C4618a.class), oVar, dVar);
        zVar.x(fr.q0.c(sa1.a.OpenUrl.class), oVar, c0Var.new e(null));
        zVar.v(fr.q0.c(sa1.a.d.class), oVar, c0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(c0 c0Var, k10.z zVar) {
        zVar.C(c0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(c0 c0Var, k10.z zVar) {
        h hVar = c0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(sa1.a.c.class), oVar, hVar);
        zVar.x(fr.q0.c(sa1.a.n.class), oVar, c0Var.new j(null));
        zVar.x(fr.q0.c(sa1.a.e.class), oVar, c0Var.new k(null));
        zVar.x(fr.q0.c(sa1.a.g.class), oVar, c0Var.new l(null));
        zVar.x(fr.q0.c(sa1.a.GoToMoreShortcuts.class), oVar, c0Var.new m(null));
        zVar.v(fr.q0.c(sa1.a.HideAlert.class), oVar, new n(null));
        zVar.x(fr.q0.c(sa1.a.CopyToClipBoard.class), oVar, c0Var.new o(null));
        zVar.x(fr.q0.c(sa1.a.p.class), oVar, c0Var.new p(null));
        zVar.x(fr.q0.c(sa1.a.m.class), oVar, c0Var.new q(null));
        zVar.x(fr.q0.c(sa1.a.h.class), oVar, c0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(c0 c0Var, k10.z zVar) {
        r rVar = c0Var.new r(null);
        zVar.x(fr.q0.c(sa1.a.o.class), k10.o.CANCEL_PREVIOUS, rVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(c0 c0Var, k10.z zVar) {
        s sVar = c0Var.new s(null);
        zVar.x(fr.q0.c(sa1.a.i.class), k10.o.CANCEL_PREVIOUS, sVar);
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: U9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<sa1.a.k> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<sa1.b, sa1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<sa1.c.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
