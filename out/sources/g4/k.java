package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001c¨\u0006\u001e"}, d2 = {"Lg4/k;", "", "", "extraAssertions", "<init>", "(Z)V", "Lr0/p0;", "Landroidx/compose/ui/node/g;", "f", "()Lr0/p0;", "node", "b", "(Landroidx/compose/ui/node/g;)Z", "Loq/i0;", "a", "(Landroidx/compose/ui/node/g;)V", "e", "d", "()Landroidx/compose/ui/node/g;", "c", "()Z", "", "toString", "()Ljava/lang/String;", "Z", "Lr0/p0;", "mapOfOriginalDepth", "Lg4/l1;", "Lg4/l1;", "set", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean extraAssertions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private r0.p0<androidx.compose.ui.node.g> mapOfOriginalDepth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l1<androidx.compose.ui.node.g> set = new l1<>(l.f70345a);

    public k(boolean z15) {
        this.extraAssertions = z15;
    }

    private final r0.p0<androidx.compose.ui.node.g> f() {
        if (this.mapOfOriginalDepth == null) {
            this.mapOfOriginalDepth = r0.z0.b();
        }
        return this.mapOfOriginalDepth;
    }

    public final void a(androidx.compose.ui.node.g node) {
        if (!node.c()) {
            d4.a.c("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            r0.p0<androidx.compose.ui.node.g> p0VarF = f();
            int iE = p0VarF.e(node, Integer.MAX_VALUE);
            if (iE == Integer.MAX_VALUE) {
                p0VarF.u(node, node.getDepth());
            } else {
                if (!(iE == node.getDepth())) {
                    d4.a.c("invalid node depth");
                }
            }
        }
        this.set.add(node);
    }

    public final boolean b(androidx.compose.ui.node.g node) {
        boolean zContains = this.set.contains(node);
        if (this.extraAssertions) {
            if (!(zContains == f().a(node))) {
                d4.a.c("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean c() {
        return this.set.isEmpty();
    }

    public final androidx.compose.ui.node.g d() {
        androidx.compose.ui.node.g gVarFirst = this.set.first();
        e(gVarFirst);
        return gVarFirst;
    }

    public final boolean e(androidx.compose.ui.node.g node) {
        if (!node.c()) {
            d4.a.c("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(node);
        if (this.extraAssertions) {
            r0.p0<androidx.compose.ui.node.g> p0VarF = f();
            if (p0VarF.a(node)) {
                int iC = p0VarF.c(node);
                p0VarF.r(node);
                if (!(iC == (zRemove ? node.getDepth() : Integer.MAX_VALUE))) {
                    d4.a.c("invalid node depth");
                }
            }
        }
        return zRemove;
    }

    public String toString() {
        return this.set.toString();
    }
}
