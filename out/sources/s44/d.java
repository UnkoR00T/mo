package s44;

import fr.t;
import java.math.BigDecimal;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ls44/d;", "Lgz/b;", "Ls44/d$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends gz.b<Params, i0> {

    /* JADX INFO: renamed from: s44.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001b"}, d2 = {"Ls44/d$a;", "Lgz/b$a;", "", "gateway", "gatewayMerchantId", "Ljava/math/BigDecimal;", "totalAmount", "merchantName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/math/BigDecimal;", "d", "()Ljava/math/BigDecimal;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String gateway;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String gatewayMerchantId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BigDecimal totalAmount;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String merchantName;

        public Params(String str, String str2, BigDecimal bigDecimal, String str3) {
            this.gateway = str;
            this.gatewayMerchantId = str2;
            this.totalAmount = bigDecimal;
            this.merchantName = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getGateway() {
            return this.gateway;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getGatewayMerchantId() {
            return this.gatewayMerchantId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BigDecimal getTotalAmount() {
            return this.totalAmount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.gateway, params.gateway) && t.c(this.gatewayMerchantId, params.gatewayMerchantId) && t.c(this.totalAmount, params.totalAmount) && t.c(this.merchantName, params.merchantName);
        }

        public int hashCode() {
            return (((((this.gateway.hashCode() * 31) + this.gatewayMerchantId.hashCode()) * 31) + this.totalAmount.hashCode()) * 31) + this.merchantName.hashCode();
        }

        public String toString() {
            return "Params(gateway=" + this.gateway + ", gatewayMerchantId=" + this.gatewayMerchantId + ", totalAmount=" + this.totalAmount + ", merchantName=" + this.merchantName + ")";
        }
    }
}
