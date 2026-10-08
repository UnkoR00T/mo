package x33;

import d40.b;
import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: x33.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lx33/a;", "", "Lmx/a;", "infoLabel", "bodyLabel", "Ld40/b;", "iconData", "<init>", "(Lmx/a;Lmx/a;Ld40/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ld40/b;", "()Ld40/b;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryContentData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f216717d = b.f39676g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label infoLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label bodyLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b iconData;

    public SummaryContentData(Label label, Label label2, b bVar) {
        this.infoLabel = label;
        this.bodyLabel = label2;
        this.iconData = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getBodyLabel() {
        return this.bodyLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getIconData() {
        return this.iconData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getInfoLabel() {
        return this.infoLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryContentData)) {
            return false;
        }
        SummaryContentData summaryContentData = (SummaryContentData) other;
        return t.c(this.infoLabel, summaryContentData.infoLabel) && t.c(this.bodyLabel, summaryContentData.bodyLabel) && t.c(this.iconData, summaryContentData.iconData);
    }

    public int hashCode() {
        return (((this.infoLabel.hashCode() * 31) + this.bodyLabel.hashCode()) * 31) + this.iconData.hashCode();
    }

    public String toString() {
        return "SummaryContentData(infoLabel=" + this.infoLabel + ", bodyLabel=" + this.bodyLabel + ", iconData=" + this.iconData + ')';
    }
}
