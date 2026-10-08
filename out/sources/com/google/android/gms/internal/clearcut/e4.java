package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes3.dex */
abstract class e4 {
    e4() {
    }

    static void d(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i15 = 0;
        while (i15 < length) {
            try {
                char cCharAt = charSequence.charAt(i15);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i15, (byte) cCharAt);
                i15++;
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        if (i15 == length) {
            byteBuffer.position(iPosition + i15);
            return;
        }
        iPosition += i15;
        while (i15 < length) {
            char cCharAt2 = charSequence.charAt(i15);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i16 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i16, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i16;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i16;
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i17 = i15 + 1;
                    if (i17 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i17);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i18 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    int i19 = iPosition + 2;
                                    try {
                                        byteBuffer.put(i18, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i19, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i15 = i17;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i15 = i17;
                                        iPosition = i19;
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    iPosition = i18;
                                    i15 = i17;
                                }
                            } else {
                                i15 = i17;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                        i15 = i17;
                        int iPosition2 = byteBuffer.position() + Math.max(i15, (iPosition - byteBuffer.position()) + 1);
                        char cCharAt4 = charSequence.charAt(i15);
                        StringBuilder sb5 = new StringBuilder(37);
                        sb5.append("Failed writing ");
                        sb5.append(cCharAt4);
                        sb5.append(" at index ");
                        sb5.append(iPosition2);
                        throw new ArrayIndexOutOfBoundsException(sb5.toString());
                    }
                    throw new g4(i15, length);
                }
                int i25 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | BERTags.FLAGS));
                iPosition += 2;
                byteBuffer.put(i25, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i15++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    abstract int a(int i15, byte[] bArr, int i16, int i17);

    abstract int b(CharSequence charSequence, byte[] bArr, int i15, int i16);

    abstract void c(CharSequence charSequence, ByteBuffer byteBuffer);

    final boolean e(byte[] bArr, int i15, int i16) {
        return a(0, bArr, i15, i16) == 0;
    }
}
