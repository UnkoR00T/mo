package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.internal.l;
import com.google.android.material.internal.n;
import com.google.android.material.internal.q;
import ij.c;
import ij.d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import lj.h;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p082nUL.y;

/* JADX INFO: loaded from: classes4.dex */
public class a extends h implements Drawable.Callback, l.b {

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private static final int[] f35057t1 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private static final ShapeDrawable f35058u1 = new ShapeDrawable(new OvalShape());
    private float A0;
    private CharSequence B0;
    private boolean C0;
    private boolean D0;
    private Drawable E0;
    private ColorStateList F0;
    private si.h G0;
    private si.h H0;
    private float I0;
    private float J0;
    private float K0;
    private float L0;
    private float M0;
    private float N0;
    private float O0;
    private ColorStateList P;
    private float P0;
    private final Context Q0;
    private ColorStateList R;
    private final Paint R0;
    private final Paint S0;
    private float T;
    private final Paint.FontMetrics T0;
    private final RectF U0;
    private final PointF V0;
    private final Path W0;
    private float X;
    private final l X0;
    private ColorStateList Y;
    private int Y0;
    private float Z;
    private int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f35059a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f35060b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f35061c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f35062d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private boolean f35063e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f35064f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f35065g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private ColorStateList f35066h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private ColorFilter f35067h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private PorterDuffColorFilter f35068i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private ColorStateList f35069j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private PorterDuff.Mode f35070k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private int[] f35071l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private boolean f35072m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private ColorStateList f35073n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private WeakReference<InterfaceC0745a> f35074o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private TextUtils.TruncateAt f35075p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private CharSequence f35076q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private boolean f35077q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f35078r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private int f35079r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private Drawable f35080s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private boolean f35081s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private ColorStateList f35082t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private float f35083u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f35084v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f35085w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private Drawable f35086x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private Drawable f35087y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private ColorStateList f35088z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0745a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i15, int i16) {
        super(context, attributeSet, i15, i16);
        this.X = -1.0f;
        this.R0 = new Paint(1);
        this.T0 = new Paint.FontMetrics();
        this.U0 = new RectF();
        this.V0 = new PointF();
        this.W0 = new Path();
        this.f35065g1 = GF2Field.MASK;
        this.f35070k1 = PorterDuff.Mode.SRC_IN;
        this.f35074o1 = new WeakReference<>(null);
        U(context);
        this.Q0 = context;
        l lVar = new l(this);
        this.X0 = lVar;
        this.f35076q0 = "";
        lVar.g().density = context.getResources().getDisplayMetrics().density;
        this.S0 = null;
        int[] iArr = f35057t1;
        setState(iArr);
        y2(iArr);
        this.f35077q1 = true;
        f35058u1.setTint(-1);
    }

    private void A0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (c3()) {
            float f15 = this.P0 + this.O0;
            if (y5.a.f(this) == 0) {
                float f16 = rect.right - f15;
                rectF.right = f16;
                rectF.left = f16 - this.A0;
            } else {
                float f17 = rect.left + f15;
                rectF.left = f17;
                rectF.right = f17 + this.A0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f18 = this.A0;
            float f19 = fExactCenterY - (f18 / 2.0f);
            rectF.top = f19;
            rectF.bottom = f19 + f18;
        }
    }

    private void B0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (c3()) {
            float f15 = this.P0 + this.O0 + this.A0 + this.N0 + this.M0;
            if (y5.a.f(this) == 0) {
                float f16 = rect.right;
                rectF.right = f16;
                rectF.left = f16 - f15;
            } else {
                int i15 = rect.left;
                rectF.left = i15;
                rectF.right = i15 + f15;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void D0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f35076q0 != null) {
            float fY0 = this.I0 + y0() + this.L0;
            float fC0 = this.P0 + C0() + this.M0;
            if (y5.a.f(this) == 0) {
                rectF.left = rect.left + fY0;
                rectF.right = rect.right - fC0;
            } else {
                rectF.left = rect.left + fC0;
                rectF.right = rect.right - fY0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean D1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float E0() {
        this.X0.g().getFontMetrics(this.T0);
        Paint.FontMetrics fontMetrics = this.T0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean E1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean F1(d dVar) {
        return (dVar == null || dVar.j() == null || !dVar.j().isStateful()) ? false : true;
    }

    private boolean G0() {
        return this.D0 && this.E0 != null && this.C0;
    }

    private void G1(AttributeSet attributeSet, int i15, int i16) {
        TypedArray typedArrayI = n.i(this.Q0, attributeSet, ri.l.f174198n0, i15, i16, new int[0]);
        this.f35081s1 = typedArrayI.hasValue(ri.l.Y0);
        o2(c.a(this.Q0, typedArrayI, ri.l.L0));
        S1(c.a(this.Q0, typedArrayI, ri.l.f174286y0));
        g2(typedArrayI.getDimension(ri.l.G0, 0.0f));
        if (typedArrayI.hasValue(ri.l.f174294z0)) {
            U1(typedArrayI.getDimension(ri.l.f174294z0, 0.0f));
        }
        k2(c.a(this.Q0, typedArrayI, ri.l.J0));
        m2(typedArrayI.getDimension(ri.l.K0, 0.0f));
        L2(c.a(this.Q0, typedArrayI, ri.l.X0));
        Q2(typedArrayI.getText(ri.l.f174238s0));
        d dVarG = c.g(this.Q0, typedArrayI, ri.l.f174206o0);
        dVarG.o(typedArrayI.getDimension(ri.l.f174214p0, dVarG.k()));
        R2(dVarG);
        int i17 = typedArrayI.getInt(ri.l.f174222q0, 0);
        if (i17 == 1) {
            D2(TextUtils.TruncateAt.START);
        } else if (i17 == 2) {
            D2(TextUtils.TruncateAt.MIDDLE);
        } else if (i17 == 3) {
            D2(TextUtils.TruncateAt.END);
        }
        f2(typedArrayI.getBoolean(ri.l.F0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            f2(typedArrayI.getBoolean(ri.l.C0, false));
        }
        Y1(c.d(this.Q0, typedArrayI, ri.l.B0));
        if (typedArrayI.hasValue(ri.l.E0)) {
            c2(c.a(this.Q0, typedArrayI, ri.l.E0));
        }
        a2(typedArrayI.getDimension(ri.l.D0, -1.0f));
        B2(typedArrayI.getBoolean(ri.l.S0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            B2(typedArrayI.getBoolean(ri.l.N0, false));
        }
        p2(c.d(this.Q0, typedArrayI, ri.l.M0));
        z2(c.a(this.Q0, typedArrayI, ri.l.R0));
        u2(typedArrayI.getDimension(ri.l.P0, 0.0f));
        K1(typedArrayI.getBoolean(ri.l.f174246t0, false));
        R1(typedArrayI.getBoolean(ri.l.f174278x0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            R1(typedArrayI.getBoolean(ri.l.f174262v0, false));
        }
        M1(c.d(this.Q0, typedArrayI, ri.l.f174254u0));
        if (typedArrayI.hasValue(ri.l.f174270w0)) {
            O1(c.a(this.Q0, typedArrayI, ri.l.f174270w0));
        }
        O2(si.h.b(this.Q0, typedArrayI, ri.l.Z0));
        E2(si.h.b(this.Q0, typedArrayI, ri.l.U0));
        i2(typedArrayI.getDimension(ri.l.I0, 0.0f));
        I2(typedArrayI.getDimension(ri.l.W0, 0.0f));
        G2(typedArrayI.getDimension(ri.l.V0, 0.0f));
        W2(typedArrayI.getDimension(ri.l.f174103b1, 0.0f));
        T2(typedArrayI.getDimension(ri.l.f174095a1, 0.0f));
        w2(typedArrayI.getDimension(ri.l.Q0, 0.0f));
        r2(typedArrayI.getDimension(ri.l.O0, 0.0f));
        W1(typedArrayI.getDimension(ri.l.A0, 0.0f));
        K2(typedArrayI.getDimensionPixelSize(ri.l.f174230r0, Integer.MAX_VALUE));
        typedArrayI.recycle();
    }

    public static a H0(Context context, AttributeSet attributeSet, int i15, int i16) {
        a aVar = new a(context, attributeSet, i15, i16);
        aVar.G1(attributeSet, i15, i16);
        return aVar;
    }

    private void I0(Canvas canvas, Rect rect) {
        if (a3()) {
            x0(rect, this.U0);
            RectF rectF = this.U0;
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas.translate(f15, f16);
            this.E0.setBounds(0, 0, (int) this.U0.width(), (int) this.U0.height());
            this.E0.draw(canvas);
            canvas.translate(-f15, -f16);
        }
    }

    private boolean I1(int[] iArr, int[] iArr2) {
        boolean z15;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.P;
        int iQ = q(colorStateList != null ? colorStateList.getColorForState(iArr, this.Y0) : 0);
        boolean state = true;
        if (this.Y0 != iQ) {
            this.Y0 = iQ;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.R;
        int iQ2 = q(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.Z0) : 0);
        if (this.Z0 != iQ2) {
            this.Z0 = iQ2;
            zOnStateChange = true;
        }
        int i15 = bj.a.i(iQ, iQ2);
        if ((this.f35059a1 != i15) | (B() == null)) {
            this.f35059a1 = i15;
            g0(ColorStateList.valueOf(i15));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.Y;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f35060b1) : 0;
        if (this.f35060b1 != colorForState) {
            this.f35060b1 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f35073n1 == null || !jj.a.e(iArr)) ? 0 : this.f35073n1.getColorForState(iArr, this.f35061c1);
        if (this.f35061c1 != colorForState2) {
            this.f35061c1 = colorForState2;
            if (this.f35072m1) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.X0.e() == null || this.X0.e().j() == null) ? 0 : this.X0.e().j().getColorForState(iArr, this.f35062d1);
        if (this.f35062d1 != colorForState3) {
            this.f35062d1 = colorForState3;
            zOnStateChange = true;
        }
        boolean z16 = z1(getState(), R.attr.state_checked) && this.C0;
        if (this.f35063e1 == z16 || this.E0 == null) {
            z15 = false;
        } else {
            float fY0 = y0();
            this.f35063e1 = z16;
            if (fY0 != y0()) {
                zOnStateChange = true;
                z15 = true;
            } else {
                z15 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f35069j1;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f35064f1) : 0;
        if (this.f35064f1 != colorForState4) {
            this.f35064f1 = colorForState4;
            this.f35068i1 = com.google.android.material.drawable.c.l(this, this.f35069j1, this.f35070k1);
        } else {
            state = zOnStateChange;
        }
        if (E1(this.f35080s0)) {
            state |= this.f35080s0.setState(iArr);
        }
        if (E1(this.E0)) {
            state |= this.E0.setState(iArr);
        }
        if (E1(this.f35086x0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f35086x0.setState(iArr3);
        }
        if (E1(this.f35087y0)) {
            state |= this.f35087y0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z15) {
            H1();
        }
        return state;
    }

    private void J0(Canvas canvas, Rect rect) {
        if (this.f35081s1) {
            return;
        }
        this.R0.setColor(this.Z0);
        this.R0.setStyle(Paint.Style.FILL);
        this.R0.setColorFilter(x1());
        this.U0.set(rect);
        canvas.drawRoundRect(this.U0, U0(), U0(), this.R0);
    }

    private void K0(Canvas canvas, Rect rect) {
        if (b3()) {
            x0(rect, this.U0);
            RectF rectF = this.U0;
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas.translate(f15, f16);
            this.f35080s0.setBounds(0, 0, (int) this.U0.width(), (int) this.U0.height());
            this.f35080s0.draw(canvas);
            canvas.translate(-f15, -f16);
        }
    }

    private void L0(Canvas canvas, Rect rect) {
        if (this.Z <= 0.0f || this.f35081s1) {
            return;
        }
        this.R0.setColor(this.f35060b1);
        this.R0.setStyle(Paint.Style.STROKE);
        if (!this.f35081s1) {
            this.R0.setColorFilter(x1());
        }
        RectF rectF = this.U0;
        float f15 = rect.left;
        float f16 = this.Z;
        rectF.set(f15 + (f16 / 2.0f), rect.top + (f16 / 2.0f), rect.right - (f16 / 2.0f), rect.bottom - (f16 / 2.0f));
        float f17 = this.X - (this.Z / 2.0f);
        canvas.drawRoundRect(this.U0, f17, f17, this.R0);
    }

    private void M0(Canvas canvas, Rect rect) {
        if (this.f35081s1) {
            return;
        }
        this.R0.setColor(this.Y0);
        this.R0.setStyle(Paint.Style.FILL);
        this.U0.set(rect);
        canvas.drawRoundRect(this.U0, U0(), U0(), this.R0);
    }

    private void N0(Canvas canvas, Rect rect) {
        if (c3()) {
            A0(rect, this.U0);
            RectF rectF = this.U0;
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas.translate(f15, f16);
            this.f35086x0.setBounds(0, 0, (int) this.U0.width(), (int) this.U0.height());
            this.f35087y0.setBounds(this.f35086x0.getBounds());
            this.f35087y0.jumpToCurrentState();
            this.f35087y0.draw(canvas);
            canvas.translate(-f15, -f16);
        }
    }

    private void O0(Canvas canvas, Rect rect) {
        this.R0.setColor(this.f35061c1);
        this.R0.setStyle(Paint.Style.FILL);
        this.U0.set(rect);
        if (!this.f35081s1) {
            canvas.drawRoundRect(this.U0, U0(), U0(), this.R0);
        } else {
            l(new RectF(rect), this.W0);
            super.u(canvas, this.R0, this.W0, x());
        }
    }

    private void P0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.S0;
        if (paint != null) {
            paint.setColor(x5.c.k(-16777216, CertificateBody.profileType));
            canvas.drawRect(rect, this.S0);
            if (b3() || a3()) {
                x0(rect, this.U0);
                canvas.drawRect(this.U0, this.S0);
            }
            if (this.f35076q0 != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.S0);
            } else {
                canvas2 = canvas;
            }
            if (c3()) {
                A0(rect, this.U0);
                canvas2.drawRect(this.U0, this.S0);
            }
            this.S0.setColor(x5.c.k(-65536, CertificateBody.profileType));
            z0(rect, this.U0);
            canvas2.drawRect(this.U0, this.S0);
            this.S0.setColor(x5.c.k(-16711936, CertificateBody.profileType));
            B0(rect, this.U0);
            canvas2.drawRect(this.U0, this.S0);
        }
    }

    private void Q0(Canvas canvas, Rect rect) {
        if (this.f35076q0 != null) {
            Paint.Align alignF0 = F0(rect, this.V0);
            D0(rect, this.U0);
            if (this.X0.e() != null) {
                this.X0.g().drawableState = getState();
                this.X0.n(this.Q0);
            }
            this.X0.g().setTextAlign(alignF0);
            int iSave = 0;
            boolean z15 = Math.round(this.X0.h(t1().toString())) > Math.round(this.U0.width());
            if (z15) {
                iSave = canvas.save();
                canvas.clipRect(this.U0);
            }
            CharSequence charSequenceEllipsize = this.f35076q0;
            if (z15 && this.f35075p1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.X0.g(), this.U0.width(), this.f35075p1);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.V0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.X0.g());
            if (z15) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean a3() {
        return this.D0 && this.E0 != null && this.f35063e1;
    }

    private boolean b3() {
        return this.f35078r0 && this.f35080s0 != null;
    }

    private boolean c3() {
        return this.f35085w0 && this.f35086x0 != null;
    }

    private void d3(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void e3() {
        this.f35073n1 = this.f35072m1 ? jj.a.d(this.f35066h0) : null;
    }

    private void f3() {
        this.f35087y0 = new RippleDrawable(jj.a.d(r1()), this.f35086x0, f35058u1);
    }

    private float l1() {
        Drawable drawable = this.f35063e1 ? this.E0 : this.f35080s0;
        float fCeil = this.f35083u0;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(q.c(this.Q0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float m1() {
        Drawable drawable = this.f35063e1 ? this.E0 : this.f35080s0;
        float f15 = this.f35083u0;
        return (f15 > 0.0f || drawable == null) ? f15 : drawable.getIntrinsicWidth();
    }

    private void o2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            onStateChange(getState());
        }
    }

    private void w0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        y5.a.m(drawable, y5.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f35086x0) {
            if (drawable.isStateful()) {
                drawable.setState(i1());
            }
            drawable.setTintList(this.f35088z0);
            return;
        }
        Drawable drawable2 = this.f35080s0;
        if (drawable == drawable2 && this.f35084v0) {
            drawable2.setTintList(this.f35082t0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void x0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (b3() || a3()) {
            float f15 = this.I0 + this.J0;
            float fM1 = m1();
            if (y5.a.f(this) == 0) {
                float f16 = rect.left + f15;
                rectF.left = f16;
                rectF.right = f16 + fM1;
            } else {
                float f17 = rect.right - f15;
                rectF.right = f17;
                rectF.left = f17 - fM1;
            }
            float fL1 = l1();
            float fExactCenterY = rect.exactCenterY() - (fL1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fL1;
        }
    }

    private ColorFilter x1() {
        ColorFilter colorFilter = this.f35067h1;
        return colorFilter != null ? colorFilter : this.f35068i1;
    }

    private void z0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (c3()) {
            float f15 = this.P0 + this.O0 + this.A0 + this.N0 + this.M0;
            if (y5.a.f(this) == 0) {
                rectF.right = rect.right - f15;
            } else {
                rectF.left = rect.left + f15;
            }
        }
    }

    private static boolean z1(int[] iArr, int i15) {
        if (iArr == null) {
            return false;
        }
        for (int i16 : iArr) {
            if (i16 == i15) {
                return true;
            }
        }
        return false;
    }

    public boolean A1() {
        return this.C0;
    }

    public void A2(int i15) {
        z2(y.a(this.Q0, i15));
    }

    public boolean B1() {
        return E1(this.f35086x0);
    }

    public void B2(boolean z15) {
        if (this.f35085w0 != z15) {
            boolean zC3 = c3();
            this.f35085w0 = z15;
            boolean zC4 = c3();
            if (zC3 != zC4) {
                if (zC4) {
                    w0(this.f35086x0);
                } else {
                    d3(this.f35086x0);
                }
                invalidateSelf();
                H1();
            }
        }
    }

    float C0() {
        if (c3()) {
            return this.N0 + this.A0 + this.O0;
        }
        return 0.0f;
    }

    public boolean C1() {
        return this.f35085w0;
    }

    public void C2(InterfaceC0745a interfaceC0745a) {
        this.f35074o1 = new WeakReference<>(interfaceC0745a);
    }

    public void D2(TextUtils.TruncateAt truncateAt) {
        this.f35075p1 = truncateAt;
    }

    public void E2(si.h hVar) {
        this.H0 = hVar;
    }

    Paint.Align F0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f35076q0 != null) {
            float fY0 = this.I0 + y0() + this.L0;
            if (y5.a.f(this) == 0) {
                pointF.x = rect.left + fY0;
            } else {
                pointF.x = rect.right - fY0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - E0();
        }
        return align;
    }

    public void F2(int i15) {
        E2(si.h.c(this.Q0, i15));
    }

    public void G2(float f15) {
        if (this.K0 != f15) {
            float fY0 = y0();
            this.K0 = f15;
            float fY1 = y0();
            invalidateSelf();
            if (fY0 != fY1) {
                H1();
            }
        }
    }

    protected void H1() {
        InterfaceC0745a interfaceC0745a = this.f35074o1.get();
        if (interfaceC0745a != null) {
            interfaceC0745a.a();
        }
    }

    public void H2(int i15) {
        G2(this.Q0.getResources().getDimension(i15));
    }

    public void I2(float f15) {
        if (this.J0 != f15) {
            float fY0 = y0();
            this.J0 = f15;
            float fY1 = y0();
            invalidateSelf();
            if (fY0 != fY1) {
                H1();
            }
        }
    }

    boolean J1(boolean z15) {
        if (this.f35086x0 != null) {
            return y2(z15 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : f35057t1);
        }
        return false;
    }

    public void J2(int i15) {
        I2(this.Q0.getResources().getDimension(i15));
    }

    public void K1(boolean z15) {
        if (this.C0 != z15) {
            this.C0 = z15;
            float fY0 = y0();
            if (!z15 && this.f35063e1) {
                this.f35063e1 = false;
            }
            float fY1 = y0();
            invalidateSelf();
            if (fY0 != fY1) {
                H1();
            }
        }
    }

    public void K2(int i15) {
        this.f35079r1 = i15;
    }

    public void L1(int i15) {
        K1(this.Q0.getResources().getBoolean(i15));
    }

    public void L2(ColorStateList colorStateList) {
        if (this.f35066h0 != colorStateList) {
            this.f35066h0 = colorStateList;
            e3();
            onStateChange(getState());
        }
    }

    public void M1(Drawable drawable) {
        if (this.E0 != drawable) {
            float fY0 = y0();
            this.E0 = drawable;
            float fY1 = y0();
            d3(this.E0);
            w0(this.E0);
            invalidateSelf();
            if (fY0 != fY1) {
                H1();
            }
        }
    }

    public void M2(int i15) {
        L2(y.a(this.Q0, i15));
    }

    public void N1(int i15) {
        M1(y.b(this.Q0, i15));
    }

    void N2(boolean z15) {
        this.f35077q1 = z15;
    }

    public void O1(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            if (G0()) {
                this.E0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void O2(si.h hVar) {
        this.G0 = hVar;
    }

    public void P1(int i15) {
        O1(y.a(this.Q0, i15));
    }

    public void P2(int i15) {
        O2(si.h.c(this.Q0, i15));
    }

    public void Q1(int i15) {
        R1(this.Q0.getResources().getBoolean(i15));
    }

    public void Q2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f35076q0, charSequence)) {
            return;
        }
        this.f35076q0 = charSequence;
        this.X0.m(true);
        invalidateSelf();
        H1();
    }

    public Drawable R0() {
        return this.E0;
    }

    public void R1(boolean z15) {
        if (this.D0 != z15) {
            boolean zA3 = a3();
            this.D0 = z15;
            boolean zA4 = a3();
            if (zA3 != zA4) {
                if (zA4) {
                    w0(this.E0);
                } else {
                    d3(this.E0);
                }
                invalidateSelf();
                H1();
            }
        }
    }

    public void R2(d dVar) {
        this.X0.k(dVar, this.Q0);
    }

    public ColorStateList S0() {
        return this.F0;
    }

    public void S1(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            onStateChange(getState());
        }
    }

    public void S2(int i15) {
        R2(new d(this.Q0, i15));
    }

    public ColorStateList T0() {
        return this.R;
    }

    public void T1(int i15) {
        S1(y.a(this.Q0, i15));
    }

    public void T2(float f15) {
        if (this.M0 != f15) {
            this.M0 = f15;
            invalidateSelf();
            H1();
        }
    }

    public float U0() {
        return this.f35081s1 ? N() : this.X;
    }

    @Deprecated
    public void U1(float f15) {
        if (this.X != f15) {
            this.X = f15;
            setShapeAppearanceModel(I().x(f15));
        }
    }

    public void U2(int i15) {
        T2(this.Q0.getResources().getDimension(i15));
    }

    public float V0() {
        return this.P0;
    }

    @Deprecated
    public void V1(int i15) {
        U1(this.Q0.getResources().getDimension(i15));
    }

    public void V2(float f15) {
        d dVarU1 = u1();
        if (dVarU1 != null) {
            dVarU1.o(f15);
            this.X0.g().setTextSize(f15);
            a();
        }
    }

    public Drawable W0() {
        Drawable drawable = this.f35080s0;
        if (drawable != null) {
            return y5.a.q(drawable);
        }
        return null;
    }

    public void W1(float f15) {
        if (this.P0 != f15) {
            this.P0 = f15;
            invalidateSelf();
            H1();
        }
    }

    public void W2(float f15) {
        if (this.L0 != f15) {
            this.L0 = f15;
            invalidateSelf();
            H1();
        }
    }

    public float X0() {
        return this.f35083u0;
    }

    public void X1(int i15) {
        W1(this.Q0.getResources().getDimension(i15));
    }

    public void X2(int i15) {
        W2(this.Q0.getResources().getDimension(i15));
    }

    public ColorStateList Y0() {
        return this.f35082t0;
    }

    public void Y1(Drawable drawable) {
        Drawable drawableW0 = W0();
        if (drawableW0 != drawable) {
            float fY0 = y0();
            this.f35080s0 = drawable != null ? y5.a.r(drawable).mutate() : null;
            float fY1 = y0();
            d3(drawableW0);
            if (b3()) {
                w0(this.f35080s0);
            }
            invalidateSelf();
            if (fY0 != fY1) {
                H1();
            }
        }
    }

    public void Y2(boolean z15) {
        if (this.f35072m1 != z15) {
            this.f35072m1 = z15;
            e3();
            onStateChange(getState());
        }
    }

    public float Z0() {
        return this.T;
    }

    public void Z1(int i15) {
        Y1(y.b(this.Q0, i15));
    }

    boolean Z2() {
        return this.f35077q1;
    }

    @Override // com.google.android.material.internal.l.b
    public void a() {
        H1();
        invalidateSelf();
    }

    public float a1() {
        return this.I0;
    }

    public void a2(float f15) {
        if (this.f35083u0 != f15) {
            float fY0 = y0();
            this.f35083u0 = f15;
            float fY1 = y0();
            invalidateSelf();
            if (fY0 != fY1) {
                H1();
            }
        }
    }

    public ColorStateList b1() {
        return this.Y;
    }

    public void b2(int i15) {
        a2(this.Q0.getResources().getDimension(i15));
    }

    public float c1() {
        return this.Z;
    }

    public void c2(ColorStateList colorStateList) {
        this.f35084v0 = true;
        if (this.f35082t0 != colorStateList) {
            this.f35082t0 = colorStateList;
            if (b3()) {
                this.f35080s0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public Drawable d1() {
        Drawable drawable = this.f35086x0;
        if (drawable != null) {
            return y5.a.q(drawable);
        }
        return null;
    }

    public void d2(int i15) {
        c2(y.a(this.Q0, i15));
    }

    @Override // lj.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i15 = this.f35065g1;
        if (i15 < 255) {
            canvas2 = canvas;
            iA = vi.a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i15);
        } else {
            canvas2 = canvas;
            iA = 0;
        }
        M0(canvas2, bounds);
        J0(canvas2, bounds);
        if (this.f35081s1) {
            super.draw(canvas2);
        }
        L0(canvas2, bounds);
        O0(canvas2, bounds);
        K0(canvas2, bounds);
        I0(canvas2, bounds);
        if (this.f35077q1) {
            Q0(canvas2, bounds);
        }
        N0(canvas2, bounds);
        P0(canvas2, bounds);
        if (this.f35065g1 < 255) {
            canvas2.restoreToCount(iA);
        }
    }

    public CharSequence e1() {
        return this.B0;
    }

    public void e2(int i15) {
        f2(this.Q0.getResources().getBoolean(i15));
    }

    public float f1() {
        return this.O0;
    }

    public void f2(boolean z15) {
        if (this.f35078r0 != z15) {
            boolean zB3 = b3();
            this.f35078r0 = z15;
            boolean zB4 = b3();
            if (zB3 != zB4) {
                if (zB4) {
                    w0(this.f35080s0);
                } else {
                    d3(this.f35080s0);
                }
                invalidateSelf();
                H1();
            }
        }
    }

    public float g1() {
        return this.A0;
    }

    public void g2(float f15) {
        if (this.T != f15) {
            this.T = f15;
            invalidateSelf();
            H1();
        }
    }

    @Override // lj.h, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f35065g1;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f35067h1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.T;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.I0 + y0() + this.L0 + this.X0.h(t1().toString()) + this.M0 + C0() + this.P0), this.f35079r1);
    }

    @Override // lj.h, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // lj.h, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f35081s1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.X);
        } else {
            outline.setRoundRect(bounds, this.X);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.N0;
    }

    public void h2(int i15) {
        g2(this.Q0.getResources().getDimension(i15));
    }

    public int[] i1() {
        return this.f35071l1;
    }

    public void i2(float f15) {
        if (this.I0 != f15) {
            this.I0 = f15;
            invalidateSelf();
            H1();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // lj.h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (D1(this.P) || D1(this.R) || D1(this.Y)) {
            return true;
        }
        return (this.f35072m1 && D1(this.f35073n1)) || F1(this.X0.e()) || G0() || E1(this.f35080s0) || E1(this.E0) || D1(this.f35069j1);
    }

    public ColorStateList j1() {
        return this.f35088z0;
    }

    public void j2(int i15) {
        i2(this.Q0.getResources().getDimension(i15));
    }

    public void k1(RectF rectF) {
        B0(getBounds(), rectF);
    }

    public void k2(ColorStateList colorStateList) {
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            if (this.f35081s1) {
                o0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void l2(int i15) {
        k2(y.a(this.Q0, i15));
    }

    public void m2(float f15) {
        if (this.Z != f15) {
            this.Z = f15;
            this.R0.setStrokeWidth(f15);
            if (this.f35081s1) {
                super.p0(f15);
            }
            invalidateSelf();
        }
    }

    public TextUtils.TruncateAt n1() {
        return this.f35075p1;
    }

    public void n2(int i15) {
        m2(this.Q0.getResources().getDimension(i15));
    }

    public si.h o1() {
        return this.H0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i15) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i15);
        if (b3()) {
            zOnLayoutDirectionChanged |= y5.a.m(this.f35080s0, i15);
        }
        if (a3()) {
            zOnLayoutDirectionChanged |= y5.a.m(this.E0, i15);
        }
        if (c3()) {
            zOnLayoutDirectionChanged |= y5.a.m(this.f35086x0, i15);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i15) {
        boolean zOnLevelChange = super.onLevelChange(i15);
        if (b3()) {
            zOnLevelChange |= this.f35080s0.setLevel(i15);
        }
        if (a3()) {
            zOnLevelChange |= this.E0.setLevel(i15);
        }
        if (c3()) {
            zOnLevelChange |= this.f35086x0.setLevel(i15);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // lj.h, android.graphics.drawable.Drawable, com.google.android.material.internal.l.b
    public boolean onStateChange(int[] iArr) {
        if (this.f35081s1) {
            super.onStateChange(iArr);
        }
        return I1(iArr, i1());
    }

    public float p1() {
        return this.K0;
    }

    public void p2(Drawable drawable) {
        Drawable drawableD1 = d1();
        if (drawableD1 != drawable) {
            float fC0 = C0();
            this.f35086x0 = drawable != null ? y5.a.r(drawable).mutate() : null;
            f3();
            float fC1 = C0();
            d3(drawableD1);
            if (c3()) {
                w0(this.f35086x0);
            }
            invalidateSelf();
            if (fC0 != fC1) {
                H1();
            }
        }
    }

    public float q1() {
        return this.J0;
    }

    public void q2(CharSequence charSequence) {
        if (this.B0 != charSequence) {
            this.B0 = h6.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public ColorStateList r1() {
        return this.f35066h0;
    }

    public void r2(float f15) {
        if (this.O0 != f15) {
            this.O0 = f15;
            invalidateSelf();
            if (c3()) {
                H1();
            }
        }
    }

    public si.h s1() {
        return this.G0;
    }

    public void s2(int i15) {
        r2(this.Q0.getResources().getDimension(i15));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j15) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j15);
        }
    }

    @Override // lj.h, android.graphics.drawable.Drawable
    public void setAlpha(int i15) {
        if (this.f35065g1 != i15) {
            this.f35065g1 = i15;
            invalidateSelf();
        }
    }

    @Override // lj.h, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f35067h1 != colorFilter) {
            this.f35067h1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // lj.h, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f35069j1 != colorStateList) {
            this.f35069j1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // lj.h, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f35070k1 != mode) {
            this.f35070k1 = mode;
            this.f35068i1 = com.google.android.material.drawable.c.l(this, this.f35069j1, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z15, boolean z16) {
        boolean visible = super.setVisible(z15, z16);
        if (b3()) {
            visible |= this.f35080s0.setVisible(z15, z16);
        }
        if (a3()) {
            visible |= this.E0.setVisible(z15, z16);
        }
        if (c3()) {
            visible |= this.f35086x0.setVisible(z15, z16);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public CharSequence t1() {
        return this.f35076q0;
    }

    public void t2(int i15) {
        p2(y.b(this.Q0, i15));
    }

    public d u1() {
        return this.X0.e();
    }

    public void u2(float f15) {
        if (this.A0 != f15) {
            this.A0 = f15;
            invalidateSelf();
            if (c3()) {
                H1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float v1() {
        return this.M0;
    }

    public void v2(int i15) {
        u2(this.Q0.getResources().getDimension(i15));
    }

    public float w1() {
        return this.L0;
    }

    public void w2(float f15) {
        if (this.N0 != f15) {
            this.N0 = f15;
            invalidateSelf();
            if (c3()) {
                H1();
            }
        }
    }

    public void x2(int i15) {
        w2(this.Q0.getResources().getDimension(i15));
    }

    float y0() {
        if (b3() || a3()) {
            return this.J0 + m1() + this.K0;
        }
        return 0.0f;
    }

    public boolean y1() {
        return this.f35072m1;
    }

    public boolean y2(int[] iArr) {
        if (Arrays.equals(this.f35071l1, iArr)) {
            return false;
        }
        this.f35071l1 = iArr;
        if (c3()) {
            return I1(getState(), iArr);
        }
        return false;
    }

    public void z2(ColorStateList colorStateList) {
        if (this.f35088z0 != colorStateList) {
            this.f35088z0 = colorStateList;
            if (c3()) {
                this.f35086x0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }
}
