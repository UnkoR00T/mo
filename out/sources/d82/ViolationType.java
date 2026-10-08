package d82;

import fp0.k;
import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d82.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Ld82/a;", "", "Lfp0/k;", "tag", "Lmx/a;", "name", "subName", "<init>", "(Lfp0/k;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfp0/k;", "c", "()Lfp0/k;", "b", "Lmx/a;", "()Lmx/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ViolationType {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final k tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label subName;

    public ViolationType(k kVar, Label label, Label label2) {
        this.tag = kVar;
        this.name = label;
        this.subName = label2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getSubName() {
        return this.subName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getTag() {
        return this.tag;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViolationType)) {
            return false;
        }
        ViolationType violationType = (ViolationType) other;
        return t.c(this.tag, violationType.tag) && t.c(this.name, violationType.name) && t.c(this.subName, violationType.subName);
    }

    public int hashCode() {
        int iHashCode = ((this.tag.hashCode() * 31) + this.name.hashCode()) * 31;
        Label label = this.subName;
        return iHashCode + (label == null ? 0 : label.hashCode());
    }

    public String toString() {
        return "ViolationType(tag=" + this.tag + ", name=" + this.name + ", subName=" + this.subName + ')';
    }
}
