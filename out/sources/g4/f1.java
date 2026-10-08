package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lg4/f1;", "Lg4/g;", "La4/o;", "pointerEvent", "La4/q;", "pass", "Lc5/r;", "bounds", "Loq/i0;", "Y", "(La4/o;La4/q;J)V", "Z1", "()V", "", "z0", "()Z", "z2", "I", "C2", "Lg4/n1;", "B1", "()J", "touchBoundsExpansion", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f1 extends g {
    default long B1() {
        return n1.INSTANCE.b();
    }

    default void C2() {
        Z1();
    }

    default void I() {
        Z1();
    }

    void Y(a4.o pointerEvent, a4.q pass, long bounds);

    void Z1();

    default boolean z0() {
        return false;
    }

    default boolean z2() {
        return false;
    }
}
