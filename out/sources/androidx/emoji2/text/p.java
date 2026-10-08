package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Paint f12333g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextPaint f12334f;

    public p(o oVar) {
        super(oVar);
    }

    private TextPaint c(CharSequence charSequence, int i15, int i16, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i15, i16, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f12334f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f12334f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    if (!(characterStyle instanceof MetricAffectingSpan)) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    private static Paint e() {
        if (f12333g == null) {
            TextPaint textPaint = new TextPaint();
            f12333g = textPaint;
            textPaint.setColor(e.c().e());
            f12333g.setStyle(Paint.Style.FILL);
        }
        return f12333g;
    }

    void d(Canvas canvas, TextPaint textPaint, float f15, float f16, float f17, float f18) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f15, f17, f16, f18, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i15, int i16, float f15, int i17, int i18, int i19, Paint paint) {
        TextPaint textPaintC = c(charSequence, i15, i16, paint);
        if (textPaintC != null && textPaintC.bgColor != 0) {
            d(canvas, textPaintC, f15, f15 + b(), i17, i19);
        }
        Paint paint2 = textPaintC;
        if (e.c().l()) {
            canvas.drawRect(f15, i17, f15 + b(), i19, e());
        }
        o oVarA = a();
        float f16 = i18;
        if (paint2 == null) {
            paint2 = paint;
        }
        oVarA.a(canvas, f15, f16, paint2);
    }
}
