package k80;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k80.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001b\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001e\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b \u0010\u0011¨\u0006&"}, d2 = {"Lk80/i;", "", "", "serviceIdentifier", "", "scope", "scopeType", "citizenData", "", "sendDataTimestampUTC", "expirationTimestampUTC", "Lk80/g;", "pictureData", "schemaId", "<init>", "(Ljava/lang/String;IILjava/lang/String;JJLk80/g;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "I", "e", "c", "f", "d", "J", "g", "()J", "Lk80/g;", "()Lk80/g;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserDataRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serviceIdentifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int scopeType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String citizenData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long sendDataTimestampUTC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long expirationTimestampUTC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final SecondDocument pictureData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schemaId;

    public UserDataRequest(String str, int i15, int i16, String str2, long j15, long j16, SecondDocument secondDocument, String str3) {
        this.serviceIdentifier = str;
        this.scope = i15;
        this.scopeType = i16;
        this.citizenData = str2;
        this.sendDataTimestampUTC = j15;
        this.expirationTimestampUTC = j16;
        this.pictureData = secondDocument;
        this.schemaId = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCitizenData() {
        return this.citizenData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getExpirationTimestampUTC() {
        return this.expirationTimestampUTC;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SecondDocument getPictureData() {
        return this.pictureData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getScope() {
        return this.scope;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDataRequest)) {
            return false;
        }
        UserDataRequest userDataRequest = (UserDataRequest) other;
        return t.c(this.serviceIdentifier, userDataRequest.serviceIdentifier) && this.scope == userDataRequest.scope && this.scopeType == userDataRequest.scopeType && t.c(this.citizenData, userDataRequest.citizenData) && this.sendDataTimestampUTC == userDataRequest.sendDataTimestampUTC && this.expirationTimestampUTC == userDataRequest.expirationTimestampUTC && t.c(this.pictureData, userDataRequest.pictureData) && t.c(this.schemaId, userDataRequest.schemaId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getScopeType() {
        return this.scopeType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getSendDataTimestampUTC() {
        return this.sendDataTimestampUTC;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.serviceIdentifier.hashCode() * 31) + Integer.hashCode(this.scope)) * 31) + Integer.hashCode(this.scopeType)) * 31) + this.citizenData.hashCode()) * 31) + Long.hashCode(this.sendDataTimestampUTC)) * 31) + Long.hashCode(this.expirationTimestampUTC)) * 31;
        SecondDocument secondDocument = this.pictureData;
        int iHashCode2 = (iHashCode + (secondDocument == null ? 0 : secondDocument.hashCode())) * 31;
        String str = this.schemaId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "UserDataRequest(serviceIdentifier=" + this.serviceIdentifier + ", scope=" + this.scope + ", scopeType=" + this.scopeType + ", citizenData=" + this.citizenData + ", sendDataTimestampUTC=" + this.sendDataTimestampUTC + ", expirationTimestampUTC=" + this.expirationTimestampUTC + ", pictureData=" + this.pictureData + ", schemaId=" + this.schemaId + ")";
    }
}
