package ma1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ma1.h, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lma1/h;", "", "", "message", "Lma1/i;", "type", "Lma1/k;", "link", "<init>", "(Ljava/lang/String;Lma1/i;Lma1/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lma1/i;", "c", "()Lma1/i;", "Lma1/k;", "()Lma1/k;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyInfoAlert {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final i type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final CompanyLink link;

    public CompanyInfoAlert(String str, i iVar, CompanyLink companyLink) {
        this.message = str;
        this.type = iVar;
        this.link = companyLink;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CompanyLink getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyInfoAlert)) {
            return false;
        }
        CompanyInfoAlert companyInfoAlert = (CompanyInfoAlert) other;
        return fr.t.c(this.message, companyInfoAlert.message) && this.type == companyInfoAlert.type && fr.t.c(this.link, companyInfoAlert.link);
    }

    public int hashCode() {
        int iHashCode = ((this.message.hashCode() * 31) + this.type.hashCode()) * 31;
        CompanyLink companyLink = this.link;
        return iHashCode + (companyLink == null ? 0 : companyLink.hashCode());
    }

    public String toString() {
        return "CompanyInfoAlert(message=" + this.message + ", type=" + this.type + ", link=" + this.link + ')';
    }
}
