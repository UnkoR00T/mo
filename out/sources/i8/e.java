package i8;

import ak.n0;
import ak.n1;
import java.util.ArrayList;
import java.util.List;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n1<l9.e> f89919b = n1.d().f(new zj.g() { // from class: i8.c
        @Override // zj.g
        public final Object apply(Object obj) {
            return Long.valueOf(((l9.e) obj).f117219b);
        }
    }).a(n1.d().g().f(new zj.g() { // from class: i8.d
        @Override // zj.g
        public final Object apply(Object obj) {
            return Long.valueOf(((l9.e) obj).f117220c);
        }
    }));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<l9.e> f89920a = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i8.a
    public n0<v7.a> a(long j15) {
        if (!this.f89920a.isEmpty()) {
            if (j15 >= this.f89920a.get(0).f117219b) {
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < this.f89920a.size(); i15++) {
                    l9.e eVar = this.f89920a.get(i15);
                    if (j15 >= eVar.f117219b && j15 < eVar.f117221d) {
                        arrayList.add(eVar);
                    }
                    if (j15 < eVar.f117219b) {
                        break;
                    }
                }
                n0 n0VarT = n0.T(f89919b, arrayList);
                n0.a aVarS = n0.s();
                for (int i16 = 0; i16 < n0VarT.size(); i16++) {
                    aVarS.j(((l9.e) n0VarT.get(i16)).f117218a);
                }
                return aVarS.k();
            }
        }
        return n0.C();
    }

    @Override // i8.a
    public long b(long j15) {
        if (this.f89920a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j15 < this.f89920a.get(0).f117219b) {
            return -9223372036854775807L;
        }
        long jMax = this.f89920a.get(0).f117219b;
        for (int i15 = 0; i15 < this.f89920a.size(); i15++) {
            long j16 = this.f89920a.get(i15).f117219b;
            long j17 = this.f89920a.get(i15).f117221d;
            if (j17 > j15) {
                if (j16 > j15) {
                    break;
                }
                jMax = Math.max(jMax, j16);
            } else {
                jMax = Math.max(jMax, j17);
            }
        }
        return jMax;
    }

    @Override // i8.a
    public boolean c(l9.e eVar, long j15) {
        p.d(eVar.f117219b != -9223372036854775807L);
        p.d(eVar.f117220c != -9223372036854775807L);
        boolean z15 = eVar.f117219b <= j15 && j15 < eVar.f117221d;
        for (int size = this.f89920a.size() - 1; size >= 0; size--) {
            if (eVar.f117219b >= this.f89920a.get(size).f117219b) {
                this.f89920a.add(size + 1, eVar);
                return z15;
            }
        }
        this.f89920a.add(0, eVar);
        return z15;
    }

    @Override // i8.a
    public void clear() {
        this.f89920a.clear();
    }

    @Override // i8.a
    public long d(long j15) {
        long jMin = -9223372036854775807L;
        for (int i15 = 0; i15 < this.f89920a.size(); i15++) {
            long j16 = this.f89920a.get(i15).f117219b;
            long j17 = this.f89920a.get(i15).f117221d;
            if (j15 < j16) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j16);
                    break;
                }
                jMin = j16;
                break;
            }
            if (j15 < j17) {
                jMin = jMin == -9223372036854775807L ? j17 : Math.min(jMin, j17);
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // i8.a
    public void e(long j15) {
        int i15 = 0;
        while (i15 < this.f89920a.size()) {
            long j16 = this.f89920a.get(i15).f117219b;
            if (j15 > j16 && j15 > this.f89920a.get(i15).f117221d) {
                this.f89920a.remove(i15);
                i15--;
            } else if (j15 < j16) {
                return;
            }
            i15++;
        }
    }
}
