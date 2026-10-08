package pt2;

import c30.b;
import fr.t;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pt2.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u0018\u0010%R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006'"}, d2 = {"Lpt2/a;", "", "Lmx/a;", "restrictionExplanation", "Lc30/b;", "plannedRestrictionAlertData", "Ln50/g;", "restrictionCardData", "historyHeader", "Ln30/b;", "historyItems", "historyText", "<init>", "(Lmx/a;Lc30/b;Ln50/g;Lmx/a;Ln30/b;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "e", "()Lmx/a;", "b", "Lc30/b;", "c", "()Lc30/b;", "Ln50/g;", "d", "()Ln50/g;", "getHistoryHeader", "Ln30/b;", "()Ln30/b;", "f", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeselRestrictionData {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f162552g = b.f22944i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label restrictionExplanation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b plannedRestrictionAlertData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DefaultSingleCardData restrictionCardData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label historyHeader;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardListData historyItems;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label historyText;

    public PeselRestrictionData(Label label, b bVar, DefaultSingleCardData defaultSingleCardData, Label label2, CardListData cardListData, Label label3) {
        this.restrictionExplanation = label;
        this.plannedRestrictionAlertData = bVar;
        this.restrictionCardData = defaultSingleCardData;
        this.historyHeader = label2;
        this.historyItems = cardListData;
        this.historyText = label3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardListData getHistoryItems() {
        return this.historyItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getHistoryText() {
        return this.historyText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getPlannedRestrictionAlertData() {
        return this.plannedRestrictionAlertData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DefaultSingleCardData getRestrictionCardData() {
        return this.restrictionCardData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getRestrictionExplanation() {
        return this.restrictionExplanation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeselRestrictionData)) {
            return false;
        }
        PeselRestrictionData peselRestrictionData = (PeselRestrictionData) other;
        return t.c(this.restrictionExplanation, peselRestrictionData.restrictionExplanation) && t.c(this.plannedRestrictionAlertData, peselRestrictionData.plannedRestrictionAlertData) && t.c(this.restrictionCardData, peselRestrictionData.restrictionCardData) && t.c(this.historyHeader, peselRestrictionData.historyHeader) && t.c(this.historyItems, peselRestrictionData.historyItems) && t.c(this.historyText, peselRestrictionData.historyText);
    }

    public int hashCode() {
        Label label = this.restrictionExplanation;
        int iHashCode = (label == null ? 0 : label.hashCode()) * 31;
        b bVar = this.plannedRestrictionAlertData;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        DefaultSingleCardData defaultSingleCardData = this.restrictionCardData;
        return ((((((iHashCode2 + (defaultSingleCardData != null ? defaultSingleCardData.hashCode() : 0)) * 31) + this.historyHeader.hashCode()) * 31) + this.historyItems.hashCode()) * 31) + this.historyText.hashCode();
    }

    public String toString() {
        return "PeselRestrictionData(restrictionExplanation=" + this.restrictionExplanation + ", plannedRestrictionAlertData=" + this.plannedRestrictionAlertData + ", restrictionCardData=" + this.restrictionCardData + ", historyHeader=" + this.historyHeader + ", historyItems=" + this.historyItems + ", historyText=" + this.historyText + ')';
    }
}
