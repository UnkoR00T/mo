package sq0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sq0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001f"}, d2 = {"Lsq0/b;", "", "Lsq0/d;", "idKrs", "Lfz/b$c;", "dateTo", "", "Lsq0/a;", "channels", "", "email", "<init>", "(Ljava/lang/String;Lfz/b$c;Ljava/util/List;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lfz/b$c;", "()Lfz/b$c;", "c", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BECreateNationalCourtRegisterSubscriptionRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String idKrs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate dateTo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<a> channels;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    public /* synthetic */ BECreateNationalCourtRegisterSubscriptionRequest(String str, fz.b.LocalDate localDate, List list, String str2, fr.k kVar) {
        this(str, localDate, list, str2);
    }

    public final List<a> a() {
        return this.channels;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.LocalDate getDateTo() {
        return this.dateTo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIdKrs() {
        return this.idKrs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BECreateNationalCourtRegisterSubscriptionRequest)) {
            return false;
        }
        BECreateNationalCourtRegisterSubscriptionRequest bECreateNationalCourtRegisterSubscriptionRequest = (BECreateNationalCourtRegisterSubscriptionRequest) other;
        return d.b(this.idKrs, bECreateNationalCourtRegisterSubscriptionRequest.idKrs) && t.c(this.dateTo, bECreateNationalCourtRegisterSubscriptionRequest.dateTo) && t.c(this.channels, bECreateNationalCourtRegisterSubscriptionRequest.channels) && t.c(this.email, bECreateNationalCourtRegisterSubscriptionRequest.email);
    }

    public int hashCode() {
        int iC = ((((d.c(this.idKrs) * 31) + this.dateTo.hashCode()) * 31) + this.channels.hashCode()) * 31;
        String str = this.email;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BECreateNationalCourtRegisterSubscriptionRequest(idKrs=" + d.d(this.idKrs) + ", dateTo=" + this.dateTo + ", channels=" + this.channels + ", email=" + this.email + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BECreateNationalCourtRegisterSubscriptionRequest(String str, fz.b.LocalDate localDate, List<? extends a> list, String str2) {
        this.idKrs = str;
        this.dateTo = localDate;
        this.channels = list;
        this.email = str2;
    }
}
