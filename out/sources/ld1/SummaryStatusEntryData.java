package ld1;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ld1.q, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006#"}, d2 = {"Lld1/q;", "", "Lld1/p;", "summaryStatus", "Lld1/l;", "processType", "Lmx/a;", "title", "Lld1/o;", "summaryBody", "<init>", "(Lld1/p;Lld1/l;Lmx/a;Lld1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lld1/p;", "b", "()Lld1/p;", "Lld1/l;", "getProcessType", "()Lld1/l;", "c", "Lmx/a;", "()Lmx/a;", "d", "Lld1/o;", "()Lld1/o;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryStatusEntryData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final p summaryStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final l processType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final o summaryBody;

    public SummaryStatusEntryData(p pVar, l lVar, Label label, o oVar) {
        this.summaryStatus = pVar;
        this.processType = lVar;
        this.title = label;
        this.summaryBody = oVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final o getSummaryBody() {
        return this.summaryBody;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p getSummaryStatus() {
        return this.summaryStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryStatusEntryData)) {
            return false;
        }
        SummaryStatusEntryData summaryStatusEntryData = (SummaryStatusEntryData) other;
        return this.summaryStatus == summaryStatusEntryData.summaryStatus && this.processType == summaryStatusEntryData.processType && t.c(this.title, summaryStatusEntryData.title) && t.c(this.summaryBody, summaryStatusEntryData.summaryBody);
    }

    public int hashCode() {
        return (((((this.summaryStatus.hashCode() * 31) + this.processType.hashCode()) * 31) + this.title.hashCode()) * 31) + this.summaryBody.hashCode();
    }

    public String toString() {
        return "SummaryStatusEntryData(summaryStatus=" + this.summaryStatus + ", processType=" + this.processType + ", title=" + this.title + ", summaryBody=" + this.summaryBody + ')';
    }
}
