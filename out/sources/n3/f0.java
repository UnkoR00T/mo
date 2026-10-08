package n3;

import android.graphics.Canvas;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t\"\u0015\u0010\r\u001a\u00020\u0005*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f*8\b\u0007\u0010\u0016\"\u00020\u00052\u00020\u0005B*\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u001c\b\u0011\u0012\u0018\b\u000bB\u0014\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0006\b\u0015\u0012\u0002\b\f¨\u0006\u0017"}, d2 = {"Ln3/b2;", "image", "Ln3/h1;", "a", "(Ln3/b2;)Ln3/h1;", "Landroid/graphics/Canvas;", "c", "b", "(Landroid/graphics/Canvas;)Ln3/h1;", "Landroid/graphics/Canvas;", "EmptyCanvas", "d", "(Ln3/h1;)Landroid/graphics/Canvas;", "nativeCanvas", "Loq/a;", "message", "Use android.graphics.Canvas directly instead", "replaceWith", "Loq/s;", "expression", "android.graphics.Canvas", "imports", "NativeCanvas", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Canvas f130984a = new Canvas();

    public static final h1 a(b2 b2Var) {
        e0 e0Var = new e0();
        e0Var.b(new Canvas(l0.b(b2Var)));
        return e0Var;
    }

    public static final h1 b(Canvas canvas) {
        e0 e0Var = new e0();
        e0Var.b(canvas);
        return e0Var;
    }

    public static final Canvas d(h1 h1Var) {
        return ((e0) h1Var).a();
    }
}
