package s3;

import androidx.compose.ui.graphics.CompositeShaderBrush;
import fr.t;
import n3.a1;
import n3.b2;
import n3.c2;
import n3.d2;
import n3.h1;
import n3.i2;
import n3.j1;
import n3.k2;
import n3.l2;
import n3.m2;
import n3.n1;
import n3.o0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010 \u001a\u00020\u001f*\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b \u0010!JQ\u0010'\u001a\u00020\u001f*\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\"\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Ls3/f;", "Ls3/j;", "Ls3/g;", "shadow", "Ln3/i2;", "outline", "<init>", "(Ls3/g;Ln3/i2;)V", "Landroidx/compose/ui/graphics/h;", "shadowMask", "Landroidx/compose/ui/graphics/c;", "brush", "Landroidx/compose/ui/graphics/e;", "h", "(Landroidx/compose/ui/graphics/h;Landroidx/compose/ui/graphics/c;)Landroidx/compose/ui/graphics/e;", "Lm3/k;", "size", "Ln3/m2;", "path", "", "radius", "spread", "offsetX", "offsetY", "f", "(JLn3/m2;FFFF)Landroidx/compose/ui/graphics/h;", "Lm3/a;", "cornerRadius", "g", "(JFFFFJ)Landroidx/compose/ui/graphics/h;", "Lp3/f;", "Loq/i0;", "a", "(Lp3/f;JJLn3/m2;)V", "alpha", "Ln3/n1;", "colorFilter", "Ln3/a1;", "blendMode", "d", "(Lp3/f;JJLn3/m2;FLn3/n1;Landroidx/compose/ui/graphics/c;I)V", "i", "Ls3/g;", "Ln3/k2;", "j", "Ln3/k2;", "paint", "k", "Landroidx/compose/ui/graphics/h;", "l", "Landroidx/compose/ui/graphics/e;", "compositeShader", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends j {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Shadow shadow;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k2 paint;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.graphics.h shadowMask;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private CompositeShaderBrush compositeShader;

    public f(Shadow shadow, i2 i2Var) {
        super(i2Var);
        this.shadow = shadow;
        this.paint = o0.a();
    }

    private final androidx.compose.ui.graphics.h f(long size, m2 path, float radius, float spread, float offsetX, float offsetY) {
        b2 b2VarB;
        int iCeil = (int) Math.ceil(Float.intBitsToFloat((int) (size >> 32)));
        int iCeil2 = (int) Math.ceil(Float.intBitsToFloat((int) (size & BodyPartID.bodyIdMax)));
        if (spread > 0.0f) {
            m3.g bounds = path.getBounds();
            float right = bounds.getRight() - bounds.getLeft();
            float bottom = bounds.getBottom() - bounds.getTop();
            b2VarB = d2.b((int) Math.ceil(right), (int) Math.ceil(bottom), c2.INSTANCE.a(), false, null, 24, null);
            h1 h1VarA = j1.a(b2VarB);
            h1VarA.u(path, this.paint);
            h1.p(h1VarA, 0.0f, 0.0f, right, bottom, 0, 16, null);
            k2 k2VarB = c.b(this.paint, 0L, a1.INSTANCE.a(), null, l2.INSTANCE.b(), 5, null);
            k2VarB.v(2.0f * spread);
            i0 i0Var = i0.f148189a;
            h1VarA.u(path, k2VarB);
        } else {
            b2VarB = null;
        }
        int iCeil3 = ((int) Math.ceil(radius)) * 2;
        b2 b2VarB2 = d2.b(iCeil + iCeil3, iCeil2 + iCeil3, c2.INSTANCE.a(), false, null, 24, null);
        h1 h1VarA2 = j1.a(b2VarB2);
        if (b2VarB != null) {
            h1VarA2.h(0.0f, 0.0f, b2VarB2.l(), b2VarB2.getHeight(), c.b(this.paint, 0L, 0, null, 0, 15, null));
            h1VarA2.m(b2VarB, m3.e.e((BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(offsetY))) | (((long) Float.floatToRawIntBits(offsetX)) << 32)), c.b(this.paint, 0L, a1.INSTANCE.C(), radius > 0.0f ? d.a(radius) : null, 0, 9, null));
            return androidx.compose.ui.graphics.d.a(androidx.compose.ui.graphics.i.c(b2VarB2, 0, 0, 6, null));
        }
        h1VarA2.q();
        h1VarA2.d(offsetX, offsetY);
        h1VarA2.u(path, c.b(this.paint, 0L, 0, radius > 0.0f ? d.a(radius) : null, 0, 11, null));
        h1VarA2.j();
        h1VarA2.h(0.0f, 0.0f, b2VarB2.l(), b2VarB2.getHeight(), c.b(this.paint, 0L, a1.INSTANCE.C(), null, 0, 13, null));
        return androidx.compose.ui.graphics.d.a(androidx.compose.ui.graphics.i.c(b2VarB2, 0, 0, 6, null));
    }

    private final androidx.compose.ui.graphics.h g(long size, float radius, float spread, float offsetX, float offsetY, long cornerRadius) {
        int i15 = (int) (size >> 32);
        int iCeil = (int) Math.ceil(Float.intBitsToFloat(i15));
        int i16 = (int) (size & BodyPartID.bodyIdMax);
        b2 b2VarB = d2.b(iCeil, (int) Math.ceil(Float.intBitsToFloat(i16)), c2.INSTANCE.a(), false, null, 24, null);
        h1 h1VarA = j1.a(b2VarB);
        float f15 = offsetX + spread;
        float f16 = offsetY + spread;
        h1VarA.r(f15, f16, Math.max(f15, (offsetX + Float.intBitsToFloat(i15)) - spread), Math.max(f16, (offsetY + Float.intBitsToFloat(i16)) - spread), Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & BodyPartID.bodyIdMax)), c.b(this.paint, 0L, 0, radius > 0.0f ? d.a(radius) : null, 0, 11, null));
        h1VarA.h(0.0f, 0.0f, b2VarB.l(), b2VarB.getHeight(), c.b(this.paint, 0L, a1.INSTANCE.C(), null, 0, 13, null));
        return androidx.compose.ui.graphics.d.a(androidx.compose.ui.graphics.i.c(b2VarB, 0, 0, 6, null));
    }

    private final CompositeShaderBrush h(androidx.compose.ui.graphics.h shadowMask, androidx.compose.ui.graphics.c brush) {
        CompositeShaderBrush compositeShaderBrush = this.compositeShader;
        if (compositeShaderBrush != null && t.c(compositeShaderBrush.getSrcBrush(), brush)) {
            return compositeShaderBrush;
        }
        CompositeShaderBrush compositeShaderBrush2 = new CompositeShaderBrush(androidx.compose.ui.graphics.d.f(shadowMask), androidx.compose.ui.graphics.d.f(brush), a1.INSTANCE.z(), null);
        this.compositeShader = compositeShaderBrush2;
        return compositeShaderBrush2;
    }

    @Override // s3.j
    protected void a(p3.f fVar, long j15, long j16, m2 m2Var) {
        float fL2 = fVar.l2(this.shadow.getRadius());
        float fL3 = fVar.l2(this.shadow.getSpread());
        float fL4 = fVar.l2(c5.j.f(this.shadow.getOffset()));
        float fL5 = fVar.l2(c5.j.g(this.shadow.getOffset()));
        this.shadowMask = m2Var != null ? f(j15, m2Var, fL2, fL3, fL4, fL5) : g(j15, fL2, fL3, fL4, fL5, j16);
    }

    @Override // s3.j
    protected void d(p3.f fVar, long j15, long j16, m2 m2Var, float f15, n1 n1Var, androidx.compose.ui.graphics.c cVar, int i15) {
        androidx.compose.ui.graphics.h hVarH = this.shadowMask;
        if (hVarH != null) {
            if (this.shadow.getBrush() instanceof androidx.compose.ui.graphics.h) {
                hVarH = h(hVarH, this.shadow.getBrush());
            }
            androidx.compose.ui.graphics.h hVar = hVarH;
            if (m2Var != null) {
                p3.f.M0(fVar, m2Var, hVar, f15, null, n1Var, i15, 8, null);
            } else if (m3.a.c(j16, m3.a.INSTANCE.a())) {
                p3.f.F1(fVar, hVar, 0L, 0L, f15, null, n1Var, i15, 22, null);
            } else {
                p3.f.c1(fVar, hVar, 0L, 0L, j16, f15, null, n1Var, this.shadow.getBlendMode(), 38, null);
            }
        }
    }
}
