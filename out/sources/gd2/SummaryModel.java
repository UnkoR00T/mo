package gd2;

import al0.c0;
import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gd2.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lgd2/a;", "", "Lal0/c0;", "action", "Liy/b0;", "idCardSeriesAndNumber", "userEdorAddress", "<init>", "(Lal0/c0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/c0;", "()Lal0/c0;", "b", "Liy/b0;", "()Liy/b0;", "c", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryModel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f71993d = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c0 action;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 idCardSeriesAndNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 userEdorAddress;

    public SummaryModel(c0 c0Var, b0 b0Var, b0 b0Var2) {
        this.action = c0Var;
        this.idCardSeriesAndNumber = b0Var;
        this.userEdorAddress = b0Var2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c0 getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getIdCardSeriesAndNumber() {
        return this.idCardSeriesAndNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getUserEdorAddress() {
        return this.userEdorAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryModel)) {
            return false;
        }
        SummaryModel summaryModel = (SummaryModel) other;
        return this.action == summaryModel.action && t.c(this.idCardSeriesAndNumber, summaryModel.idCardSeriesAndNumber) && t.c(this.userEdorAddress, summaryModel.userEdorAddress);
    }

    public int hashCode() {
        return (((this.action.hashCode() * 31) + this.idCardSeriesAndNumber.hashCode()) * 31) + this.userEdorAddress.hashCode();
    }

    public String toString() {
        return "SummaryModel(action=" + this.action + ", idCardSeriesAndNumber=" + this.idCardSeriesAndNumber + ", userEdorAddress=" + this.userEdorAddress + ')';
    }
}
