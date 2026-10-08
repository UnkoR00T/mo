package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f9471a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f9473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f9474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f9475e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f9478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f9479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f9480j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9476f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9477g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f9481k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f9472b = new Paint(5);

    d(ColorStateList colorStateList, float f15) {
        this.f9471a = f15;
        e(colorStateList);
        this.f9473c = new RectF();
        this.f9474d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f9478h = colorStateList;
        this.f9472b.setColor(colorStateList.getColorForState(getState(), this.f9478h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f9473c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f9474d.set(rect);
        if (this.f9476f) {
            this.f9474d.inset((int) Math.ceil(e.a(this.f9475e, this.f9471a, this.f9477g)), (int) Math.ceil(e.b(this.f9475e, this.f9471a, this.f9477g)));
            this.f9473c.set(this.f9474d);
        }
    }

    public ColorStateList b() {
        return this.f9478h;
    }

    float c() {
        return this.f9475e;
    }

    public float d() {
        return this.f9471a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z15;
        Paint paint = this.f9472b;
        if (this.f9479i == null || paint.getColorFilter() != null) {
            z15 = false;
        } else {
            paint.setColorFilter(this.f9479i);
            z15 = true;
        }
        RectF rectF = this.f9473c;
        float f15 = this.f9471a;
        canvas.drawRoundRect(rectF, f15, f15, paint);
        if (z15) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f15, boolean z15, boolean z16) {
        if (f15 == this.f9475e && this.f9476f == z15 && this.f9477g == z16) {
            return;
        }
        this.f9475e = f15;
        this.f9476f = z15;
        this.f9477g = z16;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f9474d, this.f9471a);
    }

    void h(float f15) {
        if (f15 == this.f9471a) {
            return;
        }
        this.f9471a = f15;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f9480j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f9478h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f9478h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z15 = colorForState != this.f9472b.getColor();
        if (z15) {
            this.f9472b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f9480j;
        if (colorStateList2 == null || (mode = this.f9481k) == null) {
            return z15;
        }
        this.f9479i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i15) {
        this.f9472b.setAlpha(i15);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9472b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f9480j = colorStateList;
        this.f9479i = a(colorStateList, this.f9481k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f9481k = mode;
        this.f9479i = a(this.f9480j, mode);
        invalidateSelf();
    }
}
