package rn0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rn0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lrn0/r;", "", "", "id", "category", "Ljava/time/OffsetDateTime;", "createdAt", "grade", "Lrn0/p;", "icon", "", "newGrade", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Lrn0/p;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "d", "Lrn0/p;", "()Lrn0/p;", "f", "Z", "()Z", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEGradePreview {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String category;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime createdAt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String grade;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEGradeIcon icon;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean newGrade;

    public BEGradePreview(String str, String str2, OffsetDateTime offsetDateTime, String str3, BEGradeIcon bEGradeIcon, boolean z15) {
        this.id = str;
        this.category = str2;
        this.createdAt = offsetDateTime;
        this.grade = str3;
        this.icon = bEGradeIcon;
        this.newGrade = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGrade() {
        return this.grade;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEGradeIcon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEGradePreview)) {
            return false;
        }
        BEGradePreview bEGradePreview = (BEGradePreview) other;
        return fr.t.c(this.id, bEGradePreview.id) && fr.t.c(this.category, bEGradePreview.category) && fr.t.c(this.createdAt, bEGradePreview.createdAt) && fr.t.c(this.grade, bEGradePreview.grade) && fr.t.c(this.icon, bEGradePreview.icon) && this.newGrade == bEGradePreview.newGrade;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getNewGrade() {
        return this.newGrade;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.category.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.grade.hashCode()) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.newGrade);
    }

    public String toString() {
        return "BEGradePreview(id=" + this.id + ", category=" + this.category + ", createdAt=" + this.createdAt + ", grade=" + this.grade + ", icon=" + this.icon + ", newGrade=" + this.newGrade + ')';
    }
}
