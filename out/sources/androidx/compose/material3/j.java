package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import fr.t;
import n3.p1;
import n3.t2;
import n3.y2;
import p071kotlin.Metadata;
import w0.r1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001BS\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011BK\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001f¨\u0006,"}, d2 = {"Landroidx/compose/material3/j;", "Lw0/r1;", "", "bounded", "Lc5/h;", "radius", "Ln3/p1;", "colorProducer", "Landroidx/compose/ui/graphics/Color;", "color", "Ln3/y2;", "focusRingShape", "enablePressIndication", "enableFocusIndication", "enableHoverIndication", "enableDragIndication", "<init>", "(ZFLn3/p1;JLn3/y2;ZZZZ)V", "(ZFJLn3/y2;ZZZZLfr/k;)V", "Lb1/j;", "interactionSource", "Lg4/g;", "a", "(Lb1/j;)Lg4/g;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "b", "F", "c", "Ln3/p1;", "d", "J", "e", "Ln3/y2;", "f", "g", "h", "i", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 colorProducer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long color;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y2 focusRingShape;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean enablePressIndication;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean enableFocusIndication;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean enableHoverIndication;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean enableDragIndication;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p1 {
        a() {
        }

        @Override // n3.p1
        public final long a() {
            return j.this.color;
        }
    }

    public /* synthetic */ j(boolean z15, float f15, long j15, y2 y2Var, boolean z16, boolean z17, boolean z18, boolean z19, fr.k kVar) {
        this(z15, f15, j15, y2Var, z16, z17, z18, z19);
    }

    @Override // w0.r1
    public g4.g a(b1.j interactionSource) {
        p1 aVar = this.colorProducer;
        if (aVar == null) {
            aVar = new a();
        }
        return new DelegatingThemeAwareRippleNode(interactionSource, this.bounded, this.radius, aVar, this.focusRingShape, this.enablePressIndication, this.enableFocusIndication, this.enableHoverIndication, this.enableDragIndication, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j)) {
            return false;
        }
        j jVar = (j) other;
        return this.bounded == jVar.bounded && c5.h.p(this.radius, jVar.radius) && t.c(this.colorProducer, jVar.colorProducer) && Color.m11equalsimpl0(this.color, jVar.color) && t.c(this.focusRingShape, jVar.focusRingShape) && this.enablePressIndication == jVar.enablePressIndication && this.enableFocusIndication == jVar.enableFocusIndication && this.enableHoverIndication == jVar.enableHoverIndication && this.enableDragIndication == jVar.enableDragIndication;
    }

    @Override // w0.r1
    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.bounded) * 31) + c5.h.q(this.radius)) * 31;
        p1 p1Var = this.colorProducer;
        return ((((((((((((iHashCode + (p1Var != null ? p1Var.hashCode() : 0)) * 31) + Color.m17hashCodeimpl(this.color)) * 31) + this.focusRingShape.hashCode()) * 31) + Boolean.hashCode(this.enablePressIndication)) * 31) + Boolean.hashCode(this.enableFocusIndication)) * 31) + Boolean.hashCode(this.enableHoverIndication)) * 31) + Boolean.hashCode(this.enableDragIndication);
    }

    private j(boolean z15, float f15, p1 p1Var, long j15, y2 y2Var, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.bounded = z15;
        this.radius = f15;
        this.colorProducer = p1Var;
        this.color = j15;
        this.focusRingShape = y2Var;
        this.enablePressIndication = z16;
        this.enableFocusIndication = z17;
        this.enableHoverIndication = z18;
        this.enableDragIndication = z19;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private j(boolean z15, float f15, long j15, y2 y2Var, boolean z16, boolean z17, boolean z18, boolean z19) {
        y2 y2VarA;
        if (y2Var == null) {
            c5.h hVarJ = c5.h.j(f15);
            hVarJ = c5.h.p(hVarJ.getValue(), c5.h.INSTANCE.c()) ? null : hVarJ;
            y2 y2VarF = hVarJ != null ? l1.h.f(hVarJ.getValue()) : null;
            y2VarA = y2VarF == null ? t2.a() : y2VarF;
        } else {
            y2VarA = y2Var;
        }
        this(z15, f15, (p1) null, j15, y2VarA, z16, z17, z18, z19);
    }
}
