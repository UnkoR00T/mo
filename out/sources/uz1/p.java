package uz1;

import fr.q0;
import gz1.PersonalData;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R&\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030+8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00107\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Luz1/p;", "Ll00/g;", "Luz1/c;", "Luz1/a;", "Luz1/d;", "", "Lhz1/a;", "electoralSupportContainersInteractor", "Lvz1/a;", "mapper", "Lib4/c;", "genericErrorMapper", "Lhb4/d;", "errorVMSFactory", "Luz1/b;", "setupData", "Lyy/a;", "stateMachineFactory", "<init>", "(Lhz1/a;Lvz1/a;Lib4/c;Lhb4/d;Luz1/b;Lyy/a;)V", "state", "Luz1/d$a;", "t9", "(Luz1/c;)Luz1/d$a;", "Ldx/b;", "domainError", "Lhb4/c;", "r9", "(Ldx/b;)Lhb4/c;", "b", "Lhz1/a;", "c", "Lvz1/a;", "d", "Lib4/c;", "e", "Lhb4/d;", "f", "Luz1/b;", "Luz1/c$b;", "g", "Luz1/c$b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Luz1/a$b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<uz1.c, uz1.a> implements uz1.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz1.a electoralSupportContainersInteractor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vz1.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final uz1.c.b initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<uz1.c, uz1.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<uz1.a.b> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<uz1.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<uz1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f202428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f202429b;

        /* JADX INFO: renamed from: uz1.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5267a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f202430a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f202431b;

            /* JADX INFO: renamed from: uz1.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5268a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f202432d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f202433e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f202434f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f202436h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f202437j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f202438k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f202439l;

                public C5268a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f202432d = obj;
                    this.f202433e |= PKIFailureInfo.systemUnavail;
                    return C5267a.this.F(null, this);
                }
            }

            public C5267a(mu.h hVar, p pVar) {
                this.f202430a = hVar;
                this.f202431b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5268a c5268a;
                if (eVar instanceof C5268a) {
                    c5268a = (C5268a) eVar;
                    int i15 = c5268a.f202433e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5268a.f202433e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5268a = new C5268a(eVar);
                    }
                } else {
                    c5268a = new C5268a(eVar);
                }
                Object obj2 = c5268a.f202432d;
                Object objE = uq.b.e();
                int i16 = c5268a.f202433e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f202430a;
                    uz1.d.a aVarT9 = this.f202431b.t9((uz1.c) obj);
                    c5268a.f202434f = vq.j.a(obj);
                    c5268a.f202436h = vq.j.a(c5268a);
                    c5268a.f202437j = vq.j.a(obj);
                    c5268a.f202438k = vq.j.a(hVar);
                    c5268a.f202439l = 0;
                    c5268a.f202433e = 1;
                    if (hVar.F(aVarT9, c5268a) == objE) {
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
            this.f202428a = gVar;
            this.f202429b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super uz1.d.a> hVar, tq.e eVar) {
            Object objA = this.f202428a.a(new C5267a(hVar, this.f202429b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luz1/a$b;", "action", "Luz1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Luz1/a$b;Luz1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<uz1.a.b, uz1.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f202440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f202441f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uz1.a.b bVar = (uz1.a.b) this.f202441f;
            Object objE = uq.b.e();
            int i15 = this.f202440e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                this.f202441f = vq.j.a(bVar);
                this.f202440e = 1;
                if (pVar.F(bVar, this) == objE) {
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
        public final Object w(uz1.a.b bVar, uz1.c cVar, tq.e<? super i0> eVar) {
            b bVar2 = p.this.new b(eVar);
            bVar2.f202441f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luz1/c$b;", "state", "Lk10/l;", "Luz1/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<uz1.c.b>, tq.e<? super k10.l<? extends uz1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f202443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f202444f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uz1.c.Initialized V(PersonalData personalData, p pVar, uz1.c.b bVar) {
            return new uz1.c.Initialized(personalData, pVar.setupData.getAvailableElectionSupport(), pVar.setupData.getCommitteeData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uz1.c.Error X(p pVar, uz1.c.b bVar) {
            return new uz1.c.Error(pVar.r9(new dx.b.Generic(new Exception("Failed to get personal data"))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f202444f;
            Object objE = uq.b.e();
            int i15 = this.f202443e;
            if (i15 == 0) {
                oq.u.b(obj);
                hz1.a aVar = p.this.electoralSupportContainersInteractor;
                this.f202444f = c0Var;
                this.f202443e = 1;
                obj = aVar.c(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final PersonalData personalData = (PersonalData) ((dx.i) obj).a();
            if (personalData != null) {
                final p pVar = p.this;
                k10.l lVarD = c0Var.d(new er.l() { // from class: uz1.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.c.V(personalData, pVar, (c.b) obj2);
                    }
                });
                if (lVarD != null) {
                    return lVarD;
                }
            }
            final p pVar2 = p.this;
            return c0Var.d(new er.l() { // from class: uz1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.X(pVar2, (c.b) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<uz1.c.b> c0Var, tq.e<? super k10.l<? extends uz1.c>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f202444f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luz1/a$a;", "<unused var>", "Luz1/c$a;", "Loq/i0;", "<anonymous>", "(Luz1/a$a;Luz1/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<uz1.a.C5262a, uz1.c.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f202446e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f202446e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(uz1.a.b.C5264b.f202386a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uz1.a.C5262a c5262a, uz1.c.Error error, tq.e<? super i0> eVar) {
            return p.this.new d(eVar).J(i0.f148189a);
        }
    }

    public p(hz1.a aVar, vz1.a aVar2, ib4.c cVar, hb4.d dVar, SetupData setupData, yy.a aVar3) {
        this.electoralSupportContainersInteractor = aVar;
        this.mapper = aVar2;
        this.genericErrorMapper = cVar;
        this.errorVMSFactory = dVar;
        this.setupData = setupData;
        uz1.c.b bVar = uz1.c.b.f202391a;
        this.initialState = bVar;
        this.stateMachine = aVar3.a(bVar, new er.l() { // from class: uz1.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.v9(this.f202418a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), t9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c r9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: uz1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.s9(this.f202417a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(p pVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary)) {
            pVar.d9(uz1.a.C5262a.f202384a);
        } else if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            pVar.d9(uz1.a.C5262a.f202384a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uz1.d.a t9(uz1.c state) {
        return this.mapper.b(new vz1.a.Params(state, b9(uz1.a.b.C5264b.f202386a), b9(uz1.a.b.C5263a.f202385a), b9(uz1.a.b.c.f202387a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final p pVar, v vVar) {
        vVar.c(q0.c(uz1.c.class), new er.l() { // from class: uz1.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f202414a, (z) obj);
            }
        });
        vVar.c(q0.c(uz1.c.b.class), new er.l() { // from class: uz1.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.x9(this.f202415a, (z) obj);
            }
        });
        vVar.c(q0.c(uz1.c.Error.class), new er.l() { // from class: uz1.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.y9(this.f202416a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        zVar.x(q0.c(uz1.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(p pVar, z zVar) {
        zVar.A(pVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(p pVar, z zVar) {
        d dVar = pVar.new d(null);
        zVar.x(q0.c(uz1.a.C5262a.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<uz1.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<uz1.c, uz1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<uz1.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(uz1.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
