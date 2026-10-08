package dx;

import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Ldx/k;", "Ldx/j;", "Ldx/b;", "", "parsers", "<init>", "(Ljava/util/List;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ldx/i;", "a", "(Ljava/lang/Exception;)Ldx/i;", "Ljava/util/List;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements j<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<j<?>> parsers;

    /* JADX WARN: Multi-variable type inference failed */
    public k(List<? extends j<?>> list) {
        this.parsers = list;
    }

    @Override // dx.j
    public i<Exception, b> a(Exception e15) {
        i.Right right;
        Iterator<T> it = this.parsers.iterator();
        do {
            right = null;
            if (!it.hasNext()) {
                break;
            }
            b bVar = (b) ((j) it.next()).a(e15).a();
            if (bVar != null) {
                right = new i.Right(bVar);
            }
        } while (right == null);
        return right != null ? right : new i.Right(new b.Generic(e15));
    }
}
