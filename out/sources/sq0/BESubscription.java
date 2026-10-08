package sq0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sq0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013¨\u0006$"}, d2 = {"Lsq0/i;", "", "Lsq0/j;", "subscriptionId", "", "Lsq0/a;", "channels", "Lfz/b$f;", "endDate", "startDate", "", "email", "<init>", "(Ljava/lang/String;Ljava/util/List;Lfz/b$f;Lfz/b$f;Ljava/lang/String;Lfr/k;)V", "", "e", "()Z", "f", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Ljava/util/List;", "getChannels", "()Ljava/util/List;", "c", "Lfz/b$f;", "()Lfz/b$f;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BESubscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<a> channels;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime endDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime startDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    public /* synthetic */ BESubscription(String str, List list, fz.b.OffsetDateTime offsetDateTime, fz.b.OffsetDateTime offsetDateTime2, String str2, fr.k kVar) {
        this(str, list, offsetDateTime, offsetDateTime2, str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.OffsetDateTime getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final fz.b.OffsetDateTime getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final boolean e() {
        return this.channels.contains(a.MOBYWATEL);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BESubscription)) {
            return false;
        }
        BESubscription bESubscription = (BESubscription) other;
        return j.b(this.subscriptionId, bESubscription.subscriptionId) && t.c(this.channels, bESubscription.channels) && t.c(this.endDate, bESubscription.endDate) && t.c(this.startDate, bESubscription.startDate) && t.c(this.email, bESubscription.email);
    }

    public final boolean f() {
        return this.channels.contains(a.EMAIL);
    }

    public int hashCode() {
        int iC = ((((((j.c(this.subscriptionId) * 31) + this.channels.hashCode()) * 31) + this.endDate.hashCode()) * 31) + this.startDate.hashCode()) * 31;
        String str = this.email;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BESubscription(subscriptionId=" + j.d(this.subscriptionId) + ", channels=" + this.channels + ", endDate=" + this.endDate + ", startDate=" + this.startDate + ", email=" + this.email + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BESubscription(String str, List<? extends a> list, fz.b.OffsetDateTime offsetDateTime, fz.b.OffsetDateTime offsetDateTime2, String str2) {
        this.subscriptionId = str;
        this.channels = list;
        this.endDate = offsetDateTime;
        this.startDate = offsetDateTime2;
        this.email = str2;
    }
}
