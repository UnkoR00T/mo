package sv0;

import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: sv0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, d2 = {"Lsv0/h;", "", "Liy/b0;", "collisionDescription", "", "localizationDescription", "Lvy/c;", "coordinates", "Lfz/b$f;", "date", "<init>", "(Liy/b0;Ljava/lang/String;Lvy/c;Lfz/b$f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Ljava/lang/String;", "d", "c", "Lvy/c;", "()Lvy/c;", "Lfz/b$f;", "()Lfz/b$f;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionCircumstances {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 collisionDescription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String localizationDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates coordinates;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime date;

    public CollisionCircumstances(iy.b0 b0Var, String str, Coordinates coordinates, fz.b.OffsetDateTime offsetDateTime) {
        this.collisionDescription = b0Var;
        this.localizationDescription = str;
        this.coordinates = coordinates;
        this.date = offsetDateTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getCollisionDescription() {
        return this.collisionDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final fz.b.OffsetDateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLocalizationDescription() {
        return this.localizationDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionCircumstances)) {
            return false;
        }
        CollisionCircumstances collisionCircumstances = (CollisionCircumstances) other;
        return fr.t.c(this.collisionDescription, collisionCircumstances.collisionDescription) && fr.t.c(this.localizationDescription, collisionCircumstances.localizationDescription) && fr.t.c(this.coordinates, collisionCircumstances.coordinates) && fr.t.c(this.date, collisionCircumstances.date);
    }

    public int hashCode() {
        return (((((this.collisionDescription.hashCode() * 31) + this.localizationDescription.hashCode()) * 31) + this.coordinates.hashCode()) * 31) + this.date.hashCode();
    }

    public String toString() {
        return "CollisionCircumstances(collisionDescription=" + this.collisionDescription + ", localizationDescription=" + this.localizationDescription + ", coordinates=" + this.coordinates + ", date=" + this.date + ")";
    }
}
