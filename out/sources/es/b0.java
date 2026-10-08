package es;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53067c;

    public b0(int i15, int i16, int i17) {
        this.f53065a = i15;
        this.f53066b = i16;
        this.f53067c = i17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f53065a == b0Var.f53065a && this.f53066b == b0Var.f53066b && this.f53067c == b0Var.f53067c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f53065a) * 31) + Integer.hashCode(this.f53066b)) * 31) + Integer.hashCode(this.f53067c);
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f53065a);
        sb5.append('.');
        sb5.append(this.f53066b);
        sb5.append('.');
        sb5.append(this.f53067c);
        return sb5.toString();
    }
}
