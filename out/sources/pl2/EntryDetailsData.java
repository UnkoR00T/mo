package pl2;

import fr.t;
import p071kotlin.Metadata;
import sq0.BENationalCourtRegisterEntry;

/* JADX INFO: renamed from: pl2.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpl2/a;", "", "Lsq0/h;", "entry", "", "maxNumberOfSubscriptionPerPesel", "maxNumberOfDaysForSubscription", "", "canAddSubscription", "<init>", "(Lsq0/h;IIZ)V", "a", "(Lsq0/h;IIZ)Lpl2/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lsq0/h;", "d", "()Lsq0/h;", "b", "I", "f", "c", "e", "Z", "()Z", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EntryDetailsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BENationalCourtRegisterEntry entry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxNumberOfSubscriptionPerPesel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxNumberOfDaysForSubscription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canAddSubscription;

    public EntryDetailsData(BENationalCourtRegisterEntry bENationalCourtRegisterEntry, int i15, int i16, boolean z15) {
        this.entry = bENationalCourtRegisterEntry;
        this.maxNumberOfSubscriptionPerPesel = i15;
        this.maxNumberOfDaysForSubscription = i16;
        this.canAddSubscription = z15;
    }

    public static /* synthetic */ EntryDetailsData b(EntryDetailsData entryDetailsData, BENationalCourtRegisterEntry bENationalCourtRegisterEntry, int i15, int i16, boolean z15, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            bENationalCourtRegisterEntry = entryDetailsData.entry;
        }
        if ((i17 & 2) != 0) {
            i15 = entryDetailsData.maxNumberOfSubscriptionPerPesel;
        }
        if ((i17 & 4) != 0) {
            i16 = entryDetailsData.maxNumberOfDaysForSubscription;
        }
        if ((i17 & 8) != 0) {
            z15 = entryDetailsData.canAddSubscription;
        }
        return entryDetailsData.a(bENationalCourtRegisterEntry, i15, i16, z15);
    }

    public final EntryDetailsData a(BENationalCourtRegisterEntry entry, int maxNumberOfSubscriptionPerPesel, int maxNumberOfDaysForSubscription, boolean canAddSubscription) {
        return new EntryDetailsData(entry, maxNumberOfSubscriptionPerPesel, maxNumberOfDaysForSubscription, canAddSubscription);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCanAddSubscription() {
        return this.canAddSubscription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BENationalCourtRegisterEntry getEntry() {
        return this.entry;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxNumberOfDaysForSubscription() {
        return this.maxNumberOfDaysForSubscription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryDetailsData)) {
            return false;
        }
        EntryDetailsData entryDetailsData = (EntryDetailsData) other;
        return t.c(this.entry, entryDetailsData.entry) && this.maxNumberOfSubscriptionPerPesel == entryDetailsData.maxNumberOfSubscriptionPerPesel && this.maxNumberOfDaysForSubscription == entryDetailsData.maxNumberOfDaysForSubscription && this.canAddSubscription == entryDetailsData.canAddSubscription;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxNumberOfSubscriptionPerPesel() {
        return this.maxNumberOfSubscriptionPerPesel;
    }

    public int hashCode() {
        return (((((this.entry.hashCode() * 31) + Integer.hashCode(this.maxNumberOfSubscriptionPerPesel)) * 31) + Integer.hashCode(this.maxNumberOfDaysForSubscription)) * 31) + Boolean.hashCode(this.canAddSubscription);
    }

    public String toString() {
        return "EntryDetailsData(entry=" + this.entry + ", maxNumberOfSubscriptionPerPesel=" + this.maxNumberOfSubscriptionPerPesel + ", maxNumberOfDaysForSubscription=" + this.maxNumberOfDaysForSubscription + ", canAddSubscription=" + this.canAddSubscription + ')';
    }
}
