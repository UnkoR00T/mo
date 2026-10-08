package ja;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ja.y0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B=\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%¨\u0006&"}, d2 = {"Lja/y0;", "", "Key", "Value", "", "Lja/x0$b$b;", "pages", "", "anchorPosition", "Lja/m0;", "config", "leadingPlaceholderCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Lja/m0;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "(I)Ljava/lang/Object;", "c", "(I)Lja/x0$b$b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Lja/m0;", "getConfig", "()Lja/m0;", "I", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PagingState<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<x0.b.C2395b<Key, Value>> pages;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer anchorPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final m0 config;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int leadingPlaceholderCount;

    public PagingState(List<x0.b.C2395b<Key, Value>> list, Integer num, m0 m0Var, int i15) {
        this.pages = list;
        this.anchorPosition = num;
        this.config = m0Var;
        this.leadingPlaceholderCount = i15;
    }

    public final Value b(int anchorPosition) {
        List<x0.b.C2395b<Key, Value>> list = this.pages;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((x0.b.C2395b) it.next()).e().isEmpty()) {
                int size = anchorPosition - this.leadingPlaceholderCount;
                int i15 = 0;
                while (i15 < pq.v.p(e()) && size > pq.v.p(e().get(i15).e())) {
                    size -= e().get(i15).e().size();
                    i15++;
                }
                Iterator<T> it4 = this.pages.iterator();
                while (it4.hasNext()) {
                    x0.b.C2395b c2395b = (x0.b.C2395b) it4.next();
                    if (!c2395b.e().isEmpty()) {
                        List<x0.b.C2395b<Key, Value>> list2 = this.pages;
                        ListIterator<x0.b.C2395b<Key, Value>> listIterator = list2.listIterator(list2.size());
                        while (listIterator.hasPrevious()) {
                            x0.b.C2395b<Key, Value> c2395bPrevious = listIterator.previous();
                            if (!c2395bPrevious.e().isEmpty()) {
                                if (size < 0) {
                                    return (Value) pq.v.l0(c2395b.e());
                                }
                                return (i15 != pq.v.p(this.pages) || size <= pq.v.p(((x0.b.C2395b) pq.v.x0(this.pages)).e())) ? this.pages.get(i15).e().get(size) : (Value) pq.v.x0(c2395bPrevious.e());
                            }
                        }
                        throw new NoSuchElementException("List contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        return null;
    }

    public final x0.b.C2395b<Key, Value> c(int anchorPosition) {
        List<x0.b.C2395b<Key, Value>> list = this.pages;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((x0.b.C2395b) it.next()).e().isEmpty()) {
                int size = anchorPosition - this.leadingPlaceholderCount;
                int i15 = 0;
                while (i15 < pq.v.p(e()) && size > pq.v.p(e().get(i15).e())) {
                    size -= e().get(i15).e().size();
                    i15++;
                }
                return size < 0 ? (x0.b.C2395b) pq.v.l0(this.pages) : this.pages.get(i15);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getAnchorPosition() {
        return this.anchorPosition;
    }

    public final List<x0.b.C2395b<Key, Value>> e() {
        return this.pages;
    }

    public boolean equals(Object other) {
        if (!(other instanceof PagingState)) {
            return false;
        }
        PagingState pagingState = (PagingState) other;
        return fr.t.c(this.pages, pagingState.pages) && fr.t.c(this.anchorPosition, pagingState.anchorPosition) && fr.t.c(this.config, pagingState.config) && this.leadingPlaceholderCount == pagingState.leadingPlaceholderCount;
    }

    public int hashCode() {
        int iHashCode = this.pages.hashCode();
        Integer num = this.anchorPosition;
        return iHashCode + (num != null ? num.hashCode() : 0) + this.config.hashCode() + Integer.hashCode(this.leadingPlaceholderCount);
    }

    public String toString() {
        return "PagingState(pages=" + this.pages + ", anchorPosition=" + this.anchorPosition + ", config=" + this.config + ", leadingPlaceholderCount=" + this.leadingPlaceholderCount + ')';
    }
}
