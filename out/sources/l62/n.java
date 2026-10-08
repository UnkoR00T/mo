package l62;

import android.graphics.Bitmap;
import j62.FamilyCardData;
import j62.FamilyCardFullData;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ll62/n;", "", "b", "a", "Ll62/n$a;", "Ll62/n$b;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll62/n$b;", "Ll62/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f116545a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 556392799;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: l62.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012Jn\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b'\u0010\u0016R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b%\u00101¨\u00062"}, d2 = {"Ll62/n$a;", "Ll62/n;", "Lj62/f;", "familyCardData", "Lj62/e;", "ownCard", "selectedCard", "Ly30/n$b$b;", "selectedItem", "", "showExpirationDateBanner", "isBottomSheetVisible", "", "documentShortName", "", "Landroid/graphics/Bitmap;", "cardNumberQrBitmaps", "<init>", "(Lj62/f;Lj62/e;Lj62/e;Ly30/n$b$b;ZZLjava/lang/String;Ljava/util/Map;)V", "a", "(Lj62/f;Lj62/e;Lj62/e;Ly30/n$b$b;ZZLjava/lang/String;Ljava/util/Map;)Ll62/n$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lj62/f;", "e", "()Lj62/f;", "b", "Lj62/e;", "f", "()Lj62/e;", "c", "g", "d", "Ly30/n$b$b;", "h", "()Ly30/n$b$b;", "Z", "i", "()Z", "j", "Ljava/lang/String;", "Ljava/util/Map;", "()Ljava/util/Map;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataLoaded implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FamilyCardFullData familyCardData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FamilyCardData ownCard;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FamilyCardData selectedCard;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final y30.n.Switch.EnumC5973b selectedItem;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showExpirationDateBanner;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isBottomSheetVisible;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentShortName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, Bitmap> cardNumberQrBitmaps;

        public DataLoaded(FamilyCardFullData familyCardFullData, FamilyCardData familyCardData, FamilyCardData familyCardData2, y30.n.Switch.EnumC5973b enumC5973b, boolean z15, boolean z16, String str, Map<String, Bitmap> map) {
            this.familyCardData = familyCardFullData;
            this.ownCard = familyCardData;
            this.selectedCard = familyCardData2;
            this.selectedItem = enumC5973b;
            this.showExpirationDateBanner = z15;
            this.isBottomSheetVisible = z16;
            this.documentShortName = str;
            this.cardNumberQrBitmaps = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DataLoaded b(DataLoaded dataLoaded, FamilyCardFullData familyCardFullData, FamilyCardData familyCardData, FamilyCardData familyCardData2, y30.n.Switch.EnumC5973b enumC5973b, boolean z15, boolean z16, String str, Map map, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                familyCardFullData = dataLoaded.familyCardData;
            }
            if ((i15 & 2) != 0) {
                familyCardData = dataLoaded.ownCard;
            }
            if ((i15 & 4) != 0) {
                familyCardData2 = dataLoaded.selectedCard;
            }
            if ((i15 & 8) != 0) {
                enumC5973b = dataLoaded.selectedItem;
            }
            if ((i15 & 16) != 0) {
                z15 = dataLoaded.showExpirationDateBanner;
            }
            if ((i15 & 32) != 0) {
                z16 = dataLoaded.isBottomSheetVisible;
            }
            if ((i15 & 64) != 0) {
                str = dataLoaded.documentShortName;
            }
            if ((i15 & 128) != 0) {
                map = dataLoaded.cardNumberQrBitmaps;
            }
            String str2 = str;
            Map map2 = map;
            boolean z17 = z15;
            boolean z18 = z16;
            return dataLoaded.a(familyCardFullData, familyCardData, familyCardData2, enumC5973b, z17, z18, str2, map2);
        }

        public final DataLoaded a(FamilyCardFullData familyCardData, FamilyCardData ownCard, FamilyCardData selectedCard, y30.n.Switch.EnumC5973b selectedItem, boolean showExpirationDateBanner, boolean isBottomSheetVisible, String documentShortName, Map<String, Bitmap> cardNumberQrBitmaps) {
            return new DataLoaded(familyCardData, ownCard, selectedCard, selectedItem, showExpirationDateBanner, isBottomSheetVisible, documentShortName, cardNumberQrBitmaps);
        }

        public final Map<String, Bitmap> c() {
            return this.cardNumberQrBitmaps;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDocumentShortName() {
            return this.documentShortName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final FamilyCardFullData getFamilyCardData() {
            return this.familyCardData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataLoaded)) {
                return false;
            }
            DataLoaded dataLoaded = (DataLoaded) other;
            return fr.t.c(this.familyCardData, dataLoaded.familyCardData) && fr.t.c(this.ownCard, dataLoaded.ownCard) && fr.t.c(this.selectedCard, dataLoaded.selectedCard) && this.selectedItem == dataLoaded.selectedItem && this.showExpirationDateBanner == dataLoaded.showExpirationDateBanner && this.isBottomSheetVisible == dataLoaded.isBottomSheetVisible && fr.t.c(this.documentShortName, dataLoaded.documentShortName) && fr.t.c(this.cardNumberQrBitmaps, dataLoaded.cardNumberQrBitmaps);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final FamilyCardData getOwnCard() {
            return this.ownCard;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final FamilyCardData getSelectedCard() {
            return this.selectedCard;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final y30.n.Switch.EnumC5973b getSelectedItem() {
            return this.selectedItem;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.familyCardData.hashCode() * 31) + this.ownCard.hashCode()) * 31) + this.selectedCard.hashCode()) * 31) + this.selectedItem.hashCode()) * 31) + Boolean.hashCode(this.showExpirationDateBanner)) * 31) + Boolean.hashCode(this.isBottomSheetVisible)) * 31;
            String str = this.documentShortName;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cardNumberQrBitmaps.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getShowExpirationDateBanner() {
            return this.showExpirationDateBanner;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsBottomSheetVisible() {
            return this.isBottomSheetVisible;
        }

        public String toString() {
            return "DataLoaded(familyCardData=" + this.familyCardData + ", ownCard=" + this.ownCard + ", selectedCard=" + this.selectedCard + ", selectedItem=" + this.selectedItem + ", showExpirationDateBanner=" + this.showExpirationDateBanner + ", isBottomSheetVisible=" + this.isBottomSheetVisible + ", documentShortName=" + this.documentShortName + ", cardNumberQrBitmaps=" + this.cardNumberQrBitmaps + ')';
        }

        public /* synthetic */ DataLoaded(FamilyCardFullData familyCardFullData, FamilyCardData familyCardData, FamilyCardData familyCardData2, y30.n.Switch.EnumC5973b enumC5973b, boolean z15, boolean z16, String str, Map map, int i15, fr.k kVar) {
            this(familyCardFullData, familyCardData, familyCardData2, enumC5973b, (i15 & 16) != 0 ? true : z15, (i15 & 32) != 0 ? false : z16, str, map);
        }
    }
}
