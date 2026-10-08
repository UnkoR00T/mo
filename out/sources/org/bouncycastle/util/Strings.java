package org.bouncycastle.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Vector;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: loaded from: classes5.dex */
public final class Strings {
    private static String LINE_SEPARATOR;

    private static class StringListImpl extends ArrayList<String> implements StringList {
        private StringListImpl() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List, org.bouncycastle.util.StringList
        public /* bridge */ /* synthetic */ String get(int i15) {
            return (String) super.get(i15);
        }

        @Override // org.bouncycastle.util.StringList
        public String[] toStringArray() {
            int size = size();
            String[] strArr = new String[size];
            for (int i15 = 0; i15 != size; i15++) {
                strArr[i15] = get(i15);
            }
            return strArr;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public void add(int i15, String str) {
            super.add(i15, str);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public String set(int i15, String str) {
            return (String) super.set(i15, str);
        }

        @Override // org.bouncycastle.util.StringList
        public String[] toStringArray(int i15, int i16) {
            String[] strArr = new String[i16 - i15];
            for (int i17 = i15; i17 != size() && i17 != i16; i17++) {
                strArr[i17 - i15] = get(i17);
            }
            return strArr;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(String str) {
            return super.add(str);
        }
    }

    static {
        try {
            try {
                LINE_SEPARATOR = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.bouncycastle.util.Strings.1
                    @Override // java.security.PrivilegedAction
                    public String run() {
                        return System.getProperty("line.separator");
                    }
                });
            } catch (Exception unused) {
                LINE_SEPARATOR = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            LINE_SEPARATOR = "\n";
        }
    }

    public static char[] asCharArray(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i15 = 0; i15 != length; i15++) {
            cArr[i15] = (char) (bArr[i15] & 255);
        }
        return cArr;
    }

    public static boolean constantTimeAreEqual(String str, String str2) {
        boolean z15 = str.length() == str2.length();
        int length = str.length();
        if (z15) {
            for (int i15 = 0; i15 != length; i15++) {
                z15 &= str.charAt(i15) == str2.charAt(i15);
            }
            return z15;
        }
        for (int i16 = 0; i16 != length; i16++) {
            z15 &= str.charAt(i16) == ' ';
        }
        return z15;
    }

    public static String fromByteArray(byte[] bArr) {
        return new String(asCharArray(bArr));
    }

    public static String fromUTF8ByteArray(byte[] bArr) {
        return fromUTF8ByteArray(bArr, 0, bArr.length);
    }

    public static String lineSeparator() {
        return LINE_SEPARATOR;
    }

    public static StringList newList() {
        return new StringListImpl();
    }

    public static String[] split(String str, char c15) {
        int i15;
        Vector vector = new Vector();
        boolean z15 = true;
        while (true) {
            if (!z15) {
                break;
            }
            int iIndexOf = str.indexOf(c15);
            if (iIndexOf > 0) {
                vector.addElement(str.substring(0, iIndexOf));
                str = str.substring(iIndexOf + 1);
            } else {
                vector.addElement(str);
                z15 = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i15 = 0; i15 != size; i15++) {
            strArr[i15] = (String) vector.elementAt(i15);
        }
        return strArr;
    }

    public static int toByteArray(String str, byte[] bArr, int i15) {
        int length = str.length();
        for (int i16 = 0; i16 < length; i16++) {
            bArr[i15 + i16] = (byte) str.charAt(i16);
        }
        return length;
    }

    public static String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z15 = false;
        for (int i15 = 0; i15 != charArray.length; i15++) {
            char c15 = charArray[i15];
            if ('A' <= c15 && 'Z' >= c15) {
                charArray[i15] = (char) (c15 + ' ');
                z15 = true;
            }
        }
        return z15 ? new String(charArray) : str;
    }

    public static void toUTF8ByteArray(char[] cArr, int i15, int i16, OutputStream outputStream) throws IOException {
        int i17;
        int i18;
        if (i16 < 1) {
            return;
        }
        byte[] bArr = new byte[64];
        int i19 = 0;
        int i25 = 0;
        while (true) {
            int i26 = i19 + 1;
            char c15 = cArr[i15 + i19];
            if (c15 < 128) {
                i17 = i25 + 1;
                bArr[i25] = (byte) c15;
            } else {
                if (c15 < 2048) {
                    int i27 = i25 + 1;
                    bArr[i25] = (byte) ((c15 >> 6) | 192);
                    i18 = i25 + 2;
                    bArr[i27] = (byte) ((c15 & '?') | 128);
                } else if (c15 < 55296 || c15 > 57343) {
                    bArr[i25] = (byte) ((c15 >> '\f') | BERTags.FLAGS);
                    bArr[i25 + 1] = (byte) (((c15 >> 6) & 63) | 128);
                    i17 = i25 + 3;
                    bArr[i25 + 2] = (byte) ((c15 & '?') | 128);
                } else {
                    if (c15 > 56319) {
                        throw new IllegalStateException("invalid UTF-16 high surrogate");
                    }
                    if (i26 >= i16) {
                        throw new IllegalStateException("invalid UTF-16 codepoint (truncated surrogate pair)");
                    }
                    int i28 = i19 + 2;
                    char c16 = cArr[i26 + i15];
                    if (c16 < 56320 || c16 > 57343) {
                        throw new IllegalStateException("invalid UTF-16 low surrogate");
                    }
                    int i29 = ((c16 & 1023) | ((c15 & 1023) << 10)) + PKIFailureInfo.notAuthorized;
                    bArr[i25] = (byte) ((i29 >> 18) | 240);
                    bArr[i25 + 1] = (byte) (((i29 >> 12) & 63) | 128);
                    int i35 = i25 + 3;
                    bArr[i25 + 2] = (byte) (((i29 >> 6) & 63) | 128);
                    i18 = i25 + 4;
                    bArr[i35] = (byte) ((i29 & 63) | 128);
                    i26 = i28;
                }
                i17 = i18;
            }
            if (i17 + 4 > 64) {
                outputStream.write(bArr, 0, i17);
                i25 = 0;
            } else {
                i25 = i17;
            }
            if (i26 >= i16) {
                if (i25 > 0) {
                    outputStream.write(bArr, 0, i25);
                    return;
                }
                return;
            }
            i19 = i26;
        }
    }

    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z15 = false;
        for (int i15 = 0; i15 != charArray.length; i15++) {
            char c15 = charArray[i15];
            if ('a' <= c15 && 'z' >= c15) {
                charArray[i15] = (char) (c15 - ' ');
                z15 = true;
            }
        }
        return z15 ? new String(charArray) : str;
    }

    public static String fromUTF8ByteArray(byte[] bArr, int i15, int i16) {
        char[] cArr = new char[i16];
        int iTranscodeToUTF16 = UTF8.transcodeToUTF16(bArr, i15, i16, cArr);
        if (iTranscodeToUTF16 >= 0) {
            return new String(cArr, 0, iTranscodeToUTF16);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static byte[] toByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i15 = 0; i15 != length; i15++) {
            bArr[i15] = (byte) str.charAt(i15);
        }
        return bArr;
    }

    public static void toUTF8ByteArray(char[] cArr, OutputStream outputStream) throws IOException {
        toUTF8ByteArray(cArr, 0, cArr.length, outputStream);
    }

    public static byte[] toByteArray(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i15 = 0; i15 != length; i15++) {
            bArr[i15] = (byte) cArr[i15];
        }
        return bArr;
    }

    public static byte[] toUTF8ByteArray(String str) {
        return toUTF8ByteArray(str.toCharArray());
    }

    public static byte[] toUTF8ByteArray(char[] cArr) {
        return toUTF8ByteArray(cArr, 0, cArr.length);
    }

    public static byte[] toUTF8ByteArray(char[] cArr, int i15, int i16) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, i15, i16, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }
}
