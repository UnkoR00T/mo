package r2;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.o1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u000bJA\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000f\u001a\u00060\fj\u0002`\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00132\n\u0010\u0018\u001a\u00060\fj\u0002`\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u0019\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\f2\n\u0010#\u001a\u00060\fj\u0002`\u001b¢\u0006\u0004\b$\u0010\u001aJ\u001b\u0010%\u001a\u0004\u0018\u00010\u00012\n\u0010#\u001a\u00060\fj\u0002`\u001b¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u0004\u0018\u00010\u00012\n\u0010#\u001a\u00060\fj\u0002`\u001b¢\u0006\u0004\b'\u0010&J\u0011\u0010*\u001a\u00060(j\u0002`)¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u00020\f2\n\u0010#\u001a\u00060\fj\u0002`\u001b¢\u0006\u0004\b,\u0010\u001aJ\r\u0010-\u001a\u00020\u0013¢\u0006\u0004\b-\u0010\u0017J\r\u0010.\u001a\u00020\u0013¢\u0006\u0004\b.\u0010\u0017J\r\u0010/\u001a\u00020\f¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u0010\"J\u0019\u00102\u001a\u00020\u00132\n\u0010\u000f\u001a\u00060\fj\u0002`\u000e¢\u0006\u0004\b2\u0010\u001dJ!\u00106\u001a\u00020\u00132\u0006\u00104\u001a\u0002032\n\u00105\u001a\u00060(j\u0002`)¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0013¢\u0006\u0004\b8\u0010\u0017J\r\u00109\u001a\u00020\u0002¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010:R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010>\u001a\u0004\bC\u0010@\"\u0004\bD\u0010BR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010ER\u0016\u0010G\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010IR\u001a\u0010K\u001a\u00060\fj\u0002`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010FR\u0014\u0010L\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010IR\u0016\u0010M\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010FR\u001e\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010FR\u0016\u0010U\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010FR\u0016\u0010W\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010FR\u0016\u0010X\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010Y\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010FR\u0016\u0010Z\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010FR\u0016\u0010[\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010FR$\u0010]\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\\\u0010>\u001a\u0004\b\\\u0010@R\u0011\u0010_\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b^\u0010@R\u0011\u0010`\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bR\u00100R\u0011\u0010c\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\bO\u0010bR\u0011\u0010d\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bV\u00100R\u0015\u0010e\u001a\u00060(j\u0002`)8F¢\u0006\u0006\u001a\u0004\bT\u0010+¨\u0006f"}, d2 = {"Lr2/r;", "", "Lr2/o;", "table", "", "recordSourceInformation", "recordCallByInformation", "<init>", "(Lr2/o;ZZ)V", "Lr2/q;", "addressSpace", "(Lr2/q;ZZ)V", "", "key", "Landroidx/compose/runtime/composer/linkbuffer/GroupFlags;", "flags", "objectKey", "aux", "node", "Loq/i0;", "B", "(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "e", "()V", "group", "z", "(I)I", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "x", "(I)V", "w", "y", "value", "A", "(Ljava/lang/Object;)V", "address", "p", "q", "(I)Ljava/lang/Object;", "o", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "t", "()J", "v", "f", "h", "i", "()I", "c", "b", "Lr2/t;", "sourceEditor", "sourceHandle", "u", "(Lr2/t;J)V", "g", "d", "()Lr2/o;", "a", "Lr2/o;", "n", "Z", "getRecordSourceInformation", "()Z", "setRecordSourceInformation", "(Z)V", "getRecordCallByInformation", "setRecordCallByInformation", "Lr2/q;", "I", "parent", "Lm2/o1;", "Lm2/o1;", "parentStack", "previousSibling", "previousSiblingStack", "nodeCount", "", "j", "[Ljava/lang/Object;", "slots", "k", "slotStart", "l", "slotCurrent", "m", "slotEnd", "inReservedRange", "slotReserveStart", "slotReserveEnd", "slotReserveUsedUpTo", "r", "isClosed", "s", "isEmpty", "parentGroup", "Lr2/i;", "()Lr2/i;", "parentAnchor", "slotIndex", "parentHandle", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean recordSourceInformation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean recordCallByInformation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q addressSpace;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int parent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o1 parentStack;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int previousSibling;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final o1 previousSiblingStack;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int nodeCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Object[] slots;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int slotStart;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int slotCurrent;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int slotEnd;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean inReservedRange;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int slotReserveStart;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int slotReserveEnd;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int slotReserveUsedUpTo;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    public r(o oVar, boolean z15, boolean z16) {
        int i15;
        this.table = oVar;
        this.recordSourceInformation = z15;
        this.recordCallByInformation = z16;
        q addressSpace = oVar.getAddressSpace();
        this.addressSpace = addressSpace;
        int i16 = -1;
        this.parent = -1;
        this.parentStack = new o1();
        int root = oVar.getRoot();
        if (root != -1) {
            int[] groups = addressSpace.getGroups();
            while (true) {
                i15 = i16;
                i16 = root;
                if (i16 < 0) {
                    break;
                } else {
                    root = groups[i16 + 1];
                }
            }
            i16 = i15;
        }
        this.previousSibling = i16;
        this.previousSiblingStack = new o1();
        this.slots = this.addressSpace.getSlots();
    }

    private final void A(Object value) {
        int i15 = this.parent;
        int iZ = z(i15);
        y();
        this.addressSpace.G(i15, iZ, value);
        this.slots = this.addressSpace.getSlots();
        w();
        x(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int key, int flags, Object objectKey, Object aux, Object node) {
        int i15 = this.parent;
        q qVar = this.addressSpace;
        int iG = p.g(qVar.getGroups(), key, i15, flags);
        if (iG < 0) {
            qVar.q();
            iG = p.g(qVar.getGroups(), key, i15, flags);
        }
        int[] groups = this.addressSpace.getGroups();
        int i16 = this.previousSibling;
        if (i16 != -1) {
            groups[i16 + 1] = iG;
        } else if (i15 == -1) {
            this.table.b0(iG);
        } else {
            groups[i15 + 3] = iG;
        }
        this.parentStack.i(i15);
        this.previousSiblingStack.i(i16);
        this.parent = iG;
        this.previousSibling = -1;
        if (i15 != -1) {
            int i17 = i15 + 4;
            groups[i17] = this.nodeCount | (groups[i17] & (-8388608));
        }
        this.nodeCount = 0;
        z(i15);
        int i18 = this.slotReserveUsedUpTo;
        this.slotStart = i18;
        this.slotCurrent = i18;
        this.slotEnd = this.slotReserveEnd;
        this.inReservedRange = true;
        if ((flags & 8388608) == 8388608) {
            c(node);
        }
        if ((flags & 16777216) == 16777216) {
            c(objectKey);
        }
        if ((flags & 33554432) == 33554432) {
            c(aux);
        }
        int i19 = this.slotCurrent;
        int i25 = this.slotStart;
        if (i19 > i25) {
            groups[iG + 5] = p.k(i25, i19 - i25);
        }
        if (!this.recordSourceInformation || i15 < 0) {
            return;
        }
        this.addressSpace.x(i15, null, iG).k(this.addressSpace.d(iG));
    }

    private final void e() {
        int i15 = this.parent;
        if (i15 != -1) {
            z(i15);
        }
        y();
    }

    private final void w() {
        long jZ = this.addressSpace.z();
        int i15 = (int) jZ;
        this.slotReserveStart = i15;
        this.slotReserveUsedUpTo = i15;
        this.slotReserveEnd = (int) (jZ >>> 32);
    }

    private final void x(int group) {
        int i15 = this.addressSpace.getGroups()[group + 5];
        if (i15 == -1) {
            int i16 = this.slotReserveUsedUpTo;
            this.slotStart = i16;
            this.slotCurrent = i16;
            this.slotEnd = this.slotReserveEnd;
            this.inReservedRange = true;
            return;
        }
        q qVar = this.addressSpace;
        int iC = (i15 & 15) + 1;
        int i17 = i15 >> 4;
        if (iC > 15) {
            iC = qVar.o().c(i17);
        }
        this.slotStart = i17;
        int i18 = i17 + iC;
        this.slotEnd = i18;
        this.slotCurrent = i18;
        this.inReservedRange = false;
    }

    private final void y() {
        int i15 = this.slotReserveStart;
        int i16 = this.slotReserveEnd;
        if (i15 != i16) {
            this.addressSpace.C(this.slotReserveUsedUpTo, i16);
            this.slotReserveStart = 0;
            this.slotReserveUsedUpTo = 0;
            this.slotReserveEnd = 0;
        }
    }

    private final int z(int group) {
        if (group < 0) {
            return 0;
        }
        int[] groups = this.addressSpace.getGroups();
        int i15 = this.slotCurrent;
        int i16 = this.slotStart;
        if (i15 <= i16) {
            groups[group + 5] = -1;
            return 0;
        }
        if (!this.inReservedRange) {
            int i17 = i15 - i16;
            int i18 = this.slotEnd - i16;
            if (i18 != i17) {
                this.addressSpace.B(group, i18, i17);
            }
            return i17;
        }
        int i19 = i15 - i16;
        int iK = p.k(i16, i19);
        if (i19 > 15) {
            this.addressSpace.v(i16, i19);
        }
        this.slotReserveUsedUpTo = i15;
        groups[group + 5] = iK;
        return i19;
    }

    public final void b(int flags) {
        int[] groups = this.addressSpace.getGroups();
        int i15 = this.parent;
        int i16 = flags | groups[i15 + 4];
        groups[i15 + 4] = i16;
        int iA = e.a(i16);
        if (iA != 0) {
            q qVar = this.addressSpace;
            int i17 = this.parent;
            int[] groups2 = qVar.getGroups();
            int i18 = groups2[i17 + 2];
            while (i18 > 0) {
                int i19 = i18 + 4;
                int i25 = groups[i19];
                if ((iA & i25) == iA) {
                    return;
                }
                groups[i19] = i25 | iA;
                i18 = groups2[i18 + 2];
            }
            if (i18 != 0) {
                return;
            }
            p076m2.t.b("Traversing parent of group not in the slot table: " + i17);
        }
    }

    public final void c(Object value) {
        int i15 = this.slotCurrent;
        if (i15 >= this.slotEnd) {
            A(value);
            return;
        }
        Object[] objArr = this.slots;
        this.slotCurrent = i15 + 1;
        objArr[i15] = value;
    }

    public final o d() {
        e();
        g();
        return this.table;
    }

    public final void f() {
        w();
    }

    public final void g() {
        this.isClosed = true;
    }

    public final void h() {
        this.recordSourceInformation = true;
        this.table.Z(true);
    }

    public final int i() {
        int root;
        int i15 = this.parent;
        int[] groups = this.addressSpace.getGroups();
        int i16 = i15 + 4;
        groups[i16] = this.nodeCount | (groups[i16] & (-8388608));
        z(i15);
        int iG = this.parentStack.g();
        this.parent = iG;
        int iG2 = this.previousSiblingStack.g();
        if (iG2 == -1) {
            root = iG == -1 ? this.table.getRoot() : groups[iG + 3];
        } else {
            root = groups[iG2 + 1];
        }
        this.previousSibling = root;
        x(this.parent);
        int i17 = groups[i16];
        int i18 = (i17 & 8388608) != 8388608 ? i17 & 8388607 : 1;
        this.nodeCount = (groups[this.parent + 4] & 8388607) + i18;
        return i18;
    }

    public final i j() {
        return this.addressSpace.d(getParent());
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final long l() {
        o1 o1Var = this.previousSiblingStack;
        return (((long) oq.b0.e(this.parent)) & BodyPartID.bodyIdMax) | (((long) (o1Var.tos == 0 ? -1 : o1Var.c())) << 32);
    }

    public final int m() {
        return this.slotCurrent - this.slotStart;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final o getTable() {
        return this.table;
    }

    public final Object o(int address) {
        int[] groups = this.addressSpace.getGroups();
        int i15 = groups[address + 4];
        return (i15 & 33554432) == 33554432 ? this.slots[(groups[address + 5] >> 4) + Integer.bitCount(25165824 & i15)] : p076m2.r.INSTANCE.a();
    }

    public final int p(int address) {
        return this.addressSpace.getGroups()[address];
    }

    public final Object q(int address) {
        int[] groups = this.addressSpace.getGroups();
        int i15 = groups[address + 4];
        if ((i15 & 16777216) == 16777216) {
            return this.slots[(groups[address + 5] >> 4) + Integer.bitCount(8388608 & i15)];
        }
        return null;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    public final boolean s() {
        return this.parent == -1;
    }

    public final long t() {
        int i15;
        int root = this.table.getRoot();
        int i16 = -1;
        if (root != -1) {
            q qVar = this.addressSpace;
            int root2 = this.table.getRoot();
            int[] groups = qVar.getGroups();
            int i17 = groups[root2 + 1];
            while (true) {
                i15 = i16;
                i16 = root;
                root = i17;
                if (root < 0) {
                    break;
                }
                i17 = groups[root + 1];
            }
            root = i16;
            i16 = i15;
        }
        return (((long) i16) << 32) | (((long) oq.b0.e(root)) & BodyPartID.bodyIdMax);
    }

    public final void u(t sourceEditor, long sourceHandle) {
        fr.t.c(sourceEditor.getAddressSpace(), this.addressSpace);
        long jM = sourceEditor.m();
        sourceEditor.F(sourceHandle);
        sourceEditor.C(false);
        sourceEditor.F(jM);
        int iB = f.b(sourceHandle);
        int[] groups = this.addressSpace.getGroups();
        int i15 = this.parent;
        int i16 = this.previousSibling;
        if (i16 != -1) {
            groups[i16 + 1] = iB;
        } else if (i15 == -1) {
            this.table.b0(iB);
        } else {
            groups[i15 + 3] = iB;
        }
        groups[iB + 2] = i15;
        groups[iB + 1] = -1;
        this.previousSibling = iB;
        int i17 = this.nodeCount;
        int i18 = groups[iB + 4];
        this.nodeCount = i17 + ((i18 & 8388608) == 8388608 ? 1 : 8388607 & i18);
        int iA = e.a(i18);
        if (iA != 0) {
            int[] groups2 = this.addressSpace.getGroups();
            int i19 = i15;
            while (i19 > 0) {
                int i25 = i19 + 4;
                int i26 = groups[i25];
                if ((i26 & iA) == iA) {
                    return;
                }
                groups[i25] = i26 | iA;
                i19 = groups2[i19 + 2];
            }
            if (i19 != 0) {
                return;
            }
            p076m2.t.b("Traversing parent of group not in the slot table: " + i15);
        }
    }

    public final int v(int address) {
        return this.addressSpace.getGroups()[address + 2];
    }

    public r(q qVar, boolean z15, boolean z16) {
        this(new o(0, qVar, z15, z16, 1, null), z15, z16);
    }
}
