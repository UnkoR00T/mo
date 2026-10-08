package yq0;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yq0.d0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lyq0/d0;", "", "", "Lyq0/b;", "channels", "", "subscriptionId", "Ljava/time/OffsetDateTime;", "dateFrom", "Ljava/time/LocalDate;", "dateTo", "email", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/LocalDate;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getChannels", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getSubscriptionId", "c", "Ljava/time/OffsetDateTime;", "getDateFrom", "()Ljava/time/OffsetDateTime;", "d", "Ljava/time/LocalDate;", "getDateTo", "()Ljava/time/LocalDate;", "e", "getEmail", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpdateNationalCourtRegisterSubscriptionRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("channels")
    private final List<b> channels;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subscriptionId")
    private final String subscriptionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dateFrom")
    private final OffsetDateTime dateFrom;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dateTo")
    private final LocalDate dateTo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("email")
    private final String email;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateNationalCourtRegisterSubscriptionRequest(List<? extends b> list, String str, OffsetDateTime offsetDateTime, LocalDate localDate, String str2) {
        this.channels = list;
        this.subscriptionId = str;
        this.dateFrom = offsetDateTime;
        this.dateTo = localDate;
        this.email = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateNationalCourtRegisterSubscriptionRequest)) {
            return false;
        }
        UpdateNationalCourtRegisterSubscriptionRequest updateNationalCourtRegisterSubscriptionRequest = (UpdateNationalCourtRegisterSubscriptionRequest) other;
        return fr.t.c(this.channels, updateNationalCourtRegisterSubscriptionRequest.channels) && fr.t.c(this.subscriptionId, updateNationalCourtRegisterSubscriptionRequest.subscriptionId) && fr.t.c(this.dateFrom, updateNationalCourtRegisterSubscriptionRequest.dateFrom) && fr.t.c(this.dateTo, updateNationalCourtRegisterSubscriptionRequest.dateTo) && fr.t.c(this.email, updateNationalCourtRegisterSubscriptionRequest.email);
    }

    public int hashCode() {
        int iHashCode = ((this.channels.hashCode() * 31) + this.subscriptionId.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.dateFrom;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        LocalDate localDate = this.dateTo;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.email;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "UpdateNationalCourtRegisterSubscriptionRequest(channels=" + this.channels + ", subscriptionId=" + this.subscriptionId + ", dateFrom=" + this.dateFrom + ", dateTo=" + this.dateTo + ", email=" + this.email + ')';
    }
}
