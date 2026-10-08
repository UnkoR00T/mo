package n30;

import fr.k;
import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n30.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ln30/a;", "", "Lmx/a;", "additionalContext", "", "readListInfo", "<init>", "(Lmx/a;Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardListAccessibilityData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label additionalContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean readListInfo;

    public CardListAccessibilityData(Label label, Boolean bool) {
        this.additionalContext = label;
        this.readListInfo = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getAdditionalContext() {
        return this.additionalContext;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getReadListInfo() {
        return this.readListInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardListAccessibilityData)) {
            return false;
        }
        CardListAccessibilityData cardListAccessibilityData = (CardListAccessibilityData) other;
        return t.c(this.additionalContext, cardListAccessibilityData.additionalContext) && t.c(this.readListInfo, cardListAccessibilityData.readListInfo);
    }

    public int hashCode() {
        Label label = this.additionalContext;
        int iHashCode = (label == null ? 0 : label.hashCode()) * 31;
        Boolean bool = this.readListInfo;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "CardListAccessibilityData(additionalContext=" + this.additionalContext + ", readListInfo=" + this.readListInfo + ')';
    }

    public /* synthetic */ CardListAccessibilityData(Label label, Boolean bool, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : label, (i15 & 2) != 0 ? null : bool);
    }
}
