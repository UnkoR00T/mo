package y43;

import dx.i;
import fr.t;
import iy.a0;
import iy.c0;
import iy.j;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import ry.CertKeyPair;
import tq.e;
import vq.d;
import w43.TokenResponse;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u000f2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0002\u0013\u0011B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ly43/b;", "Lgz/b;", "Ly43/b$b;", "Ldx/i;", "Ldx/b;", "Liy/a0;", "Liy/j;", "cmsManager", "Ls43/a;", "onlineServiceRequestManager", "Lv43/a;", "servicesContainersInteractor", "<init>", "(Liy/j;Ls43/a;Lv43/a;)V", "params", "d", "(Ly43/b$b;Ltq/e;)Ljava/lang/Object;", "a", "Liy/j;", "b", "Ls43/a;", "c", "Lv43/a;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, i<? extends dx.b, ? extends a0>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f224183e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j cmsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s43.a onlineServiceRequestManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v43.a servicesContainersInteractor;

    /* JADX INFO: renamed from: y43.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Ly43/b$b;", "Lgz/b$a;", "", "requestId", "origin", "Lw43/e;", "tokenResponse", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lw43/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lw43/e;", "()Lw43/e;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String origin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final TokenResponse tokenResponse;

        public Params(String str, String str2, TokenResponse tokenResponse) {
            this.requestId = str;
            this.origin = str2;
            this.tokenResponse = tokenResponse;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getOrigin() {
            return this.origin;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TokenResponse getTokenResponse() {
            return this.tokenResponse;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.requestId, params.requestId) && t.c(this.origin, params.origin) && t.c(this.tokenResponse, params.tokenResponse);
        }

        public int hashCode() {
            int iHashCode = this.requestId.hashCode() * 31;
            String str = this.origin;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.tokenResponse.hashCode();
        }

        public String toString() {
            return "Params(requestId=" + this.requestId + ", origin=" + this.origin + ", tokenResponse=" + this.tokenResponse + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f224190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f224191e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f224192f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f224193g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f224194h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f224195j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f224196k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f224197l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f224198m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f224199n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f224200p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f224201q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f224203s;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f224201q = obj;
            this.f224203s |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    public b(j jVar, s43.a aVar, v43.a aVar2) {
        this.cmsManager = jVar;
        this.onlineServiceRequestManager = aVar;
        this.servicesContainersInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public Object d(Params params, e<? super i<? extends dx.b, a0>> eVar) throws Throwable {
        c cVar;
        Object objB;
        Params params2;
        int i15;
        ex.b bVar;
        int i16;
        int i17;
        dx.j<dx.b> jVarA;
        ex.b bVar2;
        int i18;
        int i19;
        ex.b bVar3;
        Params params3;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i25 = cVar.f224203s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f224203s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB2 = cVar.f224201q;
        Object objE = uq.b.e();
        ?? r15 = cVar.f224203s;
        try {
            try {
                if (r15 == 0) {
                    u.b(objB2);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    v43.a aVar2 = this.servicesContainersInteractor;
                    cVar.f224190d = params;
                    cVar.f224191e = jVarA;
                    cVar.f224192f = vq.j.a(aVar);
                    cVar.f224193g = aVar;
                    i15 = 0;
                    cVar.f224196k = 0;
                    cVar.f224197l = 0;
                    cVar.f224198m = 0;
                    cVar.f224199n = 0;
                    cVar.f224200p = 0;
                    cVar.f224203s = 1;
                    objB2 = v43.a.c(aVar2, false, cVar, 1, null);
                    if (objB2 != objE) {
                        params2 = params;
                        i17 = 0;
                        i19 = 0;
                        i16 = 0;
                        bVar = aVar;
                        bVar2 = bVar;
                        i18 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = cVar.f224200p;
                        int i27 = cVar.f224199n;
                        int i28 = cVar.f224198m;
                        int i29 = cVar.f224197l;
                        int i35 = cVar.f224196k;
                        ex.b bVar4 = (ex.b) cVar.f224193g;
                        ex.b bVar5 = (ex.b) cVar.f224192f;
                        dx.j<dx.b> jVar = (dx.j) cVar.f224191e;
                        params2 = (Params) cVar.f224190d;
                        try {
                            u.b(objB2);
                            i15 = i26;
                            bVar = bVar4;
                            i16 = i29;
                            i17 = i27;
                            jVarA = jVar;
                            bVar2 = bVar5;
                            i18 = i35;
                            i19 = i28;
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
                        bVar = (ex.b) cVar.f224195j;
                        bVar3 = (ex.b) cVar.f224193g;
                        params3 = (Params) cVar.f224190d;
                        u.b(objB2);
                    }
                    return new i.Right(c0.f(("GetContentData=" + ((String) bVar3.a(this.onlineServiceRequestManager.c(params3.getRequestId(), (byte[]) bVar3.a(this.cmsManager.c(params3.getTokenResponse().getUuid(), (CertKeyPair) bVar.a((i) objB2))), params3.getOrigin())))).getBytes(fu.d.UTF_8)));
                } catch (CancellationException e18) {
                    throw e18;
                }
                i iVar = (i) objB2;
                if (iVar instanceof i.Left) {
                    bVar.b(new dx.b.Generic(new Exception("IdentityType for main identity is null")));
                    throw new g();
                }
                if (!(iVar instanceof i.Right)) {
                    throw new p();
                }
                k34.u uVar = (k34.u) ((i.Right) iVar).b();
                v43.a aVar3 = this.servicesContainersInteractor;
                cVar.f224190d = params2;
                cVar.f224191e = jVarA;
                cVar.f224192f = vq.j.a(bVar2);
                cVar.f224193g = bVar;
                cVar.f224194h = vq.j.a(uVar);
                cVar.f224195j = bVar;
                cVar.f224196k = i18;
                cVar.f224197l = i16;
                cVar.f224198m = i19;
                cVar.f224199n = i17;
                cVar.f224200p = i15;
                cVar.f224203s = 2;
                objB2 = aVar3.b(uVar, cVar);
                if (objB2 != objE) {
                    bVar3 = bVar;
                    params3 = params2;
                    return new i.Right(c0.f(("GetContentData=" + ((String) bVar3.a(this.onlineServiceRequestManager.c(params3.getRequestId(), (byte[]) bVar3.a(this.cmsManager.c(params3.getTokenResponse().getUuid(), (CertKeyPair) bVar.a((i) objB2))), params3.getOrigin())))).getBytes(fu.d.UTF_8)));
                }
                return objE;
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
