package uc3;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: uc3.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001a"}, d2 = {"Luc3/a;", "", "", "Luc3/h;", "validPassports", "revokedPassports", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "d", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "allPassports", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupedPassports {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PassportVisualization> validPassports;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PassportVisualization> revokedPassports;

    public GroupedPassports(List<PassportVisualization> list, List<PassportVisualization> list2) {
        this.validPassports = list;
        this.revokedPassports = list2;
    }

    public final List<PassportVisualization> a() {
        return v.L0(this.validPassports, this.revokedPassports);
    }

    public final List<PassportVisualization> b() {
        return this.revokedPassports;
    }

    public final List<PassportVisualization> c() {
        return this.validPassports;
    }

    public final boolean d() {
        return a().isEmpty();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupedPassports)) {
            return false;
        }
        GroupedPassports groupedPassports = (GroupedPassports) other;
        return t.c(this.validPassports, groupedPassports.validPassports) && t.c(this.revokedPassports, groupedPassports.revokedPassports);
    }

    public int hashCode() {
        return (this.validPassports.hashCode() * 31) + this.revokedPassports.hashCode();
    }

    public String toString() {
        return "GroupedPassports(validPassports=" + this.validPassports + ", revokedPassports=" + this.revokedPassports + ')';
    }
}
