package i0;

/* JADX INFO: loaded from: classes.dex */
final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f87670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f87671d;

    static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f87672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f87673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f87674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f87675d;

        b() {
        }

        @Override // i0.e.a
        public e a() {
            String str = "";
            if (this.f87672a == null) {
                str = " glVersion";
            }
            if (this.f87673b == null) {
                str = str + " eglVersion";
            }
            if (this.f87674c == null) {
                str = str + " glExtensions";
            }
            if (this.f87675d == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new a(this.f87672a, this.f87673b, this.f87674c, this.f87675d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i0.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f87675d = str;
            return this;
        }

        @Override // i0.e.a
        public e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f87673b = str;
            return this;
        }

        @Override // i0.e.a
        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f87674c = str;
            return this;
        }

        @Override // i0.e.a
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f87672a = str;
            return this;
        }
    }

    @Override // i0.e
    public String b() {
        return this.f87671d;
    }

    @Override // i0.e
    public String c() {
        return this.f87669b;
    }

    @Override // i0.e
    public String d() {
        return this.f87670c;
    }

    @Override // i0.e
    public String e() {
        return this.f87668a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f87668a.equals(eVar.e()) && this.f87669b.equals(eVar.c()) && this.f87670c.equals(eVar.d()) && this.f87671d.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f87668a.hashCode() ^ 1000003) * 1000003) ^ this.f87669b.hashCode()) * 1000003) ^ this.f87670c.hashCode()) * 1000003) ^ this.f87671d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f87668a + ", eglVersion=" + this.f87669b + ", glExtensions=" + this.f87670c + ", eglExtensions=" + this.f87671d + "}";
    }

    private a(String str, String str2, String str3, String str4) {
        this.f87668a = str;
        this.f87669b = str2;
        this.f87670c = str3;
        this.f87671d = str4;
    }
}
