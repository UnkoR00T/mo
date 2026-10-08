package ww3;

import android.graphics.Bitmap;
import cw3.IdentityPhotoData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ww3.f, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001f\u0010&R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b'\u0010$¨\u0006("}, d2 = {"Lww3/f;", "", "Landroid/graphics/Bitmap;", "photo", "Ljw3/c;", "scaleType", "Lcw3/a$a;", "maskType", "", "isAdjustmentEnabled", "Lcw3/a$b;", "requirements", "isUnderGuardianship", "<init>", "(Landroid/graphics/Bitmap;Ljw3/c;Lcw3/a$a;ZLcw3/a$b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "b", "()Landroid/graphics/Bitmap;", "Ljw3/c;", "d", "()Ljw3/c;", "c", "Lcw3/a$a;", "()Lcw3/a$a;", "Z", "e", "()Z", "Lcw3/a$b;", "()Lcw3/a$b;", "f", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap photo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final jw3.c scaleType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentityPhotoData.AbstractC0815a maskType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAdjustmentEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentityPhotoData.PhotoRequirements requirements;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUnderGuardianship;

    public SetupData(Bitmap bitmap, jw3.c cVar, IdentityPhotoData.AbstractC0815a abstractC0815a, boolean z15, IdentityPhotoData.PhotoRequirements photoRequirements, boolean z16) {
        this.photo = bitmap;
        this.scaleType = cVar;
        this.maskType = abstractC0815a;
        this.isAdjustmentEnabled = z15;
        this.requirements = photoRequirements;
        this.isUnderGuardianship = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IdentityPhotoData.AbstractC0815a getMaskType() {
        return this.maskType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bitmap getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final IdentityPhotoData.PhotoRequirements getRequirements() {
        return this.requirements;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jw3.c getScaleType() {
        return this.scaleType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsAdjustmentEnabled() {
        return this.isAdjustmentEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return fr.t.c(this.photo, setupData.photo) && this.scaleType == setupData.scaleType && fr.t.c(this.maskType, setupData.maskType) && this.isAdjustmentEnabled == setupData.isAdjustmentEnabled && fr.t.c(this.requirements, setupData.requirements) && this.isUnderGuardianship == setupData.isUnderGuardianship;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsUnderGuardianship() {
        return this.isUnderGuardianship;
    }

    public int hashCode() {
        return (((((((((this.photo.hashCode() * 31) + this.scaleType.hashCode()) * 31) + this.maskType.hashCode()) * 31) + Boolean.hashCode(this.isAdjustmentEnabled)) * 31) + this.requirements.hashCode()) * 31) + Boolean.hashCode(this.isUnderGuardianship);
    }

    public String toString() {
        return "SetupData(photo=" + this.photo + ", scaleType=" + this.scaleType + ", maskType=" + this.maskType + ", isAdjustmentEnabled=" + this.isAdjustmentEnabled + ", requirements=" + this.requirements + ", isUnderGuardianship=" + this.isUnderGuardianship + ')';
    }
}
