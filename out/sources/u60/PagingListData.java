package u60;

import fr.t;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: u60.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bc\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001c\u0010(R\u001b\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r8\u0006¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b)\u0010,R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b#\u0010.¨\u0006/"}, d2 = {"Lu60/c;", "T", "", "", "items", "Lu60/k;", "orientation", "", "prefetchDistance", "", "retryOnOverscrollEnabled", "isLoading", "allLoaded", "Lfy/c;", "pageState", "Lkotlin/Function0;", "Loq/i0;", "loadAction", "<init>", "(Ljava/util/List;Lu60/k;IZZZLfy/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lu60/k;", "d", "()Lu60/k;", "c", "I", "f", "Z", "g", "()Z", "e", "h", "Lfy/c;", "()Lfy/c;", "Ler/a;", "()Ler/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PagingListData<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f195779i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<T> items;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final k orientation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int prefetchDistance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean retryOnOverscrollEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allLoaded;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final fy.c<?> pageState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> loadAction;

    /* JADX WARN: Multi-variable type inference failed */
    public PagingListData(List<? extends T> list, k kVar, int i15, boolean z15, boolean z16, boolean z17, fy.c<?> cVar, er.a<i0> aVar) {
        this.items = list;
        this.orientation = kVar;
        this.prefetchDistance = i15;
        this.retryOnOverscrollEnabled = z15;
        this.isLoading = z16;
        this.allLoaded = z17;
        this.pageState = cVar;
        this.loadAction = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAllLoaded() {
        return this.allLoaded;
    }

    public final List<T> b() {
        return this.items;
    }

    public final er.a<i0> c() {
        return this.loadAction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getOrientation() {
        return this.orientation;
    }

    public final fy.c<?> e() {
        return this.pageState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PagingListData)) {
            return false;
        }
        PagingListData pagingListData = (PagingListData) other;
        return t.c(this.items, pagingListData.items) && this.orientation == pagingListData.orientation && this.prefetchDistance == pagingListData.prefetchDistance && this.retryOnOverscrollEnabled == pagingListData.retryOnOverscrollEnabled && this.isLoading == pagingListData.isLoading && this.allLoaded == pagingListData.allLoaded && t.c(this.pageState, pagingListData.pageState) && t.c(this.loadAction, pagingListData.loadAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getPrefetchDistance() {
        return this.prefetchDistance;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getRetryOnOverscrollEnabled() {
        return this.retryOnOverscrollEnabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        return (((((((((((((this.items.hashCode() * 31) + this.orientation.hashCode()) * 31) + Integer.hashCode(this.prefetchDistance)) * 31) + Boolean.hashCode(this.retryOnOverscrollEnabled)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.allLoaded)) * 31) + this.pageState.hashCode()) * 31) + this.loadAction.hashCode();
    }

    public String toString() {
        return "PagingListData(items=" + this.items + ", orientation=" + this.orientation + ", prefetchDistance=" + this.prefetchDistance + ", retryOnOverscrollEnabled=" + this.retryOnOverscrollEnabled + ", isLoading=" + this.isLoading + ", allLoaded=" + this.allLoaded + ", pageState=" + this.pageState + ", loadAction=" + this.loadAction + ')';
    }

    public /* synthetic */ PagingListData(List list, k kVar, int i15, boolean z15, boolean z16, boolean z17, fy.c cVar, er.a aVar, int i16, fr.k kVar2) {
        this((i16 & 1) != 0 ? v.n() : list, (i16 & 2) != 0 ? k.VERTICAL : kVar, (i16 & 4) != 0 ? 10 : i15, (i16 & 8) != 0 ? true : z15, (i16 & 16) != 0 ? false : z16, (i16 & 32) != 0 ? false : z17, cVar, aVar);
    }
}
