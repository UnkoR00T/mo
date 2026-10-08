package ou;

import ju.a3;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lou/r0;", "", "Ltq/i;", "context", "", "n", "<init>", "(Ltq/i;I)V", "Lju/a3;", "element", "value", "Loq/i0;", "a", "(Lju/a3;Ljava/lang/Object;)V", "b", "(Ltq/i;)V", "Ltq/i;", "", "[Ljava/lang/Object;", "values", "c", "[Lju/a3;", "elements", "d", "I", "i", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final tq.i context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] values;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3<Object>[] elements;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int i;

    public r0(tq.i iVar, int i15) {
        this.context = iVar;
        this.values = new Object[i15];
        this.elements = new a3[i15];
    }

    public final void a(a3<?> element, Object value) {
        Object[] objArr = this.values;
        int i15 = this.i;
        objArr[i15] = value;
        a3<Object>[] a3VarArr = this.elements;
        this.i = i15 + 1;
        a3VarArr[i15] = element;
    }

    public final void b(tq.i context) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i15 = length - 1;
            this.elements[length].C1(context, this.values[length]);
            if (i15 < 0) {
                return;
            } else {
                length = i15;
            }
        }
    }
}
