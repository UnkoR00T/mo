package nj0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lnj0/l;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnj0/l$a;", "a", "Lnj0/l$a;", "()Lnj0/l$a;", "code", "b", "Ljava/lang/String;", "message", "c", "title", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactDetailsConfirmationDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("code")
    private final a code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("message")
    private final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: nj0.l$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lnj0/l$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        CONFIRMED("CONFIRMED"),
        INCORRECT_CONFIRMATION_CODE("INCORRECT_CONFIRMATION_CODE"),
        NOTHING_TO_CONFIRM("NOTHING_TO_CONFIRM"),
        ATTEMPT_LIMIT_EXCEEDED("ATTEMPT_LIMIT_EXCEEDED"),
        EXPIRED_CODE("EXPIRED_CODE"),
        UNSPECIFIED("UNSPECIFIED"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ wq.a f136697k = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactDetailsConfirmationDto)) {
            return false;
        }
        ContactDetailsConfirmationDto contactDetailsConfirmationDto = (ContactDetailsConfirmationDto) other;
        return this.code == contactDetailsConfirmationDto.code && fr.t.c(this.message, contactDetailsConfirmationDto.message) && fr.t.c(this.title, contactDetailsConfirmationDto.title);
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ContactDetailsConfirmationDto(code=" + this.code + ", message=" + this.message + ", title=" + this.title + ')';
    }
}
