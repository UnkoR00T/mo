package dp3;

import android.graphics.Bitmap;
import co3.s;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ldp3/b;", "", "a", "b", "Ldp3/b$a;", "Ldp3/b$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldp3/b$a;", "Ldp3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43701a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1915178208;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: dp3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Ldp3/b$b;", "Ldp3/b;", "Lco3/s;", "verificationDetailsData", "Landroid/graphics/Bitmap;", "imageBitmap", "", "maxTime", "leftTime", "<init>", "(Lco3/s;Landroid/graphics/Bitmap;II)V", "a", "(Lco3/s;Landroid/graphics/Bitmap;II)Ldp3/b$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lco3/s;", "f", "()Lco3/s;", "b", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "I", "e", "d", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final s verificationDetailsData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap imageBitmap;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxTime;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int leftTime;

        public Initialized(s sVar, Bitmap bitmap, int i15, int i16) {
            this.verificationDetailsData = sVar;
            this.imageBitmap = bitmap;
            this.maxTime = i15;
            this.leftTime = i16;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, s sVar, Bitmap bitmap, int i15, int i16, int i17, Object obj) {
            if ((i17 & 1) != 0) {
                sVar = initialized.verificationDetailsData;
            }
            if ((i17 & 2) != 0) {
                bitmap = initialized.imageBitmap;
            }
            if ((i17 & 4) != 0) {
                i15 = initialized.maxTime;
            }
            if ((i17 & 8) != 0) {
                i16 = initialized.leftTime;
            }
            return initialized.a(sVar, bitmap, i15, i16);
        }

        public final Initialized a(s verificationDetailsData, Bitmap imageBitmap, int maxTime, int leftTime) {
            return new Initialized(verificationDetailsData, imageBitmap, maxTime, leftTime);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Bitmap getImageBitmap() {
            return this.imageBitmap;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getLeftTime() {
            return this.leftTime;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getMaxTime() {
            return this.maxTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return t.c(this.verificationDetailsData, initialized.verificationDetailsData) && t.c(this.imageBitmap, initialized.imageBitmap) && this.maxTime == initialized.maxTime && this.leftTime == initialized.leftTime;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final s getVerificationDetailsData() {
            return this.verificationDetailsData;
        }

        public int hashCode() {
            int iHashCode = this.verificationDetailsData.hashCode() * 31;
            Bitmap bitmap = this.imageBitmap;
            return ((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.maxTime)) * 31) + Integer.hashCode(this.leftTime);
        }

        public String toString() {
            return "Initialized(verificationDetailsData=" + this.verificationDetailsData + ", imageBitmap=" + this.imageBitmap + ", maxTime=" + this.maxTime + ", leftTime=" + this.leftTime + ')';
        }
    }
}
