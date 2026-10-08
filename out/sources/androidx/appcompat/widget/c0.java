package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f8792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x0 f8793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x0 f8794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x0 f8795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x0 f8796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x0 f8797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x0 f8798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x0 f8799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d0 f8800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8801j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8802k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f8803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f8804m;

    class a extends w5.h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f8807c;

        a(int i15, int i16, WeakReference weakReference) {
            this.f8805a = i15;
            this.f8806b = i16;
            this.f8807c = weakReference;
        }

        @Override // w5.h.e
        public void f(int i15) {
        }

        @Override // w5.h.e
        public void g(Typeface typeface) {
            int i15;
            if (Build.VERSION.SDK_INT >= 28 && (i15 = this.f8805a) != -1) {
                typeface = e.a(typeface, i15, (this.f8806b & 2) != 0);
            }
            c0.this.n(this.f8807c, typeface);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f8809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f8810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8811c;

        b(TextView textView, Typeface typeface, int i15) {
            this.f8809a = textView;
            this.f8810b = typeface;
            this.f8811c = i15;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8809a.setTypeface(this.f8810b, this.f8811c);
        }
    }

    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i15, int i16, int i17, int i18) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i15, i16, i17, i18);
        }

        static void c(TextView textView, int[] iArr, int i15) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i15);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class e {
        static Typeface a(Typeface typeface, int i15, boolean z15) {
            return Typeface.create(typeface, i15, z15);
        }
    }

    c0(TextView textView) {
        this.f8792a = textView;
        this.f8800i = new d0(textView);
    }

    private void B(int i15, float f15) {
        this.f8800i.t(i15, f15);
    }

    private void C(Context context, z0 z0Var) {
        String strO;
        this.f8801j = z0Var.k(p007NuL.v.f520q2, this.f8801j);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 28) {
            int iK = z0Var.k(p007NuL.v.f559z2, -1);
            this.f8802k = iK;
            if (iK != -1) {
                this.f8801j &= 2;
            }
        }
        if (!z0Var.s(p007NuL.v.f555y2) && !z0Var.s(p007NuL.v.A2)) {
            if (z0Var.s(p007NuL.v.f515p2)) {
                this.f8804m = false;
                int iK2 = z0Var.k(p007NuL.v.f515p2, 1);
                if (iK2 == 1) {
                    this.f8803l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f8803l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f8803l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f8803l = null;
        int i16 = z0Var.s(p007NuL.v.A2) ? p007NuL.v.A2 : p007NuL.v.f555y2;
        int i17 = this.f8802k;
        int i18 = this.f8801j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = z0Var.j(i16, this.f8801j, new a(i17, i18, new WeakReference(this.f8792a)));
                if (typefaceJ != null) {
                    if (i15 < 28 || this.f8802k == -1) {
                        this.f8803l = typefaceJ;
                    } else {
                        this.f8803l = e.a(Typeface.create(typefaceJ, 0), this.f8802k, (this.f8801j & 2) != 0);
                    }
                }
                this.f8804m = this.f8803l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f8803l != null || (strO = z0Var.o(i16)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f8802k == -1) {
            this.f8803l = Typeface.create(strO, this.f8801j);
        } else {
            this.f8803l = e.a(Typeface.create(strO, 0), this.f8802k, (this.f8801j & 2) != 0);
        }
    }

    private void a(Drawable drawable, x0 x0Var) {
        if (drawable == null || x0Var == null) {
            return;
        }
        k.i(drawable, x0Var, this.f8792a.getDrawableState());
    }

    private static x0 d(Context context, k kVar, int i15) {
        ColorStateList colorStateListF = kVar.f(context, i15);
        if (colorStateListF == null) {
            return null;
        }
        x0 x0Var = new x0();
        x0Var.f9091d = true;
        x0Var.f9088a = colorStateListF;
        return x0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f8792a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f8792a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f8792a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f8792a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f8792a.getCompoundDrawables();
        TextView textView2 = this.f8792a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        x0 x0Var = this.f8799h;
        this.f8793b = x0Var;
        this.f8794c = x0Var;
        this.f8795d = x0Var;
        this.f8796e = x0Var;
        this.f8797f = x0Var;
        this.f8798g = x0Var;
    }

    void A(int i15, float f15) {
        if (g1.f8873c || l()) {
            return;
        }
        B(i15, f15);
    }

    void b() {
        if (this.f8793b != null || this.f8794c != null || this.f8795d != null || this.f8796e != null) {
            Drawable[] compoundDrawables = this.f8792a.getCompoundDrawables();
            a(compoundDrawables[0], this.f8793b);
            a(compoundDrawables[1], this.f8794c);
            a(compoundDrawables[2], this.f8795d);
            a(compoundDrawables[3], this.f8796e);
        }
        if (this.f8797f == null && this.f8798g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f8792a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f8797f);
        a(compoundDrawablesRelative[2], this.f8798g);
    }

    void c() {
        this.f8800i.a();
    }

    int e() {
        return this.f8800i.f();
    }

    int f() {
        return this.f8800i.g();
    }

    int g() {
        return this.f8800i.h();
    }

    int[] h() {
        return this.f8800i.i();
    }

    int i() {
        return this.f8800i.j();
    }

    ColorStateList j() {
        x0 x0Var = this.f8799h;
        if (x0Var != null) {
            return x0Var.f9088a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        x0 x0Var = this.f8799h;
        if (x0Var != null) {
            return x0Var.f9089b;
        }
        return null;
    }

    boolean l() {
        return this.f8800i.n();
    }

    @SuppressLint({"NewApi"})
    void m(AttributeSet attributeSet, int i15) {
        boolean zA;
        boolean z15;
        String strO;
        String strO2;
        int iA;
        float f15;
        Context context = this.f8792a.getContext();
        k kVarB = k.b();
        z0 z0VarV = z0.v(context, attributeSet, p007NuL.v.Y, i15, 0);
        TextView textView = this.f8792a;
        j6.l0.f0(textView, textView.getContext(), p007NuL.v.Y, attributeSet, z0VarV.r(), i15, 0);
        int iN = z0VarV.n(p007NuL.v.Z, -1);
        if (z0VarV.s(p007NuL.v.f448c0)) {
            this.f8793b = d(context, kVarB, z0VarV.n(p007NuL.v.f448c0, 0));
        }
        if (z0VarV.s(p007NuL.v.f438a0)) {
            this.f8794c = d(context, kVarB, z0VarV.n(p007NuL.v.f438a0, 0));
        }
        if (z0VarV.s(p007NuL.v.f453d0)) {
            this.f8795d = d(context, kVarB, z0VarV.n(p007NuL.v.f453d0, 0));
        }
        if (z0VarV.s(p007NuL.v.f443b0)) {
            this.f8796e = d(context, kVarB, z0VarV.n(p007NuL.v.f443b0, 0));
        }
        if (z0VarV.s(p007NuL.v.f458e0)) {
            this.f8797f = d(context, kVarB, z0VarV.n(p007NuL.v.f458e0, 0));
        }
        if (z0VarV.s(p007NuL.v.f463f0)) {
            this.f8798g = d(context, kVarB, z0VarV.n(p007NuL.v.f463f0, 0));
        }
        z0VarV.x();
        boolean z16 = this.f8792a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z17 = true;
        if (iN != -1) {
            z0 z0VarT = z0.t(context, iN, p007NuL.v.f505n2);
            if (z16 || !z0VarT.s(p007NuL.v.C2)) {
                zA = false;
                z15 = false;
            } else {
                zA = z0VarT.a(p007NuL.v.C2, false);
                z15 = true;
            }
            C(context, z0VarT);
            strO = z0VarT.s(p007NuL.v.D2) ? z0VarT.o(p007NuL.v.D2) : null;
            strO2 = z0VarT.s(p007NuL.v.B2) ? z0VarT.o(p007NuL.v.B2) : null;
            z0VarT.x();
        } else {
            zA = false;
            z15 = false;
            strO = null;
            strO2 = null;
        }
        z0 z0VarV2 = z0.v(context, attributeSet, p007NuL.v.f505n2, i15, 0);
        if (z16 || !z0VarV2.s(p007NuL.v.C2)) {
            z17 = z15;
        } else {
            zA = z0VarV2.a(p007NuL.v.C2, false);
        }
        int i16 = Build.VERSION.SDK_INT;
        if (z0VarV2.s(p007NuL.v.D2)) {
            strO = z0VarV2.o(p007NuL.v.D2);
        }
        if (z0VarV2.s(p007NuL.v.B2)) {
            strO2 = z0VarV2.o(p007NuL.v.B2);
        }
        if (i16 >= 28 && z0VarV2.s(p007NuL.v.f510o2) && z0VarV2.f(p007NuL.v.f510o2, -1) == 0) {
            this.f8792a.setTextSize(0, 0.0f);
        }
        C(context, z0VarV2);
        z0VarV2.x();
        if (!z16 && z17) {
            s(zA);
        }
        Typeface typeface = this.f8803l;
        if (typeface != null) {
            if (this.f8802k == -1) {
                this.f8792a.setTypeface(typeface, this.f8801j);
            } else {
                this.f8792a.setTypeface(typeface);
            }
        }
        if (strO2 != null) {
            d.d(this.f8792a, strO2);
        }
        if (strO != null) {
            c.b(this.f8792a, c.a(strO));
        }
        this.f8800i.o(attributeSet, i15);
        if (g1.f8873c && this.f8800i.j() != 0) {
            int[] iArrI = this.f8800i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f8792a) != -1.0f) {
                    d.b(this.f8792a, this.f8800i.g(), this.f8800i.f(), this.f8800i.h(), 0);
                } else {
                    d.c(this.f8792a, iArrI, 0);
                }
            }
        }
        z0 z0VarU = z0.u(context, attributeSet, p007NuL.v.f468g0);
        int iN2 = z0VarU.n(p007NuL.v.f508o0, -1);
        Drawable drawableC = iN2 != -1 ? kVarB.c(context, iN2) : null;
        int iN3 = z0VarU.n(p007NuL.v.f533t0, -1);
        Drawable drawableC2 = iN3 != -1 ? kVarB.c(context, iN3) : null;
        int iN4 = z0VarU.n(p007NuL.v.f513p0, -1);
        Drawable drawableC3 = iN4 != -1 ? kVarB.c(context, iN4) : null;
        int iN5 = z0VarU.n(p007NuL.v.f498m0, -1);
        Drawable drawableC4 = iN5 != -1 ? kVarB.c(context, iN5) : null;
        int iN6 = z0VarU.n(p007NuL.v.f518q0, -1);
        Drawable drawableC5 = iN6 != -1 ? kVarB.c(context, iN6) : null;
        int iN7 = z0VarU.n(p007NuL.v.f503n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? kVarB.c(context, iN7) : null);
        if (z0VarU.s(p007NuL.v.f523r0)) {
            androidx.core.widget.h.f(this.f8792a, z0VarU.c(p007NuL.v.f523r0));
        }
        if (z0VarU.s(p007NuL.v.f528s0)) {
            androidx.core.widget.h.g(this.f8792a, h0.d(z0VarU.k(p007NuL.v.f528s0, -1), null));
        }
        int iF = z0VarU.f(p007NuL.v.f541v0, -1);
        int iF2 = z0VarU.f(p007NuL.v.f545w0, -1);
        if (z0VarU.s(p007NuL.v.f549x0)) {
            TypedValue typedValueW = z0VarU.w(p007NuL.v.f549x0);
            if (typedValueW == null || typedValueW.type != 5) {
                f15 = z0VarU.f(p007NuL.v.f549x0, -1);
                iA = -1;
            } else {
                iA = i6.l.a(typedValueW.data);
                f15 = TypedValue.complexToFloat(typedValueW.data);
            }
        } else {
            iA = -1;
            f15 = -1.0f;
        }
        z0VarU.x();
        if (iF != -1) {
            androidx.core.widget.h.h(this.f8792a, iF);
        }
        if (iF2 != -1) {
            androidx.core.widget.h.i(this.f8792a, iF2);
        }
        if (f15 != -1.0f) {
            if (iA == -1) {
                androidx.core.widget.h.j(this.f8792a, (int) f15);
            } else {
                androidx.core.widget.h.k(this.f8792a, iA, f15);
            }
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f8804m) {
            this.f8803l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f8801j));
                } else {
                    textView.setTypeface(typeface, this.f8801j);
                }
            }
        }
    }

    void o(boolean z15, int i15, int i16, int i17, int i18) {
        if (g1.f8873c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i15) {
        String strO;
        z0 z0VarT = z0.t(context, i15, p007NuL.v.f505n2);
        if (z0VarT.s(p007NuL.v.C2)) {
            s(z0VarT.a(p007NuL.v.C2, false));
        }
        if (z0VarT.s(p007NuL.v.f510o2) && z0VarT.f(p007NuL.v.f510o2, -1) == 0) {
            this.f8792a.setTextSize(0, 0.0f);
        }
        C(context, z0VarT);
        if (z0VarT.s(p007NuL.v.B2) && (strO = z0VarT.o(p007NuL.v.B2)) != null) {
            d.d(this.f8792a, strO);
        }
        z0VarT.x();
        Typeface typeface = this.f8803l;
        if (typeface != null) {
            this.f8792a.setTypeface(typeface, this.f8801j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        m6.a.e(editorInfo, textView.getText());
    }

    void s(boolean z15) {
        this.f8792a.setAllCaps(z15);
    }

    void t(int i15, int i16, int i17, int i18) {
        this.f8800i.p(i15, i16, i17, i18);
    }

    void u(int[] iArr, int i15) {
        this.f8800i.q(iArr, i15);
    }

    void v(int i15) {
        this.f8800i.r(i15);
    }

    void w(ColorStateList colorStateList) {
        if (this.f8799h == null) {
            this.f8799h = new x0();
        }
        x0 x0Var = this.f8799h;
        x0Var.f9088a = colorStateList;
        x0Var.f9091d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f8799h == null) {
            this.f8799h = new x0();
        }
        x0 x0Var = this.f8799h;
        x0Var.f9089b = mode;
        x0Var.f9090c = mode != null;
        z();
    }
}
