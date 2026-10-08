package po;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f161377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f161378b;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f161379a;

        private b(String str) {
            this.f161379a = str;
        }
    }

    /* JADX INFO: renamed from: po.c$c, reason: collision with other inner class name */
    private static final class C3971c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f161380a;

        private C3971c(String str) {
            this.f161380a = str;
        }
    }

    public c() {
        this.f161377a = new byte[512];
        this.f161378b = false;
    }

    private void a(po.b bVar, byte[] bArr, int i15, byte[] bArr2) {
        for (int i16 = 0; i16 < i15; i16++) {
            bVar.c(bArr, e(bArr2));
            if (!g(bArr2, bArr2.length - 1, this.f161378b)) {
                return;
            }
            g(bArr, bArr.length - 1, false);
        }
    }

    private void b(po.b bVar, byte[] bArr, List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        while (it.hasNext()) {
            bVar.c(bArr, e(it.next()));
            g(bArr, bArr.length - 1, false);
        }
    }

    private void c(C3971c c3971c, String str, String str2) throws IOException {
        if (c3971c.f161380a.equals(str)) {
            return;
        }
        throw new IOException("Error : ~" + str2 + " contains an unexpected operator : " + c3971c.f161380a);
    }

    private int d(byte[] bArr) {
        int i15 = bArr[0] & 255;
        return bArr.length == 2 ? (i15 << 8) + (bArr[1] & 255) : i15;
    }

    private String e(byte[] bArr) {
        return new String(bArr, bArr.length == 1 ? uo.b.f199525a : uo.b.f199527c);
    }

    private boolean g(byte[] bArr, int i15, boolean z15) {
        if (i15 <= 0 || (bArr[i15] & 255) != 255) {
            bArr[i15] = (byte) (bArr[i15] + 1);
        } else {
            if (z15) {
                return false;
            }
            bArr[i15] = 0;
            g(bArr, i15 - 1, z15);
        }
        return true;
    }

    private boolean h(int i15) {
        return i15 == 37 || i15 == 47 || i15 == 60 || i15 == 62 || i15 == 91 || i15 == 93 || i15 == 123 || i15 == 125 || i15 == 40 || i15 == 41;
    }

    private boolean i(int i15) {
        return i15 == -1 || i15 == 32 || i15 == 13 || i15 == 10;
    }

    private void k(Number number, PushbackInputStream pushbackInputStream, po.b bVar) throws IOException {
        for (int i15 = 0; i15 < number.intValue(); i15++) {
            Object objQ = q(pushbackInputStream);
            if (objQ instanceof C3971c) {
                c((C3971c) objQ, "endbfchar", "bfchar");
                return;
            }
            if (!(objQ instanceof byte[])) {
                throw new IOException("input code missing");
            }
            byte[] bArr = (byte[]) objQ;
            Object objQ2 = q(pushbackInputStream);
            if (objQ2 instanceof byte[]) {
                bVar.c(bArr, e((byte[]) objQ2));
            } else {
                if (!(objQ2 instanceof b)) {
                    throw new IOException("Error parsing CMap beginbfchar, expected{COSString or COSName} and not " + objQ2);
                }
                bVar.c(bArr, ((b) objQ2).f161379a);
            }
        }
    }

    private void l(Number number, PushbackInputStream pushbackInputStream, po.b bVar) throws IOException {
        for (int i15 = 0; i15 < number.intValue(); i15++) {
            Object objQ = q(pushbackInputStream);
            if (objQ instanceof C3971c) {
                c((C3971c) objQ, "endbfrange", "bfrange");
                return;
            }
            if (!(objQ instanceof byte[])) {
                throw new IOException("start code missing");
            }
            byte[] bArr = (byte[]) objQ;
            Object objQ2 = q(pushbackInputStream);
            if (objQ2 instanceof C3971c) {
                c((C3971c) objQ2, "endbfrange", "bfrange");
                return;
            }
            if (!(objQ2 instanceof byte[])) {
                throw new IOException("end code missing");
            }
            byte[] bArr2 = (byte[]) objQ2;
            int iU = po.b.u(bArr, bArr.length);
            int iU2 = po.b.u(bArr2, bArr2.length);
            if (iU2 < iU) {
                return;
            }
            Object objQ3 = q(pushbackInputStream);
            if (objQ3 instanceof List) {
                List<byte[]> list = (List) objQ3;
                if (!list.isEmpty() && list.size() >= iU2 - iU) {
                    b(bVar, bArr, list);
                }
            } else if (objQ3 instanceof byte[]) {
                byte[] bArr3 = (byte[]) objQ3;
                if (bArr3.length > 0) {
                    if (bArr3.length == 2 && iU == 0 && iU2 == 65535 && bArr3[0] == 0 && bArr3[1] == 0) {
                        for (int i16 = 0; i16 < 256; i16++) {
                            byte b15 = (byte) i16;
                            bArr[0] = b15;
                            bArr[1] = 0;
                            bArr3[0] = b15;
                            bArr3[1] = 0;
                            a(bVar, bArr, 256, bArr3);
                        }
                    } else {
                        a(bVar, bArr, (iU2 - iU) + 1, bArr3);
                    }
                }
            }
        }
    }

    private void m(Number number, PushbackInputStream pushbackInputStream, po.b bVar) throws IOException {
        for (int i15 = 0; i15 < number.intValue(); i15++) {
            Object objQ = q(pushbackInputStream);
            if (objQ instanceof C3971c) {
                c((C3971c) objQ, "endcidchar", "cidchar");
                return;
            } else {
                if (!(objQ instanceof byte[])) {
                    throw new IOException("start code missing");
                }
                bVar.a(((Integer) q(pushbackInputStream)).intValue(), d((byte[]) objQ));
            }
        }
    }

    private void n(int i15, PushbackInputStream pushbackInputStream, po.b bVar) throws IOException {
        for (int i16 = 0; i16 < i15; i16++) {
            Object objQ = q(pushbackInputStream);
            if (objQ instanceof C3971c) {
                c((C3971c) objQ, "endcidrange", "cidrange");
                return;
            }
            if (!(objQ instanceof byte[])) {
                throw new IOException("start range missing");
            }
            byte[] bArr = (byte[]) objQ;
            int iD = d(bArr);
            byte[] bArr2 = (byte[]) q(pushbackInputStream);
            int iD2 = d(bArr2);
            int iIntValue = ((Integer) q(pushbackInputStream)).intValue();
            if (bArr.length > 2 || bArr2.length > 2) {
                int i17 = (iD2 + iIntValue) - iD;
                while (iIntValue <= i17) {
                    bVar.a(iIntValue, d(bArr));
                    g(bArr, bArr.length - 1, false);
                    iIntValue++;
                }
            } else if (iD2 == iD) {
                bVar.a(iIntValue, iD);
            } else {
                bVar.b((char) iD, (char) iD2, iIntValue);
            }
        }
    }

    private void o(Number number, PushbackInputStream pushbackInputStream, po.b bVar) throws IOException {
        for (int i15 = 0; i15 < number.intValue(); i15++) {
            Object objQ = q(pushbackInputStream);
            if (objQ instanceof C3971c) {
                c((C3971c) objQ, "endcodespacerange", "codespacerange");
                return;
            } else {
                if (!(objQ instanceof byte[])) {
                    throw new IOException("start range missing");
                }
                try {
                    bVar.d(new d((byte[]) objQ, (byte[]) q(pushbackInputStream)));
                } catch (IllegalArgumentException e15) {
                    throw new IOException(e15);
                }
            }
        }
    }

    private void p(b bVar, PushbackInputStream pushbackInputStream, po.b bVar2) throws IOException {
        if ("WMode".equals(bVar.f161379a)) {
            Object objQ = q(pushbackInputStream);
            if (objQ instanceof Integer) {
                bVar2.s(((Integer) objQ).intValue());
                return;
            }
            return;
        }
        if ("CMapName".equals(bVar.f161379a)) {
            Object objQ2 = q(pushbackInputStream);
            if (objQ2 instanceof b) {
                bVar2.m(((b) objQ2).f161379a);
                return;
            }
            return;
        }
        if ("CMapVersion".equals(bVar.f161379a)) {
            Object objQ3 = q(pushbackInputStream);
            if (objQ3 instanceof Number) {
                bVar2.r(objQ3.toString());
                return;
            } else {
                if (objQ3 instanceof String) {
                    bVar2.r((String) objQ3);
                    return;
                }
                return;
            }
        }
        if ("CMapType".equals(bVar.f161379a)) {
            Object objQ4 = q(pushbackInputStream);
            if (objQ4 instanceof Integer) {
                bVar2.q(((Integer) objQ4).intValue());
                return;
            }
            return;
        }
        if ("Registry".equals(bVar.f161379a)) {
            Object objQ5 = q(pushbackInputStream);
            if (objQ5 instanceof String) {
                bVar2.o((String) objQ5);
                return;
            }
            return;
        }
        if ("Ordering".equals(bVar.f161379a)) {
            Object objQ6 = q(pushbackInputStream);
            if (objQ6 instanceof String) {
                bVar2.n((String) objQ6);
                return;
            }
            return;
        }
        if ("Supplement".equals(bVar.f161379a)) {
            Object objQ7 = q(pushbackInputStream);
            if (objQ7 instanceof Integer) {
                bVar2.p(((Integer) objQ7).intValue());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ad A[Catch: NumberFormatException -> 0x00b2, TryCatch #0 {NumberFormatException -> 0x00b2, blocks: (B:49:0x00a7, B:51:0x00ad, B:55:0x00b4), top: B:137:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4 A[Catch: NumberFormatException -> 0x00b2, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00b2, blocks: (B:49:0x00a7, B:51:0x00ad, B:55:0x00b4), top: B:137:0x00a7 }] */
    private Object q(PushbackInputStream pushbackInputStream) throws IOException {
        int i15;
        String string;
        int i16 = pushbackInputStream.read();
        while (true) {
            if (i16 != 9 && i16 != 32 && i16 != 13 && i16 != 10) {
                break;
            }
            i16 = pushbackInputStream.read();
        }
        if (i16 == -1) {
            return null;
        }
        if (i16 == 37) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append((char) i16);
            t(pushbackInputStream, sb5);
            return sb5.toString();
        }
        if (i16 == 40) {
            StringBuilder sb6 = new StringBuilder();
            int i17 = pushbackInputStream.read();
            while (i17 != -1 && i17 != 41) {
                sb6.append((char) i17);
                i17 = pushbackInputStream.read();
            }
            return sb6.toString();
        }
        if (i16 == 60) {
            int i18 = pushbackInputStream.read();
            if (i18 == 60) {
                HashMap map = new HashMap();
                Object objQ = q(pushbackInputStream);
                while ((objQ instanceof b) && !">>".equals(objQ)) {
                    map.put(((b) objQ).f161379a, q(pushbackInputStream));
                    objQ = q(pushbackInputStream);
                }
                return map;
            }
            int i19 = -1;
            int i25 = 16;
            while (i18 != -1 && i18 != 62) {
                if (i18 >= 48 && i18 <= 57) {
                    i15 = i18 - 48;
                } else if (i18 >= 65 && i18 <= 70) {
                    i15 = i18 - 55;
                } else if (i18 >= 97 && i18 <= 102) {
                    i15 = i18 - 87;
                } else {
                    if (!i(i18)) {
                        throw new IOException("Error: expected hex character and not " + ((char) i18) + ":" + i18);
                    }
                    i18 = pushbackInputStream.read();
                }
                int i26 = i15 * i25;
                if (i25 == 16) {
                    i19++;
                    byte[] bArr = this.f161377a;
                    if (i19 >= bArr.length) {
                        throw new IOException("cmap token ist larger than buffer size " + this.f161377a.length);
                    }
                    bArr[i19] = 0;
                    i25 = 1;
                } else {
                    i25 = 16;
                }
                byte[] bArr2 = this.f161377a;
                bArr2[i19] = (byte) (bArr2[i19] + i26);
                i18 = pushbackInputStream.read();
            }
            int i27 = i19 + 1;
            byte[] bArr3 = new byte[i27];
            System.arraycopy(this.f161377a, 0, bArr3, 0, i27);
            return bArr3;
        }
        if (i16 == 62) {
            if (pushbackInputStream.read() == 62) {
                return ">>";
            }
            throw new IOException("Error: expected the end of a dictionary.");
        }
        if (i16 == 91) {
            ArrayList arrayList = new ArrayList();
            Object objQ2 = q(pushbackInputStream);
            while (objQ2 != null && !"]".equals(objQ2)) {
                arrayList.add(objQ2);
                objQ2 = q(pushbackInputStream);
            }
            return arrayList;
        }
        if (i16 == 93) {
            return "]";
        }
        switch (i16) {
            case 47:
                StringBuilder sb7 = new StringBuilder();
                int i28 = pushbackInputStream.read();
                while (!i(i28) && !h(i28)) {
                    sb7.append((char) i28);
                    i28 = pushbackInputStream.read();
                }
                if (h(i28)) {
                    pushbackInputStream.unread(i28);
                }
                return new b(sb7.toString());
            case 48:
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
            case 55:
            case 56:
            case 57:
                StringBuilder sb8 = new StringBuilder();
                sb8.append((char) i16);
                int i29 = pushbackInputStream.read();
                try {
                    while (!i(i29)) {
                        char c15 = (char) i29;
                        if (!Character.isDigit(c15) && i29 != 46) {
                            pushbackInputStream.unread(i29);
                            string = sb8.toString();
                            return string.indexOf(46) >= 0 ? Double.valueOf(string) : Integer.valueOf(string);
                        }
                        sb8.append(c15);
                        i29 = pushbackInputStream.read();
                    }
                    if (string.indexOf(46) >= 0) {
                    }
                } catch (NumberFormatException e15) {
                    throw new IOException("Invalid number '" + string + "'", e15);
                }
                pushbackInputStream.unread(i29);
                string = sb8.toString();
                break;
            default:
                StringBuilder sb9 = new StringBuilder();
                sb9.append((char) i16);
                int i35 = pushbackInputStream.read();
                while (!i(i35) && !h(i35) && !Character.isDigit(i35)) {
                    sb9.append((char) i35);
                    i35 = pushbackInputStream.read();
                }
                if (h(i35) || Character.isDigit(i35)) {
                    pushbackInputStream.unread(i35);
                }
                return new C3971c(sb9.toString());
        }
    }

    private void s(b bVar, po.b bVar2) {
        bVar2.w(j(f(bVar.f161379a)));
    }

    private void t(InputStream inputStream, StringBuilder sb5) throws IOException {
        int i15 = inputStream.read();
        while (i15 != -1 && i15 != 13 && i15 != 10) {
            sb5.append((char) i15);
            i15 = inputStream.read();
        }
    }

    protected InputStream f(String str) throws IOException {
        if (yo.b.c()) {
            return new BufferedInputStream(yo.b.a("com/tom_roush/fontbox/resources/cmap/" + str));
        }
        InputStream resourceAsStream = getClass().getResourceAsStream("/com/tom_roush/fontbox/resources/cmap/" + str);
        if (resourceAsStream != null) {
            return new BufferedInputStream(resourceAsStream);
        }
        throw new IOException("Error: Could not find referenced cmap stream " + str);
    }

    public po.b j(InputStream inputStream) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);
        po.b bVar = new po.b();
        Object obj = null;
        while (true) {
            Object objQ = q(pushbackInputStream);
            if (objQ == null) {
                break;
            }
            if (objQ instanceof C3971c) {
                C3971c c3971c = (C3971c) objQ;
                if (c3971c.f161380a.equals("endcmap")) {
                    break;
                }
                if (obj != null) {
                    if (c3971c.f161380a.equals("usecmap") && (obj instanceof b)) {
                        s((b) obj, bVar);
                    } else if (obj instanceof Number) {
                        if (c3971c.f161380a.equals("begincodespacerange")) {
                            o((Number) obj, pushbackInputStream, bVar);
                        } else if (c3971c.f161380a.equals("beginbfchar")) {
                            k((Number) obj, pushbackInputStream, bVar);
                        } else if (c3971c.f161380a.equals("beginbfrange")) {
                            l((Number) obj, pushbackInputStream, bVar);
                        } else if (c3971c.f161380a.equals("begincidchar")) {
                            m((Number) obj, pushbackInputStream, bVar);
                        } else if (c3971c.f161380a.equals("begincidrange") && (obj instanceof Integer)) {
                            n(((Integer) obj).intValue(), pushbackInputStream, bVar);
                        }
                    }
                }
            } else if (objQ instanceof b) {
                p((b) objQ, pushbackInputStream, bVar);
            }
            obj = objQ;
        }
        return bVar;
    }

    public po.b r(String str) throws Throwable {
        InputStream inputStreamF;
        try {
            inputStreamF = f(str);
            try {
                this.f161378b = false;
                po.b bVarJ = j(inputStreamF);
                if (inputStreamF != null) {
                    inputStreamF.close();
                }
                return bVarJ;
            } catch (Throwable th4) {
                th = th4;
                if (inputStreamF != null) {
                    inputStreamF.close();
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStreamF = null;
        }
    }

    public c(boolean z15) {
        this.f161377a = new byte[512];
        this.f161378b = z15;
    }
}
