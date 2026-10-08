package androidx.compose.material;

import androidx.compose.ui.graphics.Color;
import b1.j;
import c5.h;
import fr.k;
import fr.t;
import g4.g;
import n3.p1;
import p071kotlin.Metadata;
import w0.r1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/material/d;", "Lw0/r1;", "", "bounded", "Lc5/h;", "radius", "Ln3/p1;", "colorProducer", "Landroidx/compose/ui/graphics/Color;", "color", "<init>", "(ZFLn3/p1;J)V", "(ZFJLfr/k;)V", "Lb1/j;", "interactionSource", "Lg4/g;", "a", "(Lb1/j;)Lg4/g;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "b", "F", "c", "Ln3/p1;", "d", "J", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class d implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 colorProducer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long color;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements p1 {
        a() {
        }

        @Override // n3.p1
        public final long a() {
            return d.this.color;
        }
    }

    public /* synthetic */ d(boolean z15, float f15, long j15, k kVar) {
        this(z15, f15, j15);
    }

    @Override // w0.r1
    public g a(j interactionSource) {
        p1 aVar = this.colorProducer;
        if (aVar == null) {
            aVar = new a();
        }
        return new DelegatingThemeAwareRippleNode(interactionSource, this.bounded, this.radius, aVar, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        if (this.bounded == dVar.bounded && h.p(this.radius, dVar.radius) && t.c(this.colorProducer, dVar.colorProducer)) {
            return Color.m11equalsimpl0(this.color, dVar.color);
        }
        return false;
    }

    @Override // w0.r1
    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.bounded) * 31) + h.q(this.radius)) * 31;
        p1 p1Var = this.colorProducer;
        return ((iHashCode + (p1Var != null ? p1Var.hashCode() : 0)) * 31) + Color.m17hashCodeimpl(this.color);
    }

    private d(boolean z15, float f15, p1 p1Var, long j15) {
        this.bounded = z15;
        this.radius = f15;
        this.colorProducer = p1Var;
        this.color = j15;
    }

    private d(boolean z15, float f15, long j15) {
        this(z15, f15, (p1) null, j15);
    }
}
