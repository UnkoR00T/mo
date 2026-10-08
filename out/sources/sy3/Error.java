package sy3;

import al0.CommunityOffice;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sy3.g, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b!\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u000e\u0010-¨\u0006."}, d2 = {"Lsy3/g;", "", "Lsy3/d$b;", "Lsy3/d$a;", "data", "Lhb4/c;", "vmsAdapter", "", "Lal0/v;", "offices", "Lsy3/d$d$a;", "selectedOffice", "officeToVerify", "", "isValid", "<init>", "(Lsy3/d$a;Lhb4/c;Ljava/util/List;Lsy3/d$d$a;Lal0/v;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsy3/d$a;", "getData", "()Lsy3/d$a;", "b", "Lhb4/c;", "()Lhb4/c;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lsy3/d$d$a;", "u", "()Lsy3/d$d$a;", "e", "Lal0/v;", "()Lal0/v;", "f", "Z", "()Z", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d.Data data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c vmsAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CommunityOffice> offices;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final d.InterfaceC4804d.SelectedOffice selectedOffice;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CommunityOffice officeToVerify;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValid;

    public Error(d.Data data, hb4.c cVar, List<CommunityOffice> list, d.InterfaceC4804d.SelectedOffice selectedOffice, CommunityOffice communityOffice, boolean z15) {
        this.data = data;
        this.vmsAdapter = cVar;
        this.offices = list;
        this.selectedOffice = selectedOffice;
        this.officeToVerify = communityOffice;
        this.isValid = z15;
    }

    @Override // sy3.d.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public hb4.c getVmsAdapter() {
        return this.vmsAdapter;
    }

    public final List<CommunityOffice> b() {
        return this.offices;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CommunityOffice getOfficeToVerify() {
        return this.officeToVerify;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.data, error.data) && fr.t.c(this.vmsAdapter, error.vmsAdapter) && fr.t.c(this.offices, error.offices) && fr.t.c(this.selectedOffice, error.selectedOffice) && fr.t.c(this.officeToVerify, error.officeToVerify) && this.isValid == error.isValid;
    }

    @Override // sy3.d
    public d.Data getData() {
        return this.data;
    }

    public int hashCode() {
        int iHashCode = ((((this.data.hashCode() * 31) + this.vmsAdapter.hashCode()) * 31) + this.offices.hashCode()) * 31;
        d.InterfaceC4804d.SelectedOffice selectedOffice = this.selectedOffice;
        return ((((iHashCode + (selectedOffice == null ? 0 : selectedOffice.hashCode())) * 31) + this.officeToVerify.hashCode()) * 31) + Boolean.hashCode(this.isValid);
    }

    /* JADX INFO: renamed from: isValid, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public String toString() {
        return "Error(data=" + this.data + ", vmsAdapter=" + this.vmsAdapter + ", offices=" + this.offices + ", selectedOffice=" + this.selectedOffice + ", officeToVerify=" + this.officeToVerify + ", isValid=" + this.isValid + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final d.InterfaceC4804d.SelectedOffice getSelectedOffice() {
        return this.selectedOffice;
    }
}
