package h03;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: h03.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lh03/b;", "", "", "dataIncomplete", "", "Lh03/a;", "historyEvents", "<init>", "(ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HistoryPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean dataIncomplete;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HistoryItem> historyEvents;

    public HistoryPayload(boolean z15, List<HistoryItem> list) {
        this.dataIncomplete = z15;
        this.historyEvents = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDataIncomplete() {
        return this.dataIncomplete;
    }

    public final List<HistoryItem> b() {
        return this.historyEvents;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryPayload)) {
            return false;
        }
        HistoryPayload historyPayload = (HistoryPayload) other;
        return this.dataIncomplete == historyPayload.dataIncomplete && t.c(this.historyEvents, historyPayload.historyEvents);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.dataIncomplete) * 31) + this.historyEvents.hashCode();
    }

    public String toString() {
        return "HistoryPayload(dataIncomplete=" + this.dataIncomplete + ", historyEvents=" + this.historyEvents + ')';
    }
}
