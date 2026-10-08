package a7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {
    public static b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new b());
    }

    public static b i(ByteBuffer byteBuffer, b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public b f(int i15, ByteBuffer byteBuffer) {
        g(i15, byteBuffer);
        return this;
    }

    public void g(int i15, ByteBuffer byteBuffer) {
        c(i15, byteBuffer);
    }

    public a j(a aVar, int i15) {
        int iB = b(6);
        if (iB != 0) {
            return aVar.f(a(d(iB) + (i15 * 4)), this.f3979b);
        }
        return null;
    }

    public int k() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f3979b.getInt(iB + this.f3978a);
        }
        return 0;
    }
}
