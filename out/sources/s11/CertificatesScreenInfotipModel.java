package s11;

import fr.t;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s11.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, d2 = {"Ls11/e;", "", "", "mainIconResId", "Lmx/a;", "title", "subtitle", "closeButtonText", "", "Ls11/b;", "certificateInfotipCards", "<init>", "(ILmx/a;Lmx/a;Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lmx/a;", "e", "()Lmx/a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CertificatesScreenInfotipModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int mainIconResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label subtitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label closeButtonText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CertificateInfotipCardModel> certificateInfotipCards;

    public CertificatesScreenInfotipModel(int i15, Label label, Label label2, Label label3, List<CertificateInfotipCardModel> list) {
        this.mainIconResId = i15;
        this.title = label;
        this.subtitle = label2;
        this.closeButtonText = label3;
        this.certificateInfotipCards = list;
    }

    public final List<CertificateInfotipCardModel> a() {
        return this.certificateInfotipCards;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getCloseButtonText() {
        return this.closeButtonText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMainIconResId() {
        return this.mainIconResId;
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
        if (!(other instanceof CertificatesScreenInfotipModel)) {
            return false;
        }
        CertificatesScreenInfotipModel certificatesScreenInfotipModel = (CertificatesScreenInfotipModel) other;
        return this.mainIconResId == certificatesScreenInfotipModel.mainIconResId && t.c(this.title, certificatesScreenInfotipModel.title) && t.c(this.subtitle, certificatesScreenInfotipModel.subtitle) && t.c(this.closeButtonText, certificatesScreenInfotipModel.closeButtonText) && t.c(this.certificateInfotipCards, certificatesScreenInfotipModel.certificateInfotipCards);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mainIconResId) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.closeButtonText.hashCode()) * 31) + this.certificateInfotipCards.hashCode();
    }

    public String toString() {
        return "CertificatesScreenInfotipModel(mainIconResId=" + this.mainIconResId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", closeButtonText=" + this.closeButtonText + ", certificateInfotipCards=" + this.certificateInfotipCards + ')';
    }
}
