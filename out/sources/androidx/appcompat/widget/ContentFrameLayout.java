package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TypedValue f8642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TypedValue f8643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f8644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TypedValue f8645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f8646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TypedValue f8647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f8648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f8649h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i15, int i16, int i17, int i18) {
        this.f8648g.set(i15, i16, i17, i18);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f8646e == null) {
            this.f8646e = new TypedValue();
        }
        return this.f8646e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f8647f == null) {
            this.f8647f = new TypedValue();
        }
        return this.f8647f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f8644c == null) {
            this.f8644c = new TypedValue();
        }
        return this.f8644c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f8645d == null) {
            this.f8645d = new TypedValue();
        }
        return this.f8645d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f8642a == null) {
            this.f8642a = new TypedValue();
        }
        return this.f8642a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f8643b == null) {
            this.f8643b = new TypedValue();
        }
        return this.f8643b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f8649h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f8649h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        boolean z15;
        int i17;
        int i18;
        float fraction;
        int i19;
        int i25;
        float fraction2;
        int i26;
        int i27;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z16 = true;
        boolean z17 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i15);
        int mode2 = View.MeasureSpec.getMode(i16);
        if (mode != Integer.MIN_VALUE) {
            z15 = false;
        } else {
            TypedValue typedValue = z17 ? this.f8645d : this.f8644c;
            if (typedValue == null || (i26 = typedValue.type) == 0) {
                z15 = false;
            } else {
                if (i26 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i26 == 6) {
                        int i28 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i28, i28);
                    } else {
                        i27 = 0;
                    }
                    if (i27 > 0) {
                        Rect rect = this.f8648g;
                        i15 = View.MeasureSpec.makeMeasureSpec(Math.min(i27 - (rect.left + rect.right), View.MeasureSpec.getSize(i15)), 1073741824);
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                i27 = (int) fraction3;
                if (i27 > 0) {
                    Rect rect2 = this.f8648g;
                    i15 = View.MeasureSpec.makeMeasureSpec(Math.min(i27 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i15)), 1073741824);
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z17 ? this.f8646e : this.f8647f;
            if (typedValue2 != null && (i19 = typedValue2.type) != 0) {
                if (i19 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i19 == 6) {
                        int i29 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i29, i29);
                    } else {
                        i25 = 0;
                    }
                    if (i25 > 0) {
                        Rect rect3 = this.f8648g;
                        i16 = View.MeasureSpec.makeMeasureSpec(Math.min(i25 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i16)), 1073741824);
                    }
                }
                i25 = (int) fraction2;
                if (i25 > 0) {
                    Rect rect4 = this.f8648g;
                    i16 = View.MeasureSpec.makeMeasureSpec(Math.min(i25 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i16)), 1073741824);
                }
            }
        }
        super.onMeasure(i15, i16);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z15 || mode != Integer.MIN_VALUE) {
            z16 = false;
        } else {
            TypedValue typedValue3 = z17 ? this.f8643b : this.f8642a;
            if (typedValue3 == null || (i17 = typedValue3.type) == 0) {
                z16 = false;
            } else {
                if (i17 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i17 == 6) {
                        int i35 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i35, i35);
                    } else {
                        i18 = 0;
                    }
                    if (i18 > 0) {
                        Rect rect5 = this.f8648g;
                        i18 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i18) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                    } else {
                        z16 = false;
                    }
                }
                i18 = (int) fraction;
                if (i18 > 0) {
                    Rect rect6 = this.f8648g;
                    i18 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i18) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                } else {
                    z16 = false;
                }
            }
        }
        if (z16) {
            super.onMeasure(iMakeMeasureSpec, i16);
        }
    }

    public void setAttachListener(a aVar) {
        this.f8649h = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.f8648g = new Rect();
    }
}
