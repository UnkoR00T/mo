package sf0;

import a80.e;
import dx.i;
import eg0.s;
import fr.t;
import java.util.List;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pf0.LoadAccessTokenResult;
import pq.v;
import tf0.SimpleDeactivateData;
import vq.j;
import xy.AccessToken;
import z70.Challenge;
import z70.Jwt;
import z70.JwtRequest;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lsf0/c;", "Lqf0/a;", "La80/e;", "generateChallengeUC", "Leg0/a;", "changeUserCertStatusUC", "Lsf0/b;", "getJwtTokenUC", "Lwy/b;", "networkSessionManager", "Lez/a;", "currentTimeProvider", "Leg0/s;", "refreshDocumentsStatusesUC", "<init>", "(La80/e;Leg0/a;Lsf0/b;Lwy/b;Lez/a;Leg0/s;)V", "Lz70/d;", "challenge", "Ldx/i;", "Ldx/b;", "Lpf0/a;", "e", "(Lz70/d;Ltq/e;)Ljava/lang/Object;", "Lgz/b$a$a;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "La80/e;", "b", "Leg0/a;", "c", "Lsf0/b;", "d", "Lwy/b;", "Lez/a;", "f", "Leg0/s;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements qf0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e generateChallengeUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final eg0.a changeUserCertStatusUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final sf0.b getJwtTokenUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wy.b networkSessionManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final s refreshDocumentsStatusesUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f181108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f181110f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f181111g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f181112h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f181113j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f181115l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f181113j = obj;
            this.f181115l |= PKIFailureInfo.systemUnavail;
            return c.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f181116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181118f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f181120h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f181118f = obj;
            this.f181120h |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(e eVar, eg0.a aVar, sf0.b bVar, wy.b bVar2, ez.a aVar2, s sVar) {
        this.generateChallengeUC = eVar;
        this.changeUserCertStatusUC = aVar;
        this.getJwtTokenUC = bVar;
        this.networkSessionManager = bVar2;
        this.currentTimeProvider = aVar2;
        this.refreshDocumentsStatusesUC = sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:58:0x0158  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final Object e(Challenge challenge, tq.e<? super i<? extends dx.b, LoadAccessTokenResult>> eVar) throws Throwable {
        a aVar;
        i iVar;
        AccessToken accessToken;
        dx.b bVar;
        ?? r15;
        dx.b bVar2;
        boolean clearData;
        List listN;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f181115l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f181115l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f181113j;
        Object objE = uq.b.e();
        int i16 = aVar.f181115l;
        if (i16 == 0) {
            u.b(objD);
            sf0.b bVar3 = this.getJwtTokenUC;
            sf0.b.Params params = new sf0.b.Params(new JwtRequest(challenge.getChallenge()));
            aVar.f181108d = j.a(challenge);
            aVar.f181115l = 1;
            objD = bVar3.d(params, aVar);
            if (objD != objE) {
            }
            r15 = clearData;
            return objE;
        }
        if (i16 != 1) {
            if (i16 == 2) {
                bVar2 = (dx.b) aVar.f181110f;
                u.b(objD);
                bVar = bVar2;
                r15 = clearData;
                this.networkSessionManager.R();
                return new i.Left(bVar);
            }
            if (i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            accessToken = (AccessToken) aVar.f181110f;
            iVar = (i) aVar.f181109e;
            u.b(objD);
            listN = (List) ((i) objD).a();
            if (listN == null) {
                listN = v.n();
            }
            return new i.Right(new LoadAccessTokenResult(accessToken, ((Jwt) ((i.Right) iVar).b()).getCertificateRenewalRequired(), listN));
        }
        challenge = (Challenge) aVar.f181108d;
        u.b(objD);
        i iVar2 = (i) objD;
        if (iVar2 instanceof i.Left) {
            bVar = (dx.b) ((i.Left) iVar2).b();
            if (t.c(bVar, dx.b.g.e.f45078a) || (bVar instanceof dx.b.g.SslCertificate) || (bVar instanceof dx.b.AppUpdateRequired)) {
                return new i.Left(bVar);
            }
            if (!(bVar instanceof dx.b.Deactivate)) {
                this.networkSessionManager.R();
                return new i.Left(dx.b.g.a.f45045a);
            }
            dx.b.Deactivate.a data = ((dx.b.Deactivate) bVar).getData();
            SimpleDeactivateData simpleDeactivateData = data instanceof SimpleDeactivateData ? (SimpleDeactivateData) data : null;
            if (simpleDeactivateData != null) {
                clearData = simpleDeactivateData.getClearData();
            } else {
                r15 = 0;
            }
            if (r15 != 0) {
                eg0.a aVar2 = this.changeUserCertStatusUC;
                eg0.a.Params params2 = new eg0.a.Params(wf0.a.INACTIVE);
                aVar.f181108d = j.a(challenge);
                aVar.f181109e = j.a(iVar2);
                aVar.f181110f = bVar;
                aVar.f181111g = j.a(simpleDeactivateData);
                aVar.f181112h = r15;
                aVar.f181115l = 2;
                if (aVar2.c(params2, aVar) != objE) {
                    r15 = clearData;
                    bVar2 = bVar;
                    bVar = bVar2;
                }
            }
            r15 = clearData;
            this.networkSessionManager.R();
            return new i.Left(bVar);
        }
        if (!(iVar2 instanceof i.Right)) {
            throw new p();
        }
        i.Right right = (i.Right) iVar2;
        AccessToken accessToken2 = new AccessToken(((Jwt) right.b()).getToken(), ((Jwt) right.b()).getValidityInSeconds(), this.currentTimeProvider.a());
        wy.b.F(this.networkSessionManager, null, accessToken2, 1, null);
        s sVar = this.refreshDocumentsStatusesUC;
        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
        aVar.f181108d = j.a(challenge);
        aVar.f181109e = iVar2;
        aVar.f181110f = accessToken2;
        aVar.f181115l = 3;
        Object objC = sVar.c(c1792a, aVar);
        if (objC != objE) {
            iVar = iVar2;
            objD = objC;
            accessToken = accessToken2;
            listN = (List) ((i) objD).a();
            if (listN == null) {
                listN = v.n();
            }
            return new i.Right(new LoadAccessTokenResult(accessToken, ((Jwt) ((i.Right) iVar).b()).getCertificateRenewalRequired(), listN));
        }
        r15 = clearData;
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super i<? extends dx.b, LoadAccessTokenResult>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f181120h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f181120h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f181118f;
        Object objE = uq.b.e();
        int i16 = bVar.f181120h;
        if (i16 == 0) {
            u.b(objC);
            e eVar2 = this.generateChallengeUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            bVar.f181116d = j.a(c1792a);
            bVar.f181120h = 1;
            objC = eVar2.c(c1792a2, bVar);
            if (objC != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
            return objC;
        }
        c1792a = (gz.b.a.C1792a) bVar.f181116d;
        u.b(objC);
        i iVar = (i) objC;
        if (!(iVar instanceof i.Right)) {
            if (!(iVar instanceof i.Left)) {
                throw new p();
            }
            this.networkSessionManager.R();
            dx.b bVar2 = (dx.b) ((i.Left) iVar).b();
            return ((bVar2 instanceof dx.b.Deactivate) || t.c(bVar2, dx.b.g.e.f45078a) || (bVar2 instanceof dx.b.g.SslCertificate) || (bVar2 instanceof dx.b.AppUpdateRequired)) ? new i.Left(bVar2) : new i.Left(dx.b.g.a.f45045a);
        }
        Challenge challenge = (Challenge) ((i.Right) iVar).b();
        bVar.f181116d = j.a(c1792a);
        bVar.f181117e = j.a(iVar);
        bVar.f181120h = 2;
        Object objE2 = e(challenge, bVar);
        return objE2 == objE ? objE : objE2;
    }
}
