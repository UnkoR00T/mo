package sc4;

import fk0.BEOrderApplicationResponse;
import hk0.g0;
import hk0.i0;
import jb1.OrderApplication;
import ld1.OrderApplicationSigned;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0019\u0010\u0018J$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lsc4/g;", "Lof1/b;", "Lhk0/c;", "generateResumptionUC", "Lhk0/e;", "generateResumptionV2UC", "Lhk0/g;", "generateSuspensionUC", "Lhk0/i;", "generateSuspensionV2UC", "Lhk0/g0;", "orderResumptionUC", "Lhk0/i0;", "orderSuspensionUC", "Lja1/a;", "isNewCompanyApplicationFeatureFlagActiveUseCase", "<init>", "(Lhk0/c;Lhk0/e;Lhk0/g;Lhk0/i;Lhk0/g0;Lhk0/i0;Lja1/a;)V", "Lpf1/a;", "companyManagementApplication", "Ldx/i;", "Ldx/b;", "Lld1/a;", "a", "(Lpf1/a;Ltq/e;)Ljava/lang/Object;", "c", "Lld1/k;", "orderApplication", "Ljb1/k;", "b", "(Lld1/k;Ltq/e;)Ljava/lang/Object;", "d", "Lhk0/c;", "Lhk0/e;", "Lhk0/g;", "Lhk0/i;", "e", "Lhk0/g0;", "f", "Lhk0/i0;", "g", "Lja1/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements of1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hk0.c generateResumptionUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hk0.e generateResumptionV2UC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hk0.g generateSuspensionUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hk0.i generateSuspensionV2UC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g0 orderResumptionUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i0 orderSuspensionUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ja1.a isNewCompanyApplicationFeatureFlagActiveUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f180218e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180220g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180218e = obj;
            this.f180220g |= PKIFailureInfo.systemUnavail;
            return g.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f180222e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180224g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180222e = obj;
            this.f180224g |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f180226e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180228g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180226e = obj;
            this.f180228g |= PKIFailureInfo.systemUnavail;
            return g.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180229d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f180230e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180232g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f180230e = obj;
            this.f180232g |= PKIFailureInfo.systemUnavail;
            return g.this.d(null, this);
        }
    }

    public g(hk0.c cVar, hk0.e eVar, hk0.g gVar, hk0.i iVar, g0 g0Var, i0 i0Var, ja1.a aVar) {
        this.generateResumptionUC = cVar;
        this.generateResumptionV2UC = eVar;
        this.generateSuspensionUC = gVar;
        this.generateSuspensionV2UC = iVar;
        this.orderResumptionUC = g0Var;
        this.orderSuspensionUC = i0Var;
        this.isNewCompanyApplicationFeatureFlagActiveUseCase = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r7 == r1) goto L33;
     */
    @Override // of1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(pf1.CompanyManagementApplication r6, tq.e<? super dx.i<? extends dx.b, ld1.ApplicationXml>> r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc4.g.a(pf1.a, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // of1.b
    public Object b(OrderApplicationSigned orderApplicationSigned, tq.e<? super dx.i<? extends dx.b, OrderApplication>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f180228g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f180228g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f180226e;
        Object objE = uq.b.e();
        int i16 = cVar.f180228g;
        if (i16 == 0) {
            u.b(objC);
            g0 g0Var = this.orderResumptionUC;
            g0.Params params = new g0.Params(orderApplicationSigned.getSignedXml());
            cVar.f180225d = j.a(orderApplicationSigned);
            cVar.f180228g = 1;
            objC = g0Var.c(params, cVar);
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
            return new dx.i.Right(h.t((BEOrderApplicationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r7 == r1) goto L33;
     */
    @Override // of1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(pf1.CompanyManagementApplication r6, tq.e<? super dx.i<? extends dx.b, ld1.ApplicationXml>> r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc4.g.c(pf1.a, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // of1.b
    public Object d(OrderApplicationSigned orderApplicationSigned, tq.e<? super dx.i<? extends dx.b, OrderApplication>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f180232g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f180232g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f180230e;
        Object objE = uq.b.e();
        int i16 = dVar.f180232g;
        if (i16 == 0) {
            u.b(objC);
            i0 i0Var = this.orderSuspensionUC;
            i0.Params params = new i0.Params(orderApplicationSigned.getSignedXml());
            dVar.f180229d = j.a(orderApplicationSigned);
            dVar.f180232g = 1;
            objC = i0Var.c(params, dVar);
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
            return new dx.i.Right(h.t((BEOrderApplicationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}
