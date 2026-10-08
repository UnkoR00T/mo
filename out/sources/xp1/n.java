package xp1;

import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lxp1/n;", "Ll00/g;", "Lxp1/e;", "", "Lxp1/f;", "Lyy/a;", "stateMachineFactory", "Lxp1/g;", "mapper", "<init>", "(Lyy/a;Lxp1/g;)V", "state", "Lxp1/f$a;", "l9", "(Lxp1/e;)Lxp1/f$a;", "b", "Lxp1/g;", "Lxw/b;", "Lxp1/d;", "c", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements f, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xp1.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state = a9(new a(e9().getState(), this), l9(new State(null, 0, 3, null)));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f220455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f220456b;

        /* JADX INFO: renamed from: xp1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5888a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f220457a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f220458b;

            /* JADX INFO: renamed from: xp1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5889a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f220459d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f220460e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f220461f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f220463h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f220464j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f220465k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f220466l;

                public C5889a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f220459d = obj;
                    this.f220460e |= PKIFailureInfo.systemUnavail;
                    return C5888a.this.F(null, this);
                }
            }

            public C5888a(mu.h hVar, n nVar) {
                this.f220457a = hVar;
                this.f220458b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5889a c5889a;
                if (eVar instanceof C5889a) {
                    c5889a = (C5889a) eVar;
                    int i15 = c5889a.f220460e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5889a.f220460e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5889a = new C5889a(eVar);
                    }
                } else {
                    c5889a = new C5889a(eVar);
                }
                Object obj2 = c5889a.f220459d;
                Object objE = uq.b.e();
                int i16 = c5889a.f220460e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f220457a;
                    f.Data dataL9 = this.f220458b.l9((State) obj);
                    c5889a.f220461f = vq.j.a(obj);
                    c5889a.f220463h = vq.j.a(c5889a);
                    c5889a.f220464j = vq.j.a(obj);
                    c5889a.f220465k = vq.j.a(hVar);
                    c5889a.f220466l = 0;
                    c5889a.f220460e = 1;
                    if (hVar.F(dataL9, c5889a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f220455a = gVar;
            this.f220456b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f220455a.a(new C5888a(hVar, this.f220456b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxp1/a;", "<unused var>", "Lxp1/e;", "Loq/i0;", "<anonymous>", "(Lxp1/a;Lxp1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<xp1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220467e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f220467e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<xp1.d> bVarY1 = n.this.Y1();
                xp1.d.a aVar = xp1.d.a.f220433a;
                this.f220467e = 1;
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
        public final Object w(xp1.a aVar, State state, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxp1/c;", "action", "Lk10/c0;", "Lxp1/e;", "state", "Lk10/l;", "<anonymous>", "(Lxp1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ItemTabClick, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f220471g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ItemTabClick itemTabClick, State state) {
            return State.b(state, itemTabClick.getSelectedTabItem(), 0, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ItemTabClick itemTabClick = (ItemTabClick) this.f220470f;
            c0 c0Var = (c0) this.f220471g;
            uq.b.e();
            if (this.f220469e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: xp1.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.c.O(itemTabClick, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ItemTabClick itemTabClick, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f220470f = itemTabClick;
            cVar.f220471g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxp1/b;", "action", "Lk10/c0;", "Lxp1/e;", "state", "Lk10/l;", "<anonymous>", "(Lxp1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ItemFilterClick, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f220474g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ItemFilterClick itemFilterClick, State state) {
            return State.b(state, null, itemFilterClick.getSelectedFilterItemIndex(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ItemFilterClick itemFilterClick = (ItemFilterClick) this.f220473f;
            c0 c0Var = (c0) this.f220474g;
            uq.b.e();
            if (this.f220472e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: xp1.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.d.O(itemFilterClick, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ItemFilterClick itemFilterClick, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f220473f = itemFilterClick;
            dVar.f220474g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, g gVar) {
        this.mapper = gVar;
        this.stateMachine = aVar.a(new State(null, 0, 3, null), new er.l() { // from class: xp1.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f220447a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data l9(State state) {
        return this.mapper.b(new g.Params(state, new er.l() { // from class: xp1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f220448a, (y30.n.Switch.EnumC5973b) obj);
            }
        }, new er.l() { // from class: xp1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f220449a, ((Integer) obj).intValue());
            }
        }, b9(xp1.a.f220430a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, y30.n.Switch.EnumC5973b enumC5973b) {
        nVar.d9(new ItemTabClick(enumC5973b));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, int i15) {
        nVar.d9(new ItemFilterClick(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: xp1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.q9(this.f220450a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xp1.a.class), oVar, bVar);
        zVar.v(q0.c(ItemTabClick.class), oVar, new c(null));
        zVar.v(q0.c(ItemFilterClick.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<xp1.d> Y1() {
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
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
