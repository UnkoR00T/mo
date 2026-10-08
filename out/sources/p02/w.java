package p02;

import eo0.CentralTokens;
import eo0.OwnerAddress;
import jb4.PayloadErrorData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lp02/w;", "", "Lgz/b$a$a;", "Leo0/j0;", "Ls02/a;", "getCentralAccessTokenUseCase", "Lp02/l0;", "saveOwnerAddressUC", "Lgo0/y;", "getOwnerAddressUC", "Lj02/a;", "electronicDeliveryDataSource", "<init>", "(Ls02/a;Lp02/l0;Lgo0/y;Lj02/a;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ls02/a;", "b", "Lp02/l0;", "c", "Lgo0/y;", "d", "Lj02/a;", "e", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements gz.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f151456f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dx.b.Business f151457g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s02.a getCentralAccessTokenUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0 saveOwnerAddressUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final go0.y getOwnerAddressUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j02.a electronicDeliveryDataSource;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151464f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151465g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151466h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f151467j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151468k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151469l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151470m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f151471n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f151473q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151471n = obj;
            this.f151473q |= PKIFailureInfo.systemUnavail;
            return w.this.a(null, this);
        }
    }

    static {
        n02.a aVar = n02.a.REFRESH_TOKEN_EXPIRED;
        Label.Companion companion = Label.INSTANCE;
        f151457g = new dx.b.Business(aVar, null, companion.c(), null, null, companion.c(), null, 90, null);
    }

    public w(s02.a aVar, l0 l0Var, go0.y yVar, j02.a aVar2) {
        this.getCentralAccessTokenUseCase = aVar;
        this.saveOwnerAddressUC = l0Var;
        this.getOwnerAddressUC = yVar;
        this.electronicDeliveryDataSource = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x0105  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x011b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:58:0x012f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x016e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0175  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, OwnerAddress>> eVar) throws Throwable {
        b bVar;
        gz.b.a.C1792a c1792a2;
        dx.i iVar;
        CentralTokens.Access access;
        CentralTokens.Access access2;
        int i15;
        int i16;
        dx.i iVar2;
        OwnerAddress ownerAddress;
        l0 l0Var;
        l0.Params params;
        OwnerAddress ownerAddress2;
        dx.b bVar2;
        dx.b.g.Http http;
        PayloadErrorData payloadErrorData;
        String code;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i17 = bVar.f151473q;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f151473q = i17 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objH = bVar.f151471n;
        Object objE = uq.b.e();
        int i18 = bVar.f151473q;
        if (i18 == 0) {
            oq.u.b(objH);
            j02.a aVar = this.electronicDeliveryDataSource;
            bVar.f151462d = vq.j.a(c1792a);
            bVar.f151473q = 1;
            objH = aVar.h(bVar);
            if (objH != objE) {
            }
            return objE;
        }
        if (i18 == 1) {
            c1792a = (gz.b.a.C1792a) bVar.f151462d;
            oq.u.b(objH);
        } else {
            if (i18 == 2) {
                c1792a = (gz.b.a.C1792a) bVar.f151462d;
                oq.u.b(objH);
                c1792a2 = c1792a;
                iVar = (dx.i) objH;
                if (iVar instanceof dx.i.Left) {
                    return iVar;
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                access = (CentralTokens.Access) ((dx.i.Right) iVar).b();
                go0.y yVar = this.getOwnerAddressUC;
                go0.y.Params params2 = new go0.y.Params(access);
                bVar.f151462d = vq.j.a(c1792a2);
                bVar.f151463e = vq.j.a(iVar);
                bVar.f151464f = vq.j.a(access);
                bVar.f151467j = 0;
                bVar.f151468k = 0;
                bVar.f151473q = 3;
                objH = yVar.c(params2, bVar);
                if (objH != objE) {
                    access2 = access;
                    i15 = 0;
                    i16 = 0;
                    iVar2 = (dx.i) objH;
                    if (iVar2 instanceof dx.i.Left) {
                        bVar2 = (dx.b) ((dx.i.Left) iVar2).b();
                        if (bVar2 instanceof dx.b.g.Http) {
                            http = (dx.b.g.Http) bVar2;
                            if (http.getCode() == dx.b.g.Http.a.BAD_REQUEST) {
                                payloadErrorData = (PayloadErrorData) http.b();
                                if (payloadErrorData != null) {
                                    code = payloadErrorData.getCode();
                                } else {
                                    code = null;
                                }
                                if (fr.t.c(code, "EDELIVERY_SERVICE_UNAUTHORIZED")) {
                                }
                            }
                        }
                        return new dx.i.Left(bVar2);
                    }
                    if (!(iVar2 instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    ownerAddress = (OwnerAddress) ((dx.i.Right) iVar2).b();
                    l0Var = this.saveOwnerAddressUC;
                    params = new l0.Params(ownerAddress);
                    bVar.f151462d = vq.j.a(c1792a2);
                    bVar.f151463e = vq.j.a(iVar);
                    bVar.f151464f = vq.j.a(access2);
                    bVar.f151465g = vq.j.a(iVar2);
                    bVar.f151466h = ownerAddress;
                    bVar.f151467j = i16;
                    bVar.f151468k = i15;
                    bVar.f151469l = 0;
                    bVar.f151470m = 0;
                    bVar.f151473q = 4;
                    if (l0Var.d(params, bVar) != objE) {
                        ownerAddress2 = ownerAddress;
                    }
                }
                return objE;
            }
            if (i18 == 3) {
                i15 = bVar.f151468k;
                i16 = bVar.f151467j;
                access2 = (CentralTokens.Access) bVar.f151464f;
                iVar = (dx.i) bVar.f151463e;
                c1792a2 = (gz.b.a.C1792a) bVar.f151462d;
                oq.u.b(objH);
                iVar2 = (dx.i) objH;
                if (iVar2 instanceof dx.i.Left) {
                    bVar2 = (dx.b) ((dx.i.Left) iVar2).b();
                    if (bVar2 instanceof dx.b.g.Http) {
                        http = (dx.b.g.Http) bVar2;
                        if (http.getCode() == dx.b.g.Http.a.BAD_REQUEST) {
                            payloadErrorData = (PayloadErrorData) http.b();
                            if (payloadErrorData != null) {
                                code = payloadErrorData.getCode();
                            } else {
                                code = null;
                            }
                            return fr.t.c(code, "EDELIVERY_SERVICE_UNAUTHORIZED") ? new dx.i.Left(f151457g) : new dx.i.Left(bVar2);
                        }
                    }
                    return new dx.i.Left(bVar2);
                }
                if (!(iVar2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                ownerAddress = (OwnerAddress) ((dx.i.Right) iVar2).b();
                l0Var = this.saveOwnerAddressUC;
                params = new l0.Params(ownerAddress);
                bVar.f151462d = vq.j.a(c1792a2);
                bVar.f151463e = vq.j.a(iVar);
                bVar.f151464f = vq.j.a(access2);
                bVar.f151465g = vq.j.a(iVar2);
                bVar.f151466h = ownerAddress;
                bVar.f151467j = i16;
                bVar.f151468k = i15;
                bVar.f151469l = 0;
                bVar.f151470m = 0;
                bVar.f151473q = 4;
                if (l0Var.d(params, bVar) != objE) {
                    ownerAddress2 = ownerAddress;
                }
                return objE;
            }
            if (i18 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ownerAddress2 = (OwnerAddress) bVar.f151466h;
            oq.u.b(objH);
        }
        return new dx.i.Right(ownerAddress2);
        OwnerAddress ownerAddress3 = (OwnerAddress) objH;
        if (ownerAddress3 != null) {
            return new dx.i.Right(ownerAddress3);
        }
        s02.a aVar2 = this.getCentralAccessTokenUseCase;
        gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
        bVar.f151462d = vq.j.a(c1792a);
        bVar.f151473q = 2;
        objH = aVar2.a(c1792a3, bVar);
        if (objH != objE) {
            c1792a2 = c1792a;
            iVar = (dx.i) objH;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                throw new oq.p();
            }
            access = (CentralTokens.Access) ((dx.i.Right) iVar).b();
            go0.y yVar2 = this.getOwnerAddressUC;
            go0.y.Params params3 = new go0.y.Params(access);
            bVar.f151462d = vq.j.a(c1792a2);
            bVar.f151463e = vq.j.a(iVar);
            bVar.f151464f = vq.j.a(access);
            bVar.f151467j = 0;
            bVar.f151468k = 0;
            bVar.f151473q = 3;
            objH = yVar2.c(params3, bVar);
            if (objH != objE) {
                access2 = access;
                i15 = 0;
                i16 = 0;
                iVar2 = (dx.i) objH;
                if (iVar2 instanceof dx.i.Left) {
                    bVar2 = (dx.b) ((dx.i.Left) iVar2).b();
                    if (bVar2 instanceof dx.b.g.Http) {
                        http = (dx.b.g.Http) bVar2;
                        if (http.getCode() == dx.b.g.Http.a.BAD_REQUEST) {
                            payloadErrorData = (PayloadErrorData) http.b();
                            if (payloadErrorData != null) {
                                code = payloadErrorData.getCode();
                            } else {
                                code = null;
                            }
                            if (fr.t.c(code, "EDELIVERY_SERVICE_UNAUTHORIZED")) {
                            }
                        }
                    }
                    return new dx.i.Left(bVar2);
                }
                if (!(iVar2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                ownerAddress = (OwnerAddress) ((dx.i.Right) iVar2).b();
                l0Var = this.saveOwnerAddressUC;
                params = new l0.Params(ownerAddress);
                bVar.f151462d = vq.j.a(c1792a2);
                bVar.f151463e = vq.j.a(iVar);
                bVar.f151464f = vq.j.a(access2);
                bVar.f151465g = vq.j.a(iVar2);
                bVar.f151466h = ownerAddress;
                bVar.f151467j = i16;
                bVar.f151468k = i15;
                bVar.f151469l = 0;
                bVar.f151470m = 0;
                bVar.f151473q = 4;
                if (l0Var.d(params, bVar) != objE) {
                    ownerAddress2 = ownerAddress;
                    return new dx.i.Right(ownerAddress2);
                }
            }
        }
        return objE;
    }
}
