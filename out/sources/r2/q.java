package r2;

import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import r0.g1;
import r0.h0;
import r0.j0;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 O2\u00020\u0001:\u0001RB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\t2\n\u0010\u0013\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001a\u001a\u00060\tj\u0002`\u00182\n\u0010\u0019\u001a\u00060\tj\u0002`\u00182\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J/\u0010\u001b\u001a\u00060\tj\u0002`\u00182\n\u0010\u0013\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u001b\u0010\u001d\u001a\u00020\f2\n\u0010\u001c\u001a\u00060\tj\u0002`\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\bJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\u000eJ\u0019\u0010#\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b#\u0010\u000eJ\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b)\u0010\u001fJ\u001d\u0010*\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b*\u0010\u001fJ/\u0010-\u001a\u00060\tj\u0002`\u00182\n\u0010\u0013\u001a\u00060\tj\u0002`\n2\u0006\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u0004\u0018\u00010/2\n\u0010\u0013\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b0\u00101J/\u00105\u001a\u00020/2\n\u00102\u001a\u00060\tj\u0002`\n2\b\u00104\u001a\u0004\u0018\u0001032\n\u0010\u0013\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b5\u00106J-\u00107\u001a\u00060\tj\u0002`\u00182\n\u0010\u0013\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b7\u0010\u0017J%\u00108\u001a\u00060\tj\u0002`\u00182\n\u0010\u0013\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b8\u00109J%\u0010<\u001a\u00060\tj\u0002`\n2\u0006\u0010:\u001a\u00020\u00002\n\u0010;\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b<\u0010=J%\u0010?\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\tj\u0002`\n2\n\u0010>\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b?\u0010\u001fJ\u0019\u0010A\u001a\u00020@2\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u00020@¢\u0006\u0004\bE\u0010FJ/\u0010I\u001a\u0004\u0018\u00010@2\u0006\u0010:\u001a\u00020\u00002\n\u0010G\u001a\u00060\tj\u0002`\n2\n\u0010H\u001a\u00060\tj\u0002`\n¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010@¢\u0006\u0004\bK\u0010LJ'\u0010O\u001a\u00020\t2\n\u0010M\u001a\u00060\tj\u0002`\n2\n\u0010N\u001a\u00060\tj\u0002`\nH\u0000¢\u0006\u0004\bO\u00109J\u001c\u0010P\u001a\u00020D2\n\u0010\u0013\u001a\u00060\tj\u0002`\nH\u0086\u0002¢\u0006\u0004\bP\u0010QR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR*\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0018\u0010`\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010_R\u0016\u0010b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010aR\u0016\u0010c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010aR\u0016\u0010d\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010aR\u001c\u0010g\u001a\b\u0012\u0004\u0012\u00020@0e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010fR6\u0010p\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020/\u0018\u00010h8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bi\u0010j\u0012\u0004\bo\u0010\b\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020^8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006t"}, d2 = {"Lr2/q;", "", "", "groups", "", "slots", "<init>", "([I[Ljava/lang/Object;)V", "()V", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "address", "Loq/i0;", "y", "(I)V", "j", "size", "c", "(I)I", "group", "currentSize", "newSize", "r", "(III)I", "Landroidx/compose/runtime/composer/linkbuffer/SlotRange;", "range", ip.a.f96138c, "E", "slotRange", "l", "m", "(II)V", "q", "required", "e", "k", "", "z", "()J", "start", "end", "C", "v", "offset", "value", "G", "(IILjava/lang/Object;)I", "Lr2/k;", "F", "(I)Lr2/k;", "parent", "", "sourceInformation", "x", "(ILjava/lang/String;I)Lr2/k;", "B", "A", "(II)I", "sourceSpace", "sourceAddress", "g", "(Lr2/q;I)I", "previous", "w", "Lr2/i;", "d", "(I)Lr2/i;", "anchor", "", "u", "(Lr2/i;)Z", "oldAddress", "newAddress", "s", "(Lr2/q;II)Lr2/i;", "t", "(Lr2/q;Lr2/i;)V", "groupAddress", "common", "i", "f", "(I)Z", "a", "[I", "n", "()[I", "setGroups", "([I)V", "b", "[Ljava/lang/Object;", "p", "()[Ljava/lang/Object;", "setSlots", "([Ljava/lang/Object;)V", "Lr0/h0;", "Lr0/h0;", "_largeSizes", "I", "unallocatedStart", "unallocatedEnd", "freeSlotCount", "Lr0/j0;", "Lr0/j0;", "anchors", "Lr0/t0;", "h", "Lr0/t0;", "getSourceInformationMap", "()Lr0/t0;", "setSourceInformationMap", "(Lr0/t0;)V", "getSourceInformationMap$annotations", "sourceInformationMap", "o", "()Lr0/h0;", "largeSizes", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f170804j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f170805k = p.i(6);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object[] f170806l = p.j(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] groups;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] slots;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private h0 _largeSizes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int unallocatedStart;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int unallocatedEnd;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int freeSlotCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private j0<i> anchors;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private t0<i, k> sourceInformationMap;

    public q(int[] iArr, Object[] objArr) {
        this.groups = iArr;
        this.slots = objArr;
        this.unallocatedEnd = objArr.length;
        this.anchors = r0.r.c();
    }

    private final int D(int range, int currentSize, int newSize) {
        int i15 = range >> 4;
        if (newSize == 0) {
            if (range != -1) {
                m(i15, currentSize);
            }
            return -1;
        }
        int i16 = currentSize - newSize;
        int i17 = i15 + newSize;
        if (i16 > 0) {
            m(i17, i16);
        }
        if (newSize > 15) {
            o().u(i15, newSize);
        }
        return p.k(i15, newSize);
    }

    private final int E(int group, int currentSize, int newSize) {
        int i15 = group + 5;
        int iD = D(this.groups[i15], currentSize, newSize);
        this.groups[i15] = iD;
        return iD;
    }

    private final int c(int size) {
        int i15 = this.unallocatedStart;
        int i16 = i15 + size;
        if (i16 <= this.unallocatedEnd) {
            this.unallocatedStart = i16;
            if (size > 15) {
                o().u(i15, size);
            }
            pq.n.z(this.slots, p076m2.r.INSTANCE.a(), i15, i16);
            return p.k(i15, size);
        }
        e(size);
        int i17 = this.unallocatedStart;
        int i18 = i17 + size;
        if (i18 > this.unallocatedEnd) {
            p076m2.t.c("compactAndMaybeGrow did not grow enough");
            throw new oq.g();
        }
        this.unallocatedStart = i18;
        if (size > 15) {
            o().u(i17, size);
        }
        pq.n.z(this.slots, p076m2.r.INSTANCE.a(), i17, i18);
        return p.k(i17, size);
    }

    private final void e(int required) {
        Object[] objArr = this.slots;
        int length = objArr.length;
        int length2 = objArr.length - ((this.unallocatedEnd - this.unallocatedStart) + this.freeSlotCount);
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros((required + length2) + (objArr.length >> 5)));
        if (iNumberOfLeadingZeros < length) {
            iNumberOfLeadingZeros = length;
        }
        Object[] objArrJ = iNumberOfLeadingZeros != length ? p.j(lr.m.e(iNumberOfLeadingZeros, 256)) : objArr;
        h0 h0VarA = r0.m.a();
        int i15 = this.groups[3];
        n nVar = new n(objArr, objArrJ);
        int i16 = 6;
        int iC = xq.c.c(6, i15 - 1, 6);
        int i17 = 0;
        if (6 <= iC) {
            while (true) {
                int i18 = i16 + 5;
                int i19 = this.groups[i18];
                if (i19 != -1) {
                    int iC2 = (i19 & 15) + 1;
                    int i25 = i19 >> 4;
                    if (iC2 > 15) {
                        iC2 = o().c(i25);
                    }
                    nVar.c(i17, i25, i25 + iC2);
                    if (iC2 > 15) {
                        h0VarA.u(i17, iC2);
                    }
                    this.groups[i18] = p.k(i17, iC2);
                    i17 += iC2;
                }
                if (i16 == iC) {
                    break;
                } else {
                    i16 += 6;
                }
            }
        }
        if (!(i17 == length2)) {
            p076m2.t.b("Unexpected slot compaction result, computed we had " + length2 + " slots, but copied " + i17 + " slots");
        }
        this.slots = nVar.a();
        if (!h0VarA.h()) {
            h0VarA = null;
        }
        this._largeSizes = h0VarA;
        this.unallocatedStart = i17;
        this.unallocatedEnd = objArrJ.length;
        this.freeSlotCount = 0;
    }

    private static final int h(q qVar, q qVar2, int i15, int i16) {
        int[] iArr = qVar.groups;
        Object[] objArr = qVar.slots;
        int i17 = iArr[i16 + 4];
        int i18 = iArr[i16];
        int iG = p.g(qVar2.getGroups(), i18, i15, i17);
        if (iG < 0) {
            qVar2.q();
            iG = p.g(qVar2.getGroups(), i18, i15, i17);
        }
        qVar2.t(qVar, qVar2.s(qVar, i16, iG));
        int i19 = iArr[i16 + 5];
        if (i19 != -1) {
            int iC = (i19 & 15) + 1;
            int i25 = i19 >> 4;
            if (iC > 15) {
                iC = qVar.o().c(i25);
            }
            int iC2 = qVar2.c(iC);
            pq.n.n(objArr, qVar2.slots, iC2 >> 4, i25, iC + i25);
            qVar2.groups[iG + 5] = iC2;
        }
        int i26 = iArr[i16 + 3];
        int i27 = -1;
        while (i26 != -1) {
            int iH = h(qVar, qVar2, iG, i26);
            if (i27 == -1) {
                qVar2.groups[iG + 3] = iH;
            } else {
                qVar2.groups[i27 + 1] = iH;
            }
            i26 = iArr[i26 + 1];
            i27 = iH;
        }
        return iG;
    }

    private final void j(int address) {
        int[] iArr = this.groups;
        if (address + 6 > iArr.length) {
            return;
        }
        int i15 = address + 4;
        if ((iArr[i15] & 8388607) == 8388607) {
            p076m2.t.b("Recursive loop in group structure detected at " + address);
        }
        i iVarB = this.anchors.b(address);
        if (iVarB != null) {
            iVarB.c(-1);
            this.anchors.o(address);
            t0<i, k> t0Var = this.sourceInformationMap;
            if (t0Var != null) {
                t0Var.u(iVarB);
            }
        }
        int i16 = address + 5;
        l(iArr[i16]);
        iArr[i16] = -1;
        int i17 = iArr[address + 3];
        while (i17 != -1) {
            if (i17 + 6 > iArr.length) {
                return;
            }
            int i18 = iArr[i17 + 1];
            j(i17);
            i17 = i18;
        }
        iArr[address + 1] = iArr[1];
        iArr[address + 2] = -1;
        iArr[1] = address;
        iArr[i15] = 8388607;
    }

    private final void l(int slotRange) {
        if (slotRange != -1) {
            int iC = (slotRange & 15) + 1;
            int i15 = slotRange >> 4;
            if (iC > 15) {
                iC = o().c(i15);
            }
            m(i15, iC);
        }
    }

    private final void m(int address, int size) {
        Object[] objArr = this.slots;
        int i15 = address + size;
        if (i15 == address + 1) {
            objArr[address] = p.f170802a;
        } else {
            pq.n.z(objArr, p.f170802a, address, i15);
        }
        this.freeSlotCount += size;
        if (size > 15) {
            o().r(address);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h0 o() {
        h0 h0Var = this._largeSizes;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0VarA = r0.m.a();
        this._largeSizes = h0VarA;
        return h0VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        int[] iArr = this.groups;
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(this.groups, lr.m.e(iArr.length * 2, 768));
        this.groups = iArrCopyOf;
        p.h(iArrCopyOf, length);
    }

    private final int r(int group, int currentSize, int newSize) {
        int i15;
        int i16 = this.unallocatedStart;
        int i17 = this.unallocatedEnd;
        int i18 = group + 5;
        int i19 = this.groups[i18] >> 4;
        int i25 = i19 + currentSize;
        if (i25 == i16 && (i15 = i19 + newSize) <= i17) {
            this.unallocatedStart = i16 + (newSize - currentSize);
            if (newSize > 15) {
                o().u(i19, newSize);
            }
            int iK = p.k(i19, newSize);
            Object[] objArr = this.slots;
            if (i15 == i25 + 1) {
                objArr[i25] = p.f170802a;
            } else {
                pq.n.z(objArr, p.f170802a, i25, i15);
            }
            this.groups[i18] = iK;
            return iK;
        }
        int i26 = newSize - currentSize;
        Object[] objArr2 = this.slots;
        int i27 = i25 + i26;
        if (i27 < objArr2.length) {
            int i28 = i25;
            while (true) {
                if (i28 >= i27) {
                    if (newSize > 15) {
                        o().u(i19, newSize);
                    }
                    int iK2 = p.k(i19, newSize);
                    Object[] objArr3 = this.slots;
                    int i29 = i19 + newSize;
                    if (i29 == i25 + 1) {
                        objArr3[i25] = p.f170802a;
                    } else {
                        pq.n.z(objArr3, p.f170802a, i25, i29);
                    }
                    this.groups[i18] = iK2;
                    this.freeSlotCount -= i26;
                    return iK2;
                }
                if (objArr2[i28] != p.f170802a) {
                    break;
                }
                i28++;
            }
        }
        int i35 = newSize + 8;
        int iD = D(c(i35), i35, newSize);
        int i36 = iD >> 4;
        int i37 = this.groups[i18] >> 4;
        if (i36 != i37) {
            Object[] objArr4 = this.slots;
            pq.n.n(objArr4, objArr4, i36, i37, i37 + currentSize);
            m(i37, currentSize);
        }
        this.groups[i18] = iD;
        return iD;
    }

    private final void y(int address) {
        i iVarB;
        i iVarB2;
        k kVarE;
        t0<i, k> t0Var = this.sourceInformationMap;
        if (t0Var == null || (iVarB = this.anchors.b(address)) == null || (iVarB2 = this.anchors.b(this.groups[address + 2])) == null || (kVarE = t0Var.e(iVarB2)) == null) {
            return;
        }
        kVarE.j(iVarB);
    }

    public final int A(int group, int newSize) {
        int iC;
        int i15 = this.groups[group + 5];
        if (i15 == -1 && newSize == 0) {
            return i15;
        }
        if (i15 == -1) {
            iC = 0;
        } else {
            int i16 = (i15 & 15) + 1;
            iC = i16 > 15 ? o().c(i15 >> 4) : i16;
        }
        return B(group, iC, newSize);
    }

    public final int B(int group, int size, int newSize) {
        if (newSize == size) {
            return this.groups[group + 5];
        }
        return newSize > size ? r(group, size, newSize) : E(group, size, newSize);
    }

    public final void C(int start, int end) {
        if (end == this.unallocatedEnd) {
            this.unallocatedStart = start;
        }
    }

    public final k F(int group) {
        i iVarB;
        t0<i, k> t0Var = this.sourceInformationMap;
        if (t0Var == null || (iVarB = this.anchors.b(group)) == null) {
            return null;
        }
        return t0Var.e(iVarB);
    }

    public final int G(int group, int offset, Object value) {
        int iC;
        int[] iArr = this.groups;
        int i15 = group + 5;
        int iR = iArr[i15];
        if (iR == -1) {
            iC = c(offset + 1);
            iArr[i15] = iC;
        } else {
            int iC2 = (iR & 15) + 1;
            int i16 = iR >> 4;
            if (iC2 > 15) {
                iC2 = o().c(i16);
            }
            if (offset >= iC2) {
                iR = r(group, iC2, offset + 1);
            }
            iC = iR;
        }
        this.slots[(iC >> 4) + offset] = value;
        return iC;
    }

    public final i d(int address) {
        if (address == -1) {
            return j.e();
        }
        if (address == 0) {
            return j.d();
        }
        if (!(address >= 0)) {
            p076m2.t.b("Invalid anchor address " + address);
        }
        j0<i> j0Var = this.anchors;
        i iVarB = j0Var.b(address);
        if (iVarB == null) {
            iVarB = new i(address);
            j0Var.r(address, iVarB);
        }
        return iVarB;
    }

    public final boolean f(int group) {
        return group > 0 && group < this.groups[3];
    }

    public final int g(q sourceSpace, int sourceAddress) {
        return h(sourceSpace, this, -1, sourceAddress);
    }

    public final int i(int groupAddress, int common) {
        int[] iArr = this.groups;
        int i15 = 0;
        while (groupAddress != common && groupAddress >= 0) {
            i15++;
            groupAddress = iArr[groupAddress + 2];
        }
        return i15;
    }

    public final void k(int address) {
        y(address);
        j(address);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int[] getGroups() {
        return this.groups;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Object[] getSlots() {
        return this.slots;
    }

    public final i s(q sourceSpace, int oldAddress, int newAddress) {
        this.anchors.a(newAddress);
        i iVarO = sourceSpace.anchors.o(oldAddress);
        if (iVarO == null) {
            return null;
        }
        iVarO.c(newAddress);
        this.anchors.r(newAddress, iVarO);
        return iVarO;
    }

    public final void t(q sourceSpace, i anchor) {
        t0<i, k> t0Var;
        k kVarE;
        if (anchor == null || (t0Var = sourceSpace.sourceInformationMap) == null || (kVarE = t0Var.e(anchor)) == null) {
            return;
        }
        t0<i, k> t0VarC = this.sourceInformationMap;
        if (t0VarC == null) {
            t0VarC = g1.c();
            this.sourceInformationMap = t0VarC;
        } else {
            t0VarC.b(anchor);
        }
        t0VarC.x(anchor, kVarE);
        t0Var.u(anchor);
    }

    public final boolean u(i anchor) {
        return this.anchors.b(anchor.getAddress()) == anchor;
    }

    public final void v(int address, int size) {
        o().u(address, size);
    }

    public final void w(int group, int previous) {
        k kVarE;
        t0<i, k> t0Var = this.sourceInformationMap;
        if (t0Var == null) {
            return;
        }
        i iVarB = this.anchors.b(this.groups[group + 2]);
        if (iVarB == null || (kVarE = t0Var.e(iVarB)) == null) {
            return;
        }
        kVarE.g(previous != -1 ? d(previous) : null, d(group));
    }

    public final k x(int parent, String sourceInformation, int group) {
        t0<i, k> t0VarC = this.sourceInformationMap;
        if (t0VarC == null) {
            t0VarC = g1.c();
            this.sourceInformationMap = t0VarC;
        }
        i iVarD = d(parent);
        k kVarE = t0VarC.e(iVarD);
        if (kVarE == null) {
            kVarE = new k(0, sourceInformation, 0);
            if (sourceInformation == null) {
                int i15 = this.groups[parent + 3];
                while (i15 != group && i15 != -1) {
                    kVarE.k(d(i15));
                    i15 = this.groups[i15 + 1];
                }
            }
            t0VarC.x(iVarD, kVarE);
        }
        return kVarE;
    }

    public final long z() {
        int i15 = this.unallocatedStart;
        int i16 = this.unallocatedEnd;
        this.unallocatedStart = i16;
        return ((((long) oq.b0.e(i16)) & BodyPartID.bodyIdMax) << 32) | (((long) oq.b0.e(i15)) & BodyPartID.bodyIdMax);
    }

    public q() {
        this(f170805k, f170806l);
        int[] iArr = this.groups;
        if (iArr[0] == 0 && iArr[1] == -1 && iArr[2] == 0 && iArr[3] == 6 && iArr[4] == 0) {
            int i15 = iArr[5];
        }
    }
}
