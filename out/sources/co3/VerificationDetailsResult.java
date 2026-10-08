package co3;

import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: co3.t, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b \u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010'¨\u0006("}, d2 = {"Lco3/t;", "", "", "photo", "Lmx/a;", "documentTitle", "documentDescription", "verificationDateTime", "documentExpireDate", "", "Lco3/m;", "items", "Lco3/k;", "section", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Ljava/util/List;Lco3/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPhoto", "b", "Lmx/a;", "c", "()Lmx/a;", "d", "f", "e", "Ljava/util/List;", "()Ljava/util/List;", "g", "Lco3/k;", "()Lco3/k;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationDetailsResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String photo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label documentTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label documentDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label verificationDateTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label documentExpireDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SingleCardData> items;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Section section;

    public VerificationDetailsResult(String str, Label label, Label label2, Label label3, Label label4, List<SingleCardData> list, Section section) {
        this.photo = str;
        this.documentTitle = label;
        this.documentDescription = label2;
        this.verificationDateTime = label3;
        this.documentExpireDate = label4;
        this.items = list;
        this.section = section;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDocumentDescription() {
        return this.documentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDocumentExpireDate() {
        return this.documentExpireDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getDocumentTitle() {
        return this.documentTitle;
    }

    public final List<SingleCardData> d() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Section getSection() {
        return this.section;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationDetailsResult)) {
            return false;
        }
        VerificationDetailsResult verificationDetailsResult = (VerificationDetailsResult) other;
        return fr.t.c(this.photo, verificationDetailsResult.photo) && fr.t.c(this.documentTitle, verificationDetailsResult.documentTitle) && fr.t.c(this.documentDescription, verificationDetailsResult.documentDescription) && fr.t.c(this.verificationDateTime, verificationDetailsResult.verificationDateTime) && fr.t.c(this.documentExpireDate, verificationDetailsResult.documentExpireDate) && fr.t.c(this.items, verificationDetailsResult.items) && fr.t.c(this.section, verificationDetailsResult.section);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getVerificationDateTime() {
        return this.verificationDateTime;
    }

    public int hashCode() {
        String str = this.photo;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.documentTitle.hashCode()) * 31;
        Label label = this.documentDescription;
        int iHashCode2 = (((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.verificationDateTime.hashCode()) * 31;
        Label label2 = this.documentExpireDate;
        int iHashCode3 = (((iHashCode2 + (label2 == null ? 0 : label2.hashCode())) * 31) + this.items.hashCode()) * 31;
        Section section = this.section;
        return iHashCode3 + (section != null ? section.hashCode() : 0);
    }

    public String toString() {
        return "VerificationDetailsResult(photo=" + this.photo + ", documentTitle=" + this.documentTitle + ", documentDescription=" + this.documentDescription + ", verificationDateTime=" + this.verificationDateTime + ", documentExpireDate=" + this.documentExpireDate + ", items=" + this.items + ", section=" + this.section + ')';
    }

    public /* synthetic */ VerificationDetailsResult(String str, Label label, Label label2, Label label3, Label label4, List list, Section section, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, label, (i15 & 4) != 0 ? null : label2, label3, label4, list, (i15 & 64) != 0 ? null : section);
    }
}
