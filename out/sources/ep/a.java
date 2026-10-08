package ep;

import bp.m;
import bp.p;
import io.sentry.android.core.c2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f52579d = Long.toString(Long.MAX_VALUE).length();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f52580a = xp.a.f220417f.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final k f52581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected bp.e f52582c;

    a(k kVar) {
        this.f52581b = kVar;
    }

    private boolean I() {
        int i15 = this.f52581b.read();
        while (true) {
            boolean z15 = false;
            if (i15 == -1 || i15 == 47 || i15 == 62) {
                break;
            }
            if (i15 == 101 && this.f52581b.read() == 110 && this.f52581b.read() == 100) {
                int i16 = this.f52581b.read();
                boolean z16 = i16 == 115 && this.f52581b.read() == 116 && this.f52581b.read() == 114 && this.f52581b.read() == 101 && this.f52581b.read() == 97 && this.f52581b.read() == 109;
                if (!z16 && i16 == 111 && this.f52581b.read() == 98 && this.f52581b.read() == 106) {
                    z15 = true;
                }
                if (z16 || z15) {
                    return true;
                }
            }
            i15 = this.f52581b.read();
        }
        if (i15 == -1) {
            return true;
        }
        this.f52581b.O1(i15);
        return false;
    }

    private int a(int i15) {
        byte b15;
        byte[] bArr = new byte[3];
        int i16 = this.f52581b.read(bArr);
        if (i16 == 3 && bArr[0] == 13 && (((b15 = bArr[1]) == 10 && bArr[2] == 47) || bArr[2] == 62 || b15 == 47 || b15 == 62)) {
            i15 = 0;
        }
        if (i16 > 0) {
            this.f52581b.q3(bArr, 0, i16);
        }
        return i15;
    }

    private bp.b b(m mVar) throws IOException {
        bp.e eVar = this.f52582c;
        if (eVar != null) {
            return eVar.h4(mVar);
        }
        throw new IOException("object reference " + mVar + " at offset " + this.f52581b.getPosition() + " in content stream");
    }

    private boolean c(int i15) {
        return 13 == i15;
    }

    protected static boolean f(int i15) {
        return i15 >= 48 && i15 <= 57;
    }

    private static boolean i(char c15) {
        if (f(c15)) {
            return true;
        }
        if (c15 < 'a' || c15 > 'f') {
            return c15 >= 'A' && c15 <= 'F';
        }
        return true;
    }

    private boolean j(int i15) {
        return 10 == i15;
    }

    private boolean m(byte[] bArr) {
        try {
            this.f52580a.decode(ByteBuffer.wrap(bArr));
            return true;
        } catch (CharacterCodingException unused) {
            return false;
        }
    }

    private boolean r(bp.d dVar) throws IOException {
        bp.i iVarU = u();
        if (iVarU == null || iVarU.A3().isEmpty()) {
            c2.g("PdfBox-Android", "Empty COSName at offset " + this.f52581b.getPosition());
        }
        bp.b bVarS = s();
        J();
        if (bVarS == null) {
            c2.g("PdfBox-Android", "Bad dictionary declaration at offset " + this.f52581b.getPosition());
            return false;
        }
        if (!(bVarS instanceof bp.h) || ((bp.h) bVarS).i4()) {
            bVarS.A2(true);
            dVar.Y4(iVarU, bVarS);
        } else {
            c2.g("PdfBox-Android", "Skipped out of range number value at offset " + this.f52581b.getPosition());
        }
        return true;
    }

    private bp.b s() throws IOException {
        long position = this.f52581b.getPosition();
        bp.b bVarX = x();
        J();
        if (!(bVarX instanceof bp.k) || !e()) {
            return bVarX;
        }
        long position2 = this.f52581b.getPosition();
        bp.b bVarX2 = x();
        J();
        y('R');
        if (!(bVarX instanceof bp.h)) {
            c2.e("PdfBox-Android", "expected number, actual=" + bVarX + " at offset " + position);
            return bp.j.f20954c;
        }
        if (!(bVarX2 instanceof bp.h)) {
            c2.e("PdfBox-Android", "expected number, actual=" + bVarX2 + " at offset " + position2);
            return bp.j.f20954c;
        }
        long jX3 = ((bp.h) bVarX).X3();
        if (jX3 <= 0) {
            c2.g("PdfBox-Android", "invalid object number value =" + jX3 + " at offset " + position);
            return bp.j.f20954c;
        }
        int iJ3 = ((bp.h) bVarX2).J3();
        if (iJ3 >= 0) {
            return b(new m(jX3, iJ3));
        }
        c2.e("PdfBox-Android", "invalid generation number value =" + iJ3 + " at offset " + position);
        return bp.j.f20954c;
    }

    private p t() throws IOException {
        int i15;
        StringBuilder sb5 = new StringBuilder();
        while (true) {
            int i16 = this.f52581b.read();
            char c15 = (char) i16;
            if (!i(c15)) {
                if (i16 == 62) {
                    break;
                }
                if (i16 < 0) {
                    throw new IOException("Missing closing bracket for hex string. Reached EOS.");
                }
                if (i16 != 32 && i16 != 10 && i16 != 9 && i16 != 13 && i16 != 8 && i16 != 12) {
                    if (sb5.length() % 2 != 0) {
                        sb5.deleteCharAt(sb5.length() - 1);
                    }
                    do {
                        i15 = this.f52581b.read();
                        if (i15 == 62) {
                            break;
                        }
                    } while (i15 >= 0);
                    if (i15 >= 0) {
                        break;
                    }
                    throw new IOException("Missing closing bracket for hex string. Reached EOS.");
                }
            } else {
                sb5.append(c15);
            }
        }
        return p.N3(sb5.toString());
    }

    private bp.k v() {
        StringBuilder sb5 = new StringBuilder();
        int i15 = this.f52581b.read();
        while (true) {
            char c15 = (char) i15;
            if (!Character.isDigit(c15) && c15 != '-' && c15 != '+' && c15 != '.' && c15 != 'E' && c15 != 'e') {
                break;
            }
            sb5.append(c15);
            i15 = this.f52581b.read();
        }
        if (i15 != -1) {
            this.f52581b.O1(i15);
        }
        return bp.k.A3(sb5.toString());
    }

    protected final void A(char[] cArr, boolean z15) throws IOException {
        J();
        for (char c15 : cArr) {
            if (this.f52581b.read() != c15) {
                throw new IOException("Expected string '" + new String(cArr) + "' but missed at character '" + c15 + "' at offset " + this.f52581b.getPosition());
            }
        }
        J();
    }

    protected int B() throws IOException {
        int iC = C();
        if (iC >= 0 && iC <= 65535) {
            return iC;
        }
        throw new IOException("Generation Number '" + iC + "' has more than 5 digits");
    }

    protected int C() throws IOException {
        J();
        StringBuilder sbH = H();
        try {
            return Integer.parseInt(sbH.toString());
        } catch (NumberFormatException e15) {
            this.f52581b.a2(sbH.toString().getBytes(xp.a.f220415d));
            throw new IOException("Error: Expected an integer type at offset " + this.f52581b.getPosition() + ", instead got '" + ((Object) sbH) + "'", e15);
        }
    }

    protected String D() throws IOException {
        int i15;
        if (this.f52581b.k0()) {
            throw new IOException("Error: End-of-File, expected line at offset " + this.f52581b.getPosition());
        }
        StringBuilder sb5 = new StringBuilder(11);
        while (true) {
            i15 = this.f52581b.read();
            if (i15 == -1 || g(i15)) {
                break;
            }
            sb5.append((char) i15);
        }
        if (c(i15) && j(this.f52581b.peek())) {
            this.f52581b.read();
        }
        return sb5.toString();
    }

    protected long E() throws IOException {
        J();
        StringBuilder sbH = H();
        try {
            return Long.parseLong(sbH.toString());
        } catch (NumberFormatException e15) {
            this.f52581b.a2(sbH.toString().getBytes(xp.a.f220415d));
            throw new IOException("Error: Expected a long type at offset " + this.f52581b.getPosition() + ", instead got '" + ((Object) sbH) + "'", e15);
        }
    }

    protected long F() throws IOException {
        long jE = E();
        if (jE >= 0 && jE < 10000000000L) {
            return jE;
        }
        throw new IOException("Object Number '" + jE + "' has more than 10 digits or is negative");
    }

    protected String G() {
        J();
        StringBuilder sb5 = new StringBuilder();
        int i15 = this.f52581b.read();
        while (true) {
            char c15 = (char) i15;
            if (h(c15) || i15 == -1) {
                break;
            }
            sb5.append(c15);
            i15 = this.f52581b.read();
        }
        if (i15 != -1) {
            this.f52581b.O1(i15);
        }
        return sb5.toString();
    }

    protected final StringBuilder H() throws IOException {
        StringBuilder sb5 = new StringBuilder();
        do {
            int i15 = this.f52581b.read();
            if (i15 < 48 || i15 > 57) {
                if (i15 != -1) {
                    this.f52581b.O1(i15);
                }
                return sb5;
            }
            sb5.append((char) i15);
        } while (sb5.length() <= f52579d);
        throw new IOException("Number '" + ((Object) sb5) + "' is getting too long, stop reading at offset " + this.f52581b.getPosition());
    }

    protected void J() {
        int i15 = this.f52581b.read();
        while (true) {
            if (!o(i15) && i15 != 37) {
                break;
            }
            if (i15 == 37) {
                i15 = this.f52581b.read();
                while (!g(i15) && i15 != -1) {
                    i15 = this.f52581b.read();
                }
            } else {
                i15 = this.f52581b.read();
            }
        }
        if (i15 != -1) {
            this.f52581b.O1(i15);
        }
    }

    protected void K() {
        int i15 = this.f52581b.read();
        while (32 == i15) {
            i15 = this.f52581b.read();
        }
        if (13 != i15) {
            if (10 != i15) {
                this.f52581b.O1(i15);
            }
        } else {
            int i16 = this.f52581b.read();
            if (10 != i16) {
                this.f52581b.O1(i16);
            }
        }
    }

    protected boolean d(int i15) {
        return i15 == 93;
    }

    protected boolean e() {
        return f(this.f52581b.peek());
    }

    protected boolean g(int i15) {
        return j(i15) || c(i15);
    }

    protected boolean h(int i15) {
        return i15 == 32 || i15 == 13 || i15 == 10 || i15 == 9 || i15 == 62 || i15 == 60 || i15 == 91 || i15 == 47 || i15 == 93 || i15 == 41 || i15 == 40 || i15 == 0 || i15 == 12 || i15 == 37;
    }

    protected boolean k() {
        return l(this.f52581b.peek());
    }

    protected boolean l(int i15) {
        return 32 == i15;
    }

    protected boolean n() {
        return o(this.f52581b.peek());
    }

    protected boolean o(int i15) {
        return i15 == 0 || i15 == 9 || i15 == 12 || i15 == 10 || i15 == 13 || i15 == 32;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007b  */
    protected bp.a p() throws IOException {
        long position = this.f52581b.getPosition();
        y('[');
        bp.a aVar = new bp.a();
        J();
        while (true) {
            int iPeek = this.f52581b.peek();
            if (iPeek <= 0 || ((char) iPeek) == ']') {
                break;
            }
            bp.b bVarX = x();
            if (bVarX instanceof bp.l) {
                if (aVar.size() <= 0 || !(aVar.g4(aVar.size() - 1) instanceof bp.h)) {
                    bVarX = null;
                } else {
                    bp.h hVar = (bp.h) aVar.m4(aVar.size() - 1);
                    if (aVar.size() <= 0 || !(aVar.g4(aVar.size() - 1) instanceof bp.h)) {
                        bVarX = null;
                    } else {
                        bVarX = b(new m(((bp.h) aVar.m4(aVar.size() - 1)).X3(), hVar.J3()));
                    }
                }
            }
            if (bVarX == null) {
                c2.g("PdfBox-Android", "Corrupt array element at offset " + this.f52581b.getPosition() + ", start offset: " + position);
                String strG = G();
                if (!strG.isEmpty() || this.f52581b.peek() != 91) {
                    this.f52581b.a2(strG.getBytes(xp.a.f220415d));
                    if ("endobj".equals(strG) || "endstream".equals(strG)) {
                    }
                }
                return aVar;
            }
            aVar.A3(bVarX);
            J();
        }
        this.f52581b.read();
        J();
        return aVar;
    }

    protected bp.d q() throws IOException {
        y('<');
        y('<');
        J();
        bp.d dVar = new bp.d();
        boolean z15 = false;
        while (!z15) {
            J();
            char cPeek = (char) this.f52581b.peek();
            if (cPeek == '>') {
                z15 = true;
            } else if (cPeek != '/') {
                c2.g("PdfBox-Android", "Invalid dictionary, found: '" + cPeek + "' but expected: '/' at offset " + this.f52581b.getPosition());
                if (I()) {
                    return dVar;
                }
            } else if (!r(dVar)) {
                return dVar;
            }
        }
        y('>');
        y('>');
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    protected bp.i u() throws IOException {
        y('/');
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i15 = this.f52581b.read();
        while (i15 != -1) {
            if (i15 == 35) {
                int i16 = this.f52581b.read();
                int i17 = this.f52581b.read();
                char c15 = (char) i16;
                if (!i(c15)) {
                    if (i17 != -1) {
                    }
                    c2.e("PdfBox-Android", "Premature EOF in BaseParser#parseCOSName");
                    i15 = -1;
                    break;
                }
                char c16 = (char) i17;
                if (i(c16)) {
                    String str = Character.toString(c15) + c16;
                    try {
                        byteArrayOutputStream.write(Integer.parseInt(str, 16));
                        i16 = this.f52581b.read();
                    } catch (NumberFormatException e15) {
                        throw new IOException("Error: expected hex digit, actual='" + str + "'", e15);
                    }
                } else {
                    if (i17 != -1 || i16 == -1) {
                        c2.e("PdfBox-Android", "Premature EOF in BaseParser#parseCOSName");
                        i15 = -1;
                        break;
                    }
                    this.f52581b.O1(i17);
                    byteArrayOutputStream.write(i15);
                }
                i15 = i16;
            } else {
                if (h(i15)) {
                    break;
                }
                byteArrayOutputStream.write(i15);
                i15 = this.f52581b.read();
            }
        }
        if (i15 != -1) {
            this.f52581b.O1(i15);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return bp.i.J3(m(byteArray) ? new String(byteArray, xp.a.f220417f) : new String(byteArray, xp.a.f220416e));
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0020 A[SYNTHETIC] */
    protected p w() throws IOException {
        char c15 = (char) this.f52581b.read();
        if (c15 == '<') {
            return t();
        }
        if (c15 != '(') {
            throw new IOException("parseCOSString string should start with '(' or '<' and not '" + c15 + "' at offset " + this.f52581b.getPosition());
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i15 = this.f52581b.read();
        int iA = 1;
        while (iA > 0 && i15 != -1) {
            char c16 = (char) i15;
            if (c16 == ')') {
                iA = a(iA - 1);
                if (iA != 0) {
                    byteArrayOutputStream.write(c16);
                }
            } else if (c16 == '(') {
                iA++;
                byteArrayOutputStream.write(c16);
            } else if (c16 == '\\') {
                char c17 = (char) this.f52581b.read();
                if (c17 == '\n' || c17 == '\r') {
                    i15 = this.f52581b.read();
                    while (g(i15) && i15 != -1) {
                        i15 = this.f52581b.read();
                    }
                } else if (c17 == '\\') {
                    byteArrayOutputStream.write(c17);
                } else if (c17 == 'b') {
                    byteArrayOutputStream.write(8);
                } else if (c17 == 'f') {
                    byteArrayOutputStream.write(12);
                } else if (c17 == 'n') {
                    byteArrayOutputStream.write(10);
                } else if (c17 == 'r') {
                    byteArrayOutputStream.write(13);
                } else if (c17 == 't') {
                    byteArrayOutputStream.write(9);
                } else if (c17 == '(') {
                    byteArrayOutputStream.write(c17);
                } else if (c17 != ')') {
                    switch (c17) {
                        case '0':
                        case '1':
                        case '2':
                        case EACTags.TRANSACTION_DATE /* 51 */:
                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        case '5':
                        case EACTags.CURRENCY_EXPONENT /* 54 */:
                        case '7':
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(c17);
                            i15 = this.f52581b.read();
                            char c18 = (char) i15;
                            if (c18 >= '0' && c18 <= '7') {
                                sb5.append(c18);
                                i15 = this.f52581b.read();
                                char c19 = (char) i15;
                                if (c19 >= '0' && c19 <= '7') {
                                    sb5.append(c19);
                                    i15 = -2;
                                }
                            }
                            try {
                                byteArrayOutputStream.write(Integer.parseInt(sb5.toString(), 8));
                            } catch (NumberFormatException e15) {
                                throw new IOException("Error: Expected octal character, actual='" + ((Object) sb5) + "'", e15);
                            }
                            break;
                        default:
                            byteArrayOutputStream.write(c17);
                            break;
                    }
                } else {
                    iA = a(iA);
                    if (iA != 0) {
                        byteArrayOutputStream.write(c17);
                    } else {
                        byteArrayOutputStream.write(92);
                    }
                }
                if (i15 != -2) {
                    i15 = this.f52581b.read();
                }
            } else {
                byteArrayOutputStream.write(c16);
            }
            i15 = -2;
            if (i15 != -2) {
                i15 = this.f52581b.read();
            }
        }
        if (i15 != -1) {
            this.f52581b.O1(i15);
        }
        return new p(byteArrayOutputStream.toByteArray());
    }

    protected bp.b x() throws IOException {
        J();
        char cPeek = (char) this.f52581b.peek();
        if (cPeek == '(') {
            return w();
        }
        if (cPeek == '/') {
            return u();
        }
        if (cPeek == '<') {
            int i15 = this.f52581b.read();
            char cPeek2 = (char) this.f52581b.peek();
            this.f52581b.O1(i15);
            return cPeek2 == '<' ? q() : w();
        }
        if (cPeek == 'R') {
            this.f52581b.read();
            return new bp.l(null);
        }
        if (cPeek == '[') {
            return p();
        }
        if (cPeek == 'f') {
            String str = new String(this.f52581b.j0(5), xp.a.f220415d);
            if (str.equals("false")) {
                return bp.c.f20657f;
            }
            throw new IOException("expected false actual='" + str + "' " + this.f52581b + "' at offset " + this.f52581b.getPosition());
        }
        if (cPeek == 'n') {
            z("null");
            return bp.j.f20954c;
        }
        if (cPeek == 't') {
            String str2 = new String(this.f52581b.j0(4), xp.a.f220415d);
            if (str2.equals("true")) {
                return bp.c.f20656e;
            }
            throw new IOException("expected true actual='" + str2 + "' " + this.f52581b + "' at offset " + this.f52581b.getPosition());
        }
        if (cPeek == 65535) {
            return null;
        }
        if (Character.isDigit(cPeek) || cPeek == '-' || cPeek == '+' || cPeek == '.') {
            return v();
        }
        long position = this.f52581b.getPosition();
        String strG = G();
        if (!strG.isEmpty()) {
            if ("endobj".equals(strG) || "endstream".equals(strG)) {
                this.f52581b.a2(strG.getBytes(xp.a.f220415d));
            } else {
                c2.g("PdfBox-Android", "Skipped unexpected dir object = '" + strG + "' at offset " + this.f52581b.getPosition() + " (start offset: " + position + ")");
            }
            return null;
        }
        int iPeek = this.f52581b.peek();
        throw new IOException("Unknown dir object c='" + cPeek + "' cInt=" + ((int) cPeek) + " peek='" + ((char) iPeek) + "' peekInt=" + iPeek + " at offset " + this.f52581b.getPosition() + " (start offset: " + position + ")");
    }

    protected void y(char c15) throws IOException {
        char c16 = (char) this.f52581b.read();
        if (c16 == c15) {
            return;
        }
        throw new IOException("expected='" + c15 + "' actual='" + c16 + "' at offset " + this.f52581b.getPosition());
    }

    protected void z(String str) throws IOException {
        A(str.toCharArray(), false);
    }
}
