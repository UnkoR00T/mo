package v;

import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface f2 extends h3 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p1.a<Integer> f202577q = p1.a.a("camerax.core.imageOutput.targetAspectRatio", o.a.class);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p1.a<Integer> f202578r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p1.a<Integer> f202579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p1.a<Integer> f202580t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p1.a<Size> f202581u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p1.a<Size> f202582v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p1.a<Size> f202583w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p1.a<List<Pair<Integer, Size[]>>> f202584x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final p1.a<j0.c> f202585y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final p1.a<List<Size>> f202586z;

    public interface a<B> {
        B b(int i15);

        B c(Size size);
    }

    static {
        Class cls = Integer.TYPE;
        f202578r = p1.a.a("camerax.core.imageOutput.targetRotation", cls);
        f202579s = p1.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f202580t = p1.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f202581u = p1.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f202582v = p1.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f202583w = p1.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f202584x = p1.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f202585y = p1.a.a("camerax.core.imageOutput.resolutionSelector", j0.c.class);
        f202586z = p1.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    static void t(f2 f2Var) {
        boolean zA = f2Var.A();
        boolean z15 = f2Var.S(null) != null;
        if (zA && z15) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (f2Var.K(null) != null) {
            if (zA || z15) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default boolean A() {
        return h(f202577q);
    }

    default int C() {
        return ((Integer) d(f202577q)).intValue();
    }

    default int I(int i15) {
        return ((Integer) f(f202578r, Integer.valueOf(i15))).intValue();
    }

    default j0.c K(j0.c cVar) {
        return (j0.c) f(f202585y, cVar);
    }

    default List<Size> L(List<Size> list) {
        List list2 = (List) f(f202586z, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size O(Size size) {
        return (Size) f(f202582v, size);
    }

    default Size S(Size size) {
        return (Size) f(f202581u, size);
    }

    default int h0(int i15) {
        return ((Integer) f(f202580t, Integer.valueOf(i15))).intValue();
    }

    default Size j(Size size) {
        return (Size) f(f202583w, size);
    }

    default List<Pair<Integer, Size[]>> n(List<Pair<Integer, Size[]>> list) {
        return (List) f(f202584x, list);
    }

    default j0.c o() {
        return (j0.c) d(f202585y);
    }

    default int v(int i15) {
        return ((Integer) f(f202579s, Integer.valueOf(i15))).intValue();
    }
}
