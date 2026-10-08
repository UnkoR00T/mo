package cs0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import vr0.BECardToken;
import vr0.BERedirectRequestInfo;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcs0/g;", "", "Lcs0/g$a;", "Lvr0/m;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends gz.b {

    /* JADX INFO: renamed from: cs0.g$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%¨\u0006&"}, d2 = {"Lcs0/g$a;", "Lgz/b$a;", "", "institutionId", "", "paymentIds", "Lvr0/i;", "cardToken", "", "registerCardToken", "Lvr0/k;", "redirectRequestInfo", "<init>", "(Ljava/lang/String;Ljava/util/List;Lvr0/i;Ljava/lang/Boolean;Lvr0/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lvr0/i;", "()Lvr0/i;", "d", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "e", "Lvr0/k;", "()Lvr0/k;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String institutionId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> paymentIds;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BECardToken cardToken;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean registerCardToken;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final BERedirectRequestInfo redirectRequestInfo;

        public Params(String str, List<String> list, BECardToken bECardToken, Boolean bool, BERedirectRequestInfo bERedirectRequestInfo) {
            this.institutionId = str;
            this.paymentIds = list;
            this.cardToken = bECardToken;
            this.registerCardToken = bool;
            this.redirectRequestInfo = bERedirectRequestInfo;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BECardToken getCardToken() {
            return this.cardToken;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInstitutionId() {
            return this.institutionId;
        }

        public final List<String> c() {
            return this.paymentIds;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BERedirectRequestInfo getRedirectRequestInfo() {
            return this.redirectRequestInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.institutionId, params.institutionId) && t.c(this.paymentIds, params.paymentIds) && t.c(this.cardToken, params.cardToken) && t.c(this.registerCardToken, params.registerCardToken) && t.c(this.redirectRequestInfo, params.redirectRequestInfo);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Boolean getRegisterCardToken() {
            return this.registerCardToken;
        }

        public int hashCode() {
            int iHashCode = ((this.institutionId.hashCode() * 31) + this.paymentIds.hashCode()) * 31;
            BECardToken bECardToken = this.cardToken;
            int iHashCode2 = (iHashCode + (bECardToken == null ? 0 : bECardToken.hashCode())) * 31;
            Boolean bool = this.registerCardToken;
            return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.redirectRequestInfo.hashCode();
        }

        public String toString() {
            return "Params(institutionId=" + this.institutionId + ", paymentIds=" + this.paymentIds + ", cardToken=" + this.cardToken + ", registerCardToken=" + this.registerCardToken + ", redirectRequestInfo=" + this.redirectRequestInfo + ")";
        }
    }
}
