package co3;

import java.security.cert.X509Certificate;
import k34.a0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: co3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b%\u0010\u0013R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\u001c\u0010'R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lco3/c;", "", "", "cardId", "institutionId", "", "name", "url", "Lk34/a0;", "scope", "purpose", "purposeName", "Ljava/security/cert/X509Certificate;", "certificate", "", "currentTime", "<init>", "(IILjava/lang/String;Ljava/lang/String;Lk34/a0;ILjava/lang/String;Ljava/security/cert/X509Certificate;J)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Ljava/lang/String;", "d", "h", "e", "Lk34/a0;", "g", "()Lk34/a0;", "f", "Ljava/security/cert/X509Certificate;", "()Ljava/security/cert/X509Certificate;", "i", "J", "getCurrentTime", "()J", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstitutionDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cardId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int institutionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final a0 scope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int purpose;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String purposeName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final X509Certificate certificate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long currentTime;

    public InstitutionDataModel(int i15, int i16, String str, String str2, a0 a0Var, int i17, String str3, X509Certificate x509Certificate, long j15) {
        this.cardId = i15;
        this.institutionId = i16;
        this.name = str;
        this.url = str2;
        this.scope = a0Var;
        this.purpose = i17;
        this.purposeName = str3;
        this.certificate = x509Certificate;
        this.currentTime = j15;
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
    public final int getPurpose() {
        return this.purpose;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionDataModel)) {
            return false;
        }
        InstitutionDataModel institutionDataModel = (InstitutionDataModel) other;
        return this.cardId == institutionDataModel.cardId && this.institutionId == institutionDataModel.institutionId && fr.t.c(this.name, institutionDataModel.name) && fr.t.c(this.url, institutionDataModel.url) && fr.t.c(this.scope, institutionDataModel.scope) && this.purpose == institutionDataModel.purpose && fr.t.c(this.purposeName, institutionDataModel.purposeName) && fr.t.c(this.certificate, institutionDataModel.certificate) && this.currentTime == institutionDataModel.currentTime;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPurposeName() {
        return this.purposeName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a0 getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.cardId) * 31) + Integer.hashCode(this.institutionId)) * 31) + this.name.hashCode()) * 31) + this.url.hashCode()) * 31) + this.scope.hashCode()) * 31) + Integer.hashCode(this.purpose)) * 31) + this.purposeName.hashCode()) * 31) + this.certificate.hashCode()) * 31) + Long.hashCode(this.currentTime);
    }

    public String toString() {
        return "InstitutionDataModel(cardId=" + this.cardId + ", institutionId=" + this.institutionId + ", name=" + this.name + ", url=" + this.url + ", scope=" + this.scope + ", purpose=" + this.purpose + ", purposeName=" + this.purposeName + ", certificate=" + this.certificate + ", currentTime=" + this.currentTime + ')';
    }
}
