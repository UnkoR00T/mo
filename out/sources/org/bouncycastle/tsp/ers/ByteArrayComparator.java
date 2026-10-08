package org.bouncycastle.tsp.ers;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
class ByteArrayComparator implements Comparator {
    ByteArrayComparator() {
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        for (int i15 = 0; i15 < bArr.length && i15 < bArr2.length; i15++) {
            int i16 = bArr[i15] & 255;
            int i17 = bArr2[i15] & 255;
            if (i16 != i17) {
                return i16 - i17;
            }
        }
        return bArr.length - bArr2.length;
    }
}
