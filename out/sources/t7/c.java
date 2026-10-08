package t7;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f188120b;

    public c(int i15, float f15) {
        this.f188119a = i15;
        this.f188120b = f15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f188119a == cVar.f188119a && Float.compare(cVar.f188120b, this.f188120b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f188119a) * 31) + Float.floatToIntBits(this.f188120b);
    }
}
