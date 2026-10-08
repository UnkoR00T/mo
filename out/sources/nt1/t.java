package nt1;

import al0.BanksRestriction;
import al0.DocumentRestrictions;
import al0.MObywatelRestriction;
import dl0.BEBankRestrictionDrivingLicence;
import dl0.BEBankRestrictionDrivingLicenceResponseDrivingLicence;
import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lnt1/t;", "Ll00/g;", "Lnt1/d;", "Lnt1/a;", "Lnt1/e;", "", "Lyy/a;", "stateMachineFactory", "Lpl0/a;", "BEGetDrivingLicencesUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorHandler", "Lhb4/d;", "errorVMSFactory", "Lot1/a;", "mapper", "<init>", "(Lyy/a;Lpl0/a;Lac4/a;Lib4/c;Lhb4/d;Lot1/a;)V", "state", "Lnt1/e$a;", "t9", "(Lnt1/d;)Lnt1/e$a;", "Ldx/b;", "domainError", "Lhb4/c;", "r9", "(Ldx/b;)Lhb4/c;", "b", "Lpl0/a;", "c", "Lac4/a;", "d", "Lib4/c;", "e", "Lhb4/d;", "f", "Lot1/a;", "Lnt1/c;", "g", "Lnt1/c;", "initialState", "Lxw/b;", "Lnt1/a$b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<nt1.d, nt1.a> implements nt1.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pl0.a BEGetDrivingLicencesUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ot1.a mapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final nt1.c initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<nt1.a.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<nt1.d, nt1.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<nt1.e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<nt1.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f138362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f138363b;

        /* JADX INFO: renamed from: nt1.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3416a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f138364a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f138365b;

            /* JADX INFO: renamed from: nt1.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3417a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f138366d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f138367e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f138368f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f138370h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f138371j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f138372k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f138373l;

                public C3417a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f138366d = obj;
                    this.f138367e |= PKIFailureInfo.systemUnavail;
                    return C3416a.this.F(null, this);
                }
            }

            public C3416a(mu.h hVar, t tVar) {
                this.f138364a = hVar;
                this.f138365b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3417a c3417a;
                if (eVar instanceof C3417a) {
                    c3417a = (C3417a) eVar;
                    int i15 = c3417a.f138367e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3417a.f138367e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3417a = new C3417a(eVar);
                    }
                } else {
                    c3417a = new C3417a(eVar);
                }
                Object obj2 = c3417a.f138366d;
                Object objE = uq.b.e();
                int i16 = c3417a.f138367e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f138364a;
                    nt1.e.a aVarT9 = this.f138365b.t9((nt1.d) obj);
                    c3417a.f138368f = vq.j.a(obj);
                    c3417a.f138370h = vq.j.a(c3417a);
                    c3417a.f138371j = vq.j.a(obj);
                    c3417a.f138372k = vq.j.a(hVar);
                    c3417a.f138373l = 0;
                    c3417a.f138367e = 1;
                    if (hVar.F(aVarT9, c3417a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f138362a = gVar;
            this.f138363b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super nt1.e.a> hVar, tq.e eVar) {
            Object objA = this.f138362a.a(new C3416a(hVar, this.f138363b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnt1/a$b;", "action", "Lnt1/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnt1/a$b;Lnt1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<nt1.a.b, nt1.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138375f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nt1.a.b bVar = (nt1.a.b) this.f138375f;
            Object objE = uq.b.e();
            int i15 = this.f138374e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nt1.a.b> bVarY1 = t.this.Y1();
                this.f138375f = vq.j.a(bVar);
                this.f138374e = 1;
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
        public final Object w(nt1.a.b bVar, nt1.d dVar, tq.e<? super i0> eVar) {
            b bVar2 = t.this.new b(eVar);
            bVar2.f138375f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lnt1/c;", "state", "Lk10/l;", "Lnt1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<nt1.c>, tq.e<? super k10.l<? extends nt1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138378f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lnt1/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends nt1.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f138380e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ t f138381f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<nt1.c> f138382g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, c0<nt1.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f138381f = tVar;
                this.f138382g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(t tVar, dx.b bVar, nt1.c cVar) {
                return new Error(tVar.r9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code duplicated, block: B:15:0x0029  */
            /* JADX WARN: Code duplicated, block: B:17:0x002f  */
            /* JADX WARN: Code duplicated, block: B:18:0x0034  */
            /* JADX WARN: Code duplicated, block: B:20:0x0037  */
            /* JADX WARN: Code duplicated, block: B:22:0x003d  */
            /* JADX WARN: Code duplicated, block: B:23:0x0042  */
            /* JADX WARN: Code duplicated, block: B:25:0x0045  */
            /* JADX WARN: Code duplicated, block: B:26:0x004b  */
            /* JADX WARN: Code duplicated, block: B:28:0x0051  */
            /* JADX WARN: Code duplicated, block: B:29:0x0056  */
            /* JADX WARN: Code duplicated, block: B:31:0x0059  */
            /* JADX WARN: Code duplicated, block: B:33:0x005f  */
            /* JADX WARN: Code duplicated, block: B:35:0x0065  */
            /* JADX WARN: Code duplicated, block: B:36:0x006b  */
            public static final nt1.d Y(BEBankRestrictionDrivingLicence bEBankRestrictionDrivingLicence, nt1.c cVar) {
                DocumentRestrictions restrictions;
                MObywatelRestriction mobywatelRestriction;
                DocumentRestrictions restrictions2;
                MObywatelRestriction mobywatelRestriction2;
                pt1.a none;
                DocumentRestrictions restrictions3;
                DocumentRestrictions restrictions4;
                BanksRestriction banksRestrictions;
                BEBankRestrictionDrivingLicenceResponseDrivingLicence drivingLicence = bEBankRestrictionDrivingLicence.getDrivingLicence();
                if (drivingLicence == null) {
                    return nt1.d.b.f138321a;
                }
                DocumentRestrictions restrictions5 = drivingLicence.getRestrictions();
                if ((restrictions5 != null ? restrictions5.getMobywatelRestriction() : null) == null) {
                    restrictions = drivingLicence.getRestrictions();
                    if (restrictions != null) {
                        mobywatelRestriction = restrictions.getMobywatelRestriction();
                    } else {
                        mobywatelRestriction = null;
                    }
                    if (mobywatelRestriction != null) {
                        restrictions2 = drivingLicence.getRestrictions();
                        if (restrictions2 != null) {
                            mobywatelRestriction2 = restrictions2.getMobywatelRestriction();
                        } else {
                            mobywatelRestriction2 = null;
                        }
                        if (mobywatelRestriction2 == null) {
                            none = new pt1.a.None(drivingLicence);
                        } else {
                            restrictions3 = drivingLicence.getRestrictions();
                            if ((restrictions3 != null ? restrictions3.getBanksRestrictions() : null) != null) {
                                none = new pt1.a.AppAndBank(drivingLicence);
                            } else {
                                none = new pt1.a.None(drivingLicence);
                            }
                        }
                    } else {
                        restrictions4 = drivingLicence.getRestrictions();
                        if (restrictions4 != null) {
                            banksRestrictions = restrictions4.getBanksRestrictions();
                        } else {
                            banksRestrictions = null;
                        }
                        if (banksRestrictions != null) {
                            none = new pt1.a.Bank(drivingLicence);
                        } else {
                            restrictions2 = drivingLicence.getRestrictions();
                            if (restrictions2 != null) {
                                mobywatelRestriction2 = restrictions2.getMobywatelRestriction();
                            } else {
                                mobywatelRestriction2 = null;
                            }
                            if (mobywatelRestriction2 == null) {
                                none = new pt1.a.None(drivingLicence);
                            } else {
                                restrictions3 = drivingLicence.getRestrictions();
                                if ((restrictions3 != null ? restrictions3.getBanksRestrictions() : null) != null) {
                                    none = new pt1.a.AppAndBank(drivingLicence);
                                } else {
                                    none = new pt1.a.None(drivingLicence);
                                }
                            }
                        }
                    }
                } else {
                    DocumentRestrictions restrictions6 = drivingLicence.getRestrictions();
                    if ((restrictions6 != null ? restrictions6.getBanksRestrictions() : null) == null) {
                        none = new pt1.a.App(drivingLicence);
                    } else {
                        restrictions = drivingLicence.getRestrictions();
                        if (restrictions != null) {
                            mobywatelRestriction = restrictions.getMobywatelRestriction();
                        } else {
                            mobywatelRestriction = null;
                        }
                        if (mobywatelRestriction != null) {
                            restrictions2 = drivingLicence.getRestrictions();
                            if (restrictions2 != null) {
                                mobywatelRestriction2 = restrictions2.getMobywatelRestriction();
                            } else {
                                mobywatelRestriction2 = null;
                            }
                            if (mobywatelRestriction2 == null) {
                                none = new pt1.a.None(drivingLicence);
                            } else {
                                restrictions3 = drivingLicence.getRestrictions();
                                if ((restrictions3 != null ? restrictions3.getBanksRestrictions() : null) != null) {
                                    none = new pt1.a.AppAndBank(drivingLicence);
                                } else {
                                    none = new pt1.a.None(drivingLicence);
                                }
                            }
                        } else {
                            restrictions4 = drivingLicence.getRestrictions();
                            if (restrictions4 != null) {
                                banksRestrictions = restrictions4.getBanksRestrictions();
                            } else {
                                banksRestrictions = null;
                            }
                            if (banksRestrictions != null) {
                                none = new pt1.a.Bank(drivingLicence);
                            } else {
                                restrictions2 = drivingLicence.getRestrictions();
                                if (restrictions2 != null) {
                                    mobywatelRestriction2 = restrictions2.getMobywatelRestriction();
                                } else {
                                    mobywatelRestriction2 = null;
                                }
                                if (mobywatelRestriction2 == null) {
                                    none = new pt1.a.None(drivingLicence);
                                } else {
                                    restrictions3 = drivingLicence.getRestrictions();
                                    if ((restrictions3 != null ? restrictions3.getBanksRestrictions() : null) != null) {
                                        none = new pt1.a.AppAndBank(drivingLicence);
                                    } else {
                                        none = new pt1.a.None(drivingLicence);
                                    }
                                }
                            }
                        }
                    }
                }
                return new nt1.d.Initialized(none);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f138380e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    pl0.a aVar = this.f138381f.BEGetDrivingLicencesUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f138380e = 1;
                    obj = aVar.c(c1792a, this);
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
                c0<nt1.c> c0Var = this.f138382g;
                final t tVar = this.f138381f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: nt1.u
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.c.a.X(tVar, bVar, (c) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BEBankRestrictionDrivingLicence bEBankRestrictionDrivingLicence = (BEBankRestrictionDrivingLicence) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: nt1.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.c.a.Y(bEBankRestrictionDrivingLicence, (c) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f138381f, this.f138382g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends nt1.d>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f138378f;
            Object objE = uq.b.e();
            int i15 = this.f138377e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = t.this.callActionWithLoaderUseCase;
            a aVar2 = new a(t.this, c0Var, null);
            this.f138378f = vq.j.a(c0Var);
            this.f138377e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<nt1.c> c0Var, tq.e<? super k10.l<? extends nt1.d>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = t.this.new c(eVar);
            cVar.f138378f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnt1/a$d;", "<unused var>", "Lk10/c0;", "Lnt1/b;", "state", "Lk10/l;", "Lnt1/d;", "<anonymous>", "(Lnt1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<nt1.a.d, c0<Error>, tq.e<? super k10.l<? extends nt1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138384f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nt1.c O(Error error) {
            return nt1.c.f138319a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f138384f;
            uq.b.e();
            if (this.f138383e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: nt1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nt1.a.d dVar, c0<Error> c0Var, tq.e<? super k10.l<? extends nt1.d>> eVar) {
            d dVar2 = new d(eVar);
            dVar2.f138384f = c0Var;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnt1/a$a;", "<unused var>", "Lnt1/b;", "Loq/i0;", "<anonymous>", "(Lnt1/a$a;Lnt1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<nt1.a.C3412a, Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138385e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f138385e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(nt1.a.b.C3413a.f138312a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nt1.a.C3412a c3412a, Error error, tq.e<? super i0> eVar) {
            return t.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnt1/a$c;", "<unused var>", "Lnt1/d$a;", "state", "Loq/i0;", "<anonymous>", "(Lnt1/a$c;Lnt1/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<nt1.a.c, nt1.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138388f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nt1.d.Initialized initialized = (nt1.d.Initialized) this.f138388f;
            Object objE = uq.b.e();
            int i15 = this.f138387e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nt1.a.b> bVarY1 = t.this.Y1();
                nt1.a.b.RestrictDrivingLicence restrictDrivingLicence = new nt1.a.b.RestrictDrivingLicence(initialized.getDrivingLicenceRestriction().getDrivingLicence());
                this.f138388f = vq.j.a(initialized);
                this.f138387e = 1;
                if (bVarY1.F(restrictDrivingLicence, this) == objE) {
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
        public final Object w(nt1.a.c cVar, nt1.d.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f138388f = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnt1/a$e;", "<unused var>", "Lnt1/d$a;", "state", "Loq/i0;", "<anonymous>", "(Lnt1/a$e;Lnt1/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<nt1.a.e, nt1.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138391f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nt1.d.Initialized initialized = (nt1.d.Initialized) this.f138391f;
            Object objE = uq.b.e();
            int i15 = this.f138390e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nt1.a.b> bVarY1 = t.this.Y1();
                nt1.a.b.UndoRestrictionDrivingLicence undoRestrictionDrivingLicence = new nt1.a.b.UndoRestrictionDrivingLicence(initialized.getDrivingLicenceRestriction().getDrivingLicence());
                this.f138391f = vq.j.a(initialized);
                this.f138390e = 1;
                if (bVarY1.F(undoRestrictionDrivingLicence, this) == objE) {
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
        public final Object w(nt1.a.e eVar, nt1.d.Initialized initialized, tq.e<? super i0> eVar2) {
            g gVar = t.this.new g(eVar2);
            gVar.f138391f = initialized;
            return gVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, pl0.a aVar2, ac4.a aVar3, ib4.c cVar, hb4.d dVar, ot1.a aVar4) {
        this.BEGetDrivingLicencesUC = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.genericDomainErrorHandler = cVar;
        this.errorVMSFactory = dVar;
        this.mapper = aVar4;
        nt1.c cVar2 = nt1.c.f138319a;
        this.initialState = cVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: nt1.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.v9(this.f138347a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), t9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c r9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorHandler.b(new ib4.c.Params(domainError, false, new er.l() { // from class: nt1.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.s9(this.f138352a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(t tVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                tVar.d9(nt1.a.d.f138316a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                tVar.d9(nt1.a.C3412a.f138311a);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nt1.e.a t9(nt1.d state) {
        return this.mapper.b(new ot1.a.Params(state, b9(nt1.a.c.f138315a), b9(nt1.a.e.f138317a), b9(nt1.a.b.C3413a.f138312a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(nt1.d.class), new er.l() { // from class: nt1.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.w9(this.f138348a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(nt1.c.class), new er.l() { // from class: nt1.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.x9(this.f138349a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: nt1.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.y9(this.f138350a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(nt1.d.Initialized.class), new er.l() { // from class: nt1.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.z9(this.f138351a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        zVar.x(q0.c(nt1.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(t tVar, k10.z zVar) {
        zVar.A(tVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(t tVar, k10.z zVar) {
        d dVar = new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(nt1.a.d.class), oVar, dVar);
        zVar.x(q0.c(nt1.a.C3412a.class), oVar, tVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(t tVar, k10.z zVar) {
        f fVar = tVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(nt1.a.c.class), oVar, fVar);
        zVar.x(q0.c(nt1.a.e.class), oVar, tVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<nt1.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<nt1.d, nt1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<nt1.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
