package y43;

import dx.i;
import dx.j;
import ex.d;
import fr.t;
import fu.r;
import iy.b0;
import iy.c0;
import java.util.concurrent.CancellationException;
import oq.p;
import p071kotlin.Metadata;
import px.f;
import tq.e;
import w43.TokenResponse;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0015\u001b\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Ly43/a;", "", "Ly43/a$b;", "Lw43/e;", "Lx43/a;", "tokenResponseParser", "Lmx/c;", "labelProvider", "<init>", "(Lx43/a;Lmx/c;)V", "Liy/b0;", "body", "Ldx/b;", "e", "(Liy/b0;)Ldx/b;", "params", "Ldx/i;", "f", "(Ly43/a$b;Ltq/e;)Ljava/lang/Object;", "a", "Lx43/a;", "b", "Lmx/c;", "Ldx/b$c;", "d", "()Ldx/b$c;", "tokenError", "c", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f224172d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x43.a tokenResponseParser;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: y43.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly43/a$b;", "Lgz/b$a;", "Liy/b0;", "content", "<init>", "(Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f224175b = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 content;

        public Params(b0 b0Var) {
            this.content = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.content, ((Params) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "Params(content=" + this.content + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Ly43/a$c;", "", "", "status", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c {
        OK("OK"),
        ERROR("ERROR");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f224180e = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String status;

        c(String str) {
            this.status = str;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getStatus() {
            return this.status;
        }
    }

    public a(x43.a aVar, mx.c cVar) {
        this.tokenResponseParser = aVar;
        this.labelProvider = cVar;
    }

    private final dx.b.Business d() {
        return new dx.b.Business(null, dx.b.f.FAILURE, this.labelProvider.c(q43.a.f164719c), this.labelProvider.c(q43.a.f164727k), null, this.labelProvider.c(q43.a.f164717a), null, 81, null);
    }

    private final dx.b e(b0 body) {
        return r.d0(c0.e(body), "ERR_INTERNET_DISCONNECTED", false, 2, null) ? dx.b.g.e.f45078a : d();
    }

    public Object f(Params params, e<? super i<? extends dx.b, TokenResponse>> eVar) {
        Object objB;
        if (!r.d0(c0.e(params.getContent()), "jsonTokenData", false, 2, null)) {
            return new i.Left(e(params.getContent()));
        }
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    String strG1 = r.g1(c0.e(params.getContent()), "jsonTokenData", null, 2, null);
                    TokenResponse tokenResponseA = this.tokenResponseParser.a(r.P(strG1.substring(r.r0(strG1, "{", 0, false, 6, null), r.r0(strG1, "}", 0, false, 6, null) + 1), "&quot;", "\"", false, 4, null));
                    return t.c(tokenResponseA.getStatus(), c.OK.getStatus()) ? new i.Right(tokenResponseA) : new i.Left(d());
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
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
