package no;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f137441a;

    public a(InputStream inputStream) {
        this.f137441a = inputStream;
    }

    private String a(String str) throws IOException {
        if (str.length() < 2) {
            throw new IOException("Error: Expected hex string of length >= 2 not='" + str);
        }
        if (str.charAt(0) != '<' || str.charAt(str.length() - 1) != '>') {
            throw new IOException("String should be enclosed by angle brackets '" + str + "'");
        }
        String strSubstring = str.substring(1, str.length() - 1);
        byte[] bArr = new byte[strSubstring.length() / 2];
        for (int i15 = 0; i15 < strSubstring.length(); i15 += 2) {
            try {
                bArr[i15 / 2] = (byte) Integer.parseInt(Character.toString(strSubstring.charAt(i15)) + strSubstring.charAt(i15 + 1), 16);
            } catch (NumberFormatException e15) {
                throw new IOException("Error parsing AFM file:" + e15);
            }
        }
        return new String(bArr, uo.b.f199525a);
    }

    private boolean b(int i15) {
        return i15 == 13 || i15 == 10;
    }

    private boolean c(int i15) {
        return i15 == 32 || i15 == 9 || i15 == 13 || i15 == 10;
    }

    private b e() throws IOException {
        b bVar = new b();
        StringTokenizer stringTokenizer = new StringTokenizer(m());
        while (stringTokenizer.hasMoreTokens()) {
            try {
                String strNextToken = stringTokenizer.nextToken();
                if (strNextToken.equals("C")) {
                    bVar.f(Integer.parseInt(stringTokenizer.nextToken()));
                    o(stringTokenizer);
                } else if (strNextToken.equals("CH")) {
                    bVar.f(Integer.parseInt(stringTokenizer.nextToken(), 16));
                    o(stringTokenizer);
                } else if (strNextToken.equals("WX")) {
                    bVar.p(Float.parseFloat(stringTokenizer.nextToken()));
                    o(stringTokenizer);
                } else if (strNextToken.equals("W0X")) {
                    bVar.k(Float.parseFloat(stringTokenizer.nextToken()));
                    o(stringTokenizer);
                } else if (strNextToken.equals("W1X")) {
                    bVar.n(Float.parseFloat(stringTokenizer.nextToken()));
                    o(stringTokenizer);
                } else if (strNextToken.equals("WY")) {
                    bVar.q(Float.parseFloat(stringTokenizer.nextToken()));
                    o(stringTokenizer);
                } else if (strNextToken.equals("W0Y")) {
                    bVar.l(Float.parseFloat(stringTokenizer.nextToken()));
                    o(stringTokenizer);
                } else if (strNextToken.equals("W1Y")) {
                    bVar.o(Float.parseFloat(stringTokenizer.nextToken()));
                    o(stringTokenizer);
                } else if (strNextToken.equals("W")) {
                    bVar.i(new float[]{Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken())});
                    o(stringTokenizer);
                } else if (strNextToken.equals("W0")) {
                    bVar.j(new float[]{Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken())});
                    o(stringTokenizer);
                } else if (strNextToken.equals("W1")) {
                    bVar.m(new float[]{Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken())});
                    o(stringTokenizer);
                } else if (strNextToken.equals("VV")) {
                    bVar.h(new float[]{Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken())});
                    o(stringTokenizer);
                } else if (strNextToken.equals("N")) {
                    bVar.g(stringTokenizer.nextToken());
                    o(stringTokenizer);
                } else if (strNextToken.equals("B")) {
                    uo.a aVar = new uo.a();
                    aVar.f(Float.parseFloat(stringTokenizer.nextToken()));
                    aVar.g(Float.parseFloat(stringTokenizer.nextToken()));
                    aVar.h(Float.parseFloat(stringTokenizer.nextToken()));
                    aVar.i(Float.parseFloat(stringTokenizer.nextToken()));
                    bVar.e(aVar);
                    o(stringTokenizer);
                } else {
                    if (!strNextToken.equals(i.f37094u)) {
                        throw new IOException("Unknown CharMetrics command '" + strNextToken + "'");
                    }
                    g gVar = new g();
                    gVar.b(stringTokenizer.nextToken());
                    gVar.a(stringTokenizer.nextToken());
                    bVar.a(gVar);
                    o(stringTokenizer);
                }
            } catch (NumberFormatException e15) {
                throw new IOException("Error: Corrupt AFM document:" + e15);
            }
        }
        return bVar;
    }

    private c f() throws IOException {
        c cVar = new c();
        StringTokenizer stringTokenizer = new StringTokenizer(m(), " ;");
        String strNextToken = stringTokenizer.nextToken();
        if (!strNextToken.equals("CC")) {
            throw new IOException("Expected 'CC' actual='" + strNextToken + "'");
        }
        cVar.b(stringTokenizer.nextToken());
        try {
            int i15 = Integer.parseInt(stringTokenizer.nextToken());
            for (int i16 = 0; i16 < i15; i16++) {
                d dVar = new d();
                String strNextToken2 = stringTokenizer.nextToken();
                if (!strNextToken2.equals("PCC")) {
                    throw new IOException("Expected 'PCC' actual='" + strNextToken2 + "'");
                }
                String strNextToken3 = stringTokenizer.nextToken();
                try {
                    int i17 = Integer.parseInt(stringTokenizer.nextToken());
                    int i18 = Integer.parseInt(stringTokenizer.nextToken());
                    dVar.a(strNextToken3);
                    dVar.b(i17);
                    dVar.c(i18);
                    cVar.a(dVar);
                } catch (NumberFormatException e15) {
                    throw new IOException("Error parsing AFM document:" + e15);
                }
            }
            return cVar;
        } catch (NumberFormatException e16) {
            throw new IOException("Error parsing AFM document:" + e16);
        }
    }

    private e g(boolean z15) throws IOException {
        e eVar = new e();
        String strN = n();
        if (!"StartFontMetrics".equals(strN)) {
            throw new IOException("Error: The AFM file should start with StartFontMetrics and not '" + strN + "'");
        }
        eVar.t(k());
        boolean z16 = false;
        while (true) {
            String strN2 = n();
            if ("EndFontMetrics".equals(strN2)) {
                break;
            }
            if ("FontName".equals(strN2)) {
                eVar.G(m());
            } else if ("FullName".equals(strN2)) {
                eVar.I(m());
            } else if ("FamilyName".equals(strN2)) {
                eVar.D(m());
            } else if ("Weight".equals(strN2)) {
                eVar.T(m());
            } else if ("FontBBox".equals(strN2)) {
                uo.a aVar = new uo.a();
                aVar.f(k());
                aVar.g(k());
                aVar.h(k());
                aVar.i(k());
                eVar.F(aVar);
            } else if ("Version".equals(strN2)) {
                eVar.H(m());
            } else if ("Notice".equals(strN2)) {
                eVar.N(m());
            } else if ("EncodingScheme".equals(strN2)) {
                eVar.B(m());
            } else if ("MappingScheme".equals(strN2)) {
                eVar.M(l());
            } else if ("EscChar".equals(strN2)) {
                eVar.C(l());
            } else if ("CharacterSet".equals(strN2)) {
                eVar.y(m());
            } else if ("Characters".equals(strN2)) {
                eVar.z(l());
            } else if ("IsBaseFont".equals(strN2)) {
                eVar.J(j());
            } else if ("VVector".equals(strN2)) {
                eVar.S(new float[]{k(), k()});
            } else if ("IsFixedV".equals(strN2)) {
                eVar.K(j());
            } else if ("CapHeight".equals(strN2)) {
                eVar.v(k());
            } else if ("XHeight".equals(strN2)) {
                eVar.U(k());
            } else if ("Ascender".equals(strN2)) {
                eVar.u(k());
            } else if ("Descender".equals(strN2)) {
                eVar.A(k());
            } else if ("StdHW".equals(strN2)) {
                eVar.O(k());
            } else if ("StdVW".equals(strN2)) {
                eVar.P(k());
            } else if ("Comment".equals(strN2)) {
                eVar.a(m());
            } else if ("UnderlinePosition".equals(strN2)) {
                eVar.Q(k());
            } else if ("UnderlineThickness".equals(strN2)) {
                eVar.R(k());
            } else if ("ItalicAngle".equals(strN2)) {
                eVar.L(k());
            } else if ("CharWidth".equals(strN2)) {
                eVar.x(new float[]{k(), k()});
            } else if ("IsFixedPitch".equals(strN2)) {
                eVar.E(j());
            } else if ("StartCharMetrics".equals(strN2)) {
                int iL = l();
                ArrayList arrayList = new ArrayList(iL);
                for (int i15 = 0; i15 < iL; i15++) {
                    arrayList.add(e());
                }
                String strN3 = n();
                if (!strN3.equals("EndCharMetrics")) {
                    throw new IOException("Error: Expected 'EndCharMetrics' actual '" + strN3 + "'");
                }
                eVar.w(arrayList);
                z16 = true;
            } else if (!z15 && "StartComposites".equals(strN2)) {
                int iL2 = l();
                for (int i16 = 0; i16 < iL2; i16++) {
                    eVar.b(f());
                }
                String strN4 = n();
                if (!strN4.equals("EndComposites")) {
                    throw new IOException("Error: Expected 'EndComposites' actual '" + strN4 + "'");
                }
            } else {
                if (z15 || !"StartKernData".equals(strN2)) {
                    if (z15 && z16) {
                        break;
                    }
                    throw new IOException("Unknown AFM key '" + strN2 + "'");
                }
                h(eVar);
            }
        }
        return eVar;
    }

    private void h(e eVar) throws IOException {
        while (true) {
            String strN = n();
            if (strN.equals("EndKernData")) {
                return;
            }
            int i15 = 0;
            if ("StartTrackKern".equals(strN)) {
                int iL = l();
                while (i15 < iL) {
                    h hVar = new h();
                    hVar.a(l());
                    hVar.e(k());
                    hVar.d(k());
                    hVar.c(k());
                    hVar.b(k());
                    eVar.f(hVar);
                    i15++;
                }
                String strN2 = n();
                if (!strN2.equals("EndTrackKern")) {
                    throw new IOException("Error: Expected 'EndTrackKern' actual '" + strN2 + "'");
                }
            } else if ("StartKernPairs".equals(strN)) {
                int iL2 = l();
                while (i15 < iL2) {
                    eVar.c(i());
                    i15++;
                }
                String strN3 = n();
                if (!strN3.equals("EndKernPairs")) {
                    throw new IOException("Error: Expected 'EndKernPairs' actual '" + strN3 + "'");
                }
            } else if ("StartKernPairs0".equals(strN)) {
                int iL3 = l();
                while (i15 < iL3) {
                    eVar.d(i());
                    i15++;
                }
                String strN4 = n();
                if (!strN4.equals("EndKernPairs")) {
                    throw new IOException("Error: Expected 'EndKernPairs' actual '" + strN4 + "'");
                }
            } else {
                if (!"StartKernPairs1".equals(strN)) {
                    throw new IOException("Unknown kerning data type '" + strN + "'");
                }
                int iL4 = l();
                while (i15 < iL4) {
                    eVar.e(i());
                    i15++;
                }
                String strN5 = n();
                if (!strN5.equals("EndKernPairs")) {
                    throw new IOException("Error: Expected 'EndKernPairs' actual '" + strN5 + "'");
                }
            }
        }
    }

    private f i() throws IOException {
        f fVar = new f();
        String strN = n();
        if ("KP".equals(strN)) {
            fVar.a(n());
            fVar.b(n());
            fVar.c(k());
            fVar.d(k());
            return fVar;
        }
        if ("KPH".equals(strN)) {
            fVar.a(a(n()));
            fVar.b(a(n()));
            fVar.c(k());
            fVar.d(k());
            return fVar;
        }
        if ("KPX".equals(strN)) {
            fVar.a(n());
            fVar.b(n());
            fVar.c(k());
            fVar.d(0.0f);
            return fVar;
        }
        if ("KPY".equals(strN)) {
            fVar.a(n());
            fVar.b(n());
            fVar.c(0.0f);
            fVar.d(k());
            return fVar;
        }
        throw new IOException("Error expected kern pair command actual='" + strN + "'");
    }

    private boolean j() {
        return Boolean.parseBoolean(n());
    }

    private float k() {
        return Float.parseFloat(n());
    }

    private int l() throws IOException {
        try {
            return Integer.parseInt(n());
        } catch (NumberFormatException e15) {
            throw new IOException("Error parsing AFM document:" + e15);
        }
    }

    private String m() throws IOException {
        StringBuilder sb5 = new StringBuilder(60);
        int i15 = this.f137441a.read();
        while (c(i15)) {
            i15 = this.f137441a.read();
        }
        sb5.append((char) i15);
        int i16 = this.f137441a.read();
        while (i16 != -1 && !b(i16)) {
            sb5.append((char) i16);
            i16 = this.f137441a.read();
        }
        return sb5.toString();
    }

    private String n() throws IOException {
        StringBuilder sb5 = new StringBuilder(24);
        int i15 = this.f137441a.read();
        while (c(i15)) {
            i15 = this.f137441a.read();
        }
        sb5.append((char) i15);
        int i16 = this.f137441a.read();
        while (i16 != -1 && !c(i16)) {
            sb5.append((char) i16);
            i16 = this.f137441a.read();
        }
        return sb5.toString();
    }

    private void o(StringTokenizer stringTokenizer) throws IOException {
        if (!stringTokenizer.hasMoreTokens()) {
            throw new IOException("CharMetrics is missing a semicolon after a command");
        }
        String strNextToken = stringTokenizer.nextToken();
        if (";".equals(strNextToken)) {
            return;
        }
        throw new IOException("Error: Expected semicolon in stream actual='" + strNextToken + "'");
    }

    public e d(boolean z15) {
        return g(z15);
    }
}
