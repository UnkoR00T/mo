package p30;

import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: p30.b0, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lp30/b0;", "", "Lmx/a;", "title", "showMoreButtonLabel", "showLessButtonLabel", "", "Lp30/t;", "items", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SourcesData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label showMoreButtonLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label showLessButtonLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ClickableContent> items;

    public SourcesData(Label label, Label label2, Label label3, List<ClickableContent> list) {
        this.title = label;
        this.showMoreButtonLabel = label2;
        this.showLessButtonLabel = label3;
        this.items = list;
    }

    public final List<ClickableContent> a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getShowLessButtonLabel() {
        return this.showLessButtonLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getShowMoreButtonLabel() {
        return this.showMoreButtonLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourcesData)) {
            return false;
        }
        SourcesData sourcesData = (SourcesData) other;
        return fr.t.c(this.title, sourcesData.title) && fr.t.c(this.showMoreButtonLabel, sourcesData.showMoreButtonLabel) && fr.t.c(this.showLessButtonLabel, sourcesData.showLessButtonLabel) && fr.t.c(this.items, sourcesData.items);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.showMoreButtonLabel.hashCode()) * 31) + this.showLessButtonLabel.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "SourcesData(title=" + this.title + ", showMoreButtonLabel=" + this.showMoreButtonLabel + ", showLessButtonLabel=" + this.showLessButtonLabel + ", items=" + this.items + ')';
    }
}
