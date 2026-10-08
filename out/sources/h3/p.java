package h3;

import java.util.LinkedHashMap;
import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh3/p;", "", "<init>", "()V", "", "id", "", "value", "Loq/i0;", "b", "(ILjava/lang/String;)Loq/i0;", "", "Lh3/o;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "children", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, o> children = new LinkedHashMap();

    public final Map<Integer, o> a() {
        return this.children;
    }

    public final i0 b(int id5, String value) {
        er.l<String, i0> lVarC;
        o oVar = this.children.get(Integer.valueOf(id5));
        if (oVar == null || (lVarC = oVar.c()) == null) {
            return null;
        }
        lVarC.b(value);
        return i0.f148189a;
    }
}
