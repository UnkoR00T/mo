package jm;

import fr.k;
import hm.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jm.a.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u0000 \u001b*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u001f\u001dB\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0017J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010&R$\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010)¨\u0006+"}, d2 = {"Ljm/a;", "Ljm/a$b;", "T", "", "Lhm/a;", "mBounds", "", "mDepth", "<init>", "(Lhm/a;I)V", "", "minX", "maxX", "minY", "maxY", "(DDDD)V", "x", "y", "item", "Loq/i0;", "c", "(DDLjm/a$b;)V", "f", "()V", "searchBounds", "", "results", "e", "(Lhm/a;Ljava/util/Collection;)V", "a", "(Ljm/a$b;)V", "b", "", "d", "(Lhm/a;)Ljava/util/Collection;", "Lhm/a;", "I", "", "Ljava/util/Set;", "mItems", "", "Ljava/util/List;", "mChildren", "library_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a<T extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hm.a mBounds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int mDepth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Set<T> mItems;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<a<T>> mChildren;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ljm/a$b;", "", "Lhm/b;", "b", "()Lhm/b;", "point", "library_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        Point b();
    }

    public a(hm.a aVar, int i15) {
        this.mBounds = aVar;
        this.mDepth = i15;
    }

    private final void c(double x15, double y15, T item) {
        List<a<T>> list = this.mChildren;
        if (list == null) {
            if (this.mItems == null) {
                this.mItems = new LinkedHashSet();
            }
            this.mItems.add(item);
            if (this.mItems.size() <= 50 || this.mDepth >= 40) {
                return;
            }
            f();
            return;
        }
        hm.a aVar = this.mBounds;
        if (y15 < aVar.midY) {
            if (x15 < aVar.midX) {
                list.get(0).c(x15, y15, item);
                return;
            } else {
                list.get(1).c(x15, y15, item);
                return;
            }
        }
        if (x15 < aVar.midX) {
            list.get(2).c(x15, y15, item);
        } else {
            list.get(3).c(x15, y15, item);
        }
    }

    private final void e(hm.a searchBounds, Collection<T> results) {
        if (this.mBounds.e(searchBounds)) {
            List<a<T>> list = this.mChildren;
            if (list != null) {
                Iterator<a<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().e(searchBounds, results);
                }
            } else if (this.mItems != null) {
                if (searchBounds.b(this.mBounds)) {
                    results.addAll(this.mItems);
                    return;
                }
                for (T t15 : this.mItems) {
                    if (searchBounds.c(t15.b())) {
                        results.add(t15);
                    }
                }
            }
        }
    }

    private final void f() {
        ArrayList arrayList = new ArrayList(4);
        this.mChildren = arrayList;
        hm.a aVar = this.mBounds;
        arrayList.add(new a(new hm.a(aVar.minX, aVar.midX, aVar.minY, aVar.midY), this.mDepth + 1));
        List<a<T>> list = this.mChildren;
        hm.a aVar2 = this.mBounds;
        list.add(new a<>(new hm.a(aVar2.midX, aVar2.maxX, aVar2.minY, aVar2.midY), this.mDepth + 1));
        List<a<T>> list2 = this.mChildren;
        hm.a aVar3 = this.mBounds;
        list2.add(new a<>(new hm.a(aVar3.minX, aVar3.midX, aVar3.midY, aVar3.maxY), this.mDepth + 1));
        List<a<T>> list3 = this.mChildren;
        hm.a aVar4 = this.mBounds;
        list3.add(new a<>(new hm.a(aVar4.midX, aVar4.maxX, aVar4.midY, aVar4.maxY), this.mDepth + 1));
        Set<T> set = this.mItems;
        this.mItems = null;
        if (set != null) {
            for (T t15 : set) {
                c(t15.b().x, t15.b().y, t15);
            }
        }
    }

    public final void a(T item) {
        Point pointB = item.b();
        if (this.mBounds.a(pointB.x, pointB.y)) {
            c(pointB.x, pointB.y, item);
        }
    }

    public final void b() {
        this.mChildren = null;
        Set<T> set = this.mItems;
        if (set != null) {
            set.clear();
        }
    }

    public final Collection<T> d(hm.a searchBounds) {
        ArrayList arrayList = new ArrayList();
        e(searchBounds, arrayList);
        return arrayList;
    }

    public /* synthetic */ a(hm.a aVar, int i15, int i16, k kVar) {
        this(aVar, (i16 & 2) != 0 ? 0 : i15);
    }

    public a(double d15, double d16, double d17, double d18) {
        this(new hm.a(d15, d16, d17, d18), 0, 2, (k) null);
    }
}
