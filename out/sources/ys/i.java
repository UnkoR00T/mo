package ys;

/* JADX INFO: loaded from: classes4.dex */
public final class i {
    public static final byte[] a(String[] strArr) {
        int length = 0;
        for (String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i15 = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            int i16 = 0;
            while (i16 < length2) {
                bArr[i15] = (byte) str2.charAt(i16);
                i16++;
                i15++;
            }
        }
        return bArr;
    }
}
