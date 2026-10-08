package yu2;

import p071kotlin.Metadata;
import vu2.PeselVerificationInputData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\u000eB9\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lyu2/n;", "", "Lvu2/a;", "citizenPeselNumberInputData", "citizenIdNumberInputData", "nonCitizenPeselNumberInputData", "nonCitizenIdNumberInputData", "reasonInputData", "Lbv2/a;", "selectedRadioButtonId", "<init>", "(Lvu2/a;Lvu2/a;Lvu2/a;Lvu2/a;Lvu2/a;Lbv2/a;)V", "a", "Lvu2/a;", "b", "()Lvu2/a;", "c", "d", "e", "f", "Lbv2/a;", "()Lbv2/a;", "Lyu2/n$a;", "Lyu2/n$b;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PeselVerificationInputData citizenPeselNumberInputData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PeselVerificationInputData citizenIdNumberInputData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PeselVerificationInputData nonCitizenPeselNumberInputData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PeselVerificationInputData nonCitizenIdNumberInputData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final PeselVerificationInputData reasonInputData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bv2.a selectedRadioButtonId;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyu2/n$a;", "Lyu2/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends n {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f229640g = new a();

        private a() {
            super(new PeselVerificationInputData(null, null, 3, null), new PeselVerificationInputData(null, null, 3, null), new PeselVerificationInputData(null, null, 3, null), new PeselVerificationInputData(null, null, 3, null), new PeselVerificationInputData(null, null, 3, null), bv2.a.POLISH_CITIZENSHIP, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 450240907;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: yu2.n$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJL\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lyu2/n$b;", "Lyu2/n;", "Lvu2/a;", "citizenPeselNumberInputData", "citizenIdNumberInputData", "nonCitizenPeselNumberInputData", "nonCitizenIdNumberInputData", "reasonInputData", "Lbv2/a;", "selectedRadioButtonId", "<init>", "(Lvu2/a;Lvu2/a;Lvu2/a;Lvu2/a;Lvu2/a;Lbv2/a;)V", "g", "(Lvu2/a;Lvu2/a;Lvu2/a;Lvu2/a;Lvu2/a;Lbv2/a;)Lyu2/n$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lvu2/a;", "b", "()Lvu2/a;", "h", "a", "i", "d", "j", "c", "k", "e", "l", "Lbv2/a;", "f", "()Lbv2/a;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized extends n {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final PeselVerificationInputData citizenPeselNumberInputData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final PeselVerificationInputData citizenIdNumberInputData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final PeselVerificationInputData nonCitizenPeselNumberInputData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final PeselVerificationInputData nonCitizenIdNumberInputData;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final PeselVerificationInputData reasonInputData;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final bv2.a selectedRadioButtonId;

        public Initialized(PeselVerificationInputData peselVerificationInputData, PeselVerificationInputData peselVerificationInputData2, PeselVerificationInputData peselVerificationInputData3, PeselVerificationInputData peselVerificationInputData4, PeselVerificationInputData peselVerificationInputData5, bv2.a aVar) {
            super(peselVerificationInputData, peselVerificationInputData2, peselVerificationInputData3, peselVerificationInputData4, peselVerificationInputData5, aVar, null);
            this.citizenPeselNumberInputData = peselVerificationInputData;
            this.citizenIdNumberInputData = peselVerificationInputData2;
            this.nonCitizenPeselNumberInputData = peselVerificationInputData3;
            this.nonCitizenIdNumberInputData = peselVerificationInputData4;
            this.reasonInputData = peselVerificationInputData5;
            this.selectedRadioButtonId = aVar;
        }

        public static /* synthetic */ Initialized h(Initialized initialized, PeselVerificationInputData peselVerificationInputData, PeselVerificationInputData peselVerificationInputData2, PeselVerificationInputData peselVerificationInputData3, PeselVerificationInputData peselVerificationInputData4, PeselVerificationInputData peselVerificationInputData5, bv2.a aVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                peselVerificationInputData = initialized.citizenPeselNumberInputData;
            }
            if ((i15 & 2) != 0) {
                peselVerificationInputData2 = initialized.citizenIdNumberInputData;
            }
            if ((i15 & 4) != 0) {
                peselVerificationInputData3 = initialized.nonCitizenPeselNumberInputData;
            }
            if ((i15 & 8) != 0) {
                peselVerificationInputData4 = initialized.nonCitizenIdNumberInputData;
            }
            if ((i15 & 16) != 0) {
                peselVerificationInputData5 = initialized.reasonInputData;
            }
            if ((i15 & 32) != 0) {
                aVar = initialized.selectedRadioButtonId;
            }
            PeselVerificationInputData peselVerificationInputData6 = peselVerificationInputData5;
            bv2.a aVar2 = aVar;
            return initialized.g(peselVerificationInputData, peselVerificationInputData2, peselVerificationInputData3, peselVerificationInputData4, peselVerificationInputData6, aVar2);
        }

        @Override // yu2.n
        /* JADX INFO: renamed from: a, reason: from getter */
        public PeselVerificationInputData getCitizenIdNumberInputData() {
            return this.citizenIdNumberInputData;
        }

        @Override // yu2.n
        /* JADX INFO: renamed from: b, reason: from getter */
        public PeselVerificationInputData getCitizenPeselNumberInputData() {
            return this.citizenPeselNumberInputData;
        }

        @Override // yu2.n
        /* JADX INFO: renamed from: c, reason: from getter */
        public PeselVerificationInputData getNonCitizenIdNumberInputData() {
            return this.nonCitizenIdNumberInputData;
        }

        @Override // yu2.n
        /* JADX INFO: renamed from: d, reason: from getter */
        public PeselVerificationInputData getNonCitizenPeselNumberInputData() {
            return this.nonCitizenPeselNumberInputData;
        }

        @Override // yu2.n
        /* JADX INFO: renamed from: e, reason: from getter */
        public PeselVerificationInputData getReasonInputData() {
            return this.reasonInputData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.citizenPeselNumberInputData, initialized.citizenPeselNumberInputData) && fr.t.c(this.citizenIdNumberInputData, initialized.citizenIdNumberInputData) && fr.t.c(this.nonCitizenPeselNumberInputData, initialized.nonCitizenPeselNumberInputData) && fr.t.c(this.nonCitizenIdNumberInputData, initialized.nonCitizenIdNumberInputData) && fr.t.c(this.reasonInputData, initialized.reasonInputData) && this.selectedRadioButtonId == initialized.selectedRadioButtonId;
        }

        @Override // yu2.n
        /* JADX INFO: renamed from: f, reason: from getter */
        public bv2.a getSelectedRadioButtonId() {
            return this.selectedRadioButtonId;
        }

        public final Initialized g(PeselVerificationInputData citizenPeselNumberInputData, PeselVerificationInputData citizenIdNumberInputData, PeselVerificationInputData nonCitizenPeselNumberInputData, PeselVerificationInputData nonCitizenIdNumberInputData, PeselVerificationInputData reasonInputData, bv2.a selectedRadioButtonId) {
            return new Initialized(citizenPeselNumberInputData, citizenIdNumberInputData, nonCitizenPeselNumberInputData, nonCitizenIdNumberInputData, reasonInputData, selectedRadioButtonId);
        }

        public int hashCode() {
            return (((((((((this.citizenPeselNumberInputData.hashCode() * 31) + this.citizenIdNumberInputData.hashCode()) * 31) + this.nonCitizenPeselNumberInputData.hashCode()) * 31) + this.nonCitizenIdNumberInputData.hashCode()) * 31) + this.reasonInputData.hashCode()) * 31) + this.selectedRadioButtonId.hashCode();
        }

        public String toString() {
            return "Initialized(citizenPeselNumberInputData=" + this.citizenPeselNumberInputData + ", citizenIdNumberInputData=" + this.citizenIdNumberInputData + ", nonCitizenPeselNumberInputData=" + this.nonCitizenPeselNumberInputData + ", nonCitizenIdNumberInputData=" + this.nonCitizenIdNumberInputData + ", reasonInputData=" + this.reasonInputData + ", selectedRadioButtonId=" + this.selectedRadioButtonId + ')';
        }
    }

    public /* synthetic */ n(PeselVerificationInputData peselVerificationInputData, PeselVerificationInputData peselVerificationInputData2, PeselVerificationInputData peselVerificationInputData3, PeselVerificationInputData peselVerificationInputData4, PeselVerificationInputData peselVerificationInputData5, bv2.a aVar, fr.k kVar) {
        this(peselVerificationInputData, peselVerificationInputData2, peselVerificationInputData3, peselVerificationInputData4, peselVerificationInputData5, aVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public PeselVerificationInputData getCitizenIdNumberInputData() {
        return this.citizenIdNumberInputData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public PeselVerificationInputData getCitizenPeselNumberInputData() {
        return this.citizenPeselNumberInputData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public PeselVerificationInputData getNonCitizenIdNumberInputData() {
        return this.nonCitizenIdNumberInputData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public PeselVerificationInputData getNonCitizenPeselNumberInputData() {
        return this.nonCitizenPeselNumberInputData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public PeselVerificationInputData getReasonInputData() {
        return this.reasonInputData;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public bv2.a getSelectedRadioButtonId() {
        return this.selectedRadioButtonId;
    }

    private n(PeselVerificationInputData peselVerificationInputData, PeselVerificationInputData peselVerificationInputData2, PeselVerificationInputData peselVerificationInputData3, PeselVerificationInputData peselVerificationInputData4, PeselVerificationInputData peselVerificationInputData5, bv2.a aVar) {
        this.citizenPeselNumberInputData = peselVerificationInputData;
        this.citizenIdNumberInputData = peselVerificationInputData2;
        this.nonCitizenPeselNumberInputData = peselVerificationInputData3;
        this.nonCitizenIdNumberInputData = peselVerificationInputData4;
        this.reasonInputData = peselVerificationInputData5;
        this.selectedRadioButtonId = aVar;
    }
}
