package rl;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f174773p = new C4462a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f174774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f174775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f174776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f174777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f174778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f174779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f174780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f174781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f174782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f174783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f174784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f174785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f174786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f174787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f174788o;

    /* JADX INFO: renamed from: rl.a$a, reason: collision with other inner class name */
    public static final class C4462a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f174789a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f174790b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f174791c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f174792d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f174793e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f174794f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f174795g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f174796h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f174797i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f174798j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f174799k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private b f174800l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f174801m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f174802n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f174803o = "";

        C4462a() {
        }

        public a a() {
            return new a(this.f174789a, this.f174790b, this.f174791c, this.f174792d, this.f174793e, this.f174794f, this.f174795g, this.f174796h, this.f174797i, this.f174798j, this.f174799k, this.f174800l, this.f174801m, this.f174802n, this.f174803o);
        }

        public C4462a b(String str) {
            this.f174801m = str;
            return this;
        }

        public C4462a c(String str) {
            this.f174795g = str;
            return this;
        }

        public C4462a d(String str) {
            this.f174803o = str;
            return this;
        }

        public C4462a e(b bVar) {
            this.f174800l = bVar;
            return this;
        }

        public C4462a f(String str) {
            this.f174791c = str;
            return this;
        }

        public C4462a g(String str) {
            this.f174790b = str;
            return this;
        }

        public C4462a h(c cVar) {
            this.f174792d = cVar;
            return this;
        }

        public C4462a i(String str) {
            this.f174794f = str;
            return this;
        }

        public C4462a j(int i15) {
            this.f174796h = i15;
            return this;
        }

        public C4462a k(long j15) {
            this.f174789a = j15;
            return this;
        }

        public C4462a l(d dVar) {
            this.f174793e = dVar;
            return this;
        }

        public C4462a m(String str) {
            this.f174798j = str;
            return this;
        }

        public C4462a n(int i15) {
            this.f174797i = i15;
            return this;
        }
    }

    public enum b implements gl.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f174808a;

        b(int i15) {
            this.f174808a = i15;
        }

        @Override // gl.c
        public int h() {
            return this.f174808a;
        }
    }

    public enum c implements gl.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f174814a;

        c(int i15) {
            this.f174814a = i15;
        }

        @Override // gl.c
        public int h() {
            return this.f174814a;
        }
    }

    public enum d implements gl.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f174820a;

        d(int i15) {
            this.f174820a = i15;
        }

        @Override // gl.c
        public int h() {
            return this.f174820a;
        }
    }

    a(long j15, String str, String str2, c cVar, d dVar, String str3, String str4, int i15, int i16, String str5, long j16, b bVar, String str6, long j17, String str7) {
        this.f174774a = j15;
        this.f174775b = str;
        this.f174776c = str2;
        this.f174777d = cVar;
        this.f174778e = dVar;
        this.f174779f = str3;
        this.f174780g = str4;
        this.f174781h = i15;
        this.f174782i = i16;
        this.f174783j = str5;
        this.f174784k = j16;
        this.f174785l = bVar;
        this.f174786m = str6;
        this.f174787n = j17;
        this.f174788o = str7;
    }

    public static C4462a p() {
        return new C4462a();
    }

    @gl.d(tag = 13)
    public String a() {
        return this.f174786m;
    }

    @gl.d(tag = 11)
    public long b() {
        return this.f174784k;
    }

    @gl.d(tag = 14)
    public long c() {
        return this.f174787n;
    }

    @gl.d(tag = 7)
    public String d() {
        return this.f174780g;
    }

    @gl.d(tag = 15)
    public String e() {
        return this.f174788o;
    }

    @gl.d(tag = 12)
    public b f() {
        return this.f174785l;
    }

    @gl.d(tag = 3)
    public String g() {
        return this.f174776c;
    }

    @gl.d(tag = 2)
    public String h() {
        return this.f174775b;
    }

    @gl.d(tag = 4)
    public c i() {
        return this.f174777d;
    }

    @gl.d(tag = 6)
    public String j() {
        return this.f174779f;
    }

    @gl.d(tag = 8)
    public int k() {
        return this.f174781h;
    }

    @gl.d(tag = 1)
    public long l() {
        return this.f174774a;
    }

    @gl.d(tag = 5)
    public d m() {
        return this.f174778e;
    }

    @gl.d(tag = 10)
    public String n() {
        return this.f174783j;
    }

    @gl.d(tag = 9)
    public int o() {
        return this.f174782i;
    }
}
