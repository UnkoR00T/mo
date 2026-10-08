package gi1;

import er.l;
import fr.t;
import iq0.DashboardServiceEntry;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gi1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001c\u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0018\u0010$¨\u0006%"}, d2 = {"Lgi1/a;", "", "Lmx/a;", "otherServiceListHeader", "Lk40/a;", "otherServiceEmptyState", "", "Liq0/p;", "otherServiceList", "Lkotlin/Function1;", "Loq/i0;", "addServiceClickAction", "<init>", "(Lmx/a;Lk40/a;Ljava/util/List;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Lk40/a;", "getOtherServiceEmptyState", "()Lk40/a;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ler/l;", "()Ler/l;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OtherServiceSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label otherServiceListHeader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EmptyStateData otherServiceEmptyState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DashboardServiceEntry> otherServiceList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<DashboardServiceEntry, i0> addServiceClickAction;

    /* JADX WARN: Multi-variable type inference failed */
    public OtherServiceSection(Label label, EmptyStateData emptyStateData, List<DashboardServiceEntry> list, l<? super DashboardServiceEntry, i0> lVar) {
        this.otherServiceListHeader = label;
        this.otherServiceEmptyState = emptyStateData;
        this.otherServiceList = list;
        this.addServiceClickAction = lVar;
    }

    public final l<DashboardServiceEntry, i0> a() {
        return this.addServiceClickAction;
    }

    public final List<DashboardServiceEntry> b() {
        return this.otherServiceList;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getOtherServiceListHeader() {
        return this.otherServiceListHeader;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherServiceSection)) {
            return false;
        }
        OtherServiceSection otherServiceSection = (OtherServiceSection) other;
        return t.c(this.otherServiceListHeader, otherServiceSection.otherServiceListHeader) && t.c(this.otherServiceEmptyState, otherServiceSection.otherServiceEmptyState) && t.c(this.otherServiceList, otherServiceSection.otherServiceList) && t.c(this.addServiceClickAction, otherServiceSection.addServiceClickAction);
    }

    public int hashCode() {
        return (((((this.otherServiceListHeader.hashCode() * 31) + this.otherServiceEmptyState.hashCode()) * 31) + this.otherServiceList.hashCode()) * 31) + this.addServiceClickAction.hashCode();
    }

    public String toString() {
        return "OtherServiceSection(otherServiceListHeader=" + this.otherServiceListHeader + ", otherServiceEmptyState=" + this.otherServiceEmptyState + ", otherServiceList=" + this.otherServiceList + ", addServiceClickAction=" + this.addServiceClickAction + ')';
    }
}
