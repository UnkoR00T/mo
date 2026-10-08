package hq3;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: renamed from: hq3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lhq3/a;", "", "Lmx/a;", "header", "contentTitle", "contentDescription", "Lt40/b;", "infoRowListData", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Lt40/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "d", "Lt40/b;", "()Lt40/b;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VoteIdeaRoundsAccordionElement {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f86360e = InfoRowListData.f187643b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label contentTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label contentDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final InfoRowListData infoRowListData;

    public VoteIdeaRoundsAccordionElement(Label label, Label label2, Label label3, InfoRowListData infoRowListData) {
        this.header = label;
        this.contentTitle = label2;
        this.contentDescription = label3;
        this.infoRowListData = infoRowListData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getContentTitle() {
        return this.contentTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InfoRowListData getInfoRowListData() {
        return this.infoRowListData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoteIdeaRoundsAccordionElement)) {
            return false;
        }
        VoteIdeaRoundsAccordionElement voteIdeaRoundsAccordionElement = (VoteIdeaRoundsAccordionElement) other;
        return t.c(this.header, voteIdeaRoundsAccordionElement.header) && t.c(this.contentTitle, voteIdeaRoundsAccordionElement.contentTitle) && t.c(this.contentDescription, voteIdeaRoundsAccordionElement.contentDescription) && t.c(this.infoRowListData, voteIdeaRoundsAccordionElement.infoRowListData);
    }

    public int hashCode() {
        return (((((this.header.hashCode() * 31) + this.contentTitle.hashCode()) * 31) + this.contentDescription.hashCode()) * 31) + this.infoRowListData.hashCode();
    }

    public String toString() {
        return "VoteIdeaRoundsAccordionElement(header=" + this.header + ", contentTitle=" + this.contentTitle + ", contentDescription=" + this.contentDescription + ", infoRowListData=" + this.infoRowListData + ')';
    }
}
