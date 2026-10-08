package r74;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.t;
import java.io.Serializable;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: r74.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u000e¨\u0006'"}, d2 = {"Lr74/a;", "Ljava/io/Serializable;", "", "messageId", "", "messageDisplayed", "Ljava/time/OffsetDateTime;", "messageDate", "messageTitle", "messageText", "messagePrivateText", "<init>", "(Ljava/lang/String;ZLjava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", i.f37086m, "b", "Z", "l", "()Z", "c", "Ljava/time/OffsetDateTime;", ip.a.f96137b, "()Ljava/time/OffsetDateTime;", "d", "q", "e", "z", "f", "x", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DefaultNotificationDetailsData implements Serializable {

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

    public DefaultNotificationDetailsData(String str, boolean z15, OffsetDateTime offsetDateTime, String str2, String str3, String str4) {
        this.messageId = str;
        this.messageDisplayed = z15;
        this.messageDate = offsetDateTime;
        this.messageTitle = str2;
        this.messageText = str3;
        this.messagePrivateText = str4;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final OffsetDateTime getMessageDate() {
        return this.messageDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultNotificationDetailsData)) {
            return false;
        }
        DefaultNotificationDetailsData defaultNotificationDetailsData = (DefaultNotificationDetailsData) other;
        return t.c(this.messageId, defaultNotificationDetailsData.messageId) && this.messageDisplayed == defaultNotificationDetailsData.messageDisplayed && t.c(this.messageDate, defaultNotificationDetailsData.messageDate) && t.c(this.messageTitle, defaultNotificationDetailsData.messageTitle) && t.c(this.messageText, defaultNotificationDetailsData.messageText) && t.c(this.messagePrivateText, defaultNotificationDetailsData.messagePrivateText);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.messageId.hashCode() * 31) + Boolean.hashCode(this.messageDisplayed)) * 31) + this.messageDate.hashCode()) * 31) + this.messageTitle.hashCode()) * 31) + this.messageText.hashCode()) * 31;
        String str = this.messagePrivateText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getMessageDisplayed() {
        return this.messageDisplayed;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getMessageTitle() {
        return this.messageTitle;
    }

    public String toString() {
        return "DefaultNotificationDetailsData(messageId=" + this.messageId + ", messageDisplayed=" + this.messageDisplayed + ", messageDate=" + this.messageDate + ", messageTitle=" + this.messageTitle + ", messageText=" + this.messageText + ", messagePrivateText=" + this.messagePrivateText + ")";
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getMessagePrivateText() {
        return this.messagePrivateText;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getMessageText() {
        return this.messageText;
    }
}
