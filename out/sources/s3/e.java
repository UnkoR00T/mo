package s3;

import androidx.compose.ui.graphics.CompositeShaderBrush;
import fr.t;
import m3.k;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001e\u001a\u00020\u001d*\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010%\u001a\u00020\u001d*\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Ls3/e;", "Ls3/j;", "Ls3/g;", "shadow", "Ln3/i2;", "outline", "<init>", "(Ls3/g;Ln3/i2;)V", "Ln3/b2;", "shadowBitmap", "Landroidx/compose/ui/graphics/c;", "brush", "i", "(Ln3/b2;Landroidx/compose/ui/graphics/c;)Landroidx/compose/ui/graphics/c;", "Lm3/k;", "size", "Ln3/m2;", "path", "", "radius", "spread", "f", "(JLn3/m2;FF)Ln3/b2;", "shadowRadius", "Lm3/a;", "cornerRadius", "g", "(JFFJ)Ln3/b2;", "Lp3/f;", "Loq/i0;", "a", "(Lp3/f;JJLn3/m2;)V", "alpha", "Ln3/n1;", "colorFilter", "Ln3/a1;", "blendMode", "d", "(Lp3/f;JJLn3/m2;FLn3/n1;Landroidx/compose/ui/graphics/c;I)V", "Ls3/g;", "h", "()Ls3/g;", "Ln3/k2;", "j", "Ln3/k2;", "paint", "k", "Ln3/b2;", "Landroidx/compose/ui/graphics/e;", "l", "Landroidx/compose/ui/graphics/e;", "compositeShader", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends j {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Shadow shadow;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k2 paint;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private b2 shadowBitmap;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private CompositeShaderBrush compositeShader;

    public e(Shadow shadow, i2 i2Var) {
        super(i2Var);
        this.shadow = shadow;
        this.paint = o0.a();
    }

    private final b2 f(long size, m2 path, float radius, float spread) {
        float f15 = 2;
        float f16 = (radius * f15) + (f15 * spread);
        b2 b2VarB = d2.b((int) Math.ceil(Float.intBitsToFloat((int) (size >> 32)) + f16), (int) Math.ceil(Float.intBitsToFloat((int) (size & BodyPartID.bodyIdMax)) + f16), c2.INSTANCE.a(), false, null, 24, null);
        h1 h1VarA = j1.a(b2VarB);
        if (spread <= 0.0f) {
            c.b(this.paint, 0L, 0, radius > 0.0f ? d.a(radius) : null, 0, 11, null);
            h1VarA.d(radius, radius);
            h1VarA.u(path, this.paint);
            return b2VarB;
        }
        float f17 = radius + spread;
        h1VarA.d(f17, f17);
        h1VarA.u(path, c.b(this.paint, 0L, 0, radius > 0.0f ? d.a(radius) : null, 0, 11, null));
        k2 k2VarB = c.b(this.paint, 0L, 0, radius > 0.0f ? d.a(radius) : null, l2.INSTANCE.b(), 3, null);
        k2VarB.v(2.0f * spread);
        i0 i0Var = i0.f148189a;
        h1VarA.u(path, k2VarB);
        return b2VarB;
    }

    private final b2 g(long size, float shadowRadius, float spread, long cornerRadius) {
        float f15 = 2;
        float f16 = (shadowRadius * f15) + (f15 * spread);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (size >> 32)) + f16;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size & BodyPartID.bodyIdMax)) + f16;
        b2 b2VarB = d2.b((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), c2.INSTANCE.a(), false, null, 24, null);
        j1.a(b2VarB).r(shadowRadius, shadowRadius, fIntBitsToFloat - shadowRadius, fIntBitsToFloat2 - shadowRadius, Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & BodyPartID.bodyIdMax)), c.b(this.paint, 0L, 0, shadowRadius > 0.0f ? d.a(shadowRadius) : null, 0, 11, null));
        return b2VarB;
    }

    private final androidx.compose.ui.graphics.c i(b2 shadowBitmap, androidx.compose.ui.graphics.c brush) {
        CompositeShaderBrush compositeShaderBrush = this.compositeShader;
        if (compositeShaderBrush != null && t.c(compositeShaderBrush.getSrcBrush(), brush)) {
            return compositeShaderBrush;
        }
        androidx.compose.ui.graphics.c.Companion companion = androidx.compose.ui.graphics.c.INSTANCE;
        androidx.compose.ui.graphics.h hVarA = androidx.compose.ui.graphics.d.a(androidx.compose.ui.graphics.i.c(shadowBitmap, 0, 0, 6, null));
        if (brush instanceof androidx.compose.ui.graphics.h) {
            brush = androidx.compose.ui.graphics.d.a(((androidx.compose.ui.graphics.h) brush).c(k.d((((long) Float.floatToRawIntBits(shadowBitmap.l())) << 32) | (((long) Float.floatToRawIntBits(shadowBitmap.getHeight())) & BodyPartID.bodyIdMax))));
        }
        CompositeShaderBrush compositeShaderBrush2 = (CompositeShaderBrush) companion.a(hVarA, brush, a1.INSTANCE.z());
        this.compositeShader = compositeShaderBrush2;
        return compositeShaderBrush2;
    }

    @Override // s3.j
    protected void a(p3.f fVar, long j15, long j16, m2 m2Var) {
        e eVar;
        b2 b2VarG;
        float fL2 = fVar.l2(this.shadow.getRadius());
        float fL3 = fVar.l2(this.shadow.getSpread());
        if (m2Var != null) {
            eVar = this;
            b2VarG = eVar.f(j15, m2Var, fL2, fL3);
        } else {
            eVar = this;
            b2VarG = eVar.g(j15, fL2, fL3, j16);
        }
        eVar.shadowBitmap = b2VarG;
    }

    @Override // s3.j
    protected void d(p3.f fVar, long j15, long j16, m2 m2Var, float f15, n1 n1Var, androidx.compose.ui.graphics.c cVar, int i15) {
        b2 b2Var = this.shadowBitmap;
        if (b2Var != null) {
            float f16 = -(fVar.l2(this.shadow.getRadius()) + fVar.l2(this.shadow.getSpread()));
            if (cVar == null || n1Var != null) {
                p3.f.V0(fVar, b2Var, m3.e.e((BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(f16))) | (Float.floatToRawIntBits(f16) << 32)), f15, null, n1Var, i15, 8, null);
                return;
            }
            androidx.compose.ui.graphics.c cVarI = i(b2Var, cVar);
            fVar.getDrawContext().getTransform().d(f16, f16);
            try {
                float fL = b2Var.l();
                p3.f.F1(fVar, cVarI, 0L, k.d((((long) Float.floatToRawIntBits(b2Var.getHeight())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fL) << 32)), f15, null, null, i15, 50, null);
            } finally {
                float f17 = -f16;
                fVar.getDrawContext().getTransform().d(f17, f17);
            }
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }
}
