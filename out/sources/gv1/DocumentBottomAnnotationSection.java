package gv1;

import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gv1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Lgv1/e;", "", "", "Lgv1/o;", AnnotatedPrivateKey.LABEL, "", "linkUrl", "linkLabel", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentBottomAnnotationSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String linkUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> linkLabel;

    public DocumentBottomAnnotationSection() {
        this(null, null, null, 7, null);
    }

    public final List<DocumentSchemaLabel> a() {
        return this.label;
    }

    public final List<DocumentSchemaLabel> b() {
        return this.linkLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentBottomAnnotationSection)) {
            return false;
        }
        DocumentBottomAnnotationSection documentBottomAnnotationSection = (DocumentBottomAnnotationSection) other;
        return fr.t.c(this.label, documentBottomAnnotationSection.label) && fr.t.c(this.linkUrl, documentBottomAnnotationSection.linkUrl) && fr.t.c(this.linkLabel, documentBottomAnnotationSection.linkLabel);
    }

    public int hashCode() {
        List<DocumentSchemaLabel> list = this.label;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.linkUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<DocumentSchemaLabel> list2 = this.linkLabel;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "DocumentBottomAnnotationSection(label=" + this.label + ", linkUrl=" + this.linkUrl + ", linkLabel=" + this.linkLabel + ")";
    }

    public DocumentBottomAnnotationSection(List<DocumentSchemaLabel> list, String str, List<DocumentSchemaLabel> list2) {
        this.label = list;
        this.linkUrl = str;
        this.linkLabel = list2;
    }

    public /* synthetic */ DocumentBottomAnnotationSection(List list, String str, List list2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : list, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : list2);
    }
}
