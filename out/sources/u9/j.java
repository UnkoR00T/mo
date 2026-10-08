package u9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l9.k;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<d> f196571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f196572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f196573c;

    public j(List<d> list) {
        this.f196571a = Collections.unmodifiableList(new ArrayList(list));
        this.f196572b = new long[list.size() * 2];
        for (int i15 = 0; i15 < list.size(); i15++) {
            d dVar = list.get(i15);
            int i16 = i15 * 2;
            long[] jArr = this.f196572b;
            jArr[i16] = dVar.f196542b;
            jArr[i16 + 1] = dVar.f196543c;
        }
        long[] jArr2 = this.f196572b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f196573c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // l9.k
    public int b(long j15) {
        int iD = o0.d(this.f196573c, j15, false, false);
        if (iD < this.f196573c.length) {
            return iD;
        }
        return -1;
    }

    @Override // l9.k
    public List<v7.a> e(long j15) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i15 = 0; i15 < this.f196571a.size(); i15++) {
            long[] jArr = this.f196572b;
            int i16 = i15 * 2;
            if (jArr[i16] <= j15 && j15 < jArr[i16 + 1]) {
                d dVar = this.f196571a.get(i15);
                v7.a aVar = dVar.f196541a;
                if (aVar.f204172e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: u9.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((d) obj).f196542b, ((d) obj2).f196542b);
            }
        });
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            arrayList.add(((d) arrayList2.get(i17)).f196541a.a().h((-1) - i17, 1).a());
        }
        return arrayList;
    }

    @Override // l9.k
    public long g(int i15) {
        p.d(i15 >= 0);
        p.d(i15 < this.f196573c.length);
        return this.f196573c[i15];
    }

    @Override // l9.k
    public int j() {
        return this.f196573c.length;
    }
}
