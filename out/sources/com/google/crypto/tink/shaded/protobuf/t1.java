package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f36203a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f36204b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f36205c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f36206d = c(3, 2);

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
        public static final b f36207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f36208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f36209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f36210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f36211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f36212h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f36213j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f36214k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f36215l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f36216m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f36217n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f36218p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f36219q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f36220r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f36221s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f36222t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f36223v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f36224w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final /* synthetic */ b[] f36225x;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f36226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36227b;

        final enum a extends b {
            a(String str, int i15, c cVar, int i16) {
                super(str, i15, cVar, i16);
            }
        }

        /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.t1$b$b, reason: collision with other inner class name */
        final enum C0759b extends b {
            C0759b(String str, int i15, c cVar, int i16) {
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
            f36207c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f36208d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f36209e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f36210f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f36211g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f36212h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f36213j = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f36214k = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f36215l = aVar;
            c cVar3 = c.MESSAGE;
            C0759b c0759b = new C0759b("GROUP", 9, cVar3, 3);
            f36216m = c0759b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f36217n = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f36218p = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f36219q = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f36220r = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f36221s = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f36222t = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f36223v = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f36224w = bVar14;
            f36225x = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0759b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f36225x.clone();
        }

        public c b() {
            return this.f36226a;
        }

        private b(String str, int i15, c cVar, int i16) {
            super(str, i15);
            this.f36226a = cVar;
            this.f36227b = i16;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(h.f36058b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f36238a;

        c(Object obj) {
            this.f36238a = obj;
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
