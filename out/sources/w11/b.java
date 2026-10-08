package w11;

import p071kotlin.Metadata;
import th0.UserCertificateMobileApi;
import z11.CertificateData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lw11/b;", "", "a", "b", "Lw11/b$a;", "Lw11/b$b;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw11/b$a;", "Lw11/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f209188a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 2117744234;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: w11.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0003\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lw11/b$b;", "Lw11/b;", "Lth0/t;", "a", "()Lth0/t;", "certificate", "b", "c", "Lw11/b$b$a;", "Lw11/b$b$b;", "Lw11/b$b$c;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC5503b extends b {

        /* JADX INFO: renamed from: w11.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lw11/b$b$a;", "Lw11/b$b;", "Lz11/a;", "selectedCertificate", "Lth0/t;", "certificate", "<init>", "(Lz11/a;Lth0/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz11/a;", "b", "()Lz11/a;", "Lth0/t;", "()Lth0/t;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CertificateRevocation implements InterfaceC5503b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CertificateData selectedCertificate;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final UserCertificateMobileApi certificate;

            public CertificateRevocation(CertificateData certificateData, UserCertificateMobileApi userCertificateMobileApi) {
                this.selectedCertificate = certificateData;
                this.certificate = userCertificateMobileApi;
            }

            @Override // w11.b.InterfaceC5503b
            /* JADX INFO: renamed from: a, reason: from getter */
            public UserCertificateMobileApi getCertificate() {
                return this.certificate;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CertificateData getSelectedCertificate() {
                return this.selectedCertificate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CertificateRevocation)) {
                    return false;
                }
                CertificateRevocation certificateRevocation = (CertificateRevocation) other;
                return fr.t.c(this.selectedCertificate, certificateRevocation.selectedCertificate) && fr.t.c(this.certificate, certificateRevocation.certificate);
            }

            public int hashCode() {
                return (this.selectedCertificate.hashCode() * 31) + this.certificate.hashCode();
            }

            public String toString() {
                return "CertificateRevocation(selectedCertificate=" + this.selectedCertificate + ", certificate=" + this.certificate + ')';
            }
        }

        /* JADX INFO: renamed from: w11.b$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lw11/b$b$b;", "Lw11/b$b;", "Lth0/t;", "certificate", "<init>", "(Lth0/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth0/t;", "()Lth0/t;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displaying implements InterfaceC5503b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UserCertificateMobileApi certificate;

            public Displaying(UserCertificateMobileApi userCertificateMobileApi) {
                this.certificate = userCertificateMobileApi;
            }

            @Override // w11.b.InterfaceC5503b
            /* JADX INFO: renamed from: a, reason: from getter */
            public UserCertificateMobileApi getCertificate() {
                return this.certificate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Displaying) && fr.t.c(this.certificate, ((Displaying) other).certificate);
            }

            public int hashCode() {
                return this.certificate.hashCode();
            }

            public String toString() {
                return "Displaying(certificate=" + this.certificate + ')';
            }
        }

        /* JADX INFO: renamed from: w11.b$b$c, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lw11/b$b$c;", "Lw11/b$b;", "Lhb4/c;", "errorVMS", "Lth0/t;", "certificate", "<init>", "(Lhb4/c;Lth0/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "b", "()Lhb4/c;", "Lth0/t;", "()Lth0/t;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements InterfaceC5503b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final UserCertificateMobileApi certificate;

            public Error(hb4.c cVar, UserCertificateMobileApi userCertificateMobileApi) {
                this.errorVMS = cVar;
                this.certificate = userCertificateMobileApi;
            }

            @Override // w11.b.InterfaceC5503b
            /* JADX INFO: renamed from: a, reason: from getter */
            public UserCertificateMobileApi getCertificate() {
                return this.certificate;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.errorVMS, error.errorVMS) && fr.t.c(this.certificate, error.certificate);
            }

            public int hashCode() {
                return (this.errorVMS.hashCode() * 31) + this.certificate.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ", certificate=" + this.certificate + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        UserCertificateMobileApi getCertificate();
    }
}
