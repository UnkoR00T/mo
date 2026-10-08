package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/x0;", "Landroidx/compose/ui/platform/w0;", "Ln3/g2;", "tmpMatrix", "<init>", "([FLfr/k;)V", "Landroid/view/View;", "view", "matrix", "Loq/i0;", "d", "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", "other", "b", "([FLandroid/graphics/Matrix;)V", "", "x", "y", "c", "([FFF)V", "a", "[F", "", "[I", "tmpLocation", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class x0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float[] tmpMatrix;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] tmpLocation;

    public /* synthetic */ x0(float[] fArr, fr.k kVar) {
        this(fArr);
    }

    private final void b(float[] fArr, Matrix matrix) {
        n3.m0.b(this.tmpMatrix, matrix);
        f0.k(fArr, this.tmpMatrix);
    }

    private final void c(float[] fArr, float f15, float f16) {
        f0.l(fArr, f15, f16, this.tmpMatrix);
    }

    private final void d(View view, float[] matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, matrix);
            c(matrix, -view.getScrollX(), -view.getScrollY());
            c(matrix, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.tmpLocation;
            view.getLocationInWindow(iArr);
            c(matrix, -view.getScrollX(), -view.getScrollY());
            c(matrix, iArr[0], iArr[1]);
        }
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        b(matrix, matrix2);
    }

    @Override // androidx.compose.ui.platform.w0
    public void a(View view, float[] matrix) {
        n3.g2.i(matrix);
        d(view, matrix);
    }

    private x0(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }
}
