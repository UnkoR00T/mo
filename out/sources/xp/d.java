package xp;

import android.graphics.PointF;
import bp.k;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f220422a;

    public d() {
        this.f220422a = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static d e(bp.b bVar) {
        if (!(bVar instanceof bp.a)) {
            return new d();
        }
        bp.a aVar = (bp.a) bVar;
        if (aVar.size() < 6) {
            return new d();
        }
        for (int i15 = 0; i15 < 6; i15++) {
            if (!(aVar.k4(i15) instanceof k)) {
                return new d();
            }
        }
        return new d(aVar);
    }

    public static d g(double d15, float f15, float f16) {
        float fCos = (float) Math.cos(d15);
        float fSin = (float) Math.sin(d15);
        return new d(fCos, fSin, -fSin, fCos, f15, f16);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        return new d((float[]) this.f220422a.clone());
    }

    public wo.a c() {
        float[] fArr = this.f220422a;
        return new wo.a(fArr[0], fArr[1], fArr[3], fArr[4], fArr[6], fArr[7]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return Arrays.equals(this.f220422a, ((d) obj).f220422a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f220422a);
    }

    public float i() {
        return this.f220422a[0];
    }

    public float j() {
        return this.f220422a[4];
    }

    public PointF l(float f15, float f16) {
        float[] fArr = this.f220422a;
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = fArr[3];
        float f25 = fArr[4];
        return new PointF((f17 * f15) + (f19 * f16) + fArr[6], (f15 * f18) + (f16 * f25) + fArr[7]);
    }

    public String toString() {
        return "[" + this.f220422a[0] + "," + this.f220422a[1] + "," + this.f220422a[3] + "," + this.f220422a[4] + "," + this.f220422a[6] + "," + this.f220422a[7] + "]";
    }

    private d(float[] fArr) {
        this.f220422a = fArr;
    }

    public d(bp.a aVar) {
        float[] fArr = new float[9];
        this.f220422a = fArr;
        fArr[0] = ((k) aVar.k4(0)).i3();
        this.f220422a[1] = ((k) aVar.k4(1)).i3();
        this.f220422a[3] = ((k) aVar.k4(2)).i3();
        this.f220422a[4] = ((k) aVar.k4(3)).i3();
        this.f220422a[6] = ((k) aVar.k4(4)).i3();
        this.f220422a[7] = ((k) aVar.k4(5)).i3();
        this.f220422a[8] = 1.0f;
    }

    public d(float f15, float f16, float f17, float f18, float f19, float f25) {
        this.f220422a = new float[]{f15, f16, 0.0f, f17, f18, 0.0f, f19, f25, 1.0f};
    }

    public d(wo.a aVar) {
        float[] fArr = new float[9];
        this.f220422a = fArr;
        fArr[0] = (float) aVar.g();
        this.f220422a[1] = (float) aVar.m();
        this.f220422a[3] = (float) aVar.j();
        this.f220422a[4] = (float) aVar.i();
        this.f220422a[6] = (float) aVar.o();
        this.f220422a[7] = (float) aVar.p();
        this.f220422a[8] = 1.0f;
    }
}
