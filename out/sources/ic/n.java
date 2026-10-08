package ic;

import java.util.Arrays;
import java.util.Locale;
import p005Con.i1;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f90893a = {47, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f90894b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f90895c = "";

    public static byte[] e(byte b15, byte[] bArr) {
        int i15 = 0;
        while (i15 < bArr.length) {
            try {
                byte b16 = bArr[i15];
                byte b17 = bArr[i15 + 1];
                if (b16 == b15) {
                    int i16 = i15 + 2;
                    return pq.n.t(bArr, i16, b17 + i16);
                }
                i15 += b17 + 2;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // ic.q
    public final byte[] b() {
        return this.f90893a;
    }

    @Override // ic.q
    public final void d(byte[] bArr) {
        String upperCase;
        String strA;
        String string;
        String strA2;
        byte[] bArrE = e((byte) 97, bArr);
        if (bArrE != null) {
            byte[] bArrE2 = e((byte) 79, bArrE);
            String str = "";
            if (bArrE2 == null || (strA2 = i1.a(bArrE2)) == null || (upperCase = strA2.toUpperCase(Locale.ROOT)) == null) {
                upperCase = "";
            }
            this.f90895c = upperCase;
            byte[] bArrE3 = e((byte) 80, bArrE);
            if (bArrE3 != null && (strA = fu.r.A(bArrE3)) != null && (string = fu.r.u1(strA).toString()) != null) {
                str = string;
            }
            this.f90894b = str;
        }
        Arrays.copyOf(bArr, bArr.length);
    }

    @Override // ic.q
    public final String getName() {
        return "EF.Dir";
    }
}
