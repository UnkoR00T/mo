package pl.gov.coi.common.network;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.data.CommonRequestData;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0002\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lpl/gov/coi/common/network/v0;", "T", "CommonRequestData", "", "a", "b", "Lpl/gov/coi/common/network/v0$a;", "Lpl/gov/coi/common/network/v0$b;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface v0<T, CommonRequestData> {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0002\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpl/gov/coi/common/network/v0$a;", "T", "Lpl/gov/coi/common/network/v0;", "Lpl/gov/coi/common/network/data/CommonRequestData;", "<init>", "()V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements v0<T, CommonRequestData<T>> {
    }

    /* JADX INFO: renamed from: pl.gov.coi.common.network.v0$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0019"}, d2 = {"Lpl/gov/coi/common/network/v0$b;", "T", "Lpl/gov/coi/common/network/v0;", "Lpl/gov/coi/common/network/data/CommonRequestData;", "Lry/c;", "certKeyPair", "", "securityToken", "<init>", "(Lry/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lry/c;", "()Lry/c;", "b", "Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Whole<T> implements v0<T, CommonRequestData<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertKeyPair certKeyPair;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String securityToken;

        public Whole(CertKeyPair certKeyPair, String str) {
            this.certKeyPair = certKeyPair;
            this.securityToken = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CertKeyPair getCertKeyPair() {
            return this.certKeyPair;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSecurityToken() {
            return this.securityToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Whole)) {
                return false;
            }
            Whole whole = (Whole) other;
            return fr.t.c(this.certKeyPair, whole.certKeyPair) && fr.t.c(this.securityToken, whole.securityToken);
        }

        public int hashCode() {
            int iHashCode = this.certKeyPair.hashCode() * 31;
            String str = this.securityToken;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Whole(certKeyPair=" + this.certKeyPair + ", securityToken=" + this.securityToken + ')';
        }

        public /* synthetic */ Whole(CertKeyPair certKeyPair, String str, int i15, fr.k kVar) {
            this(certKeyPair, (i15 & 2) != 0 ? null : str);
        }
    }
}
