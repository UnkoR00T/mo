package androidx.compose.ui.draw;

import c5.b;
import c5.n;
import c5.r;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import f3.c;
import f3.m;
import fr.w;
import g4.q;
import g4.z;
import m3.k;
import n3.n1;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.l;
import p036e4.n2;
import p036e4.v;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.draw.PainterNode, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b*\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0013\u0010\u0019\u001a\u00020\u0006*\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0006*\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ#\u0010 \u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J#\u0010*\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010'J#\u0010+\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010'J\u0013\u0010.\u001a\u00020-*\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010;R\u0014\u0010Y\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010;¨\u0006Z"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Lg4/z;", "Lf3/m$c;", "Lg4/q;", "Landroidx/compose/ui/graphics/painter/a;", "painter", "", "sizeToIntrinsics", "Lf3/c;", "alignment", "Le4/l;", "contentScale", "", "alpha", "Ln3/n1;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/a;ZLf3/c;Le4/l;FLn3/n1;)V", "Lm3/k;", "dstSize", "n3", "(J)J", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "t3", "s3", "(J)Z", "r3", "Le4/y0;", "Le4/v0;", "measurable", "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "K", "(Le4/w;Le4/v;I)I", "k", "width", i.f37087n, "O", "Lp3/c;", "Loq/i0;", "y", "(Lp3/c;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/painter/a;", "o3", "()Landroidx/compose/ui/graphics/painter/a;", "w3", "(Landroidx/compose/ui/graphics/painter/a;)V", "r", "Z", "p3", "()Z", "x3", "(Z)V", "s", "Lf3/c;", "getAlignment", "()Lf3/c;", "u3", "(Lf3/c;)V", "t", "Le4/l;", "getContentScale", "()Le4/l;", "v3", "(Le4/l;)V", "v", "F", "getAlpha", "()F", "g", "(F)V", "w", "Ln3/n1;", "getColorFilter", "()Ln3/n1;", "d", "(Ln3/n1;)V", "q3", "useIntrinsicSize", "R2", "shouldAutoInvalidate", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class PainterModifier extends m.c implements z, q {
    private androidx.compose.ui.graphics.painter.a painter;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean sizeToIntrinsics;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private c alignment;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private l contentScale;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private float alpha;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private n1 colorFilter;

    /* JADX INFO: renamed from: androidx.compose.ui.draw.PainterNode$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f9924b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a2 a2Var) {
            super(1);
            this.f9924b = a2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            a2.a.I(aVar, this.f9924b, 0, 0, 0.0f, 4, null);
        }
    }

    public PainterModifier(androidx.compose.ui.graphics.painter.a aVar, boolean z15, c cVar, l lVar, float f15, n1 n1Var) {
        this.painter = aVar;
        this.sizeToIntrinsics = z15;
        this.alignment = cVar;
        this.contentScale = lVar;
        this.alpha = f15;
        this.colorFilter = n1Var;
    }

    private final long n3(long dstSize) {
        if (!q3()) {
            return dstSize;
        }
        long jD = k.d((((long) Float.floatToRawIntBits(!s3(this.painter.getIntrinsicSize()) ? Float.intBitsToFloat((int) (dstSize >> 32)) : Float.intBitsToFloat((int) (this.painter.getIntrinsicSize() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!r3(this.painter.getIntrinsicSize()) ? Float.intBitsToFloat((int) (dstSize & BodyPartID.bodyIdMax)) : Float.intBitsToFloat((int) (this.painter.getIntrinsicSize() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
        return (Float.intBitsToFloat((int) (dstSize >> 32)) == 0.0f || Float.intBitsToFloat((int) (dstSize & BodyPartID.bodyIdMax)) == 0.0f) ? k.INSTANCE.b() : n2.a(jD, this.contentScale.a(jD, dstSize));
    }

    private final boolean q3() {
        return this.sizeToIntrinsics && this.painter.getIntrinsicSize() != 9205357640488583168L;
    }

    private final boolean r3(long j15) {
        return !k.f(j15, k.INSTANCE.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax))) & Integer.MAX_VALUE) < 2139095040;
    }

    private final boolean s3(long j15) {
        return !k.f(j15, k.INSTANCE.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j15 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    private final long t3(long constraints) {
        boolean z15 = false;
        boolean z16 = b.h(constraints) && b.g(constraints);
        if (b.j(constraints) && b.i(constraints)) {
            z15 = true;
        }
        if ((!q3() && z16) || z15) {
            return b.d(constraints, b.l(constraints), 0, b.k(constraints), 0, 10, null);
        }
        long jL = this.painter.getIntrinsicSize();
        int iRound = s3(jL) ? Math.round(Float.intBitsToFloat((int) (jL >> 32))) : b.n(constraints);
        int iRound2 = r3(jL) ? Math.round(Float.intBitsToFloat((int) (jL & BodyPartID.bodyIdMax))) : b.m(constraints);
        long jN3 = n3(k.d((((long) Float.floatToRawIntBits(c5.c.f(constraints, iRound2))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(c5.c.g(constraints, iRound))) << 32)));
        return b.d(constraints, c5.c.g(constraints, Math.round(Float.intBitsToFloat((int) (jN3 >> 32)))), 0, c5.c.f(constraints, Math.round(Float.intBitsToFloat((int) (jN3 & BodyPartID.bodyIdMax)))), 0, 10, null);
    }

    @Override // g4.z
    public int H(p036e4.w wVar, v vVar, int i15) {
        if (!q3()) {
            return vVar.U(i15);
        }
        long jT3 = t3(c5.c.b(0, i15, 0, 0, 13, null));
        return Math.max(b.m(jT3), vVar.U(i15));
    }

    @Override // g4.z
    public int K(p036e4.w wVar, v vVar, int i15) {
        if (!q3()) {
            return vVar.e0(i15);
        }
        long jT3 = t3(c5.c.b(0, 0, 0, i15, 7, null));
        return Math.max(b.n(jT3), vVar.e0(i15));
    }

    @Override // g4.z
    public int O(p036e4.w wVar, v vVar, int i15) {
        if (!q3()) {
            return vVar.n(i15);
        }
        long jT3 = t3(c5.c.b(0, i15, 0, 0, 13, null));
        return Math.max(b.m(jT3), vVar.n(i15));
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        a2 a2VarO0 = v0Var.o0(t3(j15));
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new a(a2VarO0), 4, null);
    }

    public final void d(n1 n1Var) {
        this.colorFilter = n1Var;
    }

    public final void g(float f15) {
        this.alpha = f15;
    }

    @Override // g4.z
    public int k(p036e4.w wVar, v vVar, int i15) {
        if (!q3()) {
            return vVar.m0(i15);
        }
        long jT3 = t3(c5.c.b(0, 0, 0, i15, 7, null));
        return Math.max(b.n(jT3), vVar.m0(i15));
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final androidx.compose.ui.graphics.painter.a getPainter() {
        return this.painter;
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public final void u3(c cVar) {
        this.alignment = cVar;
    }

    public final void v3(l lVar) {
        this.contentScale = lVar;
    }

    public final void w3(androidx.compose.ui.graphics.painter.a aVar) {
        this.painter = aVar;
    }

    public final void x3(boolean z15) {
        this.sizeToIntrinsics = z15;
    }

    @Override // g4.q
    public void y(p3.c cVar) {
        long jL = this.painter.getIntrinsicSize();
        float fIntBitsToFloat = s3(jL) ? Float.intBitsToFloat((int) (jL >> 32)) : Float.intBitsToFloat((int) (cVar.a() >> 32));
        long jD = k.d((((long) Float.floatToRawIntBits(r3(jL) ? Float.intBitsToFloat((int) (jL & BodyPartID.bodyIdMax)) : Float.intBitsToFloat((int) (cVar.a() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long jB = (Float.intBitsToFloat((int) (cVar.a() >> 32)) == 0.0f || Float.intBitsToFloat((int) (cVar.a() & BodyPartID.bodyIdMax)) == 0.0f) ? k.INSTANCE.b() : n2.a(jD, this.contentScale.a(jD, cVar.a()));
        long jA = this.alignment.a(r.c((((long) Math.round(Float.intBitsToFloat((int) (jB & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) Math.round(Float.intBitsToFloat((int) (jB >> 32)))) << 32)), r.c((((long) Math.round(Float.intBitsToFloat((int) (cVar.a() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (cVar.a() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax)), cVar.getLayoutDirection());
        float fI = n.i(jA);
        float fJ = n.j(jA);
        cVar.getDrawContext().getTransform().d(fI, fJ);
        try {
            this.painter.j(cVar, jB, this.alpha, this.colorFilter);
            cVar.getDrawContext().getTransform().d(-fI, -fJ);
            cVar.H2();
        } catch (Throwable th4) {
            cVar.getDrawContext().getTransform().d(-fI, -fJ);
            throw th4;
        }
    }
}
