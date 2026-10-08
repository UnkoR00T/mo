package r12;

import d12.OAuthWebViewData;
import eo0.y0;
import ja.n0;
import ja.u0;
import ja.x0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p02.q0;
import p071kotlin.Metadata;
import pq.IndexedValue;
import t12.MessageListDataModel;
import z02.MessageListPayload;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0092\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001vB\u0083\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0018\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0082@¢\u0006\u0004\b*\u0010+J/\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.0-\"\b\b\u0000\u0010,*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000-H\u0002¢\u0006\u0004\b/\u00100J+\u00105\u001a\b\u0012\u0004\u0012\u0002040-2\f\u00101\u001a\b\u0012\u0004\u0012\u00020'0-2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b5\u00106JC\u0010=\u001a\u00020)2\u0006\u00108\u001a\u0002072\f\u0010:\u001a\b\u0012\u0004\u0012\u00020)092\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020)092\f\u0010<\u001a\b\u0012\u0004\u0012\u00020)09H\u0002¢\u0006\u0004\b=\u0010>JC\u0010?\u001a\u00020)2\u0006\u00108\u001a\u0002072\f\u0010:\u001a\b\u0012\u0004\u0012\u00020)092\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020)092\f\u0010<\u001a\b\u0012\u0004\u0012\u00020)09H\u0002¢\u0006\u0004\b?\u0010>J\u0018\u0010B\u001a\u00020)2\u0006\u0010A\u001a\u00020@H\u0096\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020)H\u0096\u0001¢\u0006\u0004\bD\u0010EJ\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020G0FH\u0096\u0001¢\u0006\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020k0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR \u0010r\u001a\b\u0012\u0004\u0012\u00020k0j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010m\u001a\u0004\bp\u0010qR\u001a\u0010x\u001a\u00020s8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR&\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030y8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R&\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u007f8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u008b\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bB\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u008f\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040-0F8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010IR\u001c\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010F8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010I¨\u0006\u0093\u0001"}, d2 = {"Lr12/o;", "Ll00/g;", "Lr12/c;", "Lr12/a;", "Lr12/d;", "", "Lnx/b;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Ls12/g;", "messagesListScreenMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lp02/j;", "fetchMessagesUseCase", "Lb12/c;", "electronicDeliveryErrorMapper", "Loz/q;", "ownerViewLifecycleManager", "Ls12/b;", "messageConfirmationDialogMapper", "Ls12/i;", "signMessageDialogMapper", "Lp02/q0;", "signUpdUC", "Lp02/c0;", "getUpdUC", "Lmx/c;", "labelProvider", "snackBarManagerStateHolder", "Lhb4/d;", "errorVMSFactory", "Ls12/f;", "messageSingleCardMapper", "Lz02/c;", "messageListPayload", "<init>", "(Lyy/a;Ls12/g;Lac4/a;Lp02/j;Lb12/c;Loz/q;Ls12/b;Ls12/i;Lp02/q0;Lp02/c0;Lmx/c;Li70/n;Lhb4/d;Ls12/f;Lz02/c;)V", "Lfo0/c;", "message", "Loq/i0;", "O9", "(Lfo0/c;Ltq/e;)Ljava/lang/Object;", "T", "Lja/n0;", "Lpq/p0;", "W9", "(Lja/n0;)Lja/n0;", "pagingSourceData", "Leo0/t;", "directoryType", "Ln50/k;", "K9", "(Lja/n0;Leo0/t;)Lja/n0;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "retryAction", "closeAction", "refreshTokenAction", "J9", "(Ldx/b;Ler/a;Ler/a;Ler/a;)V", "H9", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "b", "Ls12/g;", "c", "Lac4/a;", "d", "Lp02/j;", "e", "Lb12/c;", "f", "Loz/q;", "g", "Ls12/b;", "h", "Ls12/i;", "j", "Lp02/q0;", "k", "Lp02/c0;", "l", "Lmx/c;", "m", "Li70/n;", "n", "Lhb4/d;", "p", "Ls12/f;", "q", "Lz02/c;", "Lr12/c$d;", "r", "Lr12/c$d;", "initialState", "Lmu/a0;", "Lr12/b;", "s", "Lmu/a0;", "_pagingEvents", "t", "G9", "()Lmu/a0;", "pagingEvents", "Loz/j;", "v", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "w", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lr12/d$a;", "x", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lxw/b;", "Lr12/a$g;", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "z", "Lmu/g;", "Z2", "messagesPagingData", "Li70/p;", "snackBarVisibilityState", "A", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<r12.c, a> implements r12.d, zx.d, nx.b, i70.n {
    public static final int B = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s12.g messagesListScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p02.j fetchMessagesUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b12.c electronicDeliveryErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final s12.b messageConfirmationDialogMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final s12.i signMessageDialogMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final q0 signUpdUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p02.c0 getUpdUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final s12.f messageSingleCardMapper;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final MessageListPayload messageListPayload;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final r12.c.Initial initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mu.a0<r12.b> _pagingEvents;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final mu.a0<r12.b> pagingEvents;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final k10.t<r12.c, a> stateMachine;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final p0<r12.d.a> state;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.g> navAction;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final mu.g<n0<n50.k>> messagesPagingData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpq/p0;", "Lfo0/c;", "item", "Ln50/k;", "<anonymous>", "(Lpq/p0;)Ln50/k;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<IndexedValue<? extends fo0.c>, tq.e<? super n50.k>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170610e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170611f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ eo0.t f170613h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(eo0.t tVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f170613h = tVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(o oVar, fo0.c cVar) {
            oVar.d9(new a.MessageClick(cVar));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            IndexedValue indexedValue = (IndexedValue) this.f170611f;
            uq.b.e();
            if (this.f170610e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s12.f fVar = o.this.messageSingleCardMapper;
            fo0.c cVar = (fo0.c) indexedValue.d();
            int iC = indexedValue.c();
            eo0.t tVar = this.f170613h;
            final o oVar = o.this;
            return fVar.b(new s12.f.Params(cVar, iC, tVar, new er.l() { // from class: r12.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.b.O(oVar, (fo0.c) obj2);
                }
            }));
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(IndexedValue<fo0.c> indexedValue, tq.e<? super n50.k> eVar) {
            return ((b) v(indexedValue, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = o.this.new b(this.f170613h, eVar);
            bVar.f170611f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170615f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f170616g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f170617h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f170618j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f170619k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f170620l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f170621m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f170622n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f170623p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ fo0.c f170625r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fo0.c cVar, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f170625r = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:27:0x010a  */
        /* JADX WARN: Code duplicated, block: B:29:0x010e  */
        /* JADX WARN: Code duplicated, block: B:32:0x015a  */
        /* JADX WARN: Code duplicated, block: B:36:0x0163  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar;
            fo0.c cVar;
            o oVar;
            iy.b0 b0Var;
            int i15;
            int i16;
            dx.i iVar2;
            mu.a0 a0Var;
            r12.b.a aVar;
            o oVar2;
            Object objE = uq.b.e();
            int i17 = this.f170623p;
            if (i17 == 0) {
                oq.u.b(obj);
                p02.c0 c0Var = o.this.getUpdUC;
                p02.c0.Params params = new p02.c0.Params(this.f170625r.getMessageId(), null);
                this.f170623p = 1;
                obj = c0Var.e(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i17 == 1) {
                oq.u.b(obj);
            } else {
                if (i17 == 2) {
                    i15 = this.f170620l;
                    i16 = this.f170619k;
                    b0Var = (iy.b0) this.f170617h;
                    cVar = (fo0.c) this.f170616g;
                    oVar = (o) this.f170615f;
                    iVar = (dx.i) this.f170614e;
                    oq.u.b(obj);
                    iVar2 = (dx.i) obj;
                    if (!(iVar2 instanceof dx.i.Left)) {
                        if (iVar2 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar2).b();
                        oVar.d9(new a.ShowSnackBar(oVar.labelProvider.c(e02.a.f46609s4)));
                        a0Var = oVar._pagingEvents;
                        aVar = r12.b.a.f170519a;
                        this.f170614e = vq.j.a(iVar);
                        this.f170615f = oVar;
                        this.f170616g = vq.j.a(b0Var);
                        this.f170617h = vq.j.a(iVar2);
                        this.f170618j = vq.j.a(i0Var);
                        this.f170619k = i16;
                        this.f170620l = i15;
                        this.f170621m = 0;
                        this.f170622n = 0;
                        this.f170623p = 3;
                        if (a0Var.F(aVar, this) != objE) {
                            oVar2 = oVar;
                        }
                        return objE;
                    }
                    oVar.J9((dx.b) ((dx.i.Left) iVar2).b(), oVar.b9(new a.SignMessage(cVar)), oVar.b9(a.b.f170500a), oVar.b9(new a.SignMessage(cVar)));
                    return oq.i0.f148189a;
                }
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar2 = (o) this.f170615f;
                oq.u.b(obj);
            }
            oVar2.d9(a.b.f170500a);
            return oq.i0.f148189a;
            iVar = (dx.i) obj;
            o oVar3 = o.this;
            cVar = this.f170625r;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                iy.b0 value = ((eo0.i) ((dx.i.Right) iVar).b()).getValue();
                q0 q0Var = oVar3.signUpdUC;
                q0.Params params2 = new q0.Params(cVar.getMessageId(), value, null);
                this.f170614e = vq.j.a(iVar);
                this.f170615f = oVar3;
                this.f170616g = cVar;
                this.f170617h = vq.j.a(value);
                this.f170619k = 0;
                this.f170620l = 0;
                this.f170623p = 2;
                Object objF = q0Var.f(params2, this);
                if (objF != objE) {
                    oVar = oVar3;
                    b0Var = value;
                    obj = objF;
                    i15 = 0;
                    i16 = 0;
                    iVar2 = (dx.i) obj;
                    if (!(iVar2 instanceof dx.i.Left)) {
                        oVar.J9((dx.b) ((dx.i.Left) iVar2).b(), oVar.b9(new a.SignMessage(cVar)), oVar.b9(a.b.f170500a), oVar.b9(new a.SignMessage(cVar)));
                    } else {
                        if (iVar2 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        oq.i0 i0Var2 = (oq.i0) ((dx.i.Right) iVar2).b();
                        oVar.d9(new a.ShowSnackBar(oVar.labelProvider.c(e02.a.f46609s4)));
                        a0Var = oVar._pagingEvents;
                        aVar = r12.b.a.f170519a;
                        this.f170614e = vq.j.a(iVar);
                        this.f170615f = oVar;
                        this.f170616g = vq.j.a(b0Var);
                        this.f170617h = vq.j.a(iVar2);
                        this.f170618j = vq.j.a(i0Var2);
                        this.f170619k = i16;
                        this.f170620l = i15;
                        this.f170621m = 0;
                        this.f170622n = 0;
                        this.f170623p = 3;
                        if (a0Var.F(aVar, this) != objE) {
                            oVar2 = oVar;
                            oVar2.d9(a.b.f170500a);
                        }
                    }
                }
                return objE;
            }
            oVar3.J9((dx.b) ((dx.i.Left) iVar).b(), oVar3.b9(new a.SignMessage(cVar)), oVar3.b9(a.b.f170500a), oVar3.b9(new a.SignMessage(cVar)));
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return o.this.new c(this.f170625r, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<r12.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f170626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f170627b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f170628a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f170629b;

            /* JADX INFO: renamed from: r12.o$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4325a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f170630d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f170631e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f170632f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f170634h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f170635j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f170636k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f170637l;

                public C4325a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f170630d = obj;
                    this.f170631e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f170628a = hVar;
                this.f170629b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4325a c4325a;
                if (eVar instanceof C4325a) {
                    c4325a = (C4325a) eVar;
                    int i15 = c4325a.f170631e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4325a.f170631e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4325a = new C4325a(eVar);
                    }
                } else {
                    c4325a = new C4325a(eVar);
                }
                Object obj2 = c4325a.f170630d;
                Object objE = uq.b.e();
                int i16 = c4325a.f170631e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f170628a;
                    r12.d.a aVarB = this.f170629b.messagesListScreenMapper.b(new s12.g.Params((r12.c) obj, this.f170629b.b9(r12.a.C4317a.f170499a), this.f170629b.b9(r12.a.l.f170517a)));
                    c4325a.f170632f = vq.j.a(obj);
                    c4325a.f170634h = vq.j.a(c4325a);
                    c4325a.f170635j = vq.j.a(obj);
                    c4325a.f170636k = vq.j.a(hVar);
                    c4325a.f170637l = 0;
                    c4325a.f170631e = 1;
                    if (hVar.F(aVarB, c4325a) == objE) {
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

        public d(mu.g gVar, o oVar) {
            this.f170626a = gVar;
            this.f170627b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super r12.d.a> hVar, tq.e eVar) {
            Object objA = this.f170626a.a(new a(hVar, this.f170627b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<n0<n50.k>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f170638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f170639b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f170640a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f170641b;

            /* JADX INFO: renamed from: r12.o$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4326a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f170642d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f170643e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f170644f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f170646h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f170647j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f170648k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f170649l;

                public C4326a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f170642d = obj;
                    this.f170643e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f170640a = hVar;
                this.f170641b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4326a c4326a;
                if (eVar instanceof C4326a) {
                    c4326a = (C4326a) eVar;
                    int i15 = c4326a.f170643e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4326a.f170643e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4326a = new C4326a(eVar);
                    }
                } else {
                    c4326a = new C4326a(eVar);
                }
                Object obj2 = c4326a.f170642d;
                Object objE = uq.b.e();
                int i16 = c4326a.f170643e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f170640a;
                    o oVar = this.f170641b;
                    n0 n0VarK9 = oVar.K9((n0) obj, oVar.messageListPayload.getType());
                    c4326a.f170644f = vq.j.a(obj);
                    c4326a.f170646h = vq.j.a(c4326a);
                    c4326a.f170647j = vq.j.a(obj);
                    c4326a.f170648k = vq.j.a(hVar);
                    c4326a.f170649l = 0;
                    c4326a.f170643e = 1;
                    if (hVar.F(n0VarK9, c4326a) == objE) {
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

        public e(mu.g gVar, o oVar) {
            this.f170638a = gVar;
            this.f170639b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0<n50.k>> hVar, tq.e eVar) {
            Object objA = this.f170638a.a(new a(hVar, this.f170639b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr12/a$c;", "action", "Lk10/c0;", "Lr12/c;", "state", "Lk10/l;", "<anonymous>", "(Lr12/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a.Error, k10.c0<r12.c>, tq.e<? super k10.l<? extends r12.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170651f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f170652g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r12.c.Error O(k10.c0 c0Var, o oVar, a.Error error, r12.c cVar) {
            return new r12.c.Error(((r12.c) c0Var.a()).getData(), oVar.errorVMSFactory.a(error.getErrorData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.Error error = (a.Error) this.f170651f;
            final k10.c0 c0Var = (k10.c0) this.f170652g;
            uq.b.e();
            if (this.f170650e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final o oVar = o.this;
            return c0Var.d(new er.l() { // from class: r12.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.f.O(c0Var, oVar, error, (c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.Error error, k10.c0<r12.c> c0Var, tq.e<? super k10.l<? extends r12.c>> eVar) {
            f fVar = o.this.new f(eVar);
            fVar.f170651f = error;
            fVar.f170652g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr12/a$a;", "<unused var>", "Lr12/c;", "Loq/i0;", "<anonymous>", "(Lr12/a$a;Lr12/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a.C4317a, r12.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170654e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f170654e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.g> bVarY1 = o.this.Y1();
                a.g.C4318a c4318a = a.g.C4318a.f170505a;
                this.f170654e = 1;
                if (bVarY1.F(c4318a, this) == objE) {
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
        public final Object w(a.C4317a c4317a, r12.c cVar, tq.e<? super oq.i0> eVar) {
            return o.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr12/a$j;", "action", "Lr12/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr12/a$j;Lr12/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.ShowSnackBar, r12.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170657f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.ShowSnackBar showSnackBar = (a.ShowSnackBar) this.f170657f;
            uq.b.e();
            if (this.f170656e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o.this.y(new p50.a.DefaultWithIcon(showSnackBar.getMessage(), false, null, null, 14, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.ShowSnackBar showSnackBar, r12.c cVar, tq.e<? super oq.i0> eVar) {
            h hVar = o.this.new h(eVar);
            hVar.f170657f = showSnackBar;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr12/a$d;", "action", "Lr12/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr12/a$d;Lr12/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a.GoToAuthorization, r12.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170660f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(a.GoToAuthorization goToAuthorization) {
            goToAuthorization.a().a();
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.GoToAuthorization goToAuthorization = (a.GoToAuthorization) this.f170660f;
            Object objE = uq.b.e();
            int i15 = this.f170659e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.g> bVarY1 = o.this.Y1();
                a.g.GoToAuthorization goToAuthorization2 = new a.g.GoToAuthorization(new OAuthWebViewData(new er.a() { // from class: r12.r
                    @Override // er.a
                    public final Object a() {
                        return o.i.O(goToAuthorization);
                    }
                }));
                this.f170660f = vq.j.a(goToAuthorization);
                this.f170659e = 1;
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
        public final Object w(a.GoToAuthorization goToAuthorization, r12.c cVar, tq.e<? super oq.i0> eVar) {
            i iVar = o.this.new i(eVar);
            iVar.f170660f = goToAuthorization;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr12/a$b;", "<unused var>", "Lk10/c0;", "Lr12/c;", "state", "Lk10/l;", "<anonymous>", "(Lr12/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a.b, k10.c0<r12.c>, tq.e<? super k10.l<? extends r12.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170663f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r12.c.Displaying O(k10.c0 c0Var, r12.c cVar) {
            return new r12.c.Displaying(((r12.c) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f170663f;
            uq.b.e();
            if (this.f170662e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: r12.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.j.O(c0Var, (c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, k10.c0<r12.c> c0Var, tq.e<? super k10.l<? extends r12.c>> eVar) {
            j jVar = new j(eVar);
            jVar.f170663f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr12/a$i;", "<unused var>", "Lk10/c0;", "Lr12/c;", "state", "Lk10/l;", "<anonymous>", "(Lr12/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<a.i, k10.c0<r12.c>, tq.e<? super k10.l<? extends r12.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170665f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r12.c.Empty O(k10.c0 c0Var, r12.c cVar) {
            return new r12.c.Empty(((r12.c) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f170665f;
            uq.b.e();
            if (this.f170664e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: r12.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.k.O(c0Var, (c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.i iVar, k10.c0<r12.c> c0Var, tq.e<? super k10.l<? extends r12.c>> eVar) {
            k kVar = new k(eVar);
            kVar.f170665f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr12/a$l;", "<unused var>", "Lr12/c$b;", "Loq/i0;", "<anonymous>", "(Lr12/a$l;Lr12/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a.l, r12.c.Empty, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170666e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f170666e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.g> bVarY1 = o.this.Y1();
                a.g.GoToWriteMessage goToWriteMessage = new a.g.GoToWriteMessage(z02.a.c.f231893a);
                this.f170666e = 1;
                if (bVarY1.F(goToWriteMessage, this) == objE) {
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
        public final Object w(a.l lVar, r12.c.Empty empty, tq.e<? super oq.i0> eVar) {
            return o.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr12/c$e;", "it", "Loq/i0;", "<anonymous>", "(Lr12/c$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<r12.c.RetryingFetchingMessages, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170668e;

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f170668e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o.this.d9(a.h.f170513a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(r12.c.RetryingFetchingMessages retryingFetchingMessages, tq.e<? super oq.i0> eVar) {
            return ((m) v(retryingFetchingMessages, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return o.this.new m(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr12/a$h;", "<unused var>", "Lr12/c$e;", "Loq/i0;", "<anonymous>", "(Lr12/a$h;Lr12/c$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<a.h, r12.c.RetryingFetchingMessages, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170670e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f170670e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.a0 a0Var = o.this._pagingEvents;
                r12.b.C4319b c4319b = r12.b.C4319b.f170520a;
                this.f170670e = 1;
                if (a0Var.F(c4319b, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            o.this.d9(a.b.f170500a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.h hVar, r12.c.RetryingFetchingMessages retryingFetchingMessages, tq.e<? super oq.i0> eVar) {
            return o.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: r12.o$o, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr12/a$k;", "action", "Lk10/c0;", "Lr12/c$a;", "state", "Lk10/l;", "Lr12/c;", "<anonymous>", "(Lr12/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C4327o extends vq.k implements er.q<a.SignMessage, k10.c0<r12.c.Displaying>, tq.e<? super k10.l<? extends r12.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170673f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f170674g;

        C4327o(tq.e<? super C4327o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r12.c.SigningMessage O(k10.c0 c0Var, a.SignMessage signMessage, r12.c.Displaying displaying) {
            return new r12.c.SigningMessage(((r12.c.Displaying) c0Var.a()).getData(), signMessage.getMessage());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SignMessage signMessage = (a.SignMessage) this.f170673f;
            final k10.c0 c0Var = (k10.c0) this.f170674g;
            uq.b.e();
            if (this.f170672e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: r12.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.C4327o.O(c0Var, signMessage, (c.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SignMessage signMessage, k10.c0<r12.c.Displaying> c0Var, tq.e<? super k10.l<? extends r12.c>> eVar) {
            C4327o c4327o = new C4327o(eVar);
            c4327o.f170673f = signMessage;
            c4327o.f170674g = c0Var;
            return c4327o.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr12/a$f;", "action", "Lr12/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr12/a$f;Lr12/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a.MessageClick, r12.c.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170676f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
        
            if (r10.F(r2, r9) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
        
            if (r10.F(r2, r9) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f170676f
                r12.a$f r0 = (r12.a.MessageClick) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r9.f170675e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                oq.u.b(r10)
                goto Lad
            L20:
                oq.u.b(r10)
                fo0.c r10 = r0.getMessage()
                boolean r10 = r10.getReceiptConfirmation()
                if (r10 == 0) goto L61
                r12.o r10 = r12.o.this
                r12.a$g$b r2 = new r12.a$g$b
                r12.o r3 = r12.o.this
                s12.b r3 = r12.o.v9(r3)
                s12.b$a r5 = new s12.b$a
                r12.o r6 = r12.o.this
                r12.a$e r7 = new r12.a$e
                fo0.c r8 = r0.getMessage()
                r7.<init>(r8)
                er.a r6 = r12.o.q9(r6, r7)
                r5.<init>(r6)
                cb4.d r3 = r3.b(r5)
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r9.f170676f = r0
                r9.f170675e = r4
                java.lang.Object r10 = r10.F(r2, r9)
                if (r10 != r1) goto Lad
                goto L9e
            L61:
                fo0.c r10 = r0.getMessage()
                boolean r10 = r10.w()
                if (r10 == 0) goto L9f
                r12.o r10 = r12.o.this
                r12.a$g$b r2 = new r12.a$g$b
                r12.o r4 = r12.o.this
                s12.i r4 = r12.o.z9(r4)
                s12.i$a r5 = new s12.i$a
                r12.o r6 = r12.o.this
                r12.a$k r7 = new r12.a$k
                fo0.c r8 = r0.getMessage()
                r7.<init>(r8)
                er.a r6 = r12.o.q9(r6, r7)
                r5.<init>(r6)
                cb4.d r4 = r4.b(r5)
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r9.f170676f = r0
                r9.f170675e = r3
                java.lang.Object r10 = r10.F(r2, r9)
                if (r10 != r1) goto Lad
            L9e:
                return r1
            L9f:
                r12.o r10 = r12.o.this
                r12.a$e r1 = new r12.a$e
                fo0.c r0 = r0.getMessage()
                r1.<init>(r0)
                r12.o.r9(r10, r1)
            Lad:
                oq.i0 r10 = oq.i0.f148189a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: r12.o.p.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.MessageClick messageClick, r12.c.Displaying displaying, tq.e<? super oq.i0> eVar) {
            p pVar = o.this.new p(eVar);
            pVar.f170676f = messageClick;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr12/a$e;", "action", "Lr12/c$a;", "state", "Loq/i0;", "<anonymous>", "(Lr12/a$e;Lr12/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<r12.a.GoToDetails, r12.c.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170679f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f170680g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f170682a;

            static {
                int[] iArr = new int[y0.values().length];
                try {
                    iArr[y0.E_PUAP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y0.E_DELIVERY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[y0.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f170682a = iArr;
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        
            if (r8.F(r3, r7) == r2) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
        
            if (r8.F(r3, r7) == r2) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
        
            return r2;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f170679f
                r12.a$e r0 = (r12.a.GoToDetails) r0
                java.lang.Object r1 = r7.f170680g
                r12.c$a r1 = (r12.c.Displaying) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r7.f170678e
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L23
                if (r3 == r5) goto L16
                if (r3 != r4) goto L1b
            L16:
                oq.u.b(r8)
                goto L94
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                oq.u.b(r8)
                fo0.c r8 = r0.getMessage()
                eo0.y0 r8 = r8.getServiceType()
                int[] r3 = r12.o.q.a.f170682a
                int r8 = r8.ordinal()
                r8 = r3[r8]
                if (r8 == r5) goto L6c
                if (r8 == r4) goto L44
                r0 = 3
                if (r8 != r0) goto L3e
                goto L94
            L3e:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            L44:
                r12.o r8 = r12.o.this
                xw.b r8 = r8.Y1()
                r12.a$g$d r3 = new r12.a$g$d
                fo0.c r5 = r0.getMessage()
                t12.a r6 = r1.getData()
                r3.<init>(r5, r6)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f170679f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f170680g = r0
                r7.f170678e = r4
                java.lang.Object r8 = r8.F(r3, r7)
                if (r8 != r2) goto L94
                goto L93
            L6c:
                r12.o r8 = r12.o.this
                xw.b r8 = r8.Y1()
                r12.a$g$e r3 = new r12.a$g$e
                fo0.c r4 = r0.getMessage()
                t12.a r6 = r1.getData()
                r3.<init>(r4, r6)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f170679f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f170680g = r0
                r7.f170678e = r5
                java.lang.Object r8 = r8.F(r3, r7)
                if (r8 != r2) goto L94
            L93:
                return r2
            L94:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: r12.o.q.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(r12.a.GoToDetails goToDetails, r12.c.Displaying displaying, tq.e<? super oq.i0> eVar) {
            q qVar = o.this.new q(eVar);
            qVar.f170679f = goToDetails;
            qVar.f170680g = displaying;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr12/a$l;", "<unused var>", "Lr12/c$a;", "Loq/i0;", "<anonymous>", "(Lr12/a$l;Lr12/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<a.l, r12.c.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170683e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f170683e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.g> bVarY1 = o.this.Y1();
                a.g.GoToWriteMessage goToWriteMessage = new a.g.GoToWriteMessage(z02.a.c.f231893a);
                this.f170683e = 1;
                if (bVarY1.F(goToWriteMessage, this) == objE) {
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
        public final Object w(a.l lVar, r12.c.Displaying displaying, tq.e<? super oq.i0> eVar) {
            return o.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr12/a$h;", "<unused var>", "Lk10/c0;", "Lr12/c$c;", "state", "Lk10/l;", "Lr12/c;", "<anonymous>", "(Lr12/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<a.h, k10.c0<r12.c.Error>, tq.e<? super k10.l<? extends r12.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170686f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r12.c.RetryingFetchingMessages O(k10.c0 c0Var, r12.c.Error error) {
            return new r12.c.RetryingFetchingMessages(((r12.c.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f170686f;
            uq.b.e();
            if (this.f170685e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: r12.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.s.O(c0Var, (c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.h hVar, k10.c0<r12.c.Error> c0Var, tq.e<? super k10.l<? extends r12.c>> eVar) {
            s sVar = new s(eVar);
            sVar.f170686f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr12/a$k;", "action", "Lk10/c0;", "Lr12/c$c;", "state", "Lk10/l;", "Lr12/c;", "<anonymous>", "(Lr12/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<a.SignMessage, k10.c0<r12.c.Error>, tq.e<? super k10.l<? extends r12.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170688f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f170689g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r12.c.SigningMessage O(k10.c0 c0Var, a.SignMessage signMessage, r12.c.Error error) {
            return new r12.c.SigningMessage(((r12.c.Error) c0Var.a()).getData(), signMessage.getMessage());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SignMessage signMessage = (a.SignMessage) this.f170688f;
            final k10.c0 c0Var = (k10.c0) this.f170689g;
            uq.b.e();
            if (this.f170687e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: r12.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.t.O(c0Var, signMessage, (c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SignMessage signMessage, k10.c0<r12.c.Error> c0Var, tq.e<? super k10.l<? extends r12.c>> eVar) {
            t tVar = new t(eVar);
            tVar.f170688f = signMessage;
            tVar.f170689g = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr12/c$f;", "state", "Loq/i0;", "<anonymous>", "(Lr12/c$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.p<r12.c.SigningMessage, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170691f;

        u(tq.e<? super u> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r12.c.SigningMessage signingMessage = (r12.c.SigningMessage) this.f170691f;
            uq.b.e();
            if (this.f170690e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o.this.d9(new a.SignMessage(signingMessage.getMessage()));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(r12.c.SigningMessage signingMessage, tq.e<? super oq.i0> eVar) {
            return ((u) v(signingMessage, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            u uVar = o.this.new u(eVar);
            uVar.f170691f = obj;
            return uVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr12/a$k;", "action", "Lr12/c$f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr12/a$k;Lr12/c$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<a.SignMessage, r12.c.SigningMessage, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170694f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.SignMessage signMessage = (a.SignMessage) this.f170694f;
            Object objE = uq.b.e();
            int i15 = this.f170693e;
            if (i15 == 0) {
                oq.u.b(obj);
                o oVar = o.this;
                fo0.c message = signMessage.getMessage();
                this.f170694f = vq.j.a(signMessage);
                this.f170693e = 1;
                if (oVar.O9(message, this) == objE) {
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
        public final Object w(a.SignMessage signMessage, r12.c.SigningMessage signingMessage, tq.e<? super oq.i0> eVar) {
            v vVar = o.this.new v(eVar);
            vVar.f170694f = signMessage;
            return vVar.J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n"}, d2 = {"", "T", "item", "Lpq/p0;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    static final class w<T> extends vq.k implements er.p<T, tq.e<? super IndexedValue<? extends T>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fr.n0 f170698g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(fr.n0 n0Var, tq.e<? super w> eVar) {
            super(2, eVar);
            this.f170698g = n0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object obj2 = this.f170697f;
            uq.b.e();
            if (this.f170696e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            fr.n0 n0Var = this.f170698g;
            int i15 = n0Var.f66407a;
            n0Var.f66407a = i15 + 1;
            return new IndexedValue(i15, obj2);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(T t15, tq.e<? super IndexedValue<? extends T>> eVar) {
            return ((w) v(t15, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            w wVar = new w(this.f170698g, eVar);
            wVar.f170697f = obj;
            return wVar;
        }
    }

    public o(yy.a aVar, s12.g gVar, ac4.a aVar2, p02.j jVar, b12.c cVar, oz.q qVar, s12.b bVar, s12.i iVar, q0 q0Var, p02.c0 c0Var, mx.c cVar2, i70.n nVar, hb4.d dVar, s12.f fVar, MessageListPayload messageListPayload) {
        this.messagesListScreenMapper = gVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.fetchMessagesUseCase = jVar;
        this.electronicDeliveryErrorMapper = cVar;
        this.ownerViewLifecycleManager = qVar;
        this.messageConfirmationDialogMapper = bVar;
        this.signMessageDialogMapper = iVar;
        this.signUpdUC = q0Var;
        this.getUpdUC = c0Var;
        this.labelProvider = cVar2;
        this.snackBarManagerStateHolder = nVar;
        this.errorVMSFactory = dVar;
        this.messageSingleCardMapper = fVar;
        this.messageListPayload = messageListPayload;
        r12.c.Initial initial = new r12.c.Initial(new MessageListDataModel(messageListPayload.getName(), messageListPayload.getDirectoryId(), messageListPayload.getType(), null));
        this.initialState = initial;
        mu.a0<r12.b> a0VarB = mu.h0.b(1, 0, null, 6, null);
        this._pagingEvents = a0VarB;
        this.pagingEvents = a0VarB;
        this.lifecycleConnector = qVar;
        this.stateMachine = aVar.a(initial, new er.l() { // from class: r12.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.P9(this.f170573a, (k10.v) obj);
            }
        });
        this.state = a9(new d(e9().getState(), this), r12.d.a.c.f170541a);
        this.navAction = new xw.b<>();
        this.messagesPagingData = new e(new ja.l0(new ja.m0(10, 0, false, 0, 0, 0, 62, null), null, new er.a() { // from class: r12.n
            @Override // er.a
            public final Object a() {
                return o.L9(this.f170587a);
            }
        }, 2, null).a(), this);
    }

    private final void H9(dx.b domainError, er.a<oq.i0> retryAction, er.a<oq.i0> closeAction, er.a<oq.i0> refreshTokenAction) {
        this.electronicDeliveryErrorMapper.c(new b12.c.Params(domainError, b9(new a.GoToAuthorization(refreshTokenAction)), closeAction, retryAction, new er.l() { // from class: r12.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.I9(this.f170567a, (jb4.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(o oVar, jb4.b bVar) {
        oVar.d9(new a.Error(bVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J9(dx.b domainError, er.a<oq.i0> retryAction, er.a<oq.i0> closeAction, er.a<oq.i0> refreshTokenAction) {
        if (domainError instanceof dx.b.Business) {
            dx.b.Business business = (dx.b.Business) domainError;
            if (business.getType() == n02.a.UPD_SEND_ERROR) {
                d9(new a.ShowSnackBar(business.getTitle()));
                d9(a.b.f170500a);
                return;
            }
        }
        H9(domainError, retryAction, closeAction, refreshTokenAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0<n50.k> K9(n0<fo0.c> pagingSourceData, eo0.t directoryType) {
        return u0.c(W9(pagingSourceData), new b(directoryType, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 L9(final o oVar) {
        return new m0(oVar.fetchMessagesUseCase, oVar.messageListPayload.getDirectoryId(), new er.p() { // from class: r12.k
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return o.M9(this.f170564a, (String) obj, (dx.b) obj2);
            }
        }, oVar.b9(a.b.f170500a), oVar.b9(a.i.f170514a), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(o oVar, String str, dx.b bVar) {
        a.h hVar = a.h.f170513a;
        oVar.H9(bVar, oVar.b9(hVar), oVar.b9(a.C4317a.f170499a), oVar.b9(hVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O9(fo0.c cVar, tq.e<? super oq.i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new c(cVar, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(final o oVar, k10.v vVar) {
        vVar.c(fr.q0.c(r12.c.class), new er.l() { // from class: r12.e
            @Override // er.l
            public final Object b(Object obj) {
                return o.Q9(this.f170544a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(r12.c.Empty.class), new er.l() { // from class: r12.f
            @Override // er.l
            public final Object b(Object obj) {
                return o.R9(this.f170547a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(r12.c.RetryingFetchingMessages.class), new er.l() { // from class: r12.g
            @Override // er.l
            public final Object b(Object obj) {
                return o.S9(this.f170553a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(r12.c.Displaying.class), new er.l() { // from class: r12.h
            @Override // er.l
            public final Object b(Object obj) {
                return o.T9(this.f170555a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(r12.c.Error.class), new er.l() { // from class: r12.i
            @Override // er.l
            public final Object b(Object obj) {
                return o.U9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(r12.c.SigningMessage.class), new er.l() { // from class: r12.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.V9(this.f170560a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(o oVar, k10.z zVar) {
        f fVar = oVar.new f(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.Error.class), oVar2, fVar);
        zVar.x(fr.q0.c(a.C4317a.class), oVar2, oVar.new g(null));
        zVar.x(fr.q0.c(a.ShowSnackBar.class), oVar2, oVar.new h(null));
        zVar.x(fr.q0.c(a.GoToAuthorization.class), oVar2, oVar.new i(null));
        zVar.v(fr.q0.c(a.b.class), oVar2, new j(null));
        zVar.v(fr.q0.c(a.i.class), oVar2, new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(o oVar, k10.z zVar) {
        l lVar = oVar.new l(null);
        zVar.x(fr.q0.c(a.l.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(o oVar, k10.z zVar) {
        zVar.C(oVar.new m(null));
        n nVar = oVar.new n(null);
        zVar.x(fr.q0.c(a.h.class), k10.o.CANCEL_PREVIOUS, nVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(o oVar, k10.z zVar) {
        C4327o c4327o = new C4327o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.SignMessage.class), oVar2, c4327o);
        zVar.x(fr.q0.c(a.MessageClick.class), oVar2, oVar.new p(null));
        zVar.x(fr.q0.c(a.GoToDetails.class), oVar2, oVar.new q(null));
        zVar.x(fr.q0.c(a.l.class), oVar2, oVar.new r(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(k10.z zVar) {
        s sVar = new s(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(a.h.class), oVar, sVar);
        zVar.v(fr.q0.c(a.SignMessage.class), oVar, new t(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(o oVar, k10.z zVar) {
        zVar.C(oVar.new u(null));
        v vVar = oVar.new v(null);
        zVar.x(fr.q0.c(a.SignMessage.class), k10.o.CANCEL_PREVIOUS, vVar);
        return oq.i0.f148189a;
    }

    private final <T> n0<IndexedValue<T>> W9(n0<T> n0Var) {
        return u0.c(n0Var, new w(new fr.n0(), null));
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a.g gVar, tq.e<? super oq.i0> eVar) {
        return super.F(gVar, eVar);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // r12.d
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public mu.a0<r12.b> q6() {
        return this.pagingEvents;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: N9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(MessageListPayload messageListPayload) {
        super.P5(messageListPayload);
    }

    @Override // zx.b
    public xw.b<a.g> Y1() {
        return this.navAction;
    }

    @Override // r12.d
    public mu.g<n0<n50.k>> Z2() {
        return this.messagesPagingData;
    }

    @Override // r12.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<r12.c, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<r12.d.a> getState() {
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
