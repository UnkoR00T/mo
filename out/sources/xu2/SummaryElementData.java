package xu2;

import fr.t;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xu2.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u0017\u0010!¨\u0006\""}, d2 = {"Lxu2/a;", "", "Lmx/a;", "title", "changeButtonLabel", "changeButtonContentDescription", "Lkotlin/Function0;", "Loq/i0;", "onChangeAction", "Ln30/b;", "cardElements", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Ler/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "e", "()Lmx/a;", "b", "c", "d", "Ler/a;", "()Ler/a;", "Ln30/b;", "()Ln30/b;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryElementData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label changeButtonLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label changeButtonContentDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onChangeAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardListData cardElements;

    public SummaryElementData(Label label, Label label2, Label label3, er.a<i0> aVar, CardListData cardListData) {
        this.title = label;
        this.changeButtonLabel = label2;
        this.changeButtonContentDescription = label3;
        this.onChangeAction = aVar;
        this.cardElements = cardListData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardListData getCardElements() {
        return this.cardElements;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getChangeButtonContentDescription() {
        return this.changeButtonContentDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getChangeButtonLabel() {
        return this.changeButtonLabel;
    }

    public final er.a<i0> d() {
        return this.onChangeAction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryElementData)) {
            return false;
        }
        SummaryElementData summaryElementData = (SummaryElementData) other;
        return t.c(this.title, summaryElementData.title) && t.c(this.changeButtonLabel, summaryElementData.changeButtonLabel) && t.c(this.changeButtonContentDescription, summaryElementData.changeButtonContentDescription) && t.c(this.onChangeAction, summaryElementData.onChangeAction) && t.c(this.cardElements, summaryElementData.cardElements);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.changeButtonLabel.hashCode()) * 31) + this.changeButtonContentDescription.hashCode()) * 31) + this.onChangeAction.hashCode()) * 31) + this.cardElements.hashCode();
    }

    public String toString() {
        return "SummaryElementData(title=" + this.title + ", changeButtonLabel=" + this.changeButtonLabel + ", changeButtonContentDescription=" + this.changeButtonContentDescription + ", onChangeAction=" + this.onChangeAction + ", cardElements=" + this.cardElements + ')';
    }
}
