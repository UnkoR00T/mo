package km2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lkm2/a;", "", "Lkm2/a$a;", "data", "Loq/i0;", "k1", "(Lkm2/a$a;)V", "p3", "()Lkm2/a$a;", "a", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: km2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001a\u0010\"¨\u0006#"}, d2 = {"Lkm2/a$a;", "", "Lkm2/b;", "processType", "", "isAnonymous", "", "email", "Lhz/b;", "emailValidation", "consent", "consentValidation", "<init>", "(Lkm2/b;ZLjava/lang/String;Lhz/b;ZLhz/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkm2/b;", "e", "()Lkm2/b;", "b", "Z", "f", "()Z", "c", "Ljava/lang/String;", "d", "Lhz/b;", "()Lhz/b;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContactData {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f111409g = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b processType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAnonymous;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b emailValidation;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean consent;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b consentValidation;

        public ContactData(b bVar, boolean z15, String str, hz.b bVar2, boolean z16, hz.b bVar3) {
            this.processType = bVar;
            this.isAnonymous = z15;
            this.email = str;
            this.emailValidation = bVar2;
            this.consent = z16;
            this.consentValidation = bVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getConsent() {
            return this.consent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hz.b getConsentValidation() {
            return this.consentValidation;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final hz.b getEmailValidation() {
            return this.emailValidation;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final b getProcessType() {
            return this.processType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContactData)) {
                return false;
            }
            ContactData contactData = (ContactData) other;
            return this.processType == contactData.processType && this.isAnonymous == contactData.isAnonymous && t.c(this.email, contactData.email) && t.c(this.emailValidation, contactData.emailValidation) && this.consent == contactData.consent && t.c(this.consentValidation, contactData.consentValidation);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsAnonymous() {
            return this.isAnonymous;
        }

        public int hashCode() {
            int iHashCode = ((this.processType.hashCode() * 31) + Boolean.hashCode(this.isAnonymous)) * 31;
            String str = this.email;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.emailValidation.hashCode()) * 31) + Boolean.hashCode(this.consent)) * 31) + this.consentValidation.hashCode();
        }

        public String toString() {
            return "ContactData(processType=" + this.processType + ", isAnonymous=" + this.isAnonymous + ", email=" + this.email + ", emailValidation=" + this.emailValidation + ", consent=" + this.consent + ", consentValidation=" + this.consentValidation + ')';
        }
    }

    void k1(ContactData data);

    ContactData p3();
}
