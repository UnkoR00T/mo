package io.sentry.android.replay.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import io.sentry.q7;
import java.util.ArrayList;
import java.util.List;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000e\u001a\u00020\t*\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0015*\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0012*\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001c\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001e\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001d\u0010 \u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010!\u001a\u0013\u0010#\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b#\u0010$\"\u0018\u0010(\u001a\u00020\u0012*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroid/view/View;", "Lio/sentry/android/replay/viewhierarchy/b;", "parentNode", "Lio/sentry/q7;", "options", "Loq/i0;", "k", "(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/b;Lio/sentry/q7;)V", "Loq/r;", "", "Landroid/graphics/Rect;", "g", "(Landroid/view/View;)Loq/r;", "Landroid/graphics/drawable/Drawable;", "f", "(Landroid/graphics/drawable/Drawable;)Z", "Lio/sentry/android/replay/util/n;", "globalRect", "", "paddingLeft", "paddingTop", "", "d", "(Lio/sentry/android/replay/util/n;Landroid/graphics/Rect;II)Ljava/util/List;", "j", "(I)I", "Landroid/view/ViewTreeObserver$OnDrawListener;", "listener", "a", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnDrawListener;)V", "h", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "b", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "i", "e", "(Landroid/view/View;)Z", "Landroid/widget/TextView;", "c", "(Landroid/widget/TextView;)I", "totalPaddingTopSafe", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class o {
    public static final void a(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(onDrawListener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void b(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int c(TextView textView) {
        try {
            return textView.getTotalPaddingTop();
        } catch (NullPointerException unused) {
            return textView.getExtendedPaddingTop();
        }
    }

    public static final List<Rect> d(n nVar, Rect rect, int i15, int i16) {
        if (nVar == null) {
            return v.e(rect);
        }
        ArrayList arrayList = new ArrayList();
        int iC = nVar.c();
        for (int i17 = 0; i17 < iC; i17++) {
            int iF = (int) nVar.f(i17, nVar.b(i17));
            int i18 = nVar.i(i17);
            int iH = nVar.h(i17);
            int iF2 = (int) nVar.f(i17, (iH - i18) + (i18 > 0 ? 1 : 0));
            if (iF2 == 0 && iH > 0) {
                iF2 = ((int) nVar.f(i17, iH - 1)) + 1;
            }
            int iA = nVar.a(i17);
            int iE = nVar.e(i17);
            Rect rect2 = new Rect();
            int i19 = rect.left + i15 + iF;
            rect2.left = i19;
            rect2.right = i19 + (iF2 - iF);
            int i25 = rect.top + i16 + iA;
            rect2.top = i25;
            rect2.bottom = i25 + (iE - iA);
            arrayList.add(rect2);
        }
        return arrayList;
    }

    public static final boolean e(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    @TargetApi(21)
    public static final boolean f(Drawable drawable) {
        if (drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10;
    }

    public static final r<Boolean, Rect> g(View view) {
        if (view.isAttachedToWindow() && view.getWindowVisibility() == 0) {
            Object parent = view;
            while (parent instanceof View) {
                float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
                View view2 = (View) parent;
                if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                    return y.a(Boolean.FALSE, null);
                }
                parent = view2.getParent();
            }
            Rect rect = new Rect();
            return y.a(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
        }
        return y.a(Boolean.FALSE, null);
    }

    public static final void h(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void i(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int j(int i15) {
        return i15 | (-16777216);
    }

    public static final void k(View view, io.sentry.android.replay.viewhierarchy.b bVar, q7 q7Var) {
        if ((view instanceof ViewGroup) && !io.sentry.android.replay.viewhierarchy.a.f94568a.b(view, bVar, q7Var)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = viewGroup.getChildAt(i15);
                if (childAt != null) {
                    io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.INSTANCE.a(childAt, bVar, viewGroup.indexOfChild(childAt), q7Var);
                    arrayList.add(bVarA);
                    k(childAt, bVarA, q7Var);
                }
            }
            bVar.f(arrayList);
        }
    }
}
