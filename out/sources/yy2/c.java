package yy2;

import c74.WKAuthSigningParams;
import dx.i;
import dx.j;
import fr.t;
import iy.b0;
import iy.c0;
import java.time.OffsetDateTime;
import java.util.concurrent.CancellationException;
import my.JWSHeaderData;
import my.JWSPayloadData;
import my.JWSTokenStructure;
import oq.g;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import px.f;
import q34.z0;
import ry.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lyy2/c;", "", "Lyy2/c$a;", "Lmy/f;", "Lq34/z0;", "getPeselFromPersonalIdCertificate", "Lac4/d;", "getCurrentServerTimeUseCase", "Ld74/e;", "parseJWSForEIDUC", "Lez/c;", "dateConverter", "<init>", "(Lq34/z0;Lac4/d;Ld74/e;Lez/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lyy2/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lq34/z0;", "b", "Lac4/d;", "c", "Ld74/e;", "Lez/c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z0 getPeselFromPersonalIdCertificate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.d getCurrentServerTimeUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d74.e parseJWSForEIDUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: yy2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lyy2/c$a;", "Lgz/b$a;", "Lc74/b;", "signingParams", "Liy/b0;", "x509CertString", "<init>", "(Lc74/b;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc74/b;", "()Lc74/b;", "b", "Liy/b0;", "()Liy/b0;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final WKAuthSigningParams signingParams;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 x509CertString;

        public Params(WKAuthSigningParams wKAuthSigningParams, b0 b0Var) {
            this.signingParams = wKAuthSigningParams;
            this.x509CertString = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final WKAuthSigningParams getSigningParams() {
            return this.signingParams;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getX509CertString() {
            return this.x509CertString;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.signingParams, params.signingParams) && t.c(this.x509CertString, params.x509CertString);
        }

        public int hashCode() {
            return (this.signingParams.hashCode() * 31) + this.x509CertString.hashCode();
        }

        public String toString() {
            return "Params(signingParams=" + this.signingParams + ", x509CertString=" + this.x509CertString + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f230819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f230821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f230822g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f230823h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f230824j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f230825k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f230826l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f230827m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f230828n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f230829p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f230830q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f230831r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f230832s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f230833t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f230834v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f230836x;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f230834v = obj;
            this.f230836x |= PKIFailureInfo.systemUnavail;
            return c.this.d(null, this);
        }
    }

    public c(z0 z0Var, ac4.d dVar, d74.e eVar, ez.c cVar) {
        this.getPeselFromPersonalIdCertificate = z0Var;
        this.getCurrentServerTimeUseCase = dVar;
        this.parseJWSForEIDUC = eVar;
        this.dateConverter = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01cb A[Catch: Exception -> 0x0052, c -> 0x0055, CancellationException -> 0x0058, TryCatch #6 {Exception -> 0x0052, blocks: (B:13:0x004d, B:45:0x01c5, B:47:0x01cb, B:49:0x01cf, B:51:0x01df, B:52:0x01e4, B:57:0x01ef, B:58:0x01f7, B:59:0x01f8, B:62:0x0206, B:37:0x00e6, B:39:0x00ec, B:41:0x00f0, B:54:0x01e7, B:55:0x01ec, B:33:0x00a5), top: B:78:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01cf A[Catch: Exception -> 0x0052, c -> 0x0055, CancellationException -> 0x0058, TryCatch #6 {Exception -> 0x0052, blocks: (B:13:0x004d, B:45:0x01c5, B:47:0x01cb, B:49:0x01cf, B:51:0x01df, B:52:0x01e4, B:57:0x01ef, B:58:0x01f7, B:59:0x01f8, B:62:0x0206, B:37:0x00e6, B:39:0x00ec, B:41:0x00f0, B:54:0x01e7, B:55:0x01ec, B:33:0x00a5), top: B:78:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01df A[Catch: Exception -> 0x0052, c -> 0x0055, CancellationException -> 0x0058, TryCatch #6 {Exception -> 0x0052, blocks: (B:13:0x004d, B:45:0x01c5, B:47:0x01cb, B:49:0x01cf, B:51:0x01df, B:52:0x01e4, B:57:0x01ef, B:58:0x01f7, B:59:0x01f8, B:62:0x0206, B:37:0x00e6, B:39:0x00ec, B:41:0x00f0, B:54:0x01e7, B:55:0x01ec, B:33:0x00a5), top: B:78:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public Object d(Params params, tq.e<? super i<? extends dx.b, JWSTokenStructure>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.b bVar2;
        Params params2;
        int i15;
        j<dx.b> jVarA;
        ex.b bVar3;
        ex.b bVar4;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar5;
        i iVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f230836x;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f230836x = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f230834v;
        Object objE = uq.b.e();
        ?? r15 = bVar.f230836x;
        try {
            try {
                if (r15 == 0) {
                    u.b(objC);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    z0 z0Var = this.getPeselFromPersonalIdCertificate;
                    z0.a.CertC509CertString certC509CertString = new z0.a.CertC509CertString(params.getX509CertString());
                    bVar.f230819d = params;
                    bVar.f230820e = jVarA;
                    bVar.f230821f = vq.j.a(aVar);
                    bVar.f230822g = vq.j.a(aVar);
                    bVar.f230823h = aVar;
                    bVar.f230827m = 0;
                    bVar.f230828n = 0;
                    bVar.f230829p = 0;
                    bVar.f230830q = 0;
                    bVar.f230831r = 0;
                    bVar.f230836x = 1;
                    objC = z0Var.c(certC509CertString, bVar);
                    if (objC != objE) {
                        i15 = 0;
                        i19 = 0;
                        i17 = 0;
                        params2 = params;
                        bVar2 = aVar;
                        bVar4 = bVar2;
                        bVar3 = bVar4;
                        i18 = 0;
                        i16 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = bVar.f230831r;
                        int i27 = bVar.f230830q;
                        int i28 = bVar.f230829p;
                        int i29 = bVar.f230828n;
                        int i35 = bVar.f230827m;
                        bVar2 = (ex.b) bVar.f230823h;
                        ex.b bVar6 = (ex.b) bVar.f230822g;
                        ex.b bVar7 = (ex.b) bVar.f230821f;
                        j<dx.b> jVar = (j) bVar.f230820e;
                        params2 = (Params) bVar.f230819d;
                        try {
                            u.b(objC);
                            i15 = i26;
                            jVarA = jVar;
                            bVar3 = bVar7;
                            bVar4 = bVar6;
                            i16 = i35;
                            i17 = i29;
                            i18 = i28;
                            i19 = i27;
                        } catch (ex.c e15) {
                            e = e15;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            f fVar = f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            i iVarA = r15.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof i.Right)) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar5 = (ex.b) bVar.f230823h;
                        u.b(objC);
                    }
                    iVar = (i) objC;
                    if (iVar instanceof i.Left) {
                        bVar2 = bVar5;
                        bVar2.a(iVar);
                        throw new g();
                    }
                    if (iVar instanceof i.Right) {
                        return new i.Right((JWSTokenStructure) ((i.Right) iVar).b());
                    }
                    throw new p();
                } catch (CancellationException e18) {
                    throw e18;
                }
                iVar = (i) objC;
                if (!(iVar instanceof i.Left)) {
                    if (!(iVar instanceof i.Right)) {
                        throw new p();
                    }
                    z0.Result result = (z0.Result) ((i.Right) iVar).b();
                    OffsetDateTime offsetDateTimeA = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                    d74.e eVar2 = this.parseJWSForEIDUC;
                    d74.e.Params params3 = new d74.e.Params(new JWSHeaderData(n.a.b.f176848d, null, v.e(c0.e(params2.getX509CertString())), null, 10, null), new JWSPayloadData("mObywatel", c0.e(result.getPesel()), this.dateConverter.d(offsetDateTimeA.plusSeconds(gu.b.F(params2.getSigningParams().getTokenTtlInSeconds()))), this.dateConverter.d(offsetDateTimeA), new JWSPayloadData.a.Multiple(params2.getSigningParams().f()), null, null, params2.getSigningParams().c(), 96, null));
                    bVar.f230819d = vq.j.a(params2);
                    bVar.f230820e = jVarA;
                    bVar.f230821f = vq.j.a(bVar3);
                    bVar.f230822g = vq.j.a(bVar4);
                    bVar.f230823h = bVar2;
                    bVar.f230824j = vq.j.a(iVar);
                    bVar.f230825k = vq.j.a(result);
                    bVar.f230826l = vq.j.a(offsetDateTimeA);
                    bVar.f230827m = i16;
                    bVar.f230828n = i17;
                    bVar.f230829p = i18;
                    bVar.f230830q = i19;
                    bVar.f230831r = i15;
                    bVar.f230832s = 0;
                    bVar.f230833t = 0;
                    bVar.f230836x = 2;
                    objC = eVar2.c(params3, bVar);
                    if (objC != objE) {
                        bVar5 = bVar2;
                        iVar = (i) objC;
                        if (iVar instanceof i.Left) {
                            if (iVar instanceof i.Right) {
                                return new i.Right((JWSTokenStructure) ((i.Right) iVar).b());
                            }
                            throw new p();
                        }
                        bVar2 = bVar5;
                    }
                    return objE;
                }
                bVar2.a(iVar);
                throw new g();
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
