package a8;

/* JADX INFO: loaded from: classes3.dex */
public final class b3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b3 f4256c = new b3(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4258b;

    public b3(int i15, boolean z15) {
        this.f4257a = i15;
        this.f4258b = z15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b3.class == obj.getClass()) {
            b3 b3Var = (b3) obj;
            if (this.f4257a == b3Var.f4257a && this.f4258b == b3Var.f4258b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f4257a << 1) + (this.f4258b ? 1 : 0);
    }
}
