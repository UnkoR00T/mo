package zs1;

import bt1.RefugeeChildStatementState;
import bt1.RefugeeChildrenListEntry;
import cb4.DialogData;
import ct1.SetupData;
import ir0.RefugeeChildPersonalInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lz3.WorkerInfo;
import n20.State;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ws1.Document;
import ws1.RefugeeCardData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0089\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\u008a\u0001B¡\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u0002002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b1\u00102J$\u00106\u001a\b\u0012\u0004\u0012\u00020\u0003052\f\u0010/\u001a\b\u0012\u0004\u0012\u00020403H\u0082@¢\u0006\u0004\b6\u00107J,\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003052\u0006\u00109\u001a\u0002082\f\u0010/\u001a\b\u0012\u0004\u0012\u00020403H\u0082@¢\u0006\u0004\b:\u0010;J'\u0010B\u001a\u00020A*\u00020<2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=H\u0002¢\u0006\u0004\bB\u0010CJ\u0018\u0010F\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010DH\u0082@¢\u0006\u0004\bF\u0010GJ\u0018\u0010J\u001a\u00020?2\u0006\u0010I\u001a\u00020HH\u0096\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020?H\u0096\u0001¢\u0006\u0004\bL\u0010MR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR \u0010z\u001a\b\u0012\u0004\u0012\u00020u0t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR-\u0010\u0080\u0001\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040{8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR$\u0010/\u001a\t\u0012\u0004\u0012\u0002000\u0081\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bJ\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001e\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010\u0085\u00018\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\\\u0010\u0087\u0001¨\u0006\u008b\u0001"}, d2 = {"Lzs1/x1;", "Ll00/g;", "Ln20/b;", "Lzs1/s0;", "Ln20/a;", "Lzs1/t0;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lat1/h;", "refugeeDocumentMapper", "Lib4/c;", "genericDomainErrorMapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Lac4/a;", "callActionWithLoaderUseCase", "Lxs1/b;", "isDiiaPlPeselZoomFeatureFlagActiveUC", "Lh64/r;", "loadServicesUseCase", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lh64/q;", "loadRemoteSettingsUseCase", "Lmz3/b;", "asyncGenerateDiiaChildrenDataUC", "Lxs1/a;", "getChildrenPersonalInfoUC", "Lmz3/n;", "getAsyncDownloadWorkersMonitorUseCase", "Lhb4/d;", "errorVMSFactory", "Lcb4/j;", "dialogVMSFactory", "Lvs1/a;", "refugeeCardContainersInteractor", "Lo20/t2$a;", "deps", "Lmx/c;", "labelProvider", "<init>", "(Ln20/j;Lat1/h;Lib4/c;La14/w;Li70/n;Lac4/a;Lxs1/b;Lh64/r;Lmz3/z;Lmz3/w;Lh64/q;Lmz3/b;Lxs1/a;Lmz3/n;Lhb4/d;Lcb4/j;Lvs1/a;Lo20/t2$a;Lmx/c;)V", "state", "Lzs1/t0$a;", "Z9", "(Ln20/b;)Lzs1/t0$a;", "Lk10/c0;", "Lzs1/s0$d$b;", "Lk10/l;", "X9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lzs1/z;", "action", "S9", "(Lzs1/z;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "Lkotlin/Function1;", "Lib4/c$b;", "Loq/i0;", "resultAction", "Lhb4/c;", "W9", "(Ldx/b;Ler/l;)Lhb4/c;", "", "Lrq0/c;", "V9", "(Ltq/e;)Ljava/lang/Object;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lat1/h;", "c", "Lib4/c;", "d", "La14/w;", "e", "Li70/n;", "f", "Lac4/a;", "g", "Lxs1/b;", "h", "Lh64/r;", "j", "Lmz3/z;", "k", "Lmz3/w;", "l", "Lh64/q;", "m", "Lmz3/b;", "n", "Lxs1/a;", "p", "Lmz3/n;", "q", "Lhb4/d;", "r", "Lcb4/j;", "s", "Lvs1/a;", "t", "Lo20/t2$a;", "Lzs1/s0$f;", "v", "Lzs1/s0$f;", "initialState", "Lxw/b;", "Lzs1/b0;", "w", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "x", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "z", "a", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x1 extends l00.g<State<s0>, n20.a> implements t0, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final at1.h refugeeDocumentMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xs1.b isDiiaPlPeselZoomFeatureFlagActiveUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final h64.q loadRemoteSettingsUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mz3.b asyncGenerateDiiaChildrenDataUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xs1.a getChildrenPersonalInfoUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mz3.n getAsyncDownloadWorkersMonitorUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final vs1.a refugeeCardContainersInteractor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final o20.t2.a deps;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final s0.f initialState;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final xw.b<zs1.b0> navAction;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<s0>, n20.a> stateMachine;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<t0.a> state;
    public static final int A = 8;
    private static final rq0.b.d B = rq0.b.d.DIIA_REFUGEE_CARD;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/j0;", "action", "Lk10/c0;", "Lzs1/s0$b$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/j0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<ShowDialog, k10.c0<s0.b.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f236960g;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Dialog O(k10.c0 c0Var, x1 x1Var, ShowDialog showDialog, s0.b.Screen screen) {
            return new s0.b.Dialog(((s0.b.Screen) c0Var.a()).getDocumentStateData(), ((s0.b.Screen) c0Var.a()).getBottomSheetState(), x1Var.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowDialog showDialog = (ShowDialog) this.f236959f;
            final k10.c0 c0Var = (k10.c0) this.f236960g;
            uq.b.e();
            if (this.f236958e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final x1 x1Var = x1.this;
            return c0Var.d(new er.l() { // from class: zs1.m2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.a0.O(c0Var, x1Var, showDialog, (s0.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDialog showDialog, k10.c0<s0.b.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            a0 a0Var = x1.this.new a0(eVar);
            a0Var.f236959f = showDialog;
            a0Var.f236960g = c0Var;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f236963e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f236964f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f236965g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f236966h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f236967j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f236968k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f236969l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f236970m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f236971n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f236973q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236971n = obj;
            this.f236973q |= PKIFailureInfo.systemUnavail;
            return x1.this.S9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/s;", "action", "Lk10/c0;", "Lzs1/s0$b$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<ChangeSwitchItem, k10.c0<s0.b.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236975f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f236976g;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen O(k10.c0 c0Var, ChangeSwitchItem changeSwitchItem, s0.b.Screen screen) {
            return s0.b.Screen.d((s0.b.Screen) c0Var.a(), DocumentStateData.b(screen.getDocumentStateData(), changeSwitchItem.getNewItem(), null, null, false, false, null, false, null, null, null, 1022, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeSwitchItem changeSwitchItem = (ChangeSwitchItem) this.f236975f;
            final k10.c0 c0Var = (k10.c0) this.f236976g;
            uq.b.e();
            if (this.f236974e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zs1.n2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.b0.O(c0Var, changeSwitchItem, (s0.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeSwitchItem changeSwitchItem, k10.c0<s0.b.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            b0 b0Var = new b0(eVar);
            b0Var.f236975f = changeSwitchItem;
            b0Var.f236976g = c0Var;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236977d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236978e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236980g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236978e = obj;
            this.f236980g |= PKIFailureInfo.systemUnavail;
            return x1.this.V9(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/r;", "<unused var>", "Lk10/c0;", "Lzs1/s0$b$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<zs1.r, k10.c0<s0.b.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236982f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f236984a;

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
                f236984a = iArr;
            }
        }

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.d.Screen X(s0.b.Screen screen) {
            return new s0.d.Screen(null, y30.n.Switch.EnumC5973b.RIGHT);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen Y(s0.b.Screen screen) {
            return s0.b.Screen.d(screen, DocumentStateData.b(screen.getDocumentStateData(), y30.n.Switch.EnumC5973b.LEFT, null, null, false, false, null, false, null, null, null, 1022, null), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen Z(s0.b.Screen screen) {
            return s0.b.Screen.d(screen, null, zs1.o0.a.f236818a, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236982f;
            Object objE = uq.b.e();
            int i15 = this.f236981e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!(((s0.b.Screen) c0Var.a()).getBottomSheetState() instanceof zs1.o0.a)) {
                    return c0Var.b(new er.l() { // from class: zs1.q2
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return x1.c0.Z((s0.b.Screen) obj2);
                        }
                    });
                }
                int i16 = a.f236984a[((s0.b.Screen) c0Var.a()).getDocumentStateData().getSelectedItem().ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        return c0Var.b(new er.l() { // from class: zs1.p2
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return x1.c0.Y((s0.b.Screen) obj2);
                            }
                        });
                    }
                    throw new oq.p();
                }
                if (((s0.b.Screen) c0Var.a()).getDocumentStateData().getBundleId() != null) {
                    return c0Var.d(new er.l() { // from class: zs1.o2
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return x1.c0.X((s0.b.Screen) obj2);
                        }
                    });
                }
                x1 x1Var = x1.this;
                zs1.b0.a aVar = zs1.b0.a.f236743a;
                this.f236982f = c0Var;
                this.f236981e = 1;
                if (x1Var.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.r rVar, k10.c0<s0.b.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            c0 c0Var2 = x1.this.new c0(eVar);
            c0Var2.f236982f = c0Var;
            return c0Var2.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236985d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f236986e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f236987f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f236988g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f236989h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f236990j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f236991k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f236992l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f236993m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f236994n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f236995p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f236997r;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236995p = obj;
            this.f236997r |= PKIFailureInfo.systemUnavail;
            return x1.this.X9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/v;", "<unused var>", "Lk10/c0;", "Lzs1/s0$b$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<zs1.v, k10.c0<s0.b.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236999f;

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen O(s0.b.Screen screen) {
            return s0.b.Screen.d(screen, null, zs1.o0.a.f236818a, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236999f;
            uq.b.e();
            if (this.f236998e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zs1.r2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.d0.O((s0.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.v vVar, k10.c0<s0.b.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            d0 d0Var = new d0(eVar);
            d0Var.f236999f = c0Var;
            return d0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<t0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f237000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x1 f237001b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f237002a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x1 f237003b;

            /* JADX INFO: renamed from: zs1.x1$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6402a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f237004d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f237005e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f237006f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f237008h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f237009j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f237010k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f237011l;

                public C6402a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f237004d = obj;
                    this.f237005e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x1 x1Var) {
                this.f237002a = hVar;
                this.f237003b = x1Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6402a c6402a;
                if (eVar instanceof C6402a) {
                    c6402a = (C6402a) eVar;
                    int i15 = c6402a.f237005e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6402a.f237005e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6402a = new C6402a(eVar);
                    }
                } else {
                    c6402a = new C6402a(eVar);
                }
                Object obj2 = c6402a.f237004d;
                Object objE = uq.b.e();
                int i16 = c6402a.f237005e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f237002a;
                    t0.a aVarZ9 = this.f237003b.Z9((State) obj);
                    c6402a.f237006f = vq.j.a(obj);
                    c6402a.f237008h = vq.j.a(c6402a);
                    c6402a.f237009j = vq.j.a(obj);
                    c6402a.f237010k = vq.j.a(hVar);
                    c6402a.f237011l = 0;
                    c6402a.f237005e = 1;
                    if (hVar.F(aVarZ9, c6402a) == objE) {
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

        public e(mu.g gVar, x1 x1Var) {
            this.f237000a = gVar;
            this.f237001b = x1Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super t0.a> hVar, tq.e eVar) {
            Object objA = this.f237000a.a(new a(hVar, this.f237001b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzs1/i0;", "<unused var>", "Lzs1/s0$b$c;", "Loq/i0;", "<anonymous>", "(Lzs1/i0;Lzs1/s0$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.q<zs1.i0, s0.b.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237012e;

        e0(tq.e<? super e0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f237012e;
            if (i15 == 0) {
                oq.u.b(obj);
                vs1.a aVar = x1.this.refugeeCardContainersInteractor;
                rq0.b.d dVar = x1.B;
                er.a<oq.i0> aVarB9 = x1.this.b9(zs1.x.f236932a);
                er.a<oq.i0> aVarB10 = x1.this.b9(zs1.y.f237132a);
                this.f237012e = 1;
                obj = aVar.f(dVar, aVarB9, aVarB10, this);
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
            x1 x1Var = x1.this;
            if (iVar instanceof dx.i.Left) {
                x1Var.d9(new ShowError((dx.b) ((dx.i.Left) iVar).b()));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                x1Var.d9(new ShowDialog((DialogData) ((dx.i.Right) iVar).b()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.i0 i0Var, s0.b.Screen screen, tq.e<? super oq.i0> eVar) {
            return x1.this.new e0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lzs1/s0$f;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<s0.f>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237015f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.d.Screen O(s0.f fVar) {
            return new s0.d.Screen(null, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f237015f;
            uq.b.e();
            if (this.f237014e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zs1.y1
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.f.O((s0.f) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<s0.f> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            return ((f) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = new f(eVar);
            fVar.f237015f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzs1/f0;", "<unused var>", "Lzs1/s0$b$c;", "state", "Loq/i0;", "<anonymous>", "(Lzs1/f0;Lzs1/s0$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<zs1.f0, s0.b.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237017f;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s0.b.Screen screen = (s0.b.Screen) this.f237017f;
            Object objE = uq.b.e();
            int i15 = this.f237016e;
            if (i15 == 0) {
                oq.u.b(obj);
                x1 x1Var = x1.this;
                zs1.b0.GoToVerification goToVerification = new zs1.b0.GoToVerification(screen.getDocumentStateData().getBundleId());
                this.f237017f = vq.j.a(screen);
                this.f237016e = 1;
                if (x1Var.F(goToVerification, this) == objE) {
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
        public final Object w(zs1.f0 f0Var, s0.b.Screen screen, tq.e<? super oq.i0> eVar) {
            f0 f0Var2 = x1.this.new f0(eVar);
            f0Var2.f237017f = screen;
            return f0Var2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzs1/r;", "<unused var>", "Lzs1/s0$f;", "Loq/i0;", "<anonymous>", "(Lzs1/r;Lzs1/s0$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<zs1.r, s0.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237019e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f237019e;
            if (i15 == 0) {
                oq.u.b(obj);
                x1 x1Var = x1.this;
                zs1.b0.a aVar = zs1.b0.a.f236743a;
                this.f237019e = 1;
                if (x1Var.F(aVar, this) == objE) {
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
        public final Object w(zs1.r rVar, s0.f fVar, tq.e<? super oq.i0> eVar) {
            return x1.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/n0;", "action", "Lk10/c0;", "Lzs1/s0$b$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/n0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.q<UpdateDocumentClickAction, k10.c0<s0.b.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237023g;

        g0(tq.e<? super g0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.e.Screen O(UpdateDocumentClickAction updateDocumentClickAction, s0.b.Screen screen) {
            return new s0.e.Screen(screen.getDocumentStateData(), updateDocumentClickAction.getUpdateMethodType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final UpdateDocumentClickAction updateDocumentClickAction = (UpdateDocumentClickAction) this.f237022f;
            k10.c0 c0Var = (k10.c0) this.f237023g;
            uq.b.e();
            if (this.f237021e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zs1.s2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.g0.O(updateDocumentClickAction, (s0.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(UpdateDocumentClickAction updateDocumentClickAction, k10.c0<s0.b.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            g0 g0Var = new g0(eVar);
            g0Var.f237022f = updateDocumentClickAction;
            g0Var.f237023g = c0Var;
            return g0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/y;", "<unused var>", "Lk10/c0;", "Lzs1/s0$e$a;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/y;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<zs1.y, k10.c0<s0.e.Dialog>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237025f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen O(k10.c0 c0Var, s0.e.Dialog dialog) {
            return new s0.b.Screen(((s0.e.Dialog) c0Var.a()).getDocumentStateData(), zs1.o0.a.f236818a);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f237025f;
            uq.b.e();
            if (this.f237024e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zs1.z1
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.h.O(c0Var, (s0.e.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.y yVar, k10.c0<s0.e.Dialog> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            h hVar = new h(eVar);
            hVar.f237025f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzs1/g0;", "<unused var>", "Lzs1/s0$b$c;", "Loq/i0;", "<anonymous>", "(Lzs1/g0;Lzs1/s0$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.q<zs1.g0, s0.b.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f237026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f237027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f237028g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f237029h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f237030j;

        h0(tq.e<? super h0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        
            if (r1.F(r4, r12) == r0) goto L17;
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
                int r1 = r12.f237030j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r12.f237027f
                oq.i0 r0 = (oq.i0) r0
                java.lang.Object r0 = r12.f237026e
                dx.i r0 = (dx.i) r0
                oq.u.b(r13)
                goto L9c
            L1b:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L23:
                oq.u.b(r13)
                goto L3b
            L27:
                oq.u.b(r13)
                zs1.x1 r13 = zs1.x1.this
                vs1.a r13 = zs1.x1.M9(r13)
                rq0.c r1 = rq0.c.PESEL_RESTRICTION
                r12.f237030j = r3
                java.lang.Object r13 = r13.d(r1, r12)
                if (r13 != r0) goto L3b
                goto L67
            L3b:
                dx.i r13 = (dx.i) r13
                zs1.x1 r1 = zs1.x1.this
                boolean r3 = r13 instanceof dx.i.Left
                if (r3 == 0) goto L68
                r3 = r13
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                oq.i0 r3 = (oq.i0) r3
                zs1.b0$b r4 = zs1.b0.b.f236744a
                java.lang.Object r13 = vq.j.a(r13)
                r12.f237026e = r13
                java.lang.Object r13 = vq.j.a(r3)
                r12.f237027f = r13
                r13 = 0
                r12.f237028g = r13
                r12.f237029h = r13
                r12.f237030j = r2
                java.lang.Object r13 = r1.F(r4, r12)
                if (r13 != r0) goto L9c
            L67:
                return r0
            L68:
                boolean r0 = r13 instanceof dx.i.Right
                if (r0 == 0) goto L9f
                dx.i$c r13 = (dx.i.Right) r13
                java.lang.Object r13 = r13.b()
                r2 = r13
                cb4.d r2 = (cb4.DialogData) r2
                zs1.j0 r13 = new zs1.j0
                cb4.b r3 = r2.getPrimaryButtonData()
                zs1.y r0 = zs1.y.f237132a
                er.a r6 = zs1.x1.C9(r1, r0)
                r7 = 3
                r8 = 0
                r4 = 0
                r5 = 0
                cb4.b r6 = cb4.DialogButtonTextData.b(r3, r4, r5, r6, r7, r8)
                er.a r9 = zs1.x1.C9(r1, r0)
                r10 = 55
                r11 = 0
                r3 = 0
                r7 = 0
                cb4.d r0 = cb4.DialogData.d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13.<init>(r0)
                zs1.x1.D9(r1, r13)
            L9c:
                oq.i0 r13 = oq.i0.f148189a
                return r13
            L9f:
                oq.p r13 = new oq.p
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: zs1.x1.h0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.g0 g0Var, s0.b.Screen screen, tq.e<? super oq.i0> eVar) {
            return x1.this.new h0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzs1/s0$c$a;", "state", "Loq/i0;", "<anonymous>", "(Lzs1/s0$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<s0.c.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237033f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f237035e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ x1 f237036f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ s0.c.Screen f237037g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x1 x1Var, s0.c.Screen screen, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f237036f = x1Var;
                this.f237037g = screen;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f237035e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                vs1.a aVar = this.f237036f.refugeeCardContainersInteractor;
                Document document = this.f237037g.getDocumentStateData().getData().getDocument();
                String documentId = document != null ? document.getDocumentId() : null;
                this.f237035e = 1;
                Object objB = aVar.b(documentId, this);
                return objB == objE ? objE : objB;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f237036f, this.f237037g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        
            if (r12.F(r2, r11) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f237033f
                zs1.s0$c$a r0 = (zs1.s0.c.Screen) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f237032e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L24
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                oq.u.b(r12)
                r8 = r11
                goto L5b
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                oq.u.b(r12)
                r8 = r11
                goto L48
            L24:
                oq.u.b(r12)
                zs1.x1 r12 = zs1.x1.this
                ac4.a r5 = zs1.x1.G9(r12)
                zs1.x1$i$a r7 = new zs1.x1$i$a
                zs1.x1 r12 = zs1.x1.this
                r2 = 0
                r7.<init>(r12, r0, r2)
                java.lang.Object r12 = vq.j.a(r0)
                r11.f237033f = r12
                r11.f237032e = r4
                r6 = 0
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r12 = ac4.a.a(r5, r6, r7, r8, r9, r10)
                if (r12 != r1) goto L48
                goto L5a
            L48:
                zs1.x1 r12 = zs1.x1.this
                zs1.b0$a r2 = zs1.b0.a.f236743a
                java.lang.Object r0 = vq.j.a(r0)
                r8.f237033f = r0
                r8.f237032e = r3
                java.lang.Object r12 = r12.F(r2, r11)
                if (r12 != r1) goto L5b
            L5a:
                return r1
            L5b:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: zs1.x1.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(s0.c.Screen screen, tq.e<? super oq.i0> eVar) {
            return ((i) v(screen, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = x1.this.new i(eVar);
            iVar.f237033f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/x;", "<unused var>", "Lk10/c0;", "Lzs1/s0$b$a;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/x;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.q<zs1.x, k10.c0<s0.b.Dialog>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237039f;

        i0(tq.e<? super i0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.c.Screen O(k10.c0 c0Var, s0.b.Dialog dialog) {
            return new s0.c.Screen(((s0.b.Dialog) c0Var.a()).getDocumentStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f237039f;
            uq.b.e();
            if (this.f237038e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zs1.t2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.i0.O(c0Var, (s0.b.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.x xVar, k10.c0<s0.b.Dialog> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            i0 i0Var = new i0(eVar);
            i0Var.f237039f = c0Var;
            return i0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/k0;", "action", "Lk10/c0;", "Lzs1/s0$d$b;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/k0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ShowError, k10.c0<s0.d.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237041f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237042g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.d.Error V(final k10.c0 c0Var, final x1 x1Var, ShowError showError, s0.d.Screen screen) {
            return new s0.d.Error(((s0.d.Screen) c0Var.a()).getBundleId(), ((s0.d.Screen) c0Var.a()).getSelectedItem(), x1Var.W9(showError.getDomainError(), new er.l() { // from class: zs1.b2
                @Override // er.l
                public final Object b(Object obj) {
                    return x1.j.X(x1Var, c0Var, (ib4.c.b) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(x1 x1Var, k10.c0 c0Var, ib4.c.b bVar) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                x1Var.d9(new LoadDocumentData(((s0.d.Screen) c0Var.a()).getBundleId()));
            } else {
                if (!(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new oq.p();
                }
                x1Var.d9(zs1.r.f236839a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowError showError = (ShowError) this.f237041f;
            final k10.c0 c0Var = (k10.c0) this.f237042g;
            uq.b.e();
            if (this.f237040e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final x1 x1Var = x1.this;
            return c0Var.d(new er.l() { // from class: zs1.a2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.j.V(c0Var, x1Var, showError, (s0.d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowError showError, k10.c0<s0.d.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            j jVar = x1.this.new j(eVar);
            jVar.f237041f = showError;
            jVar.f237042g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/y;", "<unused var>", "Lk10/c0;", "Lzs1/s0$b$a;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/y;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j0 extends vq.k implements er.q<zs1.y, k10.c0<s0.b.Dialog>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237045f;

        j0(tq.e<? super j0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen O(k10.c0 c0Var, s0.b.Dialog dialog) {
            return new s0.b.Screen(((s0.b.Dialog) c0Var.a()).getDocumentStateData(), ((s0.b.Dialog) c0Var.a()).getBottomSheetState());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f237045f;
            uq.b.e();
            if (this.f237044e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zs1.u2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.j0.O(c0Var, (s0.b.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.y yVar, k10.c0<s0.b.Dialog> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            j0 j0Var = new j0(eVar);
            j0Var.f237045f = c0Var;
            return j0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzs1/s0$d$b;", "state", "Loq/i0;", "<anonymous>", "(Lzs1/s0$d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<s0.d.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237047f;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s0.d.Screen screen = (s0.d.Screen) this.f237047f;
            uq.b.e();
            if (this.f237046e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x1.this.d9(new LoadDocumentData(screen.getBundleId()));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(s0.d.Screen screen, tq.e<? super oq.i0> eVar) {
            return ((k) v(screen, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = x1.this.new k(eVar);
            kVar.f237047f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/r;", "<unused var>", "Lk10/c0;", "Lzs1/s0$b$b;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k0 extends vq.k implements er.q<zs1.r, k10.c0<s0.b.Error>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237049e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237050f;

        k0(tq.e<? super k0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen O(k10.c0 c0Var, s0.b.Error error) {
            return new s0.b.Screen(((s0.b.Error) c0Var.a()).getDocumentStateData(), ((s0.b.Error) c0Var.a()).getBottomSheetState());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f237050f;
            uq.b.e();
            if (this.f237049e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zs1.v2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.k0.O(c0Var, (s0.b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.r rVar, k10.c0<s0.b.Error> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            k0 k0Var = new k0(eVar);
            k0Var.f237050f = c0Var;
            return k0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/z;", "action", "Lk10/c0;", "Lzs1/s0$d$b;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/z;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<LoadDocumentData, k10.c0<s0.d.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237052f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237053g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
        
            if (r10.F(r3, r9) == r2) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
        
            if (r10 == r2) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
        
            if (r10 == r2) goto L35;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zs1.x1.l.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(LoadDocumentData loadDocumentData, k10.c0<s0.d.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            l lVar = x1.this.new l(eVar);
            lVar.f237052f = loadDocumentData;
            lVar.f237053g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzs1/s0$e$c;", "state", "Loq/i0;", "<anonymous>", "(Lzs1/s0$e$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l0 extends vq.k implements er.p<s0.e.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237055e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237056f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f237058e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f237059f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f237060g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f237061h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f237062j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f237063k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ x1 f237064l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ s0.e.Screen f237065m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x1 x1Var, s0.e.Screen screen, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f237064l = x1Var;
                this.f237065m = screen;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
            /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x0110, code lost:
            
                if (r1.F(r7, r13) == r0) goto L38;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 290
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: zs1.x1.l0.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f237064l, this.f237065m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        l0(tq.e<? super l0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s0.e.Screen screen = (s0.e.Screen) this.f237056f;
            Object objE = uq.b.e();
            int i15 = this.f237055e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = x1.this.callActionWithLoaderUseCase;
                a aVar2 = new a(x1.this, screen, null);
                this.f237056f = vq.j.a(screen);
                this.f237055e = 1;
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(s0.e.Screen screen, tq.e<? super oq.i0> eVar) {
            return ((l0) v(screen, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            l0 l0Var = x1.this.new l0(eVar);
            l0Var.f237056f = obj;
            return l0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzs1/r;", "<unused var>", "Lzs1/s0$d$b;", "Loq/i0;", "<anonymous>", "(Lzs1/r;Lzs1/s0$d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<zs1.r, s0.d.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237066e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f237066e;
            if (i15 == 0) {
                oq.u.b(obj);
                x1 x1Var = x1.this;
                zs1.b0.a aVar = zs1.b0.a.f236743a;
                this.f237066e = 1;
                if (x1Var.F(aVar, this) == objE) {
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
        public final Object w(zs1.r rVar, s0.d.Screen screen, tq.e<? super oq.i0> eVar) {
            return x1.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/k0;", "action", "Lk10/c0;", "Lzs1/s0$e$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/k0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m0 extends vq.k implements er.q<ShowError, k10.c0<s0.e.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237070g;

        m0(tq.e<? super m0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.e.Error V(final k10.c0 c0Var, final x1 x1Var, ShowError showError, s0.e.Screen screen) {
            return new s0.e.Error(((s0.e.Screen) c0Var.a()).getDocumentStateData(), ((s0.e.Screen) c0Var.a()).getUpdateMethodType(), x1Var.W9(showError.getDomainError(), new er.l() { // from class: zs1.x2
                @Override // er.l
                public final Object b(Object obj) {
                    return x1.m0.X(x1Var, c0Var, (ib4.c.b) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(x1 x1Var, k10.c0 c0Var, ib4.c.b bVar) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                x1Var.d9(new UpdateDocumentClickAction(((s0.e.Screen) c0Var.a()).getUpdateMethodType()));
            } else {
                if (!(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new oq.p();
                }
                x1Var.d9(zs1.r.f236839a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowError showError = (ShowError) this.f237069f;
            final k10.c0 c0Var = (k10.c0) this.f237070g;
            uq.b.e();
            if (this.f237068e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final x1 x1Var = x1.this;
            return c0Var.d(new er.l() { // from class: zs1.w2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.m0.V(c0Var, x1Var, showError, (s0.e.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowError showError, k10.c0<s0.e.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            m0 m0Var = x1.this.new m0(eVar);
            m0Var.f237069f = showError;
            m0Var.f237070g = c0Var;
            return m0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzs1/r;", "<unused var>", "Lzs1/s0$d$a;", "Loq/i0;", "<anonymous>", "(Lzs1/r;Lzs1/s0$d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<zs1.r, s0.d.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237072e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f237072e;
            if (i15 == 0) {
                oq.u.b(obj);
                x1 x1Var = x1.this;
                zs1.b0.a aVar = zs1.b0.a.f236743a;
                this.f237072e = 1;
                if (x1Var.F(aVar, this) == objE) {
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
        public final Object w(zs1.r rVar, s0.d.Error error, tq.e<? super oq.i0> eVar) {
            return x1.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/j0;", "action", "Lk10/c0;", "Lzs1/s0$e$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/j0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n0 extends vq.k implements er.q<ShowDialog, k10.c0<s0.e.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237076g;

        n0(tq.e<? super n0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.e.Dialog O(k10.c0 c0Var, x1 x1Var, ShowDialog showDialog, s0.e.Screen screen) {
            return new s0.e.Dialog(((s0.e.Screen) c0Var.a()).getDocumentStateData(), ((s0.e.Screen) c0Var.a()).getUpdateMethodType(), x1Var.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowDialog showDialog = (ShowDialog) this.f237075f;
            final k10.c0 c0Var = (k10.c0) this.f237076g;
            uq.b.e();
            if (this.f237074e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final x1 x1Var = x1.this;
            return c0Var.d(new er.l() { // from class: zs1.y2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.n0.O(c0Var, x1Var, showDialog, (s0.e.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDialog showDialog, k10.c0<s0.e.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            n0 n0Var = x1.this.new n0(eVar);
            n0Var.f237075f = showDialog;
            n0Var.f237076g = c0Var;
            return n0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/z;", "action", "Lk10/c0;", "Lzs1/s0$d$a;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/z;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<LoadDocumentData, k10.c0<s0.d.Error>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237079f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.d.Screen O(k10.c0 c0Var, s0.d.Error error) {
            return new s0.d.Screen(((s0.d.Error) c0Var.a()).getBundleId(), ((s0.d.Error) c0Var.a()).getSelectedItem());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f237079f;
            uq.b.e();
            if (this.f237078e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zs1.c2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.o.O(c0Var, (s0.d.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(LoadDocumentData loadDocumentData, k10.c0<s0.d.Error> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            o oVar = new o(eVar);
            oVar.f237079f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/l0;", "<unused var>", "Lk10/c0;", "Lzs1/s0$e$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/l0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o0 extends vq.k implements er.q<zs1.l0, k10.c0<s0.e.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237081f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ mx.c f237083h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(mx.c cVar, tq.e<? super o0> eVar) {
            super(3, eVar);
            this.f237083h = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen O(s0.e.Screen screen) {
            return new s0.b.Screen(screen.getDocumentStateData(), zs1.o0.a.f236818a);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f237081f;
            uq.b.e();
            if (this.f237080e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x1.this.y(new p50.a.DefaultWithIcon(this.f237083h.c(ss1.a.f183951a), false, null, null, 14, null));
            return c0Var.d(new er.l() { // from class: zs1.z2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.o0.O((s0.e.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.l0 l0Var, k10.c0<s0.e.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            o0 o0Var = x1.this.new o0(this.f237083h, eVar);
            o0Var.f237081f = c0Var;
            return o0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzs1/s0$a;", "state", "Loq/i0;", "<anonymous>", "(Lzs1/s0$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<s0.ChildrenLoader, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237085f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f237087e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ x1 f237088f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ s0.ChildrenLoader f237089g;

            /* JADX INFO: renamed from: zs1.x1$p$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class C6403a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ x1 f237090a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s0.ChildrenLoader f237091b;

                C6403a(x1 x1Var, s0.ChildrenLoader childrenLoader) {
                    this.f237090a = x1Var;
                    this.f237091b = childrenLoader;
                }

                @Override // mu.h
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object F(List<WorkerInfo> list, tq.e<? super oq.i0> eVar) {
                    T next;
                    lz3.j state;
                    s0.ChildrenLoader childrenLoader = this.f237091b;
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                    } while (!fr.t.c(((WorkerInfo) next).getId().toString(), childrenLoader.getChildrenDownloadTaskId()));
                    WorkerInfo workerInfo = next;
                    if (workerInfo != null && (state = workerInfo.getState()) != null && state.e()) {
                        this.f237090a.d9(zs1.a0.f236736a);
                    }
                    return oq.i0.f148189a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x1 x1Var, s0.ChildrenLoader childrenLoader, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f237088f = x1Var;
                this.f237089g = childrenLoader;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f237087e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    mu.g gVar = (mu.g) this.f237088f.getAsyncDownloadWorkersMonitorUseCase.a(gz.b.a.C1792a.f78542a);
                    C6403a c6403a = new C6403a(this.f237088f, this.f237089g);
                    this.f237087e = 1;
                    if (gVar.a(c6403a, this) == objE) {
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

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f237088f, this.f237089g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s0.ChildrenLoader childrenLoader = (s0.ChildrenLoader) this.f237085f;
            Object objE = uq.b.e();
            int i15 = this.f237084e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = x1.this.callActionWithLoaderUseCase;
                a aVar2 = new a(x1.this, childrenLoader, null);
                this.f237085f = vq.j.a(childrenLoader);
                this.f237084e = 1;
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(s0.ChildrenLoader childrenLoader, tq.e<? super oq.i0> eVar) {
            return ((p) v(childrenLoader, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            p pVar = x1.this.new p(eVar);
            pVar.f237085f = obj;
            return pVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/r;", "<unused var>", "Lk10/c0;", "Lzs1/s0$e$b;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p0 extends vq.k implements er.q<zs1.r, k10.c0<s0.e.Error>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237093f;

        p0(tq.e<? super p0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen O(k10.c0 c0Var, s0.e.Error error) {
            return new s0.b.Screen(((s0.e.Error) c0Var.a()).getDocumentStateData(), zs1.o0.a.f236818a);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f237093f;
            uq.b.e();
            if (this.f237092e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zs1.a3
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.p0.O(c0Var, (s0.e.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.r rVar, k10.c0<s0.e.Error> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            p0 p0Var = new p0(eVar);
            p0Var.f237093f = c0Var;
            return p0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/a0;", "<unused var>", "Lk10/c0;", "Lzs1/s0$a;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/a0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<zs1.a0, k10.c0<s0.ChildrenLoader>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237094e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237095f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen O(List list, s0.ChildrenLoader childrenLoader) {
            return new s0.b.Screen(DocumentStateData.b(childrenLoader.getDocumentStateData(), null, null, null, false, false, null, false, null, null, list, 511, null), zs1.o0.a.f236818a);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List<RefugeeChildrenListEntry> listA;
            k10.c0 c0Var = (k10.c0) this.f237095f;
            Object objE = uq.b.e();
            int i15 = this.f237094e;
            if (i15 == 0) {
                oq.u.b(obj);
                vs1.a aVar = x1.this.refugeeCardContainersInteractor;
                this.f237095f = c0Var;
                this.f237094e = 1;
                obj = aVar.h(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i right = (dx.i) obj;
            if (!(right instanceof dx.i.Left)) {
                if (!(right instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                Map map = (Map) ((dx.i.Right) right).b();
                if (map.isEmpty()) {
                    listA = pq.v.n();
                } else {
                    RefugeeChildrenListEntry.Companion companion = RefugeeChildrenListEntry.INSTANCE;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(oq.y.a(entry.getKey(), ((RefugeeCardData) entry.getValue()).getScope().getData()));
                    }
                    listA = companion.a(pq.v0.s(arrayList));
                }
                right = new dx.i.Right(listA);
            }
            final List listN = (List) right.a();
            if (listN == null) {
                listN = pq.v.n();
            }
            return c0Var.d(new er.l() { // from class: zs1.d2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.q.O(listN, (s0.ChildrenLoader) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.a0 a0Var, k10.c0<s0.ChildrenLoader> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            q qVar = x1.this.new q(eVar);
            qVar.f237095f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/n0;", "action", "Lk10/c0;", "Lzs1/s0$e$b;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/n0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q0 extends vq.k implements er.q<UpdateDocumentClickAction, k10.c0<s0.e.Error>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237098f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237099g;

        q0(tq.e<? super q0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.e.Screen O(UpdateDocumentClickAction updateDocumentClickAction, s0.e.Error error) {
            return new s0.e.Screen(error.getDocumentStateData(), updateDocumentClickAction.getUpdateMethodType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final UpdateDocumentClickAction updateDocumentClickAction = (UpdateDocumentClickAction) this.f237098f;
            k10.c0 c0Var = (k10.c0) this.f237099g;
            uq.b.e();
            if (this.f237097e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zs1.b3
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.q0.O(updateDocumentClickAction, (s0.e.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(UpdateDocumentClickAction updateDocumentClickAction, k10.c0<s0.e.Error> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            q0 q0Var = new q0(eVar);
            q0Var.f237098f = updateDocumentClickAction;
            q0Var.f237099g = c0Var;
            return q0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzs1/h0;", "action", "Lzs1/s0$b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzs1/h0;Lzs1/s0$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<ShortcutMoreClickAction, s0.b.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237101f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShortcutMoreClickAction shortcutMoreClickAction = (ShortcutMoreClickAction) this.f237101f;
            Object objE = uq.b.e();
            int i15 = this.f237100e;
            if (i15 == 0) {
                oq.u.b(obj);
                x1 x1Var = x1.this;
                zs1.b0.ShowShortcutsMore showShortcutsMore = new zs1.b0.ShowShortcutsMore(new SetupData(shortcutMoreClickAction.a()));
                this.f237101f = vq.j.a(shortcutMoreClickAction);
                this.f237100e = 1;
                if (x1Var.F(showShortcutsMore, this) == objE) {
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
        public final Object w(ShortcutMoreClickAction shortcutMoreClickAction, s0.b.Screen screen, tq.e<? super oq.i0> eVar) {
            r rVar = x1.this.new r(eVar);
            rVar.f237101f = shortcutMoreClickAction;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzs1/e0;", "action", "Lzs1/s0$b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzs1/e0;Lzs1/s0$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<OpenUrl, s0.b.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237104f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f237104f;
            Object objE = uq.b.e();
            int i15 = this.f237103e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = x1.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f237104f = vq.j.a(openUrl);
                this.f237103e = 1;
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
            x1 x1Var = x1.this;
            if (iVar instanceof dx.i.Left) {
                x1Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, s0.b.Screen screen, tq.e<? super oq.i0> eVar) {
            s sVar = x1.this.new s(eVar);
            sVar.f237104f = openUrl;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/t;", "action", "Lk10/c0;", "Lzs1/s0$b$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<ChildCardClicked, k10.c0<s0.b.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237107f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237108g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.d.Screen O(ChildCardClicked childCardClicked, s0.b.Screen screen) {
            return new s0.d.Screen(childCardClicked.getBundleId(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChildCardClicked childCardClicked = (ChildCardClicked) this.f237107f;
            k10.c0 c0Var = (k10.c0) this.f237108g;
            uq.b.e();
            if (this.f237106e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: zs1.g2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.t.O(childCardClicked, (s0.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChildCardClicked childCardClicked, k10.c0<s0.b.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            t tVar = new t(eVar);
            tVar.f237107f = childCardClicked;
            tVar.f237108g = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzs1/m0;", "<unused var>", "Lzs1/s0$b$c;", "state", "Loq/i0;", "<anonymous>", "(Lzs1/m0;Lzs1/s0$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<zs1.m0, s0.b.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237109e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f237111e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ x1 f237112f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x1 x1Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f237112f = x1Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f237111e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    xs1.a aVar = this.f237112f.getChildrenPersonalInfoUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f237111e = 1;
                    obj = aVar.a(c1792a, this);
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
                x1 x1Var = this.f237112f;
                if (iVar instanceof dx.i.Left) {
                    x1Var.d9(new ShowError((dx.b) ((dx.i.Left) iVar).b()));
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    x1Var.d9(new OpenChildrenStatementBottomSheet((List) ((dx.i.Right) iVar).b()));
                }
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f237112f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f237109e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = x1.this.callActionWithLoaderUseCase;
                a aVar2 = new a(x1.this, null);
                this.f237109e = 1;
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
        public final Object w(zs1.m0 m0Var, s0.b.Screen screen, tq.e<? super oq.i0> eVar) {
            return x1.this.new u(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/d0;", "<unused var>", "Lk10/c0;", "Lzs1/s0$b$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/d0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<zs1.d0, k10.c0<s0.b.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237114f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen O(s0.b.Screen screen) {
            return s0.b.Screen.d(screen, null, new PeselDisplayed(screen.getDocumentStateData().getData().getScope().getData().getPesel()), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f237114f;
            uq.b.e();
            if (this.f237113e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zs1.h2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.v.O((s0.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.d0 d0Var, k10.c0<s0.b.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            v vVar = new v(eVar);
            vVar.f237114f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/c0;", "action", "Lk10/c0;", "Lzs1/s0$b$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/c0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<OpenChildrenStatementBottomSheet, k10.c0<s0.b.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237117g;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen O(OpenChildrenStatementBottomSheet openChildrenStatementBottomSheet, s0.b.Screen screen) {
            List<RefugeeChildPersonalInfo> listA = openChildrenStatementBottomSheet.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(oq.y.a(Boolean.FALSE, (RefugeeChildPersonalInfo) it.next()));
            }
            return s0.b.Screen.d(screen, null, new ChildrenStatement(arrayList), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OpenChildrenStatementBottomSheet openChildrenStatementBottomSheet = (OpenChildrenStatementBottomSheet) this.f237116f;
            k10.c0 c0Var = (k10.c0) this.f237117g;
            uq.b.e();
            if (this.f237115e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zs1.i2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.w.O(openChildrenStatementBottomSheet, (s0.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenChildrenStatementBottomSheet openChildrenStatementBottomSheet, k10.c0<s0.b.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            w wVar = new w(eVar);
            wVar.f237116f = openChildrenStatementBottomSheet;
            wVar.f237117g = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/u;", "event", "Lk10/c0;", "Lzs1/s0$b$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<ChildStatementCheckedStatusChanged, k10.c0<s0.b.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237119f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237120g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen O(zs1.o0 o0Var, ChildStatementCheckedStatusChanged childStatementCheckedStatusChanged, s0.b.Screen screen) {
            ChildrenStatement childrenStatement = (ChildrenStatement) o0Var;
            List<oq.r<Boolean, RefugeeChildPersonalInfo>> listB = childrenStatement.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            for (oq.r<Boolean, RefugeeChildPersonalInfo> rVarA : listB) {
                if (fr.t.c(rVarA.d(), childStatementCheckedStatusChanged.getChild())) {
                    rVarA = oq.y.a(Boolean.valueOf(childStatementCheckedStatusChanged.getIsChecked()), childStatementCheckedStatusChanged.getChild());
                }
                arrayList.add(rVarA);
            }
            return s0.b.Screen.d(screen, null, childrenStatement.a(arrayList), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChildStatementCheckedStatusChanged childStatementCheckedStatusChanged = (ChildStatementCheckedStatusChanged) this.f237119f;
            k10.c0 c0Var = (k10.c0) this.f237120g;
            uq.b.e();
            if (this.f237118e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final zs1.o0 bottomSheetState = ((s0.b.Screen) c0Var.a()).getBottomSheetState();
            if (fr.t.c(bottomSheetState, zs1.o0.a.f236818a) || (bottomSheetState instanceof PeselDisplayed)) {
                return c0Var.c();
            }
            if (bottomSheetState instanceof ChildrenStatement) {
                return c0Var.b(new er.l() { // from class: zs1.j2
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x1.x.O(bottomSheetState, childStatementCheckedStatusChanged, (s0.b.Screen) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChildStatementCheckedStatusChanged childStatementCheckedStatusChanged, k10.c0<s0.b.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            x xVar = new x(eVar);
            xVar.f237119f = childStatementCheckedStatusChanged;
            xVar.f237120g = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/w;", "<unused var>", "Lk10/c0;", "Lzs1/s0$b$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/w;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<zs1.w, k10.c0<s0.b.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f237121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f237122f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f237123g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f237124h;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Screen V(s0.b.Screen screen) {
            return s0.b.Screen.d(screen, null, zs1.o0.a.f236818a, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.ChildrenLoader X(String str, s0.b.Screen screen) {
            return new s0.ChildrenLoader(str, screen.getDocumentStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f237124h;
            Object objE = uq.b.e();
            int i15 = this.f237123g;
            if (i15 == 0) {
                oq.u.b(obj);
                zs1.o0 bottomSheetState = ((s0.b.Screen) c0Var.a()).getBottomSheetState();
                if (fr.t.c(bottomSheetState, zs1.o0.a.f236818a) || (bottomSheetState instanceof PeselDisplayed)) {
                    return c0Var.c();
                }
                if (!(bottomSheetState instanceof ChildrenStatement)) {
                    throw new oq.p();
                }
                List<oq.r<Boolean, RefugeeChildPersonalInfo>> listB = ((ChildrenStatement) bottomSheetState).b();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listB) {
                    if (((Boolean) ((oq.r) obj2).c()).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((RefugeeChildPersonalInfo) ((oq.r) it.next()).d()).getPesel());
                }
                Set setK1 = pq.v.k1(arrayList2);
                mz3.b bVar = x1.this.asyncGenerateDiiaChildrenDataUC;
                mz3.b.Params params = new mz3.b.Params(setK1);
                this.f237124h = c0Var;
                this.f237121e = vq.j.a(bottomSheetState);
                this.f237122f = vq.j.a(setK1);
                this.f237123g = 1;
                obj = bVar.c(params, this);
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
            x1 x1Var = x1.this;
            if (iVar instanceof dx.i.Left) {
                x1Var.d9(new ShowError((dx.b) ((dx.i.Left) iVar).b()));
                return c0Var.b(new er.l() { // from class: zs1.k2
                    @Override // er.l
                    public final Object b(Object obj3) {
                        return x1.y.V((s0.b.Screen) obj3);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final String str = (String) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: zs1.l2
                @Override // er.l
                public final Object b(Object obj3) {
                    return x1.y.X(str, (s0.b.Screen) obj3);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(zs1.w wVar, k10.c0<s0.b.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            y yVar = x1.this.new y(eVar);
            yVar.f237124h = c0Var;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzs1/k0;", "action", "Lk10/c0;", "Lzs1/s0$b$c;", "state", "Lk10/l;", "Lzs1/s0;", "<anonymous>", "(Lzs1/k0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<ShowError, k10.c0<s0.b.Screen>, tq.e<? super k10.l<? extends s0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237126e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237127f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237128g;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s0.b.Error V(k10.c0 c0Var, final x1 x1Var, ShowError showError, s0.b.Screen screen) {
            return new s0.b.Error(((s0.b.Screen) c0Var.a()).getDocumentStateData(), ((s0.b.Screen) c0Var.a()).getBottomSheetState(), x1Var.W9(showError.getDomainError(), new er.l() { // from class: zs1.f2
                @Override // er.l
                public final Object b(Object obj) {
                    return x1.z.X(x1Var, (ib4.c.b) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(x1 x1Var, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b) && !(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                throw new oq.p();
            }
            x1Var.d9(zs1.r.f236839a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowError showError = (ShowError) this.f237127f;
            final k10.c0 c0Var = (k10.c0) this.f237128g;
            uq.b.e();
            if (this.f237126e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final x1 x1Var = x1.this;
            return c0Var.d(new er.l() { // from class: zs1.e2
                @Override // er.l
                public final Object b(Object obj2) {
                    return x1.z.V(c0Var, x1Var, showError, (s0.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowError showError, k10.c0<s0.b.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) {
            z zVar = x1.this.new z(eVar);
            zVar.f237127f = showError;
            zVar.f237128g = c0Var;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public x1(n20.j jVar, at1.h hVar, ib4.c cVar, a14.w wVar, i70.n nVar, ac4.a aVar, xs1.b bVar, h64.r rVar, mz3.z zVar, mz3.w wVar2, h64.q qVar, mz3.b bVar2, xs1.a aVar2, mz3.n nVar2, hb4.d dVar, cb4.j jVar2, vs1.a aVar3, o20.t2.a aVar4, final mx.c cVar2) {
        this.refugeeDocumentMapper = hVar;
        this.genericDomainErrorMapper = cVar;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.callActionWithLoaderUseCase = aVar;
        this.isDiiaPlPeselZoomFeatureFlagActiveUC = bVar;
        this.loadServicesUseCase = rVar;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar2;
        this.loadRemoteSettingsUseCase = qVar;
        this.asyncGenerateDiiaChildrenDataUC = bVar2;
        this.getChildrenPersonalInfoUC = aVar2;
        this.getAsyncDownloadWorkersMonitorUseCase = nVar2;
        this.errorVMSFactory = dVar;
        this.dialogVMSFactory = jVar2;
        this.refugeeCardContainersInteractor = aVar3;
        this.deps = aVar4;
        s0.f fVar = s0.f.f236883a;
        this.initialState = fVar;
        this.navAction = new xw.b<>();
        this.stateMachine = jVar.a(fVar, new er.l() { // from class: zs1.c1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.ia(this.f236754a, cVar2, (k10.v) obj);
            }
        });
        this.state = a9(new e(e9().getState(), this), Z9(new State<>(fVar, null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x0156  */
    /* JADX WARN: Code duplicated, block: B:47:0x016f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0192  */
    /* JADX WARN: Code duplicated, block: B:54:0x019a  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object S9(LoadDocumentData loadDocumentData, k10.c0<s0.d.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) throws Throwable {
        b bVar;
        LoadDocumentData loadDocumentData2;
        k10.c0<s0.d.Screen> c0Var2;
        int i15;
        LoadDocumentData loadDocumentData3;
        RefugeeCardData refugeeCardData;
        int i16;
        k10.c0<s0.d.Screen> c0Var3;
        Map map;
        dx.i iVar;
        dx.i iVar2;
        ws1.b bVar2;
        Object objV9;
        ws1.b bVar3;
        k10.c0<s0.d.Screen> c0Var4;
        Boolean boolA;
        final k10.c0<s0.d.Screen> c0Var5;
        final ws1.b bVar4;
        final RefugeeCardData refugeeCardData2;
        final Boolean bool;
        final LoadDocumentData loadDocumentData4;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i17 = bVar.f236973q;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f236973q = i17 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objH = bVar.f236971n;
        Object objE = uq.b.e();
        int i18 = bVar.f236973q;
        if (i18 == 0) {
            oq.u.b(objH);
            vs1.a aVar = this.refugeeCardContainersInteractor;
            loadDocumentData2 = loadDocumentData;
            bVar.f236962d = loadDocumentData2;
            c0Var2 = c0Var;
            bVar.f236963e = c0Var2;
            bVar.f236973q = 1;
            objH = aVar.h(bVar);
            if (objH != objE) {
            }
            return objE;
        }
        if (i18 == 1) {
            k10.c0<s0.d.Screen> c0Var6 = (k10.c0) bVar.f236963e;
            LoadDocumentData loadDocumentData5 = (LoadDocumentData) bVar.f236962d;
            oq.u.b(objH);
            c0Var2 = c0Var6;
            loadDocumentData2 = loadDocumentData5;
        } else {
            if (i18 == 2) {
                i16 = bVar.f236970m;
                int i19 = bVar.f236969l;
                refugeeCardData = (RefugeeCardData) bVar.f236966h;
                map = (Map) bVar.f236965g;
                iVar = (dx.i) bVar.f236964f;
                c0Var3 = (k10.c0) bVar.f236963e;
                loadDocumentData3 = (LoadDocumentData) bVar.f236962d;
                oq.u.b(objH);
                i15 = i19;
                iVar2 = (dx.i) objH;
                if (iVar2 instanceof dx.i.Left) {
                    d9(new ShowError((dx.b) ((dx.i.Left) iVar2).b()));
                }
                bVar2 = (ws1.b) iVar2.a();
                if (bVar2 == null) {
                    bVar2 = ws1.b.ACTIVE;
                }
                bVar.f236962d = loadDocumentData3;
                bVar.f236963e = c0Var3;
                bVar.f236964f = vq.j.a(iVar);
                bVar.f236965g = vq.j.a(map);
                bVar.f236966h = refugeeCardData;
                bVar.f236967j = bVar2;
                bVar.f236969l = i15;
                bVar.f236970m = i16;
                bVar.f236973q = 3;
                objV9 = V9(bVar);
                if (objV9 != objE) {
                    bVar3 = bVar2;
                    objH = objV9;
                    c0Var4 = c0Var3;
                    List list = (List) objH;
                    if (list != null) {
                    }
                    vs1.a aVar2 = this.refugeeCardContainersInteractor;
                    bVar.f236962d = loadDocumentData3;
                    bVar.f236963e = c0Var4;
                    bVar.f236964f = vq.j.a(iVar);
                    bVar.f236965g = vq.j.a(map);
                    bVar.f236966h = refugeeCardData;
                    bVar.f236967j = boolA;
                    bVar.f236968k = bVar3;
                    bVar.f236969l = i15;
                    bVar.f236970m = i16;
                    bVar.f236973q = 4;
                    objH = aVar2.g(bVar);
                    if (objH != objE) {
                        c0Var5 = c0Var4;
                        bVar4 = bVar3;
                        refugeeCardData2 = refugeeCardData;
                        bool = boolA;
                        loadDocumentData4 = loadDocumentData3;
                    }
                }
                return objE;
            }
            if (i18 == 3) {
                i16 = bVar.f236970m;
                int i25 = bVar.f236969l;
                bVar3 = (ws1.b) bVar.f236967j;
                refugeeCardData = (RefugeeCardData) bVar.f236966h;
                map = (Map) bVar.f236965g;
                iVar = (dx.i) bVar.f236964f;
                c0Var3 = (k10.c0) bVar.f236963e;
                loadDocumentData3 = (LoadDocumentData) bVar.f236962d;
                oq.u.b(objH);
                i15 = i25;
                c0Var4 = c0Var3;
                List list2 = (List) objH;
                boolA = list2 != null ? vq.b.a(list2.contains(rq0.c.PESEL_RESTRICTION)) : null;
                vs1.a aVar3 = this.refugeeCardContainersInteractor;
                bVar.f236962d = loadDocumentData3;
                bVar.f236963e = c0Var4;
                bVar.f236964f = vq.j.a(iVar);
                bVar.f236965g = vq.j.a(map);
                bVar.f236966h = refugeeCardData;
                bVar.f236967j = boolA;
                bVar.f236968k = bVar3;
                bVar.f236969l = i15;
                bVar.f236970m = i16;
                bVar.f236973q = 4;
                objH = aVar3.g(bVar);
                if (objH != objE) {
                    c0Var5 = c0Var4;
                    bVar4 = bVar3;
                    refugeeCardData2 = refugeeCardData;
                    bool = boolA;
                    loadDocumentData4 = loadDocumentData3;
                }
                return objE;
            }
            if (i18 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ws1.b bVar5 = (ws1.b) bVar.f236968k;
            bool = (Boolean) bVar.f236967j;
            RefugeeCardData refugeeCardData3 = (RefugeeCardData) bVar.f236966h;
            k10.c0<s0.d.Screen> c0Var7 = (k10.c0) bVar.f236963e;
            LoadDocumentData loadDocumentData6 = (LoadDocumentData) bVar.f236962d;
            oq.u.b(objH);
            loadDocumentData4 = loadDocumentData6;
            refugeeCardData2 = refugeeCardData3;
            bVar4 = bVar5;
            c0Var5 = c0Var7;
        }
        final String str = (String) ((dx.i) objH).a();
        return c0Var5.d(new er.l() { // from class: zs1.m1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.T9(refugeeCardData2, c0Var5, this, bool, loadDocumentData4, bVar4, str, (s0.d.Screen) obj);
            }
        });
        dx.i iVar3 = (dx.i) objH;
        if (iVar3 instanceof dx.i.Left) {
            d9(new ShowError(new dx.b.Generic(null, 1, null)));
            return c0Var2.c();
        }
        if (!(iVar3 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        Map map2 = (Map) ((dx.i.Right) iVar3).b();
        RefugeeCardData refugeeCardData4 = (RefugeeCardData) map2.getOrDefault(loadDocumentData2.getBundleId(), null);
        if (refugeeCardData4 == null) {
            d9(new ShowError(new dx.b.Generic(null, 1, null)));
            return c0Var2.c();
        }
        vs1.a aVar4 = this.refugeeCardContainersInteractor;
        Document document = refugeeCardData4.getDocument();
        String documentId = document != null ? document.getDocumentId() : null;
        bVar.f236962d = loadDocumentData2;
        bVar.f236963e = c0Var2;
        bVar.f236964f = vq.j.a(iVar3);
        bVar.f236965g = vq.j.a(map2);
        bVar.f236966h = refugeeCardData4;
        i15 = 0;
        bVar.f236969l = 0;
        bVar.f236970m = 0;
        bVar.f236973q = 2;
        Object objI = aVar4.i(documentId, bVar);
        if (objI != objE) {
            loadDocumentData3 = loadDocumentData2;
            refugeeCardData = refugeeCardData4;
            i16 = 0;
            c0Var3 = c0Var2;
            map = map2;
            iVar = iVar3;
            objH = objI;
            iVar2 = (dx.i) objH;
            if (iVar2 instanceof dx.i.Left) {
                d9(new ShowError((dx.b) ((dx.i.Left) iVar2).b()));
            }
            bVar2 = (ws1.b) iVar2.a();
            if (bVar2 == null) {
                bVar2 = ws1.b.ACTIVE;
            }
            bVar.f236962d = loadDocumentData3;
            bVar.f236963e = c0Var3;
            bVar.f236964f = vq.j.a(iVar);
            bVar.f236965g = vq.j.a(map);
            bVar.f236966h = refugeeCardData;
            bVar.f236967j = bVar2;
            bVar.f236969l = i15;
            bVar.f236970m = i16;
            bVar.f236973q = 3;
            objV9 = V9(bVar);
            if (objV9 != objE) {
                bVar3 = bVar2;
                objH = objV9;
                c0Var4 = c0Var3;
                List list3 = (List) objH;
                if (list3 != null) {
                }
                vs1.a aVar5 = this.refugeeCardContainersInteractor;
                bVar.f236962d = loadDocumentData3;
                bVar.f236963e = c0Var4;
                bVar.f236964f = vq.j.a(iVar);
                bVar.f236965g = vq.j.a(map);
                bVar.f236966h = refugeeCardData;
                bVar.f236967j = boolA;
                bVar.f236968k = bVar3;
                bVar.f236969l = i15;
                bVar.f236970m = i16;
                bVar.f236973q = 4;
                objH = aVar5.g(bVar);
                if (objH != objE) {
                    c0Var5 = c0Var4;
                    bVar4 = bVar3;
                    refugeeCardData2 = refugeeCardData;
                    bool = boolA;
                    loadDocumentData4 = loadDocumentData3;
                    final String str2 = (String) ((dx.i) objH).a();
                    return c0Var5.d(new er.l() { // from class: zs1.m1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return x1.T9(refugeeCardData2, c0Var5, this, bool, loadDocumentData4, bVar4, str2, (s0.d.Screen) obj);
                        }
                    });
                }
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s0.b.Screen T9(RefugeeCardData refugeeCardData, k10.c0 c0Var, x1 x1Var, Boolean bool, LoadDocumentData loadDocumentData, ws1.b bVar, String str, s0.d.Screen screen) {
        return new s0.b.Screen(new DocumentStateData(((s0.d.Screen) c0Var.a()).getSelectedItem(), refugeeCardData, bVar, false, x1Var.isDiiaPlPeselZoomFeatureFlagActiveUC.b(gz.b.a.C1792a.f78542a).booleanValue(), new o20.t2(x1Var.deps, androidx.p016lifecycle.u0.a(x1Var)), bool != null ? bool.booleanValue() : false, str, loadDocumentData.getBundleId(), pq.v.n()), zs1.o0.a.f236818a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba A[LOOP:1: B:38:0x00b4->B:40:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r7 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V9(tq.e<? super java.util.List<? extends rq0.c>> r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zs1.x1.V9(tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c W9(dx.b bVar, er.l<? super ib4.c.b, oq.i0> lVar) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, lVar, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:33:0x0112  */
    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Code duplicated, block: B:38:0x013d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0150  */
    /* JADX WARN: Code duplicated, block: B:42:0x015b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0164  */
    /* JADX WARN: Code duplicated, block: B:49:0x018b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0196  */
    /* JADX WARN: Code duplicated, block: B:55:0x01af  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:71:0x0216 A[LOOP:0: B:69:0x0210->B:71:0x0216, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x024c  */
    /* JADX WARN: Code duplicated, block: B:79:0x025b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0261  */
    public final Object X9(k10.c0<s0.d.Screen> c0Var, tq.e<? super k10.l<? extends s0>> eVar) throws Throwable {
        d dVar;
        k10.c0<s0.d.Screen> c0Var2;
        Object objV9;
        k10.c0<s0.d.Screen> c0Var3;
        List list;
        int i15;
        dx.i iVar;
        RefugeeCardData refugeeCardData;
        Object objG;
        List list2;
        RefugeeCardData refugeeCardData2;
        k10.c0<s0.d.Screen> c0Var4;
        dx.i iVar2;
        int i16;
        int i17;
        String str;
        Boolean boolA;
        Object objK;
        String str2;
        k10.c0<s0.d.Screen> c0Var5;
        int i18;
        dx.i iVar3;
        ws1.b bVar;
        Object objH;
        final String str3;
        final RefugeeCardData refugeeCardData3;
        final Boolean bool;
        final ws1.b bVar2;
        final k10.c0<s0.d.Screen> c0Var6;
        dx.i right;
        List listN;
        Map map;
        ArrayList arrayList;
        List<RefugeeChildrenListEntry> listA;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i19 = dVar.f236997r;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f236997r = i19 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f236995p;
        Object objE = uq.b.e();
        int i25 = dVar.f236997r;
        int i26 = 0;
        if (i25 == 0) {
            oq.u.b(obj);
            c0Var2 = c0Var;
            dVar.f236985d = c0Var2;
            dVar.f236997r = 1;
            objV9 = V9(dVar);
            if (objV9 != objE) {
            }
            return objE;
        }
        if (i25 == 1) {
            k10.c0<s0.d.Screen> c0Var7 = (k10.c0) dVar.f236985d;
            oq.u.b(obj);
            objV9 = obj;
            c0Var2 = c0Var7;
        } else {
            if (i25 == 2) {
                i15 = dVar.f236992l;
                list = (List) dVar.f236986e;
                k10.c0<s0.d.Screen> c0Var8 = (k10.c0) dVar.f236985d;
                oq.u.b(obj);
                c0Var3 = c0Var8;
                iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    d9(new ShowError((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var3.c();
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                refugeeCardData = (RefugeeCardData) ((dx.i.Right) iVar).b();
                vs1.a aVar = this.refugeeCardContainersInteractor;
                dVar.f236985d = c0Var3;
                dVar.f236986e = list;
                dVar.f236987f = vq.j.a(iVar);
                dVar.f236988g = refugeeCardData;
                dVar.f236992l = i15;
                dVar.f236993m = 0;
                dVar.f236994n = 0;
                dVar.f236997r = 3;
                objG = aVar.g(dVar);
                if (objG != objE) {
                    k10.c0<s0.d.Screen> c0Var9 = c0Var3;
                    list2 = list;
                    refugeeCardData2 = refugeeCardData;
                    c0Var4 = c0Var9;
                    iVar2 = iVar;
                    obj = objG;
                    i16 = i15;
                    i17 = 0;
                    str = (String) ((dx.i) obj).a();
                    if (list2 != null) {
                        boolA = vq.b.a(list2.contains(rq0.c.PESEL_RESTRICTION));
                    } else {
                        boolA = null;
                    }
                    vs1.a aVar2 = this.refugeeCardContainersInteractor;
                    Document document = refugeeCardData2.getDocument();
                    if (document != null) {
                    }
                    dVar.f236985d = c0Var4;
                    dVar.f236986e = vq.j.a(list2);
                    dVar.f236987f = vq.j.a(iVar2);
                    dVar.f236988g = refugeeCardData2;
                    dVar.f236989h = str;
                    dVar.f236990j = boolA;
                    dVar.f236992l = i16;
                    dVar.f236993m = i26;
                    dVar.f236994n = i17;
                    dVar.f236997r = 4;
                    objK = aVar2.k(documentId, dVar);
                    if (objK != objE) {
                        str2 = str;
                        obj = objK;
                        c0Var5 = c0Var4;
                        i18 = i26;
                        iVar3 = (dx.i) obj;
                        if (iVar3 instanceof dx.i.Left) {
                            d9(new ShowError((dx.b) ((dx.i.Left) iVar3).b()));
                        }
                        bVar = (ws1.b) iVar3.a();
                        if (bVar == null) {
                            bVar = ws1.b.ACTIVE;
                        }
                        vs1.a aVar3 = this.refugeeCardContainersInteractor;
                        dVar.f236985d = c0Var5;
                        dVar.f236986e = vq.j.a(list2);
                        dVar.f236987f = vq.j.a(iVar2);
                        dVar.f236988g = refugeeCardData2;
                        dVar.f236989h = str2;
                        dVar.f236990j = boolA;
                        dVar.f236991k = bVar;
                        dVar.f236992l = i16;
                        dVar.f236993m = i18;
                        dVar.f236994n = i17;
                        dVar.f236997r = 5;
                        objH = aVar3.h(dVar);
                        if (objH != objE) {
                            str3 = str2;
                            refugeeCardData3 = refugeeCardData2;
                            bool = boolA;
                            bVar2 = bVar;
                            obj = objH;
                            c0Var6 = c0Var5;
                        }
                    }
                }
                return objE;
            }
            if (i25 == 3) {
                int i27 = dVar.f236994n;
                int i28 = dVar.f236993m;
                i16 = dVar.f236992l;
                refugeeCardData2 = (RefugeeCardData) dVar.f236988g;
                dx.i iVar4 = (dx.i) dVar.f236987f;
                List list3 = (List) dVar.f236986e;
                k10.c0<s0.d.Screen> c0Var10 = (k10.c0) dVar.f236985d;
                oq.u.b(obj);
                i26 = i28;
                i17 = i27;
                iVar2 = iVar4;
                c0Var4 = c0Var10;
                list2 = list3;
                str = (String) ((dx.i) obj).a();
                if (list2 != null) {
                    boolA = vq.b.a(list2.contains(rq0.c.PESEL_RESTRICTION));
                } else {
                    boolA = null;
                }
                vs1.a aVar4 = this.refugeeCardContainersInteractor;
                Document document2 = refugeeCardData2.getDocument();
                String documentId = document2 != null ? document2.getDocumentId() : null;
                dVar.f236985d = c0Var4;
                dVar.f236986e = vq.j.a(list2);
                dVar.f236987f = vq.j.a(iVar2);
                dVar.f236988g = refugeeCardData2;
                dVar.f236989h = str;
                dVar.f236990j = boolA;
                dVar.f236992l = i16;
                dVar.f236993m = i26;
                dVar.f236994n = i17;
                dVar.f236997r = 4;
                objK = aVar4.k(documentId, dVar);
                if (objK != objE) {
                    str2 = str;
                    obj = objK;
                    c0Var5 = c0Var4;
                    i18 = i26;
                    iVar3 = (dx.i) obj;
                    if (iVar3 instanceof dx.i.Left) {
                        d9(new ShowError((dx.b) ((dx.i.Left) iVar3).b()));
                    }
                    bVar = (ws1.b) iVar3.a();
                    if (bVar == null) {
                        bVar = ws1.b.ACTIVE;
                    }
                    vs1.a aVar5 = this.refugeeCardContainersInteractor;
                    dVar.f236985d = c0Var5;
                    dVar.f236986e = vq.j.a(list2);
                    dVar.f236987f = vq.j.a(iVar2);
                    dVar.f236988g = refugeeCardData2;
                    dVar.f236989h = str2;
                    dVar.f236990j = boolA;
                    dVar.f236991k = bVar;
                    dVar.f236992l = i16;
                    dVar.f236993m = i18;
                    dVar.f236994n = i17;
                    dVar.f236997r = 5;
                    objH = aVar5.h(dVar);
                    if (objH != objE) {
                        str3 = str2;
                        refugeeCardData3 = refugeeCardData2;
                        bool = boolA;
                        bVar2 = bVar;
                        obj = objH;
                        c0Var6 = c0Var5;
                    }
                }
                return objE;
            }
            if (i25 == 4) {
                i17 = dVar.f236994n;
                i18 = dVar.f236993m;
                i16 = dVar.f236992l;
                Boolean bool2 = (Boolean) dVar.f236990j;
                String str4 = (String) dVar.f236989h;
                RefugeeCardData refugeeCardData4 = (RefugeeCardData) dVar.f236988g;
                iVar2 = (dx.i) dVar.f236987f;
                list2 = (List) dVar.f236986e;
                c0Var5 = (k10.c0) dVar.f236985d;
                oq.u.b(obj);
                boolA = bool2;
                str2 = str4;
                refugeeCardData2 = refugeeCardData4;
                iVar3 = (dx.i) obj;
                if (iVar3 instanceof dx.i.Left) {
                    d9(new ShowError((dx.b) ((dx.i.Left) iVar3).b()));
                }
                bVar = (ws1.b) iVar3.a();
                if (bVar == null) {
                    bVar = ws1.b.ACTIVE;
                }
                vs1.a aVar6 = this.refugeeCardContainersInteractor;
                dVar.f236985d = c0Var5;
                dVar.f236986e = vq.j.a(list2);
                dVar.f236987f = vq.j.a(iVar2);
                dVar.f236988g = refugeeCardData2;
                dVar.f236989h = str2;
                dVar.f236990j = boolA;
                dVar.f236991k = bVar;
                dVar.f236992l = i16;
                dVar.f236993m = i18;
                dVar.f236994n = i17;
                dVar.f236997r = 5;
                objH = aVar6.h(dVar);
                if (objH != objE) {
                    str3 = str2;
                    refugeeCardData3 = refugeeCardData2;
                    bool = boolA;
                    bVar2 = bVar;
                    obj = objH;
                    c0Var6 = c0Var5;
                }
                return objE;
            }
            if (i25 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ws1.b bVar3 = (ws1.b) dVar.f236991k;
            Boolean bool3 = (Boolean) dVar.f236990j;
            String str5 = (String) dVar.f236989h;
            RefugeeCardData refugeeCardData5 = (RefugeeCardData) dVar.f236988g;
            c0Var6 = (k10.c0) dVar.f236985d;
            oq.u.b(obj);
            bVar2 = bVar3;
            bool = bool3;
            refugeeCardData3 = refugeeCardData5;
            str3 = str5;
        }
        right = (dx.i) obj;
        if (!(right instanceof dx.i.Left)) {
            if (right instanceof dx.i.Right) {
                throw new oq.p();
            }
            map = (Map) ((dx.i.Right) right).b();
            if (map.isEmpty()) {
                listA = pq.v.n();
            } else {
                RefugeeChildrenListEntry.Companion companion = RefugeeChildrenListEntry.INSTANCE;
                arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(oq.y.a(entry.getKey(), ((RefugeeCardData) entry.getValue()).getScope().getData()));
                }
                listA = companion.a(pq.v0.s(arrayList));
            }
            right = new dx.i.Right(listA);
        }
        listN = (List) right.a();
        if (listN == null) {
            listN = pq.v.n();
        }
        final List list4 = listN;
        return c0Var6.d(new er.l() { // from class: zs1.o1
            @Override // er.l
            public final Object b(Object obj2) {
                return x1.Y9(c0Var6, this, bool, refugeeCardData3, bVar2, str3, list4, (s0.d.Screen) obj2);
            }
        });
        List list5 = (List) objV9;
        vs1.a aVar7 = this.refugeeCardContainersInteractor;
        dVar.f236985d = c0Var2;
        dVar.f236986e = list5;
        dVar.f236992l = 0;
        dVar.f236997r = 2;
        Object objJ = aVar7.j(dVar);
        if (objJ != objE) {
            c0Var3 = c0Var2;
            obj = objJ;
            list = list5;
            i15 = 0;
            iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                d9(new ShowError((dx.b) ((dx.i.Left) iVar).b()));
                return c0Var3.c();
            }
            if (iVar instanceof dx.i.Right) {
                throw new oq.p();
            }
            refugeeCardData = (RefugeeCardData) ((dx.i.Right) iVar).b();
            vs1.a aVar8 = this.refugeeCardContainersInteractor;
            dVar.f236985d = c0Var3;
            dVar.f236986e = list;
            dVar.f236987f = vq.j.a(iVar);
            dVar.f236988g = refugeeCardData;
            dVar.f236992l = i15;
            dVar.f236993m = 0;
            dVar.f236994n = 0;
            dVar.f236997r = 3;
            objG = aVar8.g(dVar);
            if (objG != objE) {
                k10.c0<s0.d.Screen> c0Var11 = c0Var3;
                list2 = list;
                refugeeCardData2 = refugeeCardData;
                c0Var4 = c0Var11;
                iVar2 = iVar;
                obj = objG;
                i16 = i15;
                i17 = 0;
                str = (String) ((dx.i) obj).a();
                if (list2 != null) {
                    boolA = vq.b.a(list2.contains(rq0.c.PESEL_RESTRICTION));
                } else {
                    boolA = null;
                }
                vs1.a aVar9 = this.refugeeCardContainersInteractor;
                Document document3 = refugeeCardData2.getDocument();
                if (document3 != null) {
                }
                dVar.f236985d = c0Var4;
                dVar.f236986e = vq.j.a(list2);
                dVar.f236987f = vq.j.a(iVar2);
                dVar.f236988g = refugeeCardData2;
                dVar.f236989h = str;
                dVar.f236990j = boolA;
                dVar.f236992l = i16;
                dVar.f236993m = i26;
                dVar.f236994n = i17;
                dVar.f236997r = 4;
                objK = aVar9.k(documentId, dVar);
                if (objK != objE) {
                    str2 = str;
                    obj = objK;
                    c0Var5 = c0Var4;
                    i18 = i26;
                    iVar3 = (dx.i) obj;
                    if (iVar3 instanceof dx.i.Left) {
                        d9(new ShowError((dx.b) ((dx.i.Left) iVar3).b()));
                    }
                    bVar = (ws1.b) iVar3.a();
                    if (bVar == null) {
                        bVar = ws1.b.ACTIVE;
                    }
                    vs1.a aVar10 = this.refugeeCardContainersInteractor;
                    dVar.f236985d = c0Var5;
                    dVar.f236986e = vq.j.a(list2);
                    dVar.f236987f = vq.j.a(iVar2);
                    dVar.f236988g = refugeeCardData2;
                    dVar.f236989h = str2;
                    dVar.f236990j = boolA;
                    dVar.f236991k = bVar;
                    dVar.f236992l = i16;
                    dVar.f236993m = i18;
                    dVar.f236994n = i17;
                    dVar.f236997r = 5;
                    objH = aVar10.h(dVar);
                    if (objH != objE) {
                        str3 = str2;
                        refugeeCardData3 = refugeeCardData2;
                        bool = boolA;
                        bVar2 = bVar;
                        obj = objH;
                        c0Var6 = c0Var5;
                        right = (dx.i) obj;
                        if (!(right instanceof dx.i.Left)) {
                            if (right instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            map = (Map) ((dx.i.Right) right).b();
                            if (map.isEmpty()) {
                                listA = pq.v.n();
                            } else {
                                RefugeeChildrenListEntry.Companion companion2 = RefugeeChildrenListEntry.INSTANCE;
                                arrayList = new ArrayList(map.size());
                                while (r0.hasNext()) {
                                    arrayList.add(oq.y.a(entry.getKey(), ((RefugeeCardData) entry.getValue()).getScope().getData()));
                                }
                                listA = companion2.a(pq.v0.s(arrayList));
                            }
                            right = new dx.i.Right(listA);
                        }
                        listN = (List) right.a();
                        if (listN == null) {
                            listN = pq.v.n();
                        }
                        final List list6 = listN;
                        return c0Var6.d(new er.l() { // from class: zs1.o1
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return x1.Y9(c0Var6, this, bool, refugeeCardData3, bVar2, str3, list6, (s0.d.Screen) obj2);
                            }
                        });
                    }
                }
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s0.b.Screen Y9(k10.c0 c0Var, x1 x1Var, Boolean bool, RefugeeCardData refugeeCardData, ws1.b bVar, String str, List list, s0.d.Screen screen) {
        return new s0.b.Screen(new DocumentStateData(((s0.d.Screen) c0Var.a()).getSelectedItem(), refugeeCardData, bVar, true, x1Var.isDiiaPlPeselZoomFeatureFlagActiveUC.b(gz.b.a.C1792a.f78542a).booleanValue(), new o20.t2(x1Var.deps, androidx.p016lifecycle.u0.a(x1Var)), bool != null ? bool.booleanValue() : false, str, null, list), zs1.o0.a.f236818a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t0.a Z9(State<s0> state) {
        at1.h hVar = this.refugeeDocumentMapper;
        s0 s0VarD = state.d();
        y20.b animationsState = state.getAnimationsState();
        er.a<oq.i0> aVarB9 = b9(zs1.f0.f236773a);
        er.a<oq.i0> aVarB10 = b9(zs1.g0.f236778a);
        er.a<oq.i0> aVarB11 = b9(zs1.i0.f236784a);
        er.a<oq.i0> aVarB12 = b9(zs1.d0.f236759a);
        return hVar.b(new at1.h.Params(s0VarD, animationsState, new at1.h.Params.ActionHandler(b9(zs1.r.f236839a), aVarB9, new er.l() { // from class: zs1.n1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.aa(this.f236813a, (String) obj);
            }
        }, aVarB10, new er.l() { // from class: zs1.p1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.ba(this.f236831a, (mz3.z.b) obj);
            }
        }, aVarB11, new er.l() { // from class: zs1.q1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.ca(this.f236838a, (y30.n.Switch.EnumC5973b) obj);
            }
        }, new er.l() { // from class: zs1.r1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.da(this.f236850a, (n20.a) obj);
            }
        }, aVarB12, new er.l() { // from class: zs1.s1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.ea(this.f236884a, (List) obj);
            }
        }, b9(zs1.v.f236923a), new er.l() { // from class: zs1.t1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.fa(this.f236915a, (RefugeeChildStatementState) obj);
            }
        }, b9(zs1.w.f236926a), b9(zs1.m0.f236800a), new er.l() { // from class: zs1.u1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.ga(this.f236921a, (String) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(x1 x1Var, String str) {
        x1Var.d9(new OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(x1 x1Var, mz3.z.b bVar) {
        x1Var.d9(new UpdateDocumentClickAction(bVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(x1 x1Var, y30.n.Switch.EnumC5973b enumC5973b) {
        x1Var.d9(new ChangeSwitchItem(enumC5973b));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(x1 x1Var, n20.a aVar) {
        x1Var.d9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(x1 x1Var, List list) {
        x1Var.d9(new ShortcutMoreClickAction(list));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(x1 x1Var, RefugeeChildStatementState refugeeChildStatementState) {
        x1Var.d9(new ChildStatementCheckedStatusChanged(refugeeChildStatementState.getChild(), refugeeChildStatementState.getIsSelected()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(x1 x1Var, String str) {
        x1Var.d9(new ChildCardClicked(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(final x1 x1Var, final mx.c cVar, k10.v vVar) {
        vVar.c(fr.q0.c(s0.f.class), new er.l() { // from class: zs1.v1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.ja(this.f236924a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(s0.d.Screen.class), new er.l() { // from class: zs1.d1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.ka(this.f236760a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(s0.d.Error.class), new er.l() { // from class: zs1.e1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.ma(this.f236766a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(s0.ChildrenLoader.class), new er.l() { // from class: zs1.f1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.na(this.f236774a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(s0.b.Screen.class), new er.l() { // from class: zs1.g1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.oa(this.f236779a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(s0.b.Dialog.class), new er.l() { // from class: zs1.h1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.pa((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(s0.b.Error.class), new er.l() { // from class: zs1.i1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.qa((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(s0.e.Screen.class), new er.l() { // from class: zs1.j1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.ra(this.f236788a, cVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(s0.e.Error.class), new er.l() { // from class: zs1.k1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.sa((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(s0.e.Dialog.class), new er.l() { // from class: zs1.l1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.ta((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(s0.c.Screen.class), new er.l() { // from class: zs1.w1
            @Override // er.l
            public final Object b(Object obj) {
                return x1.la(this.f236928a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(x1 x1Var, k10.z zVar) {
        zVar.A(new f(null));
        g gVar = x1Var.new g(null);
        zVar.x(fr.q0.c(zs1.r.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ka(x1 x1Var, k10.z zVar) {
        j jVar = x1Var.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ShowError.class), oVar, jVar);
        zVar.C(x1Var.new k(null));
        zVar.v(fr.q0.c(LoadDocumentData.class), oVar, x1Var.new l(null));
        zVar.x(fr.q0.c(zs1.r.class), oVar, x1Var.new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 la(x1 x1Var, k10.z zVar) {
        zVar.C(x1Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ma(x1 x1Var, k10.z zVar) {
        n nVar = x1Var.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(zs1.r.class), oVar, nVar);
        zVar.v(fr.q0.c(LoadDocumentData.class), oVar, new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 na(x1 x1Var, k10.z zVar) {
        zVar.C(x1Var.new p(null));
        q qVar = x1Var.new q(null);
        zVar.v(fr.q0.c(zs1.a0.class), k10.o.CANCEL_PREVIOUS, qVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 oa(x1 x1Var, k10.z zVar) {
        z zVar2 = x1Var.new z(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ShowError.class), oVar, zVar2);
        zVar.v(fr.q0.c(ShowDialog.class), oVar, x1Var.new a0(null));
        zVar.v(fr.q0.c(ChangeSwitchItem.class), oVar, new b0(null));
        zVar.v(fr.q0.c(zs1.r.class), oVar, x1Var.new c0(null));
        zVar.v(fr.q0.c(zs1.v.class), oVar, new d0(null));
        zVar.x(fr.q0.c(zs1.i0.class), oVar, x1Var.new e0(null));
        zVar.x(fr.q0.c(zs1.f0.class), oVar, x1Var.new f0(null));
        zVar.v(fr.q0.c(UpdateDocumentClickAction.class), oVar, new g0(null));
        zVar.x(fr.q0.c(zs1.g0.class), oVar, x1Var.new h0(null));
        zVar.x(fr.q0.c(ShortcutMoreClickAction.class), oVar, x1Var.new r(null));
        zVar.x(fr.q0.c(OpenUrl.class), oVar, x1Var.new s(null));
        zVar.v(fr.q0.c(ChildCardClicked.class), oVar, new t(null));
        zVar.x(fr.q0.c(zs1.m0.class), oVar, x1Var.new u(null));
        zVar.v(fr.q0.c(zs1.d0.class), oVar, new v(null));
        zVar.v(fr.q0.c(OpenChildrenStatementBottomSheet.class), oVar, new w(null));
        zVar.v(fr.q0.c(ChildStatementCheckedStatusChanged.class), oVar, new x(null));
        zVar.v(fr.q0.c(zs1.w.class), oVar, x1Var.new y(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 pa(k10.z zVar) {
        i0 i0Var = new i0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(zs1.x.class), oVar, i0Var);
        zVar.v(fr.q0.c(zs1.y.class), oVar, new j0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 qa(k10.z zVar) {
        k0 k0Var = new k0(null);
        zVar.v(fr.q0.c(zs1.r.class), k10.o.CANCEL_PREVIOUS, k0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ra(x1 x1Var, mx.c cVar, k10.z zVar) {
        zVar.C(x1Var.new l0(null));
        m0 m0Var = x1Var.new m0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ShowError.class), oVar, m0Var);
        zVar.v(fr.q0.c(ShowDialog.class), oVar, x1Var.new n0(null));
        zVar.v(fr.q0.c(zs1.l0.class), oVar, x1Var.new o0(cVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 sa(k10.z zVar) {
        p0 p0Var = new p0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(zs1.r.class), oVar, p0Var);
        zVar.v(fr.q0.c(UpdateDocumentClickAction.class), oVar, new q0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ta(k10.z zVar) {
        h hVar = new h(null);
        zVar.v(fr.q0.c(zs1.y.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: U9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(zs1.b0 b0Var, tq.e<? super oq.i0> eVar) {
        return super.F(b0Var, eVar);
    }

    @Override // zx.b
    public xw.b<zs1.b0> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<s0>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<t0.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: ha, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
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
