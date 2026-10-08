package ph;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements ea.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f157569a;

    public h0(int i15) {
        this.f157569a = i15;
    }

    public final int a() {
        return this.f157569a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && this.f157569a == ((h0) obj).f157569a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157569a);
    }

    public final String toString() {
        int i15 = this.f157569a;
        StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 24);
        sb5.append("LicenseDetailKey(index=");
        sb5.append(i15);
        sb5.append(")");
        return sb5.toString();
    }
}
