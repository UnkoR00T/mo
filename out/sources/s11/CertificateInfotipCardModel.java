package s11;

import fr.t;
import java.util.List;
import mx.Label;
import oq.r;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s11.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R)\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Ls11/b;", "", "Lmx/a;", "title", "", "iconResId", "subtitle", "", "Loq/r;", "iconIdLabelPairs", "<init>", "(Lmx/a;ILmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "I", "c", "Ljava/util/List;", "()Ljava/util/List;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CertificateInfotipCardModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconResId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label subtitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<r<Integer, Label>> iconIdLabelPairs;

    public CertificateInfotipCardModel(Label label, int i15, Label label2, List<r<Integer, Label>> list) {
        this.title = label;
        this.iconResId = i15;
        this.subtitle = label2;
        this.iconIdLabelPairs = list;
    }

    public final List<r<Integer, Label>> a() {
        return this.iconIdLabelPairs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertificateInfotipCardModel)) {
            return false;
        }
        CertificateInfotipCardModel certificateInfotipCardModel = (CertificateInfotipCardModel) other;
        return t.c(this.title, certificateInfotipCardModel.title) && this.iconResId == certificateInfotipCardModel.iconResId && t.c(this.subtitle, certificateInfotipCardModel.subtitle) && t.c(this.iconIdLabelPairs, certificateInfotipCardModel.iconIdLabelPairs);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + Integer.hashCode(this.iconResId)) * 31;
        Label label = this.subtitle;
        return ((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.iconIdLabelPairs.hashCode();
    }

    public String toString() {
        return "CertificateInfotipCardModel(title=" + this.title + ", iconResId=" + this.iconResId + ", subtitle=" + this.subtitle + ", iconIdLabelPairs=" + this.iconIdLabelPairs + ')';
    }
}
