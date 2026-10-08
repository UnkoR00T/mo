package ja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0010\u0010\u000fJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J%\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0000¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R&\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R,\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u00101R$\u00108\u001a\u00020\n2\u0006\u00103\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0016\u0010:\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0016\u0010;\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00105R\u0016\u0010<\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR$\u0010J\u001a\u00020F2\u0006\u00103\u001a\u00020F8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b6\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u00107R$\u0010P\u001a\u00020\n2\u0006\u00103\u001a\u00020\n8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bM\u00107\"\u0004\bN\u0010OR$\u0010S\u001a\u00020\n2\u0006\u00103\u001a\u00020\n8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bQ\u00107\"\u0004\bR\u0010O¨\u0006T"}, d2 = {"Lja/j0;", "", "Key", "Value", "Lja/m0;", "config", "<init>", "(Lja/m0;)V", "Lja/y;", "loadType", "", "j", "(Lja/y;)I", "Lmu/g;", "f", "()Lmu/g;", "e", "Lja/x0$b$b;", "Lja/f0;", "u", "(Lja/x0$b$b;Lja/y;)Lja/f0;", "loadId", "page", "", "r", "(ILja/y;Lja/x0$b$b;)Z", "Lja/f0$a;", "event", "Loq/i0;", "h", "(Lja/f0$a;)V", "Lja/p1;", "hint", "i", "(Lja/y;Lja/p1;)Lja/f0$a;", "Lja/p1$a;", "viewportHint", "Lja/y0;", "g", "(Lja/p1$a;)Lja/y0;", "a", "Lja/m0;", "", "b", "Ljava/util/List;", "_pages", "", "c", "m", "()Ljava/util/List;", "pages", "value", "d", "I", "l", "()I", "initialPageIndex", "_placeholdersBefore", "_placeholdersAfter", "prependGenerationId", "appendGenerationId", "Llu/g;", "Llu/g;", "prependGenerationIdCh", "appendGenerationIdCh", "", "k", "Ljava/util/Map;", "()Ljava/util/Map;", "failedHintsByLoadType", "Lja/e0;", "Lja/e0;", "p", "()Lja/e0;", "sourceLoadStates", "q", "storageCount", "o", "t", "(I)V", "placeholdersBefore", "n", "s", "placeholdersAfter", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m0 config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<x0.b.C2395b<Key, Value>> _pages;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<x0.b.C2395b<Key, Value>> pages;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int initialPageIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int _placeholdersBefore;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int _placeholdersAfter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int prependGenerationId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int appendGenerationId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final lu.g<Integer> prependGenerationIdCh;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final lu.g<Integer> appendGenerationIdCh;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Map<y, p1> failedHintsByLoadType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private e0 sourceLoadStates;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lja/j0$a;", "", "Key", "Value", "Lja/m0;", "config", "<init>", "(Lja/m0;)V", "a", "Lja/m0;", "Lsu/a;", "b", "Lsu/a;", "lock", "Lja/j0;", "c", "Lja/j0;", "state", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m0 config;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final su.a lock = su.g.b(false, 1, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final j0<Key, Value> state;

        public a(m0 m0Var) {
            this.config = m0Var;
            this.state = new j0<>(m0Var, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100967a;

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
            f100967a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 0, 0})
    static final class c extends vq.k implements er.p<mu.h<? super Integer>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j0<Key, Value> f100969f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j0<Key, Value> j0Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f100969f = j0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f100968e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            ((j0) this.f100969f).appendGenerationIdCh.d(vq.b.e(((j0) this.f100969f).appendGenerationId));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super Integer> hVar, tq.e<? super oq.i0> eVar) {
            return ((c) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f100969f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 0, 0})
    static final class d extends vq.k implements er.p<mu.h<? super Integer>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j0<Key, Value> f100971f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j0<Key, Value> j0Var, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f100971f = j0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f100970e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            ((j0) this.f100971f).prependGenerationIdCh.d(vq.b.e(((j0) this.f100971f).prependGenerationId));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super Integer> hVar, tq.e<? super oq.i0> eVar) {
            return ((d) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f100971f, eVar);
        }
    }

    public /* synthetic */ j0(m0 m0Var, fr.k kVar) {
        this(m0Var);
    }

    public final mu.g<Integer> e() {
        return mu.i.U(mu.i.n(this.appendGenerationIdCh), new c(this, null));
    }

    public final mu.g<Integer> f() {
        return mu.i.U(mu.i.n(this.prependGenerationIdCh), new d(this, null));
    }

    public final PagingState<Key, Value> g(p1.a viewportHint) {
        Integer numValueOf;
        List listF1 = pq.v.f1(this.pages);
        if (viewportHint != null) {
            int iO = o();
            int i15 = -this.initialPageIndex;
            int iP = pq.v.p(this.pages) - this.initialPageIndex;
            int pageOffset = viewportHint.getPageOffset();
            int i16 = i15;
            while (i16 < pageOffset) {
                iO += i16 > iP ? this.config.pageSize : this.pages.get(this.initialPageIndex + i16).e().size();
                i16++;
            }
            int indexInPage = iO + viewportHint.getIndexInPage();
            if (viewportHint.getPageOffset() < i15) {
                indexInPage -= this.config.pageSize;
            }
            numValueOf = Integer.valueOf(indexInPage);
        } else {
            numValueOf = null;
        }
        return new PagingState<>(listF1, numValueOf, this.config, o());
    }

    public final void h(f0.a<Value> event) {
        if (event.f() > this.pages.size()) {
            throw new IllegalStateException(("invalid drop count. have " + this.pages.size() + " but wanted to drop " + event.f()).toString());
        }
        this.failedHintsByLoadType.remove(event.getLoadType());
        this.sourceLoadStates.c(event.getLoadType(), w.NotLoading.INSTANCE.b());
        int i15 = b.f100967a[event.getLoadType().ordinal()];
        if (i15 == 2) {
            int iF = event.f();
            for (int i16 = 0; i16 < iF; i16++) {
                this._pages.remove(0);
            }
            this.initialPageIndex -= event.f();
            t(event.getPlaceholdersRemaining());
            int i17 = this.prependGenerationId + 1;
            this.prependGenerationId = i17;
            this.prependGenerationIdCh.d(Integer.valueOf(i17));
            return;
        }
        if (i15 != 3) {
            throw new IllegalArgumentException("cannot drop " + event.getLoadType());
        }
        int iF2 = event.f();
        for (int i18 = 0; i18 < iF2; i18++) {
            this._pages.remove(this.pages.size() - 1);
        }
        s(event.getPlaceholdersRemaining());
        int i19 = this.appendGenerationId + 1;
        this.appendGenerationId = i19;
        this.appendGenerationIdCh.d(Integer.valueOf(i19));
    }

    public final f0.a<Value> i(y loadType, p1 hint) {
        int size;
        if (this.config.maxSize == Integer.MAX_VALUE || this.pages.size() <= 2 || q() <= this.config.maxSize) {
            return null;
        }
        if (loadType == y.REFRESH) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
        }
        int iO = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < this.pages.size() && q() - i16 > this.config.maxSize) {
            int[] iArr = b.f100967a;
            if (iArr[loadType.ordinal()] == 2) {
                size = this.pages.get(i15).e().size();
            } else {
                List<x0.b.C2395b<Key, Value>> list = this.pages;
                size = list.get(pq.v.p(list) - i15).e().size();
            }
            if (((iArr[loadType.ordinal()] == 2 ? hint.getPresentedItemsBefore() : hint.getPresentedItemsAfter()) - i16) - size < this.config.prefetchDistance) {
                break;
            }
            i16 += size;
            i15++;
        }
        if (i15 == 0) {
            return null;
        }
        int[] iArr2 = b.f100967a;
        int iP = iArr2[loadType.ordinal()] == 2 ? -this.initialPageIndex : (pq.v.p(this.pages) - this.initialPageIndex) - (i15 - 1);
        int iP2 = iArr2[loadType.ordinal()] == 2 ? (i15 - 1) - this.initialPageIndex : pq.v.p(this.pages) - this.initialPageIndex;
        if (this.config.enablePlaceholders) {
            iO = (loadType == y.PREPEND ? o() : n()) + i16;
        }
        return new f0.a<>(loadType, iP, iP2, iO);
    }

    public final int j(y loadType) {
        int i15 = b.f100967a[loadType.ordinal()];
        if (i15 == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i15 == 2) {
            return this.prependGenerationId;
        }
        if (i15 == 3) {
            return this.appendGenerationId;
        }
        throw new oq.p();
    }

    public final Map<y, p1> k() {
        return this.failedHintsByLoadType;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getInitialPageIndex() {
        return this.initialPageIndex;
    }

    public final List<x0.b.C2395b<Key, Value>> m() {
        return this.pages;
    }

    public final int n() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersAfter;
        }
        return 0;
    }

    public final int o() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersBefore;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final e0 getSourceLoadStates() {
        return this.sourceLoadStates;
    }

    public final int q() {
        Iterator<T> it = this.pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((x0.b.C2395b) it.next()).e().size();
        }
        return size;
    }

    public final boolean r(int loadId, y loadType, x0.b.C2395b<Key, Value> page) {
        int i15 = b.f100967a[loadType.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    throw new oq.p();
                }
                if (this.pages.isEmpty()) {
                    throw new IllegalStateException("should've received an init before append");
                }
                if (loadId != this.appendGenerationId) {
                    return false;
                }
                this._pages.add(page);
                s(page.getItemsAfter() == Integer.MIN_VALUE ? lr.m.e(n() - page.e().size(), 0) : page.getItemsAfter());
                this.failedHintsByLoadType.remove(y.APPEND);
            } else {
                if (this.pages.isEmpty()) {
                    throw new IllegalStateException("should've received an init before prepend");
                }
                if (loadId != this.prependGenerationId) {
                    return false;
                }
                this._pages.add(0, page);
                this.initialPageIndex++;
                t(page.getItemsBefore() == Integer.MIN_VALUE ? lr.m.e(o() - page.e().size(), 0) : page.getItemsBefore());
                this.failedHintsByLoadType.remove(y.PREPEND);
            }
        } else {
            if (!this.pages.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (loadId != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            this._pages.add(page);
            this.initialPageIndex = 0;
            s(page.getItemsAfter());
            t(page.getItemsBefore());
            oq.i0 i0Var = oq.i0.f148189a;
        }
        return true;
    }

    public final void s(int i15) {
        if (i15 == Integer.MIN_VALUE) {
            i15 = 0;
        }
        this._placeholdersAfter = i15;
    }

    public final void t(int i15) {
        if (i15 == Integer.MIN_VALUE) {
            i15 = 0;
        }
        this._placeholdersBefore = i15;
    }

    public final f0<Value> u(x0.b.C2395b<Key, Value> c2395b, y yVar) {
        int[] iArr = b.f100967a;
        int i15 = iArr[yVar.ordinal()];
        int size = 0;
        if (i15 != 1) {
            if (i15 == 2) {
                size = 0 - this.initialPageIndex;
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                size = (this.pages.size() - this.initialPageIndex) - 1;
            }
        }
        List listE = pq.v.e(new TransformablePage(size, c2395b.e()));
        int i16 = iArr[yVar.ordinal()];
        if (i16 == 1) {
            return f0.b.INSTANCE.c(listE, o(), n(), this.sourceLoadStates.d(), null);
        }
        if (i16 == 2) {
            return f0.b.INSTANCE.b(listE, o(), this.sourceLoadStates.d(), null);
        }
        if (i16 == 3) {
            return f0.b.INSTANCE.a(listE, n(), this.sourceLoadStates.d(), null);
        }
        throw new oq.p();
    }

    private j0(m0 m0Var) {
        this.config = m0Var;
        ArrayList arrayList = new ArrayList();
        this._pages = arrayList;
        this.pages = arrayList;
        this.prependGenerationIdCh = lu.j.b(-1, null, null, 6, null);
        this.appendGenerationIdCh = lu.j.b(-1, null, null, 6, null);
        this.failedHintsByLoadType = new LinkedHashMap();
        e0 e0Var = new e0();
        e0Var.c(y.REFRESH, w.Loading.f101205b);
        this.sourceLoadStates = e0Var;
    }
}
