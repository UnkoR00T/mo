package h2;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: h2.j3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lh2/j3;", "Lh2/r1$b;", "Lf3/c$c;", "alignment", "", "margin", "<init>", "(Lf3/c$c;I)V", "Lc5/p;", "anchorBounds", "Lc5/r;", "windowSize", "menuHeight", "a", "(Lc5/p;JI)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lf3/c$c;", "b", "I", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Vertical implements r1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final f3.c.InterfaceC1317c alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int margin;

    public Vertical(f3.c.InterfaceC1317c interfaceC1317c, int i15) {
        this.alignment = interfaceC1317c;
        this.margin = i15;
    }

    @Override // h2.r1.b
    public int a(c5.p anchorBounds, long windowSize, int menuHeight) {
        int i15 = (int) (windowSize & BodyPartID.bodyIdMax);
        if (menuHeight >= i15 - (this.margin * 2)) {
            return f3.c.INSTANCE.i().a(menuHeight, i15);
        }
        int iA = this.alignment.a(menuHeight, i15);
        int i16 = this.margin;
        return lr.m.n(iA, i16, (i15 - i16) - menuHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vertical)) {
            return false;
        }
        Vertical vertical = (Vertical) other;
        return fr.t.c(this.alignment, vertical.alignment) && this.margin == vertical.margin;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Integer.hashCode(this.margin);
    }

    public String toString() {
        return "Vertical(alignment=" + this.alignment + ", margin=" + this.margin + ')';
    }
}
