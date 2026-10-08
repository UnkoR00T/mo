package zs1;

import ir0.RefugeeChildPersonalInfo;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zs1.p0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lzs1/p0;", "", "", "Loq/r;", "", "Lir0/a;", "children", "<init>", "(Ljava/util/List;)V", "a", "(Ljava/util/List;)Lzs1/p0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildrenStatement implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<oq.r<Boolean, RefugeeChildPersonalInfo>> children;

    public ChildrenStatement(List<oq.r<Boolean, RefugeeChildPersonalInfo>> list) {
        this.children = list;
    }

    public final ChildrenStatement a(List<oq.r<Boolean, RefugeeChildPersonalInfo>> children) {
        return new ChildrenStatement(children);
    }

    public final List<oq.r<Boolean, RefugeeChildPersonalInfo>> b() {
        return this.children;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChildrenStatement) && fr.t.c(this.children, ((ChildrenStatement) other).children);
    }

    public int hashCode() {
        return this.children.hashCode();
    }

    public String toString() {
        return "ChildrenStatement(children=" + this.children + ')';
    }
}
