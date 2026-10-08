package tr3;

import fr.k;
import fr.t;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import x40.LinkData;

/* JADX INFO: renamed from: tr3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Ltr3/a;", "", "Lmx/a;", "header", "", "bulletPoints", "additionalLabel", "Lx40/a;", "zusLinkData", "<init>", "(Lmx/a;Ljava/util/List;Lmx/a;Lx40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lx40/a;", "()Lx40/a;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ZusVisitInfoPageSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Label> bulletPoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label additionalLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LinkData zusLinkData;

    public ZusVisitInfoPageSection(Label label, List<Label> list, Label label2, LinkData linkData) {
        this.header = label;
        this.bulletPoints = list;
        this.additionalLabel = label2;
        this.zusLinkData = linkData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getAdditionalLabel() {
        return this.additionalLabel;
    }

    public final List<Label> b() {
        return this.bulletPoints;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LinkData getZusLinkData() {
        return this.zusLinkData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZusVisitInfoPageSection)) {
            return false;
        }
        ZusVisitInfoPageSection zusVisitInfoPageSection = (ZusVisitInfoPageSection) other;
        return t.c(this.header, zusVisitInfoPageSection.header) && t.c(this.bulletPoints, zusVisitInfoPageSection.bulletPoints) && t.c(this.additionalLabel, zusVisitInfoPageSection.additionalLabel) && t.c(this.zusLinkData, zusVisitInfoPageSection.zusLinkData);
    }

    public int hashCode() {
        int iHashCode = ((this.header.hashCode() * 31) + this.bulletPoints.hashCode()) * 31;
        Label label = this.additionalLabel;
        int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
        LinkData linkData = this.zusLinkData;
        return iHashCode2 + (linkData != null ? linkData.hashCode() : 0);
    }

    public String toString() {
        return "ZusVisitInfoPageSection(header=" + this.header + ", bulletPoints=" + this.bulletPoints + ", additionalLabel=" + this.additionalLabel + ", zusLinkData=" + this.zusLinkData + ')';
    }

    public /* synthetic */ ZusVisitInfoPageSection(Label label, List list, Label label2, LinkData linkData, int i15, k kVar) {
        this(label, list, (i15 & 4) != 0 ? null : label2, (i15 & 8) != 0 ? null : linkData);
    }
}
