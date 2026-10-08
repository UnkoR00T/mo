package zy0;

import fr.k;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kh0.l;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import pq.l0;
import pq.m0;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lzy0/d;", "", "", "Lzy0/c;", "pointItems", "<init>", "(Ljava/util/List;)V", "Landroidx/compose/ui/graphics/Color;", "a", "(Lm2/r;I)J", "Ljava/util/List;", "b", "()Ljava/util/List;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f238499c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<PointPinItem> pointItems;

    /* JADX INFO: renamed from: zy0.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzy0/d$a;", "", "<init>", "()V", "Lkh0/l;", "Landroidx/compose/ui/graphics/Color;", "a", "(Lkh0/l;Lm2/r;I)J", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final long a(l lVar, r rVar, int i15) {
            if (t.k()) {
                t.o(-246371651, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.model.PointsCluster.Companion.toClusterColor (PointsCluster.kt:24)");
            }
            long jM20unboximpl = oy0.a.a(lVar).e().B(rVar, 0).m20unboximpl();
            if (t.k()) {
                t.n();
            }
            return jM20unboximpl;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"zy0/d$b", "Lpq/l0;", "", "b", "()Ljava/util/Iterator;", "element", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements l0<PointPinItem, l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f238501a;

        public b(Iterable iterable) {
            this.f238501a = iterable;
        }

        @Override // pq.l0
        public l a(PointPinItem element) {
            return element.getQuality();
        }

        @Override // pq.l0
        public Iterator<PointPinItem> b() {
            return this.f238501a.iterator();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e((Integer) ((Map.Entry) t16).getValue(), (Integer) ((Map.Entry) t15).getValue());
        }
    }

    public d(List<PointPinItem> list) {
        this.pointItems = list;
    }

    public final long a(r rVar, int i15) {
        rVar.X(-24416878);
        if (t.k()) {
            t.o(-24416878, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.model.PointsCluster.getClusterColor (PointsCluster.kt:12)");
        }
        List listU0 = v.U0(m0.a(new b(this.pointItems)).entrySet(), new c());
        Iterator it = listU0.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int iIntValue = ((Number) ((Map.Entry) next).getValue()).intValue();
            do {
                Object next2 = it.next();
                int iIntValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                if (iIntValue < iIntValue2) {
                    next = next2;
                    iIntValue = iIntValue2;
                }
            } while (it.hasNext());
        }
        Map.Entry entry = (Map.Entry) next;
        if (listU0.size() <= 1 || ((Number) entry.getValue()).intValue() != ((Number) ((Map.Entry) listU0.get(1)).getValue()).intValue()) {
            rVar.X(-1554205712);
            rVar.R();
            long jA = INSTANCE.a((l) entry.getKey(), rVar, 48);
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jA;
        }
        rVar.X(-1553455016);
        long j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().j();
        rVar.R();
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return j15;
    }

    public final List<PointPinItem> b() {
        return this.pointItems;
    }
}
