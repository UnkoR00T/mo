package op;

import bp.i;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f148062c = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f148063b = new a(new float[]{0.0f, 0.0f, 0.0f}, this);

    private e() {
    }

    @Override // op.b
    public String d() {
        return i.f20867s2.A3();
    }

    @Override // op.b
    public int e() {
        return 3;
    }

    public float[] f(float[] fArr) {
        return fArr.length == 3 ? fArr : this.f148063b.b();
    }
}
