package h8;

import a8.b2;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ak.n0<a> f81599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f81600b;

    private static final class a implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a1 f81601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ak.n0<Integer> f81602b;

        public a(a1 a1Var, List<Integer> list) {
            this.f81601a = a1Var;
            this.f81602b = ak.n0.v(list);
        }

        @Override // h8.a1
        public long a() {
            return this.f81601a.a();
        }

        @Override // h8.a1
        public boolean b() {
            return this.f81601a.b();
        }

        @Override // h8.a1
        public boolean c(b2 b2Var) {
            return this.f81601a.c(b2Var);
        }

        @Override // h8.a1
        public long d() {
            return this.f81601a.d();
        }

        @Override // h8.a1
        public void e(long j15) {
            this.f81601a.e(j15);
        }

        public ak.n0<Integer> f() {
            return this.f81602b;
        }
    }

    public h(List<? extends a1> list, List<List<Integer>> list2) {
        ak.n0.a aVarS = ak.n0.s();
        zj.p.d(list.size() == list2.size());
        for (int i15 = 0; i15 < list.size(); i15++) {
            aVarS.a(new a(list.get(i15), list2.get(i15)));
        }
        this.f81599a = aVarS.k();
        this.f81600b = -9223372036854775807L;
    }

    @Override // h8.a1
    public long a() {
        long jMin = Long.MAX_VALUE;
        for (int i15 = 0; i15 < this.f81599a.size(); i15++) {
            long jA = this.f81599a.get(i15).a();
            if (jA != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jA);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // h8.a1
    public boolean b() {
        for (int i15 = 0; i15 < this.f81599a.size(); i15++) {
            if (this.f81599a.get(i15).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // h8.a1
    public boolean c(b2 b2Var) {
        boolean zC;
        boolean z15 = false;
        do {
            long jA = a();
            if (jA == Long.MIN_VALUE) {
                return z15;
            }
            zC = false;
            for (int i15 = 0; i15 < this.f81599a.size(); i15++) {
                long jA2 = this.f81599a.get(i15).a();
                boolean z16 = jA2 != Long.MIN_VALUE && jA2 <= b2Var.f4250a;
                if (jA2 == jA || z16) {
                    zC |= this.f81599a.get(i15).c(b2Var);
                }
            }
            z15 |= zC;
        } while (zC);
        return z15;
    }

    @Override // h8.a1
    public long d() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i15 = 0; i15 < this.f81599a.size(); i15++) {
            a aVar = this.f81599a.get(i15);
            long jD = aVar.d();
            if ((aVar.f().contains(1) || aVar.f().contains(2) || aVar.f().contains(4)) && jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            if (jD != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jD);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f81600b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j15 = this.f81600b;
        return j15 != -9223372036854775807L ? j15 : jMin2;
    }

    @Override // h8.a1
    public void e(long j15) {
        for (int i15 = 0; i15 < this.f81599a.size(); i15++) {
            this.f81599a.get(i15).e(j15);
        }
    }
}
