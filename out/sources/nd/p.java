package nd;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class p<V, O> implements o<V, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<ud.a<V>> f134267a;

    p(List<ud.a<V>> list) {
        this.f134267a = list;
    }

    @Override // nd.o
    public boolean k() {
        return this.f134267a.isEmpty() || (this.f134267a.size() == 1 && this.f134267a.get(0).i());
    }

    @Override // nd.o
    public List<ud.a<V>> m() {
        return this.f134267a;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        if (!this.f134267a.isEmpty()) {
            sb5.append("values=");
            sb5.append(Arrays.toString(this.f134267a.toArray()));
        }
        return sb5.toString();
    }
}
