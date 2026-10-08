package ax3;

import cw3.IdentityPhotoData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ax3.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010!¨\u0006$"}, d2 = {"Lax3/d;", "", "Lwx/i$a;", "image", "Lcw3/a$b;", "requirements", "Lcw3/a$a;", "maskType", "", "isUnderGuardianship", "initialMaskVisibility", "<init>", "(Lwx/i$a;Lcw3/a$b;Lcw3/a$a;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$a;", "()Lwx/i$a;", "b", "Lcw3/a$b;", "c", "()Lcw3/a$b;", "Lcw3/a$a;", "()Lcw3/a$a;", "d", "Z", "()Z", "e", "getInitialMaskVisibility", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final wx.i.Image image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentityPhotoData.PhotoRequirements requirements;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentityPhotoData.AbstractC0815a maskType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUnderGuardianship;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean initialMaskVisibility;

    public SetupData(wx.i.Image image, IdentityPhotoData.PhotoRequirements photoRequirements, IdentityPhotoData.AbstractC0815a abstractC0815a, boolean z15, boolean z16) {
        this.image = image;
        this.requirements = photoRequirements;
        this.maskType = abstractC0815a;
        this.isUnderGuardianship = z15;
        this.initialMaskVisibility = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final wx.i.Image getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final IdentityPhotoData.AbstractC0815a getMaskType() {
        return this.maskType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final IdentityPhotoData.PhotoRequirements getRequirements() {
        return this.requirements;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsUnderGuardianship() {
        return this.isUnderGuardianship;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return fr.t.c(this.image, setupData.image) && fr.t.c(this.requirements, setupData.requirements) && fr.t.c(this.maskType, setupData.maskType) && this.isUnderGuardianship == setupData.isUnderGuardianship && this.initialMaskVisibility == setupData.initialMaskVisibility;
    }

    public int hashCode() {
        return (((((((this.image.hashCode() * 31) + this.requirements.hashCode()) * 31) + this.maskType.hashCode()) * 31) + Boolean.hashCode(this.isUnderGuardianship)) * 31) + Boolean.hashCode(this.initialMaskVisibility);
    }

    public String toString() {
        return "SetupData(image=" + this.image + ", requirements=" + this.requirements + ", maskType=" + this.maskType + ", isUnderGuardianship=" + this.isUnderGuardianship + ", initialMaskVisibility=" + this.initialMaskVisibility + ')';
    }
}
