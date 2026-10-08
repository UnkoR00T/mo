package un;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static byte[] a(io.c cVar) {
        return cVar.toString().getBytes(StandardCharsets.US_ASCII);
    }

    public static byte[] b(sn.n nVar) {
        return a(nVar.h());
    }

    public static byte[] c(byte[] bArr) {
        return ByteBuffer.allocate(8).putLong(io.e.d(bArr)).array();
    }
}
