package ja;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ju.d2;
import ju.h2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003#!\u001fB[\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JI\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u0017*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0011R6\u0010\u0007\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010,0\u00178\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lja/g0;", "", "Key", "Value", "Lkotlin/Function1;", "Ltq/e;", "Lja/x0;", "pagingSourceFactory", "initialKey", "Lja/m0;", "config", "Lja/a1;", "remoteMediator", "<init>", "(Ler/l;Ljava/lang/Object;Lja/m0;Lja/a1;)V", "Loq/i0;", "k", "()V", "Lja/h0;", "Lju/d2;", "job", "Lja/b1;", "accessor", "Lmu/g;", "Lja/f0;", "j", "(Lja/h0;Lju/d2;Lja/b1;)Lmu/g;", "previousPagingSource", "h", "(Lja/x0;Ltq/e;)Ljava/lang/Object;", "l", "a", "Ler/l;", "b", "Ljava/lang/Object;", "c", "Lja/m0;", "Lja/k;", "", "d", "Lja/k;", "refreshEvents", "e", "retryEvents", "Lja/n0;", "f", "Lmu/g;", "i", "()Lmu/g;", "flow", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g0<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<tq.e<? super x0<Key, Value>>, Object> pagingSourceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Key initialKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m0 config;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k<Boolean> refreshEvents = new k<>(null, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k<oq.i0> retryEvents = new k<>(null, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mu.g<n0<Value>> flow;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lja/g0$a;", "", "Key", "Value", "Lja/h0;", "snapshot", "Lja/y0;", "state", "Lju/d2;", "job", "<init>", "(Lja/h0;Lja/y0;Lju/d2;)V", "a", "Lja/h0;", "b", "()Lja/h0;", "Lja/y0;", "c", "()Lja/y0;", "Lju/d2;", "()Lju/d2;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h0<Key, Value> snapshot;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final PagingState<Key, Value> state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final d2 job;

        public a(h0<Key, Value> h0Var, PagingState<Key, Value> pagingState, d2 d2Var) {
            this.snapshot = h0Var;
            this.state = pagingState;
            this.job = d2Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d2 getJob() {
            return this.job;
        }

        public final h0<Key, Value> b() {
            return this.snapshot;
        }

        public final PagingState<Key, Value> c() {
            return this.state;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lja/g0$b;", "", "Key", "Value", "Lja/t;", "Lja/h0;", "pageFetcherSnapshot", "<init>", "(Lja/g0;Lja/h0;)V", "Lja/p1;", "viewportHint", "Loq/i0;", "a", "(Lja/p1;)V", "Lja/h0;", "getPageFetcherSnapshot$paging_common", "()Lja/h0;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class b<Key, Value> implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h0<Key, Value> pageFetcherSnapshot;

        public b(h0<Key, Value> h0Var) {
            this.pageFetcherSnapshot = h0Var;
        }

        @Override // ja.t
        public void a(p1 viewportHint) {
            this.pageFetcherSnapshot.o(viewportHint);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lja/g0$c;", "Lja/n1;", "Lja/k;", "Loq/i0;", "retryEventBus", "<init>", "(Lja/g0;Lja/k;)V", "a", "()V", "b", "Lja/k;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class c implements n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final k<oq.i0> retryEventBus;

        public c(k<oq.i0> kVar) {
            this.retryEventBus = kVar;
        }

        @Override // ja.n1
        public void a() {
            this.retryEventBus.b(oq.i0.f148189a);
        }

        @Override // ja.n1
        public void b() {
            g0.this.l();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Value", "Lja/h1;", "Lja/n0;", "Loq/i0;", "<anonymous>", "(Lja/h1;)V"}, k = 3, mv = {2, 0, 0})
    static final class d extends vq.k implements er.p<h1<n0<Value>>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f100750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0<Key, Value> f100751g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends vq.k implements er.p<mu.h<? super Boolean>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f100752e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f100753f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ b1<Key, Value> f100754g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b1<Key, Value> b1Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f100754g = b1Var;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0043  */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                if (r7 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
            
                if (r1.F(r7, r6) == r0) goto L23;
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
                    int r1 = r6.f100752e
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1b
                    if (r1 != r3) goto L13
                    oq.u.b(r7)
                    goto L53
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    java.lang.Object r1 = r6.f100753f
                    mu.h r1 = (mu.h) r1
                    oq.u.b(r7)
                    goto L3a
                L23:
                    oq.u.b(r7)
                    java.lang.Object r7 = r6.f100753f
                    r1 = r7
                    mu.h r1 = (mu.h) r1
                    ja.b1<Key, Value> r7 = r6.f100754g
                    if (r7 == 0) goto L3d
                    r6.f100753f = r1
                    r6.f100752e = r4
                    java.lang.Object r7 = r7.d(r6)
                    if (r7 != r0) goto L3a
                    goto L52
                L3a:
                    ja.a1$a r7 = (ja.a1.a) r7
                    goto L3e
                L3d:
                    r7 = r2
                L3e:
                    ja.a1$a r5 = ja.a1.a.LAUNCH_INITIAL_REFRESH
                    if (r7 != r5) goto L43
                    goto L44
                L43:
                    r4 = 0
                L44:
                    java.lang.Boolean r7 = vq.b.a(r4)
                    r6.f100753f = r2
                    r6.f100752e = r3
                    java.lang.Object r7 = r1.F(r7, r6)
                    if (r7 != r0) goto L53
                L52:
                    return r0
                L53:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: ja.g0.d.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(mu.h<? super Boolean> hVar, tq.e<? super oq.i0> eVar) {
                return ((a) v(hVar, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f100754g, eVar);
                aVar.f100753f = obj;
                return aVar;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Key", "Value", "Lja/g0$a;", "previousGeneration", "", "triggerRemoteRefresh", "<anonymous>", "(Lja/g0$a;Z)Lja/g0$a;"}, k = 3, mv = {2, 0, 0})
        static final class b extends vq.k implements er.q<a<Key, Value>, Boolean, tq.e<? super a<Key, Value>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f100755e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f100756f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f100757g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ boolean f100758h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ b1<Key, Value> f100759j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ g0<Key, Value> f100760k;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
                a(Object obj) {
                    super(0, obj, g0.class, "refresh", "refresh()V", 0);
                }

                public final void E() {
                    ((g0) this.f66391b).l();
                }

                @Override // er.a
                public /* bridge */ /* synthetic */ oq.i0 a() {
                    E();
                    return oq.i0.f148189a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(b1<Key, Value> b1Var, g0<Key, Value> g0Var, tq.e<? super b> eVar) {
                super(3, eVar);
                this.f100759j = b1Var;
                this.f100760k = g0Var;
            }

            /* JADX WARN: Code duplicated, block: B:36:0x007c  */
            /* JADX WARN: Code duplicated, block: B:37:0x0081  */
            /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:58:0x00be  */
            /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
            /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
            /* JADX WARN: Code duplicated, block: B:65:0x00d0  */
            /* JADX WARN: Code duplicated, block: B:67:0x00dd  */
            /* JADX WARN: Instruction removed from duplicated block: B:67:0x00dd, please report this as an issue */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                a aVar;
                h0<Key, Value> h0VarB;
                b1<Key, Value> b1Var;
                x0 x0Var;
                PagingState<Key, Value> pagingStateC;
                h0<Key, Value> h0VarB2;
                x0 x0Var2;
                List<x0.b.C2395b<Key, Value>> listE;
                List<x0.b.C2395b<Key, Value>> list;
                PagingState<Key, Value> pagingStateC2;
                List<x0.b.C2395b<Key, Value>> listE2;
                Integer anchorPosition;
                PagingState<Key, Value> pagingState;
                Object objD;
                v0 v0Var;
                d2 job;
                h0<Key, Value> h0VarB3;
                Integer anchorPosition2;
                PagingState<Key, Value> pagingStateC3;
                Object objE = uq.b.e();
                int i15 = this.f100756f;
                if (i15 == 0) {
                    oq.u.b(obj);
                    a aVar2 = (a) this.f100757g;
                    if (this.f100758h && (b1Var = this.f100759j) != null) {
                        b1Var.a();
                    }
                    g0<Key, Value> g0Var = this.f100760k;
                    x0<Key, Value> x0VarV = (aVar2 == null || (h0VarB = aVar2.b()) == null) ? null : h0VarB.v();
                    this.f100757g = aVar2;
                    this.f100756f = 1;
                    Object objH = g0Var.h(x0VarV, this);
                    if (objH != objE) {
                        aVar = aVar2;
                        obj = objH;
                    }
                    return objE;
                }
                if (i15 == 1) {
                    aVar = (a) this.f100757g;
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x0Var2 = (x0) this.f100755e;
                    aVar = (a) this.f100757g;
                    oq.u.b(obj);
                }
                pagingStateC = (PagingState) obj;
                x0Var = x0Var2;
                if (pagingStateC != null) {
                    listE = pagingStateC.e();
                } else {
                    listE = null;
                }
                list = listE;
                if ((list != null || list.isEmpty()) && aVar != null && (pagingStateC2 = aVar.c()) != null && (listE2 = pagingStateC2.e()) != null && (!listE2.isEmpty())) {
                }
                if (pagingStateC != null) {
                    anchorPosition = pagingStateC.getAnchorPosition();
                } else {
                    anchorPosition = null;
                }
                if (anchorPosition == null) {
                    if (aVar != null || (pagingStateC3 = aVar.c()) == null) {
                        anchorPosition2 = null;
                    } else {
                        anchorPosition2 = pagingStateC3.getAnchorPosition();
                    }
                    if (anchorPosition2 != null) {
                        pagingStateC = aVar.c();
                    }
                }
                pagingState = pagingStateC;
                if (pagingState == null) {
                    objD = ((g0) this.f100760k).initialKey;
                } else {
                    objD = x0Var.d(pagingState);
                    v0Var = v0.f101202a;
                    if (v0Var.a(3)) {
                        v0Var.b(3, "Refresh key " + objD + " returned from PagingSource " + x0Var, null);
                    }
                }
                Object obj2 = objD;
                if (aVar != null && (h0VarB3 = aVar.b()) != null) {
                    h0VarB3.p();
                }
                if (aVar != null && (job = aVar.getJob()) != null) {
                    d2.a.a(job, null, 1, null);
                }
                return new a(new h0(obj2, x0Var, ((g0) this.f100760k).config, ((g0) this.f100760k).retryEvents.a(), this.f100759j, pagingState, new a(this.f100760k)), pagingState, h2.b(null, 1, null));
                x0 x0Var3 = (x0) obj;
                if (aVar != null && (h0VarB2 = aVar.b()) != null) {
                    this.f100757g = aVar;
                    this.f100755e = x0Var3;
                    this.f100756f = 2;
                    Object objR = h0VarB2.r(this);
                    if (objR != objE) {
                        x0Var2 = x0Var3;
                        obj = objR;
                        pagingStateC = (PagingState) obj;
                        x0Var = x0Var2;
                    }
                    return objE;
                }
                x0Var = x0Var3;
                pagingStateC = null;
                if (pagingStateC != null) {
                    listE = pagingStateC.e();
                } else {
                    listE = null;
                }
                list = listE;
                pagingStateC = list != null ? aVar.c() : aVar.c();
                if (pagingStateC != null) {
                    anchorPosition = pagingStateC.getAnchorPosition();
                } else {
                    anchorPosition = null;
                }
                if (anchorPosition == null) {
                    if (aVar != null) {
                        anchorPosition2 = null;
                    } else {
                        anchorPosition2 = null;
                    }
                    if (anchorPosition2 != null) {
                        pagingStateC = aVar.c();
                    }
                }
                pagingState = pagingStateC;
                if (pagingState == null) {
                    objD = ((g0) this.f100760k).initialKey;
                } else {
                    objD = x0Var.d(pagingState);
                    v0Var = v0.f101202a;
                    if (v0Var.a(3)) {
                        v0Var.b(3, "Refresh key " + objD + " returned from PagingSource " + x0Var, null);
                    }
                }
                Object obj3 = objD;
                if (aVar != null) {
                    h0VarB3.p();
                }
                if (aVar != null) {
                    d2.a.a(job, null, 1, null);
                }
                return new a(new h0(obj3, x0Var, ((g0) this.f100760k).config, ((g0) this.f100760k).retryEvents.a(), this.f100759j, pagingState, new a(this.f100760k)), pagingState, h2.b(null, 1, null));
            }

            public final Object M(a<Key, Value> aVar, boolean z15, tq.e<? super a<Key, Value>> eVar) {
                b bVar = new b(this.f100759j, this.f100760k, eVar);
                bVar.f100757g = aVar;
                bVar.f100758h = z15;
                return bVar.J(oq.i0.f148189a);
            }

            @Override // er.q
            public /* bridge */ /* synthetic */ Object w(Object obj, Boolean bool, Object obj2) {
                return M((a) obj, bool.booleanValue(), (tq.e) obj2);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Value", "Lja/f0;", "it", "Loq/i0;", "<anonymous>", "(Lja/f0;)V"}, k = 3, mv = {2, 0, 0})
        static final class c extends vq.k implements er.p<f0<Value>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f100761e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f100762f;

            c(tq.e<? super c> eVar) {
                super(2, eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f100761e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                f0 f0Var = (f0) this.f100762f;
                v0 v0Var = v0.f101202a;
                if (v0Var.a(2)) {
                    v0Var.b(2, "Sent " + f0Var, null);
                }
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(f0<Value> f0Var, tq.e<? super oq.i0> eVar) {
                return ((c) v(f0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                c cVar = new c(eVar);
                cVar.f100762f = obj;
                return cVar;
            }
        }

        /* JADX INFO: renamed from: ja.g0$d$d, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final /* synthetic */ class C2375d implements mu.h, fr.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h1<n0<Value>> f100763a;

            C2375d(h1<n0<Value>> h1Var) {
                this.f100763a = h1Var;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(n0<Value> n0Var, tq.e<? super oq.i0> eVar) {
                Object objL = this.f100763a.l(n0Var, eVar);
                return objL == uq.b.e() ? objL : oq.i0.f148189a;
            }

            @Override // fr.n
            public final oq.e<?> b() {
                return new fr.q(2, this.f100763a, h1.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof mu.h) && (obj instanceof fr.n)) {
                    return fr.t.c(b(), ((fr.n) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lmu/h;", "it", "Loq/i0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        public static final class e extends vq.k implements er.q<mu.h<? super n0<Value>>, a<Key, Value>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f100764e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f100765f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f100766g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ g0 f100767h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ b1 f100768j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(tq.e eVar, g0 g0Var, b1 b1Var) {
                super(3, eVar);
                this.f100767h = g0Var;
                this.f100768j = b1Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f100764e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    mu.h hVar = (mu.h) this.f100765f;
                    a aVar = (a) this.f100766g;
                    mu.g gVarS = mu.i.S(this.f100767h.j(aVar.b(), aVar.getJob(), this.f100768j), new c(null));
                    g0 g0Var = this.f100767h;
                    n0 n0Var = new n0(gVarS, new c(g0Var.retryEvents), new b(aVar.b()), null, 8, null);
                    this.f100764e = 1;
                    if (hVar.F(n0Var, this) == objE) {
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
            public final Object w(mu.h<? super n0<Value>> hVar, a<Key, Value> aVar, tq.e<? super oq.i0> eVar) {
                e eVar2 = new e(eVar, this.f100767h, this.f100768j);
                eVar2.f100765f = hVar;
                eVar2.f100766g = aVar;
                return eVar2.J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a1<Key, Value> a1Var, g0<Key, Value> g0Var, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f100751g = g0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f100749e;
            if (i15 == 0) {
                oq.u.b(obj);
                h1 h1Var = (h1) this.f100750f;
                mu.g gVarD = n.d(mu.i.x(n.c(mu.i.U(((g0) this.f100751g).refreshEvents.a(), new a(null, null)), null, new b(null, this.f100751g, null))), new e(null, this.f100751g, null));
                C2375d c2375d = new C2375d(h1Var);
                this.f100749e = 1;
                if (gVarD.a(c2375d, this) == objE) {
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
        public final Object B(h1<n0<Value>> h1Var, tq.e<? super oq.i0> eVar) {
            return ((d) v(h1Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = new d(null, this.f100751g, eVar);
            dVar.f100750f = obj;
            return dVar;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f100769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f100770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0<Key, Value> f100771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f100772g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g0<Key, Value> g0Var, tq.e<? super e> eVar) {
            super(eVar);
            this.f100771f = g0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f100770e = obj;
            this.f100772g |= PKIFailureInfo.systemUnavail;
            return this.f100771f.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class f extends fr.q implements er.a<oq.i0> {
        f(Object obj) {
            super(0, obj, g0.class, "invalidate", "invalidate()V", 0);
        }

        public final void E() {
            ((g0) this.f66391b).k();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class g extends fr.q implements er.a<oq.i0> {
        g(Object obj) {
            super(0, obj, g0.class, "invalidate", "invalidate()V", 0);
        }

        public final void E() {
            ((g0) this.f66391b).k();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Value", "Lja/h1;", "Lja/f0;", "Loq/i0;", "<anonymous>", "(Lja/h1;)V"}, k = 3, mv = {2, 0, 0})
    static final class h extends vq.k implements er.p<h1<f0<Value>>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f100774f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1<Key, Value> f100775g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0<Key, Value> f100776h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ e0 f100777j;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h1<f0<Value>> f100778a;

            a(h1<f0<Value>> h1Var) {
                this.f100778a = h1Var;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(f0<Value> f0Var, tq.e<? super oq.i0> eVar) {
                Object objL = this.f100778a.l(f0Var, eVar);
                return objL == uq.b.e() ? objL : oq.i0.f148189a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lja/h1;", "Loq/i0;", "<anonymous>", "(Lja/h1;)V"}, k = 3, mv = {2, 0, 0})
        public static final class b extends vq.k implements er.p<h1<f0<Value>>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f100779e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f100780f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ mu.g f100781g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ mu.g f100782h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ e0 f100783j;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"T1", "T2", "t1", "t2", "Lja/h;", "updateFrom", "Loq/i0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            public static final class a extends vq.k implements er.r<LoadStates, f0<Value>, ja.h, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f100784e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                /* synthetic */ Object f100785f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                /* synthetic */ Object f100786g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                /* synthetic */ Object f100787h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ h1<f0<Value>> f100788j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                final /* synthetic */ e0 f100789k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(h1 h1Var, tq.e eVar, e0 e0Var) {
                    super(4, eVar);
                    this.f100789k = e0Var;
                    this.f100788j = h1Var;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f100784e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        Object obj2 = this.f100785f;
                        Object obj3 = this.f100786g;
                        ja.h hVar = (ja.h) this.f100787h;
                        h1<f0<Value>> h1Var = this.f100788j;
                        Object cVar = (f0) obj3;
                        LoadStates loadStates = (LoadStates) obj2;
                        if (hVar == ja.h.RECEIVER) {
                            cVar = new f0.c(this.f100789k.d(), loadStates);
                        } else if (cVar instanceof f0.b) {
                            f0.b bVar = (f0.b) cVar;
                            this.f100789k.b(bVar.getSourceLoadStates());
                            cVar = f0.b.e(bVar, null, null, 0, 0, bVar.getSourceLoadStates(), loadStates, 15, null);
                        } else if (cVar instanceof f0.a) {
                            this.f100789k.c(((f0.a) cVar).getLoadType(), w.NotLoading.INSTANCE.b());
                        } else {
                            if (!(cVar instanceof f0.c)) {
                                if (cVar instanceof f0.d) {
                                    throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                                }
                                throw new oq.p();
                            }
                            f0.c cVar2 = (f0.c) cVar;
                            this.f100789k.b(cVar2.getSource());
                            cVar = new f0.c(cVar2.getSource(), loadStates);
                        }
                        this.f100784e = 1;
                        if (h1Var.l(cVar, this) == objE) {
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

                @Override // er.r
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object g(LoadStates loadStates, f0<Value> f0Var, ja.h hVar, tq.e<? super oq.i0> eVar) {
                    a aVar = new a(this.f100788j, eVar, this.f100789k);
                    aVar.f100785f = loadStates;
                    aVar.f100786g = f0Var;
                    aVar.f100787h = hVar;
                    return aVar.J(oq.i0.f148189a);
                }
            }

            /* JADX INFO: renamed from: ja.g0$h$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
            public static final class C2376b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f100790e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ h1<f0<Value>> f100791f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ mu.g f100792g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ AtomicInteger f100793h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ o1 f100794j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                final /* synthetic */ int f100795k;

                /* JADX INFO: renamed from: ja.g0$h$b$b$a */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class a<T> implements mu.h {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ o1 f100796a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ int f100797b;

                    /* JADX INFO: renamed from: ja.g0$h$b$b$a$a, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    static final class C2377a extends vq.d {

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        /* synthetic */ Object f100798d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        int f100799e;

                        C2377a(tq.e eVar) {
                            super(eVar);
                        }

                        @Override // vq.a
                        public final Object J(Object obj) {
                            this.f100798d = obj;
                            this.f100799e |= PKIFailureInfo.systemUnavail;
                            return a.this.F(null, this);
                        }
                    }

                    public a(o1 o1Var, int i15) {
                        this.f100796a = o1Var;
                        this.f100797b = i15;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
                    
                        if (ju.m3.a(r0) == r1) goto L21;
                     */
                    @Override // mu.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object F(java.lang.Object r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof ja.g0.h.b.C2376b.a.C2377a
                            if (r0 == 0) goto L13
                            r0 = r7
                            ja.g0$h$b$b$a$a r0 = (ja.g0.h.b.C2376b.a.C2377a) r0
                            int r1 = r0.f100799e
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f100799e = r1
                            goto L18
                        L13:
                            ja.g0$h$b$b$a$a r0 = new ja.g0$h$b$b$a$a
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.f100798d
                            java.lang.Object r1 = uq.b.e()
                            int r2 = r0.f100799e
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L38
                            if (r2 == r4) goto L34
                            if (r2 != r3) goto L2c
                            oq.u.b(r7)
                            goto L51
                        L2c:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L34:
                            oq.u.b(r7)
                            goto L48
                        L38:
                            oq.u.b(r7)
                            ja.o1 r7 = r5.f100796a
                            int r2 = r5.f100797b
                            r0.f100799e = r4
                            java.lang.Object r6 = r7.a(r2, r6, r0)
                            if (r6 != r1) goto L48
                            goto L50
                        L48:
                            r0.f100799e = r3
                            java.lang.Object r6 = ju.m3.a(r0)
                            if (r6 != r1) goto L51
                        L50:
                            return r1
                        L51:
                            oq.i0 r6 = oq.i0.f148189a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: ja.g0.h.b.C2376b.a.F(java.lang.Object, tq.e):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2376b(mu.g gVar, AtomicInteger atomicInteger, h1 h1Var, o1 o1Var, int i15, tq.e eVar) {
                    super(2, eVar);
                    this.f100792g = gVar;
                    this.f100793h = atomicInteger;
                    this.f100794j = o1Var;
                    this.f100795k = i15;
                    this.f100791f = h1Var;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f100790e;
                    try {
                        if (i15 == 0) {
                            oq.u.b(obj);
                            mu.g gVar = this.f100792g;
                            a aVar = new a(this.f100794j, this.f100795k);
                            this.f100790e = 1;
                            if (gVar.a(aVar, this) == objE) {
                                return objE;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oq.u.b(obj);
                        }
                        if (this.f100793h.decrementAndGet() == 0) {
                            lu.z.a.a(this.f100791f, null, 1, null);
                        }
                        return oq.i0.f148189a;
                    } catch (Throwable th4) {
                        if (this.f100793h.decrementAndGet() == 0) {
                            lu.z.a.a(this.f100791f, null, 1, null);
                        }
                        throw th4;
                    }
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                    return ((C2376b) v(p0Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    return new C2376b(this.f100792g, this.f100793h, this.f100791f, this.f100794j, this.f100795k, eVar);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class c implements er.a<oq.i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ ju.a0 f100801a;

                public c(ju.a0 a0Var) {
                    this.f100801a = a0Var;
                }

                @Override // er.a
                public /* bridge */ /* synthetic */ oq.i0 a() {
                    c();
                    return oq.i0.f148189a;
                }

                public final void c() {
                    d2.a.a(this.f100801a, null, 1, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(mu.g gVar, mu.g gVar2, tq.e eVar, e0 e0Var) {
                super(2, eVar);
                this.f100781g = gVar;
                this.f100782h = gVar2;
                this.f100783j = e0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f100779e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    h1 h1Var = (h1) this.f100780f;
                    AtomicInteger atomicInteger = new AtomicInteger(2);
                    o1 o1Var = new o1(new a(h1Var, null, this.f100783j));
                    ju.a0 a0VarB = h2.b(null, 1, null);
                    int i16 = 0;
                    mu.g[] gVarArr = {this.f100781g, this.f100782h};
                    int i17 = 0;
                    while (i17 < 2) {
                        h1 h1Var2 = h1Var;
                        h1Var = h1Var2;
                        ju.k.d(h1Var, a0VarB, null, new C2376b(gVarArr[i17], atomicInteger, h1Var2, o1Var, i16, null), 2, null);
                        i17++;
                        atomicInteger = atomicInteger;
                        i16++;
                        o1Var = o1Var;
                    }
                    c cVar = new c(a0VarB);
                    this.f100779e = 1;
                    if (h1Var.a0(cVar, this) == objE) {
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
            public final Object B(h1<f0<Value>> h1Var, tq.e<? super oq.i0> eVar) {
                return ((b) v(h1Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                b bVar = new b(this.f100781g, this.f100782h, eVar, this.f100783j);
                bVar.f100780f = obj;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(b1<Key, Value> b1Var, h0<Key, Value> h0Var, e0 e0Var, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f100775g = b1Var;
            this.f100776h = h0Var;
            this.f100777j = e0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f100773e;
            if (i15 == 0) {
                oq.u.b(obj);
                h1 h1Var = (h1) this.f100774f;
                mu.g gVarA = g1.a(new b(this.f100775g.getState(), this.f100776h.u(), null, this.f100777j));
                a aVar = new a(h1Var);
                this.f100773e = 1;
                if (gVarA.a(aVar, this) == objE) {
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
        public final Object B(h1<f0<Value>> h1Var, tq.e<? super oq.i0> eVar) {
            return ((h) v(h1Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = new h(this.f100775g, this.f100776h, this.f100777j, eVar);
            hVar.f100774f = obj;
            return hVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(er.l<? super tq.e<? super x0<Key, Value>>, ? extends Object> lVar, Key key, m0 m0Var, a1<Key, Value> a1Var) {
        this.pagingSourceFactory = lVar;
        this.initialKey = key;
        this.config = m0Var;
        this.flow = g1.a(new d(a1Var, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(x0<Key, Value> x0Var, tq.e<? super x0<Key, Value>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f100772g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f100772g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(this, eVar);
            }
        } else {
            eVar2 = new e(this, eVar);
        }
        Object objB = eVar2.f100770e;
        Object objE = uq.b.e();
        int i16 = eVar2.f100772g;
        if (i16 == 0) {
            oq.u.b(objB);
            er.l<tq.e<? super x0<Key, Value>>, Object> lVar = this.pagingSourceFactory;
            eVar2.f100769d = x0Var;
            eVar2.f100772g = 1;
            objB = lVar.b(eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x0Var = (x0) eVar2.f100769d;
            oq.u.b(objB);
        }
        x0 x0Var2 = (x0) objB;
        if (x0Var2 instanceof j) {
            ((j) x0Var2).a(this.config.pageSize);
        }
        if (x0Var2 == x0Var) {
            throw new IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
        }
        x0Var2.h(new f(this));
        if (x0Var != null) {
            x0Var.i(new g(this));
        }
        if (x0Var != null) {
            x0Var.e();
        }
        v0 v0Var = v0.f101202a;
        if (v0Var.a(3)) {
            v0Var.b(3, "Generated new PagingSource " + x0Var2, null);
        }
        return x0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mu.g<f0<Value>> j(h0<Key, Value> h0Var, d2 d2Var, b1<Key, Value> b1Var) {
        return b1Var == null ? h0Var.u() : ja.f.a(d2Var, new h(b1Var, h0Var, new e0(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.refreshEvents.b(Boolean.FALSE);
    }

    public final mu.g<n0<Value>> i() {
        return this.flow;
    }

    public final void l() {
        this.refreshEvents.b(Boolean.TRUE);
    }
}
