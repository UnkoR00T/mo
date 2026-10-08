package w0;

import androidx.compose.ui.graphics.Color;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: w0.d2, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lw0/d2;", "", "Landroidx/compose/ui/graphics/Color;", "glowColor", "Ld1/d3;", "drawPadding", "<init>", "(JLd1/d3;Lfr/k;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "Ld1/d3;", "()Ld1/d3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public final class OverscrollConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long glowColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d1.d3 drawPadding;

    public /* synthetic */ OverscrollConfiguration(long j15, d1.d3 d3Var, fr.k kVar) {
        this(j15, d3Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d1.d3 getDrawPadding() {
        return this.drawPadding;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getGlowColor() {
        return this.glowColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!fr.t.c(OverscrollConfiguration.class, other != null ? other.getClass() : null)) {
            return false;
        }
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) other;
        return Color.m11equalsimpl0(this.glowColor, overscrollConfiguration.glowColor) && fr.t.c(this.drawPadding, overscrollConfiguration.drawPadding);
    }

    public int hashCode() {
        return (Color.m17hashCodeimpl(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) Color.m18toStringimpl(this.glowColor)) + ", drawPadding=" + this.drawPadding + ')';
    }

    private OverscrollConfiguration(long j15, d1.d3 d3Var) {
        this.glowColor = j15;
        this.drawPadding = d3Var;
    }

    public /* synthetic */ OverscrollConfiguration(long j15, d1.d3 d3Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? n3.o1.d(4284900966L) : j15, (i15 & 2) != 0 ? d1.a3.g(0.0f, 0.0f, 3, null) : d3Var, null);
    }
}
