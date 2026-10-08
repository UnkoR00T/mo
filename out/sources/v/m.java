package v;

/* JADX INFO: loaded from: classes.dex */
final class m extends x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f202671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f202672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f202673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f202674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f202675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f202676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f202677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f202678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f202679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f202680j;

    m(int i15, String str, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28) {
        this.f202671a = i15;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f202672b = str;
        this.f202673c = i16;
        this.f202674d = i17;
        this.f202675e = i18;
        this.f202676f = i19;
        this.f202677g = i25;
        this.f202678h = i26;
        this.f202679i = i27;
        this.f202680j = i28;
    }

    @Override // v.x1.c
    public int b() {
        return this.f202678h;
    }

    @Override // v.x1.c
    public int c() {
        return this.f202673c;
    }

    @Override // v.x1.c
    public int d() {
        return this.f202679i;
    }

    @Override // v.x1.c
    public int e() {
        return this.f202671a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1.c) {
            x1.c cVar = (x1.c) obj;
            if (this.f202671a == cVar.e() && this.f202672b.equals(cVar.i()) && this.f202673c == cVar.c() && this.f202674d == cVar.f() && this.f202675e == cVar.l() && this.f202676f == cVar.h() && this.f202677g == cVar.j() && this.f202678h == cVar.b() && this.f202679i == cVar.d() && this.f202680j == cVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // v.x1.c
    public int f() {
        return this.f202674d;
    }

    @Override // v.x1.c
    public int g() {
        return this.f202680j;
    }

    @Override // v.x1.c
    public int h() {
        return this.f202676f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f202671a ^ 1000003) * 1000003) ^ this.f202672b.hashCode()) * 1000003) ^ this.f202673c) * 1000003) ^ this.f202674d) * 1000003) ^ this.f202675e) * 1000003) ^ this.f202676f) * 1000003) ^ this.f202677g) * 1000003) ^ this.f202678h) * 1000003) ^ this.f202679i) * 1000003) ^ this.f202680j;
    }

    @Override // v.x1.c
    public String i() {
        return this.f202672b;
    }

    @Override // v.x1.c
    public int j() {
        return this.f202677g;
    }

    @Override // v.x1.c
    public int l() {
        return this.f202675e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f202671a + ", mediaType=" + this.f202672b + ", bitrate=" + this.f202673c + ", frameRate=" + this.f202674d + ", width=" + this.f202675e + ", height=" + this.f202676f + ", profile=" + this.f202677g + ", bitDepth=" + this.f202678h + ", chromaSubsampling=" + this.f202679i + ", hdrFormat=" + this.f202680j + "}";
    }
}
