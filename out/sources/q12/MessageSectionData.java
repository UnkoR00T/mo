package q12;

import fr.t;
import j30.ButtonTextData;
import java.util.List;
import mx.Label;
import oq.r;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: q12.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u0018\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006%"}, d2 = {"Lq12/b;", "", "Lmx/a;", "title", "", "Loq/r;", "labelList", "Lq12/c;", "status", "Lj30/a;", "detailsButtonData", "messageBody", "<init>", "(Lmx/a;Ljava/util/List;Lq12/c;Lj30/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "e", "()Lmx/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lq12/c;", "d", "()Lq12/c;", "Lj30/a;", "()Lj30/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MessageSectionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<r<Label, Label>> labelList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final MessageSectionStatusData status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonTextData detailsButtonData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label messageBody;

    public MessageSectionData(Label label, List<r<Label, Label>> list, MessageSectionStatusData messageSectionStatusData, ButtonTextData buttonTextData, Label label2) {
        this.title = label;
        this.labelList = list;
        this.status = messageSectionStatusData;
        this.detailsButtonData = buttonTextData;
        this.messageBody = label2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ButtonTextData getDetailsButtonData() {
        return this.detailsButtonData;
    }

    public final List<r<Label, Label>> b() {
        return this.labelList;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getMessageBody() {
        return this.messageBody;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final MessageSectionStatusData getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageSectionData)) {
            return false;
        }
        MessageSectionData messageSectionData = (MessageSectionData) other;
        return t.c(this.title, messageSectionData.title) && t.c(this.labelList, messageSectionData.labelList) && t.c(this.status, messageSectionData.status) && t.c(this.detailsButtonData, messageSectionData.detailsButtonData) && t.c(this.messageBody, messageSectionData.messageBody);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.labelList.hashCode()) * 31;
        MessageSectionStatusData messageSectionStatusData = this.status;
        int iHashCode2 = (iHashCode + (messageSectionStatusData == null ? 0 : messageSectionStatusData.hashCode())) * 31;
        ButtonTextData buttonTextData = this.detailsButtonData;
        int iHashCode3 = (iHashCode2 + (buttonTextData == null ? 0 : buttonTextData.hashCode())) * 31;
        Label label = this.messageBody;
        return iHashCode3 + (label != null ? label.hashCode() : 0);
    }

    public String toString() {
        return "MessageSectionData(title=" + this.title + ", labelList=" + this.labelList + ", status=" + this.status + ", detailsButtonData=" + this.detailsButtonData + ", messageBody=" + this.messageBody + ')';
    }
}
