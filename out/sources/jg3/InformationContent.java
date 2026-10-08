package jg3;

import fr.t;
import j30.ButtonTextData;
import mx.Label;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: renamed from: jg3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001f"}, d2 = {"Ljg3/a;", "", "Lmx/a;", "title", "Lt40/b;", "bulletList", "Lj30/a;", "imageButton", "nextButton", "<init>", "(Lmx/a;Lt40/b;Lj30/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "Lt40/b;", "()Lt40/b;", "c", "Lj30/a;", "()Lj30/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InformationContent {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f102624e = ButtonTextData.f99099f | InfoRowListData.f187643b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InfoRowListData bulletList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonTextData imageButton;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label nextButton;

    public InformationContent(Label label, InfoRowListData infoRowListData, ButtonTextData buttonTextData, Label label2) {
        this.title = label;
        this.bulletList = infoRowListData;
        this.imageButton = buttonTextData;
        this.nextButton = label2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InfoRowListData getBulletList() {
        return this.bulletList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ButtonTextData getImageButton() {
        return this.imageButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getNextButton() {
        return this.nextButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InformationContent)) {
            return false;
        }
        InformationContent informationContent = (InformationContent) other;
        return t.c(this.title, informationContent.title) && t.c(this.bulletList, informationContent.bulletList) && t.c(this.imageButton, informationContent.imageButton) && t.c(this.nextButton, informationContent.nextButton);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.bulletList.hashCode()) * 31) + this.imageButton.hashCode()) * 31) + this.nextButton.hashCode();
    }

    public String toString() {
        return "InformationContent(title=" + this.title + ", bulletList=" + this.bulletList + ", imageButton=" + this.imageButton + ", nextButton=" + this.nextButton + ')';
    }
}
