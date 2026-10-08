package ij1;

import fr.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vi1.ChildParticipant;
import wj1.SetupData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00017B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030+8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u0014018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lij1/p;", "Ll00/g;", "Lij1/c;", "Lij1/a;", "Lij1/d;", "", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Ljj1/b;", "screenMapper", "Lij1/b;", "setupData", "<init>", "(Lyy/a;Lmx/c;Ljj1/b;Lij1/b;)V", "Lij1/f;", "u9", "(Lij1/f;)Lij1/f;", "state", "Lij1/d$a;", "o9", "(Lij1/c;)Lij1/d$a;", "data", "Loq/i0;", "r9", "(Lij1/b;)V", "b", "Lmx/c;", "c", "Ljj1/b;", "d", "Lij1/b;", "e", "Lij1/c;", "initialState", "Lxw/b;", "Lij1/a$c;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "j", "a", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, a> implements ij1.d, zx.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f93079k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jj1.b screenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.c> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<ij1.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ij1.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f93087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f93088b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f93089a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f93090b;

            /* JADX INFO: renamed from: ij1.p$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2194a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f93091d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f93092e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f93093f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f93095h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f93096j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f93097k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f93098l;

                public C2194a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f93091d = obj;
                    this.f93092e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f93089a = hVar;
                this.f93090b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2194a c2194a;
                if (eVar instanceof C2194a) {
                    c2194a = (C2194a) eVar;
                    int i15 = c2194a.f93092e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2194a.f93092e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2194a = new C2194a(eVar);
                    }
                } else {
                    c2194a = new C2194a(eVar);
                }
                Object obj2 = c2194a.f93091d;
                Object objE = uq.b.e();
                int i16 = c2194a.f93092e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f93089a;
                    ij1.d.Data dataO9 = this.f93090b.o9((State) obj);
                    c2194a.f93093f = vq.j.a(obj);
                    c2194a.f93095h = vq.j.a(c2194a);
                    c2194a.f93096j = vq.j.a(obj);
                    c2194a.f93097k = vq.j.a(hVar);
                    c2194a.f93098l = 0;
                    c2194a.f93092e = 1;
                    if (hVar.F(dataO9, c2194a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, p pVar) {
            this.f93087a = gVar;
            this.f93088b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ij1.d.Data> hVar, tq.e eVar) {
            Object objA = this.f93087a.a(new a(hVar, this.f93088b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lij1/a$c;", "action", "Lij1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lij1/a$c;Lij1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f93100f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.c cVar = (a.c) this.f93100f;
            Object objE = uq.b.e();
            int i15 = this.f93099e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.c> bVarY1 = p.this.Y1();
                this.f93100f = vq.j.a(cVar);
                this.f93099e = 1;
                if (bVarY1.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.c cVar, State state, tq.e<? super i0> eVar) {
            c cVar2 = p.this.new c(eVar);
            cVar2.f93100f = cVar;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lij1/a$a;", "action", "Lk10/c0;", "Lij1/c;", "state", "Lk10/l;", "<anonymous>", "(Lij1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<a.AddNewChildToState, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f93103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f93104g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.AddNewChildToState addNewChildToState, State state) {
            List listI1 = pq.v.i1(state.getFields().getChildren().e());
            listI1.add(addNewChildToState.getChild());
            return State.b(state, ChooseChildrenFields.h(state.getFields(), listI1, null, 2, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.AddNewChildToState addNewChildToState = (a.AddNewChildToState) this.f93103f;
            c0 c0Var = (c0) this.f93104g;
            uq.b.e();
            if (this.f93102e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ij1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(addNewChildToState, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.AddNewChildToState addNewChildToState, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f93103f = addNewChildToState;
            dVar.f93104g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lij1/a$b;", "<unused var>", "Lk10/c0;", "Lij1/c;", "state", "Lk10/l;", "<anonymous>", "(Lij1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f93106f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f93106f;
            uq.b.e();
            if (this.f93105e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(new a.c.GoToWriteNewChild(new SetupData(((State) c0Var.a()).getFields().getChildren().e())));
            return c0Var.b(new er.l() { // from class: ij1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f93106f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lij1/a$f;", "action", "Lk10/c0;", "Lij1/c;", "state", "Lk10/l;", "<anonymous>", "(Lij1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a.ToggleChildSelection, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f93109f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f93110g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return state.a(state.getFields().g(list, hz.b.C2039b.f86846c), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.ToggleChildSelection toggleChildSelection = (a.ToggleChildSelection) this.f93109f;
            c0 c0Var = (c0) this.f93110g;
            uq.b.e();
            if (this.f93108e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final List listI1 = pq.v.i1(((State) c0Var.a()).getFields().getChildren().e());
            int index = toggleChildSelection.getIndex();
            if (index < 0 || index >= listI1.size()) {
                return c0Var.c();
            }
            ChildParticipant childParticipant = (ChildParticipant) listI1.get(index);
            if (!childParticipant.getIsAgeValidForTraining()) {
                return c0Var.c();
            }
            listI1.set(toggleChildSelection.getIndex(), ChildParticipant.b(childParticipant, null, null, null, false, !childParticipant.getIsSelected(), false, 47, null));
            return c0Var.b(new er.l() { // from class: ij1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.f.O(listI1, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.ToggleChildSelection toggleChildSelection, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f93109f = toggleChildSelection;
            fVar.f93110g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lij1/a$e;", "action", "Lk10/c0;", "Lij1/c;", "state", "Lk10/l;", "<anonymous>", "(Lij1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a.StatementCheckedChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f93112f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f93113g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.StatementCheckedChange statementCheckedChange, State state) {
            return state.a(state.getFields().i(Boolean.valueOf(statementCheckedChange.getIsChecked()), hz.b.C2039b.f86846c), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.StatementCheckedChange statementCheckedChange = (a.StatementCheckedChange) this.f93112f;
            c0 c0Var = (c0) this.f93113g;
            uq.b.e();
            if (this.f93111e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ij1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.g.O(statementCheckedChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.StatementCheckedChange statementCheckedChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f93112f = statementCheckedChange;
            gVar.f93113g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lij1/a$d;", "<unused var>", "Lk10/c0;", "Lij1/c;", "state", "Lk10/l;", "<anonymous>", "(Lij1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.d, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f93115f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChooseChildrenFields.b bVar, ChooseChildrenFields chooseChildrenFields, State state) {
            return state.a(chooseChildrenFields, new d60.j<>(bVar));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f93115f;
            uq.b.e();
            if (this.f93114e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((State) c0Var.a()).e()) {
                p.this.d9(a.c.C2191a.f93036a);
                return c0Var.c();
            }
            List<ChildParticipant> listE = ((State) c0Var.a()).getFields().getChildren().e();
            if (!(listE instanceof Collection) || !listE.isEmpty()) {
                Iterator<T> it = listE.iterator();
                while (it.hasNext()) {
                    if (((ChildParticipant) it.next()).getIsSelected()) {
                        final ChooseChildrenFields chooseChildrenFieldsU9 = p.this.u9(((State) c0Var.a()).getFields());
                        final ChooseChildrenFields.b bVarE = chooseChildrenFieldsU9.e();
                        if (bVarE != null) {
                            return c0Var.b(new er.l() { // from class: ij1.u
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return p.h.O(bVarE, chooseChildrenFieldsU9, (State) obj2);
                                }
                            });
                        }
                        p.this.setupData.getContract().G(((State) c0Var.a()).getFields().getChildren().e());
                        p.this.d9(a.c.b.f93037a);
                        return c0Var.c();
                    }
                }
            }
            p.this.setupData.getContract().G(((State) c0Var.a()).getFields().getChildren().e());
            p.this.d9(a.c.b.f93037a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.d dVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = p.this.new h(eVar);
            hVar.f93115f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, mx.c cVar, jj1.b bVar, SetupData setupData) {
        this.labelProvider = cVar;
        this.screenMapper = bVar;
        this.setupData = setupData;
        List<ChildParticipant> children = setupData.getContract().getChildren();
        List<ChildParticipant> listN = children == null ? pq.v.n() : children;
        ChooseChildrenFields.a.Children children2 = new ChooseChildrenFields.a.Children(null, null, listN, 3, null);
        List<ChildParticipant> list = listN;
        boolean z15 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ChildParticipant) it.next()).getIsSelected()) {
                    z15 = true;
                    break;
                }
            }
        }
        State state = new State(new ChooseChildrenFields(children2, new ChooseChildrenFields.a.Statement(null, null, z15, 3, null)), null, 2, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: ij1.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.s9(this.f93077a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ij1.d.Data o9(State state) {
        return this.screenMapper.b(new jj1.b.Params(state, b9(a.c.C2191a.f93036a), b9(a.d.f93039a), b9(a.b.f93035a), new er.l() { // from class: ij1.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.p9(this.f93074a, ((Integer) obj).intValue());
            }
        }, new er.l() { // from class: ij1.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f93075a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(p pVar, int i15) {
        pVar.d9(new a.ToggleChildSelection(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(p pVar, boolean z15) {
        pVar.d9(new a.StatementCheckedChange(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ij1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(this.f93076a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(p pVar, z zVar) {
        c cVar = pVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.c.class), oVar, cVar);
        zVar.v(q0.c(a.AddNewChildToState.class), oVar, new d(null));
        zVar.v(q0.c(a.b.class), oVar, pVar.new e(null));
        zVar.v(q0.c(a.ToggleChildSelection.class), oVar, new f(null));
        zVar.v(q0.c(a.StatementCheckedChange.class), oVar, new g(null));
        zVar.v(q0.c(a.d.class), oVar, pVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChooseChildrenFields u9(ChooseChildrenFields chooseChildrenFields) {
        hz.b invalid;
        hz.b invalid2;
        List<ChildParticipant> listE = chooseChildrenFields.getChildren().e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (((ChildParticipant) obj).getIsSelected()) {
                arrayList.add(obj);
            }
        }
        boolean z15 = arrayList.size() > 2;
        if (z15) {
            invalid = new hz.b.Invalid(this.labelProvider.c(ri1.b.I));
        } else {
            if (z15) {
                throw new oq.p();
            }
            invalid = hz.b.d.f86848c;
        }
        ChooseChildrenFields chooseChildrenFieldsH = ChooseChildrenFields.h(chooseChildrenFields, null, invalid, 1, null);
        boolean isChecked = chooseChildrenFields.getStatement().getIsChecked();
        if (isChecked) {
            invalid2 = hz.b.d.f86848c;
        } else {
            if (isChecked) {
                throw new oq.p();
            }
            invalid2 = new hz.b.Invalid(this.labelProvider.c(ri1.b.A));
        }
        return ChooseChildrenFields.j(chooseChildrenFieldsH, null, invalid2, 1, null);
    }

    @Override // zx.b
    public xw.b<a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ij1.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public void P5(SetupData data) {
        if (data.getNewlyAddedChild() != null) {
            d9(new a.AddNewChildToState(data.getNewlyAddedChild()));
        }
    }
}
