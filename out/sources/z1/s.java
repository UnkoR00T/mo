package z1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lz1/s;", "", "<init>", "()V", "Ln3/b2;", "b", "Ln3/b2;", "c", "()Ln3/b2;", "f", "(Ln3/b2;)V", "imageBitmap", "Ln3/h1;", "Ln3/h1;", "a", "()Ln3/h1;", "d", "(Ln3/h1;)V", "canvas", "Lp3/a;", "Lp3/a;", "()Lp3/a;", "e", "(Lp3/a;)V", "canvasDrawScope", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f232190a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static n3.b2 imageBitmap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static n3.h1 canvas;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static p3.a canvasDrawScope;

    private s() {
    }

    public final n3.h1 a() {
        return canvas;
    }

    public final p3.a b() {
        return canvasDrawScope;
    }

    public final n3.b2 c() {
        return imageBitmap;
    }

    public final void d(n3.h1 h1Var) {
        canvas = h1Var;
    }

    public final void e(p3.a aVar) {
        canvasDrawScope = aVar;
    }

    public final void f(n3.b2 b2Var) {
        imageBitmap = b2Var;
    }
}
