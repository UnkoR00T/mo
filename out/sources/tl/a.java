package tl;

/* JADX INFO: loaded from: classes4.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f190617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f190618b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f190617a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f190618b = str2;
    }

    @Override // tl.f
    public String b() {
        return this.f190617a;
    }

    @Override // tl.f
    public String c() {
        return this.f190618b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f190617a.equals(fVar.b()) && this.f190618b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f190617a.hashCode() ^ 1000003) * 1000003) ^ this.f190618b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f190617a + ", version=" + this.f190618b + "}";
    }
}
