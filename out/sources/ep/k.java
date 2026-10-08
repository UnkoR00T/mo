package ep;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
interface k extends Closeable {
    void O1(int i15);

    void a2(byte[] bArr);

    long getPosition();

    byte[] j0(int i15);

    boolean k0();

    int peek();

    void q3(byte[] bArr, int i15, int i16);

    int read();

    int read(byte[] bArr);

    int read(byte[] bArr, int i15, int i16);
}
