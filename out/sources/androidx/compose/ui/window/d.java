package androidx.compose.ui.window;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/window/d;", "", "<init>", "()V", "Landroid/view/Window;", "window", "", "displayHeight", "b", "(Landroid/view/Window;I)I", "a", "(Landroid/view/Window;)I", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f11087a = new d();

    private d() {
    }

    private final int b(Window window, int displayHeight) {
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i15 = rect.top;
        int i16 = rect.bottom;
        return i15 + (i16 > displayHeight ? i16 - displayHeight : 0);
    }

    public final int a(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i15 = displayMetrics.heightPixels;
        return i15 - b(window, i15);
    }
}
