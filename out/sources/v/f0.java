package v;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface f0 extends h3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p1.a<x3> f202567e = p1.a.a("camerax.core.camera.useCaseConfigFactory", x3.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p1.a<b2> f202568f = p1.a.a("camerax.core.camera.compatibilityId", b2.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p1.a<Integer> f202569g = p1.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p1.a<l3> f202570h = p1.a.a("camerax.core.camera.SessionProcessor", l3.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p1.a<Boolean> f202571i = p1.a.a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p1.a<Boolean> f202572j = p1.a.a("camerax.core.camera.isPostviewSupported", Boolean.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p1.a<a> f202573k = p1.a.a("camerax.core.camera.PostviewFormatSelector", a.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p1.a<Boolean> f202574l = p1.a.a("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f202575m = new a() { // from class: v.e0
        @Override // v.f0.a
        public final int a(int i15, List list) {
            return f0.M(i15, list);
        }
    };

    public interface a {
        int a(int i15, List<Integer> list);
    }

    static /* synthetic */ int M(int i15, List list) {
        if (list.contains(35)) {
            return 35;
        }
        if (list.contains(256)) {
            return 256;
        }
        return list.contains(4101) ? 4101 : 0;
    }

    default l3 F(l3 l3Var) {
        return (l3) f(f202570h, l3Var);
    }

    default a G() {
        return (a) f(f202573k, f202575m);
    }

    b2 b0();

    default boolean c0() {
        return ((Boolean) f(f202574l, Boolean.FALSE)).booleanValue();
    }

    default x3 l() {
        return (x3) f(f202567e, x3.f202907a);
    }

    default boolean p() {
        return ((Boolean) f(f202572j, Boolean.FALSE)).booleanValue();
    }

    default int x() {
        return ((Integer) f(f202569g, 0)).intValue();
    }
}
