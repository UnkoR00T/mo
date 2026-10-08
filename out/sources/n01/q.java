package n01;

import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\"\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020\u0015*\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020'0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010H\u001a\b\u0012\u0004\u0012\u00020C0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Ln01/q;", "Ll00/g;", "Ln01/f;", "", "Ln01/g;", "Lyy/a;", "stateMachineFactory", "Lo01/a;", "screenMapper", "Lh01/d;", "validateSuggestionUC", "Lpo0/k;", "sendSuggestionUC", "Lib4/c;", "genericDomainErrorMapper", "Lp01/a;", "sendSuggestionEntryData", "<init>", "(Lyy/a;Lo01/a;Lh01/d;Lpo0/k;Lib4/c;Lp01/a;)V", "", "value", "Lhz/b;", "y9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lk10/c0;", "state", "Lk10/l;", "s9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "o9", "(Ldx/b;Ler/a;Ltq/e;)Ljava/lang/Object;", "Lhz/g;", "x9", "(Lhz/g;)Lhz/b;", "Ln01/g$a;", "q9", "(Ln01/f;)Ln01/g$a;", "b", "Lo01/a;", "c", "Lh01/d;", "d", "Lpo0/k;", "e", "Lib4/c;", "f", "Lp01/a;", "g", "Ln01/f;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Ln01/d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, Object> implements n01.g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o01.a screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h01.d validateSuggestionUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final po0.k sendSuggestionUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p01.a sendSuggestionEntryData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<n01.g.Data> state;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<n01.d> navAction;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f129803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129804e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129805f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f129806g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f129807h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f129808j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f129809k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f129811m;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f129809k = obj;
            this.f129811m |= PKIFailureInfo.systemUnavail;
            return q.this.s9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<n01.g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f129812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f129813b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f129814a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f129815b;

            /* JADX INFO: renamed from: n01.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3233a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f129816d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f129817e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f129818f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f129820h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f129821j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f129822k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f129823l;

                public C3233a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f129816d = obj;
                    this.f129817e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f129814a = hVar;
                this.f129815b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3233a c3233a;
                if (eVar instanceof C3233a) {
                    c3233a = (C3233a) eVar;
                    int i15 = c3233a.f129817e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3233a.f129817e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3233a = new C3233a(eVar);
                    }
                } else {
                    c3233a = new C3233a(eVar);
                }
                Object obj2 = c3233a.f129816d;
                Object objE = uq.b.e();
                int i16 = c3233a.f129817e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f129814a;
                    n01.g.Data dataQ9 = this.f129815b.q9((State) obj);
                    c3233a.f129818f = vq.j.a(obj);
                    c3233a.f129820h = vq.j.a(c3233a);
                    c3233a.f129821j = vq.j.a(obj);
                    c3233a.f129822k = vq.j.a(hVar);
                    c3233a.f129823l = 0;
                    c3233a.f129817e = 1;
                    if (hVar.F(dataQ9, c3233a) == objE) {
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

        public b(mu.g gVar, q qVar) {
            this.f129812a = gVar;
            this.f129813b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n01.g.Data> hVar, tq.e eVar) {
            Object objA = this.f129812a.a(new a(hVar, this.f129813b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln01/a;", "<unused var>", "Ln01/f;", "Loq/i0;", "<anonymous>", "(Ln01/a;Ln01/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<n01.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129824e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f129824e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n01.d> bVarY1 = q.this.Y1();
                n01.d.a aVar = n01.d.a.f129771a;
                this.f129824e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(n01.a aVar, State state, tq.e<? super i0> eVar) {
            return q.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln01/c;", "<unused var>", "Ln01/f;", "Loq/i0;", "<anonymous>", "(Ln01/c;Ln01/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<n01.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129826e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f129826e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n01.d> bVarY1 = q.this.Y1();
                n01.d.c cVar = n01.d.c.f129773a;
                this.f129826e = 1;
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
        public final Object w(n01.c cVar, State state, tq.e<? super i0> eVar) {
            return q.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln01/b;", "action", "Lk10/c0;", "Ln01/f;", "state", "Lk10/l;", "<anonymous>", "(Ln01/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<DescriptionValueChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f129830g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(DescriptionValueChange descriptionValueChange, hz.b bVar, State state) {
            return State.b(state, null, descriptionValueChange.getValue(), bVar, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final DescriptionValueChange descriptionValueChange = (DescriptionValueChange) this.f129829f;
            c0 c0Var = (c0) this.f129830g;
            Object objE = uq.b.e();
            int i15 = this.f129828e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                String value = descriptionValueChange.getValue();
                this.f129829f = descriptionValueChange;
                this.f129830g = c0Var;
                this.f129828e = 1;
                obj = qVar.y9(value, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final hz.b bVar = (hz.b) obj;
            return c0Var.b(new er.l() { // from class: n01.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(descriptionValueChange, bVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(DescriptionValueChange descriptionValueChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f129829f = descriptionValueChange;
            eVar2.f129830g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln01/e;", "<unused var>", "Lk10/c0;", "Ln01/f;", "state", "Lk10/l;", "<anonymous>", "(Ln01/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<n01.e, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129833f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f129833f;
            Object objE = uq.b.e();
            int i15 = this.f129832e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            q qVar = q.this;
            this.f129833f = vq.j.a(c0Var);
            this.f129832e = 1;
            Object objS9 = qVar.s9(c0Var, this);
            return objS9 == objE ? objE : objS9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n01.e eVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            f fVar = q.this.new f(eVar2);
            fVar.f129833f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f129835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129837f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f129839h;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f129837f = obj;
            this.f129839h |= PKIFailureInfo.systemUnavail;
            return q.this.y9(null, this);
        }
    }

    public q(yy.a aVar, o01.a aVar2, h01.d dVar, po0.k kVar, ib4.c cVar, p01.a aVar3) {
        this.screenMapper = aVar2;
        this.validateSuggestionUC = dVar;
        this.sendSuggestionUC = kVar;
        this.genericDomainErrorMapper = cVar;
        this.sendSuggestionEntryData = aVar3;
        State state = new State(aVar3, null, null, 6, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: n01.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.v9(this.f129793a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), q9(state));
        this.navAction = new xw.b<>();
    }

    private final Object o9(dx.b bVar, final er.a<i0> aVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new n01.d.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: n01.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.p9(aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(er.a aVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n01.g.Data q9(State state) {
        return this.screenMapper.b(new o01.a.Params(state, b9(n01.a.f129768a), b9(n01.e.f129774a), new er.l() { // from class: n01.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.r9(this.f129789a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(q qVar, String str) {
        qVar.d9(new DescriptionValueChange(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s9(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        a aVar;
        final hz.b bVar;
        c0<State> c0Var2;
        hz.b bVar2;
        dx.i iVar;
        dx.b bVar3;
        er.a<i0> aVarB9;
        c0<State> c0Var3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f129811m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f129811m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objY9 = aVar.f129809k;
        Object objE = uq.b.e();
        int i16 = aVar.f129811m;
        if (i16 == 0) {
            oq.u.b(objY9);
            String descriptionValue = c0Var.a().getDescriptionValue();
            aVar.f129803d = c0Var;
            aVar.f129811m = 1;
            objY9 = y9(descriptionValue, aVar);
            if (objY9 != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            c0Var = (c0) aVar.f129803d;
            oq.u.b(objY9);
        } else {
            if (i16 == 2) {
                bVar2 = (hz.b) aVar.f129804e;
                c0Var2 = (c0) aVar.f129803d;
                oq.u.b(objY9);
                iVar = (dx.i) objY9;
                if (iVar instanceof dx.i.Left) {
                    bVar3 = (dx.b) ((dx.i.Left) iVar).b();
                    aVarB9 = b9(n01.e.f129774a);
                    aVar.f129803d = c0Var2;
                    aVar.f129804e = bVar2;
                    aVar.f129805f = vq.j.a(iVar);
                    aVar.f129806g = vq.j.a(bVar3);
                    aVar.f129807h = 0;
                    aVar.f129808j = 0;
                    aVar.f129811m = 3;
                    if (o9(bVar3, aVarB9, aVar) != objE) {
                        c0Var3 = c0Var2;
                    }
                    return objE;
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                d9(n01.c.f129770a);
                bVar = bVar2;
                c0Var = c0Var2;
                return c0Var.b(new er.l() { // from class: n01.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.t9(bVar, (State) obj);
                    }
                });
            }
            if (i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = (hz.b) aVar.f129804e;
            c0Var3 = (c0) aVar.f129803d;
            oq.u.b(objY9);
        }
        bVar = bVar2;
        c0Var = c0Var3;
        return c0Var.b(new er.l() { // from class: n01.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(bVar, (State) obj);
            }
        });
        bVar = (hz.b) objY9;
        if (bVar.a()) {
            po0.k kVar = this.sendSuggestionUC;
            po0.k.Params params = new po0.k.Params(c0Var.a().getEntryData().getTopic().getType(), c0Var.a().getDescriptionValue());
            aVar.f129803d = c0Var;
            aVar.f129804e = bVar;
            aVar.f129811m = 2;
            Object objC = kVar.c(params, aVar);
            if (objC != objE) {
                c0Var2 = c0Var;
                bVar2 = bVar;
                objY9 = objC;
                iVar = (dx.i) objY9;
                if (iVar instanceof dx.i.Left) {
                    bVar3 = (dx.b) ((dx.i.Left) iVar).b();
                    aVarB9 = b9(n01.e.f129774a);
                    aVar.f129803d = c0Var2;
                    aVar.f129804e = bVar2;
                    aVar.f129805f = vq.j.a(iVar);
                    aVar.f129806g = vq.j.a(bVar3);
                    aVar.f129807h = 0;
                    aVar.f129808j = 0;
                    aVar.f129811m = 3;
                    if (o9(bVar3, aVarB9, aVar) != objE) {
                        c0Var3 = c0Var2;
                        bVar = bVar2;
                        c0Var = c0Var3;
                    }
                } else {
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    d9(n01.c.f129770a);
                    bVar = bVar2;
                    c0Var = c0Var2;
                }
            }
            return objE;
        }
        return c0Var.b(new er.l() { // from class: n01.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(bVar, (State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State t9(hz.b bVar, State state) {
        return State.b(state, null, null, bVar, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final q qVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: n01.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.w9(this.f129790a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(q qVar, z zVar) {
        c cVar = qVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(n01.a.class), oVar, cVar);
        zVar.x(q0.c(n01.c.class), oVar, qVar.new d(null));
        zVar.v(q0.c(DescriptionValueChange.class), oVar, qVar.new e(null));
        zVar.v(q0.c(n01.e.class), oVar, qVar.new f(null));
        return i0.f148189a;
    }

    private final hz.b x9(hz.g gVar) {
        if (fr.t.c(gVar, hz.g.b.f86853b)) {
            return hz.b.d.f86848c;
        }
        if (gVar instanceof hz.g.Invalid) {
            return new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage());
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y9(String str, tq.e<? super hz.b> eVar) throws Throwable {
        g gVar;
        q qVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f129839h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f129839h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objG = gVar.f129837f;
        Object objE = uq.b.e();
        int i16 = gVar.f129839h;
        if (i16 == 0) {
            oq.u.b(objG);
            h01.d dVar = this.validateSuggestionUC;
            h01.d.Params params = new h01.d.Params(str);
            gVar.f129835d = vq.j.a(str);
            gVar.f129836e = this;
            gVar.f129839h = 1;
            objG = dVar.g(params, gVar);
            if (objG == objE) {
                return objE;
            }
            qVar = this;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) gVar.f129836e;
            oq.u.b(objG);
        }
        return qVar.x9((hz.g) objG);
    }

    @Override // zx.b
    public xw.b<n01.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<n01.g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(p01.a aVar) {
        super.P5(aVar);
    }
}
