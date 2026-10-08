package fh;

/* JADX INFO: loaded from: classes3.dex */
final class kj extends oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f63349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f63350c;

    /* synthetic */ kj(String str, boolean z15, int i15, jj jjVar) {
        this.f63348a = str;
        this.f63349b = z15;
        this.f63350c = i15;
    }

    @Override // fh.oj
    public final int a() {
        return this.f63350c;
    }

    @Override // fh.oj
    public final String b() {
        return this.f63348a;
    }

    @Override // fh.oj
    public final boolean c() {
        return this.f63349b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oj) {
            oj ojVar = (oj) obj;
            if (this.f63348a.equals(ojVar.b()) && this.f63349b == ojVar.c() && this.f63350c == ojVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f63348a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f63349b ? 1237 : 1231)) * 1000003) ^ this.f63350c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f63348a + ", enableFirelog=" + this.f63349b + ", firelogEventType=" + this.f63350c + "}";
    }
}
