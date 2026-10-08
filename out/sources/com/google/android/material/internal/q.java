package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import j6.f1;
import j6.i1;
import j6.l0;
import j6.y;

/* JADX INFO: loaded from: classes4.dex */
public class q {

    class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f35432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f35433b;

        a(c cVar, d dVar) {
            this.f35432a = cVar;
            this.f35433b = dVar;
        }

        @Override // j6.y
        public f1 b(View view, f1 f1Var) {
            return this.f35432a.a(view, f1Var, new d(this.f35433b));
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        f1 a(View view, f1 f1Var, d dVar);
    }

    public static void b(View view, c cVar) {
        l0.q0(view, new a(cVar, new d(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        i(view);
    }

    public static float c(Context context, int i15) {
        return TypedValue.applyDimension(1, i15, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList colorStateListF = com.google.android.material.drawable.c.f(view.getBackground());
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) u5.a.k(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    public static boolean g(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode h(int i15, PorterDuff.Mode mode) {
        if (i15 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i15 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i15 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i15) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void i(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void j(final View view, final boolean z15) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.p
            @Override // java.lang.Runnable
            public final void run() {
                q.k(view, z15);
            }
        });
    }

    public static void k(View view, boolean z15) {
        i1 i1VarG;
        if (!z15 || (i1VarG = l0.G(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            i1VarG.c(f1.p.d());
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f35436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f35437d;

        public d(int i15, int i16, int i17, int i18) {
            this.f35434a = i15;
            this.f35435b = i16;
            this.f35436c = i17;
            this.f35437d = i18;
        }

        public d(d dVar) {
            this.f35434a = dVar.f35434a;
            this.f35435b = dVar.f35435b;
            this.f35436c = dVar.f35436c;
            this.f35437d = dVar.f35437d;
        }
    }
}
