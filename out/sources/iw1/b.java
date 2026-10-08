package iw1;

import iq0.DashboardServiceEntry;
import java.util.List;
import mv1.DynamicDocumentData;
import p071kotlin.Metadata;
import wv1.BitmapsByFieldReference;
import wv1.DynamicDocumentBottomSheetData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Liw1/b;", "", "a", "b", "Liw1/b$a;", "Liw1/b$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liw1/b$a;", "Liw1/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f97285a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1141535891;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: iw1.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jx\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b0\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\b5\u0010\u0019R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b1\u00109\u001a\u0004\b,\u0010:¨\u0006;"}, d2 = {"Liw1/b$b;", "Liw1/b;", "Lrq0/b$c;", "dynamicDocumentType", "", "Liq0/p;", "availableServices", "Lmv1/c;", "multiDocumentData", "Liy/b0;", "mainDocumentPhoto", "mainDocumentPesel", "Lg30/v;", "bottomSheetValue", "Lwv1/b;", "bottomSheetContentData", "", "documentShortName", "Lwv1/a;", "bitmapsByFieldReference", "<init>", "(Lrq0/b$c;Ljava/util/List;Lmv1/c;Liy/b0;Liy/b0;Lg30/v;Lwv1/b;Ljava/lang/String;Lwv1/a;)V", "a", "(Lrq0/b$c;Ljava/util/List;Lmv1/c;Liy/b0;Liy/b0;Lg30/v;Lwv1/b;Ljava/lang/String;Lwv1/a;)Liw1/b$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrq0/b$c;", "h", "()Lrq0/b$c;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lmv1/c;", "k", "()Lmv1/c;", "d", "Liy/b0;", "j", "()Liy/b0;", "e", "i", "f", "Lg30/v;", "()Lg30/v;", "g", "Lwv1/b;", "()Lwv1/b;", "Ljava/lang/String;", "Lwv1/a;", "()Lwv1/a;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.c dynamicDocumentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DashboardServiceEntry> availableServices;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DynamicDocumentData multiDocumentData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 mainDocumentPhoto;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 mainDocumentPesel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final g30.v bottomSheetValue;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final DynamicDocumentBottomSheetData bottomSheetContentData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentShortName;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final BitmapsByFieldReference bitmapsByFieldReference;

        public Initialized(rq0.b.c cVar, List<DashboardServiceEntry> list, DynamicDocumentData dynamicDocumentData, iy.b0 b0Var, iy.b0 b0Var2, g30.v vVar, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData, String str, BitmapsByFieldReference bitmapsByFieldReference) {
            this.dynamicDocumentType = cVar;
            this.availableServices = list;
            this.multiDocumentData = dynamicDocumentData;
            this.mainDocumentPhoto = b0Var;
            this.mainDocumentPesel = b0Var2;
            this.bottomSheetValue = vVar;
            this.bottomSheetContentData = dynamicDocumentBottomSheetData;
            this.documentShortName = str;
            this.bitmapsByFieldReference = bitmapsByFieldReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, rq0.b.c cVar, List list, DynamicDocumentData dynamicDocumentData, iy.b0 b0Var, iy.b0 b0Var2, g30.v vVar, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData, String str, BitmapsByFieldReference bitmapsByFieldReference, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                cVar = initialized.dynamicDocumentType;
            }
            if ((i15 & 2) != 0) {
                list = initialized.availableServices;
            }
            if ((i15 & 4) != 0) {
                dynamicDocumentData = initialized.multiDocumentData;
            }
            if ((i15 & 8) != 0) {
                b0Var = initialized.mainDocumentPhoto;
            }
            if ((i15 & 16) != 0) {
                b0Var2 = initialized.mainDocumentPesel;
            }
            if ((i15 & 32) != 0) {
                vVar = initialized.bottomSheetValue;
            }
            if ((i15 & 64) != 0) {
                dynamicDocumentBottomSheetData = initialized.bottomSheetContentData;
            }
            if ((i15 & 128) != 0) {
                str = initialized.documentShortName;
            }
            if ((i15 & 256) != 0) {
                bitmapsByFieldReference = initialized.bitmapsByFieldReference;
            }
            String str2 = str;
            BitmapsByFieldReference bitmapsByFieldReference2 = bitmapsByFieldReference;
            g30.v vVar2 = vVar;
            DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData2 = dynamicDocumentBottomSheetData;
            iy.b0 b0Var3 = b0Var2;
            DynamicDocumentData dynamicDocumentData2 = dynamicDocumentData;
            return initialized.a(cVar, list, dynamicDocumentData2, b0Var, b0Var3, vVar2, dynamicDocumentBottomSheetData2, str2, bitmapsByFieldReference2);
        }

        public final Initialized a(rq0.b.c dynamicDocumentType, List<DashboardServiceEntry> availableServices, DynamicDocumentData multiDocumentData, iy.b0 mainDocumentPhoto, iy.b0 mainDocumentPesel, g30.v bottomSheetValue, DynamicDocumentBottomSheetData bottomSheetContentData, String documentShortName, BitmapsByFieldReference bitmapsByFieldReference) {
            return new Initialized(dynamicDocumentType, availableServices, multiDocumentData, mainDocumentPhoto, mainDocumentPesel, bottomSheetValue, bottomSheetContentData, documentShortName, bitmapsByFieldReference);
        }

        public final List<DashboardServiceEntry> c() {
            return this.availableServices;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BitmapsByFieldReference getBitmapsByFieldReference() {
            return this.bitmapsByFieldReference;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final DynamicDocumentBottomSheetData getBottomSheetContentData() {
            return this.bottomSheetContentData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.dynamicDocumentType == initialized.dynamicDocumentType && fr.t.c(this.availableServices, initialized.availableServices) && fr.t.c(this.multiDocumentData, initialized.multiDocumentData) && fr.t.c(this.mainDocumentPhoto, initialized.mainDocumentPhoto) && fr.t.c(this.mainDocumentPesel, initialized.mainDocumentPesel) && this.bottomSheetValue == initialized.bottomSheetValue && fr.t.c(this.bottomSheetContentData, initialized.bottomSheetContentData) && fr.t.c(this.documentShortName, initialized.documentShortName) && fr.t.c(this.bitmapsByFieldReference, initialized.bitmapsByFieldReference);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final g30.v getBottomSheetValue() {
            return this.bottomSheetValue;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getDocumentShortName() {
            return this.documentShortName;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final rq0.b.c getDynamicDocumentType() {
            return this.dynamicDocumentType;
        }

        public int hashCode() {
            int iHashCode = this.dynamicDocumentType.hashCode() * 31;
            List<DashboardServiceEntry> list = this.availableServices;
            int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.multiDocumentData.hashCode()) * 31;
            iy.b0 b0Var = this.mainDocumentPhoto;
            int iHashCode3 = (((((iHashCode2 + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + this.mainDocumentPesel.hashCode()) * 31) + this.bottomSheetValue.hashCode()) * 31;
            DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData = this.bottomSheetContentData;
            int iHashCode4 = (iHashCode3 + (dynamicDocumentBottomSheetData == null ? 0 : dynamicDocumentBottomSheetData.hashCode())) * 31;
            String str = this.documentShortName;
            return ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.bitmapsByFieldReference.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final iy.b0 getMainDocumentPesel() {
            return this.mainDocumentPesel;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final iy.b0 getMainDocumentPhoto() {
            return this.mainDocumentPhoto;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final DynamicDocumentData getMultiDocumentData() {
            return this.multiDocumentData;
        }

        public String toString() {
            return "Initialized(dynamicDocumentType=" + this.dynamicDocumentType + ", availableServices=" + this.availableServices + ", multiDocumentData=" + this.multiDocumentData + ", mainDocumentPhoto=" + this.mainDocumentPhoto + ", mainDocumentPesel=" + this.mainDocumentPesel + ", bottomSheetValue=" + this.bottomSheetValue + ", bottomSheetContentData=" + this.bottomSheetContentData + ", documentShortName=" + this.documentShortName + ", bitmapsByFieldReference=" + this.bitmapsByFieldReference + ')';
        }

        public /* synthetic */ Initialized(rq0.b.c cVar, List list, DynamicDocumentData dynamicDocumentData, iy.b0 b0Var, iy.b0 b0Var2, g30.v vVar, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData, String str, BitmapsByFieldReference bitmapsByFieldReference, int i15, fr.k kVar) {
            this(cVar, list, dynamicDocumentData, b0Var, b0Var2, (i15 & 32) != 0 ? g30.v.HIDDEN : vVar, dynamicDocumentBottomSheetData, str, bitmapsByFieldReference);
        }
    }
}
