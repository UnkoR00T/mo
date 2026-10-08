package p056h1;

import fr.t;
import g4.l0;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lh1/s;", "Lg4/l0;", "Lh1/v;", "Lh1/w;", "state", "Lh1/r;", "beyondBoundsInfo", "", "reverseLayout", "Lz0/a2;", "orientation", "<init>", "(Lh1/w;Lh1/r;ZLz0/a2;)V", "a", "()Lh1/v;", "node", "Loq/i0;", "l", "(Lh1/v;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lh1/w;", "getState", "()Lh1/w;", "e", "Lh1/r;", "getBeyondBoundsInfo", "()Lh1/r;", "f", "Z", "getReverseLayout", "()Z", "g", "Lz0/a2;", "getOrientation", "()Lz0/a2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s extends l0<v> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r beyondBoundsInfo;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a2 orientation;

    public s(w wVar, r rVar, boolean z15, a2 a2Var) {
        this.state = wVar;
        this.beyondBoundsInfo = rVar;
        this.reverseLayout = z15;
        this.orientation = a2Var;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v create() {
        return new v(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return t.c(this.state, sVar.state) && t.c(this.beyondBoundsInfo, sVar.beyondBoundsInfo) && this.reverseLayout == sVar.reverseLayout && this.orientation == sVar.orientation;
    }

    public int hashCode() {
        return (((((this.state.hashCode() * 31) + this.beyondBoundsInfo.hashCode()) * 31) + Boolean.hashCode(this.reverseLayout)) * 31) + this.orientation.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(v node) {
        node.u3(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }
}
