package kx3;

import dx.i;
import dx.j;
import java.util.concurrent.CancellationException;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkx3/e;", "", "Lgz/b$a;", "", "Lk54/d;", "getKeycloakCentralAccessTokenUC", "Lk54/g;", "isKeycloakTokenValidUC", "<init>", "(Lk54/d;Lk54/g;)V", "params", "Ldx/i;", "Ldx/b;", "c", "(Lgz/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lk54/d;", "b", "Lk54/g;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k54.d getKeycloakCentralAccessTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k54.g isKeycloakTokenValidUC;

    public e(k54.d dVar, k54.g gVar) {
        this.getKeycloakCentralAccessTokenUC = dVar;
        this.isKeycloakTokenValidUC = gVar;
    }

    @Override // gz.b
    public Object c(gz.b.a aVar, tq.e<? super i<? extends dx.b, Boolean>> eVar) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar2 = new ex.a();
                    i54.b.CentralAccess centralAccessA = this.getKeycloakCentralAccessTokenUC.a(gz.b.a.C1792a.f78542a);
                    if (centralAccessA != null) {
                        return new i.Right(vq.b.a(!this.isKeycloakTokenValidUC.a(new k54.g.Params(centralAccessA)).booleanValue()));
                    }
                    aVar2.b(new dx.b.Generic(new NullPointerException("CentralAccessToken is null")));
                    throw new oq.g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }
}
