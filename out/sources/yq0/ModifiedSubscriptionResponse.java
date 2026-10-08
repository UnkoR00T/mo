package yq0;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yq0.v, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b\u0019\u0010\u0004¨\u0006$"}, d2 = {"Lyq0/v;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lyq0/b;", "a", "Ljava/util/List;", "()Ljava/util/List;", "channels", "Ljava/time/OffsetDateTime;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "dateFrom", "c", "dateTo", "d", "Ljava/lang/String;", "getIdKrs", "idKrs", "e", "getPesel", "pesel", "f", "subscriptionId", "g", "email", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ModifiedSubscriptionResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("channels")
    private final List<b> channels;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dateFrom")
    private final OffsetDateTime dateFrom;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dateTo")
    private final OffsetDateTime dateTo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("idKrs")
    private final String idKrs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subscriptionId")
    private final String subscriptionId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("email")
    private final String email;

    public final List<b> a() {
        return this.channels;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getDateFrom() {
        return this.dateFrom;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getDateTo() {
        return this.dateTo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModifiedSubscriptionResponse)) {
            return false;
        }
        ModifiedSubscriptionResponse modifiedSubscriptionResponse = (ModifiedSubscriptionResponse) other;
        return fr.t.c(this.channels, modifiedSubscriptionResponse.channels) && fr.t.c(this.dateFrom, modifiedSubscriptionResponse.dateFrom) && fr.t.c(this.dateTo, modifiedSubscriptionResponse.dateTo) && fr.t.c(this.idKrs, modifiedSubscriptionResponse.idKrs) && fr.t.c(this.pesel, modifiedSubscriptionResponse.pesel) && fr.t.c(this.subscriptionId, modifiedSubscriptionResponse.subscriptionId) && fr.t.c(this.email, modifiedSubscriptionResponse.email);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.channels.hashCode() * 31) + this.dateFrom.hashCode()) * 31) + this.dateTo.hashCode()) * 31) + this.idKrs.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.subscriptionId.hashCode()) * 31;
        String str = this.email;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ModifiedSubscriptionResponse(channels=" + this.channels + ", dateFrom=" + this.dateFrom + ", dateTo=" + this.dateTo + ", idKrs=" + this.idKrs + ", pesel=" + this.pesel + ", subscriptionId=" + this.subscriptionId + ", email=" + this.email + ')';
    }
}
