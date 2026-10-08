package y43;

import dx.i;
import dx.j;
import fr.t;
import fu.d;
import java.util.concurrent.CancellationException;
import oq.p;
import p071kotlin.Metadata;
import px.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000b2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0002\u000b\rB\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly43/c;", "Lgz/a;", "Ly43/c$b;", "Ldx/i;", "Ldx/b;", "", "Ls43/a;", "onlineServiceRequestManager", "<init>", "(Ls43/a;)V", "params", "b", "(Ly43/c$b;)Ldx/i;", "a", "Ls43/a;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.a<Params, i<? extends dx.b, ? extends byte[]>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f224205c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s43.a onlineServiceRequestManager;

    /* JADX INFO: renamed from: y43.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Ly43/c$b;", "Lgz/b$a;", "", "requestId", "origin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String origin;

        public Params(String str, String str2) {
            this.requestId = str;
            this.origin = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getOrigin() {
            return this.origin;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.requestId, params.requestId) && t.c(this.origin, params.origin);
        }

        public int hashCode() {
            int iHashCode = this.requestId.hashCode() * 31;
            String str = this.origin;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Params(requestId=" + this.requestId + ", origin=" + this.origin + ')';
        }
    }

    public c(s43.a aVar) {
        this.onlineServiceRequestManager = aVar;
    }

    public i<dx.b, byte[]> b(Params params) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new i.Right(("GetTokenData=" + ((String) new ex.a().a(s43.a.d(this.onlineServiceRequestManager, params.getRequestId(), null, params.getOrigin(), 2, null)))).getBytes(d.UTF_8));
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
