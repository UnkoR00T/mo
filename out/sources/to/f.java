package to;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f191223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f191224b;

    f() {
    }

    private List<Number> a(List<b> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        int size = list.size() - 1;
        for (int i15 = 1; i15 < size; i15++) {
            b bVar = list.get(i15);
            if (bVar.d() == b.f191171g) {
                arrayList.add(Float.valueOf(bVar.b()));
            } else {
                if (bVar.d() != b.f191172h) {
                    throw new IOException("Expected INTEGER or REAL but got " + bVar + " at array position " + i15);
                }
                arrayList.add(Integer.valueOf(bVar.f()));
            }
        }
        return arrayList;
    }

    private byte[] b(byte[] bArr, int i15, int i16) {
        if (i16 == -1) {
            return bArr;
        }
        if (bArr.length == 0 || i16 > bArr.length) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length - i16];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            int i18 = bArr[i17] & GF2Field.MASK;
            int i19 = (i15 >> 8) ^ i18;
            if (i17 >= i16) {
                bArr2[i17 - i16] = (byte) i19;
            }
            i15 = 65535 & (((i18 + i15) * 52845) + 22719);
        }
        return bArr2;
    }

    private byte[] c(byte[] bArr) {
        int i15 = 0;
        for (byte b15 : bArr) {
            if (Character.digit((char) b15, 16) != -1) {
                i15++;
            }
        }
        byte[] bArr2 = new byte[i15 / 2];
        int i16 = 0;
        int i17 = -1;
        for (byte b16 : bArr) {
            int iDigit = Character.digit((char) b16, 16);
            if (iDigit != -1) {
                if (i17 == -1) {
                    i17 = iDigit;
                } else {
                    bArr2[i16] = (byte) ((i17 * 16) + iDigit);
                    i17 = -1;
                    i16++;
                }
            }
        }
        return bArr2;
    }

    private boolean d(byte[] bArr) {
        if (bArr.length < 4) {
            return true;
        }
        for (int i15 = 0; i15 < 4; i15++) {
            byte b15 = bArr[i15];
            if (b15 != 10 && b15 != 13 && b15 != 32 && b15 != 9 && Character.digit((char) b15, 16) == -1) {
                return true;
            }
        }
        return false;
    }

    private void f(byte[] bArr) throws IOException {
        b bVarD;
        if (bArr.length == 0) {
            throw new IOException("ASCII segment of type 1 font is empty");
        }
        if (bArr.length >= 2) {
            if (bArr[0] == 37 || bArr[1] == 33) {
                e eVar = new e(bArr);
                this.f191223a = eVar;
                if ("FontDirectory".equals(eVar.d().e())) {
                    b.a aVar = b.f191169e;
                    i(aVar, "FontDirectory");
                    h(b.f191170f);
                    i(aVar, "known");
                    b.a aVar2 = b.f191175k;
                    h(aVar2);
                    t();
                    h(aVar2);
                    t();
                    i(aVar, "ifelse");
                }
                int iF = h(b.f191172h).f();
                b.a aVar3 = b.f191169e;
                i(aVar3, "dict");
                o(aVar3, "dup");
                i(aVar3, "begin");
                for (int i15 = 0; i15 < iF && (bVarD = this.f191223a.d()) != null && (bVarD.d() != b.f191169e || (!bVarD.e().equals("currentdict") && !bVarD.e().equals("end"))); i15++) {
                    String strE = h(b.f191170f).e();
                    if (strE.equals("FontInfo") || strE.equals("Fontinfo")) {
                        n(v());
                    } else if (strE.equals("Metrics")) {
                        v();
                    } else if (strE.equals("Encoding")) {
                        m();
                    } else {
                        w(strE);
                    }
                }
                b.a aVar4 = b.f191169e;
                o(aVar4, "currentdict");
                i(aVar4, "end");
                i(aVar4, "currentfile");
                i(aVar4, "eexec");
                return;
            }
        }
        throw new IOException("Invalid start of ASCII segment of type 1 font");
    }

    private void g(byte[] bArr) throws IOException {
        int iF = 4;
        e eVar = new e(d(bArr) ? b(bArr, 55665, 4) : b(c(bArr), 55665, 4));
        this.f191223a = eVar;
        b bVarD = eVar.d();
        while (bVarD != null && !i.f37085l.equals(bVarD.e())) {
            this.f191223a.b();
            bVarD = this.f191223a.d();
        }
        if (bVarD == null) {
            throw new IOException("/Private token not found");
        }
        i(b.f191170f, i.f37085l);
        int iF2 = h(b.f191172h).f();
        b.a aVar = b.f191169e;
        i(aVar, "dict");
        o(aVar, "dup");
        i(aVar, "begin");
        for (int i15 = 0; i15 < iF2; i15++) {
            e eVar2 = this.f191223a;
            b.a aVar2 = b.f191170f;
            if (!eVar2.c(aVar2)) {
                break;
            }
            String strE = h(aVar2).e();
            if ("Subrs".equals(strE)) {
                x(iF);
            } else if ("OtherSubrs".equals(strE)) {
                p();
            } else if ("lenIV".equals(strE)) {
                iF = l().get(0).f();
            } else if ("ND".equals(strE)) {
                h(b.f191175k);
                b.a aVar3 = b.f191169e;
                o(aVar3, "noaccess");
                i(aVar3, "def");
                h(b.f191176l);
                o(aVar3, "executeonly");
                o(aVar3, "readonly");
                i(aVar3, "def");
            } else if ("NP".equals(strE)) {
                h(b.f191175k);
                b.a aVar4 = b.f191169e;
                o(aVar4, "noaccess");
                h(aVar4);
                h(b.f191176l);
                o(aVar4, "executeonly");
                o(aVar4, "readonly");
                i(aVar4, "def");
            } else if ("RD".equals(strE)) {
                h(b.f191175k);
                t();
                b.a aVar5 = b.f191169e;
                o(aVar5, "bind");
                o(aVar5, "executeonly");
                o(aVar5, "readonly");
                i(aVar5, "def");
            } else {
                r(strE, l());
            }
        }
        while (true) {
            e eVar3 = this.f191223a;
            b.a aVar6 = b.f191170f;
            if (eVar3.c(aVar6) && this.f191223a.d().e().equals("CharStrings")) {
                i(aVar6, "CharStrings");
                j(iF);
                return;
            }
            this.f191223a.b();
        }
    }

    private b h(b.a aVar) throws IOException {
        b bVarB = this.f191223a.b();
        if (bVarB != null && bVarB.d() == aVar) {
            return bVarB;
        }
        throw new IOException("Found " + bVarB + " but expected " + aVar);
    }

    private void i(b.a aVar, String str) throws IOException {
        b bVarH = h(aVar);
        if (bVarH.e() == null || !bVarH.e().equals(str)) {
            throw new IOException("Found " + bVarH + " but expected " + str);
        }
    }

    private void j(int i15) throws IOException {
        int iF = h(b.f191172h).f();
        b.a aVar = b.f191169e;
        i(aVar, "dict");
        i(aVar, "dup");
        i(aVar, "begin");
        for (int i16 = 0; i16 < iF && this.f191223a.d() != null && (!this.f191223a.c(b.f191169e) || !this.f191223a.d().e().equals("end")); i16++) {
            String strE = h(b.f191170f).e();
            h(b.f191172h);
            this.f191224b.K.put(strE, b(h(b.f191177m).c(), 4330, i15));
            k();
        }
        i(b.f191169e, "end");
    }

    private void k() throws IOException {
        b.a aVar = b.f191169e;
        o(aVar, "readonly");
        o(aVar, "noaccess");
        b bVarH = h(aVar);
        if (bVarH.e().equals("ND") || bVarH.e().equals("|-")) {
            return;
        }
        if (bVarH.e().equals("noaccess")) {
            bVarH = h(aVar);
        }
        if (bVarH.e().equals("def")) {
            return;
        }
        throw new IOException("Found " + bVarH + " but expected ND");
    }

    private List<b> l() throws IOException {
        List<b> listY = y();
        k();
        return listY;
    }

    private void m() throws IOException {
        b.a aVar;
        e eVar = this.f191223a;
        b.a aVar2 = b.f191169e;
        if (eVar.c(aVar2)) {
            String strE = this.f191223a.b().e();
            if (!strE.equals("StandardEncoding")) {
                throw new IOException("Unknown encoding: " + strE);
            }
            this.f191224b.f191198b = qo.c.f167554d;
            o(aVar2, "readonly");
            i(aVar2, "def");
            return;
        }
        h(b.f191172h).f();
        o(aVar2, "array");
        while (true) {
            if (this.f191223a.c(b.f191169e) && (this.f191223a.d().e().equals("dup") || this.f191223a.d().e().equals("readonly") || this.f191223a.d().e().equals("def"))) {
                break;
            } else {
                this.f191223a.b();
            }
        }
        HashMap map = new HashMap();
        while (true) {
            e eVar2 = this.f191223a;
            aVar = b.f191169e;
            if (!eVar2.c(aVar) || !this.f191223a.d().e().equals("dup")) {
                break;
            }
            i(aVar, "dup");
            int iF = h(b.f191172h).f();
            String strE2 = h(b.f191170f).e();
            i(aVar, "put");
            map.put(Integer.valueOf(iF), strE2);
        }
        this.f191224b.f191198b = new qo.a(map);
        o(aVar, "readonly");
        i(aVar, "def");
    }

    private void n(Map<String, List<b>> map) {
        for (Map.Entry<String, List<b>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<b> value = entry.getValue();
            if (key.equals("version")) {
                this.f191224b.f191206k = value.get(0).e();
            } else if (key.equals("Notice")) {
                this.f191224b.f191207l = value.get(0).e();
            } else if (key.equals("FullName")) {
                this.f191224b.f191208m = value.get(0).e();
            } else if (key.equals("FamilyName")) {
                this.f191224b.f191209n = value.get(0).e();
            } else if (key.equals("Weight")) {
                this.f191224b.f191210p = value.get(0).e();
            } else if (key.equals("ItalicAngle")) {
                this.f191224b.f191211q = value.get(0).b();
            } else if (key.equals("isFixedPitch")) {
                this.f191224b.f191212r = value.get(0).a();
            } else if (key.equals("UnderlinePosition")) {
                this.f191224b.f191213s = value.get(0).b();
            } else if (key.equals("UnderlineThickness")) {
                this.f191224b.f191214t = value.get(0).b();
            }
        }
    }

    private b o(b.a aVar, String str) {
        if (this.f191223a.c(aVar) && this.f191223a.d().e().equals(str)) {
            return this.f191223a.b();
        }
        return null;
    }

    private void p() throws IOException {
        if (this.f191223a.d() == null) {
            throw new IOException("Missing start token of OtherSubrs procedure");
        }
        if (this.f191223a.c(b.f191173i)) {
            y();
            k();
            return;
        }
        int iF = h(b.f191172h).f();
        i(b.f191169e, "array");
        for (int i15 = 0; i15 < iF; i15++) {
            i(b.f191169e, "dup");
            h(b.f191172h);
            y();
            u();
        }
        k();
    }

    private void q(List<b> list) throws IOException {
        if (this.f191223a.d() == null) {
            throw new IOException("Missing start token for the system dictionary");
        }
        if ("systemdict".equals(this.f191223a.d().e())) {
            b.a aVar = b.f191169e;
            i(aVar, "systemdict");
            i(b.f191170f, "internaldict");
            i(aVar, "known");
            b.a aVar2 = b.f191175k;
            h(aVar2);
            t();
            h(aVar2);
            t();
            i(aVar, "ifelse");
            h(aVar2);
            i(aVar, "pop");
            list.clear();
            list.addAll(y());
            h(b.f191176l);
            i(aVar, "if");
        }
    }

    private void r(String str, List<b> list) {
        if (str.equals("BlueValues")) {
            this.f191224b.f191215v = a(list);
            return;
        }
        if (str.equals("OtherBlues")) {
            this.f191224b.f191216w = a(list);
            return;
        }
        if (str.equals("FamilyBlues")) {
            this.f191224b.f191217x = a(list);
            return;
        }
        if (str.equals("FamilyOtherBlues")) {
            this.f191224b.f191218y = a(list);
            return;
        }
        if (str.equals("BlueScale")) {
            this.f191224b.f191219z = list.get(0).b();
            return;
        }
        if (str.equals("BlueShift")) {
            this.f191224b.A = list.get(0).f();
            return;
        }
        if (str.equals("BlueFuzz")) {
            this.f191224b.B = list.get(0).f();
            return;
        }
        if (str.equals("StdHW")) {
            this.f191224b.C = a(list);
            return;
        }
        if (str.equals("StdVW")) {
            this.f191224b.D = a(list);
            return;
        }
        if (str.equals("StemSnapH")) {
            this.f191224b.E = a(list);
            return;
        }
        if (str.equals("StemSnapV")) {
            this.f191224b.F = a(list);
        } else if (str.equals("ForceBold")) {
            this.f191224b.G = list.get(0).a();
        } else if (str.equals("LanguageGroup")) {
            this.f191224b.H = list.get(0).f();
        }
    }

    private List<b> s() throws IOException {
        ArrayList arrayList = new ArrayList();
        int i15 = 1;
        while (this.f191223a.d() != null) {
            if (this.f191223a.c(b.f191175k)) {
                i15++;
            }
            b bVarB = this.f191223a.b();
            arrayList.add(bVarB);
            if (bVarB.d() == b.f191176l && (i15 = i15 - 1) == 0) {
                b bVarO = o(b.f191169e, "executeonly");
                if (bVarO != null) {
                    arrayList.add(bVarO);
                }
                return arrayList;
            }
        }
        throw new IOException("Malformed procedure: missing token");
    }

    private void t() throws IOException {
        int i15 = 1;
        while (this.f191223a.d() != null) {
            if (this.f191223a.c(b.f191175k)) {
                i15++;
            }
            if (this.f191223a.b().d() == b.f191176l && (i15 = i15 - 1) == 0) {
                o(b.f191169e, "executeonly");
                return;
            }
        }
        throw new IOException("Malformed procedure: missing token");
    }

    private void u() throws IOException {
        b.a aVar = b.f191169e;
        o(aVar, "readonly");
        b bVarH = h(aVar);
        if (bVarH.e().equals("NP") || bVarH.e().equals("|")) {
            return;
        }
        if (bVarH.e().equals("noaccess")) {
            bVarH = h(aVar);
        }
        if (bVarH.e().equals("put")) {
            return;
        }
        throw new IOException("Found " + bVarH + " but expected NP");
    }

    private Map<String, List<b>> v() throws IOException {
        HashMap map = new HashMap();
        int iF = h(b.f191172h).f();
        b.a aVar = b.f191169e;
        i(aVar, "dict");
        o(aVar, "dup");
        i(aVar, "begin");
        for (int i15 = 0; i15 < iF && this.f191223a.d() != null; i15++) {
            e eVar = this.f191223a;
            b.a aVar2 = b.f191169e;
            if (eVar.c(aVar2) && !this.f191223a.d().e().equals("end")) {
                h(aVar2);
            }
            if (this.f191223a.d() == null || (this.f191223a.c(aVar2) && this.f191223a.d().e().equals("end"))) {
                break;
            }
            map.put(h(b.f191170f).e(), l());
        }
        b.a aVar3 = b.f191169e;
        i(aVar3, "end");
        o(aVar3, "readonly");
        i(aVar3, "def");
        return map;
    }

    private void w(String str) throws IOException {
        List<b> listL = l();
        if (str.equals("FontName")) {
            this.f191224b.f191197a = listL.get(0).e();
            return;
        }
        if (str.equals("PaintType")) {
            this.f191224b.f191199c = listL.get(0).f();
            return;
        }
        if (str.equals("FontType")) {
            this.f191224b.f191200d = listL.get(0).f();
            return;
        }
        if (str.equals("FontMatrix")) {
            this.f191224b.f191201e = a(listL);
            return;
        }
        if (str.equals("FontBBox")) {
            this.f191224b.f191202f = a(listL);
            return;
        }
        if (str.equals("UniqueID")) {
            this.f191224b.f191203g = listL.get(0).f();
        } else if (str.equals("StrokeWidth")) {
            this.f191224b.f191204h = listL.get(0).b();
        } else if (str.equals("FID")) {
            this.f191224b.f191205j = listL.get(0).e();
        }
    }

    private void x(int i15) throws IOException {
        int iF = h(b.f191172h).f();
        for (int i16 = 0; i16 < iF; i16++) {
            this.f191224b.I.add(null);
        }
        i(b.f191169e, "array");
        for (int i17 = 0; i17 < iF && this.f191223a.d() != null; i17++) {
            e eVar = this.f191223a;
            b.a aVar = b.f191169e;
            if (!eVar.c(aVar) || !this.f191223a.d().e().equals("dup")) {
                break;
            }
            i(aVar, "dup");
            b.a aVar2 = b.f191172h;
            b bVarH = h(aVar2);
            h(aVar2);
            b bVarH2 = h(b.f191177m);
            int iF2 = bVarH.f();
            if (iF2 < this.f191224b.I.size()) {
                this.f191224b.I.set(iF2, b(bVarH2.c(), 4330, i15));
            }
            u();
        }
        k();
    }

    private List<b> y() throws IOException {
        ArrayList arrayList = new ArrayList();
        b bVarB = this.f191223a.b();
        if (this.f191223a.d() != null) {
            arrayList.add(bVarB);
            if (bVarB.d() == b.f191173i) {
                int i15 = 1;
                while (this.f191223a.d() != null) {
                    if (this.f191223a.c(b.f191173i)) {
                        i15++;
                    }
                    b bVarB2 = this.f191223a.b();
                    arrayList.add(bVarB2);
                    if (bVarB2.d() != b.f191174j || (i15 = i15 - 1) != 0) {
                    }
                }
            } else if (bVarB.d() == b.f191175k) {
                arrayList.addAll(s());
            } else if (bVarB.d() == b.f191178n) {
                h(b.f191179o);
                return arrayList;
            }
            q(arrayList);
            return arrayList;
        }
        return arrayList;
    }

    public d e(byte[] bArr, byte[] bArr2) throws IOException {
        this.f191224b = new d(bArr, bArr2);
        try {
            f(bArr);
            if (bArr2.length > 0) {
                g(bArr2);
            }
            return this.f191224b;
        } catch (NumberFormatException e15) {
            throw new IOException(e15);
        }
    }
}
