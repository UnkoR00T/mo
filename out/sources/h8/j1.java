package h8;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j1 f81614d = new j1(new t7.f0[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f81615e = w7.o0.u0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ak.n0<t7.f0> f81617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f81618c;

    public j1(t7.f0... f0VarArr) {
        this.f81617b = ak.n0.w(f0VarArr);
        this.f81616a = f0VarArr.length;
        e();
    }

    private void e() {
        int i15 = 0;
        while (i15 < this.f81617b.size()) {
            int i16 = i15 + 1;
            for (int i17 = i16; i17 < this.f81617b.size(); i17++) {
                if (this.f81617b.get(i15).equals(this.f81617b.get(i17))) {
                    w7.t.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i15 = i16;
        }
    }

    public t7.f0 b(int i15) {
        return this.f81617b.get(i15);
    }

    public ak.n0<Integer> c() {
        return ak.n0.v(ak.a1.k(this.f81617b, new zj.g() { // from class: h8.i1
            @Override // zj.g
            public final Object apply(Object obj) {
                return Integer.valueOf(((t7.f0) obj).f188179c);
            }
        }));
    }

    public int d(t7.f0 f0Var) {
        int iIndexOf = this.f81617b.indexOf(f0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.f81616a == j1Var.f81616a && this.f81617b.equals(j1Var.f81617b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f81618c == 0) {
            this.f81618c = this.f81617b.hashCode();
        }
        return this.f81618c;
    }

    public String toString() {
        return this.f81617b.toString();
    }
}
