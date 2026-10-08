package sw2;

import al0.ApplicantDataModel;
import al0.ApplicantDataResultData;
import fr.q0;
import java.util.Iterator;
import java.util.Map;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00014B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lsw2/s;", "Ll00/g;", "Lsw2/c;", "Lsw2/a;", "Lsw2/d;", "", "Lyy/a;", "stateMachineFactory", "Luw2/b;", "mapper", "Lg14/a;", "getInfoFromPeselUC", "Lqv2/b;", "validateChildDataUseCase", "Lsw2/b;", "setupData", "<init>", "(Lyy/a;Luw2/b;Lg14/a;Lqv2/b;Lsw2/b;)V", "state", "Lsw2/d$a;", "t9", "(Lsw2/c;)Lsw2/d$a;", "b", "Luw2/b;", "c", "Lg14/a;", "d", "Lqv2/b;", "e", "Lsw2/b;", "f", "Lsw2/c;", "initialState", "Lxw/b;", "Lsw2/a$a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "k", "a", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<State, sw2.a> implements sw2.d, zx.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f185029k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f185030l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uw2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g14.a getInfoFromPeselUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final qv2.b validateChildDataUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sw2.a.InterfaceC4779a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, sw2.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<sw2.d.Data> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsw2/s$a;", "", "<init>", "()V", "", "POLISH_CITIZENSHIP", "Ljava/lang/String;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<xw.g, i0> {
        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(xw.g gVar) {
            c(gVar.getValue());
            return i0.f148189a;
        }

        public final void c(iy.b0 b0Var) {
            s.this.d9(new sw2.a.OnPeselChanged(b0Var, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<sw2.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f185040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f185041b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f185042a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f185043b;

            /* JADX INFO: renamed from: sw2.s$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4781a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f185044d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f185045e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f185046f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f185048h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f185049j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f185050k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f185051l;

                public C4781a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f185044d = obj;
                    this.f185045e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s sVar) {
                this.f185042a = hVar;
                this.f185043b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4781a c4781a;
                if (eVar instanceof C4781a) {
                    c4781a = (C4781a) eVar;
                    int i15 = c4781a.f185045e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4781a.f185045e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4781a = new C4781a(eVar);
                    }
                } else {
                    c4781a = new C4781a(eVar);
                }
                Object obj2 = c4781a.f185044d;
                Object objE = uq.b.e();
                int i16 = c4781a.f185045e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f185042a;
                    sw2.d.Data dataT9 = this.f185043b.t9((State) obj);
                    c4781a.f185046f = vq.j.a(obj);
                    c4781a.f185048h = vq.j.a(c4781a);
                    c4781a.f185049j = vq.j.a(obj);
                    c4781a.f185050k = vq.j.a(hVar);
                    c4781a.f185051l = 0;
                    c4781a.f185045e = 1;
                    if (hVar.F(dataT9, c4781a) == objE) {
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

        public c(mu.g gVar, s sVar) {
            this.f185040a = gVar;
            this.f185041b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super sw2.d.Data> hVar, tq.e eVar) {
            Object objA = this.f185040a.a(new a(hVar, this.f185041b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsw2/a$g;", "<unused var>", "Lk10/c0;", "Lsw2/c;", "state", "Lk10/l;", "<anonymous>", "(Lsw2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sw2.a.g, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185052e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f185053f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f185054g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f185055h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f185056j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f185057k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f185058l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f185059m;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Map map, State state) {
            Object next;
            State.Field<String> fieldF = state.f();
            Object objJ = v0.j(map, e0.FIRST_NAME);
            hz.b.Companion companion = hz.b.INSTANCE;
            State.Field fieldB = State.Field.b(fieldF, companion.a((hz.g) objJ), null, 2, null);
            State.Field fieldB2 = State.Field.b(state.j(), companion.a((hz.g) v0.j(map, e0.SECOND_NAME)), null, 2, null);
            State.Field fieldB3 = State.Field.b(state.g(), companion.a((hz.g) v0.j(map, e0.LAST_NAME)), null, 2, null);
            State.Field fieldB4 = State.Field.b(state.e(), companion.a((hz.g) v0.j(map, e0.FAMILY_NAME)), null, 2, null);
            State.Field fieldB5 = State.Field.b(state.h(), companion.a((hz.g) v0.j(map, e0.PESEL)), null, 2, null);
            State.Field fieldB6 = State.Field.b(state.c(), companion.a((hz.g) v0.j(map, e0.BIRTH_PLACE)), null, 2, null);
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Map.Entry) next).getValue() instanceof hz.g.Invalid));
            Map.Entry entry = (Map.Entry) next;
            return State.b(state, null, fieldB, fieldB2, fieldB3, fieldB4, fieldB5, fieldB6, entry != null ? (e0) entry.getKey() : null, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g14.a.b bVarA;
            Object objD;
            k10.c0 c0Var = (k10.c0) this.f185059m;
            Object objE = uq.b.e();
            int i15 = this.f185058l;
            if (i15 == 0) {
                oq.u.b(obj);
                bVarA = s.this.getInfoFromPeselUC.a(new g14.a.Params(((State) c0Var.a()).h().d().getValue(), null));
                qv2.b bVar = s.this.validateChildDataUseCase;
                qv2.b.Params params = new qv2.b.Params(s.this.setupData.getChildDataRequester(), ((State) c0Var.a()).f().d(), ((State) c0Var.a()).j().d(), ((State) c0Var.a()).g().d(), ((State) c0Var.a()).e().d(), ((State) c0Var.a()).h().d().getValue(), bVarA, ((State) c0Var.a()).c().d(), null);
                this.f185059m = c0Var;
                this.f185052e = bVarA;
                this.f185058l = 1;
                objD = bVar.d(params, this);
                if (objD != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f185054g;
                oq.u.b(obj);
                return lVar;
            }
            g14.a.b bVar2 = (g14.a.b) this.f185052e;
            oq.u.b(obj);
            bVarA = bVar2;
            objD = obj;
            s sVar = s.this;
            final Map map = (Map) objD;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() instanceof hz.g.Invalid) {
                        return c0Var.b(new er.l() { // from class: sw2.t
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return s.d.O(map, (State) obj2);
                            }
                        });
                    }
                }
            }
            k10.l lVarC = c0Var.c();
            tw2.a contract = sVar.setupData.getContract();
            String strD = ((State) c0Var.a()).f().d();
            String strD2 = ((State) c0Var.a()).j().d();
            g14.a.b.Success success = (g14.a.b.Success) bVarA;
            contract.w(new ApplicantDataResultData.BasicInfo(strD, fu.r.t0(strD2) ? null : strD2, ((State) c0Var.a()).g().d(), ((State) c0Var.a()).e().d(), ((State) c0Var.a()).h().d().getValue(), ((State) c0Var.a()).c().d(), success.getAge(), ApplicantDataModel.a.INSTANCE.a(success.getGender()), success.getBirthDate(), "Polskie", null));
            xw.b<sw2.a.InterfaceC4779a> bVarY1 = sVar.Y1();
            sw2.a.InterfaceC4779a.c cVar = sw2.a.InterfaceC4779a.c.f184956a;
            this.f185059m = vq.j.a(c0Var);
            this.f185052e = vq.j.a(bVarA);
            this.f185053f = vq.j.a(map);
            this.f185054g = lVarC;
            this.f185055h = vq.j.a(lVarC);
            this.f185056j = 0;
            this.f185057k = 0;
            this.f185058l = 2;
            return bVarY1.F(cVar, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sw2.a.g gVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = s.this.new d(eVar);
            dVar.f185059m = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsw2/a$b;", "<unused var>", "Lsw2/c;", "Loq/i0;", "<anonymous>", "(Lsw2/a$b;Lsw2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<sw2.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185061e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185061e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                sw2.a.InterfaceC4779a.C4780a c4780a = sw2.a.InterfaceC4779a.C4780a.f184954a;
                this.f185061e = 1;
                if (sVar.F(c4780a, this) == objE) {
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
        public final Object w(sw2.a.b bVar, State state, tq.e<? super i0> eVar) {
            return s.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsw2/a$k;", "<unused var>", "Lsw2/c;", "Loq/i0;", "<anonymous>", "(Lsw2/a$k;Lsw2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sw2.a.k, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185063e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185063e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                sw2.a.InterfaceC4779a.b bVar = sw2.a.InterfaceC4779a.b.f184955a;
                this.f185063e = 1;
                if (sVar.F(bVar, this) == objE) {
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
        public final Object w(sw2.a.k kVar, State state, tq.e<? super i0> eVar) {
            return s.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsw2/a$e;", "action", "Lk10/c0;", "Lsw2/c;", "state", "Lk10/l;", "<anonymous>", "(Lsw2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<sw2.a.OnFirstNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185066f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185067g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(sw2.a.OnFirstNameChanged onFirstNameChanged, State state) {
            return State.b(state, null, state.f().a(hz.b.d.f86848c, onFirstNameChanged.getFirstName()), null, null, null, null, null, null, 253, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sw2.a.OnFirstNameChanged onFirstNameChanged = (sw2.a.OnFirstNameChanged) this.f185066f;
            k10.c0 c0Var = (k10.c0) this.f185067g;
            uq.b.e();
            if (this.f185065e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sw2.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.g.O(onFirstNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sw2.a.OnFirstNameChanged onFirstNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f185066f = onFirstNameChanged;
            gVar.f185067g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsw2/a$j;", "action", "Lk10/c0;", "Lsw2/c;", "state", "Lk10/l;", "<anonymous>", "(Lsw2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sw2.a.OnSecondNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185070g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(sw2.a.OnSecondNameChanged onSecondNameChanged, State state) {
            return State.b(state, null, null, state.j().a(hz.b.d.f86848c, onSecondNameChanged.getSecondName()), null, null, null, null, null, 251, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sw2.a.OnSecondNameChanged onSecondNameChanged = (sw2.a.OnSecondNameChanged) this.f185069f;
            k10.c0 c0Var = (k10.c0) this.f185070g;
            uq.b.e();
            if (this.f185068e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sw2.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.h.O(onSecondNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sw2.a.OnSecondNameChanged onSecondNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f185069f = onSecondNameChanged;
            hVar.f185070g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsw2/a$f;", "action", "Lk10/c0;", "Lsw2/c;", "state", "Lk10/l;", "<anonymous>", "(Lsw2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<sw2.a.OnLastNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185073g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(sw2.a.OnLastNameChanged onLastNameChanged, State state) {
            return State.b(state, null, null, null, state.g().a(hz.b.d.f86848c, onLastNameChanged.getLastName()), null, null, null, null, 247, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sw2.a.OnLastNameChanged onLastNameChanged = (sw2.a.OnLastNameChanged) this.f185072f;
            k10.c0 c0Var = (k10.c0) this.f185073g;
            uq.b.e();
            if (this.f185071e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sw2.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.i.O(onLastNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sw2.a.OnLastNameChanged onLastNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f185072f = onLastNameChanged;
            iVar.f185073g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsw2/a$d;", "action", "Lk10/c0;", "Lsw2/c;", "state", "Lk10/l;", "<anonymous>", "(Lsw2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sw2.a.OnFamilyNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185076g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(sw2.a.OnFamilyNameChanged onFamilyNameChanged, State state) {
            return State.b(state, null, null, null, null, state.e().a(hz.b.d.f86848c, onFamilyNameChanged.getFamilyName()), null, null, null, 239, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sw2.a.OnFamilyNameChanged onFamilyNameChanged = (sw2.a.OnFamilyNameChanged) this.f185075f;
            k10.c0 c0Var = (k10.c0) this.f185076g;
            uq.b.e();
            if (this.f185074e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sw2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.j.O(onFamilyNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sw2.a.OnFamilyNameChanged onFamilyNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = new j(eVar);
            jVar.f185075f = onFamilyNameChanged;
            jVar.f185076g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsw2/a$h;", "action", "Lk10/c0;", "Lsw2/c;", "state", "Lk10/l;", "<anonymous>", "(Lsw2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<sw2.a.OnPeselChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185078f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185079g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(sw2.a.OnPeselChanged onPeselChanged, State state) {
            return State.b(state, null, null, null, null, null, state.h().a(hz.b.d.f86848c, xw.g.b(onPeselChanged.getPesel())), null, null, 223, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sw2.a.OnPeselChanged onPeselChanged = (sw2.a.OnPeselChanged) this.f185078f;
            k10.c0 c0Var = (k10.c0) this.f185079g;
            uq.b.e();
            if (this.f185077e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sw2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.k.O(onPeselChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sw2.a.OnPeselChanged onPeselChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = new k(eVar);
            kVar.f185078f = onPeselChanged;
            kVar.f185079g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsw2/a$c;", "action", "Lk10/c0;", "Lsw2/c;", "state", "Lk10/l;", "<anonymous>", "(Lsw2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<sw2.a.OnBirthPlaceChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185082g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(sw2.a.OnBirthPlaceChanged onBirthPlaceChanged, State state) {
            return State.b(state, null, null, null, null, null, null, state.c().a(hz.b.d.f86848c, onBirthPlaceChanged.getBirthPlace()), null, 191, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sw2.a.OnBirthPlaceChanged onBirthPlaceChanged = (sw2.a.OnBirthPlaceChanged) this.f185081f;
            k10.c0 c0Var = (k10.c0) this.f185082g;
            uq.b.e();
            if (this.f185080e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sw2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.l.O(onBirthPlaceChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sw2.a.OnBirthPlaceChanged onBirthPlaceChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = new l(eVar);
            lVar.f185081f = onBirthPlaceChanged;
            lVar.f185082g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsw2/a$i;", "<unused var>", "Lk10/c0;", "Lsw2/c;", "state", "Lk10/l;", "<anonymous>", "(Lsw2/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<sw2.a.i, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185084f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, null, null, CertificateBody.profileType, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185084f;
            uq.b.e();
            if (this.f185083e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sw2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.m.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sw2.a.i iVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = new m(eVar);
            mVar.f185084f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, uw2.b bVar, g14.a aVar2, qv2.b bVar2, SetupData setupData) {
        this.mapper = bVar;
        this.getInfoFromPeselUC = aVar2;
        this.validateChildDataUseCase = bVar2;
        this.setupData = setupData;
        ApplicantDataResultData.BasicInfo basicInfoA = setupData.getContract().a();
        sw2.e childDataRequester = setupData.getChildDataRequester();
        String firstName = basicInfoA != null ? basicInfoA.getFirstName() : null;
        State.Field field = new State.Field(null, firstName == null ? "" : firstName, 1, null);
        String secondName = basicInfoA != null ? basicInfoA.getSecondName() : null;
        State.Field field2 = new State.Field(null, secondName == null ? "" : secondName, 1, null);
        String surname = basicInfoA != null ? basicInfoA.getSurname() : null;
        State.Field field3 = new State.Field(null, surname == null ? "" : surname, 1, null);
        String familyName = basicInfoA != null ? basicInfoA.getFamilyName() : null;
        State.Field field4 = new State.Field(null, familyName == null ? "" : familyName, 1, null);
        iy.b0 pesel = basicInfoA != null ? basicInfoA.getPesel() : null;
        xw.g gVarB = pesel != null ? xw.g.b(pesel) : null;
        iy.b0 value = gVarB != null ? gVarB.getValue() : null;
        State.Field field5 = new State.Field(null, xw.g.b(value == null ? xw.g.INSTANCE.a() : value), 1, null);
        String placeOfBirth = basicInfoA != null ? basicInfoA.getPlaceOfBirth() : null;
        State state = new State(childDataRequester, field, field2, field3, field4, field5, new State.Field(null, placeOfBirth == null ? "" : placeOfBirth, 1, null), null, 128, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: sw2.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.A9(this.f185028a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), t9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: sw2.l
            @Override // er.l
            public final Object b(Object obj) {
                return s.B9(this.f185022a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(s sVar, k10.z zVar) {
        e eVar = sVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sw2.a.b.class), oVar, eVar);
        zVar.x(q0.c(sw2.a.k.class), oVar, sVar.new f(null));
        zVar.v(q0.c(sw2.a.OnFirstNameChanged.class), oVar, new g(null));
        zVar.v(q0.c(sw2.a.OnSecondNameChanged.class), oVar, new h(null));
        zVar.v(q0.c(sw2.a.OnLastNameChanged.class), oVar, new i(null));
        zVar.v(q0.c(sw2.a.OnFamilyNameChanged.class), oVar, new j(null));
        zVar.v(q0.c(sw2.a.OnPeselChanged.class), oVar, new k(null));
        zVar.v(q0.c(sw2.a.OnBirthPlaceChanged.class), oVar, new l(null));
        zVar.v(q0.c(sw2.a.i.class), oVar, new m(null));
        zVar.v(q0.c(sw2.a.g.class), oVar, sVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sw2.d.Data t9(State state) {
        return this.mapper.b(new uw2.b.Params(state, new er.l() { // from class: sw2.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.u9(this.f185023a, (String) obj);
            }
        }, new er.l() { // from class: sw2.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.v9(this.f185024a, (String) obj);
            }
        }, new er.l() { // from class: sw2.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.w9(this.f185025a, (String) obj);
            }
        }, new er.l() { // from class: sw2.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.x9(this.f185026a, (String) obj);
            }
        }, new b(), new er.l() { // from class: sw2.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.y9(this.f185027a, (String) obj);
            }
        }, b9(sw2.a.i.f184965a), b9(sw2.a.g.f184962a), b9(sw2.a.b.f184957a), b9(sw2.a.k.f184967a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(s sVar, String str) {
        sVar.d9(new sw2.a.OnFirstNameChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(s sVar, String str) {
        sVar.d9(new sw2.a.OnSecondNameChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(s sVar, String str) {
        sVar.d9(new sw2.a.OnLastNameChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(s sVar, String str) {
        sVar.d9(new sw2.a.OnFamilyNameChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(s sVar, String str) {
        sVar.d9(new sw2.a.OnBirthPlaceChanged(str));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<sw2.a.InterfaceC4779a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, sw2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<sw2.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(sw2.a.InterfaceC4779a interfaceC4779a, tq.e<? super i0> eVar) {
        return super.F(interfaceC4779a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
