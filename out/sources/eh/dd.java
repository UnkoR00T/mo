package eh;

/* JADX INFO: loaded from: classes3.dex */
final class dd extends gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f50470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50471c;

    /* synthetic */ dd(String str, boolean z15, int i15, cd cdVar) {
        this.f50469a = str;
        this.f50470b = z15;
        this.f50471c = i15;
    }

    @Override // eh.gd
    public final int a() {
        return this.f50471c;
    }

    @Override // eh.gd
    public final String b() {
        return this.f50469a;
    }

    @Override // eh.gd
    public final boolean c() {
        return this.f50470b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gd) {
            gd gdVar = (gd) obj;
            if (this.f50469a.equals(gdVar.b()) && this.f50470b == gdVar.c() && this.f50471c == gdVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50469a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f50470b ? 1237 : 1231)) * 1000003) ^ this.f50471c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f50469a + ", enableFirelog=" + this.f50470b + ", firelogEventType=" + this.f50471c + "}";
    }
}
