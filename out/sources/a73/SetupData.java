package a73;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: a73.i, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"La73/i;", "", "", "isGdprNeeded", "Liy/b0;", "previousPrefix", "previousPhoneNumber", "<init>", "(ZLiy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Liy/b0;", "()Liy/b0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4090d = iy.b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGdprNeeded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 previousPrefix;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 previousPhoneNumber;

    public SetupData(boolean z15, iy.b0 b0Var, iy.b0 b0Var2) {
        this.isGdprNeeded = z15;
        this.previousPrefix = b0Var;
        this.previousPhoneNumber = b0Var2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getPreviousPhoneNumber() {
        return this.previousPhoneNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getPreviousPrefix() {
        return this.previousPrefix;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsGdprNeeded() {
        return this.isGdprNeeded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return this.isGdprNeeded == setupData.isGdprNeeded && fr.t.c(this.previousPrefix, setupData.previousPrefix) && fr.t.c(this.previousPhoneNumber, setupData.previousPhoneNumber);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isGdprNeeded) * 31;
        iy.b0 b0Var = this.previousPrefix;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        iy.b0 b0Var2 = this.previousPhoneNumber;
        return iHashCode2 + (b0Var2 != null ? b0Var2.hashCode() : 0);
    }

    public String toString() {
        return "SetupData(isGdprNeeded=" + this.isGdprNeeded + ", previousPrefix=" + this.previousPrefix + ", previousPhoneNumber=" + this.previousPhoneNumber + ')';
    }
}
