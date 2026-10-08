package hm0;

import bl0.BEChildBirthApplicationResponse;
import bl0.BEChildBirthRegistration;
import bl0.BEChildBirthRegistrationCivilRegistryOffices;
import bl0.BEChildBirthRegistrationInitial;
import bl0.BEChildBirthRegistrationMunicipalOffice;
import bl0.BEChildBirthRegistrationSubmitApplication;
import bl0.BEGeneratedXmlChildBirth;
import gm0.ChildBirthRegistrationCivilRegistryOfficesResponse;
import gm0.ChildBirthRegistrationGenerateXmlRequest;
import gm0.ChildBirthRegistrationGenerateXmlResponse;
import gm0.ChildBirthRegistrationInitialDataResponse;
import gm0.ChildBirthRegistrationMunicipalOfficesResponse;
import gm0.ChildBirthRegistrationSubmitApplicationRequest;
import gm0.ChildBirthRegistrationSubmitApplicationResponse;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000f0\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lhm0/b;", "Lpm0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lbl0/n;", "b", "(Ltq/e;)Ljava/lang/Object;", "", "territorialCode", "", "Lbl0/p;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "municipalOffice", "Lbl0/l;", "c", "(Lbl0/p;Ltq/e;)Ljava/lang/Object;", "Lbl0/h;", "childBirthRegistration", "Lbl0/u;", "e", "(Lbl0/h;Ltq/e;)Ljava/lang/Object;", "Lal0/a;", "token", "Lbl0/q;", "Lbl0/a;", "d", "(Liy/b0;Lbl0/q;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lwl0/b;", "Loq/k;", "i", "()Lwl0/b;", "client", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements pm0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85322e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85324g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85322e = obj;
            this.f85324g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    /* JADX INFO: renamed from: hm0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/a0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C1989b extends vq.k implements er.l<tq.e<? super ge4.x<ChildBirthRegistrationCivilRegistryOfficesResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85325e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BEChildBirthRegistrationMunicipalOffice f85327g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1989b(BEChildBirthRegistrationMunicipalOffice bEChildBirthRegistrationMunicipalOffice, tq.e<? super C1989b> eVar) {
            super(1, eVar);
            this.f85327g = bEChildBirthRegistrationMunicipalOffice;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85325e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.b bVarI = b.this.i();
            String territorialCode = this.f85327g.getTerritorialCode();
            this.f85325e = 1;
            Object objD = bVarI.d(territorialCode, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C1989b(this.f85327g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<ChildBirthRegistrationCivilRegistryOfficesResponse>> eVar) {
            return ((C1989b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85328d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85330f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85328d = obj;
            this.f85330f |= PKIFailureInfo.systemUnavail;
            return b.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/b1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super ge4.x<ChildBirthRegistrationInitialDataResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85331e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85331e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.b bVarI = b.this.i();
            this.f85331e = 1;
            Object objA = bVarI.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<ChildBirthRegistrationInitialDataResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85334e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85336g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85334e = obj;
            this.f85336g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/e1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super ge4.x<ChildBirthRegistrationMunicipalOfficesResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85337e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f85339g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f85339g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85337e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.b bVarI = b.this.i();
            String str = this.f85339g;
            this.f85337e = 1;
            Object objB = bVarI.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new f(this.f85339g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<ChildBirthRegistrationMunicipalOfficesResponse>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85341e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85343g;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85341e = obj;
            this.f85343g |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/y0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super ge4.x<ChildBirthRegistrationGenerateXmlResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85344e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BEChildBirthRegistration f85346g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(BEChildBirthRegistration bEChildBirthRegistration, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f85346g = bEChildBirthRegistration;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85344e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.b bVarI = b.this.i();
            ChildBirthRegistrationGenerateXmlRequest x0VarX = yl0.a.x(this.f85346g);
            this.f85344e = 1;
            Object objC = bVarI.c(x0VarX, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new h(this.f85346g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<ChildBirthRegistrationGenerateXmlResponse>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85349f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85351h;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85349f = obj;
            this.f85351h |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/g1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super ge4.x<ChildBirthRegistrationSubmitApplicationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85352e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85354g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BEChildBirthRegistrationSubmitApplication f85355h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(iy.b0 b0Var, BEChildBirthRegistrationSubmitApplication bEChildBirthRegistrationSubmitApplication, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f85354g = b0Var;
            this.f85355h = bEChildBirthRegistrationSubmitApplication;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85352e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.b bVarI = b.this.i();
            String strE = iy.c0.e(this.f85354g);
            ChildBirthRegistrationSubmitApplicationRequest childBirthRegistrationSubmitApplicationRequestY = yl0.a.y(this.f85355h);
            this.f85352e = 1;
            Object objE2 = bVarI.e(strE, childBirthRegistrationSubmitApplicationRequestY, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new j(this.f85354g, this.f85355h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<ChildBirthRegistrationSubmitApplicationResponse>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final pl.gov.coi.common.network.w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: hm0.a
            @Override // er.a
            public final Object a() {
                return b.h(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.b h(pl.gov.coi.common.network.w wVar) {
        return (wl0.b) pl.gov.coi.common.network.w.b(wVar, null, wl0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.b i() {
        return (wl0.b) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.a
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, ? extends List<BEChildBirthRegistrationMunicipalOffice>>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f85336g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f85336g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f85334e;
        Object objE = uq.b.e();
        int i16 = eVar2.f85336g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, null);
            eVar2.f85333d = vq.j.a(str);
            eVar2.f85336g = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(yl0.a.l((ChildBirthRegistrationMunicipalOfficesResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.a
    public Object b(tq.e<? super dx.i<? extends dx.b, BEChildBirthRegistrationInitial>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f85330f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f85330f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f85328d;
        Object objE = uq.b.e();
        int i16 = cVar.f85330f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(null);
            cVar.f85330f = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return yl0.a.e((ChildBirthRegistrationInitialDataResponse) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.a
    public Object c(BEChildBirthRegistrationMunicipalOffice bEChildBirthRegistrationMunicipalOffice, tq.e<? super dx.i<? extends dx.b, BEChildBirthRegistrationCivilRegistryOffices>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f85324g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f85324g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f85322e;
        Object objE = uq.b.e();
        int i16 = aVar.f85324g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C1989b c1989b = new C1989b(bEChildBirthRegistrationMunicipalOffice, null);
            aVar.f85321d = vq.j.a(bEChildBirthRegistrationMunicipalOffice);
            aVar.f85324g = 1;
            objB = g0Var.b(c1989b, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(yl0.a.b((ChildBirthRegistrationCivilRegistryOfficesResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.a
    public Object d(iy.b0 b0Var, BEChildBirthRegistrationSubmitApplication bEChildBirthRegistrationSubmitApplication, tq.e<? super dx.i<? extends dx.b, BEChildBirthApplicationResponse>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f85351h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f85351h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f85349f;
        Object objE = uq.b.e();
        int i16 = iVar.f85351h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(b0Var, bEChildBirthRegistrationSubmitApplication, null);
            iVar.f85347d = vq.j.a(b0Var);
            iVar.f85348e = vq.j.a(bEChildBirthRegistrationSubmitApplication);
            iVar.f85351h = 1;
            objB = g0Var.b(jVar, iVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar2 = (dx.i) objB;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (iVar2 instanceof dx.i.Right) {
            return yl0.a.g((ChildBirthRegistrationSubmitApplicationResponse) ((dx.i.Right) iVar2).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.a
    public Object e(BEChildBirthRegistration bEChildBirthRegistration, tq.e<? super dx.i<? extends dx.b, ? extends List<BEGeneratedXmlChildBirth>>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f85343g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f85343g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f85341e;
        Object objE = uq.b.e();
        int i16 = gVar.f85343g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(bEChildBirthRegistration, null);
            gVar.f85340d = vq.j.a(bEChildBirthRegistration);
            gVar.f85343g = 1;
            objB = g0Var.b(hVar, gVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(yl0.a.k((ChildBirthRegistrationGenerateXmlResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
