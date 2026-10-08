package v;

/* JADX INFO: loaded from: classes.dex */
public final class c2 implements w3<androidx.camera.core.g>, f2, b0.s {
    public static final p1.a<Integer> S = p1.a.a("camerax.core.imageAnalysis.backpressureStrategy", androidx.camera.core.g.b.class);
    public static final p1.a<Integer> T = p1.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final p1.a<o.a1> U = p1.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", o.a1.class);
    public static final p1.a<Integer> V = p1.a.a("camerax.core.imageAnalysis.outputImageFormat", androidx.camera.core.g.e.class);
    public static final p1.a<Boolean> W = p1.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);
    public static final p1.a<Boolean> X = p1.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);
    private final z2 R;

    public c2(z2 z2Var) {
        this.R = z2Var;
    }

    @Override // v.h3
    /* JADX INFO: renamed from: a */
    public p1 getConfig() {
        return this.R;
    }

    public int i0(int i15) {
        return ((Integer) f(S, Integer.valueOf(i15))).intValue();
    }

    public int j0(int i15) {
        return ((Integer) f(T, Integer.valueOf(i15))).intValue();
    }

    public o.a1 k0() {
        return (o.a1) f(U, null);
    }

    public Boolean l0(Boolean bool) {
        return (Boolean) f(W, bool);
    }

    public int m0(int i15) {
        return ((Integer) f(V, Integer.valueOf(i15))).intValue();
    }

    public Boolean n0(Boolean bool) {
        return (Boolean) f(X, bool);
    }

    @Override // v.e2
    public int r() {
        return 35;
    }
}
