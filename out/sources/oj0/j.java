package oj0;

import ge4.x;
import nj0.InternetAddressPointsResponse;
import nj0.InternetAvailableOperatorsResponse;
import nj0.InternetDemandResponse;
import nj0.InternetSpeedDictionaryResponse;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import zi0.InternetAddressPoints;
import zi0.InternetAvailableOperators;
import zi0.InternetDemandRequest;
import zi0.InternetSpeedDictionary;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJH\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Loj0/j;", "Lrj0/e;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lzi0/h;", "b", "(Ltq/e;)Ljava/lang/Object;", "", "communityId", "cityId", "buildingNumber", "streetId", "apartmentNumber", "Lzi0/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "addressPointId", "Lzi0/c;", "c", "(JLjava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lzi0/d;", "internetDemandRequest", "Lzi0/e;", "d", "(Lzi0/d;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Llj0/d;", "Loq/k;", "h", "()Llj0/d;", "client", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements rj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146198d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f146199e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f146201g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146199e = obj;
            this.f146201g |= PKIFailureInfo.systemUnavail;
            return j.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/y;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<InternetDemandResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146202e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InternetDemandRequest f146204g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InternetDemandRequest internetDemandRequest, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f146204g = internetDemandRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146202e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.d dVarH = j.this.h();
            nj0.InternetDemandRequest internetDemandRequestH = mj0.d.h(this.f146204g);
            this.f146202e = 1;
            Object objD = dVarH.d(internetDemandRequestH, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return j.this.new b(this.f146204g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<InternetDemandResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f146207f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f146208g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f146209h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f146210j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f146212l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146210j = obj;
            this.f146212l |= PKIFailureInfo.systemUnavail;
            return j.this.a(null, null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/v;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<InternetAddressPointsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146213e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f146215g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f146216h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f146217j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f146218k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f146219l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, String str3, String str4, String str5, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f146215g = str;
            this.f146216h = str2;
            this.f146217j = str3;
            this.f146218k = str4;
            this.f146219l = str5;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146213e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.d dVarH = j.this.h();
            String str = this.f146215g;
            String str2 = this.f146216h;
            String str3 = this.f146217j;
            String str4 = this.f146218k;
            String str5 = this.f146219l;
            this.f146213e = 1;
            Object objA = dVarH.a(str, str2, str3, str4, str5, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return j.this.new d(this.f146215g, this.f146216h, this.f146217j, this.f146218k, this.f146219l, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<InternetAddressPointsResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f146220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146222f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f146224h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146222f = obj;
            this.f146224h |= PKIFailureInfo.systemUnavail;
            return j.this.c(0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/w;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<InternetAvailableOperatorsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146225e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f146227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f146228h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j15, String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f146227g = j15;
            this.f146228h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146225e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.d dVarH = j.this.h();
            long j15 = this.f146227g;
            String str = this.f146228h;
            this.f146225e = 1;
            Object objC = dVarH.c(j15, str, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return j.this.new f(this.f146227g, this.f146228h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<InternetAvailableOperatorsResponse>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f146229d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f146231f;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146229d = obj;
            this.f146231f |= PKIFailureInfo.systemUnavail;
            return j.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/a0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<InternetSpeedDictionaryResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146232e;

        h(tq.e<? super h> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146232e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.d dVarH = j.this.h();
            this.f146232e = 1;
            Object objB = dVarH.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return j.this.new h(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<InternetSpeedDictionaryResponse>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    public j(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: oj0.i
            @Override // er.a
            public final Object a() {
                return j.g(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lj0.d g(w wVar) {
        return (lj0.d) w.b(wVar, null, lj0.d.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lj0.d h() {
        return (lj0.d) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // rj0.e
    public Object a(String str, String str2, String str3, String str4, String str5, tq.e<? super dx.i<? extends dx.b, InternetAddressPoints>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f146212l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f146212l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        c cVar2 = cVar;
        Object objB = cVar2.f146210j;
        Object objE = uq.b.e();
        int i16 = cVar2.f146212l;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, str2, str3, str4, str5, null);
            cVar2.f146205d = vq.j.a(str);
            cVar2.f146206e = vq.j.a(str2);
            cVar2.f146207f = vq.j.a(str3);
            cVar2.f146208g = vq.j.a(str4);
            cVar2.f146209h = vq.j.a(str5);
            cVar2.f146212l = 1;
            objB = g0Var.b(dVar, cVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.d.b((InternetAddressPointsResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.e
    public Object b(tq.e<? super dx.i<? extends dx.b, InternetSpeedDictionary>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f146231f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f146231f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f146229d;
        Object objE = uq.b.e();
        int i16 = gVar.f146231f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(null);
            gVar.f146231f = 1;
            objB = g0Var.b(hVar, gVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.d.g((InternetSpeedDictionaryResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.e
    public Object c(long j15, String str, tq.e<? super dx.i<? extends dx.b, InternetAvailableOperators>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f146224h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f146224h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f146222f;
        Object objE = uq.b.e();
        int i16 = eVar2.f146224h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(j15, str, null);
            eVar2.f146221e = vq.j.a(str);
            eVar2.f146220d = j15;
            eVar2.f146224h = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.d.c((InternetAvailableOperatorsResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.e
    public Object d(InternetDemandRequest internetDemandRequest, tq.e<? super dx.i<? extends dx.b, zi0.InternetDemandResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f146201g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f146201g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f146199e;
        Object objE = uq.b.e();
        int i16 = aVar.f146201g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(internetDemandRequest, null);
            aVar.f146198d = vq.j.a(internetDemandRequest);
            aVar.f146201g = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.d.d((InternetDemandResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
