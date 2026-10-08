package ch;

/* JADX INFO: loaded from: classes3.dex */
final class bk extends fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25800c;

    /* synthetic */ bk(String str, boolean z15, int i15, ak akVar) {
        this.f25798a = str;
        this.f25799b = z15;
        this.f25800c = i15;
    }

    @Override // ch.fk
    public final int a() {
        return this.f25800c;
    }

    @Override // ch.fk
    public final String b() {
        return this.f25798a;
    }

    @Override // ch.fk
    public final boolean c() {
        return this.f25799b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fk) {
            fk fkVar = (fk) obj;
            if (this.f25798a.equals(fkVar.b()) && this.f25799b == fkVar.c() && this.f25800c == fkVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f25798a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f25799b ? 1237 : 1231)) * 1000003) ^ this.f25800c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f25798a + ", enableFirelog=" + this.f25799b + ", firelogEventType=" + this.f25800c + "}";
    }
}
