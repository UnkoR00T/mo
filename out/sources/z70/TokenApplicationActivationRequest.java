package z70;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: z70.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Lz70/i;", "", "", "activationChallenge", "deviceName", "publicKey", "", "documentsIdsOnDevice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TokenApplicationActivationRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activationChallenge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String publicKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> documentsIdsOnDevice;

    public TokenApplicationActivationRequest(String str, String str2, String str3, List<String> list) {
        this.activationChallenge = str;
        this.deviceName = str2;
        this.publicKey = str3;
        this.documentsIdsOnDevice = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivationChallenge() {
        return this.activationChallenge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    public final List<String> c() {
        return this.documentsIdsOnDevice;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenApplicationActivationRequest)) {
            return false;
        }
        TokenApplicationActivationRequest tokenApplicationActivationRequest = (TokenApplicationActivationRequest) other;
        return t.c(this.activationChallenge, tokenApplicationActivationRequest.activationChallenge) && t.c(this.deviceName, tokenApplicationActivationRequest.deviceName) && t.c(this.publicKey, tokenApplicationActivationRequest.publicKey) && t.c(this.documentsIdsOnDevice, tokenApplicationActivationRequest.documentsIdsOnDevice);
    }

    public int hashCode() {
        int iHashCode = ((((this.activationChallenge.hashCode() * 31) + this.deviceName.hashCode()) * 31) + this.publicKey.hashCode()) * 31;
        List<String> list = this.documentsIdsOnDevice;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "TokenApplicationActivationRequest(activationChallenge=" + this.activationChallenge + ", deviceName=" + this.deviceName + ", publicKey=" + this.publicKey + ", documentsIdsOnDevice=" + this.documentsIdsOnDevice + ")";
    }
}
