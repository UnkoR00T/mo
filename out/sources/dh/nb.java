package dh;

/* JADX INFO: loaded from: classes3.dex */
final class nb extends rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42097c;

    /* synthetic */ nb(String str, boolean z15, int i15, lb lbVar) {
        this.f42095a = str;
        this.f42096b = z15;
        this.f42097c = i15;
    }

    @Override // dh.rb
    public final int a() {
        return this.f42097c;
    }

    @Override // dh.rb
    public final String b() {
        return this.f42095a;
    }

    @Override // dh.rb
    public final boolean c() {
        return this.f42096b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rb) {
            rb rbVar = (rb) obj;
            if (this.f42095a.equals(rbVar.b()) && this.f42096b == rbVar.c() && this.f42097c == rbVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f42095a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f42096b ? 1237 : 1231)) * 1000003) ^ this.f42097c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f42095a + ", enableFirelog=" + this.f42096b + ", firelogEventType=" + this.f42097c + "}";
    }
}
