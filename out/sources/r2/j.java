package r2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\t\u001a\u00020\b*\u00020\u00042\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u000e\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0011\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"Lm2/b;", "Lr2/i;", "c", "(Lm2/b;)Lr2/i;", "Lr2/q;", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "handle", "Lr2/a;", "a", "(Lr2/q;J)Lr2/a;", "Lr2/i;", "e", "()Lr2/i;", "NullAnchor", "b", "d", "LazyAnchor", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i f170776a = new i(-1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f170777b = new i(0);

    public static final a a(q qVar, long j15) {
        return new a(b(qVar, f.b(j15)), b(qVar, f.a(j15)));
    }

    private static final i b(q qVar, int i15) {
        if (i15 != -1) {
            return i15 != 0 ? qVar.d(i15) : f170777b;
        }
        return f170776a;
    }

    public static final i c(p076m2.b bVar) {
        i iVar = bVar instanceof i ? (i) bVar : null;
        if (iVar != null) {
            return iVar;
        }
        p076m2.t.c("Inconsistent composition");
        throw new oq.g();
    }

    public static final i d() {
        return f170777b;
    }

    public static final i e() {
        return f170776a;
    }
}
