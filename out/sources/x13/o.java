package x13;

import fr.q0;
import java.util.Iterator;
import java.util.List;
import k10.c0;
import k10.t;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030+8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u0014018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lx13/o;", "Ll00/g;", "Lx13/e;", "", "Lx13/f;", "Lyy/a;", "stateMachineFactory", "Ly13/d;", "mapper", "Lyw/b;", "accessibilityTalkBackManager", "Ln13/b;", "getEmergencyBackpackAddedItemsUC", "Ln13/e;", "updateEmergencyBackpackAddedItemsUC", "Ll13/a$a;", "setupData", "<init>", "(Lyy/a;Ly13/d;Lyw/b;Ln13/b;Ln13/e;Ll13/a$a;)V", "state", "Lx13/f$a;", "o9", "(Lx13/e;)Lx13/f$a;", "b", "Ly13/d;", "c", "Lyw/b;", "d", "Ln13/b;", "e", "Ln13/e;", "f", "Ll13/a$a;", "g", "Lx13/e;", "initialState", "Lxw/b;", "Lx13/b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y13.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n13.b getEmergencyBackpackAddedItemsUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n13.e updateEmergencyBackpackAddedItemsUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l13.a.Group setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<x13.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f216473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f216474b;

        /* JADX INFO: renamed from: x13.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5766a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f216475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f216476b;

            /* JADX INFO: renamed from: x13.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5767a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f216477d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f216478e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f216479f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f216481h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f216482j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f216483k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f216484l;

                public C5767a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f216477d = obj;
                    this.f216478e |= PKIFailureInfo.systemUnavail;
                    return C5766a.this.F(null, this);
                }
            }

            public C5766a(mu.h hVar, o oVar) {
                this.f216475a = hVar;
                this.f216476b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5767a c5767a;
                if (eVar instanceof C5767a) {
                    c5767a = (C5767a) eVar;
                    int i15 = c5767a.f216478e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5767a.f216478e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5767a = new C5767a(eVar);
                    }
                } else {
                    c5767a = new C5767a(eVar);
                }
                Object obj2 = c5767a.f216477d;
                Object objE = uq.b.e();
                int i16 = c5767a.f216478e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f216475a;
                    f.Data dataO9 = this.f216476b.o9((State) obj);
                    c5767a.f216479f = vq.j.a(obj);
                    c5767a.f216481h = vq.j.a(c5767a);
                    c5767a.f216482j = vq.j.a(obj);
                    c5767a.f216483k = vq.j.a(hVar);
                    c5767a.f216484l = 0;
                    c5767a.f216478e = 1;
                    if (hVar.F(dataO9, c5767a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, o oVar) {
            this.f216473a = gVar;
            this.f216474b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f216473a.a(new C5766a(hVar, this.f216474b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "result", "Lk10/c0;", "Lx13/e;", "state", "Lk10/l;", "<anonymous>", "(Ljava/util/List;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<List<? extends String>, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216486f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f216487g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, null, list, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List list = (List) this.f216486f;
            c0 c0Var = (c0) this.f216487g;
            uq.b.e();
            if (this.f216485e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: x13.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.b.O(list, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(List<String> list, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f216486f = list;
            bVar.f216487g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx13/c;", "action", "Lx13/e;", "state", "Loq/i0;", "<anonymous>", "(Lx13/c;Lx13/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ToGroup, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f216488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f216489f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f216490g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f216491h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f216492j;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object next;
            ToGroup toGroup = (ToGroup) this.f216491h;
            State state = (State) this.f216492j;
            Object objE = uq.b.e();
            int i15 = this.f216490g;
            if (i15 == 0) {
                u.b(obj);
                Iterator<T> it = state.getGroup().b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    l13.a aVar = (l13.a) next;
                    if ((aVar instanceof l13.a.Group) && fr.t.c(((l13.a.Group) aVar).getGroupId(), toGroup.getData().getGroupId())) {
                        break;
                    }
                }
                l13.a aVar2 = (l13.a) next;
                if (aVar2 != null) {
                    xw.b<x13.b> bVarY1 = o.this.Y1();
                    x13.b.ToGroup toGroup2 = new x13.b.ToGroup((l13.a.Group) aVar2);
                    this.f216491h = vq.j.a(toGroup);
                    this.f216492j = vq.j.a(state);
                    this.f216488e = vq.j.a(aVar2);
                    this.f216489f = 0;
                    this.f216490g = 1;
                    if (bVarY1.F(toGroup2, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ToGroup toGroup, State state, tq.e<? super i0> eVar) {
            c cVar = o.this.new c(eVar);
            cVar.f216491h = toGroup;
            cVar.f216492j = state;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx13/d;", "action", "Lx13/e;", "state", "Loq/i0;", "<anonymous>", "(Lx13/d;Lx13/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<UpdateItemSelection, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f216494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f216495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f216496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f216497h;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List list;
            UpdateItemSelection updateItemSelection = (UpdateItemSelection) this.f216496g;
            State state = (State) this.f216497h;
            Object objE = uq.b.e();
            int i15 = this.f216495f;
            if (i15 == 0) {
                u.b(obj);
                List listI1 = v.i1(state.c());
                if (listI1.contains(updateItemSelection.getItem().getItemId())) {
                    listI1.remove(updateItemSelection.getItem().getItemId());
                } else {
                    listI1.add(updateItemSelection.getItem().getItemId());
                }
                n13.e eVar = o.this.updateEmergencyBackpackAddedItemsUC;
                n13.e.Params params = new n13.e.Params(listI1);
                this.f216496g = vq.j.a(updateItemSelection);
                this.f216497h = state;
                this.f216494e = listI1;
                this.f216495f = 1;
                if (eVar.d(params, this) == objE) {
                    return objE;
                }
                list = listI1;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f216494e;
                u.b(obj);
            }
            o.this.accessibilityTalkBackManager.a(o.this.mapper.f(State.b(state, null, list, 1, null)));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(UpdateItemSelection updateItemSelection, State state, tq.e<? super i0> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f216496g = updateItemSelection;
            dVar.f216497h = state;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx13/a;", "<unused var>", "Lx13/e;", "Loq/i0;", "<anonymous>", "(Lx13/a;Lx13/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<x13.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216499e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f216499e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<x13.b> bVarY1 = o.this.Y1();
                x13.b.a aVar = x13.b.a.f216444a;
                this.f216499e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x13.a aVar, State state, tq.e<? super i0> eVar) {
            return o.this.new e(eVar).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, y13.d dVar, yw.b bVar, n13.b bVar2, n13.e eVar, l13.a.Group group) {
        this.mapper = dVar;
        this.accessibilityTalkBackManager = bVar;
        this.getEmergencyBackpackAddedItemsUC = bVar2;
        this.updateEmergencyBackpackAddedItemsUC = eVar;
        this.setupData = group;
        State state = new State(group, v.n());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: x13.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9(this.f216463a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data o9(State state) {
        return this.mapper.b(new y13.d.Params(state, new er.l() { // from class: x13.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.p9(this.f216461a, (z13.a.Group) obj);
            }
        }, new er.l() { // from class: x13.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.q9(this.f216462a, (z13.a.Item) obj);
            }
        }, b9(x13.a.f216443a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(o oVar, z13.a.Group group) {
        oVar.d9(new ToGroup(group));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(o oVar, z13.a.Item item) {
        oVar.d9(new UpdateItemSelection(item));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final o oVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: x13.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.t9(this.f216460a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(o oVar, z zVar) {
        k10.k.m(zVar, oVar.getEmergencyBackpackAddedItemsUC.b(gz.b.a.C1792a.f78542a), null, new b(null), 2, null);
        c cVar = oVar.new c(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ToGroup.class), oVar2, cVar);
        zVar.x(q0.c(UpdateItemSelection.class), oVar2, oVar.new d(null));
        zVar.x(q0.c(x13.a.class), oVar2, oVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<x13.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(l13.a.Group group) {
        super.P5(group);
    }
}
