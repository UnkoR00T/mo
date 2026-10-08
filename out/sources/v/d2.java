package v;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d2 implements w3<o.t0>, f2, b0.i {
    public static final p1.a<Integer> S;
    public static final p1.a<Integer> T;
    public static final p1.a<m1> U;
    public static final p1.a<Integer> V;
    public static final p1.a<Integer> W;
    public static final p1.a<Integer> X;
    public static final p1.a<o.a1> Y;
    public static final p1.a<Boolean> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final p1.a<Integer> f202536a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final p1.a<Integer> f202537b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final p1.a<o.t0.j> f202538c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final p1.a<j0.c> f202539d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final p1.a<Boolean> f202540e0;
    private final z2 R;

    static {
        Class cls = Integer.TYPE;
        S = p1.a.a("camerax.core.imageCapture.captureMode", cls);
        T = p1.a.a("camerax.core.imageCapture.flashMode", cls);
        U = p1.a.a("camerax.core.imageCapture.captureBundle", m1.class);
        V = p1.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        W = p1.a.a("camerax.core.imageCapture.outputFormat", Integer.class);
        X = p1.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        Y = p1.a.a("camerax.core.imageCapture.imageReaderProxyProvider", o.a1.class);
        Z = p1.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f202536a0 = p1.a.a("camerax.core.imageCapture.flashType", cls);
        f202537b0 = p1.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f202538c0 = p1.a.a("camerax.core.imageCapture.screenFlash", o.t0.j.class);
        f202539d0 = p1.a.a("camerax.core.useCase.postviewResolutionSelector", j0.c.class);
        f202540e0 = p1.a.a("camerax.core.useCase.isPostviewEnabled", Boolean.class);
    }

    public d2(z2 z2Var) {
        this.R = z2Var;
    }

    @Override // v.h3
    /* JADX INFO: renamed from: a */
    public p1 getConfig() {
        return this.R;
    }

    public m1 i0(m1 m1Var) {
        return (m1) f(U, m1Var);
    }

    public int j0() {
        return ((Integer) d(S)).intValue();
    }

    public int k0(int i15) {
        return ((Integer) f(T, Integer.valueOf(i15))).intValue();
    }

    public int l0(int i15) {
        return ((Integer) f(f202536a0, Integer.valueOf(i15))).intValue();
    }

    public o.a1 m0() {
        return (o.a1) f(Y, null);
    }

    public Executor n0(Executor executor) {
        return (Executor) f(b0.i.f15589a, executor);
    }

    public int o0() {
        return ((Integer) d(f202537b0)).intValue();
    }

    public o.t0.j p0() {
        return (o.t0.j) f(f202538c0, null);
    }

    public boolean q0() {
        return h(S);
    }

    @Override // v.e2
    public int r() {
        return ((Integer) d(e2.f202557n)).intValue();
    }
}
