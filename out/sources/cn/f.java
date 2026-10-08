package cn;

/* JADX INFO: loaded from: classes4.dex */
final class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f28314d;

    /* synthetic */ f(String str, String str2, String str3, boolean z15, e eVar) {
        this.f28311a = str;
        this.f28312b = str2;
        this.f28313c = str3;
        this.f28314d = z15;
    }

    @Override // cn.a
    final String b() {
        return this.f28311a;
    }

    @Override // cn.a
    final String c() {
        return this.f28313c;
    }

    @Override // cn.a
    final String d() {
        return this.f28312b;
    }

    @Override // cn.a
    final boolean e() {
        return this.f28314d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f28311a.equals(aVar.b()) && this.f28312b.equals(aVar.d()) && this.f28313c.equals(aVar.c()) && this.f28314d == aVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f28311a.hashCode() ^ 1000003) * 1000003) ^ this.f28312b.hashCode()) * 1000003) ^ this.f28313c.hashCode()) * 1000003) ^ (true != this.f28314d ? 1237 : 1231);
    }

    public final String toString() {
        return "VkpTextRecognizerOptions{configLabel=" + this.f28311a + ", modelDir=" + this.f28312b + ", languageHint=" + this.f28313c + ", enableLowLatencyInBackground=" + this.f28314d + "}";
    }
}
