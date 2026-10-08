package gw1;

import androidx.p016lifecycle.u0;
import fr.q0;
import gv1.DocumentActionAttribute;
import gv1.DocumentSchema;
import hv1.MultiDocumentView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kw1.DynamicMultiDocumentSingleNav;
import mu.p0;
import mv1.DynamicDocumentData;
import mv1.DynamicMultiDocumentFullData;
import n20.State;
import o20.t2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wv1.BitmapsByFieldReference;
import wv1.DynamicDocumentBottomSheetData;
import zv1.SetupData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007B\u0089\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020*2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b+\u0010,J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010)\u001a\u00020/H\u0082@¢\u0006\u0004\b1\u00102J\u001b\u00106\u001a\u0004\u0018\u000105*\b\u0012\u0004\u0012\u00020403H\u0002¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\b\u0012\u0004\u0012\u00020403*\b\u0012\u0004\u0012\u00020403H\u0002¢\u0006\u0004\b8\u00109J)\u0010;\u001a\b\u0012\u0004\u0012\u00020403*\u0004\u0018\u0001052\f\u0010:\u001a\b\u0012\u0004\u0012\u00020403H\u0002¢\u0006\u0004\b;\u0010<J\u0013\u0010>\u001a\u000205*\u00020=H\u0002¢\u0006\u0004\b>\u0010?J4\u0010F\u001a\b\u0012\u0004\u0012\u00020/0E2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030@2\u0006\u0010B\u001a\u00020A2\b\u0010D\u001a\u0004\u0018\u00010CH\u0082@¢\u0006\u0004\bF\u0010GJ4\u0010M\u001a\u0002002\u0006\u0010H\u001a\u00020A2\u0006\u0010J\u001a\u00020I2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010L\u001a\u0004\u0018\u00010KH\u0082@¢\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001a\u0002002\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bO\u0010PJ\u0018\u0010S\u001a\u0002002\u0006\u0010R\u001a\u00020QH\u0096\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u000200H\u0096\u0001¢\u0006\u0004\bU\u0010VR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010|\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R/\u0010\u0082\u0001\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040}8\u0014X\u0094\u0004¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R'\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R%\u0010)\u001a\t\u0012\u0004\u0012\u00020*0\u008a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001e\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u008f\u00018\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\be\u0010\u0091\u0001¨\u0006\u0093\u0001"}, d2 = {"Lgw1/a0;", "Ll00/g;", "Ln20/b;", "Lgw1/c;", "Ln20/a;", "Lgw1/d;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "snackBarManagerStateHolder", "Lhw1/e;", "dynamicMultiDocumentScreenMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lqv1/a;", "checkAndGetDynamicMultiDocumentDataUC", "Lib4/c;", "genericDomainErrorMapper", "Lkv1/a;", "dynamicDocumentContainersInteractor", "La14/w;", "openUrlIntentUseCase", "Li70/e;", "globalSnackBarManager", "Lqv1/b;", "getDynamicDocumentDataSourceDataUC", "Lqv1/d;", "resetDynamicDocumentsDataSourceUC", "Lo20/t2$a;", "deps", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lh64/r;", "loadServicesUseCase", "Ltv1/a;", "dynamicDocumentBitmapDecoder", "<init>", "(Ln20/j;Li70/n;Lhw1/e;Lac4/a;Lqv1/a;Lib4/c;Lkv1/a;La14/w;Li70/e;Lqv1/b;Lqv1/d;Lo20/t2$a;Lmz3/z;Lmz3/w;Lh64/r;Ltv1/a;)V", "state", "Lgw1/d$a;", "T9", "(Ln20/b;)Lgw1/d$a;", "Lgv1/c$a;", "actionType", "Lgw1/c$b;", "Loq/i0;", "S9", "(Lgv1/c$a;Lgw1/c$b;Ltq/e;)Ljava/lang/Object;", "", "Lmv1/c;", "Lgw1/a;", "R9", "(Ljava/util/List;)Lgw1/a;", "N9", "(Ljava/util/List;)Ljava/util/List;", "documents", "O9", "(Lgw1/a;Ljava/util/List;)Ljava/util/List;", "Ly30/n$b$b;", "ja", "(Ly30/n$b$b;)Lgw1/a;", "Lk10/c0;", "Lrq0/b$c;", "dynamicMultiDocumentType", "Lgw1/b;", "retryAction", "Lk10/l;", "P9", "(Lk10/c0;Lrq0/b$c;Lgw1/b;Ltq/e;)Ljava/lang/Object;", "dynamicDocumentType", "Lmz3/z$b;", "methodType", "", "documentId", "ka", "(Lrq0/b$c;Lmz3/z$b;Lgw1/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "da", "(Lrq0/b$c;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Li70/n;", "c", "Lhw1/e;", "d", "Lac4/a;", "e", "Lqv1/a;", "f", "Lib4/c;", "g", "Lkv1/a;", "h", "La14/w;", "j", "Li70/e;", "k", "Lqv1/b;", "l", "Lqv1/d;", "m", "Lo20/t2$a;", "n", "Lmz3/z;", "p", "Lmz3/w;", "q", "Lh64/r;", "r", "Ltv1/a;", "Lgw1/c$a;", "s", "Lgw1/c$a;", "initialState", "Lo20/t2;", "t", "Lo20/t2;", "documentComponentFlowDataHolder", "Lk10/t;", "v", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lgw1/b$j;", "w", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "x", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 extends l00.g<State<gw1.c>, n20.a> implements gw1.d, zx.b, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hw1.e dynamicMultiDocumentScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final qv1.a checkAndGetDynamicMultiDocumentDataUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final kv1.a dynamicDocumentContainersInteractor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final qv1.b getDynamicDocumentDataSourceDataUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final qv1.d resetDynamicDocumentsDataSourceUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final tv1.a dynamicDocumentBitmapDecoder;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final gw1.c.a initialState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final t2 documentComponentFlowDataHolder;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<gw1.c>, n20.a> stateMachine;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gw1.b.j> navAction;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final p0<gw1.d.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f77726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f77727c;

        static {
            int[] iArr = new int[DocumentActionAttribute.a.values().length];
            try {
                iArr[DocumentActionAttribute.a.ELECTRONIC_DIPLOMA_GRADUATION_PDF_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentActionAttribute.a.ELECTRONIC_DIPLOMA_PHD_PDF_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentActionAttribute.a.ELECTRONIC_DIPLOMA_DSC_PDF_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentActionAttribute.a.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f77725a = iArr;
            int[] iArr2 = new int[gw1.a.values().length];
            try {
                iArr2[gw1.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[gw1.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f77726b = iArr2;
            int[] iArr3 = new int[y30.n.Switch.EnumC5973b.values().length];
            try {
                iArr3[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f77727c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f77730f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f77731g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f77732h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f77733j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f77734k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f77735l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f77736m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f77737n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f77738p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f77740r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77738p = obj;
            this.f77740r |= PKIFailureInfo.systemUnavail;
            return a0.this.P9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<gw1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f77741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f77742b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f77743a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f77744b;

            /* JADX INFO: renamed from: gw1.a0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1761a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f77745d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f77746e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f77747f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f77749h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f77750j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f77751k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f77752l;

                public C1761a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f77745d = obj;
                    this.f77746e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, a0 a0Var) {
                this.f77743a = hVar;
                this.f77744b = a0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1761a c1761a;
                if (eVar instanceof C1761a) {
                    c1761a = (C1761a) eVar;
                    int i15 = c1761a.f77746e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1761a.f77746e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1761a = new C1761a(eVar);
                    }
                } else {
                    c1761a = new C1761a(eVar);
                }
                Object obj2 = c1761a.f77745d;
                Object objE = uq.b.e();
                int i16 = c1761a.f77746e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f77743a;
                    gw1.d.a aVarT9 = this.f77744b.T9((State) obj);
                    c1761a.f77747f = vq.j.a(obj);
                    c1761a.f77749h = vq.j.a(c1761a);
                    c1761a.f77750j = vq.j.a(obj);
                    c1761a.f77751k = vq.j.a(hVar);
                    c1761a.f77752l = 0;
                    c1761a.f77746e = 1;
                    if (hVar.F(aVarT9, c1761a) == objE) {
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

        public c(mu.g gVar, a0 a0Var) {
            this.f77741a = gVar;
            this.f77742b = a0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super gw1.d.a> hVar, tq.e eVar) {
            Object objA = this.f77741a.a(new a(hVar, this.f77742b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgw1/b$a;", "<unused var>", "Lgw1/c;", "Loq/i0;", "<anonymous>", "(Lgw1/b$a;Lgw1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<gw1.b.a, gw1.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77753e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77753e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<gw1.b.j> bVarY1 = a0.this.Y1();
                gw1.b.j.a aVar = gw1.b.j.a.f77867a;
                this.f77753e = 1;
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
        public final Object w(gw1.b.a aVar, gw1.c cVar, tq.e<? super oq.i0> eVar) {
            return a0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgw1/b$f;", "action", "Lgw1/c;", "state", "Loq/i0;", "<anonymous>", "(Lgw1/b$f;Lgw1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<gw1.b.Error, gw1.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77755e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77756f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f77757g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(gw1.b.Error error, gw1.c cVar, a0 a0Var, ib4.c.b bVar) {
            if (bVar instanceof ib4.c.b.a.Primary) {
                dx.b domainError = error.getDomainError();
                if (domainError instanceof dx.b.Business) {
                    dx.b.Business.a type = ((dx.b.Business) domainError).getType();
                    if (type == lv1.b.REVOKE_DOCUMENT) {
                        if ((cVar instanceof gw1.c.a) || (cVar instanceof gw1.c.Loading)) {
                            a0Var.d9(gw1.b.d.f77860a);
                        } else {
                            if (!(cVar instanceof gw1.c.Initialized)) {
                                throw new oq.p();
                            }
                            a0Var.d9(new gw1.b.UpdateDocumentWithTimer(mz3.z.b.DOWNLOAD));
                        }
                    } else if (type == lv1.b.FAILED_LOADING) {
                        a0Var.d9(gw1.b.e.f77861a);
                    } else {
                        a0Var.d9(gw1.b.d.f77860a);
                    }
                } else {
                    a0Var.d9(gw1.b.d.f77860a);
                }
            } else if (!(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    a0Var.d9(gw1.b.d.f77860a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    gw1.b retryAction = error.getRetryAction();
                    if (retryAction != null) {
                        a0Var.d9(retryAction);
                    }
                }
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final gw1.b.Error error = (gw1.b.Error) this.f77756f;
            final gw1.c cVar = (gw1.c) this.f77757g;
            Object objE = uq.b.e();
            int i15 = this.f77755e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<gw1.b.j> bVarY1 = a0.this.Y1();
                ib4.c cVar2 = a0.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final a0 a0Var = a0.this;
                gw1.b.j.Error error2 = new gw1.b.j.Error(cVar2.b(new ib4.c.Params(domainError, false, new er.l() { // from class: gw1.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.e.O(error, cVar, a0Var, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f77756f = vq.j.a(error);
                this.f77757g = vq.j.a(cVar);
                this.f77755e = 1;
                if (bVarY1.F(error2, this) == objE) {
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
        public final Object w(gw1.b.Error error, gw1.c cVar, tq.e<? super oq.i0> eVar) {
            e eVar2 = a0.this.new e(eVar);
            eVar2.f77756f = error;
            eVar2.f77757g = cVar;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgw1/b$o;", "action", "Lgw1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgw1/b$o;Lgw1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<gw1.b.ShowGlobalSnackBar, gw1.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77760f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gw1.b.ShowGlobalSnackBar showGlobalSnackBar = (gw1.b.ShowGlobalSnackBar) this.f77760f;
            uq.b.e();
            if (this.f77759e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a0.this.globalSnackBarManager.y(new p50.a.Default(showGlobalSnackBar.getMessage(), false, null, 6, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.ShowGlobalSnackBar showGlobalSnackBar, gw1.c cVar, tq.e<? super oq.i0> eVar) {
            f fVar = a0.this.new f(eVar);
            fVar.f77760f = showGlobalSnackBar;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgw1/b$e;", "<unused var>", "Lgw1/c;", "state", "Loq/i0;", "<anonymous>", "(Lgw1/b$e;Lgw1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<gw1.b.e, gw1.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77762e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f77763f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77764g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f77765h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f77766j;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            rq0.b.c dynamicMultiDocumentType;
            a0 a0Var;
            int i15;
            rq0.b.c cVar;
            a0 a0Var2;
            gw1.c cVar2 = (gw1.c) this.f77766j;
            Object objE = uq.b.e();
            int i16 = this.f77765h;
            if (i16 != 0) {
                if (i16 == 1) {
                    int i17 = this.f77764g;
                    cVar = (rq0.b.c) this.f77763f;
                    a0 a0Var3 = (a0) this.f77762e;
                    oq.u.b(obj);
                    i15 = i17;
                    a0Var = a0Var3;
                } else {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0Var2 = (a0) this.f77762e;
                    oq.u.b(obj);
                }
                a0Var2.d9(new gw1.b.ShowGlobalSnackBar(a0Var2.dynamicMultiDocumentScreenMapper.r()));
                a0Var2.d9(gw1.b.a.f77857a);
                return oq.i0.f148189a;
            }
            oq.u.b(obj);
            if (cVar2 instanceof gw1.c.a) {
                dynamicMultiDocumentType = null;
            } else if (cVar2 instanceof gw1.c.Loading) {
                dynamicMultiDocumentType = ((gw1.c.Loading) cVar2).getDynamicMultiDocumentType();
            } else {
                if (!(cVar2 instanceof gw1.c.Initialized)) {
                    throw new oq.p();
                }
                dynamicMultiDocumentType = ((gw1.c.Initialized) cVar2).getDynamicMultiDocumentType();
            }
            if (dynamicMultiDocumentType != null) {
                a0Var = a0.this;
                kv1.a aVar = a0Var.dynamicDocumentContainersInteractor;
                this.f77766j = vq.j.a(cVar2);
                this.f77762e = a0Var;
                this.f77763f = vq.j.a(dynamicMultiDocumentType);
                i15 = 0;
                this.f77764g = 0;
                this.f77765h = 1;
                if (aVar.n(dynamicMultiDocumentType, this) != objE) {
                    cVar = dynamicMultiDocumentType;
                }
                return objE;
            }
            return oq.i0.f148189a;
            qv1.d dVar = a0Var.resetDynamicDocumentsDataSourceUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            this.f77766j = vq.j.a(cVar2);
            this.f77762e = a0Var;
            this.f77763f = vq.j.a(cVar);
            this.f77764g = i15;
            this.f77765h = 2;
            if (dVar.a(c1792a, this) != objE) {
                a0Var2 = a0Var;
                a0Var2.d9(new gw1.b.ShowGlobalSnackBar(a0Var2.dynamicMultiDocumentScreenMapper.r()));
                a0Var2.d9(gw1.b.a.f77857a);
                return oq.i0.f148189a;
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.e eVar, gw1.c cVar, tq.e<? super oq.i0> eVar2) {
            g gVar = a0.this.new g(eVar2);
            gVar.f77766j = cVar;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgw1/b$d;", "<unused var>", "Lgw1/c$a;", "Loq/i0;", "<anonymous>", "(Lgw1/b$d;Lgw1/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<gw1.b.d, gw1.c.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77768e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77768e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<gw1.b.j> bVarY1 = a0.this.Y1();
                gw1.b.j.a aVar = gw1.b.j.a.f77867a;
                this.f77768e = 1;
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
        public final Object w(gw1.b.d dVar, gw1.c.a aVar, tq.e<? super oq.i0> eVar) {
            return a0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgw1/b$l;", "action", "Lk10/c0;", "Lgw1/c$a;", "state", "Lk10/l;", "Lgw1/c;", "<anonymous>", "(Lgw1/b$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<gw1.b.Setup, k10.c0<gw1.c.a>, tq.e<? super k10.l<? extends gw1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f77772g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gw1.c.Loading O(gw1.b.Setup setup, gw1.c.a aVar) {
            return new gw1.c.Loading(setup.getDynamicMultiDocumentType());
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
        
            if (r9.F(r3, r8) == r2) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f77771f
                gw1.b$l r0 = (gw1.b.Setup) r0
                java.lang.Object r1 = r8.f77772g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r8.f77770e
                r4 = 1
                r5 = 2
                if (r3 == 0) goto L26
                if (r3 == r4) goto L22
                if (r3 != r5) goto L1a
                oq.u.b(r9)
                goto L71
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                oq.u.b(r9)
                goto L45
            L26:
                oq.u.b(r9)
                gw1.a0 r9 = gw1.a0.this
                mz3.w r9 = gw1.a0.H9(r9)
                mz3.w$a r3 = new mz3.w$a
                rq0.b$c r6 = r0.getDynamicMultiDocumentType()
                r3.<init>(r6)
                r8.f77771f = r0
                r8.f77772g = r1
                r8.f77770e = r4
                java.lang.Object r9 = r9.c(r3, r8)
                if (r9 != r2) goto L45
                goto L70
            L45:
                mz3.w$b r9 = (mz3.w.b) r9
                boolean r3 = r9 instanceof mz3.w.b.NotReady
                if (r3 == 0) goto L76
                gw1.a0 r9 = gw1.a0.this
                xw.b r9 = r9.Y1()
                gw1.b$j$d r3 = new gw1.b$j$d
                gv3.b$b r4 = new gv3.b$b
                rq0.b$c r6 = r0.getDynamicMultiDocumentType()
                r7 = 0
                r4.<init>(r6, r7, r5, r7)
                r3.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r8.f77771f = r0
                r8.f77772g = r1
                r8.f77770e = r5
                java.lang.Object r9 = r9.F(r3, r8)
                if (r9 != r2) goto L71
            L70:
                return r2
            L71:
                k10.l r9 = r1.c()
                return r9
            L76:
                mz3.w$b$b r2 = mz3.w.b.C3231b.f129717a
                boolean r9 = fr.t.c(r9, r2)
                if (r9 == 0) goto L88
                gw1.c0 r9 = new gw1.c0
                r9.<init>()
                k10.l r9 = r1.d(r9)
                return r9
            L88:
                oq.p r9 = new oq.p
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: gw1.a0.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.Setup setup, k10.c0<gw1.c.a> c0Var, tq.e<? super k10.l<? extends gw1.c>> eVar) {
            i iVar = a0.this.new i(eVar);
            iVar.f77771f = setup;
            iVar.f77772g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgw1/c$c;", "state", "Loq/i0;", "<anonymous>", "(Lgw1/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<gw1.c.Loading, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77775f;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gw1.c.Loading loading = (gw1.c.Loading) this.f77775f;
            uq.b.e();
            if (this.f77774e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a0.this.d9(new gw1.b.CheckAndGetDynamicMultiDocumentData(loading.getDynamicMultiDocumentType()));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(gw1.c.Loading loading, tq.e<? super oq.i0> eVar) {
            return ((j) v(loading, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = a0.this.new j(eVar);
            jVar.f77775f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgw1/b$c;", "action", "Lk10/c0;", "Lgw1/c$c;", "state", "Lk10/l;", "Lgw1/c;", "<anonymous>", "(Lgw1/b$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<gw1.b.CheckAndGetDynamicMultiDocumentData, k10.c0<gw1.c.Loading>, tq.e<? super k10.l<? extends gw1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f77779g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lgw1/c$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends gw1.c.Initialized>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f77781e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a0 f77782f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<gw1.c.Loading> f77783g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ gw1.b.CheckAndGetDynamicMultiDocumentData f77784h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, k10.c0<gw1.c.Loading> c0Var, gw1.b.CheckAndGetDynamicMultiDocumentData checkAndGetDynamicMultiDocumentData, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f77782f = a0Var;
                this.f77783g = c0Var;
                this.f77784h = checkAndGetDynamicMultiDocumentData;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f77781e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                a0 a0Var = this.f77782f;
                k10.c0<gw1.c.Loading> c0Var = this.f77783g;
                rq0.b.c dynamicMultiDocumentType = this.f77784h.getDynamicMultiDocumentType();
                gw1.b.CheckAndGetDynamicMultiDocumentData checkAndGetDynamicMultiDocumentData = this.f77784h;
                this.f77781e = 1;
                Object objP9 = a0Var.P9(c0Var, dynamicMultiDocumentType, checkAndGetDynamicMultiDocumentData, this);
                return objP9 == objE ? objE : objP9;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f77782f, this.f77783g, this.f77784h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<gw1.c.Initialized>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gw1.b.CheckAndGetDynamicMultiDocumentData checkAndGetDynamicMultiDocumentData = (gw1.b.CheckAndGetDynamicMultiDocumentData) this.f77778f;
            k10.c0 c0Var = (k10.c0) this.f77779g;
            Object objE = uq.b.e();
            int i15 = this.f77777e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = a0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(a0.this, c0Var, checkAndGetDynamicMultiDocumentData, null);
            this.f77778f = vq.j.a(checkAndGetDynamicMultiDocumentData);
            this.f77779g = vq.j.a(c0Var);
            this.f77777e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.CheckAndGetDynamicMultiDocumentData checkAndGetDynamicMultiDocumentData, k10.c0<gw1.c.Loading> c0Var, tq.e<? super k10.l<? extends gw1.c>> eVar) {
            k kVar = a0.this.new k(eVar);
            kVar.f77778f = checkAndGetDynamicMultiDocumentData;
            kVar.f77779g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgw1/b$d;", "<unused var>", "Lgw1/c$c;", "Loq/i0;", "<anonymous>", "(Lgw1/b$d;Lgw1/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<gw1.b.d, gw1.c.Loading, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77785e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77785e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<gw1.b.j> bVarY1 = a0.this.Y1();
                gw1.b.j.a aVar = gw1.b.j.a.f77867a;
                this.f77785e = 1;
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
        public final Object w(gw1.b.d dVar, gw1.c.Loading loading, tq.e<? super oq.i0> eVar) {
            return a0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgw1/b$g;", "action", "Lgw1/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lgw1/b$g;Lgw1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<gw1.b.HandleActionType, gw1.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f77789g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gw1.b.HandleActionType handleActionType = (gw1.b.HandleActionType) this.f77788f;
            gw1.c.Initialized initialized = (gw1.c.Initialized) this.f77789g;
            Object objE = uq.b.e();
            int i15 = this.f77787e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                DocumentActionAttribute.a actionType = handleActionType.getActionType();
                this.f77788f = vq.j.a(handleActionType);
                this.f77789g = vq.j.a(initialized);
                this.f77787e = 1;
                if (a0Var.S9(actionType, initialized, this) == objE) {
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
        public final Object w(gw1.b.HandleActionType handleActionType, gw1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            m mVar = a0.this.new m(eVar);
            mVar.f77788f = handleActionType;
            mVar.f77789g = initialized;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgw1/b$i;", "<unused var>", "Lgw1/c$b;", "Loq/i0;", "<anonymous>", "(Lgw1/b$i;Lgw1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<gw1.b.i, gw1.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77791e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f77791e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a0.this.B0();
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.i iVar, gw1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return a0.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgw1/b$h;", "<unused var>", "Lk10/c0;", "Lgw1/c$b;", "state", "Lk10/l;", "Lgw1/c;", "<anonymous>", "(Lgw1/b$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<gw1.b.h, k10.c0<gw1.c.Initialized>, tq.e<? super k10.l<? extends gw1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77794f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gw1.c.Initialized O(gw1.c.Initialized initialized) {
            return gw1.c.Initialized.b(initialized, null, null, null, null, null, null, null, null, g30.v.HIDDEN, null, null, null, null, 7935, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f77794f;
            uq.b.e();
            if (this.f77793e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gw1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.o.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.h hVar, k10.c0<gw1.c.Initialized> c0Var, tq.e<? super k10.l<? extends gw1.c>> eVar) {
            o oVar = new o(eVar);
            oVar.f77794f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgw1/b$m;", "action", "Lk10/c0;", "Lgw1/c$b;", "state", "Lk10/l;", "Lgw1/c;", "<anonymous>", "(Lgw1/b$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<gw1.b.ShowBottomSheet, k10.c0<gw1.c.Initialized>, tq.e<? super k10.l<? extends gw1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f77797g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gw1.c.Initialized O(gw1.b.ShowBottomSheet showBottomSheet, gw1.c.Initialized initialized) {
            return gw1.c.Initialized.b(initialized, null, null, null, null, null, null, null, null, g30.v.EXPANDED, showBottomSheet.getBottomSheetData(), null, null, null, 7423, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final gw1.b.ShowBottomSheet showBottomSheet = (gw1.b.ShowBottomSheet) this.f77796f;
            k10.c0 c0Var = (k10.c0) this.f77797g;
            uq.b.e();
            if (this.f77795e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gw1.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.p.O(showBottomSheet, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.ShowBottomSheet showBottomSheet, k10.c0<gw1.c.Initialized> c0Var, tq.e<? super k10.l<? extends gw1.c>> eVar) {
            p pVar = new p(eVar);
            pVar.f77796f = showBottomSheet;
            pVar.f77797g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgw1/b$l;", "action", "Lk10/c0;", "Lgw1/c$b;", "state", "Lk10/l;", "Lgw1/c;", "<anonymous>", "(Lgw1/b$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<gw1.b.Setup, k10.c0<gw1.c.Initialized>, tq.e<? super k10.l<? extends gw1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f77799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f77800g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f77801h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f77802j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f77803k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f77804l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f77805m;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gw1.c.Initialized O(DynamicMultiDocumentFullData dynamicMultiDocumentFullData, List list, BitmapsByFieldReference bitmapsByFieldReference, gw1.c.Initialized initialized) {
            return gw1.c.Initialized.b(initialized, null, null, dynamicMultiDocumentFullData, list, null, null, null, null, null, null, null, null, bitmapsByFieldReference, 4083, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final DynamicMultiDocumentFullData dynamicMultiDocumentFullData;
            final List list;
            gw1.b.Setup setup = (gw1.b.Setup) this.f77804l;
            k10.c0 c0Var = (k10.c0) this.f77805m;
            Object objE = uq.b.e();
            int i15 = this.f77803k;
            if (i15 == 0) {
                oq.u.b(obj);
                qv1.b bVar = a0.this.getDynamicDocumentDataSourceDataUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f77804l = setup;
                this.f77805m = c0Var;
                this.f77803k = 1;
                obj = bVar.a(c1792a, this);
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
                list = (List) this.f77800g;
                dynamicMultiDocumentFullData = (DynamicMultiDocumentFullData) this.f77799f;
                oq.u.b(obj);
            }
            final BitmapsByFieldReference bitmapsByFieldReference = (BitmapsByFieldReference) obj;
            return c0Var.b(new er.l() { // from class: gw1.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.q.O(dynamicMultiDocumentFullData, list, bitmapsByFieldReference, (c.Initialized) obj2);
                }
            });
            dx.i iVar = (dx.i) obj;
            a0 a0Var = a0.this;
            if (iVar instanceof dx.i.Left) {
                a0Var.d9(new gw1.b.Error((dx.b) ((dx.i.Left) iVar).b(), setup));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            DynamicMultiDocumentFullData dynamicMultiDocumentFullData2 = (DynamicMultiDocumentFullData) ((dx.i.Right) iVar).b();
            List listO9 = a0Var.O9(((gw1.c.Initialized) c0Var.a()).getOpenedTab(), dynamicMultiDocumentFullData2.a());
            tv1.a aVar = a0Var.dynamicDocumentBitmapDecoder;
            DocumentSchema schema = ((DynamicDocumentData) pq.v.l0(listO9)).getSchema();
            iy.b0 scope = ((DynamicDocumentData) pq.v.l0(listO9)).getScope();
            this.f77804l = vq.j.a(setup);
            this.f77805m = c0Var;
            this.f77798e = vq.j.a(iVar);
            this.f77799f = dynamicMultiDocumentFullData2;
            this.f77800g = listO9;
            this.f77801h = 0;
            this.f77802j = 0;
            this.f77803k = 2;
            obj = aVar.a(schema, scope, this);
            if (obj != objE) {
                dynamicMultiDocumentFullData = dynamicMultiDocumentFullData2;
                list = listO9;
                final BitmapsByFieldReference bitmapsByFieldReference2 = (BitmapsByFieldReference) obj;
                return c0Var.b(new er.l() { // from class: gw1.d0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.q.O(dynamicMultiDocumentFullData, list, bitmapsByFieldReference2, (c.Initialized) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.Setup setup, k10.c0<gw1.c.Initialized> c0Var, tq.e<? super k10.l<? extends gw1.c>> eVar) {
            q qVar = a0.this.new q(eVar);
            qVar.f77804l = setup;
            qVar.f77805m = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgw1/b$b;", "action", "Lk10/c0;", "Lgw1/c$b;", "state", "Lk10/l;", "Lgw1/c;", "<anonymous>", "(Lgw1/b$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<gw1.b.ChangeTab, k10.c0<gw1.c.Initialized>, tq.e<? super k10.l<? extends gw1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f77808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f77809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f77810h;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gw1.c.Initialized O(a0 a0Var, gw1.b.ChangeTab changeTab, List list, BitmapsByFieldReference bitmapsByFieldReference, gw1.c.Initialized initialized) {
            return gw1.c.Initialized.b(initialized, null, null, null, list, a0Var.ja(changeTab.getControllerSwitchType()), null, null, null, null, null, null, null, bitmapsByFieldReference, 4071, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List list;
            final gw1.b.ChangeTab changeTab = (gw1.b.ChangeTab) this.f77809g;
            k10.c0 c0Var = (k10.c0) this.f77810h;
            Object objE = uq.b.e();
            int i15 = this.f77808f;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                List listO9 = a0Var.O9(a0Var.ja(changeTab.getControllerSwitchType()), ((gw1.c.Initialized) c0Var.a()).getDocuments().a());
                tv1.a aVar = a0.this.dynamicDocumentBitmapDecoder;
                DocumentSchema schema = ((DynamicDocumentData) pq.v.l0(listO9)).getSchema();
                iy.b0 scope = ((DynamicDocumentData) pq.v.l0(listO9)).getScope();
                this.f77809g = changeTab;
                this.f77810h = c0Var;
                this.f77807e = listO9;
                this.f77808f = 1;
                Object objA = aVar.a(schema, scope, this);
                if (objA == objE) {
                    return objE;
                }
                list = listO9;
                obj = objA;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f77807e;
                oq.u.b(obj);
            }
            final BitmapsByFieldReference bitmapsByFieldReference = (BitmapsByFieldReference) obj;
            final a0 a0Var2 = a0.this;
            return c0Var.b(new er.l() { // from class: gw1.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.r.O(a0Var2, changeTab, list, bitmapsByFieldReference, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.ChangeTab changeTab, k10.c0<gw1.c.Initialized> c0Var, tq.e<? super k10.l<? extends gw1.c>> eVar) {
            r rVar = a0.this.new r(eVar);
            rVar.f77809g = changeTab;
            rVar.f77810h = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgw1/b$r;", "action", "Lgw1/c$b;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lgw1/b$r;Lgw1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<gw1.b.ToSingleDocument, gw1.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f77813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f77815h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f77816j;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gw1.b.ToSingleDocument toSingleDocument = (gw1.b.ToSingleDocument) this.f77815h;
            gw1.c.Initialized initialized = (gw1.c.Initialized) this.f77816j;
            Object objE = uq.b.e();
            int i15 = this.f77814g;
            if (i15 == 0) {
                oq.u.b(obj);
                DynamicDocumentData dynamicDocumentData = (DynamicDocumentData) pq.v.o0(initialized.g(), toSingleDocument.getSingleDocumentIndex());
                if (dynamicDocumentData != null) {
                    xw.b<gw1.b.j> bVarY1 = a0.this.Y1();
                    gw1.b.j.ToSingleDocument toSingleDocument2 = new gw1.b.j.ToSingleDocument(new DynamicMultiDocumentSingleNav(dynamicDocumentData, initialized.getDynamicMultiDocumentType(), initialized.getMainDocumentPhoto(), initialized.getMainDocumentPesel()));
                    this.f77815h = vq.j.a(toSingleDocument);
                    this.f77816j = vq.j.a(initialized);
                    this.f77812e = vq.j.a(dynamicDocumentData);
                    this.f77813f = 0;
                    this.f77814g = 1;
                    if (bVarY1.F(toSingleDocument2, this) == objE) {
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
        public final Object w(gw1.b.ToSingleDocument toSingleDocument, gw1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            s sVar = a0.this.new s(eVar);
            sVar.f77815h = toSingleDocument;
            sVar.f77816j = initialized;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgw1/b$n;", "<unused var>", "Lgw1/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lgw1/b$n;Lgw1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<gw1.b.n, gw1.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77818e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f77819f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77820g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f77821h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f77822j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f77823k;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
        
            if (r2.F(r5, r7) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f77823k
                gw1.c$b r0 = (gw1.c.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f77822j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2a
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r0 = r7.f77819f
                cb4.d r0 = (cb4.DialogData) r0
                java.lang.Object r0 = r7.f77818e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto L80
            L1e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L26:
                oq.u.b(r8)
                goto L4e
            L2a:
                oq.u.b(r8)
                gw1.a0 r8 = gw1.a0.this
                kv1.a r8 = gw1.a0.A9(r8)
                rq0.b$c r2 = r0.getDynamicMultiDocumentType()
                gw1.a0 r5 = gw1.a0.this
                gw1.b$e r6 = gw1.b.e.f77861a
                er.a r5 = gw1.a0.u9(r5, r6)
                java.lang.Object r6 = vq.j.a(r0)
                r7.f77823k = r6
                r7.f77822j = r4
                java.lang.Object r8 = r8.f(r2, r5, r7)
                if (r8 != r1) goto L4e
                goto L7f
            L4e:
                dx.i r8 = (dx.i) r8
                gw1.a0 r2 = gw1.a0.this
                boolean r4 = r8 instanceof dx.i.Right
                if (r4 == 0) goto L80
                r4 = r8
                dx.i$c r4 = (dx.i.Right) r4
                java.lang.Object r4 = r4.b()
                cb4.d r4 = (cb4.DialogData) r4
                gw1.b$j$e r5 = new gw1.b$j$e
                r5.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f77823k = r0
                r7.f77818e = r8
                java.lang.Object r8 = vq.j.a(r4)
                r7.f77819f = r8
                r8 = 0
                r7.f77820g = r8
                r7.f77821h = r8
                r7.f77822j = r3
                java.lang.Object r8 = r2.F(r5, r7)
                if (r8 != r1) goto L80
            L7f:
                return r1
            L80:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: gw1.a0.t.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.n nVar, gw1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            t tVar = a0.this.new t(eVar);
            tVar.f77823k = initialized;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgw1/b$t;", "action", "Lgw1/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lgw1/b$t;Lgw1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<gw1.b.UpdateDocumentWithTimer, gw1.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f77827g;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gw1.b.UpdateDocumentWithTimer updateDocumentWithTimer = (gw1.b.UpdateDocumentWithTimer) this.f77826f;
            gw1.c.Initialized initialized = (gw1.c.Initialized) this.f77827g;
            Object objE = uq.b.e();
            int i15 = this.f77825e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                rq0.b.c dynamicMultiDocumentType = initialized.getDynamicMultiDocumentType();
                mz3.z.b methodType = updateDocumentWithTimer.getMethodType();
                String parentId = initialized.getDocuments().getParentId();
                this.f77826f = vq.j.a(updateDocumentWithTimer);
                this.f77827g = vq.j.a(initialized);
                this.f77825e = 1;
                if (a0Var.ka(dynamicMultiDocumentType, methodType, updateDocumentWithTimer, parentId, this) == objE) {
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
        public final Object w(gw1.b.UpdateDocumentWithTimer updateDocumentWithTimer, gw1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            u uVar = a0.this.new u(eVar);
            uVar.f77826f = updateDocumentWithTimer;
            uVar.f77827g = initialized;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgw1/b$s;", "<unused var>", "Lgw1/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lgw1/b$s;Lgw1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<gw1.b.s, gw1.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77830f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f77832a;

            static {
                int[] iArr = new int[mv1.b.values().length];
                try {
                    iArr[mv1.b.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[mv1.b.INACTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[mv1.b.EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[mv1.b.REVOKED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f77832a = iArr;
            }
        }

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V(a0 a0Var) {
            a0Var.d9(new gw1.b.UpdateDocumentWithTimer(mz3.z.b.DOWNLOAD));
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b2, code lost:
        
            if (r3.F(r5, r21) == r2) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00da, code lost:
        
            if (r3.F(r4, r21) == r2) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
        
            return r2;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gw1.a0.v.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.s sVar, gw1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            v vVar = a0.this.new v(eVar);
            vVar.f77830f = initialized;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgw1/b$k;", "action", "Lgw1/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgw1/b$k;Lgw1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<gw1.b.OpenUrl, gw1.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77834f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gw1.b.OpenUrl openUrl = (gw1.b.OpenUrl) this.f77834f;
            Object objE = uq.b.e();
            int i15 = this.f77833e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = a0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f77834f = vq.j.a(openUrl);
                this.f77833e = 1;
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
            a0 a0Var = a0.this;
            if (iVar instanceof dx.i.Left) {
                a0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.OpenUrl openUrl, gw1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            w wVar = a0.this.new w(eVar);
            wVar.f77834f = openUrl;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgw1/b$p;", "action", "Lgw1/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgw1/b$p;Lgw1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<gw1.b.ShowSnackBar, gw1.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77837f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gw1.b.ShowSnackBar showSnackBar = (gw1.b.ShowSnackBar) this.f77837f;
            uq.b.e();
            if (this.f77836e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a0.this.y(new p50.a.Default(showSnackBar.getMessage(), false, null, 6, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.ShowSnackBar showSnackBar, gw1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            x xVar = a0.this.new x(eVar);
            xVar.f77837f = showSnackBar;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgw1/b$q;", "<unused var>", "Lgw1/c$b;", "Loq/i0;", "<anonymous>", "(Lgw1/b$q;Lgw1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<gw1.b.q, gw1.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f77840f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77841g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f77842h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f77843j;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        
            if (r1.F(r4, r6) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
        
            if (r1.F(r4, r6) == r0) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f77843j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f77840f
                cb4.d r0 = (cb4.DialogData) r0
                goto L22
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r0 = r6.f77840f
                oq.i0 r0 = (oq.i0) r0
            L22:
                java.lang.Object r0 = r6.f77839e
                dx.i r0 = (dx.i) r0
                oq.u.b(r7)
                goto L9a
            L2a:
                oq.u.b(r7)
                goto L42
            L2e:
                oq.u.b(r7)
                gw1.a0 r7 = gw1.a0.this
                kv1.a r7 = gw1.a0.A9(r7)
                rq0.c r1 = rq0.c.SAFE_BUS
                r6.f77843j = r4
                java.lang.Object r7 = r7.d(r1, r6)
                if (r7 != r0) goto L42
                goto L99
            L42:
                dx.i r7 = (dx.i) r7
                gw1.a0 r1 = gw1.a0.this
                boolean r4 = r7 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L6f
                r2 = r7
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                oq.i0 r2 = (oq.i0) r2
                gw1.b$j$c r4 = gw1.b.j.c.f77869a
                java.lang.Object r7 = vq.j.a(r7)
                r6.f77839e = r7
                java.lang.Object r7 = vq.j.a(r2)
                r6.f77840f = r7
                r6.f77841g = r5
                r6.f77842h = r5
                r6.f77843j = r3
                java.lang.Object r7 = r1.F(r4, r6)
                if (r7 != r0) goto L9a
                goto L99
            L6f:
                boolean r3 = r7 instanceof dx.i.Right
                if (r3 == 0) goto L9d
                r3 = r7
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                gw1.b$j$e r4 = new gw1.b$j$e
                r4.<init>(r3)
                java.lang.Object r7 = vq.j.a(r7)
                r6.f77839e = r7
                java.lang.Object r7 = vq.j.a(r3)
                r6.f77840f = r7
                r6.f77841g = r5
                r6.f77842h = r5
                r6.f77843j = r2
                java.lang.Object r7 = r1.F(r4, r6)
                if (r7 != r0) goto L9a
            L99:
                return r0
            L9a:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L9d:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: gw1.a0.y.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gw1.b.q qVar, gw1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return a0.this.new y(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class z extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f77847f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f77848g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f77849h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f77850j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f77851k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f77852l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f77853m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f77854n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f77856q;

        z(tq.e<? super z> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77854n = obj;
            this.f77856q |= PKIFailureInfo.systemUnavail;
            return a0.this.ka(null, null, null, null, this);
        }
    }

    public a0(n20.j jVar, i70.n nVar, hw1.e eVar, ac4.a aVar, qv1.a aVar2, ib4.c cVar, kv1.a aVar3, a14.w wVar, i70.e eVar2, qv1.b bVar, qv1.d dVar, t2.a aVar4, mz3.z zVar, mz3.w wVar2, h64.r rVar, tv1.a aVar5) {
        this.snackBarManagerStateHolder = nVar;
        this.dynamicMultiDocumentScreenMapper = eVar;
        this.callActionWithLoaderUseCase = aVar;
        this.checkAndGetDynamicMultiDocumentDataUC = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.dynamicDocumentContainersInteractor = aVar3;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar2;
        this.getDynamicDocumentDataSourceDataUC = bVar;
        this.resetDynamicDocumentsDataSourceUC = dVar;
        this.deps = aVar4;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar2;
        this.loadServicesUseCase = rVar;
        this.dynamicDocumentBitmapDecoder = aVar5;
        gw1.c.a aVar6 = gw1.c.a.f77890a;
        this.initialState = aVar6;
        this.documentComponentFlowDataHolder = new t2(aVar4, u0.a(this));
        this.stateMachine = jVar.a(aVar6, new er.l() { // from class: gw1.m
            @Override // er.l
            public final Object b(Object obj) {
                return a0.ea(this.f77948a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), T9(new State<>(aVar6, null, 2, null)));
    }

    private final List<DynamicDocumentData> N9(List<DynamicDocumentData> list) {
        List<DynamicDocumentData> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            MultiDocumentView multiDocumentView = ((DynamicDocumentData) next).getSchema().getMultiDocumentView();
            if ((multiDocumentView != null ? multiDocumentView.getMultiDocumentGroup() : null) == MultiDocumentView.a.LEFT_TAB) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = new ArrayList();
            for (Object obj : list2) {
                MultiDocumentView multiDocumentView2 = ((DynamicDocumentData) obj).getSchema().getMultiDocumentView();
                if ((multiDocumentView2 != null ? multiDocumentView2.getMultiDocumentGroup() : null) == MultiDocumentView.a.RIGHT_TAB) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DynamicDocumentData> O9(gw1.a aVar, List<DynamicDocumentData> list) {
        int i15 = aVar == null ? -1 : a.f77726b[aVar.ordinal()];
        if (i15 == -1) {
            return N9(list);
        }
        if (i15 == 1) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                MultiDocumentView multiDocumentView = ((DynamicDocumentData) obj).getSchema().getMultiDocumentView();
                if ((multiDocumentView != null ? multiDocumentView.getMultiDocumentGroup() : null) == MultiDocumentView.a.LEFT_TAB) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (i15 != 2) {
            throw new oq.p();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            MultiDocumentView multiDocumentView2 = ((DynamicDocumentData) obj2).getSchema().getMultiDocumentView();
            if ((multiDocumentView2 != null ? multiDocumentView2.getMultiDocumentGroup() : null) == MultiDocumentView.a.RIGHT_TAB) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:32:0x010c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0110  */
    /* JADX WARN: Code duplicated, block: B:37:0x013f  */
    /* JADX WARN: Code duplicated, block: B:41:0x018c  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object P9(k10.c0<?> c0Var, rq0.b.c cVar, gw1.b bVar, tq.e<? super k10.l<gw1.c.Initialized>> eVar) throws Throwable {
        b bVar2;
        k10.c0<?> c0Var2;
        gw1.b bVar3;
        rq0.b.c cVar2;
        String str;
        k10.c0<?> c0Var3;
        dx.i iVar;
        DynamicMultiDocumentFullData dynamicMultiDocumentFullData;
        int i15;
        Object objC;
        dx.i iVar2;
        rq0.b.c cVar3;
        k10.c0<?> c0Var4;
        String str2;
        int i16;
        List list;
        List<DynamicDocumentData> listN9;
        Object objA;
        final List list2;
        final String str3;
        DynamicMultiDocumentFullData dynamicMultiDocumentFullData2;
        final List<DynamicDocumentData> list3;
        rq0.b.c cVar4 = cVar;
        if (eVar instanceof b) {
            bVar2 = (b) eVar;
            int i17 = bVar2.f77740r;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f77740r = i17 - PKIFailureInfo.systemUnavail;
            } else {
                bVar2 = new b(eVar);
            }
        } else {
            bVar2 = new b(eVar);
        }
        Object objO = bVar2.f77738p;
        Object objE = uq.b.e();
        int i18 = bVar2.f77740r;
        if (i18 == 0) {
            oq.u.b(objO);
            kv1.a aVar = this.dynamicDocumentContainersInteractor;
            c0Var2 = c0Var;
            bVar2.f77728d = c0Var2;
            bVar2.f77729e = cVar4;
            bVar3 = bVar;
            bVar2.f77730f = bVar3;
            bVar2.f77740r = 1;
            objO = aVar.o(cVar4, bVar2);
            if (objO != objE) {
            }
            return objE;
        }
        if (i18 == 1) {
            gw1.b bVar4 = (gw1.b) bVar2.f77730f;
            rq0.b.c cVar5 = (rq0.b.c) bVar2.f77729e;
            k10.c0<?> c0Var5 = (k10.c0) bVar2.f77728d;
            oq.u.b(objO);
            bVar3 = bVar4;
            cVar4 = cVar5;
            c0Var2 = c0Var5;
        } else {
            if (i18 == 2) {
                str = (String) bVar2.f77731g;
                gw1.b bVar5 = (gw1.b) bVar2.f77730f;
                cVar2 = (rq0.b.c) bVar2.f77729e;
                c0Var3 = (k10.c0) bVar2.f77728d;
                oq.u.b(objO);
                bVar3 = bVar5;
                iVar = (dx.i) objO;
                if (iVar instanceof dx.i.Left) {
                    d9(new gw1.b.Error((dx.b) ((dx.i.Left) iVar).b(), bVar3));
                    return c0Var3.c();
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                dynamicMultiDocumentFullData = (DynamicMultiDocumentFullData) ((dx.i.Right) iVar).b();
                h64.r rVar = this.loadServicesUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                bVar2.f77728d = c0Var3;
                bVar2.f77729e = cVar2;
                bVar2.f77730f = vq.j.a(bVar3);
                bVar2.f77731g = str;
                bVar2.f77732h = vq.j.a(iVar);
                bVar2.f77733j = dynamicMultiDocumentFullData;
                i15 = 0;
                bVar2.f77736m = 0;
                bVar2.f77737n = 0;
                bVar2.f77740r = 3;
                objC = rVar.c(c1792a, bVar2);
                if (objC != objE) {
                    rq0.b.c cVar6 = cVar2;
                    iVar2 = iVar;
                    objO = objC;
                    cVar3 = cVar6;
                    c0Var4 = c0Var3;
                    str2 = str;
                    i16 = 0;
                    list = (List) objO;
                    listN9 = N9(dynamicMultiDocumentFullData.a());
                    tv1.a aVar2 = this.dynamicDocumentBitmapDecoder;
                    DocumentSchema schema = ((DynamicDocumentData) pq.v.l0(listN9)).getSchema();
                    iy.b0 scope = ((DynamicDocumentData) pq.v.l0(listN9)).getScope();
                    bVar2.f77728d = c0Var4;
                    bVar2.f77729e = cVar3;
                    bVar2.f77730f = vq.j.a(bVar3);
                    bVar2.f77731g = str2;
                    bVar2.f77732h = vq.j.a(iVar2);
                    bVar2.f77733j = dynamicMultiDocumentFullData;
                    bVar2.f77734k = list;
                    bVar2.f77735l = listN9;
                    bVar2.f77736m = i15;
                    bVar2.f77737n = i16;
                    bVar2.f77740r = 4;
                    objA = aVar2.a(schema, scope, bVar2);
                    if (objA != objE) {
                        list2 = list;
                        str3 = str2;
                        objO = objA;
                        dynamicMultiDocumentFullData2 = dynamicMultiDocumentFullData;
                        list3 = listN9;
                    }
                }
                return objE;
            }
            if (i18 == 3) {
                i16 = bVar2.f77737n;
                int i19 = bVar2.f77736m;
                DynamicMultiDocumentFullData dynamicMultiDocumentFullData3 = (DynamicMultiDocumentFullData) bVar2.f77733j;
                iVar2 = (dx.i) bVar2.f77732h;
                str2 = (String) bVar2.f77731g;
                bVar3 = (gw1.b) bVar2.f77730f;
                rq0.b.c cVar7 = (rq0.b.c) bVar2.f77729e;
                c0Var4 = (k10.c0) bVar2.f77728d;
                oq.u.b(objO);
                i15 = i19;
                dynamicMultiDocumentFullData = dynamicMultiDocumentFullData3;
                cVar3 = cVar7;
                list = (List) objO;
                listN9 = N9(dynamicMultiDocumentFullData.a());
                tv1.a aVar3 = this.dynamicDocumentBitmapDecoder;
                DocumentSchema schema2 = ((DynamicDocumentData) pq.v.l0(listN9)).getSchema();
                iy.b0 scope2 = ((DynamicDocumentData) pq.v.l0(listN9)).getScope();
                bVar2.f77728d = c0Var4;
                bVar2.f77729e = cVar3;
                bVar2.f77730f = vq.j.a(bVar3);
                bVar2.f77731g = str2;
                bVar2.f77732h = vq.j.a(iVar2);
                bVar2.f77733j = dynamicMultiDocumentFullData;
                bVar2.f77734k = list;
                bVar2.f77735l = listN9;
                bVar2.f77736m = i15;
                bVar2.f77737n = i16;
                bVar2.f77740r = 4;
                objA = aVar3.a(schema2, scope2, bVar2);
                if (objA != objE) {
                    list2 = list;
                    str3 = str2;
                    objO = objA;
                    dynamicMultiDocumentFullData2 = dynamicMultiDocumentFullData;
                    list3 = listN9;
                }
                return objE;
            }
            if (i18 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<DynamicDocumentData> list4 = (List) bVar2.f77735l;
            list2 = (List) bVar2.f77734k;
            DynamicMultiDocumentFullData dynamicMultiDocumentFullData4 = (DynamicMultiDocumentFullData) bVar2.f77733j;
            str3 = (String) bVar2.f77731g;
            cVar3 = (rq0.b.c) bVar2.f77729e;
            k10.c0<?> c0Var6 = (k10.c0) bVar2.f77728d;
            oq.u.b(objO);
            list3 = list4;
            dynamicMultiDocumentFullData2 = dynamicMultiDocumentFullData4;
            c0Var4 = c0Var6;
        }
        final rq0.b.c cVar8 = cVar3;
        final BitmapsByFieldReference bitmapsByFieldReference = (BitmapsByFieldReference) objO;
        final DynamicMultiDocumentFullData dynamicMultiDocumentFullData5 = dynamicMultiDocumentFullData2;
        return c0Var4.d(new er.l() { // from class: gw1.q
            @Override // er.l
            public final Object b(Object obj) {
                return a0.Q9(dynamicMultiDocumentFullData5, this, cVar8, list2, list3, str3, bitmapsByFieldReference, obj);
            }
        });
        String str4 = (String) ((dx.i) objO).a();
        qv1.a aVar4 = this.checkAndGetDynamicMultiDocumentDataUC;
        qv1.a.Params params = new qv1.a.Params(cVar4);
        bVar2.f77728d = c0Var2;
        bVar2.f77729e = cVar4;
        bVar2.f77730f = bVar3;
        bVar2.f77731g = str4;
        bVar2.f77740r = 2;
        Object objD = aVar4.d(params, bVar2);
        if (objD != objE) {
            cVar2 = cVar4;
            str = str4;
            objO = objD;
            c0Var3 = c0Var2;
            iVar = (dx.i) objO;
            if (iVar instanceof dx.i.Left) {
                d9(new gw1.b.Error((dx.b) ((dx.i.Left) iVar).b(), bVar3));
                return c0Var3.c();
            }
            if (iVar instanceof dx.i.Right) {
                throw new oq.p();
            }
            dynamicMultiDocumentFullData = (DynamicMultiDocumentFullData) ((dx.i.Right) iVar).b();
            h64.r rVar2 = this.loadServicesUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            bVar2.f77728d = c0Var3;
            bVar2.f77729e = cVar2;
            bVar2.f77730f = vq.j.a(bVar3);
            bVar2.f77731g = str;
            bVar2.f77732h = vq.j.a(iVar);
            bVar2.f77733j = dynamicMultiDocumentFullData;
            i15 = 0;
            bVar2.f77736m = 0;
            bVar2.f77737n = 0;
            bVar2.f77740r = 3;
            objC = rVar2.c(c1792a2, bVar2);
            if (objC != objE) {
                rq0.b.c cVar9 = cVar2;
                iVar2 = iVar;
                objO = objC;
                cVar3 = cVar9;
                c0Var4 = c0Var3;
                str2 = str;
                i16 = 0;
                list = (List) objO;
                listN9 = N9(dynamicMultiDocumentFullData.a());
                tv1.a aVar5 = this.dynamicDocumentBitmapDecoder;
                DocumentSchema schema3 = ((DynamicDocumentData) pq.v.l0(listN9)).getSchema();
                iy.b0 scope3 = ((DynamicDocumentData) pq.v.l0(listN9)).getScope();
                bVar2.f77728d = c0Var4;
                bVar2.f77729e = cVar3;
                bVar2.f77730f = vq.j.a(bVar3);
                bVar2.f77731g = str2;
                bVar2.f77732h = vq.j.a(iVar2);
                bVar2.f77733j = dynamicMultiDocumentFullData;
                bVar2.f77734k = list;
                bVar2.f77735l = listN9;
                bVar2.f77736m = i15;
                bVar2.f77737n = i16;
                bVar2.f77740r = 4;
                objA = aVar5.a(schema3, scope3, bVar2);
                if (objA != objE) {
                    list2 = list;
                    str3 = str2;
                    objO = objA;
                    dynamicMultiDocumentFullData2 = dynamicMultiDocumentFullData;
                    list3 = listN9;
                    final rq0.b.c cVar10 = cVar3;
                    final BitmapsByFieldReference bitmapsByFieldReference2 = (BitmapsByFieldReference) objO;
                    final DynamicMultiDocumentFullData dynamicMultiDocumentFullData6 = dynamicMultiDocumentFullData2;
                    return c0Var4.d(new er.l() { // from class: gw1.q
                        @Override // er.l
                        public final Object b(Object obj) {
                            return a0.Q9(dynamicMultiDocumentFullData6, this, cVar10, list2, list3, str3, bitmapsByFieldReference2, obj);
                        }
                    });
                }
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gw1.c.Initialized Q9(DynamicMultiDocumentFullData dynamicMultiDocumentFullData, a0 a0Var, rq0.b.c cVar, List list, List list2, String str, BitmapsByFieldReference bitmapsByFieldReference, Object obj) {
        iy.b0 b0VarG = iy.c0.g(dynamicMultiDocumentFullData.getMainDocumentPhoto());
        iy.b0 b0VarG2 = iy.c0.g(dynamicMultiDocumentFullData.getMainDocumentPesel());
        return new gw1.c.Initialized(cVar, list, dynamicMultiDocumentFullData, list2, a0Var.R9(dynamicMultiDocumentFullData.a()), dynamicMultiDocumentFullData.getMultiDocumentSchema(), b0VarG, b0VarG2, null, null, a0Var.documentComponentFlowDataHolder, str, bitmapsByFieldReference, 256, null);
    }

    private final gw1.a R9(List<DynamicDocumentData> list) {
        boolean z15;
        MultiDocumentView multiDocumentView;
        List<DynamicDocumentData> list2 = list;
        boolean z16 = list2 instanceof Collection;
        boolean z17 = true;
        if (!z16 || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z15 = false;
                    break;
                }
                MultiDocumentView multiDocumentView2 = ((DynamicDocumentData) it.next()).getSchema().getMultiDocumentView();
                if ((multiDocumentView2 != null ? multiDocumentView2.getMultiDocumentGroup() : null) == MultiDocumentView.a.LEFT_TAB) {
                    z15 = true;
                    break;
                }
            }
        } else {
            z15 = false;
            break;
        }
        if (!z16 || !list2.isEmpty()) {
            Iterator<T> it4 = list2.iterator();
            do {
                if (!it4.hasNext()) {
                    z17 = false;
                    break;
                }
                multiDocumentView = ((DynamicDocumentData) it4.next()).getSchema().getMultiDocumentView();
            } while ((multiDocumentView != null ? multiDocumentView.getMultiDocumentGroup() : null) != MultiDocumentView.a.RIGHT_TAB);
        } else {
            z17 = false;
            break;
        }
        if (z15 && z17) {
            return gw1.a.LEFT;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object S9(DocumentActionAttribute.a aVar, gw1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
        int i15 = a.f77725a[aVar.ordinal()];
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            Object objF = F(new gw1.b.j.ToDiplomaPdfList(new SetupData(((DynamicDocumentData) pq.v.l0(initialized.g())).getStatus().e(), ((DynamicDocumentData) pq.v.l0(initialized.g())).getScope(), null)), eVar);
            return objF == uq.b.e() ? objF : oq.i0.f148189a;
        }
        if (i15 == 4) {
            return oq.i0.f148189a;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gw1.d.a T9(State<gw1.c> state) {
        return this.dynamicMultiDocumentScreenMapper.b(new hw1.e.Params(state, this.documentComponentFlowDataHolder, b9(gw1.b.a.f77857a), b9(gw1.b.i.f77866a), new er.a() { // from class: gw1.r
            @Override // er.a
            public final Object a() {
                return a0.U9(this.f77959a);
            }
        }, new er.a() { // from class: gw1.s
            @Override // er.a
            public final Object a() {
                return a0.V9(this.f77960a);
            }
        }, b9(gw1.b.s.f77885a), b9(gw1.b.q.f77883a), new er.l() { // from class: gw1.t
            @Override // er.l
            public final Object b(Object obj) {
                return a0.W9(this.f77961a, (DocumentActionAttribute.a) obj);
            }
        }, new er.l() { // from class: gw1.u
            @Override // er.l
            public final Object b(Object obj) {
                return a0.X9(this.f77962a, (String) obj);
            }
        }, new er.l() { // from class: gw1.v
            @Override // er.l
            public final Object b(Object obj) {
                return a0.Y9(this.f77963a, (y30.n.Switch.EnumC5973b) obj);
            }
        }, new er.l() { // from class: gw1.w
            @Override // er.l
            public final Object b(Object obj) {
                return a0.Z9(this.f77964a, (n20.a) obj);
            }
        }, b9(gw1.b.n.f77880a), new er.l() { // from class: gw1.x
            @Override // er.l
            public final Object b(Object obj) {
                return a0.aa(this.f77965a, ((Integer) obj).intValue());
            }
        }, new er.l() { // from class: gw1.y
            @Override // er.l
            public final Object b(Object obj) {
                return a0.ba(this.f77966a, (DynamicDocumentBottomSheetData) obj);
            }
        }, b9(gw1.b.h.f77865a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(a0 a0Var) {
        a0Var.d9(new gw1.b.UpdateDocumentWithTimer(mz3.z.b.DOWNLOAD));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(a0 a0Var) {
        a0Var.d9(new gw1.b.UpdateDocumentWithTimer(mz3.z.b.UPDATE));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(a0 a0Var, DocumentActionAttribute.a aVar) {
        a0Var.d9(new gw1.b.HandleActionType(aVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(a0 a0Var, String str) {
        a0Var.d9(new gw1.b.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(a0 a0Var, y30.n.Switch.EnumC5973b enumC5973b) {
        a0Var.d9(new gw1.b.ChangeTab(enumC5973b));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(a0 a0Var, n20.a aVar) {
        a0Var.d9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(a0 a0Var, int i15) {
        a0Var.d9(new gw1.b.ToSingleDocument(i15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(a0 a0Var, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData) {
        a0Var.d9(new gw1.b.ShowBottomSheet(dynamicDocumentBottomSheetData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(final a0 a0Var, k10.v vVar) {
        vVar.c(q0.c(gw1.c.class), new er.l() { // from class: gw1.z
            @Override // er.l
            public final Object b(Object obj) {
                return a0.fa(this.f77967a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(gw1.c.a.class), new er.l() { // from class: gw1.n
            @Override // er.l
            public final Object b(Object obj) {
                return a0.ga(this.f77949a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(gw1.c.Loading.class), new er.l() { // from class: gw1.o
            @Override // er.l
            public final Object b(Object obj) {
                return a0.ha(this.f77950a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(gw1.c.Initialized.class), new er.l() { // from class: gw1.p
            @Override // er.l
            public final Object b(Object obj) {
                return a0.ia(this.f77951a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(a0 a0Var, k10.z zVar) {
        d dVar = a0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(gw1.b.a.class), oVar, dVar);
        zVar.x(q0.c(gw1.b.Error.class), oVar, a0Var.new e(null));
        zVar.x(q0.c(gw1.b.ShowGlobalSnackBar.class), oVar, a0Var.new f(null));
        zVar.x(q0.c(gw1.b.e.class), oVar, a0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(a0 a0Var, k10.z zVar) {
        h hVar = a0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(gw1.b.d.class), oVar, hVar);
        zVar.v(q0.c(gw1.b.Setup.class), oVar, a0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(a0 a0Var, k10.z zVar) {
        zVar.C(a0Var.new j(null));
        k kVar = a0Var.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(gw1.b.CheckAndGetDynamicMultiDocumentData.class), oVar, kVar);
        zVar.x(q0.c(gw1.b.d.class), oVar, a0Var.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(a0 a0Var, k10.z zVar) {
        q qVar = a0Var.new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(gw1.b.Setup.class), oVar, qVar);
        zVar.v(q0.c(gw1.b.ChangeTab.class), oVar, a0Var.new r(null));
        zVar.x(q0.c(gw1.b.ToSingleDocument.class), oVar, a0Var.new s(null));
        zVar.x(q0.c(gw1.b.n.class), oVar, a0Var.new t(null));
        zVar.x(q0.c(gw1.b.UpdateDocumentWithTimer.class), oVar, a0Var.new u(null));
        zVar.x(q0.c(gw1.b.s.class), oVar, a0Var.new v(null));
        zVar.x(q0.c(gw1.b.OpenUrl.class), oVar, a0Var.new w(null));
        zVar.x(q0.c(gw1.b.ShowSnackBar.class), oVar, a0Var.new x(null));
        zVar.x(q0.c(gw1.b.q.class), oVar, a0Var.new y(null));
        zVar.x(q0.c(gw1.b.HandleActionType.class), oVar, a0Var.new m(null));
        zVar.x(q0.c(gw1.b.i.class), oVar, a0Var.new n(null));
        zVar.v(q0.c(gw1.b.h.class), oVar, new o(null));
        zVar.v(q0.c(gw1.b.ShowBottomSheet.class), oVar, new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gw1.a ja(y30.n.Switch.EnumC5973b enumC5973b) {
        int i15 = a.f77727c[enumC5973b.ordinal()];
        if (i15 == 1) {
            return gw1.a.LEFT;
        }
        if (i15 == 2) {
            return gw1.a.RIGHT;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0119  */
    /* JADX WARN: Code duplicated, block: B:36:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0152, code lost:
    
        if (F(r13, r2) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01bf, code lost:
    
        if (r11.F(r13, r2) == r3) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ka(rq0.b.c r18, mz3.z.b r19, gw1.b r20, java.lang.String r21, tq.e<? super oq.i0> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gw1.a0.ka(rq0.b$c, mz3.z$b, gw1.b, java.lang.String, tq.e):java.lang.Object");
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(gw1.b.j jVar, tq.e<? super oq.i0> eVar) {
        return super.F(jVar, eVar);
    }

    @Override // zx.b
    public xw.b<gw1.b.j> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: ca, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    public final void da(rq0.b.c dynamicMultiDocumentType) {
        d9(new gw1.b.Setup(dynamicMultiDocumentType));
    }

    @Override // l00.g
    protected k10.t<State<gw1.c>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<gw1.d.a> getState() {
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
