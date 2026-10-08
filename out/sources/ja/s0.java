package ja;

import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u00011B#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJX\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH¦@¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010\"\u001a\u00020\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@¢\u0006\u0004\b\"\u0010#J\u001c\u0010%\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010$\u001a\u00020\fH\u0087\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0016¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0016¢\u0006\u0004\b,\u0010+J\u001b\u0010/\u001a\u00020\u00162\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160-¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00028\u0000098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160-0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000f0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001f\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T0S8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00160Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lja/s0;", "", "T", "Ltq/i;", "mainContext", "Lja/n0;", "cachedPagingData", "<init>", "(Ltq/i;Lja/n0;)V", "", "Lja/m1;", "pages", "", "placeholdersBefore", "placeholdersAfter", "", "dispatchLoadStates", "Lja/x;", "sourceLoadStates", "mediatorLoadStates", "Lja/t;", "newHintReceiver", "Loq/i0;", "r", "(Ljava/util/List;IIZLja/x;Lja/x;Lja/t;Ltq/e;)Ljava/lang/Object;", "Lja/n1;", "receiver", "v", "(Lja/n1;)V", "Lja/q0;", "event", "s", "(Lja/q0;Ltq/e;)Ljava/lang/Object;", "pagingData", "o", "(Lja/n0;Ltq/e;)Ljava/lang/Object;", "index", "p", "(I)Ljava/lang/Object;", "Lja/v;", "w", "()Lja/v;", "u", "()V", "t", "Lkotlin/Function0;", "listener", "n", "(Ler/a;)V", "a", "Ltq/i;", "b", "Lja/t;", "hintReceiver", "c", "Lja/n1;", "uiReceiver", "Lja/k0;", "d", "Lja/k0;", "pageStore", "Lja/d0;", "e", "Lja/d0;", "combinedLoadStatesCollection", "Lla/a;", "f", "Lla/a;", "onPagesUpdatedListeners", "Lja/j1;", "g", "Lja/j1;", "collectFromRunner", "h", "Z", "lastAccessedIndexUnfulfilled", "i", "I", "lastAccessedIndex", "Lmu/b0;", "j", "Lmu/b0;", "inGetItem", "Lmu/p0;", "Lja/i;", "k", "Lmu/p0;", "q", "()Lmu/p0;", "loadStateFlow", "Lmu/a0;", "l", "Lmu/a0;", "_onPagesUpdatedFlow", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class s0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tq.i mainContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private t hintReceiver;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private n1 uiReceiver = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private k0<T> pageStore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d0 combinedLoadStatesCollection;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final la.a<er.a<oq.i0>> onPagesUpdatedListeners;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j1 collectFromRunner;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private volatile boolean lastAccessedIndexUnfulfilled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private volatile int lastAccessedIndex;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<Boolean> inGetItem;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<CombinedLoadStates> loadStateFlow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mu.a0<oq.i0> _onPagesUpdatedFlow;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lja/s0$a;", "Lja/n1;", "<init>", "()V", "Loq/i0;", "a", "b", "", "Z", "d", "()Z", "setShouldRetry", "(Z)V", "shouldRetry", "c", "setShouldRefresh", "shouldRefresh", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a implements n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean shouldRetry;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean shouldRefresh;

        @Override // ja.n1
        public void a() {
            this.shouldRetry = true;
        }

        @Override // ja.n1
        public void b() {
            this.shouldRefresh = true;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShouldRefresh() {
            return this.shouldRefresh;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShouldRetry() {
            return this.shouldRetry;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ s0<T> f101165f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ n0<T> f101166g;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ s0<T> f101167a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n0<T> f101168b;

            /* JADX INFO: renamed from: ja.s0$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
            static final class C2390a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f101169e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ f0<T> f101170f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ s0<T> f101171g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ n0<T> f101172h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2390a(f0<T> f0Var, s0<T> s0Var, n0<T> n0Var, tq.e<? super C2390a> eVar) {
                    super(2, eVar);
                    this.f101170f = f0Var;
                    this.f101171g = s0Var;
                    this.f101172h = n0Var;
                }

                /* JADX WARN: Code duplicated, block: B:102:0x02a1  */
                /* JADX WARN: Code duplicated, block: B:105:0x02b1 A[LOOP:0: B:103:0x02ab->B:105:0x02b1, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:37:0x0105 A[PHI: r9
                  0x0105: PHI (r9v4 ja.s0$b$a$a) = (r9v0 ja.s0$b$a$a), (r9v0 ja.s0$b$a$a), (r9v5 ja.s0$b$a$a) binds: [B:33:0x00f8, B:35:0x0101, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:89:0x0243 A[PHI: r9
                  0x0243: PHI (r9v8 ja.s0$b$a$a) = (r9v0 ja.s0$b$a$a), (r9v0 ja.s0$b$a$a), (r9v9 ja.s0$b$a$a) binds: [B:85:0x0237, B:87:0x0240, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:98:0x0299  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
                
                    if (r14 == r0) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
                
                    if (r1.r(r2, r3, r4, true, r6, r7, r8, r9) == r0) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x0118, code lost:
                
                    if (r14.s(r1, r13) == r0) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:0x0256, code lost:
                
                    if (r14.s(r1, r13) == r0) goto L91;
                 */
                @Override // vq.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 720
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ja.s0.b.a.C2390a.J(java.lang.Object):java.lang.Object");
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                    return ((C2390a) v(p0Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    return new C2390a(this.f101170f, this.f101171g, this.f101172h, eVar);
                }
            }

            a(s0<T> s0Var, n0<T> n0Var) {
                this.f101167a = s0Var;
                this.f101168b = n0Var;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(f0<T> f0Var, tq.e<? super oq.i0> eVar) {
                v0 v0Var = v0.f101202a;
                if (v0Var.a(2)) {
                    v0Var.b(2, "Collected " + f0Var, null);
                }
                Object objG = ju.i.g(((s0) this.f101167a).mainContext, new C2390a(f0Var, this.f101167a, this.f101168b, null), eVar);
                return objG == uq.b.e() ? objG : oq.i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s0<T> s0Var, n0<T> n0Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f101165f = s0Var;
            this.f101166g = n0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f101164e;
            if (i15 == 0) {
                oq.u.b(obj);
                this.f101165f.v(this.f101166g.getUiReceiver());
                mu.g<f0<T>> gVarD = this.f101166g.d();
                a aVar = new a(this.f101165f, this.f101166g);
                this.f101164e = 1;
                if (gVarD.a(aVar, this) == objE) {
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
            return new b(this.f101165f, this.f101166g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f101173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f101174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f101175f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f101176g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f101177h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f101178j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f101179k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f101180l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f101181m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f101182n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f101183p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ s0<T> f101184q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f101185r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(s0<T> s0Var, tq.e<? super c> eVar) {
            super(eVar);
            this.f101184q = s0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f101183p = obj;
            this.f101185r |= PKIFailureInfo.systemUnavail;
            return this.f101184q.r(null, 0, 0, false, null, null, null, this);
        }
    }

    public s0(tq.i iVar, n0<T> n0Var) {
        f0.b<T> bVarC;
        this.mainContext = iVar;
        this.pageStore = k0.INSTANCE.a(n0Var != null ? n0Var.c() : null);
        d0 d0Var = new d0();
        if (n0Var != null && (bVarC = n0Var.c()) != null) {
            d0Var.g(bVarC.getSourceLoadStates(), bVarC.getMediatorLoadStates());
        }
        this.combinedLoadStatesCollection = d0Var;
        this.onPagesUpdatedListeners = new la.a<>();
        this.collectFromRunner = new j1(false, 1, null);
        this.inGetItem = mu.r0.a(Boolean.FALSE);
        this.loadStateFlow = d0Var.f();
        this._onPagesUpdatedFlow = mu.h0.a(0, 64, lu.a.DROP_OLDEST);
        n(new er.a() { // from class: ja.r0
            @Override // er.a
            public final Object a() {
                return s0.b(this.f101149a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b(s0 s0Var) {
        mu.a0<oq.i0> a0Var = s0Var._onPagesUpdatedFlow;
        oq.i0 i0Var = oq.i0.f148189a;
        a0Var.f(i0Var);
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public final Object r(List<TransformablePage<T>> list, int i15, int i16, boolean z15, LoadStates loadStates, LoadStates loadStates2, t tVar, tq.e<? super oq.i0> eVar) throws Throwable {
        c cVar;
        k0<T> k0Var;
        t tVar2;
        List<TransformablePage<T>> list2;
        boolean z16;
        t tVar3;
        k0<T> k0Var2;
        LoadStates loadStates3;
        LoadStates loadStates4;
        t tVar4;
        List<T> listB;
        List<T> listB2;
        int i17 = i15;
        int i18 = i16;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i19 = cVar.f101185r;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f101185r = i19 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(this, eVar);
            }
        } else {
            cVar = new c(this, eVar);
        }
        Object obj = cVar.f101183p;
        Object objE = uq.b.e();
        int i25 = cVar.f101185r;
        if (i25 == 0) {
            oq.u.b(obj);
            if (z15 && loadStates == null) {
                throw new IllegalArgumentException("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
            }
            this.lastAccessedIndexUnfulfilled = false;
            k0<T> k0Var3 = this.pageStore;
            t tVar5 = this.hintReceiver;
            k0<T> k0Var4 = new k0<>(list, i17, i18);
            k0<T> k0Var5 = this.pageStore;
            this.pageStore = k0Var4;
            this.hintReceiver = tVar;
            try {
                q0<T> eVar2 = new q0.e<>(k0Var4, k0Var5);
                cVar.f101173d = list;
                cVar.f101174e = loadStates;
                cVar.f101175f = loadStates2;
                cVar.f101176g = tVar;
                cVar.f101177h = k0Var3;
                cVar.f101178j = tVar5;
                cVar.f101179k = k0Var4;
                cVar.f101180l = i17;
                cVar.f101181m = i18;
                cVar.f101182n = z15;
                cVar.f101185r = 1;
                if (s(eVar2, cVar) == objE) {
                    return objE;
                }
                list2 = list;
                z16 = z15;
                tVar3 = tVar;
                k0Var = k0Var3;
                k0Var2 = k0Var4;
                loadStates3 = loadStates;
                tVar2 = tVar5;
                loadStates4 = loadStates2;
            } catch (CancellationException e15) {
                e = e15;
                k0Var = k0Var3;
                tVar2 = tVar5;
                this.pageStore = k0Var;
                this.hintReceiver = tVar2;
                throw e;
            }
        } else {
            if (i25 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z16 = cVar.f101182n;
            int i26 = cVar.f101181m;
            int i27 = cVar.f101180l;
            k0Var2 = (k0) cVar.f101179k;
            tVar2 = (t) cVar.f101178j;
            k0Var = (k0) cVar.f101177h;
            tVar3 = (t) cVar.f101176g;
            loadStates4 = (LoadStates) cVar.f101175f;
            loadStates3 = (LoadStates) cVar.f101174e;
            list2 = (List) cVar.f101173d;
            try {
                oq.u.b(obj);
                i18 = i26;
                i17 = i27;
            } catch (CancellationException e16) {
                e = e16;
                this.pageStore = k0Var;
                this.hintReceiver = tVar2;
                throw e;
            }
        }
        v0 v0Var = v0.f101202a;
        if (v0Var.a(3)) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Presenting data (\n                            |   first item: ");
            TransformablePage transformablePage = (TransformablePage) pq.v.n0(list2);
            sb5.append((transformablePage == null || (listB2 = transformablePage.b()) == null) ? null : pq.v.n0(listB2));
            sb5.append("\n                            |   last item: ");
            TransformablePage transformablePage2 = (TransformablePage) pq.v.z0(list2);
            sb5.append((transformablePage2 == null || (listB = transformablePage2.b()) == null) ? null : pq.v.z0(listB));
            sb5.append("\n                            |   placeholdersBefore: ");
            sb5.append(i17);
            sb5.append("\n                            |   placeholdersAfter: ");
            sb5.append(i18);
            sb5.append("\n                            |   hintReceiver: ");
            sb5.append(tVar3);
            sb5.append("\n                            |   sourceLoadStates: ");
            sb5.append(loadStates3);
            sb5.append("\n                        ");
            String string = sb5.toString();
            if (loadStates4 != null) {
                string = string + "|   mediatorLoadStates: " + loadStates4 + '\n';
            }
            v0Var.b(3, fu.r.p(string + "|)", null, 1, null), null);
        }
        if (z16) {
            this.combinedLoadStatesCollection.g(loadStates3, loadStates4);
        }
        if (k0Var2.getSize() == 0 && (tVar4 = this.hintReceiver) != null) {
            tVar4.a(k0Var2.n());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(n1 receiver) {
        n1 n1Var = this.uiReceiver;
        this.uiReceiver = receiver;
        if (n1Var instanceof a) {
            a aVar = (a) n1Var;
            if (aVar.getShouldRetry()) {
                receiver.a();
            }
            if (aVar.getShouldRefresh()) {
                receiver.b();
            }
        }
    }

    public final void n(er.a<oq.i0> listener) {
        this.onPagesUpdatedListeners.add(listener);
    }

    public final Object o(n0<T> n0Var, tq.e<oq.i0> eVar) {
        Object objC = j1.c(this.collectFromRunner, 0, new b(this, n0Var, null), eVar, 1, null);
        return objC == uq.b.e() ? objC : oq.i0.f148189a;
    }

    public final T p(int index) {
        Boolean value;
        Boolean value2;
        mu.b0<Boolean> b0Var = this.inGetItem;
        do {
            value = b0Var.getValue();
            value.getClass();
        } while (!b0Var.s(value, Boolean.TRUE));
        this.lastAccessedIndexUnfulfilled = true;
        this.lastAccessedIndex = index;
        v0 v0Var = v0.f101202a;
        if (v0Var.a(2)) {
            v0Var.b(2, "Accessing item index[" + index + ']', null);
        }
        t tVar = this.hintReceiver;
        if (tVar != null) {
            tVar.a(this.pageStore.e(index));
        }
        T tJ = this.pageStore.j(index);
        mu.b0<Boolean> b0Var2 = this.inGetItem;
        do {
            value2 = b0Var2.getValue();
            value2.getClass();
        } while (!b0Var2.s(value2, Boolean.FALSE));
        return tJ;
    }

    public final mu.p0<CombinedLoadStates> q() {
        return this.loadStateFlow;
    }

    public abstract Object s(q0<T> q0Var, tq.e<oq.i0> eVar);

    public final void t() {
        v0 v0Var = v0.f101202a;
        if (v0Var.a(3)) {
            v0Var.b(3, "Refresh signal received", null);
        }
        this.uiReceiver.b();
    }

    public final void u() {
        v0 v0Var = v0.f101202a;
        if (v0Var.a(3)) {
            v0Var.b(3, "Retry signal received", null);
        }
        this.uiReceiver.a();
    }

    public final v<T> w() {
        return this.pageStore.q();
    }
}
