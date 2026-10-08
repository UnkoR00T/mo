package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/window/r;", "Landroidx/compose/ui/window/q;", "<init>", "()V", "Landroid/view/View;", "composeView", "Landroid/graphics/Rect;", "outRect", "Loq/i0;", "d", "(Landroid/view/View;Landroid/graphics/Rect;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class r extends q {
    @Override // androidx.compose.ui.window.s, androidx.compose.ui.window.p
    public void d(View composeView, Rect outRect) {
        outRect.set(((WindowManager) composeView.getContext().getSystemService("window")).getCurrentWindowMetrics().getBounds());
    }
}
