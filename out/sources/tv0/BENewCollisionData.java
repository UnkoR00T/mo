package tv0;

import fr.t;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import sv0.ProcessId;

/* JADX INFO: renamed from: tv0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Ltv0/e;", "", "Ldx/i;", "Ldx/b;", "Lsv0/y;", "processId", "Ltv0/a;", "chapterDescription", "Ltv0/b;", "yourDetails", "<init>", "(Ldx/i;Ltv0/a;Ltv0/b;)V", "a", "(Ldx/i;Ltv0/a;Ltv0/b;)Ltv0/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ldx/i;", "d", "()Ldx/i;", "b", "Ltv0/a;", "c", "()Ltv0/a;", "Ltv0/b;", "e", "()Ltv0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BENewCollisionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final dx.i<dx.b, ProcessId> processId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Description chapterDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final YourDetails yourDetails;

    public BENewCollisionData() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BENewCollisionData b(BENewCollisionData bENewCollisionData, dx.i iVar, Description description, YourDetails yourDetails, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            iVar = bENewCollisionData.processId;
        }
        if ((i15 & 2) != 0) {
            description = bENewCollisionData.chapterDescription;
        }
        if ((i15 & 4) != 0) {
            yourDetails = bENewCollisionData.yourDetails;
        }
        return bENewCollisionData.a(iVar, description, yourDetails);
    }

    public final BENewCollisionData a(dx.i<? extends dx.b, ProcessId> processId, Description chapterDescription, YourDetails yourDetails) {
        return new BENewCollisionData(processId, chapterDescription, yourDetails);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Description getChapterDescription() {
        return this.chapterDescription;
    }

    public final dx.i<dx.b, ProcessId> d() {
        return this.processId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final YourDetails getYourDetails() {
        return this.yourDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BENewCollisionData)) {
            return false;
        }
        BENewCollisionData bENewCollisionData = (BENewCollisionData) other;
        return t.c(this.processId, bENewCollisionData.processId) && t.c(this.chapterDescription, bENewCollisionData.chapterDescription) && t.c(this.yourDetails, bENewCollisionData.yourDetails);
    }

    public int hashCode() {
        return (((this.processId.hashCode() * 31) + this.chapterDescription.hashCode()) * 31) + this.yourDetails.hashCode();
    }

    public String toString() {
        return "BENewCollisionData(processId=" + this.processId + ", chapterDescription=" + this.chapterDescription + ", yourDetails=" + this.yourDetails + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BENewCollisionData(dx.i<? extends dx.b, ProcessId> iVar, Description description, YourDetails yourDetails) {
        this.processId = iVar;
        this.chapterDescription = description;
        this.yourDetails = yourDetails;
    }

    public /* synthetic */ BENewCollisionData(dx.i iVar, Description description, YourDetails yourDetails, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new dx.i.Left(new dx.b.Generic(new IllegalStateException("processId does not exist"))) : iVar, (i15 & 2) != 0 ? new Description(null, null, null, 7, null) : description, (i15 & 4) != 0 ? new YourDetails(null, null, null, null, null, null, null, null, GF2Field.MASK, null) : yourDetails);
    }
}
