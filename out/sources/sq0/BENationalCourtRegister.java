package sq0;

import fr.t;
import java.util.ArrayList;
import java.util.List;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sq0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001e\u0010\u0013R!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010\u001aR!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010\u001a¨\u0006%"}, d2 = {"Lsq0/g;", "", "", "Lsq0/h;", "entries", "", "maxNumberOfSubscriptionPerPesel", "maxNumberOfDaysForSubscription", "<init>", "(Ljava/util/List;II)V", "", "c", "()Z", "d", "(Ljava/util/List;II)Lsq0/g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "h", "()Ljava/util/List;", "b", "I", "l", "k", "Loq/k;", "i", "entriesWithSubscription", "e", "j", "entriesWithoutSubscription", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BENationalCourtRegister {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BENationalCourtRegisterEntry> entries;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxNumberOfSubscriptionPerPesel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxNumberOfDaysForSubscription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k entriesWithSubscription = l.a(new er.a() { // from class: sq0.e
        @Override // er.a
        public final Object a() {
            return BENationalCourtRegister.f(this.f183522a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k entriesWithoutSubscription = l.a(new er.a() { // from class: sq0.f
        @Override // er.a
        public final Object a() {
            return BENationalCourtRegister.g(this.f183523a);
        }
    });

    public BENationalCourtRegister(List<BENationalCourtRegisterEntry> list, int i15, int i16) {
        this.entries = list;
        this.maxNumberOfSubscriptionPerPesel = i15;
        this.maxNumberOfDaysForSubscription = i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BENationalCourtRegister e(BENationalCourtRegister bENationalCourtRegister, List list, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            list = bENationalCourtRegister.entries;
        }
        if ((i17 & 2) != 0) {
            i15 = bENationalCourtRegister.maxNumberOfSubscriptionPerPesel;
        }
        if ((i17 & 4) != 0) {
            i16 = bENationalCourtRegister.maxNumberOfDaysForSubscription;
        }
        return bENationalCourtRegister.d(list, i15, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(BENationalCourtRegister bENationalCourtRegister) {
        List<BENationalCourtRegisterEntry> list = bENationalCourtRegister.entries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((BENationalCourtRegisterEntry) obj).getSubscription() != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(BENationalCourtRegister bENationalCourtRegister) {
        List<BENationalCourtRegisterEntry> list = bENationalCourtRegister.entries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((BENationalCourtRegisterEntry) obj).getSubscription() == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean c() {
        return i().size() < this.maxNumberOfSubscriptionPerPesel;
    }

    public final BENationalCourtRegister d(List<BENationalCourtRegisterEntry> entries, int maxNumberOfSubscriptionPerPesel, int maxNumberOfDaysForSubscription) {
        return new BENationalCourtRegister(entries, maxNumberOfSubscriptionPerPesel, maxNumberOfDaysForSubscription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BENationalCourtRegister)) {
            return false;
        }
        BENationalCourtRegister bENationalCourtRegister = (BENationalCourtRegister) other;
        return t.c(this.entries, bENationalCourtRegister.entries) && this.maxNumberOfSubscriptionPerPesel == bENationalCourtRegister.maxNumberOfSubscriptionPerPesel && this.maxNumberOfDaysForSubscription == bENationalCourtRegister.maxNumberOfDaysForSubscription;
    }

    public final List<BENationalCourtRegisterEntry> h() {
        return this.entries;
    }

    public int hashCode() {
        return (((this.entries.hashCode() * 31) + Integer.hashCode(this.maxNumberOfSubscriptionPerPesel)) * 31) + Integer.hashCode(this.maxNumberOfDaysForSubscription);
    }

    public final List<BENationalCourtRegisterEntry> i() {
        return (List) this.entriesWithSubscription.getValue();
    }

    public final List<BENationalCourtRegisterEntry> j() {
        return (List) this.entriesWithoutSubscription.getValue();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getMaxNumberOfDaysForSubscription() {
        return this.maxNumberOfDaysForSubscription;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getMaxNumberOfSubscriptionPerPesel() {
        return this.maxNumberOfSubscriptionPerPesel;
    }

    public String toString() {
        return "BENationalCourtRegister(entries=" + this.entries + ", maxNumberOfSubscriptionPerPesel=" + this.maxNumberOfSubscriptionPerPesel + ", maxNumberOfDaysForSubscription=" + this.maxNumberOfDaysForSubscription + ")";
    }
}
