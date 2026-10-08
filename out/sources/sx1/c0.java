package sx1;

import java.time.OffsetDateTime;
import java.util.concurrent.CancellationException;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001dBó\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=\u0012\b\b\u0001\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u00020\u0002H\u0002¢\u0006\u0004\bE\u0010FJ\u0019\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010O\u001a\u00020I*\u00020L2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0004\bO\u0010PJ/\u0010W\u001a\u00020V2\u0006\u0010Q\u001a\u00020I2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010R2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010TH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020V2\u0006\u0010H\u001a\u00020YH\u0002¢\u0006\u0004\bZ\u0010[J\u0015\u0010\\\u001a\u0004\u0018\u00010T*\u00020YH\u0002¢\u0006\u0004\b\\\u0010]J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^H\u0096\u0001¢\u0006\u0004\b`\u0010aJ\u0016\u0010c\u001a\b\u0012\u0004\u0012\u00020b0^H\u0096\u0001¢\u0006\u0004\bc\u0010aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R,\u0010\u0091\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u008c\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R'\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R%\u0010C\u001a\t\u0012\u0004\u0012\u00020D0\u0099\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006\u009e\u0001"}, d2 = {"Lsx1/c0;", "Ll00/g;", "Lsx1/d;", "Lsx1/c;", "Lsx1/e;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Loz/q;", "ownerViewLifecycleManager", "Lux1/m0;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lux1/d;", "documentSigningSignFileDialogMapper", "Lux1/j0;", "documentSigningSignFileErrorMapper", "Lxw1/c;", "processInterruptDialogMapper", "Lpx/d;", "remoteLogger", "Lrw1/e;", "compareCertDataWithUserDataUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lic4/b;", "nfcEdoEnableReadingUseCase", "Lac4/d;", "getCurrentServerTimeUseCase", "Lac4/k;", "nfcDisableReadingUseCase", "Lac4/b;", "checkNFCStatusUseCase", "Lac4/i;", "goToNfcSettingsUseCase", "Lxw1/b;", "dialogMapper", "Lmx/c;", "labelProvider", "Lhb4/d;", "errorVMSFactory", "Lac4/l;", "nfcMonitorReadingUseCase", "Llx1/c;", "startSigningPdfUseCase", "Llx1/a;", "finishSigningPdfUseCase", "Llx1/b;", "saveFileToDownloadsUseCase", "Lac4/n;", "openUriIntentUseCase", "La14/c0;", "sharePdfFromUriIntentUseCase", "Lkk0/g;", "verifyCertificateStatusUseCase", "Lz92/f;", "saveUserActivityUseCase", "Liy/a;", "base64Coder", "Ljx/g;", "systemInfo", "Lsx1/f;", "setupContract", "<init>", "(Lyy/a;Loz/q;Lux1/m0;Lib4/c;Lux1/d;Lux1/j0;Lxw1/c;Lpx/d;Lrw1/e;La14/m;Lic4/b;Lac4/d;Lac4/k;Lac4/b;Lac4/i;Lxw1/b;Lmx/c;Lhb4/d;Lac4/l;Llx1/c;Llx1/a;Llx1/b;Lac4/n;La14/c0;Lkk0/g;Lz92/f;Liy/a;Ljx/g;Lsx1/f;)V", "state", "Lsx1/e$a;", "U9", "(Lsx1/d;)Lsx1/e$a;", "Lcy/c$a;", "error", "Ltx1/a;", "R9", "(Lcy/c$a;)Ltx1/a;", "Lic4/a;", "", "triesLeft", "ka", "(Lic4/a;Ljava/lang/Integer;)Ltx1/a;", "errorType", "", "logMessage", "", "throwable", "Ljb4/b;", "S9", "(Ltx1/a;Ljava/lang/String;Ljava/lang/Throwable;)Ljb4/b;", "Ldx/b;", "P9", "(Ldx/b;)Ljb4/b;", "O9", "(Ldx/b;)Ljava/lang/Throwable;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Loz/q;", "c", "Lux1/m0;", "d", "Lib4/c;", "e", "Lux1/d;", "f", "Lux1/j0;", "g", "Lxw1/c;", "h", "Lpx/d;", "j", "Lac4/d;", "k", "Lac4/k;", "l", "Lac4/b;", "m", "Lac4/i;", "n", "Lxw1/b;", "p", "Lmx/c;", "q", "Lhb4/d;", "r", "Lsx1/f;", "Lsx1/d$g;", "s", "Lsx1/d$g;", "initialState", "Loz/j;", "t", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "v", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lsx1/c$j;", "w", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "x", "Lmu/p0;", "getState", "()Lmu/p0;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 extends l00.g<sx1.d, sx1.c> implements sx1.e, zx.d, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ux1.m0 mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ux1.d documentSigningSignFileDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ux1.j0 documentSigningSignFileErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw1.c processInterruptDialogMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.d getCurrentServerTimeUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ac4.k nfcDisableReadingUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ac4.b checkNFCStatusUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ac4.i goToNfcSettingsUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw1.b dialogMapper;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final sx1.f setupContract;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final sx1.d.PreSetup initialState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k10.t<sx1.d, sx1.c> stateMachine;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sx1.c.j> navAction;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<sx1.e.a> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185269e;

        /* JADX INFO: renamed from: sx1.c0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnx/a;", "viewLifecycle", "Loq/i0;", "<anonymous>", "(Lnx/a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C4787a extends vq.k implements er.p<nx.a, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f185271e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f185272f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0 f185273g;

            /* JADX INFO: renamed from: sx1.c0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C4788a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f185274a;

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
                    f185274a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4787a(c0 c0Var, tq.e<? super C4787a> eVar) {
                super(2, eVar);
                this.f185273g = c0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                nx.a aVar = (nx.a) this.f185272f;
                uq.b.e();
                if (this.f185271e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                int i15 = C4788a.f185274a[aVar.ordinal()];
                if (i15 == 1) {
                    this.f185273g.d9(sx1.c.m.f185243a);
                } else if (i15 == 2) {
                    this.f185273g.d9(sx1.c.l.f185242a);
                }
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(nx.a aVar, tq.e<? super oq.i0> eVar) {
                return ((C4787a) v(aVar, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                C4787a c4787a = new C4787a(this.f185273g, eVar);
                c4787a.f185272f = obj;
                return c4787a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185269e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarS = mu.i.S(c0.this.x8(), new C4787a(c0.this, null));
                this.f185269e = 1;
                if (mu.i.i(gVarS, this) == objE) {
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
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return c0.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsx1/d$i;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.p<k10.c0<sx1.d.ReadCert>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f185276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185277g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f185279j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(ic4.b bVar, tq.e<? super a0> eVar) {
            super(2, eVar);
            this.f185279j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error O(k10.c0 c0Var, c0 c0Var2, sx1.d.ReadCert readCert) {
            return new sx1.d.Error(((sx1.d.ReadCert) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, tx1.a.GENERIC_ERROR, "DocumentSigning: error during read certificate init", null, 4, null)));
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
                java.lang.Object r0 = r10.f185277g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r10.f185276f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r1 = r10.f185275e
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
                sx1.c0 r11 = sx1.c0.this
                ac4.k r11 = sx1.c0.F9(r11)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r10.f185277g = r0
                r10.f185276f = r4
                java.lang.Object r11 = r11.c(r2, r10)
                if (r11 != r1) goto L3c
                goto L6a
            L3c:
                cy.b$a$h r4 = new cy.b$a$h
                java.lang.Object r11 = r0.a()
                sx1.d$i r11 = (sx1.d.ReadCert) r11
                sx1.d$e r11 = r11.getFormData()
                iy.b0 r11 = r11.getCan()
                java.lang.String r5 = iy.c0.e(r11)
                cy.b$a$c r6 = cy.b.a.c.AUTHORIZATION
                r8 = 4
                r9 = 0
                r7 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                ic4.b r11 = r10.f185279j
                r10.f185277g = r0
                java.lang.Object r2 = vq.j.a(r4)
                r10.f185275e = r2
                r10.f185276f = r3
                java.lang.Object r11 = r11.c(r4, r10)
                if (r11 != r1) goto L6b
            L6a:
                return r1
            L6b:
                dx.i r11 = (dx.i) r11
                sx1.c0 r1 = sx1.c0.this
                boolean r2 = r11 instanceof dx.i.Left
                if (r2 == 0) goto L85
                dx.i$b r11 = (dx.i.Left) r11
                java.lang.Object r11 = r11.b()
                dx.b r11 = (dx.b) r11
                sx1.u0 r11 = new sx1.u0
                r11.<init>()
                k10.l r11 = r0.d(r11)
                return r11
            L85:
                boolean r1 = r11 instanceof dx.i.Right
                if (r1 == 0) goto L96
                dx.i$c r11 = (dx.i.Right) r11
                java.lang.Object r11 = r11.b()
                oq.i0 r11 = (oq.i0) r11
                k10.l r11 = r0.c()
                return r11
            L96:
                oq.p r11 = new oq.p
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: sx1.c0.a0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sx1.d.ReadCert> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            return ((a0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a0 a0Var = c0.this.new a0(this.f185279j, eVar);
            a0Var.f185277g = obj;
            return a0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsx1/c0$b;", "Lf00/j0;", "Lsx1/f;", "Lsx1/c0;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends f00.j0<sx1.f, c0> {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lsx1/d$i;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<cy.c, k10.c0<sx1.d.ReadCert>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185282g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k10.z<sx1.d.ReadCert, sx1.d, sx1.c> f185284j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(k10.z<sx1.d.ReadCert, sx1.d, sx1.c> zVar, tq.e<? super b0> eVar) {
            super(3, eVar);
            this.f185284j = zVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error Z(k10.c0 c0Var, c0 c0Var2, tx1.a aVar, cy.c cVar, sx1.d.ReadCert readCert) {
            sx1.d.FormData formData = ((sx1.d.ReadCert) c0Var.a()).getFormData();
            hb4.d dVar = c0Var2.errorVMSFactory;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("DocumentSigning: error during read certificate, code: ");
            cy.c.Error error = (cy.c.Error) cVar;
            sb5.append(error.getCode());
            sb5.append(", content: ");
            sb5.append(error.getContent());
            return new sx1.d.Error(formData, dVar.a(c0.T9(c0Var2, aVar, sb5.toString(), null, 4, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.ReadCert a0(cy.c cVar, sx1.d.ReadCert readCert) {
            return sx1.d.ReadCert.c(readCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.CompareCertData b0(cy.c cVar, sx1.d.ReadCert readCert) {
            return new sx1.d.CompareCertData(sx1.d.FormData.b(readCert.getFormData(), null, null, iy.c0.g(((cy.c.Finished) cVar).getCertificate()), null, null, null, null, null, false, 507, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.ReadCert c0(cy.c cVar, sx1.d.ReadCert readCert) {
            return sx1.d.ReadCert.c(readCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error d0(k10.c0 c0Var, c0 c0Var2, cy.c cVar, sx1.d.ReadCert readCert) {
            cy.c.InvalidPinOrPukError invalidPinOrPukError = (cy.c.InvalidPinOrPukError) cVar;
            return new sx1.d.Error(((sx1.d.ReadCert) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, c0Var2.ka(ic4.a.INSTANCE.a(invalidPinOrPukError.getCode()), Integer.valueOf(invalidPinOrPukError.getTriesLeft())), "DocumentSigning: error during read certificate, code: " + invalidPinOrPukError.getCode() + ", content: " + invalidPinOrPukError.getContent(), null, 4, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy.c cVar = (cy.c) this.f185281f;
            final k10.c0 c0Var = (k10.c0) this.f185282g;
            uq.b.e();
            if (this.f185280e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (cVar instanceof cy.c.Error) {
                final tx1.a aVarR9 = c0.this.R9((cy.c.Error) cVar);
                if (aVarR9 != null) {
                    final c0 c0Var2 = c0.this;
                    k10.l lVarD = c0Var.d(new er.l() { // from class: sx1.v0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return c0.b0.Z(c0Var, c0Var2, aVarR9, cVar, (d.ReadCert) obj2);
                        }
                    });
                    if (lVarD != null) {
                        return lVarD;
                    }
                }
                return c0Var.b(new er.l() { // from class: sx1.w0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.b0.a0(cVar, (d.ReadCert) obj2);
                    }
                });
            }
            if (cVar instanceof cy.c.Finished) {
                return c0Var.d(new er.l() { // from class: sx1.x0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.b0.b0(cVar, (d.ReadCert) obj2);
                    }
                });
            }
            if ((cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
                return c0Var.b(new er.l() { // from class: sx1.y0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.b0.c0(cVar, (d.ReadCert) obj2);
                    }
                });
            }
            if (!(cVar instanceof cy.c.InvalidPinOrPukError)) {
                throw new oq.p();
            }
            final c0 c0Var3 = c0.this;
            return c0Var.d(new er.l() { // from class: sx1.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.b0.d0(c0Var, c0Var3, cVar, (d.ReadCert) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<sx1.d.ReadCert> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            b0 b0Var = c0.this.new b0(this.f185284j, eVar);
            b0Var.f185281f = cVar;
            b0Var.f185282g = c0Var;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f185285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f185286b;

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
            f185285a = iArr;
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
            f185286b = iArr2;
        }
    }

    /* JADX INFO: renamed from: sx1.c0$c0, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsx1/d$b;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C4789c0 extends vq.k implements er.p<k10.c0<sx1.d.CompareCertData>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f185288f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185289g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ rw1.e f185290h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c0 f185291j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4789c0(rw1.e eVar, c0 c0Var, tq.e<? super C4789c0> eVar2) {
            super(2, eVar2);
            this.f185290h = eVar;
            this.f185291j = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error X(k10.c0 c0Var, c0 c0Var2, sx1.d.CompareCertData compareCertData) {
            return new sx1.d.Error(((sx1.d.CompareCertData) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, tx1.a.GENERIC_ERROR, "DocumentSigning: error during data comparison", null, 4, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.VerifyCert Y(k10.c0 c0Var, sx1.d.CompareCertData compareCertData) {
            return new sx1.d.VerifyCert(sx1.d.FormData.b(((sx1.d.CompareCertData) c0Var.a()).getFormData(), null, null, null, null, null, null, null, null, false, 511, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error Z(k10.c0 c0Var, c0 c0Var2, sx1.d.CompareCertData compareCertData) {
            return new sx1.d.Error(((sx1.d.CompareCertData) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, tx1.a.DATA_INCONSISTENCY, "DocumentSigning: error during data comparison, data inconsistency", null, 4, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f185289g;
            Object objE = uq.b.e();
            int i15 = this.f185288f;
            if (i15 == 0) {
                oq.u.b(obj);
                rw1.e.Params params = new rw1.e.Params(((sx1.d.CompareCertData) c0Var.a()).getFormData().getAuthorizationCert());
                rw1.e eVar = this.f185290h;
                this.f185289g = c0Var;
                this.f185287e = vq.j.a(params);
                this.f185288f = 1;
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
            final c0 c0Var2 = this.f185291j;
            if (iVar instanceof dx.i.Left) {
                return c0Var.d(new er.l() { // from class: sx1.a1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.C4789c0.X(c0Var, c0Var2, (d.CompareCertData) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            rw1.e.b bVar = (rw1.e.b) ((dx.i.Right) iVar).b();
            if (fr.t.c(bVar, rw1.e.b.a.f176572a)) {
                return c0Var.d(new er.l() { // from class: sx1.b1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.C4789c0.Y(c0Var, (d.CompareCertData) obj2);
                    }
                });
            }
            if (fr.t.c(bVar, rw1.e.b.C4507b.f176573a)) {
                return c0Var.d(new er.l() { // from class: sx1.c1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.C4789c0.Z(c0Var, c0Var2, (d.CompareCertData) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sx1.d.CompareCertData> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            return ((C4789c0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            C4789c0 c4789c0 = new C4789c0(this.f185290h, this.f185291j, eVar);
            c4789c0.f185289g = obj;
            return c4789c0;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<sx1.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f185292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f185293b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f185294a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f185295b;

            /* JADX INFO: renamed from: sx1.c0$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4790a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f185296d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f185297e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f185298f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f185300h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f185301j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f185302k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f185303l;

                public C4790a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f185296d = obj;
                    this.f185297e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, c0 c0Var) {
                this.f185294a = hVar;
                this.f185295b = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4790a c4790a;
                if (eVar instanceof C4790a) {
                    c4790a = (C4790a) eVar;
                    int i15 = c4790a.f185297e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4790a.f185297e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4790a = new C4790a(eVar);
                    }
                } else {
                    c4790a = new C4790a(eVar);
                }
                Object obj2 = c4790a.f185296d;
                Object objE = uq.b.e();
                int i16 = c4790a.f185297e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f185294a;
                    sx1.e.a aVarU9 = this.f185295b.U9((sx1.d) obj);
                    c4790a.f185298f = vq.j.a(obj);
                    c4790a.f185300h = vq.j.a(c4790a);
                    c4790a.f185301j = vq.j.a(obj);
                    c4790a.f185302k = vq.j.a(hVar);
                    c4790a.f185303l = 0;
                    c4790a.f185297e = 1;
                    if (hVar.F(aVarU9, c4790a) == objE) {
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

        public d(mu.g gVar, c0 c0Var) {
            this.f185292a = gVar;
            this.f185293b = c0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super sx1.e.a> hVar, tq.e eVar) {
            Object objA = this.f185292a.a(new a(hVar, this.f185293b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsx1/d$n;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.p<k10.c0<sx1.d.VerifyCert>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f185305f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185306g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ kk0.g f185307h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c0 f185308j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f185309a;

            static {
                int[] iArr = new int[jk0.l.values().length];
                try {
                    iArr[jk0.l.VALID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[jk0.l.REVOKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[jk0.l.INVALID.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f185309a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(kk0.g gVar, c0 c0Var, tq.e<? super d0> eVar) {
            super(2, eVar);
            this.f185307h = gVar;
            this.f185308j = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error Y(k10.c0 c0Var, c0 c0Var2, dx.b bVar, sx1.d.VerifyCert verifyCert) {
            return new sx1.d.Error(((sx1.d.VerifyCert) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0Var2.P9(bVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.PrepareSign Z(k10.c0 c0Var, sx1.d.VerifyCert verifyCert) {
            return new sx1.d.PrepareSign(sx1.d.FormData.b(((sx1.d.VerifyCert) c0Var.a()).getFormData(), null, null, null, null, null, null, null, null, false, 511, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error a0(k10.c0 c0Var, c0 c0Var2, sx1.d.VerifyCert verifyCert) {
            return new sx1.d.Error(((sx1.d.VerifyCert) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, tx1.a.OCSP_STATUS_REVOKED, "DocumentSigning: error during cert verify, ocsp: revoked", null, 4, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error b0(k10.c0 c0Var, c0 c0Var2, sx1.d.VerifyCert verifyCert) {
            return new sx1.d.Error(((sx1.d.VerifyCert) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, tx1.a.OCSP_STATUS_INVALID, "DocumentSigning: error during cert verify, ocsp: invalid", null, 4, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f185306g;
            Object objE = uq.b.e();
            int i15 = this.f185305f;
            if (i15 == 0) {
                oq.u.b(obj);
                kk0.g.Params params = new kk0.g.Params(((sx1.d.VerifyCert) c0Var.a()).getFormData().getAuthorizationCert());
                kk0.g gVar = this.f185307h;
                this.f185306g = c0Var;
                this.f185304e = vq.j.a(params);
                this.f185305f = 1;
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
            final c0 c0Var2 = this.f185308j;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                px.b.y5(c0Var2.remoteLogger, "DocumentSigning: error during cert verify", null, pq.v.q(new px.a.Feature("DocumentSigning"), new px.a.Custom("ErrorCode", "GENERIC_ERROR")), 2, null);
                return c0Var.d(new er.l() { // from class: sx1.d1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.d0.Y(c0Var, c0Var2, bVar, (d.VerifyCert) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            int i16 = a.f185309a[((jk0.l) ((dx.i.Right) iVar).b()).ordinal()];
            if (i16 == 1) {
                return c0Var.d(new er.l() { // from class: sx1.e1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.d0.Z(c0Var, (d.VerifyCert) obj2);
                    }
                });
            }
            if (i16 == 2) {
                return c0Var.d(new er.l() { // from class: sx1.f1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.d0.a0(c0Var, c0Var2, (d.VerifyCert) obj2);
                    }
                });
            }
            if (i16 == 3) {
                return c0Var.d(new er.l() { // from class: sx1.g1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.d0.b0(c0Var, c0Var2, (d.VerifyCert) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sx1.d.VerifyCert> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            return ((d0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d0 d0Var = new d0(this.f185307h, this.f185308j, eVar);
            d0Var.f185306g = obj;
            return d0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsx1/c$r;", "<unused var>", "Lsx1/d;", "Loq/i0;", "<anonymous>", "(Lsx1/c$r;Lsx1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<sx1.c.r, sx1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185310e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(c0 c0Var) {
            c0Var.d9(sx1.c.k.f185241a);
            c0Var.d9(sx1.c.b.f185224a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185310e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sx1.c.j> bVarY1 = c0.this.Y1();
                xw1.c cVar = c0.this.processInterruptDialogMapper;
                Label labelC = c0.this.labelProvider.c(lw1.j0.f120812z);
                er.a aVar = new er.a() { // from class: sx1.d0
                    @Override // er.a
                    public final Object a() {
                        return c0.e.V();
                    }
                };
                final c0 c0Var = c0.this;
                sx1.c.j.ShowDialog showDialog = new sx1.c.j.ShowDialog(cVar.b(new xw1.c.Params(labelC, aVar, new er.a() { // from class: sx1.e0
                    @Override // er.a
                    public final Object a() {
                        return c0.e.X(c0Var);
                    }
                })));
                this.f185310e = 1;
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
        public final Object w(sx1.c.r rVar, sx1.d dVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsx1/d$h;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.p<k10.c0<sx1.d.PrepareSign>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f185313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f185314g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f185315h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f185316j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f185317k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f185318l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f185319m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f185320n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f185321p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f185322q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f185323r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f185324s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ iy.a f185326v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ lx1.c f185327w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(iy.a aVar, lx1.c cVar, tq.e<? super e0> eVar) {
            super(2, eVar);
            this.f185326v = aVar;
            this.f185327w = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error V(k10.c0 c0Var, c0 c0Var2, lx1.c.b bVar, sx1.d.PrepareSign prepareSign) {
            Object error;
            sx1.d.FormData formData = ((sx1.d.PrepareSign) c0Var.a()).getFormData();
            hb4.d dVar = c0Var2.errorVMSFactory;
            tx1.a aVar = bVar instanceof lx1.c.b.EncryptedFile ? tx1.a.ENCRYPTED_FILE : tx1.a.GENERIC_ERROR;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("DocumentSigning: error during sign preparation ");
            if (bVar == null || (error = bVar.getError()) == null) {
                error = "";
            }
            sb5.append(error);
            return new sx1.d.Error(formData, dVar.a(c0Var2.S9(aVar, sb5.toString(), bVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.SignWithIdCard X(k10.c0 c0Var, kx1.a aVar, sx1.d.PrepareSign prepareSign) {
            return new sx1.d.SignWithIdCard(sx1.d.FormData.b(((sx1.d.PrepareSign) c0Var.a()).getFormData(), null, null, null, null, null, aVar, null, null, false, 479, null), null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v5 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            dx.i left;
            ex.b bVar;
            final k10.c0 c0Var = (k10.c0) this.f185324s;
            Object objE = uq.b.e();
            ?? r15 = this.f185323r;
            try {
                try {
                    if (r15 == 0) {
                        oq.u.b(obj);
                        c0 c0Var2 = c0.this;
                        iy.a aVar = this.f185326v;
                        lx1.c cVar = this.f185327w;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            OffsetDateTime offsetDateTimeA = c0Var2.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                            lx1.c.Params params = new lx1.c.Params(((sx1.d.PrepareSign) c0Var.a()).getFormData().getFileBytes(), (byte[]) aVar2.a(iy.a.c(aVar, iy.c0.e(((sx1.d.PrepareSign) c0Var.a()).getFormData().getAuthorizationCert()), null, 2, null)), offsetDateTimeA.toInstant());
                            this.f185324s = c0Var;
                            this.f185312e = jVarA;
                            this.f185313f = vq.j.a(aVar2);
                            this.f185314g = vq.j.a(aVar2);
                            this.f185315h = vq.j.a(offsetDateTimeA);
                            this.f185316j = vq.j.a(params);
                            this.f185317k = aVar2;
                            this.f185318l = 0;
                            this.f185319m = 0;
                            this.f185320n = 0;
                            this.f185321p = 0;
                            this.f185322q = 0;
                            this.f185323r = 1;
                            obj = cVar.f(params, this);
                            if (obj == objE) {
                                return objE;
                            }
                            bVar = aVar2;
                        } catch (ex.c e15) {
                            e = e15;
                            left = new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            dx.i iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            left = new dx.i.Left(objB);
                        }
                    } else {
                        if (r15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) this.f185317k;
                        try {
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            left = new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    left = new dx.i.Right((kx1.a) bVar.a((dx.i) obj));
                } catch (Exception e25) {
                    e = e25;
                }
                final c0 c0Var3 = c0.this;
                if (left instanceof dx.i.Left) {
                    Throwable thO9 = c0Var3.O9((dx.b) ((dx.i.Left) left).b());
                    final lx1.c.b bVar2 = thO9 instanceof lx1.c.b ? (lx1.c.b) thO9 : null;
                    return c0Var.d(new er.l() { // from class: sx1.h1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return c0.e0.V(c0Var, c0Var3, bVar2, (d.PrepareSign) obj2);
                        }
                    });
                }
                if (!(left instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final kx1.a aVar3 = (kx1.a) ((dx.i.Right) left).b();
                return c0Var.d(new er.l() { // from class: sx1.i1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.e0.X(c0Var, aVar3, (d.PrepareSign) obj2);
                    }
                });
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sx1.d.PrepareSign> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            return ((e0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e0 e0Var = c0.this.new e0(this.f185326v, this.f185327w, eVar);
            e0Var.f185324s = obj;
            return e0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsx1/c$b;", "<unused var>", "Lsx1/d;", "Loq/i0;", "<anonymous>", "(Lsx1/c$b;Lsx1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sx1.c.b, sx1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185328e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185328e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0.this.d9(sx1.c.k.f185241a);
                xw.b<sx1.c.j> bVarY1 = c0.this.Y1();
                sx1.c.j.b bVar = sx1.c.j.b.f185233a;
                this.f185328e = 1;
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
        public final Object w(sx1.c.b bVar, sx1.d dVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsx1/d$m;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.p<k10.c0<sx1.d.SignWithIdCard>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f185331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185332g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f185334j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(ic4.b bVar, tq.e<? super f0> eVar) {
            super(2, eVar);
            this.f185334j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error O(k10.c0 c0Var, c0 c0Var2, sx1.d.SignWithIdCard signWithIdCard) {
            return new sx1.d.Error(((sx1.d.SignWithIdCard) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, tx1.a.GENERIC_ERROR, "DocumentSigning: error during document signing init", null, 4, null)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
        
            if (r12 == r1) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f185332g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f185331f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L27
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                java.lang.Object r1 = r11.f185330e
                cy.b$a$b r1 = (cy.b.a.AuthorizationSign) r1
                oq.u.b(r12)
                goto L95
            L1b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L23:
                oq.u.b(r12)
                goto L3d
            L27:
                oq.u.b(r12)
                sx1.c0 r12 = sx1.c0.this
                ac4.k r12 = sx1.c0.F9(r12)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r11.f185332g = r0
                r11.f185331f = r4
                java.lang.Object r12 = r12.c(r2, r11)
                if (r12 != r1) goto L3d
                goto L94
            L3d:
                cy.b$a$b r4 = new cy.b$a$b
                java.lang.Object r12 = r0.a()
                sx1.d$m r12 = (sx1.d.SignWithIdCard) r12
                sx1.d$e r12 = r12.getFormData()
                kx1.a r12 = r12.getSigningParams()
                if (r12 == 0) goto L55
                java.lang.String r12 = r12.getCmsHashToSignHex()
            L53:
                r5 = r12
                goto L57
            L55:
                r12 = 0
                goto L53
            L57:
                java.lang.Object r12 = r0.a()
                sx1.d$m r12 = (sx1.d.SignWithIdCard) r12
                sx1.d$e r12 = r12.getFormData()
                iy.b0 r12 = r12.getCan()
                java.lang.String r6 = iy.c0.e(r12)
                java.lang.Object r12 = r0.a()
                sx1.d$m r12 = (sx1.d.SignWithIdCard) r12
                sx1.d$e r12 = r12.getFormData()
                iy.b0 r12 = r12.getPin()
                java.lang.String r7 = iy.c0.e(r12)
                r9 = 8
                r10 = 0
                r8 = 0
                r4.<init>(r5, r6, r7, r8, r9, r10)
                ic4.b r12 = r11.f185334j
                r11.f185332g = r0
                java.lang.Object r2 = vq.j.a(r4)
                r11.f185330e = r2
                r11.f185331f = r3
                java.lang.Object r12 = r12.c(r4, r11)
                if (r12 != r1) goto L95
            L94:
                return r1
            L95:
                dx.i r12 = (dx.i) r12
                sx1.c0 r1 = sx1.c0.this
                boolean r2 = r12 instanceof dx.i.Left
                if (r2 == 0) goto Laf
                dx.i$b r12 = (dx.i.Left) r12
                java.lang.Object r12 = r12.b()
                dx.b r12 = (dx.b) r12
                sx1.j1 r12 = new sx1.j1
                r12.<init>()
                k10.l r12 = r0.d(r12)
                return r12
            Laf:
                boolean r1 = r12 instanceof dx.i.Right
                if (r1 == 0) goto Lc0
                dx.i$c r12 = (dx.i.Right) r12
                java.lang.Object r12 = r12.b()
                oq.i0 r12 = (oq.i0) r12
                k10.l r12 = r0.c()
                return r12
            Lc0:
                oq.p r12 = new oq.p
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: sx1.c0.f0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sx1.d.SignWithIdCard> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            return ((f0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f0 f0Var = c0.this.new f0(this.f185334j, eVar);
            f0Var.f185332g = obj;
            return f0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsx1/c$a;", "<unused var>", "Lsx1/d;", "Loq/i0;", "<anonymous>", "(Lsx1/c$a;Lsx1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<sx1.c.a, sx1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185335e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185335e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0.this.d9(sx1.c.k.f185241a);
                xw.b<sx1.c.j> bVarY1 = c0.this.Y1();
                sx1.c.j.a aVar = sx1.c.j.a.f185232a;
                this.f185335e = 1;
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
        public final Object w(sx1.c.a aVar, sx1.d dVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lsx1/d$m;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.q<cy.c, k10.c0<sx1.d.SignWithIdCard>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185339g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k10.z<sx1.d.SignWithIdCard, sx1.d, sx1.c> f185341j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(k10.z<sx1.d.SignWithIdCard, sx1.d, sx1.c> zVar, tq.e<? super g0> eVar) {
            super(3, eVar);
            this.f185341j = zVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error Z(k10.c0 c0Var, c0 c0Var2, tx1.a aVar, cy.c cVar, sx1.d.SignWithIdCard signWithIdCard) {
            sx1.d.FormData formData = ((sx1.d.SignWithIdCard) c0Var.a()).getFormData();
            hb4.d dVar = c0Var2.errorVMSFactory;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("DocumentSigning: error during document signing, code: ");
            cy.c.Error error = (cy.c.Error) cVar;
            sb5.append(error.getCode());
            sb5.append(", content: ");
            sb5.append(error.getContent());
            return new sx1.d.Error(formData, dVar.a(c0.T9(c0Var2, aVar, sb5.toString(), null, 4, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.SignWithIdCard a0(cy.c cVar, sx1.d.SignWithIdCard signWithIdCard) {
            return sx1.d.SignWithIdCard.c(signWithIdCard, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.FinishSigning b0(cy.c cVar, sx1.d.SignWithIdCard signWithIdCard) {
            return new sx1.d.FinishSigning(sx1.d.FormData.b(signWithIdCard.getFormData(), null, null, null, null, null, null, ((cy.c.Finished) cVar).getSignedDataBase64(), null, false, 447, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.SignWithIdCard c0(cy.c cVar, sx1.d.SignWithIdCard signWithIdCard) {
            return sx1.d.SignWithIdCard.c(signWithIdCard, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error d0(k10.c0 c0Var, c0 c0Var2, cy.c cVar, sx1.d.SignWithIdCard signWithIdCard) {
            cy.c.InvalidPinOrPukError invalidPinOrPukError = (cy.c.InvalidPinOrPukError) cVar;
            return new sx1.d.Error(((sx1.d.SignWithIdCard) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, c0Var2.ka(ic4.a.INSTANCE.a(invalidPinOrPukError.getCode()), Integer.valueOf(invalidPinOrPukError.getTriesLeft())), "DocumentSigning: error during document signing, code: " + invalidPinOrPukError.getCode() + ", content: " + invalidPinOrPukError.getContent(), null, 4, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy.c cVar = (cy.c) this.f185338f;
            final k10.c0 c0Var = (k10.c0) this.f185339g;
            uq.b.e();
            if (this.f185337e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (cVar instanceof cy.c.Error) {
                final tx1.a aVarR9 = c0.this.R9((cy.c.Error) cVar);
                if (aVarR9 != null) {
                    final c0 c0Var2 = c0.this;
                    k10.l lVarD = c0Var.d(new er.l() { // from class: sx1.k1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return c0.g0.Z(c0Var, c0Var2, aVarR9, cVar, (d.SignWithIdCard) obj2);
                        }
                    });
                    if (lVarD != null) {
                        return lVarD;
                    }
                }
                return c0Var.b(new er.l() { // from class: sx1.l1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.g0.a0(cVar, (d.SignWithIdCard) obj2);
                    }
                });
            }
            if (cVar instanceof cy.c.Finished) {
                return c0Var.d(new er.l() { // from class: sx1.m1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.g0.b0(cVar, (d.SignWithIdCard) obj2);
                    }
                });
            }
            if ((cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
                return c0Var.b(new er.l() { // from class: sx1.n1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.g0.c0(cVar, (d.SignWithIdCard) obj2);
                    }
                });
            }
            if (!(cVar instanceof cy.c.InvalidPinOrPukError)) {
                throw new oq.p();
            }
            final c0 c0Var3 = c0.this;
            return c0Var.d(new er.l() { // from class: sx1.o1
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.g0.d0(c0Var, c0Var3, cVar, (d.SignWithIdCard) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<sx1.d.SignWithIdCard> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            g0 g0Var = c0.this.new g0(this.f185341j, eVar);
            g0Var.f185338f = cVar;
            g0Var.f185339g = c0Var;
            return g0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsx1/c$p;", "<unused var>", "Lsx1/d;", "Loq/i0;", "<anonymous>", "(Lsx1/c$p;Lsx1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sx1.c.p, sx1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185342e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185342e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0.this.d9(sx1.c.k.f185241a);
                xw.b<sx1.c.j> bVarY1 = c0.this.Y1();
                sx1.c.j.h hVar = sx1.c.j.h.f185239a;
                this.f185342e = 1;
                if (bVarY1.F(hVar, this) == objE) {
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
        public final Object w(sx1.c.p pVar, sx1.d dVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsx1/d$d;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.p<k10.c0<sx1.d.FinishSigning>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f185345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f185346g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f185347h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f185348j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f185349k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f185350l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f185351m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f185352n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f185353p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f185354q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f185355r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ iy.a f185356s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ lx1.a f185357t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ c0 f185358v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(iy.a aVar, lx1.a aVar2, c0 c0Var, tq.e<? super h0> eVar) {
            super(2, eVar);
            this.f185356s = aVar;
            this.f185357t = aVar2;
            this.f185358v = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error V(k10.c0 c0Var, c0 c0Var2, Throwable th4, sx1.d.FinishSigning finishSigning) {
            sx1.d.FormData formData = ((sx1.d.FinishSigning) c0Var.a()).getFormData();
            hb4.d dVar = c0Var2.errorVMSFactory;
            tx1.a aVar = tx1.a.GENERIC_ERROR;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("DocumentSigning: error during document signing finalisation ");
            sb5.append(th4 != null ? th4 : "");
            return new sx1.d.Error(formData, dVar.a(c0Var2.S9(aVar, sb5.toString(), th4)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.SavingFile X(byte[] bArr, sx1.d.FinishSigning finishSigning) {
            return new sx1.d.SavingFile(sx1.d.FormData.b(finishSigning.getFormData(), null, null, null, bArr, null, null, null, null, false, 503, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v5 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            dx.i left;
            ex.b bVar;
            final k10.c0 c0Var = (k10.c0) this.f185355r;
            Object objE = uq.b.e();
            ?? r15 = this.f185354q;
            try {
                try {
                    if (r15 == 0) {
                        oq.u.b(obj);
                        iy.a aVar = this.f185356s;
                        lx1.a aVar2 = this.f185357t;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar3 = new ex.a();
                            lx1.a.Params params = new lx1.a.Params(((sx1.d.FinishSigning) c0Var.a()).getFormData().getSigningParams(), (byte[]) aVar3.a(iy.a.c(aVar, ((sx1.d.FinishSigning) c0Var.a()).getFormData().getSignedData(), null, 2, null)));
                            this.f185355r = c0Var;
                            this.f185344e = jVarA;
                            this.f185345f = vq.j.a(aVar3);
                            this.f185346g = vq.j.a(aVar3);
                            this.f185347h = vq.j.a(params);
                            this.f185348j = aVar3;
                            this.f185349k = 0;
                            this.f185350l = 0;
                            this.f185351m = 0;
                            this.f185352n = 0;
                            this.f185353p = 0;
                            this.f185354q = 1;
                            obj = aVar2.e(params, this);
                            if (obj == objE) {
                                return objE;
                            }
                            bVar = aVar3;
                        } catch (ex.c e15) {
                            e = e15;
                            left = new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            dx.i iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            left = new dx.i.Left(objB);
                        }
                    } else {
                        if (r15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) this.f185348j;
                        try {
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            left = new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    left = new dx.i.Right((byte[]) bVar.a((dx.i) obj));
                } catch (Exception e25) {
                    e = e25;
                }
                final c0 c0Var2 = this.f185358v;
                if (left instanceof dx.i.Left) {
                    final Throwable thO9 = c0Var2.O9((dx.b) ((dx.i.Left) left).b());
                    return c0Var.d(new er.l() { // from class: sx1.p1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return c0.h0.V(c0Var, c0Var2, thO9, (d.FinishSigning) obj2);
                        }
                    });
                }
                if (!(left instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final byte[] bArr = (byte[]) ((dx.i.Right) left).b();
                return c0Var.d(new er.l() { // from class: sx1.q1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.h0.X(bArr, (d.FinishSigning) obj2);
                    }
                });
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sx1.d.FinishSigning> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            return ((h0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h0 h0Var = new h0(this.f185356s, this.f185357t, this.f185358v, eVar);
            h0Var.f185355r = obj;
            return h0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsx1/c$i;", "<unused var>", "Lsx1/d;", "Loq/i0;", "<anonymous>", "(Lsx1/c$i;Lsx1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<sx1.c.i, sx1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185359e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185359e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0.this.d9(sx1.c.k.f185241a);
                xw.b<sx1.c.j> bVarY1 = c0.this.Y1();
                sx1.c.j.g gVar = sx1.c.j.g.f185238a;
                this.f185359e = 1;
                if (bVarY1.F(gVar, this) == objE) {
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
        public final Object w(sx1.c.i iVar, sx1.d dVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsx1/c$e;", "<unused var>", "Lsx1/d;", "Loq/i0;", "<anonymous>", "(Lsx1/c$e;Lsx1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sx1.c.e, sx1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185361e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185361e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0.this.d9(sx1.c.k.f185241a);
                xw.b<sx1.c.j> bVarY1 = c0.this.Y1();
                sx1.c.j.e eVar = sx1.c.j.e.f185236a;
                this.f185361e = 1;
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
        public final Object w(sx1.c.e eVar, sx1.d dVar, tq.e<? super oq.i0> eVar2) {
            return c0.this.new j(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsx1/c$d;", "<unused var>", "Lsx1/d;", "Loq/i0;", "<anonymous>", "(Lsx1/c$d;Lsx1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<sx1.c.d, sx1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185363e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185363e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0.this.d9(sx1.c.k.f185241a);
                xw.b<sx1.c.j> bVarY1 = c0.this.Y1();
                sx1.c.j.d dVar = sx1.c.j.d.f185235a;
                this.f185363e = 1;
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
        public final Object w(sx1.c.d dVar, sx1.d dVar2, tq.e<? super oq.i0> eVar) {
            return c0.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsx1/c$f;", "<unused var>", "Lsx1/d;", "Loq/i0;", "<anonymous>", "(Lsx1/c$f;Lsx1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<sx1.c.f, sx1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185365e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185365e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0.this.d9(sx1.c.k.f185241a);
                xw.b<sx1.c.j> bVarY1 = c0.this.Y1();
                sx1.c.j.f fVar = sx1.c.j.f.f185237a;
                this.f185365e = 1;
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
        public final Object w(sx1.c.f fVar, sx1.d dVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsx1/c$c;", "<unused var>", "Lsx1/d;", "Loq/i0;", "<anonymous>", "(Lsx1/c$c;Lsx1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<sx1.c.C4785c, sx1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185367e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185367e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0.this.d9(sx1.c.k.f185241a);
                xw.b<sx1.c.j> bVarY1 = c0.this.Y1();
                sx1.c.j.C4786c c4786c = sx1.c.j.C4786c.f185234a;
                this.f185367e = 1;
                if (bVarY1.F(c4786c, this) == objE) {
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
        public final Object w(sx1.c.C4785c c4785c, sx1.d dVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsx1/c$k;", "<unused var>", "Lsx1/d;", "Loq/i0;", "<anonymous>", "(Lsx1/c$k;Lsx1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<sx1.c.k, sx1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185369e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185369e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.k kVar = c0.this.nfcDisableReadingUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f185369e = 1;
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
        public final Object w(sx1.c.k kVar, sx1.d dVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsx1/d$k;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.p<k10.c0<sx1.d.SavingFile>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f185372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f185373g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f185374h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f185375j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f185376k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f185377l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ lx1.b f185378m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ c0 f185379n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(lx1.b bVar, c0 c0Var, tq.e<? super o> eVar) {
            super(2, eVar);
            this.f185378m = bVar;
            this.f185379n = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error X(k10.c0 c0Var, c0 c0Var2, Throwable th4, sx1.d.SavingFile savingFile) {
            sx1.d.FormData formData = ((sx1.d.SavingFile) c0Var.a()).getFormData();
            hb4.d dVar = c0Var2.errorVMSFactory;
            tx1.a aVar = tx1.a.GENERIC_ERROR;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("DocumentSigning: error during saving document ");
            sb5.append(th4 != null ? th4 : "");
            return new sx1.d.Error(formData, dVar.a(c0Var2.S9(aVar, sb5.toString(), th4)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.SaveUserActivity Y(lx1.b.InterfaceC2959b interfaceC2959b, sx1.d.SavingFile savingFile) {
            return new sx1.d.SaveUserActivity(sx1.d.FormData.b(savingFile.getFormData(), null, null, null, null, null, null, null, ((lx1.b.InterfaceC2959b.FileSaved) interfaceC2959b).getFileUri(), false, 383, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error Z(k10.c0 c0Var, c0 c0Var2, sx1.d.SavingFile savingFile) {
            return new sx1.d.Error(((sx1.d.SavingFile) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, tx1.a.NO_SPACE_ON_DEVICE, "DocumentSigning: error, no space on device", null, 4, null)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ed, code lost:
        
            if (r6.F(r7, r12) == r1) goto L27;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sx1.c0.o.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sx1.d.SavingFile> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            return ((o) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            o oVar = new o(this.f185378m, this.f185379n, eVar);
            oVar.f185377l = obj;
            return oVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsx1/c$g;", "<unused var>", "Lk10/c0;", "Lsx1/d$k;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lsx1/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<sx1.c.g, k10.c0<sx1.d.SavingFile>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185381f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.MissingStoragePermission O(sx1.d.SavingFile savingFile) {
            return new sx1.d.MissingStoragePermission(false, sx1.d.FormData.b(savingFile.getFormData(), null, null, null, null, null, null, null, null, false, 511, null), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185381f;
            uq.b.e();
            if (this.f185380e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sx1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.p.O((d.SavingFile) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sx1.c.g gVar, k10.c0<sx1.d.SavingFile> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            p pVar = new p(eVar);
            pVar.f185381f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsx1/c$h;", "<unused var>", "Lk10/c0;", "Lsx1/d$k;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lsx1/c$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<sx1.c.h, k10.c0<sx1.d.SavingFile>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185383f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error O(k10.c0 c0Var, c0 c0Var2, sx1.d.SavingFile savingFile) {
            return new sx1.d.Error(((sx1.d.SavingFile) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, tx1.a.MISSING_STORAGE_PERMISSION, "DocumentSigning: error during saving document - StoragePermissionError", null, 4, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f185383f;
            uq.b.e();
            if (this.f185382e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final c0 c0Var2 = c0.this;
            return c0Var.d(new er.l() { // from class: sx1.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.q.O(c0Var, c0Var2, (d.SavingFile) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sx1.c.h hVar, k10.c0<sx1.d.SavingFile> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            q qVar = c0.this.new q(eVar);
            qVar.f185383f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsx1/d$f;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.p<k10.c0<sx1.d.MissingStoragePermission>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a14.m f185387g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ c0 f185388h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(a14.m mVar, c0 c0Var, tq.e<? super r> eVar) {
            super(2, eVar);
            this.f185387g = mVar;
            this.f185388h = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error O(k10.c0 c0Var, c0 c0Var2, sx1.d.MissingStoragePermission missingStoragePermission) {
            return new sx1.d.Error(((sx1.d.MissingStoragePermission) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, tx1.a.GENERIC_ERROR, "DocumentSigning: error nav to settings", null, 4, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f185386f;
            uq.b.e();
            if (this.f185385e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = this.f185387g.a(gz.b.a.C1792a.f78542a);
            final c0 c0Var2 = this.f185388h;
            if (iVarA instanceof dx.i.Left) {
                return c0Var.d(new er.l() { // from class: sx1.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.r.O(c0Var, c0Var2, (d.MissingStoragePermission) obj2);
                    }
                });
            }
            if (!(iVarA instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sx1.d.MissingStoragePermission> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            return ((r) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            r rVar = new r(this.f185387g, this.f185388h, eVar);
            rVar.f185386f = obj;
            return rVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsx1/c$m;", "<unused var>", "Lk10/c0;", "Lsx1/d$f;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lsx1/c$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<sx1.c.m, k10.c0<sx1.d.MissingStoragePermission>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185390f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.SavingFile O(sx1.d.MissingStoragePermission missingStoragePermission) {
            return new sx1.d.SavingFile(sx1.d.FormData.b(missingStoragePermission.getFormData(), null, null, null, null, null, null, null, null, false, 511, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185390f;
            uq.b.e();
            if (this.f185389e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return ((sx1.d.MissingStoragePermission) c0Var.a()).getRedirectedToSettings() ? c0Var.d(new er.l() { // from class: sx1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.s.O((d.MissingStoragePermission) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sx1.c.m mVar, k10.c0<sx1.d.MissingStoragePermission> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            s sVar = new s(eVar);
            sVar.f185390f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsx1/c$l;", "<unused var>", "Lk10/c0;", "Lsx1/d$f;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lsx1/c$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<sx1.c.l, k10.c0<sx1.d.MissingStoragePermission>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185392f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.MissingStoragePermission O(sx1.d.MissingStoragePermission missingStoragePermission) {
            return sx1.d.MissingStoragePermission.c(missingStoragePermission, true, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185392f;
            uq.b.e();
            if (this.f185391e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sx1.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.t.O((d.MissingStoragePermission) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sx1.c.l lVar, k10.c0<sx1.d.MissingStoragePermission> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            t tVar = new t(eVar);
            tVar.f185392f = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsx1/d$j;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.p<k10.c0<sx1.d.SaveUserActivity>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f185394f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185395g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ z92.f f185396h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(z92.f fVar, tq.e<? super u> eVar) {
            super(2, eVar);
            this.f185396h = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.SignSuccess V(sx1.d.SaveUserActivity saveUserActivity) {
            return new sx1.d.SignSuccess(sx1.d.FormData.b(saveUserActivity.getFormData(), null, null, null, null, null, null, null, null, false, 511, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.SignSuccess X(sx1.d.SaveUserActivity saveUserActivity) {
            return new sx1.d.SignSuccess(sx1.d.FormData.b(saveUserActivity.getFormData(), null, null, null, null, null, null, null, null, false, 511, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185395g;
            Object objE = uq.b.e();
            int i15 = this.f185394f;
            if (i15 == 0) {
                oq.u.b(obj);
                z92.f.Params params = new z92.f.Params(y92.g.SIGNED_DOCUMENT);
                z92.f fVar = this.f185396h;
                this.f185395g = c0Var;
                this.f185393e = vq.j.a(params);
                this.f185394f = 1;
                obj = fVar.c(params, this);
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
            if (iVar instanceof dx.i.Left) {
                return c0Var.d(new er.l() { // from class: sx1.n0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.u.V((d.SaveUserActivity) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.d(new er.l() { // from class: sx1.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.u.X((d.SaveUserActivity) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sx1.d.SaveUserActivity> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            return ((u) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            u uVar = new u(this.f185396h, eVar);
            uVar.f185395g = obj;
            return uVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsx1/c$n;", "<unused var>", "Lk10/c0;", "Lsx1/d$l;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lsx1/c$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<sx1.c.n, k10.c0<sx1.d.SignSuccess>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f185398f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f185399g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f185400h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f185401j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ ac4.n f185402k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ c0 f185403l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(ac4.n nVar, c0 c0Var, tq.e<? super v> eVar) {
            super(3, eVar);
            this.f185402k = nVar;
            this.f185403l = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error O(k10.c0 c0Var, c0 c0Var2, sx1.d.SignSuccess signSuccess) {
            return new sx1.d.Error(((sx1.d.SignSuccess) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, tx1.a.GENERIC_ERROR, "DocumentSigning: error opening PDF file from Uri", null, 4, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var;
            k10.l lVarC;
            final k10.c0 c0Var2 = (k10.c0) this.f185401j;
            Object objE = uq.b.e();
            int i15 = this.f185400h;
            if (i15 == 0) {
                oq.u.b(obj);
                String signedFileUri = ((sx1.d.SignSuccess) c0Var2.a()).getFormData().getSignedFileUri();
                if (signedFileUri != null) {
                    ac4.n nVar = this.f185402k;
                    c0 c0Var3 = this.f185403l;
                    ac4.n.Params params = new ac4.n.Params(signedFileUri);
                    this.f185401j = c0Var2;
                    this.f185397e = c0Var3;
                    this.f185398f = vq.j.a(signedFileUri);
                    this.f185399g = 0;
                    this.f185400h = 1;
                    obj = nVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                    c0Var = c0Var3;
                }
                return c0Var2.c();
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) this.f185397e;
            oq.u.b(obj);
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                lVarC = c0Var2.d(new er.l() { // from class: sx1.p0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.v.O(c0Var2, c0Var, (d.SignSuccess) obj2);
                    }
                });
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                lVarC = c0Var2.c();
            }
            if (lVarC != null) {
                return lVarC;
            }
            return c0Var2.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sx1.c.n nVar, k10.c0<sx1.d.SignSuccess> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            v vVar = new v(this.f185402k, this.f185403l, eVar);
            vVar.f185401j = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsx1/c$q;", "<unused var>", "Lk10/c0;", "Lsx1/d$l;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lsx1/c$q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<sx1.c.q, k10.c0<sx1.d.SignSuccess>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f185405f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f185406g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f185407h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f185408j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ a14.c0 f185409k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ c0 f185410l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(a14.c0 c0Var, c0 c0Var2, tq.e<? super w> eVar) {
            super(3, eVar);
            this.f185409k = c0Var;
            this.f185410l = c0Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error O(k10.c0 c0Var, c0 c0Var2, sx1.d.SignSuccess signSuccess) {
            return new sx1.d.Error(((sx1.d.SignSuccess) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0.T9(c0Var2, tx1.a.GENERIC_ERROR, "DocumentSigning: error while sharing file", null, 4, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var;
            k10.l lVarC;
            final k10.c0 c0Var2 = (k10.c0) this.f185408j;
            Object objE = uq.b.e();
            int i15 = this.f185407h;
            if (i15 == 0) {
                oq.u.b(obj);
                String signedFileUri = ((sx1.d.SignSuccess) c0Var2.a()).getFormData().getSignedFileUri();
                if (signedFileUri != null) {
                    a14.c0 c0Var3 = this.f185409k;
                    c0 c0Var4 = this.f185410l;
                    a14.c0.Params params = new a14.c0.Params(signedFileUri);
                    this.f185408j = c0Var2;
                    this.f185404e = c0Var4;
                    this.f185405f = vq.j.a(signedFileUri);
                    this.f185406g = 0;
                    this.f185407h = 1;
                    obj = c0Var3.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                    c0Var = c0Var4;
                }
                return c0Var2.c();
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) this.f185404e;
            oq.u.b(obj);
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                lVarC = c0Var2.d(new er.l() { // from class: sx1.q0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.w.O(c0Var2, c0Var, (d.SignSuccess) obj2);
                    }
                });
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                lVarC = c0Var2.c();
            }
            if (lVarC != null) {
                return lVarC;
            }
            return c0Var2.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sx1.c.q qVar, k10.c0<sx1.d.SignSuccess> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            w wVar = new w(this.f185409k, this.f185410l, eVar);
            wVar.f185408j = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsx1/d$g;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.p<k10.c0<sx1.d.PreSetup>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185412f;

        x(tq.e<? super x> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.CheckNfc O(c0 c0Var, sx1.d.PreSetup preSetup) {
            return new sx1.d.CheckNfc(sx1.d.FormData.b(preSetup.getFormData(), c0Var.setupContract.I3().getPin(), c0Var.setupContract.I3().getCan(), null, c0Var.setupContract.I3().getSelectedFileBytes(), c0Var.setupContract.I3().getSelectedFileName(), null, null, null, false, 484, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185412f;
            uq.b.e();
            if (this.f185411e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final c0 c0Var2 = c0.this;
            return c0Var.d(new er.l() { // from class: sx1.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.x.O(c0Var2, (d.PreSetup) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sx1.d.PreSetup> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            return ((x) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            x xVar = c0.this.new x(eVar);
            xVar.f185412f = obj;
            return xVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsx1/d$a;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.p<k10.c0<sx1.d.CheckNfc>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185415f;

        y(tq.e<? super y> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.ReadCert O(sx1.d.CheckNfc checkNfc) {
            return new sx1.d.ReadCert(checkNfc.getFormData(), null, 2, null);
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
                java.lang.Object r0 = r9.f185415f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r9.f185414e
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
                sx1.c0 r10 = sx1.c0.this
                ac4.b r10 = sx1.c0.y9(r10)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r9.f185415f = r0
                r9.f185414e = r4
                java.lang.Object r10 = r10.c(r2, r9)
                if (r10 != r1) goto L38
                goto L88
            L38:
                ac4.b$a r10 = (ac4.b.a) r10
                ac4.b$a$b r2 = ac4.b.a.C0108b.f5391a
                boolean r2 = fr.t.c(r10, r2)
                if (r2 == 0) goto L4c
                sx1.s0 r10 = new sx1.s0
                r10.<init>()
                k10.l r10 = r0.d(r10)
                return r10
            L4c:
                ac4.b$a$a r2 = ac4.b.a.C0107a.f5390a
                boolean r10 = fr.t.c(r10, r2)
                if (r10 == 0) goto L8e
                sx1.c0 r10 = sx1.c0.this
                xw.b r10 = r10.Y1()
                sx1.c$j$i r2 = new sx1.c$j$i
                sx1.c0 r4 = sx1.c0.this
                xw1.b r4 = sx1.c0.z9(r4)
                xw1.b$a r5 = new xw1.b$a
                sx1.c0 r6 = sx1.c0.this
                sx1.c$o r7 = sx1.c.o.f185245a
                er.a r6 = sx1.c0.v9(r6, r7)
                sx1.c0 r7 = sx1.c0.this
                sx1.c$a r8 = sx1.c.a.f185223a
                er.a r7 = sx1.c0.v9(r7, r8)
                r5.<init>(r6, r7)
                cb4.d r4 = r4.b(r5)
                r2.<init>(r4)
                r9.f185415f = r0
                r9.f185414e = r3
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
            throw new UnsupportedOperationException("Method not decompiled: sx1.c0.y.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sx1.d.CheckNfc> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            return ((y) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            y yVar = c0.this.new y(eVar);
            yVar.f185415f = obj;
            return yVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsx1/c$o;", "<unused var>", "Lk10/c0;", "Lsx1/d$a;", "state", "Lk10/l;", "Lsx1/d;", "<anonymous>", "(Lsx1/c$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<sx1.c.o, k10.c0<sx1.d.CheckNfc>, tq.e<? super k10.l<? extends sx1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185418f;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sx1.d.Error O(k10.c0 c0Var, c0 c0Var2, dx.b.Business business, sx1.d.CheckNfc checkNfc) {
            return new sx1.d.Error(((sx1.d.CheckNfc) c0Var.a()).getFormData(), c0Var2.errorVMSFactory.a(c0Var2.P9(business)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f185418f;
            Object objE = uq.b.e();
            int i15 = this.f185417e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.i iVar = c0.this.goToNfcSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f185418f = c0Var;
                this.f185417e = 1;
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
            final c0 c0Var2 = c0.this;
            if (iVar2 instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVar2).b();
                return c0Var.d(new er.l() { // from class: sx1.t0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.z.O(c0Var, c0Var2, business, (d.CheckNfc) obj2);
                    }
                });
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            c0Var2.d9(sx1.c.a.f185223a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sx1.c.o oVar, k10.c0<sx1.d.CheckNfc> c0Var, tq.e<? super k10.l<? extends sx1.d>> eVar) {
            z zVar = c0.this.new z(eVar);
            zVar.f185418f = c0Var;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public c0(yy.a aVar, oz.q qVar, ux1.m0 m0Var, ib4.c cVar, ux1.d dVar, ux1.j0 j0Var, xw1.c cVar2, px.d dVar2, final rw1.e eVar, final a14.m mVar, final ic4.b bVar, ac4.d dVar3, ac4.k kVar, ac4.b bVar2, ac4.i iVar, xw1.b bVar3, mx.c cVar3, hb4.d dVar4, final ac4.l lVar, final lx1.c cVar4, final lx1.a aVar2, final lx1.b bVar4, final ac4.n nVar, final a14.c0 c0Var, final kk0.g gVar, final z92.f fVar, final iy.a aVar3, jx.g gVar2, sx1.f fVar2) {
        this.ownerViewLifecycleManager = qVar;
        this.mapper = m0Var;
        this.genericDomainErrorMapper = cVar;
        this.documentSigningSignFileDialogMapper = dVar;
        this.documentSigningSignFileErrorMapper = j0Var;
        this.processInterruptDialogMapper = cVar2;
        this.remoteLogger = dVar2;
        this.getCurrentServerTimeUseCase = dVar3;
        this.nfcDisableReadingUseCase = kVar;
        this.checkNFCStatusUseCase = bVar2;
        this.goToNfcSettingsUseCase = iVar;
        this.dialogMapper = bVar3;
        this.labelProvider = cVar3;
        this.errorVMSFactory = dVar4;
        this.setupContract = fVar2;
        sx1.d.PreSetup preSetup = new sx1.d.PreSetup(new sx1.d.FormData(null, null, null, null, null, null, null, null, gVar2.r(), GF2Field.MASK, null));
        this.initialState = preSetup;
        this.lifecycleConnector = qVar;
        ju.k.d(androidx.p016lifecycle.u0.a(this), null, null, new a(null), 3, null);
        this.stateMachine = aVar.a(preSetup, new er.l() { // from class: sx1.s
            @Override // er.l
            public final Object b(Object obj) {
                return c0.W9(this.f185521a, lVar, bVar, eVar, gVar, aVar3, cVar4, aVar2, bVar4, mVar, fVar, nVar, c0Var, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), U9(preSetup));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable O9(dx.b bVar) {
        if (bVar instanceof dx.b.Generic) {
            return ((dx.b.Generic) bVar).getE();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b P9(dx.b error) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: sx1.r
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Q9(this.f185519a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(c0 c0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.AbstractC2161b.a)) {
            c0Var.d9(sx1.c.b.f185224a);
        } else {
            if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
                throw new oq.p();
            }
            c0Var.d9(sx1.c.i.f185231a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tx1.a R9(cy.c.Error error) {
        ic4.a aVarA = ic4.a.INSTANCE.a(error.getCode());
        if (aVarA != ic4.a.INTERRUPTED) {
            return la(this, aVarA, null, 1, null);
        }
        int i15 = c.f185285a[ic4.c.INSTANCE.a(error.getContent()).ordinal()];
        if (i15 == 1 || i15 == 2) {
            return null;
        }
        if (i15 != 3) {
            throw new oq.p();
        }
        d9(sx1.c.k.f185241a);
        return tx1.a.TECHNICAL_ERROR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b S9(tx1.a errorType, String logMessage, Throwable throwable) {
        if (logMessage != null) {
            this.remoteLogger.T6(logMessage, throwable, pq.v.q(new px.a.Feature("DocumentSigning"), new px.a.Custom("ErrorType", errorType.name())));
        }
        return this.documentSigningSignFileErrorMapper.b(new ux1.j0.Params(errorType, b9(sx1.c.i.f185231a), b9(sx1.c.d.f185226a), b9(sx1.c.e.f185227a), b9(sx1.c.f.f185228a), b9(sx1.c.C4785c.f185225a), b9(sx1.c.b.f185224a), b9(sx1.c.p.f185246a)));
    }

    static /* synthetic */ jb4.b T9(c0 c0Var, tx1.a aVar, String str, Throwable th4, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str = null;
        }
        if ((i15 & 4) != 0) {
            th4 = null;
        }
        return c0Var.S9(aVar, str, th4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sx1.e.a U9(sx1.d state) {
        return this.mapper.b(new ux1.m0.Params(state, b9(sx1.c.r.f185248a), b9(sx1.c.a.f185223a), b9(sx1.c.b.f185224a), b9(sx1.c.n.f185244a), b9(sx1.c.q.f185247a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(final c0 c0Var, final ac4.l lVar, final ic4.b bVar, final rw1.e eVar, final kk0.g gVar, final iy.a aVar, final lx1.c cVar, final lx1.a aVar2, final lx1.b bVar2, final a14.m mVar, final z92.f fVar, final ac4.n nVar, final a14.c0 c0Var2, k10.v vVar) {
        vVar.c(fr.q0.c(sx1.d.class), new er.l() { // from class: sx1.n
            @Override // er.l
            public final Object b(Object obj) {
                return c0.X9(this.f185498a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sx1.d.PreSetup.class), new er.l() { // from class: sx1.w
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Y9(this.f185551a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sx1.d.CheckNfc.class), new er.l() { // from class: sx1.x
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ca(this.f185553a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sx1.d.ReadCert.class), new er.l() { // from class: sx1.y
            @Override // er.l
            public final Object b(Object obj) {
                return c0.da(lVar, c0Var, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sx1.d.CompareCertData.class), new er.l() { // from class: sx1.z
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ea(eVar, c0Var, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sx1.d.VerifyCert.class), new er.l() { // from class: sx1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return c0.fa(gVar, c0Var, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sx1.d.PrepareSign.class), new er.l() { // from class: sx1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ga(this.f185219a, aVar, cVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sx1.d.SignWithIdCard.class), new er.l() { // from class: sx1.o
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ha(lVar, c0Var, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sx1.d.FinishSigning.class), new er.l() { // from class: sx1.p
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ia(aVar, aVar2, c0Var, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sx1.d.SavingFile.class), new er.l() { // from class: sx1.q
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ja(bVar2, c0Var, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sx1.d.MissingStoragePermission.class), new er.l() { // from class: sx1.t
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Z9(mVar, c0Var, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sx1.d.SaveUserActivity.class), new er.l() { // from class: sx1.u
            @Override // er.l
            public final Object b(Object obj) {
                return c0.aa(fVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sx1.d.SignSuccess.class), new er.l() { // from class: sx1.v
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ba(nVar, c0Var, c0Var2, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(c0 c0Var, k10.z zVar) {
        f fVar = c0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(sx1.c.b.class), oVar, fVar);
        zVar.x(fr.q0.c(sx1.c.a.class), oVar, c0Var.new g(null));
        zVar.x(fr.q0.c(sx1.c.p.class), oVar, c0Var.new h(null));
        zVar.x(fr.q0.c(sx1.c.i.class), oVar, c0Var.new i(null));
        zVar.x(fr.q0.c(sx1.c.e.class), oVar, c0Var.new j(null));
        zVar.x(fr.q0.c(sx1.c.d.class), oVar, c0Var.new k(null));
        zVar.x(fr.q0.c(sx1.c.f.class), oVar, c0Var.new l(null));
        zVar.x(fr.q0.c(sx1.c.C4785c.class), oVar, c0Var.new m(null));
        zVar.x(fr.q0.c(sx1.c.k.class), oVar, c0Var.new n(null));
        zVar.x(fr.q0.c(sx1.c.r.class), oVar, c0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(c0 c0Var, k10.z zVar) {
        zVar.A(c0Var.new x(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(a14.m mVar, c0 c0Var, k10.z zVar) {
        zVar.A(new r(mVar, c0Var, null));
        s sVar = new s(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(sx1.c.m.class), oVar, sVar);
        zVar.v(fr.q0.c(sx1.c.l.class), oVar, new t(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(z92.f fVar, k10.z zVar) {
        zVar.A(new u(fVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(ac4.n nVar, c0 c0Var, a14.c0 c0Var2, k10.z zVar) {
        v vVar = new v(nVar, c0Var, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(sx1.c.n.class), oVar, vVar);
        zVar.v(fr.q0.c(sx1.c.q.class), oVar, new w(c0Var2, c0Var, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(c0 c0Var, k10.z zVar) {
        zVar.A(c0Var.new y(null));
        z zVar2 = c0Var.new z(null);
        zVar.v(fr.q0.c(sx1.c.o.class), k10.o.CANCEL_PREVIOUS, zVar2);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(ac4.l lVar, c0 c0Var, ic4.b bVar, k10.z zVar) {
        zVar.A(c0Var.new a0(bVar, null));
        k10.k.m(zVar, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, c0Var.new b0(zVar, null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(rw1.e eVar, c0 c0Var, k10.z zVar) {
        zVar.A(new C4789c0(eVar, c0Var, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(kk0.g gVar, c0 c0Var, k10.z zVar) {
        zVar.A(new d0(gVar, c0Var, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(c0 c0Var, iy.a aVar, lx1.c cVar, k10.z zVar) {
        zVar.A(c0Var.new e0(aVar, cVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(ac4.l lVar, c0 c0Var, ic4.b bVar, k10.z zVar) {
        zVar.A(c0Var.new f0(bVar, null));
        k10.k.m(zVar, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, c0Var.new g0(zVar, null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(iy.a aVar, lx1.a aVar2, c0 c0Var, k10.z zVar) {
        zVar.A(new h0(aVar, aVar2, c0Var, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(lx1.b bVar, c0 c0Var, k10.z zVar) {
        zVar.A(new o(bVar, c0Var, null));
        p pVar = new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(sx1.c.g.class), oVar, pVar);
        zVar.v(fr.q0.c(sx1.c.h.class), oVar, c0Var.new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tx1.a ka(ic4.a aVar, Integer num) {
        switch (c.f185286b[aVar.ordinal()]) {
            case 1:
                return tx1.a.WRONG_CAN;
            case 2:
                return tx1.a.PIN_BLOCKED;
            case 3:
                return tx1.a.CERTIFICATE_INACTIVE;
            case 4:
                return tx1.a.CERTIFICATE_MISSING;
            case 5:
                return tx1.a.DATA_MISSING;
            case 6:
                if (num != null && num.intValue() == 1) {
                    return tx1.a.WRONG_PIN_1_TRY_LEFT;
                }
                return (num != null && num.intValue() == 2) ? tx1.a.WRONG_PIN_2_TRIES_LEFT : tx1.a.GENERIC_ERROR;
            default:
                return tx1.a.GENERIC_ERROR;
        }
    }

    static /* synthetic */ tx1.a la(c0 c0Var, ic4.a aVar, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            num = null;
        }
        return c0Var.ka(aVar, num);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: V9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<sx1.c.j> Y1() {
        return this.navAction;
    }

    @Override // sx1.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<sx1.d, sx1.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<sx1.e.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
