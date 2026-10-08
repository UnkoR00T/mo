package a5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.h;
import fr.t;
import m3.j;
import n3.i2;
import n3.m2;
import n3.n2;
import n3.o1;
import n3.p0;
import n3.r0;
import n3.u0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p3.Stroke;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\u000f\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroid/graphics/Paint;", "Lp3/g;", "value", "Loq/i0;", "f", "(Landroid/graphics/Paint;Lp3/g;)V", "Ln3/i2;", "Landroid/graphics/Canvas;", "canvas", "paint", "", "xStart", "yCenter", "", "dir", "d", "(Ln3/i2;Landroid/graphics/Canvas;Landroid/graphics/Paint;FFI)V", "Landroidx/compose/ui/graphics/c;", "brush", "alpha", "Lm3/k;", "size", "Lkotlin/Function0;", "draw", "e", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/c;FJLer/a;)V", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(i2 i2Var, Canvas canvas, Paint paint, float f15, float f16, int i15) {
        if (i2Var instanceof i2.a) {
            canvas.save();
            i2.a aVar = (i2.a) i2Var;
            m3.g rect = aVar.getRect();
            canvas.translate(f15, f16 - ((rect.getBottom() - rect.getTop()) / 2.0f));
            m2 path = aVar.getPath();
            if (!(path instanceof p0)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            canvas.drawPath(((p0) path).getInternalPath(), paint);
            canvas.restore();
            return;
        }
        if (!(i2Var instanceof i2.c)) {
            if (!(i2Var instanceof i2.b)) {
                throw new p();
            }
            i2.b bVar = (i2.b) i2Var;
            m3.g gVarB = bVar.b();
            float bottom = f16 - ((gVarB.getBottom() - gVarB.getTop()) / 2.0f);
            m3.g gVarB2 = bVar.b();
            float right = f15 + (i15 * (gVarB2.getRight() - gVarB2.getLeft()));
            m3.g gVarB3 = bVar.b();
            canvas.drawRect(f15, bottom, right, f16 + ((gVarB3.getBottom() - gVarB3.getTop()) / 2.0f), paint);
            return;
        }
        i2.c cVar = (i2.c) i2Var;
        if (j.h(cVar.getRoundRect())) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.getRoundRect().getTopLeftCornerRadius() >> 32));
            canvas.drawRoundRect(f15, f16 - (cVar.getRoundRect().f() / 2.0f), (i15 * cVar.getRoundRect().l()) + f15, (cVar.getRoundRect().f() / 2.0f) + f16, fIntBitsToFloat, fIntBitsToFloat, paint);
            return;
        }
        m2 m2VarA = u0.a();
        m2.o(m2VarA, cVar.getRoundRect(), null, 2, null);
        canvas.save();
        canvas.translate(f15, f16 - (cVar.getRoundRect().f() / 2.0f));
        if (!(m2VarA instanceof p0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((p0) m2VarA).getInternalPath(), paint);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Paint paint, androidx.compose.ui.graphics.c cVar, float f15, long j15, er.a<i0> aVar) {
        Integer numValueOf = null;
        if (cVar == null) {
            if (!Float.isNaN(f15)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f15 * 255.0f));
            }
            aVar.a();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (cVar instanceof SolidColor) {
            int color = paint.getColor();
            if (!Float.isNaN(f15)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f15 * 255.0f));
            }
            paint.setColor(o1.j(((SolidColor) cVar).getValue()));
            aVar.a();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (!(cVar instanceof h)) {
            throw new p();
        }
        Shader shader = paint.getShader();
        if (!Float.isNaN(f15)) {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(f15 * 255.0f));
        }
        paint.setShader(((h) cVar).c(j15));
        aVar.a();
        paint.setShader(shader);
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Paint paint, p3.g gVar) {
        if (t.c(gVar, p3.j.f152592b)) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (!(gVar instanceof Stroke)) {
            throw new p();
        }
        paint.setStyle(Paint.Style.STROKE);
        Stroke stroke = (Stroke) gVar;
        paint.setStrokeWidth(stroke.getWidth());
        paint.setStrokeMiter(stroke.getMiter());
        paint.setStrokeCap(e.a(stroke.getCap()));
        paint.setStrokeJoin(e.b(stroke.getJoin()));
        n2 pathEffect = stroke.getPathEffect();
        paint.setPathEffect(pathEffect != null ? r0.b(pathEffect) : null);
    }
}
