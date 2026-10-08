package a5;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import fr.t;
import n3.n2;
import n3.r0;
import oq.p;
import p071kotlin.Metadata;
import p3.Stroke;
import p3.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"La5/d;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lp3/g;", "drawStyle", "<init>", "(Lp3/g;)V", "Landroid/text/TextPaint;", "textPaint", "Loq/i0;", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Lp3/g;", "getDrawStyle", "()Lp3/g;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p3.g drawStyle;

    public d(p3.g gVar) {
        this.drawStyle = gVar;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            p3.g gVar = this.drawStyle;
            if (t.c(gVar, j.f152592b)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(gVar instanceof Stroke)) {
                throw new p();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
            textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
            textPaint.setStrokeJoin(e.b(((Stroke) this.drawStyle).getJoin()));
            textPaint.setStrokeCap(e.a(((Stroke) this.drawStyle).getCap()));
            n2 pathEffect = ((Stroke) this.drawStyle).getPathEffect();
            textPaint.setPathEffect(pathEffect != null ? r0.b(pathEffect) : null);
        }
    }
}
