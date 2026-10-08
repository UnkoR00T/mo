package l11;

import fr.t;
import java.util.List;
import mx.Label;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: l11.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Ll11/a;", "", "Lmx/a;", "date", "", "Ln50/g;", "cardStatusList", "<init>", "(Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ljava/util/List;", "()Ljava/util/List;", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CasesTimelineItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DefaultSingleCardData> cardStatusList;

    public CasesTimelineItem(Label label, List<DefaultSingleCardData> list) {
        this.date = label;
        this.cardStatusList = list;
    }

    public final List<DefaultSingleCardData> a() {
        return this.cardStatusList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDate() {
        return this.date;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesTimelineItem)) {
            return false;
        }
        CasesTimelineItem casesTimelineItem = (CasesTimelineItem) other;
        return t.c(this.date, casesTimelineItem.date) && t.c(this.cardStatusList, casesTimelineItem.cardStatusList);
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.cardStatusList.hashCode();
    }

    public String toString() {
        return "CasesTimelineItem(date=" + this.date + ", cardStatusList=" + this.cardStatusList + ')';
    }
}
