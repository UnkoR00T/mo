package f8;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class i extends z7.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f59996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f59997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f59998m;

    public i() {
        super(2);
        this.f59998m = 32;
    }

    private boolean F(z7.f fVar) {
        ByteBuffer byteBuffer;
        if (!J()) {
            return true;
        }
        if (this.f59997l >= this.f59998m) {
            return false;
        }
        ByteBuffer byteBuffer2 = fVar.f233228d;
        return byteBuffer2 == null || (byteBuffer = this.f233228d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public boolean D(z7.f fVar) {
        zj.p.d(!fVar.z());
        zj.p.d(!fVar.o());
        zj.p.d(!fVar.p());
        if (!F(fVar)) {
            return false;
        }
        int i15 = this.f59997l;
        this.f59997l = i15 + 1;
        if (i15 == 0) {
            this.f233230f = fVar.f233230f;
            if (fVar.r()) {
                v(1);
            }
        }
        ByteBuffer byteBuffer = fVar.f233228d;
        if (byteBuffer != null) {
            x(byteBuffer.remaining());
            this.f233228d.put(byteBuffer);
        }
        this.f59996k = fVar.f233230f;
        return true;
    }

    public long G() {
        return this.f233230f;
    }

    public long H() {
        return this.f59996k;
    }

    public int I() {
        return this.f59997l;
    }

    public boolean J() {
        return this.f59997l > 0;
    }

    public void K(int i15) {
        zj.p.d(i15 > 0);
        this.f59998m = i15;
    }

    @Override // z7.f, z7.a
    public void l() {
        super.l();
        this.f59997l = 0;
    }
}
