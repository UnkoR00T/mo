package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f12093a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f12094b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f12095c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f12096d = c(3, 2);

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
        public static final b f12097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f12098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f12099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f12100f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f12101g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f12102h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f12103j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f12104k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f12105l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f12106m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f12107n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f12108p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f12109q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f12110r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f12111s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f12112t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f12113v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f12114w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final /* synthetic */ b[] f12115x;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f12116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12117b;

        final enum a extends b {
            a(String str, int i15, c cVar, int i16) {
                super(str, i15, cVar, i16);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s1$b$b, reason: collision with other inner class name */
        final enum C0258b extends b {
            C0258b(String str, int i15, c cVar, int i16) {
                super(str, i15, cVar, i16);
            }
        }

        final enum c extends b {
            c(String str, int i15, c cVar, int i16) {
                super(str, i15, cVar, i16);
            }
        }

        final enum d extends b {
            d(String str, int i15, c cVar, int i16) {
                super(str, i15, cVar, i16);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f12097c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f12098d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f12099e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f12100f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f12101g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f12102h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f12103j = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f12104k = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f12105l = aVar;
            c cVar3 = c.MESSAGE;
            C0258b c0258b = new C0258b("GROUP", 9, cVar3, 3);
            f12106m = c0258b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f12107n = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f12108p = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f12109q = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f12110r = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f12111s = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f12112t = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f12113v = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f12114w = bVar14;
            f12115x = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0258b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f12115x.clone();
        }

        public c b() {
            return this.f12116a;
        }

        public int e() {
            return this.f12117b;
        }

        private b(String str, int i15, c cVar, int i16) {
            super(str, i15);
            this.f12116a = cVar;
            this.f12117b = i16;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(g.f11949b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f12128a;

        c(Object obj) {
            this.f12128a = obj;
        }
    }

    public static int a(int i15) {
        return i15 >>> 3;
    }

    public static int b(int i15) {
        return i15 & 7;
    }

    static int c(int i15, int i16) {
        return (i15 << 3) | i16;
    }
}
