package a5;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.h;
import m3.k;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;
import p076m2.x5;
import y4.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a\"\u0004\b\u0018\u0010\u001bR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"La5/g;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroidx/compose/ui/graphics/h;", "shaderBrush", "", "alpha", "<init>", "(Landroidx/compose/ui/graphics/h;F)V", "Landroid/text/TextPaint;", "textPaint", "Loq/i0;", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Landroidx/compose/ui/graphics/h;", "getShaderBrush", "()Landroidx/compose/ui/graphics/h;", "b", "F", "getAlpha", "()F", "Lm3/k;", "<set-?>", "c", "Lm2/a3;", "()J", "(J)V", "size", "Lm2/f6;", "Landroid/graphics/Shader;", "d", "Lm2/f6;", "shaderState", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h shaderBrush;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 size = c6.e(k.c(k.INSTANCE.a()), null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f6<Shader> shaderState = x5.d(new er.a() { // from class: a5.f
        @Override // er.a
        public final Object a() {
            return g.d(this.f3457a);
        }
    });

    public g(h hVar, float f15) {
        this.shaderBrush = hVar;
        this.alpha = f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader d(g gVar) {
        if (gVar.b() == 9205357640488583168L || k.k(gVar.b())) {
            return null;
        }
        return gVar.shaderBrush.c(gVar.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        return ((k) this.size.getValue()).getPackedValue();
    }

    public final void c(long j15) {
        this.size.setValue(k.c(j15));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        j.a(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
