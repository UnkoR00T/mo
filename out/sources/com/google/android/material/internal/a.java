package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private Typeface D;
    private ij.a E;
    private ij.a F;
    private CharSequence H;
    private CharSequence I;
    private boolean J;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private int Q;
    private int R;
    private int[] S;
    private boolean T;
    private final TextPaint U;
    private final TextPaint V;
    private TimeInterpolator W;
    private TimeInterpolator X;
    private float Y;
    private float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f35342a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f35343a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f35344b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ColorStateList f35345b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35346c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f35347c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f35348d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f35349d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35350e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f35351e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35352f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private ColorStateList f35353f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f35354g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f35355g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f35356h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f35357h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f35358i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f35359i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f35360j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private StaticLayout f35361j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f35363k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f35365l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f35367m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private CharSequence f35369n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f35370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f35372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f35374q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f35378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f35380t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private k f35381t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f35382u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f35384v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f35386w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f35387w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Typeface f35388x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Typeface f35389y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Typeface f35390z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35362k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35364l = 16;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f35366m = 15.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f35368n = 15.0f;
    private TextUtils.TruncateAt G = TextUtils.TruncateAt.END;
    private boolean K = true;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f35371o0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f35373p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f35375q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f35377r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f35379s0 = j.f35404o;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f35383u0 = -1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f35385v0 = -1;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0750a implements ij.a.InterfaceC2189a {
        C0750a() {
        }

        @Override // ij.a.InterfaceC2189a
        public void a(Typeface typeface) {
            a.this.Y(typeface);
        }
    }

    public a(View view) {
        this.f35342a = view;
        TextPaint textPaint = new TextPaint(129);
        this.U = textPaint;
        this.V = new TextPaint(textPaint);
        this.f35356h = new Rect();
        this.f35354g = new Rect();
        this.f35360j = new RectF();
        this.f35350e = e();
        L(view.getContext().getResources().getConfiguration());
    }

    private Layout.Alignment C() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f35362k, this.J ? 1 : 0) & 7;
        if (absoluteGravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (absoluteGravity != 5) {
            return this.J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    private void D(TextPaint textPaint) {
        textPaint.setTextSize(this.f35368n);
        textPaint.setTypeface(this.f35388x);
        textPaint.setLetterSpacing(this.f35355g0);
    }

    private void E(TextPaint textPaint) {
        textPaint.setTextSize(this.f35366m);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.f35357h0);
    }

    private void F(float f15) {
        if (this.f35346c) {
            this.f35360j.set(f15 < this.f35350e ? this.f35354g : this.f35356h);
            return;
        }
        this.f35360j.left = K(this.f35354g.left, this.f35356h.left, f15, this.W);
        this.f35360j.top = K(this.f35376r, this.f35378s, f15, this.W);
        this.f35360j.right = K(this.f35354g.right, this.f35356h.right, f15, this.W);
        this.f35360j.bottom = K(this.f35354g.bottom, this.f35356h.bottom, f15, this.W);
    }

    private static boolean G(float f15, float f16) {
        return Math.abs(f15 - f16) < 1.0E-5f;
    }

    private boolean H() {
        return this.f35342a.getLayoutDirection() == 1;
    }

    private boolean J(CharSequence charSequence, boolean z15) {
        return (z15 ? h6.h.f81218d : h6.h.f81217c).isRtl(charSequence, 0, charSequence.length());
    }

    private static float K(float f15, float f16, float f17, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f17 = timeInterpolator.getInterpolation(f17);
        }
        return si.a.a(f15, f16, f17);
    }

    private float M(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean P(Rect rect, int i15, int i16, int i17, int i18) {
        return rect.left == i15 && rect.top == i16 && rect.right == i17 && rect.bottom == i18;
    }

    private void V(float f15) {
        this.f35365l0 = f15;
        this.f35342a.postInvalidateOnAnimation();
    }

    private boolean Z(Typeface typeface) {
        ij.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f35390z == typeface) {
            return false;
        }
        this.f35390z = typeface;
        Typeface typefaceB = ij.g.b(this.f35342a.getContext().getResources().getConfiguration(), typeface);
        this.f35389y = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f35390z;
        }
        this.f35388x = typefaceB;
        return true;
    }

    private static int a(int i15, int i16, float f15) {
        float f16 = 1.0f - f15;
        return Color.argb(Math.round((Color.alpha(i15) * f16) + (Color.alpha(i16) * f15)), Math.round((Color.red(i15) * f16) + (Color.red(i16) * f15)), Math.round((Color.green(i15) * f16) + (Color.green(i16) * f15)), Math.round((Color.blue(i15) * f16) + (Color.blue(i16) * f15)));
    }

    private void b(boolean z15) {
        float fM;
        i(1.0f, z15);
        if (this.I != null && this.f35361j0 != null) {
            this.f35369n0 = r0() ? TextUtils.ellipsize(this.I, this.U, this.f35361j0.getWidth(), this.G) : this.I;
        }
        CharSequence charSequence = this.f35369n0;
        if (charSequence != null) {
            this.f35363k0 = M(this.U, charSequence);
        } else {
            this.f35363k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f35364l, this.J ? 1 : 0);
        Rect rect = this.f35358i;
        if (rect == null) {
            rect = this.f35356h;
        }
        int i15 = absoluteGravity & 112;
        if (i15 == 48) {
            this.f35378s = rect.top;
        } else if (i15 != 80) {
            this.f35378s = rect.centerY() - ((this.U.descent() - this.U.ascent()) / 2.0f);
        } else {
            this.f35378s = rect.bottom + this.U.ascent();
        }
        int i16 = absoluteGravity & 8388615;
        if (i16 == 1) {
            this.f35382u = rect.centerX() - (this.f35363k0 / 2.0f);
        } else if (i16 != 5) {
            this.f35382u = rect.left;
        } else {
            this.f35382u = rect.right - this.f35363k0;
        }
        if (this.f35363k0 <= this.f35356h.width()) {
            float f15 = this.f35382u;
            float fMax = f15 + Math.max(0.0f, this.f35356h.left - f15);
            this.f35382u = fMax;
            this.f35382u = fMax + Math.min(0.0f, this.f35356h.right - (this.f35363k0 + fMax));
        }
        if (m() <= this.f35356h.height()) {
            float f16 = this.f35378s;
            float fMax2 = f16 + Math.max(0.0f, this.f35356h.top - f16);
            this.f35378s = fMax2;
            this.f35378s = fMax2 + Math.min(0.0f, this.f35356h.bottom - (q() + fMax2));
        }
        i(0.0f, z15);
        StaticLayout staticLayout = this.f35361j0;
        float height = staticLayout != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f35361j0;
        if (staticLayout2 == null || this.f35371o0 <= 1) {
            CharSequence charSequence2 = this.I;
            fM = charSequence2 != null ? M(this.U, charSequence2) : 0.0f;
        } else {
            fM = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f35361j0;
        this.f35374q = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f35362k, this.J ? 1 : 0);
        int i17 = absoluteGravity2 & 112;
        if (i17 == 48) {
            this.f35376r = this.f35354g.top;
        } else if (i17 != 80) {
            this.f35376r = this.f35354g.centerY() - (height / 2.0f);
        } else {
            this.f35376r = (this.f35354g.bottom - height) + (this.f35387w0 ? this.U.descent() : 0.0f);
        }
        int i18 = absoluteGravity2 & 8388615;
        if (i18 == 1) {
            this.f35380t = this.f35354g.centerX() - (fM / 2.0f);
        } else if (i18 != 5) {
            this.f35380t = this.f35354g.left;
        } else {
            this.f35380t = this.f35354g.right - fM;
        }
        k0(this.f35344b);
    }

    private void c() {
        g(this.f35344b);
    }

    private float d(float f15) {
        float f16 = this.f35350e;
        return f15 <= f16 ? si.a.b(1.0f, 0.0f, this.f35348d, f16, f15) : si.a.b(0.0f, 1.0f, f16, 1.0f, f15);
    }

    private float e() {
        float f15 = this.f35348d;
        return f15 + ((1.0f - f15) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean zH = H();
        return this.K ? J(charSequence, zH) : zH;
    }

    private void f0(float f15) {
        this.f35367m0 = f15;
        this.f35342a.postInvalidateOnAnimation();
    }

    private void g(float f15) {
        float f16;
        F(f15);
        if (!this.f35346c) {
            this.f35384v = K(this.f35380t, this.f35382u, f15, this.W);
            this.f35386w = K(this.f35376r, this.f35378s, f15, this.W);
            k0(f15);
            f16 = f15;
        } else if (f15 < this.f35350e) {
            this.f35384v = this.f35380t;
            this.f35386w = this.f35376r;
            k0(0.0f);
            f16 = 0.0f;
        } else {
            this.f35384v = this.f35382u;
            this.f35386w = this.f35378s - Math.max(0, this.f35352f);
            k0(1.0f);
            f16 = 1.0f;
        }
        TimeInterpolator timeInterpolator = si.a.f181917b;
        V(1.0f - K(0.0f, 1.0f, 1.0f - f15, timeInterpolator));
        f0(K(1.0f, 0.0f, f15, timeInterpolator));
        if (this.f35372p != this.f35370o) {
            this.U.setColor(a(v(), t(), f16));
        } else {
            this.U.setColor(t());
        }
        float f17 = this.f35355g0;
        float f18 = this.f35357h0;
        if (f17 != f18) {
            this.U.setLetterSpacing(K(f18, f17, f15, timeInterpolator));
        } else {
            this.U.setLetterSpacing(f17);
        }
        this.N = K(this.f35347c0, this.Y, f15, null);
        this.O = K(this.f35349d0, this.Z, f15, null);
        this.P = K(this.f35351e0, this.f35343a0, f15, null);
        int iA = a(u(this.f35353f0), u(this.f35345b0), f15);
        this.Q = iA;
        this.U.setShadowLayer(this.N, this.O, this.P, iA);
        if (this.f35346c) {
            this.U.setAlpha((int) (d(f15) * this.U.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, bj.a.a(this.Q, textPaint.getAlpha()));
            }
        }
        this.f35342a.postInvalidateOnAnimation();
    }

    private void h(float f15) {
        i(f15, false);
    }

    private void i(float f15, boolean z15) {
        Typeface typeface;
        float f16;
        float f17;
        if (this.H == null) {
            return;
        }
        float fWidth = this.f35356h.width();
        float fWidth2 = this.f35354g.width();
        if (G(f15, 1.0f)) {
            f16 = r0() ? this.f35368n : this.f35366m;
            f17 = r0() ? this.f35355g0 : this.f35357h0;
            this.L = r0() ? 1.0f : K(this.f35366m, this.f35368n, f15, this.X) / this.f35366m;
            if (!r0()) {
                fWidth = fWidth2;
            }
            typeface = this.f35388x;
            fWidth2 = fWidth;
        } else {
            float f18 = this.f35366m;
            float f19 = this.f35357h0;
            typeface = this.A;
            if (G(f15, 0.0f)) {
                this.L = 1.0f;
            } else {
                this.L = K(this.f35366m, this.f35368n, f15, this.X) / this.f35366m;
            }
            float f25 = this.f35368n / this.f35366m;
            float f26 = fWidth2 * f25;
            if (!z15 && !this.f35346c && f26 > fWidth && r0()) {
                fWidth2 = Math.min(fWidth / f25, fWidth2);
            }
            f16 = f18;
            f17 = f19;
        }
        int i15 = f15 < 0.5f ? this.f35371o0 : this.f35373p0;
        boolean z16 = false;
        if (fWidth2 > 0.0f) {
            boolean z17 = this.M != f16;
            boolean z18 = this.f35359i0 != f17;
            boolean z19 = this.D != typeface;
            StaticLayout staticLayout = this.f35361j0;
            boolean z25 = z17 || z18 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z19 || (this.R != i15) || this.T;
            this.M = f16;
            this.f35359i0 = f17;
            this.D = typeface;
            this.T = false;
            this.R = i15;
            this.U.setLinearText(this.L != 1.0f);
            z16 = z25;
        }
        if (this.I == null || z16) {
            this.U.setTextSize(this.M);
            this.U.setTypeface(this.D);
            this.U.setLetterSpacing(this.f35359i0);
            this.J = f(this.H);
            StaticLayout staticLayoutJ = j(q0() ? i15 : 1, this.U, this.H, fWidth2 * (r0() ? 1.0f : this.L), this.J);
            this.f35361j0 = staticLayoutJ;
            this.I = staticLayoutJ.getText();
        }
    }

    private boolean i0(Typeface typeface) {
        ij.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.C == typeface) {
            return false;
        }
        this.C = typeface;
        Typeface typefaceB = ij.g.b(this.f35342a.getContext().getResources().getConfiguration(), typeface);
        this.B = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.C;
        }
        this.A = typefaceB;
        return true;
    }

    private StaticLayout j(int i15, TextPaint textPaint, CharSequence charSequence, float f15, boolean z15) {
        return (StaticLayout) i6.i.g(j.b(charSequence, textPaint, (int) f15).d(this.G).g(z15).c(i15 == 1 ? Layout.Alignment.ALIGN_NORMAL : C()).f(false).i(i15).h(this.f35375q0, this.f35377r0).e(this.f35379s0).j(this.f35381t0).a());
    }

    private void k0(float f15) {
        h(f15);
        this.f35342a.postInvalidateOnAnimation();
    }

    private void l(Canvas canvas, float f15, float f16) {
        int alpha = this.U.getAlpha();
        canvas.translate(f15, f16);
        if (!this.f35346c) {
            this.U.setAlpha((int) (this.f35367m0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, bj.a.a(this.Q, textPaint.getAlpha()));
            }
            this.f35361j0.draw(canvas);
        }
        if (!this.f35346c) {
            this.U.setAlpha((int) (this.f35365l0 * alpha));
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 31) {
            TextPaint textPaint2 = this.U;
            textPaint2.setShadowLayer(this.N, this.O, this.P, bj.a.a(this.Q, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f35361j0.getLineBaseline(0);
        CharSequence charSequence = this.f35369n0;
        float f17 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f17, this.U);
        if (i15 >= 31) {
            this.U.setShadowLayer(this.N, this.O, this.P, this.Q);
        }
        if (this.f35346c) {
            return;
        }
        String strTrim = this.f35369n0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.U.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f35361j0.getLineEnd(0), str.length()), 0.0f, f17, (Paint) this.U);
    }

    private boolean q0() {
        if (this.f35371o0 > 1 || this.f35373p0 > 1) {
            return !this.J || this.f35346c;
        }
        return false;
    }

    private float r(int i15, int i16) {
        if (i16 == 17 || (i16 & 7) == 1) {
            return (i15 / 2.0f) - (this.f35363k0 / 2.0f);
        }
        if ((i16 & 8388613) == 8388613 || (i16 & 5) == 5) {
            return this.J ? this.f35356h.left : this.f35356h.right - this.f35363k0;
        }
        return this.J ? this.f35356h.right - this.f35363k0 : this.f35356h.left;
    }

    private boolean r0() {
        return this.f35373p0 == 1;
    }

    private float s(RectF rectF, int i15, int i16) {
        if (i16 == 17 || (i16 & 7) == 1) {
            return (i15 / 2.0f) + (this.f35363k0 / 2.0f);
        }
        if ((i16 & 8388613) == 8388613 || (i16 & 5) == 5) {
            return this.J ? rectF.left + this.f35363k0 : this.f35356h.right;
        }
        return this.J ? this.f35356h.right : rectF.left + this.f35363k0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f35370o);
    }

    public float A() {
        E(this.V);
        return -this.V.ascent();
    }

    public float B() {
        return this.f35344b;
    }

    public final boolean I() {
        ColorStateList colorStateList = this.f35372p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f35370o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void L(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f35390z;
            if (typeface != null) {
                this.f35389y = ij.g.b(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = ij.g.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f35389y;
            if (typeface3 == null) {
                typeface3 = this.f35390z;
            }
            this.f35388x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            O(true);
        }
    }

    public void N() {
        O(false);
    }

    public void O(boolean z15) {
        if ((this.f35342a.getHeight() <= 0 || this.f35342a.getWidth() <= 0) && !z15) {
            return;
        }
        b(z15);
        c();
    }

    public void Q(ColorStateList colorStateList) {
        if (this.f35372p == colorStateList && this.f35370o == colorStateList) {
            return;
        }
        this.f35372p = colorStateList;
        this.f35370o = colorStateList;
        N();
    }

    public void R(int i15, int i16, int i17, int i18) {
        if (P(this.f35356h, i15, i16, i17, i18)) {
            return;
        }
        this.f35356h.set(i15, i16, i17, i18);
        this.T = true;
    }

    public void S(Rect rect) {
        R(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void T(int i15) {
        if (i15 != this.f35373p0) {
            this.f35373p0 = i15;
            N();
        }
    }

    public void U(int i15) {
        ij.d dVar = new ij.d(this.f35342a.getContext(), i15);
        if (dVar.j() != null) {
            this.f35372p = dVar.j();
        }
        if (dVar.k() != 0.0f) {
            this.f35368n = dVar.k();
        }
        ColorStateList colorStateList = dVar.f93009c;
        if (colorStateList != null) {
            this.f35345b0 = colorStateList;
        }
        this.Z = dVar.f93015i;
        this.f35343a0 = dVar.f93016j;
        this.Y = dVar.f93017k;
        this.f35355g0 = dVar.f93019m;
        ij.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        this.F = new ij.a(new C0750a(), dVar.e());
        dVar.h(this.f35342a.getContext(), this.F);
        N();
    }

    public void W(ColorStateList colorStateList) {
        if (this.f35372p != colorStateList) {
            this.f35372p = colorStateList;
            N();
        }
    }

    public void X(int i15) {
        if (this.f35364l != i15) {
            this.f35364l = i15;
            N();
        }
    }

    public void Y(Typeface typeface) {
        if (Z(typeface)) {
            N();
        }
    }

    public void a0(int i15, int i16, int i17, int i18) {
        b0(i15, i16, i17, i18, true);
    }

    public void b0(int i15, int i16, int i17, int i18, boolean z15) {
        if (P(this.f35354g, i15, i16, i17, i18) && z15 == this.f35387w0) {
            return;
        }
        this.f35354g.set(i15, i16, i17, i18);
        this.T = true;
        this.f35387w0 = z15;
    }

    public void c0(Rect rect) {
        a0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void d0(float f15) {
        if (this.f35357h0 != f15) {
            this.f35357h0 = f15;
            N();
        }
    }

    public void e0(int i15) {
        if (i15 != this.f35371o0) {
            this.f35371o0 = i15;
            N();
        }
    }

    public void g0(int i15) {
        if (this.f35362k != i15) {
            this.f35362k = i15;
            N();
        }
    }

    public void h0(float f15) {
        if (this.f35366m != f15) {
            this.f35366m = f15;
            N();
        }
    }

    public void j0(float f15) {
        float fA = c6.a.a(f15, 0.0f, 1.0f);
        if (fA != this.f35344b) {
            this.f35344b = fA;
            c();
        }
    }

    public void k(Canvas canvas) {
        int iSave = canvas.save();
        if (this.I == null || this.f35360j.width() <= 0.0f || this.f35360j.height() <= 0.0f) {
            return;
        }
        this.U.setTextSize(this.M);
        float f15 = this.f35384v;
        float f16 = this.f35386w;
        float f17 = this.L;
        if (f17 != 1.0f && !this.f35346c) {
            canvas.scale(f17, f17, f15, f16);
        }
        if (q0() && r0() && (!this.f35346c || this.f35344b > this.f35350e)) {
            l(canvas, this.f35384v - this.f35361j0.getLineStart(0), f16);
        } else {
            canvas.translate(f15, f16);
            this.f35361j0.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public void l0(TimeInterpolator timeInterpolator) {
        this.W = timeInterpolator;
        N();
    }

    public float m() {
        D(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public final boolean m0(int[] iArr) {
        this.S = iArr;
        if (!I()) {
            return false;
        }
        N();
        return true;
    }

    public float n() {
        D(this.V);
        return -this.V.ascent();
    }

    public void n0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.H, charSequence)) {
            this.H = charSequence;
            this.I = null;
            N();
        }
    }

    public void o(RectF rectF, int i15, int i16) {
        this.J = f(this.H);
        rectF.left = Math.max(r(i15, i16), this.f35356h.left);
        rectF.top = this.f35356h.top;
        rectF.right = Math.min(s(rectF, i15, i16), this.f35356h.right);
        rectF.bottom = this.f35356h.top + q();
        if (this.f35361j0 == null || r0()) {
            return;
        }
        StaticLayout staticLayout = this.f35361j0;
        float lineWidth = staticLayout.getLineWidth(staticLayout.getLineCount() - 1) * (this.f35368n / this.f35366m);
        if (this.J) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    public void o0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        N();
    }

    public ColorStateList p() {
        return this.f35372p;
    }

    public void p0(Typeface typeface) {
        boolean Z = Z(typeface);
        boolean zI0 = i0(typeface);
        if (Z || zI0) {
            N();
        }
    }

    public float q() {
        int i15 = this.f35383u0;
        return i15 != -1 ? i15 : n();
    }

    public void s0(int i15) {
        D(this.V);
        float f15 = i15;
        this.f35383u0 = j(this.f35373p0, this.V, this.H, f15 * (this.f35368n / this.f35366m), this.J).getHeight();
        E(this.V);
        this.f35385v0 = j(this.f35371o0, this.V, this.H, f15, this.J).getHeight();
    }

    public int t() {
        return u(this.f35372p);
    }

    public int w() {
        return this.f35374q;
    }

    public int x() {
        return this.f35371o0;
    }

    public float y() {
        E(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public float z() {
        int i15 = this.f35385v0;
        return i15 != -1 ? i15 : A();
    }
}
