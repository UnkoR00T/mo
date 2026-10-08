package u22;

import d12.OAuthWebViewData;
import eo0.g0;
import eo0.y0;
import fr.q0;
import k10.v;
import k10.z;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p02.n0;
import p02.p0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B{\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'J<\u00101\u001a\u00020-2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020-0,2\u0006\u00100\u001a\u00020/H\u0082@¢\u0006\u0004\b1\u00102JD\u00107\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\"\u00105\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020-04\u0012\u0006\u0012\u0004\u0018\u00010\u0005032\u0006\u00106\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b7\u00108J\u0018\u0010:\u001a\u00020-2\u0006\u0010+\u001a\u000209H\u0082@¢\u0006\u0004\b:\u0010;J \u0010<\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b<\u0010=J\u001b\u0010A\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0>H\u0002¢\u0006\u0004\bA\u0010BJ\u0018\u0010E\u001a\u00020-2\u0006\u0010D\u001a\u00020CH\u0082@¢\u0006\u0004\bE\u0010FJ%\u0010J\u001a\u00020-2\u0006\u0010G\u001a\u00020?2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020-0HH\u0002¢\u0006\u0004\bJ\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR \u0010o\u001a\b\u0012\u0004\u0012\u00020j0i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR&\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030p8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR \u0010$\u001a\b\u0012\u0004\u0012\u00020%0v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010z¨\u0006{"}, d2 = {"Lu22/q;", "Ll00/g;", "Lu22/b;", "Lu22/a;", "Lu22/c;", "", "Lyy/a;", "stateMachineFactory", "Lv22/b;", "messageSummaryMapper", "Lc12/g;", "dialogMapper", "Lb12/c;", "electronicDeliveryErrorMapper", "Lp02/b;", "createEdorDraftUC", "Lp02/n0;", "sendEdorMessageUC", "Lp02/p0;", "sendEpuapMessageUC", "Lp02/f;", "editEdorDraftUC", "Li70/e;", "snackBarManager", "Lp02/t;", "getMessageSummaryWizardResultUC", "Lp02/p;", "getEdeliveryDraftMessageRequestUC", "Lac4/a;", "callActionWithLoaderUC", "Lmx/c;", "labelProvider", "Lm22/h;", "setupData", "<init>", "(Lyy/a;Lv22/b;Lc12/g;Lb12/c;Lp02/b;Lp02/n0;Lp02/p0;Lp02/f;Li70/e;Lp02/t;Lp02/p;Lac4/a;Lmx/c;Lm22/h;)V", "state", "Lu22/c$a;", "E9", "(Lu22/b;)Lu22/c$a;", "Leo0/g0;", "messageId", "Lo02/a$a;", "result", "Lkotlin/Function1;", "Loq/i0;", "onEditDraftAction", "Lu22/a$d;", "fromAction", "y9", "(Ljava/lang/String;Lo02/a$a;Ler/l;Lu22/a$d;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "Ltq/e;", "onCreateDraftAction", "retryAction", "x9", "(Lo02/a$a;Ler/p;Lu22/a;Ltq/e;)Ljava/lang/Object;", "Lo02/a$b;", "G9", "(Lo02/a$b;Ltq/e;)Ljava/lang/Object;", "F9", "(Lo02/a$a;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ldx/i;", "Ldx/b;", "Lo02/a;", "z9", "()Ldx/i;", "Leo0/y0;", "serviceType", "I9", "(Leo0/y0;Ltq/e;)Ljava/lang/Object;", "error", "Lkotlin/Function0;", "onRetry", "A9", "(Ldx/b;Ler/a;)V", "b", "Lv22/b;", "c", "Lc12/g;", "d", "Lb12/c;", "e", "Lp02/b;", "f", "Lp02/n0;", "g", "Lp02/p0;", "h", "Lp02/f;", "j", "Li70/e;", "k", "Lp02/t;", "l", "Lp02/p;", "m", "Lac4/a;", "n", "Lmx/c;", "p", "Lm22/h;", "q", "Lu22/b;", "initialState", "Lxw/b;", "Lu22/a$g;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<u22.b, u22.a> implements u22.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v22.b messageSummaryMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c12.g dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b12.c electronicDeliveryErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p02.b createEdorDraftUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n0 sendEdorMessageUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0 sendEpuapMessageUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p02.f editEdorDraftUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i70.e snackBarManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p02.t getMessageSummaryWizardResultUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p02.p getEdeliveryDraftMessageRequestUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final m22.h setupData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final u22.b initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<u22.a.g> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<u22.b, u22.a> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<u22.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f194581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f194582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f194583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f194584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f194585h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f194586j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f194587k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f194588l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f194590n;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f194588l = obj;
            this.f194590n |= PKIFailureInfo.systemUnavail;
            return q.this.x9(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f194591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f194592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f194593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f194594g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f194595h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f194597k;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f194595h = obj;
            this.f194597k |= PKIFailureInfo.systemUnavail;
            return q.this.y9(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f194598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f194599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f194600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f194601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f194602h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f194603j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f194604k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f194606m;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f194604k = obj;
            this.f194606m |= PKIFailureInfo.systemUnavail;
            return q.this.F9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f194607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f194608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f194609f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f194610g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f194611h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f194612j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f194614l;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f194612j = obj;
            this.f194614l |= PKIFailureInfo.systemUnavail;
            return q.this.G9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<u22.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f194615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f194616b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f194617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f194618b;

            /* JADX INFO: renamed from: u22.q$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5069a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f194619d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f194620e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f194621f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f194623h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f194624j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f194625k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f194626l;

                public C5069a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f194619d = obj;
                    this.f194620e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f194617a = hVar;
                this.f194618b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5069a c5069a;
                if (eVar instanceof C5069a) {
                    c5069a = (C5069a) eVar;
                    int i15 = c5069a.f194620e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5069a.f194620e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5069a = new C5069a(eVar);
                    }
                } else {
                    c5069a = new C5069a(eVar);
                }
                Object obj2 = c5069a.f194619d;
                Object objE = uq.b.e();
                int i16 = c5069a.f194620e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f194617a;
                    u22.c.a aVarE9 = this.f194618b.E9((u22.b) obj);
                    c5069a.f194621f = vq.j.a(obj);
                    c5069a.f194623h = vq.j.a(c5069a);
                    c5069a.f194624j = vq.j.a(obj);
                    c5069a.f194625k = vq.j.a(hVar);
                    c5069a.f194626l = 0;
                    c5069a.f194620e = 1;
                    if (hVar.F(aVarE9, c5069a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public e(mu.g gVar, q qVar) {
            this.f194615a = gVar;
            this.f194616b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super u22.c.a> hVar, tq.e eVar) {
            Object objA = this.f194615a.a(new a(hVar, this.f194616b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu22/a$d;", "action", "Lu22/b$a$a;", "state", "Loq/i0;", "<anonymous>", "(Lu22/a$d;Lu22/b$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<u22.a.EditDraft, u22.b.a.Edor, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194628f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194629g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f194631e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u22.a.EditDraft f194632f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ u22.b.a.Edor f194633g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ q f194634h;

            /* JADX INFO: renamed from: u22.q$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class C5070a implements er.l<g0, i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ u22.a.EditDraft f194635a;

                C5070a(u22.a.EditDraft editDraft) {
                    this.f194635a = editDraft;
                }

                @Override // er.l
                public /* bridge */ /* synthetic */ i0 b(g0 g0Var) {
                    c(g0Var.getValue());
                    return i0.f148189a;
                }

                public final void c(String str) {
                    this.f194635a.b().b(g0.a(str));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u22.a.EditDraft editDraft, u22.b.a.Edor edor, q qVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f194632f = editDraft;
                this.f194633g = edor;
                this.f194634h = qVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f194631e;
                if (i15 == 0) {
                    u.b(obj);
                    String messageId = this.f194632f.getMessageId();
                    o02.a.Edor messageWizardResult = this.f194633g.getMessageWizardResult();
                    q qVar = this.f194634h;
                    C5070a c5070a = new C5070a(this.f194632f);
                    u22.a.EditDraft editDraft = this.f194632f;
                    this.f194631e = 1;
                    if (qVar.y9(messageId, messageWizardResult, c5070a, editDraft, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f194632f, this.f194633g, this.f194634h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u22.a.EditDraft editDraft = (u22.a.EditDraft) this.f194628f;
            u22.b.a.Edor edor = (u22.b.a.Edor) this.f194629g;
            Object objE = uq.b.e();
            int i15 = this.f194627e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = q.this.callActionWithLoaderUC;
                a aVar2 = new a(editDraft, edor, q.this, null);
                this.f194628f = vq.j.a(editDraft);
                this.f194629g = vq.j.a(edor);
                this.f194627e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.EditDraft editDraft, u22.b.a.Edor edor, tq.e<? super i0> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f194628f = editDraft;
            fVar.f194629g = edor;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu22/a$h;", "<unused var>", "Lu22/b$a$a;", "state", "Loq/i0;", "<anonymous>", "(Lu22/a$h;Lu22/b$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<u22.a.h, u22.b.a.Edor, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194637f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f194639e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u22.b.a.Edor f194640f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ q f194641g;

            /* JADX INFO: renamed from: u22.q$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class C5071a implements er.l<g0, i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ q f194642a;

                C5071a(q qVar) {
                    this.f194642a = qVar;
                }

                @Override // er.l
                public /* bridge */ /* synthetic */ i0 b(g0 g0Var) {
                    c(g0Var.getValue());
                    return i0.f148189a;
                }

                public final void c(String str) {
                    this.f194642a.d9(new u22.a.SendEdorMessage(str, null));
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leo0/g0;", "messageId", "Loq/i0;", "<anonymous>", "(Leo0/g0;)V"}, k = 3, mv = {2, 2, 0})
            static final class b extends vq.k implements er.p<g0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f194643e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                /* synthetic */ Object f194644f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ q f194645g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(q qVar, tq.e<? super b> eVar) {
                    super(2, eVar);
                    this.f194645g = qVar;
                }

                @Override // er.p
                public /* bridge */ /* synthetic */ Object B(g0 g0Var, tq.e<? super i0> eVar) {
                    return M(g0Var.getValue(), eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    String str = (String) this.f194644f;
                    uq.b.e();
                    if (this.f194643e != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    this.f194645g.d9(new u22.a.SendEdorMessage(str, null));
                    return i0.f148189a;
                }

                public final Object M(String str, tq.e<? super i0> eVar) {
                    return ((b) v(g0.a(str), eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    b bVar = new b(this.f194645g, eVar);
                    bVar.f194644f = ((g0) obj).getValue();
                    return bVar;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u22.b.a.Edor edor, q qVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f194640f = edor;
                this.f194641g = qVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f194639e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                String messageId = this.f194640f.getMessageWizardResult().getMessageForm().getMessageId();
                if (messageId != null) {
                    q qVar = this.f194641g;
                    qVar.d9(new u22.a.EditDraft(messageId, new C5071a(qVar), null));
                } else {
                    this.f194641g.d9(new u22.a.CreateDraft(new b(this.f194641g, null)));
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f194640f, this.f194641g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u22.b.a.Edor edor = (u22.b.a.Edor) this.f194637f;
            Object objE = uq.b.e();
            int i15 = this.f194636e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = q.this.callActionWithLoaderUC;
                a aVar2 = new a(edor, q.this, null);
                this.f194637f = vq.j.a(edor);
                this.f194636e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.h hVar, u22.b.a.Edor edor, tq.e<? super i0> eVar) {
            g gVar = q.this.new g(eVar);
            gVar.f194637f = edor;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu22/a$c;", "action", "Lu22/b$a$a;", "state", "Loq/i0;", "<anonymous>", "(Lu22/a$c;Lu22/b$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<u22.a.CreateDraft, u22.b.a.Edor, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194647f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194648g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f194650e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f194651f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ u22.b.a.Edor f194652g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ u22.a.CreateDraft f194653h;

            /* JADX INFO: renamed from: u22.q$h$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leo0/g0;", "messageId", "Loq/i0;", "<anonymous>", "(Leo0/g0;)V"}, k = 3, mv = {2, 2, 0})
            static final class C5072a extends vq.k implements er.p<g0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f194654e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                /* synthetic */ Object f194655f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ u22.a.CreateDraft f194656g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C5072a(u22.a.CreateDraft createDraft, tq.e<? super C5072a> eVar) {
                    super(2, eVar);
                    this.f194656g = createDraft;
                }

                @Override // er.p
                public /* bridge */ /* synthetic */ Object B(g0 g0Var, tq.e<? super i0> eVar) {
                    return M(g0Var.getValue(), eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    String str = (String) this.f194655f;
                    Object objE = uq.b.e();
                    int i15 = this.f194654e;
                    if (i15 == 0) {
                        u.b(obj);
                        er.p<g0, tq.e<? super i0>, Object> pVarA = this.f194656g.a();
                        g0 g0VarA = g0.a(str);
                        this.f194655f = vq.j.a(str);
                        this.f194654e = 1;
                        if (pVarA.B(g0VarA, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                    }
                    return i0.f148189a;
                }

                public final Object M(String str, tq.e<? super i0> eVar) {
                    return ((C5072a) v(g0.a(str), eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    C5072a c5072a = new C5072a(this.f194656g, eVar);
                    c5072a.f194655f = ((g0) obj).getValue();
                    return c5072a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, u22.b.a.Edor edor, u22.a.CreateDraft createDraft, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f194651f = qVar;
                this.f194652g = edor;
                this.f194653h = createDraft;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f194650e;
                if (i15 == 0) {
                    u.b(obj);
                    q qVar = this.f194651f;
                    o02.a.Edor messageWizardResult = this.f194652g.getMessageWizardResult();
                    C5072a c5072a = new C5072a(this.f194653h, null);
                    u22.a.CreateDraft createDraft = this.f194653h;
                    this.f194650e = 1;
                    if (qVar.x9(messageWizardResult, c5072a, createDraft, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f194651f, this.f194652g, this.f194653h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u22.a.CreateDraft createDraft = (u22.a.CreateDraft) this.f194647f;
            u22.b.a.Edor edor = (u22.b.a.Edor) this.f194648g;
            Object objE = uq.b.e();
            int i15 = this.f194646e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = q.this.callActionWithLoaderUC;
                a aVar2 = new a(q.this, edor, createDraft, null);
                this.f194647f = vq.j.a(createDraft);
                this.f194648g = vq.j.a(edor);
                this.f194646e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.CreateDraft createDraft, u22.b.a.Edor edor, tq.e<? super i0> eVar) {
            h hVar = q.this.new h(eVar);
            hVar.f194647f = createDraft;
            hVar.f194648g = edor;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu22/a$j;", "action", "Lu22/b$a$a;", "state", "Loq/i0;", "<anonymous>", "(Lu22/a$j;Lu22/b$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<u22.a.SendEdorMessage, u22.b.a.Edor, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194658f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f194659g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f194661e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f194662f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ u22.b.a.Edor f194663g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ u22.a.SendEdorMessage f194664h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, u22.b.a.Edor edor, u22.a.SendEdorMessage sendEdorMessage, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f194662f = qVar;
                this.f194663g = edor;
                this.f194664h = sendEdorMessage;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f194661e;
                if (i15 == 0) {
                    u.b(obj);
                    q qVar = this.f194662f;
                    o02.a.Edor messageWizardResult = this.f194663g.getMessageWizardResult();
                    String messageId = this.f194664h.getMessageId();
                    this.f194661e = 1;
                    if (qVar.F9(messageWizardResult, messageId, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f194662f, this.f194663g, this.f194664h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u22.a.SendEdorMessage sendEdorMessage = (u22.a.SendEdorMessage) this.f194658f;
            u22.b.a.Edor edor = (u22.b.a.Edor) this.f194659g;
            Object objE = uq.b.e();
            int i15 = this.f194657e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = q.this.callActionWithLoaderUC;
                a aVar2 = new a(q.this, edor, sendEdorMessage, null);
                this.f194658f = vq.j.a(sendEdorMessage);
                this.f194659g = vq.j.a(edor);
                this.f194657e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.SendEdorMessage sendEdorMessage, u22.b.a.Edor edor, tq.e<? super i0> eVar) {
            i iVar = q.this.new i(eVar);
            iVar.f194658f = sendEdorMessage;
            iVar.f194659g = edor;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu22/a$m;", "<unused var>", "Lu22/b$a$a;", "Loq/i0;", "<anonymous>", "(Lu22/a$m;Lu22/b$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<u22.a.m, u22.b.a.Edor, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194665e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f194665e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            q.this.snackBarManager.y(new p50.a.DefaultWithIcon(q.this.labelProvider.c(e02.a.f46537g4), false, null, null, 14, null));
            i0 i0Var = i0.f148189a;
            q.this.d9(u22.a.b.f194521a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.m mVar, u22.b.a.Edor edor, tq.e<? super i0> eVar) {
            return q.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu22/a$i;", "<unused var>", "Lu22/b$a$a;", "state", "Loq/i0;", "<anonymous>", "(Lu22/a$i;Lu22/b$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<u22.a.i, u22.b.a.Edor, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194668f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f194670e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u22.b.a.Edor f194671f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ q f194672g;

            /* JADX INFO: renamed from: u22.q$k$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class C5073a implements er.l<g0, i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ q f194673a;

                C5073a(q qVar) {
                    this.f194673a = qVar;
                }

                @Override // er.l
                public /* bridge */ /* synthetic */ i0 b(g0 g0Var) {
                    c(g0Var.getValue());
                    return i0.f148189a;
                }

                public final void c(String str) {
                    this.f194673a.d9(u22.a.m.f194538a);
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leo0/g0;", "messageId", "Loq/i0;", "<anonymous>", "(Leo0/g0;)V"}, k = 3, mv = {2, 2, 0})
            static final class b extends vq.k implements er.p<g0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f194674e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                /* synthetic */ Object f194675f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ q f194676g;

                /* JADX INFO: renamed from: u22.q$k$a$b$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                static final class C5074a implements er.l<g0, i0> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ q f194677a;

                    C5074a(q qVar) {
                        this.f194677a = qVar;
                    }

                    @Override // er.l
                    public /* bridge */ /* synthetic */ i0 b(g0 g0Var) {
                        c(g0Var.getValue());
                        return i0.f148189a;
                    }

                    public final void c(String str) {
                        this.f194677a.d9(u22.a.m.f194538a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(q qVar, tq.e<? super b> eVar) {
                    super(2, eVar);
                    this.f194676g = qVar;
                }

                @Override // er.p
                public /* bridge */ /* synthetic */ Object B(g0 g0Var, tq.e<? super i0> eVar) {
                    return M(g0Var.getValue(), eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    String str = (String) this.f194675f;
                    uq.b.e();
                    if (this.f194674e != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    this.f194676g.d9(new u22.a.EditDraft(str, new C5074a(this.f194676g), null));
                    return i0.f148189a;
                }

                public final Object M(String str, tq.e<? super i0> eVar) {
                    return ((b) v(g0.a(str), eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    b bVar = new b(this.f194676g, eVar);
                    bVar.f194675f = ((g0) obj).getValue();
                    return bVar;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u22.b.a.Edor edor, q qVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f194671f = edor;
                this.f194672g = qVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f194670e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                String messageId = this.f194671f.getMessageWizardResult().getMessageForm().getMessageId();
                if (messageId != null) {
                    q qVar = this.f194672g;
                    qVar.d9(new u22.a.EditDraft(messageId, new C5073a(qVar), null));
                } else {
                    this.f194672g.d9(new u22.a.CreateDraft(new b(this.f194672g, null)));
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f194671f, this.f194672g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u22.b.a.Edor edor = (u22.b.a.Edor) this.f194668f;
            Object objE = uq.b.e();
            int i15 = this.f194667e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = q.this.callActionWithLoaderUC;
                a aVar2 = new a(edor, q.this, null);
                this.f194668f = vq.j.a(edor);
                this.f194667e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.i iVar, u22.b.a.Edor edor, tq.e<? super i0> eVar) {
            k kVar = q.this.new k(eVar);
            kVar.f194668f = edor;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu22/a$h;", "<unused var>", "Lu22/b$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lu22/a$h;Lu22/b$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<u22.a.h, u22.b.a.Epuap, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194679f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u22.b.a.Epuap epuap = (u22.b.a.Epuap) this.f194679f;
            uq.b.e();
            if (this.f194678e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            q.this.d9(new u22.a.SendEpuapMessage(epuap.getMessageWizardResult()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.h hVar, u22.b.a.Epuap epuap, tq.e<? super i0> eVar) {
            l lVar = q.this.new l(eVar);
            lVar.f194679f = epuap;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu22/a$k;", "action", "Lu22/b$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lu22/a$k;Lu22/b$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<u22.a.SendEpuapMessage, u22.b.a.Epuap, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194682f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f194684e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f194685f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ u22.a.SendEpuapMessage f194686g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, u22.a.SendEpuapMessage sendEpuapMessage, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f194685f = qVar;
                this.f194686g = sendEpuapMessage;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f194684e;
                if (i15 == 0) {
                    u.b(obj);
                    q qVar = this.f194685f;
                    o02.a.Epuap result = this.f194686g.getResult();
                    this.f194684e = 1;
                    if (qVar.G9(result, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f194685f, this.f194686g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u22.a.SendEpuapMessage sendEpuapMessage = (u22.a.SendEpuapMessage) this.f194682f;
            Object objE = uq.b.e();
            int i15 = this.f194681e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = q.this.callActionWithLoaderUC;
                a aVar2 = new a(q.this, sendEpuapMessage, null);
                this.f194682f = vq.j.a(sendEpuapMessage);
                this.f194681e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.SendEpuapMessage sendEpuapMessage, u22.b.a.Epuap epuap, tq.e<? super i0> eVar) {
            m mVar = q.this.new m(eVar);
            mVar.f194682f = sendEpuapMessage;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu22/a$a;", "<unused var>", "Lu22/b;", "Loq/i0;", "<anonymous>", "(Lu22/a$a;Lu22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<u22.a.C5062a, u22.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194687e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f194687e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<u22.a.g> bVarY1 = q.this.Y1();
                u22.a.g.C5063a c5063a = u22.a.g.C5063a.f194527a;
                this.f194687e = 1;
                if (bVarY1.F(c5063a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.C5062a c5062a, u22.b bVar, tq.e<? super i0> eVar) {
            return q.this.new n(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu22/a$e;", "action", "Lu22/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lu22/a$e;Lu22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<u22.a.Error, u22.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194690f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u22.a.Error error = (u22.a.Error) this.f194690f;
            Object objE = uq.b.e();
            int i15 = this.f194689e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<u22.a.g> bVarY1 = q.this.Y1();
                u22.a.g.Error error2 = new u22.a.g.Error(error.getErrorData());
                this.f194690f = vq.j.a(error);
                this.f194689e = 1;
                if (bVarY1.F(error2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.Error error, u22.b bVar, tq.e<? super i0> eVar) {
            o oVar = q.this.new o(eVar);
            oVar.f194690f = error;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu22/a$l;", "<unused var>", "Lu22/b;", "state", "Loq/i0;", "<anonymous>", "(Lu22/a$l;Lu22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<u22.a.l, u22.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194693f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y0 y0Var;
            u22.b bVar = (u22.b) this.f194693f;
            Object objE = uq.b.e();
            int i15 = this.f194692e;
            if (i15 == 0) {
                u.b(obj);
                q qVar = q.this;
                if (bVar instanceof u22.b.a.Edor) {
                    y0Var = y0.E_DELIVERY;
                } else if (bVar instanceof u22.b.a.Epuap) {
                    y0Var = y0.E_PUAP;
                } else {
                    if (!fr.t.c(bVar, u22.b.C5066b.f194542a)) {
                        throw new oq.p();
                    }
                    y0Var = y0.UNKNOWN;
                }
                this.f194693f = vq.j.a(bVar);
                this.f194692e = 1;
                if (qVar.I9(y0Var, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.l lVar, u22.b bVar, tq.e<? super i0> eVar) {
            p pVar = q.this.new p(eVar);
            pVar.f194693f = bVar;
            return pVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: u22.q$q, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu22/a$b;", "<unused var>", "Lu22/b;", "Loq/i0;", "<anonymous>", "(Lu22/a$b;Lu22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C5075q extends vq.k implements er.q<u22.a.b, u22.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194695e;

        C5075q(tq.e<? super C5075q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f194695e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<u22.a.g> bVarY1 = q.this.Y1();
                u22.a.g.b bVar = u22.a.g.b.f194528a;
                this.f194695e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.b bVar, u22.b bVar2, tq.e<? super i0> eVar) {
            return q.this.new C5075q(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu22/a$f;", "action", "Lu22/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lu22/a$f;Lu22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<u22.a.GoToAuthorization, u22.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f194698f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u22.a.GoToAuthorization goToAuthorization = (u22.a.GoToAuthorization) this.f194698f;
            Object objE = uq.b.e();
            int i15 = this.f194697e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<u22.a.g> bVarY1 = q.this.Y1();
                u22.a.g.GoToAuthorization goToAuthorization2 = new u22.a.g.GoToAuthorization(goToAuthorization.getOAuthWebViewData());
                this.f194698f = vq.j.a(goToAuthorization);
                this.f194697e = 1;
                if (bVarY1.F(goToAuthorization2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(u22.a.GoToAuthorization goToAuthorization, u22.b bVar, tq.e<? super i0> eVar) {
            r rVar = q.this.new r(eVar);
            rVar.f194698f = goToAuthorization;
            return rVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, v22.b bVar, c12.g gVar, b12.c cVar, p02.b bVar2, n0 n0Var, p0 p0Var, p02.f fVar, i70.e eVar, p02.t tVar, p02.p pVar, ac4.a aVar2, mx.c cVar2, m22.h hVar) {
        u22.b epuap;
        u22.b bVar3;
        this.messageSummaryMapper = bVar;
        this.dialogMapper = gVar;
        this.electronicDeliveryErrorMapper = cVar;
        this.createEdorDraftUC = bVar2;
        this.sendEdorMessageUC = n0Var;
        this.sendEpuapMessageUC = p0Var;
        this.editEdorDraftUC = fVar;
        this.snackBarManager = eVar;
        this.getMessageSummaryWizardResultUC = tVar;
        this.getEdeliveryDraftMessageRequestUC = pVar;
        this.callActionWithLoaderUC = aVar2;
        this.labelProvider = cVar2;
        this.setupData = hVar;
        dx.i<dx.b, o02.a> iVarZ9 = z9();
        if (iVarZ9 instanceof dx.i.Left) {
            bVar3 = u22.b.C5066b.f194542a;
        } else {
            if (!(iVarZ9 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            o02.a aVar3 = (o02.a) ((dx.i.Right) iVarZ9).b();
            if (aVar3 instanceof o02.a.Edor) {
                epuap = new u22.b.a.Edor((o02.a.Edor) aVar3);
            } else {
                if (!(aVar3 instanceof o02.a.Epuap)) {
                    throw new oq.p();
                }
                epuap = new u22.b.a.Epuap((o02.a.Epuap) aVar3);
            }
            bVar3 = epuap;
        }
        this.initialState = bVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar3, new er.l() { // from class: u22.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.J9(this.f194563a, (v) obj);
            }
        });
        this.state = a9(new e(e9().getState(), this), E9(bVar3));
    }

    private final void A9(dx.b error, final er.a<i0> onRetry) {
        this.electronicDeliveryErrorMapper.c(new b12.c.Params(error, b9(new u22.a.GoToAuthorization(new OAuthWebViewData(new er.a() { // from class: u22.m
            @Override // er.a
            public final Object a() {
                return q.B9(onRetry);
            }
        }))), new er.a() { // from class: u22.n
            @Override // er.a
            public final Object a() {
                return q.C9();
            }
        }, onRetry, new er.l() { // from class: u22.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.D9(this.f194562a, (jb4.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(er.a aVar) {
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(q qVar, jb4.b bVar) {
        qVar.d9(new u22.a.Error(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u22.c.a E9(u22.b state) {
        return this.messageSummaryMapper.b(new v22.b.Params(state, b9(u22.a.h.f194533a), b9(u22.a.C5062a.f194520a), b9(u22.a.l.f194537a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        if (r3.F(r5, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F9(o02.a.Edor r9, java.lang.String r10, tq.e<? super oq.i0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u22.q.F9(o02.a$a, java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r4.F(r5, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G9(o02.a.Epuap r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof u22.q.d
            if (r0 == 0) goto L13
            r0 = r8
            u22.q$d r0 = (u22.q.d) r0
            int r1 = r0.f194614l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f194614l = r1
            goto L18
        L13:
            u22.q$d r0 = new u22.q$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f194612j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f194614l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.f194609f
            oq.i0 r7 = (oq.i0) r7
            java.lang.Object r7 = r0.f194608e
            dx.i r7 = (dx.i) r7
            java.lang.Object r7 = r0.f194607d
            o02.a$b r7 = (o02.a.Epuap) r7
            oq.u.b(r8)
            goto Lac
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.Object r7 = r0.f194607d
            o02.a$b r7 = (o02.a.Epuap) r7
            oq.u.b(r8)
            goto L5e
        L49:
            oq.u.b(r8)
            p02.p0 r8 = r6.sendEpuapMessageUC
            p02.p0$a r2 = new p02.p0$a
            r2.<init>(r7)
            r0.f194607d = r7
            r0.f194614l = r4
            java.lang.Object r8 = r8.e(r2, r0)
            if (r8 != r1) goto L5e
            goto Lab
        L5e:
            dx.i r8 = (dx.i) r8
            boolean r2 = r8 instanceof dx.i.Left
            if (r2 == 0) goto L79
            dx.i$b r8 = (dx.i.Left) r8
            java.lang.Object r8 = r8.b()
            dx.b r8 = (dx.b) r8
            u22.a$k r0 = new u22.a$k
            r0.<init>(r7)
            er.a r7 = r6.b9(r0)
            r6.A9(r8, r7)
            goto Lac
        L79:
            boolean r2 = r8 instanceof dx.i.Right
            if (r2 == 0) goto Laf
            r2 = r8
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            oq.i0 r2 = (oq.i0) r2
            xw.b r4 = r6.Y1()
            u22.a$g$f r5 = u22.a.g.f.f194532a
            java.lang.Object r7 = vq.j.a(r7)
            r0.f194607d = r7
            java.lang.Object r7 = vq.j.a(r8)
            r0.f194608e = r7
            java.lang.Object r7 = vq.j.a(r2)
            r0.f194609f = r7
            r7 = 0
            r0.f194610g = r7
            r0.f194611h = r7
            r0.f194614l = r3
            java.lang.Object r7 = r4.F(r5, r0)
            if (r7 != r1) goto Lac
        Lab:
            return r1
        Lac:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        Laf:
            oq.p r7 = new oq.p
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u22.q.G9(o02.a$b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I9(y0 y0Var, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new u22.a.g.ShowDialog(this.dialogMapper.b(new c12.g.Params(b9(u22.a.b.f194521a), y0Var, b9(u22.a.i.f194534a)))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(final q qVar, v vVar) {
        vVar.c(q0.c(u22.b.a.Edor.class), new er.l() { // from class: u22.j
            @Override // er.l
            public final Object b(Object obj) {
                return q.K9(this.f194558a, (z) obj);
            }
        });
        vVar.c(q0.c(u22.b.a.Epuap.class), new er.l() { // from class: u22.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.L9(this.f194559a, (z) obj);
            }
        });
        vVar.c(q0.c(u22.b.class), new er.l() { // from class: u22.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.M9(this.f194560a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(q qVar, z zVar) {
        f fVar = qVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(u22.a.EditDraft.class), oVar, fVar);
        zVar.x(q0.c(u22.a.h.class), oVar, qVar.new g(null));
        zVar.x(q0.c(u22.a.CreateDraft.class), oVar, qVar.new h(null));
        zVar.x(q0.c(u22.a.SendEdorMessage.class), oVar, qVar.new i(null));
        zVar.x(q0.c(u22.a.m.class), oVar, qVar.new j(null));
        zVar.x(q0.c(u22.a.i.class), oVar, qVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(q qVar, z zVar) {
        l lVar = qVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(u22.a.h.class), oVar, lVar);
        zVar.x(q0.c(u22.a.SendEpuapMessage.class), oVar, qVar.new m(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(q qVar, z zVar) {
        n nVar = qVar.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(u22.a.C5062a.class), oVar, nVar);
        zVar.x(q0.c(u22.a.Error.class), oVar, qVar.new o(null));
        zVar.x(q0.c(u22.a.l.class), oVar, qVar.new p(null));
        zVar.x(q0.c(u22.a.b.class), oVar, qVar.new C5075q(null));
        zVar.x(q0.c(u22.a.GoToAuthorization.class), oVar, qVar.new r(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00eb, code lost:
    
        if (r12.B(r4, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x9(o02.a.Edor r11, er.p<? super eo0.g0, ? super tq.e<? super oq.i0>, ? extends java.lang.Object> r12, u22.a r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u22.q.x9(o02.a$a, er.p, u22.a, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y9(String str, o02.a.Edor edor, er.l<? super g0, i0> lVar, u22.a.EditDraft editDraft, tq.e<? super i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f194597k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f194597k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objE = bVar.f194595h;
        Object objE2 = uq.b.e();
        int i16 = bVar.f194597k;
        if (i16 == 0) {
            u.b(objE);
            p02.f fVar = this.editEdorDraftUC;
            p02.p pVar = this.getEdeliveryDraftMessageRequestUC;
            o02.c messageForm = edor.getMessageForm();
            p02.f.Params params = new p02.f.Params(str, pVar.c(new p02.p.Params(edor.getStart(), edor.getAddRecipients().a(), messageForm)), null);
            bVar.f194591d = str;
            bVar.f194592e = vq.j.a(edor);
            bVar.f194593f = lVar;
            bVar.f194594g = editDraft;
            bVar.f194597k = 1;
            objE = fVar.e(params, bVar);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            editDraft = (u22.a.EditDraft) bVar.f194594g;
            lVar = (er.l) bVar.f194593f;
            str = (String) bVar.f194591d;
            u.b(objE);
        }
        dx.i iVar = (dx.i) objE;
        if (iVar instanceof dx.i.Left) {
            A9((dx.b) ((dx.i.Left) iVar).b(), b9(editDraft));
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            ((g0) ((dx.i.Right) iVar).b()).getValue();
            lVar.b(g0.a(str));
        }
        return i0.f148189a;
    }

    private final dx.i<dx.b, o02.a> z9() {
        return this.getMessageSummaryWizardResultUC.b(new p02.t.Params(this.setupData));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(m22.h hVar) {
        super.P5(hVar);
    }

    @Override // zx.b
    public xw.b<u22.a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<u22.b, u22.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<u22.c.a> getState() {
        return this.state;
    }
}
