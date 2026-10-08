package w7;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f210681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f210682b;

    public g0(int i15, int i16) {
        super(a(i15, i16));
        this.f210681a = i15;
        this.f210682b = i16;
    }

    private static String a(int i15, int i16) {
        if (i15 == 0) {
            return "Player stuck buffering and not loading for " + i16 + " ms";
        }
        if (i15 == 1) {
            return "Player stuck buffering with no progress for " + i16 + " ms";
        }
        if (i15 == 2) {
            return "Player stuck playing with no progress for " + i16 + " ms";
        }
        if (i15 == 3) {
            return "Player stuck playing without ending for " + i16 + " ms";
        }
        if (i15 != 4) {
            throw new IllegalStateException();
        }
        return "Player stuck suppressed for " + i16 + " ms";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f210681a == g0Var.f210681a && this.f210682b == g0Var.f210682b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f210681a) * 31) + this.f210682b;
    }
}
