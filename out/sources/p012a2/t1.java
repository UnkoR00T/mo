package p012a2;

import c5.b;
import c5.r;
import er.p;
import fr.t;
import g4.l0;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR8\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"La2/t1;", "T", "Lg4/l0;", "La2/v1;", "La2/i;", "state", "Lkotlin/Function2;", "Lc5/r;", "Lc5/b;", "Loq/r;", "La2/r1;", "anchors", "Lz0/a2;", "orientation", "<init>", "(La2/i;Ler/p;Lz0/a2;)V", "a", "()La2/v1;", "node", "Loq/i0;", "l", "(La2/v1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "La2/i;", "e", "Ler/p;", "f", "Lz0/a2;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class t1<T> extends l0<v1<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i<T> state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p<r, b, oq.r<r1<T>, T>> anchors;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a2 orientation;

    /* JADX WARN: Multi-variable type inference failed */
    public t1(i<T> iVar, p<? super r, ? super b, ? extends oq.r<? extends r1<T>, ? extends T>> pVar, a2 a2Var) {
        this.state = iVar;
        this.anchors = pVar;
        this.orientation = a2Var;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v1<T> create() {
        return new v1<>(this.state, this.anchors, this.orientation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) other;
        return t.c(this.state, t1Var.state) && this.anchors == t1Var.anchors && this.orientation == t1Var.orientation;
    }

    public int hashCode() {
        return (((this.state.hashCode() * 31) + this.anchors.hashCode()) * 31) + this.orientation.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(v1<T> node) {
        node.r3(this.state);
        node.p3(this.anchors);
        node.q3(this.orientation);
    }
}
