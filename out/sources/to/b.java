package to;

/* JADX INFO: loaded from: classes4.dex */
class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a f191168d = a.STRING;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final a f191169e = a.NAME;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final a f191170f = a.LITERAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a f191171g = a.REAL;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final a f191172h = a.INTEGER;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final a f191173i = a.START_ARRAY;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final a f191174j = a.END_ARRAY;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final a f191175k = a.START_PROC;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final a f191176l = a.END_PROC;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final a f191177m = a.CHARSTRING;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final a f191178n = a.START_DICT;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final a f191179o = a.END_DICT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f191180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f191181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f191182c;

    enum a {
        NONE,
        STRING,
        NAME,
        LITERAL,
        REAL,
        INTEGER,
        START_ARRAY,
        END_ARRAY,
        START_PROC,
        END_PROC,
        START_DICT,
        END_DICT,
        CHARSTRING
    }

    b(String str, a aVar) {
        this.f191180a = str;
        this.f191182c = aVar;
    }

    public boolean a() {
        return this.f191180a.equals("true");
    }

    public float b() {
        return Float.parseFloat(this.f191180a);
    }

    public byte[] c() {
        return this.f191181b;
    }

    public a d() {
        return this.f191182c;
    }

    public String e() {
        return this.f191180a;
    }

    public int f() {
        return (int) Float.parseFloat(this.f191180a);
    }

    public String toString() {
        if (this.f191182c == f191177m) {
            return "Token[kind=CHARSTRING, data=" + this.f191181b.length + " bytes]";
        }
        return "Token[kind=" + this.f191182c + ", text=" + this.f191180a + "]";
    }

    b(char c15, a aVar) {
        this.f191180a = Character.toString(c15);
        this.f191182c = aVar;
    }

    b(byte[] bArr, a aVar) {
        this.f191181b = bArr;
        this.f191182c = aVar;
    }
}
