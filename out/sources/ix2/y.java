package ix2;

import al0.ApplicantDataResultData;
import fr.q0;
import java.util.Iterator;
import java.util.Map;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lix2/y;", "Ll00/g;", "Lix2/k;", "", "Lix2/l;", "Lyy/a;", "stateMachineFactory", "Lkx2/a;", "mapper", "Luv2/a;", "validateParentsDataUseCase", "Lix2/j;", "setupData", "<init>", "(Lyy/a;Lkx2/a;Luv2/a;Lix2/j;)V", "state", "Lix2/l$a;", "p9", "(Lix2/k;)Lix2/l$a;", "b", "Lkx2/a;", "c", "Luv2/a;", "d", "Lix2/j;", "e", "Lix2/k;", "initialState", "Lxw/b;", "Lix2/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y extends l00.g<State, Object> implements l, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kx2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uv2.a validateParentsDataUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ix2.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<l.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<l.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f97681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f97682b;

        /* JADX INFO: renamed from: ix2.y$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2294a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f97683a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f97684b;

            /* JADX INFO: renamed from: ix2.y$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2295a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f97685d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f97686e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f97687f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f97689h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f97690j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f97691k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f97692l;

                public C2295a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f97685d = obj;
                    this.f97686e |= PKIFailureInfo.systemUnavail;
                    return C2294a.this.F(null, this);
                }
            }

            public C2294a(mu.h hVar, y yVar) {
                this.f97683a = hVar;
                this.f97684b = yVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2295a c2295a;
                if (eVar instanceof C2295a) {
                    c2295a = (C2295a) eVar;
                    int i15 = c2295a.f97686e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2295a.f97686e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2295a = new C2295a(eVar);
                    }
                } else {
                    c2295a = new C2295a(eVar);
                }
                Object obj2 = c2295a.f97685d;
                Object objE = uq.b.e();
                int i16 = c2295a.f97686e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f97683a;
                    l.Data dataP9 = this.f97684b.p9((State) obj);
                    c2295a.f97687f = vq.j.a(obj);
                    c2295a.f97689h = vq.j.a(c2295a);
                    c2295a.f97690j = vq.j.a(obj);
                    c2295a.f97691k = vq.j.a(hVar);
                    c2295a.f97692l = 0;
                    c2295a.f97686e = 1;
                    if (hVar.F(dataP9, c2295a) == objE) {
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

        public a(mu.g gVar, y yVar) {
            this.f97681a = gVar;
            this.f97682b = yVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super l.Data> hVar, tq.e eVar) {
            Object objA = this.f97681a.a(new C2294a(hVar, this.f97682b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lix2/c;", "<unused var>", "Lix2/k;", "Loq/i0;", "<anonymous>", "(Lix2/c;Lix2/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ix2.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97693e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f97693e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                ix2.b.a aVar = ix2.b.a.f97614a;
                this.f97693e = 1;
                if (yVar.F(aVar, this) == objE) {
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
        public final Object w(ix2.c cVar, State state, tq.e<? super i0> eVar) {
            return y.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lix2/i;", "<unused var>", "Lix2/k;", "Loq/i0;", "<anonymous>", "(Lix2/i;Lix2/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97695e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f97695e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                ix2.b.C2293b c2293b = ix2.b.C2293b.f97615a;
                this.f97695e = 1;
                if (yVar.F(c2293b, this) == objE) {
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
        public final Object w(i iVar, State state, tq.e<? super i0> eVar) {
            return y.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lix2/d;", "action", "Lk10/c0;", "Lix2/k;", "state", "Lk10/l;", "<anonymous>", "(Lix2/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnFathersNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f97699g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnFathersNameChanged onFathersNameChanged, State state) {
            return State.b(state, null, state.getFathersName().a(hz.b.d.f86848c, onFathersNameChanged.getFathersName()), null, null, null, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnFathersNameChanged onFathersNameChanged = (OnFathersNameChanged) this.f97698f;
            k10.c0 c0Var = (k10.c0) this.f97699g;
            uq.b.e();
            if (this.f97697e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ix2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.d.O(onFathersNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnFathersNameChanged onFathersNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f97698f = onFathersNameChanged;
            dVar.f97699g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lix2/f;", "action", "Lk10/c0;", "Lix2/k;", "state", "Lk10/l;", "<anonymous>", "(Lix2/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnMothersNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97701f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f97702g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnMothersNameChanged onMothersNameChanged, State state) {
            return State.b(state, null, null, state.getMothersName().a(hz.b.d.f86848c, onMothersNameChanged.getMothersName()), null, null, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnMothersNameChanged onMothersNameChanged = (OnMothersNameChanged) this.f97701f;
            k10.c0 c0Var = (k10.c0) this.f97702g;
            uq.b.e();
            if (this.f97700e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ix2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.e.O(onMothersNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnMothersNameChanged onMothersNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f97701f = onMothersNameChanged;
            eVar2.f97702g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lix2/e;", "action", "Lk10/c0;", "Lix2/k;", "state", "Lk10/l;", "<anonymous>", "(Lix2/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OnMothersMaidenNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97704f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f97705g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnMothersMaidenNameChanged onMothersMaidenNameChanged, State state) {
            return State.b(state, null, null, null, state.getMothersMaidenName().a(hz.b.d.f86848c, onMothersMaidenNameChanged.getMothersMaidenName()), null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnMothersMaidenNameChanged onMothersMaidenNameChanged = (OnMothersMaidenNameChanged) this.f97704f;
            k10.c0 c0Var = (k10.c0) this.f97705g;
            uq.b.e();
            if (this.f97703e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ix2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.f.O(onMothersMaidenNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnMothersMaidenNameChanged onMothersMaidenNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f97704f = onMothersMaidenNameChanged;
            fVar.f97705g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lix2/h;", "<unused var>", "Lk10/c0;", "Lix2/k;", "state", "Lk10/l;", "<anonymous>", "(Lix2/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ix2.h, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97707f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f97707f;
            uq.b.e();
            if (this.f97706e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ix2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.g.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ix2.h hVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f97707f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lix2/g;", "<unused var>", "Lk10/c0;", "Lix2/k;", "state", "Lk10/l;", "<anonymous>", "(Lix2/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ix2.g, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f97708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f97709f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f97710g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f97711h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f97712j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f97713k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f97714l;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Map map, State state) {
            Object next;
            State.Field fathersName = state.getFathersName();
            Object objJ = v0.j(map, ix2.a.FATHERS_NAME);
            hz.b.Companion companion = hz.b.INSTANCE;
            State.Field fieldB = State.Field.b(fathersName, companion.a((hz.g) objJ), null, 2, null);
            State.Field fieldB2 = State.Field.b(state.getMothersName(), companion.a((hz.g) v0.j(map, ix2.a.MOTHERS_NAME)), null, 2, null);
            State.Field fieldB3 = State.Field.b(state.getMothersMaidenName(), companion.a((hz.g) v0.j(map, ix2.a.MOTHERS_MAIDEN_NAME)), null, 2, null);
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Map.Entry) next).getValue() instanceof hz.g.Invalid));
            Map.Entry entry = (Map.Entry) next;
            return State.b(state, null, fieldB, fieldB2, fieldB3, entry != null ? (ix2.a) entry.getKey() : null, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f97714l;
            Object objE = uq.b.e();
            int i15 = this.f97713k;
            if (i15 == 0) {
                oq.u.b(obj);
                uv2.a aVar = y.this.validateParentsDataUseCase;
                uv2.a.Params params = new uv2.a.Params(y.this.setupData.getParentsDataRequester(), ((State) c0Var.a()).getFathersName().getValue(), ((State) c0Var.a()).getMothersName().getValue(), ((State) c0Var.a()).getMothersMaidenName().getValue());
                this.f97714l = c0Var;
                this.f97713k = 1;
                obj = aVar.d(params, this);
                if (obj != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f97709f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            y yVar = y.this;
            final Map map = (Map) obj;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() instanceof hz.g.Invalid) {
                        return c0Var.b(new er.l() { // from class: ix2.d0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.h.O(map, (State) obj2);
                            }
                        });
                    }
                }
            }
            k10.l lVarC = c0Var.c();
            yVar.setupData.getContract().o(new ApplicantDataResultData.ParentInfo(((State) c0Var.a()).getFathersName().getValue(), ((State) c0Var.a()).getMothersName().getValue(), ((State) c0Var.a()).getMothersMaidenName().getValue()));
            xw.b<ix2.b> bVarY1 = yVar.Y1();
            ix2.b.c cVar = ix2.b.c.f97616a;
            this.f97714l = vq.j.a(c0Var);
            this.f97708e = vq.j.a(map);
            this.f97709f = lVarC;
            this.f97710g = vq.j.a(lVarC);
            this.f97711h = 0;
            this.f97712j = 0;
            this.f97713k = 2;
            return bVarY1.F(cVar, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ix2.g gVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = y.this.new h(eVar);
            hVar.f97714l = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public y(yy.a aVar, kx2.a aVar2, uv2.a aVar3, SetupData setupData) {
        this.mapper = aVar2;
        this.validateParentsDataUseCase = aVar3;
        this.setupData = setupData;
        ApplicantDataResultData.ParentInfo parentInfoE = setupData.getContract().e();
        m parentsDataRequester = setupData.getParentsDataRequester();
        String fathersName = parentInfoE != null ? parentInfoE.getFathersName() : null;
        State.Field field = new State.Field(null, fathersName == null ? "" : fathersName, 1, null);
        String mothersName = parentInfoE != null ? parentInfoE.getMothersName() : null;
        State.Field field2 = new State.Field(null, mothersName == null ? "" : mothersName, 1, null);
        String mothersMaidenName = parentInfoE != null ? parentInfoE.getMothersMaidenName() : null;
        State state = new State(parentsDataRequester, field, field2, new State.Field(null, mothersMaidenName != null ? mothersMaidenName : "", 1, null), null, 16, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: ix2.x
            @Override // er.l
            public final Object b(Object obj) {
                return y.u9(this.f97673a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l.Data p9(State state) {
        return this.mapper.b(new kx2.a.Params(state, new er.l() { // from class: ix2.t
            @Override // er.l
            public final Object b(Object obj) {
                return y.q9(this.f97669a, (String) obj);
            }
        }, new er.l() { // from class: ix2.u
            @Override // er.l
            public final Object b(Object obj) {
                return y.r9(this.f97670a, (String) obj);
            }
        }, new er.l() { // from class: ix2.v
            @Override // er.l
            public final Object b(Object obj) {
                return y.s9(this.f97671a, (String) obj);
            }
        }, b9(ix2.h.f97626a), b9(ix2.g.f97624a), b9(ix2.c.f97618a), b9(i.f97627a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(y yVar, String str) {
        yVar.d9(new OnFathersNameChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(y yVar, String str) {
        yVar.d9(new OnMothersNameChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(y yVar, String str) {
        yVar.d9(new OnMothersMaidenNameChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final y yVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ix2.w
            @Override // er.l
            public final Object b(Object obj) {
                return y.v9(this.f97672a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(y yVar, k10.z zVar) {
        b bVar = yVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ix2.c.class), oVar, bVar);
        zVar.x(q0.c(i.class), oVar, yVar.new c(null));
        zVar.v(q0.c(OnFathersNameChanged.class), oVar, new d(null));
        zVar.v(q0.c(OnMothersNameChanged.class), oVar, new e(null));
        zVar.v(q0.c(OnMothersMaidenNameChanged.class), oVar, new f(null));
        zVar.v(q0.c(ix2.h.class), oVar, new g(null));
        zVar.v(q0.c(ix2.g.class), oVar, yVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ix2.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<l.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ix2.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
