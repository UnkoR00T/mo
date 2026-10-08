package fa;

import ea.NavEntry;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfa/a0;", "", "T", "Lfa/s;", "<init>", "()V", "Lfa/t;", "", "Lea/m;", "entries", "Lfa/h;", "a", "(Lfa/t;Ljava/util/List;)Lfa/h;", "navigation3-ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0<T> implements s<T> {
    @Override // fa.s
    public h<T> a(t<T> tVar, List<NavEntry<T>> list) {
        return new SinglePaneScene(((NavEntry) pq.v.x0(list)).getContentKey(), (NavEntry) pq.v.x0(list), pq.v.g0(list, 1));
    }
}
