package tq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: tq0.v, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ltq0/v;", "", "", "number", "", "Ltq0/k;", "orders", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/util/List;)Ltq0/v;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderedDocumentByNumber {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<k> orders;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderedDocumentByNumber(String str, List<? extends k> list) {
        this.number = str;
        this.orders = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderedDocumentByNumber b(OrderedDocumentByNumber orderedDocumentByNumber, String str, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = orderedDocumentByNumber.number;
        }
        if ((i15 & 2) != 0) {
            list = orderedDocumentByNumber.orders;
        }
        return orderedDocumentByNumber.a(str, list);
    }

    public final OrderedDocumentByNumber a(String number, List<? extends k> orders) {
        return new OrderedDocumentByNumber(number, orders);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public final List<k> d() {
        return this.orders;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderedDocumentByNumber)) {
            return false;
        }
        OrderedDocumentByNumber orderedDocumentByNumber = (OrderedDocumentByNumber) other;
        return fr.t.c(this.number, orderedDocumentByNumber.number) && fr.t.c(this.orders, orderedDocumentByNumber.orders);
    }

    public int hashCode() {
        return (this.number.hashCode() * 31) + this.orders.hashCode();
    }

    public String toString() {
        return "OrderedDocumentByNumber(number=" + this.number + ", orders=" + this.orders + ")";
    }
}
