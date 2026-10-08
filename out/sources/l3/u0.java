package l3;

import java.util.Comparator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Ll3/u0;", "Ljava/util/Comparator;", "Ll3/p0;", "Lkotlin/Comparator;", "<init>", "()V", "Landroidx/compose/ui/node/g;", "layoutNode", "Ln2/c;", "b", "(Landroidx/compose/ui/node/g;)Ln2/c;", "a", "", "(Ll3/p0;Ll3/p0;)I", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u0 implements Comparator<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f115633a = new u0();

    private u0() {
    }

    private final n2.c<androidx.compose.ui.node.g> b(androidx.compose.ui.node.g layoutNode) {
        n2.c<androidx.compose.ui.node.g> cVar = new n2.c<>(new androidx.compose.ui.node.g[16], 0);
        while (layoutNode != null) {
            cVar.c(0, layoutNode);
            layoutNode = layoutNode.C0();
        }
        return cVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(p0 a15, p0 b15) {
        int i15 = 0;
        if (!s0.g(a15) || !s0.g(b15)) {
            if (s0.g(a15)) {
                return -1;
            }
            return s0.g(b15) ? 1 : 0;
        }
        androidx.compose.ui.node.g gVarS = g4.h.s(a15);
        androidx.compose.ui.node.g gVarS2 = g4.h.s(b15);
        if (fr.t.c(gVarS, gVarS2)) {
            return 0;
        }
        n2.c<androidx.compose.ui.node.g> cVarB = b(gVarS);
        n2.c<androidx.compose.ui.node.g> cVarB2 = b(gVarS2);
        int iMin = Math.min(cVarB.getSize() - 1, cVarB2.getSize() - 1);
        if (iMin >= 0) {
            while (fr.t.c(cVarB.content[i15], cVarB2.content[i15])) {
                if (i15 != iMin) {
                    i15++;
                }
            }
            return fr.t.d(cVarB.content[i15].D0(), cVarB2.content[i15].D0());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
