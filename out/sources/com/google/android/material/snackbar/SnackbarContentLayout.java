package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import gj.e;
import ri.d;
import ri.f;

/* JADX INFO: loaded from: classes4.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f35563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f35564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f35565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35566d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35565c = e.g(context, ri.b.F, si.a.f181917b);
    }

    private static void c(View view, int i15, int i16) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i15, view.getPaddingEnd(), i16);
        } else {
            view.setPadding(view.getPaddingLeft(), i15, view.getPaddingRight(), i16);
        }
    }

    private boolean d(int i15, int i16, int i17) {
        boolean z15;
        if (i15 != getOrientation()) {
            setOrientation(i15);
            z15 = true;
        } else {
            z15 = false;
        }
        if (this.f35563a.getPaddingTop() == i16 && this.f35563a.getPaddingBottom() == i17) {
            return z15;
        }
        c(this.f35563a, i16, i17);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i15, int i16) {
        this.f35563a.setAlpha(0.0f);
        long j15 = i16;
        long j16 = i15;
        this.f35563a.animate().alpha(1.0f).setDuration(j15).setInterpolator(this.f35565c).setStartDelay(j16).start();
        if (this.f35564b.getVisibility() == 0) {
            this.f35564b.setAlpha(0.0f);
            this.f35564b.animate().alpha(1.0f).setDuration(j15).setInterpolator(this.f35565c).setStartDelay(j16).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i15, int i16) {
        this.f35563a.setAlpha(1.0f);
        long j15 = i16;
        long j16 = i15;
        this.f35563a.animate().alpha(0.0f).setDuration(j15).setInterpolator(this.f35565c).setStartDelay(j16).start();
        if (this.f35564b.getVisibility() == 0) {
            this.f35564b.setAlpha(1.0f);
            this.f35564b.animate().alpha(0.0f).setDuration(j15).setInterpolator(this.f35565c).setStartDelay(j16).start();
        }
    }

    public Button getActionView() {
        return this.f35564b;
    }

    public TextView getMessageView() {
        return this.f35563a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f35563a = (TextView) findViewById(f.J);
        this.f35564b = (Button) findViewById(f.I);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(d.f173948f);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(d.f173946e);
        Layout layout = this.f35563a.getLayout();
        boolean z15 = layout != null && layout.getLineCount() > 1;
        if (!z15 || this.f35566d <= 0 || this.f35564b.getMeasuredWidth() <= this.f35566d) {
            if (!z15) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!d(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!d(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i15, i16);
    }

    public void setMaxInlineActionWidth(int i15) {
        this.f35566d = i15;
    }
}
