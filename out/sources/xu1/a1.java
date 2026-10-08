package xu1;

import android.graphics.Bitmap;
import cb4.DialogData;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CancellationException;
import n20.State;
import o20.t2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ou1.DrivingLicenceContainerData;
import ou1.DrivingLicenceData;
import ou1.DrivingLicenceFullData;
import ou1.DrivingLicenceScope;
import p071kotlin.Metadata;
import su1.SetupData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u0093\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\u0094\u0001B³\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0018\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u000205H\u0096\u0001¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u0002052\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J.\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030C2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>2\b\b\u0002\u0010B\u001a\u00020AH\u0082@¢\u0006\u0004\bD\u0010EJ&\u0010H\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00030F2\b\b\u0002\u0010B\u001a\u00020AH\u0082@¢\u0006\u0004\bH\u0010IJ\u001d\u0010L\u001a\u00020K2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\bL\u0010MJ*\u0010S\u001a\u0002052\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020P2\b\u0010R\u001a\u0004\u0018\u00010:H\u0082@¢\u0006\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010}\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R$\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0~8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b6\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R2\u0010\u0089\u0001\u001a\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0084\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R%\u0010@\u001a\t\u0012\u0004\u0012\u00020K0\u008a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001e\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u008f\u00018\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bc\u0010\u0091\u0001¨\u0006\u0095\u0001"}, d2 = {"Lxu1/a1;", "Ll00/g;", "Ln20/b;", "Lxu1/w;", "Ln20/a;", "Lxu1/x;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "Lyu1/j;", "drivingLicenceMainErrorMapper", "snackBarManagerStateHolder", "La14/w;", "openUrlIntentUseCase", "Lyu1/c;", "drivingLicenceDialogMapper", "Lyu1/w;", "drivingLicenceMainMapper", "Lpu1/d;", "updateShowInfoBannerUseCase", "Lnu1/a;", "drivingLicenceContainersInteractor", "Lac4/a;", "callActionWithLoaderUseCase", "Lpu1/b;", "getDrivingLicenseDataUseCase", "Lpu1/c;", "getShowInfoBannerUseCase", "Lb00/c;", "imageConverter", "Lo20/t2$a;", "deps", "Lxu1/v;", "setupData", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lqx/a;", "imagePropertiesProvider", "Lh64/r;", "loadServicesUseCase", "Lf01/b;", "launchNativeRatingUC", "<init>", "(Ln20/j;Lmx/c;Lez/c;Lyu1/j;Li70/n;La14/w;Lyu1/c;Lyu1/w;Lpu1/d;Lnu1/a;Lac4/a;Lpu1/b;Lpu1/c;Lb00/c;Lo20/t2$a;Lxu1/v;Lmz3/z;Lmz3/w;Lqx/a;Lh64/r;Lf01/b;)V", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "", "url", "Y9", "(Ljava/lang/String;)V", "Lk10/c0;", "Lxu1/w$b;", "state", "", "showTemporaryDrivingLicence", "Lk10/l;", "N9", "(Lk10/c0;ZLtq/e;)Ljava/lang/Object;", "Ldx/i;", "Ldx/b;", "M9", "(ZLtq/e;)Ljava/lang/Object;", "mainState", "Lxu1/x$a;", "Q9", "(Ln20/b;)Lxu1/x$a;", "Lmz3/z$b;", "updateMethodType", "Ly30/n$b$b;", "selectedType", "documentId", "ga", "(Lmz3/z$b;Ly30/n$b$b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "b", "Lmx/c;", "c", "Lez/c;", "d", "Lyu1/j;", "e", "Li70/n;", "f", "La14/w;", "g", "Lyu1/c;", "h", "Lyu1/w;", "j", "Lnu1/a;", "k", "Lac4/a;", "l", "Lpu1/b;", "m", "Lpu1/c;", "n", "Lb00/c;", "p", "Lo20/t2$a;", "q", "Lxu1/v;", "r", "Lmz3/z;", "s", "Lmz3/w;", "t", "Lqx/a;", "v", "Lh64/r;", "w", "Lf01/b;", "x", "Lxu1/w$b;", "initialState", "Lxw/b;", "Lxu1/n;", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "z", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "A", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "B", "a", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a1 extends l00.g<State<xu1.w>, n20.a> implements xu1.x, zx.d, i70.n {
    public static final int C = 8;
    private static final rq0.b.d D = rq0.b.d.DRIVING_LICENCE;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final mu.p0<xu1.x.a> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yu1.j drivingLicenceMainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final yu1.c drivingLicenceDialogMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final yu1.w drivingLicenceMainMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final nu1.a drivingLicenceContainersInteractor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final pu1.b getDrivingLicenseDataUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final pu1.c getShowInfoBannerUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final qx.a imagePropertiesProvider;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final f01.b launchNativeRatingUC;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final xu1.w.b initialState;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xu1.n> navAction;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<xu1.w>, n20.a> stateMachine;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxu1/g;", "<unused var>", "Lxu1/w$c;", "Loq/i0;", "<anonymous>", "(Lxu1/g;Lxu1/w$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<xu1.g, xu1.w.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221195e;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f221195e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xu1.n> bVarY1 = a1.this.Y1();
                xu1.n.a aVar = xu1.n.a.f221375a;
                this.f221195e = 1;
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
        public final Object w(xu1.g gVar, xu1.w.c cVar, tq.e<? super oq.i0> eVar) {
            return a1.this.new a0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {
        int A;
        /* synthetic */ Object B;
        int D;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f221197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f221198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f221199f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f221200g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f221201h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f221202j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f221203k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f221204l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f221205m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f221206n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f221207p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f221208q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f221209r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f221210s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f221211t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f221212v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f221213w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f221214x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f221215y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f221216z;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.B = obj;
            this.D |= PKIFailureInfo.systemUnavail;
            return a1.this.M9(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxu1/r;", "<unused var>", "Lxu1/w;", "Loq/i0;", "<anonymous>", "(Lxu1/r;Lxu1/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<xu1.r, xu1.w, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f221217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f221218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f221219g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f221220h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f221221j;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        
            if (r1.F(r4, r5) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f221221j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f221218f
                cb4.d r0 = (cb4.DialogData) r0
                java.lang.Object r0 = r5.f221217e
                dx.i r0 = (dx.i) r0
                oq.u.b(r6)
                goto L6c
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                oq.u.b(r6)
                goto L40
            L26:
                oq.u.b(r6)
                xu1.a1 r6 = xu1.a1.this
                nu1.a r6 = xu1.a1.A9(r6)
                xu1.a1 r1 = xu1.a1.this
                xu1.f r4 = xu1.f.f221351a
                er.a r1 = xu1.a1.u9(r1, r4)
                r5.f221221j = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L40
                goto L6b
            L40:
                dx.i r6 = (dx.i) r6
                xu1.a1 r1 = xu1.a1.this
                boolean r3 = r6 instanceof dx.i.Right
                if (r3 == 0) goto L6c
                r3 = r6
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                xu1.n$i r4 = new xu1.n$i
                r4.<init>(r3)
                r5.f221217e = r6
                java.lang.Object r6 = vq.j.a(r3)
                r5.f221218f = r6
                r6 = 0
                r5.f221219g = r6
                r5.f221220h = r6
                r5.f221221j = r2
                java.lang.Object r6 = r1.F(r4, r5)
                if (r6 != r0) goto L6c
            L6b:
                return r0
            L6c:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: xu1.a1.b0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xu1.r rVar, xu1.w wVar, tq.e<? super oq.i0> eVar) {
            return a1.this.new b0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f221223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f221224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221225f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f221227h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f221225f = obj;
            this.f221227h |= PKIFailureInfo.systemUnavail;
            return a1.this.N9(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxu1/s;", "action", "Lxu1/w;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxu1/s;Lxu1/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<ShowDrivingLicenseDialog, xu1.w, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f221228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f221229f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f221230g;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowDrivingLicenseDialog showDrivingLicenseDialog = (ShowDrivingLicenseDialog) this.f221230g;
            Object objE = uq.b.e();
            int i15 = this.f221229f;
            if (i15 == 0) {
                oq.u.b(obj);
                DialogData dialogDataB = a1.this.drivingLicenceDialogMapper.b(new yu1.c.Params(showDrivingLicenseDialog.getDialog()));
                xw.b<xu1.n> bVarY1 = a1.this.Y1();
                xu1.n.ShowDialog showDialog = new xu1.n.ShowDialog(dialogDataB);
                this.f221230g = vq.j.a(showDrivingLicenseDialog);
                this.f221228e = vq.j.a(dialogDataB);
                this.f221229f = 1;
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
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDrivingLicenseDialog showDrivingLicenseDialog, xu1.w wVar, tq.e<? super oq.i0> eVar) {
            c0 c0Var = a1.this.new c0(eVar);
            c0Var.f221230g = showDrivingLicenseDialog;
            return c0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lxu1/w;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends xu1.w>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221232e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f221234g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z15, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f221234g = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f221232e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            a1 a1Var = a1.this;
            boolean z15 = this.f221234g;
            this.f221232e = 1;
            Object objM9 = a1Var.M9(z15, this);
            return objM9 == objE ? objE : objM9;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return a1.this.new d(this.f221234g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, ? extends xu1.w>> eVar) {
            return ((d) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxu1/f;", "<unused var>", "Lxu1/w;", "Loq/i0;", "<anonymous>", "(Lxu1/f;Lxu1/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<xu1.f, xu1.w, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221235e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f221237e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a1 f221238f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a1 a1Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f221238f = a1Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f221237e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                nu1.a aVar = this.f221238f.drivingLicenceContainersInteractor;
                this.f221237e = 1;
                Object objH = aVar.h(this);
                return objH == objE ? objE : objH;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f221238f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r11.F(r1, r10) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r10.f221235e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                oq.u.b(r11)
                r7 = r10
                goto L4f
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                oq.u.b(r11)
                r7 = r10
                goto L3e
            L20:
                oq.u.b(r11)
                xu1.a1 r11 = xu1.a1.this
                ac4.a r4 = xu1.a1.y9(r11)
                xu1.a1$d0$a r6 = new xu1.a1$d0$a
                xu1.a1 r11 = xu1.a1.this
                r1 = 0
                r6.<init>(r11, r1)
                r10.f221235e = r3
                r5 = 0
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r11 = ac4.a.a(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L3e
                goto L4e
            L3e:
                xu1.a1 r11 = xu1.a1.this
                xw.b r11 = r11.Y1()
                xu1.n$a r1 = xu1.n.a.f221375a
                r7.f221235e = r2
                java.lang.Object r11 = r11.F(r1, r10)
                if (r11 != r0) goto L4f
            L4e:
                return r0
            L4f:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: xu1.a1.d0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xu1.f fVar, xu1.w wVar, tq.e<? super oq.i0> eVar) {
            return a1.this.new d0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements er.l<String, oq.i0> {
        e(Object obj) {
            super(1, obj, a1.class, "onUrlClick", "onUrlClick(Ljava/lang/String;)V", 0);
        }

        public final void E(String str) {
            ((a1) this.f66391b).Y9(str);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            E(str);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f221239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f221240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f221241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f221242g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f221243h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f221244j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f221245k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f221246l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f221247m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f221249p;

        e0(tq.e<? super e0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f221247m = obj;
            this.f221249p |= PKIFailureInfo.systemUnavail;
            return a1.this.ga(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221250e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f221252g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f221252g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f221250e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = a1.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(this.f221252g, false, 2, null);
                this.f221250e = 1;
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
            a1 a1Var = a1.this;
            if (iVar instanceof dx.i.Left) {
                a1Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return a1.this.new f(this.f221252g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((f) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements mu.g<xu1.x.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f221253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1 f221254b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f221255a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a1 f221256b;

            /* JADX INFO: renamed from: xu1.a1$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5917a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f221257d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f221258e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f221259f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f221261h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f221262j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f221263k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f221264l;

                public C5917a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f221257d = obj;
                    this.f221258e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, a1 a1Var) {
                this.f221255a = hVar;
                this.f221256b = a1Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5917a c5917a;
                if (eVar instanceof C5917a) {
                    c5917a = (C5917a) eVar;
                    int i15 = c5917a.f221258e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5917a.f221258e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5917a = new C5917a(eVar);
                    }
                } else {
                    c5917a = new C5917a(eVar);
                }
                Object obj2 = c5917a.f221257d;
                Object objE = uq.b.e();
                int i16 = c5917a.f221258e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f221255a;
                    xu1.x.a aVarQ9 = this.f221256b.Q9((State) obj);
                    c5917a.f221259f = vq.j.a(obj);
                    c5917a.f221261h = vq.j.a(c5917a);
                    c5917a.f221262j = vq.j.a(obj);
                    c5917a.f221263k = vq.j.a(hVar);
                    c5917a.f221264l = 0;
                    c5917a.f221258e = 1;
                    if (hVar.F(aVarQ9, c5917a) == objE) {
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

        public g(mu.g gVar, a1 a1Var) {
            this.f221253a = gVar;
            this.f221254b = a1Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super xu1.x.a> hVar, tq.e eVar) {
            Object objA = this.f221253a.a(new a(hVar, this.f221254b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxu1/t;", "action", "Lxu1/w;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxu1/t;Lxu1/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ShowError, xu1.w, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f221265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f221266f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f221267g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(ShowError showError, a1 a1Var) {
            if (showError.getDrivingLicenceError() instanceof zu1.b.UpdateDocument) {
                a1Var.d9(new Retry(((zu1.b.UpdateDocument) showError.getDrivingLicenceError()).getUpdateMethodType()));
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowError showError = (ShowError) this.f221267g;
            Object objE = uq.b.e();
            int i15 = this.f221266f;
            if (i15 == 0) {
                oq.u.b(obj);
                yu1.j jVar = a1.this.drivingLicenceMainErrorMapper;
                zu1.b drivingLicenceError = showError.getDrivingLicenceError();
                er.a aVarB9 = a1.this.b9(xu1.g.f221354a);
                er.a aVarB10 = a1.this.b9(xu1.f.f221351a);
                final a1 a1Var = a1.this;
                jb4.b bVarB = jVar.b(new yu1.j.Params(drivingLicenceError, aVarB9, aVarB10, new er.a() { // from class: xu1.b1
                    @Override // er.a
                    public final Object a() {
                        return a1.h.O(showError, a1Var);
                    }
                }));
                xw.b<xu1.n> bVarY1 = a1.this.Y1();
                xu1.n.Error error = new xu1.n.Error(bVarB);
                this.f221267g = vq.j.a(showError);
                this.f221265e = vq.j.a(bVarB);
                this.f221266f = 1;
                if (bVarY1.F(error, this) == objE) {
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
        public final Object w(ShowError showError, xu1.w wVar, tq.e<? super oq.i0> eVar) {
            h hVar = a1.this.new h(eVar);
            hVar.f221267g = showError;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lxu1/w$b;", "state", "Lk10/l;", "Lxu1/w;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<k10.c0<xu1.w.b>, tq.e<? super k10.l<? extends xu1.w>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221270f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
        
            if (r10.F(r2, r9) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
        
            if (r10 == r1) goto L26;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f221270f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r9.f221269e
                r3 = 3
                r4 = 1
                r5 = 2
                if (r2 == 0) goto L2a
                if (r2 == r4) goto L26
                if (r2 == r5) goto L22
                if (r2 != r3) goto L1a
                oq.u.b(r10)
                goto La2
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                oq.u.b(r10)
                goto L7c
            L26:
                oq.u.b(r10)
                goto L47
            L2a:
                oq.u.b(r10)
                xu1.a1 r10 = xu1.a1.this
                mz3.w r10 = xu1.a1.H9(r10)
                mz3.w$a r2 = new mz3.w$a
                rq0.b$d r6 = xu1.a1.z9()
                r2.<init>(r6)
                r9.f221270f = r0
                r9.f221269e = r4
                java.lang.Object r10 = r10.c(r2, r9)
                if (r10 != r1) goto L47
                goto La1
            L47:
                mz3.w$b r10 = (mz3.w.b) r10
                boolean r2 = r10 instanceof mz3.w.b.NotReady
                if (r2 == 0) goto L81
                xu1.a1 r10 = xu1.a1.this
                xw.b r10 = r10.Y1()
                xu1.n$h r2 = new xu1.n$h
                ru1.a$a$a r3 = new ru1.a$a$a
                xu1.a1 r4 = xu1.a1.this
                xu1.v r4 = xu1.a1.G9(r4)
                boolean r4 = r4.getShowTemporaryDrivingLicence()
                gv3.b$b r6 = new gv3.b$b
                rq0.b$d r7 = xu1.a1.z9()
                r8 = 0
                r6.<init>(r7, r8, r5, r8)
                r3.<init>(r4, r6)
                r2.<init>(r3)
                r9.f221270f = r0
                r9.f221269e = r5
                java.lang.Object r10 = r10.F(r2, r9)
                if (r10 != r1) goto L7c
                goto La1
            L7c:
                k10.l r10 = r0.c()
                return r10
            L81:
                mz3.w$b$b r2 = mz3.w.b.C3231b.f129717a
                boolean r10 = fr.t.c(r10, r2)
                if (r10 == 0) goto La5
                xu1.a1 r10 = xu1.a1.this
                xu1.v r2 = xu1.a1.G9(r10)
                boolean r2 = r2.getShowTemporaryDrivingLicence()
                java.lang.Object r4 = vq.j.a(r0)
                r9.f221270f = r4
                r9.f221269e = r3
                java.lang.Object r10 = xu1.a1.x9(r10, r0, r2, r9)
                if (r10 != r1) goto La2
            La1:
                return r1
            La2:
                k10.l r10 = (k10.l) r10
                return r10
            La5:
                oq.p r10 = new oq.p
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: xu1.a1.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<xu1.w.b> c0Var, tq.e<? super k10.l<? extends xu1.w>> eVar) {
            return ((i) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = a1.this.new i(eVar);
            iVar.f221270f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxu1/p;", "<unused var>", "Lk10/c0;", "Lxu1/w$b;", "state", "Lk10/l;", "Lxu1/w;", "<anonymous>", "(Lxu1/p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<Retry, k10.c0<xu1.w.b>, tq.e<? super k10.l<? extends xu1.w>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221273f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f221273f;
            Object objE = uq.b.e();
            int i15 = this.f221272e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            a1 a1Var = a1.this;
            this.f221273f = vq.j.a(c0Var);
            this.f221272e = 1;
            Object objO9 = a1.O9(a1Var, c0Var, false, this, 2, null);
            return objO9 == objE ? objE : objO9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(Retry retry, k10.c0<xu1.w.b> c0Var, tq.e<? super k10.l<? extends xu1.w>> eVar) {
            j jVar = a1.this.new j(eVar);
            jVar.f221273f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxu1/g;", "<unused var>", "Lxu1/w$b;", "Loq/i0;", "<anonymous>", "(Lxu1/g;Lxu1/w$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<xu1.g, xu1.w.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221275e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f221275e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xu1.n> bVarY1 = a1.this.Y1();
                xu1.n.a aVar = xu1.n.a.f221375a;
                this.f221275e = 1;
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
        public final Object w(xu1.g gVar, xu1.w.b bVar, tq.e<? super oq.i0> eVar) {
            return a1.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxu1/u;", "event", "Lxu1/w$a;", "state", "Loq/i0;", "<anonymous>", "(Lxu1/u;Lxu1/w$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<UpdateDrivingLicence, xu1.w.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221278f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f221279g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            UpdateDrivingLicence updateDrivingLicence = (UpdateDrivingLicence) this.f221278f;
            xu1.w.Initialized initialized = (xu1.w.Initialized) this.f221279g;
            Object objE = uq.b.e();
            int i15 = this.f221277e;
            if (i15 == 0) {
                oq.u.b(obj);
                a1 a1Var = a1.this;
                mz3.z.b updateMethodType = updateDrivingLicence.getUpdateMethodType();
                y30.n.Switch.EnumC5973b selectedType = initialized.getSelectedType();
                String parentId = initialized.getDrivingLicenceScopes().getParentId();
                this.f221278f = vq.j.a(updateDrivingLicence);
                this.f221279g = vq.j.a(initialized);
                this.f221277e = 1;
                if (a1Var.ga(updateMethodType, selectedType, parentId, this) == objE) {
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
        public final Object w(UpdateDrivingLicence updateDrivingLicence, xu1.w.Initialized initialized, tq.e<? super oq.i0> eVar) {
            l lVar = a1.this.new l(eVar);
            lVar.f221278f = updateDrivingLicence;
            lVar.f221279g = initialized;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxu1/p;", "event", "Lxu1/w$a;", "state", "Loq/i0;", "<anonymous>", "(Lxu1/p;Lxu1/w$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<Retry, xu1.w.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221282f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f221283g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Retry retry = (Retry) this.f221282f;
            xu1.w.Initialized initialized = (xu1.w.Initialized) this.f221283g;
            Object objE = uq.b.e();
            int i15 = this.f221281e;
            if (i15 == 0) {
                oq.u.b(obj);
                a1 a1Var = a1.this;
                mz3.z.b updateMethodType = retry.getUpdateMethodType();
                y30.n.Switch.EnumC5973b selectedType = initialized.getSelectedType();
                String parentId = initialized.getDrivingLicenceScopes().getParentId();
                this.f221282f = vq.j.a(retry);
                this.f221283g = vq.j.a(initialized);
                this.f221281e = 1;
                if (a1Var.ga(updateMethodType, selectedType, parentId, this) == objE) {
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
        public final Object w(Retry retry, xu1.w.Initialized initialized, tq.e<? super oq.i0> eVar) {
            m mVar = a1.this.new m(eVar);
            mVar.f221282f = retry;
            mVar.f221283g = initialized;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxu1/l;", "<unused var>", "Lxu1/w$a;", "Loq/i0;", "<anonymous>", "(Lxu1/l;Lxu1/w$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<xu1.l, xu1.w.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f221285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f221286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f221287g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f221288h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f221289j;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f221289j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r7.f221286f
                cb4.d r0 = (cb4.DialogData) r0
                goto L22
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r0 = r7.f221286f
                oq.i0 r0 = (oq.i0) r0
            L22:
                java.lang.Object r0 = r7.f221285e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto La0
            L2b:
                oq.u.b(r8)
                goto L43
            L2f:
                oq.u.b(r8)
                xu1.a1 r8 = xu1.a1.this
                nu1.a r8 = xu1.a1.A9(r8)
                rq0.c r1 = rq0.c.VEHICLE_COLLISION
                r7.f221289j = r4
                java.lang.Object r8 = r8.d(r1, r7)
                if (r8 != r0) goto L43
                goto L9f
            L43:
                dx.i r8 = (dx.i) r8
                xu1.a1 r1 = xu1.a1.this
                boolean r4 = r8 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L75
                r2 = r8
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                oq.i0 r2 = (oq.i0) r2
                xu1.n$f r4 = new xu1.n$f
                nd3.a r6 = nd3.a.f134345a
                r4.<init>(r6)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f221285e = r8
                java.lang.Object r8 = vq.j.a(r2)
                r7.f221286f = r8
                r7.f221287g = r5
                r7.f221288h = r5
                r7.f221289j = r3
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto La0
                goto L9f
            L75:
                boolean r3 = r8 instanceof dx.i.Right
                if (r3 == 0) goto La3
                r3 = r8
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                xu1.n$i r4 = new xu1.n$i
                r4.<init>(r3)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f221285e = r8
                java.lang.Object r8 = vq.j.a(r3)
                r7.f221286f = r8
                r7.f221287g = r5
                r7.f221288h = r5
                r7.f221289j = r2
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto La0
            L9f:
                return r0
            La0:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            La3:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xu1.a1.n.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xu1.l lVar, xu1.w.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return a1.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxu1/h;", "<unused var>", "Lxu1/w$a;", "Loq/i0;", "<anonymous>", "(Lxu1/h;Lxu1/w$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<xu1.h, xu1.w.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f221291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f221292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f221293g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f221294h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f221295j;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f221295j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r7.f221292f
                cb4.d r0 = (cb4.DialogData) r0
                goto L22
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r0 = r7.f221292f
                oq.i0 r0 = (oq.i0) r0
            L22:
                java.lang.Object r0 = r7.f221291e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto La0
            L2b:
                oq.u.b(r8)
                goto L43
            L2f:
                oq.u.b(r8)
                xu1.a1 r8 = xu1.a1.this
                nu1.a r8 = xu1.a1.A9(r8)
                rq0.c r1 = rq0.c.FINES
                r7.f221295j = r4
                java.lang.Object r8 = r8.d(r1, r7)
                if (r8 != r0) goto L43
                goto L9f
            L43:
                dx.i r8 = (dx.i) r8
                xu1.a1 r1 = xu1.a1.this
                boolean r4 = r8 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L75
                r2 = r8
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                oq.i0 r2 = (oq.i0) r2
                xu1.n$f r4 = new xu1.n$f
                p62.a$a r6 = p62.a.C3769a.f153207a
                r4.<init>(r6)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f221291e = r8
                java.lang.Object r8 = vq.j.a(r2)
                r7.f221292f = r8
                r7.f221293g = r5
                r7.f221294h = r5
                r7.f221295j = r3
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto La0
                goto L9f
            L75:
                boolean r3 = r8 instanceof dx.i.Right
                if (r3 == 0) goto La3
                r3 = r8
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                xu1.n$i r4 = new xu1.n$i
                r4.<init>(r3)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f221291e = r8
                java.lang.Object r8 = vq.j.a(r3)
                r7.f221292f = r8
                r7.f221293g = r5
                r7.f221294h = r5
                r7.f221295j = r2
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto La0
            L9f:
                return r0
            La0:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            La3:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xu1.a1.o.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xu1.h hVar, xu1.w.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return a1.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxu1/j;", "action", "Lxu1/w$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxu1/j;Lxu1/w$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<GoToMoreDialog, xu1.w.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221298f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            GoToMoreDialog goToMoreDialog = (GoToMoreDialog) this.f221298f;
            Object objE = uq.b.e();
            int i15 = this.f221297e;
            if (i15 == 0) {
                oq.u.b(obj);
                a1 a1Var = a1.this;
                xu1.n.GoToMoreDialog goToMoreDialog2 = new xu1.n.GoToMoreDialog(new av1.e(goToMoreDialog.a()));
                this.f221298f = vq.j.a(goToMoreDialog);
                this.f221297e = 1;
                if (a1Var.F(goToMoreDialog2, this) == objE) {
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
        public final Object w(GoToMoreDialog goToMoreDialog, xu1.w.Initialized initialized, tq.e<? super oq.i0> eVar) {
            p pVar = a1.this.new p(eVar);
            pVar.f221298f = goToMoreDialog;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxu1/o;", "<unused var>", "Lxu1/w$a;", "state", "Loq/i0;", "<anonymous>", "(Lxu1/o;Lxu1/w$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<xu1.o, xu1.w.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221301f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xu1.w.Initialized initialized = (xu1.w.Initialized) this.f221301f;
            uq.b.e();
            if (this.f221300e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            xu1.w.Initialized.InterfaceC5918a bottomSheetState = initialized.getBottomSheetState();
            xu1.w.Initialized.InterfaceC5918a.C5919a c5919a = xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a;
            if (fr.t.c(bottomSheetState, c5919a)) {
                a1.this.d9(xu1.g.f221354a);
            } else {
                if (!(bottomSheetState instanceof xu1.w.Initialized.InterfaceC5918a.b)) {
                    throw new oq.p();
                }
                a1.this.d9(new SetBottomSheetState(c5919a));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xu1.o oVar, xu1.w.Initialized initialized, tq.e<? super oq.i0> eVar) {
            q qVar = a1.this.new q(eVar);
            qVar.f221301f = initialized;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxu1/g;", "<unused var>", "Lxu1/w$a;", "Loq/i0;", "<anonymous>", "(Lxu1/g;Lxu1/w$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<xu1.g, xu1.w.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221303e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.c(r1, r4) == r0) goto L15;
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
                int r1 = r4.f221303e
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
                xu1.a1 r5 = xu1.a1.this
                xw.b r5 = r5.Y1()
                xu1.n$a r1 = xu1.n.a.f221375a
                r4.f221303e = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                xu1.a1 r5 = xu1.a1.this
                f01.b r5 = xu1.a1.E9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f221303e = r2
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: xu1.a1.r.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xu1.g gVar, xu1.w.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return a1.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxu1/i;", "<unused var>", "Lxu1/w$a;", "state", "Loq/i0;", "<anonymous>", "(Lxu1/i;Lxu1/w$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<xu1.i, xu1.w.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f221305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f221306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f221307g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x004d  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List<DrivingLicenceData> listN;
            xu1.w.Initialized initialized = (xu1.w.Initialized) this.f221307g;
            Object objE = uq.b.e();
            int i15 = this.f221306f;
            if (i15 == 0) {
                oq.u.b(obj);
                List<DrivingLicenceData> listC = initialized.getDrivingLicenceScopes().c();
                if (listC.isEmpty()) {
                    listC = null;
                }
                List<DrivingLicenceData> list = listC;
                if (list == null) {
                    listN = pq.v.n();
                } else {
                    listN = initialized.getDrivingLicenceScopes().f() ? list : null;
                    if (listN == null) {
                        listN = pq.v.f0(list, 1);
                    }
                    if (listN == null) {
                        listN = pq.v.n();
                    }
                }
                xw.b<xu1.n> bVarY1 = a1.this.Y1();
                xu1.n.GoToHistoricDocuments goToHistoricDocuments = new xu1.n.GoToHistoricDocuments(new SetupData(listN));
                this.f221307g = vq.j.a(initialized);
                this.f221305e = vq.j.a(listN);
                this.f221306f = 1;
                if (bVarY1.F(goToHistoricDocuments, this) == objE) {
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
        public final Object w(xu1.i iVar, xu1.w.Initialized initialized, tq.e<? super oq.i0> eVar) {
            s sVar = a1.this.new s(eVar);
            sVar.f221307g = initialized;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxu1/k;", "<unused var>", "Lxu1/w$a;", "Loq/i0;", "<anonymous>", "(Lxu1/k;Lxu1/w$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<xu1.k, xu1.w.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f221309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f221310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f221311g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f221312h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f221313j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f221314k;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
        
            if (r6.F(r9, r17) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x012d, code lost:
        
            if (r6.F(r4, r17) == r1) goto L34;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xu1.a1.t.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xu1.k kVar, xu1.w.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return a1.this.new t(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxu1/m;", "action", "Lxu1/w$a;", "state", "Loq/i0;", "<anonymous>", "(Lxu1/m;Lxu1/w$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<GoToVerification, xu1.w.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f221317f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f221318g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f221319h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f221321a;

            static {
                int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
                try {
                    iArr[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f221321a = iArr;
            }
        }

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x003f  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            GoToVerification goToVerification = (GoToVerification) this.f221318g;
            xu1.w.Initialized initialized = (xu1.w.Initialized) this.f221319h;
            Object objE = uq.b.e();
            int i15 = this.f221317f;
            if (i15 == 0) {
                oq.u.b(obj);
                int i16 = a.f221321a[initialized.getSelectedType().ordinal()];
                int i17 = 0;
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new oq.p();
                    }
                    if (!initialized.getTemporaryLicenceStatus().e()) {
                        i17 = 1;
                    }
                } else if (!initialized.getDrivingLicenceStatus().e()) {
                    i17 = 1;
                }
                if (i17 != 0) {
                    a1.this.d9(new ShowDrivingLicenseDialog(new yu1.a.Refresh(goToVerification.a())));
                } else {
                    xw.b<xu1.n> bVarY1 = a1.this.Y1();
                    xu1.n.GoToVerification goToVerification2 = new xu1.n.GoToVerification(initialized.getSelectedType());
                    this.f221318g = vq.j.a(goToVerification);
                    this.f221319h = vq.j.a(initialized);
                    this.f221316e = i17;
                    this.f221317f = 1;
                    if (bVarY1.F(goToVerification2, this) == objE) {
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
        public final Object w(GoToVerification goToVerification, xu1.w.Initialized initialized, tq.e<? super oq.i0> eVar) {
            u uVar = a1.this.new u(eVar);
            uVar.f221318g = goToVerification;
            uVar.f221319h = initialized;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxu1/q;", "action", "Lk10/c0;", "Lxu1/w$a;", "state", "Lk10/l;", "Lxu1/w;", "<anonymous>", "(Lxu1/q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<SetBottomSheetState, k10.c0<xu1.w.Initialized>, tq.e<? super k10.l<? extends xu1.w>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221323f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f221324g;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xu1.w.Initialized O(SetBottomSheetState setBottomSheetState, xu1.w.Initialized initialized) {
            return xu1.w.Initialized.b(initialized, null, null, null, false, false, false, null, null, setBottomSheetState.getState(), null, null, null, 3839, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetBottomSheetState setBottomSheetState = (SetBottomSheetState) this.f221323f;
            k10.c0 c0Var = (k10.c0) this.f221324g;
            uq.b.e();
            if (this.f221322e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: xu1.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return a1.v.O(setBottomSheetState, (w.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetBottomSheetState setBottomSheetState, k10.c0<xu1.w.Initialized> c0Var, tq.e<? super k10.l<? extends xu1.w>> eVar) {
            v vVar = new v(eVar);
            vVar.f221323f = setBottomSheetState;
            vVar.f221324g = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxu1/d;", "<unused var>", "Lk10/c0;", "Lxu1/w$a;", "state", "Lk10/l;", "Lxu1/w;", "<anonymous>", "(Lxu1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<xu1.d, k10.c0<xu1.w.Initialized>, tq.e<? super k10.l<? extends xu1.w>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221326f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xu1.w.Initialized O(xu1.w.Initialized initialized) {
            return xu1.w.Initialized.b(initialized, null, null, null, false, false, false, null, null, null, null, null, null, 4063, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f221326f;
            uq.b.e();
            if (this.f221325e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: xu1.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return a1.w.O((w.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xu1.d dVar, k10.c0<xu1.w.Initialized> c0Var, tq.e<? super k10.l<? extends xu1.w>> eVar) {
            w wVar = new w(eVar);
            wVar.f221326f = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxu1/c;", "action", "Lk10/c0;", "Lxu1/w$a;", "state", "Lk10/l;", "Lxu1/w;", "<anonymous>", "(Lxu1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<ChangeTabAction, k10.c0<xu1.w.Initialized>, tq.e<? super k10.l<? extends xu1.w>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221328f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f221329g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xu1.w.Initialized O(ChangeTabAction changeTabAction, xu1.w.Initialized initialized) {
            return xu1.w.Initialized.b(initialized, changeTabAction.getSelectedType(), null, null, false, false, false, null, null, null, null, null, null, 4094, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeTabAction changeTabAction = (ChangeTabAction) this.f221328f;
            k10.c0 c0Var = (k10.c0) this.f221329g;
            uq.b.e();
            if (this.f221327e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: xu1.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return a1.x.O(changeTabAction, (w.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeTabAction changeTabAction, k10.c0<xu1.w.Initialized> c0Var, tq.e<? super k10.l<? extends xu1.w>> eVar) {
            x xVar = new x(eVar);
            xVar.f221328f = changeTabAction;
            xVar.f221329g = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxu1/e;", "<unused var>", "Lk10/c0;", "Lxu1/w$a;", "state", "Lk10/l;", "Lxu1/w;", "<anonymous>", "(Lxu1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<xu1.e, k10.c0<xu1.w.Initialized>, tq.e<? super k10.l<? extends xu1.w>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pu1.d f221332g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(pu1.d dVar, tq.e<? super y> eVar) {
            super(3, eVar);
            this.f221332g = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xu1.w.Initialized O(xu1.w.Initialized initialized) {
            return xu1.w.Initialized.b(initialized, null, null, null, false, false, false, null, null, null, null, null, null, 4079, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f221331f;
            Object objE = uq.b.e();
            int i15 = this.f221330e;
            if (i15 == 0) {
                oq.u.b(obj);
                pu1.d dVar = this.f221332g;
                pu1.d.Params params = new pu1.d.Params(false);
                this.f221331f = c0Var;
                this.f221330e = 1;
                if (dVar.d(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: xu1.f1
                @Override // er.l
                public final Object b(Object obj2) {
                    return a1.y.O((w.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xu1.e eVar, k10.c0<xu1.w.Initialized> c0Var, tq.e<? super k10.l<? extends xu1.w>> eVar2) {
            y yVar = new y(this.f221332g, eVar2);
            yVar.f221331f = c0Var;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxu1/o;", "<unused var>", "Lxu1/w$c;", "Loq/i0;", "<anonymous>", "(Lxu1/o;Lxu1/w$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<xu1.o, xu1.w.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221333e;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f221333e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xu1.n> bVarY1 = a1.this.Y1();
                xu1.n.a aVar = xu1.n.a.f221375a;
                this.f221333e = 1;
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
        public final Object w(xu1.o oVar, xu1.w.c cVar, tq.e<? super oq.i0> eVar) {
            return a1.this.new z(eVar).J(oq.i0.f148189a);
        }
    }

    public a1(n20.j jVar, mx.c cVar, ez.c cVar2, yu1.j jVar2, i70.n nVar, a14.w wVar, yu1.c cVar3, yu1.w wVar2, final pu1.d dVar, nu1.a aVar, ac4.a aVar2, pu1.b bVar, pu1.c cVar4, b00.c cVar5, t2.a aVar3, SetupData setupData, mz3.z zVar, mz3.w wVar3, qx.a aVar4, h64.r rVar, f01.b bVar2) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
        this.drivingLicenceMainErrorMapper = jVar2;
        this.snackBarManagerStateHolder = nVar;
        this.openUrlIntentUseCase = wVar;
        this.drivingLicenceDialogMapper = cVar3;
        this.drivingLicenceMainMapper = wVar2;
        this.drivingLicenceContainersInteractor = aVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getDrivingLicenseDataUseCase = bVar;
        this.getShowInfoBannerUseCase = cVar4;
        this.imageConverter = cVar5;
        this.deps = aVar3;
        this.setupData = setupData;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar3;
        this.imagePropertiesProvider = aVar4;
        this.loadServicesUseCase = rVar;
        this.launchNativeRatingUC = bVar2;
        xu1.w.b bVar3 = xu1.w.b.f221420a;
        this.initialState = bVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = jVar.a(bVar3, new er.l() { // from class: xu1.q0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.aa(this.f221390a, dVar, (k10.v) obj);
            }
        });
        this.state = a9(new g(e9().getState(), this), Q9(new State<>(bVar3, null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x0428  */
    /* JADX WARN: Code duplicated, block: B:104:0x043d  */
    /* JADX WARN: Code duplicated, block: B:105:0x044c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0450  */
    /* JADX WARN: Code duplicated, block: B:111:0x0462  */
    /* JADX WARN: Code duplicated, block: B:117:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:122:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:124:0x04d1 A[Catch: Exception -> 0x0584, CancellationException -> 0x0587, TryCatch #12 {CancellationException -> 0x0587, blocks: (B:118:0x04b5, B:120:0x04bb, B:124:0x04d1, B:126:0x04d5, B:113:0x0466), top: B:221:0x0466 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x04d5 A[Catch: Exception -> 0x0584, CancellationException -> 0x0587, TRY_LEAVE, TryCatch #12 {CancellationException -> 0x0587, blocks: (B:118:0x04b5, B:120:0x04bb, B:124:0x04d1, B:126:0x04d5, B:113:0x0466), top: B:221:0x0466 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x054d  */
    /* JADX WARN: Code duplicated, block: B:151:0x058c  */
    /* JADX WARN: Code duplicated, block: B:161:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:168:0x0637  */
    /* JADX WARN: Code duplicated, block: B:169:0x0639  */
    /* JADX WARN: Code duplicated, block: B:173:0x0696  */
    /* JADX WARN: Code duplicated, block: B:176:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:177:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:179:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:181:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:186:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:187:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:191:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:195:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:197:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:199:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:201:0x0704  */
    /* JADX WARN: Code duplicated, block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0256  */
    /* JADX WARN: Code duplicated, block: B:37:0x0271  */
    /* JADX WARN: Code duplicated, block: B:39:0x0275  */
    /* JADX WARN: Code duplicated, block: B:56:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:64:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:67:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:69:0x030a  */
    /* JADX WARN: Code duplicated, block: B:71:0x030e  */
    /* JADX WARN: Code duplicated, block: B:73:0x031f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0338  */
    /* JADX WARN: Code duplicated, block: B:83:0x033f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0344  */
    /* JADX WARN: Code duplicated, block: B:88:0x036b  */
    /* JADX WARN: Code duplicated, block: B:91:0x037c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0398  */
    /* JADX WARN: Code duplicated, block: B:94:0x039c  */
    /* JADX WARN: Code duplicated, block: B:97:0x03de  */
    public final Object M9(boolean z15, tq.e<? super dx.i<? extends dx.b, ? extends xu1.w>> eVar) throws Throwable {
        b bVar;
        Object obj;
        boolean z16;
        dx.i iVar;
        DrivingLicenceFullData drivingLicenceFullData;
        DrivingLicenceData drivingLicenceDataB;
        Date dateF;
        DrivingLicenceData drivingLicenceDataB2;
        String documentId;
        Object objF;
        boolean z17;
        Object obj2;
        int i15;
        int i16;
        DrivingLicenceScope scope;
        DrivingLicenceContainerData data;
        LocalDate expiredDate;
        dx.i iVar2;
        ou1.b bVar2;
        DrivingLicenceData drivingLicenceDataA;
        Date dateF2;
        DrivingLicenceData drivingLicenceDataA2;
        String documentId2;
        Object objF2;
        dx.i iVar3;
        DrivingLicenceFullData drivingLicenceFullData2;
        dx.i iVar4;
        int i17;
        ou1.b bVar3;
        Object obj3;
        int i18;
        boolean z18;
        int i19;
        int i25;
        DrivingLicenceScope scope2;
        DrivingLicenceContainerData data2;
        LocalDate expiredDate2;
        Object left;
        dx.i iVar5;
        ou1.b bVar4;
        Object objA;
        dx.i iVar6;
        Object obj4;
        int i26;
        int i27;
        int i28;
        dx.i iVar7;
        boolean zBooleanValue;
        dx.i iVar8;
        dx.i iVar9;
        Object objI;
        ou1.b bVar5;
        ou1.b bVar6;
        int i29;
        int i35;
        int i36;
        boolean z19;
        boolean z25;
        int i37;
        int i38;
        int i39;
        Object obj5;
        dx.i iVar10;
        dx.i iVar11;
        dx.i iVar12;
        Object objB;
        boolean zBooleanValue2;
        a1 a1Var;
        boolean z26;
        dx.i iVar13;
        dx.i iVar14;
        ou1.b bVar7;
        dx.i iVar15;
        String picture;
        Bitmap bitmap;
        Object objB2;
        dx.i iVar16;
        Object obj6;
        String str;
        ou1.b bVar8;
        boolean z27;
        int i45;
        int i46;
        int i47;
        int i48;
        dx.i iVar17;
        Object obj7;
        boolean z28;
        Object objF3;
        boolean z29;
        dx.i iVar18;
        dx.i iVar19;
        ou1.b bVar9;
        dx.i iVar20;
        int i49;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        Bitmap bitmap2;
        Object objC;
        Object obj8;
        ou1.b bVar10;
        int i65;
        boolean z35;
        dx.i iVar21;
        dx.i iVar22;
        dx.i iVar23;
        Object obj9;
        boolean z36;
        int i66;
        int i67;
        int i68;
        int i69;
        Bitmap bitmap3;
        List list;
        boolean z37;
        Object obj10;
        ou1.b bVar11;
        DrivingLicenceFullData drivingLicenceFullData3;
        List list2;
        boolean z38;
        boolean z39;
        boolean z45;
        Bitmap bitmap4;
        ou1.b bVar12;
        y30.n.Switch.EnumC5973b enumC5973b;
        y30.n.Switch.EnumC5973b enumC5973b2;
        y30.n.Switch.EnumC5973b enumC5973b3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i75 = bVar.D;
            if ((i75 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.D = i75 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objG = bVar.B;
        Object objE = uq.b.e();
        try {
            switch (bVar.D) {
                case 0:
                    oq.u.b(objG);
                    pu1.b bVar13 = this.getDrivingLicenseDataUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    bVar.f221197d = z15;
                    bVar.D = 1;
                    Object objA2 = bVar13.a(c1792a, bVar);
                    if (objA2 == objE) {
                        return objE;
                    }
                    obj = objA2;
                    z16 = z15;
                    iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Left) {
                        dx.b bVar14 = (dx.b) ((dx.i.Left) iVar).b();
                        d9(new ShowError(new zu1.b.GetDocument(bVar14)));
                        return new dx.i.Left(bVar14);
                    }
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    drivingLicenceFullData = (DrivingLicenceFullData) ((dx.i.Right) iVar).b();
                    if (drivingLicenceFullData.g() && !drivingLicenceFullData.f() && !drivingLicenceFullData.h()) {
                        return new dx.i.Right(xu1.w.c.f221421a);
                    }
                    nu1.a aVar = this.drivingLicenceContainersInteractor;
                    drivingLicenceDataB = drivingLicenceFullData.b();
                    if (drivingLicenceDataB != null || (scope = drivingLicenceDataB.getScope()) == null || (data = scope.getData()) == null || (expiredDate = data.getExpiredDate()) == null) {
                        dateF = null;
                    } else {
                        dateF = this.dateConverter.f(expiredDate);
                    }
                    drivingLicenceDataB2 = drivingLicenceFullData.b();
                    if (drivingLicenceDataB2 != null) {
                        documentId = drivingLicenceDataB2.getDocumentId();
                    } else {
                        documentId = null;
                    }
                    bVar.f221200g = vq.j.a(iVar);
                    bVar.f221201h = drivingLicenceFullData;
                    bVar.f221197d = z16;
                    bVar.f221209r = 0;
                    bVar.f221210s = 0;
                    bVar.D = 2;
                    objF = aVar.f(dateF, documentId, bVar);
                    if (objF == objE) {
                        return objE;
                    }
                    z17 = z16;
                    obj2 = objF;
                    i15 = 0;
                    i16 = 0;
                    iVar2 = (dx.i) obj2;
                    if (iVar2 instanceof dx.i.Left) {
                        dx.b bVar15 = (dx.b) ((dx.i.Left) iVar2).b();
                        d9(new ShowError(new zu1.b.GetDocumentValidityStatus(bVar15)));
                        left = new dx.i.Left(bVar15);
                    } else {
                        if (!(iVar2 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        bVar2 = (ou1.b) ((dx.i.Right) iVar2).b();
                        nu1.a aVar2 = this.drivingLicenceContainersInteractor;
                        drivingLicenceDataA = drivingLicenceFullData.a();
                        if (drivingLicenceDataA != null || (scope2 = drivingLicenceDataA.getScope()) == null || (data2 = scope2.getData()) == null || (expiredDate2 = data2.getExpiredDate()) == null) {
                            dateF2 = null;
                        } else {
                            dateF2 = this.dateConverter.f(expiredDate2);
                        }
                        drivingLicenceDataA2 = drivingLicenceFullData.a();
                        if (drivingLicenceDataA2 != null) {
                            documentId2 = drivingLicenceDataA2.getDocumentId();
                        } else {
                            documentId2 = null;
                        }
                        bVar.f221200g = vq.j.a(iVar);
                        bVar.f221201h = drivingLicenceFullData;
                        bVar.f221202j = vq.j.a(iVar2);
                        bVar.f221203k = bVar2;
                        bVar.f221197d = z17;
                        bVar.f221209r = i15;
                        bVar.f221210s = i16;
                        bVar.f221211t = 0;
                        bVar.f221212v = 0;
                        bVar.D = 3;
                        objF2 = aVar2.f(dateF2, documentId2, bVar);
                        if (objF2 == objE) {
                            return objE;
                        }
                        iVar3 = iVar2;
                        drivingLicenceFullData2 = drivingLicenceFullData;
                        iVar4 = iVar;
                        i17 = i16;
                        bVar3 = bVar2;
                        obj3 = objF2;
                        i18 = i15;
                        z18 = z17;
                        i19 = 0;
                        i25 = 0;
                        iVar5 = (dx.i) obj3;
                        if (iVar5 instanceof dx.i.Left) {
                            dx.b bVar16 = (dx.b) ((dx.i.Left) iVar5).b();
                            d9(new ShowError(new zu1.b.GetDocumentValidityStatus(bVar16)));
                            left = new dx.i.Left(bVar16);
                        } else {
                            if (iVar5 instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            bVar4 = (ou1.b) ((dx.i.Right) iVar5).b();
                            pu1.c cVar = this.getShowInfoBannerUseCase;
                            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                            bVar.f221200g = vq.j.a(iVar4);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar3);
                            bVar.f221203k = bVar3;
                            bVar.f221204l = vq.j.a(iVar5);
                            bVar.f221205m = bVar4;
                            bVar.f221197d = z18;
                            bVar.f221209r = i18;
                            bVar.f221210s = i17;
                            bVar.f221211t = i19;
                            bVar.f221212v = i25;
                            bVar.f221213w = 0;
                            bVar.f221214x = 0;
                            bVar.D = 4;
                            objA = cVar.a(c1792a2, bVar);
                            if (objA == objE) {
                                return objE;
                            }
                            iVar6 = iVar5;
                            obj4 = objA;
                            i26 = i19;
                            i27 = 0;
                            i28 = 0;
                            Boolean bool = (Boolean) obj4;
                            iVar7 = iVar6;
                            zBooleanValue = bool.booleanValue();
                            iVar8 = iVar3;
                            nu1.a aVar3 = this.drivingLicenceContainersInteractor;
                            iVar9 = iVar4;
                            bVar.f221200g = vq.j.a(iVar9);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar8);
                            bVar.f221203k = bVar3;
                            bVar.f221204l = vq.j.a(iVar7);
                            bVar.f221205m = bVar4;
                            bVar.f221197d = z18;
                            bVar.f221209r = i18;
                            bVar.f221210s = i17;
                            bVar.f221211t = i26;
                            bVar.f221212v = i25;
                            bVar.f221213w = i28;
                            bVar.f221214x = i27;
                            bVar.f221198e = zBooleanValue;
                            bVar.D = 5;
                            objI = aVar3.i(bVar);
                            if (objI == objE) {
                                return objE;
                            }
                            bVar5 = bVar3;
                            bVar6 = bVar4;
                            i29 = i18;
                            i35 = i26;
                            i36 = i28;
                            z19 = zBooleanValue;
                            z25 = z18;
                            i37 = i17;
                            i38 = i25;
                            i39 = i27;
                            obj5 = objI;
                            iVar10 = iVar7;
                            iVar11 = (dx.i) obj5;
                            iVar12 = iVar10;
                            if (iVar11 instanceof dx.i.Left) {
                                objB = vq.b.a(false);
                            } else {
                                if (iVar11 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVar11).b();
                            }
                            zBooleanValue2 = ((Boolean) objB).booleanValue();
                            try {
                                picture = drivingLicenceFullData2.getPicture();
                                if (picture != null) {
                                    try {
                                        b00.c cVar2 = this.imageConverter;
                                        try {
                                            try {
                                                bVar.f221200g = vq.j.a(iVar9);
                                                bVar.f221201h = drivingLicenceFullData2;
                                                bVar.f221202j = vq.j.a(iVar8);
                                                bVar.f221203k = bVar5;
                                                bVar.f221204l = vq.j.a(iVar12);
                                                bVar.f221205m = bVar6;
                                                bVar.f221206n = vq.j.a(picture);
                                                bVar.f221197d = z25;
                                                bVar.f221209r = i29;
                                                bVar.f221210s = i37;
                                                bVar.f221211t = i35;
                                                bVar.f221212v = i38;
                                                bVar.f221213w = i36;
                                                bVar.f221214x = i39;
                                                bVar.f221198e = z19;
                                                bVar.f221215y = 0;
                                                bVar.f221199f = zBooleanValue2;
                                                bVar.D = 6;
                                                objB2 = cVar2.b(picture, bVar);
                                                objE = objE;
                                                if (objB2 == objE) {
                                                    return objE;
                                                }
                                                iVar16 = iVar12;
                                                obj6 = objB2;
                                                iVar13 = iVar8;
                                                z26 = zBooleanValue2;
                                                str = picture;
                                                bVar8 = bVar5;
                                                z27 = z25;
                                                i45 = i37;
                                                i46 = i38;
                                                i47 = i39;
                                                i48 = 0;
                                                try {
                                                    iVar17 = (dx.i) obj6;
                                                    obj7 = objE;
                                                    try {
                                                        try {
                                                            if (!(iVar17 instanceof dx.i.Left)) {
                                                                bVar7 = bVar8;
                                                                i39 = i47;
                                                                i38 = i46;
                                                                i37 = i45;
                                                                z25 = z27;
                                                                iVar18 = iVar17;
                                                                iVar15 = iVar16;
                                                                objE = obj7;
                                                                a1Var = this;
                                                            } else {
                                                                if (iVar17 instanceof dx.i.Right) {
                                                                    Bitmap bitmap5 = (Bitmap) ((dx.i.Right) iVar17).b();
                                                                    a1Var = this;
                                                                    try {
                                                                        b00.c cVar3 = a1Var.imageConverter;
                                                                        z28 = z26;
                                                                        try {
                                                                            b00.f.ReduceDimension reduceDimension = new b00.f.ReduceDimension(a1Var.imagePropertiesProvider.getDefaultImageMaxSide());
                                                                            bVar.f221200g = vq.j.a(iVar9);
                                                                            bVar.f221201h = drivingLicenceFullData2;
                                                                            bVar.f221202j = vq.j.a(iVar13);
                                                                            bVar.f221203k = bVar8;
                                                                            bVar.f221204l = vq.j.a(iVar16);
                                                                            bVar.f221205m = bVar6;
                                                                            bVar.f221206n = vq.j.a(str);
                                                                            bVar.f221207p = vq.j.a(iVar17);
                                                                            bVar.f221208q = vq.j.a(bitmap5);
                                                                            bVar.f221197d = z27;
                                                                            bVar.f221209r = i29;
                                                                            bVar.f221210s = i45;
                                                                            bVar.f221211t = i35;
                                                                            bVar.f221212v = i46;
                                                                            bVar.f221213w = i36;
                                                                            bVar.f221214x = i47;
                                                                            bVar.f221198e = z19;
                                                                            bVar.f221215y = i48;
                                                                            z26 = z28;
                                                                            bVar.f221199f = z26;
                                                                            bVar.f221216z = 0;
                                                                            bVar.A = 0;
                                                                            bVar.D = 7;
                                                                            bVar7 = bVar8;
                                                                            try {
                                                                                objF3 = cVar3.f(bitmap5, reduceDimension, bVar);
                                                                                objE = obj7;
                                                                                if (objF3 == objE) {
                                                                                    return objE;
                                                                                }
                                                                                z29 = z26;
                                                                                i39 = i47;
                                                                                i38 = i46;
                                                                                i37 = i45;
                                                                                z25 = z27;
                                                                                iVar15 = iVar16;
                                                                                try {
                                                                                    z26 = z29;
                                                                                    iVar18 = (dx.i) objF3;
                                                                                } catch (Exception unused) {
                                                                                    z26 = z29;
                                                                                    iVar14 = iVar9;
                                                                                }
                                                                            } catch (Exception unused2) {
                                                                                objE = obj7;
                                                                                i39 = i47;
                                                                                i38 = i46;
                                                                                i37 = i45;
                                                                                z25 = z27;
                                                                                iVar14 = iVar9;
                                                                                iVar15 = iVar16;
                                                                            }
                                                                        } catch (Exception unused3) {
                                                                            bVar7 = bVar8;
                                                                            objE = obj7;
                                                                            z26 = z28;
                                                                            i39 = i47;
                                                                            i38 = i46;
                                                                            i37 = i45;
                                                                            z25 = z27;
                                                                            iVar14 = iVar9;
                                                                            iVar15 = iVar16;
                                                                        }
                                                                    } catch (Exception unused4) {
                                                                        bVar7 = bVar8;
                                                                        objE = obj7;
                                                                        i39 = i47;
                                                                        i38 = i46;
                                                                        i37 = i45;
                                                                        z25 = z27;
                                                                        iVar14 = iVar9;
                                                                        iVar15 = iVar16;
                                                                        px.f.e(px.f.f163100a, "Conversion to bitmap failed.", null, px.c.a(a1Var), 2, null);
                                                                        iVar19 = iVar14;
                                                                        bVar9 = bVar7;
                                                                        iVar20 = iVar15;
                                                                        i49 = i29;
                                                                        i55 = i35;
                                                                        i56 = i36;
                                                                        i57 = i37;
                                                                        i58 = i38;
                                                                        i59 = i39;
                                                                        bitmap2 = null;
                                                                        Object obj11 = objE;
                                                                        h64.r rVar = a1Var.loadServicesUseCase;
                                                                        gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                                                                        bVar.f221200g = vq.j.a(iVar19);
                                                                        bVar.f221201h = drivingLicenceFullData2;
                                                                        bVar.f221202j = vq.j.a(iVar13);
                                                                        bVar.f221203k = bVar9;
                                                                        bVar.f221204l = vq.j.a(iVar20);
                                                                        bVar.f221205m = bVar6;
                                                                        bVar.f221206n = bitmap2;
                                                                        bVar.f221207p = null;
                                                                        bVar.f221208q = null;
                                                                        bVar.f221197d = z25;
                                                                        bVar.f221209r = i49;
                                                                        bVar.f221210s = i57;
                                                                        bVar.f221211t = i55;
                                                                        bVar.f221212v = i58;
                                                                        bVar.f221213w = i56;
                                                                        bVar.f221214x = i59;
                                                                        bVar.f221198e = z19;
                                                                        bVar.f221199f = z26;
                                                                        bVar.D = 8;
                                                                        objC = rVar.c(c1792a3, bVar);
                                                                        obj8 = obj11;
                                                                        if (objC == obj8) {
                                                                            return obj8;
                                                                        }
                                                                        boolean z46 = z25;
                                                                        bVar10 = bVar9;
                                                                        i65 = i57;
                                                                        z35 = z46;
                                                                        iVar21 = iVar20;
                                                                        iVar22 = iVar13;
                                                                        iVar23 = iVar19;
                                                                        obj9 = objC;
                                                                        z36 = z26;
                                                                        i66 = i49;
                                                                        i67 = i55;
                                                                        i68 = i58;
                                                                        i69 = i56;
                                                                        bitmap3 = bitmap2;
                                                                        list = (List) obj9;
                                                                        z37 = z36;
                                                                        obj10 = obj8;
                                                                        nu1.a aVar4 = this.drivingLicenceContainersInteractor;
                                                                        bVar.f221200g = vq.j.a(iVar23);
                                                                        bVar.f221201h = drivingLicenceFullData2;
                                                                        bVar.f221202j = vq.j.a(iVar22);
                                                                        bVar.f221203k = bVar10;
                                                                        bVar.f221204l = vq.j.a(iVar21);
                                                                        bVar.f221205m = bVar6;
                                                                        bVar.f221206n = bitmap3;
                                                                        bVar.f221207p = list;
                                                                        bVar.f221197d = z35;
                                                                        bVar.f221209r = i66;
                                                                        bVar.f221210s = i65;
                                                                        bVar.f221211t = i67;
                                                                        bVar.f221212v = i68;
                                                                        bVar.f221213w = i69;
                                                                        bVar.f221214x = i59;
                                                                        bVar.f221198e = z19;
                                                                        bVar.f221199f = z37;
                                                                        bVar.D = 9;
                                                                        objG = aVar4.g(bVar);
                                                                        if (objG == obj10) {
                                                                            return obj10;
                                                                        }
                                                                        bVar11 = bVar6;
                                                                        drivingLicenceFullData3 = drivingLicenceFullData2;
                                                                        list2 = list;
                                                                        z38 = z37;
                                                                        z39 = z35;
                                                                        z45 = z19;
                                                                        bitmap4 = bitmap3;
                                                                        bVar12 = bVar10;
                                                                        String str2 = (String) ((dx.i) objG).a();
                                                                        enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                                                                        if (z39) {
                                                                            enumC5973b2 = enumC5973b;
                                                                        } else {
                                                                            enumC5973b2 = null;
                                                                        }
                                                                        if (enumC5973b2 == null) {
                                                                            if (drivingLicenceFullData3.g()) {
                                                                                enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                                                            } else {
                                                                                enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                                                            }
                                                                            enumC5973b3 = enumC5973b;
                                                                        } else {
                                                                            enumC5973b3 = enumC5973b2;
                                                                        }
                                                                        if (!drivingLicenceFullData3.f()) {
                                                                            bVar11 = ou1.b.INACTIVE;
                                                                        }
                                                                        left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str2, 32, null));
                                                                        return left;
                                                                    }
                                                                } else {
                                                                    a1Var = this;
                                                                    bVar7 = bVar8;
                                                                    objE = obj7;
                                                                    try {
                                                                        throw new oq.p();
                                                                    } catch (Exception unused5) {
                                                                    }
                                                                }
                                                                i39 = i47;
                                                                i38 = i46;
                                                                i37 = i45;
                                                                z25 = z27;
                                                                iVar14 = iVar9;
                                                                iVar15 = iVar16;
                                                                px.f.e(px.f.f163100a, "Conversion to bitmap failed.", null, px.c.a(a1Var), 2, null);
                                                                iVar19 = iVar14;
                                                                bVar9 = bVar7;
                                                                iVar20 = iVar15;
                                                                i49 = i29;
                                                                i55 = i35;
                                                                i56 = i36;
                                                                i57 = i37;
                                                                i58 = i38;
                                                                i59 = i39;
                                                                bitmap2 = null;
                                                                Object obj12 = objE;
                                                                h64.r rVar2 = a1Var.loadServicesUseCase;
                                                                gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                                                                bVar.f221200g = vq.j.a(iVar19);
                                                                bVar.f221201h = drivingLicenceFullData2;
                                                                bVar.f221202j = vq.j.a(iVar13);
                                                                bVar.f221203k = bVar9;
                                                                bVar.f221204l = vq.j.a(iVar20);
                                                                bVar.f221205m = bVar6;
                                                                bVar.f221206n = bitmap2;
                                                                bVar.f221207p = null;
                                                                bVar.f221208q = null;
                                                                bVar.f221197d = z25;
                                                                bVar.f221209r = i49;
                                                                bVar.f221210s = i57;
                                                                bVar.f221211t = i55;
                                                                bVar.f221212v = i58;
                                                                bVar.f221213w = i56;
                                                                bVar.f221214x = i59;
                                                                bVar.f221198e = z19;
                                                                bVar.f221199f = z26;
                                                                bVar.D = 8;
                                                                objC = rVar2.c(c1792a4, bVar);
                                                                obj8 = obj12;
                                                                if (objC == obj8) {
                                                                    return obj8;
                                                                }
                                                                boolean z47 = z25;
                                                                bVar10 = bVar9;
                                                                i65 = i57;
                                                                z35 = z47;
                                                                iVar21 = iVar20;
                                                                iVar22 = iVar13;
                                                                iVar23 = iVar19;
                                                                obj9 = objC;
                                                                z36 = z26;
                                                                i66 = i49;
                                                                i67 = i55;
                                                                i68 = i58;
                                                                i69 = i56;
                                                                bitmap3 = bitmap2;
                                                                list = (List) obj9;
                                                                z37 = z36;
                                                                obj10 = obj8;
                                                                nu1.a aVar5 = this.drivingLicenceContainersInteractor;
                                                                bVar.f221200g = vq.j.a(iVar23);
                                                                bVar.f221201h = drivingLicenceFullData2;
                                                                bVar.f221202j = vq.j.a(iVar22);
                                                                bVar.f221203k = bVar10;
                                                                bVar.f221204l = vq.j.a(iVar21);
                                                                bVar.f221205m = bVar6;
                                                                bVar.f221206n = bitmap3;
                                                                bVar.f221207p = list;
                                                                bVar.f221197d = z35;
                                                                bVar.f221209r = i66;
                                                                bVar.f221210s = i65;
                                                                bVar.f221211t = i67;
                                                                bVar.f221212v = i68;
                                                                bVar.f221213w = i69;
                                                                bVar.f221214x = i59;
                                                                bVar.f221198e = z19;
                                                                bVar.f221199f = z37;
                                                                bVar.D = 9;
                                                                objG = aVar5.g(bVar);
                                                                if (objG == obj10) {
                                                                    return obj10;
                                                                }
                                                                bVar11 = bVar6;
                                                                drivingLicenceFullData3 = drivingLicenceFullData2;
                                                                list2 = list;
                                                                z38 = z37;
                                                                z39 = z35;
                                                                z45 = z19;
                                                                bitmap4 = bitmap3;
                                                                bVar12 = bVar10;
                                                                String str3 = (String) ((dx.i) objG).a();
                                                                enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                                                                if (z39) {
                                                                    enumC5973b2 = enumC5973b;
                                                                } else {
                                                                    enumC5973b2 = null;
                                                                }
                                                                if (enumC5973b2 == null) {
                                                                    if (drivingLicenceFullData3.g() || (!drivingLicenceFullData3.f() && !drivingLicenceFullData3.h())) {
                                                                        enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                                                    }
                                                                    enumC5973b3 = enumC5973b;
                                                                } else {
                                                                    enumC5973b3 = enumC5973b2;
                                                                }
                                                                if (!drivingLicenceFullData3.f()) {
                                                                    bVar11 = ou1.b.INACTIVE;
                                                                }
                                                                left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str3, 32, null));
                                                            }
                                                            bitmap = (Bitmap) iVar18.a();
                                                            iVar9 = iVar14;
                                                            zBooleanValue2 = z26;
                                                        } catch (Exception unused6) {
                                                            px.f.e(px.f.f163100a, "Conversion to bitmap failed.", null, px.c.a(a1Var), 2, null);
                                                            iVar19 = iVar14;
                                                            bVar9 = bVar7;
                                                            iVar20 = iVar15;
                                                            i49 = i29;
                                                            i55 = i35;
                                                            i56 = i36;
                                                            i57 = i37;
                                                            i58 = i38;
                                                            i59 = i39;
                                                            bitmap2 = null;
                                                        }
                                                        iVar14 = iVar9;
                                                    } catch (Exception unused7) {
                                                        a1Var = this;
                                                    }
                                                } catch (Exception unused8) {
                                                    a1Var = this;
                                                    bVar7 = bVar8;
                                                }
                                            } catch (Exception unused9) {
                                                bVar5 = bVar5;
                                                objE = objE;
                                                a1Var = this;
                                                z26 = zBooleanValue2;
                                                iVar13 = iVar8;
                                                iVar14 = iVar9;
                                                bVar7 = bVar5;
                                                iVar15 = iVar12;
                                            }
                                        } catch (CancellationException e15) {
                                            throw e15;
                                        }
                                    } catch (CancellationException e16) {
                                        throw e16;
                                    } catch (Exception unused10) {
                                        objE = objE;
                                        a1Var = this;
                                        z26 = zBooleanValue2;
                                        iVar13 = iVar8;
                                        iVar14 = iVar9;
                                        bVar7 = bVar5;
                                        iVar15 = iVar12;
                                        px.f.e(px.f.f163100a, "Conversion to bitmap failed.", null, px.c.a(a1Var), 2, null);
                                        iVar19 = iVar14;
                                        bVar9 = bVar7;
                                        iVar20 = iVar15;
                                        i49 = i29;
                                        i55 = i35;
                                        i56 = i36;
                                        i57 = i37;
                                        i58 = i38;
                                        i59 = i39;
                                        bitmap2 = null;
                                        Object obj13 = objE;
                                        h64.r rVar3 = a1Var.loadServicesUseCase;
                                        gz.b.a.C1792a c1792a5 = gz.b.a.C1792a.f78542a;
                                        bVar.f221200g = vq.j.a(iVar19);
                                        bVar.f221201h = drivingLicenceFullData2;
                                        bVar.f221202j = vq.j.a(iVar13);
                                        bVar.f221203k = bVar9;
                                        bVar.f221204l = vq.j.a(iVar20);
                                        bVar.f221205m = bVar6;
                                        bVar.f221206n = bitmap2;
                                        bVar.f221207p = null;
                                        bVar.f221208q = null;
                                        bVar.f221197d = z25;
                                        bVar.f221209r = i49;
                                        bVar.f221210s = i57;
                                        bVar.f221211t = i55;
                                        bVar.f221212v = i58;
                                        bVar.f221213w = i56;
                                        bVar.f221214x = i59;
                                        bVar.f221198e = z19;
                                        bVar.f221199f = z26;
                                        bVar.D = 8;
                                        objC = rVar3.c(c1792a5, bVar);
                                        obj8 = obj13;
                                        if (objC == obj8) {
                                            return obj8;
                                        }
                                        boolean z48 = z25;
                                        bVar10 = bVar9;
                                        i65 = i57;
                                        z35 = z48;
                                        iVar21 = iVar20;
                                        iVar22 = iVar13;
                                        iVar23 = iVar19;
                                        obj9 = objC;
                                        z36 = z26;
                                        i66 = i49;
                                        i67 = i55;
                                        i68 = i58;
                                        i69 = i56;
                                        bitmap3 = bitmap2;
                                        list = (List) obj9;
                                        z37 = z36;
                                        obj10 = obj8;
                                        nu1.a aVar6 = this.drivingLicenceContainersInteractor;
                                        bVar.f221200g = vq.j.a(iVar23);
                                        bVar.f221201h = drivingLicenceFullData2;
                                        bVar.f221202j = vq.j.a(iVar22);
                                        bVar.f221203k = bVar10;
                                        bVar.f221204l = vq.j.a(iVar21);
                                        bVar.f221205m = bVar6;
                                        bVar.f221206n = bitmap3;
                                        bVar.f221207p = list;
                                        bVar.f221197d = z35;
                                        bVar.f221209r = i66;
                                        bVar.f221210s = i65;
                                        bVar.f221211t = i67;
                                        bVar.f221212v = i68;
                                        bVar.f221213w = i69;
                                        bVar.f221214x = i59;
                                        bVar.f221198e = z19;
                                        bVar.f221199f = z37;
                                        bVar.D = 9;
                                        objG = aVar6.g(bVar);
                                        if (objG == obj10) {
                                            return obj10;
                                        }
                                        bVar11 = bVar6;
                                        drivingLicenceFullData3 = drivingLicenceFullData2;
                                        list2 = list;
                                        z38 = z37;
                                        z39 = z35;
                                        z45 = z19;
                                        bitmap4 = bitmap3;
                                        bVar12 = bVar10;
                                        String str4 = (String) ((dx.i) objG).a();
                                        enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                                        if (z39) {
                                            enumC5973b2 = enumC5973b;
                                        } else {
                                            enumC5973b2 = null;
                                        }
                                        if (enumC5973b2 == null) {
                                            if (drivingLicenceFullData3.g()) {
                                                enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                            } else {
                                                enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                            }
                                            enumC5973b3 = enumC5973b;
                                        } else {
                                            enumC5973b3 = enumC5973b2;
                                        }
                                        if (!drivingLicenceFullData3.f()) {
                                            bVar11 = ou1.b.INACTIVE;
                                        }
                                        left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str4, 32, null));
                                        return left;
                                    }
                                } else {
                                    ou1.b bVar17 = bVar5;
                                    a1Var = this;
                                    iVar13 = iVar8;
                                    bitmap = null;
                                    bVar7 = bVar17;
                                    iVar15 = iVar12;
                                }
                                z26 = zBooleanValue2;
                                bVar9 = bVar7;
                                iVar19 = iVar9;
                                iVar20 = iVar15;
                                i49 = i29;
                                i55 = i35;
                                i56 = i36;
                                i57 = i37;
                                i58 = i38;
                                i59 = i39;
                                bitmap2 = bitmap;
                            } catch (Exception unused11) {
                            }
                            Object obj14 = objE;
                            h64.r rVar4 = a1Var.loadServicesUseCase;
                            gz.b.a.C1792a c1792a6 = gz.b.a.C1792a.f78542a;
                            bVar.f221200g = vq.j.a(iVar19);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar13);
                            bVar.f221203k = bVar9;
                            bVar.f221204l = vq.j.a(iVar20);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = bitmap2;
                            bVar.f221207p = null;
                            bVar.f221208q = null;
                            bVar.f221197d = z25;
                            bVar.f221209r = i49;
                            bVar.f221210s = i57;
                            bVar.f221211t = i55;
                            bVar.f221212v = i58;
                            bVar.f221213w = i56;
                            bVar.f221214x = i59;
                            bVar.f221198e = z19;
                            bVar.f221199f = z26;
                            bVar.D = 8;
                            objC = rVar4.c(c1792a6, bVar);
                            obj8 = obj14;
                            if (objC == obj8) {
                                return obj8;
                            }
                            boolean z49 = z25;
                            bVar10 = bVar9;
                            i65 = i57;
                            z35 = z49;
                            iVar21 = iVar20;
                            iVar22 = iVar13;
                            iVar23 = iVar19;
                            obj9 = objC;
                            z36 = z26;
                            i66 = i49;
                            i67 = i55;
                            i68 = i58;
                            i69 = i56;
                            bitmap3 = bitmap2;
                            list = (List) obj9;
                            z37 = z36;
                            obj10 = obj8;
                            nu1.a aVar7 = this.drivingLicenceContainersInteractor;
                            bVar.f221200g = vq.j.a(iVar23);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar22);
                            bVar.f221203k = bVar10;
                            bVar.f221204l = vq.j.a(iVar21);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = bitmap3;
                            bVar.f221207p = list;
                            bVar.f221197d = z35;
                            bVar.f221209r = i66;
                            bVar.f221210s = i65;
                            bVar.f221211t = i67;
                            bVar.f221212v = i68;
                            bVar.f221213w = i69;
                            bVar.f221214x = i59;
                            bVar.f221198e = z19;
                            bVar.f221199f = z37;
                            bVar.D = 9;
                            objG = aVar7.g(bVar);
                            if (objG == obj10) {
                                return obj10;
                            }
                            bVar11 = bVar6;
                            drivingLicenceFullData3 = drivingLicenceFullData2;
                            list2 = list;
                            z38 = z37;
                            z39 = z35;
                            z45 = z19;
                            bitmap4 = bitmap3;
                            bVar12 = bVar10;
                            String str5 = (String) ((dx.i) objG).a();
                            enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                            if (z39) {
                                enumC5973b2 = enumC5973b;
                            } else {
                                enumC5973b2 = null;
                            }
                            if (enumC5973b2 == null) {
                                if (drivingLicenceFullData3.g()) {
                                    enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                } else {
                                    enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                }
                                enumC5973b3 = enumC5973b;
                            } else {
                                enumC5973b3 = enumC5973b2;
                            }
                            if (!drivingLicenceFullData3.f()) {
                                bVar11 = ou1.b.INACTIVE;
                            }
                            left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str5, 32, null));
                        }
                    }
                    return left;
                case 1:
                    obj = objG;
                    z16 = bVar.f221197d;
                    oq.u.b(obj);
                    iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Left) {
                        dx.b bVar18 = (dx.b) ((dx.i.Left) iVar).b();
                        d9(new ShowError(new zu1.b.GetDocument(bVar18)));
                        return new dx.i.Left(bVar18);
                    }
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    drivingLicenceFullData = (DrivingLicenceFullData) ((dx.i.Right) iVar).b();
                    if (drivingLicenceFullData.g()) {
                        break;
                    }
                    nu1.a aVar8 = this.drivingLicenceContainersInteractor;
                    drivingLicenceDataB = drivingLicenceFullData.b();
                    if (drivingLicenceDataB != null) {
                        dateF = null;
                    } else {
                        dateF = null;
                    }
                    drivingLicenceDataB2 = drivingLicenceFullData.b();
                    if (drivingLicenceDataB2 != null) {
                        documentId = drivingLicenceDataB2.getDocumentId();
                    } else {
                        documentId = null;
                    }
                    bVar.f221200g = vq.j.a(iVar);
                    bVar.f221201h = drivingLicenceFullData;
                    bVar.f221197d = z16;
                    bVar.f221209r = 0;
                    bVar.f221210s = 0;
                    bVar.D = 2;
                    objF = aVar8.f(dateF, documentId, bVar);
                    if (objF == objE) {
                        return objE;
                    }
                    z17 = z16;
                    obj2 = objF;
                    i15 = 0;
                    i16 = 0;
                    iVar2 = (dx.i) obj2;
                    if (iVar2 instanceof dx.i.Left) {
                        dx.b bVar19 = (dx.b) ((dx.i.Left) iVar2).b();
                        d9(new ShowError(new zu1.b.GetDocumentValidityStatus(bVar19)));
                        left = new dx.i.Left(bVar19);
                    } else {
                        if (!(iVar2 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        bVar2 = (ou1.b) ((dx.i.Right) iVar2).b();
                        nu1.a aVar9 = this.drivingLicenceContainersInteractor;
                        drivingLicenceDataA = drivingLicenceFullData.a();
                        if (drivingLicenceDataA != null) {
                            dateF2 = null;
                        } else {
                            dateF2 = null;
                        }
                        drivingLicenceDataA2 = drivingLicenceFullData.a();
                        if (drivingLicenceDataA2 != null) {
                            documentId2 = drivingLicenceDataA2.getDocumentId();
                        } else {
                            documentId2 = null;
                        }
                        bVar.f221200g = vq.j.a(iVar);
                        bVar.f221201h = drivingLicenceFullData;
                        bVar.f221202j = vq.j.a(iVar2);
                        bVar.f221203k = bVar2;
                        bVar.f221197d = z17;
                        bVar.f221209r = i15;
                        bVar.f221210s = i16;
                        bVar.f221211t = 0;
                        bVar.f221212v = 0;
                        bVar.D = 3;
                        objF2 = aVar9.f(dateF2, documentId2, bVar);
                        if (objF2 == objE) {
                            return objE;
                        }
                        iVar3 = iVar2;
                        drivingLicenceFullData2 = drivingLicenceFullData;
                        iVar4 = iVar;
                        i17 = i16;
                        bVar3 = bVar2;
                        obj3 = objF2;
                        i18 = i15;
                        z18 = z17;
                        i19 = 0;
                        i25 = 0;
                        iVar5 = (dx.i) obj3;
                        if (iVar5 instanceof dx.i.Left) {
                            dx.b bVar110 = (dx.b) ((dx.i.Left) iVar5).b();
                            d9(new ShowError(new zu1.b.GetDocumentValidityStatus(bVar110)));
                            left = new dx.i.Left(bVar110);
                        } else {
                            if (iVar5 instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            bVar4 = (ou1.b) ((dx.i.Right) iVar5).b();
                            pu1.c cVar4 = this.getShowInfoBannerUseCase;
                            gz.b.a.C1792a c1792a7 = gz.b.a.C1792a.f78542a;
                            bVar.f221200g = vq.j.a(iVar4);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar3);
                            bVar.f221203k = bVar3;
                            bVar.f221204l = vq.j.a(iVar5);
                            bVar.f221205m = bVar4;
                            bVar.f221197d = z18;
                            bVar.f221209r = i18;
                            bVar.f221210s = i17;
                            bVar.f221211t = i19;
                            bVar.f221212v = i25;
                            bVar.f221213w = 0;
                            bVar.f221214x = 0;
                            bVar.D = 4;
                            objA = cVar4.a(c1792a7, bVar);
                            if (objA == objE) {
                                return objE;
                            }
                            iVar6 = iVar5;
                            obj4 = objA;
                            i26 = i19;
                            i27 = 0;
                            i28 = 0;
                            Boolean bool2 = (Boolean) obj4;
                            iVar7 = iVar6;
                            zBooleanValue = bool2.booleanValue();
                            iVar8 = iVar3;
                            nu1.a aVar10 = this.drivingLicenceContainersInteractor;
                            iVar9 = iVar4;
                            bVar.f221200g = vq.j.a(iVar9);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar8);
                            bVar.f221203k = bVar3;
                            bVar.f221204l = vq.j.a(iVar7);
                            bVar.f221205m = bVar4;
                            bVar.f221197d = z18;
                            bVar.f221209r = i18;
                            bVar.f221210s = i17;
                            bVar.f221211t = i26;
                            bVar.f221212v = i25;
                            bVar.f221213w = i28;
                            bVar.f221214x = i27;
                            bVar.f221198e = zBooleanValue;
                            bVar.D = 5;
                            objI = aVar10.i(bVar);
                            if (objI == objE) {
                                return objE;
                            }
                            bVar5 = bVar3;
                            bVar6 = bVar4;
                            i29 = i18;
                            i35 = i26;
                            i36 = i28;
                            z19 = zBooleanValue;
                            z25 = z18;
                            i37 = i17;
                            i38 = i25;
                            i39 = i27;
                            obj5 = objI;
                            iVar10 = iVar7;
                            iVar11 = (dx.i) obj5;
                            iVar12 = iVar10;
                            if (iVar11 instanceof dx.i.Left) {
                                objB = vq.b.a(false);
                            } else {
                                if (iVar11 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVar11).b();
                            }
                            zBooleanValue2 = ((Boolean) objB).booleanValue();
                            picture = drivingLicenceFullData2.getPicture();
                            if (picture != null) {
                                b00.c cVar5 = this.imageConverter;
                                bVar.f221200g = vq.j.a(iVar9);
                                bVar.f221201h = drivingLicenceFullData2;
                                bVar.f221202j = vq.j.a(iVar8);
                                bVar.f221203k = bVar5;
                                bVar.f221204l = vq.j.a(iVar12);
                                bVar.f221205m = bVar6;
                                bVar.f221206n = vq.j.a(picture);
                                bVar.f221197d = z25;
                                bVar.f221209r = i29;
                                bVar.f221210s = i37;
                                bVar.f221211t = i35;
                                bVar.f221212v = i38;
                                bVar.f221213w = i36;
                                bVar.f221214x = i39;
                                bVar.f221198e = z19;
                                bVar.f221215y = 0;
                                bVar.f221199f = zBooleanValue2;
                                bVar.D = 6;
                                objB2 = cVar5.b(picture, bVar);
                                objE = objE;
                                if (objB2 == objE) {
                                    return objE;
                                }
                                iVar16 = iVar12;
                                obj6 = objB2;
                                iVar13 = iVar8;
                                z26 = zBooleanValue2;
                                str = picture;
                                bVar8 = bVar5;
                                z27 = z25;
                                i45 = i37;
                                i46 = i38;
                                i47 = i39;
                                i48 = 0;
                                iVar17 = (dx.i) obj6;
                                obj7 = objE;
                                if (!(iVar17 instanceof dx.i.Left)) {
                                    bVar7 = bVar8;
                                    i39 = i47;
                                    i38 = i46;
                                    i37 = i45;
                                    z25 = z27;
                                    iVar18 = iVar17;
                                    iVar15 = iVar16;
                                    objE = obj7;
                                    a1Var = this;
                                } else {
                                    if (iVar17 instanceof dx.i.Right) {
                                        a1Var = this;
                                        bVar7 = bVar8;
                                        objE = obj7;
                                        throw new oq.p();
                                    }
                                    Bitmap bitmap6 = (Bitmap) ((dx.i.Right) iVar17).b();
                                    a1Var = this;
                                    b00.c cVar6 = a1Var.imageConverter;
                                    z28 = z26;
                                    b00.f.ReduceDimension reduceDimension2 = new b00.f.ReduceDimension(a1Var.imagePropertiesProvider.getDefaultImageMaxSide());
                                    bVar.f221200g = vq.j.a(iVar9);
                                    bVar.f221201h = drivingLicenceFullData2;
                                    bVar.f221202j = vq.j.a(iVar13);
                                    bVar.f221203k = bVar8;
                                    bVar.f221204l = vq.j.a(iVar16);
                                    bVar.f221205m = bVar6;
                                    bVar.f221206n = vq.j.a(str);
                                    bVar.f221207p = vq.j.a(iVar17);
                                    bVar.f221208q = vq.j.a(bitmap6);
                                    bVar.f221197d = z27;
                                    bVar.f221209r = i29;
                                    bVar.f221210s = i45;
                                    bVar.f221211t = i35;
                                    bVar.f221212v = i46;
                                    bVar.f221213w = i36;
                                    bVar.f221214x = i47;
                                    bVar.f221198e = z19;
                                    bVar.f221215y = i48;
                                    z26 = z28;
                                    bVar.f221199f = z26;
                                    bVar.f221216z = 0;
                                    bVar.A = 0;
                                    bVar.D = 7;
                                    bVar7 = bVar8;
                                    objF3 = cVar6.f(bitmap6, reduceDimension2, bVar);
                                    objE = obj7;
                                    if (objF3 == objE) {
                                        return objE;
                                    }
                                    z29 = z26;
                                    i39 = i47;
                                    i38 = i46;
                                    i37 = i45;
                                    z25 = z27;
                                    iVar15 = iVar16;
                                    z26 = z29;
                                    iVar18 = (dx.i) objF3;
                                    i39 = i47;
                                    i38 = i46;
                                    i37 = i45;
                                    z25 = z27;
                                    iVar14 = iVar9;
                                    iVar15 = iVar16;
                                    px.f.e(px.f.f163100a, "Conversion to bitmap failed.", null, px.c.a(a1Var), 2, null);
                                    iVar19 = iVar14;
                                    bVar9 = bVar7;
                                    iVar20 = iVar15;
                                    i49 = i29;
                                    i55 = i35;
                                    i56 = i36;
                                    i57 = i37;
                                    i58 = i38;
                                    i59 = i39;
                                    bitmap2 = null;
                                    Object obj15 = objE;
                                    h64.r rVar5 = a1Var.loadServicesUseCase;
                                    gz.b.a.C1792a c1792a8 = gz.b.a.C1792a.f78542a;
                                    bVar.f221200g = vq.j.a(iVar19);
                                    bVar.f221201h = drivingLicenceFullData2;
                                    bVar.f221202j = vq.j.a(iVar13);
                                    bVar.f221203k = bVar9;
                                    bVar.f221204l = vq.j.a(iVar20);
                                    bVar.f221205m = bVar6;
                                    bVar.f221206n = bitmap2;
                                    bVar.f221207p = null;
                                    bVar.f221208q = null;
                                    bVar.f221197d = z25;
                                    bVar.f221209r = i49;
                                    bVar.f221210s = i57;
                                    bVar.f221211t = i55;
                                    bVar.f221212v = i58;
                                    bVar.f221213w = i56;
                                    bVar.f221214x = i59;
                                    bVar.f221198e = z19;
                                    bVar.f221199f = z26;
                                    bVar.D = 8;
                                    objC = rVar5.c(c1792a8, bVar);
                                    obj8 = obj15;
                                    if (objC == obj8) {
                                        return obj8;
                                    }
                                    boolean z410 = z25;
                                    bVar10 = bVar9;
                                    i65 = i57;
                                    z35 = z410;
                                    iVar21 = iVar20;
                                    iVar22 = iVar13;
                                    iVar23 = iVar19;
                                    obj9 = objC;
                                    z36 = z26;
                                    i66 = i49;
                                    i67 = i55;
                                    i68 = i58;
                                    i69 = i56;
                                    bitmap3 = bitmap2;
                                    list = (List) obj9;
                                    z37 = z36;
                                    obj10 = obj8;
                                    nu1.a aVar11 = this.drivingLicenceContainersInteractor;
                                    bVar.f221200g = vq.j.a(iVar23);
                                    bVar.f221201h = drivingLicenceFullData2;
                                    bVar.f221202j = vq.j.a(iVar22);
                                    bVar.f221203k = bVar10;
                                    bVar.f221204l = vq.j.a(iVar21);
                                    bVar.f221205m = bVar6;
                                    bVar.f221206n = bitmap3;
                                    bVar.f221207p = list;
                                    bVar.f221197d = z35;
                                    bVar.f221209r = i66;
                                    bVar.f221210s = i65;
                                    bVar.f221211t = i67;
                                    bVar.f221212v = i68;
                                    bVar.f221213w = i69;
                                    bVar.f221214x = i59;
                                    bVar.f221198e = z19;
                                    bVar.f221199f = z37;
                                    bVar.D = 9;
                                    objG = aVar11.g(bVar);
                                    if (objG == obj10) {
                                        return obj10;
                                    }
                                    bVar11 = bVar6;
                                    drivingLicenceFullData3 = drivingLicenceFullData2;
                                    list2 = list;
                                    z38 = z37;
                                    z39 = z35;
                                    z45 = z19;
                                    bitmap4 = bitmap3;
                                    bVar12 = bVar10;
                                    String str6 = (String) ((dx.i) objG).a();
                                    enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                                    if (z39) {
                                        enumC5973b2 = enumC5973b;
                                    } else {
                                        enumC5973b2 = null;
                                    }
                                    if (enumC5973b2 == null) {
                                        if (drivingLicenceFullData3.g()) {
                                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                        } else {
                                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                        }
                                        enumC5973b3 = enumC5973b;
                                    } else {
                                        enumC5973b3 = enumC5973b2;
                                    }
                                    if (!drivingLicenceFullData3.f()) {
                                        bVar11 = ou1.b.INACTIVE;
                                    }
                                    left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str6, 32, null));
                                }
                                iVar14 = iVar9;
                                bitmap = (Bitmap) iVar18.a();
                                iVar9 = iVar14;
                                zBooleanValue2 = z26;
                            } else {
                                ou1.b bVar111 = bVar5;
                                a1Var = this;
                                iVar13 = iVar8;
                                bitmap = null;
                                bVar7 = bVar111;
                                iVar15 = iVar12;
                            }
                            z26 = zBooleanValue2;
                            bVar9 = bVar7;
                            iVar19 = iVar9;
                            iVar20 = iVar15;
                            i49 = i29;
                            i55 = i35;
                            i56 = i36;
                            i57 = i37;
                            i58 = i38;
                            i59 = i39;
                            bitmap2 = bitmap;
                            Object obj16 = objE;
                            h64.r rVar6 = a1Var.loadServicesUseCase;
                            gz.b.a.C1792a c1792a9 = gz.b.a.C1792a.f78542a;
                            bVar.f221200g = vq.j.a(iVar19);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar13);
                            bVar.f221203k = bVar9;
                            bVar.f221204l = vq.j.a(iVar20);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = bitmap2;
                            bVar.f221207p = null;
                            bVar.f221208q = null;
                            bVar.f221197d = z25;
                            bVar.f221209r = i49;
                            bVar.f221210s = i57;
                            bVar.f221211t = i55;
                            bVar.f221212v = i58;
                            bVar.f221213w = i56;
                            bVar.f221214x = i59;
                            bVar.f221198e = z19;
                            bVar.f221199f = z26;
                            bVar.D = 8;
                            objC = rVar6.c(c1792a9, bVar);
                            obj8 = obj16;
                            if (objC == obj8) {
                                return obj8;
                            }
                            boolean z411 = z25;
                            bVar10 = bVar9;
                            i65 = i57;
                            z35 = z411;
                            iVar21 = iVar20;
                            iVar22 = iVar13;
                            iVar23 = iVar19;
                            obj9 = objC;
                            z36 = z26;
                            i66 = i49;
                            i67 = i55;
                            i68 = i58;
                            i69 = i56;
                            bitmap3 = bitmap2;
                            list = (List) obj9;
                            z37 = z36;
                            obj10 = obj8;
                            nu1.a aVar12 = this.drivingLicenceContainersInteractor;
                            bVar.f221200g = vq.j.a(iVar23);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar22);
                            bVar.f221203k = bVar10;
                            bVar.f221204l = vq.j.a(iVar21);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = bitmap3;
                            bVar.f221207p = list;
                            bVar.f221197d = z35;
                            bVar.f221209r = i66;
                            bVar.f221210s = i65;
                            bVar.f221211t = i67;
                            bVar.f221212v = i68;
                            bVar.f221213w = i69;
                            bVar.f221214x = i59;
                            bVar.f221198e = z19;
                            bVar.f221199f = z37;
                            bVar.D = 9;
                            objG = aVar12.g(bVar);
                            if (objG == obj10) {
                                return obj10;
                            }
                            bVar11 = bVar6;
                            drivingLicenceFullData3 = drivingLicenceFullData2;
                            list2 = list;
                            z38 = z37;
                            z39 = z35;
                            z45 = z19;
                            bitmap4 = bitmap3;
                            bVar12 = bVar10;
                            String str7 = (String) ((dx.i) objG).a();
                            enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                            if (z39) {
                                enumC5973b2 = enumC5973b;
                            } else {
                                enumC5973b2 = null;
                            }
                            if (enumC5973b2 == null) {
                                if (drivingLicenceFullData3.g()) {
                                    enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                } else {
                                    enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                }
                                enumC5973b3 = enumC5973b;
                            } else {
                                enumC5973b3 = enumC5973b2;
                            }
                            if (!drivingLicenceFullData3.f()) {
                                bVar11 = ou1.b.INACTIVE;
                            }
                            left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str7, 32, null));
                        }
                    }
                    return left;
                case 2:
                    int i76 = bVar.f221210s;
                    i15 = bVar.f221209r;
                    z17 = bVar.f221197d;
                    drivingLicenceFullData = (DrivingLicenceFullData) bVar.f221201h;
                    iVar = (dx.i) bVar.f221200g;
                    oq.u.b(objG);
                    i16 = i76;
                    obj2 = objG;
                    iVar2 = (dx.i) obj2;
                    if (iVar2 instanceof dx.i.Left) {
                        dx.b bVar112 = (dx.b) ((dx.i.Left) iVar2).b();
                        d9(new ShowError(new zu1.b.GetDocumentValidityStatus(bVar112)));
                        left = new dx.i.Left(bVar112);
                    } else {
                        if (!(iVar2 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        bVar2 = (ou1.b) ((dx.i.Right) iVar2).b();
                        nu1.a aVar13 = this.drivingLicenceContainersInteractor;
                        drivingLicenceDataA = drivingLicenceFullData.a();
                        if (drivingLicenceDataA != null) {
                            dateF2 = null;
                        } else {
                            dateF2 = null;
                        }
                        drivingLicenceDataA2 = drivingLicenceFullData.a();
                        if (drivingLicenceDataA2 != null) {
                            documentId2 = drivingLicenceDataA2.getDocumentId();
                        } else {
                            documentId2 = null;
                        }
                        bVar.f221200g = vq.j.a(iVar);
                        bVar.f221201h = drivingLicenceFullData;
                        bVar.f221202j = vq.j.a(iVar2);
                        bVar.f221203k = bVar2;
                        bVar.f221197d = z17;
                        bVar.f221209r = i15;
                        bVar.f221210s = i16;
                        bVar.f221211t = 0;
                        bVar.f221212v = 0;
                        bVar.D = 3;
                        objF2 = aVar13.f(dateF2, documentId2, bVar);
                        if (objF2 == objE) {
                            return objE;
                        }
                        iVar3 = iVar2;
                        drivingLicenceFullData2 = drivingLicenceFullData;
                        iVar4 = iVar;
                        i17 = i16;
                        bVar3 = bVar2;
                        obj3 = objF2;
                        i18 = i15;
                        z18 = z17;
                        i19 = 0;
                        i25 = 0;
                        iVar5 = (dx.i) obj3;
                        if (iVar5 instanceof dx.i.Left) {
                            dx.b bVar113 = (dx.b) ((dx.i.Left) iVar5).b();
                            d9(new ShowError(new zu1.b.GetDocumentValidityStatus(bVar113)));
                            left = new dx.i.Left(bVar113);
                        } else {
                            if (iVar5 instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            bVar4 = (ou1.b) ((dx.i.Right) iVar5).b();
                            pu1.c cVar7 = this.getShowInfoBannerUseCase;
                            gz.b.a.C1792a c1792a10 = gz.b.a.C1792a.f78542a;
                            bVar.f221200g = vq.j.a(iVar4);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar3);
                            bVar.f221203k = bVar3;
                            bVar.f221204l = vq.j.a(iVar5);
                            bVar.f221205m = bVar4;
                            bVar.f221197d = z18;
                            bVar.f221209r = i18;
                            bVar.f221210s = i17;
                            bVar.f221211t = i19;
                            bVar.f221212v = i25;
                            bVar.f221213w = 0;
                            bVar.f221214x = 0;
                            bVar.D = 4;
                            objA = cVar7.a(c1792a10, bVar);
                            if (objA == objE) {
                                return objE;
                            }
                            iVar6 = iVar5;
                            obj4 = objA;
                            i26 = i19;
                            i27 = 0;
                            i28 = 0;
                            Boolean bool3 = (Boolean) obj4;
                            iVar7 = iVar6;
                            zBooleanValue = bool3.booleanValue();
                            iVar8 = iVar3;
                            nu1.a aVar14 = this.drivingLicenceContainersInteractor;
                            iVar9 = iVar4;
                            bVar.f221200g = vq.j.a(iVar9);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar8);
                            bVar.f221203k = bVar3;
                            bVar.f221204l = vq.j.a(iVar7);
                            bVar.f221205m = bVar4;
                            bVar.f221197d = z18;
                            bVar.f221209r = i18;
                            bVar.f221210s = i17;
                            bVar.f221211t = i26;
                            bVar.f221212v = i25;
                            bVar.f221213w = i28;
                            bVar.f221214x = i27;
                            bVar.f221198e = zBooleanValue;
                            bVar.D = 5;
                            objI = aVar14.i(bVar);
                            if (objI == objE) {
                                return objE;
                            }
                            bVar5 = bVar3;
                            bVar6 = bVar4;
                            i29 = i18;
                            i35 = i26;
                            i36 = i28;
                            z19 = zBooleanValue;
                            z25 = z18;
                            i37 = i17;
                            i38 = i25;
                            i39 = i27;
                            obj5 = objI;
                            iVar10 = iVar7;
                            iVar11 = (dx.i) obj5;
                            iVar12 = iVar10;
                            if (iVar11 instanceof dx.i.Left) {
                                objB = vq.b.a(false);
                            } else {
                                if (iVar11 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVar11).b();
                            }
                            zBooleanValue2 = ((Boolean) objB).booleanValue();
                            picture = drivingLicenceFullData2.getPicture();
                            if (picture != null) {
                                b00.c cVar8 = this.imageConverter;
                                bVar.f221200g = vq.j.a(iVar9);
                                bVar.f221201h = drivingLicenceFullData2;
                                bVar.f221202j = vq.j.a(iVar8);
                                bVar.f221203k = bVar5;
                                bVar.f221204l = vq.j.a(iVar12);
                                bVar.f221205m = bVar6;
                                bVar.f221206n = vq.j.a(picture);
                                bVar.f221197d = z25;
                                bVar.f221209r = i29;
                                bVar.f221210s = i37;
                                bVar.f221211t = i35;
                                bVar.f221212v = i38;
                                bVar.f221213w = i36;
                                bVar.f221214x = i39;
                                bVar.f221198e = z19;
                                bVar.f221215y = 0;
                                bVar.f221199f = zBooleanValue2;
                                bVar.D = 6;
                                objB2 = cVar8.b(picture, bVar);
                                objE = objE;
                                if (objB2 == objE) {
                                    return objE;
                                }
                                iVar16 = iVar12;
                                obj6 = objB2;
                                iVar13 = iVar8;
                                z26 = zBooleanValue2;
                                str = picture;
                                bVar8 = bVar5;
                                z27 = z25;
                                i45 = i37;
                                i46 = i38;
                                i47 = i39;
                                i48 = 0;
                                iVar17 = (dx.i) obj6;
                                obj7 = objE;
                                if (!(iVar17 instanceof dx.i.Left)) {
                                    bVar7 = bVar8;
                                    i39 = i47;
                                    i38 = i46;
                                    i37 = i45;
                                    z25 = z27;
                                    iVar18 = iVar17;
                                    iVar15 = iVar16;
                                    objE = obj7;
                                    a1Var = this;
                                } else {
                                    if (iVar17 instanceof dx.i.Right) {
                                        a1Var = this;
                                        bVar7 = bVar8;
                                        objE = obj7;
                                        throw new oq.p();
                                    }
                                    Bitmap bitmap7 = (Bitmap) ((dx.i.Right) iVar17).b();
                                    a1Var = this;
                                    b00.c cVar9 = a1Var.imageConverter;
                                    z28 = z26;
                                    b00.f.ReduceDimension reduceDimension3 = new b00.f.ReduceDimension(a1Var.imagePropertiesProvider.getDefaultImageMaxSide());
                                    bVar.f221200g = vq.j.a(iVar9);
                                    bVar.f221201h = drivingLicenceFullData2;
                                    bVar.f221202j = vq.j.a(iVar13);
                                    bVar.f221203k = bVar8;
                                    bVar.f221204l = vq.j.a(iVar16);
                                    bVar.f221205m = bVar6;
                                    bVar.f221206n = vq.j.a(str);
                                    bVar.f221207p = vq.j.a(iVar17);
                                    bVar.f221208q = vq.j.a(bitmap7);
                                    bVar.f221197d = z27;
                                    bVar.f221209r = i29;
                                    bVar.f221210s = i45;
                                    bVar.f221211t = i35;
                                    bVar.f221212v = i46;
                                    bVar.f221213w = i36;
                                    bVar.f221214x = i47;
                                    bVar.f221198e = z19;
                                    bVar.f221215y = i48;
                                    z26 = z28;
                                    bVar.f221199f = z26;
                                    bVar.f221216z = 0;
                                    bVar.A = 0;
                                    bVar.D = 7;
                                    bVar7 = bVar8;
                                    objF3 = cVar9.f(bitmap7, reduceDimension3, bVar);
                                    objE = obj7;
                                    if (objF3 == objE) {
                                        return objE;
                                    }
                                    z29 = z26;
                                    i39 = i47;
                                    i38 = i46;
                                    i37 = i45;
                                    z25 = z27;
                                    iVar15 = iVar16;
                                    z26 = z29;
                                    iVar18 = (dx.i) objF3;
                                    i39 = i47;
                                    i38 = i46;
                                    i37 = i45;
                                    z25 = z27;
                                    iVar14 = iVar9;
                                    iVar15 = iVar16;
                                    px.f.e(px.f.f163100a, "Conversion to bitmap failed.", null, px.c.a(a1Var), 2, null);
                                    iVar19 = iVar14;
                                    bVar9 = bVar7;
                                    iVar20 = iVar15;
                                    i49 = i29;
                                    i55 = i35;
                                    i56 = i36;
                                    i57 = i37;
                                    i58 = i38;
                                    i59 = i39;
                                    bitmap2 = null;
                                    Object obj17 = objE;
                                    h64.r rVar7 = a1Var.loadServicesUseCase;
                                    gz.b.a.C1792a c1792a11 = gz.b.a.C1792a.f78542a;
                                    bVar.f221200g = vq.j.a(iVar19);
                                    bVar.f221201h = drivingLicenceFullData2;
                                    bVar.f221202j = vq.j.a(iVar13);
                                    bVar.f221203k = bVar9;
                                    bVar.f221204l = vq.j.a(iVar20);
                                    bVar.f221205m = bVar6;
                                    bVar.f221206n = bitmap2;
                                    bVar.f221207p = null;
                                    bVar.f221208q = null;
                                    bVar.f221197d = z25;
                                    bVar.f221209r = i49;
                                    bVar.f221210s = i57;
                                    bVar.f221211t = i55;
                                    bVar.f221212v = i58;
                                    bVar.f221213w = i56;
                                    bVar.f221214x = i59;
                                    bVar.f221198e = z19;
                                    bVar.f221199f = z26;
                                    bVar.D = 8;
                                    objC = rVar7.c(c1792a11, bVar);
                                    obj8 = obj17;
                                    if (objC == obj8) {
                                        return obj8;
                                    }
                                    boolean z412 = z25;
                                    bVar10 = bVar9;
                                    i65 = i57;
                                    z35 = z412;
                                    iVar21 = iVar20;
                                    iVar22 = iVar13;
                                    iVar23 = iVar19;
                                    obj9 = objC;
                                    z36 = z26;
                                    i66 = i49;
                                    i67 = i55;
                                    i68 = i58;
                                    i69 = i56;
                                    bitmap3 = bitmap2;
                                    list = (List) obj9;
                                    z37 = z36;
                                    obj10 = obj8;
                                    nu1.a aVar15 = this.drivingLicenceContainersInteractor;
                                    bVar.f221200g = vq.j.a(iVar23);
                                    bVar.f221201h = drivingLicenceFullData2;
                                    bVar.f221202j = vq.j.a(iVar22);
                                    bVar.f221203k = bVar10;
                                    bVar.f221204l = vq.j.a(iVar21);
                                    bVar.f221205m = bVar6;
                                    bVar.f221206n = bitmap3;
                                    bVar.f221207p = list;
                                    bVar.f221197d = z35;
                                    bVar.f221209r = i66;
                                    bVar.f221210s = i65;
                                    bVar.f221211t = i67;
                                    bVar.f221212v = i68;
                                    bVar.f221213w = i69;
                                    bVar.f221214x = i59;
                                    bVar.f221198e = z19;
                                    bVar.f221199f = z37;
                                    bVar.D = 9;
                                    objG = aVar15.g(bVar);
                                    if (objG == obj10) {
                                        return obj10;
                                    }
                                    bVar11 = bVar6;
                                    drivingLicenceFullData3 = drivingLicenceFullData2;
                                    list2 = list;
                                    z38 = z37;
                                    z39 = z35;
                                    z45 = z19;
                                    bitmap4 = bitmap3;
                                    bVar12 = bVar10;
                                    String str8 = (String) ((dx.i) objG).a();
                                    enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                                    if (z39) {
                                        enumC5973b2 = enumC5973b;
                                    } else {
                                        enumC5973b2 = null;
                                    }
                                    if (enumC5973b2 == null) {
                                        if (drivingLicenceFullData3.g()) {
                                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                        } else {
                                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                        }
                                        enumC5973b3 = enumC5973b;
                                    } else {
                                        enumC5973b3 = enumC5973b2;
                                    }
                                    if (!drivingLicenceFullData3.f()) {
                                        bVar11 = ou1.b.INACTIVE;
                                    }
                                    left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str8, 32, null));
                                }
                                iVar14 = iVar9;
                                bitmap = (Bitmap) iVar18.a();
                                iVar9 = iVar14;
                                zBooleanValue2 = z26;
                            } else {
                                ou1.b bVar114 = bVar5;
                                a1Var = this;
                                iVar13 = iVar8;
                                bitmap = null;
                                bVar7 = bVar114;
                                iVar15 = iVar12;
                            }
                            z26 = zBooleanValue2;
                            bVar9 = bVar7;
                            iVar19 = iVar9;
                            iVar20 = iVar15;
                            i49 = i29;
                            i55 = i35;
                            i56 = i36;
                            i57 = i37;
                            i58 = i38;
                            i59 = i39;
                            bitmap2 = bitmap;
                            Object obj18 = objE;
                            h64.r rVar8 = a1Var.loadServicesUseCase;
                            gz.b.a.C1792a c1792a12 = gz.b.a.C1792a.f78542a;
                            bVar.f221200g = vq.j.a(iVar19);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar13);
                            bVar.f221203k = bVar9;
                            bVar.f221204l = vq.j.a(iVar20);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = bitmap2;
                            bVar.f221207p = null;
                            bVar.f221208q = null;
                            bVar.f221197d = z25;
                            bVar.f221209r = i49;
                            bVar.f221210s = i57;
                            bVar.f221211t = i55;
                            bVar.f221212v = i58;
                            bVar.f221213w = i56;
                            bVar.f221214x = i59;
                            bVar.f221198e = z19;
                            bVar.f221199f = z26;
                            bVar.D = 8;
                            objC = rVar8.c(c1792a12, bVar);
                            obj8 = obj18;
                            if (objC == obj8) {
                                return obj8;
                            }
                            boolean z413 = z25;
                            bVar10 = bVar9;
                            i65 = i57;
                            z35 = z413;
                            iVar21 = iVar20;
                            iVar22 = iVar13;
                            iVar23 = iVar19;
                            obj9 = objC;
                            z36 = z26;
                            i66 = i49;
                            i67 = i55;
                            i68 = i58;
                            i69 = i56;
                            bitmap3 = bitmap2;
                            list = (List) obj9;
                            z37 = z36;
                            obj10 = obj8;
                            nu1.a aVar16 = this.drivingLicenceContainersInteractor;
                            bVar.f221200g = vq.j.a(iVar23);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar22);
                            bVar.f221203k = bVar10;
                            bVar.f221204l = vq.j.a(iVar21);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = bitmap3;
                            bVar.f221207p = list;
                            bVar.f221197d = z35;
                            bVar.f221209r = i66;
                            bVar.f221210s = i65;
                            bVar.f221211t = i67;
                            bVar.f221212v = i68;
                            bVar.f221213w = i69;
                            bVar.f221214x = i59;
                            bVar.f221198e = z19;
                            bVar.f221199f = z37;
                            bVar.D = 9;
                            objG = aVar16.g(bVar);
                            if (objG == obj10) {
                                return obj10;
                            }
                            bVar11 = bVar6;
                            drivingLicenceFullData3 = drivingLicenceFullData2;
                            list2 = list;
                            z38 = z37;
                            z39 = z35;
                            z45 = z19;
                            bitmap4 = bitmap3;
                            bVar12 = bVar10;
                            String str9 = (String) ((dx.i) objG).a();
                            enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                            if (z39) {
                                enumC5973b2 = enumC5973b;
                            } else {
                                enumC5973b2 = null;
                            }
                            if (enumC5973b2 == null) {
                                if (drivingLicenceFullData3.g()) {
                                    enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                } else {
                                    enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                }
                                enumC5973b3 = enumC5973b;
                            } else {
                                enumC5973b3 = enumC5973b2;
                            }
                            if (!drivingLicenceFullData3.f()) {
                                bVar11 = ou1.b.INACTIVE;
                            }
                            left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str9, 32, null));
                        }
                    }
                    return left;
                case 3:
                    int i77 = bVar.f221212v;
                    i19 = bVar.f221211t;
                    int i78 = bVar.f221210s;
                    int i79 = bVar.f221209r;
                    boolean z55 = bVar.f221197d;
                    ou1.b bVar20 = (ou1.b) bVar.f221203k;
                    dx.i iVar24 = (dx.i) bVar.f221202j;
                    DrivingLicenceFullData drivingLicenceFullData4 = (DrivingLicenceFullData) bVar.f221201h;
                    dx.i iVar25 = (dx.i) bVar.f221200g;
                    oq.u.b(objG);
                    bVar3 = bVar20;
                    iVar3 = iVar24;
                    drivingLicenceFullData2 = drivingLicenceFullData4;
                    iVar4 = iVar25;
                    i18 = i79;
                    z18 = z55;
                    i17 = i78;
                    i25 = i77;
                    obj3 = objG;
                    iVar5 = (dx.i) obj3;
                    if (iVar5 instanceof dx.i.Left) {
                        dx.b bVar115 = (dx.b) ((dx.i.Left) iVar5).b();
                        d9(new ShowError(new zu1.b.GetDocumentValidityStatus(bVar115)));
                        left = new dx.i.Left(bVar115);
                    } else {
                        if (iVar5 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        bVar4 = (ou1.b) ((dx.i.Right) iVar5).b();
                        pu1.c cVar10 = this.getShowInfoBannerUseCase;
                        gz.b.a.C1792a c1792a13 = gz.b.a.C1792a.f78542a;
                        bVar.f221200g = vq.j.a(iVar4);
                        bVar.f221201h = drivingLicenceFullData2;
                        bVar.f221202j = vq.j.a(iVar3);
                        bVar.f221203k = bVar3;
                        bVar.f221204l = vq.j.a(iVar5);
                        bVar.f221205m = bVar4;
                        bVar.f221197d = z18;
                        bVar.f221209r = i18;
                        bVar.f221210s = i17;
                        bVar.f221211t = i19;
                        bVar.f221212v = i25;
                        bVar.f221213w = 0;
                        bVar.f221214x = 0;
                        bVar.D = 4;
                        objA = cVar10.a(c1792a13, bVar);
                        if (objA == objE) {
                            return objE;
                        }
                        iVar6 = iVar5;
                        obj4 = objA;
                        i26 = i19;
                        i27 = 0;
                        i28 = 0;
                        Boolean bool4 = (Boolean) obj4;
                        iVar7 = iVar6;
                        zBooleanValue = bool4.booleanValue();
                        iVar8 = iVar3;
                        nu1.a aVar17 = this.drivingLicenceContainersInteractor;
                        iVar9 = iVar4;
                        bVar.f221200g = vq.j.a(iVar9);
                        bVar.f221201h = drivingLicenceFullData2;
                        bVar.f221202j = vq.j.a(iVar8);
                        bVar.f221203k = bVar3;
                        bVar.f221204l = vq.j.a(iVar7);
                        bVar.f221205m = bVar4;
                        bVar.f221197d = z18;
                        bVar.f221209r = i18;
                        bVar.f221210s = i17;
                        bVar.f221211t = i26;
                        bVar.f221212v = i25;
                        bVar.f221213w = i28;
                        bVar.f221214x = i27;
                        bVar.f221198e = zBooleanValue;
                        bVar.D = 5;
                        objI = aVar17.i(bVar);
                        if (objI == objE) {
                            return objE;
                        }
                        bVar5 = bVar3;
                        bVar6 = bVar4;
                        i29 = i18;
                        i35 = i26;
                        i36 = i28;
                        z19 = zBooleanValue;
                        z25 = z18;
                        i37 = i17;
                        i38 = i25;
                        i39 = i27;
                        obj5 = objI;
                        iVar10 = iVar7;
                        iVar11 = (dx.i) obj5;
                        iVar12 = iVar10;
                        if (iVar11 instanceof dx.i.Left) {
                            objB = vq.b.a(false);
                        } else {
                            if (iVar11 instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVar11).b();
                        }
                        zBooleanValue2 = ((Boolean) objB).booleanValue();
                        picture = drivingLicenceFullData2.getPicture();
                        if (picture != null) {
                            b00.c cVar11 = this.imageConverter;
                            bVar.f221200g = vq.j.a(iVar9);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar8);
                            bVar.f221203k = bVar5;
                            bVar.f221204l = vq.j.a(iVar12);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = vq.j.a(picture);
                            bVar.f221197d = z25;
                            bVar.f221209r = i29;
                            bVar.f221210s = i37;
                            bVar.f221211t = i35;
                            bVar.f221212v = i38;
                            bVar.f221213w = i36;
                            bVar.f221214x = i39;
                            bVar.f221198e = z19;
                            bVar.f221215y = 0;
                            bVar.f221199f = zBooleanValue2;
                            bVar.D = 6;
                            objB2 = cVar11.b(picture, bVar);
                            objE = objE;
                            if (objB2 == objE) {
                                return objE;
                            }
                            iVar16 = iVar12;
                            obj6 = objB2;
                            iVar13 = iVar8;
                            z26 = zBooleanValue2;
                            str = picture;
                            bVar8 = bVar5;
                            z27 = z25;
                            i45 = i37;
                            i46 = i38;
                            i47 = i39;
                            i48 = 0;
                            iVar17 = (dx.i) obj6;
                            obj7 = objE;
                            if (!(iVar17 instanceof dx.i.Left)) {
                                bVar7 = bVar8;
                                i39 = i47;
                                i38 = i46;
                                i37 = i45;
                                z25 = z27;
                                iVar18 = iVar17;
                                iVar15 = iVar16;
                                objE = obj7;
                                a1Var = this;
                            } else {
                                if (iVar17 instanceof dx.i.Right) {
                                    a1Var = this;
                                    bVar7 = bVar8;
                                    objE = obj7;
                                    throw new oq.p();
                                }
                                Bitmap bitmap8 = (Bitmap) ((dx.i.Right) iVar17).b();
                                a1Var = this;
                                b00.c cVar12 = a1Var.imageConverter;
                                z28 = z26;
                                b00.f.ReduceDimension reduceDimension4 = new b00.f.ReduceDimension(a1Var.imagePropertiesProvider.getDefaultImageMaxSide());
                                bVar.f221200g = vq.j.a(iVar9);
                                bVar.f221201h = drivingLicenceFullData2;
                                bVar.f221202j = vq.j.a(iVar13);
                                bVar.f221203k = bVar8;
                                bVar.f221204l = vq.j.a(iVar16);
                                bVar.f221205m = bVar6;
                                bVar.f221206n = vq.j.a(str);
                                bVar.f221207p = vq.j.a(iVar17);
                                bVar.f221208q = vq.j.a(bitmap8);
                                bVar.f221197d = z27;
                                bVar.f221209r = i29;
                                bVar.f221210s = i45;
                                bVar.f221211t = i35;
                                bVar.f221212v = i46;
                                bVar.f221213w = i36;
                                bVar.f221214x = i47;
                                bVar.f221198e = z19;
                                bVar.f221215y = i48;
                                z26 = z28;
                                bVar.f221199f = z26;
                                bVar.f221216z = 0;
                                bVar.A = 0;
                                bVar.D = 7;
                                bVar7 = bVar8;
                                objF3 = cVar12.f(bitmap8, reduceDimension4, bVar);
                                objE = obj7;
                                if (objF3 == objE) {
                                    return objE;
                                }
                                z29 = z26;
                                i39 = i47;
                                i38 = i46;
                                i37 = i45;
                                z25 = z27;
                                iVar15 = iVar16;
                                z26 = z29;
                                iVar18 = (dx.i) objF3;
                                i39 = i47;
                                i38 = i46;
                                i37 = i45;
                                z25 = z27;
                                iVar14 = iVar9;
                                iVar15 = iVar16;
                                px.f.e(px.f.f163100a, "Conversion to bitmap failed.", null, px.c.a(a1Var), 2, null);
                                iVar19 = iVar14;
                                bVar9 = bVar7;
                                iVar20 = iVar15;
                                i49 = i29;
                                i55 = i35;
                                i56 = i36;
                                i57 = i37;
                                i58 = i38;
                                i59 = i39;
                                bitmap2 = null;
                                Object obj19 = objE;
                                h64.r rVar9 = a1Var.loadServicesUseCase;
                                gz.b.a.C1792a c1792a14 = gz.b.a.C1792a.f78542a;
                                bVar.f221200g = vq.j.a(iVar19);
                                bVar.f221201h = drivingLicenceFullData2;
                                bVar.f221202j = vq.j.a(iVar13);
                                bVar.f221203k = bVar9;
                                bVar.f221204l = vq.j.a(iVar20);
                                bVar.f221205m = bVar6;
                                bVar.f221206n = bitmap2;
                                bVar.f221207p = null;
                                bVar.f221208q = null;
                                bVar.f221197d = z25;
                                bVar.f221209r = i49;
                                bVar.f221210s = i57;
                                bVar.f221211t = i55;
                                bVar.f221212v = i58;
                                bVar.f221213w = i56;
                                bVar.f221214x = i59;
                                bVar.f221198e = z19;
                                bVar.f221199f = z26;
                                bVar.D = 8;
                                objC = rVar9.c(c1792a14, bVar);
                                obj8 = obj19;
                                if (objC == obj8) {
                                    return obj8;
                                }
                                boolean z414 = z25;
                                bVar10 = bVar9;
                                i65 = i57;
                                z35 = z414;
                                iVar21 = iVar20;
                                iVar22 = iVar13;
                                iVar23 = iVar19;
                                obj9 = objC;
                                z36 = z26;
                                i66 = i49;
                                i67 = i55;
                                i68 = i58;
                                i69 = i56;
                                bitmap3 = bitmap2;
                                list = (List) obj9;
                                z37 = z36;
                                obj10 = obj8;
                                nu1.a aVar18 = this.drivingLicenceContainersInteractor;
                                bVar.f221200g = vq.j.a(iVar23);
                                bVar.f221201h = drivingLicenceFullData2;
                                bVar.f221202j = vq.j.a(iVar22);
                                bVar.f221203k = bVar10;
                                bVar.f221204l = vq.j.a(iVar21);
                                bVar.f221205m = bVar6;
                                bVar.f221206n = bitmap3;
                                bVar.f221207p = list;
                                bVar.f221197d = z35;
                                bVar.f221209r = i66;
                                bVar.f221210s = i65;
                                bVar.f221211t = i67;
                                bVar.f221212v = i68;
                                bVar.f221213w = i69;
                                bVar.f221214x = i59;
                                bVar.f221198e = z19;
                                bVar.f221199f = z37;
                                bVar.D = 9;
                                objG = aVar18.g(bVar);
                                if (objG == obj10) {
                                    return obj10;
                                }
                                bVar11 = bVar6;
                                drivingLicenceFullData3 = drivingLicenceFullData2;
                                list2 = list;
                                z38 = z37;
                                z39 = z35;
                                z45 = z19;
                                bitmap4 = bitmap3;
                                bVar12 = bVar10;
                                String str10 = (String) ((dx.i) objG).a();
                                enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                                if (z39) {
                                    enumC5973b2 = enumC5973b;
                                } else {
                                    enumC5973b2 = null;
                                }
                                if (enumC5973b2 == null) {
                                    if (drivingLicenceFullData3.g()) {
                                        enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                    } else {
                                        enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                    }
                                    enumC5973b3 = enumC5973b;
                                } else {
                                    enumC5973b3 = enumC5973b2;
                                }
                                if (!drivingLicenceFullData3.f()) {
                                    bVar11 = ou1.b.INACTIVE;
                                }
                                left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str10, 32, null));
                            }
                            iVar14 = iVar9;
                            bitmap = (Bitmap) iVar18.a();
                            iVar9 = iVar14;
                            zBooleanValue2 = z26;
                        } else {
                            ou1.b bVar116 = bVar5;
                            a1Var = this;
                            iVar13 = iVar8;
                            bitmap = null;
                            bVar7 = bVar116;
                            iVar15 = iVar12;
                        }
                        z26 = zBooleanValue2;
                        bVar9 = bVar7;
                        iVar19 = iVar9;
                        iVar20 = iVar15;
                        i49 = i29;
                        i55 = i35;
                        i56 = i36;
                        i57 = i37;
                        i58 = i38;
                        i59 = i39;
                        bitmap2 = bitmap;
                        Object obj110 = objE;
                        h64.r rVar10 = a1Var.loadServicesUseCase;
                        gz.b.a.C1792a c1792a15 = gz.b.a.C1792a.f78542a;
                        bVar.f221200g = vq.j.a(iVar19);
                        bVar.f221201h = drivingLicenceFullData2;
                        bVar.f221202j = vq.j.a(iVar13);
                        bVar.f221203k = bVar9;
                        bVar.f221204l = vq.j.a(iVar20);
                        bVar.f221205m = bVar6;
                        bVar.f221206n = bitmap2;
                        bVar.f221207p = null;
                        bVar.f221208q = null;
                        bVar.f221197d = z25;
                        bVar.f221209r = i49;
                        bVar.f221210s = i57;
                        bVar.f221211t = i55;
                        bVar.f221212v = i58;
                        bVar.f221213w = i56;
                        bVar.f221214x = i59;
                        bVar.f221198e = z19;
                        bVar.f221199f = z26;
                        bVar.D = 8;
                        objC = rVar10.c(c1792a15, bVar);
                        obj8 = obj110;
                        if (objC == obj8) {
                            return obj8;
                        }
                        boolean z415 = z25;
                        bVar10 = bVar9;
                        i65 = i57;
                        z35 = z415;
                        iVar21 = iVar20;
                        iVar22 = iVar13;
                        iVar23 = iVar19;
                        obj9 = objC;
                        z36 = z26;
                        i66 = i49;
                        i67 = i55;
                        i68 = i58;
                        i69 = i56;
                        bitmap3 = bitmap2;
                        list = (List) obj9;
                        z37 = z36;
                        obj10 = obj8;
                        nu1.a aVar19 = this.drivingLicenceContainersInteractor;
                        bVar.f221200g = vq.j.a(iVar23);
                        bVar.f221201h = drivingLicenceFullData2;
                        bVar.f221202j = vq.j.a(iVar22);
                        bVar.f221203k = bVar10;
                        bVar.f221204l = vq.j.a(iVar21);
                        bVar.f221205m = bVar6;
                        bVar.f221206n = bitmap3;
                        bVar.f221207p = list;
                        bVar.f221197d = z35;
                        bVar.f221209r = i66;
                        bVar.f221210s = i65;
                        bVar.f221211t = i67;
                        bVar.f221212v = i68;
                        bVar.f221213w = i69;
                        bVar.f221214x = i59;
                        bVar.f221198e = z19;
                        bVar.f221199f = z37;
                        bVar.D = 9;
                        objG = aVar19.g(bVar);
                        if (objG == obj10) {
                            return obj10;
                        }
                        bVar11 = bVar6;
                        drivingLicenceFullData3 = drivingLicenceFullData2;
                        list2 = list;
                        z38 = z37;
                        z39 = z35;
                        z45 = z19;
                        bitmap4 = bitmap3;
                        bVar12 = bVar10;
                        String str11 = (String) ((dx.i) objG).a();
                        enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                        if (z39) {
                            enumC5973b2 = enumC5973b;
                        } else {
                            enumC5973b2 = null;
                        }
                        if (enumC5973b2 == null) {
                            if (drivingLicenceFullData3.g()) {
                                enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                            } else {
                                enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                            }
                            enumC5973b3 = enumC5973b;
                        } else {
                            enumC5973b3 = enumC5973b2;
                        }
                        if (!drivingLicenceFullData3.f()) {
                            bVar11 = ou1.b.INACTIVE;
                        }
                        left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str11, 32, null));
                    }
                    return left;
                case 4:
                    i27 = bVar.f221214x;
                    i28 = bVar.f221213w;
                    i25 = bVar.f221212v;
                    i26 = bVar.f221211t;
                    i17 = bVar.f221210s;
                    i18 = bVar.f221209r;
                    z18 = bVar.f221197d;
                    bVar4 = (ou1.b) bVar.f221205m;
                    iVar6 = (dx.i) bVar.f221204l;
                    bVar3 = (ou1.b) bVar.f221203k;
                    iVar3 = (dx.i) bVar.f221202j;
                    drivingLicenceFullData2 = (DrivingLicenceFullData) bVar.f221201h;
                    iVar4 = (dx.i) bVar.f221200g;
                    oq.u.b(objG);
                    obj4 = objG;
                    Boolean bool5 = (Boolean) obj4;
                    iVar7 = iVar6;
                    zBooleanValue = bool5.booleanValue();
                    iVar8 = iVar3;
                    nu1.a aVar110 = this.drivingLicenceContainersInteractor;
                    iVar9 = iVar4;
                    bVar.f221200g = vq.j.a(iVar9);
                    bVar.f221201h = drivingLicenceFullData2;
                    bVar.f221202j = vq.j.a(iVar8);
                    bVar.f221203k = bVar3;
                    bVar.f221204l = vq.j.a(iVar7);
                    bVar.f221205m = bVar4;
                    bVar.f221197d = z18;
                    bVar.f221209r = i18;
                    bVar.f221210s = i17;
                    bVar.f221211t = i26;
                    bVar.f221212v = i25;
                    bVar.f221213w = i28;
                    bVar.f221214x = i27;
                    bVar.f221198e = zBooleanValue;
                    bVar.D = 5;
                    objI = aVar110.i(bVar);
                    if (objI == objE) {
                        return objE;
                    }
                    bVar5 = bVar3;
                    bVar6 = bVar4;
                    i29 = i18;
                    i35 = i26;
                    i36 = i28;
                    z19 = zBooleanValue;
                    z25 = z18;
                    i37 = i17;
                    i38 = i25;
                    i39 = i27;
                    obj5 = objI;
                    iVar10 = iVar7;
                    iVar11 = (dx.i) obj5;
                    iVar12 = iVar10;
                    if (iVar11 instanceof dx.i.Left) {
                        objB = vq.b.a(false);
                    } else {
                        if (iVar11 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVar11).b();
                    }
                    zBooleanValue2 = ((Boolean) objB).booleanValue();
                    picture = drivingLicenceFullData2.getPicture();
                    if (picture != null) {
                        b00.c cVar13 = this.imageConverter;
                        bVar.f221200g = vq.j.a(iVar9);
                        bVar.f221201h = drivingLicenceFullData2;
                        bVar.f221202j = vq.j.a(iVar8);
                        bVar.f221203k = bVar5;
                        bVar.f221204l = vq.j.a(iVar12);
                        bVar.f221205m = bVar6;
                        bVar.f221206n = vq.j.a(picture);
                        bVar.f221197d = z25;
                        bVar.f221209r = i29;
                        bVar.f221210s = i37;
                        bVar.f221211t = i35;
                        bVar.f221212v = i38;
                        bVar.f221213w = i36;
                        bVar.f221214x = i39;
                        bVar.f221198e = z19;
                        bVar.f221215y = 0;
                        bVar.f221199f = zBooleanValue2;
                        bVar.D = 6;
                        objB2 = cVar13.b(picture, bVar);
                        objE = objE;
                        if (objB2 == objE) {
                            return objE;
                        }
                        iVar16 = iVar12;
                        obj6 = objB2;
                        iVar13 = iVar8;
                        z26 = zBooleanValue2;
                        str = picture;
                        bVar8 = bVar5;
                        z27 = z25;
                        i45 = i37;
                        i46 = i38;
                        i47 = i39;
                        i48 = 0;
                        iVar17 = (dx.i) obj6;
                        obj7 = objE;
                        if (!(iVar17 instanceof dx.i.Left)) {
                            if (iVar17 instanceof dx.i.Right) {
                                a1Var = this;
                                bVar7 = bVar8;
                                objE = obj7;
                                throw new oq.p();
                            }
                            Bitmap bitmap9 = (Bitmap) ((dx.i.Right) iVar17).b();
                            a1Var = this;
                            b00.c cVar14 = a1Var.imageConverter;
                            z28 = z26;
                            b00.f.ReduceDimension reduceDimension5 = new b00.f.ReduceDimension(a1Var.imagePropertiesProvider.getDefaultImageMaxSide());
                            bVar.f221200g = vq.j.a(iVar9);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar13);
                            bVar.f221203k = bVar8;
                            bVar.f221204l = vq.j.a(iVar16);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = vq.j.a(str);
                            bVar.f221207p = vq.j.a(iVar17);
                            bVar.f221208q = vq.j.a(bitmap9);
                            bVar.f221197d = z27;
                            bVar.f221209r = i29;
                            bVar.f221210s = i45;
                            bVar.f221211t = i35;
                            bVar.f221212v = i46;
                            bVar.f221213w = i36;
                            bVar.f221214x = i47;
                            bVar.f221198e = z19;
                            bVar.f221215y = i48;
                            z26 = z28;
                            bVar.f221199f = z26;
                            bVar.f221216z = 0;
                            bVar.A = 0;
                            bVar.D = 7;
                            bVar7 = bVar8;
                            objF3 = cVar14.f(bitmap9, reduceDimension5, bVar);
                            objE = obj7;
                            if (objF3 == objE) {
                                return objE;
                            }
                            z29 = z26;
                            i39 = i47;
                            i38 = i46;
                            i37 = i45;
                            z25 = z27;
                            iVar15 = iVar16;
                            z26 = z29;
                            iVar18 = (dx.i) objF3;
                            i39 = i47;
                            i38 = i46;
                            i37 = i45;
                            z25 = z27;
                            iVar14 = iVar9;
                            iVar15 = iVar16;
                            px.f.e(px.f.f163100a, "Conversion to bitmap failed.", null, px.c.a(a1Var), 2, null);
                            iVar19 = iVar14;
                            bVar9 = bVar7;
                            iVar20 = iVar15;
                            i49 = i29;
                            i55 = i35;
                            i56 = i36;
                            i57 = i37;
                            i58 = i38;
                            i59 = i39;
                            bitmap2 = null;
                            Object obj111 = objE;
                            h64.r rVar11 = a1Var.loadServicesUseCase;
                            gz.b.a.C1792a c1792a16 = gz.b.a.C1792a.f78542a;
                            bVar.f221200g = vq.j.a(iVar19);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar13);
                            bVar.f221203k = bVar9;
                            bVar.f221204l = vq.j.a(iVar20);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = bitmap2;
                            bVar.f221207p = null;
                            bVar.f221208q = null;
                            bVar.f221197d = z25;
                            bVar.f221209r = i49;
                            bVar.f221210s = i57;
                            bVar.f221211t = i55;
                            bVar.f221212v = i58;
                            bVar.f221213w = i56;
                            bVar.f221214x = i59;
                            bVar.f221198e = z19;
                            bVar.f221199f = z26;
                            bVar.D = 8;
                            objC = rVar11.c(c1792a16, bVar);
                            obj8 = obj111;
                            if (objC == obj8) {
                                return obj8;
                            }
                            boolean z416 = z25;
                            bVar10 = bVar9;
                            i65 = i57;
                            z35 = z416;
                            iVar21 = iVar20;
                            iVar22 = iVar13;
                            iVar23 = iVar19;
                            obj9 = objC;
                            z36 = z26;
                            i66 = i49;
                            i67 = i55;
                            i68 = i58;
                            i69 = i56;
                            bitmap3 = bitmap2;
                            list = (List) obj9;
                            z37 = z36;
                            obj10 = obj8;
                            nu1.a aVar111 = this.drivingLicenceContainersInteractor;
                            bVar.f221200g = vq.j.a(iVar23);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar22);
                            bVar.f221203k = bVar10;
                            bVar.f221204l = vq.j.a(iVar21);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = bitmap3;
                            bVar.f221207p = list;
                            bVar.f221197d = z35;
                            bVar.f221209r = i66;
                            bVar.f221210s = i65;
                            bVar.f221211t = i67;
                            bVar.f221212v = i68;
                            bVar.f221213w = i69;
                            bVar.f221214x = i59;
                            bVar.f221198e = z19;
                            bVar.f221199f = z37;
                            bVar.D = 9;
                            objG = aVar111.g(bVar);
                            if (objG == obj10) {
                                return obj10;
                            }
                            bVar11 = bVar6;
                            drivingLicenceFullData3 = drivingLicenceFullData2;
                            list2 = list;
                            z38 = z37;
                            z39 = z35;
                            z45 = z19;
                            bitmap4 = bitmap3;
                            bVar12 = bVar10;
                            String str12 = (String) ((dx.i) objG).a();
                            enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                            if (z39) {
                                enumC5973b2 = enumC5973b;
                            } else {
                                enumC5973b2 = null;
                            }
                            if (enumC5973b2 == null) {
                                if (drivingLicenceFullData3.g()) {
                                    enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                } else {
                                    enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                }
                                enumC5973b3 = enumC5973b;
                            } else {
                                enumC5973b3 = enumC5973b2;
                            }
                            if (!drivingLicenceFullData3.f()) {
                                bVar11 = ou1.b.INACTIVE;
                            }
                            left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str12, 32, null));
                            return left;
                        }
                        bVar7 = bVar8;
                        i39 = i47;
                        i38 = i46;
                        i37 = i45;
                        z25 = z27;
                        iVar18 = iVar17;
                        iVar15 = iVar16;
                        objE = obj7;
                        a1Var = this;
                        iVar14 = iVar9;
                        bitmap = (Bitmap) iVar18.a();
                        iVar9 = iVar14;
                        zBooleanValue2 = z26;
                    } else {
                        ou1.b bVar117 = bVar5;
                        a1Var = this;
                        iVar13 = iVar8;
                        bitmap = null;
                        bVar7 = bVar117;
                        iVar15 = iVar12;
                    }
                    z26 = zBooleanValue2;
                    bVar9 = bVar7;
                    iVar19 = iVar9;
                    iVar20 = iVar15;
                    i49 = i29;
                    i55 = i35;
                    i56 = i36;
                    i57 = i37;
                    i58 = i38;
                    i59 = i39;
                    bitmap2 = bitmap;
                    Object obj112 = objE;
                    h64.r rVar12 = a1Var.loadServicesUseCase;
                    gz.b.a.C1792a c1792a17 = gz.b.a.C1792a.f78542a;
                    bVar.f221200g = vq.j.a(iVar19);
                    bVar.f221201h = drivingLicenceFullData2;
                    bVar.f221202j = vq.j.a(iVar13);
                    bVar.f221203k = bVar9;
                    bVar.f221204l = vq.j.a(iVar20);
                    bVar.f221205m = bVar6;
                    bVar.f221206n = bitmap2;
                    bVar.f221207p = null;
                    bVar.f221208q = null;
                    bVar.f221197d = z25;
                    bVar.f221209r = i49;
                    bVar.f221210s = i57;
                    bVar.f221211t = i55;
                    bVar.f221212v = i58;
                    bVar.f221213w = i56;
                    bVar.f221214x = i59;
                    bVar.f221198e = z19;
                    bVar.f221199f = z26;
                    bVar.D = 8;
                    objC = rVar12.c(c1792a17, bVar);
                    obj8 = obj112;
                    if (objC == obj8) {
                        return obj8;
                    }
                    boolean z417 = z25;
                    bVar10 = bVar9;
                    i65 = i57;
                    z35 = z417;
                    iVar21 = iVar20;
                    iVar22 = iVar13;
                    iVar23 = iVar19;
                    obj9 = objC;
                    z36 = z26;
                    i66 = i49;
                    i67 = i55;
                    i68 = i58;
                    i69 = i56;
                    bitmap3 = bitmap2;
                    list = (List) obj9;
                    z37 = z36;
                    obj10 = obj8;
                    nu1.a aVar112 = this.drivingLicenceContainersInteractor;
                    bVar.f221200g = vq.j.a(iVar23);
                    bVar.f221201h = drivingLicenceFullData2;
                    bVar.f221202j = vq.j.a(iVar22);
                    bVar.f221203k = bVar10;
                    bVar.f221204l = vq.j.a(iVar21);
                    bVar.f221205m = bVar6;
                    bVar.f221206n = bitmap3;
                    bVar.f221207p = list;
                    bVar.f221197d = z35;
                    bVar.f221209r = i66;
                    bVar.f221210s = i65;
                    bVar.f221211t = i67;
                    bVar.f221212v = i68;
                    bVar.f221213w = i69;
                    bVar.f221214x = i59;
                    bVar.f221198e = z19;
                    bVar.f221199f = z37;
                    bVar.D = 9;
                    objG = aVar112.g(bVar);
                    if (objG == obj10) {
                        return obj10;
                    }
                    bVar11 = bVar6;
                    drivingLicenceFullData3 = drivingLicenceFullData2;
                    list2 = list;
                    z38 = z37;
                    z39 = z35;
                    z45 = z19;
                    bitmap4 = bitmap3;
                    bVar12 = bVar10;
                    String str13 = (String) ((dx.i) objG).a();
                    enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                    if (z39) {
                        enumC5973b2 = enumC5973b;
                    } else {
                        enumC5973b2 = null;
                    }
                    if (enumC5973b2 == null) {
                        if (drivingLicenceFullData3.g()) {
                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                        } else {
                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                        }
                        enumC5973b3 = enumC5973b;
                    } else {
                        enumC5973b3 = enumC5973b2;
                    }
                    if (!drivingLicenceFullData3.f()) {
                        bVar11 = ou1.b.INACTIVE;
                    }
                    left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str13, 32, null));
                    return left;
                case 5:
                    boolean z56 = bVar.f221198e;
                    int i85 = bVar.f221214x;
                    int i86 = bVar.f221213w;
                    int i87 = bVar.f221212v;
                    int i88 = bVar.f221211t;
                    int i89 = bVar.f221210s;
                    int i95 = bVar.f221209r;
                    boolean z57 = bVar.f221197d;
                    ou1.b bVar21 = (ou1.b) bVar.f221205m;
                    dx.i iVar26 = (dx.i) bVar.f221204l;
                    ou1.b bVar22 = (ou1.b) bVar.f221203k;
                    dx.i iVar27 = (dx.i) bVar.f221202j;
                    DrivingLicenceFullData drivingLicenceFullData5 = (DrivingLicenceFullData) bVar.f221201h;
                    dx.i iVar28 = (dx.i) bVar.f221200g;
                    oq.u.b(objG);
                    iVar9 = iVar28;
                    obj5 = objG;
                    iVar8 = iVar27;
                    drivingLicenceFullData2 = drivingLicenceFullData5;
                    bVar5 = bVar22;
                    iVar10 = iVar26;
                    bVar6 = bVar21;
                    z25 = z57;
                    i29 = i95;
                    i37 = i89;
                    i35 = i88;
                    i38 = i87;
                    i36 = i86;
                    i39 = i85;
                    z19 = z56;
                    iVar11 = (dx.i) obj5;
                    iVar12 = iVar10;
                    if (iVar11 instanceof dx.i.Left) {
                        objB = vq.b.a(false);
                    } else {
                        if (iVar11 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVar11).b();
                    }
                    zBooleanValue2 = ((Boolean) objB).booleanValue();
                    picture = drivingLicenceFullData2.getPicture();
                    if (picture != null) {
                        b00.c cVar15 = this.imageConverter;
                        bVar.f221200g = vq.j.a(iVar9);
                        bVar.f221201h = drivingLicenceFullData2;
                        bVar.f221202j = vq.j.a(iVar8);
                        bVar.f221203k = bVar5;
                        bVar.f221204l = vq.j.a(iVar12);
                        bVar.f221205m = bVar6;
                        bVar.f221206n = vq.j.a(picture);
                        bVar.f221197d = z25;
                        bVar.f221209r = i29;
                        bVar.f221210s = i37;
                        bVar.f221211t = i35;
                        bVar.f221212v = i38;
                        bVar.f221213w = i36;
                        bVar.f221214x = i39;
                        bVar.f221198e = z19;
                        bVar.f221215y = 0;
                        bVar.f221199f = zBooleanValue2;
                        bVar.D = 6;
                        objB2 = cVar15.b(picture, bVar);
                        objE = objE;
                        if (objB2 == objE) {
                            return objE;
                        }
                        iVar16 = iVar12;
                        obj6 = objB2;
                        iVar13 = iVar8;
                        z26 = zBooleanValue2;
                        str = picture;
                        bVar8 = bVar5;
                        z27 = z25;
                        i45 = i37;
                        i46 = i38;
                        i47 = i39;
                        i48 = 0;
                        iVar17 = (dx.i) obj6;
                        obj7 = objE;
                        if (!(iVar17 instanceof dx.i.Left)) {
                            if (iVar17 instanceof dx.i.Right) {
                                a1Var = this;
                                bVar7 = bVar8;
                                objE = obj7;
                                throw new oq.p();
                            }
                            Bitmap bitmap10 = (Bitmap) ((dx.i.Right) iVar17).b();
                            a1Var = this;
                            b00.c cVar16 = a1Var.imageConverter;
                            z28 = z26;
                            b00.f.ReduceDimension reduceDimension6 = new b00.f.ReduceDimension(a1Var.imagePropertiesProvider.getDefaultImageMaxSide());
                            bVar.f221200g = vq.j.a(iVar9);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar13);
                            bVar.f221203k = bVar8;
                            bVar.f221204l = vq.j.a(iVar16);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = vq.j.a(str);
                            bVar.f221207p = vq.j.a(iVar17);
                            bVar.f221208q = vq.j.a(bitmap10);
                            bVar.f221197d = z27;
                            bVar.f221209r = i29;
                            bVar.f221210s = i45;
                            bVar.f221211t = i35;
                            bVar.f221212v = i46;
                            bVar.f221213w = i36;
                            bVar.f221214x = i47;
                            bVar.f221198e = z19;
                            bVar.f221215y = i48;
                            z26 = z28;
                            bVar.f221199f = z26;
                            bVar.f221216z = 0;
                            bVar.A = 0;
                            bVar.D = 7;
                            bVar7 = bVar8;
                            objF3 = cVar16.f(bitmap10, reduceDimension6, bVar);
                            objE = obj7;
                            if (objF3 == objE) {
                                return objE;
                            }
                            z29 = z26;
                            i39 = i47;
                            i38 = i46;
                            i37 = i45;
                            z25 = z27;
                            iVar15 = iVar16;
                            z26 = z29;
                            iVar18 = (dx.i) objF3;
                            i39 = i47;
                            i38 = i46;
                            i37 = i45;
                            z25 = z27;
                            iVar14 = iVar9;
                            iVar15 = iVar16;
                            px.f.e(px.f.f163100a, "Conversion to bitmap failed.", null, px.c.a(a1Var), 2, null);
                            iVar19 = iVar14;
                            bVar9 = bVar7;
                            iVar20 = iVar15;
                            i49 = i29;
                            i55 = i35;
                            i56 = i36;
                            i57 = i37;
                            i58 = i38;
                            i59 = i39;
                            bitmap2 = null;
                            Object obj113 = objE;
                            h64.r rVar13 = a1Var.loadServicesUseCase;
                            gz.b.a.C1792a c1792a18 = gz.b.a.C1792a.f78542a;
                            bVar.f221200g = vq.j.a(iVar19);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar13);
                            bVar.f221203k = bVar9;
                            bVar.f221204l = vq.j.a(iVar20);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = bitmap2;
                            bVar.f221207p = null;
                            bVar.f221208q = null;
                            bVar.f221197d = z25;
                            bVar.f221209r = i49;
                            bVar.f221210s = i57;
                            bVar.f221211t = i55;
                            bVar.f221212v = i58;
                            bVar.f221213w = i56;
                            bVar.f221214x = i59;
                            bVar.f221198e = z19;
                            bVar.f221199f = z26;
                            bVar.D = 8;
                            objC = rVar13.c(c1792a18, bVar);
                            obj8 = obj113;
                            if (objC == obj8) {
                                return obj8;
                            }
                            boolean z418 = z25;
                            bVar10 = bVar9;
                            i65 = i57;
                            z35 = z418;
                            iVar21 = iVar20;
                            iVar22 = iVar13;
                            iVar23 = iVar19;
                            obj9 = objC;
                            z36 = z26;
                            i66 = i49;
                            i67 = i55;
                            i68 = i58;
                            i69 = i56;
                            bitmap3 = bitmap2;
                            list = (List) obj9;
                            z37 = z36;
                            obj10 = obj8;
                            nu1.a aVar113 = this.drivingLicenceContainersInteractor;
                            bVar.f221200g = vq.j.a(iVar23);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar22);
                            bVar.f221203k = bVar10;
                            bVar.f221204l = vq.j.a(iVar21);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = bitmap3;
                            bVar.f221207p = list;
                            bVar.f221197d = z35;
                            bVar.f221209r = i66;
                            bVar.f221210s = i65;
                            bVar.f221211t = i67;
                            bVar.f221212v = i68;
                            bVar.f221213w = i69;
                            bVar.f221214x = i59;
                            bVar.f221198e = z19;
                            bVar.f221199f = z37;
                            bVar.D = 9;
                            objG = aVar113.g(bVar);
                            if (objG == obj10) {
                                return obj10;
                            }
                            bVar11 = bVar6;
                            drivingLicenceFullData3 = drivingLicenceFullData2;
                            list2 = list;
                            z38 = z37;
                            z39 = z35;
                            z45 = z19;
                            bitmap4 = bitmap3;
                            bVar12 = bVar10;
                            String str14 = (String) ((dx.i) objG).a();
                            enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                            if (z39) {
                                enumC5973b2 = enumC5973b;
                            } else {
                                enumC5973b2 = null;
                            }
                            if (enumC5973b2 == null) {
                                if (drivingLicenceFullData3.g()) {
                                    enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                } else {
                                    enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                }
                                enumC5973b3 = enumC5973b;
                            } else {
                                enumC5973b3 = enumC5973b2;
                            }
                            if (!drivingLicenceFullData3.f()) {
                                bVar11 = ou1.b.INACTIVE;
                            }
                            left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str14, 32, null));
                            return left;
                        }
                        bVar7 = bVar8;
                        i39 = i47;
                        i38 = i46;
                        i37 = i45;
                        z25 = z27;
                        iVar18 = iVar17;
                        iVar15 = iVar16;
                        objE = obj7;
                        a1Var = this;
                        iVar14 = iVar9;
                        bitmap = (Bitmap) iVar18.a();
                        iVar9 = iVar14;
                        zBooleanValue2 = z26;
                    } else {
                        ou1.b bVar118 = bVar5;
                        a1Var = this;
                        iVar13 = iVar8;
                        bitmap = null;
                        bVar7 = bVar118;
                        iVar15 = iVar12;
                    }
                    z26 = zBooleanValue2;
                    bVar9 = bVar7;
                    iVar19 = iVar9;
                    iVar20 = iVar15;
                    i49 = i29;
                    i55 = i35;
                    i56 = i36;
                    i57 = i37;
                    i58 = i38;
                    i59 = i39;
                    bitmap2 = bitmap;
                    Object obj114 = objE;
                    h64.r rVar14 = a1Var.loadServicesUseCase;
                    gz.b.a.C1792a c1792a19 = gz.b.a.C1792a.f78542a;
                    bVar.f221200g = vq.j.a(iVar19);
                    bVar.f221201h = drivingLicenceFullData2;
                    bVar.f221202j = vq.j.a(iVar13);
                    bVar.f221203k = bVar9;
                    bVar.f221204l = vq.j.a(iVar20);
                    bVar.f221205m = bVar6;
                    bVar.f221206n = bitmap2;
                    bVar.f221207p = null;
                    bVar.f221208q = null;
                    bVar.f221197d = z25;
                    bVar.f221209r = i49;
                    bVar.f221210s = i57;
                    bVar.f221211t = i55;
                    bVar.f221212v = i58;
                    bVar.f221213w = i56;
                    bVar.f221214x = i59;
                    bVar.f221198e = z19;
                    bVar.f221199f = z26;
                    bVar.D = 8;
                    objC = rVar14.c(c1792a19, bVar);
                    obj8 = obj114;
                    if (objC == obj8) {
                        return obj8;
                    }
                    boolean z419 = z25;
                    bVar10 = bVar9;
                    i65 = i57;
                    z35 = z419;
                    iVar21 = iVar20;
                    iVar22 = iVar13;
                    iVar23 = iVar19;
                    obj9 = objC;
                    z36 = z26;
                    i66 = i49;
                    i67 = i55;
                    i68 = i58;
                    i69 = i56;
                    bitmap3 = bitmap2;
                    list = (List) obj9;
                    z37 = z36;
                    obj10 = obj8;
                    nu1.a aVar114 = this.drivingLicenceContainersInteractor;
                    bVar.f221200g = vq.j.a(iVar23);
                    bVar.f221201h = drivingLicenceFullData2;
                    bVar.f221202j = vq.j.a(iVar22);
                    bVar.f221203k = bVar10;
                    bVar.f221204l = vq.j.a(iVar21);
                    bVar.f221205m = bVar6;
                    bVar.f221206n = bitmap3;
                    bVar.f221207p = list;
                    bVar.f221197d = z35;
                    bVar.f221209r = i66;
                    bVar.f221210s = i65;
                    bVar.f221211t = i67;
                    bVar.f221212v = i68;
                    bVar.f221213w = i69;
                    bVar.f221214x = i59;
                    bVar.f221198e = z19;
                    bVar.f221199f = z37;
                    bVar.D = 9;
                    objG = aVar114.g(bVar);
                    if (objG == obj10) {
                        return obj10;
                    }
                    bVar11 = bVar6;
                    drivingLicenceFullData3 = drivingLicenceFullData2;
                    list2 = list;
                    z38 = z37;
                    z39 = z35;
                    z45 = z19;
                    bitmap4 = bitmap3;
                    bVar12 = bVar10;
                    String str15 = (String) ((dx.i) objG).a();
                    enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                    if (z39) {
                        enumC5973b2 = enumC5973b;
                    } else {
                        enumC5973b2 = null;
                    }
                    if (enumC5973b2 == null) {
                        if (drivingLicenceFullData3.g()) {
                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                        } else {
                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                        }
                        enumC5973b3 = enumC5973b;
                    } else {
                        enumC5973b3 = enumC5973b2;
                    }
                    if (!drivingLicenceFullData3.f()) {
                        bVar11 = ou1.b.INACTIVE;
                    }
                    left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str15, 32, null));
                    return left;
                case 6:
                    boolean z58 = bVar.f221199f;
                    int i96 = bVar.f221215y;
                    boolean z59 = bVar.f221198e;
                    i47 = bVar.f221214x;
                    int i97 = bVar.f221213w;
                    i46 = bVar.f221212v;
                    int i98 = bVar.f221211t;
                    i45 = bVar.f221210s;
                    int i99 = bVar.f221209r;
                    z27 = bVar.f221197d;
                    String str16 = (String) bVar.f221206n;
                    ou1.b bVar23 = (ou1.b) bVar.f221205m;
                    dx.i iVar29 = (dx.i) bVar.f221204l;
                    ou1.b bVar24 = (ou1.b) bVar.f221203k;
                    iVar13 = (dx.i) bVar.f221202j;
                    DrivingLicenceFullData drivingLicenceFullData6 = (DrivingLicenceFullData) bVar.f221201h;
                    iVar14 = (dx.i) bVar.f221200g;
                    try {
                        oq.u.b(objG);
                        i48 = i96;
                        z19 = z59;
                        z26 = z58;
                        iVar9 = iVar14;
                        bVar8 = bVar24;
                        obj6 = objG;
                        str = str16;
                        drivingLicenceFullData2 = drivingLicenceFullData6;
                        iVar16 = iVar29;
                        i36 = i97;
                        i35 = i98;
                        i29 = i99;
                        bVar6 = bVar23;
                        iVar17 = (dx.i) obj6;
                        obj7 = objE;
                        if (!(iVar17 instanceof dx.i.Left)) {
                            if (iVar17 instanceof dx.i.Right) {
                                a1Var = this;
                                bVar7 = bVar8;
                                objE = obj7;
                                throw new oq.p();
                            }
                            Bitmap bitmap11 = (Bitmap) ((dx.i.Right) iVar17).b();
                            a1Var = this;
                            b00.c cVar17 = a1Var.imageConverter;
                            z28 = z26;
                            b00.f.ReduceDimension reduceDimension7 = new b00.f.ReduceDimension(a1Var.imagePropertiesProvider.getDefaultImageMaxSide());
                            bVar.f221200g = vq.j.a(iVar9);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar13);
                            bVar.f221203k = bVar8;
                            bVar.f221204l = vq.j.a(iVar16);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = vq.j.a(str);
                            bVar.f221207p = vq.j.a(iVar17);
                            bVar.f221208q = vq.j.a(bitmap11);
                            bVar.f221197d = z27;
                            bVar.f221209r = i29;
                            bVar.f221210s = i45;
                            bVar.f221211t = i35;
                            bVar.f221212v = i46;
                            bVar.f221213w = i36;
                            bVar.f221214x = i47;
                            bVar.f221198e = z19;
                            bVar.f221215y = i48;
                            z26 = z28;
                            bVar.f221199f = z26;
                            bVar.f221216z = 0;
                            bVar.A = 0;
                            bVar.D = 7;
                            bVar7 = bVar8;
                            objF3 = cVar17.f(bitmap11, reduceDimension7, bVar);
                            objE = obj7;
                            if (objF3 == objE) {
                                return objE;
                            }
                            z29 = z26;
                            i39 = i47;
                            i38 = i46;
                            i37 = i45;
                            z25 = z27;
                            iVar15 = iVar16;
                            z26 = z29;
                            iVar18 = (dx.i) objF3;
                            i39 = i47;
                            i38 = i46;
                            i37 = i45;
                            z25 = z27;
                            iVar14 = iVar9;
                            iVar15 = iVar16;
                            px.f.e(px.f.f163100a, "Conversion to bitmap failed.", null, px.c.a(a1Var), 2, null);
                            iVar19 = iVar14;
                            bVar9 = bVar7;
                            iVar20 = iVar15;
                            i49 = i29;
                            i55 = i35;
                            i56 = i36;
                            i57 = i37;
                            i58 = i38;
                            i59 = i39;
                            bitmap2 = null;
                            Object obj115 = objE;
                            h64.r rVar15 = a1Var.loadServicesUseCase;
                            gz.b.a.C1792a c1792a110 = gz.b.a.C1792a.f78542a;
                            bVar.f221200g = vq.j.a(iVar19);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar13);
                            bVar.f221203k = bVar9;
                            bVar.f221204l = vq.j.a(iVar20);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = bitmap2;
                            bVar.f221207p = null;
                            bVar.f221208q = null;
                            bVar.f221197d = z25;
                            bVar.f221209r = i49;
                            bVar.f221210s = i57;
                            bVar.f221211t = i55;
                            bVar.f221212v = i58;
                            bVar.f221213w = i56;
                            bVar.f221214x = i59;
                            bVar.f221198e = z19;
                            bVar.f221199f = z26;
                            bVar.D = 8;
                            objC = rVar15.c(c1792a110, bVar);
                            obj8 = obj115;
                            if (objC == obj8) {
                                return obj8;
                            }
                            boolean z4110 = z25;
                            bVar10 = bVar9;
                            i65 = i57;
                            z35 = z4110;
                            iVar21 = iVar20;
                            iVar22 = iVar13;
                            iVar23 = iVar19;
                            obj9 = objC;
                            z36 = z26;
                            i66 = i49;
                            i67 = i55;
                            i68 = i58;
                            i69 = i56;
                            bitmap3 = bitmap2;
                            list = (List) obj9;
                            z37 = z36;
                            obj10 = obj8;
                            nu1.a aVar115 = this.drivingLicenceContainersInteractor;
                            bVar.f221200g = vq.j.a(iVar23);
                            bVar.f221201h = drivingLicenceFullData2;
                            bVar.f221202j = vq.j.a(iVar22);
                            bVar.f221203k = bVar10;
                            bVar.f221204l = vq.j.a(iVar21);
                            bVar.f221205m = bVar6;
                            bVar.f221206n = bitmap3;
                            bVar.f221207p = list;
                            bVar.f221197d = z35;
                            bVar.f221209r = i66;
                            bVar.f221210s = i65;
                            bVar.f221211t = i67;
                            bVar.f221212v = i68;
                            bVar.f221213w = i69;
                            bVar.f221214x = i59;
                            bVar.f221198e = z19;
                            bVar.f221199f = z37;
                            bVar.D = 9;
                            objG = aVar115.g(bVar);
                            if (objG == obj10) {
                                return obj10;
                            }
                            bVar11 = bVar6;
                            drivingLicenceFullData3 = drivingLicenceFullData2;
                            list2 = list;
                            z38 = z37;
                            z39 = z35;
                            z45 = z19;
                            bitmap4 = bitmap3;
                            bVar12 = bVar10;
                            String str17 = (String) ((dx.i) objG).a();
                            enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                            if (z39) {
                                enumC5973b2 = enumC5973b;
                            } else {
                                enumC5973b2 = null;
                            }
                            if (enumC5973b2 == null) {
                                if (drivingLicenceFullData3.g()) {
                                    enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                } else {
                                    enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                                }
                                enumC5973b3 = enumC5973b;
                            } else {
                                enumC5973b3 = enumC5973b2;
                            }
                            if (!drivingLicenceFullData3.f()) {
                                bVar11 = ou1.b.INACTIVE;
                            }
                            left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str17, 32, null));
                            return left;
                        }
                        bVar7 = bVar8;
                        i39 = i47;
                        i38 = i46;
                        i37 = i45;
                        z25 = z27;
                        iVar18 = iVar17;
                        iVar15 = iVar16;
                        objE = obj7;
                        a1Var = this;
                        iVar14 = iVar9;
                        bitmap = (Bitmap) iVar18.a();
                        iVar9 = iVar14;
                        zBooleanValue2 = z26;
                        z26 = zBooleanValue2;
                        bVar9 = bVar7;
                        iVar19 = iVar9;
                        iVar20 = iVar15;
                        i49 = i29;
                        i55 = i35;
                        i56 = i36;
                        i57 = i37;
                        i58 = i38;
                        i59 = i39;
                        bitmap2 = bitmap;
                    } catch (Exception unused12) {
                        bVar7 = bVar24;
                        z19 = z59;
                        i39 = i47;
                        i38 = i46;
                        i37 = i45;
                        z25 = z27;
                        drivingLicenceFullData2 = drivingLicenceFullData6;
                        iVar15 = iVar29;
                        i36 = i97;
                        i35 = i98;
                        i29 = i99;
                        bVar6 = bVar23;
                        a1Var = this;
                        z26 = z58;
                    }
                    Object obj116 = objE;
                    h64.r rVar16 = a1Var.loadServicesUseCase;
                    gz.b.a.C1792a c1792a111 = gz.b.a.C1792a.f78542a;
                    bVar.f221200g = vq.j.a(iVar19);
                    bVar.f221201h = drivingLicenceFullData2;
                    bVar.f221202j = vq.j.a(iVar13);
                    bVar.f221203k = bVar9;
                    bVar.f221204l = vq.j.a(iVar20);
                    bVar.f221205m = bVar6;
                    bVar.f221206n = bitmap2;
                    bVar.f221207p = null;
                    bVar.f221208q = null;
                    bVar.f221197d = z25;
                    bVar.f221209r = i49;
                    bVar.f221210s = i57;
                    bVar.f221211t = i55;
                    bVar.f221212v = i58;
                    bVar.f221213w = i56;
                    bVar.f221214x = i59;
                    bVar.f221198e = z19;
                    bVar.f221199f = z26;
                    bVar.D = 8;
                    objC = rVar16.c(c1792a111, bVar);
                    obj8 = obj116;
                    if (objC == obj8) {
                        return obj8;
                    }
                    boolean z4111 = z25;
                    bVar10 = bVar9;
                    i65 = i57;
                    z35 = z4111;
                    iVar21 = iVar20;
                    iVar22 = iVar13;
                    iVar23 = iVar19;
                    obj9 = objC;
                    z36 = z26;
                    i66 = i49;
                    i67 = i55;
                    i68 = i58;
                    i69 = i56;
                    bitmap3 = bitmap2;
                    list = (List) obj9;
                    z37 = z36;
                    obj10 = obj8;
                    nu1.a aVar116 = this.drivingLicenceContainersInteractor;
                    bVar.f221200g = vq.j.a(iVar23);
                    bVar.f221201h = drivingLicenceFullData2;
                    bVar.f221202j = vq.j.a(iVar22);
                    bVar.f221203k = bVar10;
                    bVar.f221204l = vq.j.a(iVar21);
                    bVar.f221205m = bVar6;
                    bVar.f221206n = bitmap3;
                    bVar.f221207p = list;
                    bVar.f221197d = z35;
                    bVar.f221209r = i66;
                    bVar.f221210s = i65;
                    bVar.f221211t = i67;
                    bVar.f221212v = i68;
                    bVar.f221213w = i69;
                    bVar.f221214x = i59;
                    bVar.f221198e = z19;
                    bVar.f221199f = z37;
                    bVar.D = 9;
                    objG = aVar116.g(bVar);
                    if (objG == obj10) {
                        return obj10;
                    }
                    bVar11 = bVar6;
                    drivingLicenceFullData3 = drivingLicenceFullData2;
                    list2 = list;
                    z38 = z37;
                    z39 = z35;
                    z45 = z19;
                    bitmap4 = bitmap3;
                    bVar12 = bVar10;
                    String str18 = (String) ((dx.i) objG).a();
                    enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                    if (z39) {
                        enumC5973b2 = enumC5973b;
                    } else {
                        enumC5973b2 = null;
                    }
                    if (enumC5973b2 == null) {
                        if (drivingLicenceFullData3.g()) {
                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                        } else {
                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                        }
                        enumC5973b3 = enumC5973b;
                    } else {
                        enumC5973b3 = enumC5973b2;
                    }
                    if (!drivingLicenceFullData3.f()) {
                        bVar11 = ou1.b.INACTIVE;
                    }
                    left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str18, 32, null));
                    return left;
                case 7:
                    boolean z65 = bVar.f221199f;
                    z19 = bVar.f221198e;
                    i39 = bVar.f221214x;
                    i36 = bVar.f221213w;
                    i38 = bVar.f221212v;
                    i35 = bVar.f221211t;
                    i37 = bVar.f221210s;
                    i29 = bVar.f221209r;
                    z25 = bVar.f221197d;
                    bVar6 = (ou1.b) bVar.f221205m;
                    iVar15 = (dx.i) bVar.f221204l;
                    ou1.b bVar25 = (ou1.b) bVar.f221203k;
                    dx.i iVar30 = (dx.i) bVar.f221202j;
                    z29 = z65;
                    DrivingLicenceFullData drivingLicenceFullData7 = (DrivingLicenceFullData) bVar.f221201h;
                    iVar14 = (dx.i) bVar.f221200g;
                    try {
                        oq.u.b(objG);
                        iVar9 = iVar14;
                        iVar13 = iVar30;
                        objF3 = objG;
                        a1Var = this;
                        bVar7 = bVar25;
                        drivingLicenceFullData2 = drivingLicenceFullData7;
                        z26 = z29;
                        iVar18 = (dx.i) objF3;
                        iVar14 = iVar9;
                        bitmap = (Bitmap) iVar18.a();
                        iVar9 = iVar14;
                        zBooleanValue2 = z26;
                        z26 = zBooleanValue2;
                        bVar9 = bVar7;
                        iVar19 = iVar9;
                        iVar20 = iVar15;
                        i49 = i29;
                        i55 = i35;
                        i56 = i36;
                        i57 = i37;
                        i58 = i38;
                        i59 = i39;
                        bitmap2 = bitmap;
                    } catch (Exception unused13) {
                        bVar7 = bVar25;
                        iVar13 = iVar30;
                        drivingLicenceFullData2 = drivingLicenceFullData7;
                        a1Var = this;
                        z26 = z29;
                        break;
                    }
                    Object obj117 = objE;
                    h64.r rVar17 = a1Var.loadServicesUseCase;
                    gz.b.a.C1792a c1792a112 = gz.b.a.C1792a.f78542a;
                    bVar.f221200g = vq.j.a(iVar19);
                    bVar.f221201h = drivingLicenceFullData2;
                    bVar.f221202j = vq.j.a(iVar13);
                    bVar.f221203k = bVar9;
                    bVar.f221204l = vq.j.a(iVar20);
                    bVar.f221205m = bVar6;
                    bVar.f221206n = bitmap2;
                    bVar.f221207p = null;
                    bVar.f221208q = null;
                    bVar.f221197d = z25;
                    bVar.f221209r = i49;
                    bVar.f221210s = i57;
                    bVar.f221211t = i55;
                    bVar.f221212v = i58;
                    bVar.f221213w = i56;
                    bVar.f221214x = i59;
                    bVar.f221198e = z19;
                    bVar.f221199f = z26;
                    bVar.D = 8;
                    objC = rVar17.c(c1792a112, bVar);
                    obj8 = obj117;
                    if (objC == obj8) {
                        return obj8;
                    }
                    boolean z4112 = z25;
                    bVar10 = bVar9;
                    i65 = i57;
                    z35 = z4112;
                    iVar21 = iVar20;
                    iVar22 = iVar13;
                    iVar23 = iVar19;
                    obj9 = objC;
                    z36 = z26;
                    i66 = i49;
                    i67 = i55;
                    i68 = i58;
                    i69 = i56;
                    bitmap3 = bitmap2;
                    list = (List) obj9;
                    z37 = z36;
                    obj10 = obj8;
                    nu1.a aVar117 = this.drivingLicenceContainersInteractor;
                    bVar.f221200g = vq.j.a(iVar23);
                    bVar.f221201h = drivingLicenceFullData2;
                    bVar.f221202j = vq.j.a(iVar22);
                    bVar.f221203k = bVar10;
                    bVar.f221204l = vq.j.a(iVar21);
                    bVar.f221205m = bVar6;
                    bVar.f221206n = bitmap3;
                    bVar.f221207p = list;
                    bVar.f221197d = z35;
                    bVar.f221209r = i66;
                    bVar.f221210s = i65;
                    bVar.f221211t = i67;
                    bVar.f221212v = i68;
                    bVar.f221213w = i69;
                    bVar.f221214x = i59;
                    bVar.f221198e = z19;
                    bVar.f221199f = z37;
                    bVar.D = 9;
                    objG = aVar117.g(bVar);
                    if (objG == obj10) {
                        return obj10;
                    }
                    bVar11 = bVar6;
                    drivingLicenceFullData3 = drivingLicenceFullData2;
                    list2 = list;
                    z38 = z37;
                    z39 = z35;
                    z45 = z19;
                    bitmap4 = bitmap3;
                    bVar12 = bVar10;
                    String str19 = (String) ((dx.i) objG).a();
                    enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                    if (z39) {
                        enumC5973b2 = enumC5973b;
                    } else {
                        enumC5973b2 = null;
                    }
                    if (enumC5973b2 == null) {
                        if (drivingLicenceFullData3.g()) {
                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                        } else {
                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                        }
                        enumC5973b3 = enumC5973b;
                    } else {
                        enumC5973b3 = enumC5973b2;
                    }
                    if (!drivingLicenceFullData3.f()) {
                        bVar11 = ou1.b.INACTIVE;
                    }
                    left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str19, 32, null));
                    return left;
                case 8:
                    boolean z66 = bVar.f221199f;
                    boolean z67 = bVar.f221198e;
                    i59 = bVar.f221214x;
                    int i100 = bVar.f221213w;
                    int i101 = bVar.f221212v;
                    int i102 = bVar.f221211t;
                    int i103 = bVar.f221210s;
                    int i104 = bVar.f221209r;
                    boolean z68 = bVar.f221197d;
                    Bitmap bitmap12 = (Bitmap) bVar.f221206n;
                    ou1.b bVar26 = (ou1.b) bVar.f221205m;
                    dx.i iVar31 = (dx.i) bVar.f221204l;
                    ou1.b bVar27 = (ou1.b) bVar.f221203k;
                    iVar22 = (dx.i) bVar.f221202j;
                    DrivingLicenceFullData drivingLicenceFullData8 = (DrivingLicenceFullData) bVar.f221201h;
                    dx.i iVar32 = (dx.i) bVar.f221200g;
                    oq.u.b(objG);
                    bVar10 = bVar27;
                    obj9 = objG;
                    iVar23 = iVar32;
                    i65 = i103;
                    i66 = i104;
                    bVar6 = bVar26;
                    obj8 = objE;
                    z36 = z66;
                    z19 = z67;
                    z35 = z68;
                    i67 = i102;
                    i68 = i101;
                    i69 = i100;
                    bitmap3 = bitmap12;
                    drivingLicenceFullData2 = drivingLicenceFullData8;
                    iVar21 = iVar31;
                    list = (List) obj9;
                    z37 = z36;
                    obj10 = obj8;
                    nu1.a aVar118 = this.drivingLicenceContainersInteractor;
                    bVar.f221200g = vq.j.a(iVar23);
                    bVar.f221201h = drivingLicenceFullData2;
                    bVar.f221202j = vq.j.a(iVar22);
                    bVar.f221203k = bVar10;
                    bVar.f221204l = vq.j.a(iVar21);
                    bVar.f221205m = bVar6;
                    bVar.f221206n = bitmap3;
                    bVar.f221207p = list;
                    bVar.f221197d = z35;
                    bVar.f221209r = i66;
                    bVar.f221210s = i65;
                    bVar.f221211t = i67;
                    bVar.f221212v = i68;
                    bVar.f221213w = i69;
                    bVar.f221214x = i59;
                    bVar.f221198e = z19;
                    bVar.f221199f = z37;
                    bVar.D = 9;
                    objG = aVar118.g(bVar);
                    if (objG == obj10) {
                        return obj10;
                    }
                    bVar11 = bVar6;
                    drivingLicenceFullData3 = drivingLicenceFullData2;
                    list2 = list;
                    z38 = z37;
                    z39 = z35;
                    z45 = z19;
                    bitmap4 = bitmap3;
                    bVar12 = bVar10;
                    String str110 = (String) ((dx.i) objG).a();
                    enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                    if (z39) {
                        enumC5973b2 = enumC5973b;
                    } else {
                        enumC5973b2 = null;
                    }
                    if (enumC5973b2 == null) {
                        if (drivingLicenceFullData3.g()) {
                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                        } else {
                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                        }
                        enumC5973b3 = enumC5973b;
                    } else {
                        enumC5973b3 = enumC5973b2;
                    }
                    if (!drivingLicenceFullData3.f()) {
                        bVar11 = ou1.b.INACTIVE;
                    }
                    left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str110, 32, null));
                    return left;
                case 9:
                    boolean z69 = bVar.f221199f;
                    boolean z75 = bVar.f221198e;
                    boolean z76 = bVar.f221197d;
                    List list3 = (List) bVar.f221207p;
                    Bitmap bitmap13 = (Bitmap) bVar.f221206n;
                    bVar11 = (ou1.b) bVar.f221205m;
                    ou1.b bVar28 = (ou1.b) bVar.f221203k;
                    DrivingLicenceFullData drivingLicenceFullData9 = (DrivingLicenceFullData) bVar.f221201h;
                    oq.u.b(objG);
                    z38 = z69;
                    z39 = z76;
                    list2 = list3;
                    drivingLicenceFullData3 = drivingLicenceFullData9;
                    z45 = z75;
                    bitmap4 = bitmap13;
                    bVar12 = bVar28;
                    String str111 = (String) ((dx.i) objG).a();
                    enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
                    if (z39) {
                        enumC5973b2 = enumC5973b;
                    } else {
                        enumC5973b2 = null;
                    }
                    if (enumC5973b2 == null) {
                        if (drivingLicenceFullData3.g()) {
                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                        } else {
                            enumC5973b = y30.n.Switch.EnumC5973b.LEFT;
                        }
                        enumC5973b3 = enumC5973b;
                    } else {
                        enumC5973b3 = enumC5973b2;
                    }
                    if (!drivingLicenceFullData3.f()) {
                        bVar11 = ou1.b.INACTIVE;
                    }
                    left = new dx.i.Right(new xu1.w.Initialized(enumC5973b3, drivingLicenceFullData3, bitmap4, z38, z45, false, bVar12, bVar11, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), list2, str111, 32, null));
                    return left;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CancellationException e17) {
            throw e17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N9(k10.c0<xu1.w.b> c0Var, boolean z15, tq.e<? super k10.l<? extends xu1.w>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f221227h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f221227h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f221225f;
        Object objE = uq.b.e();
        int i16 = cVar.f221227h;
        if (i16 == 0) {
            oq.u.b(objB);
            ac4.a aVar = this.callActionWithLoaderUseCase;
            ju.l0 l0VarB = ju.g1.b();
            d dVar = new d(z15, null);
            cVar.f221223d = c0Var;
            cVar.f221224e = z15;
            cVar.f221227h = 1;
            objB = aVar.b(l0VarB, dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) cVar.f221223d;
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return c0Var.c();
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        final xu1.w wVar = (xu1.w) ((dx.i.Right) iVar).b();
        return c0Var.d(new er.l() { // from class: xu1.p0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.P9(wVar, (w.b) obj);
            }
        });
    }

    static /* synthetic */ Object O9(a1 a1Var, k10.c0 c0Var, boolean z15, tq.e eVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return a1Var.N9(c0Var, z15, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xu1.w P9(xu1.w wVar, xu1.w.b bVar) {
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xu1.x.a Q9(State<xu1.w> mainState) {
        yu1.w wVar = this.drivingLicenceMainMapper;
        xu1.w wVarD = mainState.d();
        y20.b animationsState = mainState.getAnimationsState();
        er.a<oq.i0> aVarB9 = b9(xu1.o.f221385a);
        e eVar = new e(this);
        er.a<oq.i0> aVarB10 = b9(xu1.k.f221368a);
        er.a<oq.i0> aVarB11 = b9(new GoToVerification(new er.a() { // from class: xu1.m0
            @Override // er.a
            public final Object a() {
                return a1.R9(this.f221374a);
            }
        }));
        er.a<oq.i0> aVarB12 = b9(xu1.e.f221348a);
        er.a<oq.i0> aVarB13 = b9(xu1.i.f221359a);
        er.a<oq.i0> aVarB14 = b9(xu1.d.f221347a);
        return wVar.b(new yu1.w.Params(wVarD, animationsState, new yu1.w.Params.ActionsHandler(aVarB9, new er.l() { // from class: xu1.r0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.S9(this.f221393a, (y30.n.Switch.EnumC5973b) obj);
            }
        }, new er.l() { // from class: xu1.s0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.T9(this.f221395a, (mz3.z.b) obj);
            }
        }, eVar, aVarB10, aVarB11, b9(xu1.l.f221371a), b9(xu1.h.f221356a), new er.l() { // from class: xu1.t0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.U9(this.f221397a, (List) obj);
            }
        }, new er.l() { // from class: xu1.u0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.V9(this.f221399a, (n20.a) obj);
            }
        }, new er.l() { // from class: xu1.v0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.W9(this.f221401a, ((Boolean) obj).booleanValue());
            }
        }, aVarB12, aVarB13, aVarB14, new er.l() { // from class: xu1.w0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.X9(this.f221422a, (w.Initialized.InterfaceC5918a) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(a1 a1Var) {
        a1Var.d9(new UpdateDrivingLicence(mz3.z.b.UPDATE));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(a1 a1Var, y30.n.Switch.EnumC5973b enumC5973b) {
        a1Var.d9(new ChangeTabAction(enumC5973b));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(a1 a1Var, mz3.z.b bVar) {
        a1Var.d9(new UpdateDrivingLicence(bVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(a1 a1Var, List list) {
        a1Var.d9(new GoToMoreDialog(list));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(a1 a1Var, n20.a aVar) {
        a1Var.d9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(a1 a1Var, boolean z15) {
        if (z15) {
            a1Var.d9(xu1.r.f221392a);
        } else {
            if (z15) {
                throw new oq.p();
            }
            a1Var.d9(xu1.f.f221351a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(a1 a1Var, xu1.w.Initialized.InterfaceC5918a interfaceC5918a) {
        a1Var.d9(new SetBottomSheetState(interfaceC5918a));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y9(String url) {
        i00.a.a(this, new f(url, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(final a1 a1Var, final pu1.d dVar, k10.v vVar) {
        vVar.c(fr.q0.c(xu1.w.class), new er.l() { // from class: xu1.x0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.ba(this.f221436a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(xu1.w.b.class), new er.l() { // from class: xu1.y0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.ca(this.f221439a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(xu1.w.Initialized.class), new er.l() { // from class: xu1.z0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.da(this.f221442a, dVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(xu1.w.c.class), new er.l() { // from class: xu1.n0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.ea(this.f221384a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(xu1.w.class), new er.l() { // from class: xu1.o0
            @Override // er.l
            public final Object b(Object obj) {
                return a1.fa(this.f221386a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(a1 a1Var, k10.z zVar) {
        h hVar = a1Var.new h(null);
        zVar.x(fr.q0.c(ShowError.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(a1 a1Var, k10.z zVar) {
        zVar.A(a1Var.new i(null));
        j jVar = a1Var.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(Retry.class), oVar, jVar);
        zVar.x(fr.q0.c(xu1.g.class), oVar, a1Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(a1 a1Var, pu1.d dVar, k10.z zVar) {
        q qVar = a1Var.new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(xu1.o.class), oVar, qVar);
        zVar.x(fr.q0.c(xu1.g.class), oVar, a1Var.new r(null));
        zVar.x(fr.q0.c(xu1.i.class), oVar, a1Var.new s(null));
        zVar.x(fr.q0.c(xu1.k.class), oVar, a1Var.new t(null));
        zVar.x(fr.q0.c(GoToVerification.class), oVar, a1Var.new u(null));
        zVar.v(fr.q0.c(SetBottomSheetState.class), oVar, new v(null));
        zVar.v(fr.q0.c(xu1.d.class), oVar, new w(null));
        zVar.v(fr.q0.c(ChangeTabAction.class), oVar, new x(null));
        zVar.v(fr.q0.c(xu1.e.class), oVar, new y(dVar, null));
        zVar.x(fr.q0.c(UpdateDrivingLicence.class), oVar, a1Var.new l(null));
        zVar.x(fr.q0.c(Retry.class), oVar, a1Var.new m(null));
        zVar.x(fr.q0.c(xu1.l.class), oVar, a1Var.new n(null));
        zVar.x(fr.q0.c(xu1.h.class), oVar, a1Var.new o(null));
        zVar.x(fr.q0.c(GoToMoreDialog.class), oVar, a1Var.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(a1 a1Var, k10.z zVar) {
        z zVar2 = a1Var.new z(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(xu1.o.class), oVar, zVar2);
        zVar.x(fr.q0.c(xu1.g.class), oVar, a1Var.new a0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(a1 a1Var, k10.z zVar) {
        b0 b0Var = a1Var.new b0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(xu1.r.class), oVar, b0Var);
        zVar.x(fr.q0.c(ShowDrivingLicenseDialog.class), oVar, a1Var.new c0(null));
        zVar.x(fr.q0.c(xu1.f.class), oVar, a1Var.new d0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:36:0x0133  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012f, code lost:
    
        if (F(r12, r2) == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b7, code lost:
    
        if (r10.F(r13, r2) == r3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ga(mz3.z.b r21, y30.n.Switch.EnumC5973b r22, java.lang.String r23, tq.e<? super oq.i0> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xu1.a1.ga(mz3.z$b, y30.n$b$b, java.lang.String, tq.e):java.lang.Object");
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: L9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(xu1.n nVar, tq.e<? super oq.i0> eVar) {
        return super.F(nVar, eVar);
    }

    @Override // zx.b
    public xw.b<xu1.n> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // l00.g
    protected k10.t<State<xu1.w>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<xu1.x.a> getState() {
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
