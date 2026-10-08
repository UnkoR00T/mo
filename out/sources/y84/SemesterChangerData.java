package y84;

import fr.t;
import j30.ButtonTextData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y84.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Ly84/a;", "", "Lmx/a;", "name", "Lj30/a;", "changeButtonData", "<init>", "(Lmx/a;Lj30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Lj30/a;", "()Lj30/a;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SemesterChangerData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f225361c = ButtonTextData.f99099f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonTextData changeButtonData;

    public SemesterChangerData(Label label, ButtonTextData buttonTextData) {
        this.name = label;
        this.changeButtonData = buttonTextData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ButtonTextData getChangeButtonData() {
        return this.changeButtonData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemesterChangerData)) {
            return false;
        }
        SemesterChangerData semesterChangerData = (SemesterChangerData) other;
        return t.c(this.name, semesterChangerData.name) && t.c(this.changeButtonData, semesterChangerData.changeButtonData);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.changeButtonData.hashCode();
    }

    public String toString() {
        return "SemesterChangerData(name=" + this.name + ", changeButtonData=" + this.changeButtonData + ')';
    }
}
