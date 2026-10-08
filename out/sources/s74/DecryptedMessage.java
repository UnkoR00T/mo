package s74;

import fr.t;
import java.io.Serializable;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s74.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b\u001b\u0010&¨\u0006'"}, d2 = {"Ls74/a;", "Ljava/io/Serializable;", "", "id", "Ls74/a$a;", "type", "title", "text", "Ljava/time/OffsetDateTime;", "sendDateTime", "privateText", "Ls74/d;", "parameters", "<init>", "(Ljava/lang/String;Ls74/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ls74/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ls74/a$a;", "g", "()Ls74/a$a;", "c", "f", "d", "e", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "Ls74/d;", "()Ls74/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DecryptedMessage implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC4591a type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime sendDateTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String privateText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final RemoteMessageParameters parameters;

    /* JADX INFO: renamed from: s74.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Ls74/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC4591a {
        TRUSTED_PROFILE_AUTHORIZATION,
        NOT_MAPPED,
        NEW_PAYMENT_IN_OFFICE,
        EXTERNAL_QUALIFIED_SIGNATURE_AUTHORIZATION,
        VEHICLE_COLLISION_REPORT_REMINDER,
        DEFENCE_TRAINING_NAVIGATION,
        LAND_REGISTER_DOCUMENT,
        NATIONAL_COURT_REGISTRY_SUBSCRIPTION_EXPIRY_REMINDER,
        NATIONAL_COURT_REGISTRY_SUBSCRIPTION_EXPIRED,
        COUNTRY_TRAVEL_ADVISORY_UPDATE;


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ wq.a f178885m = wq.b.a(b());
    }

    public DecryptedMessage(String str, EnumC4591a enumC4591a, String str2, String str3, OffsetDateTime offsetDateTime, String str4, RemoteMessageParameters remoteMessageParameters) {
        this.id = str;
        this.type = enumC4591a;
        this.title = str2;
        this.text = str3;
        this.sendDateTime = offsetDateTime;
        this.privateText = str4;
        this.parameters = remoteMessageParameters;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final RemoteMessageParameters getParameters() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPrivateText() {
        return this.privateText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final OffsetDateTime getSendDateTime() {
        return this.sendDateTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecryptedMessage)) {
            return false;
        }
        DecryptedMessage decryptedMessage = (DecryptedMessage) other;
        return t.c(this.id, decryptedMessage.id) && this.type == decryptedMessage.type && t.c(this.title, decryptedMessage.title) && t.c(this.text, decryptedMessage.text) && t.c(this.sendDateTime, decryptedMessage.sendDateTime) && t.c(this.privateText, decryptedMessage.privateText) && t.c(this.parameters, decryptedMessage.parameters);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC4591a getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.sendDateTime;
        int iHashCode4 = (iHashCode3 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str4 = this.privateText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        RemoteMessageParameters remoteMessageParameters = this.parameters;
        return iHashCode5 + (remoteMessageParameters != null ? remoteMessageParameters.hashCode() : 0);
    }

    public String toString() {
        return "DecryptedMessage(id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", text=" + this.text + ", sendDateTime=" + this.sendDateTime + ", privateText=" + this.privateText + ", parameters=" + this.parameters + ")";
    }
}
