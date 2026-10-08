package ja;

import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0014\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001f\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050)8\u0006¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lja/d0;", "", "<init>", "()V", "Lkotlin/Function1;", "Lja/i;", "computeNewState", "Loq/i0;", "e", "(Ler/l;)V", "previousState", "Lja/x;", "newSource", "newRemote", "d", "(Lja/i;Lja/x;Lja/x;)Lja/i;", "Lja/w;", "sourceRefreshState", "sourceState", "remoteState", "c", "(Lja/w;Lja/w;Lja/w;Lja/w;)Lja/w;", "sourceLoadStates", "remoteLoadStates", "g", "(Lja/x;Lja/x;)V", "Lja/y;", "type", "", "remote", "state", "h", "(Lja/y;ZLja/w;)V", "Lla/a;", "a", "Lla/a;", "listeners", "Lmu/b0;", "b", "Lmu/b0;", "_stateFlow", "Lmu/p0;", "Lmu/p0;", "f", "()Lmu/p0;", "stateFlow", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final la.a<er.l<CombinedLoadStates, oq.i0>> listeners = new la.a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<CombinedLoadStates> _stateFlow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<CombinedLoadStates> stateFlow;

    public d0() {
        mu.b0<CombinedLoadStates> b0VarA = mu.r0.a(null);
        this._stateFlow = b0VarA;
        this.stateFlow = mu.i.b(b0VarA);
    }

    private final w c(w previousState, w sourceRefreshState, w sourceState, w remoteState) {
        if (remoteState == null) {
            return sourceState;
        }
        if (previousState instanceof w.Loading) {
            return (((sourceRefreshState instanceof w.NotLoading) && (remoteState instanceof w.NotLoading)) || (remoteState instanceof w.Error)) ? remoteState : previousState;
        }
        return remoteState;
    }

    private final CombinedLoadStates d(CombinedLoadStates previousState, LoadStates newSource, LoadStates newRemote) {
        w wVarB;
        w wVarB2;
        w wVarB3;
        if (previousState == null || (wVarB = previousState.getRefresh()) == null) {
            wVarB = w.NotLoading.INSTANCE.b();
        }
        w wVarC = c(wVarB, newSource.getRefresh(), newSource.getRefresh(), newRemote != null ? newRemote.getRefresh() : null);
        if (previousState == null || (wVarB2 = previousState.getPrepend()) == null) {
            wVarB2 = w.NotLoading.INSTANCE.b();
        }
        w wVarC2 = c(wVarB2, newSource.getRefresh(), newSource.getPrepend(), newRemote != null ? newRemote.getPrepend() : null);
        if (previousState == null || (wVarB3 = previousState.getAppend()) == null) {
            wVarB3 = w.NotLoading.INSTANCE.b();
        }
        return new CombinedLoadStates(wVarC, wVarC2, c(wVarB3, newSource.getRefresh(), newSource.getAppend(), newRemote != null ? newRemote.getAppend() : null), newSource, newRemote);
    }

    private final void e(er.l<? super CombinedLoadStates, CombinedLoadStates> computeNewState) {
        CombinedLoadStates value;
        CombinedLoadStates combinedLoadStatesB;
        mu.b0<CombinedLoadStates> b0Var = this._stateFlow;
        do {
            value = b0Var.getValue();
            CombinedLoadStates combinedLoadStates = value;
            combinedLoadStatesB = computeNewState.b(combinedLoadStates);
            if (fr.t.c(combinedLoadStates, combinedLoadStatesB)) {
                return;
            }
        } while (!b0Var.s(value, combinedLoadStatesB));
        if (combinedLoadStatesB != null) {
            Iterator<er.l<CombinedLoadStates, oq.i0>> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().b(combinedLoadStatesB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CombinedLoadStates i(d0 d0Var, LoadStates loadStates, LoadStates loadStates2, CombinedLoadStates combinedLoadStates) {
        return d0Var.d(combinedLoadStates, loadStates, loadStates2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CombinedLoadStates j(boolean z15, y yVar, w wVar, d0 d0Var, CombinedLoadStates combinedLoadStates) {
        LoadStates loadStatesA;
        if (combinedLoadStates == null || (loadStatesA = combinedLoadStates.getSource()) == null) {
            loadStatesA = LoadStates.INSTANCE.a();
        }
        LoadStates mediator = combinedLoadStates != null ? combinedLoadStates.getMediator() : null;
        if (z15) {
            mediator = LoadStates.INSTANCE.a().i(yVar, wVar);
        } else {
            loadStatesA = loadStatesA.i(yVar, wVar);
        }
        return d0Var.d(combinedLoadStates, loadStatesA, mediator);
    }

    public final mu.p0<CombinedLoadStates> f() {
        return this.stateFlow;
    }

    public final void g(final LoadStates sourceLoadStates, final LoadStates remoteLoadStates) {
        e(new er.l() { // from class: ja.c0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.i(this.f100604a, sourceLoadStates, remoteLoadStates, (CombinedLoadStates) obj);
            }
        });
    }

    public final void h(final y type, final boolean remote, final w state) {
        e(new er.l() { // from class: ja.b0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.j(remote, type, state, this, (CombinedLoadStates) obj);
            }
        });
    }
}
