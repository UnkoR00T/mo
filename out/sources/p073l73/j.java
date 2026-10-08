package p073l73;

import android.graphics.Bitmap;
import fr.t;
import k73.StudentCardData;
import k73.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ll73/j;", "", "a", "b", "Ll73/j$a;", "Ll73/j$b;", "studentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll73/j$a;", "Ll73/j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "studentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f116877a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1787063247;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: l73.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b!\u0010)¨\u0006*"}, d2 = {"Ll73/j$b;", "Ll73/j;", "Lk73/d;", "data", "Lk73/b;", "status", "", "showExpirationDateBanner", "safeBusServiceAvailable", "", "documentShortName", "Landroid/graphics/Bitmap;", "barcodeBitmap", "<init>", "(Lk73/d;Lk73/b;ZZLjava/lang/String;Landroid/graphics/Bitmap;)V", "a", "(Lk73/d;Lk73/b;ZZLjava/lang/String;Landroid/graphics/Bitmap;)Ll73/j$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lk73/d;", "d", "()Lk73/d;", "b", "Lk73/b;", "h", "()Lk73/b;", "c", "Z", "g", "()Z", "f", "e", "Ljava/lang/String;", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "studentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StudentCardData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b status;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showExpirationDateBanner;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean safeBusServiceAvailable;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentShortName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap barcodeBitmap;

        public Initialized(StudentCardData studentCardData, b bVar, boolean z15, boolean z16, String str, Bitmap bitmap) {
            this.data = studentCardData;
            this.status = bVar;
            this.showExpirationDateBanner = z15;
            this.safeBusServiceAvailable = z16;
            this.documentShortName = str;
            this.barcodeBitmap = bitmap;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, StudentCardData studentCardData, b bVar, boolean z15, boolean z16, String str, Bitmap bitmap, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                studentCardData = initialized.data;
            }
            if ((i15 & 2) != 0) {
                bVar = initialized.status;
            }
            if ((i15 & 4) != 0) {
                z15 = initialized.showExpirationDateBanner;
            }
            if ((i15 & 8) != 0) {
                z16 = initialized.safeBusServiceAvailable;
            }
            if ((i15 & 16) != 0) {
                str = initialized.documentShortName;
            }
            if ((i15 & 32) != 0) {
                bitmap = initialized.barcodeBitmap;
            }
            String str2 = str;
            Bitmap bitmap2 = bitmap;
            return initialized.a(studentCardData, bVar, z15, z16, str2, bitmap2);
        }

        public final Initialized a(StudentCardData data, b status, boolean showExpirationDateBanner, boolean safeBusServiceAvailable, String documentShortName, Bitmap barcodeBitmap) {
            return new Initialized(data, status, showExpirationDateBanner, safeBusServiceAvailable, documentShortName, barcodeBitmap);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Bitmap getBarcodeBitmap() {
            return this.barcodeBitmap;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final StudentCardData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDocumentShortName() {
            return this.documentShortName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return t.c(this.data, initialized.data) && this.status == initialized.status && this.showExpirationDateBanner == initialized.showExpirationDateBanner && this.safeBusServiceAvailable == initialized.safeBusServiceAvailable && t.c(this.documentShortName, initialized.documentShortName) && t.c(this.barcodeBitmap, initialized.barcodeBitmap);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getSafeBusServiceAvailable() {
            return this.safeBusServiceAvailable;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getShowExpirationDateBanner() {
            return this.showExpirationDateBanner;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = ((((((this.data.hashCode() * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.showExpirationDateBanner)) * 31) + Boolean.hashCode(this.safeBusServiceAvailable)) * 31;
            String str = this.documentShortName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Bitmap bitmap = this.barcodeBitmap;
            return iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0);
        }

        public String toString() {
            return "Initialized(data=" + this.data + ", status=" + this.status + ", showExpirationDateBanner=" + this.showExpirationDateBanner + ", safeBusServiceAvailable=" + this.safeBusServiceAvailable + ", documentShortName=" + this.documentShortName + ", barcodeBitmap=" + this.barcodeBitmap + ')';
        }
    }
}
