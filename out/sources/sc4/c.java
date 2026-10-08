package sc4;

import fk0.BECompanyActivityCategories;
import fk0.BECompanyDetails;
import fk0.BECompanyPrintout;
import fk0.BEElectronicDeliveryNonPublicSuppliers;
import fk0.BESocialInsuranceFunds;
import fk0.BETaxOffices;
import hb1.BECompanyPkdCode;
import hb1.TaxOffices;
import hk0.a0;
import hk0.k;
import hk0.o;
import hk0.q;
import hk0.s;
import hk0.y;
import java.util.List;
import ld1.KrusOfficeModel;
import ma1.Certificate;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pd1.NonPublicSupplier;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0014J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u0010H\u0096@¢\u0006\u0004\b\u0018\u0010\u0014J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00190\u0010H\u0096@¢\u0006\u0004\b\u001a\u0010\u0014J\"\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0010H\u0096@¢\u0006\u0004\b\u001d\u0010\u0014J\"\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001b0\u0010H\u0096@¢\u0006\u0004\b\u001f\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010%¨\u0006&"}, d2 = {"Lsc4/c;", "Lla1/a;", "Lhk0/q;", "getCompanyDetailsUC", "Lhk0/k;", "getCertificateUC", "Lhk0/o;", "getCompanyCategoriesUC", "Lhk0/a0;", "getTaxOfficesUC", "Lhk0/y;", "getSocialInsuranceFundsUC", "Lhk0/s;", "getNonPublicSuppliersUC", "<init>", "(Lhk0/q;Lhk0/k;Lhk0/o;Lhk0/a0;Lhk0/y;Lhk0/s;)V", "Ldx/i;", "Ldx/b;", "Lma1/f;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lma1/a;", "d", "Lhb1/b;", "b", "Lhb1/j;", "f", "", "Lld1/i;", "e", "Lpd1/a;", "c", "Lhk0/q;", "Lhk0/k;", "Lhk0/o;", "Lhk0/a0;", "Lhk0/y;", "Lhk0/s;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements la1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q getCompanyDetailsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k getCertificateUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o getCompanyCategoriesUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a0 getTaxOfficesUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y getSocialInsuranceFundsUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final s getNonPublicSuppliersUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f180175d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180177f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180175d = obj;
            this.f180177f |= PKIFailureInfo.systemUnavail;
            return c.this.d(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f180178d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180180f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180178d = obj;
            this.f180180f |= PKIFailureInfo.systemUnavail;
            return c.this.b(this);
        }
    }

    /* JADX INFO: renamed from: sc4.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4643c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f180181d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180183f;

        C4643c(tq.e<? super C4643c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180181d = obj;
            this.f180183f |= PKIFailureInfo.systemUnavail;
            return c.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f180184d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180186f;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180184d = obj;
            this.f180186f |= PKIFailureInfo.systemUnavail;
            return c.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f180187d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180189f;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180187d = obj;
            this.f180189f |= PKIFailureInfo.systemUnavail;
            return c.this.e(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f180190d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180192f;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180190d = obj;
            this.f180192f |= PKIFailureInfo.systemUnavail;
            return c.this.f(this);
        }
    }

    public c(q qVar, k kVar, o oVar, a0 a0Var, y yVar, s sVar) {
        this.getCompanyDetailsUC = qVar;
        this.getCertificateUC = kVar;
        this.getCompanyCategoriesUC = oVar;
        this.getTaxOfficesUC = a0Var;
        this.getSocialInsuranceFundsUC = yVar;
        this.getNonPublicSuppliersUC = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // la1.a
    public Object a(tq.e<? super dx.i<? extends dx.b, ma1.f>> eVar) throws Throwable {
        C4643c c4643c;
        if (eVar instanceof C4643c) {
            c4643c = (C4643c) eVar;
            int i15 = c4643c.f180183f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4643c.f180183f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4643c = new C4643c(eVar);
            }
        } else {
            c4643c = new C4643c(eVar);
        }
        Object objC = c4643c.f180181d;
        Object objE = uq.b.e();
        int i16 = c4643c.f180183f;
        if (i16 == 0) {
            u.b(objC);
            q qVar = this.getCompanyDetailsUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            c4643c.f180183f = 1;
            objC = qVar.c(c1792a, c4643c);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(sc4.d.r((BECompanyDetails) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // la1.a
    public Object b(tq.e<? super dx.i<? extends dx.b, BECompanyPkdCode>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f180180f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f180180f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f180178d;
        Object objE = uq.b.e();
        int i16 = bVar.f180180f;
        if (i16 == 0) {
            u.b(objC);
            o oVar = this.getCompanyCategoriesUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            bVar.f180180f = 1;
            objC = oVar.c(c1792a, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(sc4.d.g((BECompanyActivityCategories) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // la1.a
    public Object c(tq.e<? super dx.i<? extends dx.b, ? extends List<NonPublicSupplier>>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f180186f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f180186f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f180184d;
        Object objE = uq.b.e();
        int i16 = dVar.f180186f;
        if (i16 == 0) {
            u.b(objC);
            s sVar = this.getNonPublicSuppliersUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            dVar.f180186f = 1;
            objC = sVar.c(c1792a, dVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(sc4.d.i((BEElectronicDeliveryNonPublicSuppliers) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // la1.a
    public Object d(tq.e<? super dx.i<? extends dx.b, Certificate>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f180177f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f180177f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f180175d;
        Object objE = uq.b.e();
        int i16 = aVar.f180177f;
        if (i16 == 0) {
            u.b(objC);
            k kVar = this.getCertificateUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f180177f = 1;
            objC = kVar.c(c1792a, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(sc4.d.m((BECompanyPrintout) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // la1.a
    public Object e(tq.e<? super dx.i<? extends dx.b, ? extends List<KrusOfficeModel>>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f180189f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f180189f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objC = eVar2.f180187d;
        Object objE = uq.b.e();
        int i16 = eVar2.f180189f;
        if (i16 == 0) {
            u.b(objC);
            y yVar = this.getSocialInsuranceFundsUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            eVar2.f180189f = 1;
            objC = yVar.c(c1792a, eVar2);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(sc4.d.j((BESocialInsuranceFunds) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // la1.a
    public Object f(tq.e<? super dx.i<? extends dx.b, TaxOffices>> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f180192f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f180192f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objC = fVar.f180190d;
        Object objE = uq.b.e();
        int i16 = fVar.f180192f;
        if (i16 == 0) {
            u.b(objC);
            a0 a0Var = this.getTaxOfficesUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            fVar.f180192f = 1;
            objC = a0Var.c(c1792a, fVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(sc4.d.h((BETaxOffices) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}
