package dk0;

import ck0.CompanyRepresentativesResponseDto;
import ck0.ModifyCompanyRepresentativeRequestDto;
import ck0.RepresentativeRemovalStatementResponseDto;
import fk0.BECompanyRepresentatives;
import fk0.BERepresentativeRemovalStatement;
import ge4.x;
import oq.i0;
import oq.k;
import oq.l;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u000eJ,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ldk0/h;", "Lgk0/d;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "cmsSignedData", "Ldx/i;", "Ldx/b;", "Loq/i0;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "entryId", "Lfk0/h0;", "b", "representativeId", "Lfk0/b1;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/w;", "Lpl/gov/coi/common/network/g0;", "Lak0/d;", "Loq/k;", "g", "()Lak0/d;", "companyRepresentativeControllerApi", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gk0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k companyRepresentativeControllerApi = l.a(new er.a() { // from class: dk0.g
        @Override // er.a
        public final Object a() {
            return h.f(this.f43078a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f43083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f43084f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f43086h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43084f = obj;
            this.f43086h |= PKIFailureInfo.systemUnavail;
            return h.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lck0/l1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<RepresentativeRemovalStatementResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43087e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f43089g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f43090h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f43089g = str;
            this.f43090h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43087e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ak0.d dVarG = h.this.g();
            String str = this.f43089g;
            String str2 = this.f43090h;
            this.f43087e = 1;
            Object objA = dVarG.a(str, str2, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return h.this.new b(this.f43089g, this.f43090h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<RepresentativeRemovalStatementResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f43092e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f43094g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43092e = obj;
            this.f43094g |= PKIFailureInfo.systemUnavail;
            return h.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lck0/v0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<CompanyRepresentativesResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43095e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f43097g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f43097g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43095e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ak0.d dVarG = h.this.g();
            String str = this.f43097g;
            this.f43095e = 1;
            Object objB = dVarG.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return h.this.new d(this.f43097g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<CompanyRepresentativesResponseDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43098e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f43100g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f43100g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43098e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ak0.d dVarG = h.this.g();
            ModifyCompanyRepresentativeRequestDto modifyCompanyRepresentativeRequestDtoL0 = bk0.a.l0(this.f43100g);
            this.f43098e = 1;
            Object objC = dVarG.c(modifyCompanyRepresentativeRequestDtoL0, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return h.this.new e(this.f43100g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    public h(w wVar, g0 g0Var) {
        this.httpServiceFactory = wVar;
        this.networkCallMediator = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ak0.d f(h hVar) {
        return (ak0.d) w.b(hVar.httpServiceFactory, null, ak0.d.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ak0.d g() {
        return (ak0.d) this.companyRepresentativeControllerApi.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gk0.d
    public Object a(String str, String str2, tq.e<? super dx.i<? extends dx.b, BERepresentativeRemovalStatement>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f43086h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f43086h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f43084f;
        Object objE = uq.b.e();
        int i16 = aVar.f43086h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, str2, null);
            aVar.f43082d = vq.j.a(str);
            aVar.f43083e = vq.j.a(str2);
            aVar.f43086h = 1;
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
            return new dx.i.Right(bk0.a.B((RepresentativeRemovalStatementResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gk0.d
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, BECompanyRepresentatives>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f43094g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f43094g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f43092e;
        Object objE = uq.b.e();
        int i16 = cVar.f43094g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, null);
            cVar.f43091d = vq.j.a(str);
            cVar.f43094g = 1;
            objB = g0Var.b(dVar, cVar);
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
            return new dx.i.Right(bk0.a.r((CompanyRepresentativesResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // gk0.d
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new e(str, null), eVar);
    }
}
