package vb0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: vb0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u001a"}, d2 = {"Lvb0/e;", "", "Lvb0/b;", "ownerCard", "", "kidCards", "<init>", "(Lvb0/b;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvb0/b;", "c", "()Lvb0/b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "allCards", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FamilyCards {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FamilyCardDocument ownerCard;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FamilyCardDocument> kidCards;

    public FamilyCards(FamilyCardDocument familyCardDocument, List<FamilyCardDocument> list) {
        this.ownerCard = familyCardDocument;
        this.kidCards = list;
    }

    public final List<FamilyCardDocument> a() {
        return v.L0(v.e(this.ownerCard), this.kidCards);
    }

    public final List<FamilyCardDocument> b() {
        return this.kidCards;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FamilyCardDocument getOwnerCard() {
        return this.ownerCard;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyCards)) {
            return false;
        }
        FamilyCards familyCards = (FamilyCards) other;
        return t.c(this.ownerCard, familyCards.ownerCard) && t.c(this.kidCards, familyCards.kidCards);
    }

    public int hashCode() {
        return (this.ownerCard.hashCode() * 31) + this.kidCards.hashCode();
    }

    public String toString() {
        return "FamilyCards(ownerCard=" + this.ownerCard + ", kidCards=" + this.kidCards + ')';
    }
}
