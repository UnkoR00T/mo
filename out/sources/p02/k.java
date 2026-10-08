package p02;

import eo0.CentralTokens;
import java.time.OffsetDateTime;
import java.util.concurrent.CancellationException;
import ky.JweHeader;
import my.JWSHeaderData;
import my.JWSPayloadData;
import my.JWSSignerData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import q34.z0;
import qp0.JWSSigningParams;
import ry.CertKeyPair;
import ry.EC;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bBI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lp02/k;", "", "Lp02/k$a;", "Leo0/k;", "Lk02/a;", "electronicDeliveryContainersInteractor", "Lq34/z0;", "getPeselFromPersonalIdCertificate", "Lac4/d;", "getCurrentServerTimeUseCase", "Lly/a;", "jwsSigner", "Lez/c;", "dateConverter", "Ljy/a;", "jweEncrypterStrategy", "Liy/a;", "base64Coder", "Lgo0/j;", "beFetchNativeCentralTokenUC", "<init>", "(Lk02/a;Lq34/z0;Lac4/d;Lly/a;Lez/c;Ljy/a;Liy/a;Lgo0/j;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lp02/k$a;Ltq/e;)Ljava/lang/Object;", "a", "Lk02/a;", "b", "Lq34/z0;", "c", "Lac4/d;", "Lly/a;", "e", "Lez/c;", "f", "Ljy/a;", "g", "Liy/a;", "h", "Lgo0/j;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k02.a electronicDeliveryContainersInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z0 getPeselFromPersonalIdCertificate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.d getCurrentServerTimeUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ly.a jwsSigner;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final jy.a jweEncrypterStrategy;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final go0.j beFetchNativeCentralTokenUC;

    /* JADX INFO: renamed from: p02.k$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp02/k$a;", "Lgz/b$a;", "Lqp0/a;", "jwsSigningParams", "<init>", "(Lqp0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqp0/a;", "()Lqp0/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final JWSSigningParams jwsSigningParams;

        public Params(JWSSigningParams jWSSigningParams) {
            this.jwsSigningParams = jWSSigningParams;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final JWSSigningParams getJwsSigningParams() {
            return this.jwsSigningParams;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.jwsSigningParams, ((Params) other).jwsSigningParams);
        }

        public int hashCode() {
            return this.jwsSigningParams.hashCode();
        }

        public String toString() {
            return "Params(jwsSigningParams=" + this.jwsSigningParams + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151150h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f151151j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f151152k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f151153l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f151154m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f151155n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f151156p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f151157q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f151158r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f151159s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f151160t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f151161v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f151162w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f151163x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f151165z;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151163x = obj;
            this.f151165z |= PKIFailureInfo.systemUnavail;
            return k.this.d(null, this);
        }
    }

    public k(k02.a aVar, z0 z0Var, ac4.d dVar, ly.a aVar2, ez.c cVar, jy.a aVar3, iy.a aVar4, go0.j jVar) {
        this.electronicDeliveryContainersInteractor = aVar;
        this.getPeselFromPersonalIdCertificate = z0Var;
        this.getCurrentServerTimeUseCase = dVar;
        this.jwsSigner = aVar2;
        this.dateConverter = cVar;
        this.jweEncrypterStrategy = aVar3;
        this.base64Coder = aVar4;
        this.beFetchNativeCentralTokenUC = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0491  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x026a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0358  */
    /* JADX WARN: Code duplicated, block: B:78:0x035a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x043b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0461  */
    /* JADX WARN: Code duplicated, block: B:95:0x0472  */
    /* JADX WARN: Code duplicated, block: B:96:0x0480  */
    /* JADX WARN: Code duplicated, block: B:98:0x0484  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, CentralTokens>> eVar) throws Throwable {
        b bVar;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        Params params2;
        int i16;
        dx.j<dx.b> jVarA;
        ex.b bVar2;
        ex.b bVar3;
        ex.b bVar4;
        int i17;
        int i18;
        int i19;
        Params params3;
        ex.b bVar5;
        ex.b bVar6;
        k34.u uVar;
        k34.u uVar2;
        ex.b bVar7;
        dx.j<dx.b> jVar;
        Params params4;
        int i25;
        int i26;
        CertKeyPair certKeyPair;
        int i27;
        String str;
        ex.b bVar8;
        ex.b bVar9;
        String str2;
        int i28;
        Object obj;
        ex.b bVar10;
        int i29;
        z0.Result result;
        OffsetDateTime offsetDateTime;
        int i35;
        int i36;
        k34.u uVar3;
        Object obj2;
        z0.Result result2;
        k34.u uVar4;
        OffsetDateTime offsetDateTimeA;
        ex.b bVar11;
        int i37;
        Object objA;
        CertKeyPair certKeyPair2;
        k34.u uVar5;
        ex.b bVar12;
        String strE;
        Object objC;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i38 = bVar.f151165z;
            if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f151165z = i38 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC2 = bVar.f151163x;
        Object objE = uq.b.e();
        ?? r15 = bVar.f151165z;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objC2);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    k02.a aVar2 = this.electronicDeliveryContainersInteractor;
                    bVar.f151146d = params;
                    bVar.f151147e = jVarA;
                    bVar.f151148f = vq.j.a(aVar);
                    bVar.f151149g = aVar;
                    bVar.f151150h = aVar;
                    i16 = 0;
                    bVar.f151158r = 0;
                    bVar.f151159s = 0;
                    bVar.f151160t = 0;
                    bVar.f151161v = 0;
                    bVar.f151162w = 0;
                    bVar.f151165z = 1;
                    objC2 = k02.a.f(aVar2, false, bVar, 1, null);
                    if (objC2 != objE) {
                        params2 = params;
                        i15 = 0;
                        i19 = 0;
                        i18 = 0;
                        bVar4 = aVar;
                        bVar3 = bVar4;
                        bVar2 = bVar3;
                        i17 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 != 1) {
                        if (r15 == 2) {
                            int i39 = bVar.f151162w;
                            i15 = bVar.f151161v;
                            int i45 = bVar.f151160t;
                            int i46 = bVar.f151159s;
                            int i47 = bVar.f151158r;
                            k34.u uVar6 = (k34.u) bVar.f151151j;
                            ex.b bVar13 = (ex.b) bVar.f151150h;
                            ex.b bVar14 = (ex.b) bVar.f151149g;
                            ex.b bVar15 = (ex.b) bVar.f151148f;
                            dx.j<dx.b> jVar2 = (dx.j) bVar.f151147e;
                            params3 = (Params) bVar.f151146d;
                            try {
                                oq.u.b(objC2);
                                i16 = i39;
                                jVarA = jVar2;
                                bVar5 = bVar15;
                                bVar6 = bVar14;
                                bVar3 = bVar13;
                                uVar = uVar6;
                                i17 = i47;
                                i18 = i46;
                                i19 = i45;
                                certKeyPair2 = (CertKeyPair) bVar3.a((dx.i) objC2);
                                uVar5 = uVar;
                                bVar12 = bVar5;
                                strE = iy.a.e(this.base64Coder, certKeyPair2.getCertificate().getEncoded(), null, 2, null);
                                z0 z0Var = this.getPeselFromPersonalIdCertificate;
                                z0.a.Cert cert = new z0.a.Cert(certKeyPair2.getCertificate());
                                bVar.f151146d = params3;
                                bVar.f151147e = jVarA;
                                bVar.f151148f = vq.j.a(bVar12);
                                bVar.f151149g = bVar6;
                                bVar.f151150h = bVar6;
                                bVar.f151151j = vq.j.a(uVar5);
                                bVar.f151152k = certKeyPair2;
                                bVar.f151153l = strE;
                                bVar.f151158r = i17;
                                bVar.f151159s = i18;
                                bVar.f151160t = i19;
                                bVar.f151161v = i15;
                                bVar.f151162w = i16;
                                bVar.f151165z = 3;
                                objC = z0Var.c(cert, bVar);
                                if (objC != objE) {
                                    uVar2 = uVar5;
                                    str = strE;
                                    i25 = i15;
                                    i26 = i16;
                                    jVar = jVarA;
                                    params4 = params3;
                                    bVar7 = bVar12;
                                    certKeyPair = certKeyPair2;
                                    objC2 = objC;
                                    i27 = i17;
                                    bVar8 = bVar6;
                                    result2 = (z0.Result) bVar8.a((dx.i) objC2);
                                    uVar4 = uVar2;
                                    offsetDateTimeA = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                                    ly.a aVar3 = this.jwsSigner;
                                    ry.n.b.C4515b c4515b = ry.n.b.C4515b.f176854d;
                                    JWSHeaderData jWSHeaderData = new JWSHeaderData(c4515b, null, pq.v.e(str), null, 10, null);
                                    str2 = str;
                                    bVar11 = bVar7;
                                    int i48 = i25;
                                    i37 = i19;
                                    JWSPayloadData jWSPayloadData = new JWSPayloadData("mObywatel", iy.c0.e(result2.getPesel()), this.dateConverter.d(offsetDateTimeA.plusSeconds(gu.b.F(params4.getJwsSigningParams().getTokenTtl()))), this.dateConverter.d(offsetDateTimeA), new JWSPayloadData.a.Multiple(params4.getJwsSigningParams().d()), null, null, v0.f(oq.y.a("challenge", params4.getJwsSigningParams().getChallenge())), 96, null);
                                    JWSSignerData jWSSignerData = new JWSSignerData(certKeyPair.getPrivateKey(), c4515b);
                                    bVar.f151146d = params4;
                                    bVar.f151147e = jVar;
                                    bVar.f151148f = vq.j.a(bVar11);
                                    bVar.f151149g = bVar6;
                                    bVar.f151150h = bVar6;
                                    bVar.f151151j = vq.j.a(uVar4);
                                    bVar.f151152k = vq.j.a(certKeyPair);
                                    bVar.f151153l = vq.j.a(result2);
                                    bVar.f151154m = vq.j.a(str2);
                                    bVar.f151155n = vq.j.a(offsetDateTimeA);
                                    bVar.f151158r = i27;
                                    bVar.f151159s = i18;
                                    bVar.f151160t = i37;
                                    i29 = i48;
                                    bVar.f151161v = i29;
                                    bVar.f151162w = i26;
                                    bVar.f151165z = 4;
                                    objA = aVar3.a(jWSHeaderData, jWSPayloadData, jWSSignerData, bVar);
                                    obj = objE;
                                    if (objA == obj) {
                                        return obj;
                                    }
                                    result = result2;
                                    objC2 = objA;
                                    offsetDateTime = offsetDateTimeA;
                                    bVar10 = bVar6;
                                    bVar9 = bVar11;
                                    i35 = i27;
                                    i36 = i18;
                                    i28 = i37;
                                    uVar3 = uVar4;
                                    iy.b0 b0VarG = iy.c0.g((String) bVar6.a((dx.i) objC2));
                                    Params params5 = params4;
                                    k34.u uVar7 = uVar3;
                                    obj2 = obj;
                                    iy.b0 b0VarG2 = iy.c0.g((String) bVar10.a(this.jweEncrypterStrategy.a(new EC((byte[]) bVar10.a(iy.a.c(this.base64Coder, iy.c0.e(params5.getJwsSigningParams().getEncryptionKey()), null, 2, null))), new JweHeader(ky.d.ECDH_ES_A256KW.getAlg(), ky.a.A256GCM.getEnc(), null, null, iy.c0.e(params5.getJwsSigningParams().getEncryptionKeyId()), "JWT", null, 76, null), new ky.c.JwsObject(iy.c0.e(b0VarG)))));
                                    go0.j jVar3 = this.beFetchNativeCentralTokenUC;
                                    go0.j.Params params6 = new go0.j.Params(b0VarG2);
                                    bVar.f151146d = vq.j.a(params5);
                                    bVar.f151147e = jVar;
                                    bVar.f151148f = vq.j.a(bVar9);
                                    bVar.f151149g = vq.j.a(bVar10);
                                    bVar.f151150h = bVar10;
                                    bVar.f151151j = vq.j.a(uVar7);
                                    bVar.f151152k = vq.j.a(certKeyPair);
                                    bVar.f151153l = vq.j.a(result);
                                    bVar.f151154m = vq.j.a(str2);
                                    bVar.f151155n = vq.j.a(offsetDateTime);
                                    bVar.f151156p = vq.j.a(b0VarG2);
                                    bVar.f151157q = vq.j.a(b0VarG);
                                    bVar.f151158r = i35;
                                    bVar.f151159s = i36;
                                    bVar.f151160t = i28;
                                    bVar.f151161v = i29;
                                    bVar.f151162w = i26;
                                    bVar.f151165z = 5;
                                    objC2 = jVar3.c(params6, bVar);
                                    if (objC2 == obj2) {
                                        return obj2;
                                    }
                                    return new dx.i.Right((CentralTokens) bVar10.a((dx.i) objC2));
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar2;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (r15 != 3) {
                            if (r15 == 4) {
                                int i49 = bVar.f151162w;
                                int i55 = bVar.f151161v;
                                int i56 = bVar.f151160t;
                                int i57 = bVar.f151159s;
                                int i58 = bVar.f151158r;
                                OffsetDateTime offsetDateTime2 = (OffsetDateTime) bVar.f151155n;
                                String str3 = (String) bVar.f151154m;
                                z0.Result result3 = (z0.Result) bVar.f151153l;
                                CertKeyPair certKeyPair3 = (CertKeyPair) bVar.f151152k;
                                k34.u uVar8 = (k34.u) bVar.f151151j;
                                ex.b bVar16 = (ex.b) bVar.f151150h;
                                ex.b bVar17 = (ex.b) bVar.f151149g;
                                bVar9 = (ex.b) bVar.f151148f;
                                dx.j<dx.b> jVar4 = (dx.j) bVar.f151147e;
                                params4 = (Params) bVar.f151146d;
                                try {
                                    oq.u.b(objC2);
                                    str2 = str3;
                                    bVar6 = bVar16;
                                    i28 = i56;
                                    obj = objE;
                                    bVar10 = bVar17;
                                    i29 = i55;
                                    jVar = jVar4;
                                    certKeyPair = certKeyPair3;
                                    result = result3;
                                    offsetDateTime = offsetDateTime2;
                                    i35 = i58;
                                    i36 = i57;
                                    uVar3 = uVar8;
                                    i26 = i49;
                                    iy.b0 b0VarG3 = iy.c0.g((String) bVar6.a((dx.i) objC2));
                                    Params params7 = params4;
                                    k34.u uVar9 = uVar3;
                                    obj2 = obj;
                                    iy.b0 b0VarG4 = iy.c0.g((String) bVar10.a(this.jweEncrypterStrategy.a(new EC((byte[]) bVar10.a(iy.a.c(this.base64Coder, iy.c0.e(params7.getJwsSigningParams().getEncryptionKey()), null, 2, null))), new JweHeader(ky.d.ECDH_ES_A256KW.getAlg(), ky.a.A256GCM.getEnc(), null, null, iy.c0.e(params7.getJwsSigningParams().getEncryptionKeyId()), "JWT", null, 76, null), new ky.c.JwsObject(iy.c0.e(b0VarG3)))));
                                    go0.j jVar5 = this.beFetchNativeCentralTokenUC;
                                    go0.j.Params params8 = new go0.j.Params(b0VarG4);
                                    bVar.f151146d = vq.j.a(params7);
                                    bVar.f151147e = jVar;
                                    bVar.f151148f = vq.j.a(bVar9);
                                    bVar.f151149g = vq.j.a(bVar10);
                                    bVar.f151150h = bVar10;
                                    bVar.f151151j = vq.j.a(uVar9);
                                    bVar.f151152k = vq.j.a(certKeyPair);
                                    bVar.f151153l = vq.j.a(result);
                                    bVar.f151154m = vq.j.a(str2);
                                    bVar.f151155n = vq.j.a(offsetDateTime);
                                    bVar.f151156p = vq.j.a(b0VarG4);
                                    bVar.f151157q = vq.j.a(b0VarG3);
                                    bVar.f151158r = i35;
                                    bVar.f151159s = i36;
                                    bVar.f151160t = i28;
                                    bVar.f151161v = i29;
                                    bVar.f151162w = i26;
                                    bVar.f151165z = 5;
                                    objC2 = jVar5.c(params8, bVar);
                                    if (objC2 == obj2) {
                                        return obj2;
                                    }
                                } catch (ex.c e18) {
                                    e = e18;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                } catch (Exception e25) {
                                    e = e25;
                                    r15 = jVar4;
                                    px.f fVar2 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar2.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            } else {
                                if (r15 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bVar10 = (ex.b) bVar.f151150h;
                                oq.u.b(objC2);
                            }
                            return new dx.i.Right((CentralTokens) bVar10.a((dx.i) objC2));
                        }
                        int i59 = bVar.f151162w;
                        int i65 = bVar.f151161v;
                        int i66 = bVar.f151160t;
                        int i67 = bVar.f151159s;
                        int i68 = bVar.f151158r;
                        String str4 = (String) bVar.f151153l;
                        CertKeyPair certKeyPair4 = (CertKeyPair) bVar.f151152k;
                        uVar2 = (k34.u) bVar.f151151j;
                        ex.b bVar18 = (ex.b) bVar.f151150h;
                        ex.b bVar19 = (ex.b) bVar.f151149g;
                        bVar7 = (ex.b) bVar.f151148f;
                        jVar = (dx.j) bVar.f151147e;
                        params4 = (Params) bVar.f151146d;
                        try {
                            oq.u.b(objC2);
                            i25 = i65;
                            i26 = i59;
                            certKeyPair = certKeyPair4;
                            i27 = i68;
                            i18 = i67;
                            i19 = i66;
                            str = str4;
                            bVar8 = bVar18;
                            bVar6 = bVar19;
                            result2 = (z0.Result) bVar8.a((dx.i) objC2);
                            uVar4 = uVar2;
                            offsetDateTimeA = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                            ly.a aVar4 = this.jwsSigner;
                            ry.n.b.C4515b c4515b2 = ry.n.b.C4515b.f176854d;
                            JWSHeaderData jWSHeaderData2 = new JWSHeaderData(c4515b2, null, pq.v.e(str), null, 10, null);
                            str2 = str;
                            bVar11 = bVar7;
                            int i410 = i25;
                            i37 = i19;
                            JWSPayloadData jWSPayloadData2 = new JWSPayloadData("mObywatel", iy.c0.e(result2.getPesel()), this.dateConverter.d(offsetDateTimeA.plusSeconds(gu.b.F(params4.getJwsSigningParams().getTokenTtl()))), this.dateConverter.d(offsetDateTimeA), new JWSPayloadData.a.Multiple(params4.getJwsSigningParams().d()), null, null, v0.f(oq.y.a("challenge", params4.getJwsSigningParams().getChallenge())), 96, null);
                            JWSSignerData jWSSignerData2 = new JWSSignerData(certKeyPair.getPrivateKey(), c4515b2);
                            bVar.f151146d = params4;
                            bVar.f151147e = jVar;
                            bVar.f151148f = vq.j.a(bVar11);
                            bVar.f151149g = bVar6;
                            bVar.f151150h = bVar6;
                            bVar.f151151j = vq.j.a(uVar4);
                            bVar.f151152k = vq.j.a(certKeyPair);
                            bVar.f151153l = vq.j.a(result2);
                            bVar.f151154m = vq.j.a(str2);
                            bVar.f151155n = vq.j.a(offsetDateTimeA);
                            bVar.f151158r = i27;
                            bVar.f151159s = i18;
                            bVar.f151160t = i37;
                            i29 = i410;
                            bVar.f151161v = i29;
                            bVar.f151162w = i26;
                            bVar.f151165z = 4;
                            objA = aVar4.a(jWSHeaderData2, jWSPayloadData2, jWSSignerData2, bVar);
                            obj = objE;
                            if (objA == obj) {
                                return obj;
                            }
                            result = result2;
                            objC2 = objA;
                            offsetDateTime = offsetDateTimeA;
                            bVar10 = bVar6;
                            bVar9 = bVar11;
                            i35 = i27;
                            i36 = i18;
                            i28 = i37;
                            uVar3 = uVar4;
                            iy.b0 b0VarG5 = iy.c0.g((String) bVar6.a((dx.i) objC2));
                            Params params9 = params4;
                            k34.u uVar10 = uVar3;
                            obj2 = obj;
                            iy.b0 b0VarG6 = iy.c0.g((String) bVar10.a(this.jweEncrypterStrategy.a(new EC((byte[]) bVar10.a(iy.a.c(this.base64Coder, iy.c0.e(params9.getJwsSigningParams().getEncryptionKey()), null, 2, null))), new JweHeader(ky.d.ECDH_ES_A256KW.getAlg(), ky.a.A256GCM.getEnc(), null, null, iy.c0.e(params9.getJwsSigningParams().getEncryptionKeyId()), "JWT", null, 76, null), new ky.c.JwsObject(iy.c0.e(b0VarG5)))));
                            go0.j jVar6 = this.beFetchNativeCentralTokenUC;
                            go0.j.Params params10 = new go0.j.Params(b0VarG6);
                            bVar.f151146d = vq.j.a(params9);
                            bVar.f151147e = jVar;
                            bVar.f151148f = vq.j.a(bVar9);
                            bVar.f151149g = vq.j.a(bVar10);
                            bVar.f151150h = bVar10;
                            bVar.f151151j = vq.j.a(uVar10);
                            bVar.f151152k = vq.j.a(certKeyPair);
                            bVar.f151153l = vq.j.a(result);
                            bVar.f151154m = vq.j.a(str2);
                            bVar.f151155n = vq.j.a(offsetDateTime);
                            bVar.f151156p = vq.j.a(b0VarG6);
                            bVar.f151157q = vq.j.a(b0VarG5);
                            bVar.f151158r = i35;
                            bVar.f151159s = i36;
                            bVar.f151160t = i28;
                            bVar.f151161v = i29;
                            bVar.f151162w = i26;
                            bVar.f151165z = 5;
                            objC2 = jVar6.c(params10, bVar);
                            if (objC2 == obj2) {
                                return obj2;
                            }
                            return new dx.i.Right((CentralTokens) bVar10.a((dx.i) objC2));
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        } catch (Exception e28) {
                            e = e28;
                            r15 = jVar;
                            px.f fVar3 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar3.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    int i69 = bVar.f151162w;
                    i15 = bVar.f151161v;
                    int i75 = bVar.f151160t;
                    int i76 = bVar.f151159s;
                    int i77 = bVar.f151158r;
                    ex.b bVar20 = (ex.b) bVar.f151150h;
                    ex.b bVar21 = (ex.b) bVar.f151149g;
                    ex.b bVar22 = (ex.b) bVar.f151148f;
                    dx.j<dx.b> jVar7 = (dx.j) bVar.f151147e;
                    params2 = (Params) bVar.f151146d;
                    try {
                        oq.u.b(objC2);
                        i16 = i69;
                        jVarA = jVar7;
                        bVar2 = bVar22;
                        bVar3 = bVar21;
                        bVar4 = bVar20;
                        i17 = i77;
                        i18 = i76;
                        i19 = i75;
                    } catch (ex.c e29) {
                        e = e29;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e35) {
                        throw e35;
                    } catch (Exception e36) {
                        e = e36;
                        r15 = jVar7;
                        px.f fVar4 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar4.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (CancellationException e37) {
                    throw e37;
                }
                k34.u uVar11 = (k34.u) bVar4.a((dx.i) objC2);
                k02.a aVar5 = this.electronicDeliveryContainersInteractor;
                bVar.f151146d = params2;
                bVar.f151147e = jVarA;
                bVar.f151148f = vq.j.a(bVar2);
                bVar.f151149g = bVar3;
                bVar.f151150h = bVar3;
                bVar.f151151j = vq.j.a(uVar11);
                bVar.f151158r = i17;
                bVar.f151159s = i18;
                bVar.f151160t = i19;
                bVar.f151161v = i15;
                bVar.f151162w = i16;
                bVar.f151165z = 2;
                Object objB2 = aVar5.b(uVar11, bVar);
                if (objB2 != objE) {
                    uVar = uVar11;
                    objC2 = objB2;
                    params3 = params2;
                    bVar5 = bVar2;
                    bVar6 = bVar3;
                    certKeyPair2 = (CertKeyPair) bVar3.a((dx.i) objC2);
                    uVar5 = uVar;
                    bVar12 = bVar5;
                    strE = iy.a.e(this.base64Coder, certKeyPair2.getCertificate().getEncoded(), null, 2, null);
                    z0 z0Var2 = this.getPeselFromPersonalIdCertificate;
                    z0.a.Cert cert2 = new z0.a.Cert(certKeyPair2.getCertificate());
                    bVar.f151146d = params3;
                    bVar.f151147e = jVarA;
                    bVar.f151148f = vq.j.a(bVar12);
                    bVar.f151149g = bVar6;
                    bVar.f151150h = bVar6;
                    bVar.f151151j = vq.j.a(uVar5);
                    bVar.f151152k = certKeyPair2;
                    bVar.f151153l = strE;
                    bVar.f151158r = i17;
                    bVar.f151159s = i18;
                    bVar.f151160t = i19;
                    bVar.f151161v = i15;
                    bVar.f151162w = i16;
                    bVar.f151165z = 3;
                    objC = z0Var2.c(cert2, bVar);
                    if (objC != objE) {
                        uVar2 = uVar5;
                        str = strE;
                        i25 = i15;
                        i26 = i16;
                        jVar = jVarA;
                        params4 = params3;
                        bVar7 = bVar12;
                        certKeyPair = certKeyPair2;
                        objC2 = objC;
                        i27 = i17;
                        bVar8 = bVar6;
                        result2 = (z0.Result) bVar8.a((dx.i) objC2);
                        uVar4 = uVar2;
                        offsetDateTimeA = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                        ly.a aVar6 = this.jwsSigner;
                        ry.n.b.C4515b c4515b3 = ry.n.b.C4515b.f176854d;
                        JWSHeaderData jWSHeaderData3 = new JWSHeaderData(c4515b3, null, pq.v.e(str), null, 10, null);
                        str2 = str;
                        bVar11 = bVar7;
                        int i411 = i25;
                        i37 = i19;
                        JWSPayloadData jWSPayloadData3 = new JWSPayloadData("mObywatel", iy.c0.e(result2.getPesel()), this.dateConverter.d(offsetDateTimeA.plusSeconds(gu.b.F(params4.getJwsSigningParams().getTokenTtl()))), this.dateConverter.d(offsetDateTimeA), new JWSPayloadData.a.Multiple(params4.getJwsSigningParams().d()), null, null, v0.f(oq.y.a("challenge", params4.getJwsSigningParams().getChallenge())), 96, null);
                        JWSSignerData jWSSignerData3 = new JWSSignerData(certKeyPair.getPrivateKey(), c4515b3);
                        bVar.f151146d = params4;
                        bVar.f151147e = jVar;
                        bVar.f151148f = vq.j.a(bVar11);
                        bVar.f151149g = bVar6;
                        bVar.f151150h = bVar6;
                        bVar.f151151j = vq.j.a(uVar4);
                        bVar.f151152k = vq.j.a(certKeyPair);
                        bVar.f151153l = vq.j.a(result2);
                        bVar.f151154m = vq.j.a(str2);
                        bVar.f151155n = vq.j.a(offsetDateTimeA);
                        bVar.f151158r = i27;
                        bVar.f151159s = i18;
                        bVar.f151160t = i37;
                        i29 = i411;
                        bVar.f151161v = i29;
                        bVar.f151162w = i26;
                        bVar.f151165z = 4;
                        objA = aVar6.a(jWSHeaderData3, jWSPayloadData3, jWSSignerData3, bVar);
                        obj = objE;
                        if (objA == obj) {
                            return obj;
                        }
                        result = result2;
                        objC2 = objA;
                        offsetDateTime = offsetDateTimeA;
                        bVar10 = bVar6;
                        bVar9 = bVar11;
                        i35 = i27;
                        i36 = i18;
                        i28 = i37;
                        uVar3 = uVar4;
                        iy.b0 b0VarG7 = iy.c0.g((String) bVar6.a((dx.i) objC2));
                        Params params11 = params4;
                        k34.u uVar12 = uVar3;
                        obj2 = obj;
                        iy.b0 b0VarG8 = iy.c0.g((String) bVar10.a(this.jweEncrypterStrategy.a(new EC((byte[]) bVar10.a(iy.a.c(this.base64Coder, iy.c0.e(params11.getJwsSigningParams().getEncryptionKey()), null, 2, null))), new JweHeader(ky.d.ECDH_ES_A256KW.getAlg(), ky.a.A256GCM.getEnc(), null, null, iy.c0.e(params11.getJwsSigningParams().getEncryptionKeyId()), "JWT", null, 76, null), new ky.c.JwsObject(iy.c0.e(b0VarG7)))));
                        go0.j jVar8 = this.beFetchNativeCentralTokenUC;
                        go0.j.Params params12 = new go0.j.Params(b0VarG8);
                        bVar.f151146d = vq.j.a(params11);
                        bVar.f151147e = jVar;
                        bVar.f151148f = vq.j.a(bVar9);
                        bVar.f151149g = vq.j.a(bVar10);
                        bVar.f151150h = bVar10;
                        bVar.f151151j = vq.j.a(uVar12);
                        bVar.f151152k = vq.j.a(certKeyPair);
                        bVar.f151153l = vq.j.a(result);
                        bVar.f151154m = vq.j.a(str2);
                        bVar.f151155n = vq.j.a(offsetDateTime);
                        bVar.f151156p = vq.j.a(b0VarG8);
                        bVar.f151157q = vq.j.a(b0VarG7);
                        bVar.f151158r = i35;
                        bVar.f151159s = i36;
                        bVar.f151160t = i28;
                        bVar.f151161v = i29;
                        bVar.f151162w = i26;
                        bVar.f151165z = 5;
                        objC2 = jVar8.c(params12, bVar);
                        if (objC2 == obj2) {
                            return obj2;
                        }
                        return new dx.i.Right((CentralTokens) bVar10.a((dx.i) objC2));
                    }
                }
                return objE;
            } catch (Exception e38) {
                e = e38;
            }
        } catch (ex.c e39) {
            e = e39;
        } catch (CancellationException e45) {
            throw e45;
        }
    }
}
