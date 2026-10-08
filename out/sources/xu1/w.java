package xu1;

import android.graphics.Bitmap;
import iq0.DashboardServiceEntry;
import java.util.List;
import o20.s2;
import ou1.DrivingLicenceFullData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lxu1/w;", "", "<init>", "()V", "b", "a", "c", "Lxu1/w$a;", "Lxu1/w$b;", "Lxu1/w$c;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class w {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxu1/w$b;", "Lxu1/w;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f221420a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 1285533832;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxu1/w$c;", "Lxu1/w;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f221421a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 1206239295;
        }

        public String toString() {
            return "NoData";
        }
    }

    public /* synthetic */ w(fr.k kVar) {
        this();
    }

    private w() {
    }

    /* JADX INFO: renamed from: xu1.w$a, reason: from toString */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0094\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u00108\u001a\u0004\b;\u0010:R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010<\u001a\u0004\b3\u0010=R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b1\u0010>\u001a\u0004\b7\u0010?R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b&\u0010@\u001a\u0004\b,\u0010AR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b6\u0010B\u001a\u0004\b5\u0010\u001d¨\u0006C"}, d2 = {"Lxu1/w$a;", "Lxu1/w;", "Ly30/n$b$b;", "selectedType", "Lou1/g;", "drivingLicenceScopes", "Landroid/graphics/Bitmap;", "bitmap", "", "hasIDCard", "showInfoBanner", "showExpirationDateBanner", "Lou1/b;", "drivingLicenceStatus", "temporaryLicenceStatus", "Lxu1/w$a$a;", "bottomSheetState", "Lo20/s2;", "documentVMS", "", "Liq0/p;", "availableServices", "", "documentShortName", "<init>", "(Ly30/n$b$b;Lou1/g;Landroid/graphics/Bitmap;ZZZLou1/b;Lou1/b;Lxu1/w$a$a;Lo20/s2;Ljava/util/List;Ljava/lang/String;)V", "a", "(Ly30/n$b$b;Lou1/g;Landroid/graphics/Bitmap;ZZZLou1/b;Lou1/b;Lxu1/w$a$a;Lo20/s2;Ljava/util/List;Ljava/lang/String;)Lxu1/w$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ly30/n$b$b;", "k", "()Ly30/n$b$b;", "b", "Lou1/g;", "h", "()Lou1/g;", "c", "Landroid/graphics/Bitmap;", "d", "()Landroid/graphics/Bitmap;", "Z", "j", "()Z", "e", "m", "f", "l", "g", "Lou1/b;", "i", "()Lou1/b;", "n", "Lxu1/w$a$a;", "()Lxu1/w$a$a;", "Lo20/s2;", "()Lo20/s2;", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/String;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y30.n.Switch.EnumC5973b selectedType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DrivingLicenceFullData drivingLicenceScopes;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap bitmap;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasIDCard;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showInfoBanner;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showExpirationDateBanner;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final ou1.b drivingLicenceStatus;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ou1.b temporaryLicenceStatus;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5918a bottomSheetState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DashboardServiceEntry> availableServices;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentShortName;

        /* JADX INFO: renamed from: xu1.w$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lxu1/w$a$a;", "", "b", "a", "Lxu1/w$a$a$a;", "Lxu1/w$a$a$b;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC5918a {

            /* JADX INFO: renamed from: xu1.w$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxu1/w$a$a$a;", "Lxu1/w$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C5919a implements InterfaceC5918a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C5919a f221414a = new C5919a();

                private C5919a() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C5919a);
                }

                public int hashCode() {
                    return 2093383476;
                }

                public String toString() {
                    return "Collapsed";
                }
            }

            /* JADX INFO: renamed from: xu1.w$a$a$b */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lxu1/w$a$a$b;", "Lxu1/w$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public enum b implements InterfaceC5918a {
                TEMPORARY_DRIVING_LICENCE_VALIDITY,
                DIFFERENCES_BETWEEN_DIGITAL_AND_PHYSICAL,
                STATUS_CHANGE_INFO;


                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final /* synthetic */ wq.a f221419e = wq.b.a(b());
            }
        }

        public Initialized(y30.n.Switch.EnumC5973b enumC5973b, DrivingLicenceFullData drivingLicenceFullData, Bitmap bitmap, boolean z15, boolean z16, boolean z17, ou1.b bVar, ou1.b bVar2, InterfaceC5918a interfaceC5918a, s2 s2Var, List<DashboardServiceEntry> list, String str) {
            super(null);
            this.selectedType = enumC5973b;
            this.drivingLicenceScopes = drivingLicenceFullData;
            this.bitmap = bitmap;
            this.hasIDCard = z15;
            this.showInfoBanner = z16;
            this.showExpirationDateBanner = z17;
            this.drivingLicenceStatus = bVar;
            this.temporaryLicenceStatus = bVar2;
            this.bottomSheetState = interfaceC5918a;
            this.documentVMS = s2Var;
            this.availableServices = list;
            this.documentShortName = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, y30.n.Switch.EnumC5973b enumC5973b, DrivingLicenceFullData drivingLicenceFullData, Bitmap bitmap, boolean z15, boolean z16, boolean z17, ou1.b bVar, ou1.b bVar2, InterfaceC5918a interfaceC5918a, s2 s2Var, List list, String str, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                enumC5973b = initialized.selectedType;
            }
            if ((i15 & 2) != 0) {
                drivingLicenceFullData = initialized.drivingLicenceScopes;
            }
            if ((i15 & 4) != 0) {
                bitmap = initialized.bitmap;
            }
            if ((i15 & 8) != 0) {
                z15 = initialized.hasIDCard;
            }
            if ((i15 & 16) != 0) {
                z16 = initialized.showInfoBanner;
            }
            if ((i15 & 32) != 0) {
                z17 = initialized.showExpirationDateBanner;
            }
            if ((i15 & 64) != 0) {
                bVar = initialized.drivingLicenceStatus;
            }
            if ((i15 & 128) != 0) {
                bVar2 = initialized.temporaryLicenceStatus;
            }
            if ((i15 & 256) != 0) {
                interfaceC5918a = initialized.bottomSheetState;
            }
            if ((i15 & 512) != 0) {
                s2Var = initialized.documentVMS;
            }
            if ((i15 & 1024) != 0) {
                list = initialized.availableServices;
            }
            if ((i15 & 2048) != 0) {
                str = initialized.documentShortName;
            }
            List list2 = list;
            String str2 = str;
            InterfaceC5918a interfaceC5918a2 = interfaceC5918a;
            s2 s2Var2 = s2Var;
            ou1.b bVar3 = bVar;
            ou1.b bVar4 = bVar2;
            boolean z18 = z16;
            boolean z19 = z17;
            return initialized.a(enumC5973b, drivingLicenceFullData, bitmap, z15, z18, z19, bVar3, bVar4, interfaceC5918a2, s2Var2, list2, str2);
        }

        public final Initialized a(y30.n.Switch.EnumC5973b selectedType, DrivingLicenceFullData drivingLicenceScopes, Bitmap bitmap, boolean hasIDCard, boolean showInfoBanner, boolean showExpirationDateBanner, ou1.b drivingLicenceStatus, ou1.b temporaryLicenceStatus, InterfaceC5918a bottomSheetState, s2 documentVMS, List<DashboardServiceEntry> availableServices, String documentShortName) {
            return new Initialized(selectedType, drivingLicenceScopes, bitmap, hasIDCard, showInfoBanner, showExpirationDateBanner, drivingLicenceStatus, temporaryLicenceStatus, bottomSheetState, documentVMS, availableServices, documentShortName);
        }

        public final List<DashboardServiceEntry> c() {
            return this.availableServices;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC5918a getBottomSheetState() {
            return this.bottomSheetState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.selectedType == initialized.selectedType && fr.t.c(this.drivingLicenceScopes, initialized.drivingLicenceScopes) && fr.t.c(this.bitmap, initialized.bitmap) && this.hasIDCard == initialized.hasIDCard && this.showInfoBanner == initialized.showInfoBanner && this.showExpirationDateBanner == initialized.showExpirationDateBanner && this.drivingLicenceStatus == initialized.drivingLicenceStatus && this.temporaryLicenceStatus == initialized.temporaryLicenceStatus && fr.t.c(this.bottomSheetState, initialized.bottomSheetState) && fr.t.c(this.documentVMS, initialized.documentVMS) && fr.t.c(this.availableServices, initialized.availableServices) && fr.t.c(this.documentShortName, initialized.documentShortName);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDocumentShortName() {
            return this.documentShortName;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final DrivingLicenceFullData getDrivingLicenceScopes() {
            return this.drivingLicenceScopes;
        }

        public int hashCode() {
            int iHashCode = ((this.selectedType.hashCode() * 31) + this.drivingLicenceScopes.hashCode()) * 31;
            Bitmap bitmap = this.bitmap;
            int iHashCode2 = (((((((((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Boolean.hashCode(this.hasIDCard)) * 31) + Boolean.hashCode(this.showInfoBanner)) * 31) + Boolean.hashCode(this.showExpirationDateBanner)) * 31) + this.drivingLicenceStatus.hashCode()) * 31) + this.temporaryLicenceStatus.hashCode()) * 31) + this.bottomSheetState.hashCode()) * 31) + this.documentVMS.hashCode()) * 31;
            List<DashboardServiceEntry> list = this.availableServices;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.documentShortName;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ou1.b getDrivingLicenceStatus() {
            return this.drivingLicenceStatus;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getHasIDCard() {
            return this.hasIDCard;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final y30.n.Switch.EnumC5973b getSelectedType() {
            return this.selectedType;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getShowExpirationDateBanner() {
            return this.showExpirationDateBanner;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getShowInfoBanner() {
            return this.showInfoBanner;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final ou1.b getTemporaryLicenceStatus() {
            return this.temporaryLicenceStatus;
        }

        public String toString() {
            return "Initialized(selectedType=" + this.selectedType + ", drivingLicenceScopes=" + this.drivingLicenceScopes + ", bitmap=" + this.bitmap + ", hasIDCard=" + this.hasIDCard + ", showInfoBanner=" + this.showInfoBanner + ", showExpirationDateBanner=" + this.showExpirationDateBanner + ", drivingLicenceStatus=" + this.drivingLicenceStatus + ", temporaryLicenceStatus=" + this.temporaryLicenceStatus + ", bottomSheetState=" + this.bottomSheetState + ", documentVMS=" + this.documentVMS + ", availableServices=" + this.availableServices + ", documentShortName=" + this.documentShortName + ')';
        }

        public /* synthetic */ Initialized(y30.n.Switch.EnumC5973b enumC5973b, DrivingLicenceFullData drivingLicenceFullData, Bitmap bitmap, boolean z15, boolean z16, boolean z17, ou1.b bVar, ou1.b bVar2, InterfaceC5918a interfaceC5918a, s2 s2Var, List list, String str, int i15, fr.k kVar) {
            this(enumC5973b, drivingLicenceFullData, bitmap, z15, z16, (i15 & 32) != 0 ? true : z17, bVar, bVar2, interfaceC5918a, s2Var, list, str);
        }
    }
}
