package iw;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Liw/i;", "Liw/j;", "Lzv/b;", "nodeBuilder", "<init>", "(Lzv/b;)V", "", "Lzv/a;", "childrenWithWhitespaces", "", "from", "to", "Loq/i0;", "f", "(Ljava/util/List;II)V", "Liw/j$b;", "event", "Liw/j$a;", "currentNodeChildren", "d", "(Liw/j$b;Ljava/util/List;)V", "", "", "isTopmostNode", "c", "(Liw/j$b;Ljava/util/List;Z)Liw/j$a;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class i extends j {
    public i(zv.b bVar) {
        super(bVar);
    }

    private final void f(List<zv.a> childrenWithWhitespaces, int from, int to4) {
        if (from != to4) {
            childrenWithWhitespaces.addAll(getNodeBuilder().b(yv.e.N, from, to4));
        }
    }

    @Override // iw.j
    protected j.a c(j.b event, List<j.a> currentNodeChildren, boolean isTopmostNode) {
        yv.a type = event.getInfo().getType();
        int first = event.getInfo().getRange().getFirst();
        int last = event.getInfo().getRange().getLast();
        if ((type instanceof yv.b) && ((yv.b) type).getIsToken()) {
            return new j.a((zv.a) v.l0(getNodeBuilder().b(type, first, last)), first, last);
        }
        ArrayList arrayList = new ArrayList(currentNodeChildren.size());
        j.a aVar = (j.a) v.n0(currentNodeChildren);
        f(arrayList, first, aVar != null ? aVar.getStartTokenIndex() : last);
        int size = currentNodeChildren.size();
        for (int i15 = 1; i15 < size; i15++) {
            j.a aVar2 = currentNodeChildren.get(i15 - 1);
            j.a aVar3 = currentNodeChildren.get(i15);
            arrayList.add(aVar2.getAstNode());
            f(arrayList, aVar2.getEndTokenIndex(), aVar3.getStartTokenIndex());
        }
        if (!currentNodeChildren.isEmpty()) {
            arrayList.add(((j.a) v.x0(currentNodeChildren)).getAstNode());
            f(arrayList, ((j.a) v.x0(currentNodeChildren)).getEndTokenIndex(), last);
        }
        return new j.a(getNodeBuilder().a(type, arrayList), first, last);
    }

    @Override // iw.j
    protected void d(j.b event, List<j.a> currentNodeChildren) {
    }
}
