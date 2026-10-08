package fd;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f61207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f61208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f61209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f61210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f61211f;

    public d0(int i15, int i16, String str, String str2, String str3) {
        this.f61206a = i15;
        this.f61207b = i16;
        this.f61208c = str;
        this.f61209d = str2;
        this.f61210e = str3;
    }

    public d0 a(float f15) {
        d0 d0Var = new d0((int) (this.f61206a * f15), (int) (this.f61207b * f15), this.f61208c, this.f61209d, this.f61210e);
        Bitmap bitmap = this.f61211f;
        if (bitmap != null) {
            d0Var.g(Bitmap.createScaledBitmap(bitmap, d0Var.f61206a, d0Var.f61207b, true));
        }
        return d0Var;
    }

    public Bitmap b() {
        return this.f61211f;
    }

    public String c() {
        return this.f61209d;
    }

    public int d() {
        return this.f61207b;
    }

    public String e() {
        return this.f61208c;
    }

    public int f() {
        return this.f61206a;
    }

    public void g(Bitmap bitmap) {
        this.f61211f = bitmap;
    }
}
