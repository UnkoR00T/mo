package bk;

import ck.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final OutputStream f19882a = new a();

    class a extends OutputStream {
        a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i15) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            p.q(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i15, int i16) {
            p.q(bArr);
            p.v(i15, i16 + i15, bArr.length);
        }
    }

    private static byte[] a(Queue<byte[]> queue, int i15) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i15) {
            return bArrRemove;
        }
        int length = i15 - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i15);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i15 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] b(InputStream inputStream) {
        p.q(inputStream);
        return c(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] c(InputStream inputStream, Queue<byte[]> queue, int i15) throws IOException {
        int iMin = Math.min(PKIFailureInfo.certRevoked, Math.max(128, Integer.highestOneBit(i15) * 2));
        while (i15 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i15);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i16 = 0;
            while (i16 < iMin2) {
                int i17 = inputStream.read(bArr, i16, iMin2 - i16);
                if (i17 == -1) {
                    return a(queue, i15);
                }
                i16 += i17;
                i15 += i17;
            }
            iMin = c.f(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
