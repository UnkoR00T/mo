package p079n1;

import androidx.compose.ui.platform.g1;
import c5.b;
import c5.d;
import er.a;
import f3.m;
import fr.t;
import g4.b0;
import g4.e;
import g4.f;
import g4.h;
import g4.v0;
import g4.w0;
import g4.z;
import oq.g;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J#\u0010#\u001a\u00020\"*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u0014J\u000f\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u0014J\u000f\u0010(\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0014J%\u0010)\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010'R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010'R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010+R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010=\u001a\u00020.8\u0016X\u0096D¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Ln1/y2;", "Lf3/m$c;", "Lg4/e;", "Lg4/z;", "Lg4/v0;", "Lq4/b4;", "textStyle", "", "minLines", "maxLines", "<init>", "(Lq4/b4;II)V", "w3", "()Lq4/b4;", "Lm2/f6;", "", "v3", "()Lm2/f6;", "Loq/i0;", "t3", "()V", "Lc5/d;", "density", "resolvedStyle", "Lu4/l$b;", "fontFamilyResolver", "q3", "(Lc5/d;Lq4/b4;Lu4/l$b;)V", "W2", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "T0", "B0", "I", "X2", "x3", "r", "Lq4/b4;", "s", "t", "", "v", "Z", "dirty", "w", "precomputedMinLinesHeight", "x", "precomputedMaxLinesHeight", "y", "z", "Lm2/f6;", "fontResolutionState", "A", "R2", "()Z", "shouldAutoInvalidate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y2 extends m.c implements e, z, v0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private TextStyle textStyle;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean dirty;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int precomputedMinLinesHeight = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int precomputedMaxLinesHeight = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private TextStyle resolvedStyle;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private f6<? extends Object> fontResolutionState;

    public y2(TextStyle textStyle, int i15, int i16) {
        this.textStyle = textStyle;
        this.minLines = i15;
        this.maxLines = i16;
    }

    private final void q3(d density, TextStyle resolvedStyle, l.b fontFamilyResolver) {
        int iA = (int) (t4.a(resolvedStyle, density, fontFamilyResolver, t4.d(), 1) & BodyPartID.bodyIdMax);
        int iA2 = ((int) (t4.a(resolvedStyle, density, fontFamilyResolver, t4.d() + '\n' + t4.d(), 2) & BodyPartID.bodyIdMax)) - iA;
        int i15 = this.minLines;
        this.precomputedMinLinesHeight = i15 == 1 ? -1 : ((i15 - 1) * iA2) + iA;
        int i16 = this.maxLines;
        this.precomputedMaxLinesHeight = i16 != Integer.MAX_VALUE ? iA + (iA2 * (i16 - 1)) : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r3(a2 a2Var, a2.a aVar) {
        a2.a.I(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s3(y2 y2Var) {
        y2Var.v3().getValue();
        return i0.f148189a;
    }

    private final void t3() {
        if (this.fontResolutionState != null) {
            w0.a(this, new a() { // from class: n1.w2
                @Override // er.a
                public final Object a() {
                    return y2.u3(this.f130509a);
                }
            });
        }
        this.dirty = true;
        b0.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u3(y2 y2Var) {
        y2Var.v3().getValue();
        return i0.f148189a;
    }

    private final f6<Object> v3() {
        f6<? extends Object> f6Var = this.fontResolutionState;
        if (f6Var != null) {
            return f6Var;
        }
        c1.e.b("Font resolution state is not set.");
        throw new g();
    }

    private final TextStyle w3() {
        TextStyle textStyle = this.resolvedStyle;
        if (textStyle != null) {
            return textStyle;
        }
        c1.e.b("Resolved style is not set.");
        throw new g();
    }

    @Override // g4.g
    public void B0() {
        this.resolvedStyle = c4.d(this.textStyle, h.r(this));
        this.dirty = true;
        b0.b(this);
    }

    @Override // g4.g, g4.f1
    public void I() {
        this.dirty = true;
        b0.b(this);
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // g4.v0
    public void T0() {
        t3();
    }

    @Override // f3.m.c
    public void W2() {
        super.W2();
        l.b bVar = (l.b) f.a(this, g1.h());
        this.resolvedStyle = c4.d(this.textStyle, h.r(this));
        l lVarL = w3().l();
        FontWeight fontWeightQ = w3().q();
        if (fontWeightQ == null) {
            fontWeightQ = FontWeight.INSTANCE.d();
        }
        y yVarO = w3().o();
        int value = yVarO != null ? yVarO.getValue() : y.INSTANCE.b();
        u4.z zVarP = w3().p();
        this.fontResolutionState = bVar.a(lVarL, fontWeightQ, value, zVarP != null ? zVarP.getValue() : u4.z.INSTANCE.a());
        w0.a(this, new a() { // from class: n1.v2
            @Override // er.a
            public final Object a() {
                return y2.s3(this.f130498a);
            }
        });
        this.dirty = true;
    }

    @Override // f3.m.c
    public void X2() {
        this.resolvedStyle = null;
        this.fontResolutionState = null;
        this.dirty = false;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, p036e4.v0 v0Var, long j15) {
        if (this.dirty) {
            q3(y0Var, w3(), (l.b) f.a(this, g1.h()));
            this.dirty = false;
        }
        int i15 = this.precomputedMinLinesHeight;
        int iN = i15 != -1 ? lr.m.n(i15, b.m(j15), b.k(j15)) : b.m(j15);
        int i16 = this.precomputedMaxLinesHeight;
        final a2 a2VarO0 = v0Var.o0(b.d(j15, 0, 0, iN, i16 != -1 ? lr.m.n(i16, b.m(j15), b.k(j15)) : b.k(j15), 3, null));
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: n1.x2
            @Override // er.l
            public final Object b(Object obj) {
                return y2.r3(a2VarO0, (a2.a) obj);
            }
        }, 4, null);
    }

    public final void x3(TextStyle textStyle, int minLines, int maxLines) {
        if (t.c(this.textStyle, textStyle) && this.minLines == minLines && this.maxLines == maxLines) {
            return;
        }
        this.textStyle = textStyle;
        this.minLines = minLines;
        this.maxLines = maxLines;
        this.resolvedStyle = c4.d(textStyle, h.r(this));
        this.dirty = true;
        b0.b(this);
    }
}
