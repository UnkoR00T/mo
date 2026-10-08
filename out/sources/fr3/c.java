package fr3;

import android.graphics.Bitmap;
import cr3.WruDocumentData;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lfr3/c;", "", "a", "c", "b", "Lfr3/c$a;", "Lfr3/c$b;", "Lfr3/c$c;", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfr3/c$a;", "Lfr3/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f66586a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 427201001;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: fr3.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfr3/c$c;", "Lfr3/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1487c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1487c f66595a = new C1487c();

        private C1487c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C1487c);
        }

        public int hashCode() {
            return -1184490527;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: fr3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jf\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b%\u00103¨\u00064"}, d2 = {"Lfr3/c$b;", "Lfr3/c;", "Lcr3/e;", "localDocumentData", "Ljava/time/OffsetDateTime;", "currentDateTime", "Landroid/graphics/Bitmap;", "documentLogoBitmap", "userPhotoBitmap", "Lcr3/b;", "documentStatus", "", "shortName", "", "isBottomSheetVisible", "Lfr3/b;", "additionalParametersBitmaps", "<init>", "(Lcr3/e;Ljava/time/OffsetDateTime;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcr3/b;Ljava/lang/String;ZLfr3/b;)V", "a", "(Lcr3/e;Ljava/time/OffsetDateTime;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcr3/b;Ljava/lang/String;ZLfr3/b;)Lfr3/c$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcr3/e;", "g", "()Lcr3/e;", "b", "Ljava/time/OffsetDateTime;", "d", "()Ljava/time/OffsetDateTime;", "c", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "i", "Lcr3/b;", "f", "()Lcr3/b;", "Ljava/lang/String;", "h", "Z", "j", "()Z", "Lfr3/b;", "()Lfr3/b;", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final WruDocumentData localDocumentData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime currentDateTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap documentLogoBitmap;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap userPhotoBitmap;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final cr3.b documentStatus;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shortName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isBottomSheetVisible;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final AdditionalParametersBitmaps additionalParametersBitmaps;

        public Initialized(WruDocumentData wruDocumentData, OffsetDateTime offsetDateTime, Bitmap bitmap, Bitmap bitmap2, cr3.b bVar, String str, boolean z15, AdditionalParametersBitmaps additionalParametersBitmaps) {
            this.localDocumentData = wruDocumentData;
            this.currentDateTime = offsetDateTime;
            this.documentLogoBitmap = bitmap;
            this.userPhotoBitmap = bitmap2;
            this.documentStatus = bVar;
            this.shortName = str;
            this.isBottomSheetVisible = z15;
            this.additionalParametersBitmaps = additionalParametersBitmaps;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, WruDocumentData wruDocumentData, OffsetDateTime offsetDateTime, Bitmap bitmap, Bitmap bitmap2, cr3.b bVar, String str, boolean z15, AdditionalParametersBitmaps additionalParametersBitmaps, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                wruDocumentData = initialized.localDocumentData;
            }
            if ((i15 & 2) != 0) {
                offsetDateTime = initialized.currentDateTime;
            }
            if ((i15 & 4) != 0) {
                bitmap = initialized.documentLogoBitmap;
            }
            if ((i15 & 8) != 0) {
                bitmap2 = initialized.userPhotoBitmap;
            }
            if ((i15 & 16) != 0) {
                bVar = initialized.documentStatus;
            }
            if ((i15 & 32) != 0) {
                str = initialized.shortName;
            }
            if ((i15 & 64) != 0) {
                z15 = initialized.isBottomSheetVisible;
            }
            if ((i15 & 128) != 0) {
                additionalParametersBitmaps = initialized.additionalParametersBitmaps;
            }
            boolean z16 = z15;
            AdditionalParametersBitmaps additionalParametersBitmaps2 = additionalParametersBitmaps;
            cr3.b bVar2 = bVar;
            String str2 = str;
            return initialized.a(wruDocumentData, offsetDateTime, bitmap, bitmap2, bVar2, str2, z16, additionalParametersBitmaps2);
        }

        public final Initialized a(WruDocumentData localDocumentData, OffsetDateTime currentDateTime, Bitmap documentLogoBitmap, Bitmap userPhotoBitmap, cr3.b documentStatus, String shortName, boolean isBottomSheetVisible, AdditionalParametersBitmaps additionalParametersBitmaps) {
            return new Initialized(localDocumentData, currentDateTime, documentLogoBitmap, userPhotoBitmap, documentStatus, shortName, isBottomSheetVisible, additionalParametersBitmaps);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AdditionalParametersBitmaps getAdditionalParametersBitmaps() {
            return this.additionalParametersBitmaps;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final OffsetDateTime getCurrentDateTime() {
            return this.currentDateTime;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Bitmap getDocumentLogoBitmap() {
            return this.documentLogoBitmap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.localDocumentData, initialized.localDocumentData) && fr.t.c(this.currentDateTime, initialized.currentDateTime) && fr.t.c(this.documentLogoBitmap, initialized.documentLogoBitmap) && fr.t.c(this.userPhotoBitmap, initialized.userPhotoBitmap) && this.documentStatus == initialized.documentStatus && fr.t.c(this.shortName, initialized.shortName) && this.isBottomSheetVisible == initialized.isBottomSheetVisible && fr.t.c(this.additionalParametersBitmaps, initialized.additionalParametersBitmaps);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final cr3.b getDocumentStatus() {
            return this.documentStatus;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final WruDocumentData getLocalDocumentData() {
            return this.localDocumentData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getShortName() {
            return this.shortName;
        }

        public int hashCode() {
            int iHashCode = ((this.localDocumentData.hashCode() * 31) + this.currentDateTime.hashCode()) * 31;
            Bitmap bitmap = this.documentLogoBitmap;
            int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
            Bitmap bitmap2 = this.userPhotoBitmap;
            int iHashCode3 = (((iHashCode2 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31) + this.documentStatus.hashCode()) * 31;
            String str = this.shortName;
            return ((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isBottomSheetVisible)) * 31) + this.additionalParametersBitmaps.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Bitmap getUserPhotoBitmap() {
            return this.userPhotoBitmap;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsBottomSheetVisible() {
            return this.isBottomSheetVisible;
        }

        public String toString() {
            return "Initialized(localDocumentData=" + this.localDocumentData + ", currentDateTime=" + this.currentDateTime + ", documentLogoBitmap=" + this.documentLogoBitmap + ", userPhotoBitmap=" + this.userPhotoBitmap + ", documentStatus=" + this.documentStatus + ", shortName=" + this.shortName + ", isBottomSheetVisible=" + this.isBottomSheetVisible + ", additionalParametersBitmaps=" + this.additionalParametersBitmaps + ')';
        }

        public /* synthetic */ Initialized(WruDocumentData wruDocumentData, OffsetDateTime offsetDateTime, Bitmap bitmap, Bitmap bitmap2, cr3.b bVar, String str, boolean z15, AdditionalParametersBitmaps additionalParametersBitmaps, int i15, fr.k kVar) {
            this(wruDocumentData, offsetDateTime, bitmap, bitmap2, bVar, str, (i15 & 64) != 0 ? false : z15, additionalParametersBitmaps);
        }
    }
}
