package lj;

/* JADX INFO: loaded from: classes4.dex */
public class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f118475a = -1.0f;

    @Override // lj.e
    public void a(n nVar, float f15, float f16, float f17) {
        float f18 = f17 * f16;
        nVar.o(0.0f, f18, 180.0f, 180.0f - f15);
        double d15 = f18;
        nVar.m((float) (Math.sin(Math.toRadians(f15)) * d15), (float) (Math.sin(Math.toRadians(90.0f - f15)) * d15));
    }
}
