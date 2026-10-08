package wu2;

import bu2.CompanyDetails;
import bu2.SummaryData;
import bu2.VerificationCheckData;
import bu2.VerifiedStatus;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lwu2/p;", "Ll00/g;", "Lwu2/c;", "Lwu2/a;", "Lwu2/d;", "", "Lzt2/q;", "peselRestrictionVerificationUseCase", "Lib4/c;", "genericDomainErrorHandler", "Lwu2/f;", "mapper", "Lyy/a;", "stateMachineFactory", "Lwu2/b;", "setupContract", "<init>", "(Lzt2/q;Lib4/c;Lwu2/f;Lyy/a;Lwu2/b;)V", "state", "Lwu2/d$a;", "p9", "(Lwu2/c;)Lwu2/d$a;", "b", "Lzt2/q;", "c", "Lib4/c;", "d", "Lwu2/f;", "e", "Lwu2/b;", "f", "Lwu2/c;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lwu2/a$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, wu2.a> implements wu2.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zt2.q peselRestrictionVerificationUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wu2.f mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wu2.b setupContract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, wu2.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wu2.a.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<wu2.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<wu2.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f215174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f215175b;

        /* JADX INFO: renamed from: wu2.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5715a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f215176a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f215177b;

            /* JADX INFO: renamed from: wu2.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5716a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f215178d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f215179e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f215180f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f215182h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f215183j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f215184k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f215185l;

                public C5716a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f215178d = obj;
                    this.f215179e |= PKIFailureInfo.systemUnavail;
                    return C5715a.this.F(null, this);
                }
            }

            public C5715a(mu.h hVar, p pVar) {
                this.f215176a = hVar;
                this.f215177b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5716a c5716a;
                if (eVar instanceof C5716a) {
                    c5716a = (C5716a) eVar;
                    int i15 = c5716a.f215179e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5716a.f215179e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5716a = new C5716a(eVar);
                    }
                } else {
                    c5716a = new C5716a(eVar);
                }
                Object obj2 = c5716a.f215178d;
                Object objE = uq.b.e();
                int i16 = c5716a.f215179e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f215176a;
                    wu2.d.Data dataP9 = this.f215177b.p9((State) obj);
                    c5716a.f215180f = vq.j.a(obj);
                    c5716a.f215182h = vq.j.a(c5716a);
                    c5716a.f215183j = vq.j.a(obj);
                    c5716a.f215184k = vq.j.a(hVar);
                    c5716a.f215185l = 0;
                    c5716a.f215179e = 1;
                    if (hVar.F(dataP9, c5716a) == objE) {
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
            this.f215174a = gVar;
            this.f215175b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super wu2.d.Data> hVar, tq.e eVar) {
            Object objA = this.f215174a.a(new C5715a(hVar, this.f215175b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwu2/a$a;", "<unused var>", "Lwu2/c;", "Loq/i0;", "<anonymous>", "(Lwu2/a$a;Lwu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<wu2.a.C5712a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215186e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215186e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wu2.a.c> bVarY1 = p.this.Y1();
                wu2.a.c.C5713a c5713a = wu2.a.c.C5713a.f215123a;
                this.f215186e = 1;
                if (bVarY1.F(c5713a, this) == objE) {
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
        public final Object w(wu2.a.C5712a c5712a, State state, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lwu2/c;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f215188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f215189f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f215190g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f215191h;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SummaryData summaryData, State state) {
            return new State(summaryData, false, null, 4, null);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0066  */
        /* JADX WARN: Code duplicated, block: B:25:0x0089  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            CompanyDetails companyDetails;
            VerificationCheckData verificationCheckData;
            Object objB;
            VerificationCheckData verificationCheckData2;
            c0 c0Var = (c0) this.f215191h;
            Object objE = uq.b.e();
            int i15 = this.f215190g;
            if (i15 == 0) {
                oq.u.b(obj);
                wu2.b bVar = p.this.setupContract;
                this.f215191h = c0Var;
                this.f215190g = 1;
                obj = bVar.a(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 == 2) {
                    companyDetails = (CompanyDetails) this.f215188e;
                    oq.u.b(obj);
                    verificationCheckData = (VerificationCheckData) obj;
                    if (verificationCheckData == null) {
                        verificationCheckData = ((State) c0Var.a()).getSummaryData().getVerificationCheckData();
                    }
                    wu2.b bVar2 = p.this.setupContract;
                    this.f215191h = c0Var;
                    this.f215188e = companyDetails;
                    this.f215189f = verificationCheckData;
                    this.f215190g = 3;
                    objB = bVar2.b(this);
                    if (objB != objE) {
                        verificationCheckData2 = verificationCheckData;
                        obj = objB;
                    }
                    return objE;
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                verificationCheckData2 = (VerificationCheckData) this.f215189f;
                companyDetails = (CompanyDetails) this.f215188e;
                oq.u.b(obj);
            }
            final SummaryData summaryData = new SummaryData(companyDetails, verificationCheckData2, (VerifiedStatus) obj);
            return c0Var.d(new er.l() { // from class: wu2.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O(summaryData, (State) obj2);
                }
            });
            CompanyDetails companyDetails2 = (CompanyDetails) obj;
            wu2.b bVar3 = p.this.setupContract;
            this.f215191h = c0Var;
            this.f215188e = companyDetails2;
            this.f215190g = 2;
            Object objS = bVar3.s(this);
            if (objS != objE) {
                companyDetails = companyDetails2;
                obj = objS;
                verificationCheckData = (VerificationCheckData) obj;
                if (verificationCheckData == null) {
                    verificationCheckData = ((State) c0Var.a()).getSummaryData().getVerificationCheckData();
                }
                wu2.b bVar4 = p.this.setupContract;
                this.f215191h = c0Var;
                this.f215188e = companyDetails;
                this.f215189f = verificationCheckData;
                this.f215190g = 3;
                objB = bVar4.b(this);
                if (objB != objE) {
                    verificationCheckData2 = verificationCheckData;
                    obj = objB;
                    final SummaryData summaryData2 = new SummaryData(companyDetails, verificationCheckData2, (VerifiedStatus) obj);
                    return c0Var.d(new er.l() { // from class: wu2.q
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.c.O(summaryData2, (State) obj2);
                        }
                    });
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f215191h = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwu2/a$b;", "action", "Lk10/c0;", "Lwu2/c;", "state", "Lk10/l;", "<anonymous>", "(Lwu2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<wu2.a.CheckBoxClicked, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215193e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215194f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f215195g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(wu2.a.CheckBoxClicked checkBoxClicked, State state) {
            return State.b(state, null, checkBoxClicked.getChecked(), hz.b.d.f86848c, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final wu2.a.CheckBoxClicked checkBoxClicked = (wu2.a.CheckBoxClicked) this.f215194f;
            c0 c0Var = (c0) this.f215195g;
            uq.b.e();
            if (this.f215193e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: wu2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(checkBoxClicked, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wu2.a.CheckBoxClicked checkBoxClicked, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f215194f = checkBoxClicked;
            dVar.f215195g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwu2/a$h;", "<unused var>", "Lk10/c0;", "Lwu2/c;", "state", "Lk10/l;", "<anonymous>", "(Lwu2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<wu2.a.h, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215197f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, false, new hz.b.Invalid(null, 1, null), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f215197f;
            uq.b.e();
            if (this.f215196e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (!((State) c0Var.a()).getResponsibilityAccepted()) {
                return c0Var.b(new er.l() { // from class: wu2.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.e.O((State) obj2);
                    }
                });
            }
            p.this.d9(wu2.a.d.f215129a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wu2.a.h hVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f215197f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwu2/a$d;", "<unused var>", "Lwu2/c;", "state", "Loq/i0;", "<anonymous>", "(Lwu2/a$d;Lwu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<wu2.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f215199e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f215200f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f215201g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f215202h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f215203j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f215204k;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p pVar, ib4.c.b bVar) {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary)) {
                if (!(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    throw new oq.p();
                }
                pVar.d9(wu2.a.d.f215129a);
            }
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
        
            if (r3.F(r5, r14) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00de, code lost:
        
            if (r2.F(r5, r14) == r1) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wu2.p.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wu2.a.d dVar, State state, tq.e<? super i0> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f215204k = state;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwu2/a$e;", "<unused var>", "Lwu2/c;", "Loq/i0;", "<anonymous>", "(Lwu2/a$e;Lwu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<wu2.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215206e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215206e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wu2.a.c> bVarY1 = p.this.Y1();
                wu2.a.c.b bVar = wu2.a.c.b.f215124a;
                this.f215206e = 1;
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
        public final Object w(wu2.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return p.this.new g(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwu2/a$g;", "<unused var>", "Lwu2/c;", "Loq/i0;", "<anonymous>", "(Lwu2/a$g;Lwu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<wu2.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215208e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215208e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wu2.a.c> bVarY1 = p.this.Y1();
                wu2.a.c.f fVar = wu2.a.c.f.f215128a;
                this.f215208e = 1;
                if (bVarY1.F(fVar, this) == objE) {
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
        public final Object w(wu2.a.g gVar, State state, tq.e<? super i0> eVar) {
            return p.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwu2/a$f;", "<unused var>", "Lwu2/c;", "Loq/i0;", "<anonymous>", "(Lwu2/a$f;Lwu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<wu2.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215210e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215210e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wu2.a.c> bVarY1 = p.this.Y1();
                wu2.a.c.e eVar = wu2.a.c.e.f215127a;
                this.f215210e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(wu2.a.f fVar, State state, tq.e<? super i0> eVar) {
            return p.this.new i(eVar).J(i0.f148189a);
        }
    }

    public p(zt2.q qVar, ib4.c cVar, wu2.f fVar, yy.a aVar, wu2.b bVar) {
        this.peselRestrictionVerificationUseCase = qVar;
        this.genericDomainErrorHandler = cVar;
        this.mapper = fVar;
        this.setupContract = bVar;
        State state = new State(SummaryData.INSTANCE.a(), false, null, 4, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: wu2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.s9(this.f215165a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wu2.d.Data p9(State state) {
        return this.mapper.b(new wu2.f.Params(state, b9(wu2.a.e.f215130a), b9(wu2.a.g.f215132a), b9(wu2.a.f.f215131a), b9(wu2.a.h.f215133a), new er.l() { // from class: wu2.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f215162a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(p pVar, boolean z15) {
        pVar.d9(new wu2.a.CheckBoxClicked(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: wu2.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(this.f215163a, (z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: wu2.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.u9(this.f215164a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        zVar.x(q0.c(wu2.a.C5712a.class), k10.o.CANCEL_PREVIOUS, bVar);
        zVar.A(pVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(p pVar, z zVar) {
        d dVar = new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(wu2.a.CheckBoxClicked.class), oVar, dVar);
        zVar.v(q0.c(wu2.a.h.class), oVar, pVar.new e(null));
        zVar.x(q0.c(wu2.a.d.class), oVar, pVar.new f(null));
        zVar.x(q0.c(wu2.a.e.class), oVar, pVar.new g(null));
        zVar.x(q0.c(wu2.a.g.class), oVar, pVar.new h(null));
        zVar.x(q0.c(wu2.a.f.class), oVar, pVar.new i(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<wu2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, wu2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<wu2.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(wu2.b bVar) {
        super.P5(bVar);
    }
}
