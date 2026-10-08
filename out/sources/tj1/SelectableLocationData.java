package tj1;

import fr.t;
import h30.ButtonData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: tj1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Ltj1/a;", "", "Lmx/a;", "unitName", "unitAddress", "displayedDateLabel", "moreDatesAvailableLabel", "Lh30/a;", "signUpButtonData", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "e", "()Lmx/a;", "b", "d", "c", "Lh30/a;", "()Lh30/a;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectableLocationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label unitName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label unitAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label displayedDateLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label moreDatesAvailableLabel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData signUpButtonData;

    public SelectableLocationData(Label label, Label label2, Label label3, Label label4, ButtonData buttonData) {
        this.unitName = label;
        this.unitAddress = label2;
        this.displayedDateLabel = label3;
        this.moreDatesAvailableLabel = label4;
        this.signUpButtonData = buttonData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDisplayedDateLabel() {
        return this.displayedDateLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getMoreDatesAvailableLabel() {
        return this.moreDatesAvailableLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ButtonData getSignUpButtonData() {
        return this.signUpButtonData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getUnitAddress() {
        return this.unitAddress;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getUnitName() {
        return this.unitName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableLocationData)) {
            return false;
        }
        SelectableLocationData selectableLocationData = (SelectableLocationData) other;
        return t.c(this.unitName, selectableLocationData.unitName) && t.c(this.unitAddress, selectableLocationData.unitAddress) && t.c(this.displayedDateLabel, selectableLocationData.displayedDateLabel) && t.c(this.moreDatesAvailableLabel, selectableLocationData.moreDatesAvailableLabel) && t.c(this.signUpButtonData, selectableLocationData.signUpButtonData);
    }

    public int hashCode() {
        int iHashCode = ((((this.unitName.hashCode() * 31) + this.unitAddress.hashCode()) * 31) + this.displayedDateLabel.hashCode()) * 31;
        Label label = this.moreDatesAvailableLabel;
        int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
        ButtonData buttonData = this.signUpButtonData;
        return iHashCode2 + (buttonData != null ? buttonData.hashCode() : 0);
    }

    public String toString() {
        return "SelectableLocationData(unitName=" + this.unitName + ", unitAddress=" + this.unitAddress + ", displayedDateLabel=" + this.displayedDateLabel + ", moreDatesAvailableLabel=" + this.moreDatesAvailableLabel + ", signUpButtonData=" + this.signUpButtonData + ')';
    }
}
