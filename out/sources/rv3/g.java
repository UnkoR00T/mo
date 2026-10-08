package rv3;

import fr.t;
import oq.i0;
import ov3.CentralTokens;
import ov3.OwTokens;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrv3/g;", "Lgz/b;", "Lrv3/g$a;", "Loq/i0;", "Ll44/f;", "saveCentralAccessTokenUC", "Ll44/g;", "saveOwAccessTokenUC", "Ll44/h;", "saveOwRefreshTokenUC", "<init>", "(Ll44/f;Ll44/g;Ll44/h;)V", "params", "d", "(Lrv3/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Ll44/f;", "b", "Ll44/g;", "c", "Ll44/h;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b<Params, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l44.f saveCentralAccessTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l44.g saveOwAccessTokenUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l44.h saveOwRefreshTokenUC;

    /* JADX INFO: renamed from: rv3.g$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lrv3/g$a;", "Lgz/b$a;", "Lov3/c;", "centralTokens", "Lov3/g;", "owTokens", "<init>", "(Lov3/c;Lov3/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lov3/c;", "()Lov3/c;", "b", "Lov3/g;", "()Lov3/g;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CentralTokens centralTokens;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OwTokens owTokens;

        public Params(CentralTokens centralTokens, OwTokens owTokens) {
            this.centralTokens = centralTokens;
            this.owTokens = owTokens;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CentralTokens getCentralTokens() {
            return this.centralTokens;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OwTokens getOwTokens() {
            return this.owTokens;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.centralTokens, params.centralTokens) && t.c(this.owTokens, params.owTokens);
        }

        public int hashCode() {
            return (this.centralTokens.hashCode() * 31) + this.owTokens.hashCode();
        }

        public String toString() {
            return "Params(centralTokens=" + this.centralTokens + ", owTokens=" + this.owTokens + ')';
        }
    }

    public g(l44.f fVar, l44.g gVar, l44.h hVar) {
        this.saveCentralAccessTokenUC = fVar;
        this.saveOwAccessTokenUC = gVar;
        this.saveOwRefreshTokenUC = hVar;
    }

    public Object d(Params params, tq.e<? super i0> eVar) {
        this.saveCentralAccessTokenUC.a(new l44.f.Params(h.d(params.getCentralTokens().getAccess())));
        this.saveOwAccessTokenUC.a(new l44.g.Params(h.e(params.getOwTokens().getAccess())));
        this.saveOwRefreshTokenUC.a(new l44.h.Params(h.f(params.getOwTokens().getRefresh())));
        return i0.f148189a;
    }
}
