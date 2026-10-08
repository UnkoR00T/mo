package zu1;

import fr.t;
import h30.ButtonData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zu1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lzu1/c;", "", "Lmx/a;", "title", "subtitle", "Lh30/a;", "updateButtonData", "<init>", "(Lmx/a;Lmx/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "c", "Lh30/a;", "()Lh30/a;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmptyDrivingLicenceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData updateButtonData;

    public EmptyDrivingLicenceData(Label label, Label label2, ButtonData buttonData) {
        this.title = label;
        this.subtitle = label2;
        this.updateButtonData = buttonData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ButtonData getUpdateButtonData() {
        return this.updateButtonData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyDrivingLicenceData)) {
            return false;
        }
        EmptyDrivingLicenceData emptyDrivingLicenceData = (EmptyDrivingLicenceData) other;
        return t.c(this.title, emptyDrivingLicenceData.title) && t.c(this.subtitle, emptyDrivingLicenceData.subtitle) && t.c(this.updateButtonData, emptyDrivingLicenceData.updateButtonData);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31;
        ButtonData buttonData = this.updateButtonData;
        return iHashCode + (buttonData == null ? 0 : buttonData.hashCode());
    }

    public String toString() {
        return "EmptyDrivingLicenceData(title=" + this.title + ", subtitle=" + this.subtitle + ", updateButtonData=" + this.updateButtonData + ')';
    }
}
