package ta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oa.u;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aA\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Loa/c;", "", "fromVersion", "toVersion", "", "d", "(Loa/c;II)Z", "Loa/u$e;", "startVersion", "endVersion", "a", "(Loa/u$e;II)Z", "start", "end", "", "Lra/b;", "b", "(Loa/u$e;II)Ljava/util/List;", "", "result", "upgrade", "c", "(Loa/u$e;Ljava/util/List;ZII)Ljava/util/List;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    public static final boolean a(u.e eVar, int i15, int i16) {
        Map<Integer, Map<Integer, ra.b>> mapE = eVar.e();
        if (!mapE.containsKey(Integer.valueOf(i15))) {
            return false;
        }
        Map<Integer, ra.b> mapI = mapE.get(Integer.valueOf(i15));
        if (mapI == null) {
            mapI = v0.i();
        }
        return mapI.containsKey(Integer.valueOf(i16));
    }

    public static final List<ra.b> b(u.e eVar, int i15, int i16) {
        if (i15 == i16) {
            return v.n();
        }
        return c(eVar, new ArrayList(), i16 > i15, i15, i16);
    }

    private static final List<ra.b> c(u.e eVar, List<ra.b> list, boolean z15, int i15, int i16) {
        int iIntValue;
        boolean z16;
        while (true) {
            if (z15) {
                if (i15 >= i16) {
                    return list;
                }
            } else if (i15 <= i16) {
                return list;
            }
            oq.r<Map<Integer, ra.b>, Iterable<Integer>> rVarF = z15 ? eVar.f(i15) : eVar.g(i15);
            if (rVarF == null) {
                return null;
            }
            Map<Integer, ra.b> mapA = rVarF.a();
            Iterator<Integer> it = rVarF.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    iIntValue = i15;
                    z16 = false;
                    break;
                }
                iIntValue = it.next().intValue();
                if (!z15) {
                    if (i16 <= iIntValue && iIntValue < i15) {
                        list.add(mapA.get(Integer.valueOf(iIntValue)));
                        z16 = true;
                        break;
                    }
                } else if (i15 + 1 <= iIntValue && iIntValue <= i16) {
                    list.add(mapA.get(Integer.valueOf(iIntValue)));
                    z16 = true;
                    break;
                }
            }
            if (!z16) {
                return null;
            }
            i15 = iIntValue;
        }
    }

    public static final boolean d(oa.c cVar, int i15, int i16) {
        if (i15 > i16 && cVar.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> setC = cVar.c();
        return cVar.requireMigration && (setC == null || !setC.contains(Integer.valueOf(i15)));
    }
}
