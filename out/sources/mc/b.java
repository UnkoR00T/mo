package mc;

import coil3.compose.AsyncImagePainter;
import g4.i1;
import g4.q;
import g4.z;
import n3.n1;
import n4.f0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.n2;
import p036e4.v;
import p036e4.v0;
import p036e4.w;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BE\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J#\u0010 \u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J#\u0010*\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010'J#\u0010+\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010'J\u0013\u0010.\u001a\u00020-*\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u00020-*\u000200H\u0016¢\u0006\u0004\b1\u00102R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020\\8&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010N¨\u0006b"}, d2 = {"Lmc/b;", "Lf3/m$c;", "Lg4/q;", "Lg4/z;", "Lg4/i1;", "Lf3/c;", "alignment", "Le4/l;", "contentScale", "", "alpha", "Ln3/n1;", "colorFilter", "", "clipToBounds", "", "contentDescription", "Llc/e;", "constraintSizeResolver", "<init>", "(Lf3/c;Le4/l;FLn3/n1;ZLjava/lang/String;Llc/e;)V", "Lm3/k;", "dstSize", "o3", "(J)J", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "t3", "Le4/y0;", "Le4/v0;", "measurable", "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "K", "(Le4/w;Le4/v;I)I", "k", "width", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "O", "Lp3/c;", "Loq/i0;", "y", "(Lp3/c;)V", "Ln4/i0;", "E2", "(Ln4/i0;)V", "r", "Lf3/c;", "getAlignment", "()Lf3/c;", "u3", "(Lf3/c;)V", "s", "Le4/l;", "getContentScale", "()Le4/l;", "y3", "(Le4/l;)V", "t", "F", "getAlpha", "()F", "g", "(F)V", "v", "Ln3/n1;", "getColorFilter", "()Ln3/n1;", "d", "(Ln3/n1;)V", "w", "Z", "getClipToBounds", "()Z", "v3", "(Z)V", "x", "Ljava/lang/String;", "q3", "()Ljava/lang/String;", "x3", "(Ljava/lang/String;)V", "Llc/e;", "p3", "()Llc/e;", "w3", "(Llc/e;)V", "Landroidx/compose/ui/graphics/painter/a;", "r3", "()Landroidx/compose/ui/graphics/painter/a;", "painter", "R2", "shouldAutoInvalidate", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b extends f3.m.c implements q, z, i1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private f3.c alignment;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private p036e4.l contentScale;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private n1 colorFilter;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private String contentDescription;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private lc.e constraintSizeResolver;

    public b(f3.c cVar, p036e4.l lVar, float f15, n1 n1Var, boolean z15, String str, lc.e eVar) {
        this.alignment = cVar;
        this.contentScale = lVar;
        this.alpha = f15;
        this.colorFilter = n1Var;
        this.clipToBounds = z15;
        this.contentDescription = str;
        this.constraintSizeResolver = eVar;
    }

    private final long o3(long dstSize) {
        if (m3.k.k(dstSize)) {
            return m3.k.INSTANCE.b();
        }
        long intrinsicSize = r3().getIntrinsicSize();
        if (intrinsicSize == 9205357640488583168L) {
            return dstSize;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (intrinsicSize >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (intrinsicSize & BodyPartID.bodyIdMax));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (dstSize & BodyPartID.bodyIdMax));
        }
        long jD = m3.k.d((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long jA = this.contentScale.a(jD, dstSize);
        return (Math.abs(Float.intBitsToFloat((int) (jA >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & jA))) > Float.MAX_VALUE) ? dstSize : n2.b(jA, jD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s3(a2 a2Var, a2.a aVar) {
        a2.a.I(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    private final long t3(long constraints) {
        float fD;
        int iM;
        float fC;
        boolean zJ = c5.b.j(constraints);
        boolean zI = c5.b.i(constraints);
        if (zJ && zI) {
            return constraints;
        }
        androidx.compose.ui.graphics.painter.a aVarR3 = r3();
        boolean z15 = c5.b.h(constraints) && c5.b.g(constraints);
        long intrinsicSize = aVarR3.getIntrinsicSize();
        if (intrinsicSize == 9205357640488583168L) {
            if (z15) {
                return ((aVarR3 instanceof AsyncImagePainter) && ((AsyncImagePainter) aVarR3).z().getValue().getPainter() == null) ? constraints : c5.b.d(constraints, c5.b.l(constraints), 0, c5.b.k(constraints), 0, 10, null);
            }
            return constraints;
        }
        if (!z15 || (!zJ && !zI)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (intrinsicSize >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (intrinsicSize & BodyPartID.bodyIdMax));
            fD = Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE ? m.d(constraints, fIntBitsToFloat) : c5.b.n(constraints);
            if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                fC = m.c(constraints, fIntBitsToFloat2);
            } else {
                iM = c5.b.m(constraints);
            }
            long jO3 = o3(m3.k.d((((long) Float.floatToRawIntBits(fC)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fD)) << 32)));
            return c5.b.d(constraints, c5.c.g(constraints, hr.a.d(Float.intBitsToFloat((int) (jO3 >> 32)))), 0, c5.c.f(constraints, hr.a.d(Float.intBitsToFloat((int) (jO3 & BodyPartID.bodyIdMax)))), 0, 10, null);
        }
        fD = c5.b.l(constraints);
        iM = c5.b.k(constraints);
        fC = iM;
        long jO4 = o3(m3.k.d((((long) Float.floatToRawIntBits(fC)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fD)) << 32)));
        return c5.b.d(constraints, c5.c.g(constraints, hr.a.d(Float.intBitsToFloat((int) (jO4 >> 32)))), 0, c5.c.f(constraints, hr.a.d(Float.intBitsToFloat((int) (jO4 & BodyPartID.bodyIdMax)))), 0, 10, null);
    }

    @Override // g4.i1
    public void E2(n4.i0 i0Var) {
        String str = this.contentDescription;
        if (str != null) {
            f0.c0(i0Var, str);
            f0.r0(i0Var, n4.l.INSTANCE.e());
        }
    }

    @Override // g4.z
    public int H(w wVar, v vVar, int i15) {
        long jB = c5.c.b(0, i15, 0, 0, 13, null);
        lc.e eVar = this.constraintSizeResolver;
        if (eVar != null) {
            eVar.F(jB);
        }
        if (r3().getIntrinsicSize() == 9205357640488583168L) {
            return vVar.U(i15);
        }
        long jT3 = t3(jB);
        return Math.max(c5.b.m(jT3), vVar.U(i15));
    }

    @Override // g4.z
    public int K(w wVar, v vVar, int i15) {
        long jB = c5.c.b(0, 0, 0, i15, 7, null);
        lc.e eVar = this.constraintSizeResolver;
        if (eVar != null) {
            eVar.F(jB);
        }
        if (r3().getIntrinsicSize() == 9205357640488583168L) {
            return vVar.e0(i15);
        }
        long jT3 = t3(jB);
        return Math.max(c5.b.n(jT3), vVar.e0(i15));
    }

    @Override // g4.z
    public int O(w wVar, v vVar, int i15) {
        long jB = c5.c.b(0, i15, 0, 0, 13, null);
        lc.e eVar = this.constraintSizeResolver;
        if (eVar != null) {
            eVar.F(jB);
        }
        if (r3().getIntrinsicSize() == 9205357640488583168L) {
            return vVar.n(i15);
        }
        long jT3 = t3(jB);
        return Math.max(c5.b.m(jT3), vVar.n(i15));
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        lc.e eVar = this.constraintSizeResolver;
        if (eVar != null) {
            eVar.F(j15);
        }
        final a2 a2VarO0 = v0Var.o0(t3(j15));
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: mc.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.s3(a2VarO0, (a2.a) obj);
            }
        }, 4, null);
    }

    public final void d(n1 n1Var) {
        this.colorFilter = n1Var;
    }

    public final void g(float f15) {
        this.alpha = f15;
    }

    @Override // g4.z
    public int k(w wVar, v vVar, int i15) {
        long jB = c5.c.b(0, 0, 0, i15, 7, null);
        lc.e eVar = this.constraintSizeResolver;
        if (eVar != null) {
            eVar.F(jB);
        }
        if (r3().getIntrinsicSize() == 9205357640488583168L) {
            return vVar.m0(i15);
        }
        long jT3 = t3(jB);
        return Math.max(c5.b.n(jT3), vVar.m0(i15));
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final lc.e getConstraintSizeResolver() {
        return this.constraintSizeResolver;
    }

    /* JADX INFO: renamed from: q3, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    public abstract androidx.compose.ui.graphics.painter.a r3();

    public final void u3(f3.c cVar) {
        this.alignment = cVar;
    }

    public final void v3(boolean z15) {
        this.clipToBounds = z15;
    }

    public final void w3(lc.e eVar) {
        this.constraintSizeResolver = eVar;
    }

    public final void x3(String str) {
        this.contentDescription = str;
    }

    @Override // g4.q
    public void y(p3.c cVar) {
        long jO3 = o3(cVar.a());
        long jA = this.alignment.a(m.n(jO3), m.n(cVar.a()), cVar.getLayoutDirection());
        int i15 = c5.n.i(jA);
        int iJ = c5.n.j(jA);
        p3.d drawContext = cVar.getDrawContext();
        long jA2 = drawContext.a();
        drawContext.f().q();
        try {
            p3.h transform = drawContext.getTransform();
            if (this.clipToBounds) {
                p3.h.g(transform, 0.0f, 0.0f, 0.0f, 0.0f, 0, 31, null);
            }
            transform.d(i15, iJ);
            r3().j(cVar, jO3, this.alpha, this.colorFilter);
            drawContext.f().j();
            drawContext.g(jA2);
            cVar.H2();
        } catch (Throwable th4) {
            drawContext.f().j();
            drawContext.g(jA2);
            throw th4;
        }
    }

    public final void y3(p036e4.l lVar) {
        this.contentScale = lVar;
    }
}
