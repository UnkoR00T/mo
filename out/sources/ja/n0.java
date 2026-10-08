package ja;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u001a*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0013BE\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001c¨\u0006\u001d"}, d2 = {"Lja/n0;", "", "T", "Lmu/g;", "Lja/f0;", "flow", "Lja/n1;", "uiReceiver", "Lja/t;", "hintReceiver", "Lkotlin/Function0;", "Lja/f0$b;", "cachedPageEvent", "<init>", "(Lmu/g;Lja/n1;Lja/t;Ler/a;)V", "c", "()Lja/f0$b;", "a", "Lmu/g;", "d", "()Lmu/g;", "b", "Lja/n1;", "f", "()Lja/n1;", "Lja/t;", "e", "()Lja/t;", "Ler/a;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n1 f101090f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final t f101091g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mu.g<f0<T>> flow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n1 uiReceiver;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t hintReceiver;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.a<f0.b<T>> cachedPageEvent;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements er.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f101096a = new a();

        a() {
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void a() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ja/n0$b", "Lja/t;", "Lja/p1;", "viewportHint", "Loq/i0;", "a", "(Lja/p1;)V", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements t {
        b() {
        }

        @Override // ja.t
        public void a(p1 viewportHint) {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"ja/n0$c", "Lja/n1;", "Loq/i0;", "a", "()V", "b", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements n1 {
        c() {
        }

        @Override // ja.n1
        public void a() {
        }

        @Override // ja.n1
        public void b() {
        }
    }

    /* JADX INFO: renamed from: ja.n0$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lja/n0$d;", "", "<init>", "()V", "T", "Lja/n0;", "c", "()Lja/n0;", "", "data", "", "placeholdersBefore", "placeholdersAfter", "e", "(Ljava/util/List;II)Lja/n0;", "Lja/n1;", "NOOP_UI_RECEIVER", "Lja/n1;", "i", "()Lja/n1;", "Lja/t;", "NOOP_HINT_RECEIVER", "Lja/t;", "h", "()Lja/t;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f0.b d() {
            return f0.b.INSTANCE.c(pq.v.e(new TransformablePage(0, pq.v.n())), 0, 0, LoadStates.INSTANCE.a(), null);
        }

        public static /* synthetic */ n0 f(Companion companion, List list, int i15, int i16, int i17, Object obj) {
            if ((i17 & 2) != 0) {
                i15 = 0;
            }
            if ((i17 & 4) != 0) {
                i16 = 0;
            }
            return companion.e(list, i15, i16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f0.b g(List list, int i15, int i16) {
            return f0.b.INSTANCE.c(pq.v.e(new TransformablePage(0, list)), i15, i16, LoadStates.INSTANCE.a(), null);
        }

        public final <T> n0<T> c() {
            return new n0<>(mu.i.K(new f0.d(pq.v.n(), null, null, 0, 0, 24, null)), i(), h(), new er.a() { // from class: ja.p0
                @Override // er.a
                public final Object a() {
                    return n0.Companion.d();
                }
            });
        }

        public final <T> n0<T> e(final List<? extends T> data, final int placeholdersBefore, final int placeholdersAfter) {
            return new n0<>(mu.i.K(new f0.d(data, null, null, placeholdersBefore, placeholdersAfter)), i(), h(), new er.a() { // from class: ja.o0
                @Override // er.a
                public final Object a() {
                    return n0.Companion.g(data, placeholdersBefore, placeholdersAfter);
                }
            });
        }

        public final t h() {
            return n0.f101091g;
        }

        public final n1 i() {
            return n0.f101090f;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0(mu.g<? extends f0<T>> gVar, n1 n1Var, t tVar, er.a<f0.b<T>> aVar) {
        this.flow = gVar;
        this.uiReceiver = n1Var;
        this.hintReceiver = tVar;
        this.cachedPageEvent = aVar;
    }

    public final f0.b<T> c() {
        return this.cachedPageEvent.a();
    }

    public final mu.g<f0<T>> d() {
        return this.flow;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final t getHintReceiver() {
        return this.hintReceiver;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final n1 getUiReceiver() {
        return this.uiReceiver;
    }

    public /* synthetic */ n0(mu.g gVar, n1 n1Var, t tVar, er.a aVar, int i15, fr.k kVar) {
        this(gVar, n1Var, tVar, (i15 & 8) != 0 ? a.f101096a : aVar);
    }
}
