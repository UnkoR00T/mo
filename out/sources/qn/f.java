package qn;

import en.h;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f167430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f167431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hn.d f167432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pn.a f167433d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f167434a;

        static {
            int[] iArr = new int[pn.b.values().length];
            f167434a = iArr;
            try {
                iArr[pn.b.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f167434a[pn.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f167434a[pn.b.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f167434a[pn.b.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f167434a[pn.b.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final pn.b f167435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f167436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f167437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f167438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f167439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f167440f;

        /* synthetic */ b(f fVar, pn.b bVar, int i15, int i16, int i17, b bVar2, pn.c cVar, a aVar) {
            this(bVar, i15, i16, i17, bVar2, cVar);
        }

        private b(pn.b bVar, int i15, int i16, int i17, b bVar2, pn.c cVar) {
            this.f167435a = bVar;
            this.f167436b = i15;
            pn.b bVar3 = pn.b.BYTE;
            int i18 = (bVar == bVar3 || bVar2 == null) ? i16 : bVar2.f167437c;
            this.f167437c = i18;
            this.f167438d = i17;
            this.f167439e = bVar2;
            boolean z15 = false;
            int iG = bVar2 != null ? bVar2.f167440f : 0;
            if ((bVar == bVar3 && bVar2 == null && i18 != 0) || (bVar2 != null && i18 != bVar2.f167437c)) {
                z15 = true;
            }
            iG = (bVar2 == null || bVar != bVar2.f167435a || z15) ? iG + bVar.g(cVar) + 4 : iG;
            int i19 = a.f167434a[bVar.ordinal()];
            if (i19 == 1) {
                iG += 13;
            } else if (i19 == 2) {
                iG += i17 == 1 ? 6 : 11;
            } else if (i19 == 3) {
                iG += i17 != 1 ? i17 == 2 ? 7 : 10 : 4;
            } else if (i19 == 4) {
                iG += f.this.f167432c.c(f.this.f167430a.substring(i15, i17 + i15), i16).length * 8;
                if (z15) {
                    iG += 12;
                }
            }
            this.f167440f = iG;
        }
    }

    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<a> f167442a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final pn.c f167443b;

        final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final pn.b f167445a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f167446b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f167447c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final int f167448d;

            a(pn.b bVar, int i15, int i16, int i17) {
                this.f167445a = bVar;
                this.f167446b = i15;
                this.f167447c = i16;
                this.f167448d = i17;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void d(hn.a aVar) {
                aVar.e(this.f167445a.e(), 4);
                if (this.f167448d > 0) {
                    aVar.e(e(), this.f167445a.g(c.this.f167443b));
                }
                if (this.f167445a == pn.b.ECI) {
                    aVar.e(f.this.f167432c.e(this.f167447c), 8);
                } else if (this.f167448d > 0) {
                    String str = f.this.f167430a;
                    int i15 = this.f167446b;
                    qn.c.c(str.substring(i15, this.f167448d + i15), this.f167445a, aVar, f.this.f167432c.d(this.f167447c));
                }
            }

            private int e() {
                if (this.f167445a != pn.b.BYTE) {
                    return this.f167448d;
                }
                hn.d dVar = f.this.f167432c;
                String str = f.this.f167430a;
                int i15 = this.f167446b;
                return dVar.c(str.substring(i15, this.f167448d + i15), this.f167447c).length;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int f(pn.c cVar) {
                int iE;
                int iG = this.f167445a.g(cVar);
                int i15 = iG + 4;
                int i16 = a.f167434a[this.f167445a.ordinal()];
                if (i16 != 1) {
                    int i17 = 0;
                    if (i16 == 2) {
                        int i18 = this.f167448d;
                        return i15 + ((i18 / 2) * 11) + (i18 % 2 == 1 ? 6 : 0);
                    }
                    if (i16 == 3) {
                        int i19 = this.f167448d;
                        int i25 = i15 + ((i19 / 3) * 10);
                        int i26 = i19 % 3;
                        if (i26 == 1) {
                            i17 = 4;
                        } else if (i26 == 2) {
                            i17 = 7;
                        }
                        return i25 + i17;
                    }
                    if (i16 != 4) {
                        return i16 != 5 ? i15 : iG + 12;
                    }
                    iE = e() * 8;
                } else {
                    iE = this.f167448d * 13;
                }
                return i15 + iE;
            }

            private String g(String str) {
                StringBuilder sb5 = new StringBuilder();
                for (int i15 = 0; i15 < str.length(); i15++) {
                    if (str.charAt(i15) < ' ' || str.charAt(i15) > '~') {
                        sb5.append('.');
                    } else {
                        sb5.append(str.charAt(i15));
                    }
                }
                return sb5.toString();
            }

            public String toString() {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.f167445a);
                sb5.append('(');
                if (this.f167445a == pn.b.ECI) {
                    sb5.append(f.this.f167432c.d(this.f167447c).displayName());
                } else {
                    String str = f.this.f167430a;
                    int i15 = this.f167446b;
                    sb5.append(g(str.substring(i15, this.f167448d + i15)));
                }
                sb5.append(')');
                return sb5.toString();
            }
        }

        c(pn.c cVar, b bVar) {
            int i15;
            int i16;
            int i17;
            b bVar2 = bVar;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                i15 = 1;
                if (bVar2 == null) {
                    break;
                }
                int i25 = i18 + bVar2.f167438d;
                b bVar3 = bVar2.f167439e;
                boolean z15 = (bVar2.f167435a == pn.b.BYTE && bVar3 == null && bVar2.f167437c != 0) || !(bVar3 == null || bVar2.f167437c == bVar3.f167437c);
                i15 = z15 ? 1 : i19;
                if (bVar3 == null || bVar3.f167435a != bVar2.f167435a || z15) {
                    this.f167442a.add(0, new a(bVar2.f167435a, bVar2.f167436b, bVar2.f167437c, i25));
                    i17 = 0;
                } else {
                    i17 = i25;
                }
                if (z15) {
                    this.f167442a.add(0, new a(pn.b.ECI, bVar2.f167436b, bVar2.f167437c, 0));
                }
                i19 = i15;
                bVar2 = bVar3;
                i18 = i17;
            }
            if (f.this.f167431b) {
                a aVar = this.f167442a.get(0);
                if (aVar != null) {
                    pn.b bVar4 = aVar.f167445a;
                    int i26 = i19;
                    pn.b bVar5 = pn.b.ECI;
                    if (bVar4 != bVar5 && i26 != 0) {
                        this.f167442a.add(0, new a(bVar5, 0, 0, 0));
                    }
                }
                this.f167442a.add(this.f167442a.get(0).f167445a == pn.b.ECI ? 1 : 0, new a(pn.b.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int iF = cVar.f();
            int iOrdinal = f.m(cVar).ordinal();
            if (iOrdinal == 0) {
                i16 = 9;
            } else if (iOrdinal != 1) {
                i15 = 27;
                i16 = 40;
            } else {
                i15 = 10;
                i16 = 26;
            }
            int iD = d(cVar);
            while (iF < i16 && !qn.c.v(iD, pn.c.e(iF), f.this.f167433d)) {
                iF++;
            }
            while (iF > i15 && qn.c.v(iD, pn.c.e(iF - 1), f.this.f167433d)) {
                iF--;
            }
            this.f167443b = pn.c.e(iF);
        }

        private int d(pn.c cVar) {
            Iterator<a> it = this.f167442a.iterator();
            int iF = 0;
            while (it.hasNext()) {
                iF += it.next().f(cVar);
            }
            return iF;
        }

        void b(hn.a aVar) {
            Iterator<a> it = this.f167442a.iterator();
            while (it.hasNext()) {
                it.next().d(aVar);
            }
        }

        int c() {
            return d(this.f167443b);
        }

        pn.c e() {
            return this.f167443b;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder();
            a aVar = null;
            for (a aVar2 : this.f167442a) {
                if (aVar != null) {
                    sb5.append(",");
                }
                sb5.append(aVar2.toString());
                aVar = aVar2;
            }
            return sb5.toString();
        }
    }

    private enum d {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f167454a;

        d(String str) {
            this.f167454a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f167454a;
        }
    }

    f(String str, Charset charset, boolean z15, pn.a aVar) {
        this.f167430a = str;
        this.f167431b = z15;
        this.f167432c = new hn.d(str, charset, -1);
        this.f167433d = aVar;
    }

    static c h(String str, pn.c cVar, Charset charset, boolean z15, pn.a aVar) {
        return new f(str, charset, z15, aVar).i(cVar);
    }

    static int k(pn.b bVar) {
        int i15;
        if (bVar == null || (i15 = a.f167434a[bVar.ordinal()]) == 1) {
            return 0;
        }
        if (i15 == 2) {
            return 1;
        }
        if (i15 == 3) {
            return 2;
        }
        if (i15 == 4) {
            return 3;
        }
        throw new IllegalStateException("Illegal mode " + bVar);
    }

    static pn.c l(d dVar) {
        int iOrdinal = dVar.ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? pn.c.e(40) : pn.c.e(26);
        }
        return pn.c.e(9);
    }

    static d m(pn.c cVar) {
        if (cVar.f() <= 9) {
            return d.SMALL;
        }
        return cVar.f() <= 26 ? d.MEDIUM : d.LARGE;
    }

    static boolean n(char c15) {
        return qn.c.p(c15) != -1;
    }

    static boolean o(char c15) {
        return qn.c.s(String.valueOf(c15));
    }

    static boolean p(char c15) {
        return c15 >= '0' && c15 <= '9';
    }

    void e(b[][][] bVarArr, int i15, b bVar) {
        b[] bVarArr2 = bVarArr[i15 + bVar.f167438d][bVar.f167437c];
        int iK = k(bVar.f167435a);
        b bVar2 = bVarArr2[iK];
        if (bVar2 == null || bVar2.f167440f > bVar.f167440f) {
            bVarArr2[iK] = bVar;
        }
    }

    void f(pn.c cVar, b[][][] bVarArr, int i15, b bVar) {
        int i16;
        int iG = this.f167432c.g();
        int iF = this.f167432c.f();
        if (iF < 0 || !this.f167432c.a(this.f167430a.charAt(i15), iF)) {
            iF = 0;
        } else {
            iG = iF + 1;
        }
        int i17 = iG;
        for (int i18 = iF; i18 < i17; i18++) {
            if (this.f167432c.a(this.f167430a.charAt(i15), i18)) {
                e(bVarArr, i15, new b(this, pn.b.BYTE, i15, i18, 1, bVar, cVar, null));
            }
        }
        pn.b bVar2 = pn.b.KANJI;
        if (g(bVar2, this.f167430a.charAt(i15))) {
            e(bVarArr, i15, new b(this, bVar2, i15, 0, 1, bVar, cVar, null));
        }
        int length = this.f167430a.length();
        pn.b bVar3 = pn.b.ALPHANUMERIC;
        int i19 = 2;
        if (g(bVar3, this.f167430a.charAt(i15))) {
            int i25 = i15 + 1;
            e(bVarArr, i15, new b(this, bVar3, i15, 0, (i25 >= length || !g(bVar3, this.f167430a.charAt(i25))) ? 1 : 2, bVar, cVar, null));
        }
        pn.b bVar4 = pn.b.NUMERIC;
        if (g(bVar4, this.f167430a.charAt(i15))) {
            int i26 = i15 + 1;
            if (i26 >= length || !g(bVar4, this.f167430a.charAt(i26))) {
                i16 = 1;
            } else {
                int i27 = i15 + 2;
                if (i27 < length && g(bVar4, this.f167430a.charAt(i27))) {
                    i19 = 3;
                }
                i16 = i19;
            }
            e(bVarArr, i15, new b(this, bVar4, i15, 0, i16, bVar, cVar, null));
        }
    }

    boolean g(pn.b bVar, char c15) {
        int i15 = a.f167434a[bVar.ordinal()];
        if (i15 == 1) {
            return o(c15);
        }
        if (i15 == 2) {
            return n(c15);
        }
        if (i15 != 3) {
            return i15 == 4;
        }
        return p(c15);
    }

    c i(pn.c cVar) throws h {
        if (cVar != null) {
            c cVarJ = j(cVar);
            if (qn.c.v(cVarJ.c(), l(m(cVarJ.e())), this.f167433d)) {
                return cVarJ;
            }
            throw new h("Data too big for version" + cVar);
        }
        pn.c[] cVarArr = {l(d.SMALL), l(d.MEDIUM), l(d.LARGE)};
        c[] cVarArr2 = {j(cVarArr[0]), j(cVarArr[1]), j(cVarArr[2])};
        int i15 = Integer.MAX_VALUE;
        int i16 = -1;
        for (int i17 = 0; i17 < 3; i17++) {
            int iC = cVarArr2[i17].c();
            if (qn.c.v(iC, cVarArr[i17], this.f167433d) && iC < i15) {
                i16 = i17;
                i15 = iC;
            }
        }
        if (i16 >= 0) {
            return cVarArr2[i16];
        }
        throw new h("Data too big for any version");
    }

    c j(pn.c cVar) throws h {
        int length = this.f167430a.length();
        b[][][] bVarArr = (b[][][]) Array.newInstance((Class<?>) b.class, length + 1, this.f167432c.g(), 4);
        f(cVar, bVarArr, 0, null);
        for (int i15 = 1; i15 <= length; i15++) {
            for (int i16 = 0; i16 < this.f167432c.g(); i16++) {
                for (int i17 = 0; i17 < 4; i17++) {
                    b bVar = bVarArr[i15][i16][i17];
                    if (bVar != null && i15 < length) {
                        f(cVar, bVarArr, i15, bVar);
                    }
                }
            }
        }
        int i18 = -1;
        int i19 = Integer.MAX_VALUE;
        int i25 = -1;
        for (int i26 = 0; i26 < this.f167432c.g(); i26++) {
            for (int i27 = 0; i27 < 4; i27++) {
                b bVar2 = bVarArr[length][i26][i27];
                if (bVar2 != null && bVar2.f167440f < i19) {
                    i19 = bVar2.f167440f;
                    i18 = i26;
                    i25 = i27;
                }
            }
        }
        if (i18 >= 0) {
            return new c(cVar, bVarArr[length][i18][i25]);
        }
        throw new h("Internal error: failed to encode \"" + this.f167430a + "\"");
    }
}
