package a12;

import fr.t;
import j30.ButtonTextData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: a12.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b\u0017\u0010\u000f¨\u0006$"}, d2 = {"La12/e;", "", "Lmx/a;", "infoLabel", "descriptionLabel", "titleLabel", "Lr50/a;", "statusBadge", "Lj30/a;", "moreButtonData", "", "contentDescription", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Lr50/a;Lj30/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "f", "d", "Lr50/a;", "e", "()Lr50/a;", "Lj30/a;", "()Lj30/a;", "Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchResultSingleCardData {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f1260g = ButtonTextData.f99099f | r50.a.f171863f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label infoLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label descriptionLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label titleLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final r50.a statusBadge;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonTextData moreButtonData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contentDescription;

    public SearchResultSingleCardData(Label label, Label label2, Label label3, r50.a aVar, ButtonTextData buttonTextData, String str) {
        this.infoLabel = label;
        this.descriptionLabel = label2;
        this.titleLabel = label3;
        this.statusBadge = aVar;
        this.moreButtonData = buttonTextData;
        this.contentDescription = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDescriptionLabel() {
        return this.descriptionLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getInfoLabel() {
        return this.infoLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ButtonTextData getMoreButtonData() {
        return this.moreButtonData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final r50.a getStatusBadge() {
        return this.statusBadge;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultSingleCardData)) {
            return false;
        }
        SearchResultSingleCardData searchResultSingleCardData = (SearchResultSingleCardData) other;
        return t.c(this.infoLabel, searchResultSingleCardData.infoLabel) && t.c(this.descriptionLabel, searchResultSingleCardData.descriptionLabel) && t.c(this.titleLabel, searchResultSingleCardData.titleLabel) && t.c(this.statusBadge, searchResultSingleCardData.statusBadge) && t.c(this.moreButtonData, searchResultSingleCardData.moreButtonData) && t.c(this.contentDescription, searchResultSingleCardData.contentDescription);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getTitleLabel() {
        return this.titleLabel;
    }

    public int hashCode() {
        Label label = this.infoLabel;
        int iHashCode = (label == null ? 0 : label.hashCode()) * 31;
        Label label2 = this.descriptionLabel;
        int iHashCode2 = (((iHashCode + (label2 == null ? 0 : label2.hashCode())) * 31) + this.titleLabel.hashCode()) * 31;
        r50.a aVar = this.statusBadge;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ButtonTextData buttonTextData = this.moreButtonData;
        return ((iHashCode3 + (buttonTextData != null ? buttonTextData.hashCode() : 0)) * 31) + this.contentDescription.hashCode();
    }

    public String toString() {
        return "SearchResultSingleCardData(infoLabel=" + this.infoLabel + ", descriptionLabel=" + this.descriptionLabel + ", titleLabel=" + this.titleLabel + ", statusBadge=" + this.statusBadge + ", moreButtonData=" + this.moreButtonData + ", contentDescription=" + this.contentDescription + ')';
    }
}
