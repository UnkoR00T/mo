package i61;

import cl0.PassportChildApplicationGetChildData;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i61.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Li61/c;", "", "Lcl0/k0;", "childData", "Liy/b0;", "birthPlaceInput", "", "citizenshipCheckBoxChecked", "<init>", "(Lcl0/k0;Liy/b0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcl0/k0;", "b", "()Lcl0/k0;", "Liy/b0;", "()Liy/b0;", "c", "Z", "()Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildDataResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PassportChildApplicationGetChildData childData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 birthPlaceInput;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean citizenshipCheckBoxChecked;

    public ChildDataResult(PassportChildApplicationGetChildData passportChildApplicationGetChildData, b0 b0Var, boolean z15) {
        this.childData = passportChildApplicationGetChildData;
        this.birthPlaceInput = b0Var;
        this.citizenshipCheckBoxChecked = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getBirthPlaceInput() {
        return this.birthPlaceInput;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PassportChildApplicationGetChildData getChildData() {
        return this.childData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCitizenshipCheckBoxChecked() {
        return this.citizenshipCheckBoxChecked;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildDataResult)) {
            return false;
        }
        ChildDataResult childDataResult = (ChildDataResult) other;
        return fr.t.c(this.childData, childDataResult.childData) && fr.t.c(this.birthPlaceInput, childDataResult.birthPlaceInput) && this.citizenshipCheckBoxChecked == childDataResult.citizenshipCheckBoxChecked;
    }

    public int hashCode() {
        PassportChildApplicationGetChildData passportChildApplicationGetChildData = this.childData;
        int iHashCode = (passportChildApplicationGetChildData == null ? 0 : passportChildApplicationGetChildData.hashCode()) * 31;
        b0 b0Var = this.birthPlaceInput;
        return ((iHashCode + (b0Var != null ? b0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.citizenshipCheckBoxChecked);
    }

    public String toString() {
        return "ChildDataResult(childData=" + this.childData + ", birthPlaceInput=" + this.birthPlaceInput + ", citizenshipCheckBoxChecked=" + this.citizenshipCheckBoxChecked + ')';
    }
}
