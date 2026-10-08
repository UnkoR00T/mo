package p076m2;

import fr.t;
import java.util.ArrayList;
import java.util.List;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import p2.b;
import r0.j0;
import r0.t0;
import r2.f;
import r2.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u000e2\n\u0010$\u001a\u00060\u0005j\u0002`#2\u0006\u0010%\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b*\u0010)J\u0015\u0010+\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b+\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u00102R\"\u00105\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00100\u001a\u0004\b,\u00102\"\u0004\b4\u0010\u0018R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R'\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\b3\u0010AR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030C8F¢\u0006\u0006\u001a\u0004\b<\u0010/¨\u0006E"}, d2 = {"Lm2/i2;", "", "", "Lr2/h;", "keyInfos", "", "startIndex", "<init>", "(Ljava/util/List;I)V", "key", "dataKey", "d", "(ILjava/lang/Object;)Lr2/h;", "keyInfo", "", "j", "(Lr2/h;)Z", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "g", "()J", "index", "Loq/i0;", "h", "(I)V", "from", "to", "m", "(II)V", "count", "l", "(III)V", "insertIndex", "k", "(Lr2/h;I)V", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "newCount", "p", "(II)Z", "o", "(Lr2/h;)I", "i", "q", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "e", "()I", "c", "n", "groupIndex", "Lp2/b;", "Lp2/b;", "placedGroups", "usedKeys", "Lr0/j0;", "Lo2/b;", "f", "Lr0/j0;", "groupInfos", "Ln2/b;", "Loq/k;", "()Lr0/t0;", "keyMap", "", "used", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<h> keyInfos;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int groupIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b placedGroups = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<h> usedKeys;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j0<o2.b> groupInfos;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k keyMap;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements er.a<n2.b<Object, h>> {
        a() {
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ n2.b<Object, h> a() {
            return n2.b.b(c());
        }

        public final t0<Object, Object> c() {
            t0<Object, Object> t0VarS = g2.s(i2.this.b().size());
            i2 i2Var = i2.this;
            int size = i2Var.b().size();
            for (int i15 = 0; i15 < size; i15++) {
                h hVar = i2Var.b().get(i15);
                n2.b.a(t0VarS, hVar.c(), hVar);
            }
            return t0VarS;
        }
    }

    public i2(List<h> list, int i15) {
        this.keyInfos = list;
        this.startIndex = i15;
        if (!(i15 >= 0)) {
            w3.a("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        j0<o2.b> j0Var = new j0<>(0, 1, null);
        int size = list.size();
        int nodes = 0;
        for (int i16 = 0; i16 < size; i16++) {
            h hVar = this.keyInfos.get(i16);
            j0Var.r(f.b(hVar.getHandle()), new o2.b(i16, nodes, hVar.getNodes()));
            nodes += hVar.getNodes();
        }
        this.groupInfos = j0Var;
        this.keyMap = l.a(new a());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List<h> b() {
        return this.keyInfos;
    }

    public final t0<Object, Object> c() {
        return ((n2.b) this.keyMap.getValue()).getMap();
    }

    public final h d(int key, Object dataKey) {
        return (h) n2.b.l(c(), dataKey != null ? new JoinedKey(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List<h> f() {
        return this.usedKeys;
    }

    public final long g() {
        return this.keyInfos.get(this.placedGroups.c(0)).getHandle();
    }

    public final void h(int index) {
        this.placedGroups.d(index, true);
    }

    public final int i(h keyInfo) {
        o2.b bVarB = this.groupInfos.b(f.b(keyInfo.getHandle()));
        if (bVarB != null) {
            return bVarB.getNodeIndex();
        }
        return -1;
    }

    public final boolean j(h keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void k(h keyInfo, int insertIndex) {
        this.groupInfos.r(f.b(keyInfo.getHandle()), new o2.b(-1, insertIndex, 0));
    }

    public final void l(int from, int to4, int count) {
        char c15;
        long j15;
        char c16;
        long j16;
        char c17 = 7;
        long j17 = -9187201950435737472L;
        if (from > to4) {
            j0<o2.b> j0Var = this.groupInfos;
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
                            o2.b bVar = (o2.b) objArr[(i15 << 3) + i17];
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
            j0<o2.b> j0Var2 = this.groupInfos;
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
                            o2.b bVar2 = (o2.b) objArr2[(i18 << 3) + i25];
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

    public final void m(int from, int to4) {
        char c15;
        long j15;
        char c16;
        long j16;
        char c17 = 7;
        long j17 = -9187201950435737472L;
        if (from > to4) {
            j0<o2.b> j0Var = this.groupInfos;
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
                            o2.b bVar = (o2.b) objArr[(i15 << 3) + i17];
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
            j0<o2.b> j0Var2 = this.groupInfos;
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
                            o2.b bVar2 = (o2.b) objArr2[(i18 << 3) + i25];
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

    public final void n(int i15) {
        this.groupIndex = i15;
    }

    public final int o(h keyInfo) {
        o2.b bVarB = this.groupInfos.b(f.b(keyInfo.getHandle()));
        if (bVarB != null) {
            return bVarB.getSlotIndex();
        }
        return -1;
    }

    public final boolean p(int group, int newCount) {
        int nodeIndex;
        o2.b bVarB = this.groupInfos.b(group);
        if (bVarB == null) {
            return false;
        }
        int nodeIndex2 = bVarB.getNodeIndex();
        int nodeCount = newCount - bVarB.getNodeCount();
        bVarB.d(newCount);
        if (nodeCount == 0) {
            return true;
        }
        j0<o2.b> j0Var = this.groupInfos;
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
                        o2.b bVar = (o2.b) objArr[(i15 << 3) + i17];
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

    public final int q(h keyInfo) {
        o2.b bVarB = this.groupInfos.b(f.b(keyInfo.getHandle()));
        return bVarB != null ? bVarB.getNodeCount() : keyInfo.getNodes();
    }
}
