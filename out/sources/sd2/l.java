package sd2;

import fr.q0;
import iy.b0;
import java.util.Locale;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import ll0.IdVerificationData;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lsd2/l;", "Ll00/g;", "Lsd2/b;", "Lsd2/a;", "Lsd2/c;", "", "Lyy/a;", "stateMachineFactory", "Ltd2/d;", "mapper", "Lj14/b;", "checkIdCardSeriesAndNumberUC", "Lvl0/a;", "verifyIdSeriesAndNumberUC", "Lib4/c;", "errorMapper", "<init>", "(Lyy/a;Ltd2/d;Lj14/b;Lvl0/a;Lib4/c;)V", "state", "Lsd2/c$a;", "p9", "(Lsd2/b;)Lsd2/c$a;", "b", "Ltd2/d;", "c", "Lj14/b;", "d", "Lvl0/a;", "e", "Lib4/c;", "f", "Lsd2/b;", "initialState", "Lxw/b;", "Lsd2/a$a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "idverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, sd2.a> implements sd2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final td2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j14.b checkIdCardSeriesAndNumberUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final vl0.a verifyIdSeriesAndNumberUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sd2.a.InterfaceC4647a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<State, sd2.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<sd2.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<sd2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f180425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f180426b;

        /* JADX INFO: renamed from: sd2.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4649a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f180427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f180428b;

            /* JADX INFO: renamed from: sd2.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4650a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f180429d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f180430e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f180431f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f180433h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f180434j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f180435k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f180436l;

                public C4650a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f180429d = obj;
                    this.f180430e |= PKIFailureInfo.systemUnavail;
                    return C4649a.this.F(null, this);
                }
            }

            public C4649a(mu.h hVar, l lVar) {
                this.f180427a = hVar;
                this.f180428b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4650a c4650a;
                if (eVar instanceof C4650a) {
                    c4650a = (C4650a) eVar;
                    int i15 = c4650a.f180430e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4650a.f180430e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4650a = new C4650a(eVar);
                    }
                } else {
                    c4650a = new C4650a(eVar);
                }
                Object obj2 = c4650a.f180429d;
                Object objE = uq.b.e();
                int i16 = c4650a.f180430e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f180427a;
                    sd2.c.Data dataP9 = this.f180428b.p9((State) obj);
                    c4650a.f180431f = vq.j.a(obj);
                    c4650a.f180433h = vq.j.a(c4650a);
                    c4650a.f180434j = vq.j.a(obj);
                    c4650a.f180435k = vq.j.a(hVar);
                    c4650a.f180436l = 0;
                    c4650a.f180430e = 1;
                    if (hVar.F(dataP9, c4650a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f180425a = gVar;
            this.f180426b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super sd2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f180425a.a(new C4649a(hVar, this.f180426b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsd2/a$d;", "action", "Lk10/c0;", "Lsd2/b;", "state", "Lk10/l;", "<anonymous>", "(Lsd2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<sd2.a.OnFieldChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f180439g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(b0 b0Var, State state) {
            hz.b validationState = state.getValidationState();
            if (!b0Var.c(state.getSeriesAndNumber())) {
                validationState = null;
            }
            if (validationState == null) {
                validationState = hz.b.d.f86848c;
            }
            return State.b(state, b0Var, validationState, false, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sd2.a.OnFieldChanged onFieldChanged = (sd2.a.OnFieldChanged) this.f180438f;
            c0 c0Var = (c0) this.f180439g;
            uq.b.e();
            if (this.f180437e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            String strE = iy.c0.e(onFieldChanged.getValue());
            StringBuilder sb5 = new StringBuilder();
            for (int i15 = 0; i15 < strE.length(); i15++) {
                char cCharAt = strE.charAt(i15);
                if (!fu.a.c(cCharAt)) {
                    sb5.append(cCharAt);
                }
            }
            final b0 b0VarG = iy.c0.g(sb5.toString().toUpperCase(Locale.ROOT));
            return c0Var.b(new er.l() { // from class: sd2.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.b.O(b0VarG, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sd2.a.OnFieldChanged onFieldChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f180438f = onFieldChanged;
            bVar.f180439g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsd2/a$f;", "<unused var>", "Lk10/c0;", "Lsd2/b;", "state", "Lk10/l;", "<anonymous>", "(Lsd2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sd2.a.f, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180441f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f180441f;
            uq.b.e();
            if (this.f180440e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: sd2.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.c.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sd2.a.f fVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f180441f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsd2/a$e;", "<unused var>", "Lk10/c0;", "Lsd2/b;", "state", "Lk10/l;", "<anonymous>", "(Lsd2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sd2.a.e, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f180442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f180443f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f180444g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f180445h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f180446j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f180447k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f180448l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f180449m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f180450n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f180451p;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.g gVar, State state) {
            return State.b(state, null, new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage()), true, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hz.g gVarA;
            l lVar;
            k10.l lVar2;
            k10.l lVar3;
            int i15;
            c0 c0Var = (c0) this.f180451p;
            Object objE = uq.b.e();
            int i16 = this.f180450n;
            if (i16 == 0) {
                u.b(obj);
                gVarA = l.this.checkIdCardSeriesAndNumberUC.a(new j14.b.Params(false, ((State) c0Var.a()).getSeriesAndNumber(), 1, null));
                if (gVarA instanceof hz.g.Invalid) {
                    return c0Var.b(new er.l() { // from class: sd2.o
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l.d.O(gVarA, (State) obj2);
                        }
                    });
                }
                if (!fr.t.c(gVarA, hz.g.b.f86853b)) {
                    throw new oq.p();
                }
                k10.l lVarC = c0Var.c();
                lVar = l.this;
                vl0.a aVar = lVar.verifyIdSeriesAndNumberUC;
                vl0.a.Params params = new vl0.a.Params(((State) c0Var.a()).getSeriesAndNumber());
                this.f180451p = vq.j.a(c0Var);
                this.f180442e = vq.j.a(gVarA);
                this.f180443f = lVarC;
                this.f180444g = lVar;
                this.f180445h = vq.j.a(lVarC);
                this.f180447k = 0;
                this.f180450n = 1;
                Object objC = aVar.c(params, this);
                if (objC != objE) {
                    lVar2 = lVarC;
                    lVar3 = lVar2;
                    obj = objC;
                    i15 = 0;
                }
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar4 = (k10.l) this.f180443f;
                u.b(obj);
                return lVar4;
            }
            i15 = this.f180447k;
            lVar2 = (k10.l) this.f180445h;
            lVar = (l) this.f180444g;
            lVar3 = (k10.l) this.f180443f;
            gVarA = (hz.g) this.f180442e;
            u.b(obj);
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                lVar.d9(new sd2.a.OnError((dx.b) ((dx.i.Left) iVar).b()));
                return lVar3;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            IdVerificationData idVerificationData = (IdVerificationData) ((dx.i.Right) iVar).b();
            sd2.a.InterfaceC4647a.Next next = new sd2.a.InterfaceC4647a.Next(idVerificationData);
            this.f180451p = vq.j.a(c0Var);
            this.f180442e = vq.j.a(gVarA);
            this.f180443f = lVar3;
            this.f180444g = vq.j.a(lVar2);
            this.f180445h = vq.j.a(iVar);
            this.f180446j = vq.j.a(idVerificationData);
            this.f180447k = i15;
            this.f180448l = 0;
            this.f180449m = 0;
            this.f180450n = 2;
            return lVar.F(next, this) == objE ? objE : lVar3;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sd2.a.e eVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            d dVar = l.this.new d(eVar2);
            dVar.f180451p = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsd2/a$c;", "action", "Lsd2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsd2/a$c;Lsd2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<sd2.a.OnError, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f180453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180455g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f180456h;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(l lVar, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                lVar.d9(sd2.a.e.f180392a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sd2.a.OnError onError = (sd2.a.OnError) this.f180456h;
            Object objE = uq.b.e();
            int i15 = this.f180455g;
            if (i15 == 0) {
                u.b(obj);
                ib4.c cVar = l.this.errorMapper;
                dx.b error = onError.getError();
                final l lVar = l.this;
                jb4.b bVarB = cVar.b(new ib4.c.Params(error, false, new er.l() { // from class: sd2.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l.e.O(lVar, (ib4.c.b) obj2);
                    }
                }, 2, null));
                l lVar2 = l.this;
                jb4.b bVar = bVarB;
                sd2.a.InterfaceC4647a.Error error2 = new sd2.a.InterfaceC4647a.Error(bVar);
                this.f180456h = vq.j.a(onError);
                this.f180453e = vq.j.a(bVar);
                this.f180454f = 0;
                this.f180455g = 1;
                if (lVar2.F(error2, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sd2.a.OnError onError, State state, tq.e<? super i0> eVar) {
            e eVar2 = l.this.new e(eVar);
            eVar2.f180456h = onError;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsd2/a$b;", "<unused var>", "Lsd2/b;", "Loq/i0;", "<anonymous>", "(Lsd2/a$b;Lsd2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sd2.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180458e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f180458e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                sd2.a.InterfaceC4647a.C4648a c4648a = sd2.a.InterfaceC4647a.C4648a.f180385a;
                this.f180458e = 1;
                if (lVar.F(c4648a, this) == objE) {
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
        public final Object w(sd2.a.b bVar, State state, tq.e<? super i0> eVar) {
            return l.this.new f(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, td2.d dVar, j14.b bVar, vl0.a aVar2, ib4.c cVar) {
        this.mapper = dVar;
        this.checkIdCardSeriesAndNumberUC = bVar;
        this.verifyIdSeriesAndNumberUC = aVar2;
        this.errorMapper = cVar;
        State state = new State(null, null, false, 7, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: sd2.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.s9(this.f180414a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sd2.c.Data p9(State state) {
        return this.mapper.b(new td2.d.Params(state, new er.l() { // from class: sd2.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.q9(this.f180416a, (b0) obj);
            }
        }, b9(sd2.a.f.f180393a), b9(sd2.a.b.f180388a), b9(sd2.a.e.f180392a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(l lVar, b0 b0Var) {
        lVar.d9(new sd2.a.OnFieldChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: sd2.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.t9(this.f180415a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(l lVar, z zVar) {
        b bVar = new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(sd2.a.OnFieldChanged.class), oVar, bVar);
        zVar.v(q0.c(sd2.a.f.class), oVar, new c(null));
        zVar.v(q0.c(sd2.a.e.class), oVar, lVar.new d(null));
        zVar.x(q0.c(sd2.a.OnError.class), oVar, lVar.new e(null));
        zVar.x(q0.c(sd2.a.b.class), oVar, lVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<sd2.a.InterfaceC4647a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, sd2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<sd2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(sd2.a.InterfaceC4647a interfaceC4647a, tq.e<? super i0> eVar) {
        return super.F(interfaceC4647a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
