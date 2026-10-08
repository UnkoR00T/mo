package s82;

import fr.q0;
import java.util.Iterator;
import java.util.Map;
import k10.c0;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110,8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010#\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Ls82/p;", "Ll00/g;", "Ls82/b;", "Ls82/a;", "Ls82/c;", "", "Lyy/a;", "stateMachineFactory", "Lg82/a;", "validateLocationDetailsUC", "Lu82/e;", "locationDetailsMapper", "Lt82/a;", "contract", "<init>", "(Lyy/a;Lg82/a;Lu82/e;Lt82/a;)V", "state", "Ls82/c$a;", "s9", "(Ls82/b;)Ls82/c$a;", "b", "Lg82/a;", "c", "Lu82/e;", "d", "Lt82/a;", "e", "Ls82/b;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Ls82/a$e;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, s82.a> implements s82.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g82.a validateLocationDetailsUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u82.e locationDetailsMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t82.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, s82.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<s82.a.e> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<s82.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<s82.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f179205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f179206b;

        /* JADX INFO: renamed from: s82.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4604a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f179207a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f179208b;

            /* JADX INFO: renamed from: s82.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4605a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f179209d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f179210e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f179211f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f179213h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f179214j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f179215k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f179216l;

                public C4605a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f179209d = obj;
                    this.f179210e |= PKIFailureInfo.systemUnavail;
                    return C4604a.this.F(null, this);
                }
            }

            public C4604a(mu.h hVar, p pVar) {
                this.f179207a = hVar;
                this.f179208b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4605a c4605a;
                if (eVar instanceof C4605a) {
                    c4605a = (C4605a) eVar;
                    int i15 = c4605a.f179210e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4605a.f179210e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4605a = new C4605a(eVar);
                    }
                } else {
                    c4605a = new C4605a(eVar);
                }
                Object obj2 = c4605a.f179209d;
                Object objE = uq.b.e();
                int i16 = c4605a.f179210e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f179207a;
                    s82.c.Data dataS9 = this.f179208b.s9((State) obj);
                    c4605a.f179211f = vq.j.a(obj);
                    c4605a.f179213h = vq.j.a(c4605a);
                    c4605a.f179214j = vq.j.a(obj);
                    c4605a.f179215k = vq.j.a(hVar);
                    c4605a.f179216l = 0;
                    c4605a.f179210e = 1;
                    if (hVar.F(dataS9, c4605a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f179205a = gVar;
            this.f179206b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super s82.c.Data> hVar, tq.e eVar) {
            Object objA = this.f179205a.a(new C4604a(hVar, this.f179206b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls82/b;", "it", "Loq/i0;", "<anonymous>", "(Ls82/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179217e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f179217e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(new s82.a.SetLocationDetailsAction(p.this.contract.Z4()));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((b) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls82/a$c;", "action", "Lk10/c0;", "Ls82/b;", "state", "Lk10/l;", "<anonymous>", "(Ls82/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<s82.a.AddStreetNameAndNumberAction, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f179221g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(s82.a.AddStreetNameAndNumberAction addStreetNameAndNumberAction, State state) {
            return State.b(state, new State.FieldState(null, addStreetNameAndNumberAction.getStreetNameAndNumber(), 1, null), null, null, null, null, 30, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s82.a.AddStreetNameAndNumberAction addStreetNameAndNumberAction = (s82.a.AddStreetNameAndNumberAction) this.f179220f;
            c0 c0Var = (c0) this.f179221g;
            uq.b.e();
            if (this.f179219e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: s82.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O(addStreetNameAndNumberAction, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s82.a.AddStreetNameAndNumberAction addStreetNameAndNumberAction, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f179220f = addStreetNameAndNumberAction;
            cVar.f179221g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls82/a$a;", "action", "Lk10/c0;", "Ls82/b;", "state", "Lk10/l;", "<anonymous>", "(Ls82/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<s82.a.AddCityNameAction, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f179224g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(s82.a.AddCityNameAction addCityNameAction, State state) {
            return State.b(state, null, new State.FieldState(null, addCityNameAction.getCityName(), 1, null), null, null, null, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s82.a.AddCityNameAction addCityNameAction = (s82.a.AddCityNameAction) this.f179223f;
            c0 c0Var = (c0) this.f179224g;
            uq.b.e();
            if (this.f179222e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: s82.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(addCityNameAction, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s82.a.AddCityNameAction addCityNameAction, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f179223f = addCityNameAction;
            dVar.f179224g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls82/a$b;", "action", "Lk10/c0;", "Ls82/b;", "state", "Lk10/l;", "<anonymous>", "(Ls82/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<s82.a.AddPostalCodeAction, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f179227g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(s82.a.AddPostalCodeAction addPostalCodeAction, State state) {
            return State.b(state, null, null, new State.FieldState(null, Label.h(addPostalCodeAction.getPostalCode(), fu.r.P(addPostalCodeAction.getPostalCode().getText(), ".", "-", false, 4, null), null, 2, null), 1, null), null, null, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s82.a.AddPostalCodeAction addPostalCodeAction = (s82.a.AddPostalCodeAction) this.f179226f;
            c0 c0Var = (c0) this.f179227g;
            uq.b.e();
            if (this.f179225e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: s82.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O(addPostalCodeAction, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s82.a.AddPostalCodeAction addPostalCodeAction, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f179226f = addPostalCodeAction;
            eVar2.f179227g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls82/a$d;", "action", "Lk10/c0;", "Ls82/b;", "state", "Lk10/l;", "<anonymous>", "(Ls82/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<s82.a.ChooseVoivodeshipNameAction, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179229f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f179230g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(s82.a.ChooseVoivodeshipNameAction chooseVoivodeshipNameAction, State state) {
            return State.b(state, null, null, null, new State.FieldState(null, chooseVoivodeshipNameAction.getVoivodeshipName(), 1, null), null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s82.a.ChooseVoivodeshipNameAction chooseVoivodeshipNameAction = (s82.a.ChooseVoivodeshipNameAction) this.f179229f;
            c0 c0Var = (c0) this.f179230g;
            uq.b.e();
            if (this.f179228e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: s82.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.f.O(chooseVoivodeshipNameAction, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s82.a.ChooseVoivodeshipNameAction chooseVoivodeshipNameAction, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f179229f = chooseVoivodeshipNameAction;
            fVar.f179230g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls82/a$h;", "action", "Ls82/b;", "state", "Loq/i0;", "<anonymous>", "(Ls82/a$h;Ls82/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<s82.a.OpenVoivodeshipDropDownAction, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179232f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s82.a.OpenVoivodeshipDropDownAction openVoivodeshipDropDownAction = (s82.a.OpenVoivodeshipDropDownAction) this.f179232f;
            Object objE = uq.b.e();
            int i15 = this.f179231e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                s82.a.e.OpenBottomSheet openBottomSheet = new s82.a.e.OpenBottomSheet(openVoivodeshipDropDownAction.getData());
                this.f179232f = vq.j.a(openVoivodeshipDropDownAction);
                this.f179231e = 1;
                if (pVar.F(openBottomSheet, this) == objE) {
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
        public final Object w(s82.a.OpenVoivodeshipDropDownAction openVoivodeshipDropDownAction, State state, tq.e<? super i0> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f179232f = openVoivodeshipDropDownAction;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls82/a$i;", "action", "Lk10/c0;", "Ls82/b;", "state", "Lk10/l;", "<anonymous>", "(Ls82/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<s82.a.SetLocationDetailsAction, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179235f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f179236g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(s82.a.SetLocationDetailsAction setLocationDetailsAction, State state) {
            return State.b(state, new State.FieldState(null, setLocationDetailsAction.getLocationDetails().getStreetNameAndNumber(), 1, null), new State.FieldState(null, setLocationDetailsAction.getLocationDetails().getCityName(), 1, null), new State.FieldState(null, setLocationDetailsAction.getLocationDetails().getPostalCode(), 1, null), new State.FieldState(null, setLocationDetailsAction.getLocationDetails().getVoivodeshipName(), 1, null), null, 16, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s82.a.SetLocationDetailsAction setLocationDetailsAction = (s82.a.SetLocationDetailsAction) this.f179235f;
            c0 c0Var = (c0) this.f179236g;
            uq.b.e();
            if (this.f179234e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: s82.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.h.O(setLocationDetailsAction, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s82.a.SetLocationDetailsAction setLocationDetailsAction, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f179235f = setLocationDetailsAction;
            hVar.f179236g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls82/a$g;", "<unused var>", "Lk10/c0;", "Ls82/b;", "state", "Lk10/l;", "<anonymous>", "(Ls82/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<s82.a.g, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179238f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f179238f;
            uq.b.e();
            if (this.f179237e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: s82.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.i.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s82.a.g gVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f179238f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls82/a$f;", "<unused var>", "Lk10/c0;", "Ls82/b;", "state", "Lk10/l;", "<anonymous>", "(Ls82/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<s82.a.f, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f179239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f179240f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f179241g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f179242h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f179243j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f179244k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f179245l;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Map map, State state) {
            Object next;
            State.FieldState fieldStateB = State.FieldState.b(state.getVoivodeshipNameState(), ((hz.g) v0.j(map, a82.a.VOIVODESHIP)).a(), null, 2, null);
            State.FieldState fieldStateB2 = State.FieldState.b(state.getCityNameState(), ((hz.g) v0.j(map, a82.a.CITY)).a(), null, 2, null);
            State.FieldState fieldStateB3 = State.FieldState.b(state.getStreetNameAndNumberState(), ((hz.g) v0.j(map, a82.a.STREET_BUILDING_AND_APARTMENT)).a(), null, 2, null);
            State.FieldState fieldStateB4 = State.FieldState.b(state.getPostalCodeState(), ((hz.g) v0.j(map, a82.a.ZIP_CODE)).a(), null, 2, null);
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Map.Entry) next).getValue() instanceof hz.g.Invalid));
            Map.Entry entry = (Map.Entry) next;
            return state.a(fieldStateB3, fieldStateB2, fieldStateB4, fieldStateB, entry != null ? (a82.a) entry.getKey() : null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objD;
            c0 c0Var = (c0) this.f179245l;
            Object objE = uq.b.e();
            int i15 = this.f179244k;
            if (i15 == 0) {
                oq.u.b(obj);
                g82.a aVar = p.this.validateLocationDetailsUC;
                State state = (State) c0Var.a();
                g82.a.Params params = new g82.a.Params(state.getVoivodeshipNameState().getValue().getText(), state.getCityNameState().getValue().getText(), state.getStreetNameAndNumberState().getValue().getText(), state.getPostalCodeState().getValue().getText());
                this.f179245l = c0Var;
                this.f179244k = 1;
                objD = aVar.d(params, this);
                if (objD != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f179240f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            objD = obj;
            p pVar = p.this;
            final Map map = (Map) objD;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() instanceof hz.g.Invalid) {
                        return c0Var.b(new er.l() { // from class: s82.w
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return p.j.O(map, (State) obj2);
                            }
                        });
                    }
                }
            }
            k10.l lVarC = c0Var.c();
            t82.a aVar2 = pVar.contract;
            State state2 = (State) c0Var.a();
            aVar2.P8(LocationDetails.b(pVar.contract.Z4(), null, state2.getStreetNameAndNumberState().getValue(), state2.getCityNameState().getValue(), state2.getPostalCodeState().getValue(), state2.getVoivodeshipNameState().getValue(), null, null, null, 225, null));
            s82.a.e.C4600a c4600a = s82.a.e.C4600a.f179150a;
            this.f179245l = vq.j.a(c0Var);
            this.f179239e = vq.j.a(map);
            this.f179240f = lVarC;
            this.f179241g = vq.j.a(lVarC);
            this.f179242h = 0;
            this.f179243j = 0;
            this.f179244k = 2;
            return pVar.F(c4600a, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s82.a.f fVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = p.this.new j(eVar);
            jVar.f179245l = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, g82.a aVar2, u82.e eVar, t82.a aVar3) {
        this.validateLocationDetailsUC = aVar2;
        this.locationDetailsMapper = eVar;
        this.contract = aVar3;
        State state = new State(null, null, null, null, null, 31, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: s82.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f179197a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), s9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(p pVar, k10.z zVar) {
        zVar.C(pVar.new b(null));
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(s82.a.AddStreetNameAndNumberAction.class), oVar, cVar);
        zVar.v(q0.c(s82.a.AddCityNameAction.class), oVar, new d(null));
        zVar.v(q0.c(s82.a.AddPostalCodeAction.class), oVar, new e(null));
        zVar.v(q0.c(s82.a.ChooseVoivodeshipNameAction.class), oVar, new f(null));
        zVar.x(q0.c(s82.a.OpenVoivodeshipDropDownAction.class), oVar, pVar.new g(null));
        zVar.v(q0.c(s82.a.SetLocationDetailsAction.class), oVar, new h(null));
        zVar.v(q0.c(s82.a.g.class), oVar, new i(null));
        zVar.v(q0.c(s82.a.f.class), oVar, pVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s82.c.Data s9(State state) {
        return this.locationDetailsMapper.b(new u82.e.Params(state, new er.l() { // from class: s82.i
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(this.f179191a, (Label) obj);
            }
        }, new er.l() { // from class: s82.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.u9(this.f179192a, (Label) obj);
            }
        }, new er.l() { // from class: s82.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.v9(this.f179193a, (Label) obj);
            }
        }, new er.l() { // from class: s82.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f179194a, (c92.a.Voivodeship) obj);
            }
        }, new er.l() { // from class: s82.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.x9(this.f179195a, (Label) obj);
            }
        }, b9(s82.a.g.f179153a), b9(s82.a.f.f179152a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(p pVar, Label label) {
        pVar.d9(new s82.a.AddStreetNameAndNumberAction(label));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(p pVar, Label label) {
        pVar.d9(new s82.a.AddCityNameAction(label));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(p pVar, Label label) {
        pVar.d9(new s82.a.AddPostalCodeAction(label));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(p pVar, c92.a.Voivodeship voivodeship) {
        pVar.d9(new s82.a.OpenVoivodeshipDropDownAction(voivodeship));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(p pVar, Label label) {
        pVar.d9(new s82.a.ChooseVoivodeshipNameAction(label));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: s82.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.A9(this.f179196a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<s82.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, s82.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<s82.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(s82.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(t82.a aVar) {
        super.P5(aVar);
    }
}
