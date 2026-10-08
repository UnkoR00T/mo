package androidx.compose.ui.node;

import n3.a2;
import n3.d3;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/ui/node/e;", "", "<init>", "()V", "other", "Loq/i0;", "a", "(Landroidx/compose/ui/node/e;)V", "Ln3/a2;", "scope", "b", "(Ln3/a2;)V", "", "c", "(Landroidx/compose/ui/node/e;)Z", "", "F", "scaleX", "scaleY", "translationX", "d", "translationY", "e", "rotationX", "f", "rotationY", "g", "rotationZ", "h", "cameraDistance", "Ln3/d3;", "i", "J", "transformOrigin", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float scaleX = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float scaleY = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance = 8.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = d3.INSTANCE.a();

    public final void a(e other) {
        this.scaleX = other.scaleX;
        this.scaleY = other.scaleY;
        this.translationX = other.translationX;
        this.translationY = other.translationY;
        this.rotationX = other.rotationX;
        this.rotationY = other.rotationY;
        this.rotationZ = other.rotationZ;
        this.cameraDistance = other.cameraDistance;
        this.transformOrigin = other.transformOrigin;
    }

    public final void b(a2 scope) {
        this.scaleX = scope.A();
        this.scaleY = scope.P();
        this.translationX = scope.L();
        this.translationY = scope.J();
        this.rotationX = scope.M();
        this.rotationY = scope.l();
        this.rotationZ = scope.p();
        this.cameraDistance = scope.t();
        this.transformOrigin = scope.U0();
    }

    public final boolean c(e other) {
        return this.scaleX == other.scaleX && this.scaleY == other.scaleY && this.translationX == other.translationX && this.translationY == other.translationY && this.rotationX == other.rotationX && this.rotationY == other.rotationY && this.rotationZ == other.rotationZ && this.cameraDistance == other.cameraDistance && d3.e(this.transformOrigin, other.transformOrigin);
    }
}
