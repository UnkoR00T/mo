package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f12934a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f12935b = {112, 114, 109, 0};

    private static void A(byte[] bArr, int i15, int i16, c cVar) {
        int iM = m(i15, i16, cVar.f12922g);
        int i17 = iM / 8;
        bArr[i17] = (byte) ((1 << (iM % 8)) | bArr[i17]);
    }

    private static void B(InputStream inputStream) {
        d.h(inputStream);
        int iJ = d.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            d.j(inputStream);
            for (int iJ2 = d.j(inputStream); iJ2 > 0; iJ2--) {
                d.h(inputStream);
            }
            iJ--;
        }
    }

    static boolean C(OutputStream outputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, i.f12947a)) {
            P(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f12948b)) {
            O(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f12950d)) {
            M(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f12949c)) {
            N(outputStream, cVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, i.f12951e)) {
            return false;
        }
        L(outputStream, cVarArr);
        return true;
    }

    private static void D(OutputStream outputStream, c cVar) throws IOException {
        int[] iArr = cVar.f12923h;
        int length = iArr.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            int i17 = iArr[i15];
            d.p(outputStream, i17 - i16);
            i15++;
            i16 = i17;
        }
    }

    private static j E(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d.p(byteArrayOutputStream, cVarArr.length);
            int i15 = 2;
            for (c cVar : cVarArr) {
                d.q(byteArrayOutputStream, cVar.f12918c);
                d.q(byteArrayOutputStream, cVar.f12919d);
                d.q(byteArrayOutputStream, cVar.f12922g);
                String strJ = j(cVar.f12916a, cVar.f12917b, i.f12947a);
                int iK = d.k(strJ);
                d.p(byteArrayOutputStream, iK);
                i15 = i15 + 14 + iK;
                d.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i15 == byteArray.length) {
                j jVar = new j(e.DEX_FILES, i15, byteArray, false);
                byteArrayOutputStream.close();
                return jVar;
            }
            throw d.c("Expected size " + i15 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    static void F(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f12934a);
        outputStream.write(bArr);
    }

    private static void G(OutputStream outputStream, c cVar) throws IOException {
        K(outputStream, cVar);
        D(outputStream, cVar);
        I(outputStream, cVar);
    }

    private static void H(OutputStream outputStream, c cVar, String str) throws IOException {
        d.p(outputStream, d.k(str));
        d.p(outputStream, cVar.f12920e);
        d.q(outputStream, cVar.f12921f);
        d.q(outputStream, cVar.f12918c);
        d.q(outputStream, cVar.f12922g);
        d.n(outputStream, str);
    }

    private static void I(OutputStream outputStream, c cVar) throws IOException {
        byte[] bArr = new byte[k(cVar.f12922g)];
        for (Map.Entry<Integer, Integer> entry : cVar.f12924i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                A(bArr, 2, iIntValue, cVar);
            }
            if ((iIntValue2 & 4) != 0) {
                A(bArr, 4, iIntValue, cVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void J(OutputStream outputStream, int i15, c cVar) throws IOException {
        byte[] bArr = new byte[l(i15, cVar.f12922g)];
        for (Map.Entry<Integer, Integer> entry : cVar.f12924i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i16 = 0;
            for (int i17 = 1; i17 <= 4; i17 <<= 1) {
                if (i17 != 1 && (i17 & i15) != 0) {
                    if ((i17 & iIntValue2) == i17) {
                        int i18 = (cVar.f12922g * i16) + iIntValue;
                        int i19 = i18 / 8;
                        bArr[i19] = (byte) ((1 << (i18 % 8)) | bArr[i19]);
                    }
                    i16++;
                }
            }
        }
        outputStream.write(bArr);
    }

    private static void K(OutputStream outputStream, c cVar) throws IOException {
        int i15 = 0;
        for (Map.Entry<Integer, Integer> entry : cVar.f12924i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                d.p(outputStream, iIntValue - i15);
                d.p(outputStream, 0);
                i15 = iIntValue;
            }
        }
    }

    private static void L(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.p(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String strJ = j(cVar.f12916a, cVar.f12917b, i.f12951e);
            d.p(outputStream, d.k(strJ));
            d.p(outputStream, cVar.f12924i.size());
            d.p(outputStream, cVar.f12923h.length);
            d.q(outputStream, cVar.f12918c);
            d.n(outputStream, strJ);
            Iterator<Integer> it = cVar.f12924i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, it.next().intValue());
            }
            for (int i15 : cVar.f12923h) {
                d.p(outputStream, i15);
            }
        }
    }

    private static void M(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.r(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            int size = cVar.f12924i.size() * 4;
            String strJ = j(cVar.f12916a, cVar.f12917b, i.f12950d);
            d.p(outputStream, d.k(strJ));
            d.p(outputStream, cVar.f12923h.length);
            d.q(outputStream, size);
            d.q(outputStream, cVar.f12918c);
            d.n(outputStream, strJ);
            Iterator<Integer> it = cVar.f12924i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, it.next().intValue());
                d.p(outputStream, 0);
            }
            for (int i15 : cVar.f12923h) {
                d.p(outputStream, i15);
            }
        }
    }

    private static void N(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] bArrB = b(cVarArr, i.f12949c);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, bArrB);
    }

    private static void O(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] bArrB = b(cVarArr, i.f12948b);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, bArrB);
    }

    private static void P(OutputStream outputStream, c[] cVarArr) throws IOException {
        Q(outputStream, cVarArr);
    }

    private static void Q(OutputStream outputStream, c[] cVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(cVarArr));
        arrayList.add(c(cVarArr));
        arrayList.add(d(cVarArr));
        long length2 = ((long) i.f12947a.length) + ((long) f12934a.length) + 4 + ((long) (arrayList.size() * 16));
        d.q(outputStream, arrayList.size());
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            j jVar = (j) arrayList.get(i15);
            d.q(outputStream, jVar.f12954a.e());
            d.q(outputStream, length2);
            if (jVar.f12957d) {
                byte[] bArr = jVar.f12956c;
                long length3 = bArr.length;
                byte[] bArrB = d.b(bArr);
                arrayList2.add(bArrB);
                d.q(outputStream, bArrB.length);
                d.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(jVar.f12956c);
                d.q(outputStream, jVar.f12956c.length);
                d.q(outputStream, 0L);
                length = jVar.f12956c.length;
            }
            length2 += (long) length;
        }
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            outputStream.write((byte[]) arrayList2.get(i16));
        }
    }

    private static int a(c cVar) {
        Iterator<Map.Entry<Integer, Integer>> it = cVar.f12924i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    private static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int i15 = 0;
        int iK = 0;
        for (c cVar : cVarArr) {
            iK += d.k(j(cVar.f12916a, cVar.f12917b, bArr)) + 16 + (cVar.f12920e * 2) + cVar.f12921f + k(cVar.f12922g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, i.f12949c)) {
            int length = cVarArr.length;
            while (i15 < length) {
                c cVar2 = cVarArr[i15];
                H(byteArrayOutputStream, cVar2, j(cVar2.f12916a, cVar2.f12917b, bArr));
                G(byteArrayOutputStream, cVar2);
                i15++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                H(byteArrayOutputStream, cVar3, j(cVar3.f12916a, cVar3.f12917b, bArr));
            }
            int length2 = cVarArr.length;
            while (i15 < length2) {
                G(byteArrayOutputStream, cVarArr[i15]);
                i15++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw d.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    private static j c(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i15 = 0;
        for (int i16 = 0; i16 < cVarArr.length; i16++) {
            try {
                c cVar = cVarArr[i16];
                d.p(byteArrayOutputStream, i16);
                d.p(byteArrayOutputStream, cVar.f12920e);
                i15 = i15 + 4 + (cVar.f12920e * 2);
                D(byteArrayOutputStream, cVar);
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i15 == byteArray.length) {
            j jVar = new j(e.CLASSES, i15, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i15 + ", does not match actual size " + byteArray.length);
    }

    private static j d(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i15 = 0;
        for (int i16 = 0; i16 < cVarArr.length; i16++) {
            try {
                c cVar = cVarArr[i16];
                int iA = a(cVar);
                byte[] bArrE = e(iA, cVar);
                byte[] bArrF = f(cVar);
                d.p(byteArrayOutputStream, i16);
                int length = bArrE.length + 2 + bArrF.length;
                d.q(byteArrayOutputStream, length);
                d.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i15 = i15 + 6 + length;
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i15 == byteArray.length) {
            j jVar = new j(e.METHODS, i15, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i15 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(int i15, c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i15, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    private static byte[] f(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    private static String g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static c i(c[] cVarArr, String str) {
        if (cVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i15 = 0; i15 < cVarArr.length; i15++) {
            if (cVarArr[i15].f12917b.equals(strH)) {
                return cVarArr[i15];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String strA = i.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + i.a(bArr) + str2;
    }

    private static int k(int i15) {
        return z(i15 * 2) / 8;
    }

    private static int l(int i15, int i16) {
        return z(Integer.bitCount(i15 & (-2)) * i16) / 8;
    }

    private static int m(int i15, int i16, int i17) {
        if (i15 == 1) {
            throw d.c("HOT methods are not stored in the bitmap");
        }
        if (i15 == 2) {
            return i16;
        }
        if (i15 == 4) {
            return i16 + i17;
        }
        throw d.c("Unexpected flag: " + i15);
    }

    private static int[] n(InputStream inputStream, int i15) {
        int[] iArr = new int[i15];
        int iH = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            iH += d.h(inputStream);
            iArr[i16] = iH;
        }
        return iArr;
    }

    private static int o(BitSet bitSet, int i15, int i16) {
        int i17 = bitSet.get(m(2, i15, i16)) ? 2 : 0;
        return bitSet.get(m(4, i15, i16)) ? i17 | 4 : i17;
    }

    static byte[] p(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, d.d(inputStream, bArr.length))) {
            return d.d(inputStream, i.f12948b.length);
        }
        throw d.c("Invalid magic");
    }

    private static void q(InputStream inputStream, c cVar) {
        int iAvailable = inputStream.available() - cVar.f12921f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += d.h(inputStream);
            cVar.f12924i.put(Integer.valueOf(iH), 1);
            for (int iH2 = d.h(inputStream); iH2 > 0; iH2--) {
                B(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw d.c("Read too much data during profile line parse");
        }
    }

    static c[] r(InputStream inputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        if (Arrays.equals(bArr, i.f12952f)) {
            if (Arrays.equals(i.f12947a, bArr2)) {
                throw d.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return s(inputStream, bArr, cVarArr);
        }
        if (Arrays.equals(bArr, i.f12953g)) {
            return u(inputStream, bArr2, cVarArr);
        }
        throw d.c("Unsupported meta version");
    }

    static c[] s(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (!Arrays.equals(bArr, i.f12952f)) {
            throw d.c("Unsupported meta version");
        }
        int iJ = d.j(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrT = t(byteArrayInputStream, iJ, cVarArr);
            byteArrayInputStream.close();
            return cVarArrT;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    private static c[] t(InputStream inputStream, int i15, c[] cVarArr) {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i15 != cVarArr.length) {
            throw d.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i15];
        int[] iArr = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            int iH = d.h(inputStream);
            iArr[i16] = d.h(inputStream);
            strArr[i16] = d.f(inputStream, iH);
        }
        for (int i17 = 0; i17 < i15; i17++) {
            c cVar = cVarArr[i17];
            if (!cVar.f12917b.equals(strArr[i17])) {
                throw d.c("Order of dexfiles in metadata did not match baseline");
            }
            int i18 = iArr[i17];
            cVar.f12920e = i18;
            cVar.f12923h = n(inputStream, i18);
        }
        return cVarArr;
    }

    static c[] u(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        int iH = d.h(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrV = v(byteArrayInputStream, bArr, iH, cVarArr);
            byteArrayInputStream.close();
            return cVarArrV;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    private static c[] v(InputStream inputStream, byte[] bArr, int i15, c[] cVarArr) {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i15 != cVarArr.length) {
            throw d.c("Mismatched number of dex files found in metadata");
        }
        for (int i16 = 0; i16 < i15; i16++) {
            d.h(inputStream);
            String strF = d.f(inputStream, d.h(inputStream));
            long jI = d.i(inputStream);
            int iH = d.h(inputStream);
            c cVarI = i(cVarArr, strF);
            if (cVarI == null) {
                throw d.c("Missing profile key: " + strF);
            }
            cVarI.f12919d = jI;
            int[] iArrN = n(inputStream, iH);
            if (Arrays.equals(bArr, i.f12951e)) {
                cVarI.f12920e = iH;
                cVarI.f12923h = iArrN;
            }
        }
        return cVarArr;
    }

    private static void w(InputStream inputStream, c cVar) {
        BitSet bitSetValueOf = BitSet.valueOf(d.d(inputStream, d.a(cVar.f12922g * 2)));
        int i15 = 0;
        while (true) {
            int i16 = cVar.f12922g;
            if (i15 >= i16) {
                return;
            }
            int iO = o(bitSetValueOf, i15, i16);
            if (iO != 0) {
                Integer num = cVar.f12924i.get(Integer.valueOf(i15));
                if (num == null) {
                    num = 0;
                }
                cVar.f12924i.put(Integer.valueOf(i15), Integer.valueOf(iO | num.intValue()));
            }
            i15++;
        }
    }

    static c[] x(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, i.f12948b)) {
            throw d.c("Unsupported version");
        }
        int iJ = d.j(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrY = y(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return cVarArrY;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    private static c[] y(InputStream inputStream, String str, int i15) {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            int iH = d.h(inputStream);
            int iH2 = d.h(inputStream);
            cVarArr[i16] = new c(str, d.f(inputStream, iH), d.i(inputStream), 0L, iH2, (int) d.i(inputStream), (int) d.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i17 = 0; i17 < i15; i17++) {
            c cVar = cVarArr[i17];
            q(inputStream, cVar);
            cVar.f12923h = n(inputStream, cVar.f12920e);
            w(inputStream, cVar);
        }
        return cVarArr;
    }

    private static int z(int i15) {
        return (i15 + 7) & (-8);
    }
}
