package dw1;

import iq0.DashboardServiceEntry;
import java.time.OffsetDateTime;
import java.util.List;
import mv1.DynamicDocumentData;
import p071kotlin.Metadata;
import wv1.BitmapsByFieldReference;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ldw1/i;", "", "c", "b", "a", "Ldw1/i$a;", "Ldw1/i$b;", "Ldw1/i$c;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    /* JADX INFO: renamed from: dw1.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldw1/i$b;", "Ldw1/i;", "Lrq0/b$b;", "dynamicDocumentType", "<init>", "(Lrq0/b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b$b;", "()Lrq0/b$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.EnumC4479b dynamicDocumentType;

        public Loading(rq0.b.EnumC4479b enumC4479b) {
            this.dynamicDocumentType = enumC4479b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final rq0.b.EnumC4479b getDynamicDocumentType() {
            return this.dynamicDocumentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.dynamicDocumentType == ((Loading) other).dynamicDocumentType;
        }

        public int hashCode() {
            return this.dynamicDocumentType.hashCode();
        }

        public String toString() {
            return "Loading(dynamicDocumentType=" + this.dynamicDocumentType + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldw1/i$c;", "Ldw1/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f44783a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 1821468119;
        }

        public String toString() {
            return "NotInitialized";
        }
    }

    /* JADX INFO: renamed from: dw1.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jj\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010/\u001a\u0004\b0\u0010\u0018R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b'\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b!\u00103\u001a\u0004\b+\u00104R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107¨\u00068"}, d2 = {"Ldw1/i$a;", "Ldw1/i;", "Lrq0/b$b;", "dynamicDocumentType", "Lmv1/c;", "data", "Lmv1/b;", "status", "Ljava/time/OffsetDateTime;", "currentDateTime", "", "documentShortName", "", "Liq0/p;", "availableServices", "Lwv1/a;", "bitmapsByFieldReference", "", "showExpirationDateBanner", "<init>", "(Lrq0/b$b;Lmv1/c;Lmv1/b;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/util/List;Lwv1/a;Z)V", "a", "(Lrq0/b$b;Lmv1/c;Lmv1/b;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/util/List;Lwv1/a;Z)Ldw1/i$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lrq0/b$b;", "g", "()Lrq0/b$b;", "b", "Lmv1/c;", "e", "()Lmv1/c;", "c", "Lmv1/b;", "i", "()Lmv1/b;", "d", "Ljava/time/OffsetDateTime;", "getCurrentDateTime", "()Ljava/time/OffsetDateTime;", "Ljava/lang/String;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Lwv1/a;", "()Lwv1/a;", "h", "Z", "()Z", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.EnumC4479b dynamicDocumentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DynamicDocumentData data;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final mv1.b status;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime currentDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentShortName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DashboardServiceEntry> availableServices;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final BitmapsByFieldReference bitmapsByFieldReference;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showExpirationDateBanner;

        public Initialized(rq0.b.EnumC4479b enumC4479b, DynamicDocumentData dynamicDocumentData, mv1.b bVar, OffsetDateTime offsetDateTime, String str, List<DashboardServiceEntry> list, BitmapsByFieldReference bitmapsByFieldReference, boolean z15) {
            this.dynamicDocumentType = enumC4479b;
            this.data = dynamicDocumentData;
            this.status = bVar;
            this.currentDateTime = offsetDateTime;
            this.documentShortName = str;
            this.availableServices = list;
            this.bitmapsByFieldReference = bitmapsByFieldReference;
            this.showExpirationDateBanner = z15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, rq0.b.EnumC4479b enumC4479b, DynamicDocumentData dynamicDocumentData, mv1.b bVar, OffsetDateTime offsetDateTime, String str, List list, BitmapsByFieldReference bitmapsByFieldReference, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                enumC4479b = initialized.dynamicDocumentType;
            }
            if ((i15 & 2) != 0) {
                dynamicDocumentData = initialized.data;
            }
            if ((i15 & 4) != 0) {
                bVar = initialized.status;
            }
            if ((i15 & 8) != 0) {
                offsetDateTime = initialized.currentDateTime;
            }
            if ((i15 & 16) != 0) {
                str = initialized.documentShortName;
            }
            if ((i15 & 32) != 0) {
                list = initialized.availableServices;
            }
            if ((i15 & 64) != 0) {
                bitmapsByFieldReference = initialized.bitmapsByFieldReference;
            }
            if ((i15 & 128) != 0) {
                z15 = initialized.showExpirationDateBanner;
            }
            BitmapsByFieldReference bitmapsByFieldReference2 = bitmapsByFieldReference;
            boolean z16 = z15;
            String str2 = str;
            List list2 = list;
            return initialized.a(enumC4479b, dynamicDocumentData, bVar, offsetDateTime, str2, list2, bitmapsByFieldReference2, z16);
        }

        public final Initialized a(rq0.b.EnumC4479b dynamicDocumentType, DynamicDocumentData data, mv1.b status, OffsetDateTime currentDateTime, String documentShortName, List<DashboardServiceEntry> availableServices, BitmapsByFieldReference bitmapsByFieldReference, boolean showExpirationDateBanner) {
            return new Initialized(dynamicDocumentType, data, status, currentDateTime, documentShortName, availableServices, bitmapsByFieldReference, showExpirationDateBanner);
        }

        public final List<DashboardServiceEntry> c() {
            return this.availableServices;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BitmapsByFieldReference getBitmapsByFieldReference() {
            return this.bitmapsByFieldReference;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final DynamicDocumentData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.dynamicDocumentType == initialized.dynamicDocumentType && fr.t.c(this.data, initialized.data) && this.status == initialized.status && fr.t.c(this.currentDateTime, initialized.currentDateTime) && fr.t.c(this.documentShortName, initialized.documentShortName) && fr.t.c(this.availableServices, initialized.availableServices) && fr.t.c(this.bitmapsByFieldReference, initialized.bitmapsByFieldReference) && this.showExpirationDateBanner == initialized.showExpirationDateBanner;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDocumentShortName() {
            return this.documentShortName;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final rq0.b.EnumC4479b getDynamicDocumentType() {
            return this.dynamicDocumentType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getShowExpirationDateBanner() {
            return this.showExpirationDateBanner;
        }

        public int hashCode() {
            int iHashCode = ((((((this.dynamicDocumentType.hashCode() * 31) + this.data.hashCode()) * 31) + this.status.hashCode()) * 31) + this.currentDateTime.hashCode()) * 31;
            String str = this.documentShortName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<DashboardServiceEntry> list = this.availableServices;
            return ((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.bitmapsByFieldReference.hashCode()) * 31) + Boolean.hashCode(this.showExpirationDateBanner);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final mv1.b getStatus() {
            return this.status;
        }

        public String toString() {
            return "Initialized(dynamicDocumentType=" + this.dynamicDocumentType + ", data=" + this.data + ", status=" + this.status + ", currentDateTime=" + this.currentDateTime + ", documentShortName=" + this.documentShortName + ", availableServices=" + this.availableServices + ", bitmapsByFieldReference=" + this.bitmapsByFieldReference + ", showExpirationDateBanner=" + this.showExpirationDateBanner + ')';
        }

        public /* synthetic */ Initialized(rq0.b.EnumC4479b enumC4479b, DynamicDocumentData dynamicDocumentData, mv1.b bVar, OffsetDateTime offsetDateTime, String str, List list, BitmapsByFieldReference bitmapsByFieldReference, boolean z15, int i15, fr.k kVar) {
            this(enumC4479b, dynamicDocumentData, bVar, offsetDateTime, str, list, bitmapsByFieldReference, (i15 & 128) != 0 ? true : z15);
        }
    }
}
