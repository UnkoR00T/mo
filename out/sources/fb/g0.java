package fb;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class g0 extends f0 {
    g0() {
    }

    @Override // fb.c0
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // fb.e0, fb.c0
    public void d(View view, int i15, int i16, int i17, int i18) {
        view.setLeftTopRightBottom(i15, i16, i17, i18);
    }

    @Override // fb.c0
    public void e(View view, float f15) {
        view.setTransitionAlpha(f15);
    }

    @Override // fb.f0, fb.c0
    public void f(View view, int i15) {
        view.setTransitionVisibility(i15);
    }

    @Override // fb.d0, fb.c0
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // fb.d0, fb.c0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
