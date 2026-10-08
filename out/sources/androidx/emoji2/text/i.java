package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f12300b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f12299a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f12301c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f12302d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f12303e = 1.0f;

    i(o oVar) {
        i6.i.h(oVar, "rasterizer cannot be null");
        this.f12300b = oVar;
    }

    public final o a() {
        return this.f12300b;
    }

    final int b() {
        return this.f12301c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i15, int i16, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f12299a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f12299a;
        this.f12303e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f12300b.e();
        this.f12302d = (short) (this.f12300b.e() * this.f12303e);
        short sI = (short) (this.f12300b.i() * this.f12303e);
        this.f12301c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f12299a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
