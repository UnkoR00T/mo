package i8;

import ak.n0;
import ak.x0;
import java.util.ArrayList;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<l9.e> f89921a = new ArrayList<>();

    private int f(long j15) {
        for (int i15 = 0; i15 < this.f89921a.size(); i15++) {
            if (j15 < this.f89921a.get(i15).f117219b) {
                return i15;
            }
        }
        return this.f89921a.size();
    }

    @Override // i8.a
    public n0<v7.a> a(long j15) {
        int iF = f(j15);
        if (iF == 0) {
            return n0.C();
        }
        l9.e eVar = this.f89921a.get(iF - 1);
        long j16 = eVar.f117221d;
        return (j16 == -9223372036854775807L || j15 < j16) ? eVar.f117218a : n0.C();
    }

    @Override // i8.a
    public long b(long j15) {
        if (this.f89921a.isEmpty() || j15 < this.f89921a.get(0).f117219b) {
            return -9223372036854775807L;
        }
        for (int i15 = 1; i15 < this.f89921a.size(); i15++) {
            long j16 = this.f89921a.get(i15).f117219b;
            if (j15 == j16) {
                return j16;
            }
            if (j15 < j16) {
                l9.e eVar = this.f89921a.get(i15 - 1);
                long j17 = eVar.f117221d;
                return (j17 == -9223372036854775807L || j17 > j15) ? eVar.f117219b : j17;
            }
        }
        l9.e eVar2 = (l9.e) x0.f(this.f89921a);
        long j18 = eVar2.f117221d;
        return (j18 == -9223372036854775807L || j15 < j18) ? eVar2.f117219b : j18;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // i8.a
    public boolean c(l9.e eVar, long j15) {
        boolean z15;
        p.d(eVar.f117219b != -9223372036854775807L);
        if (eVar.f117219b <= j15) {
            long j16 = eVar.f117221d;
            if (j16 == -9223372036854775807L || j15 < j16) {
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            z15 = false;
        }
        for (int size = this.f89921a.size() - 1; size >= 0; size--) {
            if (eVar.f117219b >= this.f89921a.get(size).f117219b) {
                this.f89921a.add(size + 1, eVar);
                return z15;
            }
            if (this.f89921a.get(size).f117219b <= j15) {
                z15 = false;
            }
        }
        this.f89921a.add(0, eVar);
        return z15;
    }

    @Override // i8.a
    public void clear() {
        this.f89921a.clear();
    }

    @Override // i8.a
    public long d(long j15) {
        if (this.f89921a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j15 < this.f89921a.get(0).f117219b) {
            return this.f89921a.get(0).f117219b;
        }
        for (int i15 = 1; i15 < this.f89921a.size(); i15++) {
            l9.e eVar = this.f89921a.get(i15);
            if (j15 < eVar.f117219b) {
                long j16 = this.f89921a.get(i15 - 1).f117221d;
                return (j16 == -9223372036854775807L || j16 <= j15 || j16 >= eVar.f117219b) ? eVar.f117219b : j16;
            }
        }
        long j17 = ((l9.e) x0.f(this.f89921a)).f117221d;
        if (j17 == -9223372036854775807L || j15 >= j17) {
            return Long.MIN_VALUE;
        }
        return j17;
    }

    @Override // i8.a
    public void e(long j15) {
        int iF = f(j15);
        if (iF == 0) {
            return;
        }
        long j16 = this.f89921a.get(iF - 1).f117221d;
        if (j16 == -9223372036854775807L || j16 >= j15) {
            iF--;
        }
        this.f89921a.subList(0, iF).clear();
    }
}
