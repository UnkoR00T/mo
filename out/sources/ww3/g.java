package ww3;

import android.graphics.Bitmap;
import cw3.IdentityPhotoData;
import jw3.MaskDefinition;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lww3/g;", "", "Lcw3/a$a;", "b", "()Lcw3/a$a;", "maskType", "", "a", "()Z", "isAdjustmentEnabled", "Lww3/g$a;", "Lww3/g$b;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: ww3.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lww3/g$b;", "Lww3/g;", "Lcw3/a$a;", "maskType", "", "isAdjustmentEnabled", "<init>", "(Lcw3/a$a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcw3/a$a;", "b", "()Lcw3/a$a;", "Z", "()Z", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Measuring implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdentityPhotoData.AbstractC0815a maskType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAdjustmentEnabled;

        public Measuring(IdentityPhotoData.AbstractC0815a abstractC0815a, boolean z15) {
            this.maskType = abstractC0815a;
            this.isAdjustmentEnabled = z15;
        }

        @Override // ww3.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsAdjustmentEnabled() {
            return this.isAdjustmentEnabled;
        }

        @Override // ww3.g
        /* JADX INFO: renamed from: b, reason: from getter */
        public IdentityPhotoData.AbstractC0815a getMaskType() {
            return this.maskType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Measuring)) {
                return false;
            }
            Measuring measuring = (Measuring) other;
            return fr.t.c(this.maskType, measuring.maskType) && this.isAdjustmentEnabled == measuring.isAdjustmentEnabled;
        }

        public int hashCode() {
            return (this.maskType.hashCode() * 31) + Boolean.hashCode(this.isAdjustmentEnabled);
        }

        public String toString() {
            return "Measuring(maskType=" + this.maskType + ", isAdjustmentEnabled=" + this.isAdjustmentEnabled + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    boolean getIsAdjustmentEnabled();

    /* JADX INFO: renamed from: b */
    IdentityPhotoData.AbstractC0815a getMaskType();

    /* JADX INFO: renamed from: ww3.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b'\u0010\u001bR\u001a\u0010+\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b\u001c\u0010*¨\u0006,"}, d2 = {"Lww3/g$a;", "Lww3/g;", "", "isAdjustmentEnabled", "Landroid/graphics/Bitmap;", "bitmap", "Ljw3/c;", "scaleType", "Ljw3/b;", "maskDefinition", "isMaskVisible", "<init>", "(ZLandroid/graphics/Bitmap;Ljw3/c;Ljw3/b;Z)V", "c", "(ZLandroid/graphics/Bitmap;Ljw3/c;Ljw3/b;Z)Lww3/g$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "Ljw3/c;", "g", "()Ljw3/c;", "d", "Ljw3/b;", "f", "()Ljw3/b;", "h", "Lcw3/a$a;", "Lcw3/a$a;", "()Lcw3/a$a;", "maskType", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAdjustmentEnabled;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap bitmap;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final jw3.c scaleType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final MaskDefinition maskDefinition;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMaskVisible;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final IdentityPhotoData.AbstractC0815a maskType;

        public Initialized(boolean z15, Bitmap bitmap, jw3.c cVar, MaskDefinition maskDefinition, boolean z16) {
            this.isAdjustmentEnabled = z15;
            this.bitmap = bitmap;
            this.scaleType = cVar;
            this.maskDefinition = maskDefinition;
            this.isMaskVisible = z16;
            this.maskType = maskDefinition.getMaskType();
        }

        public static /* synthetic */ Initialized d(Initialized initialized, boolean z15, Bitmap bitmap, jw3.c cVar, MaskDefinition maskDefinition, boolean z16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = initialized.isAdjustmentEnabled;
            }
            if ((i15 & 2) != 0) {
                bitmap = initialized.bitmap;
            }
            if ((i15 & 4) != 0) {
                cVar = initialized.scaleType;
            }
            if ((i15 & 8) != 0) {
                maskDefinition = initialized.maskDefinition;
            }
            if ((i15 & 16) != 0) {
                z16 = initialized.isMaskVisible;
            }
            boolean z17 = z16;
            jw3.c cVar2 = cVar;
            return initialized.c(z15, bitmap, cVar2, maskDefinition, z17);
        }

        @Override // ww3.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsAdjustmentEnabled() {
            return this.isAdjustmentEnabled;
        }

        @Override // ww3.g
        /* JADX INFO: renamed from: b, reason: from getter */
        public IdentityPhotoData.AbstractC0815a getMaskType() {
            return this.maskType;
        }

        public final Initialized c(boolean isAdjustmentEnabled, Bitmap bitmap, jw3.c scaleType, MaskDefinition maskDefinition, boolean isMaskVisible) {
            return new Initialized(isAdjustmentEnabled, bitmap, scaleType, maskDefinition, isMaskVisible);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.isAdjustmentEnabled == initialized.isAdjustmentEnabled && fr.t.c(this.bitmap, initialized.bitmap) && this.scaleType == initialized.scaleType && fr.t.c(this.maskDefinition, initialized.maskDefinition) && this.isMaskVisible == initialized.isMaskVisible;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final MaskDefinition getMaskDefinition() {
            return this.maskDefinition;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final jw3.c getScaleType() {
            return this.scaleType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsMaskVisible() {
            return this.isMaskVisible;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isAdjustmentEnabled) * 31) + this.bitmap.hashCode()) * 31) + this.scaleType.hashCode()) * 31) + this.maskDefinition.hashCode()) * 31) + Boolean.hashCode(this.isMaskVisible);
        }

        public String toString() {
            return "Initialized(isAdjustmentEnabled=" + this.isAdjustmentEnabled + ", bitmap=" + this.bitmap + ", scaleType=" + this.scaleType + ", maskDefinition=" + this.maskDefinition + ", isMaskVisible=" + this.isMaskVisible + ')';
        }

        public /* synthetic */ Initialized(boolean z15, Bitmap bitmap, jw3.c cVar, MaskDefinition maskDefinition, boolean z16, int i15, fr.k kVar) {
            this(z15, bitmap, cVar, maskDefinition, (i15 & 16) != 0 ? true : z16);
        }
    }
}
