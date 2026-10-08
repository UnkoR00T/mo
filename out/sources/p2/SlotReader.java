package p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.o1;
import p076m2.t;
import p076m2.w3;

/* JADX INFO: renamed from: p2.j, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b#\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u000eJ\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u0014J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0011J\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u0011J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u0014J\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020#¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020#¢\u0006\u0004\b'\u0010%J\r\u0010(\u001a\u00020#¢\u0006\u0004\b(\u0010%J\r\u0010)\u001a\u00020#¢\u0006\u0004\b)\u0010%J\r\u0010*\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020#¢\u0006\u0004\b,\u0010%J\u0015\u0010-\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b/\u0010.J\r\u00100\u001a\u00020#¢\u0006\u0004\b0\u0010%J\u0013\u00103\u001a\b\u0012\u0004\u0012\u00020201¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0014\u0010A\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010@R\u001e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010CR\u0014\u0010E\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010@R6\u0010J\u001a\"\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020G\u0018\u00010Fj\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020G\u0018\u0001`H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010IR$\u0010O\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010L\u001a\u0004\bM\u0010NR\"\u0010R\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010@\u001a\u0004\bP\u0010+\"\u0004\bQ\u0010.R$\u0010T\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010@\u001a\u0004\bS\u0010+R$\u0010V\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010@\u001a\u0004\bU\u0010+R\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010XR\u0016\u0010[\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010@R\u0016\u0010]\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010@R\u0016\u0010_\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010@R$\u0010b\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b`\u0010L\u001a\u0004\ba\u0010NR\u0011\u0010d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bc\u0010+R\u0011\u0010f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\be\u0010+R\u0011\u0010h\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bg\u0010NR\u0011\u0010i\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b@\u0010NR\u0011\u0010k\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bj\u0010NR\u0011\u0010m\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bl\u0010+R\u0011\u0010n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\\\u0010+R\u0011\u0010o\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b^\u0010+R\u0011\u0010q\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bp\u0010+R\u0011\u0010s\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\br\u0010NR\u0013\u0010t\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b`\u0010\"R\u0013\u0010u\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bZ\u0010\"R\u0011\u0010w\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bv\u0010+R\u0011\u0010y\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bx\u0010+¨\u0006z"}, d2 = {"Lp2/j;", "", "Lp2/l;", "table", "<init>", "(Lp2/l;)V", "", "", "index", "N", "([II)Ljava/lang/Object;", "b", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "Q", "(I)I", "", "K", "(I)Z", "O", "M", "(I)Ljava/lang/Object;", "F", "group", "V", ip.a.f96138c, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "E", "A", "G", "e", "B", "C", "(II)Ljava/lang/Object;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()Ljava/lang/Object;", "Loq/i0;", "c", "()V", "f", "d", "W", "X", "T", "()I", "U", "R", "(I)V", ip.a.f96137b, "g", "", "Lp2/g;", "h", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "Lp2/c;", "a", "(I)Lp2/c;", "Lp2/l;", "z", "()Lp2/l;", "[I", "groups", "I", "groupsSize", "", "[Ljava/lang/Object;", "slots", "slotsSize", "Ljava/util/HashMap;", "Lp2/e;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "sourceInformationMap", "value", "Z", "i", "()Z", "closed", "k", "setCurrentGroup", "currentGroup", "j", "currentEnd", "u", "parent", "Lm2/o1;", "Lm2/o1;", "currentSlotStack", "l", "emptyCount", "m", "currentSlot", "n", "currentSlotEnd", "o", "r", "hadNext", "x", "size", "y", "slot", "J", "isNode", "isGroupEnd", "t", "inEmpty", "p", "groupSize", "groupEnd", "groupKey", "q", "groupSlotIndex", "s", "hasObjectKey", "groupObjectKey", "groupAux", "v", "parentNodes", "w", "remainingSlots", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SlotReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] groups;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int groupsSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object[] slots;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int slotsSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private HashMap<c, e> sourceInformationMap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private int current;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private int end;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private int parent;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final o1 currentSlotStack;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int emptyCount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int currentSlotEnd;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean hadNext;

    public SlotReader(l lVar) {
        this.table = lVar;
        this.groups = lVar.getGroups();
        int groupsSize = lVar.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = lVar.getSlots();
        this.slotsSize = lVar.getSlotsSize();
        this.end = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new o1();
    }

    private final Object N(int[] iArr, int i15) {
        int i16 = i15 * 5;
        return (iArr[i16 + 1] & 1073741824) != 0 ? this.slots[iArr[i16 + 4]] : p076m2.r.INSTANCE.a();
    }

    private final Object P(int[] iArr, int i15) {
        if ((iArr[(i15 * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0) {
            return this.slots[n.v(iArr, i15)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i15) {
        return (iArr[(i15 * 5) + 1] & 268435456) != 0 ? this.slots[n.p(iArr, i15)] : p076m2.r.INSTANCE.a();
    }

    public final Object A(int index) {
        return b(this.groups, index);
    }

    public final Object B(int index) {
        return C(this.current, index);
    }

    public final Object C(int group, int index) {
        int iX = n.x(this.groups, group);
        int i15 = group + 1;
        int i16 = iX + index;
        return i16 < (i15 < this.groupsSize ? this.groups[(i15 * 5) + 4] : this.slotsSize) ? this.slots[i16] : p076m2.r.INSTANCE.a();
    }

    public final int D(int index) {
        return this.groups[index * 5];
    }

    public final Object E(int index) {
        return P(this.groups, index);
    }

    public final int F(int index) {
        return n.s(this.groups, index);
    }

    public final boolean G(int index) {
        return (this.groups[(index * 5) + 1] & 134217728) != 0;
    }

    public final boolean H(int index) {
        return (this.groups[(index * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final boolean I() {
        return t() || this.current == this.end;
    }

    public final boolean J() {
        return (this.groups[(this.current * 5) + 1] & 1073741824) != 0;
    }

    public final boolean K(int index) {
        return (this.groups[(index * 5) + 1] & 1073741824) != 0;
    }

    public final Object L() {
        int i15;
        if (this.emptyCount > 0 || (i15 = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return p076m2.r.INSTANCE.a();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i15 + 1;
        return objArr[i15];
    }

    public final Object M(int index) {
        int[] iArr = this.groups;
        if ((iArr[(index * 5) + 1] & 1073741824) != 0) {
            return N(iArr, index);
        }
        return null;
    }

    public final int O(int index) {
        return this.groups[(index * 5) + 1] & 67108863;
    }

    public final int Q(int index) {
        return this.groups[(index * 5) + 2];
    }

    public final void R(int index) {
        if (!(this.emptyCount == 0)) {
            t.b("Cannot reposition while in an empty region");
        }
        this.current = index;
        int i15 = this.groupsSize;
        int i16 = index < i15 ? this.groups[(index * 5) + 2] : -1;
        if (i16 != this.parent) {
            this.parent = i16;
            if (i16 < 0) {
                this.end = i15;
            } else {
                this.end = i16 + n.s(this.groups, i16);
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
        }
    }

    public final void S(int index) {
        int iS = n.s(this.groups, index) + index;
        int i15 = this.current;
        if (!(i15 >= index && i15 <= iS)) {
            t.b("Index " + index + " is not a parent of " + i15);
        }
        this.parent = index;
        this.end = iS;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int T() {
        if (!(this.emptyCount == 0)) {
            t.b("Cannot skip while in an empty region");
        }
        int[] iArr = this.groups;
        int i15 = this.current;
        int i16 = (iArr[(i15 * 5) + 1] & 1073741824) == 0 ? iArr[(i15 * 5) + 1] & 67108863 : 1;
        this.current = i15 + n.s(iArr, i15);
        return i16;
    }

    public final void U() {
        if (!(this.emptyCount == 0)) {
            t.b("Cannot skip the enclosing group while in an empty region");
        }
        this.current = this.end;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int V(int group) {
        int iX = n.x(this.groups, group);
        int i15 = group + 1;
        return (i15 < this.groupsSize ? this.groups[(i15 * 5) + 4] : this.slotsSize) - iX;
    }

    public final void W() {
        e eVar;
        if (this.emptyCount <= 0) {
            int i15 = this.parent;
            int i16 = this.current;
            if (!(this.groups[(i16 * 5) + 2] == i15)) {
                w3.a("Invalid slot table detected");
            }
            HashMap<c, e> map = this.sourceInformationMap;
            if (map != null && (eVar = map.get(a(i15))) != null) {
                eVar.k(this.table, i16);
            }
            o1 o1Var = this.currentSlotStack;
            int i17 = this.currentSlot;
            int i18 = this.currentSlotEnd;
            if (i17 == 0 && i18 == 0) {
                o1Var.i(-1);
            } else {
                o1Var.i(i17);
            }
            this.parent = i16;
            this.end = n.s(this.groups, i16) + i16;
            int i19 = i16 + 1;
            this.current = i19;
            this.currentSlot = n.x(this.groups, i16);
            this.currentSlotEnd = i16 >= this.groupsSize - 1 ? this.slotsSize : this.groups[(i19 * 5) + 4];
        }
    }

    public final void X() {
        if (this.emptyCount <= 0) {
            if (!((this.groups[(this.current * 5) + 1] & 1073741824) != 0)) {
                w3.a("Expected a node group");
            }
            W();
        }
    }

    public final c a(int index) {
        ArrayList<c> arrayListE = this.table.E();
        int iW = n.w(arrayListE, index, this.groupsSize);
        if (iW >= 0) {
            return arrayListE.get(iW);
        }
        c cVar = new c(index);
        arrayListE.add(-(iW + 1), cVar);
        return cVar;
    }

    public final void c() {
        this.emptyCount++;
    }

    public final void d() {
        this.closed = true;
        this.table.w(this, this.sourceInformationMap);
        this.slots = new Object[0];
    }

    public final boolean e(int index) {
        return (this.groups[(index * 5) + 1] & 67108864) != 0;
    }

    public final void f() {
        if (!(this.emptyCount > 0)) {
            w3.a("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void g() {
        if (this.emptyCount == 0) {
            if (!(this.current == this.end)) {
                t.b("endGroup() not called at the end of a group");
            }
            int[] iArr = this.groups;
            int i15 = iArr[(this.parent * 5) + 2];
            this.parent = i15;
            this.end = i15 < 0 ? this.groupsSize : n.s(iArr, i15) + i15;
            int iG = this.currentSlotStack.g();
            if (iG < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = iG;
                this.currentSlotEnd = i15 >= this.groupsSize - 1 ? this.slotsSize : this.groups[((i15 + 1) * 5) + 4];
            }
        }
    }

    public final List<g> h() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int i15 = 0;
            int iS = this.current;
            while (true) {
                int i16 = i15;
                if (iS >= this.end) {
                    break;
                }
                int[] iArr = this.groups;
                int i17 = iS * 5;
                int i18 = iArr[i17];
                Object objP = P(iArr, iS);
                int i19 = 1;
                int i25 = this.groups[i17 + 1];
                if ((1073741824 & i25) == 0) {
                    i19 = i25 & 67108863;
                }
                i15 = i16 + 1;
                arrayList.add(new g(i18, objP, iS, i19, i16));
                iS += n.s(this.groups, iS);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    public final Object l() {
        int i15 = this.current;
        if (i15 < this.end) {
            return b(this.groups, i15);
        }
        return 0;
    }

    public final int m() {
        return this.end;
    }

    public final int n() {
        int i15 = this.current;
        if (i15 < this.end) {
            return this.groups[i15 * 5];
        }
        return 0;
    }

    public final Object o() {
        int i15 = this.current;
        if (i15 < this.end) {
            return P(this.groups, i15);
        }
        return null;
    }

    public final int p() {
        return n.s(this.groups, this.current);
    }

    public final int q() {
        return this.currentSlot - n.x(this.groups, this.parent);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean s() {
        int i15 = this.current;
        return i15 < this.end && (this.groups[(i15 * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final boolean t() {
        return this.emptyCount > 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.current + ", key=" + n() + ", parent=" + this.parent + ", end=" + this.end + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final int v() {
        int i15 = this.parent;
        if (i15 >= 0) {
            return this.groups[(i15 * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final int w() {
        return this.currentSlotEnd - this.currentSlot;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final int y() {
        return this.currentSlot - n.x(this.groups, this.parent);
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final l getTable() {
        return this.table;
    }
}
