package pe2;

import fr.t;
import h30.ButtonData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pe2.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Lpe2/a;", "", "Lmx/a;", "addressCords", "title", "Lh30/a;", "selectButtonData", "<init>", "(Lmx/a;Lmx/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "c", "Lh30/a;", "()Lh30/a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectedAddress {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label addressCords;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData selectButtonData;

    public SelectedAddress(Label label, Label label2, ButtonData buttonData) {
        this.addressCords = label;
        this.title = label2;
        this.selectButtonData = buttonData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getAddressCords() {
        return this.addressCords;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ButtonData getSelectButtonData() {
        return this.selectButtonData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedAddress)) {
            return false;
        }
        SelectedAddress selectedAddress = (SelectedAddress) other;
        return t.c(this.addressCords, selectedAddress.addressCords) && t.c(this.title, selectedAddress.title) && t.c(this.selectButtonData, selectedAddress.selectButtonData);
    }

    public int hashCode() {
        Label label = this.addressCords;
        return ((((label == null ? 0 : label.hashCode()) * 31) + this.title.hashCode()) * 31) + this.selectButtonData.hashCode();
    }

    public String toString() {
        return "SelectedAddress(addressCords=" + this.addressCords + ", title=" + this.title + ", selectButtonData=" + this.selectButtonData + ')';
    }
}
