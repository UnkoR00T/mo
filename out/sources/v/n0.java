package v;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface n0 extends o.i, o.j2.c {

    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f202706a;

        a(boolean z15) {
            this.f202706a = z15;
        }
    }

    @Override // o.i
    default o.j a() {
        return h();
    }

    com.google.common.util.concurrent.q<Void> b();

    @Override // o.i
    default o.q c() {
        return o();
    }

    x2<a> d();

    default void e() {
    }

    default void g(f0 f0Var) {
    }

    j0 h();

    default f0 i() {
        return i0.a();
    }

    default void k(boolean z15) {
    }

    void l(Collection<o.j2> collection);

    void n(Collection<o.j2> collection);

    m0 o();

    default boolean p() {
        return c().n() == 0;
    }

    default boolean r() {
        return false;
    }

    default boolean s() {
        return true;
    }

    default void t(boolean z15) {
    }
}
