package a7;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {
    public a f(int i15, ByteBuffer byteBuffer) {
        g(i15, byteBuffer);
        return this;
    }

    public void g(int i15, ByteBuffer byteBuffer) {
        c(i15, byteBuffer);
    }

    public int h(int i15) {
        int iB = b(16);
        if (iB != 0) {
            return this.f3979b.getInt(d(iB) + (i15 * 4));
        }
        return 0;
    }

    public int i() {
        int iB = b(16);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public boolean j() {
        int iB = b(6);
        return (iB == 0 || this.f3979b.get(iB + this.f3978a) == 0) ? false : true;
    }

    public short k() {
        int iB = b(14);
        if (iB != 0) {
            return this.f3979b.getShort(iB + this.f3978a);
        }
        return (short) 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f3979b.getInt(iB + this.f3978a);
        }
        return 0;
    }

    public short m() {
        int iB = b(8);
        if (iB != 0) {
            return this.f3979b.getShort(iB + this.f3978a);
        }
        return (short) 0;
    }

    public short n() {
        int iB = b(12);
        if (iB != 0) {
            return this.f3979b.getShort(iB + this.f3978a);
        }
        return (short) 0;
    }
}
