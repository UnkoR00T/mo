package ws;

import oq.p;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import us.w;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f214757f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f214758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.d f214759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oq.b f214760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f214761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f214762e;

    public static final class a {

        /* JADX INFO: renamed from: ws.i$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C5703a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f214763a;

            static {
                int[] iArr = new int[w.c.values().length];
                try {
                    iArr[w.c.WARNING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[w.c.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[w.c.HIDDEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f214763a = iArr;
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final i a(int i15, d dVar, j jVar) {
            oq.b bVar;
            w wVarB = jVar.b(i15);
            if (wVarB == null) {
                return null;
            }
            b bVarA = b.f214764d.a(wVarB.N() ? Integer.valueOf(wVarB.H()) : null, wVarB.O() ? Integer.valueOf(wVarB.I()) : null);
            int i16 = C5703a.f214763a[wVarB.F().ordinal()];
            if (i16 == 1) {
                bVar = oq.b.WARNING;
            } else if (i16 == 2) {
                bVar = oq.b.ERROR;
            } else {
                if (i16 != 3) {
                    throw new p();
                }
                bVar = oq.b.HIDDEN;
            }
            return new i(bVarA, wVarB.J(), bVar, wVarB.K() ? Integer.valueOf(wVarB.E()) : null, wVarB.M() ? dVar.getString(wVarB.G()) : null);
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f214764d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f214765e = new b(256, 256, 256);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f214766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f214767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f214768c;

        public static final class a {
            public /* synthetic */ a(fr.k kVar) {
                this();
            }

            public final b a(Integer num, Integer num2) {
                if (num2 != null) {
                    return new b(num2.intValue() & GF2Field.MASK, (num2.intValue() >> 8) & GF2Field.MASK, (num2.intValue() >> 16) & GF2Field.MASK);
                }
                return num != null ? new b(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & CertificateBody.profileType) : b.f214765e;
            }

            private a() {
            }
        }

        public b(int i15, int i16, int i17) {
            this.f214766a = i15;
            this.f214767b = i16;
            this.f214768c = i17;
        }

        public final String a() {
            StringBuilder sb5;
            int i15;
            if (this.f214768c == 0) {
                sb5 = new StringBuilder();
                sb5.append(this.f214766a);
                sb5.append('.');
                i15 = this.f214767b;
            } else {
                sb5 = new StringBuilder();
                sb5.append(this.f214766a);
                sb5.append('.');
                sb5.append(this.f214767b);
                sb5.append('.');
                i15 = this.f214768c;
            }
            sb5.append(i15);
            return sb5.toString();
        }

        public final int b() {
            return this.f214766a;
        }

        public final int c() {
            return this.f214767b;
        }

        public final int d() {
            return this.f214768c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f214766a == bVar.f214766a && this.f214767b == bVar.f214767b && this.f214768c == bVar.f214768c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f214766a) * 31) + Integer.hashCode(this.f214767b)) * 31) + Integer.hashCode(this.f214768c);
        }

        public String toString() {
            return a();
        }
    }

    public i(b bVar, w.d dVar, oq.b bVar2, Integer num, String str) {
        this.f214758a = bVar;
        this.f214759b = dVar;
        this.f214760c = bVar2;
        this.f214761d = num;
        this.f214762e = str;
    }

    public final Integer a() {
        return this.f214761d;
    }

    public final w.d b() {
        return this.f214759b;
    }

    public final oq.b c() {
        return this.f214760c;
    }

    public final String d() {
        return this.f214762e;
    }

    public final b e() {
        return this.f214758a;
    }

    public String toString() {
        String str;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("since ");
        sb5.append(this.f214758a);
        sb5.append(' ');
        sb5.append(this.f214760c);
        String str2 = "";
        if (this.f214761d != null) {
            str = " error " + this.f214761d.intValue();
        } else {
            str = "";
        }
        sb5.append(str);
        if (this.f214762e != null) {
            str2 = ": " + this.f214762e;
        }
        sb5.append(str2);
        return sb5.toString();
    }
}
