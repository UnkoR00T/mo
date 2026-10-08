package m12;

import d12.OAuthWebViewData;
import eo0.DeliveryMessageDetails;
import eo0.DeliveryMessageDetailsAttachment;
import eo0.EdeliveryDraftMessageResponse;
import eo0.y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import z02.MessageDetailsPayload;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B³\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\b\b\u0001\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u00020\u0002H\u0002¢\u0006\u0004\b5\u00106J(\u0010;\u001a\u00020:2\u0006\u00107\u001a\u00020\u00032\u0006\u00100\u001a\u00020/2\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020:2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0018\u0010A\u001a\u00020:2\u0006\u00100\u001a\u00020/H\u0082@¢\u0006\u0004\bA\u0010BJL\u0010M\u001a\u00020:2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u0002082\f\u0010K\u001a\b\u0012\u0004\u0012\u00020:0J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020:0JH\u0082@¢\u0006\u0004\bM\u0010NJ\u0018\u0010O\u001a\u00020:2\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020:2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJA\u0010X\u001a\u00020:2\u0006\u0010V\u001a\u00020U2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020:0J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020:0J2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020:0JH\u0002¢\u0006\u0004\bX\u0010YJE\u0010\\\u001a\u00020:2\u0006\u0010V\u001a\u00020U2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020:0J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020:0J2\u0006\u0010I\u001a\u0002082\b\b\u0001\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u0013\u0010^\u001a\u00020Z*\u00020QH\u0002¢\u0006\u0004\b^\u0010_J\u0016\u0010b\u001a\b\u0012\u0004\u0012\u00020a0`H\u0096\u0001¢\u0006\u0004\bb\u0010cJ\u0016\u0010e\u001a\b\u0012\u0004\u0012\u00020d0`H\u0096\u0001¢\u0006\u0004\be\u0010cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0097\u0001\u001a\u00030\u0092\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R,\u0010\u009d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0098\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R'\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u00030\u009f\u00010\u009e\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R%\u00103\u001a\t\u0012\u0004\u0012\u0002040¥\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001¨\u0006ª\u0001"}, d2 = {"Lm12/d0;", "Ll00/g;", "Lm12/d;", "Lm12/a;", "Lm12/e;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lp02/i;", "fetchMessageDetailsUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lp02/d;", "downloadMessageAttachmentsUseCase", "Ln12/l;", "messageDetailsMapper", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "Ll12/d;", "fileAccessPermissionDialogMapper", "Lq02/d;", "deleteMessageUC", "Li70/e;", "globalSnackBarManager", "Ln12/d;", "deleteMessageDialogMapper", "Loz/q;", "ownerViewLifecycleManager", "Ll12/f;", "forwardMessageDialogMapper", "La14/w;", "openUrlIntentUseCase", "Lp02/b;", "createEdorDraftUC", "Lp02/c;", "createForwardDetailsUC", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Ll12/b;", "attachmentTooBigToDownloadDialogMapper", "Lhb4/d;", "errorVMSFactory", "Lz02/b;", "messageDetailsPayload", "<init>", "(Lyy/a;Lp02/i;Lac4/a;Lib4/c;Lp02/d;Ln12/l;Lmx/c;Lu04/a;Ll12/d;Lq02/d;Li70/e;Ln12/d;Loz/q;Ll12/f;La14/w;Lp02/b;Lp02/c;La14/m;Ll12/b;Lhb4/d;Lz02/b;)V", "state", "Lm12/e$a;", "da", "(Lm12/d;)Lm12/e$a;", "fromAction", "Leo0/m;", "messageDetails", "Loq/i0;", "T9", "(Lm12/a;Lz02/b;Leo0/m;Ltq/e;)Ljava/lang/Object;", "Lmx/a;", "message", "ga", "(Lmx/a;)V", "W9", "(Lz02/b;Ltq/e;)Ljava/lang/Object;", "Leo0/r;", "directoryId", "Leo0/y;", "attachmentId", "", "fileName", "deliveryMessageDetails", "Lkotlin/Function0;", "onRefreshToken", "onRetry", "U9", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leo0/m;Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "X9", "(Leo0/m;Ltq/e;)Ljava/lang/Object;", "Lu04/b;", "downloadStatus", "Y9", "(Lu04/b;)V", "Ldx/b;", "domainError", "onBack", "Z9", "(Ldx/b;Ler/a;Ler/a;Ler/a;)V", "", "snackbarTextRes", "ba", "(Ldx/b;Ler/a;Ler/a;Leo0/m;I)V", "ta", "(Lu04/b;)I", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lp02/i;", "c", "Lac4/a;", "d", "Lib4/c;", "e", "Lp02/d;", "f", "Ln12/l;", "g", "Lmx/c;", "h", "Lu04/a;", "j", "Ll12/d;", "k", "Lq02/d;", "l", "Li70/e;", "m", "Ln12/d;", "n", "Loz/q;", "p", "Ll12/f;", "q", "La14/w;", "r", "Lp02/b;", "s", "Lp02/c;", "t", "La14/m;", "v", "Ll12/b;", "w", "Lhb4/d;", "x", "Lz02/b;", "Lm12/c;", "y", "Lm12/c;", "initialState", "Loz/j;", "z", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "A", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lm12/a$n;", "B", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "C", "Lmu/p0;", "getState", "()Lmu/p0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 extends l00.g<m12.d, m12.a> implements m12.e, zx.d, nx.b {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final k10.t<m12.d, m12.a> stateMachine;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final xw.b<m12.a.n> navAction;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final mu.p0<m12.e.a> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p02.i fetchMessageDetailsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p02.d downloadMessageAttachmentsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n12.l messageDetailsMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l12.d fileAccessPermissionDialogMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final q02.d deleteMessageUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final n12.d deleteMessageDialogMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final l12.f forwardMessageDialogMapper;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p02.b createEdorDraftUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p02.c createForwardDetailsUC;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final l12.b attachmentTooBigToDownloadDialogMapper;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final MessageDetailsPayload messageDetailsPayload;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Loading initialState;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122571a;

        static {
            int[] iArr = new int[u04.b.values().length];
            try {
                iArr[u04.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u04.b.FILE_NOT_SAVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u04.b.NOT_PERMISSION_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u04.b.NOT_PERMISSION_GRANTED_GO_TO_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f122571a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm12/a$r;", "<unused var>", "Lm12/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lm12/a$r;Lm12/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<m12.a.r, m12.d.a.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122572e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122573f;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.d.a.Displaying displaying = (m12.d.a.Displaying) this.f122573f;
            uq.b.e();
            if (this.f122572e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(new m12.a.ShowDialog(d0.this.deleteMessageDialogMapper.b(new n12.d.Params(displaying.getMessageDetailsPayload().getDirectoryType(), d0.this.b9(m12.a.b.f122502a)))));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.r rVar, m12.d.a.Displaying displaying, tq.e<? super oq.i0> eVar) {
            a0 a0Var = d0.this.new a0(eVar);
            a0Var.f122573f = displaying;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122575e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ MessageDetailsPayload f122577g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ DeliveryMessageDetails f122578h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m12.a f122579j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f122580a;

            static {
                int[] iArr = new int[eo0.t.values().length];
                try {
                    iArr[eo0.t.DRAFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[eo0.t.TRASH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f122580a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MessageDetailsPayload messageDetailsPayload, DeliveryMessageDetails deliveryMessageDetails, m12.a aVar, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f122577g = messageDetailsPayload;
            this.f122578h = deliveryMessageDetails;
            this.f122579j = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            int i15;
            Object objE = uq.b.e();
            int i16 = this.f122575e;
            if (i16 == 0) {
                oq.u.b(obj);
                q02.d dVar = d0.this.deleteMessageUC;
                q02.d.Params params = new q02.d.Params(this.f122577g.getMessage(), this.f122577g.getDirectoryType());
                this.f122575e = 1;
                obj = dVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            d0 d0Var = d0.this;
            MessageDetailsPayload messageDetailsPayload = this.f122577g;
            DeliveryMessageDetails deliveryMessageDetails = this.f122578h;
            m12.a aVar = this.f122579j;
            if (iVar instanceof dx.i.Left) {
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                if ((bVar instanceof dx.b.g.Http) && ((dx.b.g.Http) bVar).getCode() == dx.b.g.Http.a.BAD_REQUEST) {
                    d0Var.ga(d0Var.labelProvider.c(a.f122580a[messageDetailsPayload.getDirectoryType().ordinal()] == 1 ? e02.a.f46506b3 : e02.a.M2));
                    d0Var.d9(new m12.a.DisplayMessage(deliveryMessageDetails));
                } else {
                    d0Var.Z9(bVar, d0Var.b9(new m12.a.GoToAuthorization(aVar)), d0Var.b9(aVar), d0Var.b9(new m12.a.DisplayMessage(deliveryMessageDetails)));
                }
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                mx.c cVar = d0Var.labelProvider;
                int i17 = a.f122580a[messageDetailsPayload.getDirectoryType().ordinal()];
                if (i17 != 1) {
                    i15 = i17 != 2 ? e02.a.f46632w3 : e02.a.X3;
                } else {
                    i15 = e02.a.f46518d3;
                }
                d0Var.ga(cVar.c(i15));
                d0Var.d9(m12.a.C2994a.f122501a);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return d0.this.new b(this.f122577g, this.f122578h, this.f122579j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm12/a$q;", "<unused var>", "Lm12/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lm12/a$q;Lm12/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<m12.a.q, m12.d.a.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122582f;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.d.a.Displaying displaying = (m12.d.a.Displaying) this.f122582f;
            Object objE = uq.b.e();
            int i15 = this.f122581e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<m12.a.n> bVarY1 = d0.this.Y1();
                m12.a.n.MessageForm messageForm = new m12.a.n.MessageForm(new z02.a.Reply(displaying.getMessageDetailsPayload().getDirectoryName(), displaying.getMessageDetailsPayload().getDirectoryType(), displaying.getMessageDetailsPayload().getDirectoryId(), displaying.getMessageDetails(), null));
                this.f122582f = vq.j.a(displaying);
                this.f122581e = 1;
                if (bVarY1.F(messageForm, this) == objE) {
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
        public final Object w(m12.a.q qVar, m12.d.a.Displaying displaying, tq.e<? super oq.i0> eVar) {
            b0 b0Var = d0.this.new b0(eVar);
            b0Var.f122582f = displaying;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122584e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ DeliveryMessageDetails f122586g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f122587h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f122588j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f122589k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ er.a<oq.i0> f122590l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ er.a<oq.i0> f122591m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(DeliveryMessageDetails deliveryMessageDetails, String str, String str2, String str3, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f122586g = deliveryMessageDetails;
            this.f122587h = str;
            this.f122588j = str2;
            this.f122589k = str3;
            this.f122590l = aVar;
            this.f122591m = aVar2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f122584e;
            if (i15 == 0) {
                oq.u.b(obj);
                p02.d dVar = d0.this.downloadMessageAttachmentsUseCase;
                p02.d.Params params = new p02.d.Params(this.f122586g.getDeliveryMessage().getMessageId(), this.f122587h, this.f122588j, this.f122589k, null);
                this.f122584e = 1;
                obj = dVar.f(params, this);
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
            d0 d0Var = d0.this;
            er.a<oq.i0> aVar = this.f122590l;
            er.a<oq.i0> aVar2 = this.f122591m;
            DeliveryMessageDetails deliveryMessageDetails = this.f122586g;
            if (iVar instanceof dx.i.Left) {
                d0Var.ba((dx.b) ((dx.i.Left) iVar).b(), aVar, aVar2, deliveryMessageDetails, e02.a.U1);
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                u04.b bVar = (u04.b) ((dx.i.Right) iVar).b();
                d0Var.d9(new m12.a.DisplayMessage(deliveryMessageDetails));
                d0Var.Y9(bVar);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return d0.this.new c(this.f122586g, this.f122587h, this.f122588j, this.f122589k, this.f122590l, this.f122591m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm12/a$m;", "<unused var>", "Lm12/d$a$b;", "Loq/i0;", "<anonymous>", "(Lm12/a$m;Lm12/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<m12.a.m, m12.d.a.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122592e;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f122592e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = d0.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            d0 d0Var = d0.this;
            if (iVarA instanceof dx.i.Left) {
                d0Var.ga(d0Var.labelProvider.c(e02.a.I4));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.m mVar, m12.d.a.Displaying displaying, tq.e<? super oq.i0> eVar) {
            return d0.this.new c0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f122595e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f122597g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122595e = obj;
            this.f122597g |= PKIFailureInfo.systemUnavail;
            return d0.this.W9(null, this);
        }
    }

    /* JADX INFO: renamed from: m12.d0$d0, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$f;", "<unused var>", "Lk10/c0;", "Lm12/d$a$b;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C2998d0 extends vq.k implements er.q<m12.a.f, k10.c0<m12.d.a.Displaying>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122599f;

        C2998d0(tq.e<? super C2998d0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m12.d.a.EditingDraft O(k10.c0 c0Var, m12.d.a.Displaying displaying) {
            return new m12.d.a.EditingDraft(((m12.d.a.Displaying) c0Var.a()).getMessageDetails(), displaying.getMessageDetailsPayload());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f122599f;
            uq.b.e();
            if (this.f122598e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m12.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.C2998d0.O(c0Var, (d.a.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.f fVar, k10.c0<m12.d.a.Displaying> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            C2998d0 c2998d0 = new C2998d0(eVar);
            c2998d0.f122599f = c0Var;
            return c2998d0.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122600e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z02.a.ForwardMessage f122602g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ DeliveryMessageDetails f122603h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(z02.a.ForwardMessage forwardMessage, DeliveryMessageDetails deliveryMessageDetails, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f122602g = forwardMessage;
            this.f122603h = deliveryMessageDetails;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f122600e;
            if (i15 == 0) {
                oq.u.b(obj);
                p02.b bVar = d0.this.createEdorDraftUC;
                p02.b.Params params = new p02.b.Params(new eo0.v(null, pq.v.n(), null, null, null, d0.this.createForwardDetailsUC.b(new p02.c.Params(this.f122602g)), null));
                this.f122600e = 1;
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
            d0 d0Var = d0.this;
            DeliveryMessageDetails deliveryMessageDetails = this.f122603h;
            z02.a.ForwardMessage forwardMessage = this.f122602g;
            if (iVar instanceof dx.i.Left) {
                dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                m12.a.i iVar2 = m12.a.i.f122510a;
                d0Var.Z9(bVar2, d0Var.b9(new m12.a.GoToAuthorization(iVar2)), d0Var.b9(iVar2), d0Var.b9(new m12.a.DisplayMessage(deliveryMessageDetails)));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                d0Var.d9(new m12.a.GoToForwardMessageForm(z02.a.ForwardMessage.b(forwardMessage, null, null, null, null, ((EdeliveryDraftMessageResponse) ((dx.i.Right) iVar).b()).getDraftDetails(), 15, null)));
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return d0.this.new e(this.f122602g, this.f122603h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((e) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$i;", "<unused var>", "Lk10/c0;", "Lm12/d$a$b;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.q<m12.a.i, k10.c0<m12.d.a.Displaying>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122605f;

        e0(tq.e<? super e0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m12.d.a.Forwarding O(k10.c0 c0Var, m12.d.a.Displaying displaying) {
            return new m12.d.a.Forwarding(((m12.d.a.Displaying) c0Var.a()).getMessageDetails(), ((m12.d.a.Displaying) c0Var.a()).getMessageDetailsPayload());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f122605f;
            uq.b.e();
            if (this.f122604e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            List<DeliveryMessageDetailsAttachment> listD = ((m12.d.a.Displaying) c0Var.a()).getMessageDetails().d();
            if (!(listD instanceof Collection) || !listD.isEmpty()) {
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    if (((DeliveryMessageDetailsAttachment) it.next()).getTooBigToDownload()) {
                        d0.this.d9(new m12.a.ShowDialog(d0.this.forwardMessageDialogMapper.b(new l12.f.Params(d0.this.b9(m12.a.j.f122511a), d0.this.b9(new m12.a.OpenUrl(d0.this.commonEndpoints.M()))))));
                        return c0Var.c();
                    }
                }
            }
            return c0Var.d(new er.l() { // from class: m12.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.e0.O(c0Var, (d.a.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.i iVar, k10.c0<m12.d.a.Displaying> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            e0 e0Var = d0.this.new e0(eVar);
            e0Var.f122605f = c0Var;
            return e0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements er.p<eo0.y, String, oq.i0> {
        f() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ oq.i0 B(eo0.y yVar, String str) {
            c(yVar.getValue(), str);
            return oq.i0.f148189a;
        }

        public final void c(String str, String str2) {
            d0.this.d9(new m12.a.DownloadMessageAttachment(str, str2, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm12/a$j;", "<unused var>", "Lm12/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lm12/a$j;Lm12/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<m12.a.j, m12.d.a.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122609f;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.d.a.Displaying displaying = (m12.d.a.Displaying) this.f122609f;
            Object objE = uq.b.e();
            int i15 = this.f122608e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0.this.d9(new m12.a.DisplayMessage(displaying.getMessageDetails()));
                d0 d0Var = d0.this;
                m12.a.n.MessageForm messageForm = new m12.a.n.MessageForm(new z02.a.ForwardMessage(displaying.getMessageDetailsPayload().getDirectoryType(), displaying.getMessageDetailsPayload().getDirectoryName(), displaying.getMessageDetailsPayload().getDirectoryId(), DeliveryMessageDetails.b(displaying.getMessageDetails(), null, null, pq.v.n(), null, false, 27, null), null, null));
                this.f122609f = vq.j.a(displaying);
                this.f122608e = 1;
                if (d0Var.F(messageForm, this) == objE) {
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
        public final Object w(m12.a.j jVar, m12.d.a.Displaying displaying, tq.e<? super oq.i0> eVar) {
            f0 f0Var = d0.this.new f0(eVar);
            f0Var.f122609f = displaying;
            return f0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements mu.g<m12.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f122611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f122612b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f122613a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f122614b;

            /* JADX INFO: renamed from: m12.d0$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2999a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f122615d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f122616e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f122617f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f122619h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f122620j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f122621k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f122622l;

                public C2999a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f122615d = obj;
                    this.f122616e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, d0 d0Var) {
                this.f122613a = hVar;
                this.f122614b = d0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2999a c2999a;
                if (eVar instanceof C2999a) {
                    c2999a = (C2999a) eVar;
                    int i15 = c2999a.f122616e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2999a.f122616e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2999a = new C2999a(eVar);
                    }
                } else {
                    c2999a = new C2999a(eVar);
                }
                Object obj2 = c2999a.f122615d;
                Object objE = uq.b.e();
                int i16 = c2999a.f122616e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f122613a;
                    m12.e.a aVarDa = this.f122614b.da((m12.d) obj);
                    c2999a.f122617f = vq.j.a(obj);
                    c2999a.f122619h = vq.j.a(c2999a);
                    c2999a.f122620j = vq.j.a(obj);
                    c2999a.f122621k = vq.j.a(hVar);
                    c2999a.f122622l = 0;
                    c2999a.f122616e = 1;
                    if (hVar.F(aVarDa, c2999a) == objE) {
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

        public g(mu.g gVar, d0 d0Var) {
            this.f122611a = gVar;
            this.f122612b = d0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super m12.e.a> hVar, tq.e eVar) {
            Object objA = this.f122611a.a(new a(hVar, this.f122612b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$e;", "action", "Lk10/c0;", "Lm12/d$a$b;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.q<m12.a.DownloadMessageAttachment, k10.c0<m12.d.a.Displaying>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f122625g;

        g0(tq.e<? super g0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m12.d.a.DownloadingAttachment O(k10.c0 c0Var, m12.a.DownloadMessageAttachment downloadMessageAttachment, m12.d.a.Displaying displaying) {
            MessageDetailsPayload messageDetailsPayload = ((m12.d.a.Displaying) c0Var.a()).getMessageDetailsPayload();
            return new m12.d.a.DownloadingAttachment(((m12.d.a.Displaying) c0Var.a()).getMessageDetails(), messageDetailsPayload, downloadMessageAttachment.getAttachmentId(), downloadMessageAttachment.getFileName(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object next;
            final m12.a.DownloadMessageAttachment downloadMessageAttachment = (m12.a.DownloadMessageAttachment) this.f122624f;
            final k10.c0 c0Var = (k10.c0) this.f122625g;
            uq.b.e();
            if (this.f122623e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Iterator<T> it = ((m12.d.a.Displaying) c0Var.a()).getMessageDetails().d().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!eo0.y.d(((DeliveryMessageDetailsAttachment) next).getAttachmentId(), downloadMessageAttachment.getAttachmentId()));
            DeliveryMessageDetailsAttachment deliveryMessageDetailsAttachment = (DeliveryMessageDetailsAttachment) next;
            if (deliveryMessageDetailsAttachment == null || !deliveryMessageDetailsAttachment.getTooBigToDownload()) {
                return c0Var.d(new er.l() { // from class: m12.q0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.g0.O(c0Var, downloadMessageAttachment, (d.a.Displaying) obj2);
                    }
                });
            }
            d0.this.d9(new m12.a.ShowDialog(d0.this.attachmentTooBigToDownloadDialogMapper.b(new l12.b.Params(d0.this.b9(new m12.a.OpenUrl(d0.this.commonEndpoints.M()))))));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.DownloadMessageAttachment downloadMessageAttachment, k10.c0<m12.d.a.Displaying> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            g0 g0Var = d0.this.new g0(eVar);
            g0Var.f122624f = downloadMessageAttachment;
            g0Var.f122625g = c0Var;
            return g0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm12/a$a;", "<unused var>", "Lm12/d;", "Loq/i0;", "<anonymous>", "(Lm12/a$a;Lm12/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<m12.a.C2994a, m12.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122627e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f122627e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<m12.a.n> bVarY1 = d0.this.Y1();
                m12.a.n.C2995a c2995a = m12.a.n.C2995a.f122515a;
                this.f122627e = 1;
                if (bVarY1.F(c2995a, this) == objE) {
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
        public final Object w(m12.a.C2994a c2994a, m12.d dVar, tq.e<? super oq.i0> eVar) {
            return d0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$b;", "<unused var>", "Lk10/c0;", "Lm12/d$a$b;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.q<m12.a.b, k10.c0<m12.d.a.Displaying>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122630f;

        h0(tq.e<? super h0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m12.d.a.DeletingMessage O(k10.c0 c0Var, m12.d.a.Displaying displaying) {
            return new m12.d.a.DeletingMessage(((m12.d.a.Displaying) c0Var.a()).getMessageDetails(), ((m12.d.a.Displaying) c0Var.a()).getMessageDetailsPayload());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f122630f;
            uq.b.e();
            if (this.f122629e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m12.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.h0.O(c0Var, (d.a.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.b bVar, k10.c0<m12.d.a.Displaying> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            h0 h0Var = new h0(eVar);
            h0Var.f122630f = c0Var;
            return h0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm12/a$k;", "action", "Lm12/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lm12/a$k;Lm12/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<m12.a.GoToAuthorization, m12.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122632f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(d0 d0Var, m12.a.GoToAuthorization goToAuthorization) {
            d0Var.d9(goToAuthorization.getAction());
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m12.a.GoToAuthorization goToAuthorization = (m12.a.GoToAuthorization) this.f122632f;
            Object objE = uq.b.e();
            int i15 = this.f122631e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<m12.a.n> bVarY1 = d0.this.Y1();
                final d0 d0Var = d0.this;
                m12.a.n.GoToAuthorization goToAuthorization2 = new m12.a.n.GoToAuthorization(new OAuthWebViewData(new er.a() { // from class: m12.e0
                    @Override // er.a
                    public final Object a() {
                        return d0.i.O(d0Var, goToAuthorization);
                    }
                }));
                this.f122632f = vq.j.a(goToAuthorization);
                this.f122631e = 1;
                if (bVarY1.F(goToAuthorization2, this) == objE) {
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
        public final Object w(m12.a.GoToAuthorization goToAuthorization, m12.d dVar, tq.e<? super oq.i0> eVar) {
            i iVar = d0.this.new i(eVar);
            iVar.f122632f = goToAuthorization;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "event", "Lm12/d$a$d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Lm12/d$a$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.q<nx.a, m12.d.a.EditingDraft, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122635f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f122637a;

            static {
                int[] iArr = new int[nx.a.values().length];
                try {
                    iArr[nx.a.STARTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f122637a = iArr;
            }
        }

        i0(tq.e<? super i0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f122635f;
            uq.b.e();
            if (this.f122634e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (a.f122637a[aVar.ordinal()] == 1) {
                d0.this.d9(m12.a.p.f122521a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, m12.d.a.EditingDraft editingDraft, tq.e<? super oq.i0> eVar) {
            i0 i0Var = d0.this.new i0(eVar);
            i0Var.f122635f = aVar;
            return i0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm12/d$a$a;", "it", "Loq/i0;", "<anonymous>", "(Lm12/d$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<m12.d.a.DeletingMessage, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122638e;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f122638e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(m12.a.b.f122502a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(m12.d.a.DeletingMessage deletingMessage, tq.e<? super oq.i0> eVar) {
            return ((j) v(deletingMessage, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return d0.this.new j(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm12/d$a$d;", "state", "Loq/i0;", "<anonymous>", "(Lm12/d$a$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class j0 extends vq.k implements er.p<m12.d.a.EditingDraft, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122641f;

        j0(tq.e<? super j0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.d.a.EditingDraft editingDraft = (m12.d.a.EditingDraft) this.f122641f;
            Object objE = uq.b.e();
            int i15 = this.f122640e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<m12.a.n> bVarY1 = d0.this.Y1();
                m12.a.n.MessageForm messageForm = new m12.a.n.MessageForm(new z02.a.EditDraft(editingDraft.getMessageDetails(), editingDraft.getMessageDetailsPayload().getDirectoryName(), editingDraft.getMessageDetailsPayload().getDirectoryType(), editingDraft.getMessageDetailsPayload().getDirectoryId(), null));
                this.f122641f = vq.j.a(editingDraft);
                this.f122640e = 1;
                if (bVarY1.F(messageForm, this) == objE) {
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
        public final Object B(m12.d.a.EditingDraft editingDraft, tq.e<? super oq.i0> eVar) {
            return ((j0) v(editingDraft, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j0 j0Var = d0.this.new j0(eVar);
            j0Var.f122641f = obj;
            return j0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm12/a$b;", "<unused var>", "Lm12/d$a$a;", "state", "Loq/i0;", "<anonymous>", "(Lm12/a$b;Lm12/d$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<m12.a.b, m12.d.a.DeletingMessage, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122644f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.d.a.DeletingMessage deletingMessage = (m12.d.a.DeletingMessage) this.f122644f;
            Object objE = uq.b.e();
            int i15 = this.f122643e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                m12.a.b bVar = m12.a.b.f122502a;
                MessageDetailsPayload messageDetailsPayload = deletingMessage.getMessageDetailsPayload();
                DeliveryMessageDetails messageDetails = deletingMessage.getMessageDetails();
                this.f122644f = vq.j.a(deletingMessage);
                this.f122643e = 1;
                if (d0Var.T9(bVar, messageDetailsPayload, messageDetails, this) == objE) {
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
        public final Object w(m12.a.b bVar, m12.d.a.DeletingMessage deletingMessage, tq.e<? super oq.i0> eVar) {
            k kVar = d0.this.new k(eVar);
            kVar.f122644f = deletingMessage;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm12/a$p;", "<unused var>", "Lm12/d$a$d;", "Loq/i0;", "<anonymous>", "(Lm12/a$p;Lm12/d$a$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class k0 extends vq.k implements er.q<m12.a.p, m12.d.a.EditingDraft, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122646e;

        k0(tq.e<? super k0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f122646e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                MessageDetailsPayload messageDetailsPayload = d0Var.messageDetailsPayload;
                this.f122646e = 1;
                if (d0Var.W9(messageDetailsPayload, this) == objE) {
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
        public final Object w(m12.a.p pVar, m12.d.a.EditingDraft editingDraft, tq.e<? super oq.i0> eVar) {
            return d0.this.new k0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$i;", "<unused var>", "Lk10/c0;", "Lm12/d$a$e;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<m12.a.i, k10.c0<m12.d.a.Error>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122649f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m12.d.a.Forwarding O(k10.c0 c0Var, m12.d.a.Error error) {
            return new m12.d.a.Forwarding(((m12.d.a.Error) c0Var.a()).getMessageDetails(), ((m12.d.a.Error) c0Var.a()).getMessageDetailsPayload());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f122649f;
            uq.b.e();
            if (this.f122648e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m12.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.l.O(c0Var, (d.a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.i iVar, k10.c0<m12.d.a.Error> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            l lVar = new l(eVar);
            lVar.f122649f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm12/d$a$f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lm12/d$a$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class l0 extends vq.k implements er.p<m12.d.a.Forwarding, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122650e;

        l0(tq.e<? super l0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f122650e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(m12.a.i.f122510a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(m12.d.a.Forwarding forwarding, tq.e<? super oq.i0> eVar) {
            return ((l0) v(forwarding, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return d0.this.new l0(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$e;", "action", "Lk10/c0;", "Lm12/d$a$e;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<m12.a.DownloadMessageAttachment, k10.c0<m12.d.a.Error>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f122654g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m12.d.a.DownloadingAttachment O(k10.c0 c0Var, m12.a.DownloadMessageAttachment downloadMessageAttachment, m12.d.a.Error error) {
            return new m12.d.a.DownloadingAttachment(((m12.d.a.Error) c0Var.a()).getMessageDetails(), ((m12.d.a.Error) c0Var.a()).getMessageDetailsPayload(), downloadMessageAttachment.getAttachmentId(), downloadMessageAttachment.getFileName(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m12.a.DownloadMessageAttachment downloadMessageAttachment = (m12.a.DownloadMessageAttachment) this.f122653f;
            final k10.c0 c0Var = (k10.c0) this.f122654g;
            uq.b.e();
            if (this.f122652e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m12.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.m.O(c0Var, downloadMessageAttachment, (d.a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.DownloadMessageAttachment downloadMessageAttachment, k10.c0<m12.d.a.Error> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            m mVar = new m(eVar);
            mVar.f122653f = downloadMessageAttachment;
            mVar.f122654g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm12/a$i;", "<unused var>", "Lm12/d$a$f;", "state", "Loq/i0;", "<anonymous>", "(Lm12/a$i;Lm12/d$a$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class m0 extends vq.k implements er.q<m12.a.i, m12.d.a.Forwarding, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122656f;

        m0(tq.e<? super m0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.d.a.Forwarding forwarding = (m12.d.a.Forwarding) this.f122656f;
            Object objE = uq.b.e();
            int i15 = this.f122655e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                DeliveryMessageDetails messageDetails = forwarding.getMessageDetails();
                this.f122656f = vq.j.a(forwarding);
                this.f122655e = 1;
                if (d0Var.X9(messageDetails, this) == objE) {
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
        public final Object w(m12.a.i iVar, m12.d.a.Forwarding forwarding, tq.e<? super oq.i0> eVar) {
            m0 m0Var = d0.this.new m0(eVar);
            m0Var.f122656f = forwarding;
            return m0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$b;", "<unused var>", "Lk10/c0;", "Lm12/d$a$e;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<m12.a.b, k10.c0<m12.d.a.Error>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122659f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m12.d.a.DeletingMessage O(k10.c0 c0Var, m12.d.a.Error error) {
            return new m12.d.a.DeletingMessage(((m12.d.a.Error) c0Var.a()).getMessageDetails(), ((m12.d.a.Error) c0Var.a()).getMessageDetailsPayload());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f122659f;
            uq.b.e();
            if (this.f122658e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m12.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.n.O(c0Var, (d.a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.b bVar, k10.c0<m12.d.a.Error> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            n nVar = new n(eVar);
            nVar.f122659f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm12/a$l;", "action", "Lm12/d$a$f;", "state", "Loq/i0;", "<anonymous>", "(Lm12/a$l;Lm12/d$a$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class n0 extends vq.k implements er.q<m12.a.GoToForwardMessageForm, m12.d.a.Forwarding, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122661f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f122662g;

        n0(tq.e<? super n0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.a.GoToForwardMessageForm goToForwardMessageForm = (m12.a.GoToForwardMessageForm) this.f122661f;
            m12.d.a.Forwarding forwarding = (m12.d.a.Forwarding) this.f122662g;
            Object objE = uq.b.e();
            int i15 = this.f122660e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0.this.d9(new m12.a.DisplayMessage(forwarding.getMessageDetails()));
                d0 d0Var = d0.this;
                m12.a.n.MessageForm messageForm = new m12.a.n.MessageForm(goToForwardMessageForm.getEntryMessageType());
                this.f122661f = vq.j.a(goToForwardMessageForm);
                this.f122662g = vq.j.a(forwarding);
                this.f122660e = 1;
                if (d0Var.F(messageForm, this) == objE) {
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
        public final Object w(m12.a.GoToForwardMessageForm goToForwardMessageForm, m12.d.a.Forwarding forwarding, tq.e<? super oq.i0> eVar) {
            n0 n0Var = d0.this.new n0(eVar);
            n0Var.f122661f = goToForwardMessageForm;
            n0Var.f122662g = forwarding;
            return n0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm12/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lm12/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.p<Loading, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122664e;

        o(tq.e<? super o> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f122664e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(m12.a.h.f122509a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Loading loading, tq.e<? super oq.i0> eVar) {
            return ((o) v(loading, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return d0.this.new o(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm12/d$a$c;", "state", "Loq/i0;", "<anonymous>", "(Lm12/d$a$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class o0 extends vq.k implements er.p<m12.d.a.DownloadingAttachment, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122667f;

        o0(tq.e<? super o0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.d.a.DownloadingAttachment downloadingAttachment = (m12.d.a.DownloadingAttachment) this.f122667f;
            uq.b.e();
            if (this.f122666e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(new m12.a.DownloadMessageAttachment(downloadingAttachment.getAttachmentId(), downloadingAttachment.getFileName(), null));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(m12.d.a.DownloadingAttachment downloadingAttachment, tq.e<? super oq.i0> eVar) {
            return ((o0) v(downloadingAttachment, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            o0 o0Var = d0.this.new o0(eVar);
            o0Var.f122667f = obj;
            return o0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm12/a$h;", "<unused var>", "Lm12/c;", "Loq/i0;", "<anonymous>", "(Lm12/a$h;Lm12/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<m12.a.h, Loading, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122669e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f122669e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                MessageDetailsPayload messageDetailsPayload = d0Var.messageDetailsPayload;
                this.f122669e = 1;
                if (d0Var.W9(messageDetailsPayload, this) == objE) {
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
        public final Object w(m12.a.h hVar, Loading loading, tq.e<? super oq.i0> eVar) {
            return d0.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm12/a$e;", "action", "Lm12/d$a$c;", "state", "Loq/i0;", "<anonymous>", "(Lm12/a$e;Lm12/d$a$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class p0 extends vq.k implements er.q<m12.a.DownloadMessageAttachment, m12.d.a.DownloadingAttachment, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f122673g;

        p0(tq.e<? super p0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.a.DownloadMessageAttachment downloadMessageAttachment = (m12.a.DownloadMessageAttachment) this.f122672f;
            m12.d.a.DownloadingAttachment downloadingAttachment = (m12.d.a.DownloadingAttachment) this.f122673g;
            Object objE = uq.b.e();
            int i15 = this.f122671e;
            if (i15 == 0) {
                oq.u.b(obj);
                DeliveryMessageDetails messageDetails = downloadingAttachment.getMessageDetails();
                String directoryId = downloadingAttachment.getMessageDetailsPayload().getDirectoryId();
                String attachmentId = downloadMessageAttachment.getAttachmentId();
                String fileName = downloadMessageAttachment.getFileName();
                er.a aVarB9 = d0.this.b9(new m12.a.DownloadMessageAttachment(downloadMessageAttachment.getAttachmentId(), downloadMessageAttachment.getFileName(), null));
                er.a aVarB10 = d0.this.b9(new m12.a.GoToAuthorization(new m12.a.DownloadMessageAttachment(downloadMessageAttachment.getAttachmentId(), downloadMessageAttachment.getFileName(), null)));
                d0 d0Var = d0.this;
                this.f122672f = vq.j.a(downloadMessageAttachment);
                this.f122673g = vq.j.a(downloadingAttachment);
                this.f122671e = 1;
                if (d0Var.U9(directoryId, attachmentId, fileName, messageDetails, aVarB10, aVarB9, this) == objE) {
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
        public final Object w(m12.a.DownloadMessageAttachment downloadMessageAttachment, m12.d.a.DownloadingAttachment downloadingAttachment, tq.e<? super oq.i0> eVar) {
            p0 p0Var = d0.this.new p0(eVar);
            p0Var.f122672f = downloadMessageAttachment;
            p0Var.f122673g = downloadingAttachment;
            return p0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$d;", "action", "Lk10/c0;", "Lm12/c;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<m12.a.DisplayStub, k10.c0<Loading>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122676f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f122677g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m12.d.InitializedStub O(m12.a.DisplayStub displayStub, Loading loading) {
            return new m12.d.InitializedStub(loading.getMessageDetailsPayload(), displayStub.getAlertMessage());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m12.a.DisplayStub displayStub = (m12.a.DisplayStub) this.f122676f;
            k10.c0 c0Var = (k10.c0) this.f122677g;
            uq.b.e();
            if (this.f122675e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m12.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.q.O(displayStub, (Loading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.DisplayStub displayStub, k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            q qVar = new q(eVar);
            qVar.f122676f = displayStub;
            qVar.f122677g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$c;", "action", "Lk10/c0;", "Lm12/c;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<m12.a.DisplayMessage, k10.c0<Loading>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122679f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f122680g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m12.d.a.Displaying O(m12.a.DisplayMessage displayMessage, k10.c0 c0Var, Loading loading) {
            return new m12.d.a.Displaying(displayMessage.getDeliveryMessageDetails(), ((Loading) c0Var.a()).getMessageDetailsPayload());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m12.a.DisplayMessage displayMessage = (m12.a.DisplayMessage) this.f122679f;
            final k10.c0 c0Var = (k10.c0) this.f122680g;
            uq.b.e();
            if (this.f122678e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m12.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.r.O(displayMessage, c0Var, (Loading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.DisplayMessage displayMessage, k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            r rVar = new r(eVar);
            rVar.f122679f = displayMessage;
            rVar.f122680g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$g;", "action", "Lk10/c0;", "Lm12/c;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<m12.a.Fail, k10.c0<Loading>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122682f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f122683g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error O(k10.c0 c0Var, d0 d0Var, m12.a.Fail fail, Loading loading) {
            return new Error(d0Var.errorVMSFactory.a(fail.getErrorData()), ((Loading) c0Var.a()).getMessageDetailsPayload());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m12.a.Fail fail = (m12.a.Fail) this.f122682f;
            final k10.c0 c0Var = (k10.c0) this.f122683g;
            uq.b.e();
            if (this.f122681e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final d0 d0Var = d0.this;
            return c0Var.d(new er.l() { // from class: m12.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.s.O(c0Var, d0Var, fail, (Loading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.Fail fail, k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            s sVar = d0.this.new s(eVar);
            sVar.f122682f = fail;
            sVar.f122683g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$h;", "<unused var>", "Lk10/c0;", "Lm12/b;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<m12.a.h, k10.c0<Error>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122686f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(k10.c0 c0Var, Error error) {
            return new Loading(((Error) c0Var.a()).getMessageDetailsPayload());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f122686f;
            uq.b.e();
            if (this.f122685e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m12.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.t.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.h hVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            t tVar = new t(eVar);
            tVar.f122686f = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm12/a$t;", "action", "Lm12/d$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lm12/a$t;Lm12/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<m12.a.ShowTechnicalDetails, m12.d.InitializedStub, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122688f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.a.ShowTechnicalDetails showTechnicalDetails = (m12.a.ShowTechnicalDetails) this.f122688f;
            Object objE = uq.b.e();
            int i15 = this.f122687e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                m12.a.n.GoToTechnicalDetails goToTechnicalDetails = new m12.a.n.GoToTechnicalDetails(showTechnicalDetails.getDetails());
                this.f122688f = vq.j.a(showTechnicalDetails);
                this.f122687e = 1;
                if (d0Var.F(goToTechnicalDetails, this) == objE) {
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
        public final Object w(m12.a.ShowTechnicalDetails showTechnicalDetails, m12.d.InitializedStub initializedStub, tq.e<? super oq.i0> eVar) {
            u uVar = d0.this.new u(eVar);
            uVar.f122688f = showTechnicalDetails;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$c;", "action", "Lk10/c0;", "Lm12/d$a;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<m12.a.DisplayMessage, k10.c0<m12.d.a>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f122692g;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m12.d.a.Displaying O(m12.a.DisplayMessage displayMessage, k10.c0 c0Var, m12.d.a aVar) {
            return new m12.d.a.Displaying(displayMessage.getDeliveryMessageDetails(), ((m12.d.a) c0Var.a()).getMessageDetailsPayload());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m12.a.DisplayMessage displayMessage = (m12.a.DisplayMessage) this.f122691f;
            final k10.c0 c0Var = (k10.c0) this.f122692g;
            uq.b.e();
            if (this.f122690e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m12.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.v.O(displayMessage, c0Var, (d.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.DisplayMessage displayMessage, k10.c0<m12.d.a> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            v vVar = new v(eVar);
            vVar.f122691f = displayMessage;
            vVar.f122692g = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm12/a$g;", "action", "Lk10/c0;", "Lm12/d$a;", "state", "Lk10/l;", "Lm12/d;", "<anonymous>", "(Lm12/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<m12.a.Fail, k10.c0<m12.d.a>, tq.e<? super k10.l<? extends m12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122694f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f122695g;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m12.d.a.Error O(k10.c0 c0Var, d0 d0Var, m12.a.Fail fail, m12.d.a aVar) {
            return new m12.d.a.Error(((m12.d.a) c0Var.a()).getMessageDetails(), ((m12.d.a) c0Var.a()).getMessageDetailsPayload(), d0Var.errorVMSFactory.a(fail.getErrorData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m12.a.Fail fail = (m12.a.Fail) this.f122694f;
            final k10.c0 c0Var = (k10.c0) this.f122695g;
            uq.b.e();
            if (this.f122693e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final d0 d0Var = d0.this;
            return c0Var.d(new er.l() { // from class: m12.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.w.O(c0Var, d0Var, fail, (d.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.Fail fail, k10.c0<m12.d.a> c0Var, tq.e<? super k10.l<? extends m12.d>> eVar) {
            w wVar = d0.this.new w(eVar);
            wVar.f122694f = fail;
            wVar.f122695g = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm12/a$s;", "action", "Lm12/d$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lm12/a$s;Lm12/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<m12.a.ShowDialog, m12.d.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122698f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.a.ShowDialog showDialog = (m12.a.ShowDialog) this.f122698f;
            Object objE = uq.b.e();
            int i15 = this.f122697e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<m12.a.n> bVarY1 = d0.this.Y1();
                m12.a.n.ShowNavigationDialog showNavigationDialog = new m12.a.n.ShowNavigationDialog(showDialog.getDialogData());
                this.f122698f = vq.j.a(showDialog);
                this.f122697e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
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
        public final Object w(m12.a.ShowDialog showDialog, m12.d.a aVar, tq.e<? super oq.i0> eVar) {
            x xVar = d0.this.new x(eVar);
            xVar.f122698f = showDialog;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm12/a$o;", "action", "Lm12/d$a;", "state", "Loq/i0;", "<anonymous>", "(Lm12/a$o;Lm12/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<m12.a.OpenUrl, m12.d.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122701f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f122702g;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.a.OpenUrl openUrl = (m12.a.OpenUrl) this.f122701f;
            m12.d.a aVar = (m12.d.a) this.f122702g;
            Object objE = uq.b.e();
            int i15 = this.f122700e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = d0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f122701f = vq.j.a(openUrl);
                this.f122702g = aVar;
                this.f122700e = 1;
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
            d0 d0Var = d0.this;
            if (iVar instanceof dx.i.Left) {
                d0Var.ga(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage());
            }
            d0.this.d9(new m12.a.DisplayMessage(aVar.getMessageDetails()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(m12.a.OpenUrl openUrl, m12.d.a aVar, tq.e<? super oq.i0> eVar) {
            y yVar = d0.this.new y(eVar);
            yVar.f122701f = openUrl;
            yVar.f122702g = aVar;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm12/a$t;", "action", "Lm12/d$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lm12/a$t;Lm12/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<m12.a.ShowTechnicalDetails, m12.d.a.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f122705f;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m12.a.ShowTechnicalDetails showTechnicalDetails = (m12.a.ShowTechnicalDetails) this.f122705f;
            Object objE = uq.b.e();
            int i15 = this.f122704e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                m12.a.n.GoToTechnicalDetails goToTechnicalDetails = new m12.a.n.GoToTechnicalDetails(showTechnicalDetails.getDetails());
                this.f122705f = vq.j.a(showTechnicalDetails);
                this.f122704e = 1;
                if (d0Var.F(goToTechnicalDetails, this) == objE) {
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
        public final Object w(m12.a.ShowTechnicalDetails showTechnicalDetails, m12.d.a.Displaying displaying, tq.e<? super oq.i0> eVar) {
            z zVar = d0.this.new z(eVar);
            zVar.f122705f = showTechnicalDetails;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public d0(yy.a aVar, p02.i iVar, ac4.a aVar2, ib4.c cVar, p02.d dVar, n12.l lVar, mx.c cVar2, u04.a aVar3, l12.d dVar2, q02.d dVar3, i70.e eVar, n12.d dVar4, oz.q qVar, l12.f fVar, a14.w wVar, p02.b bVar, p02.c cVar3, a14.m mVar, l12.b bVar2, hb4.d dVar5, MessageDetailsPayload messageDetailsPayload) {
        this.fetchMessageDetailsUseCase = iVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.downloadMessageAttachmentsUseCase = dVar;
        this.messageDetailsMapper = lVar;
        this.labelProvider = cVar2;
        this.commonEndpoints = aVar3;
        this.fileAccessPermissionDialogMapper = dVar2;
        this.deleteMessageUC = dVar3;
        this.globalSnackBarManager = eVar;
        this.deleteMessageDialogMapper = dVar4;
        this.ownerViewLifecycleManager = qVar;
        this.forwardMessageDialogMapper = fVar;
        this.openUrlIntentUseCase = wVar;
        this.createEdorDraftUC = bVar;
        this.createForwardDetailsUC = cVar3;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.attachmentTooBigToDownloadDialogMapper = bVar2;
        this.errorVMSFactory = dVar5;
        this.messageDetailsPayload = messageDetailsPayload;
        Loading loading = new Loading(messageDetailsPayload);
        this.initialState = loading;
        this.lifecycleConnector = qVar;
        this.stateMachine = aVar.a(loading, new er.l() { // from class: m12.t
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ha(this.f122766a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new g(e9().getState(), this), da(loading));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T9(m12.a aVar, MessageDetailsPayload messageDetailsPayload, DeliveryMessageDetails deliveryMessageDetails, tq.e<? super oq.i0> eVar) {
        Object objA = ac4.a.a(this.callActionWithLoaderUseCase, null, new b(messageDetailsPayload, deliveryMessageDetails, aVar, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U9(String str, String str2, String str3, DeliveryMessageDetails deliveryMessageDetails, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, tq.e<? super oq.i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new c(deliveryMessageDetails, str, str2, str3, aVar, aVar2, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W9(MessageDetailsPayload messageDetailsPayload, tq.e<? super oq.i0> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f122597g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f122597g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objF = dVar.f122595e;
        Object objE = uq.b.e();
        int i16 = dVar.f122597g;
        if (i16 == 0) {
            oq.u.b(objF);
            p02.i iVar = this.fetchMessageDetailsUseCase;
            p02.i.Params params = new p02.i.Params(messageDetailsPayload);
            dVar.f122594d = vq.j.a(messageDetailsPayload);
            dVar.f122597g = 1;
            objF = iVar.f(params, dVar);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objF);
        }
        dx.i iVar2 = (dx.i) objF;
        if (iVar2 instanceof dx.i.Left) {
            dx.b bVar = (dx.b) ((dx.i.Left) iVar2).b();
            m12.a.h hVar = m12.a.h.f122509a;
            Z9(bVar, b9(new m12.a.GoToAuthorization(hVar)), b9(hVar), b9(m12.a.C2994a.f122501a));
        } else {
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            d9(new m12.a.DisplayMessage((DeliveryMessageDetails) ((dx.i.Right) iVar2).b()));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object X9(DeliveryMessageDetails deliveryMessageDetails, tq.e<? super oq.i0> eVar) {
        z02.a.ForwardMessage forwardMessage = new z02.a.ForwardMessage(this.messageDetailsPayload.getDirectoryType(), this.messageDetailsPayload.getDirectoryName(), this.messageDetailsPayload.getDirectoryId(), deliveryMessageDetails, null, null);
        if (forwardMessage.getMessageDetails().getDeliveryMessage().getServiceType() != y0.E_DELIVERY || forwardMessage.getMessageDetails().d().isEmpty()) {
            d9(new m12.a.GoToForwardMessageForm(forwardMessage));
        } else {
            Object objA = ac4.a.a(this.callActionWithLoaderUseCase, null, new e(forwardMessage, deliveryMessageDetails, null), eVar, 1, null);
            if (objA == uq.b.e()) {
                return objA;
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y9(u04.b downloadStatus) {
        int i15 = a.f122571a[downloadStatus.ordinal()];
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            ga(this.labelProvider.c(ta(downloadStatus)));
        } else {
            if (i15 != 4) {
                throw new oq.p();
            }
            ga(this.labelProvider.c(ta(downloadStatus)));
            d9(new m12.a.ShowDialog(this.fileAccessPermissionDialogMapper.b(new l12.d.Params(b9(m12.a.m.f122514a)))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z9(dx.b domainError, er.a<oq.i0> onRefreshToken, final er.a<oq.i0> onRetry, final er.a<oq.i0> onBack) {
        boolean z15 = domainError instanceof dx.b.Business;
        if (z15 && ((dx.b.Business) domainError).getType() == n02.a.REFRESH_TOKEN_EXPIRED) {
            onRefreshToken.a();
            return;
        }
        if (z15) {
            dx.b.Business business = (dx.b.Business) domainError;
            if (business.getType() == n02.a.GET_EDELIVERY_MESSAGE_NOT_READY_ERROR) {
                d9(new m12.a.DisplayStub(business.getTitle()));
                return;
            }
        }
        d9(new m12.a.Fail(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: m12.r
            @Override // er.l
            public final Object b(Object obj) {
                return d0.aa(onBack, onRetry, (ib4.c.b) obj);
            }
        }, 2, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            aVar.a();
        } else {
            if (!(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ba(dx.b domainError, er.a<oq.i0> onRefreshToken, final er.a<oq.i0> onRetry, final DeliveryMessageDetails deliveryMessageDetails, int snackbarTextRes) {
        if ((domainError instanceof dx.b.Business) && ((dx.b.Business) domainError).getType() == n02.a.REFRESH_TOKEN_EXPIRED) {
            onRefreshToken.a();
        } else if (domainError instanceof dx.b.g.e) {
            d9(new m12.a.Fail(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: m12.s
                @Override // er.l
                public final Object b(Object obj) {
                    return d0.ca(this.f122763a, deliveryMessageDetails, onRetry, (ib4.c.b) obj);
                }
            }, 2, null))));
        } else {
            d9(new m12.a.DisplayMessage(deliveryMessageDetails));
            ga(this.labelProvider.c(snackbarTextRes));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(d0 d0Var, DeliveryMessageDetails deliveryMessageDetails, er.a aVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            d0Var.d9(new m12.a.DisplayMessage(deliveryMessageDetails));
        } else {
            if (!(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m12.e.a da(m12.d state) {
        n12.l lVar = this.messageDetailsMapper;
        er.a<oq.i0> aVarB9 = b9(m12.a.C2994a.f122501a);
        er.a<oq.i0> aVarB10 = b9(m12.a.m.f122514a);
        er.a<oq.i0> aVarB11 = b9(m12.a.i.f122510a);
        er.a<oq.i0> aVarB12 = b9(m12.a.q.f122522a);
        er.a<oq.i0> aVarB13 = b9(m12.a.r.f122523a);
        return lVar.b(new n12.l.Params(state, aVarB9, new f(), aVarB10, aVarB11, aVarB12, b9(m12.a.f.f122507a), aVarB13, new er.l() { // from class: m12.o
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ea(this.f122753a, (DeliveryMessageDetails) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(d0 d0Var, DeliveryMessageDetails deliveryMessageDetails) {
        d0Var.d9(new m12.a.ShowTechnicalDetails(deliveryMessageDetails));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ga(Label message) {
        this.globalSnackBarManager.y(new p50.a.DefaultWithIcon(message, false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(final d0 d0Var, k10.v vVar) {
        vVar.c(fr.q0.c(m12.d.class), new er.l() { // from class: m12.u
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ia(this.f122768a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Loading.class), new er.l() { // from class: m12.w
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ja(this.f122770a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: m12.x
            @Override // er.l
            public final Object b(Object obj) {
                return d0.la((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(m12.d.InitializedStub.class), new er.l() { // from class: m12.y
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ma(this.f122771a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(m12.d.a.class), new er.l() { // from class: m12.z
            @Override // er.l
            public final Object b(Object obj) {
                return d0.na(this.f122772a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(m12.d.a.Displaying.class), new er.l() { // from class: m12.a0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.oa(this.f122526a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(m12.d.a.EditingDraft.class), new er.l() { // from class: m12.b0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.pa(this.f122529a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(m12.d.a.Forwarding.class), new er.l() { // from class: m12.c0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.qa(this.f122531a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(m12.d.a.DownloadingAttachment.class), new er.l() { // from class: m12.p
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ra(this.f122755a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(m12.d.a.DeletingMessage.class), new er.l() { // from class: m12.q
            @Override // er.l
            public final Object b(Object obj) {
                return d0.sa(this.f122757a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(m12.d.a.Error.class), new er.l() { // from class: m12.v
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ka((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(d0 d0Var, k10.z zVar) {
        h hVar = d0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(m12.a.C2994a.class), oVar, hVar);
        zVar.x(fr.q0.c(m12.a.GoToAuthorization.class), oVar, d0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(d0 d0Var, k10.z zVar) {
        zVar.C(d0Var.new o(null));
        p pVar = d0Var.new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(m12.a.h.class), oVar, pVar);
        zVar.v(fr.q0.c(m12.a.DisplayStub.class), oVar, new q(null));
        zVar.v(fr.q0.c(m12.a.DisplayMessage.class), oVar, new r(null));
        zVar.v(fr.q0.c(m12.a.Fail.class), oVar, d0Var.new s(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ka(k10.z zVar) {
        l lVar = new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(m12.a.i.class), oVar, lVar);
        zVar.v(fr.q0.c(m12.a.DownloadMessageAttachment.class), oVar, new m(null));
        zVar.v(fr.q0.c(m12.a.b.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 la(k10.z zVar) {
        t tVar = new t(null);
        zVar.v(fr.q0.c(m12.a.h.class), k10.o.CANCEL_PREVIOUS, tVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ma(d0 d0Var, k10.z zVar) {
        u uVar = d0Var.new u(null);
        zVar.x(fr.q0.c(m12.a.ShowTechnicalDetails.class), k10.o.CANCEL_PREVIOUS, uVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 na(d0 d0Var, k10.z zVar) {
        v vVar = new v(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(m12.a.DisplayMessage.class), oVar, vVar);
        zVar.v(fr.q0.c(m12.a.Fail.class), oVar, d0Var.new w(null));
        zVar.x(fr.q0.c(m12.a.ShowDialog.class), oVar, d0Var.new x(null));
        zVar.x(fr.q0.c(m12.a.OpenUrl.class), oVar, d0Var.new y(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 oa(d0 d0Var, k10.z zVar) {
        z zVar2 = d0Var.new z(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(m12.a.ShowTechnicalDetails.class), oVar, zVar2);
        zVar.x(fr.q0.c(m12.a.r.class), oVar, d0Var.new a0(null));
        zVar.x(fr.q0.c(m12.a.q.class), oVar, d0Var.new b0(null));
        zVar.x(fr.q0.c(m12.a.m.class), oVar, d0Var.new c0(null));
        zVar.v(fr.q0.c(m12.a.f.class), oVar, new C2998d0(null));
        zVar.v(fr.q0.c(m12.a.i.class), oVar, d0Var.new e0(null));
        zVar.x(fr.q0.c(m12.a.j.class), oVar, d0Var.new f0(null));
        zVar.v(fr.q0.c(m12.a.DownloadMessageAttachment.class), oVar, d0Var.new g0(null));
        zVar.v(fr.q0.c(m12.a.b.class), oVar, new h0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 pa(d0 d0Var, k10.z zVar) {
        k10.k.s(zVar, d0Var.x8(), null, d0Var.new i0(null), 2, null);
        zVar.C(d0Var.new j0(null));
        k0 k0Var = d0Var.new k0(null);
        zVar.x(fr.q0.c(m12.a.p.class), k10.o.CANCEL_PREVIOUS, k0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 qa(d0 d0Var, k10.z zVar) {
        zVar.C(d0Var.new l0(null));
        m0 m0Var = d0Var.new m0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(m12.a.i.class), oVar, m0Var);
        zVar.x(fr.q0.c(m12.a.GoToForwardMessageForm.class), oVar, d0Var.new n0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ra(d0 d0Var, k10.z zVar) {
        zVar.C(d0Var.new o0(null));
        p0 p0Var = d0Var.new p0(null);
        zVar.x(fr.q0.c(m12.a.DownloadMessageAttachment.class), k10.o.CANCEL_PREVIOUS, p0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 sa(d0 d0Var, k10.z zVar) {
        zVar.C(d0Var.new j(null));
        k kVar = d0Var.new k(null);
        zVar.x(fr.q0.c(m12.a.b.class), k10.o.CANCEL_PREVIOUS, kVar);
        return oq.i0.f148189a;
    }

    private final int ta(u04.b bVar) {
        return a.f122571a[bVar.ordinal()] == 1 ? e02.a.V1 : e02.a.U1;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: V9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(m12.a.n nVar, tq.e<? super oq.i0> eVar) {
        return super.F(nVar, eVar);
    }

    @Override // zx.b
    public xw.b<m12.a.n> Y1() {
        return this.navAction;
    }

    @Override // m12.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<m12.d, m12.a> e9() {
        return this.stateMachine;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: fa, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(MessageDetailsPayload messageDetailsPayload) {
        super.P5(messageDetailsPayload);
    }

    @Override // l00.e
    public mu.p0<m12.e.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
