package fp0;

import fr.t;
import java.security.cert.X509Certificate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fp0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\"R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010\f\"\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lfp0/f;", "", "Lfp0/f$a;", "card", "Ljava/security/cert/X509Certificate;", "certificate", "", "requestId", "formName", "<init>", "(Lfp0/f$a;Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfp0/f$a;", "()Lfp0/f$a;", "setCard", "(Lfp0/f$a;)V", "b", "Ljava/security/cert/X509Certificate;", "()Ljava/security/cert/X509Certificate;", "setCertificate", "(Ljava/security/cert/X509Certificate;)V", "c", "Ljava/lang/String;", "d", "setRequestId", "(Ljava/lang/String;)V", "setFormName", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstitutionCardAndCertData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private Card card;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private X509Certificate certificate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String requestId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String formName;

    /* JADX INFO: renamed from: fp0.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0016\u0010\u0011¨\u0006\""}, d2 = {"Lfp0/f$a;", "", "", "id", "name", "url", "", "scope", "purpose", "purposeName", "institutionId", "cardId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getName", "c", "f", "d", "I", "e", "g", "h", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Card {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int scope;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String purpose;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String purposeName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int institutionId;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int cardId;

        public Card(String str, String str2, String str3, int i15, String str4, String str5, int i16, int i17) {
            this.id = str;
            this.name = str2;
            this.url = str3;
            this.scope = i15;
            this.purpose = str4;
            this.purposeName = str5;
            this.institutionId = i16;
            this.cardId = i17;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCardId() {
            return this.cardId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getInstitutionId() {
            return this.institutionId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPurpose() {
            return this.purpose;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPurposeName() {
            return this.purposeName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getScope() {
            return this.scope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return t.c(this.id, card.id) && t.c(this.name, card.name) && t.c(this.url, card.url) && this.scope == card.scope && t.c(this.purpose, card.purpose) && t.c(this.purposeName, card.purposeName) && this.institutionId == card.institutionId && this.cardId == card.cardId;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.url;
            int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.scope)) * 31;
            String str4 = this.purpose;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.purposeName;
            return ((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.institutionId)) * 31) + Integer.hashCode(this.cardId);
        }

        public String toString() {
            return "Card(id=" + this.id + ", name=" + this.name + ", url=" + this.url + ", scope=" + this.scope + ", purpose=" + this.purpose + ", purposeName=" + this.purposeName + ", institutionId=" + this.institutionId + ", cardId=" + this.cardId + ")";
        }
    }

    public InstitutionCardAndCertData(Card card, X509Certificate x509Certificate, String str, String str2) {
        this.card = card;
        this.certificate = x509Certificate;
        this.requestId = str;
        this.formName = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Card getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final X509Certificate getCertificate() {
        return this.certificate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFormName() {
        return this.formName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionCardAndCertData)) {
            return false;
        }
        InstitutionCardAndCertData institutionCardAndCertData = (InstitutionCardAndCertData) other;
        return t.c(this.card, institutionCardAndCertData.card) && t.c(this.certificate, institutionCardAndCertData.certificate) && t.c(this.requestId, institutionCardAndCertData.requestId) && t.c(this.formName, institutionCardAndCertData.formName);
    }

    public int hashCode() {
        return (((((this.card.hashCode() * 31) + this.certificate.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.formName.hashCode();
    }

    public String toString() {
        return "InstitutionCardAndCertData(card=" + this.card + ", certificate=" + this.certificate + ", requestId=" + this.requestId + ", formName=" + this.formName + ")";
    }
}
