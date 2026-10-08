package st;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e2 implements d2 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return b() == d2Var.b() && c() == d2Var.c() && getType().equals(d2Var.getType());
    }

    public int hashCode() {
        int iHashCode = c().hashCode();
        if (l2.w(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (b() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (b()) {
            return "*";
        }
        if (c() == p2.INVARIANT) {
            return getType().toString();
        }
        return c() + " " + getType();
    }
}
