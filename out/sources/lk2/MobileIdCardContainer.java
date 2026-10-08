package lk2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lk2.g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Llk2/g;", "", "", "number", "Lfz/b$f;", "validFrom", "validTo", "<init>", "(Ljava/lang/String;Lfz/b$f;Lfz/b$f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lfz/b$f;", "()Lfz/b$f;", "c", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MobileIdCardContainer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f118696d = fz.b.OffsetDateTime.f68865b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime validFrom;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime validTo;

    public MobileIdCardContainer(String str, fz.b.OffsetDateTime offsetDateTime, fz.b.OffsetDateTime offsetDateTime2) {
        this.number = str;
        this.validFrom = offsetDateTime;
        this.validTo = offsetDateTime2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.OffsetDateTime getValidFrom() {
        return this.validFrom;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final fz.b.OffsetDateTime getValidTo() {
        return this.validTo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileIdCardContainer)) {
            return false;
        }
        MobileIdCardContainer mobileIdCardContainer = (MobileIdCardContainer) other;
        return t.c(this.number, mobileIdCardContainer.number) && t.c(this.validFrom, mobileIdCardContainer.validFrom) && t.c(this.validTo, mobileIdCardContainer.validTo);
    }

    public int hashCode() {
        return (((this.number.hashCode() * 31) + this.validFrom.hashCode()) * 31) + this.validTo.hashCode();
    }

    public String toString() {
        return "MobileIdCardContainer(number=" + this.number + ", validFrom=" + this.validFrom + ", validTo=" + this.validTo + ')';
    }
}
