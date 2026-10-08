package nz1;

import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import un0.AvailableElectionSupport;
import un0.AvailableElectionSupports;
import un0.ElectionActionEligibility;
import un0.ElectionActionEligibilityProfileAccess;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BI\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lnz1/d0;", "Ll00/g;", "Lnz1/b;", "Lnz1/a;", "Lnz1/f;", "", "Loz1/f;", "electoralSupportMapper", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lvn0/b;", "getEligibilityUC", "Lvn0/a;", "getAvailableElectionSupportsUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lac4/o;", "openUrlIntentUseCase", "Lyy/a;", "stateMachineFactory", "<init>", "(Loz1/f;Lib4/c;Lhb4/d;Lvn0/b;Lvn0/a;Lac4/a;Lac4/o;Lyy/a;)V", "state", "Lnz1/f$a;", "z9", "(Lnz1/b;)Lnz1/f$a;", "Ldx/b;", "domainError", "retryAction", "Lhb4/c;", "x9", "(Ldx/b;Lnz1/a;)Lhb4/c;", "b", "Loz1/f;", "c", "Lib4/c;", "d", "Lhb4/d;", "e", "Lvn0/b;", "f", "Lvn0/a;", "g", "Lac4/a;", "h", "Lac4/o;", "Lnz1/e;", "j", "Lnz1/e;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lnz1/a$e;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 extends l00.g<nz1.b, nz1.a> implements nz1.f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oz1.f electoralSupportMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final vn0.b getEligibilityUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final vn0.a getAvailableElectionSupportsUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.o openUrlIntentUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final nz1.e initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<nz1.b, nz1.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<nz1.a.e> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<nz1.f.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<nz1.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f139759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f139760b;

        /* JADX INFO: renamed from: nz1.d0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3467a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f139761a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f139762b;

            /* JADX INFO: renamed from: nz1.d0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3468a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f139763d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f139764e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f139765f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f139767h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f139768j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f139769k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f139770l;

                public C3468a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f139763d = obj;
                    this.f139764e |= PKIFailureInfo.systemUnavail;
                    return C3467a.this.F(null, this);
                }
            }

            public C3467a(mu.h hVar, d0 d0Var) {
                this.f139761a = hVar;
                this.f139762b = d0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3468a c3468a;
                if (eVar instanceof C3468a) {
                    c3468a = (C3468a) eVar;
                    int i15 = c3468a.f139764e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3468a.f139764e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3468a = new C3468a(eVar);
                    }
                } else {
                    c3468a = new C3468a(eVar);
                }
                Object obj2 = c3468a.f139763d;
                Object objE = uq.b.e();
                int i16 = c3468a.f139764e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f139761a;
                    nz1.f.a aVarZ9 = this.f139762b.z9((nz1.b) obj);
                    c3468a.f139765f = vq.j.a(obj);
                    c3468a.f139767h = vq.j.a(c3468a);
                    c3468a.f139768j = vq.j.a(obj);
                    c3468a.f139769k = vq.j.a(hVar);
                    c3468a.f139770l = 0;
                    c3468a.f139764e = 1;
                    if (hVar.F(aVarZ9, c3468a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, d0 d0Var) {
            this.f139759a = gVar;
            this.f139760b = d0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super nz1.f.a> hVar, tq.e eVar) {
            Object objA = this.f139759a.a(new C3467a(hVar, this.f139760b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnz1/a$a;", "<unused var>", "Lnz1/b;", "Loq/i0;", "<anonymous>", "(Lnz1/a$a;Lnz1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<nz1.a.C3464a, nz1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139771e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139771e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                nz1.a.e.C3465a c3465a = nz1.a.e.C3465a.f139730a;
                this.f139771e = 1;
                if (d0Var.F(c3465a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nz1.a.C3464a c3464a, nz1.b bVar, tq.e<? super oq.i0> eVar) {
            return d0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lnz1/e;", "state", "Lk10/l;", "Lnz1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<nz1.e>, tq.e<? super k10.l<? extends nz1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139774f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lnz1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends nz1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f139776e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d0 f139777f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<nz1.e> f139778g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, k10.c0<nz1.e> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f139777f = d0Var;
                this.f139778g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error Z(d0 d0Var, dx.b bVar, nz1.e eVar) {
                return new Error(d0Var.x9(bVar, nz1.a.d.f139729a));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final nz1.b.C3466b a0(nz1.e eVar) {
                return nz1.b.C3466b.f139742a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error b0(d0 d0Var, nz1.e eVar) {
                return new Error(d0Var.x9(new dx.b.Generic(new Exception("ProfileAccess is null or jwtToken is empty, but it should not happen.")), nz1.a.d.f139729a));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final LoadingAvailableSupport c0(ElectionActionEligibility electionActionEligibility, nz1.e eVar) {
                ElectionActionEligibilityProfileAccess profileAccess = electionActionEligibility.getProfileAccess();
                if (profileAccess != null) {
                    return new LoadingAvailableSupport(profileAccess);
                }
                throw new IllegalStateException("ProfileAccess is null, but it should not happen.");
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f139776e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    vn0.b bVar = this.f139777f.getEligibilityUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f139776e = 1;
                    obj = bVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                k10.c0<nz1.e> c0Var = this.f139778g;
                final d0 d0Var = this.f139777f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: nz1.e0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.c.a.Z(d0Var, bVar2, (e) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final ElectionActionEligibility electionActionEligibility = (ElectionActionEligibility) ((dx.i.Right) iVar).b();
                if (!electionActionEligibility.getIsAdult()) {
                    return c0Var.d(new er.l() { // from class: nz1.f0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.c.a.a0((e) obj2);
                        }
                    });
                }
                if (electionActionEligibility.getProfileAccess() != null) {
                    ElectionActionEligibilityProfileAccess profileAccess = electionActionEligibility.getProfileAccess();
                    String jwtToken = profileAccess != null ? profileAccess.getJwtToken() : null;
                    if (jwtToken != null && jwtToken.length() != 0) {
                        return c0Var.d(new er.l() { // from class: nz1.h0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return d0.c.a.c0(electionActionEligibility, (e) obj2);
                            }
                        });
                    }
                }
                return c0Var.d(new er.l() { // from class: nz1.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.c.a.b0(d0Var, (e) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> X(tq.e<?> eVar) {
                return new a(this.f139777f, this.f139778g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends nz1.b>> eVar) {
                return ((a) X(eVar)).J(oq.i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f139774f;
            Object objE = uq.b.e();
            int i15 = this.f139773e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, c0Var, null);
            this.f139774f = vq.j.a(c0Var);
            this.f139773e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<nz1.e> c0Var, tq.e<? super k10.l<? extends nz1.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = d0.this.new c(eVar);
            cVar.f139774f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lnz1/d;", "state", "Lk10/l;", "Lnz1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<LoadingAvailableSupport>, tq.e<? super k10.l<? extends nz1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139780f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lnz1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends nz1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f139782e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d0 f139783f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<LoadingAvailableSupport> f139784g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, k10.c0<LoadingAvailableSupport> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f139783f = d0Var;
                this.f139784g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(d0 d0Var, dx.b bVar, k10.c0 c0Var, LoadingAvailableSupport loadingAvailableSupport) {
                return new Error(d0Var.x9(bVar, new nz1.a.ErrorGetAvailableSupportRetry(((LoadingAvailableSupport) c0Var.a()).getProfileAccess())));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final nz1.b.Displayed Y(k10.c0 c0Var, AvailableElectionSupports availableElectionSupports, LoadingAvailableSupport loadingAvailableSupport) {
                return new nz1.b.Displayed(((LoadingAvailableSupport) c0Var.a()).getProfileAccess(), availableElectionSupports);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f139782e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    vn0.a aVar = this.f139783f.getAvailableElectionSupportsUC;
                    vn0.a.Params params = new vn0.a.Params(this.f139784g.a().getProfileAccess().getJwtToken());
                    this.f139782e = 1;
                    obj = aVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                final k10.c0<LoadingAvailableSupport> c0Var = this.f139784g;
                final d0 d0Var = this.f139783f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: nz1.i0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.d.a.X(d0Var, bVar, c0Var, (LoadingAvailableSupport) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final AvailableElectionSupports availableElectionSupports = (AvailableElectionSupports) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: nz1.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.d.a.Y(c0Var, availableElectionSupports, (LoadingAvailableSupport) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f139783f, this.f139784g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends nz1.b>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f139780f;
            Object objE = uq.b.e();
            int i15 = this.f139779e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, c0Var, null);
            this.f139780f = vq.j.a(c0Var);
            this.f139779e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<LoadingAvailableSupport> c0Var, tq.e<? super k10.l<? extends nz1.b>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = d0.this.new d(eVar);
            dVar.f139780f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnz1/a$d;", "<unused var>", "Lk10/c0;", "Lnz1/c;", "state", "Lk10/l;", "Lnz1/b;", "<anonymous>", "(Lnz1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<nz1.a.d, k10.c0<Error>, tq.e<? super k10.l<? extends nz1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139786f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nz1.e O(Error error) {
            return nz1.e.f139804a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f139786f;
            uq.b.e();
            if (this.f139785e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: nz1.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.e.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nz1.a.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends nz1.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f139786f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnz1/a$c;", "action", "Lk10/c0;", "Lnz1/c;", "state", "Lk10/l;", "Lnz1/b;", "<anonymous>", "(Lnz1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<nz1.a.ErrorGetAvailableSupportRetry, k10.c0<Error>, tq.e<? super k10.l<? extends nz1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f139789g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LoadingAvailableSupport O(nz1.a.ErrorGetAvailableSupportRetry errorGetAvailableSupportRetry, Error error) {
            return new LoadingAvailableSupport(errorGetAvailableSupportRetry.getProfileAccess());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final nz1.a.ErrorGetAvailableSupportRetry errorGetAvailableSupportRetry = (nz1.a.ErrorGetAvailableSupportRetry) this.f139788f;
            k10.c0 c0Var = (k10.c0) this.f139789g;
            uq.b.e();
            if (this.f139787e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: nz1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.f.O(errorGetAvailableSupportRetry, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nz1.a.ErrorGetAvailableSupportRetry errorGetAvailableSupportRetry, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends nz1.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f139788f = errorGetAvailableSupportRetry;
            fVar.f139789g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnz1/a$b;", "<unused var>", "Lnz1/c;", "Loq/i0;", "<anonymous>", "(Lnz1/a$b;Lnz1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<nz1.a.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139790e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f139790e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(nz1.a.C3464a.f139726a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nz1.a.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return d0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnz1/a$f;", "action", "Lnz1/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lnz1/a$f;Lnz1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<nz1.a.OnElectionSupportClick, nz1.b.Displayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f139794g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nz1.a.OnElectionSupportClick onElectionSupportClick = (nz1.a.OnElectionSupportClick) this.f139793f;
            nz1.b.Displayed displayed = (nz1.b.Displayed) this.f139794g;
            Object objE = uq.b.e();
            int i15 = this.f139792e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                nz1.a.e.OnElectionSupportClick onElectionSupportClick2 = new nz1.a.e.OnElectionSupportClick(onElectionSupportClick.getElectionSupport(), displayed.getProfileAccess().getTrustedProfileStatus());
                this.f139793f = vq.j.a(onElectionSupportClick);
                this.f139794g = vq.j.a(displayed);
                this.f139792e = 1;
                if (d0Var.F(onElectionSupportClick2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nz1.a.OnElectionSupportClick onElectionSupportClick, nz1.b.Displayed displayed, tq.e<? super oq.i0> eVar) {
            h hVar = d0.this.new h(eVar);
            hVar.f139793f = onElectionSupportClick;
            hVar.f139794g = displayed;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnz1/a$g;", "<unused var>", "Lnz1/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lnz1/a$g;Lnz1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<nz1.a.g, nz1.b.Displayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139797f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nz1.b.Displayed displayed = (nz1.b.Displayed) this.f139797f;
            Object objE = uq.b.e();
            int i15 = this.f139796e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                nz1.a.e.OnHistoryOfSupportClick onHistoryOfSupportClick = new nz1.a.e.OnHistoryOfSupportClick(displayed.getProfileAccess().getJwtToken());
                this.f139797f = vq.j.a(displayed);
                this.f139796e = 1;
                if (d0Var.F(onHistoryOfSupportClick, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nz1.a.g gVar, nz1.b.Displayed displayed, tq.e<? super oq.i0> eVar) {
            i iVar = d0.this.new i(eVar);
            iVar.f139797f = displayed;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnz1/a$h;", "<unused var>", "Lnz1/b$a;", "Loq/i0;", "<anonymous>", "(Lnz1/a$h;Lnz1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<nz1.a.h, nz1.b.Displayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139799e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f139799e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                nz1.a.e.d dVar = nz1.a.e.d.f139734a;
                this.f139799e = 1;
                if (d0Var.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nz1.a.h hVar, nz1.b.Displayed displayed, tq.e<? super oq.i0> eVar) {
            return d0.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnz1/a$i;", "action", "Lnz1/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnz1/a$i;Lnz1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<nz1.a.OpenUrl, nz1.b.Displayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f139802f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nz1.a.OpenUrl openUrl = (nz1.a.OpenUrl) this.f139802f;
            Object objE = uq.b.e();
            int i15 = this.f139801e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.o oVar = d0.this.openUrlIntentUseCase;
                ac4.o.Params params = new ac4.o.Params(openUrl.getUrl(), false, 2, null);
                this.f139802f = vq.j.a(openUrl);
                this.f139801e = 1;
                if (oVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nz1.a.OpenUrl openUrl, nz1.b.Displayed displayed, tq.e<? super oq.i0> eVar) {
            k kVar = d0.this.new k(eVar);
            kVar.f139802f = openUrl;
            return kVar.J(oq.i0.f148189a);
        }
    }

    public d0(oz1.f fVar, ib4.c cVar, hb4.d dVar, vn0.b bVar, vn0.a aVar, ac4.a aVar2, ac4.o oVar, yy.a aVar3) {
        this.electoralSupportMapper = fVar;
        this.genericDomainErrorMapper = cVar;
        this.errorVMSFactory = dVar;
        this.getEligibilityUC = bVar;
        this.getAvailableElectionSupportsUC = aVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.openUrlIntentUseCase = oVar;
        nz1.e eVar = nz1.e.f139804a;
        this.initialState = eVar;
        this.stateMachine = aVar3.a(eVar, new er.l() { // from class: nz1.u
            @Override // er.l
            public final Object b(Object obj) {
                return d0.D9(this.f139850a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), z9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(d0 d0Var, AvailableElectionSupport availableElectionSupport) {
        d0Var.d9(new nz1.a.OnElectionSupportClick(availableElectionSupport));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(d0 d0Var, String str) {
        d0Var.d9(new nz1.a.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(final d0 d0Var, k10.v vVar) {
        vVar.c(q0.c(nz1.b.class), new er.l() { // from class: nz1.v
            @Override // er.l
            public final Object b(Object obj) {
                return d0.E9(this.f139851a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(nz1.e.class), new er.l() { // from class: nz1.w
            @Override // er.l
            public final Object b(Object obj) {
                return d0.F9(this.f139852a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(LoadingAvailableSupport.class), new er.l() { // from class: nz1.x
            @Override // er.l
            public final Object b(Object obj) {
                return d0.G9(this.f139853a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: nz1.y
            @Override // er.l
            public final Object b(Object obj) {
                return d0.H9(this.f139854a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(nz1.b.Displayed.class), new er.l() { // from class: nz1.z
            @Override // er.l
            public final Object b(Object obj) {
                return d0.I9(this.f139855a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(d0 d0Var, k10.z zVar) {
        b bVar = d0Var.new b(null);
        zVar.x(q0.c(nz1.a.C3464a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(d0 d0Var, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(nz1.a.d.class), oVar, eVar);
        zVar.v(q0.c(nz1.a.ErrorGetAvailableSupportRetry.class), oVar, new f(null));
        zVar.x(q0.c(nz1.a.b.class), oVar, d0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(d0 d0Var, k10.z zVar) {
        h hVar = d0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(nz1.a.OnElectionSupportClick.class), oVar, hVar);
        zVar.x(q0.c(nz1.a.g.class), oVar, d0Var.new i(null));
        zVar.x(q0.c(nz1.a.h.class), oVar, d0Var.new j(null));
        zVar.x(q0.c(nz1.a.OpenUrl.class), oVar, d0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c x9(dx.b domainError, final nz1.a retryAction) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: nz1.c0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.y9(this.f139745a, retryAction, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(d0 d0Var, nz1.a aVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            d0Var.d9(aVar);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            d0Var.d9(nz1.a.b.f139727a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nz1.f.a z9(nz1.b state) {
        return this.electoralSupportMapper.b(new oz1.f.Params(state, b9(nz1.a.C3464a.f139726a), new er.l() { // from class: nz1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.A9(this.f139739a, (AvailableElectionSupport) obj);
            }
        }, b9(nz1.a.g.f139736a), b9(nz1.a.h.f139737a), new er.l() { // from class: nz1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.B9(this.f139743a, (String) obj);
            }
        }));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<nz1.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<nz1.b, nz1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<nz1.f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(nz1.a.e eVar, tq.e<? super oq.i0> eVar2) {
        return super.F(eVar, eVar2);
    }
}
