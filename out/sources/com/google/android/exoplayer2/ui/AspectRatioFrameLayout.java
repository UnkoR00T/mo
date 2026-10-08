package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f28903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f28904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28905c;

    public interface b {
    }

    private final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f28906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f28907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f28908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f28909d;

        private c() {
        }

        public void a(float f15, float f16, boolean z15) {
            this.f28906a = f15;
            this.f28907b = f16;
            this.f28908c = z15;
            if (this.f28909d) {
                return;
            }
            this.f28909d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28909d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28905c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, zf.e.f234974a, 0, 0);
            try {
                this.f28905c = typedArrayObtainStyledAttributes.getInt(zf.e.f234975b, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th4) {
                typedArrayObtainStyledAttributes.recycle();
                throw th4;
            }
        }
        this.f28903a = new c();
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f28905c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        float f15;
        float f16;
        super.onMeasure(i15, i16);
        if (this.f28904b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f17 = measuredWidth;
        float f18 = measuredHeight;
        float f19 = f17 / f18;
        float f25 = (this.f28904b / f19) - 1.0f;
        if (Math.abs(f25) <= 0.01f) {
            this.f28903a.a(this.f28904b, f19, false);
            return;
        }
        int i17 = this.f28905c;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 == 2) {
                    f15 = this.f28904b;
                } else if (i17 == 4) {
                    if (f25 > 0.0f) {
                        f15 = this.f28904b;
                    } else {
                        f16 = this.f28904b;
                    }
                }
                measuredWidth = (int) (f18 * f15);
            } else {
                f16 = this.f28904b;
            }
            measuredHeight = (int) (f17 / f16);
        } else if (f25 > 0.0f) {
            f16 = this.f28904b;
            measuredHeight = (int) (f17 / f16);
        } else {
            f15 = this.f28904b;
            measuredWidth = (int) (f18 * f15);
        }
        this.f28903a.a(this.f28904b, f19, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f15) {
        if (this.f28904b != f15) {
            this.f28904b = f15;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i15) {
        if (this.f28905c != i15) {
            this.f28905c = i15;
            requestLayout();
        }
    }
}
