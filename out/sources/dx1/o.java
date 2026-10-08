package dx1;

import f00.j0;
import fr.q0;
import iy.b0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00013B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Ldx1/o;", "Ll00/g;", "Ldx1/b;", "Ldx1/a;", "Ldx1/c;", "", "Lyy/a;", "stateMachineFactory", "Lex1/d;", "mapper", "Lrw1/c;", "checkIfPinIsValidUseCase", "Lxw1/c;", "processInterruptDialogMapper", "Ldx1/d;", "setupContract", "<init>", "(Lyy/a;Lex1/d;Lrw1/c;Lxw1/c;Ldx1/d;)V", "state", "Ldx1/c$a;", "p9", "(Ldx1/b;)Ldx1/c$a;", "b", "Lex1/d;", "c", "Lrw1/c;", "d", "Lxw1/c;", "e", "Ldx1/d;", "f", "Ldx1/b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ldx1/a$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, dx1.a> implements dx1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ex1.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rw1.c checkIfPinIsValidUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw1.c processInterruptDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final dx1.d setupContract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, dx1.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<dx1.a.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<dx1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ldx1/o$a;", "Lf00/j0;", "Ldx1/d;", "Ldx1/o;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<dx1.d, o> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<dx1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f45301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f45302b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f45303a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f45304b;

            /* JADX INFO: renamed from: dx1.o$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1040a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f45305d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f45306e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f45307f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f45309h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f45310j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f45311k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f45312l;

                public C1040a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f45305d = obj;
                    this.f45306e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f45303a = hVar;
                this.f45304b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1040a c1040a;
                if (eVar instanceof C1040a) {
                    c1040a = (C1040a) eVar;
                    int i15 = c1040a.f45306e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1040a.f45306e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1040a = new C1040a(eVar);
                    }
                } else {
                    c1040a = new C1040a(eVar);
                }
                Object obj2 = c1040a.f45305d;
                Object objE = uq.b.e();
                int i16 = c1040a.f45306e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f45303a;
                    dx1.c.Data dataP9 = this.f45304b.p9((State) obj);
                    c1040a.f45307f = vq.j.a(obj);
                    c1040a.f45309h = vq.j.a(c1040a);
                    c1040a.f45310j = vq.j.a(obj);
                    c1040a.f45311k = vq.j.a(hVar);
                    c1040a.f45312l = 0;
                    c1040a.f45306e = 1;
                    if (hVar.F(dataP9, c1040a) == objE) {
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

        public b(mu.g gVar, o oVar) {
            this.f45301a = gVar;
            this.f45302b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super dx1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f45301a.a(new a(hVar, this.f45302b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldx1/a$b;", "<unused var>", "Ldx1/b;", "Loq/i0;", "<anonymous>", "(Ldx1/a$b;Ldx1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<dx1.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45313e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f45313e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<dx1.a.c> bVarY1 = o.this.Y1();
                dx1.a.c.b bVar = dx1.a.c.b.f45255a;
                this.f45313e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(dx1.a.b bVar, State state, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldx1/a$a;", "<unused var>", "Ldx1/b;", "state", "Loq/i0;", "<anonymous>", "(Ldx1/a$a;Ldx1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<dx1.a.C1037a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45315e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45316f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx1.a.c cVar;
            State state = (State) this.f45316f;
            Object objE = uq.b.e();
            int i15 = this.f45315e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<dx1.a.c> bVarY1 = o.this.Y1();
                boolean firstScreenInFlow = state.getPinScreenData().getFirstScreenInFlow();
                if (firstScreenInFlow) {
                    cVar = dx1.a.c.b.f45255a;
                } else {
                    if (firstScreenInFlow) {
                        throw new oq.p();
                    }
                    cVar = dx1.a.c.C1038a.f45254a;
                }
                this.f45316f = vq.j.a(state);
                this.f45315e = 1;
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
        public final Object w(dx1.a.C1037a c1037a, State state, tq.e<? super i0> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f45316f = state;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldx1/a$e;", "action", "Lk10/c0;", "Ldx1/b;", "state", "Lk10/l;", "<anonymous>", "(Ldx1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<dx1.a.PinNumberInputChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f45320g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(dx1.a.PinNumberInputChange pinNumberInputChange, State state) {
            return State.b(state, null, pinNumberInputChange.getNumber(), hz.b.C2039b.f86846c, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dx1.a.PinNumberInputChange pinNumberInputChange = (dx1.a.PinNumberInputChange) this.f45319f;
            c0 c0Var = (c0) this.f45320g;
            uq.b.e();
            if (this.f45318e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dx1.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.e.O(pinNumberInputChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dx1.a.PinNumberInputChange pinNumberInputChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f45319f = pinNumberInputChange;
            eVar2.f45320g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldx1/a$h;", "<unused var>", "Lk10/c0;", "Ldx1/b;", "state", "Lk10/l;", "<anonymous>", "(Ldx1/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<dx1.a.h, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45322f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.g gVar, State state) {
            return State.b(state, null, null, hz.b.INSTANCE.a(gVar), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f45322f;
            Object objE = uq.b.e();
            int i15 = this.f45321e;
            if (i15 == 0) {
                oq.u.b(obj);
                rw1.c cVar = o.this.checkIfPinIsValidUseCase;
                rw1.c.Params params = new rw1.c.Params(((State) c0Var.a()).getPin(), ((State) c0Var.a()).getPinScreenData().getCertificateType());
                this.f45322f = c0Var;
                this.f45321e = 1;
                obj = cVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final hz.g gVar = (hz.g) obj;
            k10.l lVarB = c0Var.b(new er.l() { // from class: dx1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.f.O(gVar, (State) obj2);
                }
            });
            o.this.d9(dx1.a.d.f45260a);
            return lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dx1.a.h hVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = o.this.new f(eVar);
            fVar.f45322f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldx1/a$d;", "<unused var>", "Ldx1/b;", "state", "Loq/i0;", "<anonymous>", "(Ldx1/a$d;Ldx1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<dx1.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45325f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f45325f;
            Object objE = uq.b.e();
            int i15 = this.f45324e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (state.getValidationState() instanceof hz.b.d) {
                    o.this.setupContract.x3(state.getPin());
                    xw.b<dx1.a.c> bVarY1 = o.this.Y1();
                    dx1.a.c.Next next = new dx1.a.c.Next(state.getPin());
                    this.f45325f = vq.j.a(state);
                    this.f45324e = 1;
                    if (bVarY1.F(next, this) == objE) {
                        return objE;
                    }
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
        public final Object w(dx1.a.d dVar, State state, tq.e<? super i0> eVar) {
            g gVar = o.this.new g(eVar);
            gVar.f45325f = state;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldx1/a$f;", "<unused var>", "Ldx1/b;", "state", "Loq/i0;", "<anonymous>", "(Ldx1/a$f;Ldx1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<dx1.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45328f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f45328f;
            Object objE = uq.b.e();
            int i15 = this.f45327e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<dx1.a.c> bVarY1 = o.this.Y1();
                dx1.a.c.ResetPin resetPin = new dx1.a.c.ResetPin(state.getPinScreenData().getCertificateType());
                this.f45328f = vq.j.a(state);
                this.f45327e = 1;
                if (bVarY1.F(resetPin, this) == objE) {
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
        public final Object w(dx1.a.f fVar, State state, tq.e<? super i0> eVar) {
            h hVar = o.this.new h(eVar);
            hVar.f45328f = state;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldx1/a$g;", "<unused var>", "Ldx1/b;", "state", "Loq/i0;", "<anonymous>", "(Ldx1/a$g;Ldx1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<dx1.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45331f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f45331f;
            Object objE = uq.b.e();
            int i15 = this.f45330e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<dx1.a.c> bVarY1 = o.this.Y1();
                dx1.a.c.ShowDialog showDialog = new dx1.a.c.ShowDialog(o.this.processInterruptDialogMapper.b(new xw1.c.Params(state.getPinScreenData().getProcessInterruptDialogTitle(), new er.a() { // from class: dx1.r
                    @Override // er.a
                    public final Object a() {
                        return o.i.O();
                    }
                }, o.this.b9(dx1.a.b.f45253a))));
                this.f45331f = vq.j.a(state);
                this.f45330e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dx1.a.g gVar, State state, tq.e<? super i0> eVar) {
            i iVar = o.this.new i(eVar);
            iVar.f45331f = state;
            return iVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, ex1.d dVar, rw1.c cVar, xw1.c cVar2, dx1.d dVar2) {
        this.mapper = dVar;
        this.checkIfPinIsValidUseCase = cVar;
        this.processInterruptDialogMapper = cVar2;
        this.setupContract = dVar2;
        State state = new State(dVar2.F1(), null, null, 6, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: dx1.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9(this.f45292a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx1.c.Data p9(State state) {
        ex1.d dVar = this.mapper;
        er.a<i0> aVarB9 = b9(dx1.a.f.f45263a);
        er.a<i0> aVarB10 = b9(dx1.a.C1037a.f45252a);
        er.a<i0> aVarB11 = b9(dx1.a.b.f45253a);
        er.a<i0> aVarB12 = b9(dx1.a.h.f45265a);
        return dVar.b(new ex1.d.Params(state, new er.l() { // from class: dx1.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.q9(this.f45291a, (b0) obj);
            }
        }, b9(dx1.a.g.f45264a), aVarB9, aVarB10, aVarB11, aVarB12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(o oVar, b0 b0Var) {
        oVar.d9(new dx1.a.PinNumberInputChange(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final o oVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: dx1.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.t9(this.f45290a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(o oVar, z zVar) {
        c cVar = oVar.new c(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(dx1.a.b.class), oVar2, cVar);
        zVar.x(q0.c(dx1.a.C1037a.class), oVar2, oVar.new d(null));
        zVar.v(q0.c(dx1.a.PinNumberInputChange.class), oVar2, new e(null));
        zVar.v(q0.c(dx1.a.h.class), oVar2, oVar.new f(null));
        zVar.x(q0.c(dx1.a.d.class), oVar2, oVar.new g(null));
        zVar.x(q0.c(dx1.a.f.class), oVar2, oVar.new h(null));
        zVar.x(q0.c(dx1.a.g.class), oVar2, oVar.new i(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<dx1.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, dx1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<dx1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
