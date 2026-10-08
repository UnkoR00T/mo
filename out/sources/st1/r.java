package st1;

import al0.BankRestrictionPassport;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tt1.DocumentRestrictionPassportsListSetupData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010/\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lst1/r;", "Ll00/g;", "Lst1/b;", "Lst1/a;", "Lst1/c;", "", "Lyy/a;", "stateMachineFactory", "Lib4/c;", "genericDomainErrorHandler", "Lst1/e;", "mapper", "Ltt1/b;", "setupData", "<init>", "(Lyy/a;Lib4/c;Lst1/e;Ltt1/b;)V", "state", "Lst1/c$a;", "q9", "(Lst1/b;)Lst1/c$a;", "b", "Lib4/c;", "c", "Lst1/e;", "d", "Ltt1/b;", "Lst1/b$a;", "e", "Lst1/b$a;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lst1/a$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<st1.b, st1.a> implements st1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final st1.e mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DocumentRestrictionPassportsListSetupData setupData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final st1.b.a initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<st1.b, st1.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<st1.c.a> state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<st1.a.c> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<st1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f184239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f184240b;

        /* JADX INFO: renamed from: st1.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4755a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f184241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f184242b;

            /* JADX INFO: renamed from: st1.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4756a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f184243d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f184244e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f184245f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f184247h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f184248j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f184249k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f184250l;

                public C4756a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f184243d = obj;
                    this.f184244e |= PKIFailureInfo.systemUnavail;
                    return C4755a.this.F(null, this);
                }
            }

            public C4755a(mu.h hVar, r rVar) {
                this.f184241a = hVar;
                this.f184242b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4756a c4756a;
                if (eVar instanceof C4756a) {
                    c4756a = (C4756a) eVar;
                    int i15 = c4756a.f184244e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4756a.f184244e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4756a = new C4756a(eVar);
                    }
                } else {
                    c4756a = new C4756a(eVar);
                }
                Object obj2 = c4756a.f184243d;
                Object objE = uq.b.e();
                int i16 = c4756a.f184244e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f184241a;
                    st1.c.a aVarQ9 = this.f184242b.q9((st1.b) obj);
                    c4756a.f184245f = vq.j.a(obj);
                    c4756a.f184247h = vq.j.a(c4756a);
                    c4756a.f184248j = vq.j.a(obj);
                    c4756a.f184249k = vq.j.a(hVar);
                    c4756a.f184250l = 0;
                    c4756a.f184244e = 1;
                    if (hVar.F(aVarQ9, c4756a) == objE) {
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

        public a(mu.g gVar, r rVar) {
            this.f184239a = gVar;
            this.f184240b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super st1.c.a> hVar, tq.e eVar) {
            Object objA = this.f184239a.a(new C4755a(hVar, this.f184240b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lst1/a$b;", "action", "Lst1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lst1/a$b;Lst1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<st1.a.Error, st1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184252f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(r rVar, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                rVar.d9(st1.a.C4749a.f184193a);
            } else if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    throw new oq.p();
                }
                rVar.d9(st1.a.d.f184198a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            st1.a.Error error = (st1.a.Error) this.f184252f;
            Object objE = uq.b.e();
            int i15 = this.f184251e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                ib4.c cVar = r.this.genericDomainErrorHandler;
                dx.b domainError = error.getDomainError();
                final r rVar2 = r.this;
                st1.a.c.Error error2 = new st1.a.c.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: st1.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.b.O(rVar2, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f184252f = vq.j.a(error);
                this.f184251e = 1;
                if (rVar.F(error2, this) == objE) {
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
        public final Object w(st1.a.Error error, st1.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = r.this.new b(eVar);
            bVar2.f184252f = error;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lst1/a$a;", "<unused var>", "Lst1/b;", "Loq/i0;", "<anonymous>", "(Lst1/a$a;Lst1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<st1.a.C4749a, st1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184254e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f184254e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                st1.a.c.C4750a c4750a = st1.a.c.C4750a.f184195a;
                this.f184254e = 1;
                if (rVar.F(c4750a, this) == objE) {
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
        public final Object w(st1.a.C4749a c4749a, st1.b bVar, tq.e<? super i0> eVar) {
            return r.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lst1/a$d;", "<unused var>", "Lk10/c0;", "Lst1/b;", "state", "Lk10/l;", "<anonymous>", "(Lst1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<st1.a.d, c0<st1.b>, tq.e<? super k10.l<? extends st1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184257f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final st1.b.C4752b V(st1.b bVar) {
            return st1.b.C4752b.f184201a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final st1.b.PassportsList X(r rVar, st1.b bVar) {
            return new st1.b.PassportsList(rVar.setupData.a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f184257f;
            uq.b.e();
            if (this.f184256e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (r.this.setupData.a().isEmpty()) {
                return c0Var.d(new er.l() { // from class: st1.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.d.V((b) obj2);
                    }
                });
            }
            final r rVar = r.this;
            return c0Var.d(new er.l() { // from class: st1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.d.X(rVar, (b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(st1.a.d dVar, c0<st1.b> c0Var, tq.e<? super k10.l<? extends st1.b>> eVar) {
            d dVar2 = r.this.new d(eVar);
            dVar2.f184257f = c0Var;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lst1/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lst1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<st1.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184259e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f184259e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.d9(st1.a.d.f184198a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(st1.b.a aVar, tq.e<? super i0> eVar) {
            return ((e) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return r.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lst1/a$e;", "action", "Lst1/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lst1/a$e;Lst1/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<st1.a.ToRestrictionPassportDetails, st1.b.PassportsList, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184262f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            st1.a.ToRestrictionPassportDetails toRestrictionPassportDetails = (st1.a.ToRestrictionPassportDetails) this.f184262f;
            Object objE = uq.b.e();
            int i15 = this.f184261e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                st1.a.c.ToRestrictionPassportDetails toRestrictionPassportDetails2 = new st1.a.c.ToRestrictionPassportDetails(toRestrictionPassportDetails.getPassport());
                this.f184262f = vq.j.a(toRestrictionPassportDetails);
                this.f184261e = 1;
                if (rVar.F(toRestrictionPassportDetails2, this) == objE) {
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
        public final Object w(st1.a.ToRestrictionPassportDetails toRestrictionPassportDetails, st1.b.PassportsList passportsList, tq.e<? super i0> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f184262f = toRestrictionPassportDetails;
            return fVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, ib4.c cVar, st1.e eVar, DocumentRestrictionPassportsListSetupData documentRestrictionPassportsListSetupData) {
        this.genericDomainErrorHandler = cVar;
        this.mapper = eVar;
        this.setupData = documentRestrictionPassportsListSetupData;
        st1.b.a aVar2 = st1.b.a.f184200a;
        this.initialState = aVar2;
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: st1.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.t9(this.f184231a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), q9(aVar2));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final st1.c.a q9(st1.b state) {
        return this.mapper.b(new st1.e.Params(state, b9(st1.a.C4749a.f184193a), new er.l() { // from class: st1.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.r9(this.f184227a, (BankRestrictionPassport) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(r rVar, BankRestrictionPassport bankRestrictionPassport) {
        rVar.d9(new st1.a.ToRestrictionPassportDetails(bankRestrictionPassport));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(st1.b.class), new er.l() { // from class: st1.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.u9(this.f184228a, (z) obj);
            }
        });
        vVar.c(q0.c(st1.b.a.class), new er.l() { // from class: st1.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.v9(this.f184229a, (z) obj);
            }
        });
        vVar.c(q0.c(st1.b.PassportsList.class), new er.l() { // from class: st1.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.w9(this.f184230a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(r rVar, z zVar) {
        b bVar = rVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(st1.a.Error.class), oVar, bVar);
        zVar.x(q0.c(st1.a.C4749a.class), oVar, rVar.new c(null));
        zVar.v(q0.c(st1.a.d.class), oVar, rVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(r rVar, z zVar) {
        zVar.C(rVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(r rVar, z zVar) {
        f fVar = rVar.new f(null);
        zVar.x(q0.c(st1.a.ToRestrictionPassportDetails.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<st1.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<st1.b, st1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<st1.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(st1.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(DocumentRestrictionPassportsListSetupData documentRestrictionPassportsListSetupData) {
        super.P5(documentRestrictionPassportsListSetupData);
    }
}
