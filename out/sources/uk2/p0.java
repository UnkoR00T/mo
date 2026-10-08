package uk2;

import cb4.DialogData;
import java.util.Date;
import java.util.List;
import lk2.Document;
import lk2.MIdCardData;
import n20.State;
import o20.t2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wk2.SetupData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0001{B\u0091\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020,2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b-\u0010.J'\u00105\u001a\u000204*\u00020/2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200H\u0002¢\u0006\u0004\b5\u00106J\u0018\u00109\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107H\u0082@¢\u0006\u0004\b9\u0010:J\u0018\u0010=\u001a\u0002022\u0006\u0010<\u001a\u00020;H\u0096\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u000202H\u0096\u0001¢\u0006\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR \u0010k\u001a\b\u0012\u0004\u0012\u00020f0e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR,\u0010q\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040l8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR \u0010+\u001a\b\u0012\u0004\u0012\u00020,0r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020x0w8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010y¨\u0006|"}, d2 = {"Luk2/p0;", "Ll00/g;", "Ln20/b;", "Luk2/u;", "Ln20/a;", "Luk2/x;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lvk2/f;", "mapper", "snackBarManagerStateHolder", "Lvk2/c;", "mIdErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lcb4/j;", "dialogVMSFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Lvk2/g;", "midCardDialogMapper", "La14/d;", "copyToClipboardUseCase", "Lh64/r;", "loadServicesUseCase", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lh64/q;", "loadRemoteSettingsUseCase", "Lez/c;", "dateConverter", "Lo20/t2$a;", "deps", "Lmx/c;", "labelProvider", "Lkk2/a;", "midCardContainersInteractor", "<init>", "(Ln20/j;Lvk2/f;Li70/n;Lvk2/c;Lhb4/d;Lcb4/j;Lac4/a;Lvk2/g;La14/d;Lh64/r;Lmz3/z;Lmz3/w;Lh64/q;Lez/c;Lo20/t2$a;Lmx/c;Lkk2/a;)V", "state", "Luk2/x$a;", "L9", "(Ln20/b;)Luk2/x$a;", "Ldx/b;", "Lkotlin/Function1;", "Lib4/c$b;", "Loq/i0;", "resultAction", "Lhb4/c;", "K9", "(Ldx/b;Ler/l;)Lhb4/c;", "", "Lrq0/c;", "J9", "(Ltq/e;)Ljava/lang/Object;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lvk2/f;", "c", "Li70/n;", "d", "Lvk2/c;", "e", "Lhb4/d;", "f", "Lcb4/j;", "g", "Lac4/a;", "h", "Lvk2/g;", "j", "La14/d;", "k", "Lh64/r;", "l", "Lmz3/z;", "m", "Lmz3/w;", "n", "Lh64/q;", "p", "Lez/c;", "q", "Lo20/t2$a;", "r", "Lmx/c;", "s", "Lkk2/a;", "Luk2/w;", "t", "Luk2/w;", "initialState", "Lxw/b;", "Luk2/k;", "v", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "w", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "x", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "a", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 extends l00.g<State<uk2.u>, n20.a> implements uk2.x, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vk2.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final vk2.c mIdErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final vk2.g midCardDialogMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final h64.q loadRemoteSettingsUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final kk2.a midCardContainersInteractor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final uk2.w initialState;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final xw.b<uk2.k> navAction;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<uk2.u>, n20.a> stateMachine;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<uk2.x.a> state;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f198706z = 8;
    private static final rq0.b.d A = rq0.b.d.ID_CARD;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luk2/p;", "action", "Luk2/u$c$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Luk2/p;Luk2/u$c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<ShowMaintenanceBreakDialog, uk2.u.c.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198728f;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(p0 p0Var) {
            p0Var.d9(a.f198657a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowMaintenanceBreakDialog showMaintenanceBreakDialog = (ShowMaintenanceBreakDialog) this.f198728f;
            uq.b.e();
            if (this.f198727e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0 p0Var = p0.this;
            DialogData dialogData = showMaintenanceBreakDialog.getDialogData();
            final p0 p0Var2 = p0.this;
            p0Var.d9(new ShowDialog(DialogData.d(dialogData, null, null, null, null, null, null, new er.a() { // from class: uk2.a1
                @Override // er.a
                public final Object a() {
                    return p0.a0.O(p0Var2);
                }
            }, 63, null)));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowMaintenanceBreakDialog showMaintenanceBreakDialog, uk2.u.c.Screen screen, tq.e<? super oq.i0> eVar) {
            a0 a0Var = p0.this.new a0(eVar);
            a0Var.f198728f = showMaintenanceBreakDialog;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f198730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f198731e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f198733g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f198731e = obj;
            this.f198733g |= PKIFailureInfo.systemUnavail;
            return p0.this.J9(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luk2/a;", "<unused var>", "Luk2/u$c$c;", "Loq/i0;", "<anonymous>", "(Luk2/a;Luk2/u$c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<a, uk2.u.c.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198734e;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198734e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                uk2.k.a aVar = uk2.k.a.f198688a;
                this.f198734e = 1;
                if (p0Var.F(aVar, this) == objE) {
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
        public final Object w(a aVar, uk2.u.c.Screen screen, tq.e<? super oq.i0> eVar) {
            return p0.this.new b0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<uk2.x.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f198736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f198737b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f198738a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f198739b;

            /* JADX INFO: renamed from: uk2.p0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5174a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f198740d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f198741e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f198742f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f198744h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f198745j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f198746k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f198747l;

                public C5174a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f198740d = obj;
                    this.f198741e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p0 p0Var) {
                this.f198738a = hVar;
                this.f198739b = p0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5174a c5174a;
                if (eVar instanceof C5174a) {
                    c5174a = (C5174a) eVar;
                    int i15 = c5174a.f198741e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5174a.f198741e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5174a = new C5174a(eVar);
                    }
                } else {
                    c5174a = new C5174a(eVar);
                }
                Object obj2 = c5174a.f198740d;
                Object objE = uq.b.e();
                int i16 = c5174a.f198741e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f198738a;
                    uk2.x.a aVarL9 = this.f198739b.L9((State) obj);
                    c5174a.f198742f = vq.j.a(obj);
                    c5174a.f198744h = vq.j.a(c5174a);
                    c5174a.f198745j = vq.j.a(obj);
                    c5174a.f198746k = vq.j.a(hVar);
                    c5174a.f198747l = 0;
                    c5174a.f198741e = 1;
                    if (hVar.F(aVarL9, c5174a) == objE) {
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

        public c(mu.g gVar, p0 p0Var) {
            this.f198736a = gVar;
            this.f198737b = p0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super uk2.x.a> hVar, tq.e eVar) {
            Object objA = this.f198736a.a(new a(hVar, this.f198737b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/r;", "<unused var>", "Lk10/c0;", "Luk2/u$c$c;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<uk2.r, k10.c0<uk2.u.c.Screen>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198749f;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uk2.u.a.Screen O(k10.c0 c0Var, uk2.u.c.Screen screen) {
            return new uk2.u.a.Screen(((uk2.u.c.Screen) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f198749f;
            uq.b.e();
            if (this.f198748e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0.this.y(new p50.a.DefaultWithIcon(p0.this.labelProvider.c(ik2.a.f93216q0), false, null, null, 14, null));
            return c0Var.d(new er.l() { // from class: uk2.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.c0.O(c0Var, (u.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uk2.r rVar, k10.c0<uk2.u.c.Screen> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            c0 c0Var2 = p0.this.new c0(eVar);
            c0Var2.f198749f = c0Var;
            return c0Var2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luk2/w;", "it", "Loq/i0;", "<anonymous>", "(Luk2/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<uk2.w, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198751e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        
            if (r7.F(r1, r6) == r0) goto L17;
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
                int r1 = r6.f198751e
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                oq.u.b(r7)
                goto L68
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                oq.u.b(r7)
                goto L39
            L1e:
                oq.u.b(r7)
                uk2.p0 r7 = uk2.p0.this
                mz3.w r7 = uk2.p0.E9(r7)
                mz3.w$a r1 = new mz3.w$a
                rq0.b$d r4 = uk2.p0.A9()
                r1.<init>(r4)
                r6.f198751e = r2
                java.lang.Object r7 = r7.c(r1, r6)
                if (r7 != r0) goto L39
                goto L58
            L39:
                mz3.w$b r7 = (mz3.w.b) r7
                boolean r1 = r7 instanceof mz3.w.b.NotReady
                if (r1 == 0) goto L59
                uk2.p0 r7 = uk2.p0.this
                uk2.k$h r1 = new uk2.k$h
                gv3.b$b r2 = new gv3.b$b
                rq0.b$d r4 = uk2.p0.A9()
                r5 = 0
                r2.<init>(r4, r5, r3, r5)
                r1.<init>(r2)
                r6.f198751e = r3
                java.lang.Object r7 = r7.F(r1, r6)
                if (r7 != r0) goto L68
            L58:
                return r0
            L59:
                mz3.w$b$b r0 = mz3.w.b.C3231b.f129717a
                boolean r7 = fr.t.c(r7, r0)
                if (r7 == 0) goto L6b
                uk2.p0 r7 = uk2.p0.this
                uk2.j r0 = uk2.j.f198686a
                uk2.p0.t9(r7, r0)
            L68:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L6b:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: uk2.p0.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(uk2.w wVar, tq.e<? super oq.i0> eVar) {
            return ((d) v(wVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return p0.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/n;", "action", "Lk10/c0;", "Luk2/u$c$c;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<ShowDialog, k10.c0<uk2.u.c.Screen>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f198755g;

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uk2.u.c.Dialog O(k10.c0 c0Var, p0 p0Var, ShowDialog showDialog, uk2.u.c.Screen screen) {
            return new uk2.u.c.Dialog(((uk2.u.c.Screen) c0Var.a()).getStateData(), ((uk2.u.c.Screen) c0Var.a()).getUpdateMethodType(), p0Var.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowDialog showDialog = (ShowDialog) this.f198754f;
            final k10.c0 c0Var = (k10.c0) this.f198755g;
            uq.b.e();
            if (this.f198753e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: uk2.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.d0.O(c0Var, p0Var, showDialog, (u.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDialog showDialog, k10.c0<uk2.u.c.Screen> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            d0 d0Var = p0.this.new d0(eVar);
            d0Var.f198754f = showDialog;
            d0Var.f198755g = c0Var;
            return d0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/o;", "action", "Lk10/c0;", "Luk2/w;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ShowError, k10.c0<uk2.w>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f198759g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error V(final p0 p0Var, ShowError showError, uk2.w wVar) {
            return new Error(p0Var.K9(showError.getDomainError(), new er.l() { // from class: uk2.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.e.X(p0Var, (ib4.c.b) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(p0 p0Var, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.AbstractC2161b.a) || (bVar instanceof ib4.c.b.a.Close)) {
                p0Var.d9(a.f198657a);
            } else {
                if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new oq.p();
                }
                p0Var.d9(uk2.j.f198686a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowError showError = (ShowError) this.f198758f;
            k10.c0 c0Var = (k10.c0) this.f198759g;
            uq.b.e();
            if (this.f198757e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: uk2.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.e.V(p0Var, showError, (w) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowError showError, k10.c0<uk2.w> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            e eVar2 = p0.this.new e(eVar);
            eVar2.f198758f = showError;
            eVar2.f198759g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/a;", "<unused var>", "Lk10/c0;", "Luk2/u$c$a;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.q<a, k10.c0<uk2.u.c.Dialog>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198762f;

        e0(tq.e<? super e0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uk2.u.a.Screen O(k10.c0 c0Var, uk2.u.c.Dialog dialog) {
            return new uk2.u.a.Screen(((uk2.u.c.Dialog) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f198762f;
            uq.b.e();
            if (this.f198761e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uk2.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.e0.O(c0Var, (u.c.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a aVar, k10.c0<uk2.u.c.Dialog> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            e0 e0Var = new e0(eVar);
            e0Var.f198762f = c0Var;
            return e0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luk2/a;", "<unused var>", "Luk2/w;", "Loq/i0;", "<anonymous>", "(Luk2/a;Luk2/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a, uk2.w, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198763e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198763e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                uk2.k.a aVar = uk2.k.a.f198688a;
                this.f198763e = 1;
                if (p0Var.F(aVar, this) == objE) {
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
        public final Object w(a aVar, uk2.w wVar, tq.e<? super oq.i0> eVar) {
            return p0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/a;", "<unused var>", "Lk10/c0;", "Luk2/u$c$b;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<a, k10.c0<uk2.u.c.Error>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198766f;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uk2.u.a.Screen O(k10.c0 c0Var, uk2.u.c.Error error) {
            return new uk2.u.a.Screen(((uk2.u.c.Error) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f198766f;
            uq.b.e();
            if (this.f198765e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uk2.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.f0.O(c0Var, (u.c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a aVar, k10.c0<uk2.u.c.Error> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            f0 f0Var = new f0(eVar);
            f0Var.f198766f = c0Var;
            return f0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/j;", "<unused var>", "Lk10/c0;", "Luk2/w;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<uk2.j, k10.c0<uk2.w>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f198767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f198768f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f198769g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f198770h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f198771j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f198772k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f198773l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f198774m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f198775n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f198776p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f198777q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f198778r;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uk2.u.a.Screen O(MIdCardData mIdCardData, lk2.b bVar, List list, String str, p0 p0Var, uk2.w wVar) {
            return new uk2.u.a.Screen(new DocumentStateData(mIdCardData, bVar, list, str, new t2(p0Var.deps, androidx.p016lifecycle.u0.a(p0Var))));
        }

        /* JADX WARN: Code duplicated, block: B:22:0x009a  */
        /* JADX WARN: Code duplicated, block: B:24:0x00af  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:33:0x0103  */
        /* JADX WARN: Code duplicated, block: B:36:0x010f  */
        /* JADX WARN: Code duplicated, block: B:38:0x0124  */
        /* JADX WARN: Code duplicated, block: B:40:0x0128  */
        /* JADX WARN: Code duplicated, block: B:43:0x015c  */
        /* JADX WARN: Code duplicated, block: B:46:0x0171  */
        /* JADX WARN: Code duplicated, block: B:48:0x0177  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List list;
            dx.i iVar;
            p0 p0Var;
            MIdCardData mIdCardData;
            Document document;
            String documentId;
            Object objF;
            final p0 p0Var2;
            List list2;
            final MIdCardData mIdCardData2;
            int i15;
            int i16;
            dx.i iVar2;
            lk2.b bVar;
            final List list3;
            final lk2.b bVar2;
            k10.c0 c0Var = (k10.c0) this.f198778r;
            Object objE = uq.b.e();
            int i17 = this.f198777q;
            if (i17 == 0) {
                oq.u.b(obj);
                p0 p0Var3 = p0.this;
                this.f198778r = c0Var;
                this.f198777q = 1;
                obj = p0Var3.J9(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i17 == 1) {
                oq.u.b(obj);
            } else {
                if (i17 == 2) {
                    list = (List) this.f198767e;
                    oq.u.b(obj);
                    iVar = (dx.i) obj;
                    p0Var = p0.this;
                    if (iVar instanceof dx.i.Left) {
                        p0Var.d9(new ShowError((dx.b) ((dx.i.Left) iVar).b()));
                        return c0Var.c();
                    }
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    mIdCardData = (MIdCardData) ((dx.i.Right) iVar).b();
                    kk2.a aVar = p0Var.midCardContainersInteractor;
                    document = mIdCardData.getDocument();
                    if (document != null) {
                        documentId = document.getDocumentId();
                    } else {
                        documentId = null;
                    }
                    Date dateD = p0Var.dateConverter.d(mIdCardData.getScope().getData().getMobileIdCard().getValidTo().getDate());
                    this.f198778r = c0Var;
                    this.f198767e = list;
                    this.f198768f = vq.j.a(iVar);
                    this.f198769g = p0Var;
                    this.f198770h = mIdCardData;
                    this.f198773l = 0;
                    this.f198774m = 0;
                    this.f198777q = 3;
                    objF = aVar.f(dateD, documentId, this);
                    if (objF != objE) {
                        p0Var2 = p0Var;
                        list2 = list;
                        obj = objF;
                        mIdCardData2 = mIdCardData;
                        i15 = 0;
                        i16 = 0;
                        iVar2 = (dx.i) obj;
                        if (iVar2 instanceof dx.i.Left) {
                            p0Var2.d9(new ShowError((dx.b) ((dx.i.Left) iVar2).b()));
                            return c0Var.c();
                        }
                        if (!(iVar2 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        bVar = (lk2.b) ((dx.i.Right) iVar2).b();
                        kk2.a aVar2 = p0Var2.midCardContainersInteractor;
                        this.f198778r = c0Var;
                        this.f198767e = list2;
                        this.f198768f = vq.j.a(iVar);
                        this.f198769g = p0Var2;
                        this.f198770h = mIdCardData2;
                        this.f198771j = vq.j.a(iVar2);
                        this.f198772k = bVar;
                        this.f198773l = i16;
                        this.f198774m = i15;
                        this.f198775n = 0;
                        this.f198776p = 0;
                        this.f198777q = 4;
                        obj = aVar2.m(this);
                        if (obj != objE) {
                            list3 = list2;
                            bVar2 = bVar;
                        }
                    }
                    return objE;
                }
                if (i17 == 3) {
                    int i18 = this.f198774m;
                    int i19 = this.f198773l;
                    MIdCardData mIdCardData3 = (MIdCardData) this.f198770h;
                    p0Var2 = (p0) this.f198769g;
                    iVar = (dx.i) this.f198768f;
                    list2 = (List) this.f198767e;
                    oq.u.b(obj);
                    i15 = i18;
                    mIdCardData2 = mIdCardData3;
                    i16 = i19;
                    iVar2 = (dx.i) obj;
                    if (iVar2 instanceof dx.i.Left) {
                        p0Var2.d9(new ShowError((dx.b) ((dx.i.Left) iVar2).b()));
                        return c0Var.c();
                    }
                    if (!(iVar2 instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    bVar = (lk2.b) ((dx.i.Right) iVar2).b();
                    kk2.a aVar3 = p0Var2.midCardContainersInteractor;
                    this.f198778r = c0Var;
                    this.f198767e = list2;
                    this.f198768f = vq.j.a(iVar);
                    this.f198769g = p0Var2;
                    this.f198770h = mIdCardData2;
                    this.f198771j = vq.j.a(iVar2);
                    this.f198772k = bVar;
                    this.f198773l = i16;
                    this.f198774m = i15;
                    this.f198775n = 0;
                    this.f198776p = 0;
                    this.f198777q = 4;
                    obj = aVar3.m(this);
                    if (obj != objE) {
                        list3 = list2;
                        bVar2 = bVar;
                    }
                    return objE;
                }
                if (i17 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lk2.b bVar3 = (lk2.b) this.f198772k;
                mIdCardData2 = (MIdCardData) this.f198770h;
                p0 p0Var4 = (p0) this.f198769g;
                list3 = (List) this.f198767e;
                oq.u.b(obj);
                p0Var2 = p0Var4;
                bVar2 = bVar3;
            }
            final String str = (String) ((dx.i) obj).a();
            return c0Var.d(new er.l() { // from class: uk2.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.g.O(mIdCardData2, bVar2, list3, str, p0Var2, (w) obj2);
                }
            });
            list = (List) obj;
            kk2.a aVar4 = p0.this.midCardContainersInteractor;
            this.f198778r = c0Var;
            this.f198767e = list;
            this.f198777q = 2;
            obj = aVar4.l(this);
            if (obj != objE) {
                iVar = (dx.i) obj;
                p0Var = p0.this;
                if (iVar instanceof dx.i.Left) {
                    p0Var.d9(new ShowError((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                mIdCardData = (MIdCardData) ((dx.i.Right) iVar).b();
                kk2.a aVar5 = p0Var.midCardContainersInteractor;
                document = mIdCardData.getDocument();
                if (document != null) {
                    documentId = document.getDocumentId();
                } else {
                    documentId = null;
                }
                Date dateD2 = p0Var.dateConverter.d(mIdCardData.getScope().getData().getMobileIdCard().getValidTo().getDate());
                this.f198778r = c0Var;
                this.f198767e = list;
                this.f198768f = vq.j.a(iVar);
                this.f198769g = p0Var;
                this.f198770h = mIdCardData;
                this.f198773l = 0;
                this.f198774m = 0;
                this.f198777q = 3;
                objF = aVar5.f(dateD2, documentId, this);
                if (objF != objE) {
                    p0Var2 = p0Var;
                    list2 = list;
                    obj = objF;
                    mIdCardData2 = mIdCardData;
                    i15 = 0;
                    i16 = 0;
                    iVar2 = (dx.i) obj;
                    if (iVar2 instanceof dx.i.Left) {
                        p0Var2.d9(new ShowError((dx.b) ((dx.i.Left) iVar2).b()));
                        return c0Var.c();
                    }
                    if (!(iVar2 instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    bVar = (lk2.b) ((dx.i.Right) iVar2).b();
                    kk2.a aVar6 = p0Var2.midCardContainersInteractor;
                    this.f198778r = c0Var;
                    this.f198767e = list2;
                    this.f198768f = vq.j.a(iVar);
                    this.f198769g = p0Var2;
                    this.f198770h = mIdCardData2;
                    this.f198771j = vq.j.a(iVar2);
                    this.f198772k = bVar;
                    this.f198773l = i16;
                    this.f198774m = i15;
                    this.f198775n = 0;
                    this.f198776p = 0;
                    this.f198777q = 4;
                    obj = aVar6.m(this);
                    if (obj != objE) {
                        list3 = list2;
                        bVar2 = bVar;
                        final String str2 = (String) ((dx.i) obj).a();
                        return c0Var.d(new er.l() { // from class: uk2.s0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return p0.g.O(mIdCardData2, bVar2, list3, str2, p0Var2, (w) obj2);
                            }
                        });
                    }
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uk2.j jVar, k10.c0<uk2.w> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            g gVar = p0.this.new g(eVar);
            gVar.f198778r = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/s;", "<unused var>", "Lk10/c0;", "Luk2/u$c$b;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.q<UpdateDocument, k10.c0<uk2.u.c.Error>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198781f;

        g0(tq.e<? super g0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uk2.u.c.Screen O(k10.c0 c0Var, uk2.u.c.Error error) {
            return new uk2.u.c.Screen(((uk2.u.c.Error) c0Var.a()).getStateData(), ((uk2.u.c.Error) c0Var.a()).getUpdateMethodType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f198781f;
            uq.b.e();
            if (this.f198780e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uk2.f1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.g0.O(c0Var, (u.c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(UpdateDocument updateDocument, k10.c0<uk2.u.c.Error> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            g0 g0Var = new g0(eVar);
            g0Var.f198781f = c0Var;
            return g0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luk2/a;", "<unused var>", "Luk2/v;", "Loq/i0;", "<anonymous>", "(Luk2/a;Luk2/v;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198782e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198782e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                uk2.k.a aVar = uk2.k.a.f198688a;
                this.f198782e = 1;
                if (p0Var.F(aVar, this) == objE) {
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
        public final Object w(a aVar, Error error, tq.e<? super oq.i0> eVar) {
            return p0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luk2/a;", "<unused var>", "Luk2/u$b$a;", "Loq/i0;", "<anonymous>", "(Luk2/a;Luk2/u$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.q<a, uk2.u.b.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198784e;

        h0(tq.e<? super h0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198784e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                uk2.k.a aVar = uk2.k.a.f198688a;
                this.f198784e = 1;
                if (p0Var.F(aVar, this) == objE) {
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
        public final Object w(a aVar, uk2.u.b.Screen screen, tq.e<? super oq.i0> eVar) {
            return p0.this.new h0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/j;", "<unused var>", "Lk10/c0;", "Luk2/v;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<uk2.j, k10.c0<Error>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198787f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uk2.w O(Error error) {
            return uk2.w.f198898a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198787f;
            uq.b.e();
            if (this.f198786e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uk2.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.i.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uk2.j jVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            i iVar = new i(eVar);
            iVar.f198787f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luk2/u$b$a;", "state", "Loq/i0;", "<anonymous>", "(Luk2/u$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.p<uk2.u.b.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198789f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f198791e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f198792f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ uk2.u.b.Screen f198793g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, uk2.u.b.Screen screen, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f198792f = p0Var;
                this.f198793g = screen;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f198791e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                kk2.a aVar = this.f198792f.midCardContainersInteractor;
                Document document = this.f198793g.getStateData().getData().getDocument();
                String documentId = document != null ? document.getDocumentId() : null;
                rq0.b.d dVar = p0.A;
                this.f198791e = 1;
                Object objB = aVar.b(documentId, dVar, this);
                return objB == objE ? objE : objB;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f198792f, this.f198793g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        i0(tq.e<? super i0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i0 i0Var;
            uk2.u.b.Screen screen = (uk2.u.b.Screen) this.f198789f;
            Object objE = uq.b.e();
            int i15 = this.f198788e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = p0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(p0.this, screen, null);
                this.f198789f = vq.j.a(screen);
                this.f198788e = 1;
                i0Var = this;
                if (ac4.a.a(aVar, null, aVar2, i0Var, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                i0Var = this;
            }
            p0.this.d9(uk2.a.f198657a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(uk2.u.b.Screen screen, tq.e<? super oq.i0> eVar) {
            return ((i0) v(screen, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i0 i0Var = p0.this.new i0(eVar);
            i0Var.f198789f = obj;
            return i0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luk2/f;", "<unused var>", "Luk2/u$a$b;", "state", "Loq/i0;", "<anonymous>", "(Luk2/f;Luk2/u$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<uk2.f, uk2.u.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198795f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uk2.u.a.Screen screen = (uk2.u.a.Screen) this.f198795f;
            Object objE = uq.b.e();
            int i15 = this.f198794e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                uk2.k.GoToIdDocumentDetails goToIdDocumentDetails = new uk2.k.GoToIdDocumentDetails(screen.getStateData().getData());
                this.f198795f = vq.j.a(screen);
                this.f198794e = 1;
                if (p0Var.F(goToIdDocumentDetails, this) == objE) {
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
        public final Object w(uk2.f fVar, uk2.u.a.Screen screen, tq.e<? super oq.i0> eVar) {
            j jVar = p0.this.new j(eVar);
            jVar.f198795f = screen;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luk2/g;", "<unused var>", "Luk2/u$a$b;", "Loq/i0;", "<anonymous>", "(Luk2/g;Luk2/u$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<uk2.g, uk2.u.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198797e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198797e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                uk2.k.e eVar = uk2.k.e.f198692a;
                this.f198797e = 1;
                if (p0Var.F(eVar, this) == objE) {
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
        public final Object w(uk2.g gVar, uk2.u.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return p0.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luk2/b;", "<unused var>", "Luk2/u$a$b;", "state", "Loq/i0;", "<anonymous>", "(Luk2/b;Luk2/u$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<uk2.b, uk2.u.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f198799e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f198800f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f198801g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f198802h;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uk2.u.a.Screen screen = (uk2.u.a.Screen) this.f198802h;
            Object objE = uq.b.e();
            int i15 = this.f198801g;
            if (i15 == 0) {
                oq.u.b(obj);
                String number = screen.getStateData().getData().getScope().getData().getMobileIdCard().getNumber();
                p0 p0Var = p0.this;
                a14.d dVar = p0Var.copyToClipboardUseCase;
                a14.d.Params params = new a14.d.Params(number, p0Var.labelProvider.c(ik2.a.L));
                this.f198802h = vq.j.a(screen);
                this.f198799e = vq.j.a(number);
                this.f198800f = 0;
                this.f198801g = 1;
                if (dVar.c(params, this) == objE) {
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
        public final Object w(uk2.b bVar, uk2.u.a.Screen screen, tq.e<? super oq.i0> eVar) {
            l lVar = p0.this.new l(eVar);
            lVar.f198802h = screen;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/n;", "action", "Lk10/c0;", "Luk2/u$a$b;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ShowDialog, k10.c0<uk2.u.a.Screen>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198804e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198805f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f198806g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uk2.u.a.Dialog O(k10.c0 c0Var, p0 p0Var, ShowDialog showDialog, uk2.u.a.Screen screen) {
            return new uk2.u.a.Dialog(((uk2.u.a.Screen) c0Var.a()).getStateData(), p0Var.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowDialog showDialog = (ShowDialog) this.f198805f;
            final k10.c0 c0Var = (k10.c0) this.f198806g;
            uq.b.e();
            if (this.f198804e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: uk2.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.m.O(c0Var, p0Var, showDialog, (u.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDialog showDialog, k10.c0<uk2.u.a.Screen> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            m mVar = p0.this.new m(eVar);
            mVar.f198805f = showDialog;
            mVar.f198806g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luk2/a;", "<unused var>", "Luk2/u$a$b;", "Loq/i0;", "<anonymous>", "(Luk2/a;Luk2/u$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<a, uk2.u.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198808e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198808e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                uk2.k.a aVar = uk2.k.a.f198688a;
                this.f198808e = 1;
                if (p0Var.F(aVar, this) == objE) {
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
        public final Object w(a aVar, uk2.u.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return p0.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luk2/h;", "action", "Luk2/u$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Luk2/h;Luk2/u$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<GoToMoreDialog, uk2.u.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198811f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            GoToMoreDialog goToMoreDialog = (GoToMoreDialog) this.f198811f;
            Object objE = uq.b.e();
            int i15 = this.f198810e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                uk2.k.ToMoreDialog toMoreDialog = new uk2.k.ToMoreDialog(new SetupData(goToMoreDialog.a()));
                this.f198811f = vq.j.a(goToMoreDialog);
                this.f198810e = 1;
                if (p0Var.F(toMoreDialog, this) == objE) {
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
        public final Object w(GoToMoreDialog goToMoreDialog, uk2.u.a.Screen screen, tq.e<? super oq.i0> eVar) {
            o oVar = p0.this.new o(eVar);
            oVar.f198811f = goToMoreDialog;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luk2/i;", "<unused var>", "Luk2/u$a$b;", "Loq/i0;", "<anonymous>", "(Luk2/i;Luk2/u$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<uk2.i, uk2.u.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f198813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f198814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f198815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f198816h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f198817j;

        p(tq.e<? super p> eVar) {
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
                int r1 = r12.f198817j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r12.f198814f
                oq.i0 r0 = (oq.i0) r0
                java.lang.Object r0 = r12.f198813e
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
                uk2.p0 r13 = uk2.p0.this
                kk2.a r13 = uk2.p0.C9(r13)
                rq0.c r1 = rq0.c.PESEL_RESTRICTION
                r12.f198817j = r3
                java.lang.Object r13 = r13.d(r1, r12)
                if (r13 != r0) goto L3b
                goto L67
            L3b:
                dx.i r13 = (dx.i) r13
                uk2.p0 r1 = uk2.p0.this
                boolean r3 = r13 instanceof dx.i.Left
                if (r3 == 0) goto L68
                r3 = r13
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                oq.i0 r3 = (oq.i0) r3
                uk2.k$f r4 = uk2.k.f.f198693a
                java.lang.Object r13 = vq.j.a(r13)
                r12.f198813e = r13
                java.lang.Object r13 = vq.j.a(r3)
                r12.f198814f = r13
                r13 = 0
                r12.f198815g = r13
                r12.f198816h = r13
                r12.f198817j = r2
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
                uk2.n r13 = new uk2.n
                cb4.b r3 = r2.getPrimaryButtonData()
                uk2.a r0 = uk2.a.f198657a
                er.a r6 = uk2.p0.s9(r1, r0)
                r7 = 3
                r8 = 0
                r4 = 0
                r5 = 0
                cb4.b r6 = cb4.DialogButtonTextData.b(r3, r4, r5, r6, r7, r8)
                er.a r9 = uk2.p0.s9(r1, r0)
                r10 = 55
                r11 = 0
                r3 = 0
                r7 = 0
                cb4.d r0 = cb4.DialogData.d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13.<init>(r0)
                uk2.p0.t9(r1, r13)
            L9c:
                oq.i0 r13 = oq.i0.f148189a
                return r13
            L9f:
                oq.p r13 = new oq.p
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: uk2.p0.p.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uk2.i iVar, uk2.u.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return p0.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luk2/e;", "<unused var>", "Luk2/u$a$b;", "Loq/i0;", "<anonymous>", "(Luk2/e;Luk2/u$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<uk2.e, uk2.u.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f198819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f198820f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f198821g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f198822h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f198823j;

        q(tq.e<? super q> eVar) {
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
                int r1 = r12.f198823j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r12.f198820f
                oq.i0 r0 = (oq.i0) r0
                java.lang.Object r0 = r12.f198819e
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
                uk2.p0 r13 = uk2.p0.this
                kk2.a r13 = uk2.p0.C9(r13)
                rq0.c r1 = rq0.c.FINES
                r12.f198823j = r3
                java.lang.Object r13 = r13.d(r1, r12)
                if (r13 != r0) goto L3b
                goto L67
            L3b:
                dx.i r13 = (dx.i) r13
                uk2.p0 r1 = uk2.p0.this
                boolean r3 = r13 instanceof dx.i.Left
                if (r3 == 0) goto L68
                r3 = r13
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                oq.i0 r3 = (oq.i0) r3
                uk2.k$c r4 = uk2.k.c.f198690a
                java.lang.Object r13 = vq.j.a(r13)
                r12.f198819e = r13
                java.lang.Object r13 = vq.j.a(r3)
                r12.f198820f = r13
                r13 = 0
                r12.f198821g = r13
                r12.f198822h = r13
                r12.f198823j = r2
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
                uk2.n r13 = new uk2.n
                cb4.b r3 = r2.getPrimaryButtonData()
                uk2.a r0 = uk2.a.f198657a
                er.a r6 = uk2.p0.s9(r1, r0)
                r7 = 3
                r8 = 0
                r4 = 0
                r5 = 0
                cb4.b r6 = cb4.DialogButtonTextData.b(r3, r4, r5, r6, r7, r8)
                er.a r9 = uk2.p0.s9(r1, r0)
                r10 = 55
                r11 = 0
                r3 = 0
                r7 = 0
                cb4.d r0 = cb4.DialogData.d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13.<init>(r0)
                uk2.p0.t9(r1, r13)
            L9c:
                oq.i0 r13 = oq.i0.f148189a
                return r13
            L9f:
                oq.p r13 = new oq.p
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: uk2.p0.q.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uk2.e eVar, uk2.u.a.Screen screen, tq.e<? super oq.i0> eVar2) {
            return p0.this.new q(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luk2/d;", "<unused var>", "Luk2/u$a$b;", "Loq/i0;", "<anonymous>", "(Luk2/d;Luk2/u$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<uk2.d, uk2.u.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f198825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f198826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f198827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f198828h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f198829j;

        r(tq.e<? super r> eVar) {
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
                int r1 = r12.f198829j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r12.f198826f
                oq.i0 r0 = (oq.i0) r0
                java.lang.Object r0 = r12.f198825e
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
                uk2.p0 r13 = uk2.p0.this
                kk2.a r13 = uk2.p0.C9(r13)
                rq0.c r1 = rq0.c.ELECTORAL_REGISTER
                r12.f198829j = r3
                java.lang.Object r13 = r13.d(r1, r12)
                if (r13 != r0) goto L3b
                goto L67
            L3b:
                dx.i r13 = (dx.i) r13
                uk2.p0 r1 = uk2.p0.this
                boolean r3 = r13 instanceof dx.i.Left
                if (r3 == 0) goto L68
                r3 = r13
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                oq.i0 r3 = (oq.i0) r3
                uk2.k$b r4 = uk2.k.b.f198689a
                java.lang.Object r13 = vq.j.a(r13)
                r12.f198825e = r13
                java.lang.Object r13 = vq.j.a(r3)
                r12.f198826f = r13
                r13 = 0
                r12.f198827g = r13
                r12.f198828h = r13
                r12.f198829j = r2
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
                uk2.n r13 = new uk2.n
                cb4.b r3 = r2.getPrimaryButtonData()
                uk2.a r0 = uk2.a.f198657a
                er.a r6 = uk2.p0.s9(r1, r0)
                r7 = 3
                r8 = 0
                r4 = 0
                r5 = 0
                cb4.b r6 = cb4.DialogButtonTextData.b(r3, r4, r5, r6, r7, r8)
                er.a r9 = uk2.p0.s9(r1, r0)
                r10 = 55
                r11 = 0
                r3 = 0
                r7 = 0
                cb4.d r0 = cb4.DialogData.d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13.<init>(r0)
                uk2.p0.t9(r1, r13)
            L9c:
                oq.i0 r13 = oq.i0.f148189a
                return r13
            L9f:
                oq.p r13 = new oq.p
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: uk2.p0.r.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uk2.d dVar, uk2.u.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return p0.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/s;", "action", "Lk10/c0;", "Luk2/u$a$b;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<UpdateDocument, k10.c0<uk2.u.a.Screen>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198832f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f198833g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uk2.u.c.Screen O(k10.c0 c0Var, UpdateDocument updateDocument, uk2.u.a.Screen screen) {
            return new uk2.u.c.Screen(((uk2.u.a.Screen) c0Var.a()).getStateData(), updateDocument.getUpdateMethodType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final UpdateDocument updateDocument = (UpdateDocument) this.f198832f;
            final k10.c0 c0Var = (k10.c0) this.f198833g;
            uq.b.e();
            if (this.f198831e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uk2.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.s.O(c0Var, updateDocument, (u.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(UpdateDocument updateDocument, k10.c0<uk2.u.a.Screen> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            s sVar = new s(eVar);
            sVar.f198832f = updateDocument;
            sVar.f198833g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luk2/m;", "<unused var>", "Luk2/u$a$b;", "Loq/i0;", "<anonymous>", "(Luk2/m;Luk2/u$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<uk2.m, uk2.u.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198834e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198834e;
            if (i15 == 0) {
                oq.u.b(obj);
                kk2.a aVar = p0.this.midCardContainersInteractor;
                er.a<oq.i0> aVarB9 = p0.this.b9(uk2.c.f198666a);
                er.a<oq.i0> aVarB10 = p0.this.b9(a.f198657a);
                this.f198834e = 1;
                obj = aVar.n(aVarB9, aVarB10, this);
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
            p0 p0Var = p0.this;
            if (iVar instanceof dx.i.Right) {
                p0Var.d9(new ShowDialog((DialogData) ((dx.i.Right) iVar).b()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uk2.m mVar, uk2.u.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return p0.this.new t(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luk2/q;", "<unused var>", "Luk2/u$a$b;", "state", "Loq/i0;", "<anonymous>", "(Luk2/q;Luk2/u$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<uk2.q, uk2.u.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198836e;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f198836e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0.this.d9(new ShowDialog(p0.this.midCardDialogMapper.b(new vk2.h.Refresh(p0.this.b9(new UpdateDocument(mz3.z.b.UPDATE)), p0.this.b9(a.f198657a)))));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uk2.q qVar, uk2.u.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return p0.this.new u(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luk2/l;", "action", "Luk2/u$a$b;", "state", "Loq/i0;", "<anonymous>", "(Luk2/l;Luk2/u$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<uk2.l, uk2.u.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198838e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198839f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uk2.u.a.Screen screen = (uk2.u.a.Screen) this.f198839f;
            Object objE = uq.b.e();
            int i15 = this.f198838e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (screen.getStateData().getStatus().e()) {
                    p0 p0Var = p0.this;
                    uk2.k.g gVar = uk2.k.g.f198694a;
                    this.f198839f = vq.j.a(screen);
                    this.f198838e = 1;
                    if (p0Var.F(gVar, this) == objE) {
                        return objE;
                    }
                } else {
                    p0.this.d9(uk2.q.f198860a);
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
        public final Object w(uk2.l lVar, uk2.u.a.Screen screen, tq.e<? super oq.i0> eVar) {
            v vVar = p0.this.new v(eVar);
            vVar.f198839f = screen;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/c;", "<unused var>", "Lk10/c0;", "Luk2/u$a$a;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<uk2.c, k10.c0<uk2.u.a.Dialog>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198842f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uk2.u.b.Screen O(k10.c0 c0Var, uk2.u.a.Dialog dialog) {
            return new uk2.u.b.Screen(((uk2.u.a.Dialog) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f198842f;
            uq.b.e();
            if (this.f198841e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uk2.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.w.O(c0Var, (u.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uk2.c cVar, k10.c0<uk2.u.a.Dialog> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            w wVar = new w(eVar);
            wVar.f198842f = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/a;", "<unused var>", "Lk10/c0;", "Luk2/u$a$a;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<a, k10.c0<uk2.u.a.Dialog>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198844f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uk2.u.a.Screen O(k10.c0 c0Var, uk2.u.a.Dialog dialog) {
            return new uk2.u.a.Screen(((uk2.u.a.Dialog) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f198844f;
            uq.b.e();
            if (this.f198843e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uk2.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.x.O(c0Var, (u.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a aVar, k10.c0<uk2.u.a.Dialog> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            x xVar = new x(eVar);
            xVar.f198844f = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luk2/u$c$c;", "state", "Loq/i0;", "<anonymous>", "(Luk2/u$c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.p<uk2.u.c.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198845e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198846f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f198848e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f198849f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f198850g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f198851h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f198852j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f198853k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ p0 f198854l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ uk2.u.c.Screen f198855m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, uk2.u.c.Screen screen, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f198854l = p0Var;
                this.f198855m = screen;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
            /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00fc, code lost:
            
                if (r1.F(r7, r13) == r0) goto L38;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 270
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: uk2.p0.y.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f198854l, this.f198855m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        y(tq.e<? super y> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uk2.u.c.Screen screen = (uk2.u.c.Screen) this.f198846f;
            Object objE = uq.b.e();
            int i15 = this.f198845e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = p0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(p0.this, screen, null);
                this.f198846f = vq.j.a(screen);
                this.f198845e = 1;
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
        public final Object B(uk2.u.c.Screen screen, tq.e<? super oq.i0> eVar) {
            return ((y) v(screen, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            y yVar = p0.this.new y(eVar);
            yVar.f198846f = obj;
            return yVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luk2/o;", "action", "Lk10/c0;", "Luk2/u$c$c;", "state", "Lk10/l;", "Luk2/u;", "<anonymous>", "(Luk2/o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<ShowError, k10.c0<uk2.u.c.Screen>, tq.e<? super k10.l<? extends uk2.u>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198857f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f198858g;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uk2.u.c.Error V(final k10.c0 c0Var, final p0 p0Var, ShowError showError, uk2.u.c.Screen screen) {
            return new uk2.u.c.Error(((uk2.u.c.Screen) c0Var.a()).getStateData(), ((uk2.u.c.Screen) c0Var.a()).getUpdateMethodType(), p0Var.K9(showError.getDomainError(), new er.l() { // from class: uk2.z0
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.z.X(p0Var, c0Var, (ib4.c.b) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(p0 p0Var, k10.c0 c0Var, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.AbstractC2161b.a) || (bVar instanceof ib4.c.b.a.Close)) {
                p0Var.d9(a.f198657a);
            } else {
                if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new oq.p();
                }
                p0Var.d9(new UpdateDocument(((uk2.u.c.Screen) c0Var.a()).getUpdateMethodType()));
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowError showError = (ShowError) this.f198857f;
            final k10.c0 c0Var = (k10.c0) this.f198858g;
            uq.b.e();
            if (this.f198856e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: uk2.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.z.V(c0Var, p0Var, showError, (u.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowError showError, k10.c0<uk2.u.c.Screen> c0Var, tq.e<? super k10.l<? extends uk2.u>> eVar) {
            z zVar = p0.this.new z(eVar);
            zVar.f198857f = showError;
            zVar.f198858g = c0Var;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public p0(n20.j jVar, vk2.f fVar, i70.n nVar, vk2.c cVar, hb4.d dVar, cb4.j jVar2, ac4.a aVar, vk2.g gVar, a14.d dVar2, h64.r rVar, mz3.z zVar, mz3.w wVar, h64.q qVar, ez.c cVar2, t2.a aVar2, mx.c cVar3, kk2.a aVar3) {
        this.mapper = fVar;
        this.snackBarManagerStateHolder = nVar;
        this.mIdErrorMapper = cVar;
        this.errorVMSFactory = dVar;
        this.dialogVMSFactory = jVar2;
        this.callActionWithLoaderUseCase = aVar;
        this.midCardDialogMapper = gVar;
        this.copyToClipboardUseCase = dVar2;
        this.loadServicesUseCase = rVar;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar;
        this.loadRemoteSettingsUseCase = qVar;
        this.dateConverter = cVar2;
        this.deps = aVar2;
        this.labelProvider = cVar3;
        this.midCardContainersInteractor = aVar3;
        uk2.w wVar2 = uk2.w.f198898a;
        this.initialState = wVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = jVar.a(wVar2, new er.l() { // from class: uk2.d0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Q9(this.f198671a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), L9(new State<>(wVar2, null, 2, null)));
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
    public final java.lang.Object J9(tq.e<? super java.util.List<? extends rq0.c>> r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uk2.p0.J9(tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c K9(dx.b bVar, er.l<? super ib4.c.b, oq.i0> lVar) {
        return this.errorVMSFactory.a(this.mIdErrorMapper.b(new ib4.c.Params(bVar, false, lVar, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uk2.x.a L9(State<uk2.u> state) {
        return this.mapper.b(new vk2.f.Params(state.d(), state.getAnimationsState(), new vk2.f.Params.ActionHandler(b9(uk2.f.f198675a), b9(uk2.l.f198698a), b9(uk2.i.f198683a), b9(uk2.e.f198673a), b9(uk2.d.f198670a), new er.l() { // from class: uk2.g0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.M9(this.f198679a, (mz3.z.b) obj);
            }
        }, b9(uk2.m.f198700a), b9(uk2.g.f198678a), new er.l() { // from class: uk2.h0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.N9(this.f198681a, (List) obj);
            }
        }, b9(uk2.b.f198660a), b9(a.f198657a), new er.l() { // from class: uk2.i0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.O9(this.f198684a, (n20.a) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(p0 p0Var, mz3.z.b bVar) {
        p0Var.d9(new UpdateDocument(bVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(p0 p0Var, List list) {
        p0Var.d9(new GoToMoreDialog(list));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(p0 p0Var, n20.a aVar) {
        p0Var.d9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(final p0 p0Var, k10.v vVar) {
        vVar.c(fr.q0.c(uk2.w.class), new er.l() { // from class: uk2.j0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.R9(this.f198687a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: uk2.k0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.S9(this.f198697a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uk2.u.a.Screen.class), new er.l() { // from class: uk2.l0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.T9(this.f198699a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uk2.u.a.Dialog.class), new er.l() { // from class: uk2.m0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.U9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uk2.u.c.Screen.class), new er.l() { // from class: uk2.n0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.V9(this.f198702a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uk2.u.c.Dialog.class), new er.l() { // from class: uk2.o0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.W9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uk2.u.c.Error.class), new er.l() { // from class: uk2.e0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.X9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uk2.u.b.Screen.class), new er.l() { // from class: uk2.f0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Y9(this.f198676a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(p0 p0Var, k10.z zVar) {
        zVar.C(p0Var.new d(null));
        e eVar = p0Var.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ShowError.class), oVar, eVar);
        zVar.x(fr.q0.c(a.class), oVar, p0Var.new f(null));
        zVar.v(fr.q0.c(uk2.j.class), oVar, p0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(p0 p0Var, k10.z zVar) {
        h hVar = p0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.class), oVar, hVar);
        zVar.v(fr.q0.c(uk2.j.class), oVar, new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(p0 p0Var, k10.z zVar) {
        n nVar = p0Var.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.class), oVar, nVar);
        zVar.x(fr.q0.c(GoToMoreDialog.class), oVar, p0Var.new o(null));
        zVar.x(fr.q0.c(uk2.i.class), oVar, p0Var.new p(null));
        zVar.x(fr.q0.c(uk2.e.class), oVar, p0Var.new q(null));
        zVar.x(fr.q0.c(uk2.d.class), oVar, p0Var.new r(null));
        zVar.v(fr.q0.c(UpdateDocument.class), oVar, new s(null));
        zVar.x(fr.q0.c(uk2.m.class), oVar, p0Var.new t(null));
        zVar.x(fr.q0.c(uk2.q.class), oVar, p0Var.new u(null));
        zVar.x(fr.q0.c(uk2.l.class), oVar, p0Var.new v(null));
        zVar.x(fr.q0.c(uk2.f.class), oVar, p0Var.new j(null));
        zVar.x(fr.q0.c(uk2.g.class), oVar, p0Var.new k(null));
        zVar.x(fr.q0.c(uk2.b.class), oVar, p0Var.new l(null));
        zVar.v(fr.q0.c(ShowDialog.class), oVar, p0Var.new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(k10.z zVar) {
        w wVar = new w(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(uk2.c.class), oVar, wVar);
        zVar.v(fr.q0.c(a.class), oVar, new x(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(p0 p0Var, k10.z zVar) {
        zVar.C(p0Var.new y(null));
        z zVar2 = p0Var.new z(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ShowError.class), oVar, zVar2);
        zVar.x(fr.q0.c(ShowMaintenanceBreakDialog.class), oVar, p0Var.new a0(null));
        zVar.x(fr.q0.c(a.class), oVar, p0Var.new b0(null));
        zVar.v(fr.q0.c(uk2.r.class), oVar, p0Var.new c0(null));
        zVar.v(fr.q0.c(ShowDialog.class), oVar, p0Var.new d0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(k10.z zVar) {
        e0 e0Var = new e0(null);
        zVar.v(fr.q0.c(a.class), k10.o.CANCEL_PREVIOUS, e0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(k10.z zVar) {
        f0 f0Var = new f0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.class), oVar, f0Var);
        zVar.v(fr.q0.c(UpdateDocument.class), oVar, new g0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(p0 p0Var, k10.z zVar) {
        h0 h0Var = p0Var.new h0(null);
        zVar.x(fr.q0.c(a.class), k10.o.CANCEL_PREVIOUS, h0Var);
        zVar.C(p0Var.new i0(null));
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: I9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(uk2.k kVar, tq.e<? super oq.i0> eVar) {
        return super.F(kVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: P9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<uk2.k> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<uk2.u>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<uk2.x.a> getState() {
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
