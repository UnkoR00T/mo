package z23;

import cb4.DialogData;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.util.List;
import java.util.Set;
import k23.DetailsModel;
import mx.Label;
import n70.TimeResult;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import tt0.BEAttachmentsConfiguration;
import ww.NavigationTimePickerDialogData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u0097\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0098\u0001BÃ\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00101\u001a\u00020\u0006\u0012\b\b\u0001\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0012\u00107\u001a\u0004\u0018\u000106H\u0082@¢\u0006\u0004\b7\u00108J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020>2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b?\u0010@J \u0010D\u001a\b\u0012\u0004\u0012\u00020C0A*\b\u0012\u0004\u0012\u00020B0AH\u0082@¢\u0006\u0004\bD\u0010EJ\u001b\u0010H\u001a\u00020C*\u00020B2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u00020C*\u00020J2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bK\u0010LJ\u0013\u0010N\u001a\u00020M*\u00020\u0002H\u0002¢\u0006\u0004\bN\u0010OJ\u0018\u0010R\u001a\u00020;2\u0006\u0010Q\u001a\u00020PH\u0096\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020;H\u0096\u0001¢\u0006\u0004\bT\u0010UR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010~R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0083\u0001\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R,\u0010\u0089\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0084\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R'\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u00030\u008b\u00010\u008a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R&\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020M0\u0091\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0099\u0001"}, d2 = {"Lz23/b0;", "Ll00/g;", "Lz23/d;", "Lz23/a;", "Lz23/e;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lb33/g;", "mapper", "Lez/a;", "currentTimeProvider", "Lez/e;", "dateFormatter", "Lmx/c;", "labelProvider", "Lm23/d;", "validateDetailsUseCase", "Lcb4/j;", "dialogVMSFactory", "Lp23/b;", "newReportExitDialogMapper", "Lac4/a;", "callActionWithLoaderUC", "Lut0/a;", "fetchAttachmentsConfigurationUC", "Lbc4/i;", "pickFileWithFilesValidationUC", "Lbc4/k;", "pickPhotoFromCameraWithSizeValidationUseCase", "Lbc4/l;", "pickPhotoFromGalleryUseCase", "La00/b;", "pickedFileToAndroidMapper", "La14/y;", "requestPermissionUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lp23/a;", "filePickerErrorMapper", "Lp23/c;", "storagePermissionDialogMapper", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lac4/n;", "openUriIntentUseCase", "globalSnackBarManager", "Lz23/f;", "contract", "<init>", "(Lyy/a;Lb33/g;Lez/a;Lez/e;Lmx/c;Lm23/d;Lcb4/j;Lp23/b;Lac4/a;Lut0/a;Lbc4/i;Lbc4/k;Lbc4/l;La00/b;La14/y;La14/m;Lp23/a;Lp23/c;Lib4/c;Lhb4/d;Lac4/n;Li70/e;Lz23/f;)V", "Lcb4/d;", "O9", "(Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "error", "Loq/i0;", "S9", "(Ldx/b;)V", "Lhb4/c;", "Q9", "(Ldx/b;)Lhb4/c;", "", "Lwx/i;", "Ln40/i;", "ga", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "", "index", "ea", "(Lwx/i;I)Ln40/i;", "Lzz/h;", "fa", "(Lzz/h;I)Ln40/i;", "Lz23/e$a;", "T9", "(Lz23/d;)Lz23/e$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lb33/g;", "c", "Lez/a;", "d", "Lez/e;", "e", "Lmx/c;", "f", "Lm23/d;", "g", "Lcb4/j;", "h", "Lp23/b;", "j", "Lac4/a;", "k", "Lut0/a;", "l", "Lbc4/i;", "m", "Lbc4/k;", "n", "Lbc4/l;", "p", "La00/b;", "q", "La14/y;", "r", "La14/m;", "s", "Lp23/a;", "t", "Lp23/c;", "v", "Lib4/c;", "w", "Lhb4/d;", "x", "Lac4/n;", "Li70/e;", "z", "Lz23/f;", "A", "Lz23/d;", "initialState", "Lk10/t;", "B", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lz23/a$g;", "C", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", ip.a.f96138c, "Lmu/p0;", "getState", "()Lmu/p0;", "state", "E", "a", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 extends l00.g<z23.d, a> implements z23.e, zx.d, i70.e {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int F = 8;
    private static final Set<wx.d> G;
    private static final Set<wx.d> H;
    private static final List<wx.f> I;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final z23.d initialState;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final k10.t<z23.d, a> stateMachine;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final xw.b<a.g> navAction;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final mu.p0<z23.e.a> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b33.g mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m23.d validateDetailsUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p23.b newReportExitDialogMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ut0.a fetchAttachmentsConfigurationUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final bc4.i pickFileWithFilesValidationUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final bc4.k pickPhotoFromCameraWithSizeValidationUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final bc4.l pickPhotoFromGalleryUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a14.y requestPermissionUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p23.a filePickerErrorMapper;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p23.c storagePermissionDialogMapper;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final ac4.n openUriIntentUseCase;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final z23.f contract;

    /* JADX INFO: renamed from: z23.b0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lz23/b0$a;", "", "<init>", "()V", "", "Lwx/d;", "ALLOWED_FILE_EXTENSIONS_DISPLAYED", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "ALLOWED_FILE_EXTENSIONS_IMAGE", "b", "", "Lwx/f;", "ALLOWED_FILE_TYPES_GENERIC", "Ljava/util/List;", "c", "()Ljava/util/List;", "", "MAX_FILE_SIZE_BYTES", "F", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final Set<wx.d> a() {
            return b0.G;
        }

        public final Set<wx.d> b() {
            return b0.H;
        }

        public final List<wx.f> c() {
            return b0.I;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f232525d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f232527f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232525d = obj;
            this.f232527f |= PKIFailureInfo.systemUnavail;
            return b0.this.O9(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<z23.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f232528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f232529b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f232530a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f232531b;

            /* JADX INFO: renamed from: z23.b0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6245a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f232532d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f232533e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f232534f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f232536h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f232537j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f232538k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f232539l;

                public C6245a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f232532d = obj;
                    this.f232533e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, b0 b0Var) {
                this.f232530a = hVar;
                this.f232531b = b0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6245a c6245a;
                if (eVar instanceof C6245a) {
                    c6245a = (C6245a) eVar;
                    int i15 = c6245a.f232533e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6245a.f232533e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6245a = new C6245a(eVar);
                    }
                } else {
                    c6245a = new C6245a(eVar);
                }
                Object obj2 = c6245a.f232532d;
                Object objE = uq.b.e();
                int i16 = c6245a.f232533e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f232530a;
                    z23.e.a aVarT9 = this.f232531b.T9((z23.d) obj);
                    c6245a.f232534f = vq.j.a(obj);
                    c6245a.f232536h = vq.j.a(c6245a);
                    c6245a.f232537j = vq.j.a(obj);
                    c6245a.f232538k = vq.j.a(hVar);
                    c6245a.f232539l = 0;
                    c6245a.f232533e = 1;
                    if (hVar.F(aVarT9, c6245a) == objE) {
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
            this.f232528a = gVar;
            this.f232529b = b0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super z23.e.a> hVar, tq.e eVar) {
            Object objA = this.f232528a.a(new a(hVar, this.f232529b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz23/a$g;", "action", "Lz23/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lz23/a$g;Lz23/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<a.g, z23.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232541f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.g gVar = (a.g) this.f232541f;
            Object objE = uq.b.e();
            int i15 = this.f232540e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.g> bVarY1 = b0.this.Y1();
                this.f232541f = vq.j.a(gVar);
                this.f232540e = 1;
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
        public final Object w(a.g gVar, z23.d dVar, tq.e<? super oq.i0> eVar) {
            d dVar2 = b0.this.new d(eVar);
            dVar2.f232541f = gVar;
            return dVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz23/a$f;", "<unused var>", "Lz23/d;", "Loq/i0;", "<anonymous>", "(Lz23/a$f;Lz23/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a.f, z23.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232543e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f232543e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = b0.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            b0 b0Var = b0.this;
            if (iVarA instanceof dx.i.Left) {
                b0Var.y(new p50.a.Default(b0Var.labelProvider.c(h23.b.f80140g0), false, null, 6, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.f fVar, z23.d dVar, tq.e<? super oq.i0> eVar) {
            return b0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lz23/d$b;", "state", "Lk10/l;", "Lz23/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<z23.d.b>, tq.e<? super k10.l<? extends z23.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232546f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lz23/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends z23.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f232548e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f232549f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f232550g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ b0 f232551h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k10.c0<z23.d.b> f232552j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, k10.c0<z23.d.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f232551h = b0Var;
                this.f232552j = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final z23.d.LoadingError X(b0 b0Var, dx.b bVar, z23.d.b bVar2) {
                return new z23.d.LoadingError(b0Var.Q9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public static final z23.d.a.Screen Y(b0 b0Var, BEAttachmentsConfiguration bEAttachmentsConfiguration, List list, List list2, z23.d.b bVar) {
                k23.f dateAnswer;
                fz.b.OffsetTime selectedTime;
                String description;
                DetailsModel detailsModelI0 = b0Var.contract.i0();
                if (detailsModelI0 != null) {
                    dateAnswer = detailsModelI0.getDateAnswer();
                    selectedTime = null;
                } else {
                    dateAnswer = null;
                    selectedTime = null;
                }
                hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
                DetailsModel detailsModelI1 = b0Var.contract.i0();
                fz.b selectedDate = detailsModelI1 != null ? detailsModelI1.getSelectedDate() : selectedTime;
                DetailsModel detailsModelI2 = b0Var.contract.i0();
                if (detailsModelI2 != null) {
                    selectedTime = detailsModelI2.getSelectedTime();
                }
                fz.b.OffsetTime offsetTime = selectedTime;
                DetailsModel detailsModelI3 = b0Var.contract.i0();
                if (detailsModelI3 == null || (description = detailsModelI3.getDescription()) == null) {
                    description = "";
                }
                return new z23.d.a.Screen(new ContentData(dateAnswer, c2039b, selectedDate, c2039b, offsetTime, c2039b, description, c2039b, bEAttachmentsConfiguration.getMaxFileAmount(), list, list2, g30.v.HIDDEN, null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final BEAttachmentsConfiguration bEAttachmentsConfiguration;
                final List<wx.i> list;
                Object objE = uq.b.e();
                int i15 = this.f232550g;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ut0.a aVar = this.f232551h.fetchAttachmentsConfigurationUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f232550g = 1;
                    obj = aVar.c(c1792a, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.f232549f;
                    bEAttachmentsConfiguration = (BEAttachmentsConfiguration) this.f232548e;
                    oq.u.b(obj);
                }
                final List list2 = (List) obj;
                k10.c0<z23.d.b> c0Var = this.f232552j;
                final b0 b0Var = this.f232551h;
                return c0Var.d(new er.l() { // from class: z23.d0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.f.a.Y(b0Var, bEAttachmentsConfiguration, list, list2, (d.b) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                k10.c0<z23.d.b> c0Var2 = this.f232552j;
                final b0 b0Var2 = this.f232551h;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: z23.c0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.f.a.X(b0Var2, bVar, (d.b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                bEAttachmentsConfiguration = (BEAttachmentsConfiguration) ((dx.i.Right) iVar).b();
                this.f232551h.contract.s0(bEAttachmentsConfiguration);
                List<wx.i> listH = this.f232551h.contract.h();
                b0 b0Var3 = this.f232551h;
                this.f232548e = bEAttachmentsConfiguration;
                this.f232549f = listH;
                this.f232550g = 2;
                Object objGa = b0Var3.ga(listH, this);
                if (objGa != objE) {
                    list = listH;
                    obj = objGa;
                    final List list3 = (List) obj;
                    k10.c0<z23.d.b> c0Var3 = this.f232552j;
                    final b0 b0Var4 = this.f232551h;
                    return c0Var3.d(new er.l() { // from class: z23.d0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.f.a.Y(b0Var4, bEAttachmentsConfiguration, list, list3, (d.b) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f232551h, this.f232552j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends z23.d>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f232546f;
            Object objE = uq.b.e();
            int i15 = this.f232545e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = b0.this.callActionWithLoaderUC;
            a aVar2 = new a(b0.this, c0Var, null);
            this.f232546f = vq.j.a(c0Var);
            this.f232545e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<z23.d.b> c0Var, tq.e<? super k10.l<? extends z23.d>> eVar) {
            return ((f) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = b0.this.new f(eVar);
            fVar.f232546f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz23/a$e;", "<unused var>", "Lk10/c0;", "Lz23/d$c;", "state", "Lk10/l;", "Lz23/d;", "<anonymous>", "(Lz23/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a.e, k10.c0<z23.d.LoadingError>, tq.e<? super k10.l<? extends z23.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232554f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z23.d.b O(z23.d.LoadingError loadingError) {
            return z23.d.b.f232646a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f232554f;
            uq.b.e();
            if (this.f232553e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: z23.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.g.O((d.LoadingError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.e eVar, k10.c0<z23.d.LoadingError> c0Var, tq.e<? super k10.l<? extends z23.d>> eVar2) {
            g gVar = new g(eVar2);
            gVar.f232554f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz23/a$d;", "<unused var>", "Lz23/d$c;", "Loq/i0;", "<anonymous>", "(Lz23/a$d;Lz23/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.d, z23.d.LoadingError, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232555e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f232555e;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 b0Var = b0.this;
                a.g.C6243a c6243a = a.g.C6243a.f232465a;
                this.f232555e = 1;
                if (b0Var.F(c6243a, this) == objE) {
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
        public final Object w(a.d dVar, z23.d.LoadingError loadingError, tq.e<? super oq.i0> eVar) {
            return b0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz23/a$q;", "action", "Lk10/c0;", "Lz23/d$a$b;", "state", "Lk10/l;", "Lz23/d;", "<anonymous>", "(Lz23/a$q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a.SelectDateAnswer, k10.c0<z23.d.a.Screen>, tq.e<? super k10.l<? extends z23.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232558f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f232559g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z23.d.a.Screen O(k10.c0 c0Var, a.SelectDateAnswer selectDateAnswer, z23.d.a.Screen screen) {
            return screen.a(ContentData.b(((z23.d.a.Screen) c0Var.a()).getData(), selectDateAnswer.getDateAnswer(), hz.b.C2039b.f86846c, null, null, null, null, null, null, 0, null, null, null, null, 8188, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SelectDateAnswer selectDateAnswer = (a.SelectDateAnswer) this.f232558f;
            final k10.c0 c0Var = (k10.c0) this.f232559g;
            uq.b.e();
            if (this.f232557e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: z23.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.i.O(c0Var, selectDateAnswer, (d.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SelectDateAnswer selectDateAnswer, k10.c0<z23.d.a.Screen> c0Var, tq.e<? super k10.l<? extends z23.d>> eVar) {
            i iVar = new i(eVar);
            iVar.f232558f = selectDateAnswer;
            iVar.f232559g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz23/a$k;", "<unused var>", "Lz23/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lz23/a$k;Lz23/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a.k, z23.d.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f232560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f232561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f232562g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f232563h;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(b0 b0Var, LocalDate localDate) {
            b0Var.d9(new a.OnDateChanged(new fz.b.LocalDate(localDate)));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            LocalDate localDate;
            z23.d.a.Screen screen = (z23.d.a.Screen) this.f232563h;
            Object objE = uq.b.e();
            int i15 = this.f232562g;
            if (i15 == 0) {
                oq.u.b(obj);
                LocalDateTime localDateTimeI = b0.this.currentTimeProvider.i();
                fz.b.LocalDate selectedDate = screen.getData().getSelectedDate();
                if (selectedDate == null || (localDate = selectedDate.getDate()) == null) {
                    localDate = localDateTimeI.toLocalDate();
                }
                LocalDate localDate2 = localDate;
                b0 b0Var = b0.this;
                final b0 b0Var2 = b0.this;
                a.g.DatePicker datePicker = new a.g.DatePicker(new uw.j.Single(null, localDate2, new er.l() { // from class: z23.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.j.O(b0Var2, (LocalDate) obj2);
                    }
                }, null, ez.d.h(new fz.b.LocalDateTime(localDateTimeI)).getDate(), 9, null));
                this.f232563h = vq.j.a(screen);
                this.f232560e = vq.j.a(localDateTimeI);
                this.f232561f = vq.j.a(localDate2);
                this.f232562g = 1;
                if (b0Var.F(datePicker, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.k kVar, z23.d.a.Screen screen, tq.e<? super oq.i0> eVar) {
            j jVar = b0.this.new j(eVar);
            jVar.f232563h = screen;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz23/a$j;", "action", "Lk10/c0;", "Lz23/d$a$b;", "state", "Lk10/l;", "Lz23/d;", "<anonymous>", "(Lz23/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<a.OnDateChanged, k10.c0<z23.d.a.Screen>, tq.e<? super k10.l<? extends z23.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f232567g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z23.d.a.Screen O(k10.c0 c0Var, a.OnDateChanged onDateChanged, z23.d.a.Screen screen) {
            ContentData data = ((z23.d.a.Screen) c0Var.a()).getData();
            fz.b.LocalDate date = onDateChanged.getDate();
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            return screen.a(ContentData.b(data, null, null, date, c2039b, null, c2039b, null, null, 0, null, null, null, null, 8147, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.OnDateChanged onDateChanged = (a.OnDateChanged) this.f232566f;
            final k10.c0 c0Var = (k10.c0) this.f232567g;
            uq.b.e();
            if (this.f232565e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: z23.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.k.O(c0Var, onDateChanged, (d.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.OnDateChanged onDateChanged, k10.c0<z23.d.a.Screen> c0Var, tq.e<? super k10.l<? extends z23.d>> eVar) {
            k kVar = new k(eVar);
            kVar.f232566f = onDateChanged;
            kVar.f232567g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz23/a$m;", "<unused var>", "Lz23/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lz23/a$m;Lz23/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a.m, z23.d.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f232568e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f232569f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f232570g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f232571h;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(b0 b0Var, TimeResult timeResult) {
            b0Var.d9(new a.OnTimeChanged(timeResult.a()));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            z23.d.a.Screen screen = (z23.d.a.Screen) this.f232571h;
            Object objE = uq.b.e();
            int i15 = this.f232570g;
            if (i15 == 0) {
                oq.u.b(obj);
                LocalDateTime localDateTimeI = b0.this.currentTimeProvider.i();
                fz.b.OffsetTime selectedTime = screen.getData().getSelectedTime();
                OffsetTime date = selectedTime != null ? selectedTime.getDate() : null;
                b0 b0Var = b0.this;
                Label labelC = b0.this.labelProvider.c(h23.b.D);
                int hour = date != null ? date.getHour() : localDateTimeI.getHour();
                int minute = date != null ? date.getMinute() : localDateTimeI.getMinute();
                Label labelC2 = b0.this.labelProvider.c(h23.b.f80154l);
                Label labelC3 = b0.this.labelProvider.c(h23.b.f80133e);
                final b0 b0Var2 = b0.this;
                a.g.TimePicker timePicker = new a.g.TimePicker(new NavigationTimePickerDialogData(labelC, hour, minute, labelC2, labelC3, new er.l() { // from class: z23.i0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.l.O(b0Var2, (TimeResult) obj2);
                    }
                }));
                this.f232571h = vq.j.a(screen);
                this.f232568e = vq.j.a(localDateTimeI);
                this.f232569f = vq.j.a(date);
                this.f232570g = 1;
                if (b0Var.F(timePicker, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.m mVar, z23.d.a.Screen screen, tq.e<? super oq.i0> eVar) {
            l lVar = b0.this.new l(eVar);
            lVar.f232571h = screen;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz23/a$l;", "action", "Lk10/c0;", "Lz23/d$a$b;", "state", "Lk10/l;", "Lz23/d;", "<anonymous>", "(Lz23/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a.OnTimeChanged, k10.c0<z23.d.a.Screen>, tq.e<? super k10.l<? extends z23.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232574f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f232575g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z23.d.a.Screen O(k10.c0 c0Var, fz.b.OffsetTime offsetTime, z23.d.a.Screen screen) {
            return screen.a(ContentData.b(((z23.d.a.Screen) c0Var.a()).getData(), null, null, null, null, offsetTime, hz.b.C2039b.f86846c, null, null, 0, null, null, null, null, 8143, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OffsetTime date;
            a.OnTimeChanged onTimeChanged = (a.OnTimeChanged) this.f232574f;
            final k10.c0 c0Var = (k10.c0) this.f232575g;
            uq.b.e();
            if (this.f232573e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            OffsetTime offsetTimeG = b0.this.currentTimeProvider.g();
            fz.b.OffsetTime selectedTime = ((z23.d.a.Screen) c0Var.a()).getData().getSelectedTime();
            if (selectedTime != null && (date = selectedTime.getDate()) != null) {
                offsetTimeG = date;
            }
            final fz.b.OffsetTime offsetTime = new fz.b.OffsetTime(offsetTimeG.withSecond(onTimeChanged.getIncidentTime().getDate().getSecond()).withMinute(onTimeChanged.getIncidentTime().getDate().getMinute()).withHour(onTimeChanged.getIncidentTime().getDate().getHour()));
            return c0Var.d(new er.l() { // from class: z23.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.m.O(c0Var, offsetTime, (d.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.OnTimeChanged onTimeChanged, k10.c0<z23.d.a.Screen> c0Var, tq.e<? super k10.l<? extends z23.d>> eVar) {
            m mVar = b0.this.new m(eVar);
            mVar.f232574f = onTimeChanged;
            mVar.f232575g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz23/a$u;", "action", "Lk10/c0;", "Lz23/d$a$b;", "state", "Lk10/l;", "Lz23/d;", "<anonymous>", "(Lz23/a$u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<a.UpdateDescription, k10.c0<z23.d.a.Screen>, tq.e<? super k10.l<? extends z23.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232578f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f232579g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z23.d.a.Screen O(k10.c0 c0Var, a.UpdateDescription updateDescription, z23.d.a.Screen screen) {
            return screen.a(ContentData.b(((z23.d.a.Screen) c0Var.a()).getData(), null, null, null, null, null, null, updateDescription.getDescription(), hz.b.C2039b.f86846c, 0, null, null, null, null, 7999, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.UpdateDescription updateDescription = (a.UpdateDescription) this.f232578f;
            final k10.c0 c0Var = (k10.c0) this.f232579g;
            uq.b.e();
            if (this.f232577e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: z23.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.n.O(c0Var, updateDescription, (d.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.UpdateDescription updateDescription, k10.c0<z23.d.a.Screen> c0Var, tq.e<? super k10.l<? extends z23.d>> eVar) {
            n nVar = new n(eVar);
            nVar.f232578f = updateDescription;
            nVar.f232579g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz23/a$h;", "<unused var>", "Lk10/c0;", "Lz23/d$a$b;", "state", "Lk10/l;", "Lz23/d;", "<anonymous>", "(Lz23/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<a.h, k10.c0<z23.d.a.Screen>, tq.e<? super k10.l<? extends z23.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f232580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f232581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f232582g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f232583h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f232584j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f232585k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f232586l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f232587m;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z23.d.a.Screen O(k10.c0 c0Var, hz.b bVar, hz.b bVar2, hz.b bVar3, String str, hz.b bVar4, d60.j jVar, z23.d.a.Screen screen) {
            return screen.a(ContentData.b(((z23.d.a.Screen) c0Var.a()).getData(), null, bVar, null, bVar2, null, bVar3, str, bVar4, 0, null, null, g30.v.HIDDEN, jVar, 1813, null));
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0120  */
        /* JADX WARN: Code duplicated, block: B:30:0x015b  */
        /* JADX WARN: Code duplicated, block: B:33:0x016c A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:34:0x0174  */
        /* JADX WARN: Code duplicated, block: B:42:0x0190  */
        /* JADX WARN: Code duplicated, block: B:43:0x0198  */
        /* JADX WARN: Code duplicated, block: B:46:0x019d  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hz.b bVar;
            hz.b bVarA;
            Object objF;
            hz.b bVar2;
            hz.b bVar3;
            hz.b bVarA2;
            String strE;
            Object objF2;
            hz.b bVar4;
            hz.b bVar5;
            String str;
            hz.b bVar6;
            hz.b bVarA3;
            d60.j jVar;
            final hz.b bVar7;
            final hz.b bVar8;
            final hz.b bVar9;
            final d60.j jVar2;
            final hz.b bVar10;
            final String str2;
            String str3;
            d60.j jVar3;
            hz.b bVar11;
            final k10.c0 c0Var = (k10.c0) this.f232587m;
            Object objE = uq.b.e();
            int i15 = this.f232586l;
            if (i15 == 0) {
                oq.u.b(obj);
                m23.d dVar = b0.this.validateDetailsUseCase;
                m23.d.b.Answer answer = new m23.d.b.Answer(((z23.d.a.Screen) c0Var.a()).getData().getSelectedDateAnswer());
                this.f232587m = c0Var;
                this.f232586l = 1;
                obj = dVar.f(answer, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 == 2) {
                    bVar = (hz.b) this.f232580e;
                    oq.u.b(obj);
                    bVarA = ((hz.g) obj).a();
                    m23.d dVar2 = b0.this.validateDetailsUseCase;
                    m23.d.b.Time time = new m23.d.b.Time(((z23.d.a.Screen) c0Var.a()).getData().getSelectedDateAnswer(), ((z23.d.a.Screen) c0Var.a()).getData().getSelectedDate(), ((z23.d.a.Screen) c0Var.a()).getData().getSelectedTime());
                    this.f232587m = c0Var;
                    this.f232580e = bVar;
                    this.f232581f = bVarA;
                    this.f232586l = 3;
                    objF = dVar2.f(time, this);
                    if (objF != objE) {
                        hz.b bVar12 = bVar;
                        bVar2 = bVarA;
                        obj = objF;
                        bVar3 = bVar12;
                        bVarA2 = ((hz.g) obj).a();
                        strE = dz.e.e(((z23.d.a.Screen) c0Var.a()).getData().getDescription());
                        m23.d dVar3 = b0.this.validateDetailsUseCase;
                        m23.d.b.Description description = new m23.d.b.Description(strE);
                        this.f232587m = c0Var;
                        this.f232580e = bVar3;
                        this.f232581f = bVar2;
                        this.f232582g = bVarA2;
                        this.f232583h = strE;
                        this.f232586l = 4;
                        objF2 = dVar3.f(description, this);
                        if (objF2 != objE) {
                            bVar4 = bVarA2;
                            obj = objF2;
                            hz.b bVar13 = bVar3;
                            bVar5 = bVar2;
                            str = strE;
                            bVar6 = bVar13;
                            bVarA3 = ((hz.g) obj).a();
                            if (!(bVar6 instanceof hz.b.Invalid)) {
                                jVar = new d60.j(z23.c.ANSWER);
                            } else if (bVarA3 instanceof hz.b.Invalid) {
                                jVar = new d60.j(z23.c.DESCRIPTION);
                            } else {
                                jVar = null;
                            }
                            if (!(bVar6 instanceof hz.b.d)) {
                            }
                            hz.b bVar14 = bVar5;
                            bVar7 = bVar4;
                            bVar8 = bVar14;
                            bVar9 = bVar6;
                            jVar2 = jVar;
                            bVar10 = bVarA3;
                            str2 = str;
                            return c0Var.b(new er.l() { // from class: z23.l0
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return b0.o.O(c0Var, bVar9, bVar8, bVar7, str2, bVar10, jVar2, (d.a.Screen) obj2);
                                }
                            });
                        }
                    }
                    return objE;
                }
                if (i15 == 3) {
                    bVar2 = (hz.b) this.f232581f;
                    bVar3 = (hz.b) this.f232580e;
                    oq.u.b(obj);
                    bVarA2 = ((hz.g) obj).a();
                    strE = dz.e.e(((z23.d.a.Screen) c0Var.a()).getData().getDescription());
                    m23.d dVar4 = b0.this.validateDetailsUseCase;
                    m23.d.b.Description description2 = new m23.d.b.Description(strE);
                    this.f232587m = c0Var;
                    this.f232580e = bVar3;
                    this.f232581f = bVar2;
                    this.f232582g = bVarA2;
                    this.f232583h = strE;
                    this.f232586l = 4;
                    objF2 = dVar4.f(description2, this);
                    if (objF2 != objE) {
                        bVar4 = bVarA2;
                        obj = objF2;
                        hz.b bVar15 = bVar3;
                        bVar5 = bVar2;
                        str = strE;
                        bVar6 = bVar15;
                        bVarA3 = ((hz.g) obj).a();
                        if (!(bVar6 instanceof hz.b.Invalid)) {
                            jVar = new d60.j(z23.c.ANSWER);
                        } else if (bVarA3 instanceof hz.b.Invalid) {
                            jVar = new d60.j(z23.c.DESCRIPTION);
                        } else {
                            jVar = null;
                        }
                        if (!(bVar6 instanceof hz.b.d)) {
                        }
                        hz.b bVar16 = bVar5;
                        bVar7 = bVar4;
                        bVar8 = bVar16;
                        bVar9 = bVar6;
                        jVar2 = jVar;
                        bVar10 = bVarA3;
                        str2 = str;
                        return c0Var.b(new er.l() { // from class: z23.l0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return b0.o.O(c0Var, bVar9, bVar8, bVar7, str2, bVar10, jVar2, (d.a.Screen) obj2);
                            }
                        });
                    }
                    return objE;
                }
                if (i15 == 4) {
                    str = (String) this.f232583h;
                    bVar4 = (hz.b) this.f232582g;
                    bVar5 = (hz.b) this.f232581f;
                    bVar6 = (hz.b) this.f232580e;
                    oq.u.b(obj);
                    bVarA3 = ((hz.g) obj).a();
                    if (!(bVar6 instanceof hz.b.Invalid) || (bVar5 instanceof hz.b.Invalid) || (bVar4 instanceof hz.b.Invalid)) {
                        jVar = new d60.j(z23.c.ANSWER);
                    } else if (bVarA3 instanceof hz.b.Invalid) {
                        jVar = new d60.j(z23.c.DESCRIPTION);
                    } else {
                        jVar = null;
                    }
                    if (!(bVar6 instanceof hz.b.d) && (bVar5 instanceof hz.b.d) && (bVar4 instanceof hz.b.d) && (bVarA3 instanceof hz.b.d)) {
                        z23.f fVar = b0.this.contract;
                        k23.f selectedDateAnswer = ((z23.d.a.Screen) c0Var.a()).getData().getSelectedDateAnswer();
                        if (selectedDateAnswer == null) {
                            selectedDateAnswer = k23.f.NO;
                        }
                        fVar.i3(new DetailsModel(selectedDateAnswer, ((z23.d.a.Screen) c0Var.a()).getData().getSelectedDate(), ((z23.d.a.Screen) c0Var.a()).getData().getSelectedTime(), str));
                        b0 b0Var = b0.this;
                        a.g.d dVar5 = a.g.d.f232468a;
                        this.f232587m = c0Var;
                        this.f232580e = bVar6;
                        this.f232581f = bVar5;
                        this.f232582g = bVar4;
                        this.f232583h = str;
                        this.f232584j = bVarA3;
                        this.f232585k = jVar;
                        this.f232586l = 5;
                        if (b0Var.F(dVar5, this) != objE) {
                            str3 = str;
                            jVar3 = jVar;
                            bVar11 = bVarA3;
                        }
                        return objE;
                    }
                    hz.b bVar17 = bVar5;
                    bVar7 = bVar4;
                    bVar8 = bVar17;
                    bVar9 = bVar6;
                    jVar2 = jVar;
                    bVar10 = bVarA3;
                    str2 = str;
                    return c0Var.b(new er.l() { // from class: z23.l0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.o.O(c0Var, bVar9, bVar8, bVar7, str2, bVar10, jVar2, (d.a.Screen) obj2);
                        }
                    });
                }
                if (i15 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar3 = (d60.j) this.f232585k;
                bVar11 = (hz.b) this.f232584j;
                str3 = (String) this.f232583h;
                bVar4 = (hz.b) this.f232582g;
                bVar5 = (hz.b) this.f232581f;
                bVar6 = (hz.b) this.f232580e;
                oq.u.b(obj);
            }
            hz.b bVar18 = bVar6;
            str2 = str3;
            bVar9 = bVar18;
            hz.b bVar19 = bVar5;
            bVar7 = bVar4;
            bVar8 = bVar19;
            jVar2 = jVar3;
            bVar10 = bVar11;
            return c0Var.b(new er.l() { // from class: z23.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.o.O(c0Var, bVar9, bVar8, bVar7, str2, bVar10, jVar2, (d.a.Screen) obj2);
                }
            });
            hz.b bVarA4 = ((hz.g) obj).a();
            m23.d dVar6 = b0.this.validateDetailsUseCase;
            m23.d.b.Date date = new m23.d.b.Date(((z23.d.a.Screen) c0Var.a()).getData().getSelectedDateAnswer(), ((z23.d.a.Screen) c0Var.a()).getData().getSelectedDate());
            this.f232587m = c0Var;
            this.f232580e = bVarA4;
            this.f232586l = 2;
            Object objF3 = dVar6.f(date, this);
            if (objF3 != objE) {
                bVar = bVarA4;
                obj = objF3;
                bVarA = ((hz.g) obj).a();
                m23.d dVar7 = b0.this.validateDetailsUseCase;
                m23.d.b.Time time2 = new m23.d.b.Time(((z23.d.a.Screen) c0Var.a()).getData().getSelectedDateAnswer(), ((z23.d.a.Screen) c0Var.a()).getData().getSelectedDate(), ((z23.d.a.Screen) c0Var.a()).getData().getSelectedTime());
                this.f232587m = c0Var;
                this.f232580e = bVar;
                this.f232581f = bVarA;
                this.f232586l = 3;
                objF = dVar7.f(time2, this);
                if (objF != objE) {
                    hz.b bVar110 = bVar;
                    bVar2 = bVarA;
                    obj = objF;
                    bVar3 = bVar110;
                    bVarA2 = ((hz.g) obj).a();
                    strE = dz.e.e(((z23.d.a.Screen) c0Var.a()).getData().getDescription());
                    m23.d dVar8 = b0.this.validateDetailsUseCase;
                    m23.d.b.Description description3 = new m23.d.b.Description(strE);
                    this.f232587m = c0Var;
                    this.f232580e = bVar3;
                    this.f232581f = bVar2;
                    this.f232582g = bVarA2;
                    this.f232583h = strE;
                    this.f232586l = 4;
                    objF2 = dVar8.f(description3, this);
                    if (objF2 != objE) {
                        bVar4 = bVarA2;
                        obj = objF2;
                        hz.b bVar111 = bVar3;
                        bVar5 = bVar2;
                        str = strE;
                        bVar6 = bVar111;
                        bVarA3 = ((hz.g) obj).a();
                        if (!(bVar6 instanceof hz.b.Invalid)) {
                            jVar = new d60.j(z23.c.ANSWER);
                        } else if (bVarA3 instanceof hz.b.Invalid) {
                            jVar = new d60.j(z23.c.DESCRIPTION);
                        } else {
                            jVar = null;
                        }
                        if (!(bVar6 instanceof hz.b.d)) {
                        }
                        hz.b bVar112 = bVar5;
                        bVar7 = bVar4;
                        bVar8 = bVar112;
                        bVar9 = bVar6;
                        jVar2 = jVar;
                        bVar10 = bVarA3;
                        str2 = str;
                        return c0Var.b(new er.l() { // from class: z23.l0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return b0.o.O(c0Var, bVar9, bVar8, bVar7, str2, bVar10, jVar2, (d.a.Screen) obj2);
                            }
                        });
                    }
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.h hVar, k10.c0<z23.d.a.Screen> c0Var, tq.e<? super k10.l<? extends z23.d>> eVar) {
            o oVar = b0.this.new o(eVar);
            oVar.f232587m = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz23/a$n;", "action", "Lz23/d$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lz23/a$n;Lz23/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a.OpenPickedFileUri, z23.d.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232590f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.OpenPickedFileUri openPickedFileUri = (a.OpenPickedFileUri) this.f232590f;
            Object objE = uq.b.e();
            int i15 = this.f232589e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.n nVar = b0.this.openUriIntentUseCase;
                ac4.n.Params params = new ac4.n.Params(openPickedFileUri.getPickedFile().getMetadata().getUri());
                this.f232590f = vq.j.a(openPickedFileUri);
                this.f232589e = 1;
                if (nVar.c(params, this) == objE) {
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
        public final Object w(a.OpenPickedFileUri openPickedFileUri, z23.d.a.Screen screen, tq.e<? super oq.i0> eVar) {
            p pVar = b0.this.new p(eVar);
            pVar.f232590f = openPickedFileUri;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz23/a$s;", "<unused var>", "Lz23/d$a$b;", "Loq/i0;", "<anonymous>", "(Lz23/a$s;Lz23/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<a.s, z23.d.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232592e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f232592e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(new a.OnBottomSheetStateChanged(g30.v.EXPANDED));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.s sVar, z23.d.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return b0.this.new q(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz23/a$i;", "action", "Lk10/c0;", "Lz23/d$a$b;", "state", "Lk10/l;", "Lz23/d;", "<anonymous>", "(Lz23/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<a.OnBottomSheetStateChanged, k10.c0<z23.d.a.Screen>, tq.e<? super k10.l<? extends z23.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f232596g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z23.d.a.Screen O(k10.c0 c0Var, a.OnBottomSheetStateChanged onBottomSheetStateChanged, z23.d.a.Screen screen) {
            return screen.a(ContentData.b(((z23.d.a.Screen) c0Var.a()).getData(), null, null, null, null, null, null, null, null, 0, null, null, onBottomSheetStateChanged.getValue(), null, 6143, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.OnBottomSheetStateChanged onBottomSheetStateChanged = (a.OnBottomSheetStateChanged) this.f232595f;
            final k10.c0 c0Var = (k10.c0) this.f232596g;
            uq.b.e();
            if (this.f232594e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: z23.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.r.O(c0Var, onBottomSheetStateChanged, (d.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0<z23.d.a.Screen> c0Var, tq.e<? super k10.l<? extends z23.d>> eVar) {
            r rVar = new r(eVar);
            rVar.f232595f = onBottomSheetStateChanged;
            rVar.f232596g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz23/a$t;", "<unused var>", "Lz23/d$a$b;", "Loq/i0;", "<anonymous>", "(Lz23/a$t;Lz23/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<a.t, z23.d.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232597e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        
            if (r13 == r0) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r12.f232597e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r13)
                goto L7a
            L12:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1a:
                oq.u.b(r13)
                goto L2c
            L1e:
                oq.u.b(r13)
                z23.b0 r13 = z23.b0.this
                r12.f232597e = r3
                java.lang.Object r13 = z23.b0.s9(r13, r12)
                if (r13 != r0) goto L2c
                goto L79
            L2c:
                cb4.d r13 = (cb4.DialogData) r13
                if (r13 == 0) goto L3d
                z23.b0 r0 = z23.b0.this
                z23.a$r r1 = new z23.a$r
                r1.<init>(r13)
                z23.b0.r9(r0, r1)
                oq.i0 r13 = oq.i0.f148189a
                return r13
            L3d:
                z23.b0 r13 = z23.b0.this
                bc4.k r13 = z23.b0.G9(r13)
                bc4.k$a r3 = new bc4.k$a
                z23.b0 r1 = z23.b0.this
                ez.e r1 = z23.b0.z9(r1)
                fz.b$d r4 = new fz.b$d
                z23.b0 r5 = z23.b0.this
                ez.a r5 = z23.b0.y9(r5)
                java.time.LocalDateTime r5 = r5.i()
                r4.<init>(r5)
                fz.c r5 = fz.c.NO_SPACES
                java.lang.String r4 = r1.d(r4, r5)
                r1 = 1259902592(0x4b189680, float:1.0E7)
                java.lang.Float r7 = vq.b.d(r1)
                r10 = 54
                r11 = 0
                r5 = 0
                r6 = 0
                r8 = 0
                r9 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r12.f232597e = r2
                java.lang.Object r13 = r13.c(r3, r12)
                if (r13 != r0) goto L7a
            L79:
                return r0
            L7a:
                dx.i r13 = (dx.i) r13
                z23.b0 r0 = z23.b0.this
                boolean r1 = r13 instanceof dx.i.Left
                if (r1 == 0) goto L8e
                dx.i$b r13 = (dx.i.Left) r13
                java.lang.Object r13 = r13.b()
                dx.b r13 = (dx.b) r13
                z23.b0.K9(r0, r13)
                goto Laa
            L8e:
                boolean r1 = r13 instanceof dx.i.Right
                if (r1 == 0) goto Lad
                dx.i$c r13 = (dx.i.Right) r13
                java.lang.Object r13 = r13.b()
                bc4.k$b r13 = (bc4.k.Result) r13
                z23.a$a r1 = new z23.a$a
                wx.i$a r13 = r13.getImageFile()
                java.util.List r13 = pq.v.e(r13)
                r1.<init>(r13)
                z23.b0.r9(r0, r1)
            Laa:
                oq.i0 r13 = oq.i0.f148189a
                return r13
            Lad:
                oq.p r13 = new oq.p
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: z23.b0.s.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.t tVar, z23.d.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return b0.this.new s(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz23/a$p;", "<unused var>", "Lz23/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lz23/a$p;Lz23/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<a.p, z23.d.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232600f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        
            if (r9 == r1) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z23.b0.t.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.p pVar, z23.d.a.Screen screen, tq.e<? super oq.i0> eVar) {
            t tVar = b0.this.new t(eVar);
            tVar.f232600f = screen;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz23/a$o;", "<unused var>", "Lz23/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lz23/a$o;Lz23/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<a.o, z23.d.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232603f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        
            if (r9 == r1) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f232603f
                z23.d$a$b r0 = (z23.d.a.Screen) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r8.f232602e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r9)
                goto L76
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                oq.u.b(r9)
                goto L32
            L22:
                oq.u.b(r9)
                z23.b0 r9 = z23.b0.this
                r8.f232603f = r0
                r8.f232602e = r4
                java.lang.Object r9 = z23.b0.s9(r9, r8)
                if (r9 != r1) goto L32
                goto L75
            L32:
                cb4.d r9 = (cb4.DialogData) r9
                if (r9 == 0) goto L43
                z23.b0 r0 = z23.b0.this
                z23.a$r r1 = new z23.a$r
                r1.<init>(r9)
                z23.b0.r9(r0, r1)
                oq.i0 r9 = oq.i0.f148189a
                return r9
            L43:
                z23.b0 r9 = z23.b0.this
                bc4.i r9 = z23.b0.F9(r9)
                z23.b0$a r2 = z23.b0.INSTANCE
                java.util.List r2 = r2.c()
                z23.b r4 = r0.getData()
                java.util.List r4 = r4.c()
                z23.b r5 = r0.getData()
                int r5 = r5.getMaxAttachments()
                bc4.i$a r6 = new bc4.i$a
                r7 = 1259902592(0x4b189680, float:1.0E7)
                r6.<init>(r5, r7, r4, r2)
                java.lang.Object r0 = vq.j.a(r0)
                r8.f232603f = r0
                r8.f232602e = r3
                java.lang.Object r9 = r9.c(r6, r8)
                if (r9 != r1) goto L76
            L75:
                return r1
            L76:
                dx.i r9 = (dx.i) r9
                z23.b0 r0 = z23.b0.this
                boolean r1 = r9 instanceof dx.i.Left
                if (r1 == 0) goto L8a
                dx.i$b r9 = (dx.i.Left) r9
                java.lang.Object r9 = r9.b()
                dx.b r9 = (dx.b) r9
                z23.b0.K9(r0, r9)
                goto La6
            L8a:
                boolean r1 = r9 instanceof dx.i.Right
                if (r1 == 0) goto La9
                dx.i$c r9 = (dx.i.Right) r9
                java.lang.Object r9 = r9.b()
                bc4.i$b r9 = (bc4.i.Result) r9
                z23.a$a r1 = new z23.a$a
                wx.i$b r9 = r9.getFile()
                java.util.List r9 = pq.v.e(r9)
                r1.<init>(r9)
                z23.b0.r9(r0, r1)
            La6:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            La9:
                oq.p r9 = new oq.p
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: z23.b0.u.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.o oVar, z23.d.a.Screen screen, tq.e<? super oq.i0> eVar) {
            u uVar = b0.this.new u(eVar);
            uVar.f232603f = screen;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz23/a$a;", "action", "Lk10/c0;", "Lz23/d$a$b;", "state", "Lk10/l;", "Lz23/d;", "<anonymous>", "(Lz23/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<a.AddAttachments, k10.c0<z23.d.a.Screen>, tq.e<? super k10.l<? extends z23.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f232605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f232606f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f232607g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f232608h;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z23.d.a.Screen O(k10.c0 c0Var, List list, List list2, z23.d.a.Screen screen) {
            return screen.a(ContentData.b(((z23.d.a.Screen) c0Var.a()).getData(), null, null, null, null, null, null, null, null, 0, list, list2, null, null, 6655, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List<? extends wx.i> list;
            a.AddAttachments addAttachments = (a.AddAttachments) this.f232607g;
            final k10.c0 c0Var = (k10.c0) this.f232608h;
            Object objE = uq.b.e();
            int i15 = this.f232606f;
            if (i15 == 0) {
                oq.u.b(obj);
                List<? extends wx.i> listX0 = pq.v.X0(pq.v.L0(((z23.d.a.Screen) c0Var.a()).getData().c(), addAttachments.a()), ((z23.d.a.Screen) c0Var.a()).getData().getMaxAttachments());
                b0.this.contract.Y7(listX0);
                b0 b0Var = b0.this;
                this.f232607g = vq.j.a(addAttachments);
                this.f232608h = c0Var;
                this.f232605e = listX0;
                this.f232606f = 1;
                Object objGa = b0Var.ga(listX0, this);
                if (objGa == objE) {
                    return objE;
                }
                list = listX0;
                obj = objGa;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f232605e;
                oq.u.b(obj);
            }
            final List list2 = (List) obj;
            return c0Var.b(new er.l() { // from class: z23.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.v.O(c0Var, list, list2, (d.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.AddAttachments addAttachments, k10.c0<z23.d.a.Screen> c0Var, tq.e<? super k10.l<? extends z23.d>> eVar) {
            v vVar = b0.this.new v(eVar);
            vVar.f232607g = addAttachments;
            vVar.f232608h = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz23/a$c;", "action", "Lk10/c0;", "Lz23/d$a$b;", "state", "Lk10/l;", "Lz23/d;", "<anonymous>", "(Lz23/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<a.DeleteAttachment, k10.c0<z23.d.a.Screen>, tq.e<? super k10.l<? extends z23.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f232610e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f232611f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f232612g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f232613h;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z23.d.a.Screen O(k10.c0 c0Var, List list, List list2, z23.d.a.Screen screen) {
            return screen.a(ContentData.b(((z23.d.a.Screen) c0Var.a()).getData(), null, null, null, null, null, null, null, null, 0, list, list2, null, null, 6655, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List<? extends wx.i> list;
            a.DeleteAttachment deleteAttachment = (a.DeleteAttachment) this.f232612g;
            final k10.c0 c0Var = (k10.c0) this.f232613h;
            Object objE = uq.b.e();
            int i15 = this.f232611f;
            if (i15 == 0) {
                oq.u.b(obj);
                List listI1 = pq.v.i1(((z23.d.a.Screen) c0Var.a()).getData().c());
                listI1.remove(deleteAttachment.getAttachment());
                List<? extends wx.i> listF1 = pq.v.f1(listI1);
                b0.this.contract.Y7(listF1);
                b0 b0Var = b0.this;
                this.f232612g = vq.j.a(deleteAttachment);
                this.f232613h = c0Var;
                this.f232610e = listF1;
                this.f232611f = 1;
                Object objGa = b0Var.ga(listF1, this);
                if (objGa == objE) {
                    return objE;
                }
                list = listF1;
                obj = objGa;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f232610e;
                oq.u.b(obj);
            }
            final List list2 = (List) obj;
            return c0Var.b(new er.l() { // from class: z23.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.w.O(c0Var, list, list2, (d.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.DeleteAttachment deleteAttachment, k10.c0<z23.d.a.Screen> c0Var, tq.e<? super k10.l<? extends z23.d>> eVar) {
            w wVar = b0.this.new w(eVar);
            wVar.f232612g = deleteAttachment;
            wVar.f232613h = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz23/a$r;", "action", "Lk10/c0;", "Lz23/d$a$b;", "state", "Lk10/l;", "Lz23/d;", "<anonymous>", "(Lz23/a$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<a.ShowDialog, k10.c0<z23.d.a.Screen>, tq.e<? super k10.l<? extends z23.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232616f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f232617g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z23.d.a.Dialog O(k10.c0 c0Var, b0 b0Var, a.ShowDialog showDialog, z23.d.a.Screen screen) {
            return new z23.d.a.Dialog(((z23.d.a.Screen) c0Var.a()).getData(), b0Var.dialogVMSFactory.a(showDialog.getData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.ShowDialog showDialog = (a.ShowDialog) this.f232616f;
            final k10.c0 c0Var = (k10.c0) this.f232617g;
            uq.b.e();
            if (this.f232615e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final b0 b0Var = b0.this;
            return c0Var.d(new er.l() { // from class: z23.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.x.O(c0Var, b0Var, showDialog, (d.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.ShowDialog showDialog, k10.c0<z23.d.a.Screen> c0Var, tq.e<? super k10.l<? extends z23.d>> eVar) {
            x xVar = b0.this.new x(eVar);
            xVar.f232616f = showDialog;
            xVar.f232617g = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz23/a$b;", "<unused var>", "Lk10/c0;", "Lz23/d$a$a;", "state", "Lk10/l;", "Lz23/d;", "<anonymous>", "(Lz23/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<a.b, k10.c0<z23.d.a.Dialog>, tq.e<? super k10.l<? extends z23.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232620f;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z23.d.a.Screen O(k10.c0 c0Var, z23.d.a.Dialog dialog) {
            return new z23.d.a.Screen(((z23.d.a.Dialog) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f232620f;
            uq.b.e();
            if (this.f232619e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: z23.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.y.O(c0Var, (d.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, k10.c0<z23.d.a.Dialog> c0Var, tq.e<? super k10.l<? extends z23.d>> eVar) {
            y yVar = new y(eVar);
            yVar.f232620f = c0Var;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class z extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f232621d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f232622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f232623f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f232624g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f232625h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f232626j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f232627k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f232628l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f232629m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f232630n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f232631p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f232632q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f232633r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f232634s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f232636v;

        z(tq.e<? super z> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232634s = obj;
            this.f232636v |= PKIFailureInfo.systemUnavail;
            return b0.this.ga(null, this);
        }
    }

    static {
        wx.d.Companion companion = wx.d.INSTANCE;
        G = e1.i(wx.d.j0(companion.J()), wx.d.j0(companion.K()), wx.d.j0(companion.v()), wx.d.j0(companion.z()), wx.d.j0(companion.j0()), wx.d.j0(companion.N()), wx.d.j0(companion.x()), wx.d.j0(companion.q()), wx.d.j0(companion.r()));
        H = e1.i(wx.d.j0(companion.K()), wx.d.j0(companion.v()), wx.d.j0(companion.u()), wx.d.j0(companion.q()), wx.d.j0(companion.r()));
        I = pq.v.q(wx.f.PDF, wx.f.MP4, wx.f.ZIP, wx.f.RAR, wx.f.QUICK_TIME);
    }

    public b0(yy.a aVar, b33.g gVar, ez.a aVar2, ez.e eVar, mx.c cVar, m23.d dVar, cb4.j jVar, p23.b bVar, ac4.a aVar3, ut0.a aVar4, bc4.i iVar, bc4.k kVar, bc4.l lVar, a00.b bVar2, a14.y yVar, a14.m mVar, p23.a aVar5, p23.c cVar2, ib4.c cVar3, hb4.d dVar2, ac4.n nVar, i70.e eVar2, z23.f fVar) {
        this.mapper = gVar;
        this.currentTimeProvider = aVar2;
        this.dateFormatter = eVar;
        this.labelProvider = cVar;
        this.validateDetailsUseCase = dVar;
        this.dialogVMSFactory = jVar;
        this.newReportExitDialogMapper = bVar;
        this.callActionWithLoaderUC = aVar3;
        this.fetchAttachmentsConfigurationUC = aVar4;
        this.pickFileWithFilesValidationUC = iVar;
        this.pickPhotoFromCameraWithSizeValidationUseCase = kVar;
        this.pickPhotoFromGalleryUseCase = lVar;
        this.pickedFileToAndroidMapper = bVar2;
        this.requestPermissionUseCase = yVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.filePickerErrorMapper = aVar5;
        this.storagePermissionDialogMapper = cVar2;
        this.genericDomainErrorMapper = cVar3;
        this.errorVMSFactory = dVar2;
        this.openUriIntentUseCase = nVar;
        this.globalSnackBarManager = eVar2;
        this.contract = fVar;
        z23.d.b bVar3 = z23.d.b.f232646a;
        this.initialState = bVar3;
        this.stateMachine = aVar.a(bVar3, new er.l() { // from class: z23.r
            @Override // er.l
            public final Object b(Object obj) {
                return b0.Y9(this.f232711a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), T9(bVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O9(tq.e<? super DialogData> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f232527f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f232527f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f232525d;
        Object objE = uq.b.e();
        int i16 = bVar.f232527f;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.y yVar = this.requestPermissionUseCase;
            a14.y.Params params = new a14.y.Params(gy.d.EXTERNAL_STORAGE);
            bVar.f232527f = 1;
            objC = yVar.c(params, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        u04.c cVar = (u04.c) objC;
        if (cVar instanceof u04.c.b) {
            return this.storagePermissionDialogMapper.b(new p23.c.Params(b9(a.b.f232460a), new er.a() { // from class: z23.z
                @Override // er.a
                public final Object a() {
                    return b0.P9(this.f232720a);
                }
            }));
        }
        if (cVar instanceof u04.c.a) {
            return null;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(b0 b0Var) {
        b0Var.d9(a.f.f232464a);
        b0Var.d9(a.b.f232460a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c Q9(dx.b error) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: z23.a0
            @Override // er.l
            public final Object b(Object obj) {
                return b0.R9(this.f232489a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(b0 b0Var, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
            b0Var.d9(a.e.f232463a);
        } else {
            b0Var.d9(a.d.f232462a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S9(dx.b error) {
        p23.a.b bVarB = this.filePickerErrorMapper.b(new p23.a.Params(error, b9(a.b.f232460a)));
        if (fr.t.c(bVarB, p23.a.b.c.f151935a)) {
            return;
        }
        if (bVarB instanceof p23.a.b.Dialog) {
            d9(new a.ShowDialog(((p23.a.b.Dialog) bVarB).getDialogData()));
        } else {
            if (!(bVarB instanceof p23.a.b.FullScreen)) {
                throw new oq.p();
            }
            d9(new a.g.ShowError(((p23.a.b.FullScreen) bVarB).getErrorData()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z23.e.a T9(z23.d dVar) {
        return this.mapper.b(new b33.g.Params(dVar, new er.l() { // from class: z23.w
            @Override // er.l
            public final Object b(Object obj) {
                return b0.U9(this.f232717a, (k23.f) obj);
            }
        }, new er.l() { // from class: z23.x
            @Override // er.l
            public final Object b(Object obj) {
                return b0.V9(this.f232718a, (String) obj);
            }
        }, b9(a.s.f232486a), b9(a.t.f232487a), b9(a.p.f232483a), b9(a.o.f232482a), new er.l() { // from class: z23.y
            @Override // er.l
            public final Object b(Object obj) {
                return b0.W9(this.f232719a, (g30.v) obj);
            }
        }, b9(a.k.f232477a), b9(a.m.f232480a), b9(a.h.f232473a), b9(new a.ShowDialog(this.newReportExitDialogMapper.b(new p23.b.Params(b9(a.g.c.f232467a), b9(a.b.f232460a))))), b9(a.g.C6243a.f232465a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(b0 b0Var, k23.f fVar) {
        b0Var.d9(new a.SelectDateAnswer(fVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(b0 b0Var, String str) {
        b0Var.d9(new a.UpdateDescription(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(b0 b0Var, g30.v vVar) {
        b0Var.d9(new a.OnBottomSheetStateChanged(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(final b0 b0Var, k10.v vVar) {
        vVar.c(fr.q0.c(z23.d.class), new er.l() { // from class: z23.q
            @Override // er.l
            public final Object b(Object obj) {
                return b0.Z9(this.f232709a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(z23.d.b.class), new er.l() { // from class: z23.s
            @Override // er.l
            public final Object b(Object obj) {
                return b0.aa(this.f232712a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(z23.d.LoadingError.class), new er.l() { // from class: z23.t
            @Override // er.l
            public final Object b(Object obj) {
                return b0.ba(this.f232714a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(z23.d.a.Screen.class), new er.l() { // from class: z23.u
            @Override // er.l
            public final Object b(Object obj) {
                return b0.ca(this.f232716a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(z23.d.a.Dialog.class), new er.l() { // from class: z23.v
            @Override // er.l
            public final Object b(Object obj) {
                return b0.da((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(b0 b0Var, k10.z zVar) {
        d dVar = b0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.g.class), oVar, dVar);
        zVar.x(fr.q0.c(a.f.class), oVar, b0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(b0 b0Var, k10.z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.e.class), oVar, gVar);
        zVar.x(fr.q0.c(a.d.class), oVar, b0Var.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(b0 b0Var, k10.z zVar) {
        p pVar = b0Var.new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.OpenPickedFileUri.class), oVar, pVar);
        zVar.x(fr.q0.c(a.s.class), oVar, b0Var.new q(null));
        zVar.v(fr.q0.c(a.OnBottomSheetStateChanged.class), oVar, new r(null));
        zVar.x(fr.q0.c(a.t.class), oVar, b0Var.new s(null));
        zVar.x(fr.q0.c(a.p.class), oVar, b0Var.new t(null));
        zVar.x(fr.q0.c(a.o.class), oVar, b0Var.new u(null));
        zVar.v(fr.q0.c(a.AddAttachments.class), oVar, b0Var.new v(null));
        zVar.v(fr.q0.c(a.DeleteAttachment.class), oVar, b0Var.new w(null));
        zVar.v(fr.q0.c(a.ShowDialog.class), oVar, b0Var.new x(null));
        zVar.v(fr.q0.c(a.SelectDateAnswer.class), oVar, new i(null));
        zVar.x(fr.q0.c(a.k.class), oVar, b0Var.new j(null));
        zVar.v(fr.q0.c(a.OnDateChanged.class), oVar, new k(null));
        zVar.x(fr.q0.c(a.m.class), oVar, b0Var.new l(null));
        zVar.v(fr.q0.c(a.OnTimeChanged.class), oVar, b0Var.new m(null));
        zVar.v(fr.q0.c(a.UpdateDescription.class), oVar, new n(null));
        zVar.v(fr.q0.c(a.h.class), oVar, b0Var.new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(k10.z zVar) {
        y yVar = new y(null);
        zVar.v(fr.q0.c(a.b.class), k10.o.CANCEL_PREVIOUS, yVar);
        return oq.i0.f148189a;
    }

    private final n40.i ea(wx.i iVar, int i15) {
        return new n40.i.Regular(mx.b.b(wx.j.a(iVar), "File" + i15), this.labelProvider.e(h23.b.f80193y, t04.a.c(iVar.d())), b9(new a.OpenPickedFileUri(iVar)), b9(new a.DeleteAttachment(iVar)));
    }

    private final n40.i fa(zz.h hVar, int i15) {
        if (hVar instanceof zz.h.Regular) {
            return ea(((zz.h.Regular) hVar).a(), i15);
        }
        if (!(hVar instanceof zz.h.Image)) {
            throw new oq.p();
        }
        zz.h.Image image = (zz.h.Image) hVar;
        return new n40.i.Image(mx.b.b(wx.j.a(image.a()), "File" + i15), this.labelProvider.e(h23.b.f80193y, t04.a.c(image.a().d())), b9(new a.DeleteAttachment(image.a())), b9(new a.g.ShowImagePreview(new dx3.a.Content(mx.b.b(wx.j.a(image.a()), "File" + i15), image.a().getFileContent()))), new n40.i.Image.AbstractC3255a.Image(image.getThumbnail()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x008e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0096  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00da  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:31:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00da -> B:24:0x00e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object ga(java.util.List<? extends wx.i> r18, tq.e<? super java.util.List<? extends n40.i>> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z23.b0.ga(java.util.List, tq.e):java.lang.Object");
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: N9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a.g gVar, tq.e<? super oq.i0> eVar) {
        return super.F(gVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: X9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(z23.f fVar) {
        super.P5(fVar);
    }

    @Override // zx.b
    public xw.b<a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<z23.d, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<z23.e.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
