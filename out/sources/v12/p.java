package v12;

import d12.OAuthWebViewData;
import eo0.BEDictionaryAdditionalInformation;
import eo0.DraftDetails;
import eo0.Recipient;
import eo0.g0;
import eo0.y0;
import fr.q0;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B³\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020\u0013\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\b\b\u0001\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105J0\u0010=\u001a\u00020<2\u0006\u00102\u001a\u0002062\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u00032\u0006\u0010;\u001a\u00020:H\u0082@¢\u0006\u0004\b=\u0010>J\u0018\u0010A\u001a\u00020<2\u0006\u0010@\u001a\u00020?H\u0082@¢\u0006\u0004\bA\u0010BJ\u001b\u0010D\u001a\u00020<*\u00020C2\u0006\u00109\u001a\u00020\u0003H\u0002¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020:*\u000206H\u0002¢\u0006\u0004\bF\u0010GJ\u0011\u0010H\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020<2\u0006\u0010J\u001a\u00020.H\u0016¢\u0006\u0004\bK\u0010LJ\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020N0MH\u0096\u0001¢\u0006\u0004\bO\u0010PJ\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0MH\u0096\u0001¢\u0006\u0004\bR\u0010PR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010^R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010\u007f\u001a\u00020z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R'\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R,\u0010\u008c\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0087\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R%\u00102\u001a\t\u0012\u0004\u0012\u0002030\u008d\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0092\u0001"}, d2 = {"Lv12/p;", "Ll00/g;", "Lv12/b;", "Lv12/a;", "Lnx/b;", "Lv12/c;", "", "Lyy/a;", "stateMachineFactory", "Lw12/b;", "mapper", "Lc12/g;", "dialogMapper", "Loz/q;", "ownerViewLifecycleManager", "Lp02/f;", "editEdorDraftUC", "Lp02/b;", "createDraftUC", "Li70/e;", "snackBarManager", "Lmx/c;", "labelProvider", "Lac4/a;", "callActionWihLoaderUseCase", "Lp02/b0;", "getRecipientWizardResultUC", "Lx02/f;", "setupInitialChooseMessageTypeResultUC", "Lb12/c;", "electronicDeliveryErrorMapper", "Lp02/p;", "getEdeliveryDraftMessageRequestUC", "Lp02/n;", "getComplainAdditionalInformationUC", "La14/w;", "openUrlIntentUseCase", "globalSnackBarManager", "Lx02/c;", "deleteRecipientUC", "Lx02/d;", "getMessageServiceTypeWizardResultUC", "Lc12/k;", "saveDraftErrorMapper", "Lt02/i;", "isDraftRequestValidUC", "Lm22/h;", "contract", "<init>", "(Lyy/a;Lw12/b;Lc12/g;Loz/q;Lp02/f;Lp02/b;Li70/e;Lmx/c;Lac4/a;Lp02/b0;Lx02/f;Lb12/c;Lp02/p;Lp02/n;La14/w;Li70/e;Lx02/c;Lx02/d;Lc12/k;Lt02/i;Lm22/h;)V", "state", "Lv12/c$a;", "Q9", "(Lv12/b;)Lv12/c$a;", "Lv12/b$b;", "Leo0/g0;", "messageId", "retryAction", "Leo0/v;", "request", "Loq/i0;", "T9", "(Lv12/b$b;Ljava/lang/String;Lv12/a;Leo0/v;Ltq/e;)Ljava/lang/Object;", "Leo0/y0;", "serviceType", "V9", "(Leo0/y0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "N9", "(Ldx/b;Lv12/a;)V", "L9", "(Lv12/b$b;)Leo0/v;", "M9", "()Ljava/lang/String;", "data", "U9", "(Lm22/h;)V", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lw12/b;", "c", "Lc12/g;", "d", "Loz/q;", "e", "Lp02/f;", "f", "Lp02/b;", "g", "Li70/e;", "h", "Lmx/c;", "j", "Lac4/a;", "k", "Lp02/b0;", "l", "Lx02/f;", "m", "Lb12/c;", "n", "Lp02/p;", "p", "Lp02/n;", "q", "La14/w;", "r", "s", "Lx02/c;", "t", "Lx02/d;", "v", "Lc12/k;", "w", "Lt02/i;", "x", "Lm22/h;", "Loz/j;", "y", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lxw/b;", "Lv12/a$i;", "z", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "A", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "B", "Lmu/p0;", "getState", "()Lmu/p0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<v12.b, v12.a> implements nx.b, v12.c, zx.d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final k10.t<v12.b, v12.a> stateMachine;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final p0<v12.c.a> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w12.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c12.g dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p02.f editEdorDraftUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p02.b createDraftUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e snackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWihLoaderUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p02.b0 getRecipientWizardResultUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final x02.f setupInitialChooseMessageTypeResultUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final b12.c electronicDeliveryErrorMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p02.p getEdeliveryDraftMessageRequestUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p02.n getComplainAdditionalInformationUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final x02.c deleteRecipientUC;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final x02.d getMessageServiceTypeWizardResultUC;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final c12.k saveDraftErrorMapper;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final t02.i isDraftRequestValidUC;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final m22.h contract;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v12.a.i> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203100e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f203102g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ eo0.v f203103h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ v12.a f203104j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, eo0.v vVar, v12.a aVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f203102g = str;
            this.f203103h = vVar;
            this.f203104j = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f203100e;
            if (i15 == 0) {
                oq.u.b(obj);
                p02.f fVar = p.this.editEdorDraftUC;
                p02.f.Params params = new p02.f.Params(this.f203102g, this.f203103h, null);
                this.f203100e = 1;
                obj = fVar.e(params, this);
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
            p pVar = p.this;
            v12.a aVar = this.f203104j;
            if (iVar instanceof dx.i.Left) {
                pVar.N9((dx.b) ((dx.i.Left) iVar).b(), aVar);
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                ((g0) ((dx.i.Right) iVar).b()).getValue();
                pVar.snackBarManager.y(new p50.a.DefaultWithIcon(pVar.labelProvider.c(e02.a.f46537g4), false, null, null, 14, null));
                i0 i0Var = i0.f148189a;
                pVar.d9(v12.a.C5278a.f203024a);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return p.this.new a(this.f203102g, this.f203103h, this.f203104j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<v12.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f203105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f203106b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f203107a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f203108b;

            /* JADX INFO: renamed from: v12.p$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5283a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f203109d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f203110e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f203111f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f203113h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f203114j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f203115k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f203116l;

                public C5283a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f203109d = obj;
                    this.f203110e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f203107a = hVar;
                this.f203108b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5283a c5283a;
                if (eVar instanceof C5283a) {
                    c5283a = (C5283a) eVar;
                    int i15 = c5283a.f203110e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5283a.f203110e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5283a = new C5283a(eVar);
                    }
                } else {
                    c5283a = new C5283a(eVar);
                }
                Object obj2 = c5283a.f203109d;
                Object objE = uq.b.e();
                int i16 = c5283a.f203110e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f203107a;
                    v12.c.a aVarQ9 = this.f203108b.Q9((v12.b) obj);
                    c5283a.f203111f = vq.j.a(obj);
                    c5283a.f203113h = vq.j.a(c5283a);
                    c5283a.f203114j = vq.j.a(obj);
                    c5283a.f203115k = vq.j.a(hVar);
                    c5283a.f203116l = 0;
                    c5283a.f203110e = 1;
                    if (hVar.F(aVarQ9, c5283a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, p pVar) {
            this.f203105a = gVar;
            this.f203106b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super v12.c.a> hVar, tq.e eVar) {
            Object objA = this.f203105a.a(new a(hVar, this.f203106b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv12/a$n;", "<unused var>", "Lk10/c0;", "Lv12/b$a;", "state", "Lk10/l;", "Lv12/b;", "<anonymous>", "(Lv12/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<v12.a.Setup, k10.c0<v12.b.a>, tq.e<? super k10.l<? extends v12.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203118f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v12.b.C5281b V(p pVar, v12.b.a aVar) {
            return new v12.b.C5281b(null, null, pVar.M9(), false, null, false, 43, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v12.b.C5281b X(p pVar, BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation, v12.b.a aVar) {
            return new v12.b.C5281b(null, null, pVar.M9(), false, bEDictionaryAdditionalInformation, false, 43, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f203118f;
            Object objE = uq.b.e();
            int i15 = this.f203117e;
            if (i15 == 0) {
                oq.u.b(obj);
                p02.n nVar = p.this.getComplainAdditionalInformationUC;
                p02.n.Params params = new p02.n.Params(eo0.f.RECIPIENT_MESSAGE);
                this.f203118f = c0Var;
                this.f203117e = 1;
                obj = nVar.e(params, this);
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
            final p pVar = p.this;
            if (iVar instanceof dx.i.Left) {
                return c0Var.d(new er.l() { // from class: v12.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.c.V(pVar, (b.a) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation = (BEDictionaryAdditionalInformation) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: v12.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.X(pVar, bEDictionaryAdditionalInformation, (b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.Setup setup, k10.c0<v12.b.a> c0Var, tq.e<? super k10.l<? extends v12.b>> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f203118f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv12/a$m;", "<unused var>", "Lk10/c0;", "Lv12/b$b;", "state", "Lk10/l;", "Lv12/b;", "<anonymous>", "(Lv12/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<v12.a.m, k10.c0<v12.b.C5281b>, tq.e<? super k10.l<? extends v12.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203121f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v12.b.C5281b O(v12.b.C5281b c5281b) {
            return v12.b.C5281b.b(c5281b, null, null, null, true, null, false, 55, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f203121f;
            uq.b.e();
            if (this.f203120e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: v12.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O((b.C5281b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.m mVar, k10.c0<v12.b.C5281b> c0Var, tq.e<? super k10.l<? extends v12.b>> eVar) {
            d dVar = new d(eVar);
            dVar.f203121f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv12/a$c;", "action", "Lv12/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv12/a$c;Lv12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<v12.a.DeleteRecipient, v12.b.C5281b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203123f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v12.a.DeleteRecipient deleteRecipient = (v12.a.DeleteRecipient) this.f203123f;
            Object objE = uq.b.e();
            int i15 = this.f203122e;
            if (i15 == 0) {
                oq.u.b(obj);
                p.this.d9(v12.a.m.f203042a);
                x02.c cVar = p.this.deleteRecipientUC;
                x02.c.Params params = new x02.c.Params(deleteRecipient.getRecipient(), p.this.contract);
                this.f203123f = vq.j.a(deleteRecipient);
                this.f203122e = 1;
                if (cVar.d(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            p.this.d9(v12.a.e.f203028a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.DeleteRecipient deleteRecipient, v12.b.C5281b c5281b, tq.e<? super i0> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f203123f = deleteRecipient;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv12/a$e;", "<unused var>", "Lk10/c0;", "Lv12/b$b;", "state", "Lk10/l;", "Lv12/b;", "<anonymous>", "(Lv12/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<v12.a.e, k10.c0<v12.b.C5281b>, tq.e<? super k10.l<? extends v12.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203126f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v12.b.C5281b O(List list, v12.b.C5281b c5281b) {
            return v12.b.C5281b.b(c5281b, list, hz.b.C2039b.f86846c, null, false, null, false, 52, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f203126f;
            uq.b.e();
            if (this.f203125e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o02.b.AddRecipients addRecipientsH6 = p.this.contract.H6();
            final List<Recipient> listA = addRecipientsH6 != null ? addRecipientsH6.a() : null;
            if (listA == null) {
                listA = pq.v.n();
            }
            return c0Var.b(new er.l() { // from class: v12.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.f.O(listA, (b.C5281b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.e eVar, k10.c0<v12.b.C5281b> c0Var, tq.e<? super k10.l<? extends v12.b>> eVar2) {
            f fVar = p.this.new f(eVar2);
            fVar.f203126f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv12/a$j;", "<unused var>", "Lk10/c0;", "Lv12/b$b;", "state", "Lk10/l;", "Lv12/b;", "<anonymous>", "(Lv12/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<v12.a.j, k10.c0<v12.b.C5281b>, tq.e<? super k10.l<? extends v12.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f203128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f203129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f203130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f203131h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f203132j;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v12.b.C5281b O(hz.b bVar, v12.b.C5281b c5281b) {
            return v12.b.C5281b.b(c5281b, null, bVar, null, false, null, false, 61, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
        
            if (r3.F(r5, r8) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
        
            r1 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
        
            if (r4.F(r5, r8) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f203132j
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r8.f203131h
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L27
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1b:
                java.lang.Object r1 = r8.f203129f
                eo0.y0 r1 = (eo0.y0) r1
                java.lang.Object r1 = r8.f203128e
                hz.b r1 = (hz.b) r1
                oq.u.b(r9)
                goto L87
            L27:
                oq.u.b(r9)
                java.lang.Object r9 = r0.a()
                v12.b$b r9 = (v12.b.C5281b) r9
                java.util.List r9 = r9.e()
                boolean r9 = r9.isEmpty()
                if (r9 == 0) goto L41
                hz.b$c r9 = new hz.b$c
                r2 = 0
                r9.<init>(r2, r4, r2)
                goto L43
            L41:
                hz.b$d r9 = hz.b.d.f86848c
            L43:
                boolean r2 = r9.a()
                if (r2 == 0) goto La4
                v12.p r2 = v12.p.this
                x02.d r2 = v12.p.y9(r2)
                x02.d$a r5 = new x02.d$a
                v12.p r6 = v12.p.this
                m22.h r6 = v12.p.r9(r6)
                v12.p r7 = v12.p.this
                m22.h r7 = v12.p.r9(r7)
                r5.<init>(r6, r7)
                eo0.y0 r2 = r2.b(r5)
                v12.p r5 = v12.p.this
                eo0.y0 r6 = eo0.y0.E_PUAP
                r7 = 0
                if (r2 != r6) goto L89
                xw.b r3 = r5.Y1()
                v12.a$i$d$b r5 = v12.a.i.d.b.f203036a
                r8.f203132j = r0
                r8.f203128e = r9
                java.lang.Object r2 = vq.j.a(r2)
                r8.f203129f = r2
                r8.f203130g = r7
                r8.f203131h = r4
                java.lang.Object r2 = r3.F(r5, r8)
                if (r2 != r1) goto L86
                goto La3
            L86:
                r1 = r9
            L87:
                r9 = r1
                goto La4
            L89:
                xw.b r4 = r5.Y1()
                v12.a$i$d$a r5 = v12.a.i.d.C5280a.f203035a
                r8.f203132j = r0
                r8.f203128e = r9
                java.lang.Object r2 = vq.j.a(r2)
                r8.f203129f = r2
                r8.f203130g = r7
                r8.f203131h = r3
                java.lang.Object r2 = r4.F(r5, r8)
                if (r2 != r1) goto L86
            La3:
                return r1
            La4:
                v12.u r1 = new v12.u
                r1.<init>()
                k10.l r9 = r0.b(r1)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: v12.p.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.j jVar, k10.c0<v12.b.C5281b> c0Var, tq.e<? super k10.l<? extends v12.b>> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f203132j = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv12/a$p;", "action", "Lv12/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lv12/a$p;Lv12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<v12.a.p, v12.b.C5281b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f203134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f203135f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f203136g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            eo0.v vVar;
            v12.b.C5281b c5281b = (v12.b.C5281b) this.f203136g;
            Object objE = uq.b.e();
            int i15 = this.f203135f;
            if (i15 == 0) {
                oq.u.b(obj);
                eo0.v vVarC = p.this.getEdeliveryDraftMessageRequestUC.c(new p02.p.Params(p.this.contract.v6(), c5281b.e(), p.this.contract.I1()));
                t02.i iVar = p.this.isDraftRequestValidUC;
                t02.i.Params params = new t02.i.Params(vVarC);
                this.f203136g = vq.j.a(c5281b);
                this.f203134e = vVarC;
                this.f203135f = 1;
                Object objD = iVar.d(params, this);
                if (objD == objE) {
                    return objE;
                }
                vVar = vVarC;
                obj = objD;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vVar = (eo0.v) this.f203134e;
                oq.u.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                p.this.d9(new v12.a.SaveDraft(vVar));
            } else {
                p.this.d9(new v12.a.Error(p.this.saveDraftErrorMapper.b(new c12.k.Params(new er.a() { // from class: v12.v
                    @Override // er.a
                    public final Object a() {
                        return p.h.O();
                    }
                }, p.this.b9(v12.a.C5278a.f203024a)))));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.p pVar, v12.b.C5281b c5281b, tq.e<? super i0> eVar) {
            h hVar = p.this.new h(eVar);
            hVar.f203136g = c5281b;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv12/a$l;", "action", "Lv12/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lv12/a$l;Lv12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<v12.a.SaveDraft, v12.b.C5281b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f203138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f203139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f203140g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f203141h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f203142j;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leo0/g0;", "messageId", "Loq/i0;", "<anonymous>", "(Leo0/g0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<g0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f203144e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f203145f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f203146g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ v12.b.C5281b f203147h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ v12.a.SaveDraft f203148j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, v12.b.C5281b c5281b, v12.a.SaveDraft saveDraft, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f203146g = pVar;
                this.f203147h = c5281b;
                this.f203148j = saveDraft;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(g0 g0Var, tq.e<? super i0> eVar) {
                return M(g0Var.getValue(), eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                String str = (String) this.f203145f;
                Object objE = uq.b.e();
                int i15 = this.f203144e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    p pVar = this.f203146g;
                    v12.b.C5281b c5281b = this.f203147h;
                    v12.a.SaveDraft saveDraft = this.f203148j;
                    eo0.v draftRequest = saveDraft.getDraftRequest();
                    this.f203145f = vq.j.a(str);
                    this.f203144e = 1;
                    if (pVar.T9(c5281b, str, saveDraft, draftRequest, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return i0.f148189a;
            }

            public final Object M(String str, tq.e<? super i0> eVar) {
                return ((a) v(g0.a(str), eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f203146g, this.f203147h, this.f203148j, eVar);
                aVar.f203145f = ((g0) obj).getValue();
                return aVar;
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v12.a.SaveDraft saveDraft = (v12.a.SaveDraft) this.f203141h;
            v12.b.C5281b c5281b = (v12.b.C5281b) this.f203142j;
            Object objE = uq.b.e();
            int i15 = this.f203140g;
            if (i15 == 0) {
                oq.u.b(obj);
                String draftMessageId = c5281b.getDraftMessageId();
                if (draftMessageId != null) {
                    p pVar = p.this;
                    eo0.v draftRequest = saveDraft.getDraftRequest();
                    this.f203141h = saveDraft;
                    this.f203142j = c5281b;
                    this.f203138e = vq.j.a(draftMessageId);
                    this.f203139f = 0;
                    this.f203140g = 1;
                    if (pVar.T9(c5281b, draftMessageId, saveDraft, draftRequest, this) == objE) {
                        return objE;
                    }
                } else {
                    p.this.d9(new v12.a.CreateDraft(new a(p.this, c5281b, saveDraft, null)));
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.SaveDraft saveDraft, v12.b.C5281b c5281b, tq.e<? super i0> eVar) {
            i iVar = p.this.new i(eVar);
            iVar.f203141h = saveDraft;
            iVar.f203142j = c5281b;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv12/a$b;", "action", "Lv12/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lv12/a$b;Lv12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<v12.a.CreateDraft, v12.b.C5281b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f203151g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f203153e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f203154f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f203155g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f203156h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f203157j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ p f203158k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ v12.b.C5281b f203159l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ v12.a.CreateDraft f203160m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, v12.b.C5281b c5281b, v12.a.CreateDraft createDraft, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f203158k = pVar;
                this.f203159l = c5281b;
                this.f203160m = createDraft;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
            
                if (r3.B(r4, r6) == r0) goto L20;
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
                    int r1 = r6.f203157j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r6.f203154f
                    eo0.w r0 = (eo0.EdeliveryDraftMessageResponse) r0
                    java.lang.Object r0 = r6.f203153e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r7)
                    goto L93
                L1b:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L23:
                    oq.u.b(r7)
                    goto L46
                L27:
                    oq.u.b(r7)
                    v12.p r7 = r6.f203158k
                    p02.b r7 = v12.p.s9(r7)
                    p02.b$a r1 = new p02.b$a
                    v12.p r4 = r6.f203158k
                    v12.b$b r5 = r6.f203159l
                    eo0.v r4 = v12.p.p9(r4, r5)
                    r1.<init>(r4)
                    r6.f203157j = r3
                    java.lang.Object r7 = r7.e(r1, r6)
                    if (r7 != r0) goto L46
                    goto L92
                L46:
                    dx.i r7 = (dx.i) r7
                    v12.p r1 = r6.f203158k
                    v12.a$b r3 = r6.f203160m
                    boolean r4 = r7 instanceof dx.i.Left
                    if (r4 == 0) goto L5c
                    dx.i$b r7 = (dx.i.Left) r7
                    java.lang.Object r7 = r7.b()
                    dx.b r7 = (dx.b) r7
                    v12.p.G9(r1, r7, r3)
                    goto L93
                L5c:
                    boolean r1 = r7 instanceof dx.i.Right
                    if (r1 == 0) goto L96
                    r1 = r7
                    dx.i$c r1 = (dx.i.Right) r1
                    java.lang.Object r1 = r1.b()
                    eo0.w r1 = (eo0.EdeliveryDraftMessageResponse) r1
                    er.p r3 = r3.a()
                    eo0.u r4 = r1.getDraftDetails()
                    java.lang.String r4 = r4.getMessageId()
                    eo0.g0 r4 = eo0.g0.a(r4)
                    java.lang.Object r7 = vq.j.a(r7)
                    r6.f203153e = r7
                    java.lang.Object r7 = vq.j.a(r1)
                    r6.f203154f = r7
                    r7 = 0
                    r6.f203155g = r7
                    r6.f203156h = r7
                    r6.f203157j = r2
                    java.lang.Object r7 = r3.B(r4, r6)
                    if (r7 != r0) goto L93
                L92:
                    return r0
                L93:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                L96:
                    oq.p r7 = new oq.p
                    r7.<init>()
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: v12.p.j.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f203158k, this.f203159l, this.f203160m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v12.a.CreateDraft createDraft = (v12.a.CreateDraft) this.f203150f;
            v12.b.C5281b c5281b = (v12.b.C5281b) this.f203151g;
            Object objE = uq.b.e();
            int i15 = this.f203149e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = p.this.callActionWihLoaderUseCase;
                a aVar2 = new a(p.this, c5281b, createDraft, null);
                this.f203150f = vq.j.a(createDraft);
                this.f203151g = vq.j.a(c5281b);
                this.f203149e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.CreateDraft createDraft, v12.b.C5281b c5281b, tq.e<? super i0> eVar) {
            j jVar = p.this.new j(eVar);
            jVar.f203150f = createDraft;
            jVar.f203151g = c5281b;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv12/a$f;", "action", "Lv12/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv12/a$f;Lv12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<v12.a.GoToAuthorization, v12.b.C5281b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203162f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p pVar, v12.a.GoToAuthorization goToAuthorization) {
            pVar.d9(goToAuthorization.getAction());
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final v12.a.GoToAuthorization goToAuthorization = (v12.a.GoToAuthorization) this.f203162f;
            Object objE = uq.b.e();
            int i15 = this.f203161e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v12.a.i> bVarY1 = p.this.Y1();
                final p pVar = p.this;
                v12.a.i.GoToAuthorization goToAuthorization2 = new v12.a.i.GoToAuthorization(new OAuthWebViewData(new er.a() { // from class: v12.w
                    @Override // er.a
                    public final Object a() {
                        return p.k.O(pVar, goToAuthorization);
                    }
                }));
                this.f203162f = vq.j.a(goToAuthorization);
                this.f203161e = 1;
                if (bVarY1.F(goToAuthorization2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.GoToAuthorization goToAuthorization, v12.b.C5281b c5281b, tq.e<? super i0> eVar) {
            k kVar = p.this.new k(eVar);
            kVar.f203162f = goToAuthorization;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv12/b$b;", "it", "Loq/i0;", "<anonymous>", "(Lv12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<v12.b.C5281b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203164e;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f203164e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<dx.b, List<Recipient>> iVarB = p.this.getRecipientWizardResultUC.b(new p02.b0.Params(p.this.contract.v6().getEntryPoint()));
            p pVar = p.this;
            if (iVarB instanceof dx.i.Right) {
                pVar.contract.k6(new o02.b.AddRecipients((List) ((dx.i.Right) iVarB).b()));
                pVar.setupInitialChooseMessageTypeResultUC.b(new x02.f.Params(pVar.contract.v6().getEntryPoint(), pVar.contract));
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(v12.b.C5281b c5281b, tq.e<? super i0> eVar) {
            return ((l) v(c5281b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new l(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Lv12/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Lv12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<nx.a, v12.b.C5281b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203166e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203167f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f203167f;
            uq.b.e();
            if (this.f203166e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == nx.a.RESUMED) {
                p.this.d9(v12.a.e.f203028a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, v12.b.C5281b c5281b, tq.e<? super i0> eVar) {
            m mVar = p.this.new m(eVar);
            mVar.f203167f = aVar;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv12/a$n;", "<unused var>", "Lk10/c0;", "Lv12/b$b;", "state", "Lk10/l;", "Lv12/b;", "<anonymous>", "(Lv12/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<v12.a.Setup, k10.c0<v12.b.C5281b>, tq.e<? super k10.l<? extends v12.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203169e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203170f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v12.b.C5281b X(p pVar, v12.b.C5281b c5281b) {
            return v12.b.C5281b.b(c5281b, null, null, pVar.M9(), false, null, false, 43, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v12.b.C5281b Y(p pVar, BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation, v12.b.C5281b c5281b) {
            return v12.b.C5281b.b(c5281b, null, null, pVar.M9(), false, bEDictionaryAdditionalInformation, false, 43, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v12.b.C5281b Z(p pVar, v12.b.C5281b c5281b) {
            return v12.b.C5281b.b(c5281b, null, null, pVar.M9(), false, null, false, 59, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f203170f;
            Object objE = uq.b.e();
            int i15 = this.f203169e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!((v12.b.C5281b) c0Var.a()).getShowGeneralAlert()) {
                    final p pVar = p.this;
                    return c0Var.b(new er.l() { // from class: v12.z
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.n.Z(pVar, (b.C5281b) obj2);
                        }
                    });
                }
                p02.n nVar = p.this.getComplainAdditionalInformationUC;
                p02.n.Params params = new p02.n.Params(eo0.f.RECIPIENT_MESSAGE);
                this.f203170f = c0Var;
                this.f203169e = 1;
                obj = nVar.e(params, this);
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
            final p pVar2 = p.this;
            if (iVar instanceof dx.i.Left) {
                return c0Var.b(new er.l() { // from class: v12.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.n.X(pVar2, (b.C5281b) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final BEDictionaryAdditionalInformation bEDictionaryAdditionalInformation = (BEDictionaryAdditionalInformation) ((dx.i.Right) iVar).b();
            return c0Var.b(new er.l() { // from class: v12.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.n.Y(pVar2, bEDictionaryAdditionalInformation, (b.C5281b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.Setup setup, k10.c0<v12.b.C5281b> c0Var, tq.e<? super k10.l<? extends v12.b>> eVar) {
            n nVar = p.this.new n(eVar);
            nVar.f203170f = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv12/a$a;", "<unused var>", "Lv12/b$b;", "Loq/i0;", "<anonymous>", "(Lv12/a$a;Lv12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<v12.a.C5278a, v12.b.C5281b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203172e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f203172e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v12.a.i> bVarY1 = p.this.Y1();
                v12.a.i.C5279a c5279a = v12.a.i.C5279a.f203032a;
                this.f203172e = 1;
                if (bVarY1.F(c5279a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.C5278a c5278a, v12.b.C5281b c5281b, tq.e<? super i0> eVar) {
            return p.this.new o(eVar).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: v12.p$p, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv12/a$d;", "action", "Lv12/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv12/a$d;Lv12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C5284p extends vq.k implements er.q<v12.a.Error, v12.b.C5281b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203175f;

        C5284p(tq.e<? super C5284p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v12.a.Error error = (v12.a.Error) this.f203175f;
            Object objE = uq.b.e();
            int i15 = this.f203174e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v12.a.i> bVarY1 = p.this.Y1();
                v12.a.i.GoToError goToError = new v12.a.i.GoToError(error.getErrorData());
                this.f203175f = vq.j.a(error);
                this.f203174e = 1;
                if (bVarY1.F(goToError, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.Error error, v12.b.C5281b c5281b, tq.e<? super i0> eVar) {
            C5284p c5284p = p.this.new C5284p(eVar);
            c5284p.f203175f = error;
            return c5284p.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv12/a$k;", "action", "Lv12/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv12/a$k;Lv12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<v12.a.OpenUrl, v12.b.C5281b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203178f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v12.a.OpenUrl openUrl = (v12.a.OpenUrl) this.f203178f;
            Object objE = uq.b.e();
            int i15 = this.f203177e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = p.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f203178f = vq.j.a(openUrl);
                this.f203177e = 1;
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
            p pVar = p.this;
            if (iVar instanceof dx.i.Left) {
                pVar.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.OpenUrl openUrl, v12.b.C5281b c5281b, tq.e<? super i0> eVar) {
            q qVar = p.this.new q(eVar);
            qVar.f203178f = openUrl;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv12/a$h;", "<unused var>", "Lk10/c0;", "Lv12/b$b;", "state", "Lk10/l;", "Lv12/b;", "<anonymous>", "(Lv12/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<v12.a.h, k10.c0<v12.b.C5281b>, tq.e<? super k10.l<? extends v12.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203180e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203181f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v12.b.C5281b O(v12.b.C5281b c5281b) {
            return v12.b.C5281b.b(c5281b, null, null, null, false, null, false, 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f203181f;
            uq.b.e();
            if (this.f203180e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: v12.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.r.O((b.C5281b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.h hVar, k10.c0<v12.b.C5281b> c0Var, tq.e<? super k10.l<? extends v12.b>> eVar) {
            r rVar = new r(eVar);
            rVar.f203181f = c0Var;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv12/a$o;", "<unused var>", "Lv12/b$b;", "Loq/i0;", "<anonymous>", "(Lv12/a$o;Lv12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<v12.a.o, v12.b.C5281b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f203182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f203183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f203184g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f203184g;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0VarB = p.this.getMessageServiceTypeWizardResultUC.b(new x02.d.Params(p.this.contract, p.this.contract));
                p pVar = p.this;
                this.f203182e = vq.j.a(y0VarB);
                this.f203183f = 0;
                this.f203184g = 1;
                if (pVar.V9(y0VarB, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.o oVar, v12.b.C5281b c5281b, tq.e<? super i0> eVar) {
            return p.this.new s(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv12/a$g;", "<unused var>", "Lv12/b$b;", "Loq/i0;", "<anonymous>", "(Lv12/a$g;Lv12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<v12.a.g, v12.b.C5281b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203186e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f203186e;
            if (i15 == 0) {
                oq.u.b(obj);
                p.this.d9(v12.a.m.f203042a);
                xw.b<v12.a.i> bVarY1 = p.this.Y1();
                v12.a.i.e eVar = v12.a.i.e.f203037a;
                this.f203186e = 1;
                if (bVarY1.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v12.a.g gVar, v12.b.C5281b c5281b, tq.e<? super i0> eVar) {
            return p.this.new t(eVar).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, w12.b bVar, c12.g gVar, oz.q qVar, p02.f fVar, p02.b bVar2, i70.e eVar, mx.c cVar, ac4.a aVar2, p02.b0 b0Var, x02.f fVar2, b12.c cVar2, p02.p pVar, p02.n nVar, a14.w wVar, i70.e eVar2, x02.c cVar3, x02.d dVar, c12.k kVar, t02.i iVar, m22.h hVar) {
        this.mapper = bVar;
        this.dialogMapper = gVar;
        this.ownerViewLifecycleManager = qVar;
        this.editEdorDraftUC = fVar;
        this.createDraftUC = bVar2;
        this.snackBarManager = eVar;
        this.labelProvider = cVar;
        this.callActionWihLoaderUseCase = aVar2;
        this.getRecipientWizardResultUC = b0Var;
        this.setupInitialChooseMessageTypeResultUC = fVar2;
        this.electronicDeliveryErrorMapper = cVar2;
        this.getEdeliveryDraftMessageRequestUC = pVar;
        this.getComplainAdditionalInformationUC = nVar;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar2;
        this.deleteRecipientUC = cVar3;
        this.getMessageServiceTypeWizardResultUC = dVar;
        this.saveDraftErrorMapper = kVar;
        this.isDraftRequestValidUC = iVar;
        this.contract = hVar;
        this.lifecycleConnector = qVar;
        v12.b.a aVar3 = v12.b.a.f203046a;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: v12.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.W9(this.f203077a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), Q9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final eo0.v L9(v12.b.C5281b c5281b) {
        return new eo0.v(null, c5281b.e(), null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String M9() {
        DraftDetails draftDetails;
        String messageId;
        o02.c cVarI1 = this.contract.I1();
        if (cVarI1 != null && (messageId = cVarI1.getMessageId()) != null) {
            return messageId;
        }
        z02.a entryPoint = this.contract.v6().getEntryPoint();
        if (entryPoint instanceof z02.a.EditDraft) {
            return ((z02.a.EditDraft) entryPoint).getMessageDetails().getDeliveryMessage().getMessageId();
        }
        if (!(entryPoint instanceof z02.a.ForwardMessage) || (draftDetails = ((z02.a.ForwardMessage) entryPoint).getDraftDetails()) == null) {
            return null;
        }
        return draftDetails.getMessageId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N9(dx.b bVar, v12.a aVar) {
        this.electronicDeliveryErrorMapper.c(new b12.c.Params(bVar, b9(new v12.a.GoToAuthorization(aVar)), new er.a() { // from class: v12.m
            @Override // er.a
            public final Object a() {
                return p.O9();
            }
        }, b9(aVar), new er.l() { // from class: v12.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.P9(this.f203076a, (jb4.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(p pVar, jb4.b bVar) {
        pVar.d9(new v12.a.Error(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v12.c.a Q9(v12.b state) {
        w12.b bVar = this.mapper;
        er.a<i0> aVarB9 = b9(v12.a.o.f203044a);
        er.a<i0> aVarB10 = b9(v12.a.j.f203039a);
        er.a<i0> aVarB11 = b9(v12.a.g.f203030a);
        z02.a entryPoint = this.contract.v6().getEntryPoint();
        er.a<i0> aVarB12 = b9(v12.a.h.f203031a);
        x02.d dVar = this.getMessageServiceTypeWizardResultUC;
        m22.h hVar = this.contract;
        return bVar.b(new w12.b.Params(state, entryPoint, aVarB9, aVarB10, aVarB11, new er.l() { // from class: v12.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.R9(this.f203074a, (Recipient) obj);
            }
        }, new er.l() { // from class: v12.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.S9(this.f203075a, (String) obj);
            }
        }, aVarB12, dVar.b(new x02.d.Params(hVar, hVar))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(p pVar, Recipient recipient) {
        pVar.d9(new v12.a.DeleteRecipient(recipient));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S9(p pVar, String str) {
        pVar.d9(new v12.a.OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T9(v12.b.C5281b c5281b, String str, v12.a aVar, eo0.v vVar, tq.e<? super i0> eVar) {
        Object objA = ac4.a.a(this.callActionWihLoaderUseCase, null, new a(str, vVar, aVar, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object V9(y0 y0Var, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new v12.a.i.ShowDialog(this.dialogMapper.b(new c12.g.Params(b9(v12.a.C5278a.f203024a), y0Var, b9(v12.a.p.f203045a)))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(v12.b.a.class), new er.l() { // from class: v12.i
            @Override // er.l
            public final Object b(Object obj) {
                return p.X9(this.f203072a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(v12.b.C5281b.class), new er.l() { // from class: v12.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.Y9(this.f203073a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X9(p pVar, k10.z zVar) {
        c cVar = pVar.new c(null);
        zVar.v(q0.c(v12.a.Setup.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y9(p pVar, k10.z zVar) {
        zVar.C(pVar.new l(null));
        k10.k.s(zVar, pVar.x8(), null, pVar.new m(null), 2, null);
        n nVar = pVar.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(v12.a.Setup.class), oVar, nVar);
        zVar.x(q0.c(v12.a.C5278a.class), oVar, pVar.new o(null));
        zVar.x(q0.c(v12.a.Error.class), oVar, pVar.new C5284p(null));
        zVar.x(q0.c(v12.a.OpenUrl.class), oVar, pVar.new q(null));
        zVar.v(q0.c(v12.a.h.class), oVar, new r(null));
        zVar.x(q0.c(v12.a.o.class), oVar, pVar.new s(null));
        zVar.x(q0.c(v12.a.g.class), oVar, pVar.new t(null));
        zVar.v(q0.c(v12.a.m.class), oVar, new d(null));
        zVar.x(q0.c(v12.a.DeleteRecipient.class), oVar, pVar.new e(null));
        zVar.v(q0.c(v12.a.e.class), oVar, pVar.new f(null));
        zVar.v(q0.c(v12.a.j.class), oVar, pVar.new g(null));
        zVar.x(q0.c(v12.a.p.class), oVar, pVar.new h(null));
        zVar.x(q0.c(v12.a.SaveDraft.class), oVar, pVar.new i(null));
        zVar.x(q0.c(v12.a.CreateDraft.class), oVar, pVar.new j(null));
        zVar.x(q0.c(v12.a.GoToAuthorization.class), oVar, pVar.new k(null));
        return i0.f148189a;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: U9, reason: merged with bridge method [inline-methods] */
    public void P5(m22.h data) {
        d9(new v12.a.Setup(data));
    }

    @Override // zx.b
    public xw.b<v12.a.i> Y1() {
        return this.navAction;
    }

    @Override // v12.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<v12.b, v12.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<v12.c.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
