package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg4/g;", "Lf3/m$c;", "b", "(Lg4/g;)Lf3/m$c;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final f3.m.c b(g gVar) {
        int iA = s0.a(4);
        int iA2 = s0.a(2);
        f3.m.c child = gVar.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & iA) == 0) {
            return null;
        }
        while (child != null && (child.getKindSet() & iA2) == 0) {
            if ((child.getKindSet() & iA) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
