package t1;

import g4.l0;
import oq.i0;
import p036e4.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\t\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u001e\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR,\u0010\t\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR,\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lt1/n;", "Lg4/l0;", "Lt1/q;", "Lt1/s;", "requester", "Lkotlin/Function1;", "Ltq/e;", "Loq/i0;", "", "onShow", "onHide", "Le4/b0;", "Lm3/g;", "computeContentBounds", "<init>", "(Lt1/s;Ler/l;Ler/l;Ler/l;)V", "a", "()Lt1/q;", "node", "l", "(Lt1/q;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Lt1/s;", "e", "Ler/l;", "f", "g", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n extends l0<q> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s requester;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.l<tq.e<? super i0>, Object> onShow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final er.l<tq.e<? super i0>, Object> onHide;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final er.l<b0, m3.g> computeContentBounds;

    /* JADX WARN: Multi-variable type inference failed */
    public n(s sVar, er.l<? super tq.e<? super i0>, ? extends Object> lVar, er.l<? super tq.e<? super i0>, ? extends Object> lVar2, er.l<? super b0, m3.g> lVar3) {
        this.requester = sVar;
        this.onShow = lVar;
        this.onHide = lVar2;
        this.computeContentBounds = lVar3;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q create() {
        return new q(this.requester, this.onShow, this.onHide, this.computeContentBounds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        return this.requester == nVar.requester && this.onShow == nVar.onShow && this.onHide == nVar.onHide && this.computeContentBounds == nVar.computeContentBounds;
    }

    public int hashCode() {
        int iHashCode = this.requester.hashCode() * 31;
        er.l<tq.e<? super i0>, Object> lVar = this.onShow;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        er.l<tq.e<? super i0>, Object> lVar2 = this.onHide;
        return ((iHashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31) + this.computeContentBounds.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(q node) {
        node.D3(this.requester);
        node.B3(this.onShow);
        node.A3(this.onHide);
        node.z3(this.computeContentBounds);
    }
}
