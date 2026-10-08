package md;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f125610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f125611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f125612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f125613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f125614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f125615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f125616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f125617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f125618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f125619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f125620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f125621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f125622m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f15, a aVar, int i15, float f16, float f17, int i16, int i17, float f18, boolean z15, PointF pointF, PointF pointF2) {
        a(str, str2, f15, aVar, i15, f16, f17, i16, i17, f18, z15, pointF, pointF2);
    }

    public void a(String str, String str2, float f15, a aVar, int i15, float f16, float f17, int i16, int i17, float f18, boolean z15, PointF pointF, PointF pointF2) {
        this.f125610a = str;
        this.f125611b = str2;
        this.f125612c = f15;
        this.f125613d = aVar;
        this.f125614e = i15;
        this.f125615f = f16;
        this.f125616g = f17;
        this.f125617h = i16;
        this.f125618i = i17;
        this.f125619j = f18;
        this.f125620k = z15;
        this.f125621l = pointF;
        this.f125622m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f125610a.hashCode() * 31) + this.f125611b.hashCode()) * 31) + this.f125612c)) * 31) + this.f125613d.ordinal()) * 31) + this.f125614e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f125615f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f125617h;
    }

    public b() {
    }
}
