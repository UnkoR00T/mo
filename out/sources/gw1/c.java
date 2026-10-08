package gw1;

import hv1.MultiDocumentSchema;
import iq0.DashboardServiceEntry;
import java.util.List;
import mv1.DynamicDocumentData;
import mv1.DynamicMultiDocumentFullData;
import o20.s2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wv1.BitmapsByFieldReference;
import wv1.DynamicDocumentBottomSheetData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lgw1/c;", "", "a", "c", "b", "Lgw1/c$a;", "Lgw1/c$b;", "Lgw1/c$c;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgw1/c$a;", "Lgw1/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f77890a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1116841382;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: gw1.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgw1/c$c;", "Lgw1/c;", "Lrq0/b$c;", "dynamicMultiDocumentType", "<init>", "(Lrq0/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b$c;", "()Lrq0/b$c;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.c dynamicMultiDocumentType;

        public Loading(rq0.b.c cVar) {
            this.dynamicMultiDocumentType = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final rq0.b.c getDynamicMultiDocumentType() {
            return this.dynamicMultiDocumentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.dynamicMultiDocumentType == ((Loading) other).dynamicMultiDocumentType;
        }

        public int hashCode() {
            return this.dynamicMultiDocumentType.hashCode();
        }

        public String toString() {
            return "Loading(dynamicMultiDocumentType=" + this.dynamicMultiDocumentType + ')';
        }
    }

    /* JADX INFO: renamed from: gw1.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ¨\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b2\u00103R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b5\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b2\u0010C\u001a\u0004\b:\u0010DR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b+\u0010E\u001a\u0004\b6\u0010FR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bB\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b?\u0010J\u001a\u0004\bA\u0010!R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b<\u0010K\u001a\u0004\b4\u0010L¨\u0006M"}, d2 = {"Lgw1/c$b;", "Lgw1/c;", "Lrq0/b$c;", "dynamicMultiDocumentType", "", "Liq0/p;", "availableServices", "Lmv1/d;", "documents", "Lmv1/c;", "currentlyPickedDocuments", "Lgw1/a;", "openedTab", "Lhv1/a;", "multiDocumentSchema", "Liy/b0;", "mainDocumentPhoto", "mainDocumentPesel", "Lg30/v;", "bottomSheetValue", "Lwv1/b;", "bottomSheetContentData", "Lo20/s2;", "documentVMS", "", "documentShortName", "Lwv1/a;", "bitmapsByFieldReference", "<init>", "(Lrq0/b$c;Ljava/util/List;Lmv1/d;Ljava/util/List;Lgw1/a;Lhv1/a;Liy/b0;Liy/b0;Lg30/v;Lwv1/b;Lo20/s2;Ljava/lang/String;Lwv1/a;)V", "a", "(Lrq0/b$c;Ljava/util/List;Lmv1/d;Ljava/util/List;Lgw1/a;Lhv1/a;Liy/b0;Liy/b0;Lg30/v;Lwv1/b;Lo20/s2;Ljava/lang/String;Lwv1/a;)Lgw1/c$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrq0/b$c;", "j", "()Lrq0/b$c;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lmv1/d;", "i", "()Lmv1/d;", "d", "g", "e", "Lgw1/a;", "n", "()Lgw1/a;", "f", "Lhv1/a;", "m", "()Lhv1/a;", "Liy/b0;", "l", "()Liy/b0;", "h", "k", "Lg30/v;", "()Lg30/v;", "Lwv1/b;", "()Lwv1/b;", "Lo20/s2;", "getDocumentVMS", "()Lo20/s2;", "Ljava/lang/String;", "Lwv1/a;", "()Lwv1/a;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.c dynamicMultiDocumentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DashboardServiceEntry> availableServices;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DynamicMultiDocumentFullData documents;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DynamicDocumentData> currentlyPickedDocuments;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final gw1.a openedTab;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final MultiDocumentSchema multiDocumentSchema;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 mainDocumentPhoto;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 mainDocumentPesel;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final g30.v bottomSheetValue;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final DynamicDocumentBottomSheetData bottomSheetContentData;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentShortName;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final BitmapsByFieldReference bitmapsByFieldReference;

        public Initialized(rq0.b.c cVar, List<DashboardServiceEntry> list, DynamicMultiDocumentFullData dynamicMultiDocumentFullData, List<DynamicDocumentData> list2, gw1.a aVar, MultiDocumentSchema multiDocumentSchema, iy.b0 b0Var, iy.b0 b0Var2, g30.v vVar, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData, s2 s2Var, String str, BitmapsByFieldReference bitmapsByFieldReference) {
            this.dynamicMultiDocumentType = cVar;
            this.availableServices = list;
            this.documents = dynamicMultiDocumentFullData;
            this.currentlyPickedDocuments = list2;
            this.openedTab = aVar;
            this.multiDocumentSchema = multiDocumentSchema;
            this.mainDocumentPhoto = b0Var;
            this.mainDocumentPesel = b0Var2;
            this.bottomSheetValue = vVar;
            this.bottomSheetContentData = dynamicDocumentBottomSheetData;
            this.documentVMS = s2Var;
            this.documentShortName = str;
            this.bitmapsByFieldReference = bitmapsByFieldReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, rq0.b.c cVar, List list, DynamicMultiDocumentFullData dynamicMultiDocumentFullData, List list2, gw1.a aVar, MultiDocumentSchema multiDocumentSchema, iy.b0 b0Var, iy.b0 b0Var2, g30.v vVar, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData, s2 s2Var, String str, BitmapsByFieldReference bitmapsByFieldReference, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                cVar = initialized.dynamicMultiDocumentType;
            }
            return initialized.a(cVar, (i15 & 2) != 0 ? initialized.availableServices : list, (i15 & 4) != 0 ? initialized.documents : dynamicMultiDocumentFullData, (i15 & 8) != 0 ? initialized.currentlyPickedDocuments : list2, (i15 & 16) != 0 ? initialized.openedTab : aVar, (i15 & 32) != 0 ? initialized.multiDocumentSchema : multiDocumentSchema, (i15 & 64) != 0 ? initialized.mainDocumentPhoto : b0Var, (i15 & 128) != 0 ? initialized.mainDocumentPesel : b0Var2, (i15 & 256) != 0 ? initialized.bottomSheetValue : vVar, (i15 & 512) != 0 ? initialized.bottomSheetContentData : dynamicDocumentBottomSheetData, (i15 & 1024) != 0 ? initialized.documentVMS : s2Var, (i15 & 2048) != 0 ? initialized.documentShortName : str, (i15 & PKIFailureInfo.certConfirmed) != 0 ? initialized.bitmapsByFieldReference : bitmapsByFieldReference);
        }

        public final Initialized a(rq0.b.c dynamicMultiDocumentType, List<DashboardServiceEntry> availableServices, DynamicMultiDocumentFullData documents, List<DynamicDocumentData> currentlyPickedDocuments, gw1.a openedTab, MultiDocumentSchema multiDocumentSchema, iy.b0 mainDocumentPhoto, iy.b0 mainDocumentPesel, g30.v bottomSheetValue, DynamicDocumentBottomSheetData bottomSheetContentData, s2 documentVMS, String documentShortName, BitmapsByFieldReference bitmapsByFieldReference) {
            return new Initialized(dynamicMultiDocumentType, availableServices, documents, currentlyPickedDocuments, openedTab, multiDocumentSchema, mainDocumentPhoto, mainDocumentPesel, bottomSheetValue, bottomSheetContentData, documentVMS, documentShortName, bitmapsByFieldReference);
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
            return this.dynamicMultiDocumentType == initialized.dynamicMultiDocumentType && fr.t.c(this.availableServices, initialized.availableServices) && fr.t.c(this.documents, initialized.documents) && fr.t.c(this.currentlyPickedDocuments, initialized.currentlyPickedDocuments) && this.openedTab == initialized.openedTab && fr.t.c(this.multiDocumentSchema, initialized.multiDocumentSchema) && fr.t.c(this.mainDocumentPhoto, initialized.mainDocumentPhoto) && fr.t.c(this.mainDocumentPesel, initialized.mainDocumentPesel) && this.bottomSheetValue == initialized.bottomSheetValue && fr.t.c(this.bottomSheetContentData, initialized.bottomSheetContentData) && fr.t.c(this.documentVMS, initialized.documentVMS) && fr.t.c(this.documentShortName, initialized.documentShortName) && fr.t.c(this.bitmapsByFieldReference, initialized.bitmapsByFieldReference);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final g30.v getBottomSheetValue() {
            return this.bottomSheetValue;
        }

        public final List<DynamicDocumentData> g() {
            return this.currentlyPickedDocuments;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getDocumentShortName() {
            return this.documentShortName;
        }

        public int hashCode() {
            int iHashCode = this.dynamicMultiDocumentType.hashCode() * 31;
            List<DashboardServiceEntry> list = this.availableServices;
            int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.documents.hashCode()) * 31) + this.currentlyPickedDocuments.hashCode()) * 31;
            gw1.a aVar = this.openedTab;
            int iHashCode3 = (((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.multiDocumentSchema.hashCode()) * 31;
            iy.b0 b0Var = this.mainDocumentPhoto;
            int iHashCode4 = (((((iHashCode3 + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + this.mainDocumentPesel.hashCode()) * 31) + this.bottomSheetValue.hashCode()) * 31;
            DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData = this.bottomSheetContentData;
            int iHashCode5 = (((iHashCode4 + (dynamicDocumentBottomSheetData == null ? 0 : dynamicDocumentBottomSheetData.hashCode())) * 31) + this.documentVMS.hashCode()) * 31;
            String str = this.documentShortName;
            return ((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31) + this.bitmapsByFieldReference.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final DynamicMultiDocumentFullData getDocuments() {
            return this.documents;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final rq0.b.c getDynamicMultiDocumentType() {
            return this.dynamicMultiDocumentType;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final iy.b0 getMainDocumentPesel() {
            return this.mainDocumentPesel;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final iy.b0 getMainDocumentPhoto() {
            return this.mainDocumentPhoto;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final MultiDocumentSchema getMultiDocumentSchema() {
            return this.multiDocumentSchema;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final gw1.a getOpenedTab() {
            return this.openedTab;
        }

        public String toString() {
            return "Initialized(dynamicMultiDocumentType=" + this.dynamicMultiDocumentType + ", availableServices=" + this.availableServices + ", documents=" + this.documents + ", currentlyPickedDocuments=" + this.currentlyPickedDocuments + ", openedTab=" + this.openedTab + ", multiDocumentSchema=" + this.multiDocumentSchema + ", mainDocumentPhoto=" + this.mainDocumentPhoto + ", mainDocumentPesel=" + this.mainDocumentPesel + ", bottomSheetValue=" + this.bottomSheetValue + ", bottomSheetContentData=" + this.bottomSheetContentData + ", documentVMS=" + this.documentVMS + ", documentShortName=" + this.documentShortName + ", bitmapsByFieldReference=" + this.bitmapsByFieldReference + ')';
        }

        public /* synthetic */ Initialized(rq0.b.c cVar, List list, DynamicMultiDocumentFullData dynamicMultiDocumentFullData, List list2, gw1.a aVar, MultiDocumentSchema multiDocumentSchema, iy.b0 b0Var, iy.b0 b0Var2, g30.v vVar, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData, s2 s2Var, String str, BitmapsByFieldReference bitmapsByFieldReference, int i15, fr.k kVar) {
            this(cVar, list, dynamicMultiDocumentFullData, list2, aVar, multiDocumentSchema, b0Var, b0Var2, (i15 & 256) != 0 ? g30.v.HIDDEN : vVar, dynamicDocumentBottomSheetData, s2Var, str, bitmapsByFieldReference);
        }
    }
}
