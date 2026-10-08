package wo;

import android.graphics.PointF;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Cloneable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f214232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f214233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f214234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f214235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double f214236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    double f214237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    transient int f214238g;

    public a() {
        this.f214238g = 0;
        this.f214235d = 1.0d;
        this.f214232a = 1.0d;
        this.f214237f = 0.0d;
        this.f214236e = 0.0d;
        this.f214234c = 0.0d;
        this.f214233b = 0.0d;
    }

    public static a e(double d15, double d16) {
        a aVar = new a();
        aVar.y(d15, d16);
        return aVar;
    }

    public static a n(double d15, double d16) {
        a aVar = new a();
        aVar.A(d15, d16);
        return aVar;
    }

    public void A(double d15, double d16) {
        this.f214235d = 1.0d;
        this.f214232a = 1.0d;
        this.f214233b = 0.0d;
        this.f214234c = 0.0d;
        this.f214236e = d15;
        this.f214237f = d16;
        if (d15 == 0.0d && d16 == 0.0d) {
            this.f214238g = 0;
        } else {
            this.f214238g = 1;
        }
    }

    public void D(double d15, double d16, double d17, double d18, double d19, double d25) {
        this.f214238g = -1;
        this.f214232a = d15;
        this.f214233b = d16;
        this.f214234c = d17;
        this.f214235d = d18;
        this.f214236e = d19;
        this.f214237f = d25;
    }

    public void F(a aVar) {
        this.f214238g = aVar.f214238g;
        D(aVar.f214232a, aVar.f214233b, aVar.f214234c, aVar.f214235d, aVar.f214236e, aVar.f214237f);
    }

    public PointF G(PointF pointF, PointF pointF2) {
        float f15 = pointF.x;
        double d15 = ((double) f15) * this.f214232a;
        float f16 = pointF.y;
        pointF2.set((float) (d15 + (((double) f16) * this.f214234c) + this.f214236e), (float) ((((double) f15) * this.f214233b) + (((double) f16) * this.f214235d) + this.f214237f));
        return pointF2;
    }

    public void H(float[] fArr, int i15, float[] fArr2, int i16, int i17) {
        int i18;
        int i19;
        int i25 = 2;
        if (fArr == fArr2 && i15 < i16 && i16 < (i19 = i15 + (i18 = i17 * 2))) {
            i15 = i19 - 2;
            i16 = (i16 + i18) - 2;
            i25 = -2;
        }
        while (true) {
            i17--;
            if (i17 < 0) {
                return;
            }
            double d15 = fArr[i15];
            double d16 = fArr[i15 + 1];
            fArr2[i16] = (float) ((this.f214232a * d15) + (this.f214234c * d16) + this.f214236e);
            fArr2[i16 + 1] = (float) ((d15 * this.f214233b) + (d16 * this.f214235d) + this.f214237f);
            i15 += i25;
            i16 += i25;
        }
    }

    public void b(a aVar) {
        F(v(aVar, this));
    }

    public void c(double[] dArr) {
        dArr[0] = this.f214232a;
        dArr[1] = this.f214233b;
        dArr[2] = this.f214234c;
        dArr[3] = this.f214235d;
        if (dArr.length > 4) {
            dArr[4] = this.f214236e;
            dArr[5] = this.f214237f;
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f214232a == aVar.f214232a && this.f214234c == aVar.f214234c && this.f214236e == aVar.f214236e && this.f214233b == aVar.f214233b && this.f214235d == aVar.f214235d && this.f214237f == aVar.f214237f) {
                return true;
            }
        }
        return false;
    }

    public double g() {
        return this.f214232a;
    }

    public double i() {
        return this.f214235d;
    }

    public double j() {
        return this.f214234c;
    }

    public double m() {
        return this.f214233b;
    }

    public double o() {
        return this.f214236e;
    }

    public double p() {
        return this.f214237f;
    }

    public int s() {
        int i15;
        int i16 = this.f214238g;
        if (i16 != -1) {
            return i16;
        }
        double d15 = this.f214232a;
        double d16 = this.f214234c;
        double d17 = this.f214233b;
        double d18 = this.f214235d;
        if ((d15 * d16) + (d17 * d18) != 0.0d) {
            return 32;
        }
        if (this.f214236e == 0.0d && this.f214237f == 0.0d) {
            i15 = 0;
            if (d15 == 1.0d && d18 == 1.0d && d16 == 0.0d && d17 == 0.0d) {
                return 0;
            }
        } else {
            i15 = 1;
        }
        if ((d15 * d18) - (d16 * d17) < 0.0d) {
            i15 |= 64;
        }
        double d19 = (d15 * d15) + (d17 * d17);
        if (d19 != (d16 * d16) + (d18 * d18)) {
            i15 |= 4;
        } else if (d19 != 1.0d) {
            i15 |= 2;
        }
        if ((d15 == 0.0d && d18 == 0.0d) || (d17 == 0.0d && d16 == 0.0d && (d15 < 0.0d || d18 < 0.0d))) {
            return i15 | 8;
        }
        return (d16 == 0.0d && d17 == 0.0d) ? i15 : i15 | 16;
    }

    public boolean t() {
        return s() == 0;
    }

    public String toString() {
        return getClass().getName() + "[[" + this.f214232a + ", " + this.f214234c + ", " + this.f214236e + "], [" + this.f214233b + ", " + this.f214235d + ", " + this.f214237f + "]]";
    }

    a v(a aVar, a aVar2) {
        double d15 = aVar.f214232a;
        double d16 = aVar2.f214232a;
        double d17 = aVar.f214233b;
        double d18 = aVar2.f214234c;
        double d19 = (d15 * d16) + (d17 * d18);
        double d25 = aVar2.f214233b;
        double d26 = aVar2.f214235d;
        double d27 = (d15 * d25) + (d17 * d26);
        double d28 = aVar.f214234c;
        double d29 = d28 * d16;
        double d35 = aVar.f214235d;
        double d36 = d29 + (d35 * d18);
        double d37 = (d28 * d25) + (d35 * d26);
        double d38 = aVar.f214236e;
        double d39 = d16 * d38;
        double d45 = aVar.f214237f;
        return new a(d19, d27, d36, d37, d39 + (d18 * d45) + aVar2.f214236e, (d38 * d25) + (d45 * d26) + aVar2.f214237f);
    }

    public void w(double d15, double d16) {
        b(e(d15, d16));
    }

    public void y(double d15, double d16) {
        this.f214232a = d15;
        this.f214235d = d16;
        this.f214237f = 0.0d;
        this.f214236e = 0.0d;
        this.f214234c = 0.0d;
        this.f214233b = 0.0d;
        if (d15 == 1.0d && d16 == 1.0d) {
            this.f214238g = 0;
        } else {
            this.f214238g = -1;
        }
    }

    public a(float f15, float f16, float f17, float f18, float f19, float f25) {
        this.f214238g = -1;
        this.f214232a = f15;
        this.f214233b = f16;
        this.f214234c = f17;
        this.f214235d = f18;
        this.f214236e = f19;
        this.f214237f = f25;
    }

    public a(double d15, double d16, double d17, double d18, double d19, double d25) {
        this.f214238g = -1;
        this.f214232a = d15;
        this.f214233b = d16;
        this.f214234c = d17;
        this.f214235d = d18;
        this.f214236e = d19;
        this.f214237f = d25;
    }
}
