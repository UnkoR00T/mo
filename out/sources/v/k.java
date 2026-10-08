package v;

/* JADX INFO: loaded from: classes.dex */
final class k extends x1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f202646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f202647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f202648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f202649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f202650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f202651f;

    k(int i15, String str, int i16, int i17, int i18, int i19) {
        this.f202646a = i15;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f202647b = str;
        this.f202648c = i16;
        this.f202649d = i17;
        this.f202650e = i18;
        this.f202651f = i19;
    }

    @Override // v.x1.a
    public int b() {
        return this.f202648c;
    }

    @Override // v.x1.a
    public int c() {
        return this.f202650e;
    }

    @Override // v.x1.a
    public int d() {
        return this.f202646a;
    }

    @Override // v.x1.a
    public String e() {
        return this.f202647b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1.a) {
            x1.a aVar = (x1.a) obj;
            if (this.f202646a == aVar.d() && this.f202647b.equals(aVar.e()) && this.f202648c == aVar.b() && this.f202649d == aVar.g() && this.f202650e == aVar.c() && this.f202651f == aVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // v.x1.a
    public int f() {
        return this.f202651f;
    }

    @Override // v.x1.a
    public int g() {
        return this.f202649d;
    }

    public int hashCode() {
        return ((((((((((this.f202646a ^ 1000003) * 1000003) ^ this.f202647b.hashCode()) * 1000003) ^ this.f202648c) * 1000003) ^ this.f202649d) * 1000003) ^ this.f202650e) * 1000003) ^ this.f202651f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f202646a + ", mediaType=" + this.f202647b + ", bitrate=" + this.f202648c + ", sampleRate=" + this.f202649d + ", channels=" + this.f202650e + ", profile=" + this.f202651f + "}";
    }
}
