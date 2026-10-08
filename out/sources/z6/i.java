package z6;

import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends e<i> {
    private j B;
    private float C;
    private boolean D;

    public i(g gVar) {
        super(gVar);
        this.B = null;
        this.C = Float.MAX_VALUE;
        this.D = false;
    }

    private void w() {
        j jVar = this.B;
        if (jVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dB = jVar.b();
        if (dB > this.f233144g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dB < this.f233145h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // z6.e
    void p(float f15) {
    }

    @Override // z6.e
    public void q() {
        w();
        this.B.i(g());
        super.q();
    }

    @Override // z6.e
    boolean s(long j15) {
        if (this.D) {
            float f15 = this.C;
            if (f15 != Float.MAX_VALUE) {
                this.B.g(f15);
                this.C = Float.MAX_VALUE;
            }
            this.f233139b = this.B.b();
            this.f233138a = 0.0f;
            this.D = false;
            return true;
        }
        if (this.C != Float.MAX_VALUE) {
            long j16 = j15 / 2;
            e.p pVarJ = this.B.j(this.f233139b, this.f233138a, j16);
            this.B.g(this.C);
            this.C = Float.MAX_VALUE;
            e.p pVarJ2 = this.B.j(pVarJ.f233153a, pVarJ.f233154b, j16);
            this.f233139b = pVarJ2.f233153a;
            this.f233138a = pVarJ2.f233154b;
        } else {
            e.p pVarJ3 = this.B.j(this.f233139b, this.f233138a, j15);
            this.f233139b = pVarJ3.f233153a;
            this.f233138a = pVarJ3.f233154b;
        }
        float fMax = Math.max(this.f233139b, this.f233145h);
        this.f233139b = fMax;
        float fMin = Math.min(fMax, this.f233144g);
        this.f233139b = fMin;
        if (!v(fMin, this.f233138a)) {
            return false;
        }
        this.f233139b = this.B.b();
        this.f233138a = 0.0f;
        return true;
    }

    public void t(float f15) {
        if (h()) {
            this.C = f15;
            return;
        }
        if (this.B == null) {
            this.B = new j(f15);
        }
        this.B.g(f15);
        q();
    }

    public boolean u() {
        return this.B.f233158b > 0.0d;
    }

    boolean v(float f15, float f16) {
        return this.B.e(f15, f16);
    }

    public i x(j jVar) {
        this.B = jVar;
        return this;
    }

    public void y() {
        if (!u()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!e().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f233143f) {
            this.D = true;
        }
    }

    public <K> i(K k15, f<K> fVar) {
        super(k15, fVar);
        this.B = null;
        this.C = Float.MAX_VALUE;
        this.D = false;
    }
}
