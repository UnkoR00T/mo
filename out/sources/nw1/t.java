package nw1;

import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001qB\u008b\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0001\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b/\u00100J\u001f\u00105\u001a\u000204*\u0002012\n\b\u0002\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b5\u00106J)\u0010=\u001a\u00020<*\u00020.2\u0006\u00108\u001a\u0002072\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:09H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020:2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010e\u001a\b\u0012\u0004\u0012\u00020`0_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR&\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR \u0010(\u001a\b\u0012\u0004\u0012\u00020)0l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p¨\u0006r"}, d2 = {"Lnw1/t;", "Ll00/g;", "Lnw1/b;", "Lnw1/a;", "Lnw1/c;", "", "Lyy/a;", "stateMachineFactory", "Low1/z;", "mapper", "Lac4/k;", "nfcDisableReadingUseCase", "Lxw1/c;", "processInterruptDialogMapper", "Lmx/c;", "labelProvider", "Low1/y;", "changePinErrorMapper", "Lrw1/e;", "compareCertDataWithUserDataUseCase", "Lac4/b;", "checkNFCStatusUseCase", "Lac4/i;", "goToNfcSettingsUseCase", "Lxw1/b;", "nfcDialogMapper", "Lpx/d;", "remoteLogger", "Lhb4/d;", "errorVMSFactory", "Ljx/g;", "systemInfo", "Lic4/b;", "nfcEdoEnableReadingUseCase", "Lac4/l;", "nfcMonitorReadingUseCase", "Lnw1/d;", "setupContract", "<init>", "(Lyy/a;Low1/z;Lac4/k;Lxw1/c;Lmx/c;Low1/y;Lrw1/e;Lac4/b;Lac4/i;Lxw1/b;Lpx/d;Lhb4/d;Ljx/g;Lic4/b;Lac4/l;Lnw1/d;)V", "state", "Lnw1/c$a;", "G9", "(Lnw1/b;)Lnw1/c$a;", "Lcy/c$a;", "error", "Lpw1/b;", "E9", "(Lcy/c$a;Ltq/e;)Ljava/lang/Object;", "Lic4/a;", "", "triesLeft", "Lpw1/b$b;", "P9", "(Lic4/a;Ljava/lang/Integer;)Lpw1/b$b;", "Lyw1/a;", "certificateType", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "Ljb4/b;", "D9", "(Lpw1/b;Lyw1/a;Ler/a;)Ljb4/b;", "", "message", "F9", "(Ljava/lang/String;)V", "b", "Low1/z;", "c", "Lac4/k;", "d", "Lxw1/c;", "e", "Lmx/c;", "f", "Low1/y;", "g", "Lrw1/e;", "h", "Lac4/b;", "j", "Lac4/i;", "k", "Lxw1/b;", "l", "Lpx/d;", "m", "Lhb4/d;", "n", "Lnw1/d;", "Lnw1/b$b;", "p", "Lnw1/b$b;", "initialState", "Lxw/b;", "Lnw1/a$g;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "r", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<nw1.b, nw1.a> implements nw1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ow1.z mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.k nfcDisableReadingUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw1.c processInterruptDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ow1.y changePinErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final rw1.e compareCertDataWithUserDataUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.b checkNFCStatusUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.i goToNfcSettingsUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw1.b nfcDialogMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final nw1.d setupContract;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final nw1.b.Initial initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<nw1.a.g> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k10.t<nw1.b, nw1.a> stateMachine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<nw1.c.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lnw1/t$a;", "Lf00/j0;", "Lnw1/d;", "Lnw1/t;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<nw1.d, t> {
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f139322b;

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
            f139321a = iArr;
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
            f139322b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f139323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f139324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139325f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f139327h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f139325f = obj;
            this.f139327h |= PKIFailureInfo.systemUnavail;
            return t.this.E9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<nw1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f139328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f139329b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f139330a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f139331b;

            /* JADX INFO: renamed from: nw1.t$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3448a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f139332d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f139333e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f139334f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f139336h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f139337j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f139338k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f139339l;

                public C3448a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f139332d = obj;
                    this.f139333e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f139330a = hVar;
                this.f139331b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3448a c3448a;
                if (eVar instanceof C3448a) {
                    c3448a = (C3448a) eVar;
                    int i15 = c3448a.f139333e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3448a.f139333e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3448a = new C3448a(eVar);
                    }
                } else {
                    c3448a = new C3448a(eVar);
                }
                Object obj2 = c3448a.f139332d;
                Object objE = uq.b.e();
                int i16 = c3448a.f139333e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f139330a;
                    nw1.c.a aVarG9 = this.f139331b.G9((nw1.b) obj);
                    c3448a.f139334f = vq.j.a(obj);
                    c3448a.f139336h = vq.j.a(c3448a);
                    c3448a.f139337j = vq.j.a(obj);
                    c3448a.f139338k = vq.j.a(hVar);
                    c3448a.f139339l = 0;
                    c3448a.f139333e = 1;
                    if (hVar.F(aVarG9, c3448a) == objE) {
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

        public d(mu.g gVar, t tVar) {
            this.f139328a = gVar;
            this.f139329b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super nw1.c.a> hVar, tq.e eVar) {
            Object objA = this.f139328a.a(new a(hVar, this.f139329b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lnw1/b$b;", "state", "Lk10/l;", "Lnw1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<nw1.b.Initial>, tq.e<? super k10.l<? extends nw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139340e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139341f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.CheckNfc O(t tVar, nw1.b.Initial initial) {
            return new nw1.b.a.CheckNfc(new nw1.b.a.FormData(tVar.setupContract.z2().getNewPin(), tVar.setupContract.z2().getPin(), tVar.setupContract.z2().getCan(), tVar.setupContract.z2().getCertificateType(), initial.getAreAnimationsEnabled()), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f139341f;
            uq.b.e();
            if (this.f139340e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final t tVar = t.this;
            return c0Var.d(new er.l() { // from class: nw1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(tVar, (b.Initial) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<nw1.b.Initial> c0Var, tq.e<? super k10.l<? extends nw1.b>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f139341f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lnw1/b$a$b;", "state", "Lk10/l;", "Lnw1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<nw1.b.a.CheckNfc>, tq.e<? super k10.l<? extends nw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139344f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.ReadCert O(nw1.b.a.CheckNfc checkNfc) {
            return new nw1.b.a.ReadCert(checkNfc.getFormData(), null, 2, null);
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
                java.lang.Object r0 = r9.f139344f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r9.f139343e
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
                nw1.t r10 = nw1.t.this
                ac4.b r10 = nw1.t.p9(r10)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r9.f139344f = r0
                r9.f139343e = r4
                java.lang.Object r10 = r10.c(r2, r9)
                if (r10 != r1) goto L38
                goto L88
            L38:
                ac4.b$a r10 = (ac4.b.a) r10
                ac4.b$a$b r2 = ac4.b.a.C0108b.f5391a
                boolean r2 = fr.t.c(r10, r2)
                if (r2 == 0) goto L4c
                nw1.v r10 = new nw1.v
                r10.<init>()
                k10.l r10 = r0.d(r10)
                return r10
            L4c:
                ac4.b$a$a r2 = ac4.b.a.C0107a.f5390a
                boolean r10 = fr.t.c(r10, r2)
                if (r10 == 0) goto L8e
                nw1.t r10 = nw1.t.this
                xw.b r10 = r10.Y1()
                nw1.a$g$g r2 = new nw1.a$g$g
                nw1.t r4 = nw1.t.this
                xw1.b r4 = nw1.t.u9(r4)
                xw1.b$a r5 = new xw1.b$a
                nw1.t r6 = nw1.t.this
                nw1.a$i r7 = nw1.a.i.f139217a
                er.a r6 = nw1.t.n9(r6, r7)
                nw1.t r7 = nw1.t.this
                nw1.a$a r8 = nw1.a.C3440a.f139203a
                er.a r7 = nw1.t.n9(r7, r8)
                r5.<init>(r6, r7)
                cb4.d r4 = r4.b(r5)
                r2.<init>(r4)
                r9.f139344f = r0
                r9.f139343e = r3
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
            throw new UnsupportedOperationException("Method not decompiled: nw1.t.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<nw1.b.a.CheckNfc> c0Var, tq.e<? super k10.l<? extends nw1.b>> eVar) {
            return ((f) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f139344f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnw1/a$i;", "<unused var>", "Lk10/c0;", "Lnw1/b$a$b;", "state", "Lk10/l;", "Lnw1/b;", "<anonymous>", "(Lnw1/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<nw1.a.i, k10.c0<nw1.b.a.CheckNfc>, tq.e<? super k10.l<? extends nw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139347f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.Error O(k10.c0 c0Var, t tVar, dx.b.Business business, nw1.b.a.CheckNfc checkNfc) {
            return new nw1.b.a.Error(((nw1.b.a.CheckNfc) c0Var.a()).getFormData(), tVar.errorVMSFactory.a(tVar.D9(new pw1.b.GenericError(business), ((nw1.b.a.CheckNfc) c0Var.a()).getFormData().getCertificateType(), tVar.b9(nw1.a.C3440a.f139203a))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f139347f;
            Object objE = uq.b.e();
            int i15 = this.f139346e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.i iVar = t.this.goToNfcSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f139347f = c0Var;
                this.f139346e = 1;
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
            final t tVar = t.this;
            if (iVar2 instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVar2).b();
                return c0Var.d(new er.l() { // from class: nw1.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.g.O(c0Var, tVar, business, (b.a.CheckNfc) obj2);
                    }
                });
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            tVar.d9(nw1.a.C3440a.f139203a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nw1.a.i iVar, k10.c0<nw1.b.a.CheckNfc> c0Var, tq.e<? super k10.l<? extends nw1.b>> eVar) {
            g gVar = t.this.new g(eVar);
            gVar.f139347f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lnw1/b$a$f;", "state", "Lk10/l;", "Lnw1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<nw1.b.a.ReadCert>, tq.e<? super k10.l<? extends nw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f139349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f139350f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f139351g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f139353j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f139354a;

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
                f139354a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ic4.b bVar, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f139353j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.Error V(k10.c0 c0Var, t tVar, nw1.b.a.ReadCert readCert) {
            return new nw1.b.a.Error(((nw1.b.a.ReadCert) c0Var.a()).getFormData(), tVar.errorVMSFactory.a(tVar.D9(pw1.b.EnumC4031b.GENERIC_ERROR, ((nw1.b.a.ReadCert) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: nw1.y
                @Override // er.a
                public final Object a() {
                    return t.h.X();
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
            throw new UnsupportedOperationException("Method not decompiled: nw1.t.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<nw1.b.a.ReadCert> c0Var, tq.e<? super k10.l<? extends nw1.b>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = t.this.new h(this.f139353j, eVar);
            hVar.f139351g = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lnw1/b$a$f;", "state", "Lk10/l;", "Lnw1/b;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<cy.c, k10.c0<nw1.b.a.ReadCert>, tq.e<? super k10.l<? extends nw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f139357g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.Error b0(k10.c0 c0Var, t tVar, pw1.b bVar, nw1.b.a.ReadCert readCert) {
            return new nw1.b.a.Error(((nw1.b.a.ReadCert) c0Var.a()).getFormData(), tVar.errorVMSFactory.a(tVar.D9(bVar, ((nw1.b.a.ReadCert) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: nw1.f0
                @Override // er.a
                public final Object a() {
                    return t.i.c0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 c0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.ReadCert d0(cy.c cVar, nw1.b.a.ReadCert readCert) {
            return nw1.b.a.ReadCert.d(readCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.CompareCertData e0(cy.c cVar, nw1.b.a.ReadCert readCert) {
            return new nw1.b.a.CompareCertData(readCert.getFormData(), iy.c0.g(((cy.c.Finished) cVar).getCertificate()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.ReadCert f0(cy.c cVar, nw1.b.a.ReadCert readCert) {
            return nw1.b.a.ReadCert.d(readCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.Error g0(k10.c0 c0Var, t tVar, pw1.b.EnumC4031b enumC4031b, nw1.b.a.ReadCert readCert) {
            return new nw1.b.a.Error(((nw1.b.a.ReadCert) c0Var.a()).getFormData(), tVar.errorVMSFactory.a(tVar.D9(enumC4031b, ((nw1.b.a.ReadCert) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: nw1.e0
                @Override // er.a
                public final Object a() {
                    return t.i.h0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 h0() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy.c cVar = (cy.c) this.f139356f;
            final k10.c0 c0Var = (k10.c0) this.f139357g;
            Object objE = uq.b.e();
            int i15 = this.f139355e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!(cVar instanceof cy.c.Error)) {
                    if (cVar instanceof cy.c.Finished) {
                        return c0Var.d(new er.l() { // from class: nw1.b0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return t.i.e0(cVar, (b.a.ReadCert) obj2);
                            }
                        });
                    }
                    if ((cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
                        return c0Var.b(new er.l() { // from class: nw1.c0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return t.i.f0(cVar, (b.a.ReadCert) obj2);
                            }
                        });
                    }
                    if (!(cVar instanceof cy.c.InvalidPinOrPukError)) {
                        throw new oq.p();
                    }
                    cy.c.InvalidPinOrPukError invalidPinOrPukError = (cy.c.InvalidPinOrPukError) cVar;
                    final pw1.b.EnumC4031b enumC4031bP9 = t.this.P9(ic4.a.INSTANCE.a(invalidPinOrPukError.getCode()), vq.b.e(invalidPinOrPukError.getTriesLeft()));
                    t.this.F9(enumC4031bP9 + " - code: " + invalidPinOrPukError.getCode() + ", content: " + invalidPinOrPukError.getContent());
                    final t tVar = t.this;
                    return c0Var.d(new er.l() { // from class: nw1.d0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.i.g0(c0Var, tVar, enumC4031bP9, (b.a.ReadCert) obj2);
                        }
                    });
                }
                this.f139356f = cVar;
                this.f139357g = c0Var;
                this.f139355e = 1;
                obj = t.this.E9((cy.c.Error) cVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final pw1.b bVar = (pw1.b) obj;
            if (bVar != null) {
                final t tVar2 = t.this;
                k10.l lVarD = c0Var.d(new er.l() { // from class: nw1.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.i.b0(c0Var, tVar2, bVar, (b.a.ReadCert) obj2);
                    }
                });
                if (lVarD != null) {
                    return lVarD;
                }
            }
            return c0Var.b(new er.l() { // from class: nw1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.i.d0(cVar, (b.a.ReadCert) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<nw1.b.a.ReadCert> c0Var, tq.e<? super k10.l<? extends nw1.b>> eVar) {
            i iVar = t.this.new i(eVar);
            iVar.f139356f = cVar;
            iVar.f139357g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lnw1/b$a$c;", "state", "Lk10/l;", "Lnw1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<nw1.b.a.CompareCertData>, tq.e<? super k10.l<? extends nw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f139359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f139360f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f139361g;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.Error Z(k10.c0 c0Var, t tVar, nw1.b.a.CompareCertData compareCertData) {
            return new nw1.b.a.Error(((nw1.b.a.CompareCertData) c0Var.a()).getFormData(), tVar.errorVMSFactory.a(tVar.D9(pw1.b.EnumC4031b.GENERIC_ERROR, ((nw1.b.a.CompareCertData) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: nw1.j0
                @Override // er.a
                public final Object a() {
                    return t.j.a0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 a0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.ChangePin b0(k10.c0 c0Var, nw1.b.a.CompareCertData compareCertData) {
            return new nw1.b.a.ChangePin(nw1.b.a.FormData.b(((nw1.b.a.CompareCertData) c0Var.a()).getFormData(), null, null, null, null, false, 31, null), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.Error c0(k10.c0 c0Var, t tVar, nw1.b.a.CompareCertData compareCertData) {
            return new nw1.b.a.Error(((nw1.b.a.CompareCertData) c0Var.a()).getFormData(), tVar.errorVMSFactory.a(tVar.D9(pw1.b.EnumC4031b.DATA_INCONSISTENCY, ((nw1.b.a.CompareCertData) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: nw1.k0
                @Override // er.a
                public final Object a() {
                    return t.j.d0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 d0() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f139361g;
            Object objE = uq.b.e();
            int i15 = this.f139360f;
            if (i15 == 0) {
                oq.u.b(obj);
                rw1.e.Params params = new rw1.e.Params(((nw1.b.a.CompareCertData) c0Var.a()).getCertificate());
                rw1.e eVar = t.this.compareCertDataWithUserDataUseCase;
                this.f139361g = c0Var;
                this.f139359e = vq.j.a(params);
                this.f139360f = 1;
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
            final t tVar = t.this;
            if (iVar instanceof dx.i.Left) {
                tVar.F9("DocumentSigning: error during data comparison");
                return c0Var.d(new er.l() { // from class: nw1.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.j.Z(c0Var, tVar, (b.a.CompareCertData) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            rw1.e.b bVar = (rw1.e.b) ((dx.i.Right) iVar).b();
            if (fr.t.c(bVar, rw1.e.b.a.f176572a)) {
                return c0Var.d(new er.l() { // from class: nw1.h0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.j.b0(c0Var, (b.a.CompareCertData) obj2);
                    }
                });
            }
            if (!fr.t.c(bVar, rw1.e.b.C4507b.f176573a)) {
                throw new oq.p();
            }
            tVar.F9("DocumentSigning: error during data comparison, data inconsistency");
            return c0Var.d(new er.l() { // from class: nw1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.j.c0(c0Var, tVar, (b.a.CompareCertData) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<nw1.b.a.CompareCertData> c0Var, tq.e<? super k10.l<? extends nw1.b>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = t.this.new j(eVar);
            jVar.f139361g = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lnw1/b$a$a;", "state", "Lk10/l;", "Lnw1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<nw1.b.a.ChangePin>, tq.e<? super k10.l<? extends nw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f139363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f139364f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f139365g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f139367j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f139368a;

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
                f139368a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ic4.b bVar, tq.e<? super k> eVar) {
            super(2, eVar);
            this.f139367j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.Error V(k10.c0 c0Var, t tVar, nw1.b.a.ChangePin changePin) {
            return new nw1.b.a.Error(((nw1.b.a.ChangePin) c0Var.a()).getFormData(), tVar.errorVMSFactory.a(tVar.D9(pw1.b.EnumC4031b.GENERIC_ERROR, ((nw1.b.a.ChangePin) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: nw1.m0
                @Override // er.a
                public final Object a() {
                    return t.k.X();
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
            throw new UnsupportedOperationException("Method not decompiled: nw1.t.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<nw1.b.a.ChangePin> c0Var, tq.e<? super k10.l<? extends nw1.b>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = t.this.new k(this.f139367j, eVar);
            kVar.f139365g = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lnw1/b$a$a;", "state", "Lk10/l;", "Lnw1/b;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<cy.c, k10.c0<nw1.b.a.ChangePin>, tq.e<? super k10.l<? extends nw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f139371g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.Error b0(k10.c0 c0Var, t tVar, pw1.b bVar, nw1.b.a.ChangePin changePin) {
            return new nw1.b.a.Error(((nw1.b.a.ChangePin) c0Var.a()).getFormData(), tVar.errorVMSFactory.a(tVar.D9(bVar, ((nw1.b.a.ChangePin) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: nw1.t0
                @Override // er.a
                public final Object a() {
                    return t.l.c0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 c0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.ChangePin d0(cy.c cVar, nw1.b.a.ChangePin changePin) {
            return nw1.b.a.ChangePin.d(changePin, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.Successful e0(nw1.b.a.ChangePin changePin) {
            return new nw1.b.a.Successful(nw1.b.a.FormData.b(changePin.getFormData(), null, null, null, null, false, 31, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.ChangePin f0(cy.c cVar, nw1.b.a.ChangePin changePin) {
            return nw1.b.a.ChangePin.d(changePin, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nw1.b.a.Error g0(k10.c0 c0Var, t tVar, pw1.b.EnumC4031b enumC4031b, nw1.b.a.ChangePin changePin) {
            return new nw1.b.a.Error(((nw1.b.a.ChangePin) c0Var.a()).getFormData(), tVar.errorVMSFactory.a(tVar.D9(enumC4031b, ((nw1.b.a.ChangePin) c0Var.a()).getFormData().getCertificateType(), new er.a() { // from class: nw1.s0
                @Override // er.a
                public final Object a() {
                    return t.l.h0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 h0() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy.c cVar = (cy.c) this.f139370f;
            final k10.c0 c0Var = (k10.c0) this.f139371g;
            Object objE = uq.b.e();
            int i15 = this.f139369e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!(cVar instanceof cy.c.Error)) {
                    if (cVar instanceof cy.c.Finished) {
                        return c0Var.d(new er.l() { // from class: nw1.p0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return t.l.e0((b.a.ChangePin) obj2);
                            }
                        });
                    }
                    if ((cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
                        return c0Var.b(new er.l() { // from class: nw1.q0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return t.l.f0(cVar, (b.a.ChangePin) obj2);
                            }
                        });
                    }
                    if (!(cVar instanceof cy.c.InvalidPinOrPukError)) {
                        throw new oq.p();
                    }
                    cy.c.InvalidPinOrPukError invalidPinOrPukError = (cy.c.InvalidPinOrPukError) cVar;
                    final pw1.b.EnumC4031b enumC4031bP9 = t.this.P9(ic4.a.INSTANCE.a(invalidPinOrPukError.getCode()), vq.b.e(invalidPinOrPukError.getTriesLeft()));
                    t.this.F9(enumC4031bP9 + " - code: " + invalidPinOrPukError.getCode() + ", content: " + invalidPinOrPukError.getContent());
                    final t tVar = t.this;
                    return c0Var.d(new er.l() { // from class: nw1.r0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.l.g0(c0Var, tVar, enumC4031bP9, (b.a.ChangePin) obj2);
                        }
                    });
                }
                this.f139370f = cVar;
                this.f139371g = c0Var;
                this.f139369e = 1;
                obj = t.this.E9((cy.c.Error) cVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final pw1.b bVar = (pw1.b) obj;
            if (bVar != null) {
                final t tVar2 = t.this;
                k10.l lVarD = c0Var.d(new er.l() { // from class: nw1.n0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.l.b0(c0Var, tVar2, bVar, (b.a.ChangePin) obj2);
                    }
                });
                if (lVarD != null) {
                    return lVarD;
                }
            }
            return c0Var.b(new er.l() { // from class: nw1.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.l.d0(cVar, (b.a.ChangePin) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<nw1.b.a.ChangePin> c0Var, tq.e<? super k10.l<? extends nw1.b>> eVar) {
            l lVar = t.this.new l(eVar);
            lVar.f139370f = cVar;
            lVar.f139371g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnw1/a$h;", "<unused var>", "Lnw1/b;", "Loq/i0;", "<anonymous>", "(Lnw1/a$h;Lnw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<nw1.a.h, nw1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139373e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139373e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.k kVar = t.this.nfcDisableReadingUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f139373e = 1;
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
        public final Object w(nw1.a.h hVar, nw1.b bVar, tq.e<? super oq.i0> eVar) {
            return t.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnw1/a$a;", "<unused var>", "Lnw1/b;", "Loq/i0;", "<anonymous>", "(Lnw1/a$a;Lnw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<nw1.a.C3440a, nw1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139375e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139375e;
            if (i15 == 0) {
                oq.u.b(obj);
                t.this.d9(nw1.a.h.f139216a);
                xw.b<nw1.a.g> bVarY1 = t.this.Y1();
                nw1.a.g.C3441a c3441a = nw1.a.g.C3441a.f139209a;
                this.f139375e = 1;
                if (bVarY1.F(c3441a, this) == objE) {
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
        public final Object w(nw1.a.C3440a c3440a, nw1.b bVar, tq.e<? super oq.i0> eVar) {
            return t.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnw1/a$b;", "<unused var>", "Lnw1/b;", "Loq/i0;", "<anonymous>", "(Lnw1/a$b;Lnw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<nw1.a.b, nw1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139377e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139377e;
            if (i15 == 0) {
                oq.u.b(obj);
                t.this.d9(nw1.a.h.f139216a);
                xw.b<nw1.a.g> bVarY1 = t.this.Y1();
                nw1.a.g.b bVar = nw1.a.g.b.f139210a;
                this.f139377e = 1;
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
        public final Object w(nw1.a.b bVar, nw1.b bVar2, tq.e<? super oq.i0> eVar) {
            return t.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnw1/a$c;", "<unused var>", "Lnw1/b;", "Loq/i0;", "<anonymous>", "(Lnw1/a$c;Lnw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<nw1.a.c, nw1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139379e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139379e;
            if (i15 == 0) {
                oq.u.b(obj);
                t.this.d9(nw1.a.h.f139216a);
                xw.b<nw1.a.g> bVarY1 = t.this.Y1();
                nw1.a.g.c cVar = nw1.a.g.c.f139211a;
                this.f139379e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(nw1.a.c cVar, nw1.b bVar, tq.e<? super oq.i0> eVar) {
            return t.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnw1/a$e;", "<unused var>", "Lnw1/b;", "Loq/i0;", "<anonymous>", "(Lnw1/a$e;Lnw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<nw1.a.e, nw1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139381e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139381e;
            if (i15 == 0) {
                oq.u.b(obj);
                t.this.d9(nw1.a.h.f139216a);
                xw.b<nw1.a.g> bVarY1 = t.this.Y1();
                nw1.a.g.e eVar = nw1.a.g.e.f139213a;
                this.f139381e = 1;
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
        public final Object w(nw1.a.e eVar, nw1.b bVar, tq.e<? super oq.i0> eVar2) {
            return t.this.new q(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnw1/a$d;", "<unused var>", "Lnw1/b;", "Loq/i0;", "<anonymous>", "(Lnw1/a$d;Lnw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<nw1.a.d, nw1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139383e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139383e;
            if (i15 == 0) {
                oq.u.b(obj);
                t.this.d9(nw1.a.h.f139216a);
                xw.b<nw1.a.g> bVarY1 = t.this.Y1();
                nw1.a.g.d dVar = nw1.a.g.d.f139212a;
                this.f139383e = 1;
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
        public final Object w(nw1.a.d dVar, nw1.b bVar, tq.e<? super oq.i0> eVar) {
            return t.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnw1/a$f;", "<unused var>", "Lnw1/b;", "Loq/i0;", "<anonymous>", "(Lnw1/a$f;Lnw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<nw1.a.f, nw1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139385e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139385e;
            if (i15 == 0) {
                oq.u.b(obj);
                t.this.d9(nw1.a.h.f139216a);
                xw.b<nw1.a.g> bVarY1 = t.this.Y1();
                nw1.a.g.f fVar = nw1.a.g.f.f139214a;
                this.f139385e = 1;
                if (bVarY1.F(fVar, this) == objE) {
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
        public final Object w(nw1.a.f fVar, nw1.b bVar, tq.e<? super oq.i0> eVar) {
            return t.this.new s(eVar).J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: nw1.t$t, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnw1/a$j;", "<unused var>", "Lnw1/b;", "Loq/i0;", "<anonymous>", "(Lnw1/a$j;Lnw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C3449t extends vq.k implements er.q<nw1.a.j, nw1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139387e;

        C3449t(tq.e<? super C3449t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(t tVar) {
            tVar.d9(nw1.a.h.f139216a);
            tVar.d9(nw1.a.b.f139204a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139387e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nw1.a.g> bVarY1 = t.this.Y1();
                xw1.c cVar = t.this.processInterruptDialogMapper;
                Label labelC = t.this.labelProvider.c(lw1.j0.f120719e3);
                er.a aVar = new er.a() { // from class: nw1.u0
                    @Override // er.a
                    public final Object a() {
                        return t.C3449t.V();
                    }
                };
                final t tVar = t.this;
                nw1.a.g.ShowDialog showDialog = new nw1.a.g.ShowDialog(cVar.b(new xw1.c.Params(labelC, aVar, new er.a() { // from class: nw1.v0
                    @Override // er.a
                    public final Object a() {
                        return t.C3449t.X(tVar);
                    }
                })));
                this.f139387e = 1;
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
        public final Object w(nw1.a.j jVar, nw1.b bVar, tq.e<? super oq.i0> eVar) {
            return t.this.new C3449t(eVar).J(oq.i0.f148189a);
        }
    }

    public t(yy.a aVar, ow1.z zVar, ac4.k kVar, xw1.c cVar, mx.c cVar2, ow1.y yVar, rw1.e eVar, ac4.b bVar, ac4.i iVar, xw1.b bVar2, px.d dVar, hb4.d dVar2, jx.g gVar, final ic4.b bVar3, final ac4.l lVar, nw1.d dVar3) {
        this.mapper = zVar;
        this.nfcDisableReadingUseCase = kVar;
        this.processInterruptDialogMapper = cVar;
        this.labelProvider = cVar2;
        this.changePinErrorMapper = yVar;
        this.compareCertDataWithUserDataUseCase = eVar;
        this.checkNFCStatusUseCase = bVar;
        this.goToNfcSettingsUseCase = iVar;
        this.nfcDialogMapper = bVar2;
        this.remoteLogger = dVar;
        this.errorVMSFactory = dVar2;
        this.setupContract = dVar3;
        nw1.b.Initial initial = new nw1.b.Initial(gVar.r());
        this.initialState = initial;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initial, new er.l() { // from class: nw1.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.I9(this.f139302a, lVar, bVar3, (k10.v) obj);
            }
        });
        this.state = a9(new d(e9().getState(), this), G9(initial));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b D9(pw1.b bVar, yw1.a aVar, er.a<oq.i0> aVar2) {
        return this.changePinErrorMapper.b(new ow1.y.Params(bVar, aVar, this.setupContract.z2().getResetPinAvailable(), b9(nw1.a.d.f139206a), b9(nw1.a.e.f139207a), b9(nw1.a.f.f139208a), b9(nw1.a.b.f139204a), b9(nw1.a.c.f139205a), aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E9(cy.c.Error error, tq.e<? super pw1.b> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f139327h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f139327h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f139325f;
        Object objE = uq.b.e();
        int i16 = cVar.f139327h;
        if (i16 == 0) {
            oq.u.b(obj);
            ic4.a aVarA = ic4.a.INSTANCE.a(error.getCode());
            if (aVarA != ic4.a.INTERRUPTED) {
                pw1.b.EnumC4031b enumC4031bQ9 = Q9(this, aVarA, null, 1, null);
                F9(enumC4031bQ9 + " - code: " + error.getCode() + ", content: " + error.getContent());
                return enumC4031bQ9;
            }
            int i17 = b.f139321a[ic4.c.INSTANCE.a(error.getContent()).ordinal()];
            if (i17 == 1 || i17 == 2) {
                return null;
            }
            if (i17 != 3) {
                throw new oq.p();
            }
            ac4.k kVar = this.nfcDisableReadingUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            cVar.f139323d = error;
            cVar.f139324e = vq.j.a(aVarA);
            cVar.f139327h = 1;
            if (kVar.c(c1792a, cVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            error = (cy.c.Error) cVar.f139323d;
            oq.u.b(obj);
        }
        F9("INTERRUPTED_TECHNICAL_ERROR - code: " + error.getCode() + ", content: " + error.getContent());
        return pw1.b.EnumC4031b.TECHNICAL_ERROR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F9(String message) {
        px.b.y5(this.remoteLogger, message, null, pq.v.e(new px.a.Feature("ChangePin")), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nw1.c.a G9(nw1.b state) {
        return this.mapper.b(new ow1.z.Params(state, b9(nw1.a.C3440a.f139203a), b9(nw1.a.j.f139218a), b9(nw1.a.c.f139205a), b9(nw1.a.b.f139204a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(final t tVar, final ac4.l lVar, final ic4.b bVar, k10.v vVar) {
        vVar.c(fr.q0.c(nw1.b.Initial.class), new er.l() { // from class: nw1.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.J9(this.f139284a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(nw1.b.a.CheckNfc.class), new er.l() { // from class: nw1.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.K9(this.f139285a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(nw1.b.a.ReadCert.class), new er.l() { // from class: nw1.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.L9(lVar, tVar, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(nw1.b.a.CompareCertData.class), new er.l() { // from class: nw1.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.M9(this.f139293a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(nw1.b.a.ChangePin.class), new er.l() { // from class: nw1.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.N9(lVar, tVar, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(nw1.b.class), new er.l() { // from class: nw1.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.O9(this.f139298a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(t tVar, k10.z zVar) {
        zVar.A(tVar.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(t tVar, k10.z zVar) {
        zVar.A(tVar.new f(null));
        g gVar = tVar.new g(null);
        zVar.v(fr.q0.c(nw1.a.i.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(ac4.l lVar, t tVar, ic4.b bVar, k10.z zVar) {
        zVar.A(tVar.new h(bVar, null));
        k10.k.m(zVar, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, tVar.new i(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(t tVar, k10.z zVar) {
        zVar.A(tVar.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(ac4.l lVar, t tVar, ic4.b bVar, k10.z zVar) {
        zVar.A(tVar.new k(bVar, null));
        k10.k.m(zVar, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, tVar.new l(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(t tVar, k10.z zVar) {
        m mVar = tVar.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(nw1.a.h.class), oVar, mVar);
        zVar.x(fr.q0.c(nw1.a.C3440a.class), oVar, tVar.new n(null));
        zVar.x(fr.q0.c(nw1.a.b.class), oVar, tVar.new o(null));
        zVar.x(fr.q0.c(nw1.a.c.class), oVar, tVar.new p(null));
        zVar.x(fr.q0.c(nw1.a.e.class), oVar, tVar.new q(null));
        zVar.x(fr.q0.c(nw1.a.d.class), oVar, tVar.new r(null));
        zVar.x(fr.q0.c(nw1.a.f.class), oVar, tVar.new s(null));
        zVar.x(fr.q0.c(nw1.a.j.class), oVar, tVar.new C3449t(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pw1.b.EnumC4031b P9(ic4.a aVar, Integer num) {
        switch (b.f139322b[aVar.ordinal()]) {
            case 1:
                return pw1.b.EnumC4031b.WRONG_CAN;
            case 2:
                return pw1.b.EnumC4031b.PIN_BLOCKED;
            case 3:
                return pw1.b.EnumC4031b.CERTIFICATE_INACTIVE;
            case 4:
                return pw1.b.EnumC4031b.CERTIFICATE_MISSING;
            case 5:
                return pw1.b.EnumC4031b.DATA_MISSING;
            case 6:
                if (num != null && num.intValue() == 1) {
                    return pw1.b.EnumC4031b.WRONG_PIN_1_TRY_LEFT;
                }
                return (num != null && num.intValue() == 2) ? pw1.b.EnumC4031b.WRONG_PIN_2_TRIES_LEFT : pw1.b.EnumC4031b.GENERIC_ERROR;
            default:
                return pw1.b.EnumC4031b.GENERIC_ERROR;
        }
    }

    static /* synthetic */ pw1.b.EnumC4031b Q9(t tVar, ic4.a aVar, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            num = null;
        }
        return tVar.P9(aVar, num);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(nw1.c.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<nw1.a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<nw1.b, nw1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<nw1.c.a> getState() {
        return this.state;
    }
}
