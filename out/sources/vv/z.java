package vv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001bB!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lvv/z;", "Lpq/d;", "Lvv/h;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Lvv/h;[I)V", "", "index", "i", "(I)Lvv/h;", "b", "[Lvv/h;", "k", "()[Lvv/h;", "c", "[I", "n", "()[I", "f", "()I", "size", "d", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends pq.d<h> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h[] byteStrings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int[] trie;

    /* JADX INFO: renamed from: vv.z$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0013\"\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\u0004*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lvv/z$a;", "", "<init>", "()V", "", "nodeOffset", "Lvv/e;", "node", "", "byteStringOffset", "", "Lvv/h;", "byteStrings", "fromIndex", "toIndex", "indexes", "Loq/i0;", "a", "(JLvv/e;ILjava/util/List;IILjava/util/List;)V", "", "Lvv/z;", "d", "([Lvv/h;)Lvv/z;", "c", "(Lvv/e;)J", "intCount", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private final void a(long nodeOffset, e node, int byteStringOffset, List<? extends h> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) {
            int i15;
            int i16;
            int i17;
            long j15;
            int i18 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i19 = fromIndex; i19 < toIndex; i19++) {
                if (byteStrings.get(i19).Q() < i18) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = byteStrings.get(fromIndex);
            h hVar2 = byteStrings.get(toIndex - 1);
            if (i18 == hVar.Q()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i25 = fromIndex + 1;
                h hVar3 = byteStrings.get(i25);
                i15 = i25;
                i16 = iIntValue;
                hVar = hVar3;
            } else {
                i15 = fromIndex;
                i16 = -1;
            }
            if (hVar.n(i18) == hVar2.n(i18)) {
                int iMin = Math.min(hVar.Q(), hVar2.Q());
                int i26 = 0;
                for (int i27 = i18; i27 < iMin && hVar.n(i27) == hVar2.n(i27); i27++) {
                    i26++;
                }
                long jC = nodeOffset + c(node) + ((long) 2) + ((long) i26) + 1;
                node.writeInt(-i26);
                node.writeInt(i16);
                int i28 = i18 + i26;
                while (i18 < i28) {
                    node.writeInt(hVar.n(i18) & 255);
                    i18++;
                }
                if (i15 + 1 == toIndex) {
                    if (i28 != byteStrings.get(i15).Q()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i15).intValue());
                    return;
                } else {
                    e eVar = new e();
                    node.writeInt(((int) (c(eVar) + jC)) * (-1));
                    a(jC, eVar, i28, byteStrings, i15, toIndex, indexes);
                    node.U1(eVar);
                    return;
                }
            }
            int i29 = 1;
            for (int i35 = i15 + 1; i35 < toIndex; i35++) {
                if (byteStrings.get(i35 - 1).n(i18) != byteStrings.get(i35).n(i18)) {
                    i29++;
                }
            }
            long jC2 = nodeOffset + c(node) + ((long) 2) + ((long) (i29 * 2));
            node.writeInt(i29);
            node.writeInt(i16);
            for (int i36 = i15; i36 < toIndex; i36++) {
                byte bN = byteStrings.get(i36).n(i18);
                if (i36 == i15 || bN != byteStrings.get(i36 - 1).n(i18)) {
                    node.writeInt(bN & 255);
                }
            }
            e eVar2 = new e();
            while (i15 < toIndex) {
                byte bN2 = byteStrings.get(i15).n(i18);
                int i37 = i15 + 1;
                int i38 = i37;
                while (true) {
                    if (i38 >= toIndex) {
                        i17 = toIndex;
                        break;
                    } else {
                        if (bN2 != byteStrings.get(i38).n(i18)) {
                            i17 = i38;
                            break;
                        }
                        i38++;
                    }
                }
                if (i37 == i17 && i18 + 1 == byteStrings.get(i15).Q()) {
                    node.writeInt(indexes.get(i15).intValue());
                    j15 = jC2;
                } else {
                    node.writeInt(((int) (c(eVar2) + jC2)) * (-1));
                    j15 = jC2;
                    a(j15, eVar2, i18 + 1, byteStrings, i15, i17, indexes);
                }
                jC2 = j15;
                i15 = i17;
            }
            node.U1(eVar2);
        }

        static /* synthetic */ void b(Companion companion, long j15, e eVar, int i15, List list, int i16, int i17, List list2, int i18, Object obj) {
            if ((i18 & 1) != 0) {
                j15 = 0;
            }
            companion.a(j15, eVar, (i18 & 4) != 0 ? 0 : i15, list, (i18 & 16) != 0 ? 0 : i16, (i18 & 32) != 0 ? list.size() : i17, list2);
        }

        private final long c(e eVar) {
            return eVar.getSize() / ((long) 4);
        }

        public final z d(h... byteStrings) {
            fr.k kVar = null;
            if (byteStrings.length == 0) {
                return new z(new h[0], new int[]{0, -1}, kVar);
            }
            List listW1 = pq.n.w1(byteStrings);
            pq.v.B(listW1);
            int size = listW1.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.add(-1);
            }
            int length = byteStrings.length;
            int i16 = 0;
            int i17 = 0;
            while (i16 < length) {
                arrayList.set(pq.v.m(listW1, byteStrings[i16], 0, 0, 6, null), Integer.valueOf(i17));
                i16++;
                i17++;
            }
            if (((h) listW1.get(0)).Q() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i18 = 0;
            while (i18 < listW1.size()) {
                h hVar = (h) listW1.get(i18);
                int i19 = i18 + 1;
                int i25 = i19;
                while (i25 < listW1.size()) {
                    h hVar2 = (h) listW1.get(i25);
                    if (!hVar2.R(hVar)) {
                        break;
                    }
                    if (hVar2.Q() == hVar.Q()) {
                        throw new IllegalArgumentException(("duplicate option: " + hVar2).toString());
                    }
                    if (((Number) arrayList.get(i25)).intValue() > ((Number) arrayList.get(i18)).intValue()) {
                        listW1.remove(i25);
                        ((Number) arrayList.remove(i25)).intValue();
                    } else {
                        i25++;
                    }
                }
                i18 = i19;
            }
            e eVar = new e();
            b(this, 0L, eVar, 0, listW1, 0, 0, arrayList, 53, null);
            int iC = (int) c(eVar);
            int[] iArr = new int[iC];
            for (int i26 = 0; i26 < iC; i26++) {
                iArr[i26] = eVar.readInt();
            }
            return new z((h[]) Arrays.copyOf(byteStrings, byteStrings.length), iArr, kVar);
        }

        private Companion() {
        }
    }

    public /* synthetic */ z(h[] hVarArr, int[] iArr, fr.k kVar) {
        this(hVarArr, iArr);
    }

    public static final z t(h... hVarArr) {
        return INSTANCE.d(hVarArr);
    }

    @Override // pq.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return h((h) obj);
        }
        return false;
    }

    @Override // pq.b
    /* JADX INFO: renamed from: f */
    public int getSize() {
        return this.byteStrings.length;
    }

    public /* bridge */ boolean h(h hVar) {
        return super.contains(hVar);
    }

    @Override // pq.d, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public h get(int index) {
        return this.byteStrings[index];
    }

    @Override // pq.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return o((h) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final h[] getByteStrings() {
        return this.byteStrings;
    }

    @Override // pq.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return s((h) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    public /* bridge */ int o(h hVar) {
        return super.indexOf(hVar);
    }

    public /* bridge */ int s(h hVar) {
        return super.lastIndexOf(hVar);
    }

    private z(h[] hVarArr, int[] iArr) {
        this.byteStrings = hVarArr;
        this.trie = iArr;
    }
}
