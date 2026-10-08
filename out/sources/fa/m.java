package fa;

import ea.NavEntry;
import java.util.Map;
import java.util.Set;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.q2;
import p076m2.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012&\b\u0002\u0010\b\u001a \u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004¢\u0006\u0004\b\t\u0010\nR5\u0010\b\u001a \u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfa/m;", "", "T", "Lea/o;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Loq/i0;", "movableContentMap", "<init>", "(Ljava/util/Map;)V", "c", "Ljava/util/Map;", "getMovableContentMap", "()Ljava/util/Map;", "navigation3-ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m<T> extends ea.o<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, er.q<er.p<? super p076m2.r, ? super Integer, i0>, p076m2.r, Integer, i0>> movableContentMap;

    /* JADX WARN: Multi-variable type inference failed */
    public m() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Map map, Object obj) {
        map.remove(obj);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Map map, final NavEntry navEntry, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(navEntry) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1714993007, i15, -1, "androidx.navigation3.scene.SceneSetupNavEntryDecorator.<init>.<anonymous> (SceneSetupNavEntryDecorator.kt:51)");
            }
            Object contentKey = navEntry.getContentKey();
            if (((Set) rVar.N(o.c())).contains(contentKey)) {
                rVar.X(1572145905);
            } else {
                rVar.X(1574916499);
                rVar.J(1159182959, contentKey);
                Object objE = rVar.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    Object objB = map.get(contentKey);
                    if (objB == null) {
                        objB = q2.b(f.f60376a.b());
                        map.put(contentKey, objB);
                    }
                    objE = (er.q) objB;
                    rVar.v(objE);
                }
                ((er.q) objE).w(y2.m.d(-804085656, true, new er.p() { // from class: fa.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.j(navEntry, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, 54);
                rVar.U();
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(NavEntry navEntry, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-804085656, i15, -1, "androidx.navigation3.scene.SceneSetupNavEntryDecorator.<init>.<anonymous>.<anonymous>.<anonymous> (SceneSetupNavEntryDecorator.kt:79)");
            }
            navEntry.b(rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public /* synthetic */ m(Map map, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? x5.h() : map);
    }

    public m(final Map<Object, er.q<er.p<? super p076m2.r, ? super Integer, i0>, p076m2.r, Integer, i0>> map) {
        super(new er.l() { // from class: fa.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.h(map, obj);
            }
        }, y2.m.b(-1714993007, true, new er.q() { // from class: fa.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m.i(map, (NavEntry) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }));
        this.movableContentMap = map;
    }
}
