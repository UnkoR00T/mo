package lh1;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lh1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001e"}, d2 = {"Llh1/b;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "descriptionFirst", "subtitle", "descriptionSecond", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lmx/a;", "e", "()Lmx/a;", "d", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentsEmptyScreenData {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f118259f = BaseScaffoldData.f89350g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BaseScaffoldData scaffoldData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label descriptionFirst;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label subtitle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label descriptionSecond;

    public DocumentsEmptyScreenData(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, Label label4) {
        this.scaffoldData = baseScaffoldData;
        this.title = label;
        this.descriptionFirst = label2;
        this.subtitle = label3;
        this.descriptionSecond = label4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDescriptionFirst() {
        return this.descriptionFirst;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDescriptionSecond() {
        return this.descriptionSecond;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BaseScaffoldData getScaffoldData() {
        return this.scaffoldData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentsEmptyScreenData)) {
            return false;
        }
        DocumentsEmptyScreenData documentsEmptyScreenData = (DocumentsEmptyScreenData) other;
        return t.c(this.scaffoldData, documentsEmptyScreenData.scaffoldData) && t.c(this.title, documentsEmptyScreenData.title) && t.c(this.descriptionFirst, documentsEmptyScreenData.descriptionFirst) && t.c(this.subtitle, documentsEmptyScreenData.subtitle) && t.c(this.descriptionSecond, documentsEmptyScreenData.descriptionSecond);
    }

    public int hashCode() {
        return (((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.descriptionFirst.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.descriptionSecond.hashCode();
    }

    public String toString() {
        return "DocumentsEmptyScreenData(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", descriptionFirst=" + this.descriptionFirst + ", subtitle=" + this.subtitle + ", descriptionSecond=" + this.descriptionSecond + ')';
    }
}
