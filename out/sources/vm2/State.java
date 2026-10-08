package vm2;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vm2.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lvm2/b;", "", "", "", "illegalContent", "issueDescription", "Lkm2/a$a;", "contactData", "<init>", "(Ljava/util/List;Ljava/lang/String;Lkm2/a$a;)V", "a", "(Ljava/util/List;Ljava/lang/String;Lkm2/a$a;)Lvm2/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Ljava/lang/String;", "e", "c", "Lkm2/a$a;", "()Lkm2/a$a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> illegalContent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issueDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final km2.a.ContactData contactData;

    public State(List<String> list, String str, km2.a.ContactData contactData) {
        this.illegalContent = list;
        this.issueDescription = str;
        this.contactData = contactData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, List list, String str, km2.a.ContactData contactData, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = state.illegalContent;
        }
        if ((i15 & 2) != 0) {
            str = state.issueDescription;
        }
        if ((i15 & 4) != 0) {
            contactData = state.contactData;
        }
        return state.a(list, str, contactData);
    }

    public final State a(List<String> illegalContent, String issueDescription, km2.a.ContactData contactData) {
        return new State(illegalContent, issueDescription, contactData);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final km2.a.ContactData getContactData() {
        return this.contactData;
    }

    public final List<String> d() {
        return this.illegalContent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIssueDescription() {
        return this.issueDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.illegalContent, state.illegalContent) && t.c(this.issueDescription, state.issueDescription) && t.c(this.contactData, state.contactData);
    }

    public int hashCode() {
        return (((this.illegalContent.hashCode() * 31) + this.issueDescription.hashCode()) * 31) + this.contactData.hashCode();
    }

    public String toString() {
        return "State(illegalContent=" + this.illegalContent + ", issueDescription=" + this.issueDescription + ", contactData=" + this.contactData + ')';
    }
}
