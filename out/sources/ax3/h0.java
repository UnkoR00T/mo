package ax3;

import android.graphics.Bitmap;
import fx.Rectangle;
import java.util.concurrent.CancellationException;
import ju.d2;
import ju.g2;
import jw3.MaskDefinition;
import lw3.SetupData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0092\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0093\u0001B£\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\b\b\u0001\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J#\u00103\u001a\u00020.*\u00020.2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J \u00109\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020806*\u000205H\u0082@¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020\u0002H\u0002¢\u0006\u0004\b=\u0010>JU\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020I*\n\u0012\u0006\b\u0001\u0012\u00020\u00020?2\u0006\u0010A\u001a\u00020@2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D0B2\u0016\b\u0002\u0010H\u001a\u0010\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G\u0018\u00010BH\u0002¢\u0006\u0004\bJ\u0010KJ\u0013\u0010N\u001a\u00020M*\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020MH\u0014¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020M2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\bR\u0010SJ\u0018\u0010V\u001a\u00020M2\u0006\u0010U\u001a\u00020TH\u0096\u0001¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020MH\u0096\u0001¢\u0006\u0004\bX\u0010QR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR'\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R+\u0010\u008c\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0088\u00018\u0014X\u0094\u0004¢\u0006\u000f\n\u0005\bV\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R%\u0010;\u001a\t\u0012\u0004\u0012\u00020<0\u008d\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0094\u0001"}, d2 = {"Lax3/h0;", "Ll00/g;", "Lax3/e;", "Lax3/c;", "Lax3/f;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lbx3/i;", "mapper", "Lb00/c;", "imageConverter", "Lac4/a;", "callActionWithLoaderUseCase", "Lqx/a;", "imagePropertiesProvider", "Lbx3/d;", "errorMapper", "Lbc4/l;", "pickPhotoFromGalleryUseCase", "Lbc4/d;", "checkPhotoResolutionUseCase", "Liw3/h;", "validateDetectedFaceUC", "Lyz/d;", "singleFaceDetector", "Lc54/b;", "isFeatureEnabledUseCase", "Lcb4/j;", "dialogVmsFactory", "Lbx3/a;", "verificationDialogMapper", "Lfw3/c;", "scaleFaceDetectorResultToContainerUC", "globalSnackBarManager", "La14/w;", "openUrlIntentUseCase", "Lu04/a;", "commonEndpoints", "Lhb4/d;", "errorVMSFactory", "Lax3/d;", "data", "<init>", "(Lyy/a;Lbx3/i;Lb00/c;Lac4/a;Lqx/a;Lbx3/d;Lbc4/l;Lbc4/d;Liw3/h;Lyz/d;Lc54/b;Lcb4/j;Lbx3/a;Lfw3/c;Li70/e;La14/w;Lu04/a;Lhb4/d;Lax3/d;)V", "Lvx/a;", "Lfx/e;", "container", "Ljw3/c;", "scaleType", "V9", "(Lvx/a;Lfx/e;Ljw3/c;)Lvx/a;", "Lwx/i$a;", "Ldx/i;", "Ldx/b;", "Lax3/e$b$c;", "ha", "(Lwx/i$a;Ltq/e;)Ljava/lang/Object;", "state", "Lax3/f$a;", "R9", "(Lax3/e;)Lax3/f$a;", "Lk10/c0;", "Lbx3/d$a;", "params", "Lkotlin/Function1;", "Lhb4/c;", "Lax3/e$a;", "errorStateProvider", "Lcb4/i;", "Lax3/e$b$a;", "dialogStateProvider", "Lk10/l;", "M9", "(Lk10/c0;Lbx3/d$a;Ler/l;Ler/l;)Lk10/l;", "Lib4/c$b;", "Loq/i0;", "Q9", "(Lib4/c$b;)V", "Y8", "()V", "W9", "(Lax3/d;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "b", "Lbx3/i;", "c", "Lb00/c;", "d", "Lac4/a;", "e", "Lqx/a;", "f", "Lbx3/d;", "g", "Lbc4/l;", "h", "Lbc4/d;", "j", "Liw3/h;", "k", "Lyz/d;", "l", "Lc54/b;", "m", "Lcb4/j;", "n", "Lbx3/a;", "p", "Lfw3/c;", "q", "Li70/e;", "r", "La14/w;", "s", "Lu04/a;", "t", "Lhb4/d;", "v", "Lax3/d;", "Lax3/e$c$b;", "w", "Lax3/e$c$b;", "initialState", "Lxw/b;", "Lax3/c$a;", "x", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "z", "Lmu/p0;", "getState", "()Lmu/p0;", "A", "a", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 extends l00.g<ax3.e, ax3.c> implements ax3.f, zx.d, i70.e {
    private static final a A = new a(null);
    public static final int B = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bx3.i mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final qx.a imagePropertiesProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bx3.d errorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final bc4.l pickPhotoFromGalleryUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final bc4.d checkPhotoResolutionUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final iw3.h validateDetectedFaceUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final yz.d singleFaceDetector;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVmsFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final bx3.a verificationDialogMapper;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final fw3.c scaleFaceDetectorResultToContainerUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final SetupData data;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final ax3.e.c.Loading initialState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ax3.c.a> navAction;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ax3.e, ax3.c> stateMachine;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ax3.f.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lax3/h0$a;", "", "<init>", "()V", "", "CONTAINER_SIZE_MULTIPLIER", "I", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15005e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SetupData f15007g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SetupData setupData, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f15007g = setupData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f15005e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h0.this.d9(new ax3.c.OnSetupData(this.f15007g));
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return h0.this.new b(this.f15007g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<ax3.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f15008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f15009b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f15010a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f15011b;

            /* JADX INFO: renamed from: ax3.h0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0349a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f15012d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f15013e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f15014f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f15016h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f15017j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f15018k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f15019l;

                public C0349a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f15012d = obj;
                    this.f15013e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, h0 h0Var) {
                this.f15010a = hVar;
                this.f15011b = h0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0349a c0349a;
                if (eVar instanceof C0349a) {
                    c0349a = (C0349a) eVar;
                    int i15 = c0349a.f15013e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0349a.f15013e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0349a = new C0349a(eVar);
                    }
                } else {
                    c0349a = new C0349a(eVar);
                }
                Object obj2 = c0349a.f15012d;
                Object objE = uq.b.e();
                int i16 = c0349a.f15013e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f15010a;
                    ax3.f.a aVarR9 = this.f15011b.R9((ax3.e) obj);
                    c0349a.f15014f = vq.j.a(obj);
                    c0349a.f15016h = vq.j.a(c0349a);
                    c0349a.f15017j = vq.j.a(obj);
                    c0349a.f15018k = vq.j.a(hVar);
                    c0349a.f15019l = 0;
                    c0349a.f15013e = 1;
                    if (hVar.F(aVarR9, c0349a) == objE) {
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

        public c(mu.g gVar, h0 h0Var) {
            this.f15008a = gVar;
            this.f15009b = h0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super ax3.f.a> hVar, tq.e eVar) {
            Object objA = this.f15008a.a(new a(hVar, this.f15009b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lax3/c$d;", "<unused var>", "Lax3/e;", "Loq/i0;", "<anonymous>", "(Lax3/c$d;Lax3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ax3.c.d, ax3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15020e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f15020e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ax3.c.a> bVarY1 = h0.this.Y1();
                ax3.c.a.C0340c c0340c = ax3.c.a.C0340c.f14903a;
                this.f15020e = 1;
                if (bVarY1.F(c0340c, this) == objE) {
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
        public final Object w(ax3.c.d dVar, ax3.e eVar, tq.e<? super oq.i0> eVar2) {
            return h0.this.new d(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lax3/c$l;", "action", "Lk10/c0;", "Lax3/e;", "state", "Lk10/l;", "<anonymous>", "(Lax3/c$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ax3.c.OnSetupData, k10.c0<ax3.e>, tq.e<? super k10.l<? extends ax3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f15023f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15024g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f15025h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lax3/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ax3.e>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f15027e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ h0 f15028f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ax3.c.OnSetupData f15029g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<ax3.e> f15030h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ ax3.e f15031j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, ax3.c.OnSetupData onSetupData, k10.c0<ax3.e> c0Var, ax3.e eVar, tq.e<? super a> eVar2) {
                super(1, eVar2);
                this.f15028f = h0Var;
                this.f15029g = onSetupData;
                this.f15030h = c0Var;
                this.f15031j = eVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Y(h0 h0Var, ib4.c.b bVar) {
                h0Var.Q9(bVar);
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ax3.e.a Z(ax3.e eVar, hb4.c cVar) {
                return new ax3.e.b.Error(((ax3.e.b) eVar).getStateData(), cVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ax3.e.b.ProcessingPhoto a0(ax3.e eVar, ax3.e.b.ImageData imageData, ax3.e eVar2) {
                return new ax3.e.b.ProcessingPhoto(ax3.e.b.InitializedStateData.b(((ax3.e.b) eVar).getStateData(), null, null, false, imageData, null, null, null, false, null, 503, null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f15027e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    h0 h0Var = this.f15028f;
                    wx.i.Image image = this.f15029g.getData().getImage();
                    this.f15027e = 1;
                    obj = h0Var.ha(image, this);
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
                final h0 h0Var2 = this.f15028f;
                k10.c0<ax3.e> c0Var = this.f15030h;
                final ax3.e eVar = this.f15031j;
                if (iVar instanceof dx.i.Left) {
                    return h0.N9(h0Var2, c0Var, new bx3.d.Params((dx.b) ((dx.i.Left) iVar).b(), new er.l() { // from class: ax3.j0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.e.a.Y(h0Var2, (ib4.c.b) obj2);
                        }
                    }, h0Var2.b9(ax3.c.e.f14911a)), new er.l() { // from class: ax3.k0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.e.a.Z(eVar, (hb4.c) obj2);
                        }
                    }, null, 4, null);
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final ax3.e.b.ImageData imageData = (ax3.e.b.ImageData) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ax3.l0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.e.a.a0(eVar, imageData, (e) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f15028f, this.f15029g, this.f15030h, this.f15031j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ax3.e>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ax3.e.c.ProcessingPhoto O(ax3.c.OnSetupData onSetupData, ax3.e eVar) {
            return new ax3.e.c.ProcessingPhoto(onSetupData.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ax3.c.OnSetupData onSetupData = (ax3.c.OnSetupData) this.f15024g;
            k10.c0 c0Var = (k10.c0) this.f15025h;
            Object objE = uq.b.e();
            int i15 = this.f15023f;
            if (i15 == 0) {
                oq.u.b(obj);
                ax3.e eVar = (ax3.e) c0Var.a();
                if (eVar instanceof ax3.e.c) {
                    return c0Var.d(new er.l() { // from class: ax3.i0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.e.O(onSetupData, (e) obj2);
                        }
                    });
                }
                if (!(eVar instanceof ax3.e.b)) {
                    throw new oq.p();
                }
                ac4.a aVar = h0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(h0.this, onSetupData, c0Var, eVar, null);
                this.f15024g = vq.j.a(onSetupData);
                this.f15025h = vq.j.a(c0Var);
                this.f15022e = vq.j.a(eVar);
                this.f15023f = 1;
                obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return (k10.l) obj;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ax3.c.OnSetupData onSetupData, k10.c0<ax3.e> c0Var, tq.e<? super k10.l<? extends ax3.e>> eVar) {
            e eVar2 = h0.this.new e(eVar);
            eVar2.f15024g = onSetupData;
            eVar2.f15025h = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lax3/c$h;", "action", "Lk10/c0;", "Lax3/e$c;", "state", "Lk10/l;", "Lax3/e;", "<anonymous>", "(Lax3/c$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ax3.c.OnFirstLoadData, k10.c0<ax3.e.c>, tq.e<? super k10.l<? extends ax3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15034g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lk10/l;", "Lax3/e;", "<anonymous>", "(Lju/p0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super k10.l<? extends ax3.e>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f15036e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f15037f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ h0 f15038g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ ax3.c.OnFirstLoadData f15039h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k10.c0<ax3.e.c> f15040j;

            /* JADX INFO: renamed from: ax3.h0$f$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lax3/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
            static final class C0350a extends vq.k implements er.l<tq.e<? super k10.l<? extends ax3.e>>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f15041e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f15042f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f15043g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f15044h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f15045j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f15046k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                Object f15047l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                boolean f15048m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f15049n;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                int f15050p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f15051q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ ax3.c.OnFirstLoadData f15052r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ h0 f15053s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ ju.p0 f15054t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                final /* synthetic */ k10.c0<ax3.e.c> f15055v;

                /* JADX INFO: renamed from: ax3.h0$f$a$a$a, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"ax3/h0$f$a$a$a", "", "Lax3/e$b$c;", "imageData", "Ljw3/a;", "faceValidationState", "<init>", "(Lax3/e$b$c;Ljw3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lax3/e$b$c;", "b", "()Lax3/e$b$c;", "Ljw3/a;", "()Ljw3/a;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class PhotoValidationResult {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final ax3.e.b.ImageData imageData;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                    private final jw3.a faceValidationState;

                    public PhotoValidationResult(ax3.e.b.ImageData imageData, jw3.a aVar) {
                        this.imageData = imageData;
                        this.faceValidationState = aVar;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final jw3.a getFaceValidationState() {
                        return this.faceValidationState;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final ax3.e.b.ImageData getImageData() {
                        return this.imageData;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof PhotoValidationResult)) {
                            return false;
                        }
                        PhotoValidationResult photoValidationResult = (PhotoValidationResult) other;
                        return fr.t.c(this.imageData, photoValidationResult.imageData) && fr.t.c(this.faceValidationState, photoValidationResult.faceValidationState);
                    }

                    public int hashCode() {
                        return (this.imageData.hashCode() * 31) + this.faceValidationState.hashCode();
                    }

                    public String toString() {
                        return "PhotoValidationResult(imageData=" + this.imageData + ", faceValidationState=" + this.faceValidationState + ')';
                    }
                }

                /* JADX INFO: renamed from: ax3.h0$f$a$a$b */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lvx/a;", "<anonymous>", "(Lju/p0;)Lvx/a;"}, k = 3, mv = {2, 2, 0})
                static final class b extends vq.k implements er.p<ju.p0, tq.e<? super vx.a>, Object> {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f15058e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ h0 f15059f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ ax3.c.OnFirstLoadData f15060g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(h0 h0Var, ax3.c.OnFirstLoadData onFirstLoadData, tq.e<? super b> eVar) {
                        super(2, eVar);
                        this.f15059f = h0Var;
                        this.f15060g = onFirstLoadData;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) throws Throwable {
                        Object objE = uq.b.e();
                        int i15 = this.f15058e;
                        if (i15 != 0) {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oq.u.b(obj);
                            return obj;
                        }
                        oq.u.b(obj);
                        yz.d dVar = this.f15059f.singleFaceDetector;
                        String uri = this.f15060g.getData().getImage().getMetadata().getUri();
                        this.f15058e = 1;
                        Object objC = dVar.c(uri, this);
                        return objC == objE ? objE : objC;
                    }

                    @Override // er.p
                    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                    public final Object B(ju.p0 p0Var, tq.e<? super vx.a> eVar) {
                        return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
                    }

                    @Override // vq.a
                    public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                        return new b(this.f15059f, this.f15060g, eVar);
                    }
                }

                /* JADX INFO: renamed from: ax3.h0$f$a$a$c */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Lax3/e$b$c;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
                static final class c extends vq.k implements er.p<ju.p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends ax3.e.b.ImageData>>, Object> {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f15061e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ h0 f15062f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ ax3.c.OnFirstLoadData f15063g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    c(h0 h0Var, ax3.c.OnFirstLoadData onFirstLoadData, tq.e<? super c> eVar) {
                        super(2, eVar);
                        this.f15062f = h0Var;
                        this.f15063g = onFirstLoadData;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) throws Throwable {
                        Object objE = uq.b.e();
                        int i15 = this.f15061e;
                        if (i15 == 0) {
                            oq.u.b(obj);
                            h0 h0Var = this.f15062f;
                            wx.i.Image image = this.f15063g.getData().getImage();
                            this.f15061e = 1;
                            obj = h0Var.ha(image, this);
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
                            return new dx.i.Left(new dx.b.Generic(null, 1, null));
                        }
                        if (iVar instanceof dx.i.Right) {
                            return iVar;
                        }
                        throw new oq.p();
                    }

                    @Override // er.p
                    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                    public final Object B(ju.p0 p0Var, tq.e<? super dx.i<dx.b.Generic, ax3.e.b.ImageData>> eVar) {
                        return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
                    }

                    @Override // vq.a
                    public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                        return new c(this.f15062f, this.f15063g, eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0350a(ax3.c.OnFirstLoadData onFirstLoadData, h0 h0Var, ju.p0 p0Var, k10.c0<ax3.e.c> c0Var, tq.e<? super C0350a> eVar) {
                    super(1, eVar);
                    this.f15052r = onFirstLoadData;
                    this.f15053s = h0Var;
                    this.f15054t = p0Var;
                    this.f15055v = c0Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final oq.i0 Y(h0 h0Var, ib4.c.b bVar) {
                    h0Var.Q9(bVar);
                    return oq.i0.f148189a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ax3.e.a Z(k10.c0 c0Var, hb4.c cVar) {
                    return new ax3.e.c.Error(((ax3.e.c) c0Var.a()).getData(), cVar);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ax3.e.b.PhotoLoaded a0(ax3.c.OnFirstLoadData onFirstLoadData, PhotoValidationResult photoValidationResult, MaskDefinition maskDefinition, boolean z15, jw3.c cVar, ax3.e.c cVar2) {
                    return new ax3.e.b.PhotoLoaded(new ax3.e.b.InitializedStateData(onFirstLoadData.getData().getRequirements(), onFirstLoadData.getData().getMaskType(), onFirstLoadData.getData().getIsUnderGuardianship(), photoValidationResult.getImageData(), maskDefinition, photoValidationResult.getFaceValidationState(), null, z15, cVar, 64, null));
                }

                /* JADX WARN: Code duplicated, block: B:34:0x0198  */
                /* JADX WARN: Code duplicated, block: B:37:0x01a1  */
                /* JADX WARN: Code duplicated, block: B:38:0x01a3  */
                /* JADX WARN: Code duplicated, block: B:40:0x01a7  */
                /* JADX WARN: Code duplicated, block: B:44:0x01ca  */
                /* JADX WARN: Code duplicated, block: B:46:0x01fa  */
                /* JADX WARN: Code duplicated, block: B:48:0x01fe  */
                /* JADX WARN: Code duplicated, block: B:50:0x0216  */
                /* JADX WARN: Code duplicated, block: B:52:0x021c  */
                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    MaskDefinition maskDefinition;
                    boolean zBooleanValue;
                    jw3.c cVar;
                    jw3.c cVar2;
                    Object objI;
                    ju.w0 w0Var;
                    ju.w0 w0Var2;
                    dx.i right;
                    int i15;
                    Object objI2;
                    dx.i iVar;
                    ax3.e.b.ImageData imageData;
                    ju.w0 w0Var3;
                    h0 h0Var;
                    MaskDefinition maskDefinition2;
                    int i16;
                    final boolean z15;
                    final jw3.c cVar3;
                    final MaskDefinition maskDefinition3;
                    Object objD;
                    boolean z16;
                    ax3.e.b.ImageData imageData2;
                    jw3.c cVar4;
                    final h0 h0Var2;
                    final k10.c0<ax3.e.c> c0Var;
                    final ax3.c.OnFirstLoadData onFirstLoadData;
                    dx.i iVar2;
                    Object objE = uq.b.e();
                    int i17 = this.f15051q;
                    if (i17 == 0) {
                        oq.u.b(obj);
                        maskDefinition = new MaskDefinition(new Rectangle(700.0f, 900.0f), this.f15052r.getData().getMaskType());
                        zBooleanValue = this.f15053s.isFeatureEnabledUseCase.a(b54.c.IDENTITY_PHOTO_ADJUSTMENT).booleanValue();
                        if (zBooleanValue) {
                            cVar = jw3.c.FILL;
                        } else {
                            if (zBooleanValue) {
                                throw new oq.p();
                            }
                            cVar = jw3.c.FIT;
                        }
                        cVar2 = cVar;
                        ju.w0 w0VarB = ju.k.b(this.f15054t, null, null, new c(this.f15053s, this.f15052r, null), 3, null);
                        ju.w0 w0VarB2 = ju.k.b(this.f15054t, null, null, new b(this.f15053s, this.f15052r, null), 3, null);
                        this.f15041e = maskDefinition;
                        this.f15042f = cVar2;
                        this.f15043g = vq.j.a(w0VarB);
                        this.f15044h = w0VarB2;
                        this.f15048m = zBooleanValue;
                        this.f15051q = 1;
                        objI = w0VarB.I(this);
                        if (objI != objE) {
                            w0Var = w0VarB;
                            w0Var2 = w0VarB2;
                        }
                        return objE;
                    }
                    if (i17 == 1) {
                        zBooleanValue = this.f15048m;
                        w0Var2 = (ju.w0) this.f15044h;
                        ju.w0 w0Var4 = (ju.w0) this.f15043g;
                        cVar2 = (jw3.c) this.f15042f;
                        maskDefinition = (MaskDefinition) this.f15041e;
                        oq.u.b(obj);
                        objI = obj;
                        w0Var = w0Var4;
                    } else {
                        if (i17 == 2) {
                            int i18 = this.f15050p;
                            int i19 = this.f15049n;
                            boolean z17 = this.f15048m;
                            imageData = (ax3.e.b.ImageData) this.f15047l;
                            h0 h0Var3 = (h0) this.f15046k;
                            dx.i iVar3 = (dx.i) this.f15045j;
                            ju.w0 w0Var5 = (ju.w0) this.f15044h;
                            ju.w0 w0Var6 = (ju.w0) this.f15043g;
                            jw3.c cVar5 = (jw3.c) this.f15042f;
                            MaskDefinition maskDefinition4 = (MaskDefinition) this.f15041e;
                            oq.u.b(obj);
                            i15 = i18;
                            zBooleanValue = z17;
                            w0Var2 = w0Var5;
                            maskDefinition2 = maskDefinition4;
                            w0Var3 = w0Var6;
                            h0Var = h0Var3;
                            cVar2 = cVar5;
                            iVar = iVar3;
                            i16 = i19;
                            objI2 = obj;
                            vx.a aVar = (vx.a) objI2;
                            iw3.h hVar = h0Var.validateDetectedFaceUC;
                            iw3.h.Params aVar2 = new iw3.h.Params(h0Var.V9(aVar, maskDefinition2.getContainer(), cVar2), maskDefinition2, imageData.getOriginalHeight(), imageData.getOriginalWidth());
                            this.f15041e = maskDefinition2;
                            this.f15042f = cVar2;
                            this.f15043g = vq.j.a(w0Var3);
                            this.f15044h = w0Var2;
                            this.f15045j = vq.j.a(iVar);
                            this.f15046k = imageData;
                            this.f15047l = vq.j.a(aVar);
                            this.f15048m = zBooleanValue;
                            this.f15049n = i16;
                            this.f15050p = i15;
                            this.f15051q = 3;
                            objD = hVar.d(aVar2, this);
                            if (objD != objE) {
                                z16 = zBooleanValue;
                                imageData2 = imageData;
                                cVar4 = cVar2;
                            }
                            return objE;
                        }
                        if (i17 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z16 = this.f15048m;
                        imageData2 = (ax3.e.b.ImageData) this.f15046k;
                        ju.w0 w0Var7 = (ju.w0) this.f15044h;
                        cVar4 = (jw3.c) this.f15042f;
                        MaskDefinition maskDefinition5 = (MaskDefinition) this.f15041e;
                        oq.u.b(obj);
                        maskDefinition2 = maskDefinition5;
                        w0Var2 = w0Var7;
                        objD = obj;
                    }
                    iVar2 = (dx.i) objD;
                    if (iVar2 instanceof dx.i.Left) {
                        right = iVar2;
                    } else {
                        if (iVar2 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        right = new dx.i.Right(new PhotoValidationResult(imageData2, (jw3.a) ((dx.i.Right) iVar2).b()));
                    }
                    z15 = z16;
                    cVar3 = cVar4;
                    maskDefinition3 = maskDefinition2;
                    h0Var2 = this.f15053s;
                    c0Var = this.f15055v;
                    onFirstLoadData = this.f15052r;
                    if (right instanceof dx.i.Left) {
                        dx.b bVar = (dx.b) ((dx.i.Left) right).b();
                        d2.a.a(w0Var2, null, 1, null);
                        return h0.N9(h0Var2, c0Var, new bx3.d.Params(bVar, new er.l() { // from class: ax3.m0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return h0.f.a.C0350a.Y(h0Var2, (ib4.c.b) obj2);
                            }
                        }, null, 4, null), new er.l() { // from class: ax3.n0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return h0.f.a.C0350a.Z(c0Var, (hb4.c) obj2);
                            }
                        }, null, 4, null);
                    }
                    if (right instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    final PhotoValidationResult photoValidationResult = (PhotoValidationResult) ((dx.i.Right) right).b();
                    return c0Var.d(new er.l() { // from class: ax3.o0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.f.a.C0350a.a0(onFirstLoadData, photoValidationResult, maskDefinition3, z15, cVar3, (e.c) obj2);
                        }
                    });
                    right = (dx.i) objI;
                    h0 h0Var4 = this.f15053s;
                    if (!(right instanceof dx.i.Left)) {
                        if (!(right instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        ax3.e.b.ImageData imageData3 = (ax3.e.b.ImageData) ((dx.i.Right) right).b();
                        this.f15041e = maskDefinition;
                        this.f15042f = cVar2;
                        this.f15043g = vq.j.a(w0Var);
                        this.f15044h = w0Var2;
                        this.f15045j = vq.j.a(right);
                        this.f15046k = h0Var4;
                        this.f15047l = imageData3;
                        this.f15048m = zBooleanValue;
                        i15 = 0;
                        this.f15049n = 0;
                        this.f15050p = 0;
                        this.f15051q = 2;
                        objI2 = w0Var2.I(this);
                        if (objI2 != objE) {
                            iVar = right;
                            imageData = imageData3;
                            w0Var3 = w0Var;
                            h0Var = h0Var4;
                            maskDefinition2 = maskDefinition;
                            i16 = 0;
                            vx.a aVar3 = (vx.a) objI2;
                            iw3.h hVar2 = h0Var.validateDetectedFaceUC;
                            iw3.h.Params aVar4 = new iw3.h.Params(h0Var.V9(aVar3, maskDefinition2.getContainer(), cVar2), maskDefinition2, imageData.getOriginalHeight(), imageData.getOriginalWidth());
                            this.f15041e = maskDefinition2;
                            this.f15042f = cVar2;
                            this.f15043g = vq.j.a(w0Var3);
                            this.f15044h = w0Var2;
                            this.f15045j = vq.j.a(iVar);
                            this.f15046k = imageData;
                            this.f15047l = vq.j.a(aVar3);
                            this.f15048m = zBooleanValue;
                            this.f15049n = i16;
                            this.f15050p = i15;
                            this.f15051q = 3;
                            objD = hVar2.d(aVar4, this);
                            if (objD != objE) {
                                z16 = zBooleanValue;
                                imageData2 = imageData;
                                cVar4 = cVar2;
                                iVar2 = (dx.i) objD;
                                if (iVar2 instanceof dx.i.Left) {
                                    right = iVar2;
                                } else {
                                    if (iVar2 instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    right = new dx.i.Right(new PhotoValidationResult(imageData2, (jw3.a) ((dx.i.Right) iVar2).b()));
                                }
                                z15 = z16;
                                cVar3 = cVar4;
                                maskDefinition3 = maskDefinition2;
                            }
                        }
                        return objE;
                    }
                    z15 = zBooleanValue;
                    cVar3 = cVar2;
                    maskDefinition3 = maskDefinition;
                    h0Var2 = this.f15053s;
                    c0Var = this.f15055v;
                    onFirstLoadData = this.f15052r;
                    if (right instanceof dx.i.Left) {
                        dx.b bVar2 = (dx.b) ((dx.i.Left) right).b();
                        d2.a.a(w0Var2, null, 1, null);
                        return h0.N9(h0Var2, c0Var, new bx3.d.Params(bVar2, new er.l() { // from class: ax3.m0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return h0.f.a.C0350a.Y(h0Var2, (ib4.c.b) obj2);
                            }
                        }, null, 4, null), new er.l() { // from class: ax3.n0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return h0.f.a.C0350a.Z(c0Var, (hb4.c) obj2);
                            }
                        }, null, 4, null);
                    }
                    if (right instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    final PhotoValidationResult photoValidationResult2 = (PhotoValidationResult) ((dx.i.Right) right).b();
                    return c0Var.d(new er.l() { // from class: ax3.o0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.f.a.C0350a.a0(onFirstLoadData, photoValidationResult2, maskDefinition3, z15, cVar3, (e.c) obj2);
                        }
                    });
                }

                public final tq.e<oq.i0> V(tq.e<?> eVar) {
                    return new C0350a(this.f15052r, this.f15053s, this.f15054t, this.f15055v, eVar);
                }

                @Override // er.l
                /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
                public final Object b(tq.e<? super k10.l<? extends ax3.e>> eVar) {
                    return ((C0350a) V(eVar)).J(oq.i0.f148189a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, ax3.c.OnFirstLoadData onFirstLoadData, k10.c0<ax3.e.c> c0Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f15038g = h0Var;
                this.f15039h = onFirstLoadData;
                this.f15040j = c0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                ju.p0 p0Var = (ju.p0) this.f15037f;
                Object objE = uq.b.e();
                int i15 = this.f15036e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                ac4.a aVar = this.f15038g.callActionWithLoaderUseCase;
                C0350a c0350a = new C0350a(this.f15039h, this.f15038g, p0Var, this.f15040j, null);
                this.f15037f = vq.j.a(p0Var);
                this.f15036e = 1;
                Object objA = ac4.a.a(aVar, null, c0350a, this, 1, null);
                return objA == objE ? objE : objA;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super k10.l<? extends ax3.e>> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f15038g, this.f15039h, this.f15040j, eVar);
                aVar.f15037f = obj;
                return aVar;
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ax3.c.OnFirstLoadData onFirstLoadData = (ax3.c.OnFirstLoadData) this.f15033f;
            k10.c0 c0Var = (k10.c0) this.f15034g;
            Object objE = uq.b.e();
            int i15 = this.f15032e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            a aVar = new a(h0.this, onFirstLoadData, c0Var, null);
            this.f15033f = vq.j.a(onFirstLoadData);
            this.f15034g = vq.j.a(c0Var);
            this.f15032e = 1;
            Object objE2 = ju.q0.e(aVar, this);
            return objE2 == objE ? objE : objE2;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ax3.c.OnFirstLoadData onFirstLoadData, k10.c0<ax3.e.c> c0Var, tq.e<? super k10.l<? extends ax3.e>> eVar) {
            f fVar = h0.this.new f(eVar);
            fVar.f15033f = onFirstLoadData;
            fVar.f15034g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lax3/a;", "<unused var>", "Lax3/e$c$a;", "Loq/i0;", "<anonymous>", "(Lax3/a;Lax3/e$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ax3.a, ax3.e.c.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15064e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f15064e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ax3.c.a> bVarY1 = h0.this.Y1();
                ax3.c.a.b bVar = ax3.c.a.b.f14902a;
                this.f15064e = 1;
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
        public final Object w(ax3.a aVar, ax3.e.c.Error error, tq.e<? super oq.i0> eVar) {
            return h0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lax3/b;", "<unused var>", "Lk10/c0;", "Lax3/e$c$a;", "state", "Lk10/l;", "Lax3/e;", "<anonymous>", "(Lax3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ax3.b, k10.c0<ax3.e.c.Error>, tq.e<? super k10.l<? extends ax3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15067f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ax3.e.c.ProcessingPhoto O(k10.c0 c0Var, ax3.e.c.Error error) {
            return new ax3.e.c.ProcessingPhoto(((ax3.e.c.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f15067f;
            uq.b.e();
            if (this.f15066e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ax3.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.h.O(c0Var, (e.c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ax3.b bVar, k10.c0<ax3.e.c.Error> c0Var, tq.e<? super k10.l<? extends ax3.e>> eVar) {
            h hVar = new h(eVar);
            hVar.f15067f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lax3/e$c$c;", "state", "Loq/i0;", "<anonymous>", "(Lax3/e$c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<ax3.e.c.ProcessingPhoto, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15069f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ax3.e.c.ProcessingPhoto processingPhoto = (ax3.e.c.ProcessingPhoto) this.f15069f;
            uq.b.e();
            if (this.f15068e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h0.this.d9(new ax3.c.OnFirstLoadData(processingPhoto.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ax3.e.c.ProcessingPhoto processingPhoto, tq.e<? super oq.i0> eVar) {
            return ((i) v(processingPhoto, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = h0.this.new i(eVar);
            iVar.f15069f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lax3/c$j;", "action", "Lk10/c0;", "Lax3/e$b;", "state", "Lk10/l;", "Lax3/e;", "<anonymous>", "(Lax3/c$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ax3.c.OnNewPhotoPicked, k10.c0<ax3.e.b>, tq.e<? super k10.l<? extends ax3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15073g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lax3/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ax3.e>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f15075e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f15076f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ h0 f15077g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ ax3.c.OnNewPhotoPicked f15078h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k10.c0<ax3.e.b> f15079j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, ax3.c.OnNewPhotoPicked onNewPhotoPicked, k10.c0<ax3.e.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f15077g = h0Var;
                this.f15078h = onNewPhotoPicked;
                this.f15079j = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Y(h0 h0Var, ib4.c.b bVar) {
                h0Var.Q9(bVar);
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ax3.e.a Z(k10.c0 c0Var, ax3.c.OnNewPhotoPicked onNewPhotoPicked, hb4.c cVar) {
                return new ax3.e.b.Error(ax3.e.b.InitializedStateData.b(((ax3.e.b) c0Var.a()).getStateData(), null, null, false, onNewPhotoPicked.getImageData(), null, null, null, false, null, 503, null), cVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ax3.e.b.PhotoLoaded a0(ax3.c.OnNewPhotoPicked onNewPhotoPicked, jw3.a aVar, ax3.e.b bVar) {
                return new ax3.e.b.PhotoLoaded(ax3.e.b.InitializedStateData.b(bVar.getStateData(), null, null, false, onNewPhotoPicked.getImageData(), bVar.getStateData().getMaskDefinition(), aVar, null, false, null, 455, null));
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x00ae, code lost:
            
                if (r10 == r0) goto L15;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 253
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ax3.h0.j.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f15077g, this.f15078h, this.f15079j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ax3.e>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ax3.c.OnNewPhotoPicked onNewPhotoPicked = (ax3.c.OnNewPhotoPicked) this.f15072f;
            k10.c0 c0Var = (k10.c0) this.f15073g;
            Object objE = uq.b.e();
            int i15 = this.f15071e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = h0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(h0.this, onNewPhotoPicked, c0Var, null);
            this.f15072f = vq.j.a(onNewPhotoPicked);
            this.f15073g = vq.j.a(c0Var);
            this.f15071e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ax3.c.OnNewPhotoPicked onNewPhotoPicked, k10.c0<ax3.e.b> c0Var, tq.e<? super k10.l<? extends ax3.e>> eVar) {
            j jVar = h0.this.new j(eVar);
            jVar.f15072f = onNewPhotoPicked;
            jVar.f15073g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lax3/e$b$f;", "state", "Loq/i0;", "<anonymous>", "(Lax3/e$b$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<ax3.e.b.ProcessingPhoto, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15081f;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ax3.e.b.ProcessingPhoto processingPhoto = (ax3.e.b.ProcessingPhoto) this.f15081f;
            uq.b.e();
            if (this.f15080e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h0.this.d9(new ax3.c.OnNewPhotoPicked(processingPhoto.getStateData().getImageData()));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ax3.e.b.ProcessingPhoto processingPhoto, tq.e<? super oq.i0> eVar) {
            return ((k) v(processingPhoto, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = h0.this.new k(eVar);
            kVar.f15081f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lax3/c$b;", "<unused var>", "Lax3/e$b$e;", "state", "Loq/i0;", "<anonymous>", "(Lax3/c$b;Lax3/e$b$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ax3.c.b, ax3.e.b.PhotoLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15084f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ax3.e.b.PhotoLoaded photoLoaded = (ax3.e.b.PhotoLoaded) this.f15084f;
            Object objE = uq.b.e();
            int i15 = this.f15083e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                ax3.c.a.AdjustPhoto adjustPhoto = new ax3.c.a.AdjustPhoto(new SetupData(photoLoaded.getStateData().getImageData().getBitmap(), photoLoaded.getStateData().getMaskType(), photoLoaded.getStateData().getRequirements(), photoLoaded.getStateData().getIsUnderGuardianship()));
                this.f15084f = vq.j.a(photoLoaded);
                this.f15083e = 1;
                if (h0Var.F(adjustPhoto, this) == objE) {
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
        public final Object w(ax3.c.b bVar, ax3.e.b.PhotoLoaded photoLoaded, tq.e<? super oq.i0> eVar) {
            l lVar = h0.this.new l(eVar);
            lVar.f15084f = photoLoaded;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lax3/c$m;", "action", "Lk10/c0;", "Lax3/e$b$e;", "state", "Lk10/l;", "Lax3/e;", "<anonymous>", "(Lax3/c$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ax3.c.OnShowDialog, k10.c0<ax3.e.b.PhotoLoaded>, tq.e<? super k10.l<? extends ax3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15087f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15088g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ax3.e.b.Dialog O(h0 h0Var, ax3.c.OnShowDialog onShowDialog, k10.c0 c0Var, ax3.e.b.PhotoLoaded photoLoaded) {
            return new ax3.e.b.Dialog(h0Var.dialogVmsFactory.a(h0Var.verificationDialogMapper.b(new bx3.a.Params(onShowDialog.getDialogType(), h0Var.b9(new ax3.c.OnDialogConfirmed(((ax3.e.b.PhotoLoaded) c0Var.a()).getStateData().getImageData().getImage())), h0Var.b9(ax3.c.d.f14910a), h0Var.b9(ax3.c.e.f14911a)))), photoLoaded.getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ax3.c.OnShowDialog onShowDialog = (ax3.c.OnShowDialog) this.f15087f;
            final k10.c0 c0Var = (k10.c0) this.f15088g;
            uq.b.e();
            if (this.f15086e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final h0 h0Var = h0.this;
            return c0Var.d(new er.l() { // from class: ax3.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.m.O(h0Var, onShowDialog, c0Var, (e.b.PhotoLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ax3.c.OnShowDialog onShowDialog, k10.c0<ax3.e.b.PhotoLoaded> c0Var, tq.e<? super k10.l<? extends ax3.e>> eVar) {
            m mVar = h0.this.new m(eVar);
            mVar.f15087f = onShowDialog;
            mVar.f15088g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lax3/c$q;", "action", "Lax3/e$b$e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lax3/c$q;Lax3/e$b$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ax3.c.OpenUrl, ax3.e.b.PhotoLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15091f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ax3.c.OpenUrl openUrl = (ax3.c.OpenUrl) this.f15091f;
            Object objE = uq.b.e();
            int i15 = this.f15090e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = h0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f15091f = vq.j.a(openUrl);
                this.f15090e = 1;
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
            h0 h0Var = h0.this;
            if (iVar instanceof dx.i.Left) {
                h0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ax3.c.OpenUrl openUrl, ax3.e.b.PhotoLoaded photoLoaded, tq.e<? super oq.i0> eVar) {
            n nVar = h0.this.new n(eVar);
            nVar.f15091f = openUrl;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lax3/c$c;", "<unused var>", "Lax3/e$b$e;", "state", "Loq/i0;", "<anonymous>", "(Lax3/c$c;Lax3/e$b$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ax3.c.C0341c, ax3.e.b.PhotoLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15093e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15094f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ax3.e.b.PhotoLoaded photoLoaded = (ax3.e.b.PhotoLoaded) this.f15094f;
            Object objE = uq.b.e();
            int i15 = this.f15093e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (photoLoaded.getStateData().getBottomSheetValue() == g30.v.EXPANDED) {
                    h0.this.d9(new ax3.c.OnToggleBottomSheet(g30.v.HIDDEN));
                } else {
                    xw.b<ax3.c.a> bVarY1 = h0.this.Y1();
                    ax3.c.a.b bVar = ax3.c.a.b.f14902a;
                    this.f15094f = vq.j.a(photoLoaded);
                    this.f15093e = 1;
                    if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(ax3.c.C0341c c0341c, ax3.e.b.PhotoLoaded photoLoaded, tq.e<? super oq.i0> eVar) {
            o oVar = h0.this.new o(eVar);
            oVar.f15094f = photoLoaded;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lax3/c$o;", "action", "Lk10/c0;", "Lax3/e$b$e;", "state", "Lk10/l;", "Lax3/e;", "<anonymous>", "(Lax3/c$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<ax3.c.OnToggleBottomSheet, k10.c0<ax3.e.b.PhotoLoaded>, tq.e<? super k10.l<? extends ax3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15098g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ax3.e.b.PhotoLoaded O(ax3.c.OnToggleBottomSheet onToggleBottomSheet, ax3.e.b.PhotoLoaded photoLoaded) {
            return photoLoaded.e(ax3.e.b.InitializedStateData.b(photoLoaded.getStateData(), null, null, false, null, null, null, onToggleBottomSheet.getValue(), false, null, 447, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ax3.c.OnToggleBottomSheet onToggleBottomSheet = (ax3.c.OnToggleBottomSheet) this.f15097f;
            k10.c0 c0Var = (k10.c0) this.f15098g;
            uq.b.e();
            if (this.f15096e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ax3.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.p.O(onToggleBottomSheet, (e.b.PhotoLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ax3.c.OnToggleBottomSheet onToggleBottomSheet, k10.c0<ax3.e.b.PhotoLoaded> c0Var, tq.e<? super k10.l<? extends ax3.e>> eVar) {
            p pVar = new p(eVar);
            pVar.f15097f = onToggleBottomSheet;
            pVar.f15098g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lax3/c$i;", "action", "Lax3/e$b$e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lax3/c$i;Lax3/e$b$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<ax3.c.OnNewPhotoAction, ax3.e.b.PhotoLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15100f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ax3.c.OnNewPhotoAction onNewPhotoAction = (ax3.c.OnNewPhotoAction) this.f15100f;
            uq.b.e();
            if (this.f15099e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (onNewPhotoAction.getFromGallery()) {
                h0.this.d9(ax3.c.k.f14918a);
            } else {
                h0.this.d9(ax3.c.n.f14921a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ax3.c.OnNewPhotoAction onNewPhotoAction, ax3.e.b.PhotoLoaded photoLoaded, tq.e<? super oq.i0> eVar) {
            q qVar = h0.this.new q(eVar);
            qVar.f15100f = onNewPhotoAction;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lax3/c$k;", "action", "Lk10/c0;", "Lax3/e$b$e;", "state", "Lk10/l;", "Lax3/e;", "<anonymous>", "(Lax3/c$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<ax3.c.k, k10.c0<ax3.e.b.PhotoLoaded>, tq.e<? super k10.l<? extends ax3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f15104g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15105h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f15106j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f15107k;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 Y(h0 h0Var, ib4.c.b bVar) {
            h0Var.Q9(bVar);
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ax3.e.a Z(k10.c0 c0Var, hb4.c cVar) {
            return new ax3.e.b.Error(((ax3.e.b.PhotoLoaded) c0Var.a()).getStateData(), cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ax3.e.b.Dialog a0(k10.c0 c0Var, cb4.i iVar) {
            return new ax3.e.b.Dialog(iVar, ((ax3.e.b.PhotoLoaded) c0Var.a()).getStateData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ax3.e.b.ProcessingPhoto b0(ax3.e.b.ImageData imageData, ax3.e.b.PhotoLoaded photoLoaded) {
            return new ax3.e.b.ProcessingPhoto(ax3.e.b.InitializedStateData.b(photoLoaded.getStateData(), null, null, false, imageData, null, null, null, false, null, 503, null));
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:34:0x0121  */
        /* JADX WARN: Code duplicated, block: B:36:0x0125  */
        /* JADX WARN: Code duplicated, block: B:39:0x0139  */
        /* JADX WARN: Code duplicated, block: B:41:0x0160  */
        /* JADX WARN: Code duplicated, block: B:43:0x0164  */
        /* JADX WARN: Code duplicated, block: B:45:0x0176  */
        /* JADX WARN: Code duplicated, block: B:47:0x017c  */
        /* JADX WARN: Code duplicated, block: B:49:0x0182  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
        
            if (r12 == r1) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax3.h0.r.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object w(ax3.c.k kVar, k10.c0<ax3.e.b.PhotoLoaded> c0Var, tq.e<? super k10.l<? extends ax3.e>> eVar) {
            r rVar = h0.this.new r(eVar);
            rVar.f15107k = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lax3/c$n;", "<unused var>", "Lax3/e$b$e;", "state", "Loq/i0;", "<anonymous>", "(Lax3/c$n;Lax3/e$b$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<ax3.c.n, ax3.e.b.PhotoLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15110f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ax3.e.b.PhotoLoaded photoLoaded = (ax3.e.b.PhotoLoaded) this.f15110f;
            Object objE = uq.b.e();
            int i15 = this.f15109e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ax3.c.a> bVarY1 = h0.this.Y1();
                ax3.c.a.TakeNewPhoto takeNewPhoto = new ax3.c.a.TakeNewPhoto(new yw3.SetupData(photoLoaded.getStateData().getRequirements(), photoLoaded.getStateData().getMaskType(), photoLoaded.getStateData().getIsUnderGuardianship()));
                this.f15110f = vq.j.a(photoLoaded);
                this.f15109e = 1;
                if (bVarY1.F(takeNewPhoto, this) == objE) {
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
        public final Object w(ax3.c.n nVar, ax3.e.b.PhotoLoaded photoLoaded, tq.e<? super oq.i0> eVar) {
            s sVar = h0.this.new s(eVar);
            sVar.f15110f = photoLoaded;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lax3/c$p;", "<unused var>", "Lax3/e$b$e;", "state", "Loq/i0;", "<anonymous>", "(Lax3/c$p;Lax3/e$b$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<ax3.c.p, ax3.e.b.PhotoLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15113f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bx3.a.b bVar;
            ax3.e.b.PhotoLoaded photoLoaded = (ax3.e.b.PhotoLoaded) this.f15113f;
            uq.b.e();
            if (this.f15112e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h0 h0Var = h0.this;
            jw3.a faceValidationState = photoLoaded.getStateData().getFaceValidationState();
            if (faceValidationState instanceof jw3.a.Invalid) {
                bVar = bx3.a.b.CONFIRM_INVALID;
            } else {
                if (!fr.t.c(faceValidationState, jw3.a.b.f106434a)) {
                    throw new oq.p();
                }
                bVar = bx3.a.b.CONFIRM_VALID;
            }
            h0Var.d9(new ax3.c.OnShowDialog(bVar));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ax3.c.p pVar, ax3.e.b.PhotoLoaded photoLoaded, tq.e<? super oq.i0> eVar) {
            t tVar = h0.this.new t(eVar);
            tVar.f15113f = photoLoaded;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lax3/c$g;", "<unused var>", "Lax3/e$b$e;", "state", "Loq/i0;", "<anonymous>", "(Lax3/c$g;Lax3/e$b$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<ax3.c.g, ax3.e.b.PhotoLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15116f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ax3.e.b.PhotoLoaded photoLoaded = (ax3.e.b.PhotoLoaded) this.f15116f;
            Object objE = uq.b.e();
            int i15 = this.f15115e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                ax3.c.a.PreviewPhoto previewPhoto = new ax3.c.a.PreviewPhoto(new ww3.SetupData(photoLoaded.getStateData().getImageData().getBitmap(), photoLoaded.getStateData().getScaleType(), photoLoaded.getStateData().getMaskType(), photoLoaded.getStateData().getIsAdjustmentEnabled(), photoLoaded.getStateData().getRequirements(), photoLoaded.getStateData().getIsUnderGuardianship()));
                this.f15116f = vq.j.a(photoLoaded);
                this.f15115e = 1;
                if (h0Var.F(previewPhoto, this) == objE) {
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
        public final Object w(ax3.c.g gVar, ax3.e.b.PhotoLoaded photoLoaded, tq.e<? super oq.i0> eVar) {
            u uVar = h0.this.new u(eVar);
            uVar.f15116f = photoLoaded;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lax3/c$e;", "<unused var>", "Lk10/c0;", "Lax3/e$b$a;", "state", "Lk10/l;", "Lax3/e;", "<anonymous>", "(Lax3/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<ax3.c.e, k10.c0<ax3.e.b.Dialog>, tq.e<? super k10.l<? extends ax3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15119f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ax3.e.b.PhotoLoaded O(ax3.e.b.Dialog dialog) {
            return new ax3.e.b.PhotoLoaded(dialog.getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f15119f;
            uq.b.e();
            if (this.f15118e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ax3.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.v.O((e.b.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ax3.c.e eVar, k10.c0<ax3.e.b.Dialog> c0Var, tq.e<? super k10.l<? extends ax3.e>> eVar2) {
            v vVar = new v(eVar2);
            vVar.f15119f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lax3/c$f;", "action", "Lax3/e$b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lax3/c$f;Lax3/e$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<ax3.c.OnDialogConfirmed, ax3.e.b.Dialog, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15121f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ax3.c.OnDialogConfirmed onDialogConfirmed = (ax3.c.OnDialogConfirmed) this.f15121f;
            Object objE = uq.b.e();
            int i15 = this.f15120e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ax3.c.a> bVarY1 = h0.this.Y1();
                ax3.c.a.PhotoSelected photoSelected = new ax3.c.a.PhotoSelected(onDialogConfirmed.getImageData());
                this.f15121f = vq.j.a(onDialogConfirmed);
                this.f15120e = 1;
                if (bVarY1.F(photoSelected, this) == objE) {
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
        public final Object w(ax3.c.OnDialogConfirmed onDialogConfirmed, ax3.e.b.Dialog dialog, tq.e<? super oq.i0> eVar) {
            w wVar = h0.this.new w(eVar);
            wVar.f15121f = onDialogConfirmed;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lax3/a;", "<unused var>", "Lax3/e$b$b;", "Loq/i0;", "<anonymous>", "(Lax3/a;Lax3/e$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<ax3.a, ax3.e.b.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15123e;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f15123e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ax3.c.a> bVarY1 = h0.this.Y1();
                ax3.c.a.b bVar = ax3.c.a.b.f14902a;
                this.f15123e = 1;
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
        public final Object w(ax3.a aVar, ax3.e.b.Error error, tq.e<? super oq.i0> eVar) {
            return h0.this.new x(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lax3/b;", "<unused var>", "Lk10/c0;", "Lax3/e$b$b;", "state", "Lk10/l;", "Lax3/e;", "<anonymous>", "(Lax3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<ax3.b, k10.c0<ax3.e.b.Error>, tq.e<? super k10.l<? extends ax3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15126f;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ax3.e.b.ProcessingPhoto O(ax3.e.b.Error error) {
            return new ax3.e.b.ProcessingPhoto(error.getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f15126f;
            uq.b.e();
            if (this.f15125e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ax3.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.y.O((e.b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ax3.b bVar, k10.c0<ax3.e.b.Error> c0Var, tq.e<? super k10.l<? extends ax3.e>> eVar) {
            y yVar = new y(eVar);
            yVar.f15126f = c0Var;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class z extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f15130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f15131h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f15132j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f15133k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f15134l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f15135m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f15136n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f15137p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f15138q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f15140s;

        z(tq.e<? super z> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f15138q = obj;
            this.f15140s |= PKIFailureInfo.systemUnavail;
            return h0.this.ha(null, this);
        }
    }

    public h0(yy.a aVar, bx3.i iVar, b00.c cVar, ac4.a aVar2, qx.a aVar3, bx3.d dVar, bc4.l lVar, bc4.d dVar2, iw3.h hVar, yz.d dVar3, c54.b bVar, cb4.j jVar, bx3.a aVar4, fw3.c cVar2, i70.e eVar, a14.w wVar, u04.a aVar5, hb4.d dVar4, SetupData setupData) {
        this.mapper = iVar;
        this.imageConverter = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.imagePropertiesProvider = aVar3;
        this.errorMapper = dVar;
        this.pickPhotoFromGalleryUseCase = lVar;
        this.checkPhotoResolutionUseCase = dVar2;
        this.validateDetectedFaceUC = hVar;
        this.singleFaceDetector = dVar3;
        this.isFeatureEnabledUseCase = bVar;
        this.dialogVmsFactory = jVar;
        this.verificationDialogMapper = aVar4;
        this.scaleFaceDetectorResultToContainerUC = cVar2;
        this.globalSnackBarManager = eVar;
        this.openUrlIntentUseCase = wVar;
        this.commonEndpoints = aVar5;
        this.errorVMSFactory = dVar4;
        this.data = setupData;
        ax3.e.c.Loading loading = new ax3.e.c.Loading(setupData);
        this.initialState = loading;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(loading, new er.l() { // from class: ax3.x
            @Override // er.l
            public final Object b(Object obj) {
                return h0.X9(this.f15189a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), R9(loading));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<ax3.e> M9(k10.c0<? extends ax3.e> c0Var, bx3.d.Params params, final er.l<? super hb4.c, ? extends ax3.e.a> lVar, final er.l<? super cb4.i, ax3.e.b.Dialog> lVar2) {
        final bx3.d.c cVarB = this.errorMapper.b(params);
        if (cVarB instanceof bx3.d.c.Dialog) {
            return lVar2 != null ? c0Var.d(new er.l() { // from class: ax3.v
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.O9(lVar2, this, cVarB, (e) obj);
                }
            }) : c0Var.c();
        }
        if (cVarB instanceof bx3.d.c.FullPage) {
            return c0Var.d(new er.l() { // from class: ax3.w
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.P9(lVar, this, cVarB, (e) obj);
                }
            });
        }
        if (cVarB == null) {
            return c0Var.c();
        }
        throw new oq.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ k10.l N9(h0 h0Var, k10.c0 c0Var, bx3.d.Params params, er.l lVar, er.l lVar2, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            lVar2 = null;
        }
        return h0Var.M9(c0Var, params, lVar, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ax3.e.b.Dialog O9(er.l lVar, h0 h0Var, bx3.d.c cVar, ax3.e eVar) {
        return (ax3.e.b.Dialog) lVar.b(h0Var.dialogVmsFactory.a(((bx3.d.c.Dialog) cVar).getData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ax3.e.a P9(er.l lVar, h0 h0Var, bx3.d.c cVar, ax3.e eVar) {
        return (ax3.e.a) lVar.b(h0Var.errorVMSFactory.a(((bx3.d.c.FullPage) cVar).getData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q9(ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
            d9(ax3.b.f14899a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.AbstractC2161b.a)) {
                throw new oq.p();
            }
            d9(ax3.a.f14897a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ax3.f.a R9(ax3.e state) {
        return this.mapper.b(new bx3.i.Params(state, b9(ax3.c.p.f14923a), new er.l() { // from class: ax3.s
            @Override // er.l
            public final Object b(Object obj) {
                return h0.S9(this.f15172a, (g30.v) obj);
            }
        }, new er.l() { // from class: ax3.y
            @Override // er.l
            public final Object b(Object obj) {
                return h0.T9(this.f15191a, ((Boolean) obj).booleanValue());
            }
        }, b9(ax3.c.g.f14914a), b9(ax3.c.b.f14908a), b9(ax3.c.C0341c.f14909a), b9(new ax3.c.OnShowDialog(bx3.a.b.CLOSE)), new er.l() { // from class: ax3.z
            @Override // er.l
            public final Object b(Object obj) {
                return h0.U9(this.f15193a, (String) obj);
            }
        }, this.commonEndpoints.G()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(h0 h0Var, g30.v vVar) {
        h0Var.d9(new ax3.c.OnToggleBottomSheet(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(h0 h0Var, boolean z15) {
        h0Var.d9(new ax3.c.OnNewPhotoAction(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(h0 h0Var, String str) {
        h0Var.d9(new ax3.c.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vx.a V9(vx.a aVar, Rectangle rectangle, jw3.c cVar) {
        return this.scaleFaceDetectorResultToContainerUC.b(new fw3.c.Params(aVar, rectangle, false, cVar == jw3.c.FILL));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(final h0 h0Var, k10.v vVar) {
        vVar.c(fr.q0.c(ax3.e.class), new er.l() { // from class: ax3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.Y9(this.f14898a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ax3.e.c.class), new er.l() { // from class: ax3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.Z9(this.f14900a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ax3.e.c.Error.class), new er.l() { // from class: ax3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.aa(this.f14925a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ax3.e.c.ProcessingPhoto.class), new er.l() { // from class: ax3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.ba(this.f14932a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ax3.e.b.class), new er.l() { // from class: ax3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.ca(this.f14957a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ax3.e.b.ProcessingPhoto.class), new er.l() { // from class: ax3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.da(this.f14980a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ax3.e.b.PhotoLoaded.class), new er.l() { // from class: ax3.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.ea(this.f14982a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ax3.e.b.Dialog.class), new er.l() { // from class: ax3.t
            @Override // er.l
            public final Object b(Object obj) {
                return h0.fa(this.f15175a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ax3.e.b.Error.class), new er.l() { // from class: ax3.u
            @Override // er.l
            public final Object b(Object obj) {
                return h0.ga(this.f15179a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(h0 h0Var, k10.z zVar) {
        d dVar = h0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ax3.c.d.class), oVar, dVar);
        zVar.v(fr.q0.c(ax3.c.OnSetupData.class), oVar, h0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(h0 h0Var, k10.z zVar) {
        f fVar = h0Var.new f(null);
        zVar.v(fr.q0.c(ax3.c.OnFirstLoadData.class), k10.o.CANCEL_PREVIOUS, fVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(h0 h0Var, k10.z zVar) {
        g gVar = h0Var.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ax3.a.class), oVar, gVar);
        zVar.v(fr.q0.c(ax3.b.class), oVar, new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(h0 h0Var, k10.z zVar) {
        zVar.C(h0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(h0 h0Var, k10.z zVar) {
        j jVar = h0Var.new j(null);
        zVar.v(fr.q0.c(ax3.c.OnNewPhotoPicked.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(h0 h0Var, k10.z zVar) {
        zVar.C(h0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(h0 h0Var, k10.z zVar) {
        m mVar = h0Var.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ax3.c.OnShowDialog.class), oVar, mVar);
        zVar.x(fr.q0.c(ax3.c.OpenUrl.class), oVar, h0Var.new n(null));
        zVar.x(fr.q0.c(ax3.c.C0341c.class), oVar, h0Var.new o(null));
        zVar.v(fr.q0.c(ax3.c.OnToggleBottomSheet.class), oVar, new p(null));
        zVar.x(fr.q0.c(ax3.c.OnNewPhotoAction.class), oVar, h0Var.new q(null));
        zVar.v(fr.q0.c(ax3.c.k.class), oVar, h0Var.new r(null));
        zVar.x(fr.q0.c(ax3.c.n.class), oVar, h0Var.new s(null));
        zVar.x(fr.q0.c(ax3.c.p.class), oVar, h0Var.new t(null));
        zVar.x(fr.q0.c(ax3.c.g.class), oVar, h0Var.new u(null));
        zVar.x(fr.q0.c(ax3.c.b.class), oVar, h0Var.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(h0 h0Var, k10.z zVar) {
        v vVar = new v(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ax3.c.e.class), oVar, vVar);
        zVar.x(fr.q0.c(ax3.c.OnDialogConfirmed.class), oVar, h0Var.new w(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(h0 h0Var, k10.z zVar) {
        x xVar = h0Var.new x(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ax3.a.class), oVar, xVar);
        zVar.v(fr.q0.c(ax3.b.class), oVar, new y(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:55:0x0158  */
    /* JADX WARN: Code duplicated, block: B:58:0x0169  */
    /* JADX WARN: Code duplicated, block: B:59:0x0177  */
    /* JADX WARN: Code duplicated, block: B:61:0x017b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0187  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final Object ha(wx.i.Image image, tq.e<? super dx.i<? extends dx.b, ax3.e.b.ImageData>> eVar) throws Throwable {
        z zVar;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        dx.j<dx.b> jVar;
        wx.i.Image image2;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i19;
        Bitmap bitmap;
        wx.i.Image image3;
        if (eVar instanceof z) {
            zVar = (z) eVar;
            int i25 = zVar.f15140s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                zVar.f15140s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                zVar = new z(eVar);
            }
        } else {
            zVar = new z(eVar);
        }
        Object objH = zVar.f15138q;
        Object objE = uq.b.e();
        int i26 = zVar.f15140s;
        ?? r15 = 2;
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(objH);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        b00.c cVar = this.imageConverter;
                        byte[] bytes = image.getFileContent().getBytes();
                        zVar.f15127d = image;
                        zVar.f15128e = jVarA;
                        zVar.f15129f = vq.j.a(aVar);
                        zVar.f15130g = aVar;
                        zVar.f15131h = aVar;
                        i15 = 0;
                        zVar.f15133k = 0;
                        zVar.f15134l = 0;
                        zVar.f15135m = 0;
                        zVar.f15136n = 0;
                        zVar.f15137p = 0;
                        zVar.f15140s = 1;
                        objH = cVar.h(bytes, zVar);
                        if (objH != objE) {
                            jVar = jVarA;
                            image2 = image;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar = aVar;
                            bVar2 = bVar;
                            bVar3 = bVar2;
                            i19 = 0;
                        }
                        return objE;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        r15 = jVarA;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i26 != 1) {
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bitmap = (Bitmap) zVar.f15132j;
                    bVar = (ex.b) zVar.f15131h;
                    image3 = (wx.i.Image) zVar.f15127d;
                    try {
                        oq.u.b(objH);
                        return new dx.i.Right(new ax3.e.b.ImageData((Bitmap) bVar.a((dx.i) objH), image3, bitmap.getWidth(), bitmap.getHeight()));
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                int i27 = zVar.f15137p;
                i16 = zVar.f15136n;
                i17 = zVar.f15135m;
                i18 = zVar.f15134l;
                int i28 = zVar.f15133k;
                ex.b bVar4 = (ex.b) zVar.f15131h;
                ex.b bVar5 = (ex.b) zVar.f15130g;
                bVar3 = (ex.b) zVar.f15129f;
                jVar = (dx.j) zVar.f15128e;
                image2 = (wx.i.Image) zVar.f15127d;
                try {
                    oq.u.b(objH);
                    i15 = i27;
                    bVar = bVar5;
                    bVar2 = bVar4;
                    i19 = i28;
                } catch (ex.c e25) {
                    e = e25;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    r15 = jVar;
                    px.f fVar2 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(r15));
                    iVarA = r15.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (iVarA instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
                Bitmap bitmap2 = (Bitmap) bVar2.a((dx.i) objH);
                g2.j(zVar.getContext());
                b00.c cVar2 = this.imageConverter;
                b00.f.ReduceDimension reduceDimension = new b00.f.ReduceDimension(this.imagePropertiesProvider.getDefaultImageMaxSide());
                zVar.f15127d = image2;
                zVar.f15128e = jVar;
                zVar.f15129f = vq.j.a(bVar3);
                zVar.f15130g = vq.j.a(bVar);
                zVar.f15131h = bVar;
                zVar.f15132j = bitmap2;
                zVar.f15133k = i19;
                zVar.f15134l = i18;
                zVar.f15135m = i17;
                zVar.f15136n = i16;
                zVar.f15137p = i15;
                zVar.f15140s = 2;
                Object objF = cVar2.f(bitmap2, reduceDimension, zVar);
                if (objF != objE) {
                    bitmap = bitmap2;
                    objH = objF;
                    image3 = image2;
                    return new dx.i.Right(new ax3.e.b.ImageData((Bitmap) bVar.a((dx.i) objH), image3, bitmap.getWidth(), bitmap.getHeight()));
                }
                return objE;
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (Exception e29) {
            e = e29;
        }
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: L9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ax3.c.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: W9, reason: merged with bridge method [inline-methods] */
    public void P5(SetupData data) {
        i00.a.a(this, new b(data, null));
    }

    @Override // zx.b
    public xw.b<ax3.c.a> Y1() {
        return this.navAction;
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        this.singleFaceDetector.b();
        super.Y8();
    }

    @Override // l00.g
    protected k10.t<ax3.e, ax3.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ax3.f.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
