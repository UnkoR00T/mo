package a8;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7.p f4400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t7.p f4401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4403e;

    public f(String str, t7.p pVar, t7.p pVar2, int i15, int i16) {
        zj.p.d(i15 == 0 || i16 == 0);
        zj.p.d(true ^ TextUtils.isEmpty(str));
        this.f4399a = str;
        this.f4400b = (t7.p) zj.p.q(pVar);
        this.f4401c = (t7.p) zj.p.q(pVar2);
        this.f4402d = i15;
        this.f4403e = i16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f4402d == fVar.f4402d && this.f4403e == fVar.f4403e && this.f4399a.equals(fVar.f4399a) && this.f4400b.equals(fVar.f4400b) && this.f4401c.equals(fVar.f4401c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f4402d) * 31) + this.f4403e) * 31) + this.f4399a.hashCode()) * 31) + this.f4400b.hashCode()) * 31) + this.f4401c.hashCode();
    }
}
