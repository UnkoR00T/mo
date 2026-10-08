package q3;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Color;
import fr.w;
import n3.h1;
import n3.n1;
import n3.u2;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b`\u0018\u0000 02\u00020\u0001:\u00010J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u0019H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"R\u001c\u0010(\u001a\u00020#8&@&X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010.\u001a\u00020)8&@&X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u00104\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00108\u001a\u0002058&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u001e\u0010>\u001a\u0004\u0018\u0001098&@&X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010A\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b?\u00101\"\u0004\b@\u00103R\u001c\u0010D\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bB\u00101\"\u0004\bC\u00103R\u001c\u0010G\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bE\u00101\"\u0004\bF\u00103R\u001c\u0010J\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bH\u00101\"\u0004\bI\u00103R\u001c\u0010M\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bK\u00101\"\u0004\bL\u00103R\u001c\u0010Q\u001a\u00020N8&@&X¦\u000e¢\u0006\f\u001a\u0004\bO\u0010+\"\u0004\bP\u0010-R\u001c\u0010S\u001a\u00020N8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010+\"\u0004\bR\u0010-R\u001c\u0010U\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bT\u00101\"\u0004\b\u0003\u00103R\u001c\u0010X\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bV\u00101\"\u0004\bW\u00103R\u001c\u0010[\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u00101\"\u0004\bZ\u00103R\u001c\u0010^\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u00101\"\u0004\b]\u00103R\u001c\u0010d\u001a\u00020_8&@&X¦\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001e\u0010j\u001a\u0004\u0018\u00010e8&@&X¦\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001c\u0010k\u001a\u00020_8&@&X¦\u000e¢\u0006\f\u001a\u0004\bk\u0010a\"\u0004\bl\u0010cR\u0014\u0010n\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010aR\u0014\u0010p\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006qÀ\u0006\u0001"}, d2 = {"Lq3/d;", "", "", "x", "y", "Lc5/r;", "size", "Loq/i0;", "m", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "I", "(Landroid/graphics/Outline;J)V", "Ln3/h1;", "canvas", "E", "(Ln3/h1;)V", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "Lq3/c;", "layer", "Lkotlin/Function1;", "Lp3/f;", "block", "k", "(Lc5/d;Lc5/t;Lq3/c;Ler/l;)V", "h", "()V", "Landroid/graphics/Matrix;", "F", "()Landroid/graphics/Matrix;", "Lq3/b;", "i", "()I", "O", "(I)V", "compositingStrategy", "Lm3/e;", "getPivotOffset-F1C5BW0", "()J", "K", "(J)V", "pivotOffset", "", "a", "()F", "g", "(F)V", "alpha", "Ln3/a1;", "e", "f", "blendMode", "Ln3/n1;", "c", "()Ln3/n1;", "d", "(Ln3/n1;)V", "colorFilter", "A", "s", "scaleX", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, ip.a.f96138c, "scaleY", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "N", "translationX", "J", "j", "translationY", "Q", "B", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "r", "q", "ambientShadowColor", "v", "spotShadowColor", "M", "rotationX", "l", "z", "rotationY", "p", "C", "rotationZ", "t", "w", "cameraDistance", "", "getClip", "()Z", "u", "(Z)V", "clip", "Ln3/u2;", "b", "()Ln3/u2;", "o", "(Ln3/u2;)V", "renderEffect", "isInvalidated", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "G", "supportsSoftwareRendering", "n", "hasDisplayList", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f164003a;

    /* JADX INFO: renamed from: q3.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lq3/d$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Lp3/f;", "Loq/i0;", "b", "Ler/l;", "a", "()Ler/l;", "DefaultDrawBlock", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f164003a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final er.l<p3.f, i0> DefaultDrawBlock = C4076a.f164005b;

        /* JADX INFO: renamed from: q3.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/f;", "Loq/i0;", "c", "(Lp3/f;)V"}, k = 3, mv = {2, 1, 0})
        static final class C4076a extends w implements er.l<p3.f, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C4076a f164005b = new C4076a();

            C4076a() {
                super(1);
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(p3.f fVar) {
                c(fVar);
                return i0.f148189a;
            }

            public final void c(p3.f fVar) {
                p3.f.c2(fVar, Color.INSTANCE.g(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
        }

        private Companion() {
        }

        public final er.l<p3.f, i0> a() {
            return DefaultDrawBlock;
        }
    }

    /* JADX INFO: renamed from: A */
    float getScaleX();

    void B(float f15);

    void C(float f15);

    void D(float f15);

    void E(h1 canvas);

    Matrix F();

    /* JADX INFO: renamed from: G */
    default boolean getSupportsSoftwareRendering() {
        return false;
    }

    void H(boolean z15);

    void I(Outline outline, long outlineSize);

    /* JADX INFO: renamed from: J */
    float getTranslationY();

    void K(long j15);

    /* JADX INFO: renamed from: L */
    float getTranslationX();

    /* JADX INFO: renamed from: M */
    float getRotationX();

    void N(float f15);

    void O(int i15);

    /* JADX INFO: renamed from: P */
    float getScaleY();

    /* JADX INFO: renamed from: Q */
    float getShadowElevation();

    /* JADX INFO: renamed from: a */
    float getAlpha();

    u2 b();

    /* JADX INFO: renamed from: c */
    n1 getColorFilter();

    void d(n1 n1Var);

    /* JADX INFO: renamed from: e */
    int getBlendMode();

    void f(int i15);

    void g(float f15);

    void h();

    /* JADX INFO: renamed from: i */
    int getCompositingStrategy();

    void j(float f15);

    void k(c5.d density, c5.t layoutDirection, c layer, er.l<? super p3.f, i0> block);

    /* JADX INFO: renamed from: l */
    float getRotationY();

    void m(int x15, int y15, long size);

    default boolean n() {
        return true;
    }

    void o(u2 u2Var);

    /* JADX INFO: renamed from: p */
    float getRotationZ();

    void q(long j15);

    /* JADX INFO: renamed from: r */
    long getAmbientShadowColor();

    void s(float f15);

    /* JADX INFO: renamed from: t */
    float getCameraDistance();

    void u(boolean z15);

    void v(long j15);

    void w(float f15);

    void x(float f15);

    /* JADX INFO: renamed from: y */
    long getSpotShadowColor();

    void z(float f15);
}
