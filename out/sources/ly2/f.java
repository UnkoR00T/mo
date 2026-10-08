package ly2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lly2/f;", "", "a", "d", "b", "c", "Lly2/f$a;", "Lly2/f$d;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lly2/f$a;", "Lly2/f;", "Lhb4/c;", "a", "()Lhb4/c;", "vmsAdapter", "Lly2/e;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f {
        hb4.c a();
    }

    /* JADX INFO: renamed from: ly2.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lly2/f$b;", "Lly2/f$d;", "Llv2/a;", "applicationOwner", "", "isIdentityPhotoFeatureEnabled", "<init>", "(Llv2/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Llv2/a;", "b", "()Llv2/a;", "Z", "c", "()Z", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final lv2.a applicationOwner;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isIdentityPhotoFeatureEnabled;

        public Initialized(lv2.a aVar, boolean z15) {
            this.applicationOwner = aVar;
            this.isIdentityPhotoFeatureEnabled = z15;
        }

        @Override // ly2.f.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public lv2.a getApplicationOwner() {
            return this.applicationOwner;
        }

        @Override // ly2.f.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsIdentityPhotoFeatureEnabled() {
            return this.isIdentityPhotoFeatureEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.applicationOwner == initialized.applicationOwner && this.isIdentityPhotoFeatureEnabled == initialized.isIdentityPhotoFeatureEnabled;
        }

        public int hashCode() {
            return (this.applicationOwner.hashCode() * 31) + Boolean.hashCode(this.isIdentityPhotoFeatureEnabled);
        }

        public String toString() {
            return "Initialized(applicationOwner=" + this.applicationOwner + ", isIdentityPhotoFeatureEnabled=" + this.isIdentityPhotoFeatureEnabled + ')';
        }
    }

    /* JADX INFO: renamed from: ly2.f$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lly2/f$c;", "Lly2/f$d;", "Llv2/a;", "applicationOwner", "", "isIdentityPhotoFeatureEnabled", "<init>", "(Llv2/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Llv2/a;", "b", "()Llv2/a;", "Z", "c", "()Z", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitializedWithTrustedProfile implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final lv2.a applicationOwner;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isIdentityPhotoFeatureEnabled;

        public InitializedWithTrustedProfile(lv2.a aVar, boolean z15) {
            this.applicationOwner = aVar;
            this.isIdentityPhotoFeatureEnabled = z15;
        }

        @Override // ly2.f.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public lv2.a getApplicationOwner() {
            return this.applicationOwner;
        }

        @Override // ly2.f.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsIdentityPhotoFeatureEnabled() {
            return this.isIdentityPhotoFeatureEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitializedWithTrustedProfile)) {
                return false;
            }
            InitializedWithTrustedProfile initializedWithTrustedProfile = (InitializedWithTrustedProfile) other;
            return this.applicationOwner == initializedWithTrustedProfile.applicationOwner && this.isIdentityPhotoFeatureEnabled == initializedWithTrustedProfile.isIdentityPhotoFeatureEnabled;
        }

        public int hashCode() {
            return (this.applicationOwner.hashCode() * 31) + Boolean.hashCode(this.isIdentityPhotoFeatureEnabled);
        }

        public String toString() {
            return "InitializedWithTrustedProfile(applicationOwner=" + this.applicationOwner + ", isIdentityPhotoFeatureEnabled=" + this.isIdentityPhotoFeatureEnabled + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lly2/f$d;", "Lly2/f;", "Llv2/a;", "b", "()Llv2/a;", "applicationOwner", "", "c", "()Z", "isIdentityPhotoFeatureEnabled", "Lly2/d;", "Lly2/f$b;", "Lly2/f$c;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d extends f {
        /* JADX INFO: renamed from: b */
        lv2.a getApplicationOwner();

        /* JADX INFO: renamed from: c */
        boolean getIsIdentityPhotoFeatureEnabled();
    }
}
