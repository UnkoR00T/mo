package ny1;

import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001qB\u008b\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0001\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b/\u00100J\u001f\u00105\u001a\u000204*\u0002012\n\b\u0002\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b5\u00106J)\u0010=\u001a\u00020<*\u00020.2\u0006\u00108\u001a\u0002072\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:09H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020:2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010e\u001a\b\u0012\u0004\u0012\u00020`0_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR&\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR \u0010(\u001a\b\u0012\u0004\u0012\u00020)0l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p¨\u0006r"}, d2 = {"Lny1/x;", "Ll00/g;", "Lny1/d;", "Lny1/c;", "Lny1/e;", "", "Lyy/a;", "stateMachineFactory", "Loy1/z;", "mapper", "Lac4/k;", "nfcDisableReadingUseCase", "Lxw1/c;", "processInterruptDialogMapper", "Lmx/c;", "labelProvider", "Loy1/v;", "resetPinErrorMapper", "Lac4/b;", "checkNFCStatusUseCase", "Lac4/i;", "goToNfcSettingsUseCase", "Lxw1/b;", "nfcDialogMapper", "Lpx/d;", "remoteLogger", "Lhb4/d;", "errorVMSFactory", "Lrw1/e;", "compareCertDataWithUserDataUseCase", "Ljx/g;", "systemInfo", "Lic4/b;", "nfcEdoEnableReadingUseCase", "Lac4/l;", "nfcMonitorReadingUseCase", "Lny1/f;", "setupContract", "<init>", "(Lyy/a;Loy1/z;Lac4/k;Lxw1/c;Lmx/c;Loy1/v;Lac4/b;Lac4/i;Lxw1/b;Lpx/d;Lhb4/d;Lrw1/e;Ljx/g;Lic4/b;Lac4/l;Lny1/f;)V", "state", "Lny1/e$a;", "K9", "(Lny1/d;)Lny1/e$a;", "Lcy/c$a;", "error", "Lpy1/b;", "I9", "(Lcy/c$a;Ltq/e;)Ljava/lang/Object;", "Lic4/a;", "", "triesLeft", "Lpy1/b$b;", "U9", "(Lic4/a;Ljava/lang/Integer;)Lpy1/b$b;", "Lyw1/a;", "certificateType", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "Ljb4/b;", "G9", "(Lpy1/b;Lyw1/a;Ler/a;)Ljb4/b;", "", "message", "J9", "(Ljava/lang/String;)V", "b", "Loy1/z;", "c", "Lac4/k;", "d", "Lxw1/c;", "e", "Lmx/c;", "f", "Loy1/v;", "g", "Lac4/b;", "h", "Lac4/i;", "j", "Lxw1/b;", "k", "Lpx/d;", "l", "Lhb4/d;", "m", "Lrw1/e;", "n", "Lny1/f;", "Lny1/d$a;", "p", "Lny1/d$a;", "initialState", "Lxw/b;", "Lny1/c$f;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "r", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<ny1.d, ny1.c> implements ny1.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oy1.z mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.k nfcDisableReadingUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw1.c processInterruptDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oy1.v resetPinErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.b checkNFCStatusUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.i goToNfcSettingsUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw1.b nfcDialogMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final rw1.e compareCertDataWithUserDataUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ny1.f setupContract;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ny1.d.Initial initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ny1.c.f> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ny1.d, ny1.c> stateMachine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ny1.e.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lny1/x$a;", "Lf00/j0;", "Lny1/f;", "Lny1/x;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<ny1.f, x> {
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f139624b;

        static {
            int[] iArr = new int[ic4.c.values().length];
            try {
                iArr[ic4.c.INTERRUPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ic4.c.INTERRUPTED_TAG_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ic4.c.INTERRUPTED_TECHNICAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f139623a = iArr;
            int[] iArr2 = new int[ic4.a.values().length];
            try {
                iArr2[ic4.a.INCORRECT_CAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ic4.a.PIN_OR_PUK_BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ic4.a.CERTIFICATE_INACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ic4.a.CERTIFICATE_MISSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ic4.a.DATA_MISSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ic4.a.INCORRECT_PIN_OR_PUK.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f139624b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f139625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f139626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139627f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f139629h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f139627f = obj;
            this.f139629h |= PKIFailureInfo.systemUnavail;
            return x.this.I9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<ny1.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f139630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f139631b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f139632a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f139633b;

            /* JADX INFO: renamed from: ny1.x$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3461a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f139634d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f139635e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f139636f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f139638h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f139639j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f139640k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f139641l;

                public C3461a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f139634d = obj;
                    this.f139635e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f139632a = hVar;
                this.f139633b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3461a c3461a;
                if (eVar instanceof C3461a) {
                    c3461a = (C3461a) eVar;
                    int i15 = c3461a.f139635e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3461a.f139635e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3461a = new C3461a(eVar);
                    }
                } else {
                    c3461a = new C3461a(eVar);
                }
                Object obj2 = c3461a.f139634d;
                Object objE = uq.b.e();
                int i16 = c3461a.f139635e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f139632a;
                    ny1.e.a aVarK9 = this.f139633b.K9((ny1.d) obj);
                    c3461a.f139636f = vq.j.a(obj);
                    c3461a.f139638h = vq.j.a(c3461a);
                    c3461a.f139639j = vq.j.a(obj);
                    c3461a.f139640k = vq.j.a(hVar);
                    c3461a.f139641l = 0;
                    c3461a.f139635e = 1;
                    if (hVar.F(aVarK9, c3461a) == objE) {
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

        public d(mu.g gVar, x xVar) {
            this.f139630a = gVar;
            this.f139631b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ny1.e.a> hVar, tq.e eVar) {
            Object objA = this.f139630a.a(new a(hVar, this.f139631b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lny1/d$a;", "state", "Lk10/l;", "Lny1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<ny1.d.Initial>, tq.e<? super k10.l<? extends ny1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139643f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.CheckNfc O(x xVar, ny1.d.Initial initial) {
            return new ny1.d.b.CheckNfc(new ny1.d.b.FormData(xVar.setupContract.j4().getNewPin(), xVar.setupContract.j4().getPuk(), xVar.setupContract.j4().getCan(), xVar.setupContract.j4().getCertificateType(), initial.getAreAnimationsEnabled()), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f139643f;
            uq.b.e();
            if (this.f139642e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final x xVar = x.this;
            return c0Var.d(new er.l() { // from class: ny1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.e.O(xVar, (d.Initial) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ny1.d.Initial> c0Var, tq.e<? super k10.l<? extends ny1.d>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = x.this.new e(eVar);
            eVar2.f139643f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lny1/d$b$a;", "state", "Lk10/l;", "Lny1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<ny1.d.b.CheckNfc>, tq.e<? super k10.l<? extends ny1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139646f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.ReadCert O(ny1.d.b.CheckNfc checkNfc) {
            return new ny1.d.b.ReadCert(checkNfc.getFormData(), null, 2, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
        
            if (r10.F(r2, r9) == r1) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f139646f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r9.f139645e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r10)
                goto L89
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                oq.u.b(r10)
                goto L38
            L22:
                oq.u.b(r10)
                ny1.x r10 = ny1.x.this
                ac4.b r10 = ny1.x.r9(r10)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r9.f139646f = r0
                r9.f139645e = r4
                java.lang.Object r10 = r10.c(r2, r9)
                if (r10 != r1) goto L38
                goto L88
            L38:
                ac4.b$a r10 = (ac4.b.a) r10
                ac4.b$a$b r2 = ac4.b.a.C0108b.f5391a
                boolean r2 = fr.t.c(r10, r2)
                if (r2 == 0) goto L4c
                ny1.z r10 = new ny1.z
                r10.<init>()
                k10.l r10 = r0.d(r10)
                return r10
            L4c:
                ac4.b$a$a r2 = ac4.b.a.C0107a.f5390a
                boolean r10 = fr.t.c(r10, r2)
                if (r10 == 0) goto L8e
                ny1.x r10 = ny1.x.this
                xw.b r10 = r10.Y1()
                ny1.c$f$f r2 = new ny1.c$f$f
                ny1.x r4 = ny1.x.this
                xw1.b r4 = ny1.x.w9(r4)
                xw1.b$a r5 = new xw1.b$a
                ny1.x r6 = ny1.x.this
                ny1.c$h r7 = ny1.c.h.f139516a
                er.a r6 = ny1.x.p9(r6, r7)
                ny1.x r7 = ny1.x.this
                ny1.c$a r8 = ny1.c.a.f139504a
                er.a r7 = ny1.x.p9(r7, r8)
                r5.<init>(r6, r7)
                cb4.d r4 = r4.b(r5)
                r2.<init>(r4)
                r9.f139646f = r0
                r9.f139645e = r3
                java.lang.Object r10 = r10.F(r2, r9)
                if (r10 != r1) goto L89
            L88:
                return r1
            L89:
                k10.l r10 = r0.c()
                return r10
            L8e:
                oq.p r10 = new oq.p
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ny1.x.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ny1.d.b.CheckNfc> c0Var, tq.e<? super k10.l<? extends ny1.d>> eVar) {
            return ((f) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = x.this.new f(eVar);
            fVar.f139646f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lny1/c$h;", "<unused var>", "Lk10/c0;", "Lny1/d$b$a;", "state", "Lk10/l;", "Lny1/d;", "<anonymous>", "(Lny1/c$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ny1.c.h, k10.c0<ny1.d.b.CheckNfc>, tq.e<? super k10.l<? extends ny1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139649f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.Error O(k10.c0 c0Var, x xVar, dx.b.Business business, ny1.d.b.CheckNfc checkNfc) {
            return new ny1.d.b.Error(((ny1.d.b.CheckNfc) c0Var.a()).getFormData(), xVar.errorVMSFactory.a(xVar.G9(new py1.b.GenericError(business), ((ny1.d.b.CheckNfc) c0Var.a()).getFormData().getCertificateType(), xVar.b9(ny1.c.a.f139504a))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f139649f;
            Object objE = uq.b.e();
            int i15 = this.f139648e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.i iVar = x.this.goToNfcSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f139649f = c0Var;
                this.f139648e = 1;
                obj = iVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar2 = (dx.i) obj;
            final x xVar = x.this;
            if (iVar2 instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVar2).b();
                return c0Var.d(new er.l() { // from class: ny1.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.g.O(c0Var, xVar, business, (d.b.CheckNfc) obj2);
                    }
                });
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            xVar.d9(ny1.c.a.f139504a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ny1.c.h hVar, k10.c0<ny1.d.b.CheckNfc> c0Var, tq.e<? super k10.l<? extends ny1.d>> eVar) {
            g gVar = x.this.new g(eVar);
            gVar.f139649f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lny1/d$b$e;", "state", "Lk10/l;", "Lny1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<ny1.d.b.ReadCert>, tq.e<? super k10.l<? extends ny1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f139651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f139652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f139653g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f139655j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f139656a;

            static {
                int[] iArr = new int[yw1.a.values().length];
                try {
                    iArr[yw1.a.AUTHENTICATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yw1.a.AUTHORIZATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f139656a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ic4.b bVar, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f139655j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.Error V(k10.c0 c0Var, x xVar, ny1.d.b.ReadCert readCert) {
            return new ny1.d.b.Error(((ny1.d.b.ReadCert) c0Var.a()).getFormData(), xVar.errorVMSFactory.a(xVar.G9(py1.b.EnumC4043b.GENERIC_ERROR, ((ny1.d.b.ReadCert) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: ny1.c0
                @Override // er.a
                public final Object a() {
                    return x.h.X();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
        
            if (r12 == r1) goto L23;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ny1.x.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ny1.d.b.ReadCert> c0Var, tq.e<? super k10.l<? extends ny1.d>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = x.this.new h(this.f139655j, eVar);
            hVar.f139653g = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lny1/d$b$e;", "state", "Lk10/l;", "Lny1/d;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<cy.c, k10.c0<ny1.d.b.ReadCert>, tq.e<? super k10.l<? extends ny1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139658f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f139659g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.Error b0(k10.c0 c0Var, x xVar, py1.b bVar, ny1.d.b.ReadCert readCert) {
            return new ny1.d.b.Error(((ny1.d.b.ReadCert) c0Var.a()).getFormData(), xVar.errorVMSFactory.a(xVar.G9(bVar, ((ny1.d.b.ReadCert) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: ny1.i0
                @Override // er.a
                public final Object a() {
                    return x.i.c0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 c0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.ReadCert d0(cy.c cVar, ny1.d.b.ReadCert readCert) {
            return ny1.d.b.ReadCert.d(readCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.CompareCertData e0(cy.c cVar, ny1.d.b.ReadCert readCert) {
            return new ny1.d.b.CompareCertData(readCert.getFormData(), iy.c0.g(((cy.c.Finished) cVar).getCertificate()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.ReadCert f0(cy.c cVar, ny1.d.b.ReadCert readCert) {
            return ny1.d.b.ReadCert.d(readCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.Error g0(k10.c0 c0Var, x xVar, py1.b.EnumC4043b enumC4043b, ny1.d.b.ReadCert readCert) {
            return new ny1.d.b.Error(((ny1.d.b.ReadCert) c0Var.a()).getFormData(), xVar.errorVMSFactory.a(xVar.G9(enumC4043b, ((ny1.d.b.ReadCert) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: ny1.j0
                @Override // er.a
                public final Object a() {
                    return x.i.h0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 h0() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy.c cVar = (cy.c) this.f139658f;
            final k10.c0 c0Var = (k10.c0) this.f139659g;
            Object objE = uq.b.e();
            int i15 = this.f139657e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!(cVar instanceof cy.c.Error)) {
                    if (cVar instanceof cy.c.Finished) {
                        return c0Var.d(new er.l() { // from class: ny1.f0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return x.i.e0(cVar, (d.b.ReadCert) obj2);
                            }
                        });
                    }
                    if ((cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
                        return c0Var.b(new er.l() { // from class: ny1.g0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return x.i.f0(cVar, (d.b.ReadCert) obj2);
                            }
                        });
                    }
                    if (!(cVar instanceof cy.c.InvalidPinOrPukError)) {
                        throw new oq.p();
                    }
                    cy.c.InvalidPinOrPukError invalidPinOrPukError = (cy.c.InvalidPinOrPukError) cVar;
                    final py1.b.EnumC4043b enumC4043bU9 = x.this.U9(ic4.a.INSTANCE.a(invalidPinOrPukError.getCode()), vq.b.e(invalidPinOrPukError.getTriesLeft()));
                    x.this.J9(enumC4043bU9 + " - code: " + invalidPinOrPukError.getCode() + ", content: " + invalidPinOrPukError.getContent());
                    final x xVar = x.this;
                    return c0Var.d(new er.l() { // from class: ny1.h0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return x.i.g0(c0Var, xVar, enumC4043bU9, (d.b.ReadCert) obj2);
                        }
                    });
                }
                this.f139658f = cVar;
                this.f139659g = c0Var;
                this.f139657e = 1;
                obj = x.this.I9((cy.c.Error) cVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final py1.b bVar = (py1.b) obj;
            if (bVar != null) {
                final x xVar2 = x.this;
                k10.l lVarD = c0Var.d(new er.l() { // from class: ny1.d0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.i.b0(c0Var, xVar2, bVar, (d.b.ReadCert) obj2);
                    }
                });
                if (lVarD != null) {
                    return lVarD;
                }
            }
            return c0Var.b(new er.l() { // from class: ny1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.i.d0(cVar, (d.b.ReadCert) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<ny1.d.b.ReadCert> c0Var, tq.e<? super k10.l<? extends ny1.d>> eVar) {
            i iVar = x.this.new i(eVar);
            iVar.f139658f = cVar;
            iVar.f139659g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lny1/d$b$b;", "state", "Lk10/l;", "Lny1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<ny1.d.b.CompareCertData>, tq.e<? super k10.l<? extends ny1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f139661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f139662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f139663g;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.Error Z(k10.c0 c0Var, x xVar, ny1.d.b.CompareCertData compareCertData) {
            return new ny1.d.b.Error(((ny1.d.b.CompareCertData) c0Var.a()).getFormData(), xVar.errorVMSFactory.a(xVar.G9(py1.b.EnumC4043b.GENERIC_ERROR, ((ny1.d.b.CompareCertData) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: ny1.n0
                @Override // er.a
                public final Object a() {
                    return x.j.a0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 a0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.ResetPin b0(k10.c0 c0Var, ny1.d.b.CompareCertData compareCertData) {
            return new ny1.d.b.ResetPin(ny1.d.b.FormData.b(((ny1.d.b.CompareCertData) c0Var.a()).getFormData(), null, null, null, null, false, 31, null), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.Error c0(k10.c0 c0Var, x xVar, ny1.d.b.CompareCertData compareCertData) {
            return new ny1.d.b.Error(((ny1.d.b.CompareCertData) c0Var.a()).getFormData(), xVar.errorVMSFactory.a(xVar.G9(py1.b.EnumC4043b.DATA_INCONSISTENCY, ((ny1.d.b.CompareCertData) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: ny1.o0
                @Override // er.a
                public final Object a() {
                    return x.j.d0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 d0() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f139663g;
            Object objE = uq.b.e();
            int i15 = this.f139662f;
            if (i15 == 0) {
                oq.u.b(obj);
                rw1.e.Params params = new rw1.e.Params(((ny1.d.b.CompareCertData) c0Var.a()).getAuthorizationCert());
                rw1.e eVar = x.this.compareCertDataWithUserDataUseCase;
                this.f139663g = c0Var;
                this.f139661e = vq.j.a(params);
                this.f139662f = 1;
                obj = eVar.d(params, this);
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
            final x xVar = x.this;
            if (iVar instanceof dx.i.Left) {
                px.b.y5(xVar.remoteLogger, "DocumentSigning: error during data comparison", null, pq.v.e(new px.a.Feature("DocumentSigning")), 2, null);
                return c0Var.d(new er.l() { // from class: ny1.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.j.Z(c0Var, xVar, (d.b.CompareCertData) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            rw1.e.b bVar = (rw1.e.b) ((dx.i.Right) iVar).b();
            if (fr.t.c(bVar, rw1.e.b.a.f176572a)) {
                return c0Var.d(new er.l() { // from class: ny1.l0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.j.b0(c0Var, (d.b.CompareCertData) obj2);
                    }
                });
            }
            if (!fr.t.c(bVar, rw1.e.b.C4507b.f176573a)) {
                throw new oq.p();
            }
            px.b.y5(xVar.remoteLogger, "DocumentSigning: error during data comparison, data inconsistency", null, pq.v.e(new px.a.Feature("DocumentSigning")), 2, null);
            return c0Var.d(new er.l() { // from class: ny1.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.j.c0(c0Var, xVar, (d.b.CompareCertData) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ny1.d.b.CompareCertData> c0Var, tq.e<? super k10.l<? extends ny1.d>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = x.this.new j(eVar);
            jVar.f139663g = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lny1/d$b$f;", "state", "Lk10/l;", "Lny1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<ny1.d.b.ResetPin>, tq.e<? super k10.l<? extends ny1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f139665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f139666f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f139667g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f139669j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f139670a;

            static {
                int[] iArr = new int[yw1.a.values().length];
                try {
                    iArr[yw1.a.AUTHENTICATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yw1.a.AUTHORIZATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f139670a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ic4.b bVar, tq.e<? super k> eVar) {
            super(2, eVar);
            this.f139669j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.Error V(k10.c0 c0Var, x xVar, ny1.d.b.ResetPin resetPin) {
            return new ny1.d.b.Error(((ny1.d.b.ResetPin) c0Var.a()).getFormData(), xVar.errorVMSFactory.a(xVar.G9(py1.b.EnumC4043b.GENERIC_ERROR, ((ny1.d.b.ResetPin) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: ny1.q0
                @Override // er.a
                public final Object a() {
                    return x.k.X();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ee, code lost:
        
            if (r13 == r1) goto L22;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ny1.x.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ny1.d.b.ResetPin> c0Var, tq.e<? super k10.l<? extends ny1.d>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = x.this.new k(this.f139669j, eVar);
            kVar.f139667g = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lny1/d$b$f;", "state", "Lk10/l;", "Lny1/d;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<cy.c, k10.c0<ny1.d.b.ResetPin>, tq.e<? super k10.l<? extends ny1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f139673g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.Error b0(k10.c0 c0Var, x xVar, py1.b bVar, ny1.d.b.ResetPin resetPin) {
            return new ny1.d.b.Error(((ny1.d.b.ResetPin) c0Var.a()).getFormData(), xVar.errorVMSFactory.a(xVar.G9(bVar, ((ny1.d.b.ResetPin) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: ny1.x0
                @Override // er.a
                public final Object a() {
                    return x.l.c0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 c0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.ResetPin d0(cy.c cVar, ny1.d.b.ResetPin resetPin) {
            return ny1.d.b.ResetPin.d(resetPin, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.Successful e0(ny1.d.b.ResetPin resetPin) {
            return new ny1.d.b.Successful(ny1.d.b.FormData.b(resetPin.getFormData(), null, null, null, null, false, 31, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.ResetPin f0(cy.c cVar, ny1.d.b.ResetPin resetPin) {
            return ny1.d.b.ResetPin.d(resetPin, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ny1.d.b.Error g0(k10.c0 c0Var, x xVar, py1.b.EnumC4043b enumC4043b, ny1.d.b.ResetPin resetPin) {
            return new ny1.d.b.Error(((ny1.d.b.ResetPin) c0Var.a()).getFormData(), xVar.errorVMSFactory.a(xVar.G9(enumC4043b, ((ny1.d.b.ResetPin) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: ny1.w0
                @Override // er.a
                public final Object a() {
                    return x.l.h0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 h0() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy.c cVar = (cy.c) this.f139672f;
            final k10.c0 c0Var = (k10.c0) this.f139673g;
            Object objE = uq.b.e();
            int i15 = this.f139671e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!(cVar instanceof cy.c.Error)) {
                    if (cVar instanceof cy.c.Finished) {
                        return c0Var.d(new er.l() { // from class: ny1.t0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return x.l.e0((d.b.ResetPin) obj2);
                            }
                        });
                    }
                    if ((cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
                        return c0Var.b(new er.l() { // from class: ny1.u0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return x.l.f0(cVar, (d.b.ResetPin) obj2);
                            }
                        });
                    }
                    if (!(cVar instanceof cy.c.InvalidPinOrPukError)) {
                        throw new oq.p();
                    }
                    cy.c.InvalidPinOrPukError invalidPinOrPukError = (cy.c.InvalidPinOrPukError) cVar;
                    final py1.b.EnumC4043b enumC4043bU9 = x.this.U9(ic4.a.INSTANCE.a(invalidPinOrPukError.getCode()), vq.b.e(invalidPinOrPukError.getTriesLeft()));
                    x.this.J9(enumC4043bU9 + " - code: " + invalidPinOrPukError.getCode() + ", content: " + invalidPinOrPukError.getContent());
                    final x xVar = x.this;
                    return c0Var.d(new er.l() { // from class: ny1.v0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return x.l.g0(c0Var, xVar, enumC4043bU9, (d.b.ResetPin) obj2);
                        }
                    });
                }
                this.f139672f = cVar;
                this.f139673g = c0Var;
                this.f139671e = 1;
                obj = x.this.I9((cy.c.Error) cVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final py1.b bVar = (py1.b) obj;
            if (bVar != null) {
                final x xVar2 = x.this;
                k10.l lVarD = c0Var.d(new er.l() { // from class: ny1.r0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.l.b0(c0Var, xVar2, bVar, (d.b.ResetPin) obj2);
                    }
                });
                if (lVarD != null) {
                    return lVarD;
                }
            }
            return c0Var.b(new er.l() { // from class: ny1.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.l.d0(cVar, (d.b.ResetPin) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<ny1.d.b.ResetPin> c0Var, tq.e<? super k10.l<? extends ny1.d>> eVar) {
            l lVar = x.this.new l(eVar);
            lVar.f139672f = cVar;
            lVar.f139673g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lny1/c$d;", "<unused var>", "Lny1/d;", "Loq/i0;", "<anonymous>", "(Lny1/c$d;Lny1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ny1.c.d, ny1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139675e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139675e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ny1.c.f> bVarY1 = x.this.Y1();
                ny1.c.f.d dVar = ny1.c.f.d.f139512a;
                this.f139675e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(ny1.c.d dVar, ny1.d dVar2, tq.e<? super oq.i0> eVar) {
            return x.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lny1/c$e;", "<unused var>", "Lny1/d;", "Loq/i0;", "<anonymous>", "(Lny1/c$e;Lny1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ny1.c.e, ny1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139677e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139677e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ny1.c.f> bVarY1 = x.this.Y1();
                ny1.c.f.e eVar = ny1.c.f.e.f139513a;
                this.f139677e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(ny1.c.e eVar, ny1.d dVar, tq.e<? super oq.i0> eVar2) {
            return x.this.new n(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lny1/c$g;", "<unused var>", "Lny1/d;", "Loq/i0;", "<anonymous>", "(Lny1/c$g;Lny1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ny1.c.g, ny1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139679e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139679e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.k kVar = x.this.nfcDisableReadingUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f139679e = 1;
                if (kVar.c(c1792a, this) == objE) {
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
        public final Object w(ny1.c.g gVar, ny1.d dVar, tq.e<? super oq.i0> eVar) {
            return x.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lny1/c$a;", "<unused var>", "Lny1/d;", "Loq/i0;", "<anonymous>", "(Lny1/c$a;Lny1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<ny1.c.a, ny1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139681e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139681e;
            if (i15 == 0) {
                oq.u.b(obj);
                x.this.d9(ny1.c.g.f139515a);
                xw.b<ny1.c.f> bVarY1 = x.this.Y1();
                ny1.c.f.a aVar = ny1.c.f.a.f139509a;
                this.f139681e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(ny1.c.a aVar, ny1.d dVar, tq.e<? super oq.i0> eVar) {
            return x.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lny1/c$b;", "<unused var>", "Lny1/d;", "Loq/i0;", "<anonymous>", "(Lny1/c$b;Lny1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<ny1.c.b, ny1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139683e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139683e;
            if (i15 == 0) {
                oq.u.b(obj);
                x.this.d9(ny1.c.g.f139515a);
                xw.b<ny1.c.f> bVarY1 = x.this.Y1();
                ny1.c.f.b bVar = ny1.c.f.b.f139510a;
                this.f139683e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(ny1.c.b bVar, ny1.d dVar, tq.e<? super oq.i0> eVar) {
            return x.this.new q(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lny1/c$c;", "action", "Lny1/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lny1/c$c;Lny1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<ny1.c.EndProcessWithResult, ny1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139686f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ny1.c.EndProcessWithResult endProcessWithResult = (ny1.c.EndProcessWithResult) this.f139686f;
            Object objE = uq.b.e();
            int i15 = this.f139685e;
            if (i15 == 0) {
                oq.u.b(obj);
                x.this.d9(ny1.c.g.f139515a);
                xw.b<ny1.c.f> bVarY1 = x.this.Y1();
                ny1.c.f.EndProcessWithResult endProcessWithResult2 = new ny1.c.f.EndProcessWithResult(endProcessWithResult.getResult());
                this.f139686f = vq.j.a(endProcessWithResult);
                this.f139685e = 1;
                if (bVarY1.F(endProcessWithResult2, this) == objE) {
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
        public final Object w(ny1.c.EndProcessWithResult endProcessWithResult, ny1.d dVar, tq.e<? super oq.i0> eVar) {
            r rVar = x.this.new r(eVar);
            rVar.f139686f = endProcessWithResult;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lny1/c$i;", "<unused var>", "Lny1/d;", "Loq/i0;", "<anonymous>", "(Lny1/c$i;Lny1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<ny1.c.i, ny1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139688e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(x xVar) {
            xVar.d9(ny1.c.g.f139515a);
            xVar.d9(ny1.c.b.f139505a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139688e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ny1.c.f> bVarY1 = x.this.Y1();
                xw1.c cVar = x.this.processInterruptDialogMapper;
                Label labelC = x.this.labelProvider.c(lw1.j0.f120719e3);
                er.a aVar = new er.a() { // from class: ny1.y0
                    @Override // er.a
                    public final Object a() {
                        return x.s.V();
                    }
                };
                final x xVar = x.this;
                ny1.c.f.ShowDialog showDialog = new ny1.c.f.ShowDialog(cVar.b(new xw1.c.Params(labelC, aVar, new er.a() { // from class: ny1.z0
                    @Override // er.a
                    public final Object a() {
                        return x.s.X(xVar);
                    }
                })));
                this.f139688e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ny1.c.i iVar, ny1.d dVar, tq.e<? super oq.i0> eVar) {
            return x.this.new s(eVar).J(oq.i0.f148189a);
        }
    }

    public x(yy.a aVar, oy1.z zVar, ac4.k kVar, xw1.c cVar, mx.c cVar2, oy1.v vVar, ac4.b bVar, ac4.i iVar, xw1.b bVar2, px.d dVar, hb4.d dVar2, rw1.e eVar, jx.g gVar, final ic4.b bVar3, final ac4.l lVar, ny1.f fVar) {
        this.mapper = zVar;
        this.nfcDisableReadingUseCase = kVar;
        this.processInterruptDialogMapper = cVar;
        this.labelProvider = cVar2;
        this.resetPinErrorMapper = vVar;
        this.checkNFCStatusUseCase = bVar;
        this.goToNfcSettingsUseCase = iVar;
        this.nfcDialogMapper = bVar2;
        this.remoteLogger = dVar;
        this.errorVMSFactory = dVar2;
        this.compareCertDataWithUserDataUseCase = eVar;
        this.setupContract = fVar;
        ny1.d.Initial initial = new ny1.d.Initial(gVar.r());
        this.initialState = initial;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initial, new er.l() { // from class: ny1.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.N9(this.f139604a, lVar, bVar3, (k10.v) obj);
            }
        });
        this.state = a9(new d(e9().getState(), this), K9(initial));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b G9(py1.b bVar, yw1.a aVar, er.a<oq.i0> aVar2) {
        return this.resetPinErrorMapper.b(new oy1.v.Params(bVar, aVar, b9(ny1.c.d.f139507a), b9(ny1.c.e.f139508a), new er.l() { // from class: ny1.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.H9(this.f139600a, (py1.c) obj);
            }
        }, b9(ny1.c.b.f139505a), aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(x xVar, py1.c cVar) {
        xVar.d9(new ny1.c.EndProcessWithResult(cVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I9(cy.c.Error error, tq.e<? super py1.b> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f139629h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f139629h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f139627f;
        Object objE = uq.b.e();
        int i16 = cVar.f139629h;
        if (i16 == 0) {
            oq.u.b(obj);
            ic4.a aVarA = ic4.a.INSTANCE.a(error.getCode());
            if (aVarA != ic4.a.INTERRUPTED) {
                py1.b.EnumC4043b enumC4043bV9 = V9(this, aVarA, null, 1, null);
                J9(enumC4043bV9 + " - code: " + error.getCode() + ", content: " + error.getContent());
                return enumC4043bV9;
            }
            int i17 = b.f139623a[ic4.c.INSTANCE.a(error.getContent()).ordinal()];
            if (i17 == 1 || i17 == 2) {
                return null;
            }
            if (i17 != 3) {
                throw new oq.p();
            }
            ac4.k kVar = this.nfcDisableReadingUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            cVar.f139625d = error;
            cVar.f139626e = vq.j.a(aVarA);
            cVar.f139629h = 1;
            if (kVar.c(c1792a, cVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            error = (cy.c.Error) cVar.f139625d;
            oq.u.b(obj);
        }
        J9("INTERRUPTED_TECHNICAL_ERROR - code: " + error.getCode() + ", content: " + error.getContent());
        return py1.b.EnumC4043b.TECHNICAL_ERROR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J9(String message) {
        px.b.y5(this.remoteLogger, message, null, pq.v.e(new px.a.Feature("ResetPin")), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ny1.e.a K9(ny1.d state) {
        return this.mapper.b(new oy1.z.Params(state, b9(ny1.c.a.f139504a), b9(ny1.c.i.f139517a), new er.l() { // from class: ny1.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.L9(this.f139598a, (py1.c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(x xVar, py1.c cVar) {
        xVar.d9(new ny1.c.EndProcessWithResult(cVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(final x xVar, final ac4.l lVar, final ic4.b bVar, k10.v vVar) {
        vVar.c(fr.q0.c(ny1.d.Initial.class), new er.l() { // from class: ny1.o
            @Override // er.l
            public final Object b(Object obj) {
                return x.O9(this.f139582a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ny1.d.b.CheckNfc.class), new er.l() { // from class: ny1.p
            @Override // er.l
            public final Object b(Object obj) {
                return x.P9(this.f139583a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ny1.d.b.ReadCert.class), new er.l() { // from class: ny1.q
            @Override // er.l
            public final Object b(Object obj) {
                return x.Q9(lVar, xVar, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ny1.d.b.CompareCertData.class), new er.l() { // from class: ny1.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.R9(this.f139589a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ny1.d.b.ResetPin.class), new er.l() { // from class: ny1.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.S9(lVar, xVar, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ny1.d.class), new er.l() { // from class: ny1.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.T9(this.f139597a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(x xVar, k10.z zVar) {
        zVar.A(xVar.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(x xVar, k10.z zVar) {
        zVar.A(xVar.new f(null));
        g gVar = xVar.new g(null);
        zVar.v(fr.q0.c(ny1.c.h.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(ac4.l lVar, x xVar, ic4.b bVar, k10.z zVar) {
        zVar.A(xVar.new h(bVar, null));
        k10.k.m(zVar, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, xVar.new i(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(x xVar, k10.z zVar) {
        zVar.A(xVar.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(ac4.l lVar, x xVar, ic4.b bVar, k10.z zVar) {
        zVar.A(xVar.new k(bVar, null));
        k10.k.m(zVar, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, xVar.new l(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(x xVar, k10.z zVar) {
        m mVar = xVar.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ny1.c.d.class), oVar, mVar);
        zVar.x(fr.q0.c(ny1.c.e.class), oVar, xVar.new n(null));
        zVar.x(fr.q0.c(ny1.c.g.class), oVar, xVar.new o(null));
        zVar.x(fr.q0.c(ny1.c.a.class), oVar, xVar.new p(null));
        zVar.x(fr.q0.c(ny1.c.b.class), oVar, xVar.new q(null));
        zVar.x(fr.q0.c(ny1.c.EndProcessWithResult.class), oVar, xVar.new r(null));
        zVar.x(fr.q0.c(ny1.c.i.class), oVar, xVar.new s(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final py1.b.EnumC4043b U9(ic4.a aVar, Integer num) {
        switch (b.f139624b[aVar.ordinal()]) {
            case 1:
                return py1.b.EnumC4043b.WRONG_CAN;
            case 2:
                return py1.b.EnumC4043b.PUK_BLOCKED;
            case 3:
                return py1.b.EnumC4043b.CERTIFICATE_INACTIVE;
            case 4:
                return py1.b.EnumC4043b.CERTIFICATE_MISSING;
            case 5:
                return py1.b.EnumC4043b.DATA_MISSING;
            case 6:
                if (num != null && num.intValue() == 1) {
                    return py1.b.EnumC4043b.WRONG_PUK_1_TRY_LEFT;
                }
                return (num != null && num.intValue() == 2) ? py1.b.EnumC4043b.WRONG_PUK_2_TRIES_LEFT : py1.b.EnumC4043b.GENERIC_ERROR;
            default:
                return py1.b.EnumC4043b.GENERIC_ERROR;
        }
    }

    static /* synthetic */ py1.b.EnumC4043b V9(x xVar, ic4.a aVar, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            num = null;
        }
        return xVar.U9(aVar, num);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ny1.e.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<ny1.c.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ny1.d, ny1.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ny1.e.a> getState() {
        return this.state;
    }
}
