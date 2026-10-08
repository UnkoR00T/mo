package se3;

import fr.t;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import sv0.Insurance;

/* JADX INFO: renamed from: se3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lse3/a;", "", "Lmx/a;", "subtitle", "", "Lsv0/r;", "insurances", "", "copyEnabled", "<init>", "(Lmx/a;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Z", "()Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceDetailsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label subtitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Insurance> insurances;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean copyEnabled;

    public InsuranceDetailsData(Label label, List<Insurance> list, boolean z15) {
        this.subtitle = label;
        this.insurances = list;
        this.copyEnabled = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCopyEnabled() {
        return this.copyEnabled;
    }

    public final List<Insurance> b() {
        return this.insurances;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsuranceDetailsData)) {
            return false;
        }
        InsuranceDetailsData insuranceDetailsData = (InsuranceDetailsData) other;
        return t.c(this.subtitle, insuranceDetailsData.subtitle) && t.c(this.insurances, insuranceDetailsData.insurances) && this.copyEnabled == insuranceDetailsData.copyEnabled;
    }

    public int hashCode() {
        return (((this.subtitle.hashCode() * 31) + this.insurances.hashCode()) * 31) + Boolean.hashCode(this.copyEnabled);
    }

    public String toString() {
        return "InsuranceDetailsData(subtitle=" + this.subtitle + ", insurances=" + this.insurances + ", copyEnabled=" + this.copyEnabled + ')';
    }
}
