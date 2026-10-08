package fx1;

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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00013B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lfx1/o;", "Ll00/g;", "Lfx1/b;", "Lfx1/a;", "Lfx1/c;", "", "Lyy/a;", "stateMachineFactory", "Lgx1/d;", "mapper", "Lrw1/d;", "checkIfPukIsValidUseCase", "Lxw1/c;", "processInterruptDialogMapper", "Lfx1/d;", "setupContract", "<init>", "(Lyy/a;Lgx1/d;Lrw1/d;Lxw1/c;Lfx1/d;)V", "state", "Lfx1/c$a;", "p9", "(Lfx1/b;)Lfx1/c$a;", "b", "Lgx1/d;", "c", "Lrw1/d;", "d", "Lxw1/c;", "e", "Lfx1/d;", "f", "Lfx1/b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lfx1/a$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, fx1.a> implements fx1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gx1.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rw1.d checkIfPukIsValidUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw1.c processInterruptDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fx1.d setupContract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, fx1.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fx1.a.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<fx1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lfx1/o$a;", "Lf00/j0;", "Lfx1/d;", "Lfx1/o;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<fx1.d, o> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<fx1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f68641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f68642b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f68643a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f68644b;

            /* JADX INFO: renamed from: fx1.o$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1537a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f68645d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f68646e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f68647f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f68649h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f68650j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f68651k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f68652l;

                public C1537a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f68645d = obj;
                    this.f68646e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f68643a = hVar;
                this.f68644b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1537a c1537a;
                if (eVar instanceof C1537a) {
                    c1537a = (C1537a) eVar;
                    int i15 = c1537a.f68646e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1537a.f68646e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1537a = new C1537a(eVar);
                    }
                } else {
                    c1537a = new C1537a(eVar);
                }
                Object obj2 = c1537a.f68645d;
                Object objE = uq.b.e();
                int i16 = c1537a.f68646e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f68643a;
                    fx1.c.Data dataP9 = this.f68644b.p9((State) obj);
                    c1537a.f68647f = vq.j.a(obj);
                    c1537a.f68649h = vq.j.a(c1537a);
                    c1537a.f68650j = vq.j.a(obj);
                    c1537a.f68651k = vq.j.a(hVar);
                    c1537a.f68652l = 0;
                    c1537a.f68646e = 1;
                    if (hVar.F(dataP9, c1537a) == objE) {
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
            this.f68641a = gVar;
            this.f68642b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fx1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f68641a.a(new a(hVar, this.f68642b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfx1/a$b;", "<unused var>", "Lfx1/b;", "Loq/i0;", "<anonymous>", "(Lfx1/a$b;Lfx1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<fx1.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68653e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f68653e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fx1.a.c> bVarY1 = o.this.Y1();
                fx1.a.c.b bVar = fx1.a.c.b.f68600a;
                this.f68653e = 1;
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
        public final Object w(fx1.a.b bVar, State state, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfx1/a$a;", "<unused var>", "Lfx1/b;", "state", "Loq/i0;", "<anonymous>", "(Lfx1/a$a;Lfx1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<fx1.a.C1534a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68656f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fx1.a.c cVar;
            State state = (State) this.f68656f;
            Object objE = uq.b.e();
            int i15 = this.f68655e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fx1.a.c> bVarY1 = o.this.Y1();
                boolean firstScreenInFlow = state.getPukScreenData().getFirstScreenInFlow();
                if (firstScreenInFlow) {
                    cVar = fx1.a.c.b.f68600a;
                } else {
                    if (firstScreenInFlow) {
                        throw new oq.p();
                    }
                    cVar = fx1.a.c.C1535a.f68599a;
                }
                this.f68656f = vq.j.a(state);
                this.f68655e = 1;
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
        public final Object w(fx1.a.C1534a c1534a, State state, tq.e<? super i0> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f68656f = state;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfx1/a$e;", "action", "Lk10/c0;", "Lfx1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfx1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<fx1.a.PukNumberInputChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68659f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f68660g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(fx1.a.PukNumberInputChange pukNumberInputChange, State state) {
            return State.b(state, null, pukNumberInputChange.getNumber(), hz.b.C2039b.f86846c, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fx1.a.PukNumberInputChange pukNumberInputChange = (fx1.a.PukNumberInputChange) this.f68659f;
            c0 c0Var = (c0) this.f68660g;
            uq.b.e();
            if (this.f68658e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fx1.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.e.O(pukNumberInputChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fx1.a.PukNumberInputChange pukNumberInputChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f68659f = pukNumberInputChange;
            eVar2.f68660g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfx1/a$g;", "<unused var>", "Lk10/c0;", "Lfx1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfx1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<fx1.a.g, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68662f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.g gVar, State state) {
            return State.b(state, null, null, hz.b.INSTANCE.a(gVar), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f68662f;
            Object objE = uq.b.e();
            int i15 = this.f68661e;
            if (i15 == 0) {
                oq.u.b(obj);
                rw1.d dVar = o.this.checkIfPukIsValidUseCase;
                rw1.d.Params params = new rw1.d.Params(((State) c0Var.a()).getPuk());
                this.f68662f = c0Var;
                this.f68661e = 1;
                obj = dVar.d(params, this);
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
            k10.l lVarB = c0Var.b(new er.l() { // from class: fx1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.f.O(gVar, (State) obj2);
                }
            });
            o.this.d9(fx1.a.d.f68604a);
            return lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fx1.a.g gVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = o.this.new f(eVar);
            fVar.f68662f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfx1/a$d;", "<unused var>", "Lfx1/b;", "state", "Loq/i0;", "<anonymous>", "(Lfx1/a$d;Lfx1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<fx1.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68665f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f68665f;
            Object objE = uq.b.e();
            int i15 = this.f68664e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (state.getPukValidationState() instanceof hz.b.d) {
                    o.this.setupContract.F2(state.getPuk());
                    xw.b<fx1.a.c> bVarY1 = o.this.Y1();
                    fx1.a.c.Next next = new fx1.a.c.Next(state.getPuk());
                    this.f68665f = vq.j.a(state);
                    this.f68664e = 1;
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
        public final Object w(fx1.a.d dVar, State state, tq.e<? super i0> eVar) {
            g gVar = o.this.new g(eVar);
            gVar.f68665f = state;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfx1/a$f;", "<unused var>", "Lfx1/b;", "state", "Loq/i0;", "<anonymous>", "(Lfx1/a$f;Lfx1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<fx1.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68668f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f68668f;
            Object objE = uq.b.e();
            int i15 = this.f68667e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fx1.a.c> bVarY1 = o.this.Y1();
                fx1.a.c.ShowDialog showDialog = new fx1.a.c.ShowDialog(o.this.processInterruptDialogMapper.b(new xw1.c.Params(state.getPukScreenData().getProcessInterruptDialogTitle(), new er.a() { // from class: fx1.r
                    @Override // er.a
                    public final Object a() {
                        return o.h.O();
                    }
                }, o.this.b9(fx1.a.b.f68598a))));
                this.f68668f = vq.j.a(state);
                this.f68667e = 1;
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
        public final Object w(fx1.a.f fVar, State state, tq.e<? super i0> eVar) {
            h hVar = o.this.new h(eVar);
            hVar.f68668f = state;
            return hVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, gx1.d dVar, rw1.d dVar2, xw1.c cVar, fx1.d dVar3) {
        this.mapper = dVar;
        this.checkIfPukIsValidUseCase = dVar2;
        this.processInterruptDialogMapper = cVar;
        this.setupContract = dVar3;
        State state = new State(dVar3.R8(), null, null, 6, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: fx1.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9(this.f68632a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fx1.c.Data p9(State state) {
        gx1.d dVar = this.mapper;
        er.a<i0> aVarB9 = b9(fx1.a.C1534a.f68597a);
        er.a<i0> aVarB10 = b9(fx1.a.b.f68598a);
        er.a<i0> aVarB11 = b9(fx1.a.g.f68608a);
        return dVar.b(new gx1.d.Params(state, new er.l() { // from class: fx1.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.q9(this.f68630a, (b0) obj);
            }
        }, b9(fx1.a.f.f68607a), aVarB9, aVarB10, aVarB11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(o oVar, b0 b0Var) {
        oVar.d9(new fx1.a.PukNumberInputChange(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final o oVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: fx1.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.t9(this.f68631a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(o oVar, z zVar) {
        c cVar = oVar.new c(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fx1.a.b.class), oVar2, cVar);
        zVar.x(q0.c(fx1.a.C1534a.class), oVar2, oVar.new d(null));
        zVar.v(q0.c(fx1.a.PukNumberInputChange.class), oVar2, new e(null));
        zVar.v(q0.c(fx1.a.g.class), oVar2, oVar.new f(null));
        zVar.x(q0.c(fx1.a.d.class), oVar2, oVar.new g(null));
        zVar.x(q0.c(fx1.a.f.class), oVar2, oVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<fx1.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, fx1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fx1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
