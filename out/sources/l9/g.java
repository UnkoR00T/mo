package l9;

import ak.n0;
import ak.n1;
import ak.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
final class g implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n1<e> f117222c = n1.d().f(new zj.g() { // from class: l9.f
        @Override // zj.g
        public final Object apply(Object obj) {
            return Long.valueOf(g.d(((e) obj).f117219b));
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0<n0<v7.a>> f117223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f117224b;

    /* JADX WARN: Code duplicated, block: B:24:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    public g(List<e> list) {
        if (list.size() == 1) {
            e eVar = (e) x0.h(list);
            long jD = d(eVar.f117219b);
            if (eVar.f117220c == -9223372036854775807L) {
                this.f117223a = n0.E(eVar.f117218a);
                this.f117224b = new long[]{jD};
                return;
            } else {
                this.f117223a = n0.F(eVar.f117218a, n0.C());
                this.f117224b = new long[]{jD, eVar.f117220c + jD};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f117224b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        n0 n0VarT = n0.T(f117222c, list);
        int i15 = 0;
        for (int i16 = 0; i16 < n0VarT.size(); i16++) {
            e eVar2 = (e) n0VarT.get(i16);
            long jD2 = d(eVar2.f117219b);
            long j15 = eVar2.f117220c + jD2;
            if (i15 != 0) {
                int i17 = i15 - 1;
                long j16 = this.f117224b[i17];
                if (j16 < jD2) {
                    this.f117224b[i15] = jD2;
                    arrayList.add(eVar2.f117218a);
                    i15++;
                } else if (j16 == jD2 && ((n0) arrayList.get(i17)).isEmpty()) {
                    arrayList.set(i17, eVar2.f117218a);
                } else {
                    w7.t.h("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f117224b[i17] = jD2;
                    arrayList.set(i17, eVar2.f117218a);
                }
            } else {
                this.f117224b[i15] = jD2;
                arrayList.add(eVar2.f117218a);
                i15++;
            }
            if (eVar2.f117220c != -9223372036854775807L) {
                this.f117224b[i15] = j15;
                arrayList.add(n0.C());
                i15++;
            }
        }
        this.f117223a = n0.v(arrayList);
    }

    private static long d(long j15) {
        if (j15 == -9223372036854775807L) {
            return 0L;
        }
        return j15;
    }

    @Override // l9.k
    public int b(long j15) {
        int iD = o0.d(this.f117224b, j15, false, false);
        if (iD < this.f117223a.size()) {
            return iD;
        }
        return -1;
    }

    @Override // l9.k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n0<v7.a> e(long j15) {
        int iG = o0.g(this.f117224b, j15, true, false);
        return iG == -1 ? n0.C() : this.f117223a.get(iG);
    }

    @Override // l9.k
    public long g(int i15) {
        zj.p.d(i15 < this.f117223a.size());
        return this.f117224b[i15];
    }

    @Override // l9.k
    public int j() {
        return this.f117223a.size();
    }
}
