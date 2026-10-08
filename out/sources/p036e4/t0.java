package p036e4;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.k;
import er.a;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\t\u0010\u0006R\u0018\u0010\u0010\u001a\u00020\u0003*\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Le4/t0;", "Le4/s0;", "Lkotlin/Function0;", "Le4/b0;", "scopeCoordinates", "<init>", "(Ler/a;)V", "e", "(Le4/b0;)Le4/b0;", "a", "Ler/a;", "getScopeCoordinates", "()Ler/a;", "Le4/a2$a;", "i", "(Le4/a2$a;)Le4/b0;", "lookaheadScopeCoordinates", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a<? extends b0> scopeCoordinates;

    /* JADX WARN: Multi-variable type inference failed */
    public t0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void a(a<? extends b0> aVar) {
        this.scopeCoordinates = aVar;
    }

    @Override // p036e4.s0
    public b0 e(b0 b0Var) {
        q0 q0VarG2;
        q0 q0Var = b0Var instanceof q0 ? (q0) b0Var : null;
        if (q0Var != null) {
            return q0Var;
        }
        NodeCoordinator nodeCoordinator = (NodeCoordinator) b0Var;
        k kVarJ3 = nodeCoordinator.getLookaheadDelegate();
        return (kVarJ3 == null || (q0VarG2 = kVarJ3.getLookaheadLayoutCoordinates()) == null) ? nodeCoordinator : q0VarG2;
    }

    @Override // p036e4.s0
    public b0 i(a2.a aVar) {
        return this.scopeCoordinates.a();
    }

    public t0(a<? extends b0> aVar) {
        this.scopeCoordinates = aVar;
    }

    public /* synthetic */ t0(a aVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : aVar);
    }
}
