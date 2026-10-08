package kz2;

import c74.WKAuthSigningParams;
import jk0.ExternalQualifiedSignatureAuthenticateRequest;
import jk0.ExternalQualifiedSignatureAuthenticateResponse;
import jk0.ExternalQualifiedSignatureStartResponse;
import my.JWSTokenStructure;
import ny.JWSETokenPair;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001|B\u009b\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\b\b\u0001\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J1\u00106\u001a\u000205*\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020201H\u0002¢\u0006\u0004\b6\u00107J\u0019\u0010:\u001a\u0004\u0018\u0001002\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0013\u0010>\u001a\u00020=*\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0018\u0010B\u001a\u0002022\u0006\u0010A\u001a\u00020@H\u0096\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u000202H\u0096\u0001¢\u0006\u0004\bD\u0010ER\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR \u0010l\u001a\b\u0012\u0004\u0012\u00020g0f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR&\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030m8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR \u0010,\u001a\b\u0012\u0004\u0012\u00020-0s8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020y0x8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010z¨\u0006}"}, d2 = {"Lkz2/b0;", "Ll00/g;", "Lkz2/n;", "Lkz2/m;", "Lkz2/o;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lac4/k;", "nfcDisableReadingUseCase", "Lac4/b;", "checkNFCStatusUseCase", "Loz2/b;", "nfcDialogMapper", "Lac4/i;", "goToNfcSettingsUseCase", "Lyy2/c;", "createJWSTokenStructureForEIDUC", "Lyy2/b;", "createJWSETokenForEIDUC", "Ld74/b;", "getWKTokenForMIDUC", "Lkk0/a;", "authenticateUC", "Lhb4/d;", "errorVMSFactory", "Llz2/c;", "mapper", "Llz2/b;", "errorMapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Ljx/g;", "systemInfo", "Lic4/b;", "nfcEdoEnableReadingUseCase", "Lac4/l;", "nfcMonitorReadingUseCase", "Lkz2/c;", "setupContract", "<init>", "(Lyy/a;Lac4/k;Lac4/b;Loz2/b;Lac4/i;Lyy2/c;Lyy2/b;Ld74/b;Lkk0/a;Lhb4/d;Llz2/c;Llz2/b;La14/w;Li70/n;Ljx/g;Lic4/b;Lac4/l;Lkz2/c;)V", "state", "Lkz2/o$a;", "K9", "(Lkz2/n;)Lkz2/o$a;", "Lmz2/a;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "I9", "(Lmz2/a;Ler/a;Ler/a;)Ljb4/b;", "Lcy/c$a;", "error", "H9", "(Lcy/c$a;)Lmz2/a;", "Lic4/a;", "Lmz2/a$a;", "Y9", "(Lic4/a;)Lmz2/a$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lac4/k;", "c", "Lac4/b;", "d", "Loz2/b;", "e", "Lac4/i;", "f", "Lyy2/c;", "g", "Lyy2/b;", "h", "Ld74/b;", "j", "Lkk0/a;", "k", "Lhb4/d;", "l", "Llz2/c;", "m", "Llz2/b;", "n", "La14/w;", "p", "Li70/n;", "q", "Lkz2/c;", "Lkz2/n$b;", "r", "Lkz2/n$b;", "initialState", "Lxw/b;", "Lkz2/m$e;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "a", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 extends l00.g<kz2.n, kz2.m> implements kz2.o, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.k nfcDisableReadingUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.b checkNFCStatusUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oz2.b nfcDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.i goToNfcSettingsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final yy2.c createJWSTokenStructureForEIDUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final yy2.b createJWSETokenForEIDUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final d74.b getWKTokenForMIDUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final kk0.a authenticateUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final lz2.c mapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final lz2.b errorMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final kz2.c setupContract;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final kz2.n.Init initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<kz2.m.e> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<kz2.n, kz2.m> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<kz2.o.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lkz2/b0$a;", "Lf00/j0;", "Lkz2/c;", "Lkz2/b0;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<kz2.c, b0> {
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f113507b;

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
            f113506a = iArr;
            int[] iArr2 = new int[ic4.a.values().length];
            try {
                iArr2[ic4.a.INCORRECT_CAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ic4.a.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f113507b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<kz2.o.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f113508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f113509b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f113510a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f113511b;

            /* JADX INFO: renamed from: kz2.b0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2757a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f113512d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f113513e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f113514f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f113516h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f113517j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f113518k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f113519l;

                public C2757a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f113512d = obj;
                    this.f113513e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, b0 b0Var) {
                this.f113510a = hVar;
                this.f113511b = b0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2757a c2757a;
                if (eVar instanceof C2757a) {
                    c2757a = (C2757a) eVar;
                    int i15 = c2757a.f113513e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2757a.f113513e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2757a = new C2757a(eVar);
                    }
                } else {
                    c2757a = new C2757a(eVar);
                }
                Object obj2 = c2757a.f113512d;
                Object objE = uq.b.e();
                int i16 = c2757a.f113513e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f113510a;
                    kz2.o.a aVarK9 = this.f113511b.K9((kz2.n) obj);
                    c2757a.f113514f = vq.j.a(obj);
                    c2757a.f113516h = vq.j.a(c2757a);
                    c2757a.f113517j = vq.j.a(obj);
                    c2757a.f113518k = vq.j.a(hVar);
                    c2757a.f113519l = 0;
                    c2757a.f113513e = 1;
                    if (hVar.F(aVarK9, c2757a) == objE) {
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

        public c(mu.g gVar, b0 b0Var) {
            this.f113508a = gVar;
            this.f113509b = b0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super kz2.o.a> hVar, tq.e eVar) {
            Object objA = this.f113508a.a(new a(hVar, this.f113509b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkz2/m$c;", "<unused var>", "Lkz2/n;", "Loq/i0;", "<anonymous>", "(Lkz2/m$c;Lkz2/n;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<kz2.m.c, kz2.n, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113520e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113520e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kz2.m.e> bVarY1 = b0.this.Y1();
                kz2.m.e.b bVar = kz2.m.e.b.f113624a;
                this.f113520e = 1;
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
        public final Object w(kz2.m.c cVar, kz2.n nVar, tq.e<? super oq.i0> eVar) {
            return b0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkz2/m$d;", "<unused var>", "Lkz2/n;", "Loq/i0;", "<anonymous>", "(Lkz2/m$d;Lkz2/n;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<kz2.m.d, kz2.n, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113522e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113522e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kz2.m.e> bVarY1 = b0.this.Y1();
                kz2.m.e.d dVar = kz2.m.e.d.f113626a;
                this.f113522e = 1;
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
        public final Object w(kz2.m.d dVar, kz2.n nVar, tq.e<? super oq.i0> eVar) {
            return b0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkz2/m$g;", "<unused var>", "Lkz2/n;", "Loq/i0;", "<anonymous>", "(Lkz2/m$g;Lkz2/n;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<kz2.m.g, kz2.n, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113524e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113524e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.k kVar = b0.this.nfcDisableReadingUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f113524e = 1;
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
        public final Object w(kz2.m.g gVar, kz2.n nVar, tq.e<? super oq.i0> eVar) {
            return b0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkz2/m$f;", "<unused var>", "Lkz2/n$c;", "state", "Loq/i0;", "<anonymous>", "(Lkz2/m$f;Lkz2/n$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<kz2.m.f, kz2.n.Success, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113526e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113527f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            kz2.n.Success success = (kz2.n.Success) this.f113527f;
            Object objE = uq.b.e();
            int i15 = this.f113526e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = b0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(success.getProviderUrl(), false, 2, null);
                this.f113527f = vq.j.a(success);
                this.f113526e = 1;
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
            b0 b0Var = b0.this;
            if (iVar instanceof dx.i.Left) {
                b0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            b0.this.d9(kz2.m.c.f113621a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kz2.m.f fVar, kz2.n.Success success, tq.e<? super oq.i0> eVar) {
            g gVar = b0.this.new g(eVar);
            gVar.f113527f = success;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkz2/m$b;", "action", "Lkz2/n$d$e;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lkz2/m$b;Lkz2/n$d$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<kz2.m.b, kz2.n.d.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113529e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113529e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kz2.m.e> bVarY1 = b0.this.Y1();
                kz2.m.e.a aVar = kz2.m.e.a.f113623a;
                this.f113529e = 1;
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
        public final Object w(kz2.m.b bVar, kz2.n.d.Error error, tq.e<? super oq.i0> eVar) {
            return b0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkz2/n$b;", "state", "Lk10/l;", "Lkz2/n;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<k10.c0<kz2.n.Init>, tq.e<? super k10.l<? extends kz2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113532f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n O(b0 b0Var, kz2.n.Init init) {
            ExternalQualifiedSignatureStartResponse signatureStartResponse = b0Var.setupContract.P3().getMIdData().getSignatureStartResponse();
            return signatureStartResponse != null ? new kz2.n.d.CheckNfc(new kz2.n.d.StateData(new WKAuthSigningParams(signatureStartResponse.a(), signatureStartResponse.getEncryptionKey(), signatureStartResponse.getEncryptionKeyId(), signatureStartResponse.e(), signatureStartResponse.getTokenTtlInSeconds(), null), b0Var.setupContract.P3(), null, init.getAreAnimationsEnabled(), 4, null)) : new kz2.n.ErrorData(init.getAreAnimationsEnabled(), b0Var.errorVMSFactory.a(b0.J9(b0Var, new mz2.a.GenericError(new dx.b.Generic(new Exception("SignatureStartResponse cannot be null"))), b0Var.b9(kz2.m.c.f113621a), null, 2, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f113532f;
            uq.b.e();
            if (this.f113531e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final b0 b0Var = b0.this;
            return c0Var.d(new er.l() { // from class: kz2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.i.O(b0Var, (n.Init) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<kz2.n.Init> c0Var, tq.e<? super k10.l<? extends kz2.n>> eVar) {
            return ((i) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = b0.this.new i(eVar);
            iVar.f113532f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkz2/n$d$b;", "state", "Lk10/l;", "Lkz2/n;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<kz2.n.d.CheckNfc>, tq.e<? super k10.l<? extends kz2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113535f;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.CreateJWSEForMID O(kz2.n.d.CheckNfc checkNfc) {
            return new kz2.n.d.CreateJWSEForMID(checkNfc.getData());
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
                java.lang.Object r0 = r9.f113535f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r9.f113534e
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
                kz2.b0 r10 = kz2.b0.this
                ac4.b r10 = kz2.b0.v9(r10)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r9.f113535f = r0
                r9.f113534e = r4
                java.lang.Object r10 = r10.c(r2, r9)
                if (r10 != r1) goto L38
                goto L88
            L38:
                ac4.b$a r10 = (ac4.b.a) r10
                ac4.b$a$b r2 = ac4.b.a.C0108b.f5391a
                boolean r2 = fr.t.c(r10, r2)
                if (r2 == 0) goto L4c
                kz2.d0 r10 = new kz2.d0
                r10.<init>()
                k10.l r10 = r0.d(r10)
                return r10
            L4c:
                ac4.b$a$a r2 = ac4.b.a.C0107a.f5390a
                boolean r10 = fr.t.c(r10, r2)
                if (r10 == 0) goto L8e
                kz2.b0 r10 = kz2.b0.this
                xw.b r10 = r10.Y1()
                kz2.m$e$c r2 = new kz2.m$e$c
                kz2.b0 r4 = kz2.b0.this
                oz2.b r4 = kz2.b0.B9(r4)
                oz2.b$a r5 = new oz2.b$a
                kz2.b0 r6 = kz2.b0.this
                kz2.m$h r7 = kz2.m.h.f113629a
                er.a r6 = kz2.b0.s9(r6, r7)
                kz2.b0 r7 = kz2.b0.this
                kz2.m$a r8 = kz2.m.a.f113619a
                er.a r7 = kz2.b0.s9(r7, r8)
                r5.<init>(r6, r7)
                cb4.d r4 = r4.b(r5)
                r2.<init>(r4)
                r9.f113535f = r0
                r9.f113534e = r3
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
            throw new UnsupportedOperationException("Method not decompiled: kz2.b0.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<kz2.n.d.CheckNfc> c0Var, tq.e<? super k10.l<? extends kz2.n>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = b0.this.new j(eVar);
            jVar.f113535f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkz2/m$h;", "<unused var>", "Lk10/c0;", "Lkz2/n$d$b;", "state", "Lk10/l;", "Lkz2/n;", "<anonymous>", "(Lkz2/m$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<kz2.m.h, k10.c0<kz2.n.d.CheckNfc>, tq.e<? super k10.l<? extends kz2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113538f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.Error O(k10.c0 c0Var, b0 b0Var, dx.b.Business business, kz2.n.d.CheckNfc checkNfc) {
            return new kz2.n.d.Error(((kz2.n.d.CheckNfc) c0Var.a()).getData(), b0Var.errorVMSFactory.a(b0.J9(b0Var, new mz2.a.GenericError(business), b0Var.b9(kz2.m.a.f113619a), null, 2, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f113538f;
            Object objE = uq.b.e();
            int i15 = this.f113537e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.i iVar = b0.this.goToNfcSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f113538f = c0Var;
                this.f113537e = 1;
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
            final b0 b0Var = b0.this;
            if (iVar2 instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVar2).b();
                return c0Var.d(new er.l() { // from class: kz2.e0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.k.O(c0Var, b0Var, business, (n.d.CheckNfc) obj2);
                    }
                });
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            b0Var.d9(kz2.m.a.f113619a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kz2.m.h hVar, k10.c0<kz2.n.d.CheckNfc> c0Var, tq.e<? super k10.l<? extends kz2.n>> eVar) {
            k kVar = b0.this.new k(eVar);
            kVar.f113538f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkz2/m$a;", "<unused var>", "Lkz2/n$d$b;", "Loq/i0;", "<anonymous>", "(Lkz2/m$a;Lkz2/n$d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<kz2.m.a, kz2.n.d.CheckNfc, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113540e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113540e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kz2.m.e> bVarY1 = b0.this.Y1();
                kz2.m.e.a aVar = kz2.m.e.a.f113623a;
                this.f113540e = 1;
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
        public final Object w(kz2.m.a aVar, kz2.n.d.CheckNfc checkNfc, tq.e<? super oq.i0> eVar) {
            return b0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkz2/n$d$c;", "state", "Lk10/l;", "Lkz2/n;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<k10.c0<kz2.n.d.CreateJWSEForMID>, tq.e<? super k10.l<? extends kz2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113543f;

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.Error V(k10.c0 c0Var, b0 b0Var, dx.b bVar, kz2.n.d.CreateJWSEForMID createJWSEForMID) {
            return new kz2.n.d.Error(((kz2.n.d.CreateJWSEForMID) c0Var.a()).getData(), b0Var.errorVMSFactory.a(b0.J9(b0Var, new mz2.a.GenericError(bVar), b0Var.b9(kz2.m.a.f113619a), null, 2, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.ReadCert X(JWSETokenPair jWSETokenPair, kz2.n.d.CreateJWSEForMID createJWSEForMID) {
            return new kz2.n.d.ReadCert(createJWSEForMID.getData(), null, jWSETokenPair.getJwseToken(), jWSETokenPair.getJwsToken(), 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f113543f;
            Object objE = uq.b.e();
            int i15 = this.f113542e;
            if (i15 == 0) {
                oq.u.b(obj);
                d74.b bVar = b0.this.getWKTokenForMIDUC;
                d74.b.a.QualifiedSignature qualifiedSignature = new d74.b.a.QualifiedSignature(((kz2.n.d.CreateJWSEForMID) c0Var.a()).getData().getSigningParams());
                this.f113543f = c0Var;
                this.f113542e = 1;
                obj = bVar.c(qualifiedSignature, this);
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
            final b0 b0Var = b0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: kz2.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.m.V(c0Var, b0Var, bVar2, (n.d.CreateJWSEForMID) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final JWSETokenPair jWSETokenPair = (JWSETokenPair) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: kz2.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.m.X(jWSETokenPair, (n.d.CreateJWSEForMID) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<kz2.n.d.CreateJWSEForMID> c0Var, tq.e<? super k10.l<? extends kz2.n>> eVar) {
            return ((m) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            m mVar = b0.this.new m(eVar);
            mVar.f113543f = obj;
            return mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkz2/n$d$g;", "state", "Lk10/l;", "Lkz2/n;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<k10.c0<kz2.n.d.ReadCert>, tq.e<? super k10.l<? extends kz2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f113545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f113546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113547g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f113549j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ic4.b bVar, tq.e<? super n> eVar) {
            super(2, eVar);
            this.f113549j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.Error V(k10.c0 c0Var, b0 b0Var, kz2.n.d.ReadCert readCert) {
            return new kz2.n.d.Error(((kz2.n.d.ReadCert) c0Var.a()).getData(), b0Var.errorVMSFactory.a(b0.J9(b0Var, mz2.a.EnumC3227a.GENERIC_ERROR, new er.a() { // from class: kz2.i0
                @Override // er.a
                public final Object a() {
                    return b0.n.X();
                }
            }, null, 2, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
        
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
                java.lang.Object r0 = r10.f113547g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r10.f113546f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r1 = r10.f113545e
                cy.b$a$h r1 = (cy.b.a.ReadCertificate) r1
                oq.u.b(r11)
                goto L73
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
                kz2.b0 r11 = kz2.b0.this
                ac4.k r11 = kz2.b0.C9(r11)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r10.f113547g = r0
                r10.f113546f = r4
                java.lang.Object r11 = r11.c(r2, r10)
                if (r11 != r1) goto L3c
                goto L72
            L3c:
                cy.b$a$h r4 = new cy.b$a$h
                java.lang.Object r11 = r0.a()
                kz2.n$d$g r11 = (kz2.n.d.ReadCert) r11
                kz2.n$d$i r11 = r11.getData()
                kz2.l r11 = r11.getVerificationData()
                ez2.g r11 = r11.getCanData()
                iy.b0 r11 = r11.getCan()
                java.lang.String r5 = iy.c0.e(r11)
                cy.b$a$c r6 = cy.b.a.c.PRESENCE
                r8 = 4
                r9 = 0
                r7 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                ic4.b r11 = r10.f113549j
                r10.f113547g = r0
                java.lang.Object r2 = vq.j.a(r4)
                r10.f113545e = r2
                r10.f113546f = r3
                java.lang.Object r11 = r11.c(r4, r10)
                if (r11 != r1) goto L73
            L72:
                return r1
            L73:
                dx.i r11 = (dx.i) r11
                kz2.b0 r1 = kz2.b0.this
                boolean r2 = r11 instanceof dx.i.Left
                if (r2 == 0) goto L8d
                dx.i$b r11 = (dx.i.Left) r11
                java.lang.Object r11 = r11.b()
                dx.b r11 = (dx.b) r11
                kz2.h0 r11 = new kz2.h0
                r11.<init>()
                k10.l r11 = r0.d(r11)
                return r11
            L8d:
                boolean r1 = r11 instanceof dx.i.Right
                if (r1 == 0) goto L9e
                dx.i$c r11 = (dx.i.Right) r11
                java.lang.Object r11 = r11.b()
                oq.i0 r11 = (oq.i0) r11
                k10.l r11 = r0.c()
                return r11
            L9e:
                oq.p r11 = new oq.p
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kz2.b0.n.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<kz2.n.d.ReadCert> c0Var, tq.e<? super k10.l<? extends kz2.n>> eVar) {
            return ((n) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            n nVar = b0.this.new n(this.f113549j, eVar);
            nVar.f113547g = obj;
            return nVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lkz2/n$d$g;", "state", "Lk10/l;", "Lkz2/n;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<cy.c, k10.c0<kz2.n.d.ReadCert>, tq.e<? super k10.l<? extends kz2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113551f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113552g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.Error b0(k10.c0 c0Var, b0 b0Var, mz2.a aVar, kz2.n.d.ReadCert readCert) {
            return new kz2.n.d.Error(((kz2.n.d.ReadCert) c0Var.a()).getData(), b0Var.errorVMSFactory.a(b0.J9(b0Var, aVar, new er.a() { // from class: kz2.p0
                @Override // er.a
                public final Object a() {
                    return b0.o.c0();
                }
            }, null, 2, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 c0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.ReadCert d0(cy.c cVar, kz2.n.d.ReadCert readCert) {
            return kz2.n.d.ReadCert.d(readCert, null, cVar, null, null, 13, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.InitAuthentication e0(cy.c cVar, kz2.n.d.ReadCert readCert) {
            return new kz2.n.d.InitAuthentication(kz2.n.d.StateData.b(readCert.getData(), null, null, iy.c0.g(((cy.c.Finished) cVar).getCertificate()), false, 11, null), readCert.getMIdCardJWSEToken(), readCert.getMIdCardJWSToken(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.ReadCert f0(cy.c cVar, kz2.n.d.ReadCert readCert) {
            return kz2.n.d.ReadCert.d(readCert, null, cVar, null, null, 13, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.Error g0(k10.c0 c0Var, b0 b0Var, kz2.n.d.ReadCert readCert) {
            return new kz2.n.d.Error(((kz2.n.d.ReadCert) c0Var.a()).getData(), b0Var.errorVMSFactory.a(b0.J9(b0Var, mz2.a.EnumC3227a.GENERIC_ERROR, new er.a() { // from class: kz2.o0
                @Override // er.a
                public final Object a() {
                    return b0.o.h0();
                }
            }, null, 2, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 h0() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy.c cVar = (cy.c) this.f113551f;
            final k10.c0 c0Var = (k10.c0) this.f113552g;
            uq.b.e();
            if (this.f113550e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (cVar instanceof cy.c.Error) {
                final mz2.a aVarH9 = b0.this.H9((cy.c.Error) cVar);
                if (aVarH9 != null) {
                    final b0 b0Var = b0.this;
                    k10.l lVarD = c0Var.d(new er.l() { // from class: kz2.j0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.o.b0(c0Var, b0Var, aVarH9, (n.d.ReadCert) obj2);
                        }
                    });
                    if (lVarD != null) {
                        return lVarD;
                    }
                }
                return c0Var.b(new er.l() { // from class: kz2.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.o.d0(cVar, (n.d.ReadCert) obj2);
                    }
                });
            }
            if (cVar instanceof cy.c.Finished) {
                return c0Var.d(new er.l() { // from class: kz2.l0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.o.e0(cVar, (n.d.ReadCert) obj2);
                    }
                });
            }
            if ((cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
                return c0Var.b(new er.l() { // from class: kz2.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.o.f0(cVar, (n.d.ReadCert) obj2);
                    }
                });
            }
            if (!(cVar instanceof cy.c.InvalidPinOrPukError)) {
                throw new oq.p();
            }
            final b0 b0Var2 = b0.this;
            return c0Var.d(new er.l() { // from class: kz2.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.o.g0(c0Var, b0Var2, (n.d.ReadCert) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<kz2.n.d.ReadCert> c0Var, tq.e<? super k10.l<? extends kz2.n>> eVar) {
            o oVar = b0.this.new o(eVar);
            oVar.f113551f = cVar;
            oVar.f113552g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkz2/m$a;", "<unused var>", "Lkz2/n$d$g;", "Loq/i0;", "<anonymous>", "(Lkz2/m$a;Lkz2/n$d$g;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<kz2.m.a, kz2.n.d.ReadCert, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113554e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113554e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kz2.m.e> bVarY1 = b0.this.Y1();
                kz2.m.e.a aVar = kz2.m.e.a.f113623a;
                this.f113554e = 1;
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
        public final Object w(kz2.m.a aVar, kz2.n.d.ReadCert readCert, tq.e<? super oq.i0> eVar) {
            return b0.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkz2/n$d$f;", "state", "Lk10/l;", "Lkz2/n;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.p<k10.c0<kz2.n.d.InitAuthentication>, tq.e<? super k10.l<? extends kz2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113557f;

        q(tq.e<? super q> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.Error V(k10.c0 c0Var, b0 b0Var, dx.b bVar, kz2.n.d.InitAuthentication initAuthentication) {
            return new kz2.n.d.Error(((kz2.n.d.InitAuthentication) c0Var.a()).getData(), b0Var.errorVMSFactory.a(b0.J9(b0Var, new mz2.a.GenericError(bVar), b0Var.b9(kz2.m.a.f113619a), null, 2, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.SignWithIdCard X(JWSTokenStructure jWSTokenStructure, kz2.n.d.InitAuthentication initAuthentication) {
            return new kz2.n.d.SignWithIdCard(initAuthentication.getData(), null, jWSTokenStructure, initAuthentication.getMIdCardJWSEToken(), 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f113557f;
            Object objE = uq.b.e();
            int i15 = this.f113556e;
            if (i15 == 0) {
                oq.u.b(obj);
                yy2.c cVar = b0.this.createJWSTokenStructureForEIDUC;
                yy2.c.Params params = new yy2.c.Params(WKAuthSigningParams.b(((kz2.n.d.InitAuthentication) c0Var.a()).getData().getSigningParams(), pq.v0.p(((kz2.n.d.InitAuthentication) c0Var.a()).getData().getSigningParams().c(), oq.y.a("mobileIdSignature", iy.c0.e(((kz2.n.d.InitAuthentication) c0Var.a()).getMIdCardJWSToken()))), null, null, null, 0L, 30, null), ((kz2.n.d.InitAuthentication) c0Var.a()).getData().getPresenceCert());
                this.f113557f = c0Var;
                this.f113556e = 1;
                obj = cVar.d(params, this);
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
            final b0 b0Var = b0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: kz2.q0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.q.V(c0Var, b0Var, bVar, (n.d.InitAuthentication) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final JWSTokenStructure jWSTokenStructure = (JWSTokenStructure) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: kz2.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.q.X(jWSTokenStructure, (n.d.InitAuthentication) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<kz2.n.d.InitAuthentication> c0Var, tq.e<? super k10.l<? extends kz2.n>> eVar) {
            return ((q) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            q qVar = b0.this.new q(eVar);
            qVar.f113557f = obj;
            return qVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkz2/n$d$h;", "state", "Lk10/l;", "Lkz2/n;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.p<k10.c0<kz2.n.d.SignWithIdCard>, tq.e<? super k10.l<? extends kz2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f113559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f113560f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113561g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f113563j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(ic4.b bVar, tq.e<? super r> eVar) {
            super(2, eVar);
            this.f113563j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.Error V(k10.c0 c0Var, b0 b0Var, kz2.n.d.SignWithIdCard signWithIdCard) {
            return new kz2.n.d.Error(((kz2.n.d.SignWithIdCard) c0Var.a()).getData(), b0Var.errorVMSFactory.a(b0.J9(b0Var, mz2.a.EnumC3227a.GENERIC_ERROR, new er.a() { // from class: kz2.t0
                @Override // er.a
                public final Object a() {
                    return b0.r.X();
                }
            }, null, 2, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
        
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
                java.lang.Object r0 = r10.f113561g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r10.f113560f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r1 = r10.f113559e
                cy.b$a$f r1 = (cy.b.a.PresenceSign) r1
                oq.u.b(r11)
                goto L83
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
                kz2.b0 r11 = kz2.b0.this
                ac4.k r11 = kz2.b0.C9(r11)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r10.f113561g = r0
                r10.f113560f = r4
                java.lang.Object r11 = r11.c(r2, r10)
                if (r11 != r1) goto L3c
                goto L82
            L3c:
                cy.b$a$f r4 = new cy.b$a$f
                java.lang.Object r11 = r0.a()
                kz2.n$d$h r11 = (kz2.n.d.SignWithIdCard) r11
                my.f r11 = r11.getJwsStructure()
                iy.b0 r11 = r11.getContentSha384()
                java.lang.String r5 = iy.c0.e(r11)
                java.lang.Object r11 = r0.a()
                kz2.n$d$h r11 = (kz2.n.d.SignWithIdCard) r11
                kz2.n$d$i r11 = r11.getData()
                kz2.l r11 = r11.getVerificationData()
                ez2.g r11 = r11.getCanData()
                iy.b0 r11 = r11.getCan()
                java.lang.String r6 = iy.c0.e(r11)
                r8 = 4
                r9 = 0
                r7 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                ic4.b r11 = r10.f113563j
                r10.f113561g = r0
                java.lang.Object r2 = vq.j.a(r4)
                r10.f113559e = r2
                r10.f113560f = r3
                java.lang.Object r11 = r11.c(r4, r10)
                if (r11 != r1) goto L83
            L82:
                return r1
            L83:
                dx.i r11 = (dx.i) r11
                kz2.b0 r1 = kz2.b0.this
                boolean r2 = r11 instanceof dx.i.Left
                if (r2 == 0) goto L9d
                dx.i$b r11 = (dx.i.Left) r11
                java.lang.Object r11 = r11.b()
                dx.b r11 = (dx.b) r11
                kz2.s0 r11 = new kz2.s0
                r11.<init>()
                k10.l r11 = r0.d(r11)
                return r11
            L9d:
                boolean r1 = r11 instanceof dx.i.Right
                if (r1 == 0) goto Lae
                dx.i$c r11 = (dx.i.Right) r11
                java.lang.Object r11 = r11.b()
                oq.i0 r11 = (oq.i0) r11
                k10.l r11 = r0.c()
                return r11
            Lae:
                oq.p r11 = new oq.p
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kz2.b0.r.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<kz2.n.d.SignWithIdCard> c0Var, tq.e<? super k10.l<? extends kz2.n>> eVar) {
            return ((r) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            r rVar = b0.this.new r(this.f113563j, eVar);
            rVar.f113561g = obj;
            return rVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lkz2/n$d$h;", "state", "Lk10/l;", "Lkz2/n;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<cy.c, k10.c0<kz2.n.d.SignWithIdCard>, tq.e<? super k10.l<? extends kz2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113565f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113566g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.Error b0(k10.c0 c0Var, b0 b0Var, mz2.a aVar, kz2.n.d.SignWithIdCard signWithIdCard) {
            return new kz2.n.d.Error(((kz2.n.d.SignWithIdCard) c0Var.a()).getData(), b0Var.errorVMSFactory.a(b0.J9(b0Var, aVar, new er.a() { // from class: kz2.z0
                @Override // er.a
                public final Object a() {
                    return b0.s.c0();
                }
            }, null, 2, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 c0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.SignWithIdCard d0(cy.c cVar, kz2.n.d.SignWithIdCard signWithIdCard) {
            return kz2.n.d.SignWithIdCard.d(signWithIdCard, null, cVar, null, null, 13, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.CreateJWSEToken e0(cy.c cVar, kz2.n.d.SignWithIdCard signWithIdCard) {
            return new kz2.n.d.CreateJWSEToken(kz2.n.d.StateData.b(signWithIdCard.getData(), null, null, null, false, 15, null), signWithIdCard.getJwsStructure(), iy.c0.g(((cy.c.Finished) cVar).getSignedDataBase64()), signWithIdCard.getMIdCardJWSEToken(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.SignWithIdCard f0(cy.c cVar, kz2.n.d.SignWithIdCard signWithIdCard) {
            return kz2.n.d.SignWithIdCard.d(signWithIdCard, null, cVar, null, null, 13, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.ErrorData g0(b0 b0Var, kz2.n.d.SignWithIdCard signWithIdCard) {
            return new kz2.n.ErrorData(signWithIdCard.getAreAnimationsEnabled(), b0Var.errorVMSFactory.a(b0.J9(b0Var, mz2.a.EnumC3227a.GENERIC_ERROR, new er.a() { // from class: kz2.a1
                @Override // er.a
                public final Object a() {
                    return b0.s.h0();
                }
            }, null, 2, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 h0() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy.c cVar = (cy.c) this.f113565f;
            final k10.c0 c0Var = (k10.c0) this.f113566g;
            uq.b.e();
            if (this.f113564e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (cVar instanceof cy.c.Error) {
                final mz2.a aVarH9 = b0.this.H9((cy.c.Error) cVar);
                if (aVarH9 != null) {
                    final b0 b0Var = b0.this;
                    k10.l lVarD = c0Var.d(new er.l() { // from class: kz2.u0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.s.b0(c0Var, b0Var, aVarH9, (n.d.SignWithIdCard) obj2);
                        }
                    });
                    if (lVarD != null) {
                        return lVarD;
                    }
                }
                return c0Var.b(new er.l() { // from class: kz2.v0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.s.d0(cVar, (n.d.SignWithIdCard) obj2);
                    }
                });
            }
            if (cVar instanceof cy.c.Finished) {
                return c0Var.d(new er.l() { // from class: kz2.w0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.s.e0(cVar, (n.d.SignWithIdCard) obj2);
                    }
                });
            }
            if ((cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
                return c0Var.b(new er.l() { // from class: kz2.x0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.s.f0(cVar, (n.d.SignWithIdCard) obj2);
                    }
                });
            }
            if (!(cVar instanceof cy.c.InvalidPinOrPukError)) {
                throw new oq.p();
            }
            final b0 b0Var2 = b0.this;
            return c0Var.d(new er.l() { // from class: kz2.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.s.g0(b0Var2, (n.d.SignWithIdCard) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<kz2.n.d.SignWithIdCard> c0Var, tq.e<? super k10.l<? extends kz2.n>> eVar) {
            s sVar = b0.this.new s(eVar);
            sVar.f113565f = cVar;
            sVar.f113566g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkz2/n$d$d;", "state", "Lk10/l;", "Lkz2/n;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.p<k10.c0<kz2.n.d.CreateJWSEToken>, tq.e<? super k10.l<? extends kz2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113568e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113569f;

        t(tq.e<? super t> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.Error V(k10.c0 c0Var, b0 b0Var, dx.b bVar, kz2.n.d.CreateJWSEToken createJWSEToken) {
            return new kz2.n.d.Error(((kz2.n.d.CreateJWSEToken) c0Var.a()).getData(), b0Var.errorVMSFactory.a(b0.J9(b0Var, new mz2.a.GenericError(bVar), b0Var.b9(kz2.m.a.f113619a), null, 2, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.Authenticate X(iy.b0 b0Var, kz2.n.d.CreateJWSEToken createJWSEToken) {
            return new kz2.n.d.Authenticate(createJWSEToken.getData(), b0Var, createJWSEToken.getMIdCardJWSEToken(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f113569f;
            Object objE = uq.b.e();
            int i15 = this.f113568e;
            if (i15 == 0) {
                oq.u.b(obj);
                yy2.b bVar = b0.this.createJWSETokenForEIDUC;
                yy2.b.Params params = new yy2.b.Params(((kz2.n.d.CreateJWSEToken) c0Var.a()).getSignedWithIDCardBase64(), ((kz2.n.d.CreateJWSEToken) c0Var.a()).getJwsStructure(), ((kz2.n.d.CreateJWSEToken) c0Var.a()).getData().getSigningParams());
                this.f113569f = c0Var;
                this.f113568e = 1;
                obj = bVar.e(params, this);
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
            final b0 b0Var = b0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: kz2.b1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.t.V(c0Var, b0Var, bVar2, (n.d.CreateJWSEToken) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final iy.b0 value = ((ny.a) ((dx.i.Right) iVar).b()).getValue();
            return c0Var.d(new er.l() { // from class: kz2.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.t.X(value, (n.d.CreateJWSEToken) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<kz2.n.d.CreateJWSEToken> c0Var, tq.e<? super k10.l<? extends kz2.n>> eVar) {
            return ((t) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            t tVar = b0.this.new t(eVar);
            tVar.f113569f = obj;
            return tVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkz2/n$d$a;", "state", "Lk10/l;", "Lkz2/n;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.p<k10.c0<kz2.n.d.Authenticate>, tq.e<? super k10.l<? extends kz2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113572f;

        u(tq.e<? super u> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.d.Error V(k10.c0 c0Var, b0 b0Var, dx.b bVar, kz2.n.d.Authenticate authenticate) {
            return new kz2.n.d.Error(((kz2.n.d.Authenticate) c0Var.a()).getData(), b0Var.errorVMSFactory.a(b0.J9(b0Var, new mz2.a.GenericError(bVar), b0Var.b9(kz2.m.c.f113621a), null, 2, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kz2.n.Success X(ExternalQualifiedSignatureAuthenticateResponse externalQualifiedSignatureAuthenticateResponse, b0 b0Var, kz2.n.d.Authenticate authenticate) {
            return new kz2.n.Success(authenticate.getAreAnimationsEnabled(), externalQualifiedSignatureAuthenticateResponse.getProviderProcessUrl(), b0Var.setupContract.P3().getEntryPoint());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f113572f;
            Object objE = uq.b.e();
            int i15 = this.f113571e;
            if (i15 == 0) {
                oq.u.b(obj);
                kk0.a aVar = b0.this.authenticateUC;
                kk0.a.Params params = new kk0.a.Params(new ExternalQualifiedSignatureAuthenticateRequest(((kz2.n.d.Authenticate) c0Var.a()).getMIdCardJWSEToken(), ((kz2.n.d.Authenticate) c0Var.a()).getEIdCardJWSEToken()));
                this.f113572f = c0Var;
                this.f113571e = 1;
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
            final b0 b0Var = b0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: kz2.d1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.u.V(c0Var, b0Var, bVar, (n.d.Authenticate) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final ExternalQualifiedSignatureAuthenticateResponse externalQualifiedSignatureAuthenticateResponse = (ExternalQualifiedSignatureAuthenticateResponse) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: kz2.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.u.X(externalQualifiedSignatureAuthenticateResponse, b0Var, (n.d.Authenticate) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<kz2.n.d.Authenticate> c0Var, tq.e<? super k10.l<? extends kz2.n>> eVar) {
            return ((u) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            u uVar = b0.this.new u(eVar);
            uVar.f113572f = obj;
            return uVar;
        }
    }

    public b0(yy.a aVar, ac4.k kVar, ac4.b bVar, oz2.b bVar2, ac4.i iVar, yy2.c cVar, yy2.b bVar3, d74.b bVar4, kk0.a aVar2, hb4.d dVar, lz2.c cVar2, lz2.b bVar5, a14.w wVar, i70.n nVar, jx.g gVar, final ic4.b bVar6, final ac4.l lVar, kz2.c cVar3) {
        this.nfcDisableReadingUseCase = kVar;
        this.checkNFCStatusUseCase = bVar;
        this.nfcDialogMapper = bVar2;
        this.goToNfcSettingsUseCase = iVar;
        this.createJWSTokenStructureForEIDUC = cVar;
        this.createJWSETokenForEIDUC = bVar3;
        this.getWKTokenForMIDUC = bVar4;
        this.authenticateUC = aVar2;
        this.errorVMSFactory = dVar;
        this.mapper = cVar2;
        this.errorMapper = bVar5;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.setupContract = cVar3;
        kz2.n.Init init = new kz2.n.Init(gVar.r());
        this.initialState = init;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(init, new er.l() { // from class: kz2.r
            @Override // er.l
            public final Object b(Object obj) {
                return b0.M9(this.f113680a, lVar, bVar6, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), K9(init));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mz2.a H9(cy.c.Error error) {
        ic4.a aVarA = ic4.a.INSTANCE.a(error.getCode());
        if (aVarA != ic4.a.INTERRUPTED) {
            return Y9(aVarA);
        }
        int i15 = b.f113506a[ic4.c.INSTANCE.a(error.getContent()).ordinal()];
        if (i15 == 1 || i15 == 2) {
            return null;
        }
        if (i15 != 3) {
            throw new oq.p();
        }
        d9(kz2.m.g.f113628a);
        return mz2.a.EnumC3227a.TECHNICAL_ERROR;
    }

    private final jb4.b I9(mz2.a aVar, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3) {
        return this.errorMapper.b(new lz2.b.Params(aVar, aVar3, b9(kz2.m.c.f113621a), aVar2, b9(kz2.m.d.f113622a), b9(kz2.m.b.f113620a)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ jb4.b J9(b0 b0Var, mz2.a aVar, er.a aVar2, er.a aVar3, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar3 = b0Var.b9(kz2.m.c.f113621a);
        }
        return b0Var.I9(aVar, aVar2, aVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kz2.o.a K9(kz2.n state) {
        return this.mapper.b(new lz2.c.Params(state, b9(kz2.m.a.f113619a), b9(kz2.m.c.f113621a), b9(kz2.m.f.f113627a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(final b0 b0Var, final ac4.l lVar, final ic4.b bVar, k10.v vVar) {
        vVar.c(fr.q0.c(kz2.n.class), new er.l() { // from class: kz2.p
            @Override // er.l
            public final Object b(Object obj) {
                return b0.N9(this.f113675a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kz2.n.Init.class), new er.l() { // from class: kz2.t
            @Override // er.l
            public final Object b(Object obj) {
                return b0.O9(this.f113687a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kz2.n.d.CheckNfc.class), new er.l() { // from class: kz2.u
            @Override // er.l
            public final Object b(Object obj) {
                return b0.Q9(this.f113688a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kz2.n.d.CreateJWSEForMID.class), new er.l() { // from class: kz2.v
            @Override // er.l
            public final Object b(Object obj) {
                return b0.R9(this.f113692a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kz2.n.d.ReadCert.class), new er.l() { // from class: kz2.w
            @Override // er.l
            public final Object b(Object obj) {
                return b0.S9(lVar, b0Var, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kz2.n.d.InitAuthentication.class), new er.l() { // from class: kz2.x
            @Override // er.l
            public final Object b(Object obj) {
                return b0.T9(this.f113698a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kz2.n.d.SignWithIdCard.class), new er.l() { // from class: kz2.y
            @Override // er.l
            public final Object b(Object obj) {
                return b0.U9(lVar, b0Var, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kz2.n.d.CreateJWSEToken.class), new er.l() { // from class: kz2.z
            @Override // er.l
            public final Object b(Object obj) {
                return b0.V9(this.f113704a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kz2.n.d.Authenticate.class), new er.l() { // from class: kz2.a0
            @Override // er.l
            public final Object b(Object obj) {
                return b0.W9(this.f113485a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kz2.n.Success.class), new er.l() { // from class: kz2.q
            @Override // er.l
            public final Object b(Object obj) {
                return b0.X9(this.f113676a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kz2.n.d.Error.class), new er.l() { // from class: kz2.s
            @Override // er.l
            public final Object b(Object obj) {
                return b0.P9(this.f113684a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(b0 b0Var, k10.z zVar) {
        d dVar = b0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(kz2.m.c.class), oVar, dVar);
        zVar.x(fr.q0.c(kz2.m.d.class), oVar, b0Var.new e(null));
        zVar.x(fr.q0.c(kz2.m.g.class), oVar, b0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(b0 b0Var, k10.z zVar) {
        h hVar = b0Var.new h(null);
        zVar.x(fr.q0.c(kz2.m.b.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new j(null));
        k kVar = b0Var.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(kz2.m.h.class), oVar, kVar);
        zVar.x(fr.q0.c(kz2.m.a.class), oVar, b0Var.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(ac4.l lVar, b0 b0Var, ic4.b bVar, k10.z zVar) {
        zVar.A(b0Var.new n(bVar, null));
        k10.k.m(zVar, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, b0Var.new o(null), 2, null);
        p pVar = b0Var.new p(null);
        zVar.x(fr.q0.c(kz2.m.a.class), k10.o.CANCEL_PREVIOUS, pVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(ac4.l lVar, b0 b0Var, ic4.b bVar, k10.z zVar) {
        zVar.A(b0Var.new r(bVar, null));
        k10.k.m(zVar, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, b0Var.new s(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new t(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(b0 b0Var, k10.z zVar) {
        g gVar = b0Var.new g(null);
        zVar.x(fr.q0.c(kz2.m.f.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    private final mz2.a.EnumC3227a Y9(ic4.a aVar) {
        int i15 = b.f113507b[aVar.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? mz2.a.EnumC3227a.GENERIC_ERROR : mz2.a.EnumC3227a.TIMEOUT;
        }
        return mz2.a.EnumC3227a.WRONG_CAN;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: L9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(kz2.o.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<kz2.m.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<kz2.n, kz2.m> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<kz2.o.a> getState() {
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
