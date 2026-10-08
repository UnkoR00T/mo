package qn2;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qn2.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lqn2/b;", "", "Lun2/a$a;", "descriptionData", "", "Lwx/i;", "attachments", "Lkm2/a$a;", "contactData", "<init>", "(Lun2/a$a;Ljava/util/List;Lkm2/a$a;)V", "a", "(Lun2/a$a;Ljava/util/List;Lkm2/a$a;)Lqn2/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lun2/a$a;", "e", "()Lun2/a$a;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lkm2/a$a;", "d", "()Lkm2/a$a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final un2.a.OtherIssueDescriptionData descriptionData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<wx.i> attachments;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final km2.a.ContactData contactData;

    /* JADX WARN: Multi-variable type inference failed */
    public State(un2.a.OtherIssueDescriptionData otherIssueDescriptionData, List<? extends wx.i> list, km2.a.ContactData contactData) {
        this.descriptionData = otherIssueDescriptionData;
        this.attachments = list;
        this.contactData = contactData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, un2.a.OtherIssueDescriptionData otherIssueDescriptionData, List list, km2.a.ContactData contactData, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            otherIssueDescriptionData = state.descriptionData;
        }
        if ((i15 & 2) != 0) {
            list = state.attachments;
        }
        if ((i15 & 4) != 0) {
            contactData = state.contactData;
        }
        return state.a(otherIssueDescriptionData, list, contactData);
    }

    public final State a(un2.a.OtherIssueDescriptionData descriptionData, List<? extends wx.i> attachments, km2.a.ContactData contactData) {
        return new State(descriptionData, attachments, contactData);
    }

    public final List<wx.i> c() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final km2.a.ContactData getContactData() {
        return this.contactData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final un2.a.OtherIssueDescriptionData getDescriptionData() {
        return this.descriptionData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.descriptionData, state.descriptionData) && t.c(this.attachments, state.attachments) && t.c(this.contactData, state.contactData);
    }

    public int hashCode() {
        return (((this.descriptionData.hashCode() * 31) + this.attachments.hashCode()) * 31) + this.contactData.hashCode();
    }

    public String toString() {
        return "State(descriptionData=" + this.descriptionData + ", attachments=" + this.attachments + ", contactData=" + this.contactData + ')';
    }
}
