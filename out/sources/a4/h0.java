package a4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u0003R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"La4/h0;", "", "<init>", "()V", "La4/o;", "pointerEvent", "La4/q;", "pass", "Lc5/r;", "bounds", "Loq/i0;", "e", "(La4/o;La4/q;J)V", "d", "Le4/b0;", "a", "Le4/b0;", "b", "()Le4/b0;", "f", "(Le4/b0;)V", "layoutCoordinates", "", "()Z", "interceptOutOfBoundsChildEvents", "c", "shareWithSiblings", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private p036e4.b0 layoutCoordinates;

    public boolean a() {
        return false;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p036e4.b0 getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public abstract boolean c();

    public abstract void d();

    public abstract void e(o pointerEvent, q pass, long bounds);

    public final void f(p036e4.b0 b0Var) {
        this.layoutCoordinates = b0Var;
    }
}
