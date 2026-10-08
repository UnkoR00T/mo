package w62;

import fr.k;
import fr.t;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: w62.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lw62/a;", "", "Lmx/a;", "title", "description", "", "bullets", "<init>", "(Lmx/a;Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TicketsFaqSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Label> bullets;

    public TicketsFaqSection(Label label, Label label2, List<Label> list) {
        this.title = label;
        this.description = label2;
        this.bullets = list;
    }

    public final List<Label> a() {
        return this.bullets;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketsFaqSection)) {
            return false;
        }
        TicketsFaqSection ticketsFaqSection = (TicketsFaqSection) other;
        return t.c(this.title, ticketsFaqSection.title) && t.c(this.description, ticketsFaqSection.description) && t.c(this.bullets, ticketsFaqSection.bullets);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.description.hashCode()) * 31;
        List<Label> list = this.bullets;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "TicketsFaqSection(title=" + this.title + ", description=" + this.description + ", bullets=" + this.bullets + ')';
    }

    public /* synthetic */ TicketsFaqSection(Label label, Label label2, List list, int i15, k kVar) {
        this(label, label2, (i15 & 4) != 0 ? null : list);
    }
}
