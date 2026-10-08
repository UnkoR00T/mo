package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import io.sentry.android.core.c2;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
class d0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final RectF f8818l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f8819m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8820a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8821b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f8822c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f8823d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f8824e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f8825f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8826g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f8827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f8828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f8829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f8830k;

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i15, int i16, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i15);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i16 == -1) {
                i16 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i16);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                c2.g("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.d0.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) d0.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.d0.b, androidx.appcompat.widget.d0.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.d0.d
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class d {
        d() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        boolean b(TextView textView) {
            return ((Boolean) d0.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    d0(TextView textView) {
        this.f8828i = textView;
        this.f8829j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f8830k = new c();
        } else {
            this.f8830k = new b();
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr) {
                if (i15 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i15)) < 0) {
                    arrayList.add(Integer.valueOf(i15));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i16 = 0; i16 < size; i16++) {
                    iArr2[i16] = ((Integer) arrayList.get(i16)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void c() {
        this.f8820a = 0;
        this.f8823d = -1.0f;
        this.f8824e = -1.0f;
        this.f8822c = -1.0f;
        this.f8825f = new int[0];
        this.f8821b = false;
    }

    private int e(RectF rectF) {
        int length = this.f8825f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i15 = 1;
        int i16 = length - 1;
        int i17 = 0;
        while (i15 <= i16) {
            int i18 = (i15 + i16) / 2;
            if (x(this.f8825f[i18], rectF)) {
                int i19 = i18 + 1;
                i17 = i15;
                i15 = i19;
            } else {
                i17 = i18 - 1;
                i16 = i17;
            }
        }
        return this.f8825f[i17];
    }

    private static Method k(String str) {
        try {
            Method declaredMethod = f8819m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f8819m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e15) {
            c2.h("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e15);
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    static <T> T m(Object obj, String str, T t15) {
        try {
            return (T) k(str).invoke(obj, null);
        } catch (Exception e15) {
            c2.h("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e15);
            return t15;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private void s(float f15) {
        if (f15 != this.f8828i.getPaint().getTextSize()) {
            this.f8828i.getPaint().setTextSize(f15);
            boolean zIsInLayout = this.f8828i.isInLayout();
            if (this.f8828i.getLayout() != null) {
                this.f8821b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f8828i, null);
                    }
                } catch (Exception e15) {
                    c2.h("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e15);
                }
                if (zIsInLayout) {
                    this.f8828i.forceLayout();
                } else {
                    this.f8828i.requestLayout();
                }
                this.f8828i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f8820a == 1) {
            if (!this.f8826g || this.f8825f.length == 0) {
                int iFloor = ((int) Math.floor((this.f8824e - this.f8823d) / this.f8822c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i15 = 0; i15 < iFloor; i15++) {
                    iArr[i15] = Math.round(this.f8823d + (i15 * this.f8822c));
                }
                this.f8825f = b(iArr);
            }
            this.f8821b = true;
        } else {
            this.f8821b = false;
        }
        return this.f8821b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i15 = 0; i15 < length; i15++) {
                iArr[i15] = typedArray.getDimensionPixelSize(i15, -1);
            }
            this.f8825f = b(iArr);
            w();
        }
    }

    private boolean w() {
        int[] iArr = this.f8825f;
        int length = iArr.length;
        boolean z15 = length > 0;
        this.f8826g = z15;
        if (z15) {
            this.f8820a = 1;
            this.f8823d = iArr[0];
            this.f8824e = iArr[length - 1];
            this.f8822c = -1.0f;
        }
        return z15;
    }

    private boolean x(int i15, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f8828i.getText();
        TransformationMethod transformationMethod = this.f8828i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f8828i)) != null) {
            text = transformation;
        }
        int maxLines = this.f8828i.getMaxLines();
        l(i15);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f8828i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f8828i instanceof l);
    }

    private void z(float f15, float f16, float f17) {
        if (f15 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f15 + "px) is less or equal to (0px)");
        }
        if (f16 <= f15) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f16 + "px) is less or equal to minimum auto-size text size (" + f15 + "px)");
        }
        if (f17 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f17 + "px) is less or equal to (0px)");
        }
        this.f8820a = 1;
        this.f8823d = f15;
        this.f8824e = f16;
        this.f8822c = f17;
        this.f8826g = false;
    }

    void a() {
        if (n()) {
            if (this.f8821b) {
                if (this.f8828i.getMeasuredHeight() <= 0 || this.f8828i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f8830k.b(this.f8828i) ? PKIFailureInfo.badCertTemplate : (this.f8828i.getMeasuredWidth() - this.f8828i.getTotalPaddingLeft()) - this.f8828i.getTotalPaddingRight();
                int height = (this.f8828i.getHeight() - this.f8828i.getCompoundPaddingBottom()) - this.f8828i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f8818l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f8828i.getTextSize()) {
                            t(0, fE);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
            this.f8821b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i15, int i16) {
        return a.a(charSequence, alignment, i15, i16, this.f8828i, this.f8827h, this.f8830k);
    }

    int f() {
        return Math.round(this.f8824e);
    }

    int g() {
        return Math.round(this.f8823d);
    }

    int h() {
        return Math.round(this.f8822c);
    }

    int[] i() {
        return this.f8825f;
    }

    int j() {
        return this.f8820a;
    }

    void l(int i15) {
        TextPaint textPaint = this.f8827h;
        if (textPaint == null) {
            this.f8827h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f8827h.set(this.f8828i.getPaint());
        this.f8827h.setTextSize(i15);
    }

    boolean n() {
        return y() && this.f8820a != 0;
    }

    void o(AttributeSet attributeSet, int i15) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f8829j.obtainStyledAttributes(attributeSet, p007NuL.v.f468g0, i15, 0);
        TextView textView = this.f8828i;
        j6.l0.f0(textView, textView.getContext(), p007NuL.v.f468g0, attributeSet, typedArrayObtainStyledAttributes, i15, 0);
        if (typedArrayObtainStyledAttributes.hasValue(p007NuL.v.f493l0)) {
            this.f8820a = typedArrayObtainStyledAttributes.getInt(p007NuL.v.f493l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(p007NuL.v.f488k0) ? typedArrayObtainStyledAttributes.getDimension(p007NuL.v.f488k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(p007NuL.v.f478i0) ? typedArrayObtainStyledAttributes.getDimension(p007NuL.v.f478i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(p007NuL.v.f473h0) ? typedArrayObtainStyledAttributes.getDimension(p007NuL.v.f473h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(p007NuL.v.f483j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(p007NuL.v.f483j0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f8820a = 0;
            return;
        }
        if (this.f8820a == 1) {
            if (!this.f8826g) {
                DisplayMetrics displayMetrics = this.f8829j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i15, int i16, int i17, int i18) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f8829j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i18, i15, displayMetrics), TypedValue.applyDimension(i18, i16, displayMetrics), TypedValue.applyDimension(i18, i17, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i15) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i15 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f8829j.getResources().getDisplayMetrics();
                    for (int i16 = 0; i16 < length; i16++) {
                        iArrCopyOf[i16] = Math.round(TypedValue.applyDimension(i15, iArr[i16], displayMetrics));
                    }
                }
                this.f8825f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f8826g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i15) {
        if (y()) {
            if (i15 == 0) {
                c();
                return;
            }
            if (i15 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i15);
            }
            DisplayMetrics displayMetrics = this.f8829j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i15, float f15) {
        Context context = this.f8829j;
        s(TypedValue.applyDimension(i15, f15, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
