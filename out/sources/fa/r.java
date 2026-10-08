package fa;

import ea.NavEntry;
import java.util.ArrayList;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.x5;
import p114t0.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\nX\u008a\u0084\u0002"}, d2 = {"", "T", "", "Lea/m;", "entries", "Lfa/s;", "sceneStrategy", "Lt0/t0;", "sharedTransitionScope", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lfa/p;", "b", "(Ljava/util/List;Lfa/s;Lt0/t0;Ler/a;Lm2/r;II)Lfa/p;", "currentOnBack", "navigation3-ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> SceneState<T> b(List<NavEntry<T>> list, s<T> sVar, t0 t0Var, er.a<i0> aVar, p076m2.r rVar, int i15, int i16) {
        v vVarA;
        List<NavEntry<T>> listB;
        List<NavEntry<T>> list2;
        if ((i16 & 4) != 0) {
            t0Var = null;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(976520931, i15, -1, "androidx.navigation3.scene.rememberSceneState (SceneState.kt:74)");
        }
        final f6 f6VarP = x5.p(aVar, rVar, (i15 >> 9) & 14);
        if (t0Var == null) {
            rVar.X(1721922407);
            rVar.R();
            vVarA = null;
        } else {
            rVar.X(1721922408);
            vVarA = w.a(t0Var, rVar, 0);
            rVar.R();
        }
        int i17 = i15 & 14;
        List listT = ea.f.t(list, pq.v.s(vVarA, o.d(rVar, 0), d.d(list, rVar, i17)), rVar, i17, 0);
        boolean zW = ((((i15 & 112) ^ 48) > 32 && rVar.W(sVar)) || (i15 & 48) == 32) | rVar.W(listT);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            t tVar = new t(new er.a() { // from class: fa.q
                @Override // er.a
                public final Object a() {
                    return r.d(f6VarP);
                }
            });
            List listT2 = pq.v.t(z.a(sVar, tVar, listT));
            do {
                Object objX0 = pq.v.x0(listT2);
                g gVar = objX0 instanceof g ? (g) objX0 : null;
                listB = gVar != null ? gVar.b() : null;
                if (listB != null) {
                    if (listB.isEmpty()) {
                        throw new IllegalArgumentException(("Overlaid entries from " + gVar + " must not be empty").toString());
                    }
                    listT2.add(z.a(sVar, tVar, listB));
                }
            } while (listB != null);
            List listG0 = pq.v.g0(listT2, 1);
            ArrayList arrayList = new ArrayList(listG0.size());
            int size = listG0.size();
            for (int i18 = 0; i18 < size; i18++) {
                arrayList.add((g) ((h) listG0.get(i18)));
            }
            h hVar = (h) pq.v.x0(listT2);
            List listT3 = pq.v.t(pq.v.l0(listT2));
            do {
                h hVar2 = (h) pq.v.n0(listT3);
                List<NavEntry<T>> listA = hVar2 != null ? hVar2.a() : null;
                list2 = listA;
                if (list2 != null && !list2.isEmpty()) {
                    listT3.add(0, z.a(sVar, tVar, listA));
                }
                if (list2 == null) {
                    break;
                }
            } while (!list2.isEmpty());
            listT3.remove(hVar);
            Object sceneState = new SceneState(listT, arrayList, hVar, listT3);
            rVar.v(sceneState);
            objE = sceneState;
        }
        SceneState<T> sceneState2 = (SceneState) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return sceneState2;
    }

    private static final er.a<i0> c(f6<? extends er.a<i0>> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(f6 f6Var) {
        c(f6Var).a();
        return i0.f148189a;
    }
}
