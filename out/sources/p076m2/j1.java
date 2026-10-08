package p076m2;

import fr.t;
import java.util.ArrayList;
import java.util.List;
import o2.b;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import p2.g;
import r0.j0;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b#\u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\"\u0010.\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010(\u001a\u0004\b$\u0010*\"\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R'\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b+\u00107R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003098F¢\u0006\u0006\u001a\u0004\b5\u0010'¨\u0006;"}, d2 = {"Lm2/j1;", "", "", "Lp2/g;", "keyInfos", "", "startIndex", "<init>", "(Ljava/util/List;I)V", "key", "dataKey", "d", "(ILjava/lang/Object;)Lp2/g;", "keyInfo", "", "h", "(Lp2/g;)Z", "from", "to", "Loq/i0;", "k", "(II)V", "count", "j", "(III)V", "insertIndex", "i", "(Lp2/g;I)V", "group", "newCount", "n", "(II)Z", "m", "(Lp2/g;)I", "g", "o", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "e", "()I", "c", "l", "(I)V", "groupIndex", "usedKeys", "Lr0/j0;", "Lo2/b;", "Lr0/j0;", "groupInfos", "Ln2/b;", "f", "Loq/k;", "()Lr0/t0;", "keyMap", "", "used", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<g> keyInfos;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int groupIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<g> usedKeys;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j0<b> groupInfos;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k keyMap;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements er.a<n2.b<Object, g>> {
        a() {
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ n2.b<Object, g> a() {
            return n2.b.b(c());
        }

        public final t0<Object, Object> c() {
            t0<Object, Object> t0VarC = h1.C(j1.this.b().size());
            j1 j1Var = j1.this;
            int size = j1Var.b().size();
            for (int i15 = 0; i15 < size; i15++) {
                g gVar = j1Var.b().get(i15);
                n2.b.a(t0VarC, h1.A(gVar), gVar);
            }
            return t0VarC;
        }
    }

    public j1(List<g> list, int i15) {
        this.keyInfos = list;
        this.startIndex = i15;
        if (!(i15 >= 0)) {
            w3.a("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        j0<b> j0Var = new j0<>(0, 1, null);
        int size = list.size();
        int nodes = 0;
        for (int i16 = 0; i16 < size; i16++) {
            g gVar = this.keyInfos.get(i16);
            j0Var.r(gVar.getLocation(), new b(i16, nodes, gVar.getNodes()));
            nodes += gVar.getNodes();
        }
        this.groupInfos = j0Var;
        this.keyMap = l.a(new a());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List<g> b() {
        return this.keyInfos;
    }

    public final t0<Object, Object> c() {
        return ((n2.b) this.keyMap.getValue()).getMap();
    }

    public final g d(int key, Object dataKey) {
        return (g) n2.b.l(c(), dataKey != null ? new JoinedKey(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List<g> f() {
        return this.usedKeys;
    }

    public final int g(g keyInfo) {
        b bVarB = this.groupInfos.b(keyInfo.getLocation());
        if (bVarB != null) {
            return bVarB.getNodeIndex();
        }
        return -1;
    }

    public final boolean h(g keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void i(g keyInfo, int insertIndex) {
        this.groupInfos.r(keyInfo.getLocation(), new b(-1, insertIndex, 0));
    }

    public final void j(int from, int to4, int count) {
        char c15;
        long j15;
        char c16;
        long j16;
        char c17 = 7;
        long j17 = -9187201950435737472L;
        if (from > to4) {
            j0<b> j0Var = this.groupInfos;
            Object[] objArr = j0Var.values;
            long[] jArr = j0Var.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                long j18 = jArr[i15];
                if ((((~j18) << c17) & j18 & j17) != j17) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j18 & 255) < 128) {
                            c16 = c17;
                            b bVar = (b) objArr[(i15 << 3) + i17];
                            j16 = j17;
                            int nodeIndex = bVar.getNodeIndex();
                            if (from <= nodeIndex && nodeIndex < from + count) {
                                bVar.e((nodeIndex - from) + to4);
                            } else if (to4 <= nodeIndex && nodeIndex < from) {
                                bVar.e(nodeIndex + count);
                            }
                        } else {
                            c16 = c17;
                            j16 = j17;
                        }
                        j18 >>= 8;
                        i17++;
                        c17 = c16;
                        j17 = j16;
                    }
                    c15 = c17;
                    j15 = j17;
                    if (i16 != 8) {
                        return;
                    }
                } else {
                    c15 = c17;
                    j15 = j17;
                }
                if (i15 == length) {
                    return;
                }
                i15++;
                c17 = c15;
                j17 = j15;
            }
        } else {
            if (to4 <= from) {
                return;
            }
            j0<b> j0Var2 = this.groupInfos;
            Object[] objArr2 = j0Var2.values;
            long[] jArr2 = j0Var2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i18 = 0;
            while (true) {
                long j19 = jArr2[i18];
                if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    for (int i25 = 0; i25 < i19; i25++) {
                        if ((j19 & 255) < 128) {
                            b bVar2 = (b) objArr2[(i18 << 3) + i25];
                            int nodeIndex2 = bVar2.getNodeIndex();
                            if (from <= nodeIndex2 && nodeIndex2 < from + count) {
                                bVar2.e((nodeIndex2 - from) + to4);
                            } else if (from + 1 <= nodeIndex2 && nodeIndex2 < to4) {
                                bVar2.e(nodeIndex2 - count);
                            }
                        }
                        j19 >>= 8;
                    }
                    if (i19 != 8) {
                        return;
                    }
                }
                if (i18 == length2) {
                    return;
                } else {
                    i18++;
                }
            }
        }
    }

    public final void k(int from, int to4) {
        char c15;
        long j15;
        char c16;
        long j16;
        char c17 = 7;
        long j17 = -9187201950435737472L;
        if (from > to4) {
            j0<b> j0Var = this.groupInfos;
            Object[] objArr = j0Var.values;
            long[] jArr = j0Var.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                long j18 = jArr[i15];
                if ((((~j18) << c17) & j18 & j17) != j17) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j18 & 255) < 128) {
                            c16 = c17;
                            b bVar = (b) objArr[(i15 << 3) + i17];
                            j16 = j17;
                            int slotIndex = bVar.getSlotIndex();
                            if (slotIndex == from) {
                                bVar.f(to4);
                            } else if (to4 <= slotIndex && slotIndex < from) {
                                bVar.f(slotIndex + 1);
                            }
                        } else {
                            c16 = c17;
                            j16 = j17;
                        }
                        j18 >>= 8;
                        i17++;
                        c17 = c16;
                        j17 = j16;
                    }
                    c15 = c17;
                    j15 = j17;
                    if (i16 != 8) {
                        return;
                    }
                } else {
                    c15 = c17;
                    j15 = j17;
                }
                if (i15 == length) {
                    return;
                }
                i15++;
                c17 = c15;
                j17 = j15;
            }
        } else {
            if (to4 <= from) {
                return;
            }
            j0<b> j0Var2 = this.groupInfos;
            Object[] objArr2 = j0Var2.values;
            long[] jArr2 = j0Var2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i18 = 0;
            while (true) {
                long j19 = jArr2[i18];
                if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    for (int i25 = 0; i25 < i19; i25++) {
                        if ((j19 & 255) < 128) {
                            b bVar2 = (b) objArr2[(i18 << 3) + i25];
                            int slotIndex2 = bVar2.getSlotIndex();
                            if (slotIndex2 == from) {
                                bVar2.f(to4);
                            } else if (from + 1 <= slotIndex2 && slotIndex2 < to4) {
                                bVar2.f(slotIndex2 - 1);
                            }
                        }
                        j19 >>= 8;
                    }
                    if (i19 != 8) {
                        return;
                    }
                }
                if (i18 == length2) {
                    return;
                } else {
                    i18++;
                }
            }
        }
    }

    public final void l(int i15) {
        this.groupIndex = i15;
    }

    public final int m(g keyInfo) {
        b bVarB = this.groupInfos.b(keyInfo.getLocation());
        if (bVarB != null) {
            return bVarB.getSlotIndex();
        }
        return -1;
    }

    public final boolean n(int group, int newCount) {
        int nodeIndex;
        b bVarB = this.groupInfos.b(group);
        if (bVarB == null) {
            return false;
        }
        int nodeIndex2 = bVarB.getNodeIndex();
        int nodeCount = newCount - bVarB.getNodeCount();
        bVarB.d(newCount);
        if (nodeCount == 0) {
            return true;
        }
        j0<b> j0Var = this.groupInfos;
        Object[] objArr = j0Var.values;
        long[] jArr = j0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        b bVar = (b) objArr[(i15 << 3) + i17];
                        if (bVar.getNodeIndex() >= nodeIndex2 && !t.c(bVar, bVarB) && (nodeIndex = bVar.getNodeIndex() + nodeCount) >= 0) {
                            bVar.e(nodeIndex);
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }

    public final int o(g keyInfo) {
        b bVarB = this.groupInfos.b(keyInfo.getLocation());
        return bVarB != null ? bVarB.getNodeCount() : keyInfo.getNodes();
    }
}
