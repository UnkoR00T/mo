package zv;

import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lzv/f;", "Lzv/c;", "Lyv/a;", "type", "", "Lzv/a;", "children", "<init>", "(Lyv/a;Ljava/util/List;)V", "e", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class f extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<a> children;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public f(yv.a aVar, List<? extends a> list) {
        a aVar2 = (a) v.n0(list);
        int startOffset = aVar2 != null ? aVar2.getStartOffset() : 0;
        a aVar3 = (a) v.z0(list);
        super(aVar, startOffset, aVar3 != null ? aVar3.getEndOffset() : 0);
        this.children = list;
        for (a aVar4 : list) {
            if (aVar4 instanceof c) {
                ((c) aVar4).c(this);
            }
        }
    }

    @Override // zv.a
    public final List<a> getChildren() {
        return this.children;
    }
}
