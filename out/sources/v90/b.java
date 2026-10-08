package v90;

import p071kotlin.Metadata;
import z70.DocumentToGenerate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lv90/b;", "", "h", "c", "d", "e", "g", "f", "a", "b", "Lv90/b$a;", "Lv90/b$b;", "Lv90/b$c;", "Lv90/b$d;", "Lv90/b$e;", "Lv90/b$f;", "Lv90/b$g;", "Lv90/b$h;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv90/b$a;", "Lv90/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f205311a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -576675787;
        }

        public String toString() {
            return "DownloadFailed";
        }
    }

    /* JADX INFO: renamed from: v90.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lv90/b$b;", "Lv90/b;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(hb4.c cVar) {
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
        }

        public int hashCode() {
            return this.errorVMS.hashCode();
        }

        public String toString() {
            return "Error(errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: v90.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lv90/b$c;", "Lv90/b;", "", "authenticationToken", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetActivationChallenge implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authenticationToken;

        public GetActivationChallenge(String str) {
            this.authenticationToken = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAuthenticationToken() {
            return this.authenticationToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetActivationChallenge) && fr.t.c(this.authenticationToken, ((GetActivationChallenge) other).authenticationToken);
        }

        public int hashCode() {
            return this.authenticationToken.hashCode();
        }

        public String toString() {
            return "GetActivationChallenge(authenticationToken=" + this.authenticationToken + ')';
        }
    }

    /* JADX INFO: renamed from: v90.b$d, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lv90/b$d;", "Lv90/b;", "", "activationChallenge", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitActivation implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String activationChallenge;

        public InitActivation(String str) {
            this.activationChallenge = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivationChallenge() {
            return this.activationChallenge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitActivation) && fr.t.c(this.activationChallenge, ((InitActivation) other).activationChallenge);
        }

        public int hashCode() {
            return this.activationChallenge.hashCode();
        }

        public String toString() {
            return "InitActivation(activationChallenge=" + this.activationChallenge + ')';
        }
    }

    /* JADX INFO: renamed from: v90.b$e, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lv90/b$e;", "Lv90/b;", "Lz70/e;", "documentToGenerate", "", "sourceDocumentAccessToken", "<init>", "(Lz70/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz70/e;", "()Lz70/e;", "b", "Ljava/lang/String;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitAsyncDataDownload implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentToGenerate documentToGenerate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sourceDocumentAccessToken;

        public InitAsyncDataDownload(DocumentToGenerate documentToGenerate, String str) {
            this.documentToGenerate = documentToGenerate;
            this.sourceDocumentAccessToken = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DocumentToGenerate getDocumentToGenerate() {
            return this.documentToGenerate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSourceDocumentAccessToken() {
            return this.sourceDocumentAccessToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitAsyncDataDownload)) {
                return false;
            }
            InitAsyncDataDownload initAsyncDataDownload = (InitAsyncDataDownload) other;
            return fr.t.c(this.documentToGenerate, initAsyncDataDownload.documentToGenerate) && fr.t.c(this.sourceDocumentAccessToken, initAsyncDataDownload.sourceDocumentAccessToken);
        }

        public int hashCode() {
            return (this.documentToGenerate.hashCode() * 31) + this.sourceDocumentAccessToken.hashCode();
        }

        public String toString() {
            return "InitAsyncDataDownload(documentToGenerate=" + this.documentToGenerate + ", sourceDocumentAccessToken=" + this.sourceDocumentAccessToken + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv90/b$g;", "Lv90/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f205323a = new g();

        private g() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        public int hashCode() {
            return 790799089;
        }

        public String toString() {
            return "ResumeAsyncDataDownload";
        }
    }

    /* JADX INFO: renamed from: v90.b$h, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lv90/b$h;", "Lv90/b;", "", "qrCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartActivation implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String qrCode;

        public StartActivation(String str) {
            this.qrCode = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getQrCode() {
            return this.qrCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartActivation) && fr.t.c(this.qrCode, ((StartActivation) other).qrCode);
        }

        public int hashCode() {
            return this.qrCode.hashCode();
        }

        public String toString() {
            return "StartActivation(qrCode=" + this.qrCode + ')';
        }
    }

    /* JADX INFO: renamed from: v90.b$f, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJN\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lv90/b$f;", "Lv90/b;", "", "documentId", "taskId", "authToken", "", "allowTermination", "terminated", "Lcb4/i;", "terminationDialog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcb4/i;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcb4/i;)Lv90/b$f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "f", "c", "d", "Z", "()Z", "g", "Lcb4/i;", "h", "()Lcb4/i;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ObserveAsyncDataDownload implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String taskId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authToken;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allowTermination;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean terminated;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i terminationDialog;

        public ObserveAsyncDataDownload(String str, String str2, String str3, boolean z15, boolean z16, cb4.i iVar) {
            this.documentId = str;
            this.taskId = str2;
            this.authToken = str3;
            this.allowTermination = z15;
            this.terminated = z16;
            this.terminationDialog = iVar;
        }

        public static /* synthetic */ ObserveAsyncDataDownload b(ObserveAsyncDataDownload observeAsyncDataDownload, String str, String str2, String str3, boolean z15, boolean z16, cb4.i iVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = observeAsyncDataDownload.documentId;
            }
            if ((i15 & 2) != 0) {
                str2 = observeAsyncDataDownload.taskId;
            }
            if ((i15 & 4) != 0) {
                str3 = observeAsyncDataDownload.authToken;
            }
            if ((i15 & 8) != 0) {
                z15 = observeAsyncDataDownload.allowTermination;
            }
            if ((i15 & 16) != 0) {
                z16 = observeAsyncDataDownload.terminated;
            }
            if ((i15 & 32) != 0) {
                iVar = observeAsyncDataDownload.terminationDialog;
            }
            boolean z17 = z16;
            cb4.i iVar2 = iVar;
            return observeAsyncDataDownload.a(str, str2, str3, z15, z17, iVar2);
        }

        public final ObserveAsyncDataDownload a(String documentId, String taskId, String authToken, boolean allowTermination, boolean terminated, cb4.i terminationDialog) {
            return new ObserveAsyncDataDownload(documentId, taskId, authToken, allowTermination, terminated, terminationDialog);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getAllowTermination() {
            return this.allowTermination;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getAuthToken() {
            return this.authToken;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ObserveAsyncDataDownload)) {
                return false;
            }
            ObserveAsyncDataDownload observeAsyncDataDownload = (ObserveAsyncDataDownload) other;
            return fr.t.c(this.documentId, observeAsyncDataDownload.documentId) && fr.t.c(this.taskId, observeAsyncDataDownload.taskId) && fr.t.c(this.authToken, observeAsyncDataDownload.authToken) && this.allowTermination == observeAsyncDataDownload.allowTermination && this.terminated == observeAsyncDataDownload.terminated && fr.t.c(this.terminationDialog, observeAsyncDataDownload.terminationDialog);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTaskId() {
            return this.taskId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getTerminated() {
            return this.terminated;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final cb4.i getTerminationDialog() {
            return this.terminationDialog;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.documentId.hashCode() * 31) + this.taskId.hashCode()) * 31) + this.authToken.hashCode()) * 31) + Boolean.hashCode(this.allowTermination)) * 31) + Boolean.hashCode(this.terminated)) * 31;
            cb4.i iVar = this.terminationDialog;
            return iHashCode + (iVar == null ? 0 : iVar.hashCode());
        }

        public String toString() {
            return "ObserveAsyncDataDownload(documentId=" + this.documentId + ", taskId=" + this.taskId + ", authToken=" + this.authToken + ", allowTermination=" + this.allowTermination + ", terminated=" + this.terminated + ", terminationDialog=" + this.terminationDialog + ')';
        }

        public /* synthetic */ ObserveAsyncDataDownload(String str, String str2, String str3, boolean z15, boolean z16, cb4.i iVar, int i15, fr.k kVar) {
            this(str, str2, str3, (i15 & 8) != 0 ? false : z15, (i15 & 16) != 0 ? false : z16, (i15 & 32) != 0 ? null : iVar);
        }
    }
}
