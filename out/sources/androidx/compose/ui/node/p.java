package androidx.compose.ui.node;

import g4.b1;
import p036e4.x0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/p;", "Lg4/b1;", "Le4/x0;", "result", "Landroidx/compose/ui/node/j;", "placeable", "<init>", "(Le4/x0;Landroidx/compose/ui/node/j;)V", "a", "Le4/x0;", "b", "()Le4/x0;", "c", "(Le4/x0;)V", "Landroidx/compose/ui/node/j;", "()Landroidx/compose/ui/node/j;", "", "K1", "()Z", "isValidOwnerScope", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private x0 result;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j placeable;

    public p(x0 x0Var, j jVar) {
        this.result = x0Var;
        this.placeable = jVar;
    }

    @Override // g4.b1
    public boolean K1() {
        return this.placeable.m().c();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j getPlaceable() {
        return this.placeable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final x0 getResult() {
        return this.result;
    }

    public final void c(x0 x0Var) {
        this.result = x0Var;
    }
}
