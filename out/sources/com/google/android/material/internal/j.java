package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f35404o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f35405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f35406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35407c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35409e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35416l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k f35418n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35408d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f35410f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35411g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f35412h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f35413i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35414j = f35404o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35415k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f35417m = null;

    public static class a extends Exception {
    }

    private j(CharSequence charSequence, TextPaint textPaint, int i15) {
        this.f35405a = charSequence;
        this.f35406b = textPaint;
        this.f35407c = i15;
        this.f35409e = charSequence.length();
    }

    public static j b(CharSequence charSequence, TextPaint textPaint, int i15) {
        return new j(charSequence, textPaint, i15);
    }

    public StaticLayout a() {
        if (this.f35405a == null) {
            this.f35405a = "";
        }
        int iMax = Math.max(0, this.f35407c);
        CharSequence charSequenceEllipsize = this.f35405a;
        if (this.f35411g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f35406b, iMax, this.f35417m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f35409e);
        this.f35409e = iMin;
        if (this.f35416l && this.f35411g == 1) {
            this.f35410f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f35408d, iMin, this.f35406b, iMax);
        builderObtain.setAlignment(this.f35410f);
        builderObtain.setIncludePad(this.f35415k);
        builderObtain.setTextDirection(this.f35416l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f35417m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f35411g);
        float f15 = this.f35412h;
        if (f15 != 0.0f || this.f35413i != 1.0f) {
            builderObtain.setLineSpacing(f15, this.f35413i);
        }
        if (this.f35411g > 1) {
            builderObtain.setHyphenationFrequency(this.f35414j);
        }
        k kVar = this.f35418n;
        if (kVar != null) {
            kVar.a(builderObtain);
        }
        return builderObtain.build();
    }

    public j c(Layout.Alignment alignment) {
        this.f35410f = alignment;
        return this;
    }

    public j d(TextUtils.TruncateAt truncateAt) {
        this.f35417m = truncateAt;
        return this;
    }

    public j e(int i15) {
        this.f35414j = i15;
        return this;
    }

    public j f(boolean z15) {
        this.f35415k = z15;
        return this;
    }

    public j g(boolean z15) {
        this.f35416l = z15;
        return this;
    }

    public j h(float f15, float f16) {
        this.f35412h = f15;
        this.f35413i = f16;
        return this;
    }

    public j i(int i15) {
        this.f35411g = i15;
        return this;
    }

    public j j(k kVar) {
        this.f35418n = kVar;
        return this;
    }
}
