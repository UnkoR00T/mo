package y00;

import java.util.BitSet;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Ly00/h;", "Liy/e;", "<init>", "()V", "", "firstArray", "secondArray", "c", "([B[B)[B", "byteArray", "a", "([B)[B", "b", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements iy.e {
    @Override // iy.e
    public byte[] a(byte[] byteArray) {
        byte[] bArr = new byte[byteArray.length];
        int length = byteArray.length;
        for (int i15 = 0; i15 < length; i15++) {
            if (i15 % 2 == 0) {
                bArr[i15] = (byte) (~byteArray[i15]);
            } else {
                bArr[i15] = byteArray[i15];
            }
        }
        return bArr;
    }

    @Override // iy.e
    public byte[] b(byte[] byteArray) {
        BitSet bitSetValueOf = BitSet.valueOf(byteArray);
        bitSetValueOf.flip(0, bitSetValueOf.length());
        return pq.n.H(byteArray, bitSetValueOf.toByteArray());
    }

    @Override // iy.e
    public byte[] c(byte[] firstArray, byte[] secondArray) {
        int length = firstArray.length < secondArray.length ? secondArray.length : firstArray.length;
        int length2 = firstArray.length < secondArray.length ? firstArray.length : secondArray.length;
        byte[] bArr = firstArray.length < secondArray.length ? secondArray : firstArray;
        if (firstArray.length >= secondArray.length) {
            firstArray = secondArray;
        }
        byte[] bArr2 = new byte[length];
        for (int i15 = 0; i15 < length; i15++) {
            bArr2[i15] = (byte) (bArr[i15] ^ firstArray[i15 % length2]);
        }
        return bArr2;
    }
}
