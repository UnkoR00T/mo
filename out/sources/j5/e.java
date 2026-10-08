package j5;

/* JADX INFO: loaded from: classes.dex */
public class e extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f99451f;

    public e(float f15) {
        super(null);
        this.f99451f = f15;
    }

    @Override // j5.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            float fI = i();
            float fI2 = ((e) obj).i();
            if ((Float.isNaN(fI) && Float.isNaN(fI2)) || fI == fI2) {
                return true;
            }
        }
        return false;
    }

    @Override // j5.c
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f15 = this.f99451f;
        return iHashCode + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0);
    }

    @Override // j5.c
    public float i() {
        if (Float.isNaN(this.f99451f) && o()) {
            this.f99451f = Float.parseFloat(g());
        }
        return this.f99451f;
    }

    @Override // j5.c
    public int j() {
        if (Float.isNaN(this.f99451f) && o()) {
            this.f99451f = Integer.parseInt(g());
        }
        return (int) this.f99451f;
    }
}
