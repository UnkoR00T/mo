package h90;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: h90.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001d\u0010&¨\u0006'"}, d2 = {"Lh90/f;", "", "", "id", "title", "content", "privateContent", "Ljava/time/OffsetDateTime;", "sendingDateTime", "", "displayed", "pushType", "Lh90/g;", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;ZLjava/lang/String;Lh90/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "h", "d", "e", "Ljava/time/OffsetDateTime;", "g", "()Ljava/time/OffsetDateTime;", "f", "Z", "()Z", "Lh90/g;", "()Lh90/g;", "notificationsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPushHistoryEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String content;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String privateContent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime sendingDateTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean displayed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pushType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPushParameters parameters;

    public BEPushHistoryEntry(String str, String str2, String str3, String str4, OffsetDateTime offsetDateTime, boolean z15, String str5, BEPushParameters bEPushParameters) {
        this.id = str;
        this.title = str2;
        this.content = str3;
        this.privateContent = str4;
        this.sendingDateTime = offsetDateTime;
        this.displayed = z15;
        this.pushType = str5;
        this.parameters = bEPushParameters;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDisplayed() {
        return this.displayed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEPushParameters getParameters() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPrivateContent() {
        return this.privateContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPushHistoryEntry)) {
            return false;
        }
        BEPushHistoryEntry bEPushHistoryEntry = (BEPushHistoryEntry) other;
        return t.c(this.id, bEPushHistoryEntry.id) && t.c(this.title, bEPushHistoryEntry.title) && t.c(this.content, bEPushHistoryEntry.content) && t.c(this.privateContent, bEPushHistoryEntry.privateContent) && t.c(this.sendingDateTime, bEPushHistoryEntry.sendingDateTime) && this.displayed == bEPushHistoryEntry.displayed && t.c(this.pushType, bEPushHistoryEntry.pushType) && t.c(this.parameters, bEPushHistoryEntry.parameters);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPushType() {
        return this.pushType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final OffsetDateTime getSendingDateTime() {
        return this.sendingDateTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31;
        String str = this.privateContent;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sendingDateTime.hashCode()) * 31) + Boolean.hashCode(this.displayed)) * 31;
        String str2 = this.pushType;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.parameters.hashCode();
    }

    public String toString() {
        return "BEPushHistoryEntry(id=" + this.id + ", title=" + this.title + ", content=" + this.content + ", privateContent=" + this.privateContent + ", sendingDateTime=" + this.sendingDateTime + ", displayed=" + this.displayed + ", pushType=" + this.pushType + ", parameters=" + this.parameters + ')';
    }
}
