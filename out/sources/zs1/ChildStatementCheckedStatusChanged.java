package zs1;

import ir0.RefugeeChildPersonalInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zs1.u, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lzs1/u;", "", "Lir0/a;", "child", "", "isChecked", "<init>", "(Lir0/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lir0/a;", "()Lir0/a;", "b", "Z", "()Z", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildStatementCheckedStatusChanged implements n20.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final RefugeeChildPersonalInfo child;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChecked;

    public ChildStatementCheckedStatusChanged(RefugeeChildPersonalInfo refugeeChildPersonalInfo, boolean z15) {
        this.child = refugeeChildPersonalInfo;
        this.isChecked = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RefugeeChildPersonalInfo getChild() {
        return this.child;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildStatementCheckedStatusChanged)) {
            return false;
        }
        ChildStatementCheckedStatusChanged childStatementCheckedStatusChanged = (ChildStatementCheckedStatusChanged) other;
        return fr.t.c(this.child, childStatementCheckedStatusChanged.child) && this.isChecked == childStatementCheckedStatusChanged.isChecked;
    }

    public int hashCode() {
        return (this.child.hashCode() * 31) + Boolean.hashCode(this.isChecked);
    }

    public String toString() {
        return "ChildStatementCheckedStatusChanged(child=" + this.child + ", isChecked=" + this.isChecked + ')';
    }
}
