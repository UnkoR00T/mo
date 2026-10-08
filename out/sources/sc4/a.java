package sc4;

import fk0.BECitizenData;
import fk0.BEGenerateApplicationResponse;
import fk0.BEOrderApplicationResponse;
import hk0.e0;
import hk0.m;
import jb1.CompanyApplication;
import jb1.OrderApplication;
import ld1.ApplicationXml;
import ld1.CompanyApplicationCitizenData;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b¨\u0006\u001c"}, d2 = {"Lsc4/a;", "Lgb1/b;", "Lhk0/m;", "getCitizenDataUC", "Lhk0/a;", "generateApplicationUC", "Lhk0/e0;", "orderApplicationUC", "<init>", "(Lhk0/m;Lhk0/a;Lhk0/e0;)V", "Ldx/i;", "Ldx/b;", "Lld1/e;", "a", "(Ltq/e;)Ljava/lang/Object;", "Ljb1/c;", "companyApplication", "Lld1/a;", "c", "(Ljb1/c;Ltq/e;)Ljava/lang/Object;", "", "cmsSignedData", "Ljb1/k;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lhk0/m;", "Lhk0/a;", "Lhk0/e0;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gb1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m getCitizenDataUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hk0.a generateApplicationUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e0 orderApplicationUC;

    /* JADX INFO: renamed from: sc4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4642a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f180158e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180160g;

        C4642a(tq.e<? super C4642a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180158e = obj;
            this.f180160g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f180161d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180163f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180161d = obj;
            this.f180163f |= PKIFailureInfo.systemUnavail;
            return a.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f180165e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180167g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180165e = obj;
            this.f180167g |= PKIFailureInfo.systemUnavail;
            return a.this.b(null, this);
        }
    }

    public a(m mVar, hk0.a aVar, e0 e0Var) {
        this.getCitizenDataUC = mVar;
        this.generateApplicationUC = aVar;
        this.orderApplicationUC = e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gb1.b
    public Object a(tq.e<? super dx.i<? extends dx.b, CompanyApplicationCitizenData>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f180163f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f180163f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f180161d;
        Object objE = uq.b.e();
        int i16 = bVar.f180163f;
        if (i16 == 0) {
            u.b(objC);
            m mVar = this.getCitizenDataUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            bVar.f180163f = 1;
            objC = mVar.c(c1792a, bVar);
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
            return new dx.i.Right(sc4.b.s((BECitizenData) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gb1.b
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, OrderApplication>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f180167g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f180167g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f180165e;
        Object objE = uq.b.e();
        int i16 = cVar.f180167g;
        if (i16 == 0) {
            u.b(objC);
            e0 e0Var = this.orderApplicationUC;
            e0.Params params = new e0.Params(str);
            cVar.f180164d = j.a(str);
            cVar.f180167g = 1;
            objC = e0Var.c(params, cVar);
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
            return new dx.i.Right(sc4.b.p((BEOrderApplicationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gb1.b
    public Object c(CompanyApplication companyApplication, tq.e<? super dx.i<? extends dx.b, ApplicationXml>> eVar) throws Throwable {
        C4642a c4642a;
        if (eVar instanceof C4642a) {
            c4642a = (C4642a) eVar;
            int i15 = c4642a.f180160g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4642a.f180160g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4642a = new C4642a(eVar);
            }
        } else {
            c4642a = new C4642a(eVar);
        }
        Object objC = c4642a.f180158e;
        Object objE = uq.b.e();
        int i16 = c4642a.f180160g;
        if (i16 == 0) {
            u.b(objC);
            hk0.a aVar = this.generateApplicationUC;
            hk0.a.Params params = new hk0.a.Params(sc4.b.t(companyApplication));
            c4642a.f180157d = j.a(companyApplication);
            c4642a.f180160g = 1;
            objC = aVar.c(params, c4642a);
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
            return new dx.i.Right(sc4.b.q((BEGenerateApplicationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}
