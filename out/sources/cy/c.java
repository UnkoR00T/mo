package cy;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\u000e\n\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcy/c;", "", "", "content", "", "code", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "I", "()I", "d", "c", "e", "f", "Lcy/c$a;", "Lcy/c$b;", "Lcy/c$c;", "Lcy/c$d;", "Lcy/c$e;", "Lcy/c$f;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f38445c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int code;

    /* JADX INFO: renamed from: cy.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcy/c$a;", "Lcy/c;", "", "content", "", "code", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "e", "I", "a", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String content;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int code;

        public Error(String str, int i15) {
            super(str, i15, null);
            this.content = str;
            this.code = i15;
        }

        @Override // cy.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public int getCode() {
            return this.code;
        }

        @Override // cy.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return t.c(this.content, error.content) && this.code == error.code;
        }

        public int hashCode() {
            return (this.content.hashCode() * 31) + Integer.hashCode(this.code);
        }

        public String toString() {
            return "Error(content=" + this.content + ", code=" + this.code + ")";
        }
    }

    /* JADX INFO: renamed from: cy.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b$\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b%\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b&\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b'\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b(\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b)\u0010\u0015R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b*\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001c\u0010/¨\u00060"}, d2 = {"Lcy/c$b;", "Lcy/c;", "", "content", "", "code", "certificate", "dG1", "dG11", "dG12", "dG13", "dG2", "s00", "signedDataBase64", "certificatePinCounter", "certificatePukCounter", "", "certificateIsActivated", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "e", "I", "a", "f", "c", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "Z", "()Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Finished extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String content;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int code;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String certificate;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dG1;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dG11;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dG12;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dG13;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dG2;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String s00;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String signedDataBase64;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final int certificatePinCounter;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final int certificatePukCounter;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean certificateIsActivated;

        public Finished(String str, int i15, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i16, int i17, boolean z15) {
            super(str, i15, null);
            this.content = str;
            this.code = i15;
            this.certificate = str2;
            this.dG1 = str3;
            this.dG11 = str4;
            this.dG12 = str5;
            this.dG13 = str6;
            this.dG2 = str7;
            this.s00 = str8;
            this.signedDataBase64 = str9;
            this.certificatePinCounter = i16;
            this.certificatePukCounter = i17;
            this.certificateIsActivated = z15;
        }

        @Override // cy.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public int getCode() {
            return this.code;
        }

        @Override // cy.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCertificate() {
            return this.certificate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getCertificateIsActivated() {
            return this.certificateIsActivated;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getCertificatePinCounter() {
            return this.certificatePinCounter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Finished)) {
                return false;
            }
            Finished finished = (Finished) other;
            return t.c(this.content, finished.content) && this.code == finished.code && t.c(this.certificate, finished.certificate) && t.c(this.dG1, finished.dG1) && t.c(this.dG11, finished.dG11) && t.c(this.dG12, finished.dG12) && t.c(this.dG13, finished.dG13) && t.c(this.dG2, finished.dG2) && t.c(this.s00, finished.s00) && t.c(this.signedDataBase64, finished.signedDataBase64) && this.certificatePinCounter == finished.certificatePinCounter && this.certificatePukCounter == finished.certificatePukCounter && this.certificateIsActivated == finished.certificateIsActivated;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getCertificatePukCounter() {
            return this.certificatePukCounter;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getDG1() {
            return this.dG1;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getDG11() {
            return this.dG11;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.content.hashCode() * 31) + Integer.hashCode(this.code)) * 31) + this.certificate.hashCode()) * 31) + this.dG1.hashCode()) * 31) + this.dG11.hashCode()) * 31) + this.dG12.hashCode()) * 31) + this.dG13.hashCode()) * 31) + this.dG2.hashCode()) * 31) + this.s00.hashCode()) * 31) + this.signedDataBase64.hashCode()) * 31) + Integer.hashCode(this.certificatePinCounter)) * 31) + Integer.hashCode(this.certificatePukCounter)) * 31) + Boolean.hashCode(this.certificateIsActivated);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getDG12() {
            return this.dG12;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getDG13() {
            return this.dG13;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getDG2() {
            return this.dG2;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getS00() {
            return this.s00;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getSignedDataBase64() {
            return this.signedDataBase64;
        }

        public String toString() {
            return "Finished(content=" + this.content + ", code=" + this.code + ", certificate=" + this.certificate + ", dG1=" + this.dG1 + ", dG11=" + this.dG11 + ", dG12=" + this.dG12 + ", dG13=" + this.dG13 + ", dG2=" + this.dG2 + ", s00=" + this.s00 + ", signedDataBase64=" + this.signedDataBase64 + ", certificatePinCounter=" + this.certificatePinCounter + ", certificatePukCounter=" + this.certificatePukCounter + ", certificateIsActivated=" + this.certificateIsActivated + ")";
        }
    }

    /* JADX INFO: renamed from: cy.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcy/c$c;", "Lcy/c;", "", "content", "", "code", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "e", "I", "a", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String content;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int code;

        public Info(String str, int i15) {
            super(str, i15, null);
            this.content = str;
            this.code = i15;
        }

        @Override // cy.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public int getCode() {
            return this.code;
        }

        @Override // cy.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return t.c(this.content, info.content) && this.code == info.code;
        }

        public int hashCode() {
            return (this.content.hashCode() * 31) + Integer.hashCode(this.code);
        }

        public String toString() {
            return "Info(content=" + this.content + ", code=" + this.code + ")";
        }
    }

    /* JADX INFO: renamed from: cy.c$d, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lcy/c$d;", "Lcy/c;", "", "content", "", "code", "triesLeft", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "e", "I", "a", "f", "c", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvalidPinOrPukError extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String content;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int code;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int triesLeft;

        public InvalidPinOrPukError(String str, int i15, int i16) {
            super(str, i15, null);
            this.content = str;
            this.code = i15;
            this.triesLeft = i16;
        }

        @Override // cy.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public int getCode() {
            return this.code;
        }

        @Override // cy.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTriesLeft() {
            return this.triesLeft;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvalidPinOrPukError)) {
                return false;
            }
            InvalidPinOrPukError invalidPinOrPukError = (InvalidPinOrPukError) other;
            return t.c(this.content, invalidPinOrPukError.content) && this.code == invalidPinOrPukError.code && this.triesLeft == invalidPinOrPukError.triesLeft;
        }

        public int hashCode() {
            return (((this.content.hashCode() * 31) + Integer.hashCode(this.code)) * 31) + Integer.hashCode(this.triesLeft);
        }

        public String toString() {
            return "InvalidPinOrPukError(content=" + this.content + ", code=" + this.code + ", triesLeft=" + this.triesLeft + ")";
        }
    }

    /* JADX INFO: renamed from: cy.c$e, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lcy/c$e;", "Lcy/c;", "", "content", "", "code", "progress", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "e", "I", "a", "f", "c", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Progress extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String content;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int code;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int progress;

        public Progress(String str, int i15, int i16) {
            super(str, i15, null);
            this.content = str;
            this.code = i15;
            this.progress = i16;
        }

        @Override // cy.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public int getCode() {
            return this.code;
        }

        @Override // cy.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getProgress() {
            return this.progress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return t.c(this.content, progress.content) && this.code == progress.code && this.progress == progress.progress;
        }

        public int hashCode() {
            return (((this.content.hashCode() * 31) + Integer.hashCode(this.code)) * 31) + Integer.hashCode(this.progress);
        }

        public String toString() {
            return "Progress(content=" + this.content + ", code=" + this.code + ", progress=" + this.progress + ")";
        }
    }

    /* JADX INFO: renamed from: cy.c$f, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcy/c$f;", "Lcy/c;", "", "content", "", "code", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "e", "I", "a", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Started extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String content;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int code;

        public Started(String str, int i15) {
            super(str, i15, null);
            this.content = str;
            this.code = i15;
        }

        @Override // cy.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public int getCode() {
            return this.code;
        }

        @Override // cy.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Started)) {
                return false;
            }
            Started started = (Started) other;
            return t.c(this.content, started.content) && this.code == started.code;
        }

        public int hashCode() {
            return (this.content.hashCode() * 31) + Integer.hashCode(this.code);
        }

        public String toString() {
            return "Started(content=" + this.content + ", code=" + this.code + ")";
        }
    }

    public /* synthetic */ c(String str, int i15, k kVar) {
        this(str, i15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getContent() {
        return this.content;
    }

    private c(String str, int i15) {
        this.content = str;
        this.code = i15;
    }
}
