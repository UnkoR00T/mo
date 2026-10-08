package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lfw0/r;", "", "", "descriptionAuthor", "Lfw0/h3;", "userInRole", "<init>", "(ZLfw0/h3;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getDescriptionAuthor", "()Z", "b", "Lfw0/h3;", "getUserInRole", "()Lfw0/h3;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreateVehicleCollisionRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("descriptionAuthor")
    private final boolean descriptionAuthor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("userInRole")
    private final h3 userInRole;

    public CreateVehicleCollisionRequest(boolean z15, h3 h3Var) {
        this.descriptionAuthor = z15;
        this.userInRole = h3Var;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateVehicleCollisionRequest)) {
            return false;
        }
        CreateVehicleCollisionRequest createVehicleCollisionRequest = (CreateVehicleCollisionRequest) other;
        return this.descriptionAuthor == createVehicleCollisionRequest.descriptionAuthor && this.userInRole == createVehicleCollisionRequest.userInRole;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.descriptionAuthor) * 31) + this.userInRole.hashCode();
    }

    public String toString() {
        return "CreateVehicleCollisionRequest(descriptionAuthor=" + this.descriptionAuthor + ", userInRole=" + this.userInRole + ')';
    }
}
