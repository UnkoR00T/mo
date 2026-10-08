package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class c1 extends q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f92380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f92381b;

    c1() {
    }

    @Override // ii.q.a
    public final q a() {
        List list;
        Integer num = this.f92380a;
        if (num != null && (list = this.f92381b) != null) {
            return new n4(num, list);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92380a == null) {
            sb5.append(" connectorCount");
        }
        if (this.f92381b == null) {
            sb5.append(" connectorAggregations");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    @Override // ii.q.a
    public final q.a b(List<k> list) {
        if (list == null) {
            throw new NullPointerException("Null connectorAggregations");
        }
        this.f92381b = list;
        return this;
    }

    public final q.a c(Integer num) {
        if (num == null) {
            throw new NullPointerException("Null connectorCount");
        }
        this.f92380a = num;
        return this;
    }
}
