package rv3;

import dx.i;
import dx.j;
import fr.t;
import iy.b0;
import iy.c0;
import java.security.cert.X509Certificate;
import java.time.OffsetDateTime;
import java.util.concurrent.CancellationException;
import ky.JweHeader;
import my.JWSHeaderData;
import my.JWSPayloadData;
import my.JWSSignerData;
import oq.p;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ov3.CentralTokens;
import ov3.JWSSigningParams;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import ry.CertKeyPair;
import ry.EC;
import ry.n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lrv3/b;", "", "Lrv3/b$a;", "Lov3/c;", "Lnv3/b;", "edorAuthSegmentContainersInteractor", "Lac4/d;", "getCurrentServerTimeUseCase", "Lly/a;", "jwsSigner", "Lez/c;", "dateConverter", "Ljy/a;", "jweEncrypterStrategy", "Liy/a;", "base64Coder", "Lnv3/a;", "backendInteractor", "<init>", "(Lnv3/b;Lac4/d;Lly/a;Lez/c;Ljy/a;Liy/a;Lnv3/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lrv3/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lnv3/b;", "b", "Lac4/d;", "c", "Lly/a;", "Lez/c;", "e", "Ljy/a;", "f", "Liy/a;", "g", "Lnv3/a;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nv3.b edorAuthSegmentContainersInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.d getCurrentServerTimeUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ly.a jwsSigner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final jy.a jweEncrypterStrategy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final nv3.a backendInteractor;

    /* JADX INFO: renamed from: rv3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrv3/b$a;", "Lgz/b$a;", "Lov3/f;", "jwsSigningParams", "<init>", "(Lov3/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lov3/f;", "()Lov3/f;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            return (other instanceof Params) && t.c(this.jwsSigningParams, ((Params) other).jwsSigningParams);
        }

        public int hashCode() {
            return this.jwsSigningParams.hashCode();
        }

        public String toString() {
            return "Params(jwsSigningParams=" + this.jwsSigningParams + ')';
        }
    }

    /* JADX INFO: renamed from: rv3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4503b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f176481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f176482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f176483f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f176484g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f176485h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f176486j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f176487k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f176488l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f176489m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f176490n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f176491p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f176492q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f176493r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f176494s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f176495t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f176496v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f176497w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f176498x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f176500z;

        C4503b(tq.e<? super C4503b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f176498x = obj;
            this.f176500z |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    public b(nv3.b bVar, ac4.d dVar, ly.a aVar, ez.c cVar, jy.a aVar2, iy.a aVar3, nv3.a aVar4) {
        this.edorAuthSegmentContainersInteractor = bVar;
        this.getCurrentServerTimeUseCase = dVar;
        this.jwsSigner = aVar;
        this.dateConverter = cVar;
        this.jweEncrypterStrategy = aVar2;
        this.base64Coder = aVar3;
        this.backendInteractor = aVar4;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0487  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0265  */
    /* JADX WARN: Code duplicated, block: B:77:0x0353  */
    /* JADX WARN: Code duplicated, block: B:78:0x0355  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x0431  */
    /* JADX WARN: Code duplicated, block: B:92:0x0457  */
    /* JADX WARN: Code duplicated, block: B:95:0x0468  */
    /* JADX WARN: Code duplicated, block: B:96:0x0476  */
    /* JADX WARN: Code duplicated, block: B:98:0x047a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public Object d(Params params, tq.e<? super i<? extends dx.b, CentralTokens>> eVar) {
        C4503b c4503b;
        String message;
        i iVarA;
        Object objB;
        int i15;
        Params params2;
        int i16;
        j<dx.b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i17;
        int i18;
        int i19;
        Params params3;
        ex.b bVar4;
        ex.b bVar5;
        pv3.a aVar;
        pv3.a aVar2;
        ex.b bVar6;
        j<dx.b> jVar;
        Params params4;
        int i25;
        int i26;
        CertKeyPair certKeyPair;
        int i27;
        String str;
        ex.b bVar7;
        ex.b bVar8;
        String str2;
        int i28;
        Object obj;
        ex.b bVar9;
        int i29;
        b0 b0Var;
        OffsetDateTime offsetDateTime;
        int i35;
        int i36;
        pv3.a aVar3;
        Object obj2;
        b0 value;
        pv3.a aVar4;
        OffsetDateTime offsetDateTimeA;
        ex.b bVar10;
        int i37;
        Object objA;
        CertKeyPair certKeyPair2;
        pv3.a aVar5;
        ex.b bVar11;
        String strE;
        Object objB2;
        if (eVar instanceof C4503b) {
            c4503b = (C4503b) eVar;
            int i38 = c4503b.f176500z;
            if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                c4503b.f176500z = i38 - PKIFailureInfo.systemUnavail;
            } else {
                c4503b = new C4503b(eVar);
            }
        } else {
            c4503b = new C4503b(eVar);
        }
        Object objD = c4503b.f176498x;
        Object objE = uq.b.e();
        ?? r15 = c4503b.f176500z;
        try {
            try {
                if (r15 == 0) {
                    u.b(objD);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar6 = new ex.a();
                    nv3.b bVar12 = this.edorAuthSegmentContainersInteractor;
                    c4503b.f176481d = params;
                    c4503b.f176482e = jVarA;
                    c4503b.f176483f = vq.j.a(aVar6);
                    c4503b.f176484g = aVar6;
                    c4503b.f176485h = aVar6;
                    i16 = 0;
                    c4503b.f176493r = 0;
                    c4503b.f176494s = 0;
                    c4503b.f176495t = 0;
                    c4503b.f176496v = 0;
                    c4503b.f176497w = 0;
                    c4503b.f176500z = 1;
                    objD = nv3.b.d(bVar12, false, c4503b, 1, null);
                    if (objD != objE) {
                        params2 = params;
                        i15 = 0;
                        i19 = 0;
                        i18 = 0;
                        bVar3 = aVar6;
                        bVar2 = bVar3;
                        bVar = bVar2;
                        i17 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 != 1) {
                        if (r15 == 2) {
                            int i39 = c4503b.f176497w;
                            i15 = c4503b.f176496v;
                            int i45 = c4503b.f176495t;
                            int i46 = c4503b.f176494s;
                            int i47 = c4503b.f176493r;
                            pv3.a aVar7 = (pv3.a) c4503b.f176486j;
                            ex.b bVar13 = (ex.b) c4503b.f176485h;
                            ex.b bVar14 = (ex.b) c4503b.f176484g;
                            ex.b bVar15 = (ex.b) c4503b.f176483f;
                            j<dx.b> jVar2 = (j) c4503b.f176482e;
                            params3 = (Params) c4503b.f176481d;
                            try {
                                u.b(objD);
                                i16 = i39;
                                jVarA = jVar2;
                                bVar4 = bVar15;
                                bVar5 = bVar14;
                                bVar2 = bVar13;
                                aVar = aVar7;
                                i17 = i47;
                                i18 = i46;
                                i19 = i45;
                                certKeyPair2 = (CertKeyPair) bVar2.a((i) objD);
                                aVar5 = aVar;
                                bVar11 = bVar4;
                                strE = iy.a.e(this.base64Coder, certKeyPair2.getCertificate().getEncoded(), null, 2, null);
                                nv3.b bVar16 = this.edorAuthSegmentContainersInteractor;
                                X509Certificate certificate = certKeyPair2.getCertificate();
                                c4503b.f176481d = params3;
                                c4503b.f176482e = jVarA;
                                c4503b.f176483f = vq.j.a(bVar11);
                                c4503b.f176484g = bVar5;
                                c4503b.f176485h = bVar5;
                                c4503b.f176486j = vq.j.a(aVar5);
                                c4503b.f176487k = certKeyPair2;
                                c4503b.f176488l = strE;
                                c4503b.f176493r = i17;
                                c4503b.f176494s = i18;
                                c4503b.f176495t = i19;
                                c4503b.f176496v = i15;
                                c4503b.f176497w = i16;
                                c4503b.f176500z = 3;
                                objB2 = bVar16.b(certificate, c4503b);
                                if (objB2 != objE) {
                                    aVar2 = aVar5;
                                    str = strE;
                                    i25 = i15;
                                    i26 = i16;
                                    jVar = jVarA;
                                    params4 = params3;
                                    bVar6 = bVar11;
                                    certKeyPair = certKeyPair2;
                                    objD = objB2;
                                    i27 = i17;
                                    bVar7 = bVar5;
                                    value = ((xw.g) bVar7.a((i) objD)).getValue();
                                    aVar4 = aVar2;
                                    offsetDateTimeA = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                                    ly.a aVar8 = this.jwsSigner;
                                    n.b.C4515b c4515b = n.b.C4515b.f176854d;
                                    JWSHeaderData jWSHeaderData = new JWSHeaderData(c4515b, null, v.e(str), null, 10, null);
                                    str2 = str;
                                    bVar10 = bVar6;
                                    int i48 = i25;
                                    i37 = i19;
                                    JWSPayloadData jWSPayloadData = new JWSPayloadData("mObywatel", c0.e(value), this.dateConverter.d(offsetDateTimeA.plusSeconds(gu.b.F(params4.getJwsSigningParams().getTokenTtl()))), this.dateConverter.d(offsetDateTimeA), new JWSPayloadData.a.Multiple(params4.getJwsSigningParams().d()), null, null, v0.f(y.a("challenge", params4.getJwsSigningParams().getChallenge())), 96, null);
                                    JWSSignerData jWSSignerData = new JWSSignerData(certKeyPair.getPrivateKey(), c4515b);
                                    c4503b.f176481d = params4;
                                    c4503b.f176482e = jVar;
                                    c4503b.f176483f = vq.j.a(bVar10);
                                    c4503b.f176484g = bVar5;
                                    c4503b.f176485h = bVar5;
                                    c4503b.f176486j = vq.j.a(aVar4);
                                    c4503b.f176487k = vq.j.a(certKeyPair);
                                    c4503b.f176488l = vq.j.a(value);
                                    c4503b.f176489m = vq.j.a(str2);
                                    c4503b.f176490n = vq.j.a(offsetDateTimeA);
                                    c4503b.f176493r = i27;
                                    c4503b.f176494s = i18;
                                    c4503b.f176495t = i37;
                                    i29 = i48;
                                    c4503b.f176496v = i29;
                                    c4503b.f176497w = i26;
                                    c4503b.f176500z = 4;
                                    objA = aVar8.a(jWSHeaderData, jWSPayloadData, jWSSignerData, c4503b);
                                    obj = objE;
                                    if (objA == obj) {
                                        return obj;
                                    }
                                    b0Var = value;
                                    objD = objA;
                                    offsetDateTime = offsetDateTimeA;
                                    bVar9 = bVar5;
                                    bVar8 = bVar10;
                                    i35 = i27;
                                    i36 = i18;
                                    i28 = i37;
                                    aVar3 = aVar4;
                                    b0 b0VarG = c0.g((String) bVar5.a((i) objD));
                                    Params params5 = params4;
                                    obj2 = obj;
                                    b0 b0VarG2 = c0.g((String) bVar9.a(this.jweEncrypterStrategy.a(new EC((byte[]) bVar9.a(iy.a.c(this.base64Coder, c0.e(params5.getJwsSigningParams().getEncryptionKey()), null, 2, null))), new JweHeader(ky.d.ECDH_ES_A256KW.getAlg(), ky.a.A256GCM.getEnc(), null, null, c0.e(params5.getJwsSigningParams().getEncryptionKeyId()), "JWT", null, 76, null), new ky.c.JwsObject(c0.e(b0VarG)))));
                                    nv3.a aVar9 = this.backendInteractor;
                                    c4503b.f176481d = vq.j.a(params5);
                                    c4503b.f176482e = jVar;
                                    c4503b.f176483f = vq.j.a(bVar8);
                                    c4503b.f176484g = vq.j.a(bVar9);
                                    c4503b.f176485h = bVar9;
                                    c4503b.f176486j = vq.j.a(aVar3);
                                    c4503b.f176487k = vq.j.a(certKeyPair);
                                    c4503b.f176488l = vq.j.a(b0Var);
                                    c4503b.f176489m = vq.j.a(str2);
                                    c4503b.f176490n = vq.j.a(offsetDateTime);
                                    c4503b.f176491p = vq.j.a(b0VarG2);
                                    c4503b.f176492q = vq.j.a(b0VarG);
                                    c4503b.f176493r = i35;
                                    c4503b.f176494s = i36;
                                    c4503b.f176495t = i28;
                                    c4503b.f176496v = i29;
                                    c4503b.f176497w = i26;
                                    c4503b.f176500z = 5;
                                    objD = aVar9.d(b0VarG2, c4503b);
                                    if (objD == obj2) {
                                        return obj2;
                                    }
                                    return new i.Right((CentralTokens) bVar9.a((i) objD));
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new i.Left((dx.b) ex.d.a(e));
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
                                if (iVarA instanceof i.Left) {
                                    objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof i.Right) {
                                        throw new p();
                                    }
                                    objB = ((i.Right) iVarA).b();
                                }
                                return new i.Left(objB);
                            }
                        }
                        if (r15 != 3) {
                            if (r15 == 4) {
                                int i49 = c4503b.f176497w;
                                int i55 = c4503b.f176496v;
                                int i56 = c4503b.f176495t;
                                int i57 = c4503b.f176494s;
                                int i58 = c4503b.f176493r;
                                OffsetDateTime offsetDateTime2 = (OffsetDateTime) c4503b.f176490n;
                                String str3 = (String) c4503b.f176489m;
                                b0 b0Var2 = (b0) c4503b.f176488l;
                                CertKeyPair certKeyPair3 = (CertKeyPair) c4503b.f176487k;
                                pv3.a aVar10 = (pv3.a) c4503b.f176486j;
                                ex.b bVar17 = (ex.b) c4503b.f176485h;
                                ex.b bVar18 = (ex.b) c4503b.f176484g;
                                bVar8 = (ex.b) c4503b.f176483f;
                                j<dx.b> jVar3 = (j) c4503b.f176482e;
                                params4 = (Params) c4503b.f176481d;
                                try {
                                    u.b(objD);
                                    str2 = str3;
                                    bVar5 = bVar17;
                                    i28 = i56;
                                    obj = objE;
                                    bVar9 = bVar18;
                                    i29 = i55;
                                    jVar = jVar3;
                                    certKeyPair = certKeyPair3;
                                    b0Var = b0Var2;
                                    offsetDateTime = offsetDateTime2;
                                    i35 = i58;
                                    i36 = i57;
                                    aVar3 = aVar10;
                                    i26 = i49;
                                    b0 b0VarG3 = c0.g((String) bVar5.a((i) objD));
                                    Params params6 = params4;
                                    obj2 = obj;
                                    b0 b0VarG4 = c0.g((String) bVar9.a(this.jweEncrypterStrategy.a(new EC((byte[]) bVar9.a(iy.a.c(this.base64Coder, c0.e(params6.getJwsSigningParams().getEncryptionKey()), null, 2, null))), new JweHeader(ky.d.ECDH_ES_A256KW.getAlg(), ky.a.A256GCM.getEnc(), null, null, c0.e(params6.getJwsSigningParams().getEncryptionKeyId()), "JWT", null, 76, null), new ky.c.JwsObject(c0.e(b0VarG3)))));
                                    nv3.a aVar11 = this.backendInteractor;
                                    c4503b.f176481d = vq.j.a(params6);
                                    c4503b.f176482e = jVar;
                                    c4503b.f176483f = vq.j.a(bVar8);
                                    c4503b.f176484g = vq.j.a(bVar9);
                                    c4503b.f176485h = bVar9;
                                    c4503b.f176486j = vq.j.a(aVar3);
                                    c4503b.f176487k = vq.j.a(certKeyPair);
                                    c4503b.f176488l = vq.j.a(b0Var);
                                    c4503b.f176489m = vq.j.a(str2);
                                    c4503b.f176490n = vq.j.a(offsetDateTime);
                                    c4503b.f176491p = vq.j.a(b0VarG4);
                                    c4503b.f176492q = vq.j.a(b0VarG3);
                                    c4503b.f176493r = i35;
                                    c4503b.f176494s = i36;
                                    c4503b.f176495t = i28;
                                    c4503b.f176496v = i29;
                                    c4503b.f176497w = i26;
                                    c4503b.f176500z = 5;
                                    objD = aVar11.d(b0VarG4, c4503b);
                                    if (objD == obj2) {
                                        return obj2;
                                    }
                                } catch (ex.c e18) {
                                    e = e18;
                                    return new i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                } catch (Exception e25) {
                                    e = e25;
                                    r15 = jVar3;
                                    px.f fVar2 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar2.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
                                    if (iVarA instanceof i.Left) {
                                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof i.Right) {
                                            throw new p();
                                        }
                                        objB = ((i.Right) iVarA).b();
                                    }
                                    return new i.Left(objB);
                                }
                            } else {
                                if (r15 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bVar9 = (ex.b) c4503b.f176485h;
                                u.b(objD);
                            }
                            return new i.Right((CentralTokens) bVar9.a((i) objD));
                        }
                        int i59 = c4503b.f176497w;
                        int i65 = c4503b.f176496v;
                        int i66 = c4503b.f176495t;
                        int i67 = c4503b.f176494s;
                        int i68 = c4503b.f176493r;
                        String str4 = (String) c4503b.f176488l;
                        CertKeyPair certKeyPair4 = (CertKeyPair) c4503b.f176487k;
                        aVar2 = (pv3.a) c4503b.f176486j;
                        ex.b bVar19 = (ex.b) c4503b.f176485h;
                        ex.b bVar20 = (ex.b) c4503b.f176484g;
                        bVar6 = (ex.b) c4503b.f176483f;
                        jVar = (j) c4503b.f176482e;
                        params4 = (Params) c4503b.f176481d;
                        try {
                            u.b(objD);
                            i25 = i65;
                            i26 = i59;
                            certKeyPair = certKeyPair4;
                            i27 = i68;
                            i18 = i67;
                            i19 = i66;
                            str = str4;
                            bVar7 = bVar19;
                            bVar5 = bVar20;
                            value = ((xw.g) bVar7.a((i) objD)).getValue();
                            aVar4 = aVar2;
                            offsetDateTimeA = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                            ly.a aVar12 = this.jwsSigner;
                            n.b.C4515b c4515b2 = n.b.C4515b.f176854d;
                            JWSHeaderData jWSHeaderData2 = new JWSHeaderData(c4515b2, null, v.e(str), null, 10, null);
                            str2 = str;
                            bVar10 = bVar6;
                            int i410 = i25;
                            i37 = i19;
                            JWSPayloadData jWSPayloadData2 = new JWSPayloadData("mObywatel", c0.e(value), this.dateConverter.d(offsetDateTimeA.plusSeconds(gu.b.F(params4.getJwsSigningParams().getTokenTtl()))), this.dateConverter.d(offsetDateTimeA), new JWSPayloadData.a.Multiple(params4.getJwsSigningParams().d()), null, null, v0.f(y.a("challenge", params4.getJwsSigningParams().getChallenge())), 96, null);
                            JWSSignerData jWSSignerData2 = new JWSSignerData(certKeyPair.getPrivateKey(), c4515b2);
                            c4503b.f176481d = params4;
                            c4503b.f176482e = jVar;
                            c4503b.f176483f = vq.j.a(bVar10);
                            c4503b.f176484g = bVar5;
                            c4503b.f176485h = bVar5;
                            c4503b.f176486j = vq.j.a(aVar4);
                            c4503b.f176487k = vq.j.a(certKeyPair);
                            c4503b.f176488l = vq.j.a(value);
                            c4503b.f176489m = vq.j.a(str2);
                            c4503b.f176490n = vq.j.a(offsetDateTimeA);
                            c4503b.f176493r = i27;
                            c4503b.f176494s = i18;
                            c4503b.f176495t = i37;
                            i29 = i410;
                            c4503b.f176496v = i29;
                            c4503b.f176497w = i26;
                            c4503b.f176500z = 4;
                            objA = aVar12.a(jWSHeaderData2, jWSPayloadData2, jWSSignerData2, c4503b);
                            obj = objE;
                            if (objA == obj) {
                                return obj;
                            }
                            b0Var = value;
                            objD = objA;
                            offsetDateTime = offsetDateTimeA;
                            bVar9 = bVar5;
                            bVar8 = bVar10;
                            i35 = i27;
                            i36 = i18;
                            i28 = i37;
                            aVar3 = aVar4;
                            b0 b0VarG5 = c0.g((String) bVar5.a((i) objD));
                            Params params7 = params4;
                            obj2 = obj;
                            b0 b0VarG6 = c0.g((String) bVar9.a(this.jweEncrypterStrategy.a(new EC((byte[]) bVar9.a(iy.a.c(this.base64Coder, c0.e(params7.getJwsSigningParams().getEncryptionKey()), null, 2, null))), new JweHeader(ky.d.ECDH_ES_A256KW.getAlg(), ky.a.A256GCM.getEnc(), null, null, c0.e(params7.getJwsSigningParams().getEncryptionKeyId()), "JWT", null, 76, null), new ky.c.JwsObject(c0.e(b0VarG5)))));
                            nv3.a aVar13 = this.backendInteractor;
                            c4503b.f176481d = vq.j.a(params7);
                            c4503b.f176482e = jVar;
                            c4503b.f176483f = vq.j.a(bVar8);
                            c4503b.f176484g = vq.j.a(bVar9);
                            c4503b.f176485h = bVar9;
                            c4503b.f176486j = vq.j.a(aVar3);
                            c4503b.f176487k = vq.j.a(certKeyPair);
                            c4503b.f176488l = vq.j.a(b0Var);
                            c4503b.f176489m = vq.j.a(str2);
                            c4503b.f176490n = vq.j.a(offsetDateTime);
                            c4503b.f176491p = vq.j.a(b0VarG6);
                            c4503b.f176492q = vq.j.a(b0VarG5);
                            c4503b.f176493r = i35;
                            c4503b.f176494s = i36;
                            c4503b.f176495t = i28;
                            c4503b.f176496v = i29;
                            c4503b.f176497w = i26;
                            c4503b.f176500z = 5;
                            objD = aVar13.d(b0VarG6, c4503b);
                            if (objD == obj2) {
                                return obj2;
                            }
                            return new i.Right((CentralTokens) bVar9.a((i) objD));
                        } catch (ex.c e26) {
                            e = e26;
                            return new i.Left((dx.b) ex.d.a(e));
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
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof i.Right) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    }
                    int i69 = c4503b.f176497w;
                    i15 = c4503b.f176496v;
                    int i75 = c4503b.f176495t;
                    int i76 = c4503b.f176494s;
                    int i77 = c4503b.f176493r;
                    ex.b bVar21 = (ex.b) c4503b.f176485h;
                    ex.b bVar22 = (ex.b) c4503b.f176484g;
                    ex.b bVar23 = (ex.b) c4503b.f176483f;
                    j<dx.b> jVar4 = (j) c4503b.f176482e;
                    params2 = (Params) c4503b.f176481d;
                    try {
                        u.b(objD);
                        i16 = i69;
                        jVarA = jVar4;
                        bVar = bVar23;
                        bVar2 = bVar22;
                        bVar3 = bVar21;
                        i17 = i77;
                        i18 = i76;
                        i19 = i75;
                    } catch (ex.c e29) {
                        e = e29;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e35) {
                        throw e35;
                    } catch (Exception e36) {
                        e = e36;
                        r15 = jVar4;
                        px.f fVar4 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar4.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof i.Right) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } catch (CancellationException e37) {
                    throw e37;
                }
                pv3.a aVar14 = (pv3.a) bVar3.a((i) objD);
                nv3.b bVar24 = this.edorAuthSegmentContainersInteractor;
                c4503b.f176481d = params2;
                c4503b.f176482e = jVarA;
                c4503b.f176483f = vq.j.a(bVar);
                c4503b.f176484g = bVar2;
                c4503b.f176485h = bVar2;
                c4503b.f176486j = vq.j.a(aVar14);
                c4503b.f176493r = i17;
                c4503b.f176494s = i18;
                c4503b.f176495t = i19;
                c4503b.f176496v = i15;
                c4503b.f176497w = i16;
                c4503b.f176500z = 2;
                Object objC = bVar24.c(aVar14, c4503b);
                if (objC != objE) {
                    aVar = aVar14;
                    objD = objC;
                    params3 = params2;
                    bVar4 = bVar;
                    bVar5 = bVar2;
                    certKeyPair2 = (CertKeyPair) bVar2.a((i) objD);
                    aVar5 = aVar;
                    bVar11 = bVar4;
                    strE = iy.a.e(this.base64Coder, certKeyPair2.getCertificate().getEncoded(), null, 2, null);
                    nv3.b bVar110 = this.edorAuthSegmentContainersInteractor;
                    X509Certificate certificate2 = certKeyPair2.getCertificate();
                    c4503b.f176481d = params3;
                    c4503b.f176482e = jVarA;
                    c4503b.f176483f = vq.j.a(bVar11);
                    c4503b.f176484g = bVar5;
                    c4503b.f176485h = bVar5;
                    c4503b.f176486j = vq.j.a(aVar5);
                    c4503b.f176487k = certKeyPair2;
                    c4503b.f176488l = strE;
                    c4503b.f176493r = i17;
                    c4503b.f176494s = i18;
                    c4503b.f176495t = i19;
                    c4503b.f176496v = i15;
                    c4503b.f176497w = i16;
                    c4503b.f176500z = 3;
                    objB2 = bVar110.b(certificate2, c4503b);
                    if (objB2 != objE) {
                        aVar2 = aVar5;
                        str = strE;
                        i25 = i15;
                        i26 = i16;
                        jVar = jVarA;
                        params4 = params3;
                        bVar6 = bVar11;
                        certKeyPair = certKeyPair2;
                        objD = objB2;
                        i27 = i17;
                        bVar7 = bVar5;
                        value = ((xw.g) bVar7.a((i) objD)).getValue();
                        aVar4 = aVar2;
                        offsetDateTimeA = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                        ly.a aVar15 = this.jwsSigner;
                        n.b.C4515b c4515b3 = n.b.C4515b.f176854d;
                        JWSHeaderData jWSHeaderData3 = new JWSHeaderData(c4515b3, null, v.e(str), null, 10, null);
                        str2 = str;
                        bVar10 = bVar6;
                        int i411 = i25;
                        i37 = i19;
                        JWSPayloadData jWSPayloadData3 = new JWSPayloadData("mObywatel", c0.e(value), this.dateConverter.d(offsetDateTimeA.plusSeconds(gu.b.F(params4.getJwsSigningParams().getTokenTtl()))), this.dateConverter.d(offsetDateTimeA), new JWSPayloadData.a.Multiple(params4.getJwsSigningParams().d()), null, null, v0.f(y.a("challenge", params4.getJwsSigningParams().getChallenge())), 96, null);
                        JWSSignerData jWSSignerData3 = new JWSSignerData(certKeyPair.getPrivateKey(), c4515b3);
                        c4503b.f176481d = params4;
                        c4503b.f176482e = jVar;
                        c4503b.f176483f = vq.j.a(bVar10);
                        c4503b.f176484g = bVar5;
                        c4503b.f176485h = bVar5;
                        c4503b.f176486j = vq.j.a(aVar4);
                        c4503b.f176487k = vq.j.a(certKeyPair);
                        c4503b.f176488l = vq.j.a(value);
                        c4503b.f176489m = vq.j.a(str2);
                        c4503b.f176490n = vq.j.a(offsetDateTimeA);
                        c4503b.f176493r = i27;
                        c4503b.f176494s = i18;
                        c4503b.f176495t = i37;
                        i29 = i411;
                        c4503b.f176496v = i29;
                        c4503b.f176497w = i26;
                        c4503b.f176500z = 4;
                        objA = aVar15.a(jWSHeaderData3, jWSPayloadData3, jWSSignerData3, c4503b);
                        obj = objE;
                        if (objA == obj) {
                            return obj;
                        }
                        b0Var = value;
                        objD = objA;
                        offsetDateTime = offsetDateTimeA;
                        bVar9 = bVar5;
                        bVar8 = bVar10;
                        i35 = i27;
                        i36 = i18;
                        i28 = i37;
                        aVar3 = aVar4;
                        b0 b0VarG7 = c0.g((String) bVar5.a((i) objD));
                        Params params8 = params4;
                        obj2 = obj;
                        b0 b0VarG8 = c0.g((String) bVar9.a(this.jweEncrypterStrategy.a(new EC((byte[]) bVar9.a(iy.a.c(this.base64Coder, c0.e(params8.getJwsSigningParams().getEncryptionKey()), null, 2, null))), new JweHeader(ky.d.ECDH_ES_A256KW.getAlg(), ky.a.A256GCM.getEnc(), null, null, c0.e(params8.getJwsSigningParams().getEncryptionKeyId()), "JWT", null, 76, null), new ky.c.JwsObject(c0.e(b0VarG7)))));
                        nv3.a aVar16 = this.backendInteractor;
                        c4503b.f176481d = vq.j.a(params8);
                        c4503b.f176482e = jVar;
                        c4503b.f176483f = vq.j.a(bVar8);
                        c4503b.f176484g = vq.j.a(bVar9);
                        c4503b.f176485h = bVar9;
                        c4503b.f176486j = vq.j.a(aVar3);
                        c4503b.f176487k = vq.j.a(certKeyPair);
                        c4503b.f176488l = vq.j.a(b0Var);
                        c4503b.f176489m = vq.j.a(str2);
                        c4503b.f176490n = vq.j.a(offsetDateTime);
                        c4503b.f176491p = vq.j.a(b0VarG8);
                        c4503b.f176492q = vq.j.a(b0VarG7);
                        c4503b.f176493r = i35;
                        c4503b.f176494s = i36;
                        c4503b.f176495t = i28;
                        c4503b.f176496v = i29;
                        c4503b.f176497w = i26;
                        c4503b.f176500z = 5;
                        objD = aVar16.d(b0VarG8, c4503b);
                        if (objD == obj2) {
                            return obj2;
                        }
                        return new i.Right((CentralTokens) bVar9.a((i) objD));
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
