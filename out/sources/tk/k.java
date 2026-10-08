package tk;

/* JADX INFO: loaded from: classes4.dex */
public final class k {
    public static byte[] a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = i15 * 2;
            int iDigit = Character.digit(str.charAt(i16), 16);
            int iDigit2 = Character.digit(str.charAt(i16 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i15] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb5 = new StringBuilder(bArr.length * 2);
        for (byte b15 : bArr) {
            int i15 = b15 & 255;
            sb5.append("0123456789abcdef".charAt(i15 / 16));
            sb5.append("0123456789abcdef".charAt(i15 % 16));
        }
        return sb5.toString();
    }
}
