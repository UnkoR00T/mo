package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class f {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f28954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f28955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f28956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f28957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f28958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextPaint f28959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f28960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f28961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f28962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Layout.Alignment f28963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f28964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f28965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f28966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f28968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f28969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f28970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f28971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f28972s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28973t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f28974u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f28975v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f28976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f28977x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f28978y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f28979z;

    public f(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f28958e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f28957d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f28954a = fRound;
        this.f28955b = fRound;
        this.f28956c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f28959f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f28960g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f28961h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f28964k, (Rect) null, this.J, this.f28961h);
    }

    private void d(Canvas canvas, boolean z15) {
        if (z15) {
            e(canvas);
            return;
        }
        bg.a.b(this.J);
        bg.a.b(this.f28964k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f28974u) > 0) {
            this.f28960g.setColor(this.f28974u);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f28960g);
        } else {
            canvas2 = canvas;
        }
        int i15 = this.f28976w;
        if (i15 == 1) {
            this.f28959f.setStrokeJoin(Paint.Join.ROUND);
            this.f28959f.setStrokeWidth(this.f28954a);
            this.f28959f.setColor(this.f28975v);
            this.f28959f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i15 == 2) {
            TextPaint textPaint = this.f28959f;
            float f15 = this.f28955b;
            float f16 = this.f28956c;
            textPaint.setShadowLayer(f15, f16, f16, this.f28975v);
        } else if (i15 == 3 || i15 == 4) {
            boolean z15 = i15 == 3;
            int i16 = z15 ? -1 : this.f28975v;
            int i17 = z15 ? this.f28975v : -1;
            float f17 = this.f28955b / 2.0f;
            this.f28959f.setColor(this.f28972s);
            this.f28959f.setStyle(Paint.Style.FILL);
            float f18 = -f17;
            this.f28959f.setShadowLayer(this.f28955b, f18, f18, i16);
            staticLayout2.draw(canvas2);
            this.f28959f.setShadowLayer(this.f28955b, f17, f17, i17);
        }
        this.f28959f.setColor(this.f28972s);
        this.f28959f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.f28959f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    private void f() {
        float f15;
        int i15;
        float f16;
        Bitmap bitmap = this.f28964k;
        int i16 = this.C;
        int i17 = this.A;
        int i18 = this.D;
        int i19 = this.B;
        float f17 = i16 - i17;
        float f18 = i17 + (this.f28968o * f17);
        float f19 = i18 - i19;
        float f25 = i19 + (this.f28965l * f19);
        int iRound = Math.round(f17 * this.f28970q);
        float f26 = this.f28971r;
        int iRound2 = f26 != -3.4028235E38f ? Math.round(f19 * f26) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i25 = this.f28969p;
        if (i25 != 2) {
            if (i25 == 1) {
                f15 = iRound / 2;
            }
            int iRound3 = Math.round(f18);
            i15 = this.f28967n;
            if (i15 == 2) {
                if (i15 == 1) {
                    f16 = iRound2 / 2;
                }
                int iRound4 = Math.round(f25);
                this.J = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f16 = iRound2;
            f25 -= f16;
            int iRound5 = Math.round(f25);
            this.J = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f15 = iRound;
        f18 -= f15;
        int iRound6 = Math.round(f18);
        i15 = this.f28967n;
        if (i15 == 2) {
            if (i15 == 1) {
                f16 = iRound2 / 2;
            }
            int iRound7 = Math.round(f25);
            this.J = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f16 = iRound2;
        f25 -= f16;
        int iRound8 = Math.round(f25);
        this.J = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    private void g() {
        int iMax;
        int iMin;
        int iRound;
        CharSequence charSequence = this.f28962i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f28962i);
        int i15 = this.C - this.A;
        int i16 = this.D - this.B;
        this.f28959f.setTextSize(this.f28977x);
        int i17 = (int) ((this.f28977x * 0.125f) + 0.5f);
        int i18 = i17 * 2;
        int i19 = i15 - i18;
        float f15 = this.f28970q;
        float f16 = -3.4028235E38f;
        if (f15 != -3.4028235E38f) {
            i19 = (int) (i19 * f15);
        }
        int i25 = i19;
        String str = "SubtitlePainter";
        if (i25 <= 0) {
            bg.b.a("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f28978y > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f28978y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f28976w == 1) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class);
            int length = foregroundColorSpanArr.length;
            int i26 = 0;
            while (i26 < length) {
                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i26]);
                i26++;
                f16 = f16;
            }
        }
        float f17 = f16;
        if (Color.alpha(this.f28973t) > 0) {
            int i27 = this.f28976w;
            if (i27 == 0 || i27 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f28973t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f28973t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f28963j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f28959f, i25, alignment2, this.f28957d, this.f28958e, true);
        this.E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.E.getLineCount();
        int iMax2 = 0;
        int i28 = 0;
        while (i28 < lineCount) {
            iMax2 = Math.max((int) Math.ceil(this.E.getLineWidth(i28)), iMax2);
            i28++;
            str = str;
        }
        String str2 = str;
        if (this.f28970q == f17 || iMax2 >= i25) {
            i25 = iMax2;
        }
        int i29 = i25 + i18;
        float f18 = this.f28968o;
        if (f18 != f17) {
            int iRound2 = Math.round(i15 * f18);
            int i35 = this.A;
            int i36 = iRound2 + i35;
            int i37 = this.f28969p;
            if (i37 == 1) {
                i36 = ((i36 * 2) - i29) / 2;
            } else if (i37 == 2) {
                i36 -= i29;
            }
            iMax = Math.max(i36, i35);
            iMin = Math.min(i29 + iMax, this.C);
        } else {
            iMax = ((i15 - i29) / 2) + this.A;
            iMin = iMax + i29;
        }
        int i38 = iMin - iMax;
        if (i38 <= 0) {
            bg.b.a(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f19 = this.f28965l;
        if (f19 != f17) {
            if (this.f28966m == 0) {
                iRound = Math.round(i16 * f19) + this.B;
                int i39 = this.f28967n;
                if (i39 == 2) {
                    iRound -= height;
                } else if (i39 == 1) {
                    iRound = ((iRound * 2) - height) / 2;
                }
            } else {
                int lineBottom = this.E.getLineBottom(0) - this.E.getLineTop(0);
                float f25 = this.f28965l;
                if (f25 >= 0.0f) {
                    iRound = Math.round(f25 * lineBottom) + this.B;
                } else {
                    iRound = Math.round((f25 + 1.0f) * lineBottom) + this.D;
                    iRound -= height;
                }
            }
            int i45 = iRound + height;
            int i46 = this.D;
            if (i45 > i46) {
                iRound = i46 - height;
            } else {
                int i47 = this.B;
                if (iRound < i47) {
                    iRound = i47;
                }
            }
        } else {
            iRound = (this.D - height) - ((int) (i16 * this.f28979z));
        }
        this.E = new StaticLayout(spannableStringBuilder, this.f28959f, i38, alignment2, this.f28957d, this.f28958e, true);
        this.F = new StaticLayout(spannableStringBuilder2, this.f28959f, i38, alignment2, this.f28957d, this.f28958e, true);
        this.G = iMax;
        this.H = iRound;
        this.I = i17;
    }

    public void b(wf.a aVar, zf.a aVar2, float f15, float f16, float f17, Canvas canvas, int i15, int i16, int i17, int i18) {
        int i19;
        boolean z15 = aVar.f212948d == null;
        if (!z15) {
            i19 = -16777216;
        } else if (TextUtils.isEmpty(aVar.f212945a)) {
            return;
        } else {
            i19 = aVar.f212956l ? aVar.f212957m : aVar2.f234964c;
        }
        if (a(this.f28962i, aVar.f212945a) && bg.c.a(this.f28963j, aVar.f212946b) && this.f28964k == aVar.f212948d && this.f28965l == aVar.f212949e && this.f28966m == aVar.f212950f && bg.c.a(Integer.valueOf(this.f28967n), Integer.valueOf(aVar.f212951g)) && this.f28968o == aVar.f212952h && bg.c.a(Integer.valueOf(this.f28969p), Integer.valueOf(aVar.f212953i)) && this.f28970q == aVar.f212954j && this.f28971r == aVar.f212955k && this.f28972s == aVar2.f234962a && this.f28973t == aVar2.f234963b && this.f28974u == i19 && this.f28976w == aVar2.f234965d && this.f28975v == aVar2.f234966e && bg.c.a(this.f28959f.getTypeface(), aVar2.f234967f) && this.f28977x == f15 && this.f28978y == f16 && this.f28979z == f17 && this.A == i15 && this.B == i16 && this.C == i17 && this.D == i18) {
            d(canvas, z15);
            return;
        }
        this.f28962i = aVar.f212945a;
        this.f28963j = aVar.f212946b;
        this.f28964k = aVar.f212948d;
        this.f28965l = aVar.f212949e;
        this.f28966m = aVar.f212950f;
        this.f28967n = aVar.f212951g;
        this.f28968o = aVar.f212952h;
        this.f28969p = aVar.f212953i;
        this.f28970q = aVar.f212954j;
        this.f28971r = aVar.f212955k;
        this.f28972s = aVar2.f234962a;
        this.f28973t = aVar2.f234963b;
        this.f28974u = i19;
        this.f28976w = aVar2.f234965d;
        this.f28975v = aVar2.f234966e;
        this.f28959f.setTypeface(aVar2.f234967f);
        this.f28977x = f15;
        this.f28978y = f16;
        this.f28979z = f17;
        this.A = i15;
        this.B = i16;
        this.C = i17;
        this.D = i18;
        if (z15) {
            bg.a.b(this.f28962i);
            g();
        } else {
            bg.a.b(this.f28964k);
            f();
        }
        d(canvas, z15);
    }
}
