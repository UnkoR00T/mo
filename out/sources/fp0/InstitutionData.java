package fp0;

import fr.t;
import java.security.cert.X509Certificate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fp0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u0019\u0010\"¨\u0006#"}, d2 = {"Lfp0/g;", "", "", "cardId", "institutionId", "", "name", "url", "scope", "purpose", "purposeName", "Ljava/security/cert/X509Certificate;", "certificate", "<init>", "(IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/security/cert/X509Certificate;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Ljava/lang/String;", "d", "h", "e", "g", "f", "Ljava/security/cert/X509Certificate;", "()Ljava/security/cert/X509Certificate;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstitutionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cardId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int institutionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int scope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String purpose;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String purposeName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final X509Certificate certificate;

    public InstitutionData(int i15, int i16, String str, String str2, int i17, String str3, String str4, X509Certificate x509Certificate) {
        this.cardId = i15;
        this.institutionId = i16;
        this.name = str;
        this.url = str2;
        this.scope = i17;
        this.purpose = str3;
        this.purposeName = str4;
        this.certificate = x509Certificate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final X509Certificate getCertificate() {
        return this.certificate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPurpose() {
        return this.purpose;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionData)) {
            return false;
        }
        InstitutionData institutionData = (InstitutionData) other;
        return this.cardId == institutionData.cardId && this.institutionId == institutionData.institutionId && t.c(this.name, institutionData.name) && t.c(this.url, institutionData.url) && this.scope == institutionData.scope && t.c(this.purpose, institutionData.purpose) && t.c(this.purposeName, institutionData.purposeName) && t.c(this.certificate, institutionData.certificate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPurposeName() {
        return this.purposeName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.cardId) * 31) + Integer.hashCode(this.institutionId)) * 31) + this.name.hashCode()) * 31) + this.url.hashCode()) * 31) + Integer.hashCode(this.scope)) * 31) + this.purpose.hashCode()) * 31) + this.purposeName.hashCode()) * 31) + this.certificate.hashCode();
    }

    public String toString() {
        return "InstitutionData(cardId=" + this.cardId + ", institutionId=" + this.institutionId + ", name=" + this.name + ", url=" + this.url + ", scope=" + this.scope + ", purpose=" + this.purpose + ", purposeName=" + this.purposeName + ", certificate=" + this.certificate + ")";
    }
}
