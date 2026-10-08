package h6;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public class f implements Spannable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f81202d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spannable f81203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f81204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PrecomputedText f81205c;

    public a a() {
        return this.f81204b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f81203a;
        if (c.a(spannable)) {
            return d.a(spannable);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i15) {
        return this.f81203a.charAt(i15);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f81203a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f81203a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f81203a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i15, int i16, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f81205c.getSpans(i15, i16, cls) : (T[]) this.f81203a.getSpans(i15, i16, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f81203a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i15, int i16, Class cls) {
        return this.f81203a.nextSpanTransition(i15, i16, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f81205c.removeSpan(obj);
        } else {
            this.f81203a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i15, int i16, int i17) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f81205c.setSpan(obj, i15, i16, i17);
        } else {
            this.f81203a.setSpan(obj, i15, i16, i17);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i15, int i16) {
        return this.f81203a.subSequence(i15, i16);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f81203a.toString();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f81206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f81207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f81208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f81209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f81210e;

        /* JADX INFO: renamed from: h6.f$a$a, reason: collision with other inner class name */
        public static class C1872a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f81211a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f81213c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f81214d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f81212b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C1872a(TextPaint textPaint) {
                this.f81211a = textPaint;
            }

            public a a() {
                return new a(this.f81211a, this.f81212b, this.f81213c, this.f81214d);
            }

            public C1872a b(int i15) {
                this.f81213c = i15;
                return this;
            }

            public C1872a c(int i15) {
                this.f81214d = i15;
                return this;
            }

            public C1872a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f81212b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i15, int i16) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f81210e = e.a(textPaint).setBreakStrategy(i15).setHyphenationFrequency(i16).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f81210e = null;
            }
            this.f81206a = textPaint;
            this.f81207b = textDirectionHeuristic;
            this.f81208c = i15;
            this.f81209d = i16;
        }

        public boolean a(a aVar) {
            if (this.f81208c != aVar.b() || this.f81209d != aVar.c() || this.f81206a.getTextSize() != aVar.e().getTextSize() || this.f81206a.getTextScaleX() != aVar.e().getTextScaleX() || this.f81206a.getTextSkewX() != aVar.e().getTextSkewX() || this.f81206a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f81206a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f81206a.getFlags() != aVar.e().getFlags() || !this.f81206a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f81206a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f81206a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f81208c;
        }

        public int c() {
            return this.f81209d;
        }

        public TextDirectionHeuristic d() {
            return this.f81207b;
        }

        public TextPaint e() {
            return this.f81206a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f81207b == aVar.d();
        }

        public int hashCode() {
            return i6.c.b(Float.valueOf(this.f81206a.getTextSize()), Float.valueOf(this.f81206a.getTextScaleX()), Float.valueOf(this.f81206a.getTextSkewX()), Float.valueOf(this.f81206a.getLetterSpacing()), Integer.valueOf(this.f81206a.getFlags()), this.f81206a.getTextLocales(), this.f81206a.getTypeface(), Boolean.valueOf(this.f81206a.isElegantTextHeight()), this.f81207b, Integer.valueOf(this.f81208c), Integer.valueOf(this.f81209d));
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder("{");
            sb5.append("textSize=" + this.f81206a.getTextSize());
            sb5.append(", textScaleX=" + this.f81206a.getTextScaleX());
            sb5.append(", textSkewX=" + this.f81206a.getTextSkewX());
            sb5.append(", letterSpacing=" + this.f81206a.getLetterSpacing());
            sb5.append(", elegantTextHeight=" + this.f81206a.isElegantTextHeight());
            sb5.append(", textLocale=" + this.f81206a.getTextLocales());
            sb5.append(", typeface=" + this.f81206a.getTypeface());
            sb5.append(", variationSettings=" + this.f81206a.getFontVariationSettings());
            sb5.append(", textDir=" + this.f81207b);
            sb5.append(", breakStrategy=" + this.f81208c);
            sb5.append(", hyphenationFrequency=" + this.f81209d);
            sb5.append("}");
            return sb5.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f81206a = params.getTextPaint();
            this.f81207b = params.getTextDirection();
            this.f81208c = params.getBreakStrategy();
            this.f81209d = params.getHyphenationFrequency();
            this.f81210e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
