package fy;

import fr.k;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: fy.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lfy/a;", "T", "", "", "items", "Lfy/b;", "nextPage", "<init>", "(Ljava/util/List;Lfy/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lfy/b;", "()Lfy/b;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Page<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<T> items;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b nextPage;

    /* JADX WARN: Multi-variable type inference failed */
    public Page() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<T> a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getNextPage() {
        return this.nextPage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Page)) {
            return false;
        }
        Page page = (Page) other;
        return t.c(this.items, page.items) && t.c(this.nextPage, page.nextPage);
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + this.nextPage.hashCode();
    }

    public String toString() {
        return "Page(items=" + this.items + ", nextPage=" + this.nextPage + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Page(List<? extends T> list, b bVar) {
        this.items = list;
        this.nextPage = bVar;
    }

    public /* synthetic */ Page(List list, b bVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? v.n() : list, (i15 & 2) != 0 ? b.a.f68798a : bVar);
    }
}
