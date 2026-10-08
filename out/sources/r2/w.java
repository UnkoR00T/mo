package r2;

import e3.ComposeStackTraceFrame;
import java.util.List;
import p071kotlin.Metadata;
import p076m2.b5;
import p076m2.f4;
import p076m2.v4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a/\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr2/t;", "Lo2/e;", "rememberManager", "Loq/i0;", "g", "(Lr2/t;Lo2/e;)V", "e", "", "child", "", "group", "", "Le3/d;", "c", "(Lr2/t;Ljava/lang/Object;I)Ljava/util/List;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w {
    public static final List<ComposeStackTraceFrame> c(t tVar, Object obj, int i15) {
        return (tVar.getIsClosed() || tVar.p()) ? pq.v.n() : p.f(tVar.getTable().getAddressSpace(), i15, obj, new d(tVar));
    }

    public static /* synthetic */ List d(t tVar, Object obj, int i15, int i16, Object obj2) {
        if ((i16 & 1) != 0) {
            obj = null;
        }
        if ((i16 & 2) != 0) {
            i15 = tVar.getCurrent();
        }
        return c(tVar, obj, i15);
    }

    public static final void e(final t tVar, final o2.e eVar) {
        tVar.O(tVar.getCurrent(), new t.a() { // from class: r2.v
            @Override // r2.t.a
            public final boolean a(int i15, int i16, Object obj) {
                return w.f(tVar, eVar, i15, i16, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(t tVar, o2.e eVar, int i15, int i16, Object obj) {
        if (obj instanceof p076m2.n) {
            tVar.f(i15);
            if (i16 != 0) {
                return false;
            }
            eVar.e((p076m2.n) obj);
            return false;
        }
        if (obj instanceof b5) {
            return false;
        }
        if (obj instanceof v4) {
            eVar.c((v4) obj);
            return true;
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        ((f4) obj).A();
        return true;
    }

    public static final void g(t tVar, final o2.e eVar) {
        tVar.O(tVar.getCurrent(), new t.a() { // from class: r2.u
            @Override // r2.t.a
            public final boolean a(int i15, int i16, Object obj) {
                return w.h(eVar, i15, i16, obj);
            }
        });
        t.D(tVar, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(o2.e eVar, int i15, int i16, Object obj) {
        if (obj instanceof p076m2.n) {
            eVar.a((p076m2.n) obj);
        }
        if (obj instanceof v4) {
            eVar.c((v4) obj);
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        ((f4) obj).A();
        return false;
    }
}
