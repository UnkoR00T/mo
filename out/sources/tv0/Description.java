package tv0;

import fr.t;
import p071kotlin.Metadata;
import sv0.o;

/* JADX INFO: renamed from: tv0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ltv0/a;", "", "Lsv0/l;", "collisionRole", "Lsv0/o;", "author", "Ltv0/i;", "description", "<init>", "(Lsv0/l;Lsv0/o;Ltv0/i;)V", "a", "(Lsv0/l;Lsv0/o;Ltv0/i;)Ltv0/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsv0/l;", "d", "()Lsv0/l;", "b", "Lsv0/o;", "c", "()Lsv0/o;", "Ltv0/i;", "e", "()Ltv0/i;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Description {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final sv0.l collisionRole;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final o author;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEVehicleCollisionDescriptionConception description;

    public Description() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Description b(Description description, sv0.l lVar, o oVar, BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            lVar = description.collisionRole;
        }
        if ((i15 & 2) != 0) {
            oVar = description.author;
        }
        if ((i15 & 4) != 0) {
            bEVehicleCollisionDescriptionConception = description.description;
        }
        return description.a(lVar, oVar, bEVehicleCollisionDescriptionConception);
    }

    public final Description a(sv0.l collisionRole, o author, BEVehicleCollisionDescriptionConception description) {
        return new Description(collisionRole, author, description);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final sv0.l getCollisionRole() {
        return this.collisionRole;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BEVehicleCollisionDescriptionConception getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Description)) {
            return false;
        }
        Description description = (Description) other;
        return this.collisionRole == description.collisionRole && this.author == description.author && t.c(this.description, description.description);
    }

    public int hashCode() {
        return (((this.collisionRole.hashCode() * 31) + this.author.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "Description(collisionRole=" + this.collisionRole + ", author=" + this.author + ", description=" + this.description + ")";
    }

    public Description(sv0.l lVar, o oVar, BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception) {
        this.collisionRole = lVar;
        this.author = oVar;
        this.description = bEVehicleCollisionDescriptionConception;
    }

    public /* synthetic */ Description(sv0.l lVar, o oVar, BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? sv0.l.VICTIM : lVar, (i15 & 2) != 0 ? o.ME : oVar, (i15 & 4) != 0 ? new BEVehicleCollisionDescriptionConception(null, null, null, 7, null) : bEVehicleCollisionDescriptionConception);
    }
}
