package bp;

import io.sentry.android.core.c2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f20973d = Boolean.getBoolean("com.tom_roush.pdfbox.forceParsing");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f20974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20975c;

    public p(byte[] bArr) {
        g4(bArr);
    }

    public static p N3(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StringBuilder sb5 = new StringBuilder(str.trim());
        if (sb5.length() % 2 != 0) {
            sb5.append('0');
        }
        int length = sb5.length();
        int i15 = 0;
        while (i15 < length) {
            int i16 = i15 + 2;
            try {
                byteArrayOutputStream.write(Integer.parseInt(sb5.substring(i15, i16), 16));
            } catch (NumberFormatException e15) {
                if (!f20973d) {
                    throw new IOException("Invalid hex string: " + str, e15);
                }
                c2.g("PdfBox-Android", "Encountered a malformed hex string");
                byteArrayOutputStream.write(63);
            }
            i15 = i16;
        }
        return new p(byteArrayOutputStream.toByteArray());
    }

    public boolean A3() {
        return this.f20975c;
    }

    @Override // bp.b
    public Object F1(r rVar) {
        return rVar.h(this);
    }

    public String J3() {
        byte[] bArr = this.f20974b;
        if (bArr.length >= 2) {
            byte b15 = bArr[0];
            if ((b15 & 255) == 254 && (bArr[1] & 255) == 255) {
                return new String(bArr, 2, bArr.length - 2, xp.a.f220413b);
            }
            if ((b15 & 255) == 255 && (bArr[1] & 255) == 254) {
                return new String(bArr, 2, bArr.length - 2, xp.a.f220414c);
            }
        }
        return s.d(bArr);
    }

    public void X3(boolean z15) {
        this.f20975c = z15;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (J3().equals(pVar.J3()) && this.f20975c == pVar.f20975c) {
                return true;
            }
        }
        return false;
    }

    public void g4(byte[] bArr) {
        this.f20974b = (byte[]) bArr.clone();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f20974b) + (this.f20975c ? 17 : 0);
    }

    public byte[] i3() {
        return this.f20974b;
    }

    public String toString() {
        return "COSString{" + J3() + "}";
    }

    public p(String str) {
        for (char c15 : str.toCharArray()) {
            if (!s.a(c15)) {
                byte[] bytes = str.getBytes(xp.a.f220413b);
                byte[] bArr = new byte[bytes.length + 2];
                this.f20974b = bArr;
                bArr[0] = -2;
                bArr[1] = -1;
                System.arraycopy(bytes, 0, bArr, 2, bytes.length);
                return;
            }
        }
        this.f20974b = s.b(str);
    }
}
