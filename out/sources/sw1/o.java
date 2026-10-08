package sw1;

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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00013B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lsw1/o;", "Ll00/g;", "Lsw1/b;", "Lsw1/a;", "Lsw1/c;", "", "Lyy/a;", "stateMachineFactory", "Ltw1/d;", "mapper", "Lrw1/a;", "checkIfCanIsValidUseCase", "Lxw1/c;", "processInterruptDialogMapper", "Lsw1/d;", "setupContract", "<init>", "(Lyy/a;Ltw1/d;Lrw1/a;Lxw1/c;Lsw1/d;)V", "state", "Lsw1/c$a;", "p9", "(Lsw1/b;)Lsw1/c$a;", "b", "Ltw1/d;", "c", "Lrw1/a;", "d", "Lxw1/c;", "e", "Lsw1/d;", "f", "Lsw1/b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lsw1/a$d;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, sw1.a> implements sw1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tw1.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rw1.a checkIfCanIsValidUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw1.c processInterruptDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final sw1.d setupContract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, sw1.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sw1.a.d> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<sw1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsw1/o$a;", "Lf00/j0;", "Lsw1/d;", "Lsw1/o;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<sw1.d, o> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<sw1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f184920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f184921b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f184922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f184923b;

            /* JADX INFO: renamed from: sw1.o$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4778a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f184924d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f184925e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f184926f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f184928h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f184929j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f184930k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f184931l;

                public C4778a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f184924d = obj;
                    this.f184925e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f184922a = hVar;
                this.f184923b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4778a c4778a;
                if (eVar instanceof C4778a) {
                    c4778a = (C4778a) eVar;
                    int i15 = c4778a.f184925e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4778a.f184925e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4778a = new C4778a(eVar);
                    }
                } else {
                    c4778a = new C4778a(eVar);
                }
                Object obj2 = c4778a.f184924d;
                Object objE = uq.b.e();
                int i16 = c4778a.f184925e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f184922a;
                    sw1.c.Data dataP9 = this.f184923b.p9((State) obj);
                    c4778a.f184926f = vq.j.a(obj);
                    c4778a.f184928h = vq.j.a(c4778a);
                    c4778a.f184929j = vq.j.a(obj);
                    c4778a.f184930k = vq.j.a(hVar);
                    c4778a.f184931l = 0;
                    c4778a.f184925e = 1;
                    if (hVar.F(dataP9, c4778a) == objE) {
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
            this.f184920a = gVar;
            this.f184921b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super sw1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f184920a.a(new a(hVar, this.f184921b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsw1/a$b;", "action", "Lk10/c0;", "Lsw1/b;", "state", "Lk10/l;", "<anonymous>", "(Lsw1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sw1.a.CanNumberInputChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184933f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f184934g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, sw1.a.CanNumberInputChange canNumberInputChange, State state) {
            return State.b((State) c0Var.a(), null, canNumberInputChange.getNumber(), hz.b.C2039b.f86846c, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sw1.a.CanNumberInputChange canNumberInputChange = (sw1.a.CanNumberInputChange) this.f184933f;
            final c0 c0Var = (c0) this.f184934g;
            uq.b.e();
            if (this.f184932e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sw1.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.c.O(c0Var, canNumberInputChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sw1.a.CanNumberInputChange canNumberInputChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f184933f = canNumberInputChange;
            cVar.f184934g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsw1/a$g;", "<unused var>", "Lk10/c0;", "Lsw1/b;", "state", "Lk10/l;", "<anonymous>", "(Lsw1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sw1.a.g, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184936f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.g gVar, State state) {
            return State.b(state, null, null, hz.b.INSTANCE.a(gVar), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f184936f;
            Object objE = uq.b.e();
            int i15 = this.f184935e;
            if (i15 == 0) {
                oq.u.b(obj);
                rw1.a aVar = o.this.checkIfCanIsValidUseCase;
                rw1.a.Params params = new rw1.a.Params(((State) c0Var.a()).getCan());
                this.f184936f = c0Var;
                this.f184935e = 1;
                obj = aVar.d(params, this);
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
            k10.l lVarB = c0Var.b(new er.l() { // from class: sw1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.d.O(gVar, (State) obj2);
                }
            });
            o.this.d9(sw1.a.e.f184884a);
            return lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sw1.a.g gVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f184936f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsw1/a$e;", "<unused var>", "Lsw1/b;", "state", "Loq/i0;", "<anonymous>", "(Lsw1/a$e;Lsw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<sw1.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184939f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f184939f;
            Object objE = uq.b.e();
            int i15 = this.f184938e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (state.getValidationState() instanceof hz.b.d) {
                    o.this.setupContract.Z(state.getCan());
                    xw.b<sw1.a.d> bVarY1 = o.this.Y1();
                    sw1.a.d.Next next = new sw1.a.d.Next(state.getCan());
                    this.f184939f = vq.j.a(state);
                    this.f184938e = 1;
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
        public final Object w(sw1.a.e eVar, State state, tq.e<? super i0> eVar2) {
            e eVar3 = o.this.new e(eVar2);
            eVar3.f184939f = state;
            return eVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsw1/a$f;", "<unused var>", "Lsw1/b;", "state", "Loq/i0;", "<anonymous>", "(Lsw1/a$f;Lsw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sw1.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184942f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f184942f;
            Object objE = uq.b.e();
            int i15 = this.f184941e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sw1.a.d> bVarY1 = o.this.Y1();
                sw1.a.d.ShowDialog showDialog = new sw1.a.d.ShowDialog(o.this.processInterruptDialogMapper.b(new xw1.c.Params(state.getCanScreenData().getProcessInterruptDialogTitle(), new er.a() { // from class: sw1.r
                    @Override // er.a
                    public final Object a() {
                        return o.f.O();
                    }
                }, o.this.b9(sw1.a.c.f184878a))));
                this.f184942f = vq.j.a(state);
                this.f184941e = 1;
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
        public final Object w(sw1.a.f fVar, State state, tq.e<? super i0> eVar) {
            f fVar2 = o.this.new f(eVar);
            fVar2.f184942f = state;
            return fVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsw1/a$c;", "<unused var>", "Lsw1/b;", "state", "Loq/i0;", "<anonymous>", "(Lsw1/a$c;Lsw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<sw1.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184944e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f184944e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sw1.a.d> bVarY1 = o.this.Y1();
                sw1.a.d.b bVar = sw1.a.d.b.f184880a;
                this.f184944e = 1;
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
        public final Object w(sw1.a.c cVar, State state, tq.e<? super i0> eVar) {
            return o.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsw1/a$a;", "<unused var>", "Lsw1/b;", "state", "Loq/i0;", "<anonymous>", "(Lsw1/a$a;Lsw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sw1.a.C4775a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184946e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184947f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sw1.a.d dVar;
            State state = (State) this.f184947f;
            Object objE = uq.b.e();
            int i15 = this.f184946e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sw1.a.d> bVarY1 = o.this.Y1();
                boolean firstScreenInFlow = state.getCanScreenData().getFirstScreenInFlow();
                if (firstScreenInFlow) {
                    dVar = sw1.a.d.b.f184880a;
                } else {
                    if (firstScreenInFlow) {
                        throw new oq.p();
                    }
                    dVar = sw1.a.d.C4776a.f184879a;
                }
                this.f184947f = vq.j.a(state);
                this.f184946e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(sw1.a.C4775a c4775a, State state, tq.e<? super i0> eVar) {
            h hVar = o.this.new h(eVar);
            hVar.f184947f = state;
            return hVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, tw1.d dVar, rw1.a aVar2, xw1.c cVar, sw1.d dVar2) {
        this.mapper = dVar;
        this.checkIfCanIsValidUseCase = aVar2;
        this.processInterruptDialogMapper = cVar;
        this.setupContract = dVar2;
        State state = new State(dVar2.i8(), dVar2.O(), null, 4, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: sw1.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9(this.f184911a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sw1.c.Data p9(State state) {
        tw1.d dVar = this.mapper;
        er.a<i0> aVarB9 = b9(sw1.a.C4775a.f184875a);
        er.a<i0> aVarB10 = b9(sw1.a.c.f184878a);
        er.a<i0> aVarB11 = b9(sw1.a.g.f184886a);
        return dVar.b(new tw1.d.Params(state, new er.l() { // from class: sw1.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.q9(this.f184910a, (b0) obj);
            }
        }, b9(sw1.a.f.f184885a), aVarB9, aVarB10, aVarB11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(o oVar, b0 b0Var) {
        oVar.d9(new sw1.a.CanNumberInputChange(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final o oVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: sw1.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.t9(this.f184909a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(o oVar, z zVar) {
        c cVar = new c(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(sw1.a.CanNumberInputChange.class), oVar2, cVar);
        zVar.v(q0.c(sw1.a.g.class), oVar2, oVar.new d(null));
        zVar.x(q0.c(sw1.a.e.class), oVar2, oVar.new e(null));
        zVar.x(q0.c(sw1.a.f.class), oVar2, oVar.new f(null));
        zVar.x(q0.c(sw1.a.c.class), oVar2, oVar.new g(null));
        zVar.x(q0.c(sw1.a.C4775a.class), oVar2, oVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<sw1.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, sw1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<sw1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
