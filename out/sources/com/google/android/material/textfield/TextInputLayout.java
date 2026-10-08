package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.z0;
import com.google.android.material.internal.CheckableImageButton;
import j6.l0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private static final int f35651d1 = ri.k.f174076j;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static final int[][] f35652e1 = {new int[]{R.attr.state_pressed}, new int[0]};
    private fb.c A;
    private final Rect A0;
    private fb.c B;
    private final RectF B0;
    private ColorStateList C;
    private Typeface C0;
    private ColorStateList D;
    private Drawable D0;
    private ColorStateList E;
    private int E0;
    private ColorStateList F;
    private final LinkedHashSet<g> F0;
    private boolean G;
    private Drawable G0;
    private CharSequence H;
    private int H0;
    private boolean I;
    private Drawable I0;
    private ColorStateList J0;
    private lj.h K;
    private ColorStateList K0;
    private lj.h L;
    private int L0;
    private int M0;
    private int N0;
    private StateListDrawable O;
    private ColorStateList O0;
    private boolean P;
    private int P0;
    private int Q0;
    private lj.h R;
    private int R0;
    private int S0;
    private lj.h T;
    private int T0;
    int U0;
    private boolean V0;
    final com.google.android.material.internal.a W0;
    private boolean X0;
    private boolean Y0;
    private ValueAnimator Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f35653a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private boolean f35654a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f35655b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private boolean f35656b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f35657c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private boolean f35658c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f35659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    EditText f35660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f35661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35663h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private lj.l f35664h0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u f35667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f35668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35669n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f35670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private f f35671q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f35672q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f35673r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final int f35674r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f35675s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f35676s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35677t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f35678t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f35679u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CharSequence f35680v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f35681v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f35682w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f35683w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private TextView f35684x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f35685x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ColorStateList f35686y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f35687y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f35688z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final Rect f35689z0;

    class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f35691b;

        a(EditText editText) {
            this.f35691b = editText;
            this.f35690a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.w0(!textInputLayout.f35656b1);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f35668m) {
                textInputLayout2.l0(editable);
            }
            if (TextInputLayout.this.f35682w) {
                TextInputLayout.this.A0(editable);
            }
            int lineCount = this.f35691b.getLineCount();
            int i15 = this.f35690a;
            if (lineCount != i15) {
                if (lineCount < i15) {
                    int minimumHeight = this.f35691b.getMinimumHeight();
                    int i16 = TextInputLayout.this.U0;
                    if (minimumHeight != i16) {
                        this.f35691b.setMinimumHeight(i16);
                    }
                }
                this.f35690a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i15, int i16, int i17) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i15, int i16, int i17) {
        }
    }

    class b extends j6.a {
        b() {
        }

        @Override // j6.a
        public void g(View view, k6.p pVar) {
            super.g(view, pVar);
            pVar.d1(false);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f35657c.h();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.W0.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends j6.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TextInputLayout f35696d;

        public e(TextInputLayout textInputLayout) {
            this.f35696d = textInputLayout;
        }

        @Override // j6.a
        public void g(View view, k6.p pVar) {
            super.g(view, pVar);
            EditText editText = this.f35696d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f35696d.getHint();
            CharSequence error = this.f35696d.getError();
            CharSequence placeholderText = this.f35696d.getPlaceholderText();
            int counterMaxLength = this.f35696d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f35696d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zQ = this.f35696d.Q();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z15 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f35696d.f35655b.A(pVar);
            if (!zIsEmpty) {
                pVar.V0(text);
            } else if (!TextUtils.isEmpty(string)) {
                pVar.V0(string);
                if (!zQ && placeholderText != null) {
                    pVar.V0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                pVar.V0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                pVar.B0(string);
                pVar.S0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            pVar.G0(counterMaxLength);
            if (z15) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                pVar.x0(error);
            }
            View viewT = this.f35696d.f35667l.t();
            if (viewT != null) {
                pVar.D0(viewT);
            }
            this.f35696d.f35657c.m().o(view, pVar);
        }

        @Override // j6.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f35696d.f35657c.m().p(view, accessibilityEvent);
        }
    }

    public interface f {
        int a(Editable editable);
    }

    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    public interface h {
        void a(TextInputLayout textInputLayout, int i15);
    }

    static class i extends r6.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f35697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f35698d;

        class a implements Parcelable.ClassLoaderCreator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i15) {
                return new i[i15];
            }
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f35697c) + "}";
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            TextUtils.writeToParcel(this.f35697c, parcel, i15);
            parcel.writeInt(this.f35698d ? 1 : 0);
        }

        i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f35697c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f35698d = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ri.b.X);
    }

    private void A(boolean z15) {
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.Z0.cancel();
        }
        if (z15 && this.Y0) {
            m(1.0f);
        } else {
            this.W0.j0(1.0f);
        }
        this.V0 = false;
        if (C()) {
            W();
        }
        z0();
        this.f35655b.l(false);
        this.f35657c.H(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(Editable editable) {
        if (this.f35671q.a(editable) != 0 || this.V0) {
            M();
        } else {
            g0();
        }
    }

    private fb.c B() {
        fb.c cVar = new fb.c();
        cVar.t0(gj.e.f(getContext(), ri.b.A, 87));
        cVar.v0(gj.e.g(getContext(), ri.b.G, si.a.f181916a));
        return cVar;
    }

    private void B0(boolean z15, boolean z16) {
        int defaultColor = this.O0.getDefaultColor();
        int colorForState = this.O0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.O0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z15) {
            this.f35685x0 = colorForState2;
        } else if (z16) {
            this.f35685x0 = colorForState;
        } else {
            this.f35685x0 = defaultColor;
        }
    }

    private boolean C() {
        return this.G && !TextUtils.isEmpty(this.H) && (this.K instanceof com.google.android.material.textfield.h);
    }

    private void D() {
        Iterator<g> it = this.F0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void E(Canvas canvas) {
        lj.h hVar;
        if (this.T == null || (hVar = this.R) == null) {
            return;
        }
        hVar.draw(canvas);
        if (this.f35660e.isFocused()) {
            Rect bounds = this.T.getBounds();
            Rect bounds2 = this.R.getBounds();
            float fB = this.W0.B();
            int iCenterX = bounds2.centerX();
            bounds.left = si.a.c(iCenterX, bounds2.left, fB);
            bounds.right = si.a.c(iCenterX, bounds2.right, fB);
            this.T.draw(canvas);
        }
    }

    private void F(Canvas canvas) {
        if (this.G) {
            this.W0.k(canvas);
        }
    }

    private void G(boolean z15) {
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.Z0.cancel();
        }
        if (z15 && this.Y0) {
            m(0.0f);
        } else {
            this.W0.j0(0.0f);
        }
        if (C() && ((com.google.android.material.textfield.h) this.K).z0()) {
            z();
        }
        this.V0 = true;
        M();
        this.f35655b.l(true);
        this.f35657c.H(true);
    }

    private lj.h H(boolean z15) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(ri.d.f173959k0);
        float f15 = z15 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f35660e;
        float popupElevation = editText instanceof v ? ((v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(ri.d.f173976w);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(ri.d.f173955i0);
        lj.l lVarM = lj.l.a().C(f15).G(f15).u(dimensionPixelOffset).y(dimensionPixelOffset).m();
        EditText editText2 = this.f35660e;
        lj.h hVarR = lj.h.r(getContext(), popupElevation, editText2 instanceof v ? ((v) editText2).getDropDownBackgroundTintList() : null);
        hVarR.setShapeAppearanceModel(lVarM);
        hVarR.j0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return hVarR;
    }

    private static Drawable I(lj.h hVar, int i15, int i16, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{bj.a.j(i16, i15, 0.1f), i15}), hVar, hVar);
    }

    private int J(int i15, boolean z15) {
        int compoundPaddingLeft;
        if (z15 || getPrefixText() == null) {
            compoundPaddingLeft = (!z15 || getSuffixText() == null) ? this.f35660e.getCompoundPaddingLeft() : this.f35657c.y();
        } else {
            compoundPaddingLeft = this.f35655b.c();
        }
        return i15 + compoundPaddingLeft;
    }

    private int K(int i15, boolean z15) {
        int compoundPaddingRight;
        if (z15 || getSuffixText() == null) {
            compoundPaddingRight = (!z15 || getPrefixText() == null) ? this.f35660e.getCompoundPaddingRight() : this.f35655b.c();
        } else {
            compoundPaddingRight = this.f35657c.y();
        }
        return i15 - compoundPaddingRight;
    }

    private static Drawable L(Context context, lj.h hVar, int i15, int[][] iArr) {
        int iC = bj.a.c(context, ri.b.f173912g, "TextInputLayout");
        lj.h hVar2 = new lj.h(hVar.I());
        int iJ = bj.a.j(i15, iC, 0.1f);
        hVar2.g0(new ColorStateList(iArr, new int[]{iJ, 0}));
        hVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        lj.h hVar3 = new lj.h(hVar.I());
        hVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
    }

    private void M() {
        TextView textView = this.f35684x;
        if (textView == null || !this.f35682w) {
            return;
        }
        textView.setText((CharSequence) null);
        fb.s.a(this.f35653a, this.B);
        this.f35684x.setVisibility(4);
    }

    private boolean R() {
        return getHintMaxLines() == 1;
    }

    private boolean S() {
        if (d0()) {
            return true;
        }
        return this.f35673r != null && this.f35670p;
    }

    private boolean U() {
        return this.f35676s0 == 1 && this.f35660e.getMinLines() <= 1;
    }

    private void V() {
        q();
        s0();
        C0();
        h0();
        l();
        if (this.f35676s0 != 0) {
            v0();
        }
        b0();
    }

    private void W() {
        if (C()) {
            RectF rectF = this.B0;
            this.W0.o(rectF, this.f35660e.getWidth(), this.f35660e.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f35679u0);
            rectF.top = 0.0f;
            ((com.google.android.material.textfield.h) this.K).C0(rectF);
        }
    }

    private void X() {
        if (!C() || this.V0) {
            return;
        }
        z();
        W();
    }

    private static void Y(ViewGroup viewGroup, boolean z15) {
        int childCount = viewGroup.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = viewGroup.getChildAt(i15);
            childAt.setEnabled(z15);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z15);
            }
        }
    }

    private void a0() {
        TextView textView = this.f35684x;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void b0() {
        EditText editText = this.f35660e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i15 = this.f35676s0;
                if (i15 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i15 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private boolean e0() {
        return (this.f35657c.G() || ((this.f35657c.A() && N()) || this.f35657c.w() != null)) && this.f35657c.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f35655b.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.f35684x == null || !this.f35682w || TextUtils.isEmpty(this.f35680v)) {
            return;
        }
        this.f35684x.setText(this.f35680v);
        fb.s.a(this.f35653a, this.A);
        this.f35684x.setVisibility(0);
        this.f35684x.bringToFront();
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f35660e;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.K;
        }
        int iD = bj.a.d(this.f35660e, p007NuL.m.f330w);
        int i15 = this.f35676s0;
        if (i15 == 2) {
            return L(getContext(), this.K, iD, f35652e1);
        }
        if (i15 == 1) {
            return I(this.K, this.f35687y0, iD, f35652e1);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.O == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.O = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.O.addState(new int[0], H(false));
        }
        return this.O;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.L == null) {
            this.L = H(true);
        }
        return this.L;
    }

    private void h0() {
        if (this.f35676s0 == 1) {
            if (ij.c.i(getContext())) {
                this.f35678t0 = getResources().getDimensionPixelSize(ri.d.L);
            } else if (ij.c.h(getContext())) {
                this.f35678t0 = getResources().getDimensionPixelSize(ri.d.K);
            }
        }
    }

    private void i0(Rect rect) {
        lj.h hVar = this.R;
        if (hVar != null) {
            int i15 = rect.bottom;
            hVar.setBounds(rect.left, i15 - this.f35681v0, rect.right, i15);
        }
        lj.h hVar2 = this.T;
        if (hVar2 != null) {
            int i16 = rect.bottom;
            hVar2.setBounds(rect.left, i16 - this.f35683w0, rect.right, i16);
        }
    }

    private void j0(int i15) {
        this.W0.s0(i15);
        Rect rect = this.f35689z0;
        com.google.android.material.internal.c.a(this, this.f35660e, rect);
        this.W0.S(s(rect));
        v0();
        l();
        t0(i15);
    }

    private void k() {
        TextView textView = this.f35684x;
        if (textView != null) {
            this.f35653a.addView(textView);
            this.f35684x.setVisibility(0);
        }
    }

    private void k0() {
        if (this.f35673r != null) {
            EditText editText = this.f35660e;
            l0(editText == null ? null : editText.getText());
        }
    }

    private void l() {
        if (this.f35660e == null || this.f35676s0 != 1) {
            return;
        }
        if (!R()) {
            EditText editText = this.f35660e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.W0.q() + this.f35659d), this.f35660e.getPaddingEnd(), getResources().getDimensionPixelSize(ri.d.G));
        } else if (ij.c.i(getContext())) {
            EditText editText2 = this.f35660e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(ri.d.J), this.f35660e.getPaddingEnd(), getResources().getDimensionPixelSize(ri.d.I));
        } else if (ij.c.h(getContext())) {
            EditText editText3 = this.f35660e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(ri.d.H), this.f35660e.getPaddingEnd(), getResources().getDimensionPixelSize(ri.d.G));
        }
    }

    private static void m0(Context context, TextView textView, int i15, int i16, boolean z15) {
        textView.setContentDescription(context.getString(z15 ? ri.j.f174043c : ri.j.f174042b, Integer.valueOf(i15), Integer.valueOf(i16)));
    }

    private void n() {
        lj.h hVar = this.K;
        if (hVar == null) {
            return;
        }
        lj.l lVarI = hVar.I();
        lj.l lVar = this.f35664h0;
        if (lVarI != lVar) {
            this.K.setShapeAppearanceModel(lVar);
        }
        if (x()) {
            this.K.m0(this.f35679u0, this.f35685x0);
        }
        int iR = r();
        this.f35687y0 = iR;
        this.K.g0(ColorStateList.valueOf(iR));
        o();
        s0();
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f35673r;
        if (textView != null) {
            c0(textView, this.f35670p ? this.f35675s : this.f35677t);
            if (!this.f35670p && (colorStateList2 = this.C) != null) {
                this.f35673r.setTextColor(colorStateList2);
            }
            if (!this.f35670p || (colorStateList = this.D) == null) {
                return;
            }
            this.f35673r.setTextColor(colorStateList);
        }
    }

    private void o() {
        if (this.R == null || this.T == null) {
            return;
        }
        if (y()) {
            this.R.g0(this.f35660e.isFocused() ? ColorStateList.valueOf(this.L0) : ColorStateList.valueOf(this.f35685x0));
            this.T.g0(ColorStateList.valueOf(this.f35685x0));
        }
        invalidate();
    }

    private void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.E;
        if (colorStateListG == null) {
            colorStateListG = bj.a.g(getContext(), p007NuL.m.f329v);
        }
        EditText editText = this.f35660e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = y5.a.r(this.f35660e.getTextCursorDrawable()).mutate();
        if (S() && (colorStateList = this.F) != null) {
            colorStateListG = colorStateList;
        }
        drawableMutate.setTintList(colorStateListG);
    }

    private void p(RectF rectF) {
        float f15 = rectF.left;
        int i15 = this.f35674r0;
        rectF.left = f15 - i15;
        rectF.right += i15;
    }

    private void q() {
        int i15 = this.f35676s0;
        if (i15 == 0) {
            this.K = null;
            this.R = null;
            this.T = null;
            return;
        }
        if (i15 == 1) {
            this.K = new lj.h(this.f35664h0);
            this.R = new lj.h();
            this.T = new lj.h();
        } else {
            if (i15 != 2) {
                throw new IllegalArgumentException(this.f35676s0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.G || (this.K instanceof com.google.android.material.textfield.h)) {
                this.K = new lj.h(this.f35664h0);
            } else {
                this.K = com.google.android.material.textfield.h.y0(this.f35664h0);
            }
            this.R = null;
            this.T = null;
        }
    }

    private int r() {
        return this.f35676s0 == 1 ? bj.a.i(bj.a.e(this, ri.b.f173912g, 0), this.f35687y0) : this.f35687y0;
    }

    private void r0() {
        this.f35660e.setBackground(getEditTextBoxBackground());
    }

    private Rect s(Rect rect) {
        if (this.f35660e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.A0;
        boolean zG = com.google.android.material.internal.q.g(this);
        rect2.bottom = rect.bottom;
        int i15 = this.f35676s0;
        if (i15 == 1) {
            rect2.left = J(rect.left, zG);
            rect2.top = rect.top + this.f35678t0;
            rect2.right = K(rect.right, zG);
            return rect2;
        }
        if (i15 != 2) {
            rect2.left = J(rect.left, zG);
            rect2.top = getPaddingTop();
            rect2.right = K(rect.right, zG);
            return rect2;
        }
        rect2.left = rect.left + this.f35660e.getPaddingLeft();
        rect2.top = rect.top - w();
        rect2.right = rect.right - this.f35660e.getPaddingRight();
        return rect2;
    }

    private void setEditText(EditText editText) {
        if (this.f35660e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.f35660e = editText;
        int i15 = this.f35662g;
        if (i15 != -1) {
            setMinEms(i15);
        } else {
            setMinWidth(this.f35665j);
        }
        int i16 = this.f35663h;
        if (i16 != -1) {
            setMaxEms(i16);
        } else {
            setMaxWidth(this.f35666k);
        }
        this.P = false;
        V();
        setTextInputAccessibilityDelegate(new e(this));
        this.W0.p0(this.f35660e.getTypeface());
        this.W0.h0(this.f35660e.getTextSize());
        this.W0.d0(this.f35660e.getLetterSpacing());
        int gravity = this.f35660e.getGravity();
        this.W0.X((gravity & (-113)) | 48);
        this.W0.g0(gravity);
        this.U0 = editText.getMinimumHeight();
        this.f35660e.addTextChangedListener(new a(editText));
        if (this.J0 == null) {
            this.J0 = this.f35660e.getHintTextColors();
        }
        if (this.G) {
            if (TextUtils.isEmpty(this.H)) {
                CharSequence hint = this.f35660e.getHint();
                this.f35661f = hint;
                setHint(hint);
                this.f35660e.setHint((CharSequence) null);
            }
            this.I = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        if (this.f35673r != null) {
            l0(this.f35660e.getText());
        }
        q0();
        this.f35667l.f();
        this.f35655b.bringToFront();
        this.f35657c.bringToFront();
        D();
        this.f35657c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.H)) {
            return;
        }
        this.H = charSequence;
        this.W0.n0(charSequence);
        if (this.V0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z15) {
        if (this.f35682w == z15) {
            return;
        }
        if (z15) {
            k();
        } else {
            a0();
            this.f35684x = null;
        }
        this.f35682w = z15;
    }

    private int t(Rect rect, Rect rect2, float f15) {
        return U() ? (int) (rect2.top + f15) : rect.bottom - this.f35660e.getCompoundPaddingBottom();
    }

    private void t0(int i15) {
        if (this.f35660e == null) {
            return;
        }
        float fZ = this.W0.z();
        float height = 0.0f;
        if (this.f35680v != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.f35684x.getPaint());
            textPaint.setTextSize(this.f35684x.getTextSize());
            textPaint.setTypeface(this.f35684x.getTypeface());
            textPaint.setLetterSpacing(this.f35684x.getLetterSpacing());
            StaticLayout staticLayoutA = com.google.android.material.internal.j.b(this.f35680v, textPaint, i15).g(getLayoutDirection() == 1).f(true).h(this.f35684x.getLineSpacingExtra(), this.f35684x.getLineSpacingMultiplier()).j(new com.google.android.material.internal.k() { // from class: com.google.android.material.textfield.c0
                @Override // com.google.android.material.internal.k
                public final void a(StaticLayout.Builder builder) {
                    builder.setBreakStrategy(this.f35703a.f35684x.getBreakStrategy());
                }
            }).a();
            if (this.f35676s0 == 1) {
                height = this.f35659d + this.W0.q() + this.f35678t0;
            }
            height += staticLayoutA.getHeight();
        }
        float fMax = Math.max(fZ, height);
        if (this.f35660e.getMeasuredHeight() < fMax) {
            this.f35660e.setMinimumHeight(Math.round(fMax));
        }
    }

    private int u(Rect rect, float f15) {
        if (U()) {
            return (int) (rect.centerY() - (f15 / 2.0f));
        }
        return (rect.top + this.f35660e.getCompoundPaddingTop()) - ((this.f35676s0 != 0 || R()) ? 0 : (int) (this.W0.A() / 2.0f));
    }

    private boolean u0() {
        int iMax;
        if (this.f35660e == null || this.f35660e.getMeasuredHeight() >= (iMax = Math.max(this.f35657c.getMeasuredHeight(), this.f35655b.getMeasuredHeight()))) {
            return false;
        }
        this.f35660e.setMinimumHeight(iMax);
        return true;
    }

    private Rect v(Rect rect) {
        if (this.f35660e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.A0;
        float fA = R() ? this.W0.A() : this.W0.y() * this.W0.w();
        rect2.left = rect.left + this.f35660e.getCompoundPaddingLeft();
        rect2.top = u(rect, fA);
        rect2.right = rect.right - this.f35660e.getCompoundPaddingRight();
        rect2.bottom = t(rect, rect2, fA);
        return rect2;
    }

    private void v0() {
        if (this.f35676s0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35653a.getLayoutParams();
            int iW = w();
            if (iW != layoutParams.topMargin) {
                layoutParams.topMargin = iW;
                this.f35653a.requestLayout();
            }
        }
    }

    private int w() {
        if (!this.G) {
            return 0;
        }
        int i15 = this.f35676s0;
        if (i15 == 0) {
            return (int) this.W0.q();
        }
        if (i15 != 2) {
            return 0;
        }
        return R() ? (int) (this.W0.q() / 2.0f) : Math.max(0, (int) (this.W0.q() - (this.W0.n() / 2.0f)));
    }

    private boolean x() {
        return this.f35676s0 == 2 && y();
    }

    private void x0(boolean z15, boolean z16) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f35660e;
        boolean z17 = false;
        boolean z18 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f35660e;
        if (editText2 != null && editText2.hasFocus()) {
            z17 = true;
        }
        ColorStateList colorStateList2 = this.J0;
        if (colorStateList2 != null) {
            this.W0.Q(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.J0;
            this.W0.Q(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.T0) : this.T0));
        } else if (d0()) {
            this.W0.Q(this.f35667l.r());
        } else if (this.f35670p && (textView = this.f35673r) != null) {
            this.W0.Q(textView.getTextColors());
        } else if (z17 && (colorStateList = this.K0) != null) {
            this.W0.W(colorStateList);
        }
        if (z18 || !this.X0 || (isEnabled() && z17)) {
            if (z16 || this.V0) {
                A(z15);
                return;
            }
            return;
        }
        if (z16 || !this.V0) {
            G(z15);
        }
    }

    private boolean y() {
        return this.f35679u0 > -1 && this.f35685x0 != 0;
    }

    private void y0() {
        EditText editText;
        if (this.f35684x == null || (editText = this.f35660e) == null) {
            return;
        }
        this.f35684x.setGravity(editText.getGravity());
        this.f35684x.setPadding(this.f35660e.getCompoundPaddingLeft(), this.f35660e.getCompoundPaddingTop(), this.f35660e.getCompoundPaddingRight(), this.f35660e.getCompoundPaddingBottom());
    }

    private void z() {
        if (C()) {
            ((com.google.android.material.textfield.h) this.K).A0();
        }
    }

    private void z0() {
        EditText editText = this.f35660e;
        A0(editText == null ? null : editText.getText());
    }

    void C0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.K == null || this.f35676s0 == 0) {
            return;
        }
        boolean z15 = false;
        boolean z16 = isFocused() || ((editText2 = this.f35660e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f35660e) != null && editText.isHovered())) {
            z15 = true;
        }
        if (!isEnabled()) {
            this.f35685x0 = this.T0;
        } else if (d0()) {
            if (this.O0 != null) {
                B0(z16, z15);
            } else {
                this.f35685x0 = getErrorCurrentTextColors();
            }
        } else if (!this.f35670p || (textView = this.f35673r) == null) {
            if (z16) {
                this.f35685x0 = this.N0;
            } else if (z15) {
                this.f35685x0 = this.M0;
            } else {
                this.f35685x0 = this.L0;
            }
        } else if (this.O0 != null) {
            B0(z16, z15);
        } else {
            this.f35685x0 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        this.f35657c.I();
        Z();
        if (this.f35676s0 == 2) {
            int i15 = this.f35679u0;
            if (z16 && isEnabled()) {
                this.f35679u0 = this.f35683w0;
            } else {
                this.f35679u0 = this.f35681v0;
            }
            if (this.f35679u0 != i15) {
                X();
            }
        }
        if (this.f35676s0 == 1) {
            if (!isEnabled()) {
                this.f35687y0 = this.Q0;
            } else if (z15 && !z16) {
                this.f35687y0 = this.S0;
            } else if (z16) {
                this.f35687y0 = this.R0;
            } else {
                this.f35687y0 = this.P0;
            }
        }
        n();
    }

    public boolean N() {
        return this.f35657c.F();
    }

    public boolean O() {
        return this.f35667l.A();
    }

    public boolean P() {
        return this.f35667l.B();
    }

    final boolean Q() {
        return this.V0;
    }

    public boolean T() {
        return this.I;
    }

    public void Z() {
        this.f35655b.m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i15, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i15, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f35653a.addView(view, layoutParams2);
        this.f35653a.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    void c0(TextView textView, int i15) {
        try {
            androidx.core.widget.h.m(textView, i15);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.h.m(textView, p007NuL.u.f432a);
        textView.setTextColor(u5.a.d(getContext(), ri.c.f173932a));
    }

    boolean d0() {
        return this.f35667l.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i15) {
        EditText editText = this.f35660e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i15);
            return;
        }
        if (this.f35661f != null) {
            boolean z15 = this.I;
            this.I = false;
            CharSequence hint = editText.getHint();
            this.f35660e.setHint(this.f35661f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i15);
                return;
            } finally {
                this.f35660e.setHint(hint);
                this.I = z15;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i15);
        onProvideAutofillVirtualStructure(viewStructure, i15);
        viewStructure.setChildCount(this.f35653a.getChildCount());
        for (int i16 = 0; i16 < this.f35653a.getChildCount(); i16++) {
            View childAt = this.f35653a.getChildAt(i16);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i16);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i15);
            if (childAt == this.f35660e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f35656b1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f35656b1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        F(canvas);
        E(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f35654a1) {
            return;
        }
        this.f35654a1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.W0;
        boolean zM0 = aVar != null ? aVar.m0(drawableState) : false;
        if (this.f35660e != null) {
            w0(isLaidOut() && isEnabled());
        }
        q0();
        C0();
        if (zM0) {
            invalidate();
        }
        this.f35654a1 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f35660e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + w() : super.getBaseline();
    }

    lj.h getBoxBackground() {
        int i15 = this.f35676s0;
        if (i15 == 1 || i15 == 2) {
            return this.K;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f35687y0;
    }

    public int getBoxBackgroundMode() {
        return this.f35676s0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f35678t0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.q.g(this) ? this.f35664h0.j().a(this.B0) : this.f35664h0.l().a(this.B0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.q.g(this) ? this.f35664h0.l().a(this.B0) : this.f35664h0.j().a(this.B0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.q.g(this) ? this.f35664h0.r().a(this.B0) : this.f35664h0.t().a(this.B0);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.q.g(this) ? this.f35664h0.t().a(this.B0) : this.f35664h0.r().a(this.B0);
    }

    public int getBoxStrokeColor() {
        return this.N0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.O0;
    }

    public int getBoxStrokeWidth() {
        return this.f35681v0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f35683w0;
    }

    public int getCounterMaxLength() {
        return this.f35669n;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f35668m && this.f35670p && (textView = this.f35673r) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.D;
    }

    public ColorStateList getCounterTextColor() {
        return this.C;
    }

    public ColorStateList getCursorColor() {
        return this.E;
    }

    public ColorStateList getCursorErrorColor() {
        return this.F;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.J0;
    }

    public EditText getEditText() {
        return this.f35660e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f35657c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f35657c.n();
    }

    public int getEndIconMinSize() {
        return this.f35657c.o();
    }

    public int getEndIconMode() {
        return this.f35657c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f35657c.q();
    }

    CheckableImageButton getEndIconView() {
        return this.f35657c.r();
    }

    public CharSequence getError() {
        if (this.f35667l.A()) {
            return this.f35667l.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f35667l.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f35667l.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f35667l.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f35657c.s();
    }

    public CharSequence getHelperText() {
        if (this.f35667l.B()) {
            return this.f35667l.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f35667l.u();
    }

    public CharSequence getHint() {
        if (this.G) {
            return this.H;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.W0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.W0.t();
    }

    public int getHintMaxLines() {
        return this.W0.x();
    }

    public ColorStateList getHintTextColor() {
        return this.K0;
    }

    public f getLengthCounter() {
        return this.f35671q;
    }

    public int getMaxEms() {
        return this.f35663h;
    }

    public int getMaxWidth() {
        return this.f35666k;
    }

    public int getMinEms() {
        return this.f35662g;
    }

    public int getMinWidth() {
        return this.f35665j;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f35657c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f35657c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f35682w) {
            return this.f35680v;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f35688z;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f35686y;
    }

    public CharSequence getPrefixText() {
        return this.f35655b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f35655b.b();
    }

    public TextView getPrefixTextView() {
        return this.f35655b.d();
    }

    public lj.l getShapeAppearanceModel() {
        return this.f35664h0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f35655b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f35655b.f();
    }

    public int getStartIconMinSize() {
        return this.f35655b.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f35655b.h();
    }

    public CharSequence getSuffixText() {
        return this.f35657c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f35657c.x();
    }

    public TextView getSuffixTextView() {
        return this.f35657c.z();
    }

    public Typeface getTypeface() {
        return this.C0;
    }

    public void j(g gVar) {
        this.F0.add(gVar);
        if (this.f35660e != null) {
            gVar.a(this);
        }
    }

    void l0(Editable editable) {
        int iA = this.f35671q.a(editable);
        boolean z15 = this.f35670p;
        int i15 = this.f35669n;
        if (i15 == -1) {
            this.f35673r.setText(String.valueOf(iA));
            this.f35673r.setContentDescription(null);
            this.f35670p = false;
        } else {
            this.f35670p = iA > i15;
            m0(getContext(), this.f35673r, iA, this.f35669n, this.f35670p);
            if (z15 != this.f35670p) {
                n0();
            }
            this.f35673r.setText(h6.a.c().j(getContext().getString(ri.j.f174044d, Integer.valueOf(iA), Integer.valueOf(this.f35669n))));
        }
        if (this.f35660e == null || z15 == this.f35670p) {
            return;
        }
        w0(false);
        C0();
        q0();
    }

    void m(float f15) {
        if (this.W0.B() == f15) {
            return;
        }
        if (this.Z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.Z0 = valueAnimator;
            valueAnimator.setInterpolator(gj.e.g(getContext(), ri.b.F, si.a.f181917b));
            this.Z0.setDuration(gj.e.f(getContext(), ri.b.f173931z, 167));
            this.Z0.addUpdateListener(new d());
        }
        this.Z0.setFloatValues(this.W0.B(), f15);
        this.Z0.start();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.W0.L(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f35657c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f35658c1 = false;
        boolean zU0 = u0();
        boolean zP0 = p0();
        if (zU0 || zP0) {
            this.f35660e.post(new Runnable() { // from class: com.google.android.material.textfield.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35700a.f35660e.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        EditText editText = this.f35660e;
        if (editText != null) {
            Rect rect = this.f35689z0;
            com.google.android.material.internal.c.a(this, editText, rect);
            i0(rect);
            if (this.G) {
                this.W0.h0(this.f35660e.getTextSize());
                int gravity = this.f35660e.getGravity();
                this.W0.X((gravity & (-113)) | 48);
                this.W0.g0(gravity);
                this.W0.S(s(rect));
                this.W0.c0(v(rect));
                this.W0.N();
                if (!C() || this.V0) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
        if (!this.f35658c1) {
            this.f35657c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f35658c1 = true;
        }
        y0();
        this.f35657c.x0();
        if (R()) {
            return;
        }
        j0((this.f35660e.getMeasuredWidth() - this.f35660e.getCompoundPaddingLeft()) - this.f35660e.getCompoundPaddingRight());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        setError(iVar.f35697c);
        if (iVar.f35698d) {
            post(new c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i15) {
        super.onRtlPropertiesChanged(i15);
        boolean z15 = i15 == 1;
        if (z15 != this.f35672q0) {
            float fA = this.f35664h0.r().a(this.B0);
            float fA2 = this.f35664h0.t().a(this.B0);
            lj.l lVarM = lj.l.a().B(this.f35664h0.s()).F(this.f35664h0.q()).t(this.f35664h0.k()).x(this.f35664h0.i()).C(fA2).G(fA).u(this.f35664h0.l().a(this.B0)).y(this.f35664h0.j().a(this.B0)).m();
            this.f35672q0 = z15;
            setShapeAppearanceModel(lVarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        if (d0()) {
            iVar.f35697c = getError();
        }
        iVar.f35698d = this.f35657c.E();
        return iVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    boolean p0() {
        boolean z15;
        if (this.f35660e == null) {
            return false;
        }
        boolean z16 = true;
        if (f0()) {
            int measuredWidth = this.f35655b.getMeasuredWidth() - this.f35660e.getPaddingLeft();
            if (this.D0 == null || this.E0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.D0 = colorDrawable;
                this.E0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f35660e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.D0;
            if (drawable != drawable2) {
                this.f35660e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z15 = true;
            } else {
                z15 = false;
            }
        } else if (this.D0 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f35660e.getCompoundDrawablesRelative();
            this.f35660e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
            this.D0 = null;
            z15 = true;
        } else {
            z15 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f35657c.z().getMeasuredWidth() - this.f35660e.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f35657c.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.f35660e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.G0;
            if (drawable3 != null && this.H0 != measuredWidth2) {
                this.H0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f35660e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.G0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.G0 = colorDrawable2;
                this.H0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.G0;
            if (drawable4 != drawable5) {
                this.I0 = drawable4;
                this.f35660e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.G0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f35660e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.G0) {
                this.f35660e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.I0, compoundDrawablesRelative4[3]);
            } else {
                z16 = z15;
            }
            this.G0 = null;
            return z16;
        }
        return z15;
    }

    void q0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f35660e;
        if (editText == null || this.f35676s0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (h0.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(androidx.appcompat.widget.k.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f35670p && (textView = this.f35673r) != null) {
            background.setColorFilter(androidx.appcompat.widget.k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            y5.a.c(background);
            this.f35660e.refreshDrawableState();
        }
    }

    void s0() {
        EditText editText = this.f35660e;
        if (editText == null || this.K == null) {
            return;
        }
        if ((this.P || editText.getBackground() == null) && this.f35676s0 != 0) {
            r0();
            this.P = true;
        }
    }

    public void setBoxBackgroundColor(int i15) {
        if (this.f35687y0 != i15) {
            this.f35687y0 = i15;
            this.P0 = i15;
            this.R0 = i15;
            this.S0 = i15;
            n();
        }
    }

    public void setBoxBackgroundColorResource(int i15) {
        setBoxBackgroundColor(u5.a.d(getContext(), i15));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.P0 = defaultColor;
        this.f35687y0 = defaultColor;
        this.Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.R0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.S0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        n();
    }

    public void setBoxBackgroundMode(int i15) {
        if (i15 == this.f35676s0) {
            return;
        }
        this.f35676s0 = i15;
        if (this.f35660e != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i15) {
        this.f35678t0 = i15;
    }

    public void setBoxCornerFamily(int i15) {
        this.f35664h0 = this.f35664h0.w().A(i15, this.f35664h0.r()).E(i15, this.f35664h0.t()).s(i15, this.f35664h0.j()).w(i15, this.f35664h0.l()).m();
        n();
    }

    public void setBoxStrokeColor(int i15) {
        if (this.N0 != i15) {
            this.N0 = i15;
            C0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.L0 = colorStateList.getDefaultColor();
            this.T0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.M0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.N0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.N0 != colorStateList.getDefaultColor()) {
            this.N0 = colorStateList.getDefaultColor();
        }
        C0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.O0 != colorStateList) {
            this.O0 = colorStateList;
            C0();
        }
    }

    public void setBoxStrokeWidth(int i15) {
        this.f35681v0 = i15;
        C0();
    }

    public void setBoxStrokeWidthFocused(int i15) {
        this.f35683w0 = i15;
        C0();
    }

    public void setBoxStrokeWidthFocusedResource(int i15) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i15));
    }

    public void setBoxStrokeWidthResource(int i15) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i15));
    }

    public void setCounterEnabled(boolean z15) {
        if (this.f35668m != z15) {
            if (z15) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f35673r = appCompatTextView;
                appCompatTextView.setId(ri.f.M);
                Typeface typeface = this.C0;
                if (typeface != null) {
                    this.f35673r.setTypeface(typeface);
                }
                this.f35673r.setMaxLines(1);
                this.f35667l.e(this.f35673r, 2);
                ((ViewGroup.MarginLayoutParams) this.f35673r.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(ri.d.f173969p0));
                n0();
                k0();
            } else {
                this.f35667l.C(this.f35673r, 2);
                this.f35673r = null;
            }
            this.f35668m = z15;
        }
    }

    public void setCounterMaxLength(int i15) {
        if (this.f35669n != i15) {
            if (i15 > 0) {
                this.f35669n = i15;
            } else {
                this.f35669n = -1;
            }
            if (this.f35668m) {
                k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i15) {
        if (this.f35675s != i15) {
            this.f35675s = i15;
            n0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            n0();
        }
    }

    public void setCounterTextAppearance(int i15) {
        if (this.f35677t != i15) {
            this.f35677t = i15;
            n0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            n0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            o0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            if (S()) {
                o0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.J0 = colorStateList;
        this.K0 = colorStateList;
        if (this.f35660e != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z15) {
        Y(this, z15);
        super.setEnabled(z15);
    }

    public void setEndIconActivated(boolean z15) {
        this.f35657c.N(z15);
    }

    public void setEndIconCheckable(boolean z15) {
        this.f35657c.O(z15);
    }

    public void setEndIconContentDescription(int i15) {
        this.f35657c.P(i15);
    }

    public void setEndIconDrawable(int i15) {
        this.f35657c.R(i15);
    }

    public void setEndIconMinSize(int i15) {
        this.f35657c.T(i15);
    }

    public void setEndIconMode(int i15) {
        this.f35657c.U(i15);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f35657c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f35657c.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f35657c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f35657c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f35657c.Z(mode);
    }

    public void setEndIconVisible(boolean z15) {
        this.f35657c.a0(z15);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f35667l.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f35667l.w();
        } else {
            this.f35667l.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i15) {
        this.f35667l.E(i15);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f35667l.F(charSequence);
    }

    public void setErrorEnabled(boolean z15) {
        this.f35667l.G(z15);
    }

    public void setErrorIconDrawable(int i15) {
        this.f35657c.b0(i15);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f35657c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f35657c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f35657c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f35657c.g0(mode);
    }

    public void setErrorTextAppearance(int i15) {
        this.f35667l.H(i15);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f35667l.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z15) {
        if (this.X0 != z15) {
            this.X0 = z15;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (P()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!P()) {
                setHelperTextEnabled(true);
            }
            this.f35667l.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f35667l.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z15) {
        this.f35667l.K(z15);
    }

    public void setHelperTextTextAppearance(int i15) {
        this.f35667l.J(i15);
    }

    public void setHint(CharSequence charSequence) {
        if (this.G) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z15) {
        this.Y0 = z15;
    }

    public void setHintEnabled(boolean z15) {
        if (z15 != this.G) {
            this.G = z15;
            if (z15) {
                CharSequence hint = this.f35660e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.H)) {
                        setHint(hint);
                    }
                    this.f35660e.setHint((CharSequence) null);
                }
                this.I = true;
            } else {
                this.I = false;
                if (!TextUtils.isEmpty(this.H) && TextUtils.isEmpty(this.f35660e.getHint())) {
                    this.f35660e.setHint(this.H);
                }
                setHintInternal(null);
            }
            if (this.f35660e != null) {
                v0();
            }
        }
    }

    public void setHintMaxLines(int i15) {
        this.W0.T(i15);
        this.W0.e0(i15);
        requestLayout();
    }

    public void setHintTextAppearance(int i15) {
        this.W0.U(i15);
        this.K0 = this.W0.p();
        if (this.f35660e != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            if (this.J0 == null) {
                this.W0.W(colorStateList);
            }
            this.K0 = colorStateList;
            if (this.f35660e != null) {
                w0(false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.f35671q = fVar;
    }

    public void setMaxEms(int i15) {
        this.f35663h = i15;
        EditText editText = this.f35660e;
        if (editText == null || i15 == -1) {
            return;
        }
        editText.setMaxEms(i15);
    }

    public void setMaxWidth(int i15) {
        this.f35666k = i15;
        EditText editText = this.f35660e;
        if (editText == null || i15 == -1) {
            return;
        }
        editText.setMaxWidth(i15);
    }

    public void setMaxWidthResource(int i15) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i15));
    }

    public void setMinEms(int i15) {
        this.f35662g = i15;
        EditText editText = this.f35660e;
        if (editText == null || i15 == -1) {
            return;
        }
        editText.setMinEms(i15);
    }

    public void setMinWidth(int i15) {
        this.f35665j = i15;
        EditText editText = this.f35660e;
        if (editText == null || i15 == -1) {
            return;
        }
        editText.setMinWidth(i15);
    }

    public void setMinWidthResource(int i15) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i15));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i15) {
        this.f35657c.i0(i15);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i15) {
        this.f35657c.k0(i15);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z15) {
        this.f35657c.m0(z15);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f35657c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f35657c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f35684x == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f35684x = appCompatTextView;
            appCompatTextView.setId(ri.f.P);
            this.f35684x.setImportantForAccessibility(1);
            this.f35684x.setAccessibilityLiveRegion(1);
            fb.c cVarB = B();
            this.A = cVarB;
            cVarB.y0(67L);
            this.B = B();
            setPlaceholderTextAppearance(this.f35688z);
            setPlaceholderTextColor(this.f35686y);
            l0.h0(this.f35684x, new b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f35682w) {
                setPlaceholderTextEnabled(true);
            }
            this.f35680v = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i15) {
        this.f35688z = i15;
        TextView textView = this.f35684x;
        if (textView != null) {
            androidx.core.widget.h.m(textView, i15);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f35686y != colorStateList) {
            this.f35686y = colorStateList;
            TextView textView = this.f35684x;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f35655b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i15) {
        this.f35655b.o(i15);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f35655b.p(colorStateList);
    }

    public void setShapeAppearanceModel(lj.l lVar) {
        lj.h hVar = this.K;
        if (hVar == null || hVar.I() == lVar) {
            return;
        }
        this.f35664h0 = lVar;
        n();
    }

    public void setStartIconCheckable(boolean z15) {
        this.f35655b.q(z15);
    }

    public void setStartIconContentDescription(int i15) {
        setStartIconContentDescription(i15 != 0 ? getResources().getText(i15) : null);
    }

    public void setStartIconDrawable(int i15) {
        setStartIconDrawable(i15 != 0 ? p082nUL.y.b(getContext(), i15) : null);
    }

    public void setStartIconMinSize(int i15) {
        this.f35655b.t(i15);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f35655b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f35655b.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f35655b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f35655b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f35655b.y(mode);
    }

    public void setStartIconVisible(boolean z15) {
        this.f35655b.z(z15);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f35657c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i15) {
        this.f35657c.q0(i15);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f35657c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f35660e;
        if (editText != null) {
            l0.h0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.C0) {
            this.C0 = typeface;
            this.W0.p0(typeface);
            this.f35667l.N(typeface);
            TextView textView = this.f35673r;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void w0(boolean z15) {
        x0(z15, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i15) {
        int i16 = f35651d1;
        super(pj.a.d(context, attributeSet, i15, i16), attributeSet, i15);
        this.f35662g = -1;
        this.f35663h = -1;
        this.f35665j = -1;
        this.f35666k = -1;
        this.f35667l = new u(this);
        this.f35671q = new f() { // from class: com.google.android.material.textfield.b0
            @Override // com.google.android.material.textfield.TextInputLayout.f
            public final int a(Editable editable) {
                return TextInputLayout.c(editable);
            }
        };
        this.f35689z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new RectF();
        this.F0 = new LinkedHashSet<>();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.W0 = aVar;
        this.f35658c1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f35653a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = si.a.f181916a;
        aVar.o0(timeInterpolator);
        aVar.l0(timeInterpolator);
        aVar.X(8388659);
        z0 z0VarJ = com.google.android.material.internal.n.j(context2, attributeSet, ri.l.f174259u5, i15, i16, ri.l.R5, ri.l.P5, ri.l.f174172j6, ri.l.f174212o6, ri.l.f174252t6);
        z zVar = new z(this, z0VarJ);
        this.f35655b = zVar;
        this.G = z0VarJ.a(ri.l.f174236r6, true);
        setHint(z0VarJ.p(ri.l.f174299z5));
        this.Y0 = z0VarJ.a(ri.l.f174228q6, true);
        this.X0 = z0VarJ.a(ri.l.f174188l6, true);
        if (z0VarJ.s(ri.l.B5)) {
            setMinEms(z0VarJ.k(ri.l.B5, -1));
        } else if (z0VarJ.s(ri.l.f174291y5)) {
            setMinWidth(z0VarJ.f(ri.l.f174291y5, -1));
        }
        if (z0VarJ.s(ri.l.A5)) {
            setMaxEms(z0VarJ.k(ri.l.A5, -1));
        } else if (z0VarJ.s(ri.l.f174283x5)) {
            setMaxWidth(z0VarJ.f(ri.l.f174283x5, -1));
        }
        this.f35664h0 = lj.l.e(context2, attributeSet, i15, i16).m();
        this.f35674r0 = context2.getResources().getDimensionPixelOffset(ri.d.f173963m0);
        this.f35678t0 = z0VarJ.e(ri.l.E5, 0);
        this.f35659d = getResources().getDimensionPixelSize(ri.d.f173977x);
        this.f35681v0 = z0VarJ.f(ri.l.L5, context2.getResources().getDimensionPixelSize(ri.d.f173965n0));
        this.f35683w0 = z0VarJ.f(ri.l.M5, context2.getResources().getDimensionPixelSize(ri.d.f173967o0));
        this.f35679u0 = this.f35681v0;
        float fD = z0VarJ.d(ri.l.I5, -1.0f);
        float fD2 = z0VarJ.d(ri.l.H5, -1.0f);
        float fD3 = z0VarJ.d(ri.l.F5, -1.0f);
        float fD4 = z0VarJ.d(ri.l.G5, -1.0f);
        lj.l.b bVarW = this.f35664h0.w();
        if (fD >= 0.0f) {
            bVarW.C(fD);
        }
        if (fD2 >= 0.0f) {
            bVarW.G(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarW.y(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarW.u(fD4);
        }
        this.f35664h0 = bVarW.m();
        ColorStateList colorStateListB = ij.c.b(context2, z0VarJ, ri.l.C5);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.P0 = defaultColor;
            this.f35687y0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.Q0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.R0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.S0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.R0 = this.P0;
                ColorStateList colorStateListA = p082nUL.y.a(context2, ri.c.f173934c);
                this.Q0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.S0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f35687y0 = 0;
            this.P0 = 0;
            this.Q0 = 0;
            this.R0 = 0;
            this.S0 = 0;
        }
        if (z0VarJ.s(ri.l.f174275w5)) {
            ColorStateList colorStateListC = z0VarJ.c(ri.l.f174275w5);
            this.K0 = colorStateListC;
            this.J0 = colorStateListC;
        }
        ColorStateList colorStateListB2 = ij.c.b(context2, z0VarJ, ri.l.J5);
        this.N0 = z0VarJ.b(ri.l.J5, 0);
        this.L0 = u5.a.d(context2, ri.c.f173935d);
        this.T0 = u5.a.d(context2, ri.c.f173936e);
        this.M0 = u5.a.d(context2, ri.c.f173937f);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (z0VarJ.s(ri.l.K5)) {
            setBoxStrokeErrorColor(ij.c.b(context2, z0VarJ, ri.l.K5));
        }
        if (z0VarJ.n(ri.l.f174252t6, -1) != -1) {
            setHintTextAppearance(z0VarJ.n(ri.l.f174252t6, 0));
        }
        this.E = z0VarJ.c(ri.l.T5);
        this.F = z0VarJ.c(ri.l.U5);
        int iN = z0VarJ.n(ri.l.f174172j6, 0);
        CharSequence charSequenceP = z0VarJ.p(ri.l.f174132e6);
        int iK = z0VarJ.k(ri.l.f174124d6, 1);
        boolean zA = z0VarJ.a(ri.l.f174140f6, false);
        int iN2 = z0VarJ.n(ri.l.f174212o6, 0);
        boolean zA2 = z0VarJ.a(ri.l.f174204n6, false);
        CharSequence charSequenceP2 = z0VarJ.p(ri.l.f174196m6);
        int iN3 = z0VarJ.n(ri.l.B6, 0);
        CharSequence charSequenceP3 = z0VarJ.p(ri.l.A6);
        boolean zA3 = z0VarJ.a(ri.l.N5, false);
        setCounterMaxLength(z0VarJ.k(ri.l.O5, -1));
        this.f35677t = z0VarJ.n(ri.l.R5, 0);
        this.f35675s = z0VarJ.n(ri.l.P5, 0);
        setBoxBackgroundMode(z0VarJ.k(ri.l.D5, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f35675s);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f35677t);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        if (z0VarJ.s(ri.l.f174180k6)) {
            setErrorTextColor(z0VarJ.c(ri.l.f174180k6));
        }
        if (z0VarJ.s(ri.l.f174220p6)) {
            setHelperTextColor(z0VarJ.c(ri.l.f174220p6));
        }
        if (z0VarJ.s(ri.l.f174260u6)) {
            setHintTextColor(z0VarJ.c(ri.l.f174260u6));
        }
        if (z0VarJ.s(ri.l.S5)) {
            setCounterTextColor(z0VarJ.c(ri.l.S5));
        }
        if (z0VarJ.s(ri.l.Q5)) {
            setCounterOverflowTextColor(z0VarJ.c(ri.l.Q5));
        }
        if (z0VarJ.s(ri.l.C6)) {
            setPlaceholderTextColor(z0VarJ.c(ri.l.C6));
        }
        r rVar = new r(this, z0VarJ);
        this.f35657c = rVar;
        boolean zA4 = z0VarJ.a(ri.l.f174267v5, true);
        setHintMaxLines(z0VarJ.k(ri.l.f174244s6, 1));
        z0VarJ.x();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(zVar);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f35657c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f35657c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f35657c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f35657c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f35657c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f35655b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f35655b.s(drawable);
    }

    public void setHint(int i15) {
        setHint(i15 != 0 ? getResources().getText(i15) : null);
    }
}
