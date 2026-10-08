package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f9460h = {R.attr.colorBackground};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final c f9461j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f9464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f9465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Rect f9466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Rect f9467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f9468g;

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f9469a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void a(int i15, int i16, int i17, int i18) {
            CardView.this.f9467f.set(i15, i16, i17, i18);
            CardView cardView = CardView.this;
            Rect rect = cardView.f9466e;
            CardView.super.setPadding(i15 + rect.left, i16 + rect.top, i17 + rect.right, i18 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public void b(Drawable drawable) {
            this.f9469a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable d() {
            return this.f9469a;
        }

        @Override // androidx.cardview.widget.b
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f9461j = aVar;
        aVar.k();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q0.a.f163359a);
    }

    public ColorStateList getCardBackgroundColor() {
        return f9461j.e(this.f9468g);
    }

    public float getCardElevation() {
        return f9461j.i(this.f9468g);
    }

    public int getContentPaddingBottom() {
        return this.f9466e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f9466e.left;
    }

    public int getContentPaddingRight() {
        return this.f9466e.right;
    }

    public int getContentPaddingTop() {
        return this.f9466e.top;
    }

    public float getMaxCardElevation() {
        return f9461j.d(this.f9468g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f9463b;
    }

    public float getRadius() {
        return f9461j.b(this.f9468g);
    }

    public boolean getUseCompatPadding() {
        return this.f9462a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        c cVar = f9461j;
        if (cVar instanceof androidx.cardview.widget.a) {
            super.onMeasure(i15, i16);
            return;
        }
        int mode = View.MeasureSpec.getMode(i15);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i15 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.l(this.f9468g)), View.MeasureSpec.getSize(i15)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i16);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i16 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.f(this.f9468g)), View.MeasureSpec.getSize(i16)), mode2);
        }
        super.onMeasure(i15, i16);
    }

    public void setCardBackgroundColor(int i15) {
        f9461j.m(this.f9468g, ColorStateList.valueOf(i15));
    }

    public void setCardElevation(float f15) {
        f9461j.c(this.f9468g, f15);
    }

    public void setMaxCardElevation(float f15) {
        f9461j.n(this.f9468g, f15);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i15) {
        this.f9465d = i15;
        super.setMinimumHeight(i15);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i15) {
        this.f9464c = i15;
        super.setMinimumWidth(i15);
    }

    @Override // android.view.View
    public void setPadding(int i15, int i16, int i17, int i18) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i15, int i16, int i17, int i18) {
    }

    public void setPreventCornerOverlap(boolean z15) {
        if (z15 != this.f9463b) {
            this.f9463b = z15;
            f9461j.g(this.f9468g);
        }
    }

    public void setRadius(float f15) {
        f9461j.a(this.f9468g, f15);
    }

    public void setUseCompatPadding(boolean z15) {
        if (this.f9462a != z15) {
            this.f9462a = z15;
            f9461j.j(this.f9468g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i15) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i15);
        Rect rect = new Rect();
        this.f9466e = rect;
        this.f9467f = new Rect();
        a aVar = new a();
        this.f9468g = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q0.d.f163363a, i15, q0.c.f163362a);
        if (typedArrayObtainStyledAttributes.hasValue(q0.d.f163366d)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(q0.d.f163366d);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f9460h);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(q0.b.f163361b) : getResources().getColor(q0.b.f163360a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(q0.d.f163367e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(q0.d.f163368f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(q0.d.f163369g, 0.0f);
        this.f9462a = typedArrayObtainStyledAttributes.getBoolean(q0.d.f163371i, false);
        this.f9463b = typedArrayObtainStyledAttributes.getBoolean(q0.d.f163370h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(q0.d.f163372j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(q0.d.f163374l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(q0.d.f163376n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(q0.d.f163375m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(q0.d.f163373k, dimensionPixelSize);
        float f15 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f9464c = typedArrayObtainStyledAttributes.getDimensionPixelSize(q0.d.f163364b, 0);
        this.f9465d = typedArrayObtainStyledAttributes.getDimensionPixelSize(q0.d.f163365c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f9461j.h(aVar, context, colorStateList, dimension, dimension2, f15);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f9461j.m(this.f9468g, colorStateList);
    }
}
