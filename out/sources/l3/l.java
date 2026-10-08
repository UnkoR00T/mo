package l3;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0002*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0017\u001a\u00020\u0016*\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, d2 = {"", "androidDirection", "Ll3/g;", "d", "(I)Ll3/g;", "c", "(I)Ljava/lang/Integer;", "Ly3/b;", "e", "(Landroid/view/KeyEvent;)Ll3/g;", "androidLayoutDirection", "Lc5/t;", "f", "(I)Lc5/t;", "Landroid/view/View;", "view", "Lm3/g;", "a", "(Landroid/view/View;Landroid/view/View;)Lm3/g;", "direction", "Landroid/graphics/Rect;", "rect", "", "b", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "", "[I", "tempCoordinates", "Landroid/graphics/Rect;", "tempRect", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f115577a = new int[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Rect f115578b = new Rect();

    public static final m3.g a(View view, View view2) {
        int[] iArr = f115577a;
        view.getLocationInWindow(iArr);
        int i15 = iArr[0];
        int i16 = iArr[1];
        view2.getLocationInWindow(iArr);
        float f15 = i15 - iArr[0];
        float f16 = i16 - iArr[1];
        Rect rect = f115578b;
        view.getFocusedRect(rect);
        int i17 = rect.left;
        return new m3.g(i17 + f15, rect.top + f16, f15 + i17 + rect.width(), f16 + rect.top + rect.height());
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i15) {
        g.Companion companion = g.INSTANCE;
        if (g.l(i15, companion.h())) {
            return 33;
        }
        if (g.l(i15, companion.a())) {
            return 130;
        }
        if (g.l(i15, companion.d())) {
            return 17;
        }
        if (g.l(i15, companion.g())) {
            return 66;
        }
        if (g.l(i15, companion.e())) {
            return 2;
        }
        return g.l(i15, companion.f()) ? 1 : null;
    }

    public static final g d(int i15) {
        if (i15 == 1) {
            return g.i(g.INSTANCE.f());
        }
        if (i15 == 2) {
            return g.i(g.INSTANCE.e());
        }
        if (i15 == 17) {
            return g.i(g.INSTANCE.d());
        }
        if (i15 == 33) {
            return g.i(g.INSTANCE.h());
        }
        if (i15 == 66) {
            return g.i(g.INSTANCE.g());
        }
        if (i15 != 130) {
            return null;
        }
        return g.i(g.INSTANCE.a());
    }

    public static final g e(KeyEvent keyEvent) {
        long jA = y3.d.a(keyEvent);
        y3.a.Companion companion = y3.a.INSTANCE;
        if (y3.a.R(jA, companion.u())) {
            return g.i(g.INSTANCE.f());
        }
        if (y3.a.R(jA, companion.t())) {
            return g.i(g.INSTANCE.e());
        }
        if (y3.a.R(jA, companion.J())) {
            return g.i(y3.d.g(keyEvent) ? g.INSTANCE.f() : g.INSTANCE.e());
        }
        if (y3.a.R(jA, companion.l())) {
            return g.i(g.INSTANCE.g());
        }
        if (y3.a.R(jA, companion.k())) {
            return g.i(g.INSTANCE.d());
        }
        if (y3.a.R(jA, companion.m()) || y3.a.R(jA, companion.G())) {
            return g.i(g.INSTANCE.h());
        }
        if (y3.a.R(jA, companion.j()) || y3.a.R(jA, companion.F())) {
            return g.i(g.INSTANCE.a());
        }
        if (y3.a.R(jA, companion.i()) || y3.a.R(jA, companion.n()) || y3.a.R(jA, companion.z())) {
            return g.i(g.INSTANCE.b());
        }
        if (y3.a.R(jA, companion.b()) || y3.a.R(jA, companion.o())) {
            return g.i(g.INSTANCE.c());
        }
        return null;
    }

    public static final c5.t f(int i15) {
        if (i15 == 0) {
            return c5.t.Ltr;
        }
        if (i15 != 1) {
            return null;
        }
        return c5.t.Rtl;
    }
}
