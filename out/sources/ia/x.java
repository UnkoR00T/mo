package ia;

import ha.g;
import java.util.List;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tR+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\f\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0013\u0010\u0018\"\u0004\b\u0019\u0010\u001aR7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u001c\u0010\u0016R,\u0010\"\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lia/x;", "Lha/g;", "T", "", "currentInfo", "", "backInfo", "forwardInfo", "<init>", "(Lha/g;Ljava/util/List;Ljava/util/List;)V", "Lha/j;", "<set-?>", "a", "Lm2/a3;", "e", "()Lha/j;", "j", "(Lha/j;)V", "transitionState", "b", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "c", "()Lha/g;", "g", "(Lha/g;)V", "d", "h", "Lha/e;", "Lha/e;", "()Lha/e;", "i", "(Lha/e;)V", "sourceHandler", "navigationevent-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x<T extends ha.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 transitionState = c6.e(ha.j.b.f82266b, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 backInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 currentInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3 forwardInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ha.e<? extends ha.g> sourceHandler;

    public x(T t15, List<? extends T> list, List<? extends T> list2) {
        this.backInfo = c6.e(list, null, 2, null);
        this.currentInfo = c6.e(t15, null, 2, null);
        this.forwardInfo = c6.e(list2, null, 2, null);
    }

    public final List<T> a() {
        return (List) this.backInfo.getValue();
    }

    public final T b() {
        return (T) this.currentInfo.getValue();
    }

    public final List<T> c() {
        return (List) this.forwardInfo.getValue();
    }

    public final ha.e<? extends ha.g> d() {
        return this.sourceHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ha.j e() {
        return (ha.j) this.transitionState.getValue();
    }

    public final void f(List<? extends T> list) {
        this.backInfo.setValue(list);
    }

    public final void g(T t15) {
        this.currentInfo.setValue(t15);
    }

    public final void h(List<? extends T> list) {
        this.forwardInfo.setValue(list);
    }

    public final void i(ha.e<? extends ha.g> eVar) {
        this.sourceHandler = eVar;
    }

    public final void j(ha.j jVar) {
        this.transitionState.setValue(jVar);
    }
}
