package a7;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f3978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f3979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f3982e = d.a();

    protected int a(int i15) {
        return i15 + this.f3979b.getInt(i15);
    }

    protected int b(int i15) {
        if (i15 < this.f3981d) {
            return this.f3979b.getShort(this.f3980c + i15);
        }
        return 0;
    }

    protected void c(int i15, ByteBuffer byteBuffer) {
        this.f3979b = byteBuffer;
        if (byteBuffer == null) {
            this.f3978a = 0;
            this.f3980c = 0;
            this.f3981d = 0;
        } else {
            this.f3978a = i15;
            int i16 = i15 - byteBuffer.getInt(i15);
            this.f3980c = i16;
            this.f3981d = this.f3979b.getShort(i16);
        }
    }

    protected int d(int i15) {
        int i16 = i15 + this.f3978a;
        return i16 + this.f3979b.getInt(i16) + 4;
    }

    protected int e(int i15) {
        int i16 = i15 + this.f3978a;
        return this.f3979b.getInt(i16 + this.f3979b.getInt(i16));
    }
}
