package c24;

import er.l;
import er.p;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import n20.State;
import n20.j;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JS\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00020\r0\u0010\"\b\b\u0000\u0010\t*\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u001e\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lc24/g;", "Ln20/j;", "Lyy/a;", "stateMachineFactory", "Ly20/f;", "animationsStateMachine", "<init>", "(Lyy/a;Ly20/f;)V", "", "T", "initialState", "Lkotlin/Function1;", "Lk10/v;", "Ln20/a;", "Loq/i0;", "documentSpecificTransitionGraph", "Lk10/t;", "Ln20/b;", "a", "(Ljava/lang/Object;Ler/l;)Lk10/t;", "Lyy/a;", "b", "Ly20/f;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yy.a stateMachineFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y20.f animationsStateMachine;

    public g(yy.a aVar, y20.f fVar) {
        this.stateMachineFactory = aVar;
        this.animationsStateMachine = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final g gVar, final Object obj, final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new l() { // from class: c24.d
            @Override // er.l
            public final Object b(Object obj2) {
                return g.i(this.f22783a, obj, lVar, (z) obj2);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(g gVar, Object obj, l lVar, z zVar) {
        zVar.E(gVar.animationsStateMachine, new p() { // from class: c24.e
            @Override // er.p
            public final Object B(Object obj2, Object obj3) {
                return g.j((c0) obj2, (y20.b) obj3);
            }
        });
        zVar.E(gVar.stateMachineFactory.a(obj, lVar), new p() { // from class: c24.f
            @Override // er.p
            public final Object B(Object obj2, Object obj3) {
                return g.l((c0) obj2, obj3);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k10.l j(c0 c0Var, final y20.b bVar) {
        return c0Var.d(new l() { // from class: c24.a
            @Override // er.l
            public final Object b(Object obj) {
                return g.k(bVar, (State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State k(y20.b bVar, State state) {
        return State.b(state, null, bVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k10.l l(c0 c0Var, final Object obj) {
        return c0Var.d(new l() { // from class: c24.b
            @Override // er.l
            public final Object b(Object obj2) {
                return g.m(obj, (State) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State m(Object obj, State state) {
        return State.b(state, obj, null, 2, null);
    }

    @Override // n20.j
    public <T> t<State<T>, n20.a> a(final T initialState, final l<? super v<T, n20.a>, i0> documentSpecificTransitionGraph) {
        return this.stateMachineFactory.a(new State(initialState, null, 2, null), new l() { // from class: c24.c
            @Override // er.l
            public final Object b(Object obj) {
                return g.h(this.f22780a, initialState, documentSpecificTransitionGraph, (v) obj);
            }
        });
    }
}
