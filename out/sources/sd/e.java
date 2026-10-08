package sd;

import java.io.EOFException;
import vv.g;
import vv.h;

/* JADX INFO: loaded from: classes3.dex */
final class e extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final h f180254p = h.j("'\\");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final h f180255q = h.j("\"\\");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final h f180256r = h.j("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final h f180257s = h.j("\n\r");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final h f180258t = h.j("*/");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g f180259h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final vv.e f180260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f180261k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f180262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f180263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f180264n;

    e(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f180259h = gVar;
        this.f180260j = gVar.y0();
        C(6);
    }

    private void K() throws b {
        if (!this.f180239e) {
            throw J("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int L() throws b, EOFException {
        int[] iArr = this.f180236b;
        int i15 = this.f180235a;
        int i16 = iArr[i15 - 1];
        if (i16 == 1) {
            iArr[i15 - 1] = 2;
        } else if (i16 == 2) {
            int iO = O(true);
            this.f180260j.readByte();
            if (iO != 44) {
                if (iO != 59) {
                    if (iO != 93) {
                        throw J("Unterminated array");
                    }
                    this.f180261k = 4;
                    return 4;
                }
                K();
            }
        } else {
            if (i16 == 3 || i16 == 5) {
                iArr[i15 - 1] = 4;
                if (i16 == 5) {
                    int iO2 = O(true);
                    this.f180260j.readByte();
                    if (iO2 != 44) {
                        if (iO2 != 59) {
                            if (iO2 != 125) {
                                throw J("Unterminated object");
                            }
                            this.f180261k = 2;
                            return 2;
                        }
                        K();
                    }
                }
                int iO3 = O(true);
                if (iO3 == 34) {
                    this.f180260j.readByte();
                    this.f180261k = 13;
                    return 13;
                }
                if (iO3 == 39) {
                    this.f180260j.readByte();
                    K();
                    this.f180261k = 12;
                    return 12;
                }
                if (iO3 != 125) {
                    K();
                    if (!N((char) iO3)) {
                        throw J("Expected name");
                    }
                    this.f180261k = 14;
                    return 14;
                }
                if (i16 == 5) {
                    throw J("Expected name");
                }
                this.f180260j.readByte();
                this.f180261k = 2;
                return 2;
            }
            if (i16 == 4) {
                iArr[i15 - 1] = 5;
                int iO4 = O(true);
                this.f180260j.readByte();
                if (iO4 != 58) {
                    if (iO4 != 61) {
                        throw J("Expected ':'");
                    }
                    K();
                    if (this.f180259h.request(1L) && this.f180260j.I(0L) == 62) {
                        this.f180260j.readByte();
                    }
                }
            } else if (i16 == 6) {
                iArr[i15 - 1] = 7;
            } else if (i16 == 7) {
                if (O(false) == -1) {
                    this.f180261k = 18;
                    return 18;
                }
                K();
            } else if (i16 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iO5 = O(true);
        if (iO5 == 34) {
            this.f180260j.readByte();
            this.f180261k = 9;
            return 9;
        }
        if (iO5 == 39) {
            K();
            this.f180260j.readByte();
            this.f180261k = 8;
            return 8;
        }
        if (iO5 != 44 && iO5 != 59) {
            if (iO5 == 91) {
                this.f180260j.readByte();
                this.f180261k = 3;
                return 3;
            }
            if (iO5 != 93) {
                if (iO5 == 123) {
                    this.f180260j.readByte();
                    this.f180261k = 1;
                    return 1;
                }
                int iA0 = a0();
                if (iA0 != 0) {
                    return iA0;
                }
                int iB0 = b0();
                if (iB0 != 0) {
                    return iB0;
                }
                if (!N(this.f180260j.I(0L))) {
                    throw J("Expected value");
                }
                K();
                this.f180261k = 10;
                return 10;
            }
            if (i16 == 1) {
                this.f180260j.readByte();
                this.f180261k = 4;
                return 4;
            }
        }
        if (i16 != 1 && i16 != 2) {
            throw J("Unexpected value");
        }
        K();
        this.f180261k = 7;
        return 7;
    }

    private int M(String str, c.a aVar) {
        int length = aVar.f180241a.length;
        for (int i15 = 0; i15 < length; i15++) {
            if (str.equals(aVar.f180241a[i15])) {
                this.f180261k = 0;
                this.f180237c[this.f180235a - 1] = str;
                return i15;
            }
        }
        return -1;
    }

    private boolean N(int i15) throws b {
        if (i15 == 9 || i15 == 10 || i15 == 12 || i15 == 13 || i15 == 32) {
            return false;
        }
        if (i15 != 35) {
            if (i15 == 44) {
                return false;
            }
            if (i15 != 47 && i15 != 61) {
                if (i15 == 123 || i15 == 125 || i15 == 58) {
                    return false;
                }
                if (i15 != 59) {
                    switch (i15) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        K();
        return false;
    }

    private int O(boolean z15) throws b, EOFException {
        byte bI;
        while (true) {
            int i15 = 0;
            while (true) {
                int i16 = i15 + 1;
                if (!this.f180259h.request(i16)) {
                    if (z15) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bI = this.f180260j.I(i15);
                if (bI == 10 || bI == 32 || bI == 13 || bI == 9) {
                    i15 = i16;
                }
            }
            this.f180260j.skip(i15);
            if (bI == 47) {
                if (this.f180259h.request(2L)) {
                    K();
                    byte bI2 = this.f180260j.I(1L);
                    if (bI2 == 42) {
                        this.f180260j.readByte();
                        this.f180260j.readByte();
                        if (!n0()) {
                            throw J("Unterminated comment");
                        }
                    } else if (bI2 == 47) {
                        this.f180260j.readByte();
                        this.f180260j.readByte();
                        t0();
                    }
                }
                return bI;
            }
            if (bI != 35) {
                return bI;
            }
            K();
            t0();
        }
    }

    private String V(h hVar) throws b, EOFException {
        StringBuilder sb5 = null;
        while (true) {
            long jV0 = this.f180259h.v0(hVar);
            if (jV0 == -1) {
                throw J("Unterminated string");
            }
            if (this.f180260j.I(jV0) != 92) {
                if (sb5 == null) {
                    String strN2 = this.f180260j.n2(jV0);
                    this.f180260j.readByte();
                    return strN2;
                }
                sb5.append(this.f180260j.n2(jV0));
                this.f180260j.readByte();
                return sb5.toString();
            }
            if (sb5 == null) {
                sb5 = new StringBuilder();
            }
            sb5.append(this.f180260j.n2(jV0));
            this.f180260j.readByte();
            sb5.append(c0());
        }
    }

    private String Z() {
        long jV0 = this.f180259h.v0(f180256r);
        return jV0 != -1 ? this.f180260j.n2(jV0) : this.f180260j.C0();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int a0() throws EOFException {
        String str;
        String str2;
        int i15;
        byte bI = this.f180260j.I(0L);
        if (bI == 116 || bI == 84) {
            str = "true";
            str2 = "TRUE";
            i15 = 5;
        } else if (bI == 102 || bI == 70) {
            str = "false";
            str2 = "FALSE";
            i15 = 6;
        } else {
            if (bI != 110 && bI != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i15 = 7;
        }
        int length = str.length();
        int i16 = 1;
        while (i16 < length) {
            int i17 = i16 + 1;
            if (!this.f180259h.request(i17)) {
                return 0;
            }
            byte bI2 = this.f180260j.I(i16);
            if (bI2 != str.charAt(i16) && bI2 != str2.charAt(i16)) {
                return 0;
            }
            i16 = i17;
        }
        if (this.f180259h.request(length + 1) && N(this.f180260j.I(length))) {
            return 0;
        }
        this.f180260j.skip(length);
        this.f180261k = i15;
        return i15;
    }

    private int b0() throws EOFException {
        long j15;
        int i15;
        boolean z15 = true;
        int i16 = 0;
        char c15 = 0;
        long j16 = 0;
        boolean z16 = false;
        while (true) {
            int i17 = i16 + 1;
            if (!this.f180259h.request(i17)) {
                j15 = 0;
                i15 = 0;
                break;
            }
            j15 = 0;
            byte bI = this.f180260j.I(i16);
            i15 = 0;
            if (bI != 43) {
                if (bI == 69 || bI == 101) {
                    if (c15 != 2 && c15 != 4) {
                        return 0;
                    }
                    c15 = 5;
                } else if (bI != 45) {
                    if (bI != 46) {
                        if (bI < 48 || bI > 57) {
                            if (!N(bI)) {
                                break;
                            }
                            return 0;
                        }
                        if (c15 == 1 || c15 == 0) {
                            j16 = -(bI - 48);
                            c15 = 2;
                        } else if (c15 == 2) {
                            if (j16 == 0) {
                                return 0;
                            }
                            long j17 = (10 * j16) - ((long) (bI - 48));
                            z15 &= j16 > -922337203685477580L || (j16 == -922337203685477580L && j17 < j16);
                            j16 = j17;
                        } else if (c15 == 3) {
                            c15 = 4;
                        } else if (c15 == 5 || c15 == 6) {
                            c15 = 7;
                        }
                    } else {
                        if (c15 != 2) {
                            return 0;
                        }
                        c15 = 3;
                    }
                } else if (c15 == 0) {
                    c15 = 1;
                    z16 = true;
                } else if (c15 != 5) {
                    return 0;
                }
                i16 = i17;
            } else if (c15 != 5) {
                return 0;
            }
            c15 = 6;
            i16 = i17;
        }
        if (c15 == 2 && z15 && ((j16 != Long.MIN_VALUE || z16) && (j16 != j15 || !z16))) {
            if (!z16) {
                j16 = -j16;
            }
            this.f180262l = j16;
            this.f180260j.skip(i16);
            this.f180261k = 16;
            return 16;
        }
        if (c15 != 2 && c15 != 4 && c15 != 7) {
            return i15;
        }
        this.f180263m = i16;
        this.f180261k = 17;
        return 17;
    }

    private char c0() throws b, EOFException {
        int i15;
        if (!this.f180259h.request(1L)) {
            throw J("Unterminated escape sequence");
        }
        byte b15 = this.f180260j.readByte();
        if (b15 == 10 || b15 == 34 || b15 == 39 || b15 == 47 || b15 == 92) {
            return (char) b15;
        }
        if (b15 == 98) {
            return '\b';
        }
        if (b15 == 102) {
            return '\f';
        }
        if (b15 == 110) {
            return '\n';
        }
        if (b15 == 114) {
            return '\r';
        }
        if (b15 == 116) {
            return '\t';
        }
        if (b15 != 117) {
            if (this.f180239e) {
                return (char) b15;
            }
            throw J("Invalid escape sequence: \\" + ((char) b15));
        }
        if (!this.f180259h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + W());
        }
        char c15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            byte bI = this.f180260j.I(i16);
            char c16 = (char) (c15 << 4);
            if (bI >= 48 && bI <= 57) {
                i15 = bI - 48;
            } else if (bI >= 97 && bI <= 102) {
                i15 = bI - 87;
            } else {
                if (bI < 65 || bI > 70) {
                    throw J("\\u" + this.f180260j.n2(4L));
                }
                i15 = bI - 55;
            }
            c15 = (char) (c16 + i15);
        }
        this.f180260j.skip(4L);
        return c15;
    }

    private void d0(h hVar) throws b, EOFException {
        while (true) {
            long jV0 = this.f180259h.v0(hVar);
            if (jV0 == -1) {
                throw J("Unterminated string");
            }
            if (this.f180260j.I(jV0) != 92) {
                this.f180260j.skip(jV0 + 1);
                return;
            } else {
                this.f180260j.skip(jV0 + 1);
                c0();
            }
        }
    }

    private boolean n0() throws EOFException {
        g gVar = this.f180259h;
        h hVar = f180258t;
        long jP0 = gVar.P0(hVar);
        boolean z15 = jP0 != -1;
        vv.e eVar = this.f180260j;
        eVar.skip(z15 ? jP0 + ((long) hVar.Q()) : eVar.getSize());
        return z15;
    }

    private void t0() throws EOFException {
        long jV0 = this.f180259h.v0(f180257s);
        vv.e eVar = this.f180260j;
        eVar.skip(jV0 != -1 ? jV0 + 1 : eVar.getSize());
    }

    private void u0() throws EOFException {
        long jV0 = this.f180259h.v0(f180256r);
        vv.e eVar = this.f180260j;
        if (jV0 == -1) {
            jV0 = eVar.getSize();
        }
        eVar.skip(jV0);
    }

    @Override // sd.c
    public int E(c.a aVar) throws b, EOFException {
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        if (iL < 12 || iL > 15) {
            return -1;
        }
        if (iL == 15) {
            return M(this.f180264n, aVar);
        }
        int iC1 = this.f180259h.c1(aVar.f180242b);
        if (iC1 != -1) {
            this.f180261k = 0;
            this.f180237c[this.f180235a - 1] = aVar.f180241a[iC1];
            return iC1;
        }
        String str = this.f180237c[this.f180235a - 1];
        String strH1 = h1();
        int iM = M(strH1, aVar);
        if (iM == -1) {
            this.f180261k = 15;
            this.f180264n = strH1;
            this.f180237c[this.f180235a - 1] = str;
        }
        return iM;
    }

    @Override // sd.c
    public void G0() throws b, EOFException {
        if (this.f180240f) {
            throw new a("Cannot skip unexpected " + y() + " at " + W());
        }
        int i15 = 0;
        do {
            int iL = this.f180261k;
            if (iL == 0) {
                iL = L();
            }
            if (iL == 3) {
                C(1);
            } else {
                if (iL == 1) {
                    C(3);
                } else if (iL == 4) {
                    i15--;
                    if (i15 < 0) {
                        throw new a("Expected a value but was " + y() + " at path " + W());
                    }
                    this.f180235a--;
                } else if (iL == 2) {
                    i15--;
                    if (i15 < 0) {
                        throw new a("Expected a value but was " + y() + " at path " + W());
                    }
                    this.f180235a--;
                } else if (iL == 14 || iL == 10) {
                    u0();
                } else if (iL == 9 || iL == 13) {
                    d0(f180255q);
                } else if (iL == 8 || iL == 12) {
                    d0(f180254p);
                } else if (iL == 17) {
                    this.f180260j.skip(this.f180263m);
                } else if (iL == 18) {
                    throw new a("Expected a value but was " + y() + " at path " + W());
                }
                this.f180261k = 0;
            }
            i15++;
            this.f180261k = 0;
        } while (i15 != 0);
        int[] iArr = this.f180238d;
        int i16 = this.f180235a;
        int i17 = i16 - 1;
        iArr[i17] = iArr[i17] + 1;
        this.f180237c[i16 - 1] = "null";
    }

    @Override // sd.c
    public void H() throws b, EOFException {
        if (this.f180240f) {
            throw new a("Cannot skip unexpected " + y() + " at " + W());
        }
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 14) {
            u0();
        } else if (iL == 13) {
            d0(f180255q);
        } else if (iL == 12) {
            d0(f180254p);
        } else if (iL != 15) {
            throw new a("Expected a name but was " + y() + " at path " + W());
        }
        this.f180261k = 0;
        this.f180237c[this.f180235a - 1] = "null";
    }

    @Override // sd.c
    public void Y() throws b, EOFException {
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 1) {
            C(3);
            this.f180261k = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + y() + " at path " + W());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f180261k = 0;
        this.f180236b[0] = 8;
        this.f180235a = 1;
        this.f180260j.b();
        this.f180259h.close();
    }

    @Override // sd.c
    public void h() throws b, EOFException {
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 3) {
            C(1);
            this.f180238d[this.f180235a - 1] = 0;
            this.f180261k = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + y() + " at path " + W());
        }
    }

    @Override // sd.c
    public void h0() throws b, EOFException {
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        if (iL != 2) {
            throw new a("Expected END_OBJECT but was " + y() + " at path " + W());
        }
        int i15 = this.f180235a;
        int i16 = i15 - 1;
        this.f180235a = i16;
        this.f180237c[i16] = null;
        int[] iArr = this.f180238d;
        int i17 = i15 - 2;
        iArr[i17] = iArr[i17] + 1;
        this.f180261k = 0;
    }

    @Override // sd.c
    public String h1() throws b, EOFException {
        String strV;
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 14) {
            strV = Z();
        } else if (iL == 13) {
            strV = V(f180255q);
        } else if (iL == 12) {
            strV = V(f180254p);
        } else {
            if (iL != 15) {
                throw new a("Expected a name but was " + y() + " at path " + W());
            }
            strV = this.f180264n;
        }
        this.f180261k = 0;
        this.f180237c[this.f180235a - 1] = strV;
        return strV;
    }

    @Override // sd.c
    public void m() throws b, EOFException {
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        if (iL != 4) {
            throw new a("Expected END_ARRAY but was " + y() + " at path " + W());
        }
        int i15 = this.f180235a;
        this.f180235a = i15 - 1;
        int[] iArr = this.f180238d;
        int i16 = i15 - 2;
        iArr[i16] = iArr[i16] + 1;
        this.f180261k = 0;
    }

    @Override // sd.c
    public double nextDouble() throws b, EOFException {
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 16) {
            this.f180261k = 0;
            int[] iArr = this.f180238d;
            int i15 = this.f180235a - 1;
            iArr[i15] = iArr[i15] + 1;
            return this.f180262l;
        }
        if (iL == 17) {
            this.f180264n = this.f180260j.n2(this.f180263m);
        } else if (iL == 9) {
            this.f180264n = V(f180255q);
        } else if (iL == 8) {
            this.f180264n = V(f180254p);
        } else if (iL == 10) {
            this.f180264n = Z();
        } else if (iL != 11) {
            throw new a("Expected a double but was " + y() + " at path " + W());
        }
        this.f180261k = 11;
        try {
            double d15 = Double.parseDouble(this.f180264n);
            if (this.f180239e || !(Double.isNaN(d15) || Double.isInfinite(d15))) {
                this.f180264n = null;
                this.f180261k = 0;
                int[] iArr2 = this.f180238d;
                int i16 = this.f180235a - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return d15;
            }
            throw new b("JSON forbids NaN and infinities: " + d15 + " at path " + W());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f180264n + " at path " + W());
        }
    }

    @Override // sd.c
    public int nextInt() throws b, EOFException {
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 16) {
            long j15 = this.f180262l;
            int i15 = (int) j15;
            if (j15 == i15) {
                this.f180261k = 0;
                int[] iArr = this.f180238d;
                int i16 = this.f180235a - 1;
                iArr[i16] = iArr[i16] + 1;
                return i15;
            }
            throw new a("Expected an int but was " + this.f180262l + " at path " + W());
        }
        if (iL == 17) {
            this.f180264n = this.f180260j.n2(this.f180263m);
        } else if (iL == 9 || iL == 8) {
            String strV = iL == 9 ? V(f180255q) : V(f180254p);
            this.f180264n = strV;
            try {
                int i17 = Integer.parseInt(strV);
                this.f180261k = 0;
                int[] iArr2 = this.f180238d;
                int i18 = this.f180235a - 1;
                iArr2[i18] = iArr2[i18] + 1;
                return i17;
            } catch (NumberFormatException unused) {
            }
        } else if (iL != 11) {
            throw new a("Expected an int but was " + y() + " at path " + W());
        }
        this.f180261k = 11;
        try {
            double d15 = Double.parseDouble(this.f180264n);
            int i19 = (int) d15;
            if (i19 == d15) {
                this.f180264n = null;
                this.f180261k = 0;
                int[] iArr3 = this.f180238d;
                int i25 = this.f180235a - 1;
                iArr3[i25] = iArr3[i25] + 1;
                return i19;
            }
            throw new a("Expected an int but was " + this.f180264n + " at path " + W());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f180264n + " at path " + W());
        }
    }

    @Override // sd.c
    public boolean p() throws b, EOFException {
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        return (iL == 2 || iL == 4 || iL == 18) ? false : true;
    }

    @Override // sd.c
    public String q2() throws b, EOFException {
        String strN2;
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 10) {
            strN2 = Z();
        } else if (iL == 9) {
            strN2 = V(f180255q);
        } else if (iL == 8) {
            strN2 = V(f180254p);
        } else if (iL == 11) {
            strN2 = this.f180264n;
            this.f180264n = null;
        } else if (iL == 16) {
            strN2 = Long.toString(this.f180262l);
        } else {
            if (iL != 17) {
                throw new a("Expected a string but was " + y() + " at path " + W());
            }
            strN2 = this.f180260j.n2(this.f180263m);
        }
        this.f180261k = 0;
        int[] iArr = this.f180238d;
        int i15 = this.f180235a - 1;
        iArr[i15] = iArr[i15] + 1;
        return strN2;
    }

    @Override // sd.c
    public boolean r() throws b, EOFException {
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        if (iL == 5) {
            this.f180261k = 0;
            int[] iArr = this.f180238d;
            int i15 = this.f180235a - 1;
            iArr[i15] = iArr[i15] + 1;
            return true;
        }
        if (iL == 6) {
            this.f180261k = 0;
            int[] iArr2 = this.f180238d;
            int i16 = this.f180235a - 1;
            iArr2[i16] = iArr2[i16] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + y() + " at path " + W());
    }

    public String toString() {
        return "JsonReader(" + this.f180259h + ")";
    }

    @Override // sd.c
    public c.b y() throws b, EOFException {
        int iL = this.f180261k;
        if (iL == 0) {
            iL = L();
        }
        switch (iL) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
