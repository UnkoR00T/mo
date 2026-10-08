package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import e2.RippleAlpha;
import g4.v0;
import g4.w0;
import j2.o;
import n3.p1;
import n3.y2;
import oq.i0;
import p046f2.h4;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/material3/DelegatingThemeAwareRippleNode;", "Lg4/j;", "Lg4/e;", "Lg4/v0;", "Lb1/j;", "interactionSource", "", "bounded", "Lc5/h;", "radius", "Ln3/p1;", "color", "Ln3/y2;", "focusRingShape", "enablePressIndication", "enableFocusIndication", "enableHoverIndication", "enableDragIndication", "<init>", "(Lb1/j;ZFLn3/p1;Ln3/y2;ZZZZLfr/k;)V", "Loq/i0;", "z3", "()V", "w3", "y3", "W2", "T0", "v", "Lb1/j;", "w", "Z", "x", "F", "Ln3/p1;", "y", "Ln3/y2;", "z", "A", "B", "C", "Lg4/g;", ip.a.f96138c, "Lg4/g;", "rippleNode", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DelegatingThemeAwareRippleNode extends g4.j implements g4.e, v0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final boolean enableFocusIndication;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final boolean enableHoverIndication;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final boolean enableDragIndication;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private g4.g rippleNode;
    private final p1 color;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final b1.j interactionSource;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final y2 focusRingShape;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final boolean enablePressIndication;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p1 {
        a() {
        }

        @Override // n3.p1
        public final long a() {
            long jA = DelegatingThemeAwareRippleNode.this.color.a();
            if (jA != 16) {
                return jA;
            }
            RippleConfiguration rippleConfiguration = (RippleConfiguration) g4.f.a(DelegatingThemeAwareRippleNode.this, i.e());
            return (rippleConfiguration == null || rippleConfiguration.getColor() == 16) ? ((Color) g4.f.a(DelegatingThemeAwareRippleNode.this, h4.a())).m20unboximpl() : rippleConfiguration.getColor();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p1 {
        b() {
        }

        @Override // n3.p1
        public final long a() {
            RippleConfiguration rippleConfiguration = (RippleConfiguration) g4.f.a(DelegatingThemeAwareRippleNode.this, i.e());
            return (rippleConfiguration != null ? rippleConfiguration.getFocus() : null) instanceof RippleConfiguration.a.C0202a ? ((RippleConfiguration.a.C0202a) rippleConfiguration.getFocus()).getInnerStrokeColor() : ((d.Values) g4.f.a(DelegatingThemeAwareRippleNode.this, d.f9816a.b())).getColorScheme().getOnSecondary();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p1 {
        c() {
        }

        @Override // n3.p1
        public final long a() {
            RippleConfiguration rippleConfiguration = (RippleConfiguration) g4.f.a(DelegatingThemeAwareRippleNode.this, i.e());
            return (rippleConfiguration != null ? rippleConfiguration.getFocus() : null) instanceof RippleConfiguration.a.C0202a ? ((RippleConfiguration.a.C0202a) rippleConfiguration.getFocus()).getOuterStrokeColor() : ((d.Values) g4.f.a(DelegatingThemeAwareRippleNode.this, d.f9816a.b())).getColorScheme().getSecondary();
        }
    }

    public /* synthetic */ DelegatingThemeAwareRippleNode(b1.j jVar, boolean z15, float f15, p1 p1Var, y2 y2Var, boolean z16, boolean z17, boolean z18, boolean z19, fr.k kVar) {
        this(jVar, z15, f15, p1Var, y2Var, z16, z17, z18, z19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A3(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        if (((RippleConfiguration) g4.f.a(delegatingThemeAwareRippleNode, i.e())) == null) {
            delegatingThemeAwareRippleNode.y3();
        } else if (delegatingThemeAwareRippleNode.rippleNode == null) {
            delegatingThemeAwareRippleNode.w3();
        }
        return i0.f148189a;
    }

    private final void w3() {
        a aVar = new a();
        final c cVar = new c();
        final b bVar = new b();
        this.rippleNode = n3(o.c(this.interactionSource, this.bounded, this.radius, aVar, new er.a() { // from class: androidx.compose.material3.b
            @Override // er.a
            public final Object a() {
                return DelegatingThemeAwareRippleNode.x3(this.f9798a, cVar, bVar);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.material3.internal.ripple.b x3(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, p1 p1Var, p1 p1Var2) {
        androidx.compose.material3.internal.ripple.b.d c0210b;
        androidx.compose.material3.internal.ripple.b.AbstractC0207b aVar;
        androidx.compose.material3.internal.ripple.b.c c0209b;
        androidx.compose.material3.internal.ripple.b.a c0206b;
        RippleAlpha rippleAlpha;
        RippleAlpha rippleAlpha2;
        RippleAlpha rippleAlpha3;
        RippleAlpha rippleAlpha4;
        f motionScheme = ((d.Values) g4.f.a(delegatingThemeAwareRippleNode, d.f9816a.b())).getMotionScheme();
        k kVar = (k) g4.f.a(delegatingThemeAwareRippleNode, i.f());
        RippleConfiguration rippleConfiguration = (RippleConfiguration) g4.f.a(delegatingThemeAwareRippleNode, i.e());
        float focusedAlpha = 0.1f;
        if (delegatingThemeAwareRippleNode.enablePressIndication) {
            c0210b = new androidx.compose.material3.internal.ripple.b.d.C0210b((rippleConfiguration == null || (rippleAlpha4 = rippleConfiguration.getRippleAlpha()) == null) ? 0.1f : rippleAlpha4.getPressedAlpha());
        } else {
            c0210b = androidx.compose.material3.internal.ripple.b.d.a.f9895a;
        }
        if (delegatingThemeAwareRippleNode.enableFocusIndication) {
            k.a focus = kVar.getFocus();
            if (focus instanceof k.a.b) {
                if (rippleConfiguration != null && (rippleAlpha3 = rippleConfiguration.getRippleAlpha()) != null) {
                    focusedAlpha = rippleAlpha3.getFocusedAlpha();
                }
                aVar = new androidx.compose.material3.internal.ripple.b.AbstractC0207b.c(focusedAlpha);
            } else {
                if (!(focus instanceof k.a.C0211a)) {
                    throw new IllegalStateException("Unknown focus ripple theme configuration");
                }
                aVar = new androidx.compose.material3.internal.ripple.b.AbstractC0207b.a(delegatingThemeAwareRippleNode.focusRingShape, ((k.a.C0211a) kVar.getFocus()).getOuterStrokeInset(), ((k.a.C0211a) kVar.getFocus()).getOuterStrokeWidth(), p1Var, ((k.a.C0211a) kVar.getFocus()).getInnerStrokeInset(), ((k.a.C0211a) kVar.getFocus()).getInnerStrokeWidth(), p1Var2, motionScheme.a(), motionScheme.e(), null);
            }
        } else {
            aVar = androidx.compose.material3.internal.ripple.b.AbstractC0207b.C0208b.f9891a;
        }
        if (delegatingThemeAwareRippleNode.enableHoverIndication) {
            c0209b = new androidx.compose.material3.internal.ripple.b.c.C0209b((rippleConfiguration == null || (rippleAlpha2 = rippleConfiguration.getRippleAlpha()) == null) ? 0.08f : rippleAlpha2.getHoveredAlpha());
        } else {
            c0209b = androidx.compose.material3.internal.ripple.b.c.a.f9893a;
        }
        if (delegatingThemeAwareRippleNode.enableDragIndication) {
            c0206b = new androidx.compose.material3.internal.ripple.b.a.C0206b((rippleConfiguration == null || (rippleAlpha = rippleConfiguration.getRippleAlpha()) == null) ? 0.16f : rippleAlpha.getDraggedAlpha());
        } else {
            c0206b = androidx.compose.material3.internal.ripple.b.a.C0205a.f9880a;
        }
        return new androidx.compose.material3.internal.ripple.b(c0210b, aVar, c0209b, c0206b);
    }

    private final void y3() {
        g4.g gVar = this.rippleNode;
        if (gVar != null) {
            q3(gVar);
        }
        this.rippleNode = null;
    }

    private final void z3() {
        w0.a(this, new er.a() { // from class: androidx.compose.material3.a
            @Override // er.a
            public final Object a() {
                return DelegatingThemeAwareRippleNode.A3(this.f9797a);
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

    private DelegatingThemeAwareRippleNode(b1.j jVar, boolean z15, float f15, p1 p1Var, y2 y2Var, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.interactionSource = jVar;
        this.bounded = z15;
        this.radius = f15;
        this.color = p1Var;
        this.focusRingShape = y2Var;
        this.enablePressIndication = z16;
        this.enableFocusIndication = z17;
        this.enableHoverIndication = z18;
        this.enableDragIndication = z19;
    }
}
