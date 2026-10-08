package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class b {
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

    public static InputStream b(InputStream inputStream, long j15) {
        return new a(inputStream, j15);
    }

    private static int c(long j15) {
        if (j15 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j15 < -2147483648L ? PKIFailureInfo.systemUnavail : (int) j15;
    }

    public static byte[] d(InputStream inputStream) {
        return e(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] e(InputStream inputStream, Queue<byte[]> queue, int i15) throws IOException {
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
            iMin = c(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static final class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f36484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f36485b;

        a(InputStream inputStream, long j15) {
            super(inputStream);
            this.f36485b = -1L;
            this.f36484a = j15;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f36484a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i15) {
            ((FilterInputStream) this).in.mark(i15);
            this.f36485b = this.f36484a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f36484a == 0) {
                return -1;
            }
            int i15 = ((FilterInputStream) this).in.read();
            if (i15 != -1) {
                this.f36484a--;
            }
            return i15;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f36485b == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f36484a = this.f36485b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j15) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j15, this.f36484a));
            this.f36484a -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i15, int i16) throws IOException {
            long j15 = this.f36484a;
            if (j15 == 0) {
                return -1;
            }
            int i17 = ((FilterInputStream) this).in.read(bArr, i15, (int) Math.min(i16, j15));
            if (i17 != -1) {
                this.f36484a -= (long) i17;
            }
            return i17;
        }
    }
}
