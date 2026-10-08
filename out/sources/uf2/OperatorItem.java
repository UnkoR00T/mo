package uf2;

import fr.k;
import fr.t;
import p071kotlin.Metadata;
import zi0.InternetOperator;

/* JADX INFO: renamed from: uf2.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Luf2/a;", "", "", "isSelected", "Lzi0/f;", "operator", "<init>", "(ZLzi0/f;)V", "a", "(ZLzi0/f;)Luf2/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "Lzi0/f;", "c", "()Lzi0/f;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OperatorItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InternetOperator operator;

    public OperatorItem(boolean z15, InternetOperator internetOperator) {
        this.isSelected = z15;
        this.operator = internetOperator;
    }

    public static /* synthetic */ OperatorItem b(OperatorItem operatorItem, boolean z15, InternetOperator internetOperator, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = operatorItem.isSelected;
        }
        if ((i15 & 2) != 0) {
            internetOperator = operatorItem.operator;
        }
        return operatorItem.a(z15, internetOperator);
    }

    public final OperatorItem a(boolean isSelected, InternetOperator operator) {
        return new OperatorItem(isSelected, operator);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InternetOperator getOperator() {
        return this.operator;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OperatorItem)) {
            return false;
        }
        OperatorItem operatorItem = (OperatorItem) other;
        return this.isSelected == operatorItem.isSelected && t.c(this.operator, operatorItem.operator);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isSelected) * 31) + this.operator.hashCode();
    }

    public String toString() {
        return "OperatorItem(isSelected=" + this.isSelected + ", operator=" + this.operator + ')';
    }

    public /* synthetic */ OperatorItem(boolean z15, InternetOperator internetOperator, int i15, k kVar) {
        this((i15 & 1) != 0 ? false : z15, internetOperator);
    }
}
