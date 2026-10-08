package yq0;

import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yq0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\r¨\u0006\""}, d2 = {"Lyq0/c;", "", "", "Lyq0/b;", "channels", "Ljava/time/LocalDate;", "dateTo", "", "idKrs", "email", "<init>", "(Ljava/util/List;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getChannels", "()Ljava/util/List;", "b", "Ljava/time/LocalDate;", "getDateTo", "()Ljava/time/LocalDate;", "c", "Ljava/lang/String;", "getIdKrs", "d", "getEmail", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreateNationalCourtRegisterSubscriptionRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("channels")
    private final List<b> channels;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dateTo")
    private final LocalDate dateTo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("idKrs")
    private final String idKrs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("email")
    private final String email;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateNationalCourtRegisterSubscriptionRequest(List<? extends b> list, LocalDate localDate, String str, String str2) {
        this.channels = list;
        this.dateTo = localDate;
        this.idKrs = str;
        this.email = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateNationalCourtRegisterSubscriptionRequest)) {
            return false;
        }
        CreateNationalCourtRegisterSubscriptionRequest createNationalCourtRegisterSubscriptionRequest = (CreateNationalCourtRegisterSubscriptionRequest) other;
        return fr.t.c(this.channels, createNationalCourtRegisterSubscriptionRequest.channels) && fr.t.c(this.dateTo, createNationalCourtRegisterSubscriptionRequest.dateTo) && fr.t.c(this.idKrs, createNationalCourtRegisterSubscriptionRequest.idKrs) && fr.t.c(this.email, createNationalCourtRegisterSubscriptionRequest.email);
    }

    public int hashCode() {
        int iHashCode = ((((this.channels.hashCode() * 31) + this.dateTo.hashCode()) * 31) + this.idKrs.hashCode()) * 31;
        String str = this.email;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CreateNationalCourtRegisterSubscriptionRequest(channels=" + this.channels + ", dateTo=" + this.dateTo + ", idKrs=" + this.idKrs + ", email=" + this.email + ')';
    }
}
