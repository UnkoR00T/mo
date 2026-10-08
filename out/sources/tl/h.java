package tl;

import android.content.Context;
import yk.q;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    public interface a<T> {
        String a(T t15);
    }

    public static yk.c<?> b(String str, String str2) {
        return yk.c.l(f.a(str, str2), f.class);
    }

    public static yk.c<?> c(final String str, final a<Context> aVar) {
        return yk.c.m(f.class).b(q.j(Context.class)).e(new yk.g() { // from class: tl.g
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return f.a(str, aVar.a((Context) dVar.a(Context.class)));
            }
        }).d();
    }
}
