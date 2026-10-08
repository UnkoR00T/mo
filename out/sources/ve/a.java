package ve;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference<byte[]> f206269a = new AtomicReference<>();

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f206272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f206273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final byte[] f206274c;

        b(byte[] bArr, int i15, int i16) {
            this.f206274c = bArr;
            this.f206272a = i15;
            this.f206273b = i16;
        }
    }

    public static ByteBuffer a(File file) throws Throwable {
        Throwable th4;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return mappedByteBufferLoad;
                } catch (Throwable th5) {
                    th4 = th5;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th4;
                    }
                    try {
                        randomAccessFile.close();
                        throw th4;
                    } catch (IOException unused4) {
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                th4 = th6;
            }
        } catch (Throwable th7) {
            th4 = th7;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f206269a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i15 = inputStream.read(andSet);
            if (i15 < 0) {
                f206269a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i15);
        }
    }

    private static b c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static byte[] e(ByteBuffer byteBuffer) {
        b bVarC = c(byteBuffer);
        if (bVarC != null && bVarC.f206272a == 0 && bVarC.f206273b == bVarC.f206274c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        d(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void f(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        d(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th4) {
                th = th4;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            randomAccessFile = null;
        }
    }

    public static InputStream g(ByteBuffer byteBuffer) {
        return new C5392a(byteBuffer);
    }

    /* JADX INFO: renamed from: ve.a$a, reason: collision with other inner class name */
    private static class C5392a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f206270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f206271b = -1;

        C5392a(ByteBuffer byteBuffer) {
            this.f206270a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f206270a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i15) {
            this.f206271b = this.f206270a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f206270a.hasRemaining()) {
                return this.f206270a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i15 = this.f206271b;
            if (i15 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f206270a.position(i15);
        }

        @Override // java.io.InputStream
        public long skip(long j15) {
            if (!this.f206270a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j15, available());
            ByteBuffer byteBuffer = this.f206270a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i15, int i16) {
            if (!this.f206270a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i16, available());
            this.f206270a.get(bArr, i15, iMin);
            return iMin;
        }
    }
}
