package m42;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import vr0.BEUserCard;

/* JADX INFO: renamed from: m42.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lm42/a;", "", "Lm42/b;", "source", "", "Lvr0/p;", "userCards", "<init>", "(Lm42/b;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm42/b;", "()Lm42/b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeleteCardsRequiredData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEUserCard> userCards;

    public DeleteCardsRequiredData(b bVar, List<BEUserCard> list) {
        this.source = bVar;
        this.userCards = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getSource() {
        return this.source;
    }

    public final List<BEUserCard> b() {
        return this.userCards;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteCardsRequiredData)) {
            return false;
        }
        DeleteCardsRequiredData deleteCardsRequiredData = (DeleteCardsRequiredData) other;
        return t.c(this.source, deleteCardsRequiredData.source) && t.c(this.userCards, deleteCardsRequiredData.userCards);
    }

    public int hashCode() {
        return (this.source.hashCode() * 31) + this.userCards.hashCode();
    }

    public String toString() {
        return "DeleteCardsRequiredData(source=" + this.source + ", userCards=" + this.userCards + ')';
    }
}
