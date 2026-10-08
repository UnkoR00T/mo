package p005Con;

import pq.n;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {
    public static byte[] a(byte[] bArr) {
        try {
            byte[] bArrT = n.t(bArr, 0, 48);
            byte[] bArrT2 = n.t(bArr, 48, 96);
            if (((byte) (bArrT[0] & (-128))) != 0) {
                bArrT = n.H(new byte[]{0}, bArrT);
            }
            if (((byte) (bArrT2[0] & (-128))) != 0) {
                bArrT2 = n.H(new byte[]{0}, bArrT2);
            }
            return n.H(n.H(new byte[]{48, (byte) (bArrT.length + bArrT2.length + 4), 2, (byte) bArrT.length}, bArrT), n.H(new byte[]{2, (byte) bArrT2.length}, bArrT2));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Illegal argument exception: could not parse plain to x962 signature");
        }
    }

    public static byte[] b(byte[] bArr, int i15) {
        int i16 = i15 / 8;
        try {
            int i17 = bArr[3] == 48 ? 4 : 5;
            byte[] bArrA1 = v.a1(v.X0(n.i0(bArr, i17), i16));
            int i18 = i17 + i16;
            return n.H(bArrA1, v.a1(v.X0(n.i0(bArr, bArr[i18 + 1] == 48 ? i18 + 2 : i18 + 3), i16)));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Illegal argument exception: could not parse x962 signature");
        }
    }
}
