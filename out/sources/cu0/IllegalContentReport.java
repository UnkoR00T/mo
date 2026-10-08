package cu0;

import fr.k;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cu0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcu0/c;", "", "", "", "domains", "description", "email", "Lcu0/d;", "type", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcu0/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "d", "Lcu0/d;", "()Lcu0/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IllegalContentReport {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> domains;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final d type;

    public IllegalContentReport(List<String> list, String str, String str2, d dVar) {
        this.domains = list;
        this.description = str;
        this.email = str2;
        this.type = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<String> b() {
        return this.domains;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IllegalContentReport)) {
            return false;
        }
        IllegalContentReport illegalContentReport = (IllegalContentReport) other;
        return t.c(this.domains, illegalContentReport.domains) && t.c(this.description, illegalContentReport.description) && t.c(this.email, illegalContentReport.email) && this.type == illegalContentReport.type;
    }

    public int hashCode() {
        int iHashCode = this.domains.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "IllegalContentReport(domains=" + this.domains + ", description=" + this.description + ", email=" + this.email + ", type=" + this.type + ")";
    }

    public /* synthetic */ IllegalContentReport(List list, String str, String str2, d dVar, int i15, k kVar) {
        this(list, str, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? d.CHILD_ABUSE : dVar);
    }
}
