package n3;

import androidx.compose.ui.graphics.Color;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R*\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u001d\u0010\u0016R*\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R*\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R*\u0010)\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R*\u0010/\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020*8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010$\u001a\u0004\b\u001f\u0010,\"\u0004\b-\u0010.R*\u00102\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020*8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010$\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R*\u00106\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0012\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016R*\u00109\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0012\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010\u0016R*\u0010=\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0012\u001a\u0004\b;\u0010\u0014\"\u0004\b<\u0010\u0016R*\u0010A\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0012\u001a\u0004\b?\u0010\u0014\"\u0004\b@\u0010\u0016R*\u0010E\u001a\u00020B2\u0006\u0010\u0010\u001a\u00020B8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010$\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R*\u0010K\u001a\u00020F2\u0006\u0010\u0010\u001a\u00020F8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010G\u001a\u0004\b\t\u0010H\"\u0004\bI\u0010JR*\u0010S\u001a\u00020L2\u0006\u0010\u0010\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR*\u0010V\u001a\u00020T2\u0006\u0010\u0010\u001a\u00020T8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\t\u001a\u0004\b>\u0010\u000b\"\u0004\bU\u0010\rR\"\u0010Y\u001a\u00020W8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010$\u001a\u0004\b\b\u0010,\"\u0004\bX\u0010.R\"\u0010_\u001a\u00020Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010[\u001a\u0004\bM\u0010\\\"\u0004\b]\u0010^R\"\u0010f\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR.\u0010k\u001a\u0004\u0018\u00010g2\b\u0010\u0010\u001a\u0004\u0018\u00010g8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b5\u0010h\u001a\u0004\b3\u0010i\"\u0004\b\u001c\u0010jR*\u0010m\u001a\u00020l2\u0006\u0010\u0010\u001a\u00020l8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bb\u0010\t\u001a\u0004\b+\u0010\u000b\"\u0004\b#\u0010\rR$\u0010s\u001a\u0004\u0018\u00010n8\u0000@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010o\u001a\u0004\b\u0012\u0010p\"\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\u0014R\u0014\u0010w\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\u0014R.\u0010y\u001a\u0004\u0018\u00010x2\b\u0010\u0010\u001a\u0004\u0018\u00010x8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~¨\u0006\u007f"}, d2 = {"Ln3/v2;", "Ln3/a2;", "<init>", "()V", "Loq/i0;", "O", "U", "", "a", "I", "E", "()I", "setMutatedFields$ui", "(I)V", "mutatedFields", "", "value", "b", "F", "A", "()F", "s", "(F)V", "scaleX", "c", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, ip.a.f96138c, "scaleY", "d", "g", "alpha", "e", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "N", "translationX", "f", "J", "j", "translationY", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "B", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "h", "()J", "q", "(J)V", "ambientShadowColor", "K", "v", "spotShadowColor", "k", "M", "x", "rotationX", "l", "z", "rotationY", "m", "p", "C", "rotationZ", "n", "t", "w", "cameraDistance", "Ln3/d3;", "U0", "Y0", "transformOrigin", "Ln3/y2;", "Ln3/y2;", "()Ln3/y2;", "k0", "(Ln3/y2;)V", "shape", "", "r", "Z", "i", "()Z", "u", "(Z)V", "clip", "Ln3/u1;", "s0", "compositingStrategy", "Lm3/k;", "T", "size", "Lc5/d;", "Lc5/d;", "()Lc5/d;", "Q", "(Lc5/d;)V", "graphicsDensity", "Lc5/t;", "Lc5/t;", "y", "()Lc5/t;", "R", "(Lc5/t;)V", "layoutDirection", "Ln3/n1;", "Ln3/n1;", "()Ln3/n1;", "(Ln3/n1;)V", "colorFilter", "Ln3/a1;", "blendMode", "Ln3/i2;", "Ln3/i2;", "()Ln3/i2;", "setOutline$ui", "(Ln3/i2;)V", "outline", "getDensity", "density", "i2", "fontScale", "Ln3/u2;", "renderEffect", "Ln3/u2;", "G", "()Ln3/u2;", "o", "(Ln3/u2;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v2 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private n1 colorFilter;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private i2 outline;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float scaleX = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float scaleY = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float alpha = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor = androidx.compose.ui.graphics.f.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor = androidx.compose.ui.graphics.f.a();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance = 8.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = d3.INSTANCE.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private y2 shape = t2.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy = u1.INSTANCE.a();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long size = m3.k.INSTANCE.a();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private c5.d graphicsDensity = c5.f.b(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private c5.t layoutDirection = c5.t.Ltr;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int blendMode = a1.INSTANCE.B();

    @Override // n3.a2
    /* JADX INFO: renamed from: A, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // n3.a2
    public void B(float f15) {
        if (this.shadowElevation == f15) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f15;
    }

    @Override // n3.a2
    public void C(float f15) {
        if (this.rotationZ == f15) {
            return;
        }
        this.mutatedFields |= 1024;
        this.rotationZ = f15;
    }

    @Override // n3.a2
    public void D(float f15) {
        if (this.scaleY == f15) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f15;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final int getMutatedFields() {
        return this.mutatedFields;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final i2 getOutline() {
        return this.outline;
    }

    public u2 G() {
        return null;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public y2 getShape() {
        return this.shape;
    }

    @Override // n3.a2
    /* JADX INFO: renamed from: J, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // n3.a2
    /* JADX INFO: renamed from: L, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // n3.a2
    /* JADX INFO: renamed from: M, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // n3.a2
    public void N(float f15) {
        if (this.translationX == f15) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f15;
    }

    public final void O() {
        s(1.0f);
        D(1.0f);
        g(1.0f);
        N(0.0f);
        j(0.0f);
        B(0.0f);
        q(androidx.compose.ui.graphics.f.a());
        v(androidx.compose.ui.graphics.f.a());
        x(0.0f);
        z(0.0f);
        C(0.0f);
        w(8.0f);
        Y0(d3.INSTANCE.a());
        k0(t2.a());
        u(false);
        o(null);
        d(null);
        f(a1.INSTANCE.B());
        s0(u1.INSTANCE.a());
        T(m3.k.INSTANCE.a());
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // n3.a2
    /* JADX INFO: renamed from: P, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    public final void Q(c5.d dVar) {
        this.graphicsDensity = dVar;
    }

    public final void R(c5.t tVar) {
        this.layoutDirection = tVar;
    }

    public void T(long j15) {
        this.size = j15;
    }

    public final void U() {
        this.outline = getShape().a(getSize(), this.layoutDirection, this.graphicsDensity);
    }

    @Override // n3.a2
    /* JADX INFO: renamed from: U0, reason: from getter */
    public long getTransformOrigin() {
        return this.transformOrigin;
    }

    @Override // n3.a2
    public void Y0(long j15) {
        if (d3.e(this.transformOrigin, j15)) {
            return;
        }
        this.mutatedFields |= PKIFailureInfo.certConfirmed;
        this.transformOrigin = j15;
    }

    @Override // n3.a2
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // n3.a2
    public void d(n1 n1Var) {
        if (fr.t.c(this.colorFilter, n1Var)) {
            return;
        }
        this.mutatedFields |= PKIFailureInfo.transactionIdInUse;
        this.colorFilter = n1Var;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // n3.a2
    public void f(int i15) {
        if (a1.E(this.blendMode, i15)) {
            return;
        }
        this.mutatedFields |= PKIFailureInfo.signerNotTrusted;
        this.blendMode = i15;
    }

    @Override // n3.a2
    public void g(float f15) {
        if (this.alpha == f15) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f15;
    }

    @Override // c5.d
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // c5.l
    /* JADX INFO: renamed from: i2 */
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    @Override // n3.a2
    public void j(float f15) {
        if (this.translationY == f15) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f15;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public n1 getColorFilter() {
        return this.colorFilter;
    }

    @Override // n3.a2
    public void k0(y2 y2Var) {
        if (fr.t.c(this.shape, y2Var)) {
            return;
        }
        this.mutatedFields |= PKIFailureInfo.certRevoked;
        this.shape = y2Var;
    }

    @Override // n3.a2
    /* JADX INFO: renamed from: l, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // n3.a2
    public void o(u2 u2Var) {
        if (fr.t.c(null, u2Var)) {
            return;
        }
        this.mutatedFields |= PKIFailureInfo.unsupportedVersion;
    }

    @Override // n3.a2
    /* JADX INFO: renamed from: p, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // n3.a2
    public void q(long j15) {
        if (Color.m11equalsimpl0(this.ambientShadowColor, j15)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j15;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final c5.d getGraphicsDensity() {
        return this.graphicsDensity;
    }

    @Override // n3.a2
    public void s(float f15) {
        if (this.scaleX == f15) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f15;
    }

    @Override // n3.a2
    public void s0(int i15) {
        if (u1.e(this.compositingStrategy, i15)) {
            return;
        }
        this.mutatedFields |= 32768;
        this.compositingStrategy = i15;
    }

    @Override // n3.a2
    /* JADX INFO: renamed from: t, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // n3.a2
    public void u(boolean z15) {
        if (this.clip != z15) {
            this.mutatedFields |= 16384;
            this.clip = z15;
        }
    }

    @Override // n3.a2
    public void v(long j15) {
        if (Color.m11equalsimpl0(this.spotShadowColor, j15)) {
            return;
        }
        this.mutatedFields |= 128;
        this.spotShadowColor = j15;
    }

    @Override // n3.a2
    public void w(float f15) {
        if (this.cameraDistance == f15) {
            return;
        }
        this.mutatedFields |= 2048;
        this.cameraDistance = f15;
    }

    @Override // n3.a2
    public void x(float f15) {
        if (this.rotationX == f15) {
            return;
        }
        this.mutatedFields |= 256;
        this.rotationX = f15;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final c5.t getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // n3.a2
    public void z(float f15) {
        if (this.rotationY == f15) {
            return;
        }
        this.mutatedFields |= 512;
        this.rotationY = f15;
    }
}
