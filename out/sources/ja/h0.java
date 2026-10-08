package ja;

import java.util.concurrent.atomic.AtomicBoolean;
import ju.d2;
import ju.h2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B{\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\n*\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\"\u0010$\u001a\u00020\n*\b\u0012\u0004\u0012\u00020#0\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b$\u0010%J'\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nH\u0082@¢\u0006\u0004\b*\u0010\u001bJ \u0010-\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020+H\u0082@¢\u0006\u0004\b-\u0010.J7\u00103\u001a\u0002022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u00018\u00002\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u000100H\u0002¢\u0006\u0004\b3\u00104J(\u00106\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001052\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b6\u00107J0\u0010:\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0004\b:\u0010;J9\u0010>\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020#H\u0002¢\u0006\u0004\b>\u0010?R\u001c\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010\\\u001a\u00060Xj\u0002`Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R \u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R \u0010e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR#\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010^0\t8\u0006¢\u0006\f\n\u0004\bj\u0010K\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"Lja/h0;", "", "Key", "Value", "initialKey", "Lja/x0;", "pagingSource", "Lja/m0;", "config", "Lmu/g;", "Loq/i0;", "retryFlow", "Lja/c1;", "remoteMediatorConnection", "Lja/y0;", "previousPagingState", "Lkotlin/Function0;", "jumpCallback", "<init>", "(Ljava/lang/Object;Lja/x0;Lja/m0;Lmu/g;Lja/c1;Lja/y0;Ler/a;)V", "Lja/p1;", "viewportHint", "o", "(Lja/p1;)V", "p", "()V", "r", "(Ltq/e;)Ljava/lang/Object;", "Lja/y;", "loadType", "A", "(Lja/y;Lja/p1;Ltq/e;)Ljava/lang/Object;", "Lju/p0;", ip.a.f96138c, "(Lju/p0;)V", "", "q", "(Lmu/g;Lja/y;Ltq/e;)Ljava/lang/Object;", "key", "Lja/x0$a;", "x", "(Lja/y;Ljava/lang/Object;)Lja/x0$a;", "s", "Lja/o;", "generationalHint", "t", "(Lja/y;Lja/o;Ltq/e;)Ljava/lang/Object;", "loadKey", "Lja/x0$b;", "result", "", "y", "(Lja/y;Ljava/lang/Object;Lja/x0$b;)Ljava/lang/String;", "Lja/j0;", "C", "(Lja/j0;Lja/y;Ltq/e;)Ljava/lang/Object;", "Lja/w$a;", "error", "B", "(Lja/j0;Lja/y;Lja/w$a;Ltq/e;)Ljava/lang/Object;", "generationId", "presentedItemsBeyondAnchor", "z", "(Lja/j0;Lja/y;II)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "getInitialKey$paging_common", "()Ljava/lang/Object;", "b", "Lja/x0;", "v", "()Lja/x0;", "c", "Lja/m0;", "d", "Lmu/g;", "e", "Lja/c1;", "w", "()Lja/c1;", "f", "Lja/y0;", "g", "Ler/a;", "Lja/r;", "h", "Lja/r;", "hintHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/paging/internal/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pageEventChCollected", "Llu/g;", "Lja/f0;", "j", "Llu/g;", "pageEventCh", "Lja/j0$a;", "k", "Lja/j0$a;", "stateHolder", "Lju/a0;", "l", "Lju/a0;", "pageEventChannelFlowJob", "m", "u", "()Lmu/g;", "pageEventFlow", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h0<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Key initialKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x0<Key, Value> pagingSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m0 config;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mu.g<oq.i0> retryFlow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c1<Key, Value> remoteMediatorConnection;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final PagingState<Key, Value> previousPagingState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final er.a<oq.i0> jumpCallback;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final r hintHandler;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean pageEventChCollected;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final lu.g<f0<Value>> pageEventCh;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final j0.a<Key, Value> stateHolder;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ju.a0 pageEventChannelFlowJob;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mu.g<f0<Value>> pageEventFlow;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100835a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100835a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lmu/h;", "it", "Loq/i0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class b extends vq.k implements er.q<mu.h<? super GenerationalViewportHint>, Integer, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f100837f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f100838g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0 f100839h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ y f100840j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f100841k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f100842l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tq.e eVar, h0 h0Var, y yVar) {
            super(3, eVar);
            this.f100839h = h0Var;
            this.f100840j = yVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
        
            if (mu.i.u(r7, r12, r11) == r0) goto L29;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.h0.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mu.h<? super GenerationalViewportHint> hVar, Integer num, tq.e<? super oq.i0> eVar) {
            b bVar = new b(eVar, this.f100839h, this.f100840j);
            bVar.f100837f = hVar;
            bVar.f100838g = num;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/o;", "previous", "next", "<anonymous>", "(Lja/o;Lja/o;)Lja/o;"}, k = 3, mv = {2, 0, 0})
    static final class c extends vq.k implements er.q<GenerationalViewportHint, GenerationalViewportHint, tq.e<? super GenerationalViewportHint>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100844f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f100845g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ y f100846h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y yVar, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f100846h = yVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f100843e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) this.f100844f;
            GenerationalViewportHint generationalViewportHint2 = (GenerationalViewportHint) this.f100845g;
            return i0.a(generationalViewportHint2, generationalViewportHint, this.f100846h) ? generationalViewportHint2 : generationalViewportHint;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(GenerationalViewportHint generationalViewportHint, GenerationalViewportHint generationalViewportHint2, tq.e<? super GenerationalViewportHint> eVar) {
            c cVar = new c(this.f100846h, eVar);
            cVar.f100844f = generationalViewportHint;
            cVar.f100845g = generationalViewportHint2;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d<T> implements mu.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0<Key, Value> f100847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f100848b;

        d(h0<Key, Value> h0Var, y yVar) {
            this.f100847a = h0Var;
            this.f100848b = yVar;
        }

        @Override // mu.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object F(GenerationalViewportHint generationalViewportHint, tq.e<? super oq.i0> eVar) throws Throwable {
            Object objT = this.f100847a.t(this.f100848b, generationalViewportHint, eVar);
            return objT == uq.b.e() ? objT : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements mu.g<GenerationalViewportHint> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f100849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f100850b;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f100851a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f100852b;

            /* JADX INFO: renamed from: ja.h0$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C2381a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f100853d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f100854e;

                public C2381a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f100853d = obj;
                    this.f100854e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, int i15) {
                this.f100851a = hVar;
                this.f100852b = i15;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2381a c2381a;
                if (eVar instanceof C2381a) {
                    c2381a = (C2381a) eVar;
                    int i15 = c2381a.f100854e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2381a.f100854e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2381a = new C2381a(eVar);
                    }
                } else {
                    c2381a = new C2381a(eVar);
                }
                Object obj2 = c2381a.f100853d;
                Object objE = uq.b.e();
                int i16 = c2381a.f100854e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f100851a;
                    GenerationalViewportHint generationalViewportHint = new GenerationalViewportHint(this.f100852b, (p1) obj);
                    c2381a.f100854e = 1;
                    if (hVar.F(generationalViewportHint, c2381a) == objE) {
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

        public e(mu.g gVar, int i15) {
            this.f100849a = gVar;
            this.f100850b = i15;
        }

        @Override // mu.g
        public Object a(mu.h<? super GenerationalViewportHint> hVar, tq.e eVar) {
            Object objA = this.f100849a.a(new a(hVar, this.f100850b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f100856d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100857e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100858f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0<Key, Value> f100859g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f100860h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(h0<Key, Value> h0Var, tq.e<? super f> eVar) {
            super(eVar);
            this.f100859g = h0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f100858f = obj;
            this.f100860h |= PKIFailureInfo.systemUnavail;
            return this.f100859g.r(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f100861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f100863f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f100864g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0<Key, Value> f100865h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f100866j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(h0<Key, Value> h0Var, tq.e<? super g> eVar) {
            super(eVar);
            this.f100865h = h0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f100864g = obj;
            this.f100866j |= PKIFailureInfo.systemUnavail;
            return this.f100865h.s(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f100867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f100869f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f100870g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f100871h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f100872j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f100873k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f100874l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f100875m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f100876n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f100877p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f100878q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f100879r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ h0<Key, Value> f100880s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f100881t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(h0<Key, Value> h0Var, tq.e<? super h> eVar) {
            super(eVar);
            this.f100880s = h0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f100879r = obj;
            this.f100881t |= PKIFailureInfo.systemUnavail;
            return this.f100880s.t(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Value", "Lja/h1;", "Lja/f0;", "Loq/i0;", "<anonymous>", "(Lja/h1;)V"}, k = 3, mv = {2, 0, 0})
    static final class i extends vq.k implements er.p<h1<f0<Value>>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f100883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f100884g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f100885h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f100886j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ h0<Key, Value> f100887k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f100888e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ h0<Key, Value> f100889f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ h1<f0<Value>> f100890g;

            /* JADX INFO: renamed from: ja.h0$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C2382a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ h1<f0<Value>> f100891a;

                /* JADX INFO: renamed from: ja.h0$i$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                static final class C2383a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f100892d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ C2382a<T> f100893e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    int f100894f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2383a(C2382a<? super T> c2382a, tq.e<? super C2383a> eVar) {
                        super(eVar);
                        this.f100893e = c2382a;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f100892d = obj;
                        this.f100894f |= PKIFailureInfo.systemUnavail;
                        return this.f100893e.F(null, this);
                    }
                }

                C2382a(h1<f0<Value>> h1Var) {
                    this.f100891a = h1Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // mu.h
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object F(f0<Value> f0Var, tq.e<? super oq.i0> eVar) throws Throwable {
                    C2383a c2383a;
                    if (eVar instanceof C2383a) {
                        c2383a = (C2383a) eVar;
                        int i15 = c2383a.f100894f;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            c2383a.f100894f = i15 - PKIFailureInfo.systemUnavail;
                        } else {
                            c2383a = new C2383a(this, eVar);
                        }
                    } else {
                        c2383a = new C2383a(this, eVar);
                    }
                    Object obj = c2383a.f100892d;
                    Object objE = uq.b.e();
                    int i16 = c2383a.f100894f;
                    try {
                        if (i16 == 0) {
                            oq.u.b(obj);
                            h1<f0<Value>> h1Var = this.f100891a;
                            c2383a.f100894f = 1;
                            if (h1Var.l(f0Var, c2383a) == objE) {
                                return objE;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oq.u.b(obj);
                        }
                    } catch (lu.r unused) {
                    }
                    return oq.i0.f148189a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0<Key, Value> h0Var, h1<f0<Value>> h1Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f100889f = h0Var;
                this.f100890g = h1Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f100888e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    mu.g gVarN = mu.i.n(((h0) this.f100889f).pageEventCh);
                    C2382a c2382a = new C2382a(this.f100890g);
                    this.f100888e = 1;
                    if (gVarN.a(c2382a, this) == objE) {
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
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f100889f, this.f100890g, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
        static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f100895e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ h0<Key, Value> f100896f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ lu.g<oq.i0> f100897g;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ lu.g<oq.i0> f100898a;

                a(lu.g<oq.i0> gVar) {
                    this.f100898a = gVar;
                }

                @Override // mu.h
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object F(oq.i0 i0Var, tq.e<? super oq.i0> eVar) {
                    this.f100898a.d(i0Var);
                    return oq.i0.f148189a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h0<Key, Value> h0Var, lu.g<oq.i0> gVar, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f100896f = h0Var;
                this.f100897g = gVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f100895e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    mu.g gVar = ((h0) this.f100896f).retryFlow;
                    a aVar = new a(this.f100897g);
                    this.f100895e = 1;
                    if (gVar.a(aVar, this) == objE) {
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
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new b(this.f100896f, this.f100897g, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
        static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f100899e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f100900f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ lu.g<oq.i0> f100901g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ h0<Key, Value> f100902h;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ h0<Key, Value> f100903a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ju.p0 f100904b;

                /* JADX INFO: renamed from: ja.h0$i$c$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final /* synthetic */ class C2384a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f100905a;

                    static {
                        int[] iArr = new int[y.values().length];
                        try {
                            iArr[y.REFRESH.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f100905a = iArr;
                    }
                }

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                static final class b extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f100906d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    Object f100907e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    Object f100908f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    Object f100909g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    Object f100910h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    Object f100911j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    Object f100912k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    Object f100913l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    /* synthetic */ Object f100914m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ a<T> f100915n;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    int f100916p;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    b(a<? super T> aVar, tq.e<? super b> eVar) {
                        super(eVar);
                        this.f100915n = aVar;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f100914m = obj;
                        this.f100916p |= PKIFailureInfo.systemUnavail;
                        return this.f100915n.F(null, this);
                    }
                }

                a(h0<Key, Value> h0Var, ju.p0 p0Var) {
                    this.f100903a = h0Var;
                    this.f100904b = p0Var;
                }

                /* JADX WARN: Code duplicated, block: B:103:0x0378  */
                /* JADX WARN: Code duplicated, block: B:106:0x0386  */
                /* JADX WARN: Code duplicated, block: B:107:0x038a  */
                /* JADX WARN: Code duplicated, block: B:110:0x03ae  */
                /* JADX WARN: Code duplicated, block: B:116:0x03e1  */
                /* JADX WARN: Code duplicated, block: B:119:0x03e9  */
                /* JADX WARN: Code duplicated, block: B:126:0x041f A[PHI: r5 r6 r7
                  0x041f: PHI (r5v52 ju.p0) = (r5v47 ju.p0), (r5v53 ju.p0), (r5v53 ju.p0) binds: [B:118:0x03e7, B:124:0x041a, B:125:0x041c] A[DONT_GENERATE, DONT_INLINE]
                  0x041f: PHI (r6v50 ja.h0<Key, Value>) = (r6v44 ja.h0<Key, Value>), (r6v51 ja.h0<Key, Value>), (r6v51 ja.h0<Key, Value>) binds: [B:118:0x03e7, B:124:0x041a, B:125:0x041c] A[DONT_GENERATE, DONT_INLINE]
                  0x041f: PHI (r7v38 ja.x) = (r7v33 ja.x), (r7v39 ja.x), (r7v39 ja.x) binds: [B:118:0x03e7, B:124:0x041a, B:125:0x041c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:133:0x042d A[PHI: r1 r4 r14
                  0x042d: PHI (r1v53 ja.x) = (r1v28 ja.x), (r1v60 ja.x) binds: [B:88:0x0321, B:126:0x041f] A[DONT_GENERATE, DONT_INLINE]
                  0x042d: PHI (r4v52 ju.p0) = (r4v26 ju.p0), (r4v55 ju.p0) binds: [B:88:0x0321, B:126:0x041f] A[DONT_GENERATE, DONT_INLINE]
                  0x042d: PHI (r14v51 ja.h0<Key, Value>) = (r14v28 ja.h0<Key, Value>), (r14v52 ja.h0<Key, Value>) binds: [B:88:0x0321, B:126:0x041f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:135:0x0437  */
                /* JADX WARN: Code duplicated, block: B:137:0x043b  */
                /* JADX WARN: Code duplicated, block: B:140:0x0459  */
                /* JADX WARN: Code duplicated, block: B:143:0x0475  */
                /* JADX WARN: Code duplicated, block: B:144:0x0477  */
                /* JADX WARN: Code duplicated, block: B:149:0x0486  */
                /* JADX WARN: Code duplicated, block: B:152:0x0493  */
                /* JADX WARN: Code duplicated, block: B:153:0x0497  */
                /* JADX WARN: Code duplicated, block: B:156:0x04b8  */
                /* JADX WARN: Code duplicated, block: B:162:0x04ea  */
                /* JADX WARN: Code duplicated, block: B:165:0x04ef  */
                /* JADX WARN: Code duplicated, block: B:168:0x050a  */
                /* JADX WARN: Code duplicated, block: B:172:0x0522  */
                /* JADX WARN: Code duplicated, block: B:60:0x0275  */
                /* JADX WARN: Code duplicated, block: B:61:0x0279  */
                /* JADX WARN: Code duplicated, block: B:64:0x029c  */
                /* JADX WARN: Code duplicated, block: B:70:0x02ce  */
                /* JADX WARN: Code duplicated, block: B:73:0x02d6  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code duplicated, block: B:80:0x030b A[PHI: r5 r6 r7
                  0x030b: PHI (r5v27 ju.p0) = (r5v22 ju.p0), (r5v28 ju.p0), (r5v28 ju.p0) binds: [B:72:0x02d4, B:78:0x0306, B:79:0x0308] A[DONT_GENERATE, DONT_INLINE]
                  0x030b: PHI (r6v25 ja.h0<Key, Value>) = (r6v16 ja.h0<Key, Value>), (r6v26 ja.h0<Key, Value>), (r6v26 ja.h0<Key, Value>) binds: [B:72:0x02d4, B:78:0x0306, B:79:0x0308] A[DONT_GENERATE, DONT_INLINE]
                  0x030b: PHI (r7v16 ja.x) = (r7v12 ja.x), (r7v17 ja.x), (r7v17 ja.x) binds: [B:72:0x02d4, B:78:0x0306, B:79:0x0308] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:89:0x0323  */
                /* JADX WARN: Code duplicated, block: B:91:0x0327  */
                /* JADX WARN: Code duplicated, block: B:94:0x0346  */
                /* JADX WARN: Code duplicated, block: B:97:0x0366  */
                /* JADX WARN: Code duplicated, block: B:98:0x0368  */
                /* JADX WARN: Code restructure failed: missing block: B:120:0x0403, code lost:
                
                    if (r1.h(null, r13) == r0) goto L167;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x021d, code lost:
                
                    if (r1.h(null, r13) == r0) goto L167;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x02ef, code lost:
                
                    if (r1.h(null, r13) == r0) goto L167;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v1, types: [su.a] */
                /* JADX WARN: Type inference failed for: r1v14, types: [su.a] */
                /* JADX WARN: Type inference failed for: r1v2, types: [su.a] */
                /* JADX WARN: Type inference failed for: r1v3, types: [su.a] */
                /* JADX WARN: Type inference failed for: r1v39, types: [su.a] */
                /* JADX WARN: Type inference failed for: r1v68, types: [su.a] */
                /* JADX WARN: Type inference failed for: r1v86 */
                /* JADX WARN: Type inference failed for: r1v87 */
                /* JADX WARN: Type inference failed for: r1v89 */
                /* JADX WARN: Type inference failed for: r1v90 */
                /* JADX WARN: Type inference failed for: r1v92 */
                /* JADX WARN: Type inference failed for: r1v93 */
                @Override // mu.h
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object F(oq.i0 r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 1374
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ja.h0.i.c.a.F(oq.i0, tq.e):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(lu.g<oq.i0> gVar, h0<Key, Value> h0Var, tq.e<? super c> eVar) {
                super(2, eVar);
                this.f100901g = gVar;
                this.f100902h = h0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f100899e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ju.p0 p0Var = (ju.p0) this.f100900f;
                    mu.g gVarN = mu.i.n(this.f100901g);
                    a aVar = new a(this.f100902h, p0Var);
                    this.f100899e = 1;
                    if (gVarN.a(aVar, this) == objE) {
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
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                c cVar = new c(this.f100901g, this.f100902h, eVar);
                cVar.f100900f = obj;
                return cVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(h0<Key, Value> h0Var, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f100887k = h0Var;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00de  */
        /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:39:0x010f  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h1 h1Var;
            c1<Key, Value> c1VarW;
            PagingState<Key, Value> pagingState;
            j0.a aVar;
            su.a aVar2;
            h1 h1Var2;
            c1<Key, Value> c1Var;
            h0<Key, Value> h0Var;
            h1 h1Var3;
            j0.a aVar3;
            su.a aVar4;
            h1 h1Var4;
            j0.a aVar5;
            w wVarA;
            Object objE = uq.b.e();
            int i15 = this.f100885h;
            try {
                if (i15 != 0) {
                    if (i15 == 1) {
                        aVar2 = (su.a) this.f100884g;
                        aVar = (j0.a) this.f100883f;
                        c1Var = (c1) this.f100882e;
                        h1Var2 = (h1) this.f100886j;
                        oq.u.b(obj);
                    } else {
                        if (i15 == 2) {
                            h1Var3 = (h1) this.f100886j;
                            oq.u.b(obj);
                            aVar3 = ((h0) this.f100887k).stateHolder;
                            aVar4 = aVar3.lock;
                            this.f100886j = h1Var3;
                            this.f100882e = aVar3;
                            this.f100883f = aVar4;
                            this.f100885h = 3;
                            if (aVar4.h(null, this) != objE) {
                                h1Var4 = h1Var3;
                                aVar5 = aVar3;
                            }
                            return objE;
                        }
                        if (i15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        su.a aVar6 = (su.a) this.f100883f;
                        aVar5 = (j0.a) this.f100882e;
                        h1Var4 = (h1) this.f100886j;
                        oq.u.b(obj);
                        aVar4 = aVar6;
                    }
                    try {
                        wVarA = aVar5.state.getSourceLoadStates().a(y.REFRESH);
                        aVar4.r(null);
                        if (!(wVarA instanceof w.Error)) {
                            this.f100887k.D(h1Var4);
                        }
                        return oq.i0.f148189a;
                    } catch (Throwable th4) {
                        aVar4.r(null);
                        throw th4;
                    }
                }
                oq.u.b(obj);
                h1Var = (h1) this.f100886j;
                if (!((h0) this.f100887k).pageEventChCollected.compareAndSet(false, true)) {
                    throw new IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?");
                }
                ju.k.d(h1Var, null, null, new a(this.f100887k, h1Var, null), 3, null);
                lu.g gVarB = lu.j.b(0, null, null, 6, null);
                ju.k.d(h1Var, null, null, new b(this.f100887k, gVarB, null), 3, null);
                ju.k.d(h1Var, null, null, new c(gVarB, this.f100887k, null), 3, null);
                c1VarW = this.f100887k.w();
                if (c1VarW != null) {
                    h0<Key, Value> h0Var2 = this.f100887k;
                    pagingState = ((h0) h0Var2).previousPagingState;
                    if (pagingState == null) {
                        j0.a aVar7 = ((h0) h0Var2).stateHolder;
                        su.a aVar8 = aVar7.lock;
                        this.f100886j = h1Var;
                        this.f100882e = c1VarW;
                        this.f100883f = aVar7;
                        this.f100884g = aVar8;
                        this.f100885h = 1;
                        if (aVar8.h(null, this) != objE) {
                            aVar = aVar7;
                            aVar2 = aVar8;
                            h1Var2 = h1Var;
                            c1Var = c1VarW;
                        }
                    } else {
                        c1VarW.c(pagingState);
                        h0Var = this.f100887k;
                        this.f100886j = h1Var;
                        this.f100882e = null;
                        this.f100883f = null;
                        this.f100884g = null;
                        this.f100885h = 2;
                        if (h0Var.s(this) != objE) {
                            h1Var3 = h1Var;
                            aVar3 = ((h0) this.f100887k).stateHolder;
                            aVar4 = aVar3.lock;
                            this.f100886j = h1Var3;
                            this.f100882e = aVar3;
                            this.f100883f = aVar4;
                            this.f100885h = 3;
                            if (aVar4.h(null, this) != objE) {
                                h1Var4 = h1Var3;
                                aVar5 = aVar3;
                                wVarA = aVar5.state.getSourceLoadStates().a(y.REFRESH);
                                aVar4.r(null);
                                if (!(wVarA instanceof w.Error)) {
                                    this.f100887k.D(h1Var4);
                                }
                                return oq.i0.f148189a;
                            }
                        }
                    }
                } else {
                    h0Var = this.f100887k;
                    this.f100886j = h1Var;
                    this.f100882e = null;
                    this.f100883f = null;
                    this.f100884g = null;
                    this.f100885h = 2;
                    if (h0Var.s(this) != objE) {
                        h1Var3 = h1Var;
                        aVar3 = ((h0) this.f100887k).stateHolder;
                        aVar4 = aVar3.lock;
                        this.f100886j = h1Var3;
                        this.f100882e = aVar3;
                        this.f100883f = aVar4;
                        this.f100885h = 3;
                        if (aVar4.h(null, this) != objE) {
                            h1Var4 = h1Var3;
                            aVar5 = aVar3;
                            wVarA = aVar5.state.getSourceLoadStates().a(y.REFRESH);
                            aVar4.r(null);
                            if (!(wVarA instanceof w.Error)) {
                                this.f100887k.D(h1Var4);
                            }
                            return oq.i0.f148189a;
                        }
                    }
                }
                return objE;
                PagingState<Key, Value> pagingStateG = aVar.state.g(null);
                aVar2.r(null);
                h1 h1Var5 = h1Var2;
                pagingState = pagingStateG;
                c1VarW = c1Var;
                h1Var = h1Var5;
                c1VarW.c(pagingState);
                h0Var = this.f100887k;
                this.f100886j = h1Var;
                this.f100882e = null;
                this.f100883f = null;
                this.f100884g = null;
                this.f100885h = 2;
                if (h0Var.s(this) != objE) {
                    h1Var3 = h1Var;
                    aVar3 = ((h0) this.f100887k).stateHolder;
                    aVar4 = aVar3.lock;
                    this.f100886j = h1Var3;
                    this.f100882e = aVar3;
                    this.f100883f = aVar4;
                    this.f100885h = 3;
                    if (aVar4.h(null, this) != objE) {
                        h1Var4 = h1Var3;
                        aVar5 = aVar3;
                        wVarA = aVar5.state.getSourceLoadStates().a(y.REFRESH);
                        aVar4.r(null);
                        if (!(wVarA instanceof w.Error)) {
                            this.f100887k.D(h1Var4);
                        }
                        return oq.i0.f148189a;
                    }
                }
                return objE;
            } catch (Throwable th5) {
                aVar2.r(null);
                throw th5;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h1<f0<Value>> h1Var, tq.e<? super oq.i0> eVar) {
            return ((i) v(h1Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = new i(this.f100887k, eVar);
            iVar.f100886j = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Value", "Lmu/h;", "Lja/f0;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 0, 0})
    static final class j extends vq.k implements er.p<mu.h<? super f0<Value>>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f100918f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f100919g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f100920h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0<Key, Value> f100921j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(h0<Key, Value> h0Var, tq.e<? super j> eVar) {
            super(2, eVar);
            this.f100921j = h0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
        
            if (r1.F(r2, r6) == r0) goto L17;
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
                int r1 = r6.f100919g
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r2) goto L1b
                if (r1 != r3) goto L13
                oq.u.b(r7)
                goto L70
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.f100918f
                mu.h r1 = (mu.h) r1
                java.lang.Object r2 = r6.f100917e
                su.a r2 = (su.a) r2
                java.lang.Object r5 = r6.f100920h
                ja.j0$a r5 = (ja.j0.a) r5
                oq.u.b(r7)
                goto L4d
            L2b:
                oq.u.b(r7)
                java.lang.Object r7 = r6.f100920h
                r1 = r7
                mu.h r1 = (mu.h) r1
                ja.h0<Key, Value> r7 = r6.f100921j
                ja.j0$a r5 = ja.h0.k(r7)
                su.a r7 = ja.j0.a.a(r5)
                r6.f100920h = r5
                r6.f100917e = r7
                r6.f100918f = r1
                r6.f100919g = r2
                java.lang.Object r2 = r7.h(r4, r6)
                if (r2 != r0) goto L4c
                goto L6f
            L4c:
                r2 = r7
            L4d:
                ja.j0 r7 = ja.j0.a.b(r5)     // Catch: java.lang.Throwable -> L73
                ja.e0 r7 = r7.getSourceLoadStates()     // Catch: java.lang.Throwable -> L73
                ja.x r7 = r7.d()     // Catch: java.lang.Throwable -> L73
                r2.r(r4)
                ja.f0$c r2 = new ja.f0$c
                r2.<init>(r7, r4, r3, r4)
                r6.f100920h = r4
                r6.f100917e = r4
                r6.f100918f = r4
                r6.f100919g = r3
                java.lang.Object r7 = r1.F(r2, r6)
                if (r7 != r0) goto L70
            L6f:
                return r0
            L70:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L73:
                r7 = move-exception
                r2.r(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.h0.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super f0<Value>> hVar, tq.e<? super oq.i0> eVar) {
            return ((j) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = new j(this.f100921j, eVar);
            jVar.f100920h = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class k extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0<Key, Value> f100923f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/p1;", "hint", "", "<anonymous>", "(Lja/p1;)Z"}, k = 3, mv = {2, 0, 0})
        static final class a extends vq.k implements er.p<p1, tq.e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f100924e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f100925f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ h0<Key, Value> f100926g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0<Key, Value> h0Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f100926g = h0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f100924e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                p1 p1Var = (p1) this.f100925f;
                return vq.b.a(p1Var.getPresentedItemsBefore() * (-1) > ((h0) this.f100926g).config.jumpThreshold || p1Var.getPresentedItemsAfter() * (-1) > ((h0) this.f100926g).config.jumpThreshold);
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p1 p1Var, tq.e<? super Boolean> eVar) {
                return ((a) v(p1Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f100926g, eVar);
                aVar.f100925f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(h0<Key, Value> h0Var, tq.e<? super k> eVar) {
            super(2, eVar);
            this.f100923f = h0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f100922e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarQ = mu.i.Q(((h0) this.f100923f).hintHandler.f(y.APPEND), ((h0) this.f100923f).hintHandler.f(y.PREPEND));
                a aVar = new a(this.f100923f, null);
                this.f100922e = 1;
                obj = mu.i.A(gVarQ, aVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            p1 p1Var = (p1) obj;
            if (p1Var != null) {
                h0<Key, Value> h0Var = this.f100923f;
                v0 v0Var = v0.f101202a;
                if (v0Var.a(3)) {
                    v0Var.b(3, "Jump triggered on PagingSource " + h0Var.v() + " by " + p1Var, null);
                }
                ((h0) this.f100923f).jumpCallback.a();
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((k) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new k(this.f100923f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class l extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100927e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f100928f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f100929g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f100930h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0<Key, Value> f100931j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(h0<Key, Value> h0Var, tq.e<? super l> eVar) {
            super(2, eVar);
            this.f100931j = h0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        
            if (r1.q(r7, r3, r6) == r0) goto L17;
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
                int r1 = r6.f100930h
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                oq.u.b(r7)
                goto L64
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.f100929g
                ja.h0 r1 = (ja.h0) r1
                java.lang.Object r3 = r6.f100928f
                su.a r3 = (su.a) r3
                java.lang.Object r5 = r6.f100927e
                ja.j0$a r5 = (ja.j0.a) r5
                oq.u.b(r7)
                goto L48
            L2b:
                oq.u.b(r7)
                ja.h0<Key, Value> r1 = r6.f100931j
                ja.j0$a r5 = ja.h0.k(r1)
                su.a r7 = ja.j0.a.a(r5)
                r6.f100927e = r5
                r6.f100928f = r7
                r6.f100929g = r1
                r6.f100930h = r3
                java.lang.Object r3 = r7.h(r4, r6)
                if (r3 != r0) goto L47
                goto L63
            L47:
                r3 = r7
            L48:
                ja.j0 r7 = ja.j0.a.b(r5)     // Catch: java.lang.Throwable -> L67
                mu.g r7 = r7.f()     // Catch: java.lang.Throwable -> L67
                r3.r(r4)
                ja.y r3 = ja.y.PREPEND
                r6.f100927e = r4
                r6.f100928f = r4
                r6.f100929g = r4
                r6.f100930h = r2
                java.lang.Object r7 = ja.h0.a(r1, r7, r3, r6)
                if (r7 != r0) goto L64
            L63:
                return r0
            L64:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L67:
                r7 = move-exception
                r3.r(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.h0.l.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((l) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new l(this.f100931j, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class m extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f100933f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f100934g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f100935h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0<Key, Value> f100936j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(h0<Key, Value> h0Var, tq.e<? super m> eVar) {
            super(2, eVar);
            this.f100936j = h0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        
            if (r1.q(r7, r3, r6) == r0) goto L17;
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
                int r1 = r6.f100935h
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                oq.u.b(r7)
                goto L64
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.f100934g
                ja.h0 r1 = (ja.h0) r1
                java.lang.Object r3 = r6.f100933f
                su.a r3 = (su.a) r3
                java.lang.Object r5 = r6.f100932e
                ja.j0$a r5 = (ja.j0.a) r5
                oq.u.b(r7)
                goto L48
            L2b:
                oq.u.b(r7)
                ja.h0<Key, Value> r1 = r6.f100936j
                ja.j0$a r5 = ja.h0.k(r1)
                su.a r7 = ja.j0.a.a(r5)
                r6.f100932e = r5
                r6.f100933f = r7
                r6.f100934g = r1
                r6.f100935h = r3
                java.lang.Object r3 = r7.h(r4, r6)
                if (r3 != r0) goto L47
                goto L63
            L47:
                r3 = r7
            L48:
                ja.j0 r7 = ja.j0.a.b(r5)     // Catch: java.lang.Throwable -> L67
                mu.g r7 = r7.e()     // Catch: java.lang.Throwable -> L67
                r3.r(r4)
                ja.y r3 = ja.y.APPEND
                r6.f100932e = r4
                r6.f100933f = r4
                r6.f100934g = r4
                r6.f100935h = r2
                java.lang.Object r7 = ja.h0.a(r1, r7, r3, r6)
                if (r7 != r0) goto L64
            L63:
                return r0
            L64:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L67:
                r7 = move-exception
                r3.r(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.h0.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((m) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new m(this.f100936j, eVar);
        }
    }

    public h0(Key key, x0<Key, Value> x0Var, m0 m0Var, mu.g<oq.i0> gVar, c1<Key, Value> c1Var, PagingState<Key, Value> pagingState, er.a<oq.i0> aVar) {
        this.initialKey = key;
        this.pagingSource = x0Var;
        this.config = m0Var;
        this.retryFlow = gVar;
        this.remoteMediatorConnection = c1Var;
        this.previousPagingState = pagingState;
        this.jumpCallback = aVar;
        if (m0Var.jumpThreshold != Integer.MIN_VALUE && !x0Var.b()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.hintHandler = new r();
        this.pageEventChCollected = new AtomicBoolean(false);
        this.pageEventCh = lu.j.b(-2, null, null, 6, null);
        this.stateHolder = new j0.a<>(m0Var);
        ju.a0 a0VarB = h2.b(null, 1, null);
        this.pageEventChannelFlowJob = a0VarB;
        this.pageEventFlow = mu.i.U(ja.f.a(a0VarB, new i(this, null)), new j(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(y yVar, p1 p1Var, tq.e<? super oq.i0> eVar) throws Throwable {
        if (a.f100835a[yVar.ordinal()] == 1) {
            Object objS = s(eVar);
            return objS == uq.b.e() ? objS : oq.i0.f148189a;
        }
        if (p1Var == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        this.hintHandler.c(yVar, p1Var);
        return oq.i0.f148189a;
    }

    private final Object B(j0<Key, Value> j0Var, y yVar, w.Error error, tq.e<? super oq.i0> eVar) {
        if (fr.t.c(j0Var.getSourceLoadStates().a(yVar), error)) {
            return oq.i0.f148189a;
        }
        j0Var.getSourceLoadStates().c(yVar, error);
        Object objL = this.pageEventCh.l(new f0.c(j0Var.getSourceLoadStates().d(), null), eVar);
        return objL == uq.b.e() ? objL : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(j0<Key, Value> j0Var, y yVar, tq.e<? super oq.i0> eVar) {
        w wVarA = j0Var.getSourceLoadStates().a(yVar);
        w.Loading loading = w.Loading.f101205b;
        if (fr.t.c(wVarA, loading)) {
            return oq.i0.f148189a;
        }
        j0Var.getSourceLoadStates().c(yVar, loading);
        Object objL = this.pageEventCh.l(new f0.c(j0Var.getSourceLoadStates().d(), null), eVar);
        return objL == uq.b.e() ? objL : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(ju.p0 p0Var) {
        if (this.config.jumpThreshold != Integer.MIN_VALUE) {
            ju.k.d(p0Var, null, null, new k(this, null), 3, null);
        }
        ju.k.d(p0Var, null, null, new l(this, null), 3, null);
        ju.k.d(p0Var, null, null, new m(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(mu.g<Integer> gVar, y yVar, tq.e<? super oq.i0> eVar) {
        Object objA = mu.i.m(n.b(n.d(gVar, new b(null, this, yVar)), new c(yVar, null))).a(new d(this, yVar), eVar);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:106:0x0255  */
    /* JADX WARN: Code duplicated, block: B:108:0x0259  */
    /* JADX WARN: Code duplicated, block: B:110:0x0261  */
    /* JADX WARN: Code duplicated, block: B:114:0x0283  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7 A[Catch: all -> 0x009b, PHI: r2
      0x00d7: PHI (r2v9 ??) = (r2v52 ??), (r2v53 ??) binds: [B:38:0x00d3, B:28:0x0097] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {all -> 0x009b, blocks: (B:28:0x0097, B:40:0x00d7, B:37:0x00c3), top: B:132:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x011a A[PHI: r14
      0x011a: PHI (r14v11 java.lang.Object) = (r14v10 java.lang.Object), (r14v1 java.lang.Object) binds: [B:45:0x0116, B:26:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0120  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c A[Catch: all -> 0x016a, TryCatch #3 {all -> 0x016a, blocks: (B:53:0x0138, B:55:0x015c, B:58:0x016d, B:60:0x0176), top: B:136:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0176 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #3 {all -> 0x016a, blocks: (B:53:0x0138, B:55:0x015c, B:58:0x016d, B:60:0x0176), top: B:136:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0188  */
    /* JADX WARN: Code duplicated, block: B:65:0x0190  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0219  */
    /* JADX WARN: Code duplicated, block: B:95:0x0234  */
    /* JADX WARN: Code duplicated, block: B:98:0x0241  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00ec, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ja.h0, ja.h0<Key, Value>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [su.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [su.a] */
    /* JADX WARN: Type inference failed for: r2v37, types: [su.a] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v9, types: [su.a] */
    public final Object s(tq.e<? super oq.i0> eVar) throws Throwable {
        g gVar;
        j0.a<Key, Value> aVar;
        su.a aVar2;
        j0 j0Var;
        y yVar;
        v0 v0Var;
        x0.b bVar;
        v0 v0Var2;
        j0.a<Key, Value> aVar3;
        su.a aVar4;
        x0.b bVar2;
        j0.a<Key, Value> aVar5;
        su.a aVar6;
        x0.b bVar3;
        j0 j0Var2;
        y yVar2;
        boolean zR;
        w.NotLoading.Companion companion;
        v0 v0Var3;
        x0.b bVar4;
        v0 v0Var4;
        j0.a<Key, Value> aVar7;
        su.a aVar8;
        su.a aVar9;
        x0.b bVar5;
        lu.g<f0<Value>> gVar2;
        f0<Value> f0VarU;
        x0.b.C2395b c2395b;
        j0.a<Key, Value> aVar10;
        su.a aVar11;
        su.a aVar12;
        x0.b bVar6;
        PagingState<Key, Value> pagingStateG;
        x0.b.C2395b c2395b2;
        su.a aVar13;
        j0 j0Var3;
        w.Error error;
        y yVar3;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f100866j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f100866j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(this, eVar);
            }
        } else {
            gVar = new g(this, eVar);
        }
        Object objG = gVar.f100864g;
        Object objE = uq.b.e();
        ?? r15 = gVar.f100866j;
        try {
            try {
                switch (r15) {
                    case 0:
                        oq.u.b(objG);
                        aVar = this.stateHolder;
                        su.a aVar14 = ((j0.a) aVar).lock;
                        gVar.f100861d = aVar;
                        gVar.f100862e = aVar14;
                        gVar.f100866j = 1;
                        if (aVar14.h(null, gVar) != objE) {
                            aVar2 = aVar14;
                            j0Var = ((j0.a) aVar).state;
                            yVar = y.REFRESH;
                            gVar.f100861d = aVar2;
                            gVar.f100862e = null;
                            gVar.f100866j = 2;
                            r15 = aVar2;
                            if (C(j0Var, yVar, gVar) == objE) {
                                oq.i0 i0Var = oq.i0.f148189a;
                                r15.r(null);
                                x0.a<Key> aVarX = x(y.REFRESH, this.initialKey);
                                v0Var = v0.f101202a;
                                if (v0Var.a(3)) {
                                    v0Var.b(3, "Start REFRESH with loadKey " + this.initialKey + " on " + this.pagingSource, null);
                                }
                                x0<Key, Value> x0Var = this.pagingSource;
                                gVar.f100861d = null;
                                gVar.f100866j = 3;
                                objG = x0Var.g(aVarX, gVar);
                                if (objG != objE) {
                                    bVar = (x0.b) objG;
                                    if (bVar instanceof x0.b.C2395b) {
                                        aVar5 = this.stateHolder;
                                        aVar6 = ((j0.a) aVar5).lock;
                                        gVar.f100861d = bVar;
                                        gVar.f100862e = aVar5;
                                        gVar.f100863f = aVar6;
                                        gVar.f100866j = 4;
                                        if (aVar6.h(null, gVar) != objE) {
                                            bVar3 = bVar;
                                            try {
                                                j0Var2 = ((j0.a) aVar5).state;
                                                yVar2 = y.REFRESH;
                                                zR = j0Var2.r(0, yVar2, (x0.b.C2395b) bVar3);
                                                e0 sourceLoadStates = j0Var2.getSourceLoadStates();
                                                companion = w.NotLoading.INSTANCE;
                                                sourceLoadStates.c(yVar2, companion.b());
                                                if (((x0.b.C2395b) bVar3).i() == null) {
                                                    j0Var2.getSourceLoadStates().c(y.PREPEND, companion.a());
                                                }
                                                if (((x0.b.C2395b) bVar3).h() == null) {
                                                    j0Var2.getSourceLoadStates().c(y.APPEND, companion.a());
                                                }
                                                aVar6.r(null);
                                                if (!zR) {
                                                    v0Var3 = v0.f101202a;
                                                    if (v0Var3.a(2)) {
                                                        v0Var3.b(2, y(yVar2, this.initialKey, null), null);
                                                    }
                                                    bVar4 = bVar3;
                                                    if (this.remoteMediatorConnection != null) {
                                                        c2395b = (x0.b.C2395b) bVar4;
                                                        if (c2395b.i() != null) {
                                                        }
                                                        aVar10 = this.stateHolder;
                                                        aVar11 = ((j0.a) aVar10).lock;
                                                        gVar.f100861d = bVar4;
                                                        gVar.f100862e = aVar10;
                                                        gVar.f100863f = aVar11;
                                                        gVar.f100866j = 7;
                                                        if (aVar11.h(null, gVar) != objE) {
                                                            aVar12 = aVar11;
                                                            bVar6 = bVar4;
                                                            pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                                                            aVar12.r(null);
                                                            c2395b2 = (x0.b.C2395b) bVar6;
                                                            if (c2395b2.i() == null) {
                                                                this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                                                            }
                                                            if (c2395b2.h() == null) {
                                                                this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                                                            }
                                                        }
                                                    }
                                                    return oq.i0.f148189a;
                                                }
                                                v0Var4 = v0.f101202a;
                                                if (v0Var4.a(3)) {
                                                    v0Var4.b(3, y(yVar2, this.initialKey, bVar3), null);
                                                }
                                                aVar7 = this.stateHolder;
                                                aVar8 = ((j0.a) aVar7).lock;
                                                gVar.f100861d = bVar3;
                                                gVar.f100862e = aVar7;
                                                gVar.f100863f = aVar8;
                                                gVar.f100866j = 5;
                                                if (aVar8.h(null, gVar) != objE) {
                                                    aVar9 = aVar8;
                                                    bVar5 = bVar3;
                                                    j0 j0Var4 = ((j0.a) aVar7).state;
                                                    gVar2 = this.pageEventCh;
                                                    f0VarU = j0Var4.u((x0.b.C2395b) bVar5, y.REFRESH);
                                                    gVar.f100861d = bVar5;
                                                    gVar.f100862e = aVar9;
                                                    gVar.f100863f = null;
                                                    gVar.f100866j = 6;
                                                    if (gVar2.l(f0VarU, gVar) == objE) {
                                                        bVar4 = bVar5;
                                                        r15 = aVar9;
                                                        oq.i0 i0Var2 = oq.i0.f148189a;
                                                        r15.r(null);
                                                        if (this.remoteMediatorConnection != null) {
                                                            c2395b = (x0.b.C2395b) bVar4;
                                                            if (c2395b.i() != null || c2395b.h() == null) {
                                                                aVar10 = this.stateHolder;
                                                                aVar11 = ((j0.a) aVar10).lock;
                                                                gVar.f100861d = bVar4;
                                                                gVar.f100862e = aVar10;
                                                                gVar.f100863f = aVar11;
                                                                gVar.f100866j = 7;
                                                                if (aVar11.h(null, gVar) != objE) {
                                                                    aVar12 = aVar11;
                                                                    bVar6 = bVar4;
                                                                    try {
                                                                        pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                                                                        aVar12.r(null);
                                                                        c2395b2 = (x0.b.C2395b) bVar6;
                                                                        if (c2395b2.i() == null) {
                                                                            this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                                                                        }
                                                                        if (c2395b2.h() == null) {
                                                                            this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                                                                        }
                                                                    } catch (Throwable th4) {
                                                                        aVar12.r(null);
                                                                        throw th4;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return oq.i0.f148189a;
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                aVar6.r(null);
                                                throw th5;
                                            }
                                        }
                                        break;
                                    } else {
                                        if (bVar instanceof x0.b.a) {
                                            throw new oq.p();
                                        }
                                        v0Var2 = v0.f101202a;
                                        if (v0Var2.a(2)) {
                                            v0Var2.b(2, y(y.REFRESH, this.initialKey, bVar), null);
                                        }
                                        aVar3 = this.stateHolder;
                                        aVar4 = ((j0.a) aVar3).lock;
                                        gVar.f100861d = bVar;
                                        gVar.f100862e = aVar3;
                                        gVar.f100863f = aVar4;
                                        gVar.f100866j = 8;
                                        if (aVar4.h(null, gVar) != objE) {
                                            bVar2 = bVar;
                                            try {
                                                j0Var3 = ((j0.a) aVar3).state;
                                                error = new w.Error(((x0.b.a) bVar2).getThrowable());
                                                yVar3 = y.REFRESH;
                                                gVar.f100861d = aVar4;
                                                gVar.f100862e = null;
                                                gVar.f100863f = null;
                                                gVar.f100866j = 9;
                                                if (B(j0Var3, yVar3, error, gVar) != objE) {
                                                    aVar13 = aVar4;
                                                    oq.i0 i0Var3 = oq.i0.f148189a;
                                                    aVar13.r(null);
                                                    return oq.i0.f148189a;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                aVar13 = aVar4;
                                                aVar13.r(null);
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return objE;
                    case 1:
                        su.a aVar15 = (su.a) gVar.f100862e;
                        aVar = (j0.a) gVar.f100861d;
                        oq.u.b(objG);
                        aVar2 = aVar15;
                        j0Var = ((j0.a) aVar).state;
                        yVar = y.REFRESH;
                        gVar.f100861d = aVar2;
                        gVar.f100862e = null;
                        gVar.f100866j = 2;
                        r15 = aVar2;
                        if (C(j0Var, yVar, gVar) == objE) {
                            oq.i0 i0Var4 = oq.i0.f148189a;
                            r15.r(null);
                            x0.a<Key> aVarX2 = x(y.REFRESH, this.initialKey);
                            v0Var = v0.f101202a;
                            if (v0Var.a(3)) {
                                v0Var.b(3, "Start REFRESH with loadKey " + this.initialKey + " on " + this.pagingSource, null);
                            }
                            x0<Key, Value> x0Var2 = this.pagingSource;
                            gVar.f100861d = null;
                            gVar.f100866j = 3;
                            objG = x0Var2.g(aVarX2, gVar);
                            if (objG != objE) {
                                bVar = (x0.b) objG;
                                if (bVar instanceof x0.b.C2395b) {
                                    aVar5 = this.stateHolder;
                                    aVar6 = ((j0.a) aVar5).lock;
                                    gVar.f100861d = bVar;
                                    gVar.f100862e = aVar5;
                                    gVar.f100863f = aVar6;
                                    gVar.f100866j = 4;
                                    if (aVar6.h(null, gVar) != objE) {
                                        bVar3 = bVar;
                                        j0Var2 = ((j0.a) aVar5).state;
                                        yVar2 = y.REFRESH;
                                        zR = j0Var2.r(0, yVar2, (x0.b.C2395b) bVar3);
                                        e0 sourceLoadStates2 = j0Var2.getSourceLoadStates();
                                        companion = w.NotLoading.INSTANCE;
                                        sourceLoadStates2.c(yVar2, companion.b());
                                        if (((x0.b.C2395b) bVar3).i() == null) {
                                            j0Var2.getSourceLoadStates().c(y.PREPEND, companion.a());
                                        }
                                        if (((x0.b.C2395b) bVar3).h() == null) {
                                            j0Var2.getSourceLoadStates().c(y.APPEND, companion.a());
                                        }
                                        aVar6.r(null);
                                        if (!zR) {
                                            v0Var3 = v0.f101202a;
                                            if (v0Var3.a(2)) {
                                                v0Var3.b(2, y(yVar2, this.initialKey, null), null);
                                            }
                                            bVar4 = bVar3;
                                            if (this.remoteMediatorConnection != null) {
                                                c2395b = (x0.b.C2395b) bVar4;
                                                if (c2395b.i() != null) {
                                                }
                                                aVar10 = this.stateHolder;
                                                aVar11 = ((j0.a) aVar10).lock;
                                                gVar.f100861d = bVar4;
                                                gVar.f100862e = aVar10;
                                                gVar.f100863f = aVar11;
                                                gVar.f100866j = 7;
                                                if (aVar11.h(null, gVar) != objE) {
                                                    aVar12 = aVar11;
                                                    bVar6 = bVar4;
                                                    pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                                                    aVar12.r(null);
                                                    c2395b2 = (x0.b.C2395b) bVar6;
                                                    if (c2395b2.i() == null) {
                                                        this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                                                    }
                                                    if (c2395b2.h() == null) {
                                                        this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                                                    }
                                                }
                                                break;
                                            }
                                            return oq.i0.f148189a;
                                        }
                                        v0Var4 = v0.f101202a;
                                        if (v0Var4.a(3)) {
                                            v0Var4.b(3, y(yVar2, this.initialKey, bVar3), null);
                                        }
                                        aVar7 = this.stateHolder;
                                        aVar8 = ((j0.a) aVar7).lock;
                                        gVar.f100861d = bVar3;
                                        gVar.f100862e = aVar7;
                                        gVar.f100863f = aVar8;
                                        gVar.f100866j = 5;
                                        if (aVar8.h(null, gVar) != objE) {
                                            aVar9 = aVar8;
                                            bVar5 = bVar3;
                                            j0 j0Var5 = ((j0.a) aVar7).state;
                                            gVar2 = this.pageEventCh;
                                            f0VarU = j0Var5.u((x0.b.C2395b) bVar5, y.REFRESH);
                                            gVar.f100861d = bVar5;
                                            gVar.f100862e = aVar9;
                                            gVar.f100863f = null;
                                            gVar.f100866j = 6;
                                            if (gVar2.l(f0VarU, gVar) == objE) {
                                                bVar4 = bVar5;
                                                r15 = aVar9;
                                                oq.i0 i0Var5 = oq.i0.f148189a;
                                                r15.r(null);
                                                if (this.remoteMediatorConnection != null) {
                                                    c2395b = (x0.b.C2395b) bVar4;
                                                    if (c2395b.i() != null) {
                                                    }
                                                    aVar10 = this.stateHolder;
                                                    aVar11 = ((j0.a) aVar10).lock;
                                                    gVar.f100861d = bVar4;
                                                    gVar.f100862e = aVar10;
                                                    gVar.f100863f = aVar11;
                                                    gVar.f100866j = 7;
                                                    if (aVar11.h(null, gVar) != objE) {
                                                        aVar12 = aVar11;
                                                        bVar6 = bVar4;
                                                        pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                                                        aVar12.r(null);
                                                        c2395b2 = (x0.b.C2395b) bVar6;
                                                        if (c2395b2.i() == null) {
                                                            this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                                                        }
                                                        if (c2395b2.h() == null) {
                                                            this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                                                        }
                                                    }
                                                    break;
                                                }
                                                return oq.i0.f148189a;
                                            }
                                        }
                                    }
                                } else {
                                    if (bVar instanceof x0.b.a) {
                                        throw new oq.p();
                                    }
                                    v0Var2 = v0.f101202a;
                                    if (v0Var2.a(2)) {
                                        v0Var2.b(2, y(y.REFRESH, this.initialKey, bVar), null);
                                    }
                                    aVar3 = this.stateHolder;
                                    aVar4 = ((j0.a) aVar3).lock;
                                    gVar.f100861d = bVar;
                                    gVar.f100862e = aVar3;
                                    gVar.f100863f = aVar4;
                                    gVar.f100866j = 8;
                                    if (aVar4.h(null, gVar) != objE) {
                                        bVar2 = bVar;
                                        j0Var3 = ((j0.a) aVar3).state;
                                        error = new w.Error(((x0.b.a) bVar2).getThrowable());
                                        yVar3 = y.REFRESH;
                                        gVar.f100861d = aVar4;
                                        gVar.f100862e = null;
                                        gVar.f100863f = null;
                                        gVar.f100866j = 9;
                                        if (B(j0Var3, yVar3, error, gVar) != objE) {
                                            aVar13 = aVar4;
                                            oq.i0 i0Var6 = oq.i0.f148189a;
                                            aVar13.r(null);
                                            return oq.i0.f148189a;
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        return objE;
                    case 2:
                        su.a aVar16 = (su.a) gVar.f100861d;
                        oq.u.b(objG);
                        r15 = aVar16;
                        oq.i0 i0Var7 = oq.i0.f148189a;
                        r15.r(null);
                        x0.a<Key> aVarX3 = x(y.REFRESH, this.initialKey);
                        v0Var = v0.f101202a;
                        if (v0Var.a(3)) {
                            v0Var.b(3, "Start REFRESH with loadKey " + this.initialKey + " on " + this.pagingSource, null);
                        }
                        x0<Key, Value> x0Var3 = this.pagingSource;
                        gVar.f100861d = null;
                        gVar.f100866j = 3;
                        objG = x0Var3.g(aVarX3, gVar);
                        if (objG != objE) {
                            bVar = (x0.b) objG;
                            if (bVar instanceof x0.b.C2395b) {
                                aVar5 = this.stateHolder;
                                aVar6 = ((j0.a) aVar5).lock;
                                gVar.f100861d = bVar;
                                gVar.f100862e = aVar5;
                                gVar.f100863f = aVar6;
                                gVar.f100866j = 4;
                                if (aVar6.h(null, gVar) != objE) {
                                    bVar3 = bVar;
                                    j0Var2 = ((j0.a) aVar5).state;
                                    yVar2 = y.REFRESH;
                                    zR = j0Var2.r(0, yVar2, (x0.b.C2395b) bVar3);
                                    e0 sourceLoadStates3 = j0Var2.getSourceLoadStates();
                                    companion = w.NotLoading.INSTANCE;
                                    sourceLoadStates3.c(yVar2, companion.b());
                                    if (((x0.b.C2395b) bVar3).i() == null) {
                                        j0Var2.getSourceLoadStates().c(y.PREPEND, companion.a());
                                    }
                                    if (((x0.b.C2395b) bVar3).h() == null) {
                                        j0Var2.getSourceLoadStates().c(y.APPEND, companion.a());
                                    }
                                    aVar6.r(null);
                                    if (!zR) {
                                        v0Var3 = v0.f101202a;
                                        if (v0Var3.a(2)) {
                                            v0Var3.b(2, y(yVar2, this.initialKey, null), null);
                                        }
                                        bVar4 = bVar3;
                                        if (this.remoteMediatorConnection != null) {
                                            c2395b = (x0.b.C2395b) bVar4;
                                            if (c2395b.i() != null) {
                                            }
                                            aVar10 = this.stateHolder;
                                            aVar11 = ((j0.a) aVar10).lock;
                                            gVar.f100861d = bVar4;
                                            gVar.f100862e = aVar10;
                                            gVar.f100863f = aVar11;
                                            gVar.f100866j = 7;
                                            if (aVar11.h(null, gVar) != objE) {
                                                aVar12 = aVar11;
                                                bVar6 = bVar4;
                                                pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                                                aVar12.r(null);
                                                c2395b2 = (x0.b.C2395b) bVar6;
                                                if (c2395b2.i() == null) {
                                                    this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                                                }
                                                if (c2395b2.h() == null) {
                                                    this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                                                }
                                            }
                                            break;
                                        }
                                        return oq.i0.f148189a;
                                    }
                                    v0Var4 = v0.f101202a;
                                    if (v0Var4.a(3)) {
                                        v0Var4.b(3, y(yVar2, this.initialKey, bVar3), null);
                                    }
                                    aVar7 = this.stateHolder;
                                    aVar8 = ((j0.a) aVar7).lock;
                                    gVar.f100861d = bVar3;
                                    gVar.f100862e = aVar7;
                                    gVar.f100863f = aVar8;
                                    gVar.f100866j = 5;
                                    if (aVar8.h(null, gVar) != objE) {
                                        aVar9 = aVar8;
                                        bVar5 = bVar3;
                                        j0 j0Var6 = ((j0.a) aVar7).state;
                                        gVar2 = this.pageEventCh;
                                        f0VarU = j0Var6.u((x0.b.C2395b) bVar5, y.REFRESH);
                                        gVar.f100861d = bVar5;
                                        gVar.f100862e = aVar9;
                                        gVar.f100863f = null;
                                        gVar.f100866j = 6;
                                        if (gVar2.l(f0VarU, gVar) == objE) {
                                            bVar4 = bVar5;
                                            r15 = aVar9;
                                            oq.i0 i0Var8 = oq.i0.f148189a;
                                            r15.r(null);
                                            if (this.remoteMediatorConnection != null) {
                                                c2395b = (x0.b.C2395b) bVar4;
                                                if (c2395b.i() != null) {
                                                }
                                                aVar10 = this.stateHolder;
                                                aVar11 = ((j0.a) aVar10).lock;
                                                gVar.f100861d = bVar4;
                                                gVar.f100862e = aVar10;
                                                gVar.f100863f = aVar11;
                                                gVar.f100866j = 7;
                                                if (aVar11.h(null, gVar) != objE) {
                                                    aVar12 = aVar11;
                                                    bVar6 = bVar4;
                                                    pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                                                    aVar12.r(null);
                                                    c2395b2 = (x0.b.C2395b) bVar6;
                                                    if (c2395b2.i() == null) {
                                                        this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                                                    }
                                                    if (c2395b2.h() == null) {
                                                        this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                                                    }
                                                }
                                                break;
                                            }
                                            return oq.i0.f148189a;
                                        }
                                    }
                                }
                            } else {
                                if (bVar instanceof x0.b.a) {
                                    throw new oq.p();
                                }
                                v0Var2 = v0.f101202a;
                                if (v0Var2.a(2)) {
                                    v0Var2.b(2, y(y.REFRESH, this.initialKey, bVar), null);
                                }
                                aVar3 = this.stateHolder;
                                aVar4 = ((j0.a) aVar3).lock;
                                gVar.f100861d = bVar;
                                gVar.f100862e = aVar3;
                                gVar.f100863f = aVar4;
                                gVar.f100866j = 8;
                                if (aVar4.h(null, gVar) != objE) {
                                    bVar2 = bVar;
                                    j0Var3 = ((j0.a) aVar3).state;
                                    error = new w.Error(((x0.b.a) bVar2).getThrowable());
                                    yVar3 = y.REFRESH;
                                    gVar.f100861d = aVar4;
                                    gVar.f100862e = null;
                                    gVar.f100863f = null;
                                    gVar.f100866j = 9;
                                    if (B(j0Var3, yVar3, error, gVar) != objE) {
                                        aVar13 = aVar4;
                                        oq.i0 i0Var9 = oq.i0.f148189a;
                                        aVar13.r(null);
                                        return oq.i0.f148189a;
                                    }
                                }
                            }
                        }
                        return objE;
                    case 3:
                        oq.u.b(objG);
                        bVar = (x0.b) objG;
                        if (bVar instanceof x0.b.C2395b) {
                            aVar5 = this.stateHolder;
                            aVar6 = ((j0.a) aVar5).lock;
                            gVar.f100861d = bVar;
                            gVar.f100862e = aVar5;
                            gVar.f100863f = aVar6;
                            gVar.f100866j = 4;
                            if (aVar6.h(null, gVar) != objE) {
                                bVar3 = bVar;
                                j0Var2 = ((j0.a) aVar5).state;
                                yVar2 = y.REFRESH;
                                zR = j0Var2.r(0, yVar2, (x0.b.C2395b) bVar3);
                                e0 sourceLoadStates4 = j0Var2.getSourceLoadStates();
                                companion = w.NotLoading.INSTANCE;
                                sourceLoadStates4.c(yVar2, companion.b());
                                if (((x0.b.C2395b) bVar3).i() == null) {
                                    j0Var2.getSourceLoadStates().c(y.PREPEND, companion.a());
                                }
                                if (((x0.b.C2395b) bVar3).h() == null) {
                                    j0Var2.getSourceLoadStates().c(y.APPEND, companion.a());
                                }
                                aVar6.r(null);
                                if (!zR) {
                                    v0Var3 = v0.f101202a;
                                    if (v0Var3.a(2)) {
                                        v0Var3.b(2, y(yVar2, this.initialKey, null), null);
                                    }
                                    bVar4 = bVar3;
                                    if (this.remoteMediatorConnection != null) {
                                        c2395b = (x0.b.C2395b) bVar4;
                                        if (c2395b.i() != null) {
                                        }
                                        aVar10 = this.stateHolder;
                                        aVar11 = ((j0.a) aVar10).lock;
                                        gVar.f100861d = bVar4;
                                        gVar.f100862e = aVar10;
                                        gVar.f100863f = aVar11;
                                        gVar.f100866j = 7;
                                        if (aVar11.h(null, gVar) != objE) {
                                            aVar12 = aVar11;
                                            bVar6 = bVar4;
                                            pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                                            aVar12.r(null);
                                            c2395b2 = (x0.b.C2395b) bVar6;
                                            if (c2395b2.i() == null) {
                                                this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                                            }
                                            if (c2395b2.h() == null) {
                                                this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                                            }
                                        }
                                        break;
                                    }
                                    return oq.i0.f148189a;
                                }
                                v0Var4 = v0.f101202a;
                                if (v0Var4.a(3)) {
                                    v0Var4.b(3, y(yVar2, this.initialKey, bVar3), null);
                                }
                                aVar7 = this.stateHolder;
                                aVar8 = ((j0.a) aVar7).lock;
                                gVar.f100861d = bVar3;
                                gVar.f100862e = aVar7;
                                gVar.f100863f = aVar8;
                                gVar.f100866j = 5;
                                if (aVar8.h(null, gVar) != objE) {
                                    aVar9 = aVar8;
                                    bVar5 = bVar3;
                                    j0 j0Var7 = ((j0.a) aVar7).state;
                                    gVar2 = this.pageEventCh;
                                    f0VarU = j0Var7.u((x0.b.C2395b) bVar5, y.REFRESH);
                                    gVar.f100861d = bVar5;
                                    gVar.f100862e = aVar9;
                                    gVar.f100863f = null;
                                    gVar.f100866j = 6;
                                    if (gVar2.l(f0VarU, gVar) == objE) {
                                        bVar4 = bVar5;
                                        r15 = aVar9;
                                        oq.i0 i0Var10 = oq.i0.f148189a;
                                        r15.r(null);
                                        if (this.remoteMediatorConnection != null) {
                                            c2395b = (x0.b.C2395b) bVar4;
                                            if (c2395b.i() != null) {
                                            }
                                            aVar10 = this.stateHolder;
                                            aVar11 = ((j0.a) aVar10).lock;
                                            gVar.f100861d = bVar4;
                                            gVar.f100862e = aVar10;
                                            gVar.f100863f = aVar11;
                                            gVar.f100866j = 7;
                                            if (aVar11.h(null, gVar) != objE) {
                                                aVar12 = aVar11;
                                                bVar6 = bVar4;
                                                pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                                                aVar12.r(null);
                                                c2395b2 = (x0.b.C2395b) bVar6;
                                                if (c2395b2.i() == null) {
                                                    this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                                                }
                                                if (c2395b2.h() == null) {
                                                    this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                                                }
                                            }
                                            break;
                                        }
                                        return oq.i0.f148189a;
                                    }
                                }
                            }
                            break;
                        } else {
                            if (bVar instanceof x0.b.a) {
                                throw new oq.p();
                            }
                            v0Var2 = v0.f101202a;
                            if (v0Var2.a(2)) {
                                v0Var2.b(2, y(y.REFRESH, this.initialKey, bVar), null);
                            }
                            aVar3 = this.stateHolder;
                            aVar4 = ((j0.a) aVar3).lock;
                            gVar.f100861d = bVar;
                            gVar.f100862e = aVar3;
                            gVar.f100863f = aVar4;
                            gVar.f100866j = 8;
                            if (aVar4.h(null, gVar) != objE) {
                                bVar2 = bVar;
                                j0Var3 = ((j0.a) aVar3).state;
                                error = new w.Error(((x0.b.a) bVar2).getThrowable());
                                yVar3 = y.REFRESH;
                                gVar.f100861d = aVar4;
                                gVar.f100862e = null;
                                gVar.f100863f = null;
                                gVar.f100866j = 9;
                                if (B(j0Var3, yVar3, error, gVar) != objE) {
                                    aVar13 = aVar4;
                                    oq.i0 i0Var11 = oq.i0.f148189a;
                                    aVar13.r(null);
                                    return oq.i0.f148189a;
                                }
                            }
                        }
                        return objE;
                    case 4:
                        aVar6 = (su.a) gVar.f100863f;
                        aVar5 = (j0.a) gVar.f100862e;
                        bVar3 = (x0.b) gVar.f100861d;
                        oq.u.b(objG);
                        j0Var2 = ((j0.a) aVar5).state;
                        yVar2 = y.REFRESH;
                        zR = j0Var2.r(0, yVar2, (x0.b.C2395b) bVar3);
                        e0 sourceLoadStates5 = j0Var2.getSourceLoadStates();
                        companion = w.NotLoading.INSTANCE;
                        sourceLoadStates5.c(yVar2, companion.b());
                        if (((x0.b.C2395b) bVar3).i() == null) {
                            j0Var2.getSourceLoadStates().c(y.PREPEND, companion.a());
                        }
                        if (((x0.b.C2395b) bVar3).h() == null) {
                            j0Var2.getSourceLoadStates().c(y.APPEND, companion.a());
                            break;
                        }
                        aVar6.r(null);
                        if (!zR) {
                            v0Var3 = v0.f101202a;
                            if (v0Var3.a(2)) {
                                v0Var3.b(2, y(yVar2, this.initialKey, null), null);
                            }
                            bVar4 = bVar3;
                            if (this.remoteMediatorConnection != null) {
                                c2395b = (x0.b.C2395b) bVar4;
                                if (c2395b.i() != null) {
                                }
                                aVar10 = this.stateHolder;
                                aVar11 = ((j0.a) aVar10).lock;
                                gVar.f100861d = bVar4;
                                gVar.f100862e = aVar10;
                                gVar.f100863f = aVar11;
                                gVar.f100866j = 7;
                                if (aVar11.h(null, gVar) != objE) {
                                    aVar12 = aVar11;
                                    bVar6 = bVar4;
                                    pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                                    aVar12.r(null);
                                    c2395b2 = (x0.b.C2395b) bVar6;
                                    if (c2395b2.i() == null) {
                                        this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                                    }
                                    if (c2395b2.h() == null) {
                                        this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                                    }
                                }
                                break;
                            }
                            return oq.i0.f148189a;
                        }
                        v0Var4 = v0.f101202a;
                        if (v0Var4.a(3)) {
                            v0Var4.b(3, y(yVar2, this.initialKey, bVar3), null);
                        }
                        aVar7 = this.stateHolder;
                        aVar8 = ((j0.a) aVar7).lock;
                        gVar.f100861d = bVar3;
                        gVar.f100862e = aVar7;
                        gVar.f100863f = aVar8;
                        gVar.f100866j = 5;
                        if (aVar8.h(null, gVar) != objE) {
                            aVar9 = aVar8;
                            bVar5 = bVar3;
                            j0 j0Var8 = ((j0.a) aVar7).state;
                            gVar2 = this.pageEventCh;
                            f0VarU = j0Var8.u((x0.b.C2395b) bVar5, y.REFRESH);
                            gVar.f100861d = bVar5;
                            gVar.f100862e = aVar9;
                            gVar.f100863f = null;
                            gVar.f100866j = 6;
                            if (gVar2.l(f0VarU, gVar) == objE) {
                                bVar4 = bVar5;
                                r15 = aVar9;
                                oq.i0 i0Var12 = oq.i0.f148189a;
                                r15.r(null);
                                if (this.remoteMediatorConnection != null) {
                                    c2395b = (x0.b.C2395b) bVar4;
                                    if (c2395b.i() != null) {
                                    }
                                    aVar10 = this.stateHolder;
                                    aVar11 = ((j0.a) aVar10).lock;
                                    gVar.f100861d = bVar4;
                                    gVar.f100862e = aVar10;
                                    gVar.f100863f = aVar11;
                                    gVar.f100866j = 7;
                                    if (aVar11.h(null, gVar) != objE) {
                                        aVar12 = aVar11;
                                        bVar6 = bVar4;
                                        pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                                        aVar12.r(null);
                                        c2395b2 = (x0.b.C2395b) bVar6;
                                        if (c2395b2.i() == null) {
                                            this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                                        }
                                        if (c2395b2.h() == null) {
                                            this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                                        }
                                    }
                                    break;
                                }
                                return oq.i0.f148189a;
                            }
                        }
                        return objE;
                    case 5:
                        su.a aVar17 = (su.a) gVar.f100863f;
                        aVar7 = (j0.a) gVar.f100862e;
                        bVar5 = (x0.b) gVar.f100861d;
                        oq.u.b(objG);
                        aVar9 = aVar17;
                        j0 j0Var9 = ((j0.a) aVar7).state;
                        gVar2 = this.pageEventCh;
                        f0VarU = j0Var9.u((x0.b.C2395b) bVar5, y.REFRESH);
                        gVar.f100861d = bVar5;
                        gVar.f100862e = aVar9;
                        gVar.f100863f = null;
                        gVar.f100866j = 6;
                        if (gVar2.l(f0VarU, gVar) == objE) {
                            bVar4 = bVar5;
                            r15 = aVar9;
                            oq.i0 i0Var13 = oq.i0.f148189a;
                            r15.r(null);
                            if (this.remoteMediatorConnection != null) {
                                c2395b = (x0.b.C2395b) bVar4;
                                if (c2395b.i() != null) {
                                }
                                aVar10 = this.stateHolder;
                                aVar11 = ((j0.a) aVar10).lock;
                                gVar.f100861d = bVar4;
                                gVar.f100862e = aVar10;
                                gVar.f100863f = aVar11;
                                gVar.f100866j = 7;
                                if (aVar11.h(null, gVar) != objE) {
                                    aVar12 = aVar11;
                                    bVar6 = bVar4;
                                    pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                                    aVar12.r(null);
                                    c2395b2 = (x0.b.C2395b) bVar6;
                                    if (c2395b2.i() == null) {
                                        this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                                    }
                                    if (c2395b2.h() == null) {
                                        this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                                    }
                                }
                                break;
                            }
                            return oq.i0.f148189a;
                        }
                        return objE;
                    case 6:
                        su.a aVar18 = (su.a) gVar.f100862e;
                        bVar4 = (x0.b) gVar.f100861d;
                        oq.u.b(objG);
                        r15 = aVar18;
                        oq.i0 i0Var14 = oq.i0.f148189a;
                        r15.r(null);
                        if (this.remoteMediatorConnection != null) {
                            c2395b = (x0.b.C2395b) bVar4;
                            if (c2395b.i() != null) {
                                break;
                            }
                            aVar10 = this.stateHolder;
                            aVar11 = ((j0.a) aVar10).lock;
                            gVar.f100861d = bVar4;
                            gVar.f100862e = aVar10;
                            gVar.f100863f = aVar11;
                            gVar.f100866j = 7;
                            if (aVar11.h(null, gVar) != objE) {
                                aVar12 = aVar11;
                                bVar6 = bVar4;
                                pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                                aVar12.r(null);
                                c2395b2 = (x0.b.C2395b) bVar6;
                                if (c2395b2.i() == null) {
                                    this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                                }
                                if (c2395b2.h() == null) {
                                    this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                                }
                            }
                            return objE;
                        }
                        return oq.i0.f148189a;
                    case 7:
                        aVar12 = (su.a) gVar.f100863f;
                        aVar10 = (j0.a) gVar.f100862e;
                        bVar6 = (x0.b) gVar.f100861d;
                        oq.u.b(objG);
                        pagingStateG = ((j0.a) aVar10).state.g(this.hintHandler.e());
                        aVar12.r(null);
                        c2395b2 = (x0.b.C2395b) bVar6;
                        if (c2395b2.i() == null) {
                            this.remoteMediatorConnection.e(y.PREPEND, pagingStateG);
                        }
                        if (c2395b2.h() == null) {
                            this.remoteMediatorConnection.e(y.APPEND, pagingStateG);
                        }
                        return oq.i0.f148189a;
                    case 8:
                        aVar4 = (su.a) gVar.f100863f;
                        aVar3 = (j0.a) gVar.f100862e;
                        bVar2 = (x0.b) gVar.f100861d;
                        oq.u.b(objG);
                        j0Var3 = ((j0.a) aVar3).state;
                        error = new w.Error(((x0.b.a) bVar2).getThrowable());
                        yVar3 = y.REFRESH;
                        gVar.f100861d = aVar4;
                        gVar.f100862e = null;
                        gVar.f100863f = null;
                        gVar.f100866j = 9;
                        if (B(j0Var3, yVar3, error, gVar) != objE) {
                            aVar13 = aVar4;
                            oq.i0 i0Var15 = oq.i0.f148189a;
                            aVar13.r(null);
                            return oq.i0.f148189a;
                        }
                        return objE;
                    case 9:
                        aVar13 = (su.a) gVar.f100861d;
                        try {
                            oq.u.b(objG);
                            oq.i0 i0Var16 = oq.i0.f148189a;
                            aVar13.r(null);
                            return oq.i0.f148189a;
                        } catch (Throwable th7) {
                            th = th7;
                            aVar13.r(null);
                            throw th;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th8) {
                r15.r(null);
                throw th8;
            }
        } catch (Throwable th9) {
            r15.r(null);
            throw th9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x039a  */
    /* JADX WARN: Code duplicated, block: B:102:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:104:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:107:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:119:0x041c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0432  */
    /* JADX WARN: Code duplicated, block: B:125:0x043b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0446  */
    /* JADX WARN: Code duplicated, block: B:128:0x044f  */
    /* JADX WARN: Code duplicated, block: B:131:0x046c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0472  */
    /* JADX WARN: Code duplicated, block: B:140:0x0489  */
    /* JADX WARN: Code duplicated, block: B:144:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:147:0x04cb A[Catch: all -> 0x0503, TRY_LEAVE, TryCatch #2 {all -> 0x0503, blocks: (B:145:0x04bd, B:147:0x04cb), top: B:239:0x04bd }] */
    /* JADX WARN: Code duplicated, block: B:150:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:157:0x0521 A[Catch: all -> 0x008a, TryCatch #5 {all -> 0x008a, blocks: (B:151:0x04fa, B:155:0x050a, B:157:0x0521, B:159:0x052d, B:161:0x0535, B:163:0x0542, B:162:0x053c, B:164:0x0545, B:168:0x0575, B:14:0x0080, B:19:0x00b2), top: B:244:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0535 A[Catch: all -> 0x008a, TryCatch #5 {all -> 0x008a, blocks: (B:151:0x04fa, B:155:0x050a, B:157:0x0521, B:159:0x052d, B:161:0x0535, B:163:0x0542, B:162:0x053c, B:164:0x0545, B:168:0x0575, B:14:0x0080, B:19:0x00b2), top: B:244:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x053c A[Catch: all -> 0x008a, TryCatch #5 {all -> 0x008a, blocks: (B:151:0x04fa, B:155:0x050a, B:157:0x0521, B:159:0x052d, B:161:0x0535, B:163:0x0542, B:162:0x053c, B:164:0x0545, B:168:0x0575, B:14:0x0080, B:19:0x00b2), top: B:244:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x056d  */
    /* JADX WARN: Code duplicated, block: B:167:0x056f  */
    /* JADX WARN: Code duplicated, block: B:171:0x057f  */
    /* JADX WARN: Code duplicated, block: B:174:0x058a  */
    /* JADX WARN: Code duplicated, block: B:177:0x058f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0599  */
    /* JADX WARN: Code duplicated, block: B:183:0x059e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:87:0x0328  */
    /* JADX WARN: Code duplicated, block: B:89:0x0335  */
    /* JADX WARN: Code duplicated, block: B:90:0x0360  */
    /* JADX WARN: Code duplicated, block: B:94:0x037e  */
    /* JADX WARN: Code duplicated, block: B:97:0x038c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0397  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [ja.h0, ja.h0<Key, Value>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [su.a] */
    /* JADX WARN: Type inference failed for: r5v37, types: [su.a] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r9v44, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:182:0x059c -> B:194:0x05ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x05a0 -> B:194:0x05ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x05c5 -> B:235:0x05c9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object t(ja.y r18, ja.GenerationalViewportHint r19, tq.e<? super oq.i0> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.h0.t(ja.y, ja.o, tq.e):java.lang.Object");
    }

    private final x0.a<Key> x(y loadType, Key key) {
        return x0.a.INSTANCE.a(loadType, key, loadType == y.REFRESH ? this.config.initialLoadSize : this.config.pageSize, this.config.enablePlaceholders);
    }

    private final String y(y loadType, Key loadKey, x0.b<Key, Value> result) {
        if (result == null) {
            return "End " + loadType + " with loadkey " + loadKey + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + loadKey + ". Returned " + result;
    }

    private final Key z(j0<Key, Value> j0Var, y yVar, int i15, int i16) {
        if (i15 == j0Var.j(yVar) && !(j0Var.getSourceLoadStates().a(yVar) instanceof w.Error) && i16 < this.config.prefetchDistance) {
            return yVar == y.PREPEND ? (Key) ((x0.b.C2395b) pq.v.l0(j0Var.m())).i() : (Key) ((x0.b.C2395b) pq.v.x0(j0Var.m())).h();
        }
        return null;
    }

    public final void o(p1 viewportHint) {
        this.hintHandler.g(viewportHint);
    }

    public final void p() {
        d2.a.a(this.pageEventChannelFlowJob, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(tq.e<? super PagingState<Key, Value>> eVar) throws Throwable {
        f fVar;
        j0.a<Key, Value> aVar;
        su.a aVar2;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f100860h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f100860h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(this, eVar);
            }
        } else {
            fVar = new f(this, eVar);
        }
        Object obj = fVar.f100858f;
        Object objE = uq.b.e();
        int i16 = fVar.f100860h;
        if (i16 == 0) {
            oq.u.b(obj);
            j0.a<Key, Value> aVar3 = this.stateHolder;
            su.a aVar4 = ((j0.a) aVar3).lock;
            fVar.f100856d = aVar3;
            fVar.f100857e = aVar4;
            fVar.f100860h = 1;
            if (aVar4.h(null, fVar) == objE) {
                return objE;
            }
            aVar = aVar3;
            aVar2 = aVar4;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (su.a) fVar.f100857e;
            aVar = (j0.a) fVar.f100856d;
            oq.u.b(obj);
        }
        try {
            return ((j0.a) aVar).state.g(this.hintHandler.e());
        } finally {
            aVar2.r(null);
        }
    }

    public final mu.g<f0<Value>> u() {
        return this.pageEventFlow;
    }

    public final x0<Key, Value> v() {
        return this.pagingSource;
    }

    public final c1<Key, Value> w() {
        return this.remoteMediatorConnection;
    }
}
