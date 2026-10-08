package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/o2;", "", "Ln4/w;", "semanticsNode", "Lr0/q;", "Ln4/y;", "currentSemanticsNodes", "<init>", "(Ln4/w;Lr0/q;)V", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "a", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "b", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "Lr0/k0;", "Lr0/k0;", "()Lr0/k0;", "children", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SemanticsConfiguration unmergedConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r0.k0 children;

    public o2(n4.w wVar, r0.q<n4.y> qVar) {
        this.unmergedConfig = wVar.getUnmergedConfig();
        List<n4.w> listV = wVar.v();
        this.children = new r0.k0(listV.size());
        int size = listV.size();
        for (int i15 = 0; i15 < size; i15++) {
            n4.w wVar2 = listV.get(i15);
            if (qVar.a(wVar2.getId())) {
                this.children.h(wVar2.getId());
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r0.k0 getChildren() {
        return this.children;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }
}
