package n42;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p024c42.e3;
import p071kotlin.Metadata;
import qx3.MakePaymentInitialData;
import t42.InstallmentsPaymentData;
import u42.MakePaymentsNavParams;
import x42.PaymentSummary;
import x42.PaymentsReminderDestinationParams;
import yr0.BEPaymentDetails;
import yr0.BEPaymentPackageSummary;
import yr0.BEPaymentReminder;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u009b\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\b\b\u0001\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0019\u00100\u001a\b\u0012\u0004\u0012\u00020/0.*\u00020-H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:J\u009b\u0001\u0010N\u001a\u00020M2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\b\u0010?\u001a\u0004\u0018\u00010=2\u0006\u0010@\u001a\u00020=2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\b\b\u0002\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020=2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020B0A2\b\b\u0002\u0010H\u001a\u00020D2\b\u0010I\u001a\u0004\u0018\u00010=2\u000e\b\u0002\u0010J\u001a\b\u0012\u0004\u0012\u00020B0A2\b\b\u0002\u0010K\u001a\u00020D2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020B0AH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020BH\u0016¢\u0006\u0004\bP\u0010QJ\u0018\u0010T\u001a\u00020B2\u0006\u0010S\u001a\u00020RH\u0096\u0001¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020BH\u0096\u0001¢\u0006\u0004\bV\u0010QJ\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0WH\u0096\u0001¢\u0006\u0004\bY\u0010ZJ\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0WH\u0096\u0001¢\u0006\u0004\b\\\u0010ZR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001f\u0010\u0084\u0001\u001a\u00020\u007f8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R,\u0010\u008e\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0089\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R&\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u008f\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bT\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R%\u00102\u001a\t\u0012\u0004\u0012\u0002030\u0095\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001c\u0010\u009b\u0001\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010W8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bk\u0010Z¨\u0006\u009c\u0001"}, d2 = {"Ln42/r0;", "Ll00/g;", "Ln42/q;", "Ln42/a;", "Ln42/r;", "", "Li70/n;", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Li70/e;", "globalSnackBarManager", "snackBarManagerStateHolder", "Ln42/t;", "mapper", "Les0/c;", "getPaymentDetailsUseCase", "Lr44/b;", "downloadTransactionConfirmationUC", "Lac4/a;", "callActionWithLoaderUseCase", "Les0/a;", "acceptInstantPaymentUseCase", "Les0/g;", "rejectInstantPaymentUseCase", "Les0/h;", "rejectStampDutyPaymentUC", "Ld62/a;", "downloadConfirmationMapper", "Lib4/c;", "genericDomainErrorMapper", "Lmx/c;", "labelProvider", "Loz/q;", "ownerViewLifecycleManager", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lhb4/d;", "errorVMSFactory", "Lcb4/j;", "dialogVMSFactory", "Ln42/b;", "setupData", "<init>", "(Lyy/a;Li70/e;Li70/n;Ln42/t;Les0/c;Lr44/b;Lac4/a;Les0/a;Les0/g;Les0/h;Ld62/a;Lib4/c;Lmx/c;Loz/q;La14/m;Lhb4/d;Lcb4/j;Ln42/b;)V", "Lyr0/e;", "", "Lx42/a;", "na", "(Lyr0/e;)Ljava/util/List;", "state", "Ln42/r$a;", "U9", "(Ln42/q;)Ln42/r$a;", "Ldx/b;", "domainError", "Lhb4/c;", "S9", "(Ldx/b;)Lhb4/c;", "Lcb4/h;", "dialogType", "Lmx/a;", "title", "description", "primaryButtonLabel", "Lkotlin/Function0;", "Loq/i0;", "primaryButtonOnClickAction", "Lcb4/a;", "primaryButtonState", "secondaryButtonLabel", "secondaryButtonOnClickAction", "secondaryButtonState", "tertiaryButtonLabel", "tertiaryButtonOnClickAction", "tertiaryButtonState", "onDismiss", "Lcb4/i;", "P9", "(Lcb4/h;Lmx/a;Lmx/a;Lmx/a;Ler/a;Lcb4/a;Lmx/a;Ler/a;Lcb4/a;Lmx/a;Ler/a;Lcb4/a;Ler/a;)Lcb4/i;", "close", "()V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Li70/e;", "c", "Li70/n;", "d", "Ln42/t;", "e", "Les0/c;", "f", "Lr44/b;", "g", "Lac4/a;", "h", "Les0/a;", "j", "Les0/g;", "k", "Les0/h;", "l", "Ld62/a;", "m", "Lib4/c;", "n", "Lmx/c;", "p", "Loz/q;", "q", "La14/m;", "r", "Lhb4/d;", "s", "Lcb4/j;", "t", "Ln42/b;", "Loz/j;", "v", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Ln42/d;", "w", "Ln42/d;", "initialState", "Lk10/t;", "x", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ln42/a$l;", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "z", "Lmu/p0;", "getState", "()Lmu/p0;", "Li70/p;", "snackBarVisibilityState", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r0 extends l00.g<n42.q, n42.a> implements n42.r, zx.d, i70.n, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n42.t mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final es0.c getPaymentDetailsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final r44.b downloadTransactionConfirmationUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final es0.a acceptInstantPaymentUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final es0.g rejectInstantPaymentUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final es0.h rejectStampDutyPaymentUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final d62.a downloadConfirmationMapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final PaymentsDetailsSetupData setupData;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Loading initialState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final k10.t<n42.q, n42.a> stateMachine;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final xw.b<n42.a.l> navAction;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<n42.r.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<n42.r.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f131550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f131551b;

        /* JADX INFO: renamed from: n42.r0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3264a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f131552a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r0 f131553b;

            /* JADX INFO: renamed from: n42.r0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3265a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f131554d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f131555e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f131556f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f131558h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f131559j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f131560k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f131561l;

                public C3265a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f131554d = obj;
                    this.f131555e |= PKIFailureInfo.systemUnavail;
                    return C3264a.this.F(null, this);
                }
            }

            public C3264a(mu.h hVar, r0 r0Var) {
                this.f131552a = hVar;
                this.f131553b = r0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3265a c3265a;
                if (eVar instanceof C3265a) {
                    c3265a = (C3265a) eVar;
                    int i15 = c3265a.f131555e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3265a.f131555e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3265a = new C3265a(eVar);
                    }
                } else {
                    c3265a = new C3265a(eVar);
                }
                Object obj2 = c3265a.f131554d;
                Object objE = uq.b.e();
                int i16 = c3265a.f131555e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f131552a;
                    n42.r.a aVarU9 = this.f131553b.U9((n42.q) obj);
                    c3265a.f131556f = vq.j.a(obj);
                    c3265a.f131558h = vq.j.a(c3265a);
                    c3265a.f131559j = vq.j.a(obj);
                    c3265a.f131560k = vq.j.a(hVar);
                    c3265a.f131561l = 0;
                    c3265a.f131555e = 1;
                    if (hVar.F(aVarU9, c3265a) == objE) {
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

        public a(mu.g gVar, r0 r0Var) {
            this.f131550a = gVar;
            this.f131551b = r0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super n42.r.a> hVar, tq.e eVar) {
            Object objA = this.f131550a.a(new C3264a(hVar, this.f131551b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$p;", "<unused var>", "Lk10/c0;", "Ln42/m;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<n42.a.p, k10.c0<Error>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131562e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131563f;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Rejecting O(Error error) {
            return new Rejecting(error.getItem(), error.getPaymentProcessSucceed(), error.getPaymentId(), error.getRefreshScreen());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131563f;
            uq.b.e();
            if (this.f131562e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.a0.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.p pVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            a0 a0Var = new a0(eVar);
            a0Var.f131563f = c0Var;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln42/a$c;", "<unused var>", "Ln42/q;", "state", "Loq/i0;", "<anonymous>", "(Ln42/a$c;Ln42/q;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<n42.a.c, n42.q, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131565f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n42.q qVar = (n42.q) this.f131565f;
            Object objE = uq.b.e();
            int i15 = this.f131564e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (qVar.getRefreshScreen()) {
                    r0.this.d9(n42.a.e.f131396a);
                } else {
                    xw.b<n42.a.l> bVarY1 = r0.this.Y1();
                    n42.a.l.C3262a c3262a = n42.a.l.C3262a.f131403a;
                    this.f131565f = vq.j.a(qVar);
                    this.f131564e = 1;
                    if (bVarY1.F(c3262a, this) == objE) {
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
        public final Object w(n42.a.c cVar, n42.q qVar, tq.e<? super oq.i0> eVar) {
            b bVar = r0.this.new b(eVar);
            bVar.f131565f = qVar;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ln42/p;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.p<k10.c0<Rejecting>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131567e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131568f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ln42/q$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends n42.q.a>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f131570e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r0 f131571f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Rejecting> f131572g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r0 r0Var, k10.c0<Rejecting> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f131571f = r0Var;
                this.f131572g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(k10.c0 c0Var, r0 r0Var, dx.b bVar, Rejecting rejecting) {
                return new Error(((Rejecting) c0Var.a()).getItem(), ((Rejecting) c0Var.a()).getPaymentProcessSucceed(), ((Rejecting) c0Var.a()).getPaymentId(), ((Rejecting) c0Var.a()).getRefreshScreen(), r0Var.S9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Displayed Y(Rejecting rejecting) {
                return new Displayed(rejecting.getItem(), rejecting.getPaymentProcessSucceed(), rejecting.getPaymentId(), true, null, 16, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f131570e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    es0.h hVar = this.f131571f.rejectStampDutyPaymentUC;
                    es0.h.Params params = new es0.h.Params(this.f131572g.a().getItem().getId());
                    this.f131570e = 1;
                    obj = hVar.c(params, this);
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
                final k10.c0<Rejecting> c0Var = this.f131572g;
                final r0 r0Var = this.f131571f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: n42.f1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r0.b0.a.X(c0Var, r0Var, bVar, (Rejecting) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                r0Var.d9(new n42.a.ShowGlobalSnackBarWithCloseIcon(r0Var.labelProvider.c(t32.b.B1)));
                r0Var.d9(n42.a.e.f131396a);
                return c0Var.d(new er.l() { // from class: n42.g1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r0.b0.a.Y((Rejecting) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f131571f, this.f131572g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends n42.q.a>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        b0(tq.e<? super b0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131568f;
            Object objE = uq.b.e();
            int i15 = this.f131567e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r0.this, c0Var, null);
            this.f131568f = vq.j.a(c0Var);
            this.f131567e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Rejecting> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            return ((b0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b0 b0Var = r0.this.new b0(eVar);
            b0Var.f131568f = obj;
            return b0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln42/a$e;", "<unused var>", "Ln42/q;", "Loq/i0;", "<anonymous>", "(Ln42/a$e;Ln42/q;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<n42.a.e, n42.q, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131573e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f131573e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n42.a.l> bVarY1 = r0.this.Y1();
                n42.a.l.b bVar = n42.a.l.b.f131404a;
                this.f131573e = 1;
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
        public final Object w(n42.a.e eVar, n42.q qVar, tq.e<? super oq.i0> eVar2) {
            return r0.this.new c(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$d;", "<unused var>", "Lk10/c0;", "Ln42/o;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<n42.a.d, k10.c0<Error>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131576f;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(k10.c0 c0Var, Error error) {
            return new Displayed(((Error) c0Var.a()).getItem(), ((Error) c0Var.a()).getPaymentProcessSucceed(), ((Error) c0Var.a()).getPaymentId(), ((Error) c0Var.a()).getRefreshScreen(), null, 16, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f131576f;
            uq.b.e();
            if (this.f131575e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.h1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.c0.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            c0 c0Var2 = new c0(eVar);
            c0Var2.f131576f = c0Var;
            return c0Var2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln42/a$q;", "action", "Ln42/q$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln42/a$q;Ln42/q$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<n42.a.ShowGlobalSnackBarNoIcon, n42.q.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131578f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n42.a.ShowGlobalSnackBarNoIcon showGlobalSnackBarNoIcon = (n42.a.ShowGlobalSnackBarNoIcon) this.f131578f;
            uq.b.e();
            if (this.f131577e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r0.this.globalSnackBarManager.y(new p50.a.Default(showGlobalSnackBarNoIcon.getMessageLabel(), false, null, 6, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.ShowGlobalSnackBarNoIcon showGlobalSnackBarNoIcon, n42.q.a aVar, tq.e<? super oq.i0> eVar) {
            d dVar = r0.this.new d(eVar);
            dVar.f131578f = showGlobalSnackBarNoIcon;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$p;", "<unused var>", "Lk10/c0;", "Ln42/o;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<n42.a.p, k10.c0<Error>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131581f;

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Rejecting O(Error error) {
            return new Rejecting(error.getItem(), error.getPaymentProcessSucceed(), error.getPaymentId(), error.getRefreshScreen());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131581f;
            uq.b.e();
            if (this.f131580e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.i1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.d0.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.p pVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            d0 d0Var = new d0(eVar);
            d0Var.f131581f = c0Var;
            return d0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln42/a$x;", "<unused var>", "Ln42/q$a;", "state", "Loq/i0;", "<anonymous>", "(Ln42/a$x;Ln42/q$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<n42.a.x, n42.q.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131583f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n42.q.a aVar = (n42.q.a) this.f131583f;
            Object objE = uq.b.e();
            int i15 = this.f131582e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n42.a.l> bVarY1 = r0.this.Y1();
                String id5 = aVar.getItem().getId();
                x42.c cVar = x42.c.DETAILS;
                List listNa = r0.this.na(aVar.getItem());
                String institutionId = aVar.getItem().getInstitutionId();
                List<yr0.a> listD = aVar.getItem().d();
                BEPaymentPackageSummary paymentPackageSummary = aVar.getItem().getPaymentPackageSummary();
                n42.a.l.ToPaymentReminderSummary toPaymentReminderSummary = new n42.a.l.ToPaymentReminderSummary(new PaymentsReminderDestinationParams(id5, cVar, listNa, paymentPackageSummary != null ? vq.b.f(paymentPackageSummary.getPaymentPackageId()) : null, institutionId, aVar.getItem().getInstitutionName(), listD));
                this.f131583f = vq.j.a(aVar);
                this.f131582e = 1;
                if (bVarY1.F(toPaymentReminderSummary, this) == objE) {
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
        public final Object w(n42.a.x xVar, n42.q.a aVar, tq.e<? super oq.i0> eVar) {
            e eVar2 = r0.this.new e(eVar);
            eVar2.f131583f = aVar;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln42/d;", "it", "Loq/i0;", "<anonymous>", "(Ln42/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.p<Loading, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131585e;

        e0(tq.e<? super e0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f131585e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r0.this.d9(n42.a.k.f131402a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Loading loading, tq.e<? super oq.i0> eVar) {
            return ((e0) v(loading, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return r0.this.new e0(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln42/a$y;", "<unused var>", "Ln42/q$a;", "state", "Loq/i0;", "<anonymous>", "(Ln42/a$y;Ln42/q$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<n42.a.y, n42.q.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131588f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n42.q.a aVar = (n42.q.a) this.f131588f;
            Object objE = uq.b.e();
            int i15 = this.f131587e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n42.a.l> bVarY1 = r0.this.Y1();
                n42.a.l.ToTransactions toTransactions = new n42.a.l.ToTransactions(aVar.getItem().getId());
                this.f131588f = vq.j.a(aVar);
                this.f131587e = 1;
                if (bVarY1.F(toTransactions, this) == objE) {
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
        public final Object w(n42.a.y yVar, n42.q.a aVar, tq.e<? super oq.i0> eVar) {
            f fVar = r0.this.new f(eVar);
            fVar.f131588f = aVar;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$k;", "<unused var>", "Lk10/c0;", "Ln42/d;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<n42.a.k, k10.c0<Loading>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f131590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f131591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f131592g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f131593h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ln42/q;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends n42.q>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f131595e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r0 f131596f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f131597g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<Loading> f131598h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r0 r0Var, String str, k10.c0<Loading> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f131596f = r0Var;
                this.f131597g = str;
                this.f131598h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(String str, r0 r0Var, dx.b bVar, Loading loading) {
                return new Error(loading.getPaymentProcessSucceed(), str, loading.getRefreshScreen(), r0Var.S9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Displayed Y(k10.c0 c0Var, BEPaymentDetails bEPaymentDetails, String str, Loading loading) {
                return new Displayed(bEPaymentDetails, ((Loading) c0Var.a()).getPaymentProcessSucceed(), str, ((Loading) c0Var.a()).getRefreshScreen(), null, 16, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f131595e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    es0.c cVar = this.f131596f.getPaymentDetailsUseCase;
                    es0.c.Params params = new es0.c.Params(this.f131597g);
                    this.f131595e = 1;
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
                final k10.c0<Loading> c0Var = this.f131598h;
                final String str = this.f131597g;
                final r0 r0Var = this.f131596f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: n42.k1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r0.f0.a.X(str, r0Var, bVar, (Loading) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BEPaymentDetails bEPaymentDetails = (BEPaymentDetails) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: n42.l1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r0.f0.a.Y(c0Var, bEPaymentDetails, str, (Loading) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f131596f, this.f131597g, this.f131598h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends n42.q>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error O(r0 r0Var, Loading loading) {
            return new Error(loading.getPaymentProcessSucceed(), loading.getPaymentId(), loading.getRefreshScreen(), r0Var.S9(new dx.b.Generic(null, 1, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f0 f0Var;
            k10.c0 c0Var = (k10.c0) this.f131593h;
            Object objE = uq.b.e();
            int i15 = this.f131592g;
            if (i15 == 0) {
                oq.u.b(obj);
                String paymentId = ((Loading) c0Var.a()).getPaymentId();
                if (paymentId != null) {
                    r0 r0Var = r0.this;
                    ac4.a aVar = r0Var.callActionWithLoaderUseCase;
                    a aVar2 = new a(r0Var, paymentId, c0Var, null);
                    this.f131593h = c0Var;
                    this.f131590e = vq.j.a(paymentId);
                    this.f131591f = 0;
                    this.f131592g = 1;
                    f0Var = this;
                    obj = ac4.a.a(aVar, null, aVar2, f0Var, 1, null);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    f0Var = this;
                }
                final r0 r0Var2 = r0.this;
                return c0Var.d(new er.l() { // from class: n42.j1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r0.f0.O(r0Var2, (Loading) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            f0Var = this;
            k10.l lVar = (k10.l) obj;
            if (lVar != null) {
                return lVar;
            }
            final r0 r0Var3 = r0.this;
            return c0Var.d(new er.l() { // from class: n42.j1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.f0.O(r0Var3, (Loading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.k kVar, k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            f0 f0Var = r0.this.new f0(eVar);
            f0Var.f131593h = c0Var;
            return f0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$o;", "<unused var>", "Lk10/c0;", "Ln42/q$a;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<n42.a.o, k10.c0<n42.q.a>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131600f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Rejecting O(String str, n42.q.a aVar) {
            return new Rejecting(aVar.getItem(), aVar.getPaymentProcessSucceed(), str, aVar.getRefreshScreen());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarD;
            k10.c0 c0Var = (k10.c0) this.f131600f;
            uq.b.e();
            if (this.f131599e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String paymentId = ((n42.q.a) c0Var.a()).getPaymentId();
            return (paymentId == null || (lVarD = c0Var.d(new er.l() { // from class: n42.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.g.O(paymentId, (q.a) obj2);
                }
            })) == null) ? c0Var.c() : lVarD;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.o oVar, k10.c0<n42.q.a> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            g gVar = new g(eVar);
            gVar.f131600f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln42/a$d;", "<unused var>", "Ln42/c;", "Loq/i0;", "<anonymous>", "(Ln42/a$d;Ln42/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.q<n42.a.d, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131601e;

        g0(tq.e<? super g0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f131601e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r0.this.d9(n42.a.c.f131394a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.d dVar, Error error, tq.e<? super oq.i0> eVar) {
            return r0.this.new g0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$n;", "<unused var>", "Lk10/c0;", "Ln42/q$a;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<n42.a.n, k10.c0<n42.q.a>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131604f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Rejecting O(String str, n42.q.a aVar) {
            return new Rejecting(aVar.getItem(), aVar.getPaymentProcessSucceed(), str, aVar.getRefreshScreen());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarD;
            k10.c0 c0Var = (k10.c0) this.f131604f;
            uq.b.e();
            if (this.f131603e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String paymentId = ((n42.q.a) c0Var.a()).getPaymentId();
            return (paymentId == null || (lVarD = c0Var.d(new er.l() { // from class: n42.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.h.O(paymentId, (q.a) obj2);
                }
            })) == null) ? c0Var.c() : lVarD;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.n nVar, k10.c0<n42.q.a> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            h hVar = new h(eVar);
            hVar.f131604f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$p;", "<unused var>", "Lk10/c0;", "Ln42/c;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.q<n42.a.p, k10.c0<Error>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131606f;

        h0(tq.e<? super h0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Error error) {
            return new Loading(error.getPaymentProcessSucceed(), error.getPaymentId(), error.getRefreshScreen());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131606f;
            uq.b.e();
            if (this.f131605e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.m1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.h0.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.p pVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            h0 h0Var = new h0(eVar);
            h0Var.f131606f = c0Var;
            return h0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln42/a$w;", "<unused var>", "Ln42/q$a;", "state", "Loq/i0;", "<anonymous>", "(Ln42/a$w;Ln42/q$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<n42.a.w, n42.q.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f131607e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f131608f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f131609g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f131610h;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n42.q.a aVar = (n42.q.a) this.f131610h;
            Object objE = uq.b.e();
            int i15 = this.f131609g;
            if (i15 == 0) {
                oq.u.b(obj);
                BEPaymentDetails item = aVar.getItem();
                xw.b<n42.a.l> bVarY1 = r0.this.Y1();
                String id5 = item.getId();
                List listE = pq.v.e(item.getId());
                String description = item.getDescription();
                BigDecimal amount = item.getAmount();
                String currency = item.getCurrency();
                String institutionId = item.getInstitutionId();
                List<yr0.a> listD = item.d();
                ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(h42.a.a((yr0.a) it.next()));
                }
                BEPaymentPackageSummary paymentPackageSummary = item.getPaymentPackageSummary();
                n42.a.l.ToMakePayments toMakePayments = new n42.a.l.ToMakePayments(new MakePaymentInitialData(arrayList, id5, listE, description, amount, currency, institutionId, item.getInstitutionName(), paymentPackageSummary != null ? vq.b.f(paymentPackageSummary.getPaymentPackageId()) : null, new MakePaymentsNavParams(new e3.Details(item.getId())), null, 1024, null));
                this.f131610h = vq.j.a(aVar);
                this.f131607e = vq.j.a(item);
                this.f131608f = 0;
                this.f131609g = 1;
                if (bVarY1.F(toMakePayments, this) == objE) {
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
        public final Object w(n42.a.w wVar, n42.q.a aVar, tq.e<? super oq.i0> eVar) {
            i iVar = r0.this.new i(eVar);
            iVar.f131610h = aVar;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ln42/l;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.p<k10.c0<Loading>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131613f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ln42/q$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends n42.q.a>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f131615e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r0 f131616f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Loading> f131617g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r0 r0Var, k10.c0<Loading> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f131616f = r0Var;
                this.f131617g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(k10.c0 c0Var, r0 r0Var, dx.b bVar, Loading loading) {
                return new Error(((Loading) c0Var.a()).getItem(), ((Loading) c0Var.a()).getPaymentProcessSucceed(), ((Loading) c0Var.a()).getPaymentId(), ((Loading) c0Var.a()).getRefreshScreen(), r0Var.S9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Displayed Y(k10.c0 c0Var, BEPaymentDetails bEPaymentDetails, Loading loading) {
                return new Displayed(bEPaymentDetails, ((Loading) c0Var.a()).getPaymentProcessSucceed(), ((Loading) c0Var.a()).getPaymentId(), ((Loading) c0Var.a()).getRefreshScreen(), null, 16, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f131615e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    es0.c cVar = this.f131616f.getPaymentDetailsUseCase;
                    es0.c.Params params = new es0.c.Params(this.f131617g.a().getPaymentId());
                    this.f131615e = 1;
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
                final k10.c0<Loading> c0Var = this.f131617g;
                final r0 r0Var = this.f131616f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: n42.n1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r0.i0.a.X(c0Var, r0Var, bVar, (Loading) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BEPaymentDetails bEPaymentDetails = (BEPaymentDetails) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: n42.o1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r0.i0.a.Y(c0Var, bEPaymentDetails, (Loading) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f131616f, this.f131617g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends n42.q.a>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        i0(tq.e<? super i0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131613f;
            Object objE = uq.b.e();
            int i15 = this.f131612e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r0.this, c0Var, null);
            this.f131613f = vq.j.a(c0Var);
            this.f131612e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            return ((i0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i0 i0Var = r0.this.new i0(eVar);
            i0Var.f131613f = obj;
            return i0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln42/a$j;", "action", "Ln42/q$a;", "state", "Loq/i0;", "<anonymous>", "(Ln42/a$j;Ln42/q$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<n42.a.InstallmentsPaymentAction, n42.q.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131619f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f131620g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n42.a.InstallmentsPaymentAction installmentsPaymentAction = (n42.a.InstallmentsPaymentAction) this.f131619f;
            n42.q.a aVar = (n42.q.a) this.f131620g;
            Object objE = uq.b.e();
            int i15 = this.f131618e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n42.a.l> bVarY1 = r0.this.Y1();
                n42.a.l.GoToInstallmentsPayment goToInstallmentsPayment = new n42.a.l.GoToInstallmentsPayment(new InstallmentsPaymentData(aVar.getItem().getId(), installmentsPaymentAction.getPaymentPackageId(), aVar.getItem().getInstitutionId(), aVar.getItem().getInstitutionName(), aVar.getItem().d()));
                this.f131619f = vq.j.a(installmentsPaymentAction);
                this.f131620g = vq.j.a(aVar);
                this.f131618e = 1;
                if (bVarY1.F(goToInstallmentsPayment, this) == objE) {
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
        public final Object w(n42.a.InstallmentsPaymentAction installmentsPaymentAction, n42.q.a aVar, tq.e<? super oq.i0> eVar) {
            j jVar = r0.this.new j(eVar);
            jVar.f131619f = installmentsPaymentAction;
            jVar.f131620g = aVar;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$d;", "<unused var>", "Lk10/c0;", "Ln42/k;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j0 extends vq.k implements er.q<n42.a.d, k10.c0<Error>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131623f;

        j0(tq.e<? super j0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(k10.c0 c0Var, Error error) {
            return new Displayed(((Error) c0Var.a()).getItem(), ((Error) c0Var.a()).getPaymentProcessSucceed(), ((Error) c0Var.a()).getPaymentId(), ((Error) c0Var.a()).getRefreshScreen(), null, 16, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f131623f;
            uq.b.e();
            if (this.f131622e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.p1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.j0.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            j0 j0Var = new j0(eVar);
            j0Var.f131623f = c0Var;
            return j0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$g;", "action", "Lk10/c0;", "Ln42/q$a;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<n42.a.DownloadReceiptAction, k10.c0<n42.q.a>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131625f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f131626g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Downloading O(n42.a.DownloadReceiptAction downloadReceiptAction, n42.q.a aVar) {
            return new Downloading(aVar.getItem(), aVar.getPaymentProcessSucceed(), downloadReceiptAction.getPaymentId(), aVar.getRefreshScreen());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final n42.a.DownloadReceiptAction downloadReceiptAction = (n42.a.DownloadReceiptAction) this.f131625f;
            k10.c0 c0Var = (k10.c0) this.f131626g;
            uq.b.e();
            if (this.f131624e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.k.O(downloadReceiptAction, (q.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.DownloadReceiptAction downloadReceiptAction, k10.c0<n42.q.a> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            k kVar = new k(eVar);
            kVar.f131625f = downloadReceiptAction;
            kVar.f131626g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$p;", "<unused var>", "Lk10/c0;", "Ln42/k;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k0 extends vq.k implements er.q<n42.a.p, k10.c0<Error>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131628f;

        k0(tq.e<? super k0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Error error) {
            return new Loading(error.getItem(), error.getPaymentProcessSucceed(), error.getPaymentId(), error.getRefreshScreen());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131628f;
            uq.b.e();
            if (this.f131627e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.q1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.k0.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.p pVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            k0 k0Var = new k0(eVar);
            k0Var.f131628f = c0Var;
            return k0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln42/a$h;", "<unused var>", "Ln42/q$a;", "Loq/i0;", "<anonymous>", "(Ln42/a$h;Ln42/q$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<n42.a.h, n42.q.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131629e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f131629e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = r0.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            r0 r0Var = r0.this;
            if (iVarA instanceof dx.i.Left) {
                r0Var.d9(new n42.a.ShowSnackBarWithCloseIcon(r0Var.downloadConfirmationMapper.a()));
            }
            r0.this.d9(n42.a.f.f131397a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.h hVar, n42.q.a aVar, tq.e<? super oq.i0> eVar) {
            return r0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ln42/g;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l0 extends vq.k implements er.p<k10.c0<Downloading>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131632f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f131634a;

            static {
                int[] iArr = new int[r44.b.EnumC4371b.values().length];
                try {
                    iArr[r44.b.EnumC4371b.OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r44.b.EnumC4371b.FILE_NOT_SAVED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[r44.b.EnumC4371b.NOT_PERMISSION_GRANTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[r44.b.EnumC4371b.NOT_PERMISSION_GRANTED_GO_TO_SETTINGS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f131634a = iArr;
            }
        }

        l0(tq.e<? super l0> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error V(k10.c0 c0Var, r0 r0Var, dx.b bVar, Downloading downloading) {
            return new Error(((Downloading) c0Var.a()).getItem(), ((Downloading) c0Var.a()).getPaymentProcessSucceed(), ((Downloading) c0Var.a()).getPaymentId(), ((Downloading) c0Var.a()).getRefreshScreen(), r0Var.S9(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed X(k10.c0 c0Var, Downloading downloading) {
            return new Displayed(((Downloading) c0Var.a()).getItem(), ((Downloading) c0Var.a()).getPaymentProcessSucceed(), ((Downloading) c0Var.a()).getPaymentId(), ((Downloading) c0Var.a()).getRefreshScreen(), null, 16, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f131632f;
            Object objE = uq.b.e();
            int i15 = this.f131631e;
            if (i15 == 0) {
                oq.u.b(obj);
                r44.b bVar = r0.this.downloadTransactionConfirmationUC;
                r44.b.a.Payments payments = new r44.b.a.Payments(((Downloading) c0Var.a()).getPaymentId());
                this.f131632f = c0Var;
                this.f131631e = 1;
                obj = bVar.c(payments, this);
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
            final r0 r0Var = r0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: n42.r1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r0.l0.V(c0Var, r0Var, bVar2, (Downloading) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            r44.b.EnumC4371b enumC4371b = (r44.b.EnumC4371b) ((dx.i.Right) iVar).b();
            int i16 = a.f131634a[enumC4371b.ordinal()];
            if (i16 == 1) {
                r0Var.d9(new n42.a.ShowSnackBarNoIcon(r0Var.downloadConfirmationMapper.b(enumC4371b)));
            } else if (i16 == 2 || i16 == 3) {
                r0Var.d9(new n42.a.ShowSnackBarWithCloseIcon(r0Var.downloadConfirmationMapper.b(enumC4371b)));
            } else {
                if (i16 != 4) {
                    throw new oq.p();
                }
                r0Var.d9(n42.a.m.f131409a);
            }
            return c0Var.d(new er.l() { // from class: n42.s1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.l0.X(c0Var, (Downloading) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Downloading> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            return ((l0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            l0 l0Var = r0.this.new l0(eVar);
            l0Var.f131632f = obj;
            return l0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln42/a$b;", "action", "Ln42/q$a;", "state", "Loq/i0;", "<anonymous>", "(Ln42/a$b;Ln42/q$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<n42.a.ButtonClick, n42.q.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131636f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f131637g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f131639a;

            static {
                int[] iArr = new int[yr0.c.values().length];
                try {
                    iArr[yr0.c.START_PAYMENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yr0.c.DOWNLOAD_CONFIRMATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[yr0.c.CHOOSE_INSTALLMENTS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[yr0.c.ACCEPT_INSTANT_PAYMENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[yr0.c.REJECT_INSTANT_PAYMENT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[yr0.c.WITHDRAW_PAYMENT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[yr0.c.UNKNOWN.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f131639a = iArr;
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n42.a.ButtonClick buttonClick = (n42.a.ButtonClick) this.f131636f;
            n42.q.a aVar = (n42.q.a) this.f131637g;
            uq.b.e();
            if (this.f131635e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            BEPaymentDetails item = aVar.getItem();
            r0 r0Var = r0.this;
            switch (a.f131639a[buttonClick.getAvailableOperation().ordinal()]) {
                case 1:
                    if (aVar.getItem().getReminder() == null) {
                        r0Var.d9(n42.a.w.f131419a);
                    } else {
                        r0Var.d9(n42.a.x.f131420a);
                    }
                    break;
                case 2:
                    r0Var.d9(new n42.a.DownloadReceiptAction(item.getId()));
                    break;
                case 3:
                    BEPaymentPackageSummary paymentPackageSummary = item.getPaymentPackageSummary();
                    if (paymentPackageSummary != null) {
                        r0Var.d9(new n42.a.InstallmentsPaymentAction(paymentPackageSummary.getPaymentPackageId()));
                    }
                    break;
                case 4:
                    r0Var.d9(n42.a.C3261a.f131392a);
                    break;
                case 5:
                    r0Var.d9(n42.a.s.f131415a);
                    break;
                case 6:
                    r0Var.d9(n42.a.t.f131416a);
                    break;
                case 7:
                    r0Var.d9(n42.a.c.f131394a);
                    break;
                default:
                    throw new oq.p();
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.ButtonClick buttonClick, n42.q.a aVar, tq.e<? super oq.i0> eVar) {
            m mVar = r0.this.new m(eVar);
            mVar.f131636f = buttonClick;
            mVar.f131637g = aVar;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$d;", "<unused var>", "Lk10/c0;", "Ln42/h;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m0 extends vq.k implements er.q<n42.a.d, k10.c0<Error>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131641f;

        m0(tq.e<? super m0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(k10.c0 c0Var, Error error) {
            return new Displayed(((Error) c0Var.a()).getItem(), ((Error) c0Var.a()).getPaymentProcessSucceed(), ((Error) c0Var.a()).getPaymentId(), ((Error) c0Var.a()).getRefreshScreen(), null, 16, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f131641f;
            uq.b.e();
            if (this.f131640e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.t1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.m0.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            m0 m0Var = new m0(eVar);
            m0Var.f131641f = c0Var;
            return m0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln42/a$i;", "<unused var>", "Ln42/q$a;", "Loq/i0;", "<anonymous>", "(Ln42/a$i;Ln42/q$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<n42.a.i, n42.q.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131642e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f131642e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r0.this.B0();
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.i iVar, n42.q.a aVar, tq.e<? super oq.i0> eVar) {
            return r0.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$p;", "<unused var>", "Lk10/c0;", "Ln42/h;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n0 extends vq.k implements er.q<n42.a.p, k10.c0<Error>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131645f;

        n0(tq.e<? super n0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Downloading O(Error error) {
            return new Downloading(error.getItem(), error.getPaymentProcessSucceed(), error.getPaymentId(), error.getRefreshScreen());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131645f;
            uq.b.e();
            if (this.f131644e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.u1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.n0.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.p pVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            n0 n0Var = new n0(eVar);
            n0Var.f131645f = c0Var;
            return n0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln42/a$v;", "action", "Ln42/q$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln42/a$v;Ln42/q$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<n42.a.ShowSnackBarWithCloseIcon, n42.q.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131647f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n42.a.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon = (n42.a.ShowSnackBarWithCloseIcon) this.f131647f;
            uq.b.e();
            if (this.f131646e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r0.this.snackBarManagerStateHolder.y(new p50.a.DefaultWithIcon(showSnackBarWithCloseIcon.getMessageLabel(), false, null, null, 14, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon, n42.q.a aVar, tq.e<? super oq.i0> eVar) {
            o oVar = r0.this.new o(eVar);
            oVar.f131647f = showSnackBarWithCloseIcon;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ln42/e;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o0 extends vq.k implements er.p<k10.c0<Accepting>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131650f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ln42/q$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends n42.q.a>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f131652e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r0 f131653f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Accepting> f131654g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r0 r0Var, k10.c0<Accepting> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f131653f = r0Var;
                this.f131654g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(r0 r0Var, dx.b bVar, Accepting accepting) {
                return new Error(accepting.getItem(), accepting.getPaymentProcessSucceed(), accepting.getPaymentId(), accepting.getRefreshScreen(), r0Var.S9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Displayed Y(Accepting accepting) {
                return new Displayed(accepting.getItem(), accepting.getPaymentProcessSucceed(), accepting.getPaymentId(), true, null, 16, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f131652e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    es0.a aVar = this.f131653f.acceptInstantPaymentUseCase;
                    es0.a.Params params = new es0.a.Params(this.f131654g.a().getItem().getId());
                    this.f131652e = 1;
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
                k10.c0<Accepting> c0Var = this.f131654g;
                final r0 r0Var = this.f131653f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: n42.v1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r0.o0.a.X(r0Var, bVar, (Accepting) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                r0Var.d9(n42.a.w.f131419a);
                return c0Var.d(new er.l() { // from class: n42.w1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r0.o0.a.Y((Accepting) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f131653f, this.f131654g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends n42.q.a>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        o0(tq.e<? super o0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131650f;
            Object objE = uq.b.e();
            int i15 = this.f131649e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r0.this, c0Var, null);
            this.f131650f = vq.j.a(c0Var);
            this.f131649e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Accepting> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            return ((o0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            o0 o0Var = r0.this.new o0(eVar);
            o0Var.f131650f = obj;
            return o0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln42/a$r;", "action", "Ln42/q$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln42/a$r;Ln42/q$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<n42.a.ShowGlobalSnackBarWithCloseIcon, n42.q.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131656f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n42.a.ShowGlobalSnackBarWithCloseIcon showGlobalSnackBarWithCloseIcon = (n42.a.ShowGlobalSnackBarWithCloseIcon) this.f131656f;
            uq.b.e();
            if (this.f131655e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r0.this.globalSnackBarManager.y(new p50.a.DefaultWithIcon(showGlobalSnackBarWithCloseIcon.getMessageLabel(), false, null, null, 14, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.ShowGlobalSnackBarWithCloseIcon showGlobalSnackBarWithCloseIcon, n42.q.a aVar, tq.e<? super oq.i0> eVar) {
            p pVar = r0.this.new p(eVar);
            pVar.f131656f = showGlobalSnackBarWithCloseIcon;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$d;", "<unused var>", "Lk10/c0;", "Ln42/f;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p0 extends vq.k implements er.q<n42.a.d, k10.c0<Error>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131659f;

        p0(tq.e<? super p0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(k10.c0 c0Var, Error error) {
            return new Displayed(((Error) c0Var.a()).getItem(), ((Error) c0Var.a()).getPaymentProcessSucceed(), ((Error) c0Var.a()).getPaymentId(), ((Error) c0Var.a()).getRefreshScreen(), null, 16, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f131659f;
            uq.b.e();
            if (this.f131658e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.x1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.p0.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            p0 p0Var = new p0(eVar);
            p0Var.f131659f = c0Var;
            return p0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln42/a$u;", "action", "Ln42/q$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln42/a$u;Ln42/q$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<n42.a.ShowSnackBarNoIcon, n42.q.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131661f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n42.a.ShowSnackBarNoIcon showSnackBarNoIcon = (n42.a.ShowSnackBarNoIcon) this.f131661f;
            uq.b.e();
            if (this.f131660e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r0.this.snackBarManagerStateHolder.y(new p50.a.Default(showSnackBarNoIcon.getMessageLabel(), false, null, 6, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.ShowSnackBarNoIcon showSnackBarNoIcon, n42.q.a aVar, tq.e<? super oq.i0> eVar) {
            q qVar = r0.this.new q(eVar);
            qVar.f131661f = showSnackBarNoIcon;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$p;", "<unused var>", "Lk10/c0;", "Ln42/f;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q0 extends vq.k implements er.q<n42.a.p, k10.c0<Error>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131664f;

        q0(tq.e<? super q0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Accepting O(Error error) {
            return new Accepting(error.getItem(), error.getPaymentProcessSucceed(), error.getPaymentId(), error.getRefreshScreen());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131664f;
            uq.b.e();
            if (this.f131663e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.y1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.q0.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.p pVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            q0 q0Var = new q0(eVar);
            q0Var.f131664f = c0Var;
            return q0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Ln42/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Ln42/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<nx.a, Displayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131666f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f131666f;
            uq.b.e();
            if (this.f131665e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == nx.a.STARTED) {
                r0.this.d9(n42.a.k.f131402a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, Displayed displayed, tq.e<? super oq.i0> eVar) {
            r rVar = r0.this.new r(eVar);
            rVar.f131666f = aVar;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$k;", "<unused var>", "Lk10/c0;", "Ln42/i;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<n42.a.k, k10.c0<Displayed>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131669f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Displayed displayed) {
            return new Loading(displayed.getItem(), displayed.getPaymentProcessSucceed(), displayed.getPaymentId(), displayed.getRefreshScreen());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131669f;
            uq.b.e();
            if (this.f131668e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.s.O((Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.k kVar, k10.c0<Displayed> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            s sVar = new s(eVar);
            sVar.f131669f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$a;", "<unused var>", "Lk10/c0;", "Ln42/i;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<n42.a.C3261a, k10.c0<Displayed>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131671f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Accepting O(Displayed displayed) {
            return new Accepting(displayed.getItem(), displayed.getPaymentProcessSucceed(), displayed.getPaymentId(), displayed.getRefreshScreen());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131671f;
            uq.b.e();
            if (this.f131670e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.t.O((Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.C3261a c3261a, k10.c0<Displayed> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            t tVar = new t(eVar);
            tVar.f131671f = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$m;", "<unused var>", "Lk10/c0;", "Ln42/i;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<n42.a.m, k10.c0<Displayed>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131673f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(r0 r0Var, Displayed displayed) {
            Label labelC = r0Var.labelProvider.c(t32.b.f187444c2);
            Label labelC2 = r0Var.labelProvider.c(t32.b.f187440b2);
            cb4.h.b bVar = cb4.h.b.f24985a;
            Label labelC3 = r0Var.labelProvider.c(t32.b.Y1);
            er.a aVarB9 = r0Var.b9(n42.a.h.f131399a);
            Label labelC4 = r0Var.labelProvider.c(t32.b.Z1);
            n42.a.f fVar = n42.a.f.f131397a;
            return Displayed.c(displayed, null, false, null, false, r0.Q9(r0Var, bVar, labelC, labelC2, labelC3, aVarB9, null, labelC4, r0Var.b9(fVar), null, null, null, null, r0Var.b9(fVar), 3360, null), 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131673f;
            uq.b.e();
            if (this.f131672e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final r0 r0Var = r0.this;
            return c0Var.b(new er.l() { // from class: n42.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.u.O(r0Var, (Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.m mVar, k10.c0<Displayed> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            u uVar = r0.this.new u(eVar);
            uVar.f131673f = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$s;", "<unused var>", "Lk10/c0;", "Ln42/i;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<n42.a.s, k10.c0<Displayed>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131676f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(r0 r0Var, Displayed displayed) {
            Label labelC = r0Var.labelProvider.c(t32.b.I0);
            Label labelC2 = r0Var.labelProvider.c(t32.b.H0);
            cb4.h.b bVar = cb4.h.b.f24985a;
            Label labelC3 = r0Var.labelProvider.c(t32.b.f187487r);
            er.a aVarB9 = r0Var.b9(n42.a.n.f131410a);
            cb4.a.C0668a c0668a = cb4.a.C0668a.f24967a;
            Label labelC4 = r0Var.labelProvider.c(t32.b.f187437b);
            n42.a.f fVar = n42.a.f.f131397a;
            return Displayed.c(displayed, null, false, null, false, r0.Q9(r0Var, bVar, labelC, labelC2, labelC3, aVarB9, c0668a, labelC4, r0Var.b9(fVar), null, null, null, null, r0Var.b9(fVar), 3328, null), 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131676f;
            uq.b.e();
            if (this.f131675e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final r0 r0Var = r0.this;
            return c0Var.b(new er.l() { // from class: n42.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.v.O(r0Var, (Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.s sVar, k10.c0<Displayed> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            v vVar = r0.this.new v(eVar);
            vVar.f131676f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$t;", "<unused var>", "Lk10/c0;", "Ln42/i;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<n42.a.t, k10.c0<Displayed>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131679f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(r0 r0Var, Displayed displayed) {
            Label labelC = r0Var.labelProvider.c(t32.b.A1);
            cb4.h.b bVar = cb4.h.b.f24985a;
            Label labelC2 = r0Var.labelProvider.c(t32.b.f187513z1);
            er.a aVarB9 = r0Var.b9(n42.a.o.f131411a);
            cb4.a.C0668a c0668a = cb4.a.C0668a.f24967a;
            Label labelC3 = r0Var.labelProvider.c(t32.b.f187490s);
            n42.a.f fVar = n42.a.f.f131397a;
            return Displayed.c(displayed, null, false, null, false, r0.Q9(r0Var, bVar, labelC, null, labelC2, aVarB9, c0668a, labelC3, r0Var.b9(fVar), null, null, null, null, r0Var.b9(fVar), 3328, null), 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131679f;
            uq.b.e();
            if (this.f131678e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final r0 r0Var = r0.this;
            return c0Var.b(new er.l() { // from class: n42.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.w.O(r0Var, (Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.t tVar, k10.c0<Displayed> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            w wVar = r0.this.new w(eVar);
            wVar.f131679f = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$f;", "<unused var>", "Lk10/c0;", "Ln42/i;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<n42.a.f, k10.c0<Displayed>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131682f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(Displayed displayed) {
            return Displayed.c(displayed, null, false, null, false, null, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131682f;
            uq.b.e();
            if (this.f131681e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n42.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.x.O((Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.f fVar, k10.c0<Displayed> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            x xVar = new x(eVar);
            xVar.f131682f = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ln42/n;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.p<k10.c0<Rejecting>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131684f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ln42/q$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends n42.q.a>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f131686e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r0 f131687f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Rejecting> f131688g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r0 r0Var, k10.c0<Rejecting> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f131687f = r0Var;
                this.f131688g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(r0 r0Var, dx.b bVar, Rejecting rejecting) {
                return new Error(rejecting.getItem(), rejecting.getPaymentProcessSucceed(), rejecting.getPaymentId(), rejecting.getRefreshScreen(), r0Var.S9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Displayed Y(Rejecting rejecting) {
                return new Displayed(rejecting.getItem(), rejecting.getPaymentProcessSucceed(), rejecting.getPaymentId(), true, null, 16, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f131686e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    es0.g gVar = this.f131687f.rejectInstantPaymentUseCase;
                    es0.g.Params params = new es0.g.Params(this.f131688g.a().getItem().getId());
                    this.f131686e = 1;
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
                k10.c0<Rejecting> c0Var = this.f131688g;
                final r0 r0Var = this.f131687f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: n42.b1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r0.y.a.X(r0Var, bVar, (Rejecting) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                r0Var.d9(new n42.a.ShowGlobalSnackBarNoIcon(r0Var.labelProvider.c(t32.b.J0)));
                r0Var.d9(n42.a.e.f131396a);
                return c0Var.d(new er.l() { // from class: n42.c1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r0.y.a.Y((Rejecting) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f131687f, this.f131688g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends n42.q.a>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        y(tq.e<? super y> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f131684f;
            Object objE = uq.b.e();
            int i15 = this.f131683e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r0.this, c0Var, null);
            this.f131684f = vq.j.a(c0Var);
            this.f131683e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Rejecting> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            return ((y) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            y yVar = r0.this.new y(eVar);
            yVar.f131684f = obj;
            return yVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln42/a$d;", "<unused var>", "Lk10/c0;", "Ln42/m;", "state", "Lk10/l;", "Ln42/q;", "<anonymous>", "(Ln42/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<n42.a.d, k10.c0<Error>, tq.e<? super k10.l<? extends n42.q>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131690f;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(k10.c0 c0Var, Error error) {
            return new Displayed(((Error) c0Var.a()).getItem(), ((Error) c0Var.a()).getPaymentProcessSucceed(), ((Error) c0Var.a()).getPaymentId(), ((Error) c0Var.a()).getRefreshScreen(), null, 16, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f131690f;
            uq.b.e();
            if (this.f131689e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n42.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.z.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n42.a.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends n42.q>> eVar) {
            z zVar = new z(eVar);
            zVar.f131690f = c0Var;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public r0(yy.a aVar, i70.e eVar, i70.n nVar, n42.t tVar, es0.c cVar, r44.b bVar, ac4.a aVar2, es0.a aVar3, es0.g gVar, es0.h hVar, d62.a aVar4, ib4.c cVar2, mx.c cVar3, oz.q qVar, a14.m mVar, hb4.d dVar, cb4.j jVar, PaymentsDetailsSetupData paymentsDetailsSetupData) {
        this.globalSnackBarManager = eVar;
        this.snackBarManagerStateHolder = nVar;
        this.mapper = tVar;
        this.getPaymentDetailsUseCase = cVar;
        this.downloadTransactionConfirmationUC = bVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.acceptInstantPaymentUseCase = aVar3;
        this.rejectInstantPaymentUseCase = gVar;
        this.rejectStampDutyPaymentUC = hVar;
        this.downloadConfirmationMapper = aVar4;
        this.genericDomainErrorMapper = cVar2;
        this.labelProvider = cVar3;
        this.ownerViewLifecycleManager = qVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.errorVMSFactory = dVar;
        this.dialogVMSFactory = jVar;
        this.setupData = paymentsDetailsSetupData;
        this.lifecycleConnector = qVar;
        Loading loading = new Loading(false, paymentsDetailsSetupData.getData().getPaymentId(), paymentsDetailsSetupData.getData().getRefreshScreen());
        this.initialState = loading;
        this.stateMachine = aVar.a(loading, new er.l() { // from class: n42.h0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.X9(this.f131460a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), U9(loading));
    }

    private final cb4.i P9(cb4.h dialogType, Label title, Label description, Label primaryButtonLabel, er.a<oq.i0> primaryButtonOnClickAction, cb4.a primaryButtonState, Label secondaryButtonLabel, er.a<oq.i0> secondaryButtonOnClickAction, cb4.a secondaryButtonState, Label tertiaryButtonLabel, er.a<oq.i0> tertiaryButtonOnClickAction, cb4.a tertiaryButtonState, er.a<oq.i0> onDismiss) {
        return this.dialogVMSFactory.a(new DialogData(dialogType, title, description, new DialogButtonTextData(primaryButtonLabel, primaryButtonState, primaryButtonOnClickAction), new DialogButtonTextData(secondaryButtonLabel, secondaryButtonState, secondaryButtonOnClickAction), tertiaryButtonLabel != null ? new DialogButtonTextData(tertiaryButtonLabel, tertiaryButtonState, tertiaryButtonOnClickAction) : null, onDismiss));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ cb4.i Q9(r0 r0Var, cb4.h hVar, Label label, Label label2, Label label3, er.a aVar, cb4.a aVar2, Label label4, er.a aVar3, cb4.a aVar4, Label label5, er.a aVar5, cb4.a aVar6, er.a aVar7, int i15, Object obj) {
        return r0Var.P9(hVar, label, label2, label3, aVar, (i15 & 32) != 0 ? cb4.a.c.f24969a : aVar2, label4, aVar3, (i15 & 256) != 0 ? cb4.a.c.f24969a : aVar4, label5, (i15 & 1024) != 0 ? new er.a() { // from class: n42.g0
            @Override // er.a
            public final Object a() {
                return r0.R9();
            }
        } : aVar5, (i15 & 2048) != 0 ? cb4.a.c.f24969a : aVar6, aVar7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c S9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: n42.f0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.T9(this.f131447a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(r0 r0Var, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                r0Var.d9(n42.a.p.f131412a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                r0Var.d9(n42.a.d.f131395a);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n42.r.a U9(n42.q state) {
        return this.mapper.b(new n42.t.Params(state, b9(n42.a.c.f131394a), new er.l() { // from class: n42.y
            @Override // er.l
            public final Object b(Object obj) {
                return r0.V9(this.f131723a, (yr0.c) obj);
            }
        }, b9(n42.a.i.f131400a), b9(n42.a.y.f131421a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(r0 r0Var, yr0.c cVar) {
        r0Var.d9(new n42.a.ButtonClick(cVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(final r0 r0Var, k10.v vVar) {
        vVar.c(fr.q0.c(n42.q.class), new er.l() { // from class: n42.i0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.Y9(this.f131467a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Loading.class), new er.l() { // from class: n42.o0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.Z9(this.f131504a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: n42.p0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.fa(this.f131511a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Loading.class), new er.l() { // from class: n42.q0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.ga(this.f131513a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: n42.z
            @Override // er.l
            public final Object b(Object obj) {
                return r0.ha((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Downloading.class), new er.l() { // from class: n42.a0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.ia(this.f131422a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: n42.b0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.ja((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Accepting.class), new er.l() { // from class: n42.c0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.ka(this.f131432a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: n42.d0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.la((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(n42.q.a.class), new er.l() { // from class: n42.e0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.ma(this.f131441a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Displayed.class), new er.l() { // from class: n42.j0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.aa(this.f131468a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Rejecting.class), new er.l() { // from class: n42.k0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.ba(this.f131475a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: n42.l0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.ca((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Rejecting.class), new er.l() { // from class: n42.m0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.da(this.f131491a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: n42.n0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.ea((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(r0 r0Var, k10.z zVar) {
        b bVar = r0Var.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(n42.a.c.class), oVar, bVar);
        zVar.x(fr.q0.c(n42.a.e.class), oVar, r0Var.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(r0 r0Var, k10.z zVar) {
        zVar.C(r0Var.new e0(null));
        f0 f0Var = r0Var.new f0(null);
        zVar.v(fr.q0.c(n42.a.k.class), k10.o.CANCEL_PREVIOUS, f0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(r0 r0Var, k10.z zVar) {
        k10.k.s(zVar, r0Var.x8(), null, r0Var.new r(null), 2, null);
        s sVar = new s(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(n42.a.k.class), oVar, sVar);
        zVar.v(fr.q0.c(n42.a.C3261a.class), oVar, new t(null));
        zVar.v(fr.q0.c(n42.a.m.class), oVar, r0Var.new u(null));
        zVar.v(fr.q0.c(n42.a.s.class), oVar, r0Var.new v(null));
        zVar.v(fr.q0.c(n42.a.t.class), oVar, r0Var.new w(null));
        zVar.v(fr.q0.c(n42.a.f.class), oVar, new x(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(r0 r0Var, k10.z zVar) {
        zVar.A(r0Var.new y(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(k10.z zVar) {
        z zVar2 = new z(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(n42.a.d.class), oVar, zVar2);
        zVar.v(fr.q0.c(n42.a.p.class), oVar, new a0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(r0 r0Var, k10.z zVar) {
        zVar.A(r0Var.new b0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(k10.z zVar) {
        c0 c0Var = new c0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(n42.a.d.class), oVar, c0Var);
        zVar.v(fr.q0.c(n42.a.p.class), oVar, new d0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(r0 r0Var, k10.z zVar) {
        g0 g0Var = r0Var.new g0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(n42.a.d.class), oVar, g0Var);
        zVar.v(fr.q0.c(n42.a.p.class), oVar, new h0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(r0 r0Var, k10.z zVar) {
        zVar.A(r0Var.new i0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(k10.z zVar) {
        j0 j0Var = new j0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(n42.a.d.class), oVar, j0Var);
        zVar.v(fr.q0.c(n42.a.p.class), oVar, new k0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(r0 r0Var, k10.z zVar) {
        zVar.A(r0Var.new l0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(k10.z zVar) {
        m0 m0Var = new m0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(n42.a.d.class), oVar, m0Var);
        zVar.v(fr.q0.c(n42.a.p.class), oVar, new n0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ka(r0 r0Var, k10.z zVar) {
        zVar.A(r0Var.new o0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 la(k10.z zVar) {
        p0 p0Var = new p0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(n42.a.d.class), oVar, p0Var);
        zVar.v(fr.q0.c(n42.a.p.class), oVar, new q0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ma(r0 r0Var, k10.z zVar) {
        i iVar = r0Var.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(n42.a.w.class), oVar, iVar);
        zVar.x(fr.q0.c(n42.a.InstallmentsPaymentAction.class), oVar, r0Var.new j(null));
        zVar.v(fr.q0.c(n42.a.DownloadReceiptAction.class), oVar, new k(null));
        zVar.x(fr.q0.c(n42.a.h.class), oVar, r0Var.new l(null));
        zVar.x(fr.q0.c(n42.a.ButtonClick.class), oVar, r0Var.new m(null));
        zVar.x(fr.q0.c(n42.a.i.class), oVar, r0Var.new n(null));
        zVar.x(fr.q0.c(n42.a.ShowSnackBarWithCloseIcon.class), oVar, r0Var.new o(null));
        zVar.x(fr.q0.c(n42.a.ShowGlobalSnackBarWithCloseIcon.class), oVar, r0Var.new p(null));
        zVar.x(fr.q0.c(n42.a.ShowSnackBarNoIcon.class), oVar, r0Var.new q(null));
        zVar.x(fr.q0.c(n42.a.ShowGlobalSnackBarNoIcon.class), oVar, r0Var.new d(null));
        zVar.x(fr.q0.c(n42.a.x.class), oVar, r0Var.new e(null));
        zVar.x(fr.q0.c(n42.a.y.class), oVar, r0Var.new f(null));
        zVar.v(fr.q0.c(n42.a.o.class), oVar, new g(null));
        zVar.v(fr.q0.c(n42.a.n.class), oVar, new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PaymentSummary> na(BEPaymentDetails bEPaymentDetails) {
        PaymentSummary paymentSummary = new PaymentSummary(bEPaymentDetails.getId(), bEPaymentDetails.getTitle(), bEPaymentDetails.getAmount(), bEPaymentDetails.getCurrency(), x42.b.PAYMENT);
        BEPaymentReminder reminder = bEPaymentDetails.getReminder();
        return pq.v.s(paymentSummary, reminder != null ? new PaymentSummary(reminder.getId(), reminder.getDescription(), reminder.getAmount(), bEPaymentDetails.getCurrency(), x42.b.REMINDER) : null);
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: W9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(PaymentsDetailsSetupData paymentsDetailsSetupData) {
        super.P5(paymentsDetailsSetupData);
    }

    @Override // zx.b
    public xw.b<n42.a.l> Y1() {
        return this.navAction;
    }

    @Override // n42.r
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // n42.r
    public void close() {
        d9(n42.a.c.f131394a);
    }

    @Override // l00.g
    protected k10.t<n42.q, n42.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<n42.r.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
