package hi;

/* JADX INFO: loaded from: classes4.dex */
final class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f84788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f84789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f84790d;

    /* synthetic */ e(boolean z15, String str, String str2, byte[] bArr) {
        this.f84788b = z15;
        this.f84789c = str;
        this.f84790d = str2;
    }

    @Override // hi.c
    public final boolean a() {
        return this.f84788b;
    }

    @Override // hi.c
    public final String b() {
        return this.f84789c;
    }

    @Override // hi.c
    public final String c() {
        return this.f84790d;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f84788b == cVar.a() && ((str = this.f84789c) != null ? str.equals(cVar.b()) : cVar.b() == null) && ((str2 = this.f84790d) != null ? str2.equals(cVar.c()) : cVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f84789c;
        int iHashCode = (str == null ? 0 : str.hashCode()) ^ (((true != this.f84788b ? 1237 : 1231) ^ 1000003) * 1000003);
        String str2 = this.f84790d;
        return (iHashCode * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        boolean z15 = this.f84788b;
        int length = String.valueOf(z15).length();
        String str = this.f84789c;
        int length2 = String.valueOf(str).length();
        String str2 = this.f84790d;
        StringBuilder sb5 = new StringBuilder(length + 47 + length2 + 26 + String.valueOf(str2).length() + 1);
        sb5.append("AppCheckResult{appCheckEnabled=");
        sb5.append(z15);
        sb5.append(", appCheckToken=");
        sb5.append(str);
        sb5.append(", appCheckTokenFetchError=");
        sb5.append(str2);
        sb5.append("}");
        return sb5.toString();
    }
}
