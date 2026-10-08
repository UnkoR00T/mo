package eo2;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.t;
import java.io.Serializable;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0014\u0015R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Leo2/a;", "Ljava/io/Serializable;", "", i.f37086m, "()Ljava/lang/String;", "messageId", "", "l", "()Z", "messageDisplayed", "Ljava/time/OffsetDateTime;", ip.a.f96137b, "()Ljava/time/OffsetDateTime;", "messageDate", "q", "messageTitle", "z", "messageText", "x", "messagePrivateText", "b", "a", "Leo2/a$a;", "Leo2/a$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends Serializable {

    /* JADX INFO: renamed from: eo2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b\u001c\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001a\u001a\u0004\b \u0010\u0011¨\u0006-"}, d2 = {"Leo2/a$a;", "Leo2/a;", "", "messageId", "", "messageDisplayed", "Ljava/time/OffsetDateTime;", "messageDate", "messageTitle", "messageText", "messagePrivateText", "authorizationId", "expirationDateTime", "processId", "<init>", "(Ljava/lang/String;ZLjava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", i.f37086m, "b", "Z", "l", "()Z", "c", "Ljava/time/OffsetDateTime;", ip.a.f96137b, "()Ljava/time/OffsetDateTime;", "d", "q", "e", "z", "f", "x", "g", "h", "j", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QualifiedSignatureConfirmationData implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean messageDisplayed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime messageDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageTitle;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageText;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messagePrivateText;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authorizationId;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime expirationDateTime;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String processId;

        public QualifiedSignatureConfirmationData(String str, boolean z15, OffsetDateTime offsetDateTime, String str2, String str3, String str4, String str5, OffsetDateTime offsetDateTime2, String str6) {
            this.messageId = str;
            this.messageDisplayed = z15;
            this.messageDate = offsetDateTime;
            this.messageTitle = str2;
            this.messageText = str3;
            this.messagePrivateText = str4;
            this.authorizationId = str5;
            this.expirationDateTime = offsetDateTime2;
            this.processId = str6;
        }

        @Override // eo2.a
        /* JADX INFO: renamed from: P, reason: from getter */
        public String getMessageId() {
            return this.messageId;
        }

        @Override // eo2.a
        /* JADX INFO: renamed from: S, reason: from getter */
        public OffsetDateTime getMessageDate() {
            return this.messageDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAuthorizationId() {
            return this.authorizationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public OffsetDateTime getExpirationDateTime() {
            return this.expirationDateTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QualifiedSignatureConfirmationData)) {
                return false;
            }
            QualifiedSignatureConfirmationData qualifiedSignatureConfirmationData = (QualifiedSignatureConfirmationData) other;
            return t.c(this.messageId, qualifiedSignatureConfirmationData.messageId) && this.messageDisplayed == qualifiedSignatureConfirmationData.messageDisplayed && t.c(this.messageDate, qualifiedSignatureConfirmationData.messageDate) && t.c(this.messageTitle, qualifiedSignatureConfirmationData.messageTitle) && t.c(this.messageText, qualifiedSignatureConfirmationData.messageText) && t.c(this.messagePrivateText, qualifiedSignatureConfirmationData.messagePrivateText) && t.c(this.authorizationId, qualifiedSignatureConfirmationData.authorizationId) && t.c(this.expirationDateTime, qualifiedSignatureConfirmationData.expirationDateTime) && t.c(this.processId, qualifiedSignatureConfirmationData.processId);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.messageId.hashCode() * 31) + Boolean.hashCode(this.messageDisplayed)) * 31) + this.messageDate.hashCode()) * 31) + this.messageTitle.hashCode()) * 31) + this.messageText.hashCode()) * 31;
            String str = this.messagePrivateText;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.authorizationId.hashCode()) * 31) + this.expirationDateTime.hashCode()) * 31) + this.processId.hashCode();
        }

        @Override // eo2.a
        /* JADX INFO: renamed from: l, reason: from getter */
        public boolean getMessageDisplayed() {
            return this.messageDisplayed;
        }

        @Override // eo2.a
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getMessageTitle() {
            return this.messageTitle;
        }

        public String toString() {
            return "QualifiedSignatureConfirmationData(messageId=" + this.messageId + ", messageDisplayed=" + this.messageDisplayed + ", messageDate=" + this.messageDate + ", messageTitle=" + this.messageTitle + ", messageText=" + this.messageText + ", messagePrivateText=" + this.messagePrivateText + ", authorizationId=" + this.authorizationId + ", expirationDateTime=" + this.expirationDateTime + ", processId=" + this.processId + ")";
        }

        @Override // eo2.a
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getMessagePrivateText() {
            return this.messagePrivateText;
        }

        @Override // eo2.a
        /* JADX INFO: renamed from: z, reason: from getter */
        public String getMessageText() {
            return this.messageText;
        }
    }

    /* JADX INFO: renamed from: eo2.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b\u001b\u0010\"¨\u0006+"}, d2 = {"Leo2/a$b;", "Leo2/a;", "", "messageId", "", "messageDisplayed", "Ljava/time/OffsetDateTime;", "messageDate", "messageTitle", "messageText", "messagePrivateText", "authorizationId", "expirationDateTime", "<init>", "(Ljava/lang/String;ZLjava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", i.f37086m, "b", "Z", "l", "()Z", "c", "Ljava/time/OffsetDateTime;", ip.a.f96137b, "()Ljava/time/OffsetDateTime;", "d", "q", "e", "z", "f", "x", "g", "h", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrustedProfileConfirmationData implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean messageDisplayed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime messageDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageTitle;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageText;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messagePrivateText;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authorizationId;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime expirationDateTime;

        public TrustedProfileConfirmationData(String str, boolean z15, OffsetDateTime offsetDateTime, String str2, String str3, String str4, String str5, OffsetDateTime offsetDateTime2) {
            this.messageId = str;
            this.messageDisplayed = z15;
            this.messageDate = offsetDateTime;
            this.messageTitle = str2;
            this.messageText = str3;
            this.messagePrivateText = str4;
            this.authorizationId = str5;
            this.expirationDateTime = offsetDateTime2;
        }

        @Override // eo2.a
        /* JADX INFO: renamed from: P, reason: from getter */
        public String getMessageId() {
            return this.messageId;
        }

        @Override // eo2.a
        /* JADX INFO: renamed from: S, reason: from getter */
        public OffsetDateTime getMessageDate() {
            return this.messageDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAuthorizationId() {
            return this.authorizationId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public OffsetDateTime getExpirationDateTime() {
            return this.expirationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustedProfileConfirmationData)) {
                return false;
            }
            TrustedProfileConfirmationData trustedProfileConfirmationData = (TrustedProfileConfirmationData) other;
            return t.c(this.messageId, trustedProfileConfirmationData.messageId) && this.messageDisplayed == trustedProfileConfirmationData.messageDisplayed && t.c(this.messageDate, trustedProfileConfirmationData.messageDate) && t.c(this.messageTitle, trustedProfileConfirmationData.messageTitle) && t.c(this.messageText, trustedProfileConfirmationData.messageText) && t.c(this.messagePrivateText, trustedProfileConfirmationData.messagePrivateText) && t.c(this.authorizationId, trustedProfileConfirmationData.authorizationId) && t.c(this.expirationDateTime, trustedProfileConfirmationData.expirationDateTime);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.messageId.hashCode() * 31) + Boolean.hashCode(this.messageDisplayed)) * 31) + this.messageDate.hashCode()) * 31) + this.messageTitle.hashCode()) * 31) + this.messageText.hashCode()) * 31;
            String str = this.messagePrivateText;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.authorizationId.hashCode()) * 31) + this.expirationDateTime.hashCode();
        }

        @Override // eo2.a
        /* JADX INFO: renamed from: l, reason: from getter */
        public boolean getMessageDisplayed() {
            return this.messageDisplayed;
        }

        @Override // eo2.a
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getMessageTitle() {
            return this.messageTitle;
        }

        public String toString() {
            return "TrustedProfileConfirmationData(messageId=" + this.messageId + ", messageDisplayed=" + this.messageDisplayed + ", messageDate=" + this.messageDate + ", messageTitle=" + this.messageTitle + ", messageText=" + this.messageText + ", messagePrivateText=" + this.messagePrivateText + ", authorizationId=" + this.authorizationId + ", expirationDateTime=" + this.expirationDateTime + ")";
        }

        @Override // eo2.a
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getMessagePrivateText() {
            return this.messagePrivateText;
        }

        @Override // eo2.a
        /* JADX INFO: renamed from: z, reason: from getter */
        public String getMessageText() {
            return this.messageText;
        }
    }

    /* JADX INFO: renamed from: P */
    String getMessageId();

    /* JADX INFO: renamed from: S */
    OffsetDateTime getMessageDate();

    /* JADX INFO: renamed from: l */
    boolean getMessageDisplayed();

    /* JADX INFO: renamed from: q */
    String getMessageTitle();

    /* JADX INFO: renamed from: x */
    String getMessagePrivateText();

    /* JADX INFO: renamed from: z */
    String getMessageText();
}
