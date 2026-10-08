package sy3;

import al0.CommunityOffice;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sy3.f, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\"\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lsy3/f;", "", "Lsy3/d$d;", "Lsy3/d$a;", "data", "<init>", "(Lsy3/d$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsy3/d$a;", "getData", "()Lsy3/d$a;", "", "Lal0/v;", "b", "Ljava/util/List;", "()Ljava/util/List;", "offices", "", "c", "Ljava/lang/Void;", "()Ljava/lang/Void;", "selectedOffice", "d", "Z", "isValid", "()Z", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Loading implements d.InterfaceC4804d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d.Data data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Void selectedOffice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<CommunityOffice> offices = pq.v.n();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isValid = true;

    public Loading(d.Data data) {
        this.data = data;
    }

    @Override // sy3.d.InterfaceC4804d
    public List<CommunityOffice> b() {
        return this.offices;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public Void getSelectedOffice() {
        return this.selectedOffice;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Loading) && fr.t.c(this.data, ((Loading) other).data);
    }

    @Override // sy3.d
    public d.Data getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @Override // sy3.d.InterfaceC4804d
    /* JADX INFO: renamed from: isValid, reason: from getter */
    public boolean getIsValid() {
        return this.isValid;
    }

    public String toString() {
        return "Loading(data=" + this.data + ')';
    }

    @Override // sy3.d.InterfaceC4804d
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ d.InterfaceC4804d.SelectedOffice getSelectedOffice() {
        return (d.InterfaceC4804d.SelectedOffice) getSelectedOffice();
    }
}
