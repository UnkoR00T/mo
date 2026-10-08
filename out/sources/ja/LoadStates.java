package ja;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ja.x, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010#\u001a\u00020\u00168\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010%\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b$\u0010\"¨\u0006&"}, d2 = {"Lja/x;", "", "Lja/w;", "refresh", "prepend", "append", "<init>", "(Lja/w;Lja/w;Lja/w;)V", "Lja/y;", "loadType", "newState", "i", "(Lja/y;Lja/w;)Lja/x;", "b", "(Lja/w;Lja/w;Lja/w;)Lja/x;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lja/w;", "f", "()Lja/w;", "e", "c", "d", "Z", "g", "()Z", "hasError", "h", "isIdle", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoadStates {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final LoadStates f101210g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final w refresh;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final w prepend;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final w append;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean hasError;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isIdle;

    /* JADX INFO: renamed from: ja.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lja/x$a;", "", "<init>", "()V", "Lja/x;", "IDLE", "Lja/x;", "a", "()Lja/x;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final LoadStates a() {
            return LoadStates.f101210g;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ja.x$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101216a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101216a = iArr;
        }
    }

    static {
        w.NotLoading.Companion companion = w.NotLoading.INSTANCE;
        f101210g = new LoadStates(companion.b(), companion.b(), companion.b());
    }

    public LoadStates(w wVar, w wVar2, w wVar3) {
        this.refresh = wVar;
        this.prepend = wVar2;
        this.append = wVar3;
        this.hasError = (wVar instanceof w.Error) || (wVar3 instanceof w.Error) || (wVar2 instanceof w.Error);
        this.isIdle = (wVar instanceof w.NotLoading) && (wVar3 instanceof w.NotLoading) && (wVar2 instanceof w.NotLoading);
    }

    public static /* synthetic */ LoadStates c(LoadStates loadStates, w wVar, w wVar2, w wVar3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            wVar = loadStates.refresh;
        }
        if ((i15 & 2) != 0) {
            wVar2 = loadStates.prepend;
        }
        if ((i15 & 4) != 0) {
            wVar3 = loadStates.append;
        }
        return loadStates.b(wVar, wVar2, wVar3);
    }

    public final LoadStates b(w refresh, w prepend, w append) {
        return new LoadStates(refresh, prepend, append);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final w getAppend() {
        return this.append;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final w getPrepend() {
        return this.prepend;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadStates)) {
            return false;
        }
        LoadStates loadStates = (LoadStates) other;
        return fr.t.c(this.refresh, loadStates.refresh) && fr.t.c(this.prepend, loadStates.prepend) && fr.t.c(this.append, loadStates.append);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final w getRefresh() {
        return this.refresh;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getHasError() {
        return this.hasError;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsIdle() {
        return this.isIdle;
    }

    public int hashCode() {
        return (((this.refresh.hashCode() * 31) + this.prepend.hashCode()) * 31) + this.append.hashCode();
    }

    public final LoadStates i(y loadType, w newState) {
        int i15 = b.f101216a[loadType.ordinal()];
        if (i15 == 1) {
            return c(this, null, null, newState, 3, null);
        }
        if (i15 == 2) {
            return c(this, null, newState, null, 5, null);
        }
        if (i15 == 3) {
            return c(this, newState, null, null, 6, null);
        }
        throw new oq.p();
    }

    public String toString() {
        return "LoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ')';
    }
}
