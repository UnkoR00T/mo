package kx3;

import fr.t;
import k54.i;
import k54.j;
import k54.k;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkx3/g;", "Lgz/a;", "Lkx3/g$a;", "Loq/i0;", "Lk54/i;", "saveKeycloakAccessTokenUC", "Lk54/j;", "saveKeycloakCentralAccessTokenUC", "Lk54/k;", "saveKeycloakRefreshTokenUC", "<init>", "(Lk54/i;Lk54/j;Lk54/k;)V", "params", "b", "(Lkx3/g$a;)V", "a", "Lk54/i;", "Lk54/j;", "c", "Lk54/k;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.a<Params, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i saveKeycloakAccessTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j saveKeycloakCentralAccessTokenUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k saveKeycloakRefreshTokenUC;

    /* JADX INFO: renamed from: kx3.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lkx3/g$a;", "Lgz/b$a;", "Li54/b$a;", "access", "Li54/b$b;", "centralAccess", "Li54/b$c;", "refresh", "<init>", "(Li54/b$a;Li54/b$b;Li54/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li54/b$a;", "()Li54/b$a;", "b", "Li54/b$b;", "()Li54/b$b;", "c", "Li54/b$c;", "()Li54/b$c;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i54.b.Access access;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final i54.b.CentralAccess centralAccess;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final i54.b.Refresh refresh;

        public Params(i54.b.Access access, i54.b.CentralAccess centralAccess, i54.b.Refresh refresh) {
            this.access = access;
            this.centralAccess = centralAccess;
            this.refresh = refresh;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final i54.b.Access getAccess() {
            return this.access;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final i54.b.CentralAccess getCentralAccess() {
            return this.centralAccess;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final i54.b.Refresh getRefresh() {
            return this.refresh;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.access, params.access) && t.c(this.centralAccess, params.centralAccess) && t.c(this.refresh, params.refresh);
        }

        public int hashCode() {
            return (((this.access.hashCode() * 31) + this.centralAccess.hashCode()) * 31) + this.refresh.hashCode();
        }

        public String toString() {
            return "Params(access=" + this.access + ", centralAccess=" + this.centralAccess + ", refresh=" + this.refresh + ')';
        }
    }

    public g(i iVar, j jVar, k kVar) {
        this.saveKeycloakAccessTokenUC = iVar;
        this.saveKeycloakCentralAccessTokenUC = jVar;
        this.saveKeycloakRefreshTokenUC = kVar;
    }

    public void b(Params params) {
        this.saveKeycloakAccessTokenUC.a(new i.Params(params.getAccess()));
        this.saveKeycloakCentralAccessTokenUC.a(new j.Params(params.getCentralAccess()));
        this.saveKeycloakRefreshTokenUC.a(new k.Params(params.getRefresh()));
    }
}
