package j21;

import g21.Action;
import g21.ConversationData;
import g21.RateAnswerModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb4.PayloadErrorData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.conscrypt.metrics.ConscryptStatsLog;
import p071kotlin.Metadata;
import p21.SetupData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 «\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0002¬\u0001B«\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0001\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0014¢\u0006\u0004\b1\u00102J\u0018\u00105\u001a\u0002002\u0006\u00104\u001a\u000203H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000200H\u0096\u0001¢\u0006\u0004\b7\u00102J\u0018\u00109\u001a\u0002002\u0006\u00108\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020<2\u0006\u00108\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u00108\u001a\u00020\u0002H\u0002¢\u0006\u0004\b@\u0010AJ,\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E2\f\u00108\u001a\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u0003H\u0082@¢\u0006\u0004\bG\u0010HJ\u0018\u0010K\u001a\u0002002\u0006\u0010J\u001a\u00020IH\u0082@¢\u0006\u0004\bK\u0010LJ'\u0010O\u001a\b\u0012\u0004\u0012\u00020F0E*\b\u0012\u0004\u0012\u00020F0B2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ8\u0010U\u001a\b\u0012\u0004\u0012\u00020F0E*\b\u0012\u0004\u0012\u00020F0B2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020I2\u0006\u0010T\u001a\u00020\u0003H\u0082@¢\u0006\u0004\bU\u0010VJ \u0010X\u001a\u0002002\u0006\u0010W\u001a\u00020Q2\u0006\u0010D\u001a\u00020\u0003H\u0082@¢\u0006\u0004\bX\u0010YJ\u001f\u0010[\u001a\u00020Z2\u0006\u0010W\u001a\u00020Q2\u0006\u0010T\u001a\u00020\u0003H\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u0002002\u0006\u0010]\u001a\u00020<H\u0002¢\u0006\u0004\b^\u0010_J \u0010d\u001a\u0002002\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020bH\u0082@¢\u0006\u0004\bd\u0010eJ \u0010i\u001a\u0002002\u0006\u0010g\u001a\u00020f2\u0006\u0010h\u001a\u00020bH\u0082@¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u0002002\u0006\u0010W\u001a\u00020kH\u0002¢\u0006\u0004\bl\u0010mR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R,\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0096\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u00030\u009d\u00010\u009c\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b5\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R%\u00108\u001a\t\u0012\u0004\u0012\u00020?0¢\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u001e\u0010ª\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010§\u00018\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b|\u0010©\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lj21/p0;", "Ll00/g;", "Lj21/g;", "Lj21/a;", "Lj21/h;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "Lk21/m;", "chatBotNavigationDialogMapper", "snackBarManagerStateHolder", "Lh21/j;", "getStartConversationDateTimeUseCase", "Lh21/b;", "checkIfMessageHasPersonalDataUseCase", "Le21/a;", "interactor", "Lyw/b;", "accessibilityTalkBackManager", "Lh21/i;", "getServiceStatusUC", "Lh21/g;", "getDocumentStatusUC", "La14/w;", "openUrlIntentUseCase", "La14/d0;", "shareTextIntentUseCase", "Lk21/l;", "chatBotConversationMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lj21/m1$c;", "streamingStateMachineFactory", "Lj21/i1;", "conversationsUpdater", "Lh21/e;", "clearCachedDocumentConfigsUC", "Lcb4/j;", "dialogVmsFactory", "Lj21/f;", "setupData", "<init>", "(Lyy/a;Lmx/c;Lib4/c;Lk21/m;Li70/n;Lh21/j;Lh21/b;Le21/a;Lyw/b;Lh21/i;Lh21/g;La14/w;La14/d0;Lk21/l;Lac4/a;Lj21/m1$c;Lj21/i1;Lh21/e;Lcb4/j;Lj21/f;)V", "Loq/i0;", "Y8", "()V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "state", "qa", "(Lj21/g;Ltq/e;)Ljava/lang/Object;", "Lj21/g$a$c;", "", "fa", "(Lj21/g$a$c;)Z", "Lj21/h$a;", "ga", "(Lj21/g;)Lj21/h$a;", "Lk10/c0;", "Lj21/g$b;", "action", "Lk10/l;", "Lj21/g$a;", "ba", "(Lk10/c0;Lj21/a;Ltq/e;)Ljava/lang/Object;", "", "inputContent", "Ia", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lj21/h1$a;", "answer", "ua", "(Lk10/c0;Lj21/h1$a;)Lk10/l;", "Ldx/b;", "error", "question", "retryAction", "ra", "(Lk10/c0;Ldx/b;Ljava/lang/String;Lj21/a;Ltq/e;)Ljava/lang/Object;", "domainError", "aa", "(Ldx/b;Lj21/a;Ltq/e;)Ljava/lang/Object;", "Ljb4/b;", "X9", "(Ldx/b;Lj21/a;)Ljb4/b;", "isSuccess", "xa", "(Z)V", "Lrq0/c;", "serviceType", "Liy/b0;", "serviceUrl", "ea", "(Lrq0/c;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lrq0/b;", "documentType", "documentUrl", "da", "(Lrq0/b;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Ldx/b$c;", "ta", "(Ldx/b$c;)V", "b", "Lmx/c;", "c", "Lib4/c;", "d", "Lk21/m;", "e", "Li70/n;", "f", "Lh21/j;", "g", "Lh21/b;", "h", "Le21/a;", "j", "Lyw/b;", "k", "Lh21/i;", "l", "Lh21/g;", "m", "La14/w;", "n", "La14/d0;", "p", "Lk21/l;", "q", "Lac4/a;", "r", "Lj21/m1$c;", "s", "Lj21/i1;", "t", "Lh21/e;", "v", "Lcb4/j;", "Lj21/g$b$b;", "w", "Lj21/g$b$b;", "initialState", "Lk10/t;", "x", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lj21/a$i;", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "z", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "A", "a", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 extends l00.g<j21.g, j21.a> implements j21.h, zx.d, i70.n {
    private static final a A = new a(null);
    public static final int B = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k21.m chatBotNavigationDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h21.j getStartConversationDateTimeUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h21.b checkIfMessageHasPersonalDataUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final e21.a interactor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h21.i getServiceStatusUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final h21.g getDocumentStatusUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a14.d0 shareTextIntentUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k21.l chatBotConversationMapper;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final m1.c streamingStateMachineFactory;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final i1 conversationsUpdater;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final h21.e clearCachedDocumentConfigsUC;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVmsFactory;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final j21.g.b.Screen initialState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final k10.t<j21.g, j21.a> stateMachine;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final xw.b<j21.a.i> navAction;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<j21.h.Data> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lj21/p0$a;", "", "<init>", "()V", "", "ERROR_AS_BOT_MESSAGE_PREFIX", "Ljava/lang/String;", "ERROR_GLOBAL_TOKEN_LIMIT_REACHED", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj21/a$d;", "action", "Lj21/g$a$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lj21/a$d;Lj21/g$a$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<j21.a.GoToAvailableDocument, j21.g.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98834f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f98836e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f98837f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ j21.a.GoToAvailableDocument f98838g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, j21.a.GoToAvailableDocument goToAvailableDocument, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f98837f = p0Var;
                this.f98838g = goToAvailableDocument;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f98836e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    p0 p0Var = this.f98837f;
                    rq0.b documentType = this.f98838g.getDocumentType();
                    iy.b0 documentUrl = this.f98838g.getDocumentUrl();
                    this.f98836e = 1;
                    if (p0Var.da(documentType, documentUrl, this) == objE) {
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
                return new a(this.f98837f, this.f98838g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j21.a.GoToAvailableDocument goToAvailableDocument = (j21.a.GoToAvailableDocument) this.f98834f;
            Object objE = uq.b.e();
            int i15 = this.f98833e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = p0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(p0.this, goToAvailableDocument, null);
                this.f98834f = vq.j.a(goToAvailableDocument);
                this.f98833e = 1;
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
        public final Object w(j21.a.GoToAvailableDocument goToAvailableDocument, j21.g.a.Screen screen, tq.e<? super oq.i0> eVar) {
            a0 a0Var = p0.this.new a0(eVar);
            a0Var.f98834f = goToAvailableDocument;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f98839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f98840e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f98841f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f98842g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f98843h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f98844j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f98845k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f98847m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f98845k = obj;
            this.f98847m |= PKIFailureInfo.systemUnavail;
            return p0.this.ba(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/a$u;", "action", "Lk10/c0;", "Lj21/g$a$c;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/a$u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<j21.a.ShowDialog, k10.c0<j21.g.a.Screen>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98849f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98850g;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j21.g.a.Dialog O(k10.c0 c0Var, p0 p0Var, j21.a.ShowDialog showDialog, j21.g.a.Screen screen) {
            return new j21.g.a.Dialog(((j21.g.a.Screen) c0Var.a()).getData(), p0Var.dialogVmsFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j21.a.ShowDialog showDialog = (j21.a.ShowDialog) this.f98849f;
            final k10.c0 c0Var = (k10.c0) this.f98850g;
            uq.b.e();
            if (this.f98848e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: j21.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.b0.O(c0Var, p0Var, showDialog, (g.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.ShowDialog showDialog, k10.c0<j21.g.a.Screen> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            b0 b0Var = p0.this.new b0(eVar);
            b0Var.f98849f = showDialog;
            b0Var.f98850g = c0Var;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f98852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f98853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98854f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f98856h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f98854f = obj;
            this.f98856h |= PKIFailureInfo.systemUnavail;
            return p0.this.da(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj21/a$q;", "action", "Lj21/g$a$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lj21/a$q;Lj21/g$a$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<j21.a.OnWebRedirectDialog, j21.g.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98857e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98858f;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(p0 p0Var, j21.a.OnWebRedirectDialog onWebRedirectDialog) {
            p0Var.d9(new OpenUrl(onWebRedirectDialog.getUrl()));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j21.a.OnWebRedirectDialog onWebRedirectDialog = (j21.a.OnWebRedirectDialog) this.f98858f;
            uq.b.e();
            if (this.f98857e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0 p0Var = p0.this;
            k21.m mVar = p0.this.chatBotNavigationDialogMapper;
            l21.a.b bVar = l21.a.b.f115429a;
            er.a aVarB9 = p0.this.b9(j21.b.f98693a);
            final p0 p0Var2 = p0.this;
            p0Var.d9(new j21.a.ShowDialog(mVar.b(new k21.m.Params(new k21.o.RedirectDialog(aVarB9, new er.a() { // from class: j21.a1
                @Override // er.a
                public final Object a() {
                    return p0.c0.O(p0Var2, onWebRedirectDialog);
                }
            }, bVar)))));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.OnWebRedirectDialog onWebRedirectDialog, j21.g.a.Screen screen, tq.e<? super oq.i0> eVar) {
            c0 c0Var = p0.this.new c0(eVar);
            c0Var.f98858f = onWebRedirectDialog;
            return c0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f98860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f98861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98862f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f98864h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f98862f = obj;
            this.f98864h |= PKIFailureInfo.systemUnavail;
            return p0.this.ea(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj21/a$n;", "action", "Lj21/g$a$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lj21/a$n;Lj21/g$a$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<j21.a.OnInternalRedirectDialog, j21.g.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98866f;

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j21.a.OnInternalRedirectDialog onInternalRedirectDialog = (j21.a.OnInternalRedirectDialog) this.f98866f;
            uq.b.e();
            if (this.f98865e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0.this.d9(new j21.a.ShowDialog(p0.this.chatBotNavigationDialogMapper.b(new k21.m.Params(new k21.o.RedirectDialog(p0.this.b9(j21.b.f98693a), p0.this.b9(new ServiceOrDocumentRedirect(onInternalRedirectDialog.getEvent())), onInternalRedirectDialog.getType())))));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.OnInternalRedirectDialog onInternalRedirectDialog, j21.g.a.Screen screen, tq.e<? super oq.i0> eVar) {
            d0 d0Var = p0.this.new d0(eVar);
            d0Var.f98866f = onInternalRedirectDialog;
            return d0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f98868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f98869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f98870f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f98871g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f98872h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f98873j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f98874k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f98875l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f98877n;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f98875l = obj;
            this.f98877n |= PKIFailureInfo.systemUnavail;
            return p0.this.ra(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj21/a$k;", "action", "Lj21/g$a$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lj21/a$k;Lj21/g$a$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.q<j21.a.OnActionClick, j21.g.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98879f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f98881a;

            static {
                int[] iArr = new int[Action.EnumC1573a.values().length];
                try {
                    iArr[Action.EnumC1573a.SERVICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Action.EnumC1573a.DOCUMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Action.EnumC1573a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f98881a = iArr;
            }
        }

        e0(tq.e<? super e0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j21.a.OnActionClick onActionClick = (j21.a.OnActionClick) this.f98879f;
            uq.b.e();
            if (this.f98878e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            rq0.a action = onActionClick.getAnswerAction().getAction();
            if (action != null) {
                p0 p0Var = p0.this;
                int i15 = a.f98881a[onActionClick.getAnswerAction().getActionType().ordinal()];
                if (i15 == 1) {
                    p0Var.d9(new j21.a.GoToAvailableService((rq0.c) action, onActionClick.getAnswerAction().getUrl()));
                } else if (i15 == 2) {
                    p0Var.d9(new j21.a.GoToAvailableDocument((rq0.b) action, onActionClick.getAnswerAction().getUrl()));
                } else {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                    p0Var.d9(new j21.a.OnWebRedirectDialog(onActionClick.getAnswerAction().getUrl()));
                }
            } else {
                p0.this.d9(new j21.a.OnWebRedirectDialog(onActionClick.getAnswerAction().getUrl()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.OnActionClick onActionClick, j21.g.a.Screen screen, tq.e<? super oq.i0> eVar) {
            e0 e0Var = p0.this.new e0(eVar);
            e0Var.f98879f = onActionClick;
            return e0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<j21.h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f98882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f98883b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f98884a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f98885b;

            /* JADX INFO: renamed from: j21.p0$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2325a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f98886d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f98887e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f98888f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f98890h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f98891j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f98892k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f98893l;

                public C2325a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f98886d = obj;
                    this.f98887e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p0 p0Var) {
                this.f98884a = hVar;
                this.f98885b = p0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2325a c2325a;
                if (eVar instanceof C2325a) {
                    c2325a = (C2325a) eVar;
                    int i15 = c2325a.f98887e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2325a.f98887e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2325a = new C2325a(eVar);
                    }
                } else {
                    c2325a = new C2325a(eVar);
                }
                Object obj2 = c2325a.f98886d;
                Object objE = uq.b.e();
                int i16 = c2325a.f98887e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f98884a;
                    j21.h.Data dataGa = this.f98885b.ga((j21.g) obj);
                    c2325a.f98888f = vq.j.a(obj);
                    c2325a.f98890h = vq.j.a(c2325a);
                    c2325a.f98891j = vq.j.a(obj);
                    c2325a.f98892k = vq.j.a(hVar);
                    c2325a.f98893l = 0;
                    c2325a.f98887e = 1;
                    if (hVar.F(dataGa, c2325a) == objE) {
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

        public f(mu.g gVar, p0 p0Var) {
            this.f98882a = gVar;
            this.f98883b = p0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super j21.h.Data> hVar, tq.e eVar) {
            Object objA = this.f98882a.a(new a(hVar, this.f98883b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj21/a$j;", "<unused var>", "Lj21/g$a$c;", "Loq/i0;", "<anonymous>", "(Lj21/a$j;Lj21/g$a$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<j21.a.j, j21.g.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98894e;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f98894e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0.this.d9(new j21.a.ShowDialog(p0.this.chatBotNavigationDialogMapper.b(new k21.m.Params(new k21.o.OpenNewChatDialog(p0.this.b9(j21.a.r.f98681a), p0.this.b9(j21.b.f98693a))))));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.j jVar, j21.g.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return p0.this.new f0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj21/a$m;", "<unused var>", "Lj21/g;", "state", "Loq/i0;", "<anonymous>", "(Lj21/a$m;Lj21/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<j21.a.m, j21.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98897f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j21.g gVar = (j21.g) this.f98897f;
            Object objE = uq.b.e();
            int i15 = this.f98896e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                this.f98897f = vq.j.a(gVar);
                this.f98896e = 1;
                if (p0Var.qa(gVar, this) == objE) {
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
        public final Object w(j21.a.m mVar, j21.g gVar, tq.e<? super oq.i0> eVar) {
            g gVar2 = p0.this.new g(eVar);
            gVar2.f98897f = gVar;
            return gVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/a$w;", "action", "Lk10/c0;", "Lj21/g$a$c;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/a$w;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.q<j21.a.UpdateTopBarMenu, k10.c0<j21.g.a.Screen>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98900f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98901g;

        g0(tq.e<? super g0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j21.g.a.Screen O(j21.a.UpdateTopBarMenu updateTopBarMenu, j21.g.a.Screen screen) {
            return screen.d(j21.g.a.Data.b(screen.getData(), null, null, null, null, false, false, 0, false, updateTopBarMenu.getIsVisible(), false, 767, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j21.a.UpdateTopBarMenu updateTopBarMenu = (j21.a.UpdateTopBarMenu) this.f98900f;
            k10.c0 c0Var = (k10.c0) this.f98901g;
            uq.b.e();
            if (this.f98899e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: j21.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.g0.O(updateTopBarMenu, (g.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.UpdateTopBarMenu updateTopBarMenu, k10.c0<j21.g.a.Screen> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            g0 g0Var = new g0(eVar);
            g0Var.f98900f = updateTopBarMenu;
            g0Var.f98901g = c0Var;
            return g0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lj21/a$r;", "<unused var>", "Lk10/c0;", "Lj21/g;", "state", "Lk10/l;", "<anonymous>", "(Lj21/a$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<j21.a.r, k10.c0<j21.g>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98903f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j21.g.b.Screen O(String str, k10.c0 c0Var, j21.g gVar) {
            return new j21.g.b.Screen(str, ((j21.g) c0Var.a()).getIsDisclaimerEnabled());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f98903f;
            uq.b.e();
            if (this.f98902e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String strA = p0.this.getStartConversationDateTimeUseCase.a(gz.b.a.C1792a.f78542a);
            return c0Var.d(new er.l() { // from class: j21.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.h.O(strA, c0Var, (g) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.r rVar, k10.c0<j21.g> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            h hVar = p0.this.new h(eVar);
            hVar.f98903f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/a$a;", "action", "Lk10/c0;", "Lj21/g$a$c;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.q<j21.a.ChangeInputContent, k10.c0<j21.g.a.Screen>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98906f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98907g;

        h0(tq.e<? super h0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j21.g.a.Screen O(j21.a.ChangeInputContent changeInputContent, j21.g.a.Screen screen) {
            return screen.d(j21.g.a.Data.b(screen.getData(), null, null, null, changeInputContent.getValue(), false, false, 0, false, false, false, 1015, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j21.a.ChangeInputContent changeInputContent = (j21.a.ChangeInputContent) this.f98906f;
            k10.c0 c0Var = (k10.c0) this.f98907g;
            uq.b.e();
            if (this.f98905e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: j21.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.h0.O(changeInputContent, (g.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.ChangeInputContent changeInputContent, k10.c0<j21.g.a.Screen> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            h0 h0Var = new h0(eVar);
            h0Var.f98906f = changeInputContent;
            h0Var.f98907g = c0Var;
            return h0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj21/a$f;", "<unused var>", "Lj21/g;", "Loq/i0;", "<anonymous>", "(Lj21/a$f;Lj21/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<j21.a.f, j21.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98908e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f98908e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<j21.a.i> bVarY1 = p0.this.Y1();
                j21.a.i.c cVar = j21.a.i.c.f98666a;
                this.f98908e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(j21.a.f fVar, j21.g gVar, tq.e<? super oq.i0> eVar) {
            return p0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/a$g;", "action", "Lk10/c0;", "Lj21/g$a$c;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.q<j21.a.IsInputCharsLimitReached, k10.c0<j21.g.a.Screen>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98910e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98911f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98912g;

        i0(tq.e<? super i0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j21.g.a.Screen O(j21.a.IsInputCharsLimitReached isInputCharsLimitReached, k10.c0 c0Var, j21.g.a.Screen screen) {
            return screen.d(j21.g.a.Data.b(screen.getData(), null, null, null, null, isInputCharsLimitReached.getLimitReached(), false, 0, ((pq.v.x0(screen.getData().d()) instanceof h1.e) || isInputCharsLimitReached.getLimitReached() || ((j21.g.a.Screen) c0Var.a()).getData().getInputContent().length() <= 0) ? false : true, false, false, 879, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j21.a.IsInputCharsLimitReached isInputCharsLimitReached = (j21.a.IsInputCharsLimitReached) this.f98911f;
            final k10.c0 c0Var = (k10.c0) this.f98912g;
            uq.b.e();
            if (this.f98910e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: j21.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.i0.O(isInputCharsLimitReached, c0Var, (g.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.IsInputCharsLimitReached isInputCharsLimitReached, k10.c0<j21.g.a.Screen> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            i0 i0Var = new i0(eVar);
            i0Var.f98911f = isInputCharsLimitReached;
            i0Var.f98912g = c0Var;
            return i0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj21/a$b;", "<unused var>", "Lj21/g;", "Loq/i0;", "<anonymous>", "(Lj21/a$b;Lj21/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<j21.a.b, j21.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98913e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f98913e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<j21.a.i> bVarY1 = p0.this.Y1();
                j21.a.i.C2320a c2320a = j21.a.i.C2320a.f98664a;
                this.f98913e = 1;
                if (bVarY1.F(c2320a, this) == objE) {
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
        public final Object w(j21.a.b bVar, j21.g gVar, tq.e<? super oq.i0> eVar) {
            return p0.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj21/a$x;", "<unused var>", "Lj21/g$a$c;", "state", "Loq/i0;", "<anonymous>", "(Lj21/a$x;Lj21/g$a$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j0 extends vq.k implements er.q<j21.a.x, j21.g.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98916f;

        j0(tq.e<? super j0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j21.g.a.Screen screen = (j21.g.a.Screen) this.f98916f;
            Object objE = uq.b.e();
            int i15 = this.f98915e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                String inputContent = screen.getData().getInputContent();
                this.f98916f = vq.j.a(screen);
                this.f98915e = 1;
                if (p0Var.Ia(inputContent, this) == objE) {
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
        public final Object w(j21.a.x xVar, j21.g.a.Screen screen, tq.e<? super oq.i0> eVar) {
            j0 j0Var = p0.this.new j0(eVar);
            j0Var.f98916f = screen;
            return j0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj21/a$t;", "action", "Lj21/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lj21/a$t;Lj21/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<j21.a.ShareAnswer, j21.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98919f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j21.a.ShareAnswer shareAnswer = (j21.a.ShareAnswer) this.f98919f;
            Object objE = uq.b.e();
            int i15 = this.f98918e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.d0 d0Var = p0.this.shareTextIntentUseCase;
                a14.d0.Params params = new a14.d0.Params(shareAnswer.getAnswer());
                this.f98919f = vq.j.a(shareAnswer);
                this.f98918e = 1;
                obj = d0Var.c(params, this);
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
            if (iVar instanceof dx.i.Left) {
                p0Var.ta((dx.b.Business) ((dx.i.Left) iVar).b());
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.ShareAnswer shareAnswer, j21.g gVar, tq.e<? super oq.i0> eVar) {
            k kVar = p0.this.new k(eVar);
            kVar.f98919f = shareAnswer;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class k0 implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k0 f98921a = new k0();

        @Override // er.l
        public final Object b(Object obj) {
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lj21/g$b;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<k10.c0<j21.g.b>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98923f;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f98923f;
            uq.b.e();
            if (this.f98922e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0.this.d9(j21.a.c.f98655a);
            return c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<j21.g.b> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            return ((l) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            l lVar = p0.this.new l(eVar);
            lVar.f98923f = obj;
            return lVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f98925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f98926e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f98928g;

        l0(tq.e<? super l0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f98926e = obj;
            this.f98928g |= PKIFailureInfo.systemUnavail;
            return p0.this.Ia(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/a$c;", "action", "Lk10/c0;", "Lj21/g$b;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<j21.a.c, k10.c0<j21.g.b>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98931g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j21.a.c cVar = (j21.a.c) this.f98930f;
            k10.c0 c0Var = (k10.c0) this.f98931g;
            Object objE = uq.b.e();
            int i15 = this.f98929e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            p0 p0Var = p0.this;
            this.f98930f = vq.j.a(cVar);
            this.f98931g = vq.j.a(c0Var);
            this.f98929e = 1;
            Object objBa = p0Var.ba(c0Var, cVar, this);
            return objBa == objE ? objE : objBa;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.c cVar, k10.c0<j21.g.b> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            m mVar = p0.this.new m(eVar);
            mVar.f98930f = cVar;
            mVar.f98931g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/a$u;", "action", "Lk10/c0;", "Lj21/g$b$b;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/a$u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<j21.a.ShowDialog, k10.c0<j21.g.b.Screen>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98934f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98935g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j21.g.b.Dialog O(k10.c0 c0Var, p0 p0Var, j21.a.ShowDialog showDialog, j21.g.b.Screen screen) {
            return new j21.g.b.Dialog(((j21.g.b.Screen) c0Var.a()).getStartConversationDateTime(), ((j21.g.b.Screen) c0Var.a()).getIsDisclaimerEnabled(), p0Var.dialogVmsFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j21.a.ShowDialog showDialog = (j21.a.ShowDialog) this.f98934f;
            final k10.c0 c0Var = (k10.c0) this.f98935g;
            uq.b.e();
            if (this.f98933e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: j21.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.n.O(c0Var, p0Var, showDialog, (g.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.ShowDialog showDialog, k10.c0<j21.g.b.Screen> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            n nVar = p0.this.new n(eVar);
            nVar.f98934f = showDialog;
            nVar.f98935g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/b;", "<unused var>", "Lk10/c0;", "Lj21/g$b$a;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<j21.b, k10.c0<j21.g.b.Dialog>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98938f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j21.g.b.Screen O(k10.c0 c0Var, j21.g.b.Dialog dialog) {
            return new j21.g.b.Screen(dialog.getStartConversationDateTime(), ((j21.g.b.Dialog) c0Var.a()).getIsDisclaimerEnabled());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f98938f;
            uq.b.e();
            if (this.f98937e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: j21.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.o.O(c0Var, (g.b.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.b bVar, k10.c0<j21.g.b.Dialog> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            o oVar = new o(eVar);
            oVar.f98938f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj21/c;", "<unused var>", "Lj21/g$b$a;", "Loq/i0;", "<anonymous>", "(Lj21/c;Lj21/g$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<j21.c, j21.g.b.Dialog, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98939e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f98939e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                j21.a.i.C2320a c2320a = j21.a.i.C2320a.f98664a;
                this.f98939e = 1;
                if (p0Var.F(c2320a, this) == objE) {
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
        public final Object w(j21.c cVar, j21.g.b.Dialog dialog, tq.e<? super oq.i0> eVar) {
            return p0.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/b;", "<unused var>", "Lk10/c0;", "Lj21/g$a$b;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<j21.b, k10.c0<j21.g.a.Dialog>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98942f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j21.g.a.Screen O(j21.g.a.Dialog dialog) {
            return new j21.g.a.Screen(dialog.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f98942f;
            uq.b.e();
            if (this.f98941e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: j21.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.q.O((g.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.b bVar, k10.c0<j21.g.a.Dialog> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            q qVar = new q(eVar);
            qVar.f98942f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj21/c;", "<unused var>", "Lj21/g$a$b;", "Loq/i0;", "<anonymous>", "(Lj21/c;Lj21/g$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<j21.c, j21.g.a.Dialog, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98943e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f98943e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                j21.a.i.C2320a c2320a = j21.a.i.C2320a.f98664a;
                this.f98943e = 1;
                if (p0Var.F(c2320a, this) == objE) {
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
        public final Object w(j21.c cVar, j21.g.a.Dialog dialog, tq.e<? super oq.i0> eVar) {
            return p0.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/d;", "action", "Lk10/c0;", "Lj21/g$a$b;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<OpenUrl, k10.c0<j21.g.a.Dialog>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98947g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j21.g.a.Screen O(j21.g.a.Dialog dialog) {
            return new j21.g.a.Screen(dialog.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f98946f;
            k10.c0 c0Var = (k10.c0) this.f98947g;
            Object objE = uq.b.e();
            int i15 = this.f98945e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = p0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(iy.c0.e(openUrl.getUrl()), false, 2, null);
                this.f98946f = vq.j.a(openUrl);
                this.f98947g = c0Var;
                this.f98945e = 1;
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
            p0 p0Var = p0.this;
            if (iVar instanceof dx.i.Left) {
                p0Var.ta((dx.b.Business) ((dx.i.Left) iVar).b());
            }
            return c0Var.d(new er.l() { // from class: j21.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.s.O((g.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, k10.c0<j21.g.a.Dialog> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            s sVar = p0.this.new s(eVar);
            sVar.f98946f = openUrl;
            sVar.f98947g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj21/e;", "action", "Lj21/g$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lj21/e;Lj21/g$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<ServiceOrDocumentRedirect, j21.g.a.Dialog, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98949e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98950f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ServiceOrDocumentRedirect serviceOrDocumentRedirect = (ServiceOrDocumentRedirect) this.f98950f;
            Object objE = uq.b.e();
            int i15 = this.f98949e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                j21.a.i.GoToServiceOrDocument goToServiceOrDocument = new j21.a.i.GoToServiceOrDocument(serviceOrDocumentRedirect.getEvent());
                this.f98950f = vq.j.a(serviceOrDocumentRedirect);
                this.f98949e = 1;
                if (p0Var.F(goToServiceOrDocument, this) == objE) {
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
        public final Object w(ServiceOrDocumentRedirect serviceOrDocumentRedirect, j21.g.a.Dialog dialog, tq.e<? super oq.i0> eVar) {
            t tVar = p0.this.new t(eVar);
            tVar.f98950f = serviceOrDocumentRedirect;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/a$o;", "action", "Lk10/c0;", "Lj21/g$a;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<j21.a.OnMessageStreamingFail, k10.c0<j21.g.a>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98952e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98953f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98954g;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j21.a.OnMessageStreamingFail onMessageStreamingFail = (j21.a.OnMessageStreamingFail) this.f98953f;
            k10.c0 c0Var = (k10.c0) this.f98954g;
            Object objE = uq.b.e();
            int i15 = this.f98952e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            p0 p0Var = p0.this;
            dx.b error = onMessageStreamingFail.getError();
            String question = onMessageStreamingFail.getQuestion();
            j21.a.OnRetryStreaming onRetryStreaming = new j21.a.OnRetryStreaming(onMessageStreamingFail.getQuestion());
            this.f98953f = vq.j.a(onMessageStreamingFail);
            this.f98954g = vq.j.a(c0Var);
            this.f98952e = 1;
            Object objRa = p0Var.ra(c0Var, error, question, onRetryStreaming, this);
            return objRa == objE ? objE : objRa;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.OnMessageStreamingFail onMessageStreamingFail, k10.c0<j21.g.a> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            u uVar = p0.this.new u(eVar);
            uVar.f98953f = onMessageStreamingFail;
            uVar.f98954g = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/a$p;", "action", "Lk10/c0;", "Lj21/g$a;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<j21.a.OnRetryStreaming, k10.c0<j21.g.a>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98957f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98958g;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j21.g.a O(j21.g.a.Data data, j21.g.a aVar) {
            if (aVar instanceof j21.g.a.Dialog) {
                return j21.g.a.Dialog.e((j21.g.a.Dialog) aVar, data, null, 2, null);
            }
            if (aVar instanceof j21.g.a.Screen) {
                return ((j21.g.a.Screen) aVar).d(data);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j21.a.OnRetryStreaming onRetryStreaming = (j21.a.OnRetryStreaming) this.f98957f;
            k10.c0 c0Var = (k10.c0) this.f98958g;
            uq.b.e();
            if (this.f98956e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            j21.g.a.Data data = ((j21.g.a) c0Var.a()).getData();
            final j21.g.a.Data dataB = j21.g.a.Data.b(data, null, p0.this.conversationsUpdater.d(data.d()), null, null, false, false, 0, false, false, false, 1021, null);
            k10.l lVarB = c0Var.b(new er.l() { // from class: j21.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.v.O(dataB, (g.a) obj2);
                }
            });
            p0.this.d9(new j21.a.StartSendingUserMessage(onRetryStreaming.getQuestion()));
            return lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.OnRetryStreaming onRetryStreaming, k10.c0<j21.g.a> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            v vVar = p0.this.new v(eVar);
            vVar.f98957f = onRetryStreaming;
            vVar.f98958g = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/a$v;", "action", "Lk10/c0;", "Lj21/g$a;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/a$v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<j21.a.StartSendingUserMessage, k10.c0<j21.g.a>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98960e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98961f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98962g;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j21.g.a O(j21.g.a.Data data, j21.g.a aVar) {
            if (aVar instanceof j21.g.a.Dialog) {
                return j21.g.a.Dialog.e((j21.g.a.Dialog) aVar, data, null, 2, null);
            }
            if (aVar instanceof j21.g.a.Screen) {
                return ((j21.g.a.Screen) aVar).d(data);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j21.a.StartSendingUserMessage startSendingUserMessage = (j21.a.StartSendingUserMessage) this.f98961f;
            k10.c0 c0Var = (k10.c0) this.f98962g;
            uq.b.e();
            if (this.f98960e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            j21.g.a.Data data = ((j21.g.a) c0Var.a()).getData();
            final j21.g.a.Data dataB = j21.g.a.Data.b(data, null, p0.this.conversationsUpdater.a(data.d(), startSendingUserMessage.getMessage()), null, "", false, false, 0, false, false, false, 853, null);
            k10.l lVarB = c0Var.b(new er.l() { // from class: j21.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.w.O(dataB, (g.a) obj2);
                }
            });
            p0.this.d9(new j21.a.MessageStreaming(startSendingUserMessage.getMessage()));
            return lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.StartSendingUserMessage startSendingUserMessage, k10.c0<j21.g.a> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            w wVar = p0.this.new w(eVar);
            wVar.f98961f = startSendingUserMessage;
            wVar.f98962g = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/a$l;", "<unused var>", "Lk10/c0;", "Lj21/g$a;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<j21.a.l, k10.c0<j21.g.a>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98965f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j21.g.a O(j21.g.a.Data data, j21.g.a aVar) {
            if (aVar instanceof j21.g.a.Dialog) {
                return j21.g.a.Dialog.e((j21.g.a.Dialog) aVar, data, null, 2, null);
            }
            if (aVar instanceof j21.g.a.Screen) {
                return ((j21.g.a.Screen) aVar).d(data);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f98965f;
            uq.b.e();
            if (this.f98964e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            j21.g.a.Data data = ((j21.g.a) c0Var.a()).getData();
            final j21.g.a.Data dataB = j21.g.a.Data.b(data, null, p0.this.conversationsUpdater.d(data.d()), null, null, false, true, 0, false, false, false, ConscryptStatsLog.CERTIFICATE_TRANSPARENCY_VERIFICATION_REPORTED, null);
            return c0Var.b(new er.l() { // from class: j21.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.x.O(dataB, (g.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.l lVar, k10.c0<j21.g.a> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            x xVar = p0.this.new x(eVar);
            xVar.f98965f = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj21/a$s;", "action", "Lk10/c0;", "Lj21/g$a$c;", "state", "Lk10/l;", "Lj21/g;", "<anonymous>", "(Lj21/a$s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<j21.a.RateAnswer, k10.c0<j21.g.a.Screen>, tq.e<? super k10.l<? extends j21.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98969g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lj21/g$a$c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends j21.g.a.Screen>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f98971e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f98972f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<j21.g.a.Screen> f98973g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ j21.a.RateAnswer f98974h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, k10.c0<j21.g.a.Screen> c0Var, j21.a.RateAnswer rateAnswer, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f98972f = p0Var;
                this.f98973g = c0Var;
                this.f98974h = rateAnswer;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final j21.g.a.Screen V(p0 p0Var, j21.a.RateAnswer rateAnswer, j21.g.a.Screen screen) {
                return screen.d(j21.g.a.Data.b(screen.getData(), null, p0Var.conversationsUpdater.c(screen.getData().d(), rateAnswer.getAnswer().getResponseId(), rateAnswer.getRating()), null, null, false, false, 0, false, false, false, 1021, null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f98971e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    e21.a aVar = this.f98972f.interactor;
                    iy.b0 conversationId = this.f98973g.a().getData().getConversationData().getConversationId();
                    iy.b0 responseId = this.f98974h.getAnswer().getResponseId();
                    RateAnswerModel rateAnswerModel = new RateAnswerModel(this.f98974h.getRating());
                    this.f98971e = 1;
                    obj = aVar.c(conversationId, responseId, rateAnswerModel, this);
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
                k10.c0<j21.g.a.Screen> c0Var = this.f98973g;
                final p0 p0Var = this.f98972f;
                final j21.a.RateAnswer rateAnswer = this.f98974h;
                if (iVar instanceof dx.i.Left) {
                    Object objC = c0Var.c();
                    p0Var.xa(false);
                    return objC;
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                k10.l<j21.g.a.Screen> lVarB = c0Var.b(new er.l() { // from class: j21.z0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p0.y.a.V(p0Var, rateAnswer, (g.a.Screen) obj2);
                    }
                });
                p0Var.accessibilityTalkBackManager.a(rateAnswer.getContentDescription());
                p0Var.xa(true);
                return lVarB;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f98972f, this.f98973g, this.f98974h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<j21.g.a.Screen>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j21.a.RateAnswer rateAnswer = (j21.a.RateAnswer) this.f98968f;
            k10.c0 c0Var = (k10.c0) this.f98969g;
            Object objE = uq.b.e();
            int i15 = this.f98967e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p0.this, c0Var, rateAnswer, null);
            this.f98968f = vq.j.a(rateAnswer);
            this.f98969g = vq.j.a(c0Var);
            this.f98967e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j21.a.RateAnswer rateAnswer, k10.c0<j21.g.a.Screen> c0Var, tq.e<? super k10.l<? extends j21.g>> eVar) {
            y yVar = p0.this.new y(eVar);
            yVar.f98968f = rateAnswer;
            yVar.f98969g = c0Var;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj21/a$e;", "action", "Lj21/g$a$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lj21/a$e;Lj21/g$a$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<j21.a.GoToAvailableService, j21.g.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98976f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f98978e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f98979f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ j21.a.GoToAvailableService f98980g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, j21.a.GoToAvailableService goToAvailableService, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f98979f = p0Var;
                this.f98980g = goToAvailableService;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f98978e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    p0 p0Var = this.f98979f;
                    rq0.c serviceType = this.f98980g.getServiceType();
                    iy.b0 serviceUrl = this.f98980g.getServiceUrl();
                    this.f98978e = 1;
                    if (p0Var.ea(serviceType, serviceUrl, this) == objE) {
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
                return new a(this.f98979f, this.f98980g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j21.a.GoToAvailableService goToAvailableService = (j21.a.GoToAvailableService) this.f98976f;
            Object objE = uq.b.e();
            int i15 = this.f98975e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = p0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(p0.this, goToAvailableService, null);
                this.f98976f = vq.j.a(goToAvailableService);
                this.f98975e = 1;
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
        public final Object w(j21.a.GoToAvailableService goToAvailableService, j21.g.a.Screen screen, tq.e<? super oq.i0> eVar) {
            z zVar = p0.this.new z(eVar);
            zVar.f98976f = goToAvailableService;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public p0(yy.a aVar, mx.c cVar, ib4.c cVar2, k21.m mVar, i70.n nVar, h21.j jVar, h21.b bVar, e21.a aVar2, yw.b bVar2, h21.i iVar, h21.g gVar, a14.w wVar, a14.d0 d0Var, k21.l lVar, ac4.a aVar3, m1.c cVar3, i1 i1Var, h21.e eVar, cb4.j jVar2, SetupData setupData) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
        this.chatBotNavigationDialogMapper = mVar;
        this.snackBarManagerStateHolder = nVar;
        this.getStartConversationDateTimeUseCase = jVar;
        this.checkIfMessageHasPersonalDataUseCase = bVar;
        this.interactor = aVar2;
        this.accessibilityTalkBackManager = bVar2;
        this.getServiceStatusUC = iVar;
        this.getDocumentStatusUC = gVar;
        this.openUrlIntentUseCase = wVar;
        this.shareTextIntentUseCase = d0Var;
        this.chatBotConversationMapper = lVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.streamingStateMachineFactory = cVar3;
        this.conversationsUpdater = i1Var;
        this.clearCachedDocumentConfigsUC = eVar;
        this.dialogVmsFactory = jVar2;
        j21.g.b.Screen screen = new j21.g.b.Screen(jVar.a(gz.b.a.C1792a.f78542a), setupData.getIsDisclaimerEnabled());
        this.initialState = screen;
        this.stateMachine = aVar.a(screen, new er.l() { // from class: j21.g0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ya(this.f98734a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new f(e9().getState(), this), ga(screen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Aa(p0 p0Var, k10.z zVar) {
        zVar.A(p0Var.new l(null));
        m mVar = p0Var.new m(null);
        zVar.v(fr.q0.c(j21.a.c.class), k10.o.CANCEL_PREVIOUS, mVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Ba(p0 p0Var, k10.z zVar) {
        n nVar = p0Var.new n(null);
        zVar.v(fr.q0.c(j21.a.ShowDialog.class), k10.o.CANCEL_PREVIOUS, nVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Ca(p0 p0Var, k10.z zVar) {
        o oVar = new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(j21.b.class), oVar2, oVar);
        zVar.x(fr.q0.c(j21.c.class), oVar2, p0Var.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Da(p0 p0Var, k10.z zVar) {
        q qVar = new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(j21.b.class), oVar, qVar);
        zVar.x(fr.q0.c(j21.c.class), oVar, p0Var.new r(null));
        zVar.v(fr.q0.c(OpenUrl.class), oVar, p0Var.new s(null));
        zVar.x(fr.q0.c(ServiceOrDocumentRedirect.class), oVar, p0Var.new t(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Ea(final p0 p0Var, k10.z zVar) {
        er.p pVar = new er.p() { // from class: j21.a0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p0.Fa(this.f98690a, (a.MessageStreaming) obj, (g.a) obj2);
            }
        };
        er.p pVar2 = new er.p() { // from class: j21.b0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p0.Ga(this.f98694a, (k10.c0) obj, (j1) obj2);
            }
        };
        zVar.y(fr.q0.c(j21.a.MessageStreaming.class), pVar, k0.f98921a, pVar2);
        u uVar = p0Var.new u(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(j21.a.OnMessageStreamingFail.class), oVar, uVar);
        zVar.v(fr.q0.c(j21.a.OnRetryStreaming.class), oVar, p0Var.new v(null));
        zVar.v(fr.q0.c(j21.a.StartSendingUserMessage.class), oVar, p0Var.new w(null));
        zVar.v(fr.q0.c(j21.a.l.class), oVar, p0Var.new x(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k10.e0 Fa(p0 p0Var, j21.a.MessageStreaming messageStreaming, j21.g.a aVar) {
        return p0Var.streamingStateMachineFactory.a(new m1.c.SetupData(aVar.getData().getConversationData().getConversationId(), messageStreaming.getQuestion(), aVar.getData().getLastMessageCount()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k10.l Ga(p0 p0Var, k10.c0 c0Var, j1 j1Var) {
        if (j1Var instanceof j1.Error) {
            k10.l lVarC = c0Var.c();
            j1.Error error = (j1.Error) j1Var;
            p0Var.d9(new j21.a.OnMessageStreamingFail(error.getError(), error.getQuestion()));
            return lVarC;
        }
        if (j1Var instanceof j1.a.Answer) {
            return p0Var.ua(c0Var, ((j1.a.Answer) j1Var).getAnswer());
        }
        if (fr.t.c(j1Var, j1.a.b.f98771a)) {
            return c0Var.c();
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Ha(p0 p0Var, k10.z zVar) {
        b0 b0Var = p0Var.new b0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(j21.a.ShowDialog.class), oVar, b0Var);
        zVar.x(fr.q0.c(j21.a.OnWebRedirectDialog.class), oVar, p0Var.new c0(null));
        zVar.x(fr.q0.c(j21.a.OnInternalRedirectDialog.class), oVar, p0Var.new d0(null));
        zVar.x(fr.q0.c(j21.a.OnActionClick.class), oVar, p0Var.new e0(null));
        zVar.x(fr.q0.c(j21.a.j.class), oVar, p0Var.new f0(null));
        zVar.v(fr.q0.c(j21.a.UpdateTopBarMenu.class), oVar, new g0(null));
        zVar.v(fr.q0.c(j21.a.ChangeInputContent.class), oVar, new h0(null));
        zVar.v(fr.q0.c(j21.a.IsInputCharsLimitReached.class), oVar, new i0(null));
        zVar.x(fr.q0.c(j21.a.x.class), oVar, p0Var.new j0(null));
        zVar.v(fr.q0.c(j21.a.RateAnswer.class), oVar, p0Var.new y(null));
        zVar.x(fr.q0.c(j21.a.GoToAvailableService.class), oVar, p0Var.new z(null));
        zVar.x(fr.q0.c(j21.a.GoToAvailableDocument.class), oVar, p0Var.new a0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Ia(String str, tq.e<? super oq.i0> eVar) throws Throwable {
        l0 l0Var;
        if (eVar instanceof l0) {
            l0Var = (l0) eVar;
            int i15 = l0Var.f98928g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                l0Var.f98928g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                l0Var = new l0(eVar);
            }
        } else {
            l0Var = new l0(eVar);
        }
        Object objC = l0Var.f98926e;
        Object objE = uq.b.e();
        int i16 = l0Var.f98928g;
        if (i16 == 0) {
            oq.u.b(objC);
            h21.b bVar = this.checkIfMessageHasPersonalDataUseCase;
            h21.b.Params params = new h21.b.Params(str);
            l0Var.f98925d = str;
            l0Var.f98928g = 1;
            objC = bVar.c(params, l0Var);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) l0Var.f98925d;
            oq.u.b(objC);
        }
        if (((Boolean) objC).booleanValue()) {
            d9(new j21.a.ShowDialog(this.chatBotNavigationDialogMapper.b(new k21.m.Params(new k21.o.PersonalDataFoundDialog(a21.a.f2109q, b9(j21.b.f98693a))))));
        } else {
            d9(new j21.a.StartSendingUserMessage(str));
        }
        return oq.i0.f148189a;
    }

    private final jb4.b X9(dx.b domainError, final j21.a retryAction) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: j21.c0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Y9(this.f98697a, retryAction, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(p0 p0Var, j21.a aVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            p0Var.d9(aVar);
        } else if (fr.t.c(aVar, j21.a.c.f98655a)) {
            p0Var.d9(j21.a.b.f98654a);
        } else {
            p0Var.d9(j21.a.l.f98672a);
        }
        return oq.i0.f148189a;
    }

    private final Object aa(dx.b bVar, j21.a aVar, tq.e<? super oq.i0> eVar) {
        Object objF = Y1().F(new j21.a.i.Error(X9(bVar, aVar)), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object ba(k10.c0<j21.g.b> c0Var, j21.a aVar, tq.e<? super k10.l<? extends j21.g.a>> eVar) throws Throwable {
        b bVar;
        k10.c0<j21.g.b> c0Var2;
        j21.a aVar2;
        final j21.g.a screen;
        k10.c0<j21.g.b> c0Var3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f98847m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f98847m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objB = bVar.f98845k;
        Object objE = uq.b.e();
        int i16 = bVar.f98847m;
        if (i16 == 0) {
            oq.u.b(objB);
            e21.a aVar3 = this.interactor;
            c0Var2 = c0Var;
            bVar.f98839d = c0Var2;
            aVar2 = aVar;
            bVar.f98840e = aVar2;
            bVar.f98847m = 1;
            objB = aVar3.b(bVar);
            if (objB != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            j21.a aVar4 = (j21.a) bVar.f98840e;
            k10.c0<j21.g.b> c0Var4 = (k10.c0) bVar.f98839d;
            oq.u.b(objB);
            aVar2 = aVar4;
            c0Var2 = c0Var4;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var3 = (k10.c0) bVar.f98839d;
            oq.u.b(objB);
        }
        return c0Var3.c();
        dx.i iVar = (dx.i) objB;
        if (!(iVar instanceof dx.i.Left)) {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            j21.g.a.Data data = new j21.g.a.Data(c0Var2.a().getStartConversationDateTime(), pq.v.e(h1.c.f98759a), (ConversationData) ((dx.i.Right) iVar).b(), null, false, false, 0, false, false, c0Var2.a().getIsDisclaimerEnabled(), 504, null);
            j21.g.b bVarA = c0Var2.a();
            if (bVarA instanceof j21.g.b.Dialog) {
                screen = new j21.g.a.Dialog(data, ((j21.g.b.Dialog) bVarA).getVmsAdapter());
            } else {
                if (!(bVarA instanceof j21.g.b.Screen)) {
                    throw new oq.p();
                }
                screen = new j21.g.a.Screen(data);
            }
            return c0Var2.d(new er.l() { // from class: j21.z
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.ca(screen, (g.b) obj);
                }
            });
        }
        dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
        bVar.f98839d = c0Var2;
        bVar.f98840e = vq.j.a(aVar2);
        bVar.f98841f = vq.j.a(iVar);
        bVar.f98842g = vq.j.a(bVar2);
        bVar.f98843h = 0;
        bVar.f98844j = 0;
        bVar.f98847m = 2;
        if (aa(bVar2, aVar2, bVar) != objE) {
            c0Var3 = c0Var2;
            return c0Var3.c();
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j21.g.a ca(j21.g.a aVar, j21.g.b bVar) {
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object da(rq0.b bVar, iy.b0 b0Var, tq.e<? super oq.i0> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f98856h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f98856h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objI = cVar.f98854f;
        Object objE = uq.b.e();
        int i16 = cVar.f98856h;
        if (i16 == 0) {
            oq.u.b(objI);
            h21.g gVar = this.getDocumentStatusUC;
            h21.g.Params params = new h21.g.Params(bVar);
            cVar.f98852d = vq.j.a(bVar);
            cVar.f98853e = b0Var;
            cVar.f98856h = 1;
            objI = gVar.i(params, cVar);
            if (objI == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var = (iy.b0) cVar.f98853e;
            oq.u.b(objI);
        }
        h21.g.b bVar2 = (h21.g.b) objI;
        if (bVar2 instanceof h21.g.b.AlreadyAdded) {
            gx.b event = ((h21.g.b.AlreadyAdded) bVar2).getEvent();
            if (event != null) {
                d9(new j21.a.OnInternalRedirectDialog(l21.a.InterfaceC2784a.C2785a.f115427a, event));
            } else {
                d9(new j21.a.OnWebRedirectDialog(b0Var));
            }
        } else if (bVar2 instanceof h21.g.b.CanBeAdded) {
            d9(new j21.a.OnInternalRedirectDialog(l21.a.InterfaceC2784a.C2785a.f115427a, ((h21.g.b.CanBeAdded) bVar2).getEvent()));
        } else {
            if (!fr.t.c(bVar2, h21.g.b.d.f80065a) && !(bVar2 instanceof h21.g.b.Error)) {
                throw new oq.p();
            }
            d9(new j21.a.OnWebRedirectDialog(b0Var));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ea(rq0.c cVar, iy.b0 b0Var, tq.e<? super oq.i0> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f98864h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f98864h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objF = dVar.f98862f;
        Object objE = uq.b.e();
        int i16 = dVar.f98864h;
        if (i16 == 0) {
            oq.u.b(objF);
            h21.i iVar = this.getServiceStatusUC;
            h21.i.Params params = new h21.i.Params(cVar);
            dVar.f98860d = vq.j.a(cVar);
            dVar.f98861e = b0Var;
            dVar.f98864h = 1;
            objF = iVar.f(params, dVar);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var = (iy.b0) dVar.f98861e;
            oq.u.b(objF);
        }
        h21.i.b bVar = (h21.i.b) objF;
        if (bVar instanceof h21.i.b.Available) {
            gx.b event = ((h21.i.b.Available) bVar).getEvent();
            if (event != null) {
                d9(new j21.a.OnInternalRedirectDialog(l21.a.InterfaceC2784a.b.f115428a, event));
            } else {
                d9(new j21.a.OnWebRedirectDialog(b0Var));
            }
        } else if (fr.t.c(bVar, h21.i.b.C1827b.f80089a)) {
            d9(new j21.a.OnWebRedirectDialog(b0Var));
        } else {
            if (!(bVar instanceof h21.i.b.TemporaryInterrupted)) {
                throw new oq.p();
            }
            d9(new j21.a.ShowDialog(this.chatBotNavigationDialogMapper.b(new k21.m.Params(new k21.o.TemporaryInterruptionDialog(((h21.i.b.TemporaryInterrupted) bVar).getData(), b9(j21.b.f98693a))))));
        }
        return oq.i0.f148189a;
    }

    private final boolean fa(j21.g.a.Screen state) {
        List<h1> listD = state.getData().d();
        if ((listD instanceof Collection) && listD.isEmpty()) {
            return false;
        }
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            if (((h1) it.next()) instanceof h1.a) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j21.h.Data ga(j21.g state) {
        k21.l lVar = this.chatBotConversationMapper;
        er.l lVar2 = new er.l() { // from class: j21.s
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ha(this.f98995a, ((Boolean) obj).booleanValue());
            }
        };
        er.l lVar3 = new er.l() { // from class: j21.d0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ia(this.f98702a, (String) obj);
            }
        };
        er.a<oq.i0> aVarB9 = b9(j21.a.j.f98670a);
        er.a<oq.i0> aVarB10 = b9(j21.a.f.f98661a);
        er.l lVar4 = new er.l() { // from class: j21.h0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ja(this.f98745a, ((Boolean) obj).booleanValue());
            }
        };
        j21.a.m mVar = j21.a.m.f98673a;
        return lVar.b(new k21.l.Params(state, lVar2, lVar3, aVarB9, aVarB10, lVar4, b9(mVar), b9(j21.a.x.f98689a), new er.l() { // from class: j21.i0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ka(this.f98766a, (String) obj);
            }
        }, new er.l() { // from class: j21.j0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.la(this.f98769a, (iy.b0) obj);
            }
        }, new er.q() { // from class: j21.k0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return p0.ma(this.f98776a, (h1.a.Full) obj, (g21.e) obj2, (String) obj3);
            }
        }, new er.l() { // from class: j21.l0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.na(this.f98781a, (String) obj);
            }
        }, new er.l() { // from class: j21.m0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.oa(this.f98787a, (Action) obj);
            }
        }, b9(j21.a.r.f98681a), b9(mVar), new er.l() { // from class: j21.n0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.pa(this.f98804a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(p0 p0Var, boolean z15) {
        p0Var.d9(new j21.a.UpdateTopBarMenu(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(p0 p0Var, String str) {
        p0Var.d9(new j21.a.ChangeInputContent(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(p0 p0Var, boolean z15) {
        p0Var.d9(new j21.a.IsInputCharsLimitReached(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ka(p0 p0Var, String str) {
        p0Var.d9(new j21.a.StartSendingUserMessage(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 la(p0 p0Var, iy.b0 b0Var) {
        p0Var.d9(new j21.a.OnWebRedirectDialog(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ma(p0 p0Var, h1.a.Full full, g21.e eVar, String str) {
        p0Var.d9(new j21.a.RateAnswer(full, eVar, str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 na(p0 p0Var, String str) {
        p0Var.d9(new j21.a.ShareAnswer(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 oa(p0 p0Var, Action action) {
        p0Var.d9(new j21.a.OnActionClick(action));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 pa(p0 p0Var, String str) {
        p0Var.d9(new j21.a.StartSendingUserMessage(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object qa(j21.g gVar, tq.e<? super oq.i0> eVar) {
        if (gVar instanceof j21.g.a.Screen) {
            j21.g.a.Screen screen = (j21.g.a.Screen) gVar;
            if (fa(screen)) {
                Object objF = F(new j21.a.i.GoToRateConversation(new SetupData(screen.getData().getConversationData().getConversationId())), eVar);
                return objF == uq.b.e() ? objF : oq.i0.f148189a;
            }
        }
        d9(new j21.a.ShowDialog(this.chatBotNavigationDialogMapper.b(new k21.m.Params(new k21.o.ExitDialog(b9(j21.c.f98696a), b9(j21.b.f98693a))))));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object ra(k10.c0<j21.g.a> c0Var, dx.b bVar, String str, j21.a aVar, tq.e<? super k10.l<? extends j21.g.a>> eVar) throws Throwable {
        e eVar2;
        k10.c0<j21.g.a> c0Var2;
        PayloadErrorData payloadErrorData;
        String message;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f98877n;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f98877n = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f98875l;
        Object objE = uq.b.e();
        int i16 = eVar2.f98877n;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10.l lVar = (k10.l) eVar2.f98872h;
            oq.u.b(obj);
            return lVar;
        }
        oq.u.b(obj);
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http == null || (payloadErrorData = (PayloadErrorData) http.b()) == null) {
            c0Var2 = c0Var;
        } else {
            String code = payloadErrorData.getCode();
            if (code == null || !fu.r.V(code, "CHAT_RESPONSE_FOR", false, 2, null)) {
                payloadErrorData = null;
            }
            if (payloadErrorData == null || (message = payloadErrorData.getMessage()) == null) {
                c0Var2 = c0Var;
            } else {
                j21.g.a.Data data = c0Var.a().getData();
                i1 i1Var = this.conversationsUpdater;
                List<h1> listD = c0Var.a().getData().d();
                PayloadErrorData payloadErrorData2 = (PayloadErrorData) ((dx.b.g.Http) bVar).b();
                final j21.g.a.Data dataB = j21.g.a.Data.b(data, null, i1Var.e(listD, str, message, fr.t.c(payloadErrorData2 != null ? payloadErrorData2.getCode() : null, "CHAT_RESPONSE_FOR_GLOBAL_TOKEN_LIMIT_REACHED")), null, null, false, true, 0, false, false, false, ConscryptStatsLog.CERTIFICATE_TRANSPARENCY_VERIFICATION_REPORTED, null);
                if (dataB != null) {
                    er.l<? super j21.g.a, ? extends j21.g.a> lVar2 = new er.l() { // from class: j21.e0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p0.sa(dataB, (g.a) obj2);
                        }
                    };
                    c0Var2 = c0Var;
                    k10.l<j21.g.a> lVarB = c0Var2.b(lVar2);
                    if (lVarB != null) {
                        return lVarB;
                    }
                } else {
                    c0Var2 = c0Var;
                }
            }
        }
        Object objC = c0Var2.c();
        eVar2.f98868d = vq.j.a(c0Var2);
        eVar2.f98869e = vq.j.a(bVar);
        eVar2.f98870f = vq.j.a(str);
        eVar2.f98871g = vq.j.a(aVar);
        eVar2.f98872h = objC;
        eVar2.f98873j = vq.j.a(objC);
        eVar2.f98874k = 0;
        eVar2.f98877n = 1;
        return aa(bVar, aVar, eVar2) == objE ? objE : objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j21.g.a sa(j21.g.a.Data data, j21.g.a aVar) {
        if (aVar instanceof j21.g.a.Dialog) {
            return j21.g.a.Dialog.e((j21.g.a.Dialog) aVar, data, null, 2, null);
        }
        if (aVar instanceof j21.g.a.Screen) {
            return ((j21.g.a.Screen) aVar).d(data);
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ta(dx.b.Business domainError) {
        y(new p50.a.DefaultWithIcon(domainError.getMessage(), false, null, null, 14, null));
    }

    private final k10.l<j21.g.a> ua(k10.c0<j21.g.a> c0Var, h1.a aVar) {
        boolean z15 = aVar instanceof h1.a.Full;
        h1.a.Full full = z15 ? (h1.a.Full) aVar : null;
        boolean z16 = false;
        if (full != null && full.getCurrentMessages() != c0Var.a().getData().getConversationData().getLimits().getMaxQuestions() && full.k().isEmpty()) {
            z16 = true;
        }
        boolean z17 = z16;
        h1.a.Full full2 = z15 ? (h1.a.Full) aVar : null;
        Integer numValueOf = full2 != null ? Integer.valueOf(full2.getCurrentMessages()) : null;
        j21.g.a.Data data = c0Var.a().getData();
        final j21.g.a.Data dataB = j21.g.a.Data.b(data, null, this.conversationsUpdater.b(data.d(), aVar, data.getConversationData()), null, null, false, z17, numValueOf != null ? numValueOf.intValue() : data.getLastMessageCount(), false, false, false, 925, null);
        return c0Var.b(new er.l() { // from class: j21.f0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.va(dataB, (g.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j21.g.a va(j21.g.a.Data data, j21.g.a aVar) {
        if (aVar instanceof j21.g.a.Dialog) {
            return j21.g.a.Dialog.e((j21.g.a.Dialog) aVar, data, null, 2, null);
        }
        if (aVar instanceof j21.g.a.Screen) {
            return ((j21.g.a.Screen) aVar).d(data);
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xa(boolean isSuccess) {
        int i15;
        mx.c cVar = this.labelProvider;
        if (isSuccess) {
            i15 = a21.a.f2105o;
        } else {
            if (isSuccess) {
                throw new oq.p();
            }
            i15 = a21.a.f2103n;
        }
        y(new p50.a.DefaultWithIcon(cVar.c(i15), false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ya(final p0 p0Var, k10.v vVar) {
        vVar.c(fr.q0.c(j21.g.class), new er.l() { // from class: j21.o0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.za(this.f98809a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(j21.g.b.class), new er.l() { // from class: j21.t
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Aa(this.f98997a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(j21.g.b.Screen.class), new er.l() { // from class: j21.u
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Ba(this.f98998a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(j21.g.b.Dialog.class), new er.l() { // from class: j21.v
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Ca(this.f98999a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(j21.g.a.Dialog.class), new er.l() { // from class: j21.w
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Da(this.f99001a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(j21.g.a.class), new er.l() { // from class: j21.x
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Ea(this.f99003a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(j21.g.a.Screen.class), new er.l() { // from class: j21.y
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Ha(this.f99005a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 za(p0 p0Var, k10.z zVar) {
        g gVar = p0Var.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(j21.a.m.class), oVar, gVar);
        zVar.v(fr.q0.c(j21.a.r.class), oVar, p0Var.new h(null));
        zVar.x(fr.q0.c(j21.a.f.class), oVar, p0Var.new i(null));
        zVar.x(fr.q0.c(j21.a.b.class), oVar, p0Var.new j(null));
        zVar.x(fr.q0.c(j21.a.ShareAnswer.class), oVar, p0Var.new k(null));
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<j21.a.i> Y1() {
        return this.navAction;
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        this.clearCachedDocumentConfigsUC.b(gz.b.a.C1792a.f78542a);
        super.Y8();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(j21.a.i iVar, tq.e<? super oq.i0> eVar) {
        return super.F(iVar, eVar);
    }

    @Override // l00.g
    protected k10.t<j21.g, j21.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<j21.h.Data> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: wa, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
