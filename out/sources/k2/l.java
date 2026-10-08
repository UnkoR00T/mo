package k2;

import g4.l0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0004\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lk2/l;", "Lg4/l0;", "Lk2/u;", "", "isRefreshing", "Lkotlin/Function0;", "Loq/i0;", "onRefresh", "enabled", "Lk2/v;", "state", "Lc5/h;", "threshold", "<init>", "(ZLer/a;ZLk2/v;FLfr/k;)V", "a", "()Lk2/u;", "node", "l", "(Lk2/u;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Z", "()Z", "e", "Ler/a;", "getOnRefresh", "()Ler/a;", "f", "getEnabled", "g", "Lk2/v;", "getState", "()Lk2/v;", "h", "F", "getThreshold-D9Ej5fM", "()F", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends l0<u> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isRefreshing;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onRefresh;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final v state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float threshold;

    public /* synthetic */ l(boolean z15, er.a aVar, boolean z16, v vVar, float f15, fr.k kVar) {
        this(z15, aVar, z16, vVar, f15);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u create() {
        return new u(this.isRefreshing, this.onRefresh, this.enabled, this.state, this.threshold, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return this.isRefreshing == lVar.isRefreshing && this.enabled == lVar.enabled && this.onRefresh == lVar.onRefresh && fr.t.c(this.state, lVar.state) && c5.h.p(this.threshold, lVar.threshold);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isRefreshing) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.onRefresh.hashCode()) * 31) + this.state.hashCode()) * 31) + c5.h.q(this.threshold);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(u node) {
        node.M3(this.onRefresh);
        node.L3(this.enabled);
        node.O3(this.state);
        node.P3(this.threshold);
        boolean isRefreshing = node.getIsRefreshing();
        boolean z15 = this.isRefreshing;
        if (isRefreshing != z15) {
            node.N3(z15);
            node.R3();
        }
    }

    private l(boolean z15, er.a<i0> aVar, boolean z16, v vVar, float f15) {
        this.isRefreshing = z15;
        this.onRefresh = aVar;
        this.enabled = z16;
        this.state = vVar;
        this.threshold = f15;
    }
}
