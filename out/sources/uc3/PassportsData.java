package uc3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: uc3.i, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Luc3/i;", "", "Lfz/b$f;", "date", "Luc3/a;", "groupedPassports", "<init>", "(Lfz/b$f;Luc3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfz/b$f;", "()Lfz/b$f;", "b", "Luc3/a;", "()Luc3/a;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final GroupedPassports groupedPassports;

    public PassportsData(fz.b.OffsetDateTime offsetDateTime, GroupedPassports groupedPassports) {
        this.date = offsetDateTime;
        this.groupedPassports = groupedPassports;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final fz.b.OffsetDateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GroupedPassports getGroupedPassports() {
        return this.groupedPassports;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportsData)) {
            return false;
        }
        PassportsData passportsData = (PassportsData) other;
        return t.c(this.date, passportsData.date) && t.c(this.groupedPassports, passportsData.groupedPassports);
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.groupedPassports.hashCode();
    }

    public String toString() {
        return "PassportsData(date=" + this.date + ", groupedPassports=" + this.groupedPassports + ')';
    }
}
