package p076m2;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010\"\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b!\u0010\u0005¨\u0006#"}, d2 = {"Lm2/a;", "T", "Lm2/c;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "Loq/i0;", "g", "j", "()V", "clear", "n", "", "", "index", "count", "o", "(Ljava/util/List;II)V", "from", "to", "m", "(Ljava/util/List;III)V", "a", "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "Lm2/e6;", "b", "Ljava/util/ArrayList;", "stack", "value", "c", "p", "current", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T> implements c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f122777d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<T> stack = e6.c(null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private T current;

    public a(T t15) {
        this.root = t15;
        this.current = t15;
    }

    @Override // p076m2.c
    public T a() {
        return this.current;
    }

    @Override // p076m2.c
    public final void clear() {
        e6.a(this.stack);
        p(this.root);
        n();
    }

    @Override // p076m2.c
    public void g(T node) {
        e6.j(this.stack, a());
        p(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p076m2.c
    public void j() {
        p(e6.i(this.stack));
    }

    public final T l() {
        return this.root;
    }

    protected final void m(List<T> list, int i15, int i16, int i17) {
        int i18 = i15 > i16 ? i16 : i16 - i17;
        if (i17 != 1) {
            List<T> listSubList = list.subList(i15, i17 + i15);
            List listI1 = v.i1(listSubList);
            listSubList.clear();
            list.addAll(i18, listI1);
            return;
        }
        if (i15 == i16 + 1 || i15 == i16 - 1) {
            list.set(i15, list.set(i16, list.get(i15)));
        } else {
            list.add(i18, list.remove(i15));
        }
    }

    protected abstract void n();

    protected final void o(List<T> list, int i15, int i16) {
        if (i16 == 1) {
            list.remove(i15);
        } else {
            list.subList(i15, i16 + i15).clear();
        }
    }

    protected void p(T t15) {
        this.current = t15;
    }
}
