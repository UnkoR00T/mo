package bt;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f21443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f21444b;

    public interface a {
        int h();
    }

    public interface b<T extends a> {
        T a(int i15);
    }

    static {
        byte[] bArr = new byte[0];
        f21443a = bArr;
        f21444b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return y.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e15) {
            throw new RuntimeException("UTF-8 not supported?", e15);
        }
    }
}
