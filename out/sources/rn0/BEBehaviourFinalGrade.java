package rn0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rn0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006!"}, d2 = {"Lrn0/g;", "", "Ljava/time/OffsetDateTime;", "date", "", "description", "title", "", "descriptive", "Lrn0/h;", "iconType", "<init>", "(Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;ZLrn0/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "b", "Ljava/lang/String;", "c", "e", "d", "Z", "()Z", "Lrn0/h;", "()Lrn0/h;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEBehaviourFinalGrade {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean descriptive;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final h iconType;

    public BEBehaviourFinalGrade(OffsetDateTime offsetDateTime, String str, String str2, boolean z15, h hVar) {
        this.date = offsetDateTime;
        this.description = str;
        this.title = str2;
        this.descriptive = z15;
        this.iconType = hVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDescriptive() {
        return this.descriptive;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getIconType() {
        return this.iconType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEBehaviourFinalGrade)) {
            return false;
        }
        BEBehaviourFinalGrade bEBehaviourFinalGrade = (BEBehaviourFinalGrade) other;
        return fr.t.c(this.date, bEBehaviourFinalGrade.date) && fr.t.c(this.description, bEBehaviourFinalGrade.description) && fr.t.c(this.title, bEBehaviourFinalGrade.title) && this.descriptive == bEBehaviourFinalGrade.descriptive && this.iconType == bEBehaviourFinalGrade.iconType;
    }

    public int hashCode() {
        int iHashCode = ((((((this.date.hashCode() * 31) + this.description.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.descriptive)) * 31;
        h hVar = this.iconType;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "BEBehaviourFinalGrade(date=" + this.date + ", description=" + this.description + ", title=" + this.title + ", descriptive=" + this.descriptive + ", iconType=" + this.iconType + ')';
    }
}
