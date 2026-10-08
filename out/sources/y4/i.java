package y4;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import n3.Shadow;
import n3.a1;
import n3.k2;
import n3.l2;
import n3.o0;
import n3.o1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.x5;
import p3.Stroke;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R(\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b0\u0010\n\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0012R\u0018\u00103\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R*\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001c\u00104\u0012\u0004\b9\u0010\n\u001a\u0004\b5\u00106\"\u0004\b7\u00108R2\u0010C\u001a\u0012\u0012\f\u0012\n\u0018\u00010;j\u0004\u0018\u0001`<\u0018\u00010:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010J\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010D\u0012\u0004\bI\u0010\n\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010KR\u0014\u0010M\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010LR$\u0010Q\u001a\u00020'2\u0006\u0010N\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010O\"\u0004\b1\u0010P¨\u0006R"}, d2 = {"Ly4/i;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "Loq/i0;", "b", "()V", "Lb5/k;", "textDecoration", "k", "(Lb5/k;)V", "Ln3/w2;", "shadow", "j", "(Ln3/w2;)V", "Landroidx/compose/ui/graphics/Color;", "color", "h", "(J)V", "Landroidx/compose/ui/graphics/c;", "brush", "Lm3/k;", "size", "alpha", "f", "(Landroidx/compose/ui/graphics/c;JF)V", "Lp3/g;", "drawStyle", "i", "(Lp3/g;)V", "Ln3/k2;", "a", "Ln3/k2;", "backingComposePaint", "Lb5/k;", "Ln3/a1;", "c", "I", "backingBlendMode", "d", "Ln3/w2;", "getShadow$ui_text", "()Ln3/w2;", "setShadow$ui_text", "getShadow$ui_text$annotations", "e", "Landroidx/compose/ui/graphics/Color;", "lastColor", "Landroidx/compose/ui/graphics/c;", "getBrush$ui_text", "()Landroidx/compose/ui/graphics/c;", "setBrush$ui_text", "(Landroidx/compose/ui/graphics/c;)V", "getBrush$ui_text$annotations", "Lm2/f6;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "g", "Lm2/f6;", "getShaderState$ui_text", "()Lm2/f6;", "setShaderState$ui_text", "(Lm2/f6;)V", "shaderState", "Lm3/k;", "getBrushSize-VsRJwc0$ui_text", "()Lm3/k;", "setBrushSize-iaC8Vc4$ui_text", "(Lm3/k;)V", "getBrushSize-VsRJwc0$ui_text$annotations", "brushSize", "Lp3/g;", "()Ln3/k2;", "composePaint", "value", "()I", "(I)V", "blendMode", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private k2 backingComposePaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private b5.k textDecoration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int backingBlendMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Shadow shadow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Color lastColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.graphics.c brush;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private f6<? extends Shader> shaderState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private m3.k brushSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private p3.g drawStyle;

    public i(int i15, float f15) {
        super(i15);
        ((TextPaint) this).density = f15;
        this.textDecoration = b5.k.INSTANCE.c();
        this.backingBlendMode = p3.f.INSTANCE.a();
        this.shadow = Shadow.INSTANCE.a();
    }

    private final void b() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    private final k2 d() {
        k2 k2Var = this.backingComposePaint;
        if (k2Var != null) {
            return k2Var;
        }
        k2 k2VarB = o0.b(this);
        this.backingComposePaint = k2VarB;
        return k2VarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader g(androidx.compose.ui.graphics.c cVar, long j15) {
        return ((androidx.compose.ui.graphics.h) cVar).c(j15);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBackingBlendMode() {
        return this.backingBlendMode;
    }

    public final void e(int i15) {
        if (a1.E(i15, this.backingBlendMode)) {
            return;
        }
        d().f(i15);
        this.backingBlendMode = i15;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    public final void f(final androidx.compose.ui.graphics.c brush, final long size, float alpha) {
        if (brush == null) {
            b();
            return;
        }
        if (brush instanceof SolidColor) {
            h(b5.m.c(((SolidColor) brush).getValue(), alpha));
            return;
        }
        if (!(brush instanceof androidx.compose.ui.graphics.h)) {
            throw new oq.p();
        }
        if (fr.t.c(this.brush, brush)) {
            m3.k kVar = this.brushSize;
            if (!(kVar == null ? false : m3.k.f(kVar.getPackedValue(), size))) {
                if (size != 9205357640488583168L) {
                    this.brush = brush;
                    this.brushSize = m3.k.c(size);
                    this.shaderState = x5.d(new er.a() { // from class: y4.h
                        @Override // er.a
                        public final Object a() {
                            return i.g(brush, size);
                        }
                    });
                }
            }
        } else {
            if (size != 9205357640488583168L) {
                this.brush = brush;
                this.brushSize = m3.k.c(size);
                this.shaderState = x5.d(new er.a() { // from class: y4.h
                    @Override // er.a
                    public final Object a() {
                        return i.g(brush, size);
                    }
                });
            }
        }
        k2 k2VarD = d();
        f6<? extends Shader> f6Var = this.shaderState;
        k2VarD.q(f6Var != null ? f6Var.getValue() : null);
        this.lastColor = null;
        j.a(this, alpha);
    }

    public final void h(long color) {
        Color color2 = this.lastColor;
        if (color2 == null ? false : Color.m11equalsimpl0(color2.m20unboximpl(), color)) {
            return;
        }
        if (color != 16) {
            this.lastColor = Color.m0boximpl(color);
            setColor(o1.j(color));
            b();
        }
    }

    public final void i(p3.g drawStyle) {
        if (drawStyle == null || fr.t.c(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (fr.t.c(drawStyle, p3.j.f152592b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new oq.p();
        }
        d().u(l2.INSTANCE.b());
        Stroke stroke = (Stroke) drawStyle;
        d().v(stroke.getWidth());
        d().s(stroke.getMiter());
        d().l(stroke.getJoin());
        d().i(stroke.getCap());
        d().h(stroke.getPathEffect());
    }

    public final void j(Shadow shadow) {
        if (shadow == null || fr.t.c(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (fr.t.c(shadow, Shadow.INSTANCE.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(z4.e.b(this.shadow.getBlurRadius()), Float.intBitsToFloat((int) (this.shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (this.shadow.getOffset() & BodyPartID.bodyIdMax)), o1.j(this.shadow.getColor()));
        }
    }

    public final void k(b5.k textDecoration) {
        if (textDecoration == null || fr.t.c(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        b5.k.Companion companion = b5.k.INSTANCE;
        setUnderlineText(textDecoration.d(companion.d()));
        setStrikeThruText(this.textDecoration.d(companion.b()));
    }
}
