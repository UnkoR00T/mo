package org.bouncycastle.crypto.generators;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class OpenBSDBCrypt {
    private static final Set<String> allowedVersions;
    private static final String defaultVersion = "2y";
    private static final byte[] encodingTable = {46, 47, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    private static final byte[] decodingTable = new byte[128];

    static {
        HashSet hashSet = new HashSet();
        allowedVersions = hashSet;
        hashSet.add("2");
        hashSet.add("2x");
        hashSet.add("2a");
        hashSet.add(defaultVersion);
        hashSet.add("2b");
        int i15 = 0;
        int i16 = 0;
        while (true) {
            byte[] bArr = decodingTable;
            if (i16 >= bArr.length) {
                break;
            }
            bArr[i16] = -1;
            i16++;
        }
        while (true) {
            byte[] bArr2 = encodingTable;
            if (i15 >= bArr2.length) {
                return;
            }
            decodingTable[bArr2[i15]] = (byte) i15;
            i15++;
        }
    }

    private OpenBSDBCrypt() {
    }

    public static boolean checkPassword(String str, byte[] bArr) {
        if (bArr != null) {
            return doCheckPassword(str, Arrays.clone(bArr));
        }
        throw new IllegalArgumentException("Missing password.");
    }

    private static String createBcryptString(String str, byte[] bArr, byte[] bArr2, int i15) {
        String string;
        if (!allowedVersions.contains(str)) {
            throw new IllegalArgumentException("Version " + str + " is not accepted by this implementation.");
        }
        StringBuilder sb5 = new StringBuilder(60);
        sb5.append('$');
        sb5.append(str);
        sb5.append('$');
        if (i15 < 10) {
            string = d.f37012h1 + i15;
        } else {
            string = Integer.toString(i15);
        }
        sb5.append(string);
        sb5.append('$');
        encodeData(sb5, bArr2);
        encodeData(sb5, BCrypt.generate(bArr, bArr2, i15));
        return sb5.toString();
    }

    private static byte[] decodeSaltString(String str) {
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
        if (charArray.length != 22) {
            throw new DataLengthException("Invalid base64 salt length: " + charArray.length + " , 22 required.");
        }
        for (char c15 : charArray) {
            if (c15 > 'z' || c15 < '.' || (c15 > '9' && c15 < 'A')) {
                throw new IllegalArgumentException("Salt string contains invalid character: " + ((int) c15));
            }
        }
        char[] cArr = new char[24];
        System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        for (int i15 = 0; i15 < 24; i15 += 4) {
            byte[] bArr = decodingTable;
            byte b15 = bArr[cArr[i15]];
            byte b16 = bArr[cArr[i15 + 1]];
            byte b17 = bArr[cArr[i15 + 2]];
            byte b18 = bArr[cArr[i15 + 3]];
            byteArrayOutputStream.write((b15 << 2) | (b16 >> 4));
            byteArrayOutputStream.write((b16 << 4) | (b17 >> 2));
            byteArrayOutputStream.write(b18 | (b17 << 6));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr2 = new byte[16];
        System.arraycopy(byteArray, 0, bArr2, 0, 16);
        return bArr2;
    }

    private static boolean doCheckPassword(String str, byte[] bArr) {
        String strSubstring;
        if (str == null) {
            throw new IllegalArgumentException("Missing bcryptString.");
        }
        if (str.charAt(1) != '2') {
            throw new IllegalArgumentException("not a Bcrypt string");
        }
        int length = str.length();
        if (length != 60 && (length != 59 || str.charAt(2) != '$')) {
            throw new DataLengthException("Bcrypt String length: " + length + ", 60 required.");
        }
        int i15 = 3;
        if (str.charAt(2) == '$') {
            if (str.charAt(0) != '$' || str.charAt(5) != '$') {
                throw new IllegalArgumentException("Invalid Bcrypt String format.");
            }
        } else if (str.charAt(0) != '$' || str.charAt(3) != '$' || str.charAt(6) != '$') {
            throw new IllegalArgumentException("Invalid Bcrypt String format.");
        }
        if (str.charAt(2) == '$') {
            strSubstring = str.substring(1, 2);
        } else {
            strSubstring = str.substring(1, 3);
            i15 = 4;
        }
        if (!allowedVersions.contains(strSubstring)) {
            throw new IllegalArgumentException("Bcrypt version '" + strSubstring + "' is not supported by this implementation");
        }
        String strSubstring2 = str.substring(i15, i15 + 2);
        try {
            int i16 = Integer.parseInt(strSubstring2);
            if (i16 >= 4 && i16 <= 31) {
                return Strings.constantTimeAreEqual(str, doGenerate(strSubstring, bArr, decodeSaltString(str.substring(str.lastIndexOf(36) + 1, length - 31)), i16));
            }
            throw new IllegalArgumentException("Invalid cost factor: " + i16 + ", 4 < cost < 31 expected.");
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("Invalid cost factor: " + strSubstring2);
        }
    }

    private static String doGenerate(String str, byte[] bArr, byte[] bArr2, int i15) {
        if (!allowedVersions.contains(str)) {
            throw new IllegalArgumentException("Version " + str + " is not accepted by this implementation.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt required.");
        }
        if (bArr2.length != 16) {
            throw new DataLengthException("16 byte salt required: " + bArr2.length);
        }
        if (i15 < 4 || i15 > 31) {
            throw new IllegalArgumentException("Invalid cost factor.");
        }
        int length = bArr.length < 72 ? bArr.length + 1 : 72;
        byte[] bArr3 = new byte[length];
        if (length > bArr.length) {
            length = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr3, 0, length);
        Arrays.fill(bArr, (byte) 0);
        String strCreateBcryptString = createBcryptString(str, bArr3, bArr2, i15);
        Arrays.fill(bArr3, (byte) 0);
        return strCreateBcryptString;
    }

    private static void encodeData(StringBuilder sb5, byte[] bArr) {
        boolean z15;
        if (bArr.length != 24 && bArr.length != 16) {
            throw new DataLengthException("Invalid length: " + bArr.length + ", 24 for key or 16 for salt expected");
        }
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[18];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
            z15 = true;
        } else {
            bArr[bArr.length - 1] = 0;
            z15 = false;
        }
        int length = bArr.length;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int i16 = bArr[i15] & 255;
            int i17 = bArr[i15 + 1] & 255;
            byte b15 = bArr[i15 + 2];
            byte[] bArr3 = encodingTable;
            sb5.append((char) bArr3[(i16 >>> 2) & 63]);
            sb5.append((char) bArr3[((i16 << 4) | (i17 >>> 4)) & 63]);
            sb5.append((char) bArr3[((i17 << 2) | ((b15 & 255) >>> 6)) & 63]);
            sb5.append((char) bArr3[b15 & 63]);
        }
        int length2 = sb5.length();
        sb5.setLength(z15 ? length2 - 2 : length2 - 1);
    }

    public static String generate(String str, byte[] bArr, byte[] bArr2, int i15) {
        if (bArr != null) {
            return doGenerate(str, Arrays.clone(bArr), bArr2, i15);
        }
        throw new IllegalArgumentException("Password required.");
    }

    public static boolean checkPassword(String str, char[] cArr) {
        if (cArr != null) {
            return doCheckPassword(str, Strings.toUTF8ByteArray(cArr));
        }
        throw new IllegalArgumentException("Missing password.");
    }

    public static String generate(String str, char[] cArr, byte[] bArr, int i15) {
        if (cArr != null) {
            return doGenerate(str, Strings.toUTF8ByteArray(cArr), bArr, i15);
        }
        throw new IllegalArgumentException("Password required.");
    }

    public static String generate(byte[] bArr, byte[] bArr2, int i15) {
        return generate(defaultVersion, bArr, bArr2, i15);
    }

    public static String generate(char[] cArr, byte[] bArr, int i15) {
        return generate(defaultVersion, cArr, bArr, i15);
    }
}
