package bt;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f21503a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f21504b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f21505c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f21506d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f21507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f21508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f21509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f21510f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f21511g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f21512h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f21513j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f21514k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f21515l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f21516m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f21517n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f21518p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f21519q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f21520r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f21521s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f21522t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f21523v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f21524w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final /* synthetic */ b[] f21525x;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f21526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21527b;

        static enum a extends b {
            a(String str, int i15, c cVar, int i16) {
                super(str, i15, cVar, i16);
            }

            @Override // bt.z.b
            public boolean g() {
                return false;
            }
        }

        /* JADX INFO: renamed from: bt.z$b$b, reason: collision with other inner class name */
        static enum C0560b extends b {
            C0560b(String str, int i15, c cVar, int i16) {
                super(str, i15, cVar, i16);
            }

            @Override // bt.z.b
            public boolean g() {
                return false;
            }
        }

        static enum c extends b {
            c(String str, int i15, c cVar, int i16) {
                super(str, i15, cVar, i16);
            }

            @Override // bt.z.b
            public boolean g() {
                return false;
            }
        }

        static enum d extends b {
            d(String str, int i15, c cVar, int i16) {
                super(str, i15, cVar, i16);
            }

            @Override // bt.z.b
            public boolean g() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f21507c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f21508d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f21509e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f21510f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f21511g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f21512h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f21513j = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f21514k = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f21515l = aVar;
            c cVar3 = c.MESSAGE;
            C0560b c0560b = new C0560b("GROUP", 9, cVar3, 3);
            f21516m = c0560b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f21517n = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f21518p = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f21519q = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f21520r = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f21521s = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f21522t = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f21523v = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f21524w = bVar14;
            f21525x = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0560b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f21525x.clone();
        }

        public c b() {
            return this.f21526a;
        }

        public int e() {
            return this.f21527b;
        }

        public boolean g() {
            return true;
        }

        private b(String str, int i15, c cVar, int i16) {
            super(str, i15);
            this.f21526a = cVar;
            this.f21527b = i16;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(d.f21388a),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f21538a;

        c(Object obj) {
            this.f21538a = obj;
        }
    }

    public static int a(int i15) {
        return i15 >>> 3;
    }

    static int b(int i15) {
        return i15 & 7;
    }

    static int c(int i15, int i16) {
        return (i15 << 3) | i16;
    }
}
