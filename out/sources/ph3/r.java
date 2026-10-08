package ph3;

import fr.q0;
import java.util.Set;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import sv0.BEVehicleData;
import sv0.v0;
import tv0.BEVehicleDamage;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030$8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00106\u001a\b\u0012\u0004\u0012\u00020\u0018018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lph3/r;", "Ll00/g;", "Lph3/f;", "", "Lph3/g;", "Lyy/a;", "stateMachineFactory", "Lrh3/c;", "mapper", "Lrh3/d;", "vehicleTypeForDamageDetailsMapper", "Lqh3/a;", "contract", "<init>", "(Lyy/a;Lrh3/c;Lrh3/d;Lqh3/a;)V", "Lqh3/a$a;", "n9", "(Lqh3/a$a;)Lph3/f;", "", "Lsv0/v0;", "selectedDamage", "Loq/i0;", "q9", "(Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "Lph3/g$a;", "o9", "(Lph3/f;)Lph3/g$a;", "b", "Lrh3/c;", "c", "Lrh3/d;", "d", "Lqh3/a;", "e", "Lph3/f;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lph3/b;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rh3.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rh3.d vehicleTypeForDamageDetailsMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final qh3.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ph3.b> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f157854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f157855b;

        /* JADX INFO: renamed from: ph3.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3915a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f157856a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f157857b;

            /* JADX INFO: renamed from: ph3.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3916a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f157858d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f157859e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f157860f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f157862h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f157863j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f157864k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f157865l;

                public C3916a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f157858d = obj;
                    this.f157859e |= PKIFailureInfo.systemUnavail;
                    return C3915a.this.F(null, this);
                }
            }

            public C3915a(mu.h hVar, r rVar) {
                this.f157856a = hVar;
                this.f157857b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3916a c3916a;
                if (eVar instanceof C3916a) {
                    c3916a = (C3916a) eVar;
                    int i15 = c3916a.f157859e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3916a.f157859e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3916a = new C3916a(eVar);
                    }
                } else {
                    c3916a = new C3916a(eVar);
                }
                Object obj2 = c3916a.f157858d;
                Object objE = uq.b.e();
                int i16 = c3916a.f157859e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f157856a;
                    g.Data dataO9 = this.f157857b.o9((State) obj);
                    c3916a.f157860f = vq.j.a(obj);
                    c3916a.f157862h = vq.j.a(c3916a);
                    c3916a.f157863j = vq.j.a(obj);
                    c3916a.f157864k = vq.j.a(hVar);
                    c3916a.f157865l = 0;
                    c3916a.f157859e = 1;
                    if (hVar.F(dataO9, c3916a) == objE) {
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

        public a(mu.g gVar, r rVar) {
            this.f157854a = gVar;
            this.f157855b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f157854a.a(new C3915a(hVar, this.f157855b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lph3/b;", "action", "Lph3/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lph3/b;Lph3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ph3.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157866e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157867f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ph3.b bVar = (ph3.b) this.f157867f;
            Object objE = uq.b.e();
            int i15 = this.f157866e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                this.f157867f = vq.j.a(bVar);
                this.f157866e = 1;
                if (rVar.F(bVar, this) == objE) {
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
        public final Object w(ph3.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = r.this.new b(eVar);
            bVar2.f157867f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqh3/a$a;", "data", "Lph3/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqh3/a$a;Lph3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<qh3.a.Data, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157870f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qh3.a.Data data = (qh3.a.Data) this.f157870f;
            uq.b.e();
            if (this.f157869e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            new OnUpdate(data);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qh3.a.Data data, State state, tq.e<? super i0> eVar) {
            c cVar = new c(eVar);
            cVar.f157870f = data;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lph3/d;", "action", "Lk10/c0;", "Lph3/f;", "state", "Lk10/l;", "<anonymous>", "(Lph3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnUpdate, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f157873g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(r rVar, OnUpdate onUpdate, State state) {
            return rVar.n9(onUpdate.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnUpdate onUpdate = (OnUpdate) this.f157872f;
            c0 c0Var = (c0) this.f157873g;
            uq.b.e();
            if (this.f157871e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final r rVar = r.this;
            return c0Var.d(new er.l() { // from class: ph3.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.d.O(rVar, onUpdate, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnUpdate onUpdate, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = r.this.new d(eVar);
            dVar.f157872f = onUpdate;
            dVar.f157873g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lph3/c;", "action", "Lk10/c0;", "Lph3/f;", "state", "Lk10/l;", "<anonymous>", "(Lph3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnDamageButtonClicked, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f157875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f157876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f157877g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f157878h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f157879j;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Set set, State state) {
            return State.b(state, false, null, set, null, 10, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Set setM;
            final Set set;
            OnDamageButtonClicked onDamageButtonClicked = (OnDamageButtonClicked) this.f157878h;
            c0 c0Var = (c0) this.f157879j;
            Object objE = uq.b.e();
            int i15 = this.f157877g;
            if (i15 == 0) {
                oq.u.b(obj);
                Set<v0> setC = ((State) c0Var.a()).c();
                boolean zContains = setC.contains(onDamageButtonClicked.getDamageType());
                if (zContains) {
                    setM = e1.k(setC, onDamageButtonClicked.getDamageType());
                } else {
                    if (zContains) {
                        throw new oq.p();
                    }
                    setM = e1.m(setC, onDamageButtonClicked.getDamageType());
                }
                r rVar = r.this;
                this.f157878h = vq.j.a(onDamageButtonClicked);
                this.f157879j = c0Var;
                this.f157875e = vq.j.a(setC);
                this.f157876f = setM;
                this.f157877g = 1;
                if (rVar.q9(setM, this) == objE) {
                    return objE;
                }
                set = setM;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set = (Set) this.f157876f;
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: ph3.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.e.O(set, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnDamageButtonClicked onDamageButtonClicked, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = r.this.new e(eVar);
            eVar2.f157878h = onDamageButtonClicked;
            eVar2.f157879j = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lph3/a;", "<unused var>", "Lk10/c0;", "Lph3/f;", "state", "Lk10/l;", "<anonymous>", "(Lph3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ph3.a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157881e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157882f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, true, null, null, new d60.j(ph3.e.f157784a), 6, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            if (r6.F(r2, r5) == r1) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f157882f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f157881e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r6)
                goto L67
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                oq.u.b(r6)
                goto L58
            L22:
                oq.u.b(r6)
                java.lang.Object r6 = r0.a()
                ph3.f r6 = (ph3.State) r6
                java.util.Set r6 = r6.c()
                boolean r6 = r6.isEmpty()
                if (r6 != r4) goto L3f
                ph3.u r6 = new ph3.u
                r6.<init>()
                k10.l r6 = r0.b(r6)
                return r6
            L3f:
                if (r6 != 0) goto L6c
                ph3.r r6 = ph3.r.this
                java.lang.Object r2 = r0.a()
                ph3.f r2 = (ph3.State) r2
                java.util.Set r2 = r2.c()
                r5.f157882f = r0
                r5.f157881e = r4
                java.lang.Object r6 = ph3.r.l9(r6, r2, r5)
                if (r6 != r1) goto L58
                goto L66
            L58:
                ph3.r r6 = ph3.r.this
                ph3.b$c r2 = ph3.b.c.f157781a
                r5.f157882f = r0
                r5.f157881e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L67
            L66:
                return r1
            L67:
                k10.l r6 = r0.c()
                return r6
            L6c:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ph3.r.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ph3.a aVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f157882f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, rh3.c cVar, rh3.d dVar, qh3.a aVar2) {
        this.mapper = cVar;
        this.vehicleTypeForDamageDetailsMapper = dVar;
        this.contract = aVar2;
        State stateN9 = n9(aVar2.x6());
        this.initialState = stateN9;
        this.stateMachine = aVar.a(stateN9, new er.l() { // from class: ph3.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.s9(this.f157846a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), o9(stateN9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State n9(qh3.a.Data contract) {
        Set<v0> setE;
        BEVehicleDamage vehicleDamage;
        tv0.h selectedDamage = contract.getSelectedDamage();
        rh3.d dVar = this.vehicleTypeForDamageDetailsMapper;
        BEVehicleData selectedVehicle = contract.getSelectedVehicle();
        yd3.h hVarB = dVar.b(new rh3.d.Params(selectedVehicle != null ? selectedVehicle.getKind() : null));
        if (!(selectedDamage instanceof tv0.h.Damaged) || (vehicleDamage = ((tv0.h.Damaged) selectedDamage).getVehicleDamage()) == null || (setE = vehicleDamage.a()) == null) {
            setE = e1.e();
        }
        return new State(false, hVarB, setE, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data o9(State state) {
        return this.mapper.b(new rh3.c.Params(state, new er.l() { // from class: ph3.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.p9(this.f157844a, (v0) obj);
            }
        }, b9(ph3.a.f157778a), b9(ph3.b.a.f157779a), b9(ph3.b.C3912b.f157780a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(r rVar, v0 v0Var) {
        rVar.d9(new OnDamageButtonClicked(v0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q9(Set<? extends v0> set, tq.e<? super i0> eVar) {
        Object objT0 = this.contract.T0(new tv0.h.Damaged(new BEVehicleDamage(e1.k(set, v0.UNKNOWN))), eVar);
        return objT0 == uq.b.e() ? objT0 : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ph3.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.t9(this.f157845a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(r rVar, z zVar) {
        b bVar = rVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ph3.b.class), oVar, bVar);
        k10.k.s(zVar, rVar.contract.J5(), null, new c(null), 2, null);
        zVar.v(q0.c(OnUpdate.class), oVar, rVar.new d(null));
        zVar.v(q0.c(OnDamageButtonClicked.class), oVar, rVar.new e(null));
        zVar.v(q0.c(ph3.a.class), oVar, rVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ph3.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ph3.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(qh3.a aVar) {
        super.P5(aVar);
    }
}
