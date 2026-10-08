package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.r;
import ij.c;
import lj.h;
import lj.l;
import lj.m;
import lj.o;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p082nUL.y;
import ri.k;

/* JADX INFO: loaded from: classes4.dex */
public class ShapeableImageView extends r implements o {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f35307y = k.A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f35308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f35309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f35310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f35311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f35312h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f35313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f35314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private h f35315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f35316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f35317n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Path f35318p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f35319q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f35320r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f35321s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35322t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35323v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f35324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f35325x;

    class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f35326a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f35316m == null) {
                return;
            }
            if (ShapeableImageView.this.f35315l == null) {
                ShapeableImageView.this.f35315l = new h(ShapeableImageView.this.f35316m);
            }
            ShapeableImageView.this.f35309e.round(this.f35326a);
            ShapeableImageView.this.f35315l.setBounds(this.f35326a);
            ShapeableImageView.this.f35315l.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void g(Canvas canvas) {
        if (this.f35314k == null) {
            return;
        }
        this.f35311g.setStrokeWidth(this.f35317n);
        int colorForState = this.f35314k.getColorForState(getDrawableState(), this.f35314k.getDefaultColor());
        if (this.f35317n <= 0.0f || colorForState == 0) {
            return;
        }
        this.f35311g.setColor(colorForState);
        canvas.drawPath(this.f35313j, this.f35311g);
    }

    private boolean h() {
        return (this.f35323v == Integer.MIN_VALUE && this.f35324w == Integer.MIN_VALUE) ? false : true;
    }

    private boolean i() {
        return getLayoutDirection() == 1;
    }

    private void j(int i15, int i16) {
        this.f35309e.set(getPaddingLeft(), getPaddingTop(), i15 - getPaddingRight(), i16 - getPaddingBottom());
        this.f35308d.d(this.f35316m, 1.0f, this.f35309e, this.f35313j);
        this.f35318p.rewind();
        this.f35318p.addPath(this.f35313j);
        this.f35310f.set(0.0f, 0.0f, i15, i16);
        this.f35318p.addRect(this.f35310f, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f35322t;
    }

    public final int getContentPaddingEnd() {
        int i15 = this.f35324w;
        if (i15 != Integer.MIN_VALUE) {
            return i15;
        }
        return i() ? this.f35319q : this.f35321s;
    }

    public int getContentPaddingLeft() {
        int i15;
        int i16;
        if (h()) {
            if (i() && (i16 = this.f35324w) != Integer.MIN_VALUE) {
                return i16;
            }
            if (!i() && (i15 = this.f35323v) != Integer.MIN_VALUE) {
                return i15;
            }
        }
        return this.f35319q;
    }

    public int getContentPaddingRight() {
        int i15;
        int i16;
        if (h()) {
            if (i() && (i16 = this.f35323v) != Integer.MIN_VALUE) {
                return i16;
            }
            if (!i() && (i15 = this.f35324w) != Integer.MIN_VALUE) {
                return i15;
            }
        }
        return this.f35321s;
    }

    public final int getContentPaddingStart() {
        int i15 = this.f35323v;
        if (i15 != Integer.MIN_VALUE) {
            return i15;
        }
        return i() ? this.f35321s : this.f35319q;
    }

    public int getContentPaddingTop() {
        return this.f35320r;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public l getShapeAppearanceModel() {
        return this.f35316m;
    }

    public ColorStateList getStrokeColor() {
        return this.f35314k;
    }

    public float getStrokeWidth() {
        return this.f35317n;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f35318p, this.f35312h);
        g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
        if (!this.f35325x && isLayoutDirectionResolved()) {
            this.f35325x = true;
            if (isPaddingRelative() || h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i15, int i16, int i17, int i18) {
        super.onSizeChanged(i15, i16, i17, i18);
        j(i15, i16);
    }

    @Override // android.view.View
    public void setPadding(int i15, int i16, int i17, int i18) {
        super.setPadding(i15 + getContentPaddingLeft(), i16 + getContentPaddingTop(), i17 + getContentPaddingRight(), i18 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i15, int i16, int i17, int i18) {
        super.setPaddingRelative(i15 + getContentPaddingStart(), i16 + getContentPaddingTop(), i17 + getContentPaddingEnd(), i18 + getContentPaddingBottom());
    }

    @Override // lj.o
    public void setShapeAppearanceModel(l lVar) {
        this.f35316m = lVar;
        h hVar = this.f35315l;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
        j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f35314k = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i15) {
        setStrokeColor(y.a(getContext(), i15));
    }

    public void setStrokeWidth(float f15) {
        if (this.f35317n != f15) {
            this.f35317n = f15;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i15) {
        setStrokeWidth(getResources().getDimensionPixelSize(i15));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i15) {
        int i16 = f35307y;
        super(pj.a.d(context, attributeSet, i15, i16), attributeSet, i15);
        this.f35308d = m.l();
        this.f35313j = new Path();
        this.f35325x = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f35312h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f35309e = new RectF();
        this.f35310f = new RectF();
        this.f35318p = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ri.l.f174170j4, i15, i16);
        setLayerType(2, null);
        this.f35314k = c.a(context2, typedArrayObtainStyledAttributes, ri.l.f174234r4);
        this.f35317n = typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.f174242s4, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.f174178k4, 0);
        this.f35319q = dimensionPixelSize;
        this.f35320r = dimensionPixelSize;
        this.f35321s = dimensionPixelSize;
        this.f35322t = dimensionPixelSize;
        this.f35319q = typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.f174202n4, dimensionPixelSize);
        this.f35320r = typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.f174226q4, dimensionPixelSize);
        this.f35321s = typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.f174210o4, dimensionPixelSize);
        this.f35322t = typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.f174186l4, dimensionPixelSize);
        this.f35323v = typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.f174218p4, PKIFailureInfo.systemUnavail);
        this.f35324w = typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.f174194m4, PKIFailureInfo.systemUnavail);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f35311g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f35316m = l.e(context2, attributeSet, i15, i16).m();
        setOutlineProvider(new a());
    }
}
