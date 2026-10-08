package yx2;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yx2.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"Lyx2/b;", "", "Llv2/a;", "applicationOwner", "", "isIdentityPhotoFeatureEnabled", "Liy/b0;", "userEdorAddress", "<init>", "(Llv2/a;ZLiy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Llv2/a;", "()Llv2/a;", "b", "Z", "c", "()Z", "Liy/b0;", "()Liy/b0;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f230570d = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final lv2.a applicationOwner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isIdentityPhotoFeatureEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 userEdorAddress;

    public SetupData(lv2.a aVar, boolean z15, b0 b0Var) {
        this.applicationOwner = aVar;
        this.isIdentityPhotoFeatureEnabled = z15;
        this.userEdorAddress = b0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final lv2.a getApplicationOwner() {
        return this.applicationOwner;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getUserEdorAddress() {
        return this.userEdorAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsIdentityPhotoFeatureEnabled() {
        return this.isIdentityPhotoFeatureEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return this.applicationOwner == setupData.applicationOwner && this.isIdentityPhotoFeatureEnabled == setupData.isIdentityPhotoFeatureEnabled && t.c(this.userEdorAddress, setupData.userEdorAddress);
    }

    public int hashCode() {
        return (((this.applicationOwner.hashCode() * 31) + Boolean.hashCode(this.isIdentityPhotoFeatureEnabled)) * 31) + this.userEdorAddress.hashCode();
    }

    public String toString() {
        return "SetupData(applicationOwner=" + this.applicationOwner + ", isIdentityPhotoFeatureEnabled=" + this.isIdentityPhotoFeatureEnabled + ", userEdorAddress=" + this.userEdorAddress + ')';
    }
}
