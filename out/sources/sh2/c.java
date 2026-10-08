package sh2;

import com.google.gson.f;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.q;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f181714a = new f();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f181715a;

        a(o oVar) {
            this.f181715a = oVar;
        }

        public String a(String str) {
            l lVarT = this.f181715a.t(str);
            if (lVarT == null) {
                return null;
            }
            return lVarT.i();
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        return (T) f181714a.i(str, cls);
    }

    public static a b(String str) throws uh2.a {
        try {
            return new a(new q().a(str).f());
        } catch (Exception e15) {
            throw new uh2.a(uh2.b.JSON_PARSE, e15);
        }
    }
}
