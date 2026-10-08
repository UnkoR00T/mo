package yx1;

import my.JWSTokenStructure;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import th0.AppActivationChallengeWithBeKeys;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001wB\u009b\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\b\b\u0001\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0004\u0018\u0001022\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\b3\u00104J\u001f\u00109\u001a\u000208*\u0002052\n\b\u0002\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\b9\u0010:J!\u0010?\u001a\u00020>*\u0002022\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020<2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR&\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR \u0010q\u001a\b\u0012\u0004\u0012\u00020l0k8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR \u0010,\u001a\b\u0012\u0004\u0012\u00020-0r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lyx1/z;", "Ll00/g;", "Lyx1/f;", "Lyx1/e;", "Lyx1/g;", "", "Lyy/a;", "stateMachineFactory", "Lac4/k;", "nfcDisableReadingUseCase", "Lq34/z0;", "getPeselFromPersonalIdCertificate", "Ld74/c;", "initWKAuthForEIDUC", "Ld74/a;", "getWKAuthTokenForEIDUC", "Lzx1/e;", "eIdActivationProcessMapper", "Luh0/g;", "generateAppActivationChallengeWithKeysUseCase", "Lzx1/a;", "eIdActivationBusinessErrorMapper", "Lzx1/d;", "eIdActivationErrorMapper", "Lac4/i;", "goToNfcSettingsUseCase", "Lac4/b;", "checkNFCStatusUseCase", "Lxw1/b;", "nfcDialogMapper", "Lpx/d;", "remoteLogger", "Lhb4/d;", "errorVMSFactory", "Ljx/g;", "systemInfo", "Lic4/b;", "nfcEdoEnableReadingUseCase", "Lac4/l;", "nfcMonitorReadingUseCase", "Lyx1/c;", "setupContract", "<init>", "(Lyy/a;Lac4/k;Lq34/z0;Ld74/c;Ld74/a;Lzx1/e;Luh0/g;Lzx1/a;Lzx1/d;Lac4/i;Lac4/b;Lxw1/b;Lpx/d;Lhb4/d;Ljx/g;Lic4/b;Lac4/l;Lyx1/c;)V", "state", "Lyx1/g$a;", "N9", "(Lyx1/f;)Lyx1/g$a;", "Lcy/c$a;", "error", "Lay1/a;", "L9", "(Lcy/c$a;Ltq/e;)Ljava/lang/Object;", "Lic4/a;", "", "triesLeft", "Lay1/a$b;", "ba", "(Lic4/a;Ljava/lang/Integer;)Lay1/a$b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "Ljb4/b;", "K9", "(Lay1/a;Ler/a;)Ljb4/b;", "", "message", "M9", "(Ljava/lang/String;)V", "b", "Lac4/k;", "c", "Lq34/z0;", "d", "Ld74/c;", "e", "Ld74/a;", "f", "Lzx1/e;", "g", "Luh0/g;", "h", "Lzx1/a;", "j", "Lzx1/d;", "k", "Lac4/i;", "l", "Lac4/b;", "m", "Lxw1/b;", "n", "Lpx/d;", "p", "Lhb4/d;", "q", "Lyx1/c;", "Lyx1/f$i;", "r", "Lyx1/f$i;", "initialState", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lyx1/e$f;", "t", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<yx1.f, yx1.e> implements yx1.g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.k nfcDisableReadingUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q34.z0 getPeselFromPersonalIdCertificate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d74.c initWKAuthForEIDUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d74.a getWKAuthTokenForEIDUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final zx1.e eIdActivationProcessMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final uh0.g generateAppActivationChallengeWithKeysUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final zx1.a eIdActivationBusinessErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final zx1.d eIdActivationErrorMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ac4.i goToNfcSettingsUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ac4.b checkNFCStatusUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw1.b nfcDialogMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final yx1.c setupContract;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final yx1.f.Initial initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<yx1.f, yx1.e> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yx1.e.f> navAction;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<yx1.g.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lyx1/z$a;", "Lf00/j0;", "Lyx1/c;", "Lyx1/z;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<yx1.c, z> {
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f230463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f230464b;

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
            f230463a = iArr;
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
            f230464b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f230465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230467f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f230469h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f230467f = obj;
            this.f230469h |= PKIFailureInfo.systemUnavail;
            return z.this.L9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<yx1.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f230470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f230471b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f230472a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f230473b;

            /* JADX INFO: renamed from: yx1.z$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6188a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f230474d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f230475e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f230476f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f230478h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f230479j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f230480k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f230481l;

                public C6188a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f230474d = obj;
                    this.f230475e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f230472a = hVar;
                this.f230473b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6188a c6188a;
                if (eVar instanceof C6188a) {
                    c6188a = (C6188a) eVar;
                    int i15 = c6188a.f230475e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6188a.f230475e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6188a = new C6188a(eVar);
                    }
                } else {
                    c6188a = new C6188a(eVar);
                }
                Object obj2 = c6188a.f230474d;
                Object objE = uq.b.e();
                int i16 = c6188a.f230475e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f230472a;
                    yx1.g.a aVarN9 = this.f230473b.N9((yx1.f) obj);
                    c6188a.f230476f = vq.j.a(obj);
                    c6188a.f230478h = vq.j.a(c6188a);
                    c6188a.f230479j = vq.j.a(obj);
                    c6188a.f230480k = vq.j.a(hVar);
                    c6188a.f230481l = 0;
                    c6188a.f230475e = 1;
                    if (hVar.F(aVarN9, c6188a) == objE) {
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

        public d(mu.g gVar, z zVar) {
            this.f230470a = gVar;
            this.f230471b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super yx1.g.a> hVar, tq.e eVar) {
            Object objA = this.f230470a.a(new a(hVar, this.f230471b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyx1/e$b;", "<unused var>", "Lyx1/f;", "Loq/i0;", "<anonymous>", "(Lyx1/e$b;Lyx1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<yx1.e.b, yx1.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230482e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f230482e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                yx1.z r5 = yx1.z.this
                ac4.k r5 = yx1.z.D9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f230482e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                yx1.z r5 = yx1.z.this
                xw.b r5 = r5.Y1()
                yx1.e$f$b r1 = yx1.e.f.b.f230317a
                r4.f230482e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yx1.z.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yx1.e.b bVar, yx1.f fVar, tq.e<? super oq.i0> eVar) {
            return z.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyx1/e$a;", "<unused var>", "Lyx1/f;", "Loq/i0;", "<anonymous>", "(Lyx1/e$a;Lyx1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<yx1.e.a, yx1.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230484e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f230484e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                yx1.z r5 = yx1.z.this
                ac4.k r5 = yx1.z.D9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f230484e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                yx1.z r5 = yx1.z.this
                xw.b r5 = r5.Y1()
                yx1.e$f$a r1 = yx1.e.f.a.f230316a
                r4.f230484e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yx1.z.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yx1.e.a aVar, yx1.f fVar, tq.e<? super oq.i0> eVar) {
            return z.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyx1/e$e;", "<unused var>", "Lyx1/f;", "Loq/i0;", "<anonymous>", "(Lyx1/e$e;Lyx1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<yx1.e.C6183e, yx1.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230486e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f230486e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                yx1.z r5 = yx1.z.this
                ac4.k r5 = yx1.z.D9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f230486e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                yx1.z r5 = yx1.z.this
                xw.b r5 = r5.Y1()
                yx1.e$f$f r1 = yx1.e.f.C6185f.f230323a
                r4.f230486e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yx1.z.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yx1.e.C6183e c6183e, yx1.f fVar, tq.e<? super oq.i0> eVar) {
            return z.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyx1/e$c;", "<unused var>", "Lyx1/f;", "Loq/i0;", "<anonymous>", "(Lyx1/e$c;Lyx1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<yx1.e.c, yx1.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230488e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f230488e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                yx1.z r5 = yx1.z.this
                ac4.k r5 = yx1.z.D9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f230488e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                yx1.z r5 = yx1.z.this
                xw.b r5 = r5.Y1()
                yx1.e$f$d r1 = yx1.e.f.d.f230321a
                r4.f230488e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yx1.z.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yx1.e.c cVar, yx1.f fVar, tq.e<? super oq.i0> eVar) {
            return z.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyx1/e$d;", "<unused var>", "Lyx1/f;", "Loq/i0;", "<anonymous>", "(Lyx1/e$d;Lyx1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<yx1.e.d, yx1.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230490e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f230490e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                yx1.z r5 = yx1.z.this
                ac4.k r5 = yx1.z.D9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f230490e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                yx1.z r5 = yx1.z.this
                xw.b r5 = r5.Y1()
                yx1.e$f$e r1 = yx1.e.f.C6184e.f230322a
                r4.f230490e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yx1.z.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yx1.e.d dVar, yx1.f fVar, tq.e<? super oq.i0> eVar) {
            return z.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyx1/f$a;", "state", "Loq/i0;", "<anonymous>", "(Lyx1/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<yx1.f.ChallengeGeneratedSuccessfully, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230493f;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx1.f.ChallengeGeneratedSuccessfully challengeGeneratedSuccessfully = (yx1.f.ChallengeGeneratedSuccessfully) this.f230493f;
            Object objE = uq.b.e();
            int i15 = this.f230492e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yx1.e.f> bVarY1 = z.this.Y1();
                yx1.e.f.GoToActivationProcess goToActivationProcess = new yx1.e.f.GoToActivationProcess(challengeGeneratedSuccessfully.getChallenge(), challengeGeneratedSuccessfully.getActiveDeviceName());
                this.f230493f = vq.j.a(challengeGeneratedSuccessfully);
                this.f230492e = 1;
                if (bVarY1.F(goToActivationProcess, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(yx1.f.ChallengeGeneratedSuccessfully challengeGeneratedSuccessfully, tq.e<? super oq.i0> eVar) {
            return ((j) v(challengeGeneratedSuccessfully, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = z.this.new j(eVar);
            jVar.f230493f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyx1/e$l;", "action", "Lk10/c0;", "Lyx1/f$e;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lyx1/e$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<yx1.e.l, k10.c0<yx1.f.Error>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230496f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.ReadPesel O(k10.c0 c0Var, yx1.f.Error error) {
            return new yx1.f.ReadPesel(((yx1.f.Error) c0Var.a()).getFormData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f230496f;
            uq.b.e();
            if (this.f230495e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yx1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.k.O(c0Var, (f.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yx1.e.l lVar, k10.c0<yx1.f.Error> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            k kVar = new k(eVar);
            kVar.f230496f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyx1/e$k;", "action", "Lk10/c0;", "Lyx1/f$e;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lyx1/e$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<yx1.e.k, k10.c0<yx1.f.Error>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230498f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.InitAuthentication O(k10.c0 c0Var, yx1.f.Error error) {
            return new yx1.f.InitAuthentication(((yx1.f.Error) c0Var.a()).getFormData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f230498f;
            uq.b.e();
            if (this.f230497e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yx1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.l.O(c0Var, (f.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yx1.e.k kVar, k10.c0<yx1.f.Error> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            l lVar = new l(eVar);
            lVar.f230498f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyx1/e$i;", "action", "Lk10/c0;", "Lyx1/f$e;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lyx1/e$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<yx1.e.RetryCreateJWSEToken, k10.c0<yx1.f.Error>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230501g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.CreateJWSEToken O(k10.c0 c0Var, yx1.e.RetryCreateJWSEToken retryCreateJWSEToken, yx1.f.Error error) {
            return new yx1.f.CreateJWSEToken(((yx1.f.Error) c0Var.a()).getFormData(), retryCreateJWSEToken.getSignature());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final yx1.e.RetryCreateJWSEToken retryCreateJWSEToken = (yx1.e.RetryCreateJWSEToken) this.f230500f;
            final k10.c0 c0Var = (k10.c0) this.f230501g;
            uq.b.e();
            if (this.f230499e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yx1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.m.O(c0Var, retryCreateJWSEToken, (f.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yx1.e.RetryCreateJWSEToken retryCreateJWSEToken, k10.c0<yx1.f.Error> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            m mVar = new m(eVar);
            mVar.f230500f = retryCreateJWSEToken;
            mVar.f230501g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyx1/e$j;", "action", "Lk10/c0;", "Lyx1/f$e;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lyx1/e$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<yx1.e.RetryGenerateActivationChallenge, k10.c0<yx1.f.Error>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230504g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.GenerateActivationChallenge O(k10.c0 c0Var, yx1.e.RetryGenerateActivationChallenge retryGenerateActivationChallenge, yx1.f.Error error) {
            return new yx1.f.GenerateActivationChallenge(((yx1.f.Error) c0Var.a()).getFormData(), retryGenerateActivationChallenge.getToken(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final yx1.e.RetryGenerateActivationChallenge retryGenerateActivationChallenge = (yx1.e.RetryGenerateActivationChallenge) this.f230503f;
            final k10.c0 c0Var = (k10.c0) this.f230504g;
            uq.b.e();
            if (this.f230502e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yx1.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.n.O(c0Var, retryGenerateActivationChallenge, (f.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yx1.e.RetryGenerateActivationChallenge retryGenerateActivationChallenge, k10.c0<yx1.f.Error> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            n nVar = new n(eVar);
            nVar.f230503f = retryGenerateActivationChallenge;
            nVar.f230504g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyx1/f$i;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.p<k10.c0<yx1.f.Initial>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230506f;

        o(tq.e<? super o> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.CheckNfc O(z zVar, yx1.f.Initial initial) {
            return new yx1.f.CheckNfc(yx1.f.FormData.b(initial.getFormData(), zVar.setupContract.G8().getPin(), zVar.setupContract.G8().getCan(), null, null, false, 28, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f230506f;
            uq.b.e();
            if (this.f230505e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final z zVar = z.this;
            return c0Var.d(new er.l() { // from class: yx1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.o.O(zVar, (f.Initial) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<yx1.f.Initial> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            return ((o) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            o oVar = z.this.new o(eVar);
            oVar.f230506f = obj;
            return oVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyx1/f$b;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<k10.c0<yx1.f.CheckNfc>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230509f;

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.ReadCert O(yx1.f.CheckNfc checkNfc) {
            return new yx1.f.ReadCert(checkNfc.getFormData(), null, 2, null);
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
                java.lang.Object r0 = r9.f230509f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r9.f230508e
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
                yx1.z r10 = yx1.z.this
                ac4.b r10 = yx1.z.u9(r10)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r9.f230509f = r0
                r9.f230508e = r4
                java.lang.Object r10 = r10.c(r2, r9)
                if (r10 != r1) goto L38
                goto L88
            L38:
                ac4.b$a r10 = (ac4.b.a) r10
                ac4.b$a$b r2 = ac4.b.a.C0108b.f5391a
                boolean r2 = fr.t.c(r10, r2)
                if (r2 == 0) goto L4c
                yx1.f0 r10 = new yx1.f0
                r10.<init>()
                k10.l r10 = r0.d(r10)
                return r10
            L4c:
                ac4.b$a$a r2 = ac4.b.a.C0107a.f5390a
                boolean r10 = fr.t.c(r10, r2)
                if (r10 == 0) goto L8e
                yx1.z r10 = yx1.z.this
                xw.b r10 = r10.Y1()
                yx1.e$f$g r2 = new yx1.e$f$g
                yx1.z r4 = yx1.z.this
                xw1.b r4 = yx1.z.C9(r4)
                xw1.b$a r5 = new xw1.b$a
                yx1.z r6 = yx1.z.this
                yx1.e$g r7 = yx1.e.g.f230325a
                er.a r6 = yx1.z.s9(r6, r7)
                yx1.z r7 = yx1.z.this
                yx1.e$a r8 = yx1.e.a.f230311a
                er.a r7 = yx1.z.s9(r7, r8)
                r5.<init>(r6, r7)
                cb4.d r4 = r4.b(r5)
                r2.<init>(r4)
                r9.f230509f = r0
                r9.f230508e = r3
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
            throw new UnsupportedOperationException("Method not decompiled: yx1.z.p.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<yx1.f.CheckNfc> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            return ((p) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            p pVar = z.this.new p(eVar);
            pVar.f230509f = obj;
            return pVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyx1/e$g;", "<unused var>", "Lk10/c0;", "Lyx1/f$b;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lyx1/e$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<yx1.e.g, k10.c0<yx1.f.CheckNfc>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230512f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.Error O(k10.c0 c0Var, z zVar, dx.b.Business business, yx1.f.CheckNfc checkNfc) {
            return new yx1.f.Error(((yx1.f.CheckNfc) c0Var.a()).getFormData(), zVar.errorVMSFactory.a(zVar.K9(new ay1.a.GenericError(business), zVar.b9(yx1.e.a.f230311a))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f230512f;
            Object objE = uq.b.e();
            int i15 = this.f230511e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.i iVar = z.this.goToNfcSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f230512f = c0Var;
                this.f230511e = 1;
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
            final z zVar = z.this;
            if (iVar2 instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVar2).b();
                return c0Var.d(new er.l() { // from class: yx1.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.q.O(c0Var, zVar, business, (f.CheckNfc) obj2);
                    }
                });
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            zVar.d9(yx1.e.a.f230311a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yx1.e.g gVar, k10.c0<yx1.f.CheckNfc> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            q qVar = z.this.new q(eVar);
            qVar.f230512f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyx1/f$j;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.p<k10.c0<yx1.f.ReadCert>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f230515f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230516g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f230518j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(ic4.b bVar, tq.e<? super r> eVar) {
            super(2, eVar);
            this.f230518j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.Error V(k10.c0 c0Var, z zVar, yx1.f.ReadCert readCert) {
            return new yx1.f.Error(((yx1.f.ReadCert) c0Var.a()).getFormData(), zVar.errorVMSFactory.a(zVar.K9(ay1.a.b.GENERIC_ERROR, new er.a() { // from class: yx1.i0
                @Override // er.a
                public final Object a() {
                    return z.r.X();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
        
            if (r11 == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f230516g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r10.f230515f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r1 = r10.f230514e
                cy.b$a$h r1 = (cy.b.a.ReadCertificate) r1
                oq.u.b(r11)
                goto L6b
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                oq.u.b(r11)
                goto L3c
            L26:
                oq.u.b(r11)
                yx1.z r11 = yx1.z.this
                ac4.k r11 = yx1.z.D9(r11)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r10.f230516g = r0
                r10.f230515f = r4
                java.lang.Object r11 = r11.c(r2, r10)
                if (r11 != r1) goto L3c
                goto L6a
            L3c:
                cy.b$a$h r4 = new cy.b$a$h
                java.lang.Object r11 = r0.a()
                yx1.f$j r11 = (yx1.f.ReadCert) r11
                yx1.f$f r11 = r11.getFormData()
                iy.b0 r11 = r11.getCan()
                java.lang.String r5 = iy.c0.e(r11)
                cy.b$a$c r6 = cy.b.a.c.AUTHENTICATION
                r8 = 4
                r9 = 0
                r7 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                ic4.b r11 = r10.f230518j
                r10.f230516g = r0
                java.lang.Object r2 = vq.j.a(r4)
                r10.f230514e = r2
                r10.f230515f = r3
                java.lang.Object r11 = r11.c(r4, r10)
                if (r11 != r1) goto L6b
            L6a:
                return r1
            L6b:
                dx.i r11 = (dx.i) r11
                yx1.z r1 = yx1.z.this
                boolean r2 = r11 instanceof dx.i.Left
                if (r2 == 0) goto L99
                dx.i$b r11 = (dx.i.Left) r11
                java.lang.Object r11 = r11.b()
                dx.b r11 = (dx.b) r11
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Read certificate initialization error: "
                r2.append(r3)
                r2.append(r11)
                java.lang.String r11 = r2.toString()
                yx1.z.H9(r1, r11)
                yx1.h0 r11 = new yx1.h0
                r11.<init>()
                k10.l r11 = r0.d(r11)
                return r11
            L99:
                boolean r1 = r11 instanceof dx.i.Right
                if (r1 == 0) goto Laa
                dx.i$c r11 = (dx.i.Right) r11
                java.lang.Object r11 = r11.b()
                oq.i0 r11 = (oq.i0) r11
                k10.l r11 = r0.c()
                return r11
            Laa:
                oq.p r11 = new oq.p
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: yx1.z.r.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<yx1.f.ReadCert> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            return ((r) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            r rVar = z.this.new r(this.f230518j, eVar);
            rVar.f230516g = obj;
            return rVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lyx1/f$j;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<cy.c, k10.c0<yx1.f.ReadCert>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230520f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230521g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.Error b0(k10.c0 c0Var, z zVar, ay1.a aVar, yx1.f.ReadCert readCert) {
            return new yx1.f.Error(((yx1.f.ReadCert) c0Var.a()).getFormData(), zVar.errorVMSFactory.a(zVar.K9(aVar, new er.a() { // from class: yx1.o0
                @Override // er.a
                public final Object a() {
                    return z.s.c0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 c0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.ReadCert d0(cy.c cVar, yx1.f.ReadCert readCert) {
            return yx1.f.ReadCert.c(readCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.ReadPesel e0(cy.c cVar, yx1.f.ReadCert readCert) {
            return new yx1.f.ReadPesel(yx1.f.FormData.b(readCert.getFormData(), null, null, iy.c0.g(((cy.c.Finished) cVar).getCertificate()), null, false, 27, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.ReadCert f0(cy.c cVar, yx1.f.ReadCert readCert) {
            return yx1.f.ReadCert.c(readCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.Error g0(k10.c0 c0Var, z zVar, ay1.a.b bVar, yx1.f.ReadCert readCert) {
            return new yx1.f.Error(((yx1.f.ReadCert) c0Var.a()).getFormData(), zVar.errorVMSFactory.a(zVar.K9(bVar, new er.a() { // from class: yx1.p0
                @Override // er.a
                public final Object a() {
                    return z.s.h0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 h0() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy.c cVar = (cy.c) this.f230520f;
            final k10.c0 c0Var = (k10.c0) this.f230521g;
            Object objE = uq.b.e();
            int i15 = this.f230519e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!(cVar instanceof cy.c.Error)) {
                    if (cVar instanceof cy.c.Finished) {
                        return c0Var.d(new er.l() { // from class: yx1.l0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return z.s.e0(cVar, (f.ReadCert) obj2);
                            }
                        });
                    }
                    if ((cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
                        return c0Var.b(new er.l() { // from class: yx1.m0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return z.s.f0(cVar, (f.ReadCert) obj2);
                            }
                        });
                    }
                    if (!(cVar instanceof cy.c.InvalidPinOrPukError)) {
                        throw new oq.p();
                    }
                    cy.c.InvalidPinOrPukError invalidPinOrPukError = (cy.c.InvalidPinOrPukError) cVar;
                    final ay1.a.b bVarBa = z.this.ba(ic4.a.INSTANCE.a(invalidPinOrPukError.getCode()), vq.b.e(invalidPinOrPukError.getTriesLeft()));
                    z.this.M9(bVarBa + " - code: " + invalidPinOrPukError.getCode() + ", content: " + invalidPinOrPukError.getContent());
                    final z zVar = z.this;
                    return c0Var.d(new er.l() { // from class: yx1.n0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.s.g0(c0Var, zVar, bVarBa, (f.ReadCert) obj2);
                        }
                    });
                }
                z.this.M9("Read certificate error: " + cVar);
                this.f230520f = cVar;
                this.f230521g = c0Var;
                this.f230519e = 1;
                obj = z.this.L9((cy.c.Error) cVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final ay1.a aVar = (ay1.a) obj;
            if (aVar != null) {
                final z zVar2 = z.this;
                k10.l lVarD = c0Var.d(new er.l() { // from class: yx1.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.s.b0(c0Var, zVar2, aVar, (f.ReadCert) obj2);
                    }
                });
                if (lVarD != null) {
                    return lVarD;
                }
            }
            return c0Var.b(new er.l() { // from class: yx1.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.s.d0(cVar, (f.ReadCert) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<yx1.f.ReadCert> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            s sVar = z.this.new s(eVar);
            sVar.f230520f = cVar;
            sVar.f230521g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyx1/f$k;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.p<k10.c0<yx1.f.ReadPesel>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f230524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230525g;

        t(tq.e<? super t> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.Error V(k10.c0 c0Var, z zVar, dx.b bVar, yx1.f.ReadPesel readPesel) {
            return new yx1.f.Error(((yx1.f.ReadPesel) c0Var.a()).getFormData(), zVar.errorVMSFactory.a(zVar.K9(new ay1.a.GenericError(bVar), zVar.b9(yx1.e.l.f230332a))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.InitAuthentication X(q34.z0.Result result, yx1.f.ReadPesel readPesel) {
            return new yx1.f.InitAuthentication(yx1.f.FormData.b(readPesel.getFormData(), null, null, null, result.getPesel(), false, 23, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f230525g;
            Object objE = uq.b.e();
            int i15 = this.f230524f;
            if (i15 == 0) {
                oq.u.b(obj);
                q34.z0.a.CertC509CertString certC509CertString = new q34.z0.a.CertC509CertString(((yx1.f.ReadPesel) c0Var.a()).getFormData().getAuthenticationCert());
                q34.z0 z0Var = z.this.getPeselFromPersonalIdCertificate;
                this.f230525g = c0Var;
                this.f230523e = vq.j.a(certC509CertString);
                this.f230524f = 1;
                obj = z0Var.c(certC509CertString, this);
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
            final z zVar = z.this;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final q34.z0.Result result = (q34.z0.Result) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: yx1.r0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.t.X(result, (f.ReadPesel) obj2);
                    }
                });
            }
            final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            zVar.M9("Read PESEL error: " + bVar);
            return c0Var.d(new er.l() { // from class: yx1.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.t.V(c0Var, zVar, bVar, (f.ReadPesel) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<yx1.f.ReadPesel> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            return ((t) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            t tVar = z.this.new t(eVar);
            tVar.f230525g = obj;
            return tVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyx1/f$h;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.p<k10.c0<yx1.f.InitAuthentication>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230528f;

        u(tq.e<? super u> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.CustomBusinessError X(k10.c0 c0Var, zx1.a.InterfaceC6436a interfaceC6436a, yx1.f.InitAuthentication initAuthentication) {
            return new yx1.f.CustomBusinessError(((yx1.f.InitAuthentication) c0Var.a()).getFormData(), (zx1.a.InterfaceC6436a.Custom) interfaceC6436a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.Error Y(k10.c0 c0Var, z zVar, zx1.a.InterfaceC6436a interfaceC6436a, yx1.f.InitAuthentication initAuthentication) {
            return new yx1.f.Error(((yx1.f.InitAuthentication) c0Var.a()).getFormData(), zVar.errorVMSFactory.a(zVar.K9(new ay1.a.GenericError(((zx1.a.InterfaceC6436a.Domain) interfaceC6436a).getError()), zVar.b9(yx1.e.k.f230331a))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.SignWithIdCard Z(iy.b0 b0Var, yx1.f.InitAuthentication initAuthentication) {
            return new yx1.f.SignWithIdCard(initAuthentication.getFormData(), null, b0Var, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f230528f;
            Object objE = uq.b.e();
            int i15 = this.f230527e;
            if (i15 == 0) {
                oq.u.b(obj);
                d74.c cVar = z.this.initWKAuthForEIDUC;
                d74.c.Params params = new d74.c.Params(c74.a.ACTIVATION_BY_PERSONAL_ID, ((yx1.f.InitAuthentication) c0Var.a()).getFormData().getAuthenticationCert());
                this.f230528f = c0Var;
                this.f230527e = 1;
                obj = cVar.c(params, this);
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
            final z zVar = z.this;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final iy.b0 value = ((JWSTokenStructure.a) ((dx.i.Right) iVar).b()).getValue();
                return c0Var.d(new er.l() { // from class: yx1.u0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.u.Z(value, (f.InitAuthentication) obj2);
                    }
                });
            }
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            zVar.M9("Init WK authentication error: " + bVar);
            final zx1.a.InterfaceC6436a interfaceC6436aB = zVar.eIdActivationBusinessErrorMapper.b(new zx1.a.Params(bVar));
            if (interfaceC6436aB instanceof zx1.a.InterfaceC6436a.Custom) {
                return c0Var.d(new er.l() { // from class: yx1.s0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.u.X(c0Var, interfaceC6436aB, (f.InitAuthentication) obj2);
                    }
                });
            }
            if (interfaceC6436aB instanceof zx1.a.InterfaceC6436a.Domain) {
                return c0Var.d(new er.l() { // from class: yx1.t0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.u.Y(c0Var, zVar, interfaceC6436aB, (f.InitAuthentication) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<yx1.f.InitAuthentication> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            return ((u) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            u uVar = z.this.new u(eVar);
            uVar.f230528f = obj;
            return uVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyx1/f$l;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.p<k10.c0<yx1.f.SignWithIdCard>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f230531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230532g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f230534j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(ic4.b bVar, tq.e<? super v> eVar) {
            super(2, eVar);
            this.f230534j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.Error V(k10.c0 c0Var, z zVar, yx1.f.SignWithIdCard signWithIdCard) {
            return new yx1.f.Error(((yx1.f.SignWithIdCard) c0Var.a()).getFormData(), zVar.errorVMSFactory.a(zVar.K9(ay1.a.b.GENERIC_ERROR, new er.a() { // from class: yx1.w0
                @Override // er.a
                public final Object a() {
                    return z.v.X();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
        
            if (r12 == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: yx1.z.v.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<yx1.f.SignWithIdCard> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            return ((v) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            v vVar = z.this.new v(this.f230534j, eVar);
            vVar.f230532g = obj;
            return vVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lyx1/f$l;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<cy.c, k10.c0<yx1.f.SignWithIdCard>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230537g;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.Error b0(k10.c0 c0Var, z zVar, ay1.a aVar, yx1.f.SignWithIdCard signWithIdCard) {
            return new yx1.f.Error(((yx1.f.SignWithIdCard) c0Var.a()).getFormData(), zVar.errorVMSFactory.a(zVar.K9(aVar, new er.a() { // from class: yx1.c1
                @Override // er.a
                public final Object a() {
                    return z.w.c0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 c0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.SignWithIdCard d0(cy.c cVar, yx1.f.SignWithIdCard signWithIdCard) {
            return yx1.f.SignWithIdCard.c(signWithIdCard, null, cVar, null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.CreateJWSEToken e0(cy.c cVar, yx1.f.SignWithIdCard signWithIdCard) {
            return new yx1.f.CreateJWSEToken(signWithIdCard.getFormData(), iy.c0.g(((cy.c.Finished) cVar).getSignedDataBase64()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.SignWithIdCard f0(cy.c cVar, yx1.f.SignWithIdCard signWithIdCard) {
            return yx1.f.SignWithIdCard.c(signWithIdCard, null, cVar, null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.Error g0(k10.c0 c0Var, z zVar, ay1.a.b bVar, yx1.f.SignWithIdCard signWithIdCard) {
            return new yx1.f.Error(((yx1.f.SignWithIdCard) c0Var.a()).getFormData(), zVar.errorVMSFactory.a(zVar.K9(bVar, new er.a() { // from class: yx1.d1
                @Override // er.a
                public final Object a() {
                    return z.w.h0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 h0() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy.c cVar = (cy.c) this.f230536f;
            final k10.c0 c0Var = (k10.c0) this.f230537g;
            Object objE = uq.b.e();
            int i15 = this.f230535e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!(cVar instanceof cy.c.Error)) {
                    if (cVar instanceof cy.c.Finished) {
                        return c0Var.d(new er.l() { // from class: yx1.z0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return z.w.e0(cVar, (f.SignWithIdCard) obj2);
                            }
                        });
                    }
                    if ((cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
                        return c0Var.b(new er.l() { // from class: yx1.a1
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return z.w.f0(cVar, (f.SignWithIdCard) obj2);
                            }
                        });
                    }
                    if (!(cVar instanceof cy.c.InvalidPinOrPukError)) {
                        throw new oq.p();
                    }
                    cy.c.InvalidPinOrPukError invalidPinOrPukError = (cy.c.InvalidPinOrPukError) cVar;
                    final ay1.a.b bVarBa = z.this.ba(ic4.a.INSTANCE.a(invalidPinOrPukError.getCode()), vq.b.e(invalidPinOrPukError.getTriesLeft()));
                    z.this.M9(bVarBa + " - code: " + invalidPinOrPukError.getCode() + ", content: " + invalidPinOrPukError.getContent());
                    final z zVar = z.this;
                    return c0Var.d(new er.l() { // from class: yx1.b1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.w.g0(c0Var, zVar, bVarBa, (f.SignWithIdCard) obj2);
                        }
                    });
                }
                z.this.M9("Data signing error: " + cVar);
                this.f230536f = cVar;
                this.f230537g = c0Var;
                this.f230535e = 1;
                obj = z.this.L9((cy.c.Error) cVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final ay1.a aVar = (ay1.a) obj;
            if (aVar != null) {
                final z zVar2 = z.this;
                k10.l lVarD = c0Var.d(new er.l() { // from class: yx1.x0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.w.b0(c0Var, zVar2, aVar, (f.SignWithIdCard) obj2);
                    }
                });
                if (lVarD != null) {
                    return lVarD;
                }
            }
            return c0Var.b(new er.l() { // from class: yx1.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.w.d0(cVar, (f.SignWithIdCard) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<yx1.f.SignWithIdCard> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            w wVar = z.this.new w(eVar);
            wVar.f230536f = cVar;
            wVar.f230537g = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyx1/f$c;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.p<k10.c0<yx1.f.CreateJWSEToken>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230540f;

        x(tq.e<? super x> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.Error V(k10.c0 c0Var, z zVar, dx.b bVar, yx1.f.CreateJWSEToken createJWSEToken) {
            return new yx1.f.Error(((yx1.f.CreateJWSEToken) c0Var.a()).getFormData(), zVar.errorVMSFactory.a(zVar.K9(new ay1.a.GenericError(bVar), zVar.b9(new yx1.e.RetryCreateJWSEToken(((yx1.f.CreateJWSEToken) c0Var.a()).getSignature())))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.GenerateActivationChallenge X(k10.c0 c0Var, iy.b0 b0Var, yx1.f.CreateJWSEToken createJWSEToken) {
            return new yx1.f.GenerateActivationChallenge(((yx1.f.CreateJWSEToken) c0Var.a()).getFormData(), b0Var, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f230540f;
            Object objE = uq.b.e();
            int i15 = this.f230539e;
            if (i15 == 0) {
                oq.u.b(obj);
                d74.a aVar = z.this.getWKAuthTokenForEIDUC;
                d74.a.Params params = new d74.a.Params(((yx1.f.CreateJWSEToken) c0Var.a()).getSignature());
                this.f230540f = c0Var;
                this.f230539e = 1;
                obj = aVar.c(params, this);
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
            final z zVar = z.this;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final iy.b0 value = ((ny.a) ((dx.i.Right) iVar).b()).getValue();
                return c0Var.d(new er.l() { // from class: yx1.f1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.x.X(c0Var, value, (f.CreateJWSEToken) obj2);
                    }
                });
            }
            final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            zVar.M9("Create JWSEToken error: " + bVar);
            return c0Var.d(new er.l() { // from class: yx1.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.x.V(c0Var, zVar, bVar, (f.CreateJWSEToken) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<yx1.f.CreateJWSEToken> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            return ((x) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            x xVar = z.this.new x(eVar);
            xVar.f230540f = obj;
            return xVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyx1/f$g;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.p<k10.c0<yx1.f.GenerateActivationChallenge>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230543f;

        y(tq.e<? super y> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.Error V(k10.c0 c0Var, z zVar, dx.b bVar, yx1.f.GenerateActivationChallenge generateActivationChallenge) {
            return new yx1.f.Error(((yx1.f.GenerateActivationChallenge) c0Var.a()).getFormData(), zVar.errorVMSFactory.a(zVar.K9(new ay1.a.GenericError(bVar), zVar.b9(new yx1.e.RetryGenerateActivationChallenge(((yx1.f.GenerateActivationChallenge) c0Var.a()).getToken(), null)))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.ChallengeGeneratedSuccessfully X(AppActivationChallengeWithBeKeys appActivationChallengeWithBeKeys, yx1.f.GenerateActivationChallenge generateActivationChallenge) {
            return new yx1.f.ChallengeGeneratedSuccessfully(generateActivationChallenge.getFormData(), appActivationChallengeWithBeKeys.getChallenge(), appActivationChallengeWithBeKeys.getActiveDeviceName());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f230543f;
            Object objE = uq.b.e();
            int i15 = this.f230542e;
            if (i15 == 0) {
                oq.u.b(obj);
                uh0.g gVar = z.this.generateAppActivationChallengeWithKeysUseCase;
                uh0.g.Params params = new uh0.g.Params(iy.c0.e(((yx1.f.GenerateActivationChallenge) c0Var.a()).getToken()));
                this.f230543f = c0Var;
                this.f230542e = 1;
                obj = gVar.c(params, this);
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
            final z zVar = z.this;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final AppActivationChallengeWithBeKeys appActivationChallengeWithBeKeys = (AppActivationChallengeWithBeKeys) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: yx1.h1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.y.X(appActivationChallengeWithBeKeys, (f.GenerateActivationChallenge) obj2);
                    }
                });
            }
            final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            zVar.M9("Signature verification error: " + bVar);
            return c0Var.d(new er.l() { // from class: yx1.g1
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.y.V(c0Var, zVar, bVar, (f.GenerateActivationChallenge) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<yx1.f.GenerateActivationChallenge> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            return ((y) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            y yVar = z.this.new y(eVar);
            yVar.f230543f = obj;
            return yVar;
        }
    }

    /* JADX INFO: renamed from: yx1.z$z, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyx1/e$h;", "<unused var>", "Lk10/c0;", "Lyx1/f$g;", "state", "Lk10/l;", "Lyx1/f;", "<anonymous>", "(Lyx1/e$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C6189z extends vq.k implements er.q<yx1.e.h, k10.c0<yx1.f.GenerateActivationChallenge>, tq.e<? super k10.l<? extends yx1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230546f;

        C6189z(tq.e<? super C6189z> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx1.f.ReadCert O(yx1.f.GenerateActivationChallenge generateActivationChallenge) {
            return new yx1.f.ReadCert(generateActivationChallenge.getFormData(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f230546f;
            uq.b.e();
            if (this.f230545e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yx1.i1
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.C6189z.O((f.GenerateActivationChallenge) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yx1.e.h hVar, k10.c0<yx1.f.GenerateActivationChallenge> c0Var, tq.e<? super k10.l<? extends yx1.f>> eVar) {
            C6189z c6189z = new C6189z(eVar);
            c6189z.f230546f = c0Var;
            return c6189z.J(oq.i0.f148189a);
        }
    }

    public z(yy.a aVar, ac4.k kVar, q34.z0 z0Var, d74.c cVar, d74.a aVar2, zx1.e eVar, uh0.g gVar, zx1.a aVar3, zx1.d dVar, ac4.i iVar, ac4.b bVar, xw1.b bVar2, px.d dVar2, hb4.d dVar3, jx.g gVar2, final ic4.b bVar3, final ac4.l lVar, yx1.c cVar2) {
        this.nfcDisableReadingUseCase = kVar;
        this.getPeselFromPersonalIdCertificate = z0Var;
        this.initWKAuthForEIDUC = cVar;
        this.getWKAuthTokenForEIDUC = aVar2;
        this.eIdActivationProcessMapper = eVar;
        this.generateAppActivationChallengeWithKeysUseCase = gVar;
        this.eIdActivationBusinessErrorMapper = aVar3;
        this.eIdActivationErrorMapper = dVar;
        this.goToNfcSettingsUseCase = iVar;
        this.checkNFCStatusUseCase = bVar;
        this.nfcDialogMapper = bVar2;
        this.remoteLogger = dVar2;
        this.errorVMSFactory = dVar3;
        this.setupContract = cVar2;
        yx1.f.Initial initial = new yx1.f.Initial(new yx1.f.FormData(null, null, null, null, gVar2.r(), 15, null));
        this.initialState = initial;
        this.stateMachine = aVar.a(initial, new er.l() { // from class: yx1.p
            @Override // er.l
            public final Object b(Object obj) {
                return z.P9(this.f230414a, lVar, bVar3, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), N9(initial));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b K9(ay1.a aVar, er.a<oq.i0> aVar2) {
        return this.eIdActivationErrorMapper.b(new zx1.d.Params(aVar, b9(yx1.e.c.f230313a), b9(yx1.e.d.f230314a), b9(yx1.e.b.f230312a), aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L9(cy.c.Error error, tq.e<? super ay1.a> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f230469h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f230469h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f230467f;
        Object objE = uq.b.e();
        int i16 = cVar.f230469h;
        if (i16 == 0) {
            oq.u.b(obj);
            ic4.a aVarA = ic4.a.INSTANCE.a(error.getCode());
            if (aVarA != ic4.a.INTERRUPTED) {
                return ca(this, aVarA, null, 1, null);
            }
            int i17 = b.f230463a[ic4.c.INSTANCE.a(error.getContent()).ordinal()];
            if (i17 == 1 || i17 == 2) {
                return null;
            }
            if (i17 != 3) {
                throw new oq.p();
            }
            ac4.k kVar = this.nfcDisableReadingUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            cVar.f230465d = vq.j.a(error);
            cVar.f230466e = vq.j.a(aVarA);
            cVar.f230469h = 1;
            if (kVar.c(c1792a, cVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return ay1.a.b.TECHNICAL_ERROR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M9(String message) {
        px.b.y5(this.remoteLogger, message, null, pq.v.e(new px.a.Feature("EIdActivation")), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yx1.g.a N9(yx1.f state) {
        return this.eIdActivationProcessMapper.b(new zx1.e.Params(state, b9(yx1.e.a.f230311a), b9(yx1.e.b.f230312a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(final z zVar, final ac4.l lVar, final ic4.b bVar, k10.v vVar) {
        vVar.c(fr.q0.c(yx1.f.class), new er.l() { // from class: yx1.n
            @Override // er.l
            public final Object b(Object obj) {
                return z.Q9(this.f230409a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yx1.f.Initial.class), new er.l() { // from class: yx1.r
            @Override // er.l
            public final Object b(Object obj) {
                return z.R9(this.f230420a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yx1.f.CheckNfc.class), new er.l() { // from class: yx1.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.T9(this.f230422a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yx1.f.ReadCert.class), new er.l() { // from class: yx1.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.U9(lVar, zVar, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yx1.f.ReadPesel.class), new er.l() { // from class: yx1.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.V9(this.f230431a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yx1.f.InitAuthentication.class), new er.l() { // from class: yx1.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.W9(this.f230433a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yx1.f.SignWithIdCard.class), new er.l() { // from class: yx1.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.X9(lVar, zVar, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yx1.f.CreateJWSEToken.class), new er.l() { // from class: yx1.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.Y9(this.f230439a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yx1.f.GenerateActivationChallenge.class), new er.l() { // from class: yx1.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.Z9(this.f230443a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yx1.f.ChallengeGeneratedSuccessfully.class), new er.l() { // from class: yx1.o
            @Override // er.l
            public final Object b(Object obj) {
                return z.aa(this.f230413a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yx1.f.Error.class), new er.l() { // from class: yx1.q
            @Override // er.l
            public final Object b(Object obj) {
                return z.S9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(z zVar, k10.z zVar2) {
        e eVar = zVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(fr.q0.c(yx1.e.b.class), oVar, eVar);
        zVar2.x(fr.q0.c(yx1.e.a.class), oVar, zVar.new f(null));
        zVar2.x(fr.q0.c(yx1.e.C6183e.class), oVar, zVar.new g(null));
        zVar2.x(fr.q0.c(yx1.e.c.class), oVar, zVar.new h(null));
        zVar2.x(fr.q0.c(yx1.e.d.class), oVar, zVar.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(k10.z zVar) {
        k kVar = new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(yx1.e.l.class), oVar, kVar);
        zVar.v(fr.q0.c(yx1.e.k.class), oVar, new l(null));
        zVar.v(fr.q0.c(yx1.e.RetryCreateJWSEToken.class), oVar, new m(null));
        zVar.v(fr.q0.c(yx1.e.RetryGenerateActivationChallenge.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new p(null));
        q qVar = zVar.new q(null);
        zVar2.v(fr.q0.c(yx1.e.g.class), k10.o.CANCEL_PREVIOUS, qVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(ac4.l lVar, z zVar, ic4.b bVar, k10.z zVar2) {
        zVar2.A(zVar.new r(bVar, null));
        k10.k.m(zVar2, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, zVar.new s(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new t(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(ac4.l lVar, z zVar, ic4.b bVar, k10.z zVar2) {
        zVar2.A(zVar.new v(bVar, null));
        k10.k.m(zVar2, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, zVar.new w(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new x(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new y(null));
        C6189z c6189z = new C6189z(null);
        zVar2.v(fr.q0.c(yx1.e.h.class), k10.o.CANCEL_PREVIOUS, c6189z);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(z zVar, k10.z zVar2) {
        zVar2.C(zVar.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ay1.a.b ba(ic4.a aVar, Integer num) {
        switch (b.f230464b[aVar.ordinal()]) {
            case 1:
                return ay1.a.b.WRONG_CAN;
            case 2:
                return ay1.a.b.PIN_BLOCKED;
            case 3:
                return ay1.a.b.CERTIFICATE_INACTIVE;
            case 4:
                return ay1.a.b.CERTIFICATE_MISSING;
            case 5:
                return ay1.a.b.DATA_MISSING;
            case 6:
                if (num != null && num.intValue() == 1) {
                    return ay1.a.b.WRONG_PIN_1_TRY_LEFT;
                }
                return (num != null && num.intValue() == 2) ? ay1.a.b.WRONG_PIN_2_TRIES_LEFT : ay1.a.b.GENERIC_ERROR;
            default:
                return ay1.a.b.GENERIC_ERROR;
        }
    }

    static /* synthetic */ ay1.a.b ca(z zVar, ic4.a aVar, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            num = null;
        }
        return zVar.ba(aVar, num);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: O9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<yx1.e.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<yx1.f, yx1.e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<yx1.g.a> getState() {
        return this.state;
    }
}
