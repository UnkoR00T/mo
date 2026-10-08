package x7;

import t7.v;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f217155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f217156b;

    public e(float f15, float f16) {
        p.e(f15 >= -90.0f && f15 <= 90.0f && f16 >= -180.0f && f16 <= 180.0f, "Invalid latitude or longitude");
        this.f217155a = f15;
        this.f217156b = f16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f217155a == eVar.f217155a && this.f217156b == eVar.f217156b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + ek.d.a(this.f217155a)) * 31) + ek.d.a(this.f217156b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f217155a + ", longitude=" + this.f217156b;
    }
}
