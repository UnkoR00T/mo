package v;

/* JADX INFO: loaded from: classes.dex */
public interface e2 extends h3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p1.a<Integer> f202557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p1.a<Integer> f202558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p1.a<o.i0> f202559p;

    static {
        Class cls = Integer.TYPE;
        f202557n = p1.a.a("camerax.core.imageInput.inputFormat", cls);
        f202558o = p1.a.a("camerax.core.imageInput.secondaryInputFormat", cls);
        f202559p = p1.a.a("camerax.core.imageInput.inputDynamicRange", o.i0.class);
    }

    default o.i0 J() {
        return (o.i0) i6.i.g((o.i0) f(f202559p, o.i0.f140010c));
    }

    default boolean N() {
        return h(f202559p);
    }

    default int Y() {
        return ((Integer) f(f202558o, 0)).intValue();
    }

    default int r() {
        return ((Integer) d(f202557n)).intValue();
    }
}
