package iw;

import java.util.ArrayList;
import java.util.List;
import nw.i.a;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010 \u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"Liw/b;", "Liw/j;", "Lzv/b;", "nodeBuilder", "Lnw/i;", "tokensCache", "Liw/a;", "cancellationToken", "<init>", "(Lzv/b;Lnw/i;Liw/a;)V", "", "Liw/j$a;", "currentNodeChildren", "", "currentTokenPosition", "Loq/i0;", "g", "(Lnw/i;Ljava/util/List;I)V", "Lzv/a;", "childrenWithWhitespaces", "from", "dx", "exitOffset", "f", "(Lnw/i;Ljava/util/List;III)V", "Liw/j$b;", "event", "d", "(Liw/j$b;Ljava/util/List;)V", "", "", "isTopmostNode", "c", "(Liw/j$b;Ljava/util/List;Z)Liw/j$a;", "Lnw/i;", "I", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class b extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nw.i tokensCache;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int currentTokenPosition;

    public b(zv.b bVar, nw.i iVar, a aVar) {
        super(bVar, aVar);
        this.tokensCache = iVar;
        this.currentTokenPosition = -1;
    }

    private final void f(nw.i tokensCache, List<zv.a> childrenWithWhitespaces, int from, int dx4, int exitOffset) {
        nw.i.a aVar = tokensCache.new a(from);
        int i15 = 0;
        while (true) {
            int i16 = i15 + dx4;
            if (aVar.j(i16) == null || aVar.k(i16) == exitOffset) {
                break;
            } else {
                i15 = i16;
            }
        }
        while (i15 != 0) {
            childrenWithWhitespaces.addAll(getNodeBuilder().b(aVar.j(i15), aVar.k(i15), aVar.k(i15 + 1)));
            i15 -= dx4;
        }
    }

    private final void g(nw.i tokensCache, List<j.a> currentNodeChildren, int currentTokenPosition) {
        nw.i.a aVar = tokensCache.new a(currentTokenPosition);
        hw.a aVar2 = hw.a.f86718a;
        if (!(aVar.h() != null)) {
            throw new yv.d("");
        }
        for (zv.a aVar3 : getNodeBuilder().b(aVar.h(), aVar.g(), aVar.c())) {
            if (currentNodeChildren != null) {
                currentNodeChildren.add(new j.a(aVar3, aVar.getIndex(), aVar.getIndex() + 1));
            }
        }
    }

    @Override // iw.j
    protected j.a c(j.b event, List<j.a> currentNodeChildren, boolean isTopmostNode) {
        b bVar;
        yv.a type = event.getInfo().getType();
        int first = event.getInfo().getRange().getFirst();
        int last = event.getInfo().getRange().getLast();
        ArrayList arrayList = new ArrayList(currentNodeChildren.size());
        if (isTopmostNode) {
            f(this.tokensCache, arrayList, first, -1, -1);
            bVar = this;
        } else {
            bVar = this;
        }
        int size = currentNodeChildren.size();
        for (int i15 = 1; i15 < size; i15++) {
            j.a aVar = currentNodeChildren.get(i15 - 1);
            j.a aVar2 = currentNodeChildren.get(i15);
            arrayList.add(aVar.getAstNode());
            bVar.f(bVar.tokensCache, arrayList, aVar.getEndTokenIndex() - 1, 1, bVar.tokensCache.new a(aVar2.getStartTokenIndex()).g());
        }
        if (!currentNodeChildren.isEmpty()) {
            arrayList.add(((j.a) v.x0(currentNodeChildren)).getAstNode());
        }
        if (isTopmostNode) {
            nw.i iVar = bVar.tokensCache;
            bVar.f(iVar, arrayList, last - 1, 1, iVar.new a(last).g());
        }
        return new j.a(getNodeBuilder().a(type, arrayList), first, last);
    }

    @Override // iw.j
    protected void d(j.b event, List<j.a> currentNodeChildren) {
        if (this.currentTokenPosition == -1) {
            this.currentTokenPosition = event.getPosition();
        }
        while (this.currentTokenPosition < event.getPosition()) {
            g(this.tokensCache, currentNodeChildren, this.currentTokenPosition);
            this.currentTokenPosition++;
        }
    }
}
