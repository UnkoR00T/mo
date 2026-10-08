package ke1;

import de1.KrusData;
import er.q;
import f00.j0;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001+B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lke1/k;", "Ll00/g;", "Lke1/f;", "Lke1/e;", "Lke1/g;", "", "Lyy/a;", "stateMachineFactory", "Lle1/c;", "mapper", "Lce1/a;", "contract", "<init>", "(Lyy/a;Lle1/c;Lce1/a;)V", "state", "Lke1/g$a;", "m9", "(Lke1/f;)Lke1/g$a;", "b", "Lle1/c;", "c", "Lce1/a;", "d", "Lke1/f;", "initialState", "Lxw/b;", "Lke1/e$c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, ke1.e> implements ke1.g, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final le1.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ce1.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ke1.e.c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, ke1.e> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<ke1.g.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lke1/k$a;", "Lf00/j0;", "Lce1/a;", "Lke1/k;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<ce1.a, k> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ke1.g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f110293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f110294b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f110295a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f110296b;

            /* JADX INFO: renamed from: ke1.k$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2642a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f110297d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f110298e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f110299f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f110301h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f110302j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f110303k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f110304l;

                public C2642a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f110297d = obj;
                    this.f110298e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, k kVar) {
                this.f110295a = hVar;
                this.f110296b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2642a c2642a;
                if (eVar instanceof C2642a) {
                    c2642a = (C2642a) eVar;
                    int i15 = c2642a.f110298e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2642a.f110298e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2642a = new C2642a(eVar);
                    }
                } else {
                    c2642a = new C2642a(eVar);
                }
                Object obj2 = c2642a.f110297d;
                Object objE = uq.b.e();
                int i16 = c2642a.f110298e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f110295a;
                    ke1.g.Data dataM9 = this.f110296b.m9((State) obj);
                    c2642a.f110299f = vq.j.a(obj);
                    c2642a.f110301h = vq.j.a(c2642a);
                    c2642a.f110302j = vq.j.a(obj);
                    c2642a.f110303k = vq.j.a(hVar);
                    c2642a.f110304l = 0;
                    c2642a.f110298e = 1;
                    if (hVar.F(dataM9, c2642a) == objE) {
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

        public b(mu.g gVar, k kVar) {
            this.f110293a = gVar;
            this.f110294b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ke1.g.Data> hVar, tq.e eVar) {
            Object objA = this.f110293a.a(new a(hVar, this.f110294b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lke1/e$a;", "<unused var>", "Lke1/f;", "Loq/i0;", "<anonymous>", "(Lke1/e$a;Lke1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<ke1.e.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110305e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f110305e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ke1.e.c> bVarY1 = k.this.Y1();
                ke1.e.c.a aVar = ke1.e.c.a.f110270a;
                this.f110305e = 1;
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
        public final Object w(ke1.e.a aVar, State state, tq.e<? super i0> eVar) {
            return k.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lke1/e$b;", "<unused var>", "Lke1/f;", "Loq/i0;", "<anonymous>", "(Lke1/e$b;Lke1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<ke1.e.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110307e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f110307e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ke1.e.c> bVarY1 = k.this.Y1();
                ke1.e.c.b bVar = ke1.e.c.b.f110271a;
                this.f110307e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(ke1.e.b bVar, State state, tq.e<? super i0> eVar) {
            return k.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lke1/e$f;", "action", "Lk10/c0;", "Lke1/f;", "state", "Lk10/l;", "<anonymous>", "(Lke1/e$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<ke1.e.SelectInsurance, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110311g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ke1.e.SelectInsurance selectInsurance, State state) {
            return state.a(selectInsurance.getSelectedItem());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ke1.e.SelectInsurance selectInsurance = (ke1.e.SelectInsurance) this.f110310f;
            c0 c0Var = (c0) this.f110311g;
            uq.b.e();
            if (this.f110309e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: ke1.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return k.e.O(selectInsurance, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ke1.e.SelectInsurance selectInsurance, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f110310f = selectInsurance;
            eVar2.f110311g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lke1/e$e;", "<unused var>", "Lke1/f;", "state", "Loq/i0;", "<anonymous>", "(Lke1/e$e;Lke1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<ke1.e.C2641e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110313f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f110313f;
            uq.b.e();
            if (this.f110312e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            k.this.contract.V3(state.getSelectedItem());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ke1.e.C2641e c2641e, State state, tq.e<? super i0> eVar) {
            f fVar = k.this.new f(eVar);
            fVar.f110313f = state;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lke1/e$d;", "<unused var>", "Lk10/c0;", "Lke1/f;", "state", "Lk10/l;", "<anonymous>", "(Lke1/e$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<ke1.e.d, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110315e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110316f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f110318a;

            static {
                int[] iArr = new int[de1.d.values().length];
                try {
                    iArr[de1.d.EXCEEDED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[de1.d.NOT_EXCEEDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[de1.d.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f110318a = iArr;
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return state.a(de1.d.NONE);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f110316f;
            Object objE = uq.b.e();
            int i15 = this.f110315e;
            if (i15 == 0) {
                u.b(obj);
                de1.d selectedItem = ((State) c0Var.a()).getSelectedItem();
                int i16 = selectedItem == null ? -1 : a.f110318a[selectedItem.ordinal()];
                if (i16 == -1) {
                    return c0Var.b(new er.l() { // from class: ke1.m
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return k.g.O((State) obj2);
                        }
                    });
                }
                if (i16 != 1 && i16 != 2) {
                    if (i16 == 3) {
                        return c0Var.c();
                    }
                    throw new oq.p();
                }
                k.this.d9(ke1.e.C2641e.f110274a);
                xw.b<ke1.e.c> bVarY1 = k.this.Y1();
                ke1.e.c.C2640c c2640c = ke1.e.c.C2640c.f110272a;
                this.f110316f = c0Var;
                this.f110315e = 1;
                if (bVarY1.F(c2640c, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ke1.e.d dVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = k.this.new g(eVar);
            gVar.f110316f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, le1.c cVar, ce1.a aVar2) {
        this.mapper = cVar;
        this.contract = aVar2;
        KrusData krusDataM3 = aVar2.m3();
        State state = new State(krusDataM3 != null ? krusDataM3.getIncomeTaxExceededInfo() : null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: ke1.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.p9(this.f110286a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ke1.g.Data m9(State state) {
        return this.mapper.b(new le1.c.Params(state, new er.l() { // from class: ke1.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.n9(this.f110284a, (de1.d) obj);
            }
        }, b9(ke1.e.d.f110273a), b9(ke1.e.a.f110268a), b9(ke1.e.b.f110269a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(k kVar, de1.d dVar) {
        kVar.d9(new ke1.e.SelectInsurance(dVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ke1.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.q9(this.f110285a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(k kVar, z zVar) {
        c cVar = kVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ke1.e.a.class), oVar, cVar);
        zVar.x(q0.c(ke1.e.b.class), oVar, kVar.new d(null));
        zVar.v(q0.c(ke1.e.SelectInsurance.class), oVar, new e(null));
        zVar.x(q0.c(ke1.e.C2641e.class), oVar, kVar.new f(null));
        zVar.v(q0.c(ke1.e.d.class), oVar, kVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ke1.e.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, ke1.e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ke1.g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ke1.g.Data data) {
        super.P5(data);
    }
}
