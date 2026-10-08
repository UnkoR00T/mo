package t7;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f188337a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f188338a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f188339b;

        public b a(int i15) {
            zj.p.w(!this.f188339b);
            this.f188338a.append(i15, true);
            return this;
        }

        public b b(n nVar) {
            for (int i15 = 0; i15 < nVar.c(); i15++) {
                a(nVar.b(i15));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i15 : iArr) {
                a(i15);
            }
            return this;
        }

        public b d(int i15, boolean z15) {
            return z15 ? a(i15) : this;
        }

        public n e() {
            zj.p.w(!this.f188339b);
            this.f188339b = true;
            return new n(this.f188338a);
        }
    }

    public boolean a(int i15) {
        return this.f188337a.get(i15);
    }

    public int b(int i15) {
        zj.p.o(i15, c());
        return this.f188337a.keyAt(i15);
    }

    public int c() {
        return this.f188337a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f188337a.equals(((n) obj).f188337a);
        }
        return false;
    }

    public int hashCode() {
        return this.f188337a.hashCode();
    }

    private n(SparseBooleanArray sparseBooleanArray) {
        this.f188337a = sparseBooleanArray;
    }
}
