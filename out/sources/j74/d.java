package j74;

import dx.i;
import g74.WKAuthData;
import iy.c0;
import java.time.OffsetDateTime;
import my.JWSHeaderData;
import my.JWSPayloadData;
import my.JWSTokenStructure;
import oq.p;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import q34.z0;
import qp0.JWSSigningParams;
import ry.n;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lj74/d;", "Ld74/c;", "Lg74/b;", "dataSource", "Lac4/d;", "getCurrentServerTimeUseCase", "Lq34/z0;", "getPeselFromPersonalIdCertificate", "Lrp0/a;", "getJWSSigningParamsUC", "Ld74/e;", "parseJWSForEIDUC", "Lez/c;", "dateConverter", "<init>", "(Lg74/b;Lac4/d;Lq34/z0;Lrp0/a;Ld74/e;Lez/c;)V", "Ld74/c$a;", "params", "Ldx/i;", "Ldx/b;", "Lmy/f$a;", "d", "(Ld74/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lg74/b;", "b", "Lac4/d;", "c", "Lq34/z0;", "Lrp0/a;", "e", "Ld74/e;", "f", "Lez/c;", "wk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements d74.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g74.b dataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.d getCurrentServerTimeUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z0 getPeselFromPersonalIdCertificate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final rp0.a getJWSSigningParamsUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d74.e parseJWSForEIDUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f99954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f99955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f99956f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f99957g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f99958h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f99959j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f99960k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f99961l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f99962m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f99963n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f99964p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99966r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f99964p = obj;
            this.f99966r |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(g74.b bVar, ac4.d dVar, z0 z0Var, rp0.a aVar, d74.e eVar, ez.c cVar) {
        this.dataSource = bVar;
        this.getCurrentServerTimeUseCase = dVar;
        this.getPeselFromPersonalIdCertificate = z0Var;
        this.getJWSSigningParamsUC = aVar;
        this.parseJWSForEIDUC = eVar;
        this.dateConverter = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x018e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0195 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0196  */
    /* JADX WARN: Code duplicated, block: B:45:0x019a  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(d74.c.Params params, tq.e<? super i<? extends dx.b, JWSTokenStructure.a>> eVar) throws Throwable {
        a aVar;
        d74.c.Params params2;
        i iVar;
        JWSSigningParams jWSSigningParams;
        d74.c.Params params3;
        int i15;
        int i16;
        i iVar2;
        JWSSigningParams jWSSigningParams2;
        i iVar3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i17 = aVar.f99966r;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f99966r = i17 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f99964p;
        Object objE = uq.b.e();
        int i18 = aVar.f99966r;
        if (i18 == 0) {
            u.b(objC);
            rp0.a aVar2 = this.getJWSSigningParamsUC;
            rp0.a.Params params4 = new rp0.a.Params(i74.a.a(params.getProcessType()));
            aVar.f99954d = params;
            aVar.f99966r = 1;
            objC = aVar2.c(params4, aVar);
            if (objC != objE) {
                params2 = params;
            }
            return objE;
        }
        if (i18 == 1) {
            params2 = (d74.c.Params) aVar.f99954d;
            u.b(objC);
        } else {
            if (i18 == 2) {
                i15 = aVar.f99961l;
                i16 = aVar.f99960k;
                jWSSigningParams = (JWSSigningParams) aVar.f99956f;
                iVar = (i) aVar.f99955e;
                params3 = (d74.c.Params) aVar.f99954d;
                u.b(objC);
                iVar2 = (i) objC;
                if (iVar2 instanceof i.Left) {
                    return iVar2;
                }
                if (iVar2 instanceof i.Right) {
                    throw new p();
                }
                z0.Result result = (z0.Result) ((i.Right) iVar2).b();
                OffsetDateTime offsetDateTimeA = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                d74.e eVar2 = this.parseJWSForEIDUC;
                d74.e.Params params5 = new d74.e.Params(new JWSHeaderData(n.a.b.f176848d, null, v.e(c0.e(params3.getX509CertString())), null, 10, null), new JWSPayloadData("mObywatel", c0.e(result.getPesel()), this.dateConverter.d(offsetDateTimeA.plusSeconds(gu.b.F(jWSSigningParams.getTokenTtl()))), this.dateConverter.d(offsetDateTimeA), new JWSPayloadData.a.Multiple(jWSSigningParams.d()), null, null, v0.f(y.a("challenge", jWSSigningParams.getChallenge())), 96, null));
                aVar.f99954d = j.a(params3);
                aVar.f99955e = j.a(iVar);
                aVar.f99956f = jWSSigningParams;
                aVar.f99957g = j.a(iVar2);
                aVar.f99958h = j.a(result);
                aVar.f99959j = j.a(offsetDateTimeA);
                aVar.f99960k = i16;
                aVar.f99961l = i15;
                aVar.f99962m = 0;
                aVar.f99963n = 0;
                aVar.f99966r = 3;
                objC = eVar2.c(params5, aVar);
                if (objC != objE) {
                    jWSSigningParams2 = jWSSigningParams;
                }
                return objE;
            }
            if (i18 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jWSSigningParams2 = (JWSSigningParams) aVar.f99956f;
            u.b(objC);
        }
        iVar3 = (i) objC;
        if (iVar3 instanceof i.Left) {
            return iVar3;
        }
        if (iVar3 instanceof i.Right) {
            throw new p();
        }
        JWSTokenStructure jWSTokenStructure = (JWSTokenStructure) ((i.Right) iVar3).b();
        this.dataSource.b(new WKAuthData(jWSSigningParams2.getEncryptionKey(), jWSSigningParams2.getEncryptionKeyId(), jWSTokenStructure));
        return new i.Right(JWSTokenStructure.a.a(jWSTokenStructure.getContentSha384()));
        iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        JWSSigningParams jWSSigningParams3 = (JWSSigningParams) ((i.Right) iVar).b();
        z0 z0Var = this.getPeselFromPersonalIdCertificate;
        z0.a.CertC509CertString certC509CertString = new z0.a.CertC509CertString(params2.getX509CertString());
        aVar.f99954d = params2;
        aVar.f99955e = j.a(iVar);
        aVar.f99956f = jWSSigningParams3;
        aVar.f99960k = 0;
        aVar.f99961l = 0;
        aVar.f99966r = 2;
        Object objC2 = z0Var.c(certC509CertString, aVar);
        if (objC2 != objE) {
            jWSSigningParams = jWSSigningParams3;
            params3 = params2;
            objC = objC2;
            i15 = 0;
            i16 = 0;
            iVar2 = (i) objC;
            if (iVar2 instanceof i.Left) {
                return iVar2;
            }
            if (iVar2 instanceof i.Right) {
                throw new p();
            }
            z0.Result result2 = (z0.Result) ((i.Right) iVar2).b();
            OffsetDateTime offsetDateTimeA2 = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
            d74.e eVar3 = this.parseJWSForEIDUC;
            d74.e.Params params6 = new d74.e.Params(new JWSHeaderData(n.a.b.f176848d, null, v.e(c0.e(params3.getX509CertString())), null, 10, null), new JWSPayloadData("mObywatel", c0.e(result2.getPesel()), this.dateConverter.d(offsetDateTimeA2.plusSeconds(gu.b.F(jWSSigningParams.getTokenTtl()))), this.dateConverter.d(offsetDateTimeA2), new JWSPayloadData.a.Multiple(jWSSigningParams.d()), null, null, v0.f(y.a("challenge", jWSSigningParams.getChallenge())), 96, null));
            aVar.f99954d = j.a(params3);
            aVar.f99955e = j.a(iVar);
            aVar.f99956f = jWSSigningParams;
            aVar.f99957g = j.a(iVar2);
            aVar.f99958h = j.a(result2);
            aVar.f99959j = j.a(offsetDateTimeA2);
            aVar.f99960k = i16;
            aVar.f99961l = i15;
            aVar.f99962m = 0;
            aVar.f99963n = 0;
            aVar.f99966r = 3;
            objC = eVar3.c(params6, aVar);
            if (objC != objE) {
                jWSSigningParams2 = jWSSigningParams;
                iVar3 = (i) objC;
                if (iVar3 instanceof i.Left) {
                    return iVar3;
                }
                if (iVar3 instanceof i.Right) {
                    throw new p();
                }
                JWSTokenStructure jWSTokenStructure2 = (JWSTokenStructure) ((i.Right) iVar3).b();
                this.dataSource.b(new WKAuthData(jWSSigningParams2.getEncryptionKey(), jWSSigningParams2.getEncryptionKeyId(), jWSTokenStructure2));
                return new i.Right(JWSTokenStructure.a.a(jWSTokenStructure2.getContentSha384()));
            }
        }
        return objE;
    }
}
