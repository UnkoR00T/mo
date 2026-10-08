package qi3;

import fr.t;
import j30.ButtonTextData;
import java.util.List;
import mx.Label;
import n50.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qi3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lqi3/a;", "", "Lmx/a;", "title", "description", "Lj30/a;", "linkButtonData", "", "Ln50/k;", "insurerDetailsListData", "<init>", "(Lmx/a;Lmx/a;Lj30/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "Lj30/a;", "()Lj30/a;", "Ljava/util/List;", "()Ljava/util/List;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutomaticReportInsurerDetailsSectionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonTextData linkButtonData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<k> insurerDetailsListData;

    /* JADX WARN: Multi-variable type inference failed */
    public AutomaticReportInsurerDetailsSectionData(Label label, Label label2, ButtonTextData buttonTextData, List<? extends k> list) {
        this.title = label;
        this.description = label2;
        this.linkButtonData = buttonTextData;
        this.insurerDetailsListData = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    public final List<k> b() {
        return this.insurerDetailsListData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ButtonTextData getLinkButtonData() {
        return this.linkButtonData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutomaticReportInsurerDetailsSectionData)) {
            return false;
        }
        AutomaticReportInsurerDetailsSectionData automaticReportInsurerDetailsSectionData = (AutomaticReportInsurerDetailsSectionData) other;
        return t.c(this.title, automaticReportInsurerDetailsSectionData.title) && t.c(this.description, automaticReportInsurerDetailsSectionData.description) && t.c(this.linkButtonData, automaticReportInsurerDetailsSectionData.linkButtonData) && t.c(this.insurerDetailsListData, automaticReportInsurerDetailsSectionData.insurerDetailsListData);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Label label = this.description;
        int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
        ButtonTextData buttonTextData = this.linkButtonData;
        return ((iHashCode2 + (buttonTextData != null ? buttonTextData.hashCode() : 0)) * 31) + this.insurerDetailsListData.hashCode();
    }

    public String toString() {
        return "AutomaticReportInsurerDetailsSectionData(title=" + this.title + ", description=" + this.description + ", linkButtonData=" + this.linkButtonData + ", insurerDetailsListData=" + this.insurerDetailsListData + ')';
    }
}
