package v;

import android.util.Range;
import android.util.Size;
import java.util.Map;
import java.util.Objects;
import o.j2;

/* JADX INFO: loaded from: classes.dex */
public interface w3<T extends o.j2> extends b0.r<T>, e2 {
    public static final p1.a<j3> A = p1.a.a("camerax.core.useCase.defaultSessionConfig", j3.class);
    public static final p1.a<n1> B = p1.a.a("camerax.core.useCase.defaultCaptureConfig", n1.class);
    public static final p1.a<j3.e> C = p1.a.a("camerax.core.useCase.sessionConfigUnpacker", j3.e.class);
    public static final p1.a<n1.b> D = p1.a.a("camerax.core.useCase.captureConfigUnpacker", n1.b.class);
    public static final p1.a<Integer> E;
    public static final p1.a<Integer> F;
    public static final p1.a<Range<Integer>> G;
    public static final p1.a<Boolean> H;
    public static final p1.a<Map<Size, Integer>> I;
    public static final p1.a<Boolean> J;
    public static final p1.a<Boolean> K;
    public static final p1.a<x3.b> L;
    public static final p1.a<Integer> M;
    public static final p1.a<Integer> N;
    public static final p1.a<Boolean> O;
    public static final p1.a<u.d1.b> P;
    public static final p1.a<o3> Q;

    class a implements u.d1.b {
        a() {
        }

        @Override // u.d1.b
        public u.d1 a(u.d0 d0Var) {
            return new u.h1(d0Var);
        }
    }

    public interface b<T extends o.j2, C extends w3<T>, B> extends o.j0<T> {
        C d();
    }

    static {
        Class cls = Integer.TYPE;
        E = p1.a.a("camerax.core.useCase.surfaceOccupancyPriority", cls);
        F = p1.a.a("camerax.core.useCase.sessionType", cls);
        G = p1.a.a("camerax.core.useCase.targetFrameRate", Range.class);
        H = p1.a.a("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class);
        I = p1.a.a("camerax.core.useCase.resolutionToMaxFrameRate", Map.class);
        Class cls2 = Boolean.TYPE;
        J = p1.a.a("camerax.core.useCase.zslDisabled", cls2);
        K = p1.a.a("camerax.core.useCase.highResolutionDisabled", cls2);
        L = p1.a.a("camerax.core.useCase.captureType", x3.b.class);
        M = p1.a.a("camerax.core.useCase.previewStabilizationMode", cls);
        N = p1.a.a("camerax.core.useCase.videoStabilizationMode", cls);
        O = p1.a.a("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class);
        P = p1.a.a("camerax.core.useCase.takePictureManagerProvider", u.d1.b.class);
        Q = p1.a.a("camerax.core.useCase.streamUseCase", o3.class);
    }

    default int B(int i15) {
        return ((Integer) f(E, Integer.valueOf(i15))).intValue();
    }

    default int D() {
        return ((Integer) f(M, 0)).intValue();
    }

    default boolean E() {
        Boolean bool = (Boolean) f(H, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    default n1.b H(n1.b bVar) {
        return (n1.b) f(D, bVar);
    }

    default j3 P() {
        return (j3) d(A);
    }

    default j3 Q(j3 j3Var) {
        return (j3) f(A, j3Var);
    }

    default boolean R(boolean z15) {
        return ((Boolean) f(J, Boolean.valueOf(z15))).booleanValue();
    }

    default n1 U(n1 n1Var) {
        return (n1) f(B, n1Var);
    }

    default o3 V() {
        o3 o3Var = (o3) f(Q, o3.DEFAULT);
        Objects.requireNonNull(o3Var);
        return o3Var;
    }

    default x3.b W() {
        return (x3.b) d(L);
    }

    default int X(Size size) {
        Map map = (Map) f(I, null);
        if (map == null || !map.containsKey(size)) {
            return Integer.MAX_VALUE;
        }
        Integer num = (Integer) map.get(size);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    default boolean d0(boolean z15) {
        return ((Boolean) f(K, Boolean.valueOf(z15))).booleanValue();
    }

    default boolean g0() {
        return h(G);
    }

    default j3.e k(j3.e eVar) {
        return (j3.e) f(C, eVar);
    }

    default int q(int i15) {
        return ((Integer) f(F, Integer.valueOf(i15))).intValue();
    }

    default u.d1.b s() {
        u.d1.b bVar = (u.d1.b) f(P, new a());
        Objects.requireNonNull(bVar);
        return bVar;
    }

    default int y() {
        return ((Integer) f(N, 0)).intValue();
    }

    default Range<Integer> z(Range<Integer> range) {
        return (Range) f(G, range);
    }
}
