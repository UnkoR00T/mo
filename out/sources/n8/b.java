package n8;

import a8.a3;
import java.nio.ByteBuffer;
import t7.p;
import w7.c0;
import w7.o0;
import z7.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a8.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final f f133487v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final c0 f133488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private a f133489x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f133490y;

    public b() {
        super(6);
        this.f133487v = new f(1);
        this.f133488w = new c0();
    }

    private float[] v0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f133488w.d0(byteBuffer.array(), byteBuffer.limit());
        this.f133488w.f0(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i15 = 0; i15 < 3; i15++) {
            fArr[i15] = Float.intBitsToFloat(this.f133488w.D());
        }
        return fArr;
    }

    private void w0() {
        a aVar = this.f133489x;
        if (aVar != null) {
            aVar.i();
        }
    }

    @Override // a8.b, a8.x2.b
    public void A(int i15, Object obj) {
        if (i15 == 8) {
            this.f133489x = (a) obj;
        } else {
            super.A(i15, obj);
        }
    }

    @Override // a8.a3
    public int a(p pVar) {
        return "application/x-camera-motion".equals(pVar.f188381p) ? a3.y(4) : a3.y(0);
    }

    @Override // a8.z2
    public boolean e() {
        return n();
    }

    @Override // a8.z2
    public boolean f() {
        return true;
    }

    @Override // a8.z2, a8.a3
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // a8.z2
    public void h(long j15, long j16) {
        while (!n() && this.f133490y < 100000 + j15) {
            this.f133487v.l();
            if (s0(Y(), this.f133487v, 0) != -4 || this.f133487v.p()) {
                return;
            }
            long j17 = this.f133487v.f233230f;
            this.f133490y = j17;
            boolean z15 = j17 < a0();
            if (this.f133489x != null && !z15) {
                this.f133487v.y();
                float[] fArrV0 = v0((ByteBuffer) o0.h(this.f133487v.f233228d));
                if (fArrV0 != null) {
                    ((a) o0.h(this.f133489x)).a(this.f133490y - e0(), fArrV0);
                }
            }
        }
    }

    @Override // a8.b
    protected void h0() {
        w0();
    }

    @Override // a8.b
    protected void k0(long j15, boolean z15, boolean z16) {
        this.f133490y = Long.MIN_VALUE;
        w0();
    }
}
