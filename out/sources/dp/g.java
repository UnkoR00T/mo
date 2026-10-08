package dp;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public interface g extends Closeable {
    void b3(int i15);

    long getPosition();

    boolean isClosed();

    byte[] j0(int i15);

    boolean k0();

    long length();

    int peek();

    int read();

    int read(byte[] bArr);

    int read(byte[] bArr, int i15, int i16);

    void seek(long j15);
}
