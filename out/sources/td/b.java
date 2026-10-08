package td;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f189575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f189576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f189577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f189578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f189579e = null;

    public b(float f15, float f16, float f17, int i15) {
        this.f189575a = f15;
        this.f189576b = f16;
        this.f189577c = f17;
        this.f189578d = i15;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.f189578d) > 0) {
            paint.setShadowLayer(Math.max(this.f189575a, Float.MIN_VALUE), this.f189576b, this.f189577c, this.f189578d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(k.b bVar) {
        if (Color.alpha(this.f189578d) > 0) {
            bVar.f189634d = this;
        } else {
            bVar.f189634d = null;
        }
    }

    public void c(int i15, Paint paint) {
        int iK = m.k(Color.alpha(this.f189578d), j.c(i15, 0, GF2Field.MASK));
        if (iK <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f189575a, Float.MIN_VALUE), this.f189576b, this.f189577c, Color.argb(iK, Color.red(this.f189578d), Color.green(this.f189578d), Color.blue(this.f189578d)));
        }
    }

    public void d(int i15, k.b bVar) {
        b bVar2 = new b(this);
        bVar.f189634d = bVar2;
        bVar2.i(i15);
    }

    public int e() {
        return this.f189578d;
    }

    public float f() {
        return this.f189576b;
    }

    public float g() {
        return this.f189577c;
    }

    public float h() {
        return this.f189575a;
    }

    public void i(int i15) {
        this.f189578d = Color.argb(Math.round((Color.alpha(this.f189578d) * j.c(i15, 0, GF2Field.MASK)) / 255.0f), Color.red(this.f189578d), Color.green(this.f189578d), Color.blue(this.f189578d));
    }

    public boolean j(b bVar) {
        return this.f189575a == bVar.f189575a && this.f189576b == bVar.f189576b && this.f189577c == bVar.f189577c && this.f189578d == bVar.f189578d;
    }

    public void k(Matrix matrix) {
        if (this.f189579e == null) {
            this.f189579e = new float[2];
        }
        float[] fArr = this.f189579e;
        fArr[0] = this.f189576b;
        fArr[1] = this.f189577c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f189579e;
        this.f189576b = fArr2[0];
        this.f189577c = fArr2[1];
        this.f189575a = matrix.mapRadius(this.f189575a);
    }

    public b(b bVar) {
        this.f189575a = 0.0f;
        this.f189576b = 0.0f;
        this.f189577c = 0.0f;
        this.f189578d = 0;
        this.f189575a = bVar.f189575a;
        this.f189576b = bVar.f189576b;
        this.f189577c = bVar.f189577c;
        this.f189578d = bVar.f189578d;
    }
}
