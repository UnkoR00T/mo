package bs0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import ur0.BEAlias;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lbs0/c;", "", "Lbs0/c$a;", "Lur0/g;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends gz.b {

    /* JADX INFO: renamed from: bs0.c$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lbs0/c$a;", "Lgz/b$a;", "", "", "paymentsIds", "Lur0/a;", "alias", "", "paymentPackageId", "<init>", "(Ljava/util/List;Lur0/a;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lur0/a;", "()Lur0/a;", "c", "Ljava/lang/Long;", "getPaymentPackageId", "()Ljava/lang/Long;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> paymentsIds;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEAlias alias;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long paymentPackageId;

        public Params(List<String> list, BEAlias bEAlias, Long l15) {
            this.paymentsIds = list;
            this.alias = bEAlias;
            this.paymentPackageId = l15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BEAlias getAlias() {
            return this.alias;
        }

        public final List<String> b() {
            return this.paymentsIds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.paymentsIds, params.paymentsIds) && t.c(this.alias, params.alias) && t.c(this.paymentPackageId, params.paymentPackageId);
        }

        public int hashCode() {
            int iHashCode = ((this.paymentsIds.hashCode() * 31) + this.alias.hashCode()) * 31;
            Long l15 = this.paymentPackageId;
            return iHashCode + (l15 == null ? 0 : l15.hashCode());
        }

        public String toString() {
            return "Params(paymentsIds=" + this.paymentsIds + ", alias=" + this.alias + ", paymentPackageId=" + this.paymentPackageId + ")";
        }
    }
}
