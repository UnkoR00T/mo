package w0;

import androidx.compose.ui.graphics.SolidColor;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p3.Stroke;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a;\u0010\u001d\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(\u001a\u001b\u0010+\u001a\u00020)*\u00020)2\u0006\u0010*\u001a\u00020\u001bH\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lf3/m;", "Lw0/w;", "border", "Ln3/y2;", "shape", "g", "(Lf3/m;Lw0/w;Ln3/y2;)Lf3/m;", "Lc5/h;", "width", "Landroidx/compose/ui/graphics/Color;", "color", "h", "(Lf3/m;FJLn3/y2;)Lf3/m;", "Landroidx/compose/ui/graphics/c;", "brush", "j", "(Lf3/m;FLandroidx/compose/ui/graphics/c;Ln3/y2;)Lf3/m;", "Lk3/e;", "Lk3/l;", "m", "(Lk3/e;)Lk3/l;", "Lm3/e;", "topLeft", "Lm3/k;", "borderSize", "", "fillArea", "", "strokeWidthPx", "o", "(Lk3/e;Landroidx/compose/ui/graphics/c;JJZF)Lk3/l;", "Ln3/m2;", "targetPath", "Lm3/i;", "roundedRect", "strokeWidth", "l", "(Ln3/m2;Lm3/i;FZ)Ln3/m2;", "widthPx", "k", "(FLm3/i;)Lm3/i;", "Lm3/a;", "value", "q", "(JF)J", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {
    public static final f3.m g(f3.m mVar, BorderStroke borderStroke, n3.y2 y2Var) {
        return j(mVar, borderStroke.getWidth(), borderStroke.getBrush(), y2Var);
    }

    public static final f3.m h(f3.m mVar, float f15, long j15, n3.y2 y2Var) {
        return j(mVar, f15, new SolidColor(j15, null), y2Var);
    }

    public static /* synthetic */ f3.m i(f3.m mVar, float f15, long j15, n3.y2 y2Var, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            y2Var = n3.t2.a();
        }
        return h(mVar, f15, j15, y2Var);
    }

    public static final f3.m j(f3.m mVar, float f15, androidx.compose.ui.graphics.c cVar, n3.y2 y2Var) {
        return mVar.u(new BorderModifierNodeElement(f15, cVar, y2Var, null));
    }

    private static final m3.i k(float f15, m3.i iVar) {
        return new m3.i(f15, f15, iVar.l() - f15, iVar.f() - f15, q(iVar.getTopLeftCornerRadius(), f15), q(iVar.getTopRightCornerRadius(), f15), q(iVar.getBottomRightCornerRadius(), f15), q(iVar.getBottomLeftCornerRadius(), f15), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3.m2 l(n3.m2 m2Var, m3.i iVar, float f15, boolean z15) {
        m2Var.reset();
        n3.m2.o(m2Var, iVar, null, 2, null);
        if (!z15) {
            n3.m2 m2VarA = n3.u0.a();
            n3.m2.o(m2VarA, k(f15, iVar), null, 2, null);
            m2Var.e(m2Var, m2VarA, n3.q2.INSTANCE.a());
        }
        return m2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3.l m(k3.e eVar) {
        return eVar.e(new er.l() { // from class: w0.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.n((p3.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(p3.c cVar) {
        cVar.H2();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3.l o(k3.e eVar, final androidx.compose.ui.graphics.c cVar, long j15, long j16, boolean z15, float f15) {
        final long jC = z15 ? m3.e.INSTANCE.c() : j15;
        final long jA = z15 ? eVar.a() : j16;
        final p3.g stroke = z15 ? p3.j.f152592b : new Stroke(f15, 0.0f, 0, 0, null, 30, null);
        return eVar.e(new er.l() { // from class: w0.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.p(cVar, jC, jA, stroke, (p3.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(androidx.compose.ui.graphics.c cVar, long j15, long j16, p3.g gVar, p3.c cVar2) {
        cVar2.H2();
        p3.f.F1(cVar2, cVar, j15, j16, 0.0f, gVar, null, 0, 104, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long q(long j15, float f15) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j15 >> 32)) - f15);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) - f15);
        return m3.a.b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & BodyPartID.bodyIdMax));
    }
}
