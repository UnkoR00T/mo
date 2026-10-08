package lg2;

import java.util.Comparator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import tq0.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Llg2/b;", "Llg2/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Ltq0/f;", "param", "", "c", "(Ljava/util/List;)Ljava/lang/String;", "a", "Lmx/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements lg2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Integer.valueOf(((f) t15).getOrder()), Integer.valueOf(((f) t16).getOrder()));
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(List<? extends f> param) {
        if (param.isEmpty()) {
            return null;
        }
        StringBuilder sb5 = new StringBuilder();
        int i15 = 0;
        for (Object obj : v.U0(param, new a())) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            sb5.append(this.labelProvider.c(c.c((f) obj)).getText());
            if (i15 != param.size() - 1) {
                sb5.append(", ");
            }
            i15 = i16;
        }
        return sb5.toString();
    }
}
