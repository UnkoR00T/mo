package b60;

import fr.t;
import h30.ButtonData;
import j30.ButtonTextData;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b60.d, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lb60/d;", "", "", "Lb60/o;", "slides", "Lh30/a;", "navigationAction", "finishAction", "previousAction", "Lj30/a;", "skipAction", "<init>", "(Ljava/util/List;Lh30/a;Lh30/a;Lh30/a;Lj30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Lh30/a;", "()Lh30/a;", "c", "d", "Lj30/a;", "()Lj30/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WhatsNewData {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16799f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<WhatsNewSlideData> slides;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData navigationAction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData finishAction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData previousAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonTextData skipAction;

    public WhatsNewData(List<WhatsNewSlideData> list, ButtonData buttonData, ButtonData buttonData2, ButtonData buttonData3, ButtonTextData buttonTextData) {
        this.slides = list;
        this.navigationAction = buttonData;
        this.finishAction = buttonData2;
        this.previousAction = buttonData3;
        this.skipAction = buttonTextData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ButtonData getFinishAction() {
        return this.finishAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ButtonData getNavigationAction() {
        return this.navigationAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ButtonData getPreviousAction() {
        return this.previousAction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ButtonTextData getSkipAction() {
        return this.skipAction;
    }

    public final List<WhatsNewSlideData> e() {
        return this.slides;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhatsNewData)) {
            return false;
        }
        WhatsNewData whatsNewData = (WhatsNewData) other;
        return t.c(this.slides, whatsNewData.slides) && t.c(this.navigationAction, whatsNewData.navigationAction) && t.c(this.finishAction, whatsNewData.finishAction) && t.c(this.previousAction, whatsNewData.previousAction) && t.c(this.skipAction, whatsNewData.skipAction);
    }

    public int hashCode() {
        int iHashCode = ((((this.slides.hashCode() * 31) + this.navigationAction.hashCode()) * 31) + this.finishAction.hashCode()) * 31;
        ButtonData buttonData = this.previousAction;
        int iHashCode2 = (iHashCode + (buttonData == null ? 0 : buttonData.hashCode())) * 31;
        ButtonTextData buttonTextData = this.skipAction;
        return iHashCode2 + (buttonTextData != null ? buttonTextData.hashCode() : 0);
    }

    public String toString() {
        return "WhatsNewData(slides=" + this.slides + ", navigationAction=" + this.navigationAction + ", finishAction=" + this.finishAction + ", previousAction=" + this.previousAction + ", skipAction=" + this.skipAction + ')';
    }
}
