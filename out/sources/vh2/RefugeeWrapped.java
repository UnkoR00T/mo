package vh2;

import fr.t;
import java.io.Serializable;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vh2.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Lvh2/e;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxh2/a;", "a", "Lxh2/a;", "b", "()Lxh2/a;", "dataHeader", "Lvh2/d;", "Lvh2/d;", "()Lvh2/d;", "dataContainer", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RefugeeWrapped implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dh")
    private final xh2.a dataHeader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dc")
    private final RefugeeData dataContainer;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RefugeeData getDataContainer() {
        return this.dataContainer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final xh2.a getDataHeader() {
        return this.dataHeader;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefugeeWrapped)) {
            return false;
        }
        RefugeeWrapped refugeeWrapped = (RefugeeWrapped) other;
        return t.c(this.dataHeader, refugeeWrapped.dataHeader) && t.c(this.dataContainer, refugeeWrapped.dataContainer);
    }

    public int hashCode() {
        return (this.dataHeader.hashCode() * 31) + this.dataContainer.hashCode();
    }

    public String toString() {
        return "RefugeeWrapped(dataHeader=" + this.dataHeader + ", dataContainer=" + this.dataContainer + ')';
    }
}
