package il;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class a extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f93228b;

    a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f93227a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f93228b = list;
    }

    @Override // il.r
    public List<String> b() {
        return this.f93228b;
    }

    @Override // il.r
    public String c() {
        return this.f93227a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f93227a.equals(rVar.c()) && this.f93228b.equals(rVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f93227a.hashCode() ^ 1000003) * 1000003) ^ this.f93228b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f93227a + ", usedDates=" + this.f93228b + "}";
    }
}
