package i61;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: i61.m, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Li61/m;", "", "", "noNameSwitchChecked", "noLastNameSwitchChecked", "citizenshipCheckBoxChecked", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EnterChildCheckboxes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean noNameSwitchChecked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean noLastNameSwitchChecked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean citizenshipCheckBoxChecked;

    public EnterChildCheckboxes(boolean z15, boolean z16, boolean z17) {
        this.noNameSwitchChecked = z15;
        this.noLastNameSwitchChecked = z16;
        this.citizenshipCheckBoxChecked = z17;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCitizenshipCheckBoxChecked() {
        return this.citizenshipCheckBoxChecked;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getNoLastNameSwitchChecked() {
        return this.noLastNameSwitchChecked;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getNoNameSwitchChecked() {
        return this.noNameSwitchChecked;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterChildCheckboxes)) {
            return false;
        }
        EnterChildCheckboxes enterChildCheckboxes = (EnterChildCheckboxes) other;
        return this.noNameSwitchChecked == enterChildCheckboxes.noNameSwitchChecked && this.noLastNameSwitchChecked == enterChildCheckboxes.noLastNameSwitchChecked && this.citizenshipCheckBoxChecked == enterChildCheckboxes.citizenshipCheckBoxChecked;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.noNameSwitchChecked) * 31) + Boolean.hashCode(this.noLastNameSwitchChecked)) * 31) + Boolean.hashCode(this.citizenshipCheckBoxChecked);
    }

    public String toString() {
        return "EnterChildCheckboxes(noNameSwitchChecked=" + this.noNameSwitchChecked + ", noLastNameSwitchChecked=" + this.noLastNameSwitchChecked + ", citizenshipCheckBoxChecked=" + this.citizenshipCheckBoxChecked + ')';
    }
}
