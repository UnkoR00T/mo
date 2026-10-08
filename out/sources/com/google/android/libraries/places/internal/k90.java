package com.google.android.libraries.places.internal;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class k90 implements z70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f32724a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    private k90() {
        throw null;
    }

    private static boolean c(byte b15) {
        return b15 < 32 || b15 >= 126 || b15 == 37;
    }

    @Override // com.google.android.libraries.places.internal.z70
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        int i15 = 0;
        while (true) {
            int length = bArr.length;
            if (i15 >= length) {
                return new String(bArr, 0);
            }
            byte b15 = bArr[i15];
            if (b15 < 32 || b15 >= 126 || (b15 == 37 && i15 + 2 < length)) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
                int i16 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i16 >= length2) {
                        return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), StandardCharsets.UTF_8);
                    }
                    int i17 = i16 + 1;
                    if (bArr[i16] == 37 && i16 + 2 < length2) {
                        try {
                            byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i17, 2, StandardCharsets.US_ASCII), 16));
                            i16 += 3;
                        } catch (NumberFormatException unused) {
                            byteBufferAllocate.put(bArr[i16]);
                            i16 = i17;
                        }
                    }
                    byteBufferAllocate.put(bArr[i16]);
                    i16 = i17;
                }
            } else {
                i15++;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.z70
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        byte[] bytes = ((String) obj).getBytes(StandardCharsets.UTF_8);
        int i15 = 0;
        while (true) {
            int length = bytes.length;
            if (i15 >= length) {
                return bytes;
            }
            if (c(bytes[i15])) {
                byte[] bArr = new byte[((length - i15) * 3) + i15];
                if (i15 != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i15);
                }
                int i16 = i15;
                while (i15 < bytes.length) {
                    int i17 = i16 + 1;
                    byte b15 = bytes[i15];
                    if (c(b15)) {
                        bArr[i16] = 37;
                        byte[] bArr2 = f32724a;
                        bArr[i17] = bArr2[(b15 >> 4) & 15];
                        bArr[i16 + 2] = bArr2[b15 & 15];
                        i16 += 3;
                    } else {
                        bArr[i16] = b15;
                        i16 = i17;
                    }
                    i15++;
                }
                return Arrays.copyOf(bArr, i16);
            }
            i15++;
        }
    }

    /* synthetic */ k90(byte[] bArr) {
    }
}
