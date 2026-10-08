package sv0;

import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: sv0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u001c\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b*\u0010.R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b/\u0010.¨\u00060"}, d2 = {"Lsv0/i;", "", "Lfz/b$f;", "date", "Lvy/c;", "coordinates", "Liy/b0;", "localizationDescription", "collisionDescription", "Lsv0/k;", "personal", "Lsv0/o;", "descriptionAuthor", "Lsv0/n0;", "perpetrator", "victim", "<init>", "(Lfz/b$f;Lvy/c;Liy/b0;Liy/b0;Lsv0/k;Lsv0/o;Lsv0/n0;Lsv0/n0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfz/b$f;", "c", "()Lfz/b$f;", "b", "Lvy/c;", "()Lvy/c;", "Liy/b0;", "e", "()Liy/b0;", "d", "Lsv0/k;", "g", "()Lsv0/k;", "f", "Lsv0/o;", "()Lsv0/o;", "Lsv0/n0;", "()Lsv0/n0;", "h", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionCreatedDescription {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates coordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 localizationDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 collisionDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CollisionOtherSidePersonalData personal;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final o descriptionAuthor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleCollisionDescriptionParticipant perpetrator;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleCollisionDescriptionParticipant victim;

    public CollisionCreatedDescription(fz.b.OffsetDateTime offsetDateTime, Coordinates coordinates, iy.b0 b0Var, iy.b0 b0Var2, CollisionOtherSidePersonalData kVar, o oVar, VehicleCollisionDescriptionParticipant n0Var, VehicleCollisionDescriptionParticipant n0Var2) {
        this.date = offsetDateTime;
        this.coordinates = coordinates;
        this.localizationDescription = b0Var;
        this.collisionDescription = b0Var2;
        this.personal = kVar;
        this.descriptionAuthor = oVar;
        this.perpetrator = n0Var;
        this.victim = n0Var2;
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
    public final o getDescriptionAuthor() {
        return this.descriptionAuthor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final iy.b0 getLocalizationDescription() {
        return this.localizationDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionCreatedDescription)) {
            return false;
        }
        CollisionCreatedDescription collisionCreatedDescription = (CollisionCreatedDescription) other;
        return fr.t.c(this.date, collisionCreatedDescription.date) && fr.t.c(this.coordinates, collisionCreatedDescription.coordinates) && fr.t.c(this.localizationDescription, collisionCreatedDescription.localizationDescription) && fr.t.c(this.collisionDescription, collisionCreatedDescription.collisionDescription) && fr.t.c(this.personal, collisionCreatedDescription.personal) && this.descriptionAuthor == collisionCreatedDescription.descriptionAuthor && fr.t.c(this.perpetrator, collisionCreatedDescription.perpetrator) && fr.t.c(this.victim, collisionCreatedDescription.victim);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final VehicleCollisionDescriptionParticipant getPerpetrator() {
        return this.perpetrator;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final CollisionOtherSidePersonalData getPersonal() {
        return this.personal;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final VehicleCollisionDescriptionParticipant getVictim() {
        return this.victim;
    }

    public int hashCode() {
        int iHashCode = this.date.hashCode() * 31;
        Coordinates coordinates = this.coordinates;
        return ((((((((((((iHashCode + (coordinates == null ? 0 : coordinates.hashCode())) * 31) + this.localizationDescription.hashCode()) * 31) + this.collisionDescription.hashCode()) * 31) + this.personal.hashCode()) * 31) + this.descriptionAuthor.hashCode()) * 31) + this.perpetrator.hashCode()) * 31) + this.victim.hashCode();
    }

    public String toString() {
        return "CollisionCreatedDescription(date=" + this.date + ", coordinates=" + this.coordinates + ", localizationDescription=" + this.localizationDescription + ", collisionDescription=" + this.collisionDescription + ", personal=" + this.personal + ", descriptionAuthor=" + this.descriptionAuthor + ", perpetrator=" + this.perpetrator + ", victim=" + this.victim + ")";
    }
}
