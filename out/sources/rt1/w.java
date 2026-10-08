package rt1;

import al0.BankRestrictionPassportDocumentRestriction;
import al0.DocumentRestrictions;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tt1.DocumentRestrictionPassportDetailsSetupData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u0019*\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R&\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030+8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010<\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lrt1/w;", "Ll00/g;", "Lrt1/b;", "Lrt1/a;", "Lrt1/g;", "", "Lyy/a;", "stateMachineFactory", "Lib4/c;", "genericDomainErrorHandler", "Lrt1/h;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lml0/p;", "getPassportRestrictionUC", "Ltt1/a;", "setupData", "<init>", "(Lyy/a;Lib4/c;Lrt1/h;Lac4/a;Lml0/p;Ltt1/a;)V", "state", "Lrt1/g$a;", "y9", "(Lrt1/b;)Lrt1/g$a;", "Lal0/p;", "", "w9", "(Lal0/p;)Z", "x9", "b", "Lib4/c;", "c", "Lrt1/h;", "d", "Lac4/a;", "e", "Lml0/p;", "f", "Ltt1/a;", "Lrt1/b$a;", "g", "Lrt1/b$a;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lrt1/a$d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<rt1.b, rt1.a> implements rt1.g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rt1.h mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ml0.p getPassportRestrictionUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final DocumentRestrictionPassportDetailsSetupData setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final rt1.b.a initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<rt1.b, rt1.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<rt1.g.a> state;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<rt1.a.d> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<rt1.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f176047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f176048b;

        /* JADX INFO: renamed from: rt1.w$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4491a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f176049a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f176050b;

            /* JADX INFO: renamed from: rt1.w$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4492a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f176051d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f176052e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f176053f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f176055h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f176056j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f176057k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f176058l;

                public C4492a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f176051d = obj;
                    this.f176052e |= PKIFailureInfo.systemUnavail;
                    return C4491a.this.F(null, this);
                }
            }

            public C4491a(mu.h hVar, w wVar) {
                this.f176049a = hVar;
                this.f176050b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4492a c4492a;
                if (eVar instanceof C4492a) {
                    c4492a = (C4492a) eVar;
                    int i15 = c4492a.f176052e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4492a.f176052e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4492a = new C4492a(eVar);
                    }
                } else {
                    c4492a = new C4492a(eVar);
                }
                Object obj2 = c4492a.f176051d;
                Object objE = uq.b.e();
                int i16 = c4492a.f176052e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f176049a;
                    rt1.g.a aVarY9 = this.f176050b.y9((rt1.b) obj);
                    c4492a.f176053f = vq.j.a(obj);
                    c4492a.f176055h = vq.j.a(c4492a);
                    c4492a.f176056j = vq.j.a(obj);
                    c4492a.f176057k = vq.j.a(hVar);
                    c4492a.f176058l = 0;
                    c4492a.f176052e = 1;
                    if (hVar.F(aVarY9, c4492a) == objE) {
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

        public a(mu.g gVar, w wVar) {
            this.f176047a = gVar;
            this.f176048b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super rt1.g.a> hVar, tq.e eVar) {
            Object objA = this.f176047a.a(new C4491a(hVar, this.f176048b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrt1/a$b;", "action", "Lrt1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lrt1/a$b;Lrt1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<rt1.a.Error, rt1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176060f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(w wVar, rt1.a.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    wVar.d9(rt1.a.C4487a.f175984a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    wVar.d9(error);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final rt1.a.Error error = (rt1.a.Error) this.f176060f;
            Object objE = uq.b.e();
            int i15 = this.f176059e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                ib4.c cVar = w.this.genericDomainErrorHandler;
                dx.b domainError = error.getDomainError();
                final w wVar2 = w.this;
                rt1.a.d.Error error2 = new rt1.a.d.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: rt1.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return w.b.O(wVar2, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f176060f = vq.j.a(error);
                this.f176059e = 1;
                if (wVar.F(error2, this) == objE) {
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
        public final Object w(rt1.a.Error error, rt1.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = w.this.new b(eVar);
            bVar2.f176060f = error;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt1/a$a;", "<unused var>", "Lrt1/b;", "Loq/i0;", "<anonymous>", "(Lrt1/a$a;Lrt1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<rt1.a.C4487a, rt1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176062e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f176062e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                rt1.a.d.C4488a c4488a = rt1.a.d.C4488a.f175987a;
                this.f176062e = 1;
                if (wVar.F(c4488a, this) == objE) {
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
        public final Object w(rt1.a.C4487a c4487a, rt1.b bVar, tq.e<? super i0> eVar) {
            return w.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrt1/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lrt1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<rt1.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176064e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f176064e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            w.this.d9(rt1.a.c.f175986a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(rt1.b.a aVar, tq.e<? super i0> eVar) {
            return ((d) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return w.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lrt1/a$c;", "<unused var>", "Lk10/c0;", "Lrt1/b$a;", "state", "Lk10/l;", "Lrt1/b;", "<anonymous>", "(Lrt1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<rt1.a.c, k10.c0<rt1.b.a>, tq.e<? super k10.l<? extends rt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f176066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f176067f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f176068g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f176069h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lrt1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends rt1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f176071e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f176072f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f176073g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<rt1.b.a> f176074h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, String str, k10.c0<rt1.b.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f176072f = wVar;
                this.f176073g = str;
                this.f176074h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final NoRestriction Z(w wVar, BankRestrictionPassportDocumentRestriction bankRestrictionPassportDocumentRestriction, rt1.b.a aVar) {
                return new NoRestriction(wVar.setupData.getPassport(), bankRestrictionPassportDocumentRestriction);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RestrictedInApp a0(w wVar, BankRestrictionPassportDocumentRestriction bankRestrictionPassportDocumentRestriction, rt1.b.a aVar) {
                return new RestrictedInApp(wVar.setupData.getPassport(), bankRestrictionPassportDocumentRestriction);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RestrictedInBanks b0(w wVar, BankRestrictionPassportDocumentRestriction bankRestrictionPassportDocumentRestriction, rt1.b.a aVar) {
                return new RestrictedInBanks(wVar.setupData.getPassport(), bankRestrictionPassportDocumentRestriction);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RestrictedInAppAndBanks c0(w wVar, BankRestrictionPassportDocumentRestriction bankRestrictionPassportDocumentRestriction, rt1.b.a aVar) {
                return new RestrictedInAppAndBanks(wVar.setupData.getPassport(), bankRestrictionPassportDocumentRestriction);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f176071e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.p pVar = this.f176072f.getPassportRestrictionUC;
                    ml0.p.Params params = new ml0.p.Params(this.f176073g);
                    this.f176071e = 1;
                    obj = pVar.c(params, this);
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
                final w wVar = this.f176072f;
                k10.c0<rt1.b.a> c0Var = this.f176074h;
                if (iVar instanceof dx.i.Left) {
                    wVar.d9(new rt1.a.Error((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BankRestrictionPassportDocumentRestriction bankRestrictionPassportDocumentRestriction = (BankRestrictionPassportDocumentRestriction) ((dx.i.Right) iVar).b();
                if (!wVar.w9(bankRestrictionPassportDocumentRestriction) && !wVar.x9(bankRestrictionPassportDocumentRestriction)) {
                    return c0Var.d(new er.l() { // from class: rt1.y
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return w.e.a.Z(wVar, bankRestrictionPassportDocumentRestriction, (b.a) obj2);
                        }
                    });
                }
                if (wVar.w9(bankRestrictionPassportDocumentRestriction) && !wVar.x9(bankRestrictionPassportDocumentRestriction)) {
                    return c0Var.d(new er.l() { // from class: rt1.z
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return w.e.a.a0(wVar, bankRestrictionPassportDocumentRestriction, (b.a) obj2);
                        }
                    });
                }
                if (wVar.w9(bankRestrictionPassportDocumentRestriction) || !wVar.x9(bankRestrictionPassportDocumentRestriction)) {
                    return (wVar.w9(bankRestrictionPassportDocumentRestriction) && wVar.x9(bankRestrictionPassportDocumentRestriction)) ? c0Var.d(new er.l() { // from class: rt1.b0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return w.e.a.c0(wVar, bankRestrictionPassportDocumentRestriction, (b.a) obj2);
                        }
                    }) : c0Var.c();
                }
                return c0Var.d(new er.l() { // from class: rt1.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return w.e.a.b0(wVar, bankRestrictionPassportDocumentRestriction, (b.a) obj2);
                    }
                });
            }

            public final tq.e<i0> X(tq.e<?> eVar) {
                return new a(this.f176072f, this.f176073g, this.f176074h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends rt1.b>> eVar) {
                return ((a) X(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f176069h;
            Object objE = uq.b.e();
            int i15 = this.f176068g;
            if (i15 == 0) {
                oq.u.b(obj);
                String documentId = w.this.setupData.getPassport().getDocumentId();
                if (documentId != null) {
                    w wVar = w.this;
                    ac4.a aVar = wVar.callActionWithLoaderUseCase;
                    a aVar2 = new a(wVar, documentId, c0Var, null);
                    this.f176069h = c0Var;
                    this.f176066e = vq.j.a(documentId);
                    this.f176067f = 0;
                    this.f176068g = 1;
                    obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return c0Var.c();
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k10.l lVar = (k10.l) obj;
            if (lVar != null) {
                return lVar;
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(rt1.a.c cVar, k10.c0<rt1.b.a> c0Var, tq.e<? super k10.l<? extends rt1.b>> eVar) {
            e eVar2 = w.this.new e(eVar);
            eVar2.f176069h = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrt1/a$e;", "<unused var>", "Lrt1/f;", "state", "Loq/i0;", "<anonymous>", "(Lrt1/a$e;Lrt1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<rt1.a.e, RestrictedInBanks, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176076f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            RestrictedInBanks restrictedInBanks = (RestrictedInBanks) this.f176076f;
            Object objE = uq.b.e();
            int i15 = this.f176075e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                rt1.a.d.Restrict restrict = new rt1.a.d.Restrict(restrictedInBanks.getPassport(), restrictedInBanks.getPassportRestriction());
                this.f176076f = vq.j.a(restrictedInBanks);
                this.f176075e = 1;
                if (wVar.F(restrict, this) == objE) {
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
        public final Object w(rt1.a.e eVar, RestrictedInBanks restrictedInBanks, tq.e<? super i0> eVar2) {
            f fVar = w.this.new f(eVar2);
            fVar.f176076f = restrictedInBanks;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrt1/a$e;", "<unused var>", "Lrt1/c;", "state", "Loq/i0;", "<anonymous>", "(Lrt1/a$e;Lrt1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<rt1.a.e, NoRestriction, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176079f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            NoRestriction noRestriction = (NoRestriction) this.f176079f;
            Object objE = uq.b.e();
            int i15 = this.f176078e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                rt1.a.d.Restrict restrict = new rt1.a.d.Restrict(noRestriction.getPassport(), noRestriction.getPassportRestriction());
                this.f176079f = vq.j.a(noRestriction);
                this.f176078e = 1;
                if (wVar.F(restrict, this) == objE) {
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
        public final Object w(rt1.a.e eVar, NoRestriction noRestriction, tq.e<? super i0> eVar2) {
            g gVar = w.this.new g(eVar2);
            gVar.f176079f = noRestriction;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrt1/a$e;", "<unused var>", "Lrt1/d;", "state", "Loq/i0;", "<anonymous>", "(Lrt1/a$e;Lrt1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<rt1.a.e, RestrictedInApp, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176082f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            RestrictedInApp restrictedInApp = (RestrictedInApp) this.f176082f;
            Object objE = uq.b.e();
            int i15 = this.f176081e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                rt1.a.d.UnRestrict unRestrict = new rt1.a.d.UnRestrict(restrictedInApp.getPassport(), restrictedInApp.getPassportRestriction());
                this.f176082f = vq.j.a(restrictedInApp);
                this.f176081e = 1;
                if (wVar.F(unRestrict, this) == objE) {
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
        public final Object w(rt1.a.e eVar, RestrictedInApp restrictedInApp, tq.e<? super i0> eVar2) {
            h hVar = w.this.new h(eVar2);
            hVar.f176082f = restrictedInApp;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrt1/a$e;", "<unused var>", "Lrt1/e;", "state", "Loq/i0;", "<anonymous>", "(Lrt1/a$e;Lrt1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<rt1.a.e, RestrictedInAppAndBanks, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176085f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            RestrictedInAppAndBanks restrictedInAppAndBanks = (RestrictedInAppAndBanks) this.f176085f;
            Object objE = uq.b.e();
            int i15 = this.f176084e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                rt1.a.d.UnRestrict unRestrict = new rt1.a.d.UnRestrict(restrictedInAppAndBanks.getPassport(), restrictedInAppAndBanks.getPassportRestriction());
                this.f176085f = vq.j.a(restrictedInAppAndBanks);
                this.f176084e = 1;
                if (wVar.F(unRestrict, this) == objE) {
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
        public final Object w(rt1.a.e eVar, RestrictedInAppAndBanks restrictedInAppAndBanks, tq.e<? super i0> eVar2) {
            i iVar = w.this.new i(eVar2);
            iVar.f176085f = restrictedInAppAndBanks;
            return iVar.J(i0.f148189a);
        }
    }

    public w(yy.a aVar, ib4.c cVar, rt1.h hVar, ac4.a aVar2, ml0.p pVar, DocumentRestrictionPassportDetailsSetupData documentRestrictionPassportDetailsSetupData) {
        this.genericDomainErrorHandler = cVar;
        this.mapper = hVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getPassportRestrictionUC = pVar;
        this.setupData = documentRestrictionPassportDetailsSetupData;
        rt1.b.a aVar3 = rt1.b.a.f175996a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: rt1.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.A9(this.f176037a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), y9(aVar3));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(rt1.b.class), new er.l() { // from class: rt1.p
            @Override // er.l
            public final Object b(Object obj) {
                return w.B9(this.f176031a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(rt1.b.a.class), new er.l() { // from class: rt1.q
            @Override // er.l
            public final Object b(Object obj) {
                return w.C9(this.f176032a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(RestrictedInBanks.class), new er.l() { // from class: rt1.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.D9(this.f176033a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(NoRestriction.class), new er.l() { // from class: rt1.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.E9(this.f176034a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(RestrictedInApp.class), new er.l() { // from class: rt1.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.F9(this.f176035a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(RestrictedInAppAndBanks.class), new er.l() { // from class: rt1.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.G9(this.f176036a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(w wVar, k10.z zVar) {
        b bVar = wVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(rt1.a.Error.class), oVar, bVar);
        zVar.x(q0.c(rt1.a.C4487a.class), oVar, wVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(w wVar, k10.z zVar) {
        zVar.C(wVar.new d(null));
        e eVar = wVar.new e(null);
        zVar.v(q0.c(rt1.a.c.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(w wVar, k10.z zVar) {
        f fVar = wVar.new f(null);
        zVar.x(q0.c(rt1.a.e.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(w wVar, k10.z zVar) {
        g gVar = wVar.new g(null);
        zVar.x(q0.c(rt1.a.e.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(w wVar, k10.z zVar) {
        h hVar = wVar.new h(null);
        zVar.x(q0.c(rt1.a.e.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(w wVar, k10.z zVar) {
        i iVar = wVar.new i(null);
        zVar.x(q0.c(rt1.a.e.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w9(BankRestrictionPassportDocumentRestriction bankRestrictionPassportDocumentRestriction) {
        DocumentRestrictions restrictions;
        return ((bankRestrictionPassportDocumentRestriction == null || (restrictions = bankRestrictionPassportDocumentRestriction.getRestrictions()) == null) ? null : restrictions.getMobywatelRestriction()) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x9(BankRestrictionPassportDocumentRestriction bankRestrictionPassportDocumentRestriction) {
        DocumentRestrictions restrictions = bankRestrictionPassportDocumentRestriction.getRestrictions();
        return (restrictions != null ? restrictions.getBanksRestrictions() : null) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rt1.g.a y9(rt1.b state) {
        return this.mapper.b(new rt1.h.Params(state, b9(rt1.a.C4487a.f175984a), b9(rt1.a.e.f175993a)));
    }

    @Override // zx.b
    public xw.b<rt1.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<rt1.b, rt1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<rt1.g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(rt1.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(DocumentRestrictionPassportDetailsSetupData documentRestrictionPassportDetailsSetupData) {
        super.P5(documentRestrictionPassportDetailsSetupData);
    }
}
