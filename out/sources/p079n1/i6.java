package p079n1;

import androidx.compose.ui.platform.g1;
import c5.c;
import f3.m;
import g4.b0;
import g4.e;
import g4.f;
import g4.h;
import g4.z;
import oq.g;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.f6;
import q4.TextStyle;
import q4.c4;
import u4.FontWeight;
import u4.l;
import u4.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001d\u001a\u00020\u001c*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\u0016J\u0015\u0010\"\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u00100\u001a\u00020+8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Ln1/i6;", "Lf3/m$c;", "Lg4/e;", "Lg4/z;", "Lq4/b4;", "style", "<init>", "(Lq4/b4;)V", "Lm2/f6;", "", "p3", "()Lm2/f6;", "Ln1/b6;", "q3", "()Ln1/b6;", "resolvedStyle", "Lu4/l$b;", "fontFamilyResolver", "Loq/i0;", "s3", "(Lq4/b4;Lu4/l$b;)V", "W2", "()V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "B0", "I", "X2", "r3", "r", "Lq4/b4;", "s", "Lm2/f6;", "fontResolutionState", "t", "Ln1/b6;", "minSizeState", "", "v", "Z", "R2", "()Z", "shouldAutoInvalidate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i6 extends m.c implements e, z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private f6<? extends Object> fontResolutionState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private b6 minSizeState;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    public i6(TextStyle textStyle) {
        this.style = textStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o3(a2 a2Var, a2.a aVar) {
        a2.a.I(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    private final f6<Object> p3() {
        f6<? extends Object> f6Var = this.fontResolutionState;
        if (f6Var != null) {
            return f6Var;
        }
        c1.e.b("Font resolution state is not set.");
        throw new g();
    }

    private final b6 q3() {
        b6 b6Var = this.minSizeState;
        if (b6Var != null) {
            return b6Var;
        }
        c1.e.b("Min size state is not set.");
        throw new g();
    }

    private final void s3(TextStyle resolvedStyle, l.b fontFamilyResolver) {
        l lVarL = resolvedStyle.l();
        FontWeight fontWeightQ = resolvedStyle.q();
        if (fontWeightQ == null) {
            fontWeightQ = FontWeight.INSTANCE.d();
        }
        y yVarO = resolvedStyle.o();
        int value = yVarO != null ? yVarO.getValue() : y.INSTANCE.b();
        u4.z zVarP = resolvedStyle.p();
        this.fontResolutionState = fontFamilyResolver.a(lVarL, fontWeightQ, value, zVarP != null ? zVarP.getValue() : u4.z.INSTANCE.a());
        b0.b(this);
    }

    @Override // g4.g
    public void B0() {
        b6 b6Var = this.minSizeState;
        if (b6Var != null) {
            b6.f(b6Var, h.r(this), null, null, null, null, 30, null);
        }
        b0.b(this);
    }

    @Override // g4.g, g4.f1
    public void I() {
        b6 b6Var = this.minSizeState;
        if (b6Var != null) {
            b6.f(b6Var, null, h.o(this), null, null, null, 29, null);
        }
        b0.b(this);
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // f3.m.c
    public void W2() {
        TextStyle textStyleD = c4.d(this.style, h.r(this));
        l.b bVar = (l.b) f.a(this, g1.h());
        s3(textStyleD, bVar);
        this.minSizeState = new b6(h.r(this), h.o(this), bVar, textStyleD, p3().getValue());
    }

    @Override // f3.m.c
    public void X2() {
        this.fontResolutionState = null;
        this.minSizeState = null;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        long jA = q3().a(p3().getValue());
        final a2 a2VarO0 = v0Var.o0(c.e(j15, c.b((int) (jA >> 32), 0, (int) (jA & BodyPartID.bodyIdMax), 0, 10, null)));
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: n1.h6
            @Override // er.l
            public final Object b(Object obj) {
                return i6.o3(a2VarO0, (a2.a) obj);
            }
        }, 4, null);
    }

    public final void r3(TextStyle style) {
        TextStyle textStyleD = c4.d(style, h.r(this));
        s3(textStyleD, (l.b) f.a(this, g1.h()));
        b6.f(q3(), null, null, null, textStyleD, null, 23, null);
        b0.b(this);
    }
}
