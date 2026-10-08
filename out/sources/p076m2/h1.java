package p076m2;

import er.p;
import fr.t;
import ip.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import n2.b;
import o2.e;
import oq.i0;
import p071kotlin.Metadata;
import p2.SlotReader;
import p2.SlotWriter;
import p2.c;
import p2.g;
import p2.l;
import r0.i1;
import r0.t0;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000e\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\"\b\b\u0000\u0010\u0010*\u00020\f\"\b\b\u0001\u0010\u0011*\u00020\f2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a3\u0010 \u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00170\u001c2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b \u0010!\u001a+\u0010$\u001a\u0004\u0018\u00010\u0017*\b\u0012\u0004\u0012\u00020\u00170\u001c2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%\u001a#\u0010&\u001a\u0004\u0018\u00010\u0017*\b\u0012\u0004\u0012\u00020\u00170\u001c2\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'\u001a)\u0010(\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00170\u001c2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)\u001a\u0013\u0010+\u001a\u00020\n*\u00020*H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0013\u0010-\u001a\u00020**\u00020\nH\u0002¢\u0006\u0004\b-\u0010.\u001a#\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0016*\u00020/2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103\u001a#\u00106\u001a\u00020\n*\u0002042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0002¢\u0006\u0004\b6\u00107\u001a+\u0010;\u001a\u00020\n*\u0002042\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0002¢\u0006\u0004\b;\u0010<\"$\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u00170=j\b\u0012\u0004\u0012\u00020\u0017`>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010?\"\u0018\u0010D\u001a\u00020\f*\u00020A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lm2/v4;", "Lm2/k1;", "q", "(Lm2/v4;)Lm2/k1;", "Lp2/o;", "Lo2/e;", "rememberManager", "Loq/i0;", "u", "(Lp2/o;Lo2/e;)V", "", "index", "", "data", "E", "(Lp2/o;ILjava/lang/Object;)V", "K", "V", "initialCapacity", "Ln2/b;", "C", "(I)Lr0/t0;", "", "Lm2/r1;", "location", "y", "(Ljava/util/List;I)I", "x", "", "Lm2/f4;", "scope", "instance", "B", "(Ljava/util/List;ILm2/f4;Ljava/lang/Object;)V", "start", "end", "z", "(Ljava/util/List;II)Lm2/r1;", "F", "(Ljava/util/List;I)Lm2/r1;", "G", "(Ljava/util/List;II)V", "", "r", "(Z)I", "p", "(I)Z", "Lp2/l;", "Lp2/c;", "anchor", "s", "(Lp2/l;Lp2/c;)Ljava/util/List;", "Lp2/j;", "root", "w", "(Lp2/j;II)I", "a", "b", "common", a.f96138c, "(Lp2/j;III)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Ljava/util/Comparator;", "InvalidationLocationAscending", "Lp2/g;", "A", "(Lp2/g;)Ljava/lang/Object;", "joinedKey", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<r1> f122941a = new Comparator() { // from class: m2.f1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return h1.c((r1) obj, (r1) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object A(g gVar) {
        return gVar.getObjectKey() != null ? new JoinedKey(Integer.valueOf(gVar.getKey()), gVar.getObjectKey()) : Integer.valueOf(gVar.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(List<r1> list, int i15, f4 f4Var, Object obj) {
        int iY = y(list, i15);
        if (iY < 0) {
            int i16 = -(iY + 1);
            if (!(obj instanceof o0)) {
                obj = null;
            }
            list.add(i16, new r1(f4Var, i15, obj));
            return;
        }
        r1 r1Var = list.get(iY);
        if (!(obj instanceof o0)) {
            r1Var.e(null);
            return;
        }
        Object instances = r1Var.getInstances();
        if (instances == null) {
            r1Var.e(obj);
        } else if (instances instanceof u0) {
            ((u0) instances).i(obj);
        } else {
            r1Var.e(i1.c(instances, obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> t0<Object, Object> C(int i15) {
        return b.d(new t0(i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D(SlotReader jVar, int i15, int i16, int i17) {
        if (i15 != i16) {
            if (i15 == i17 || i16 == i17) {
                return i17;
            }
            if (jVar.Q(i15) == i16) {
                return i16;
            }
            if (jVar.Q(i16) != i15) {
                if (jVar.Q(i15) == jVar.Q(i16)) {
                    return jVar.Q(i15);
                }
                int iW = w(jVar, i15, i17);
                int iW2 = w(jVar, i16, i17);
                int i18 = iW - iW2;
                for (int i19 = 0; i19 < i18; i19++) {
                    i15 = jVar.Q(i15);
                }
                int i25 = iW2 - iW;
                for (int i26 = 0; i26 < i25; i26++) {
                    i16 = jVar.Q(i16);
                }
                while (i15 != i16) {
                    i15 = jVar.Q(i15);
                    i16 = jVar.Q(i16);
                }
                return i15;
            }
        }
        return i15;
    }

    private static final void E(SlotWriter slotWriter, int i15, Object obj) {
        Object objI = slotWriter.I(i15);
        if (obj == objI) {
            return;
        }
        t.b("Slot table is out of sync (expected " + obj + ", got " + objI + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r1 F(List<r1> list, int i15) {
        int iY = y(list, i15);
        if (iY >= 0) {
            return list.remove(iY);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(List<r1> list, int i15, int i16) {
        int iX = x(list, i15);
        while (iX < list.size() && list.get(iX).getLocation() < i16) {
            list.remove(iX);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(r1 r1Var, r1 r1Var2) {
        return t.d(r1Var.getLocation(), r1Var2.getLocation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(int i15) {
        return i15 != 0;
    }

    public static final k1 q(v4 v4Var) {
        k1 k1Var = v4Var instanceof k1 ? (k1) v4Var : null;
        if (k1Var != null) {
            return k1Var;
        }
        t.c("Inconsistent composition");
        throw new oq.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(boolean z15) {
        return z15 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> s(l lVar, c cVar) {
        ArrayList arrayList = new ArrayList();
        SlotReader jVarU = lVar.U();
        try {
            t(jVarU, arrayList, lVar.v(cVar));
            i0 i0Var = i0.f148189a;
            return arrayList;
        } finally {
            jVarU.d();
        }
    }

    private static final void t(SlotReader jVar, List<Object> list, int i15) {
        if (jVar.K(i15)) {
            list.add(jVar.M(i15));
            return;
        }
        int iF = i15 + 1;
        int iF2 = i15 + jVar.F(i15);
        while (iF < iF2) {
            t(jVar, list, iF);
            iF += jVar.F(iF);
        }
    }

    public static final void u(final SlotWriter slotWriter, final e eVar) {
        slotWriter.X(slotWriter.getCurrentGroup(), new p() { // from class: m2.g1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return h1.v(eVar, slotWriter, ((Integer) obj).intValue(), obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(e eVar, SlotWriter slotWriter, int i15, Object obj) {
        if (obj instanceof n) {
            eVar.e((n) obj);
        } else if (!(obj instanceof b5)) {
            if (obj instanceof v4) {
                E(slotWriter, i15, obj);
                eVar.c((v4) obj);
            } else if (obj instanceof f4) {
                E(slotWriter, i15, obj);
                ((f4) obj).A();
            }
        }
        return i0.f148189a;
    }

    private static final int w(SlotReader jVar, int i15, int i16) {
        int i17 = 0;
        while (i15 > 0 && i15 != i16) {
            i15 = jVar.Q(i15);
            i17++;
        }
        return i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x(List<r1> list, int i15) {
        int iY = y(list, i15);
        return iY < 0 ? -(iY + 1) : iY;
    }

    private static final int y(List<r1> list, int i15) {
        int size = list.size() - 1;
        int i16 = 0;
        while (i16 <= size) {
            int i17 = (i16 + size) >>> 1;
            int iD = t.d(list.get(i17).getLocation(), i15);
            if (iD < 0) {
                i16 = i17 + 1;
            } else {
                if (iD <= 0) {
                    return i17;
                }
                size = i17 - 1;
            }
        }
        return -(i16 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r1 z(List<r1> list, int i15, int i16) {
        int iX = x(list, i15);
        if (iX >= list.size()) {
            return null;
        }
        r1 r1Var = list.get(iX);
        if (r1Var.getLocation() < i16) {
            return r1Var;
        }
        return null;
    }
}
