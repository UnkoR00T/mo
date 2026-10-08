package fs;

import java.lang.Enum;
import java.util.List;
import mr.j;
import mr.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b<Node, E extends Enum<E>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j<Node, Integer> f66792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ws.b.d<? extends bt.j.a> f66793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wq.a<E> f66794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<d> f66795d;

    public b(j<Node, Integer> jVar, ws.b.d<? extends bt.j.a> dVar, wq.a<E> aVar, List<d> list) {
        this.f66792a = jVar;
        this.f66793b = dVar;
        this.f66794c = aVar;
        this.f66795d = list;
    }

    public final E a(Node node, l<?> lVar) {
        return this.f66794c.get(this.f66793b.d(this.f66792a.get(node).intValue()).h());
    }
}
