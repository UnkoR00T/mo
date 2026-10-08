package qz;

import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ/\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lqz/a;", "Lpx/b;", "<init>", "()V", "", "Lpx/a;", "", "a", "(Ljava/util/List;)Ljava/lang/String;", "message", "tags", "Loq/i0;", "n7", "(Ljava/lang/String;Ljava/util/List;)V", "u6", "", "throwable", "T6", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/List;)V", "logging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements px.b {
    private final String a(List<? extends px.a> list) {
        if (list.isEmpty()) {
            list = v.e(px.a.d.f163088a);
        }
        List<? extends px.a> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((px.a) it.next()).a());
        }
        Iterator it4 = arrayList.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = ((String) next) + ", " + ((String) it4.next());
        }
        return (String) next;
    }

    @Override // px.b
    public void T6(String message, Throwable throwable, List<? extends px.a> tags) {
        c2.f(a(tags), message, throwable);
    }

    @Override // px.b
    public void n7(String message, List<? extends px.a> tags) {
        a(tags);
    }

    @Override // px.b
    public void u6(String message, List<? extends px.a> tags) {
        a(tags);
    }
}
