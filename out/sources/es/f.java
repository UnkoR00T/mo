package es;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final es.e f53087a;

        public a(es.e eVar) {
            super(null);
            this.f53087a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && fr.t.c(this.f53087a, ((a) obj).f53087a);
        }

        public int hashCode() {
            return this.f53087a.hashCode();
        }

        public String toString() {
            return "AnnotationValue(" + this.f53087a + ')';
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f53088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f53090c;

        public b(String str, int i15) {
            super(null);
            this.f53088a = str;
            this.f53089b = i15;
            if (i15 <= 0) {
                throw new IllegalArgumentException("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("ArrayKClassValue(");
            for (int i16 = 0; i16 < i15; i16++) {
                sb5.append("kotlin/Array<");
            }
            sb5.append(this.f53088a);
            int i17 = this.f53089b;
            for (int i18 = 0; i18 < i17; i18++) {
                sb5.append(">");
            }
            sb5.append(")");
            this.f53090c = sb5.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return fr.t.c(this.f53088a, bVar.f53088a) && this.f53089b == bVar.f53089b;
        }

        public int hashCode() {
            return (this.f53088a.hashCode() * 31) + Integer.hashCode(this.f53089b);
        }

        public String toString() {
            return this.f53090c;
        }
    }

    public static final class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<f> f53091a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends f> list) {
            super(null);
            this.f53091a = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && fr.t.c(this.f53091a, ((c) obj).f53091a);
        }

        public int hashCode() {
            return this.f53091a.hashCode();
        }

        public String toString() {
            return "ArrayValue(" + this.f53091a + ')';
        }
    }

    public static final class d extends l<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f53092a;

        public d(boolean z15) {
            super(null);
            this.f53092a = z15;
        }

        @Override // es.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(this.f53092a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f53092a == ((d) obj).f53092a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f53092a);
        }
    }

    public static final class e extends l<Byte> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f53093a;

        public e(byte b15) {
            super(null);
            this.f53093a = b15;
        }

        @Override // es.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte a() {
            return Byte.valueOf(this.f53093a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f53093a == ((e) obj).f53093a;
        }

        public int hashCode() {
            return Byte.hashCode(this.f53093a);
        }
    }

    /* JADX INFO: renamed from: es.f$f, reason: collision with other inner class name */
    public static final class C1250f extends l<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f53094a;

        public C1250f(char c15) {
            super(null);
            this.f53094a = c15;
        }

        @Override // es.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Character a() {
            return Character.valueOf(this.f53094a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1250f) && this.f53094a == ((C1250f) obj).f53094a;
        }

        public int hashCode() {
            return Character.hashCode(this.f53094a);
        }
    }

    public static final class g extends l<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f53095a;

        public g(double d15) {
            super(null);
            this.f53095a = d15;
        }

        @Override // es.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double a() {
            return Double.valueOf(this.f53095a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Double.compare(this.f53095a, ((g) obj).f53095a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f53095a);
        }
    }

    public static final class h extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f53096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f53097b;

        public h(String str, String str2) {
            super(null);
            this.f53096a = str;
            this.f53097b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return fr.t.c(this.f53096a, hVar.f53096a) && fr.t.c(this.f53097b, hVar.f53097b);
        }

        public int hashCode() {
            return (this.f53096a.hashCode() * 31) + this.f53097b.hashCode();
        }

        public String toString() {
            return "EnumValue(" + this.f53096a + '.' + this.f53097b + ')';
        }
    }

    public static final class i extends l<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f53098a;

        public i(float f15) {
            super(null);
            this.f53098a = f15;
        }

        @Override // es.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float a() {
            return Float.valueOf(this.f53098a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Float.compare(this.f53098a, ((i) obj).f53098a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f53098a);
        }
    }

    public static final class j extends l<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f53099a;

        public j(int i15) {
            super(null);
            this.f53099a = i15;
        }

        @Override // es.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a() {
            return Integer.valueOf(this.f53099a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f53099a == ((j) obj).f53099a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f53099a);
        }
    }

    public static final class k extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f53100a;

        public k(String str) {
            super(null);
            this.f53100a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && fr.t.c(this.f53100a, ((k) obj).f53100a);
        }

        public int hashCode() {
            return this.f53100a.hashCode();
        }

        public String toString() {
            return "KClassValue(" + this.f53100a + ')';
        }
    }

    public static abstract class l<T> extends f {
        public /* synthetic */ l(fr.k kVar) {
            this();
        }

        public abstract T a();

        public final String toString() {
            String string;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(getClass().getSimpleName());
            sb5.append('(');
            if (this instanceof o) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append('\"');
                sb6.append((Object) ((o) this).a());
                sb6.append('\"');
                string = sb6.toString();
            } else {
                string = a().toString();
            }
            sb5.append(string);
            sb5.append(')');
            return sb5.toString();
        }

        private l() {
            super(null);
        }
    }

    public static final class m extends l<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f53101a;

        public m(long j15) {
            super(null);
            this.f53101a = j15;
        }

        @Override // es.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a() {
            return Long.valueOf(this.f53101a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f53101a == ((m) obj).f53101a;
        }

        public int hashCode() {
            return Long.hashCode(this.f53101a);
        }
    }

    public static final class n extends l<Short> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short f53102a;

        public n(short s15) {
            super(null);
            this.f53102a = s15;
        }

        @Override // es.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Short a() {
            return Short.valueOf(this.f53102a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f53102a == ((n) obj).f53102a;
        }

        public int hashCode() {
            return Short.hashCode(this.f53102a);
        }
    }

    public static final class o extends l<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f53103a;

        public o(String str) {
            super(null);
            this.f53103a = str;
        }

        @Override // es.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.f53103a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && fr.t.c(this.f53103a, ((o) obj).f53103a);
        }

        public int hashCode() {
            return this.f53103a.hashCode();
        }
    }

    public static final class p extends l<oq.z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f53104a;

        public /* synthetic */ p(byte b15, fr.k kVar) {
            this(b15);
        }

        @Override // es.f.l
        public /* bridge */ /* synthetic */ oq.z a() {
            return oq.z.b(b());
        }

        public byte b() {
            return this.f53104a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f53104a == ((p) obj).f53104a;
        }

        public int hashCode() {
            return oq.z.j(this.f53104a);
        }

        private p(byte b15) {
            super(null);
            this.f53104a = b15;
        }
    }

    public static final class q extends l<oq.b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f53105a;

        public /* synthetic */ q(int i15, fr.k kVar) {
            this(i15);
        }

        @Override // es.f.l
        public /* bridge */ /* synthetic */ oq.b0 a() {
            return oq.b0.b(b());
        }

        public int b() {
            return this.f53105a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.f53105a == ((q) obj).f53105a;
        }

        public int hashCode() {
            return oq.b0.j(this.f53105a);
        }

        private q(int i15) {
            super(null);
            this.f53105a = i15;
        }
    }

    public static final class r extends l<oq.d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f53106a;

        public /* synthetic */ r(long j15, fr.k kVar) {
            this(j15);
        }

        @Override // es.f.l
        public /* bridge */ /* synthetic */ oq.d0 a() {
            return oq.d0.b(b());
        }

        public long b() {
            return this.f53106a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f53106a == ((r) obj).f53106a;
        }

        public int hashCode() {
            return oq.d0.k(this.f53106a);
        }

        private r(long j15) {
            super(null);
            this.f53106a = j15;
        }
    }

    public static final class s extends l<oq.g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short f53107a;

        public /* synthetic */ s(short s15, fr.k kVar) {
            this(s15);
        }

        @Override // es.f.l
        public /* bridge */ /* synthetic */ oq.g0 a() {
            return oq.g0.b(b());
        }

        public short b() {
            return this.f53107a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f53107a == ((s) obj).f53107a;
        }

        public int hashCode() {
            return oq.g0.j(this.f53107a);
        }

        private s(short s15) {
            super(null);
            this.f53107a = s15;
        }
    }

    public /* synthetic */ f(fr.k kVar) {
        this();
    }

    private f() {
    }
}
