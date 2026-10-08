package androidx.compose.material;

import androidx.compose.ui.graphics.Color;
import e2.RippleAlpha;
import e2.i;
import fr.k;
import g4.e;
import g4.f;
import g4.g;
import g4.j;
import g4.v0;
import g4.w0;
import n3.p1;
import oq.i0;
import p012a2.Colors;
import p012a2.RippleConfiguration;
import p012a2.c1;
import p012a2.m1;
import p012a2.q3;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/material/DelegatingThemeAwareRippleNode;", "Lg4/j;", "Lg4/e;", "Lg4/v0;", "Lb1/j;", "interactionSource", "", "bounded", "Lc5/h;", "radius", "Ln3/p1;", "color", "<init>", "(Lb1/j;ZFLn3/p1;Lfr/k;)V", "Loq/i0;", "z3", "()V", "w3", "y3", "W2", "T0", "v", "Lb1/j;", "w", "Z", "x", "F", "Ln3/p1;", "Lg4/g;", "y", "Lg4/g;", "rippleNode", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DelegatingThemeAwareRippleNode extends j implements e, v0 {
    private final p1 color;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final b1.j interactionSource;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private g rippleNode;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements p1 {
        a() {
        }

        @Override // n3.p1
        public final long a() {
            long jA = DelegatingThemeAwareRippleNode.this.color.a();
            if (jA != 16) {
                return jA;
            }
            RippleConfiguration rippleConfiguration = (RippleConfiguration) f.a(DelegatingThemeAwareRippleNode.this, c.f());
            return (rippleConfiguration == null || rippleConfiguration.getColor() == 16) ? q3.f1891a.b(((Color) f.a(DelegatingThemeAwareRippleNode.this, m1.a())).m20unboximpl(), ((Colors) f.a(DelegatingThemeAwareRippleNode.this, c1.e())).m()) : rippleConfiguration.getColor();
        }
    }

    public /* synthetic */ DelegatingThemeAwareRippleNode(b1.j jVar, boolean z15, float f15, p1 p1Var, k kVar) {
        this(jVar, z15, f15, p1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A3(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        if (((RippleConfiguration) f.a(delegatingThemeAwareRippleNode, c.f())) == null) {
            delegatingThemeAwareRippleNode.y3();
        } else if (delegatingThemeAwareRippleNode.rippleNode == null) {
            delegatingThemeAwareRippleNode.w3();
        }
        return i0.f148189a;
    }

    private final void w3() {
        this.rippleNode = n3(i.c(this.interactionSource, this.bounded, this.radius, new a(), new er.a() { // from class: androidx.compose.material.b
            @Override // er.a
            public final Object a() {
                return DelegatingThemeAwareRippleNode.x3(this.f9752a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleAlpha x3(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        RippleAlpha rippleAlpha;
        RippleConfiguration rippleConfiguration = (RippleConfiguration) f.a(delegatingThemeAwareRippleNode, c.f());
        return (rippleConfiguration == null || (rippleAlpha = rippleConfiguration.getRippleAlpha()) == null) ? q3.f1891a.a(((Color) f.a(delegatingThemeAwareRippleNode, m1.a())).m20unboximpl(), ((Colors) f.a(delegatingThemeAwareRippleNode, c1.e())).m()) : rippleAlpha;
    }

    private final void y3() {
        g gVar = this.rippleNode;
        if (gVar != null) {
            q3(gVar);
        }
        this.rippleNode = null;
    }

    private final void z3() {
        w0.a(this, new er.a() { // from class: androidx.compose.material.a
            @Override // er.a
            public final Object a() {
                return DelegatingThemeAwareRippleNode.A3(this.f9751a);
            }
        });
    }

    @Override // g4.v0
    public void T0() {
        z3();
    }

    @Override // f3.m.c
    public void W2() {
        z3();
    }

    private DelegatingThemeAwareRippleNode(b1.j jVar, boolean z15, float f15, p1 p1Var) {
        this.interactionSource = jVar;
        this.bounded = z15;
        this.radius = f15;
        this.color = p1Var;
    }
}
