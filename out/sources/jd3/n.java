package jd3;

import hd3.RailwayCardData;
import hd3.RailwayCardFullData;
import java.time.OffsetDateTime;
import ld3.UutCardBottomSheetData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ljd3/n;", "", "b", "a", "c", "Ljd3/n$a;", "Ljd3/n$b;", "Ljd3/n$c;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljd3/n$b;", "Ljd3/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f102094a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 1246884552;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: jd3.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jn\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b)\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b'\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b2\u00108\u001a\u0004\b-\u0010\u0018¨\u00069"}, d2 = {"Ljd3/n$a;", "Ljd3/n;", "Lhd3/f;", "uutCardData", "Lhd3/e;", "ownCard", "selectedCard", "Ly30/n$b$b;", "selectedItem", "Ljava/time/OffsetDateTime;", "currentDateTime", "", "showExpirationDateBanner", "Lg30/v;", "bottomSheetValue", "Lld3/a;", "bottomSheetContentData", "", "documentShortName", "<init>", "(Lhd3/f;Lhd3/e;Lhd3/e;Ly30/n$b$b;Ljava/time/OffsetDateTime;ZLg30/v;Lld3/a;Ljava/lang/String;)V", "a", "(Lhd3/f;Lhd3/e;Lhd3/e;Ly30/n$b$b;Ljava/time/OffsetDateTime;ZLg30/v;Lld3/a;Ljava/lang/String;)Ljd3/n$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lhd3/f;", "j", "()Lhd3/f;", "b", "Lhd3/e;", "f", "()Lhd3/e;", "c", "g", "d", "Ly30/n$b$b;", "h", "()Ly30/n$b$b;", "e", "Ljava/time/OffsetDateTime;", "getCurrentDateTime", "()Ljava/time/OffsetDateTime;", "Z", "i", "()Z", "Lg30/v;", "()Lg30/v;", "Lld3/a;", "()Lld3/a;", "Ljava/lang/String;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataLoaded implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final RailwayCardFullData uutCardData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final RailwayCardData ownCard;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final RailwayCardData selectedCard;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final y30.n.Switch.EnumC5973b selectedItem;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime currentDateTime;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showExpirationDateBanner;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final g30.v bottomSheetValue;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final UutCardBottomSheetData bottomSheetContentData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentShortName;

        public DataLoaded(RailwayCardFullData railwayCardFullData, RailwayCardData railwayCardData, RailwayCardData railwayCardData2, y30.n.Switch.EnumC5973b enumC5973b, OffsetDateTime offsetDateTime, boolean z15, g30.v vVar, UutCardBottomSheetData uutCardBottomSheetData, String str) {
            this.uutCardData = railwayCardFullData;
            this.ownCard = railwayCardData;
            this.selectedCard = railwayCardData2;
            this.selectedItem = enumC5973b;
            this.currentDateTime = offsetDateTime;
            this.showExpirationDateBanner = z15;
            this.bottomSheetValue = vVar;
            this.bottomSheetContentData = uutCardBottomSheetData;
            this.documentShortName = str;
        }

        public static /* synthetic */ DataLoaded b(DataLoaded dataLoaded, RailwayCardFullData railwayCardFullData, RailwayCardData railwayCardData, RailwayCardData railwayCardData2, y30.n.Switch.EnumC5973b enumC5973b, OffsetDateTime offsetDateTime, boolean z15, g30.v vVar, UutCardBottomSheetData uutCardBottomSheetData, String str, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                railwayCardFullData = dataLoaded.uutCardData;
            }
            if ((i15 & 2) != 0) {
                railwayCardData = dataLoaded.ownCard;
            }
            if ((i15 & 4) != 0) {
                railwayCardData2 = dataLoaded.selectedCard;
            }
            if ((i15 & 8) != 0) {
                enumC5973b = dataLoaded.selectedItem;
            }
            if ((i15 & 16) != 0) {
                offsetDateTime = dataLoaded.currentDateTime;
            }
            if ((i15 & 32) != 0) {
                z15 = dataLoaded.showExpirationDateBanner;
            }
            if ((i15 & 64) != 0) {
                vVar = dataLoaded.bottomSheetValue;
            }
            if ((i15 & 128) != 0) {
                uutCardBottomSheetData = dataLoaded.bottomSheetContentData;
            }
            if ((i15 & 256) != 0) {
                str = dataLoaded.documentShortName;
            }
            UutCardBottomSheetData uutCardBottomSheetData2 = uutCardBottomSheetData;
            String str2 = str;
            boolean z16 = z15;
            g30.v vVar2 = vVar;
            OffsetDateTime offsetDateTime2 = offsetDateTime;
            RailwayCardData railwayCardData3 = railwayCardData2;
            return dataLoaded.a(railwayCardFullData, railwayCardData, railwayCardData3, enumC5973b, offsetDateTime2, z16, vVar2, uutCardBottomSheetData2, str2);
        }

        public final DataLoaded a(RailwayCardFullData uutCardData, RailwayCardData ownCard, RailwayCardData selectedCard, y30.n.Switch.EnumC5973b selectedItem, OffsetDateTime currentDateTime, boolean showExpirationDateBanner, g30.v bottomSheetValue, UutCardBottomSheetData bottomSheetContentData, String documentShortName) {
            return new DataLoaded(uutCardData, ownCard, selectedCard, selectedItem, currentDateTime, showExpirationDateBanner, bottomSheetValue, bottomSheetContentData, documentShortName);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final UutCardBottomSheetData getBottomSheetContentData() {
            return this.bottomSheetContentData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final g30.v getBottomSheetValue() {
            return this.bottomSheetValue;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDocumentShortName() {
            return this.documentShortName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataLoaded)) {
                return false;
            }
            DataLoaded dataLoaded = (DataLoaded) other;
            return fr.t.c(this.uutCardData, dataLoaded.uutCardData) && fr.t.c(this.ownCard, dataLoaded.ownCard) && fr.t.c(this.selectedCard, dataLoaded.selectedCard) && this.selectedItem == dataLoaded.selectedItem && fr.t.c(this.currentDateTime, dataLoaded.currentDateTime) && this.showExpirationDateBanner == dataLoaded.showExpirationDateBanner && this.bottomSheetValue == dataLoaded.bottomSheetValue && fr.t.c(this.bottomSheetContentData, dataLoaded.bottomSheetContentData) && fr.t.c(this.documentShortName, dataLoaded.documentShortName);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final RailwayCardData getOwnCard() {
            return this.ownCard;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final RailwayCardData getSelectedCard() {
            return this.selectedCard;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final y30.n.Switch.EnumC5973b getSelectedItem() {
            return this.selectedItem;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.uutCardData.hashCode() * 31) + this.ownCard.hashCode()) * 31) + this.selectedCard.hashCode()) * 31) + this.selectedItem.hashCode()) * 31) + this.currentDateTime.hashCode()) * 31) + Boolean.hashCode(this.showExpirationDateBanner)) * 31) + this.bottomSheetValue.hashCode()) * 31;
            UutCardBottomSheetData uutCardBottomSheetData = this.bottomSheetContentData;
            int iHashCode2 = (iHashCode + (uutCardBottomSheetData == null ? 0 : uutCardBottomSheetData.hashCode())) * 31;
            String str = this.documentShortName;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getShowExpirationDateBanner() {
            return this.showExpirationDateBanner;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final RailwayCardFullData getUutCardData() {
            return this.uutCardData;
        }

        public String toString() {
            return "DataLoaded(uutCardData=" + this.uutCardData + ", ownCard=" + this.ownCard + ", selectedCard=" + this.selectedCard + ", selectedItem=" + this.selectedItem + ", currentDateTime=" + this.currentDateTime + ", showExpirationDateBanner=" + this.showExpirationDateBanner + ", bottomSheetValue=" + this.bottomSheetValue + ", bottomSheetContentData=" + this.bottomSheetContentData + ", documentShortName=" + this.documentShortName + ')';
        }

        public /* synthetic */ DataLoaded(RailwayCardFullData railwayCardFullData, RailwayCardData railwayCardData, RailwayCardData railwayCardData2, y30.n.Switch.EnumC5973b enumC5973b, OffsetDateTime offsetDateTime, boolean z15, g30.v vVar, UutCardBottomSheetData uutCardBottomSheetData, String str, int i15, fr.k kVar) {
            this(railwayCardFullData, railwayCardData, railwayCardData2, enumC5973b, offsetDateTime, (i15 & 32) != 0 ? true : z15, (i15 & 64) != 0 ? g30.v.HIDDEN : vVar, uutCardBottomSheetData, str);
        }
    }

    /* JADX INFO: renamed from: jd3.n$c, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0084\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b*\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b,\u00108\u001a\u0004\b(\u00109R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010!\u001a\u0004\b1\u0010\u0019¨\u0006:"}, d2 = {"Ljd3/n$c;", "Ljd3/n;", "", "documentParentId", "Lhd3/e;", "anotherOwnCard", "ownCard", "selectedCard", "Ly30/n$b$b;", "selectedItem", "Ljava/time/OffsetDateTime;", "currentDateTime", "", "showExpirationDateBannerPackageI", "showExpirationDateBannerPackageII", "Lg30/v;", "bottomSheetValue", "Lld3/a;", "bottomSheetContentData", "documentShortName", "<init>", "(Ljava/lang/String;Lhd3/e;Lhd3/e;Lhd3/e;Ly30/n$b$b;Ljava/time/OffsetDateTime;ZZLg30/v;Lld3/a;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Lhd3/e;Lhd3/e;Lhd3/e;Ly30/n$b$b;Ljava/time/OffsetDateTime;ZZLg30/v;Lld3/a;Ljava/lang/String;)Ljd3/n$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "Lhd3/e;", "c", "()Lhd3/e;", "h", "d", "i", "e", "Ly30/n$b$b;", "j", "()Ly30/n$b$b;", "Ljava/time/OffsetDateTime;", "getCurrentDateTime", "()Ljava/time/OffsetDateTime;", "g", "Z", "k", "()Z", "l", "Lg30/v;", "()Lg30/v;", "Lld3/a;", "()Lld3/a;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PackageDataLoaded implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentParentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final RailwayCardData anotherOwnCard;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final RailwayCardData ownCard;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final RailwayCardData selectedCard;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final y30.n.Switch.EnumC5973b selectedItem;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime currentDateTime;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showExpirationDateBannerPackageI;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showExpirationDateBannerPackageII;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final g30.v bottomSheetValue;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final UutCardBottomSheetData bottomSheetContentData;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentShortName;

        public PackageDataLoaded(String str, RailwayCardData railwayCardData, RailwayCardData railwayCardData2, RailwayCardData railwayCardData3, y30.n.Switch.EnumC5973b enumC5973b, OffsetDateTime offsetDateTime, boolean z15, boolean z16, g30.v vVar, UutCardBottomSheetData uutCardBottomSheetData, String str2) {
            this.documentParentId = str;
            this.anotherOwnCard = railwayCardData;
            this.ownCard = railwayCardData2;
            this.selectedCard = railwayCardData3;
            this.selectedItem = enumC5973b;
            this.currentDateTime = offsetDateTime;
            this.showExpirationDateBannerPackageI = z15;
            this.showExpirationDateBannerPackageII = z16;
            this.bottomSheetValue = vVar;
            this.bottomSheetContentData = uutCardBottomSheetData;
            this.documentShortName = str2;
        }

        public static /* synthetic */ PackageDataLoaded b(PackageDataLoaded packageDataLoaded, String str, RailwayCardData railwayCardData, RailwayCardData railwayCardData2, RailwayCardData railwayCardData3, y30.n.Switch.EnumC5973b enumC5973b, OffsetDateTime offsetDateTime, boolean z15, boolean z16, g30.v vVar, UutCardBottomSheetData uutCardBottomSheetData, String str2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = packageDataLoaded.documentParentId;
            }
            if ((i15 & 2) != 0) {
                railwayCardData = packageDataLoaded.anotherOwnCard;
            }
            if ((i15 & 4) != 0) {
                railwayCardData2 = packageDataLoaded.ownCard;
            }
            if ((i15 & 8) != 0) {
                railwayCardData3 = packageDataLoaded.selectedCard;
            }
            if ((i15 & 16) != 0) {
                enumC5973b = packageDataLoaded.selectedItem;
            }
            if ((i15 & 32) != 0) {
                offsetDateTime = packageDataLoaded.currentDateTime;
            }
            if ((i15 & 64) != 0) {
                z15 = packageDataLoaded.showExpirationDateBannerPackageI;
            }
            if ((i15 & 128) != 0) {
                z16 = packageDataLoaded.showExpirationDateBannerPackageII;
            }
            if ((i15 & 256) != 0) {
                vVar = packageDataLoaded.bottomSheetValue;
            }
            if ((i15 & 512) != 0) {
                uutCardBottomSheetData = packageDataLoaded.bottomSheetContentData;
            }
            if ((i15 & 1024) != 0) {
                str2 = packageDataLoaded.documentShortName;
            }
            UutCardBottomSheetData uutCardBottomSheetData2 = uutCardBottomSheetData;
            String str3 = str2;
            boolean z17 = z16;
            g30.v vVar2 = vVar;
            OffsetDateTime offsetDateTime2 = offsetDateTime;
            boolean z18 = z15;
            y30.n.Switch.EnumC5973b enumC5973b2 = enumC5973b;
            RailwayCardData railwayCardData4 = railwayCardData2;
            return packageDataLoaded.a(str, railwayCardData, railwayCardData4, railwayCardData3, enumC5973b2, offsetDateTime2, z18, z17, vVar2, uutCardBottomSheetData2, str3);
        }

        public final PackageDataLoaded a(String documentParentId, RailwayCardData anotherOwnCard, RailwayCardData ownCard, RailwayCardData selectedCard, y30.n.Switch.EnumC5973b selectedItem, OffsetDateTime currentDateTime, boolean showExpirationDateBannerPackageI, boolean showExpirationDateBannerPackageII, g30.v bottomSheetValue, UutCardBottomSheetData bottomSheetContentData, String documentShortName) {
            return new PackageDataLoaded(documentParentId, anotherOwnCard, ownCard, selectedCard, selectedItem, currentDateTime, showExpirationDateBannerPackageI, showExpirationDateBannerPackageII, bottomSheetValue, bottomSheetContentData, documentShortName);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final RailwayCardData getAnotherOwnCard() {
            return this.anotherOwnCard;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final UutCardBottomSheetData getBottomSheetContentData() {
            return this.bottomSheetContentData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final g30.v getBottomSheetValue() {
            return this.bottomSheetValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageDataLoaded)) {
                return false;
            }
            PackageDataLoaded packageDataLoaded = (PackageDataLoaded) other;
            return fr.t.c(this.documentParentId, packageDataLoaded.documentParentId) && fr.t.c(this.anotherOwnCard, packageDataLoaded.anotherOwnCard) && fr.t.c(this.ownCard, packageDataLoaded.ownCard) && fr.t.c(this.selectedCard, packageDataLoaded.selectedCard) && this.selectedItem == packageDataLoaded.selectedItem && fr.t.c(this.currentDateTime, packageDataLoaded.currentDateTime) && this.showExpirationDateBannerPackageI == packageDataLoaded.showExpirationDateBannerPackageI && this.showExpirationDateBannerPackageII == packageDataLoaded.showExpirationDateBannerPackageII && this.bottomSheetValue == packageDataLoaded.bottomSheetValue && fr.t.c(this.bottomSheetContentData, packageDataLoaded.bottomSheetContentData) && fr.t.c(this.documentShortName, packageDataLoaded.documentShortName);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDocumentParentId() {
            return this.documentParentId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getDocumentShortName() {
            return this.documentShortName;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final RailwayCardData getOwnCard() {
            return this.ownCard;
        }

        public int hashCode() {
            String str = this.documentParentId;
            int iHashCode = (((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.anotherOwnCard.hashCode()) * 31) + this.ownCard.hashCode()) * 31) + this.selectedCard.hashCode()) * 31) + this.selectedItem.hashCode()) * 31) + this.currentDateTime.hashCode()) * 31) + Boolean.hashCode(this.showExpirationDateBannerPackageI)) * 31) + Boolean.hashCode(this.showExpirationDateBannerPackageII)) * 31) + this.bottomSheetValue.hashCode()) * 31;
            UutCardBottomSheetData uutCardBottomSheetData = this.bottomSheetContentData;
            int iHashCode2 = (iHashCode + (uutCardBottomSheetData == null ? 0 : uutCardBottomSheetData.hashCode())) * 31;
            String str2 = this.documentShortName;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final RailwayCardData getSelectedCard() {
            return this.selectedCard;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final y30.n.Switch.EnumC5973b getSelectedItem() {
            return this.selectedItem;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getShowExpirationDateBannerPackageI() {
            return this.showExpirationDateBannerPackageI;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getShowExpirationDateBannerPackageII() {
            return this.showExpirationDateBannerPackageII;
        }

        public String toString() {
            return "PackageDataLoaded(documentParentId=" + this.documentParentId + ", anotherOwnCard=" + this.anotherOwnCard + ", ownCard=" + this.ownCard + ", selectedCard=" + this.selectedCard + ", selectedItem=" + this.selectedItem + ", currentDateTime=" + this.currentDateTime + ", showExpirationDateBannerPackageI=" + this.showExpirationDateBannerPackageI + ", showExpirationDateBannerPackageII=" + this.showExpirationDateBannerPackageII + ", bottomSheetValue=" + this.bottomSheetValue + ", bottomSheetContentData=" + this.bottomSheetContentData + ", documentShortName=" + this.documentShortName + ')';
        }

        public /* synthetic */ PackageDataLoaded(String str, RailwayCardData railwayCardData, RailwayCardData railwayCardData2, RailwayCardData railwayCardData3, y30.n.Switch.EnumC5973b enumC5973b, OffsetDateTime offsetDateTime, boolean z15, boolean z16, g30.v vVar, UutCardBottomSheetData uutCardBottomSheetData, String str2, int i15, fr.k kVar) {
            this(str, railwayCardData, railwayCardData2, railwayCardData3, enumC5973b, offsetDateTime, (i15 & 64) != 0 ? true : z15, (i15 & 128) != 0 ? true : z16, (i15 & 256) != 0 ? g30.v.HIDDEN : vVar, uutCardBottomSheetData, str2);
        }
    }
}
