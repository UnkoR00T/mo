package gn2;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gn2.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lgn2/b;", "", "", "", "maliciousWebsiteAddresses", "Lmn2/a$a;", "issueDescriptionData", "Lkm2/a$a;", "contactData", "<init>", "(Ljava/util/List;Lmn2/a$a;Lkm2/a$a;)V", "a", "(Ljava/util/List;Lmn2/a$a;Lkm2/a$a;)Lgn2/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Lmn2/a$a;", "d", "()Lmn2/a$a;", "c", "Lkm2/a$a;", "()Lkm2/a$a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> maliciousWebsiteAddresses;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final mn2.a.IssueDescriptionData issueDescriptionData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final km2.a.ContactData contactData;

    public State(List<String> list, mn2.a.IssueDescriptionData issueDescriptionData, km2.a.ContactData contactData) {
        this.maliciousWebsiteAddresses = list;
        this.issueDescriptionData = issueDescriptionData;
        this.contactData = contactData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, List list, mn2.a.IssueDescriptionData issueDescriptionData, km2.a.ContactData contactData, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = state.maliciousWebsiteAddresses;
        }
        if ((i15 & 2) != 0) {
            issueDescriptionData = state.issueDescriptionData;
        }
        if ((i15 & 4) != 0) {
            contactData = state.contactData;
        }
        return state.a(list, issueDescriptionData, contactData);
    }

    public final State a(List<String> maliciousWebsiteAddresses, mn2.a.IssueDescriptionData issueDescriptionData, km2.a.ContactData contactData) {
        return new State(maliciousWebsiteAddresses, issueDescriptionData, contactData);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final km2.a.ContactData getContactData() {
        return this.contactData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final mn2.a.IssueDescriptionData getIssueDescriptionData() {
        return this.issueDescriptionData;
    }

    public final List<String> e() {
        return this.maliciousWebsiteAddresses;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.maliciousWebsiteAddresses, state.maliciousWebsiteAddresses) && t.c(this.issueDescriptionData, state.issueDescriptionData) && t.c(this.contactData, state.contactData);
    }

    public int hashCode() {
        return (((this.maliciousWebsiteAddresses.hashCode() * 31) + this.issueDescriptionData.hashCode()) * 31) + this.contactData.hashCode();
    }

    public String toString() {
        return "State(maliciousWebsiteAddresses=" + this.maliciousWebsiteAddresses + ", issueDescriptionData=" + this.issueDescriptionData + ", contactData=" + this.contactData + ')';
    }
}
