package kt0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: kt0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b\u001f\u0010(R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b)\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001d\u0010,¨\u0006-"}, d2 = {"Lkt0/b;", "", "", "id", "title", "content", "Ljava/time/OffsetDateTime;", "sendingDateTime", "Lkt0/b$a;", "pushType", "Lkt0/i;", "parameters", "sendersId", "privateContent", "", "displayed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Lkt0/b$a;Lkt0/i;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "h", "d", "Ljava/time/OffsetDateTime;", "g", "()Ljava/time/OffsetDateTime;", "e", "Lkt0/b$a;", "f", "()Lkt0/b$a;", "Lkt0/i;", "()Lkt0/i;", "getSendersId", "i", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String content;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime sendingDateTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final a pushType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final RemoteMessageParameters parameters;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sendersId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String privateContent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean displayed;

    /* JADX INFO: renamed from: kt0.b$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkt0/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        EXTERNAL_QUALIFIED_SIGNATURE_AUTHORIZATION,
        TRUSTED_PROFILE_AUTHORIZATION,
        NEW_PAYMENT_IN_OFFICE,
        COUNTRY_TRAVEL_ADVISORY_UPDATE,
        NOT_MAPPED;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f112654g = wq.b.a(b());
    }

    public NotificationRecord(String str, String str2, String str3, OffsetDateTime offsetDateTime, a aVar, RemoteMessageParameters remoteMessageParameters, String str4, String str5, boolean z15) {
        this.id = str;
        this.title = str2;
        this.content = str3;
        this.sendingDateTime = offsetDateTime;
        this.pushType = aVar;
        this.parameters = remoteMessageParameters;
        this.sendersId = str4;
        this.privateContent = str5;
        this.displayed = z15;
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
    public final RemoteMessageParameters getParameters() {
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
        if (!(other instanceof NotificationRecord)) {
            return false;
        }
        NotificationRecord notificationRecord = (NotificationRecord) other;
        return t.c(this.id, notificationRecord.id) && t.c(this.title, notificationRecord.title) && t.c(this.content, notificationRecord.content) && t.c(this.sendingDateTime, notificationRecord.sendingDateTime) && this.pushType == notificationRecord.pushType && t.c(this.parameters, notificationRecord.parameters) && t.c(this.sendersId, notificationRecord.sendersId) && t.c(this.privateContent, notificationRecord.privateContent) && this.displayed == notificationRecord.displayed;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getPushType() {
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
        int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + this.sendingDateTime.hashCode()) * 31;
        a aVar = this.pushType;
        int iHashCode2 = (((((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.parameters.hashCode()) * 31) + this.sendersId.hashCode()) * 31;
        String str = this.privateContent;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.displayed);
    }

    public String toString() {
        return "NotificationRecord(id=" + this.id + ", title=" + this.title + ", content=" + this.content + ", sendingDateTime=" + this.sendingDateTime + ", pushType=" + this.pushType + ", parameters=" + this.parameters + ", sendersId=" + this.sendersId + ", privateContent=" + this.privateContent + ", displayed=" + this.displayed + ")";
    }
}
