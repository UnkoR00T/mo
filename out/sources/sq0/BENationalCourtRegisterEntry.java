package sq0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sq0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJD\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lsq0/h;", "", "Lsq0/d;", "idKrs", "", "number", "name", "office", "Lsq0/i;", "subscription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsq0/i;Lfr/k;)V", "", "h", "()Z", "i", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsq0/i;)Lsq0/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "e", "d", "f", "Lsq0/i;", "g", "()Lsq0/i;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BENationalCourtRegisterEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String idKrs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String office;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BESubscription subscription;

    public /* synthetic */ BENationalCourtRegisterEntry(String str, String str2, String str3, String str4, BESubscription bESubscription, fr.k kVar) {
        this(str, str2, str3, str4, bESubscription);
    }

    public static /* synthetic */ BENationalCourtRegisterEntry b(BENationalCourtRegisterEntry bENationalCourtRegisterEntry, String str, String str2, String str3, String str4, BESubscription bESubscription, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = bENationalCourtRegisterEntry.idKrs;
        }
        if ((i15 & 2) != 0) {
            str2 = bENationalCourtRegisterEntry.number;
        }
        if ((i15 & 4) != 0) {
            str3 = bENationalCourtRegisterEntry.name;
        }
        if ((i15 & 8) != 0) {
            str4 = bENationalCourtRegisterEntry.office;
        }
        if ((i15 & 16) != 0) {
            bESubscription = bENationalCourtRegisterEntry.subscription;
        }
        BESubscription bESubscription2 = bESubscription;
        String str5 = str3;
        return bENationalCourtRegisterEntry.a(str, str2, str5, str4, bESubscription2);
    }

    public final BENationalCourtRegisterEntry a(String idKrs, String number, String name, String office, BESubscription subscription) {
        return new BENationalCourtRegisterEntry(idKrs, number, name, office, subscription, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIdKrs() {
        return this.idKrs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BENationalCourtRegisterEntry)) {
            return false;
        }
        BENationalCourtRegisterEntry bENationalCourtRegisterEntry = (BENationalCourtRegisterEntry) other;
        return d.b(this.idKrs, bENationalCourtRegisterEntry.idKrs) && t.c(this.number, bENationalCourtRegisterEntry.number) && t.c(this.name, bENationalCourtRegisterEntry.name) && t.c(this.office, bENationalCourtRegisterEntry.office) && t.c(this.subscription, bENationalCourtRegisterEntry.subscription);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOffice() {
        return this.office;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final BESubscription getSubscription() {
        return this.subscription;
    }

    public final boolean h() {
        BESubscription bESubscription = this.subscription;
        if (bESubscription != null) {
            return bESubscription.e();
        }
        return false;
    }

    public int hashCode() {
        int iC = ((((((d.c(this.idKrs) * 31) + this.number.hashCode()) * 31) + this.name.hashCode()) * 31) + this.office.hashCode()) * 31;
        BESubscription bESubscription = this.subscription;
        return iC + (bESubscription == null ? 0 : bESubscription.hashCode());
    }

    public final boolean i() {
        BESubscription bESubscription = this.subscription;
        if (bESubscription != null) {
            return bESubscription.f();
        }
        return false;
    }

    public String toString() {
        return "BENationalCourtRegisterEntry(idKrs=" + d.d(this.idKrs) + ", number=" + this.number + ", name=" + this.name + ", office=" + this.office + ", subscription=" + this.subscription + ")";
    }

    private BENationalCourtRegisterEntry(String str, String str2, String str3, String str4, BESubscription bESubscription) {
        this.idKrs = str;
        this.number = str2;
        this.name = str3;
        this.office = str4;
        this.subscription = bESubscription;
    }
}
