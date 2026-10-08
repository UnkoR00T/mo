package hf;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lf.a f84069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<ye.e, f.b> f84070b;

    b(lf.a aVar, Map<ye.e, f.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f84069a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f84070b = map;
    }

    @Override // hf.f
    lf.a e() {
        return this.f84069a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f84069a.equals(fVar.e()) && this.f84070b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // hf.f
    Map<ye.e, f.b> h() {
        return this.f84070b;
    }

    public int hashCode() {
        return ((this.f84069a.hashCode() ^ 1000003) * 1000003) ^ this.f84070b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f84069a + ", values=" + this.f84070b + "}";
    }
}
