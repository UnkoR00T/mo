package r2;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.g2;
import p076m2.o1;
import p076m2.v4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u0001:\u0001HB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0011\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\t2\f\b\u0002\u0010\b\u001a\u00060\u0006j\u0002`\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u001a\u0010\u0014J\u0019\u0010\u001b\u001a\u00020\u000f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00062\n\u0010\u001d\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u001e\u0010\u0014J\u0019\u0010\u001f\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u001f\u0010\u0014J\u0019\u0010 \u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b \u0010\u0014J\u0011\u0010#\u001a\u00060!j\u0002`\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010&J\u0017\u0010*\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010\u000bJ/\u00101\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00022\n\u0010/\u001a\u00060!j\u0002`\"2\f\b\u0002\u00100\u001a\u00060!j\u0002`\"¢\u0006\u0004\b1\u00102J3\u00104\u001a\u00060!j\u0002`\"2\u0006\u00103\u001a\u00020\u00002\n\u0010/\u001a\u00060!j\u0002`\"2\f\b\u0002\u00100\u001a\u00060!j\u0002`\"¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0019\u0010=\u001a\u00020\t2\n\u0010<\u001a\u00060!j\u0002`\"¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b@\u0010AJ%\u0010D\u001a\u0004\u0018\u00010\u00012\n\u0010C\u001a\u00060\u0006j\u0002`B2\b\u0010?\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bD\u0010EJ!\u0010G\u001a\u0004\u0018\u00010\u00012\u0006\u0010F\u001a\u00020\u00062\b\u0010?\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bG\u0010EJ\u0017\u0010H\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bH\u0010AJ\u0015\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010\u000bJ\u0019\u0010L\u001a\u00020\u000f2\n\u0010K\u001a\u00060!j\u0002`\"¢\u0006\u0004\bL\u0010MJ!\u0010Q\u001a\u00020\t2\n\u0010N\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ7\u0010U\u001a\u00020\t2\n\u0010N\u001a\u00060\u0006j\u0002`\u00072\n\u0010S\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010T\u001a\u00020\u00062\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\bU\u0010VJ\u0019\u0010Y\u001a\u00020\t2\n\u0010X\u001a\u00060\u0006j\u0002`W¢\u0006\u0004\bY\u0010\u000bJ\r\u0010Z\u001a\u00020\t¢\u0006\u0004\bZ\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010[\u001a\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010GR\u0016\u0010_\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010GR\u001a\u0010d\u001a\u00020`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010a\u001a\u0004\bb\u0010cR$\u0010h\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010e\u001a\u0004\bf\u0010gR$\u0010j\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010G\u001a\u0004\bi\u00107R\u0011\u0010l\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bk\u00107R\u0011\u0010n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bm\u00107R\u0011\u0010p\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bo\u0010gR\u0011\u0010r\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bq\u0010gR\u0013\u0010u\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0011\u0010w\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bv\u0010g¨\u0006x"}, d2 = {"Lr2/t;", "", "Lr2/o;", "table", "<init>", "(Lr2/o;)V", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "Loq/i0;", "n", "(I)V", "nodeCountDelta", "flagsToRemove", "flagsToAdd", "", "removingGroup", "A", "(IIIIZ)V", "l", "(I)I", "x", "(I)Ljava/lang/Object;", "newValue", "N", "(ILjava/lang/Object;)V", "f", "r", "(I)Z", "groups", "y", "z", "e", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "m", "()J", "b", "()V", "K", "d", "freeGroup", "C", "(Z)V", "offset", "w", "sourceTable", "sourceHandle", "destination", "u", "(Lr2/o;JJ)V", "sourceEditor", "t", "(Lr2/t;JJ)J", "J", "()I", "Lr2/i;", "anchor", "G", "(Lr2/i;)V", "handle", "F", "(J)V", "value", "M", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/composer/linkbuffer/SlotAddress;", "slotAddress", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(ILjava/lang/Object;)Ljava/lang/Object;", "index", "I", "a", "slots", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "groupHandle", "c", "(J)Z", "inGroup", "Lr2/t$a;", "callback", "O", "(ILr2/t$a;)V", "firstTailGroupToVisit", "tailSlots", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(IIILr2/t$a;)V", "Landroidx/compose/runtime/composer/linkbuffer/GroupFlags;", "flags", "B", "E", "Lr2/o;", "k", "()Lr2/o;", "parent", "current", "Lr2/q;", "Lr2/q;", "g", "()Lr2/q;", "addressSpace", "Z", "o", "()Z", "isClosed", "getPreviousSibling", "previousSibling", "h", "currentGroup", "j", "parentGroup", "q", "isNode", "p", "isEmpty", "i", "()Ljava/lang/Object;", "node", "s", "isParentGroupANode", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o table;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int current;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q addressSpace;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int parent = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int previousSibling = -1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lr2/t$a;", "", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "slotIndex", "slot", "", "a", "(IILjava/lang/Object;)Z", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        boolean a(int group, int slotIndex, Object slot);
    }

    public t(o oVar) {
        this.table = oVar;
        this.current = oVar.getRoot();
        this.addressSpace = oVar.getAddressSpace();
    }

    private final void A(int group, int nodeCountDelta, int flagsToRemove, int flagsToAdd, boolean removingGroup) {
        int i15;
        int i16;
        int[] groups = this.addressSpace.getGroups();
        int[] groups2 = this.addressSpace.getGroups();
        int i17 = groups2[group + 2];
        while (true) {
            if (i17 <= 0) {
                if (i17 != 0) {
                    return;
                }
                p076m2.t.b("Traversing parent of group not in the slot table: " + group);
                return;
            }
            int i18 = i17 + 4;
            int i19 = groups[i18];
            if (nodeCountDelta != 0) {
                i19 = (i19 & (-8388608)) | ((8388607 & i19) + nodeCountDelta);
                groups[i18] = i19;
                if ((i19 & 8388608) == 8388608) {
                    nodeCountDelta = 0;
                }
            }
            if (flagsToRemove == 0) {
                i15 = 0;
                break;
            }
            int i25 = (flagsToRemove >> 1) | flagsToRemove;
            int[] groups3 = this.addressSpace.getGroups();
            int i26 = groups3[i17 + 3];
            while (true) {
                if (i26 <= 0) {
                    i15 = flagsToRemove;
                    break;
                } else {
                    if ((!removingGroup || i26 != group) && (groups[i26 + 4] & i25) != 0) {
                        i15 = 0;
                        break;
                    }
                    i26 = groups3[i26 + 1];
                }
            }
            if ((i15 == 0 && flagsToAdd == 0) || (i16 = ((~i15) & i19) | flagsToAdd) == i19) {
                flagsToAdd = 0;
            } else {
                groups[i18] = i16;
                flagsToRemove = i15;
            }
            if (nodeCountDelta == 0 && flagsToRemove == 0 && flagsToAdd == 0) {
                return;
            } else {
                i17 = groups2[i17 + 2];
            }
        }
    }

    public static /* synthetic */ void D(t tVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        tVar.C(z15);
    }

    private final void n(int group) {
        int i15 = this.previousSibling;
        int i16 = this.parent;
        int[] groups = this.addressSpace.getGroups();
        if (i15 != -1) {
            groups[i15 + 1] = group;
        } else if (i16 == -1) {
            this.table.b0(group);
        } else {
            groups[i16 + 3] = group;
        }
        groups[group + 2] = i16;
        groups[group + 1] = this.current;
        int i17 = groups[group + 4];
        int i18 = (i17 & 8388608) != 8388608 ? i17 & 8388607 : 1;
        this.current = group;
        A(group, i18, 0, e.a(i17), false);
    }

    public static /* synthetic */ void v(t tVar, o oVar, long j15, long j16, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            j16 = -1;
        }
        tVar.u(oVar, j15, j16);
    }

    public final void B(int flags) {
        boolean z15;
        int iA = flags | e.a(flags);
        q qVar = this.addressSpace;
        int[] groups = qVar.getGroups();
        int root = this.table.getRoot();
        if (root < 0) {
            return;
        }
        o1 o1Var = new o1();
        int[] groups2 = qVar.getGroups();
        while (true) {
            int i15 = root + 4;
            int i16 = groups[i15];
            if ((iA & i16) == 0) {
                z15 = false;
            } else {
                groups[i15] = i16 & (~iA);
                z15 = true;
            }
            int i17 = groups2[root + 1];
            if (i17 >= 0) {
                o1Var.i(i17);
            }
            root = groups2[root + 3];
            if (!z15 || root < 0) {
                if (o1Var.tos == 0) {
                    return;
                } else {
                    root = o1Var.g();
                }
            }
        }
    }

    public final void C(boolean freeGroup) {
        int[] groups = this.addressSpace.getGroups();
        int i15 = this.current;
        int i16 = groups[i15 + 4];
        A(i15, -((i16 & 8388608) == 8388608 ? 1 : 8388607 & i16), e.a(i16), 0, true);
        int i17 = groups[i15 + 1];
        int i18 = this.previousSibling;
        if (i18 == -1) {
            int i19 = this.parent;
            if (i19 == -1) {
                this.table.b0(i17);
            } else {
                groups[i19 + 3] = i17;
            }
        } else {
            groups[i18 + 1] = i17;
        }
        if (freeGroup) {
            this.addressSpace.k(i15);
        }
        this.current = i17;
    }

    public final void E() {
        this.parent = -1;
        this.previousSibling = -1;
        this.current = this.table.getRoot();
    }

    public final void F(long handle) {
        c(handle);
        int iA = f.a(handle);
        int[] groups = this.addressSpace.getGroups();
        int iB = f.b(handle);
        int i15 = iB == -1 ? iA : groups[iB + 2];
        if (iB == -1) {
            iA = -1;
        }
        this.parent = i15;
        this.current = iB;
        if (iA != -1 ? groups[iA + 1] != iB : !(i15 != -1 ? groups[i15 + 3] == iB : this.table.getRoot() == iB)) {
            int[] groups2 = this.addressSpace.getGroups();
            int i16 = -1;
            for (int root = i15 == -1 ? this.table.getRoot() : groups[i15 + 3]; root >= 0 && root != iB; root = groups2[root + 1]) {
                i16 = root;
            }
            iA = i16;
        }
        if (iA != -1) {
            int i17 = groups[iA + 1];
        } else if (i15 == -1) {
            this.table.getRoot();
        } else {
            int i18 = groups[i15 + 3];
        }
        this.previousSibling = iA;
    }

    public final void G(i anchor) {
        F((((long) 0) << 32) | (((long) oq.b0.e(anchor.getAddress())) & BodyPartID.bodyIdMax));
    }

    public final Object H(int slotAddress, Object value) {
        Object[] slots = this.addressSpace.getSlots();
        if (slotAddress >= 0) {
            int length = slots.length;
        }
        Object obj = slots[slotAddress];
        slots[slotAddress] = value;
        return obj;
    }

    public final Object I(int index, Object value) {
        return H((this.addressSpace.getGroups()[this.parent + 5] >> 4) + index, value);
    }

    public final int J() {
        int i15 = this.current;
        if (i15 == -1) {
            throw new IllegalStateException("Skipping past the end of a group");
        }
        this.previousSibling = i15;
        this.current = this.addressSpace.getGroups()[i15 + 1];
        int i16 = this.addressSpace.getGroups()[i15 + 4];
        if ((i16 & 8388608) == 8388608) {
            return 1;
        }
        return i16 & 8388607;
    }

    public final void K() {
        int i15 = this.current;
        if (!(i15 > 0)) {
            p076m2.t.b("Cannot start a group because current does not refer to a child of a group");
        }
        this.parent = i15;
        int[] groups = this.addressSpace.getGroups();
        if (i15 + 6 > groups.length) {
            return;
        }
        this.current = groups[i15 + 3];
        this.previousSibling = -1;
    }

    public final void L(int slots) {
        int iC;
        q qVar = this.addressSpace;
        int i15 = this.parent;
        int[] groups = qVar.getGroups();
        int i16 = groups[i15 + 5];
        if (i16 == -1) {
            iC = 0;
        } else {
            iC = (i16 & 15) + 1;
            if (iC > 15) {
                iC = qVar.o().c(i16 >> 4);
            }
        }
        int i17 = iC - slots;
        if (!(i17 >= e.b(groups[i15 + 4]))) {
            p076m2.t.b("Attempted to trim more slots than the group has");
        }
        qVar.A(i15, i17);
    }

    public final void M(Object value) {
        int[] groups = this.addressSpace.getGroups();
        int i15 = this.current;
        this.addressSpace.getSlots()[(groups[i15 + 5] >> 4) + Integer.bitCount(25165824 & groups[i15 + 4])] = value;
    }

    public final void N(int group, Object newValue) {
        q qVar = this.addressSpace;
        int[] groups = qVar.getGroups();
        Object[] slots = qVar.getSlots();
        int i15 = groups[group + 4];
        slots[groups[group + 5] >> 4] = newValue;
    }

    public final void O(int inGroup, a callback) {
        if (inGroup < 0) {
            return;
        }
        int[] groups = this.addressSpace.getGroups();
        Object[] slots = this.addressSpace.getSlots();
        int i15 = groups[inGroup + 5];
        int i16 = -1;
        if (i15 != -1) {
            q qVar = this.addressSpace;
            int iC = (i15 & 15) + 1;
            int i17 = i15 >> 4;
            if (iC > 15) {
                iC = qVar.o().c(i17);
            }
            int i18 = iC + i17;
            for (int i19 = i17; i19 < i18; i19++) {
                int i25 = i19 - i17;
                Object obj = slots[i19];
                if (obj instanceof v4) {
                    int address = g2.k((v4) obj).getAfter().getAddress();
                    while (i16 != address) {
                        i16 = i16 < 0 ? groups[inGroup + 3] : groups[i16 + 1];
                        if (!(i16 >= 0)) {
                            p076m2.t.b("A RememberObserver cannot be forgotten correctly because its group ordering metadata is inconsistent with the rest of the SlotTable");
                        }
                        O(i16, callback);
                    }
                }
                if (callback.a(inGroup, i25, obj)) {
                    slots[i25 + i17] = p076m2.r.INSTANCE.a();
                }
            }
        }
        for (int i26 = i16 < 0 ? groups[inGroup + 3] : groups[i16 + 1]; i26 >= 0; i26 = groups[i26 + 1]) {
            O(i26, callback);
        }
    }

    public final void P(int inGroup, int firstTailGroupToVisit, int tailSlots, a callback) {
        int iC;
        if (inGroup < 0) {
            return;
        }
        int[] groups = this.addressSpace.getGroups();
        Object[] slots = this.addressSpace.getSlots();
        int i15 = groups[inGroup + 5];
        int i16 = i15 >> 4;
        q qVar = this.addressSpace;
        int i17 = -1;
        if (i15 == -1) {
            iC = 0;
        } else {
            iC = (i15 & 15) + 1;
            if (iC > 15) {
                iC = qVar.o().c(i16);
            }
        }
        int i18 = (iC + i16) - tailSlots;
        int i19 = i18 + tailSlots;
        boolean z15 = false;
        for (int i25 = i18; i25 < i19; i25++) {
            int i26 = i25 - i18;
            Object obj = slots[i25];
            if (obj instanceof v4) {
                int address = g2.k((v4) obj).getAfter().getAddress();
                while (i17 != address) {
                    i17 = i17 < 0 ? groups[inGroup + 3] : groups[i17 + 1];
                    if (!(i17 >= 0)) {
                        p076m2.t.b("A RememberObserver cannot be forgotten correctly because its group ordering metadata is inconsistent with the rest of the SlotTable");
                    }
                    z15 |= firstTailGroupToVisit == i17;
                    if (z15) {
                        O(i17, callback);
                    }
                }
            }
            if (callback.a(inGroup, i26, obj)) {
                slots[i26 + i16] = p076m2.r.INSTANCE.a();
            }
        }
        int i27 = i17 < 0 ? groups[inGroup + 3] : groups[i17 + 1];
        while (i27 >= 0) {
            z15 |= firstTailGroupToVisit == i27;
            if (z15) {
                O(i27, callback);
            }
            i27 = groups[i27 + 1];
        }
    }

    public final void a(Object value) {
        int[] groups = this.addressSpace.getGroups();
        int i15 = this.parent;
        int i16 = groups[i15 + 5];
        if (i16 == -1) {
            this.addressSpace.G(i15, 0, value);
            return;
        }
        q qVar = this.addressSpace;
        int iC = (i16 & 15) + 1;
        int i17 = i16 >> 4;
        if (iC > 15) {
            iC = qVar.o().c(i17);
        }
        this.addressSpace.G(i15, iC, value);
    }

    public final void b() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.table.v(this);
    }

    public final boolean c(long groupHandle) {
        int iB = f.b(groupHandle);
        if (iB == -1) {
            iB = f.a(groupHandle);
        }
        if (iB == -1) {
            return false;
        }
        int root = this.table.getRoot();
        int[] groups = this.addressSpace.getGroups();
        int[] groups2 = this.addressSpace.getGroups();
        int i15 = iB;
        while (true) {
            if (i15 <= 0) {
                if (!(i15 != 0)) {
                    p076m2.t.b("Traversing parent of group not in the slot table: " + iB);
                }
                return false;
            }
            if (i15 == root) {
                return true;
            }
            if (i15 <= 0) {
                return false;
            }
            int i16 = i15 + 2;
            if (groups[i16] == -1) {
                int[] groups3 = this.addressSpace.getGroups();
                for (int i17 = root; i17 >= 0; i17 = groups3[i17 + 1]) {
                    if (i17 == i15) {
                        return true;
                    }
                }
            }
            i15 = groups2[i16];
        }
    }

    public final void d() {
        int i15 = this.parent;
        int[] groups = this.addressSpace.getGroups();
        if (i15 + 6 > groups.length) {
            return;
        }
        int i16 = groups[i15 + 1];
        this.parent = groups[i15 + 2];
        this.previousSibling = i15;
        this.current = i16;
    }

    public final int e(int group) {
        return this.addressSpace.getGroups()[group + 3];
    }

    public final int f(int group) {
        return this.addressSpace.getGroups()[group + 4];
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final q getAddressSpace() {
        return this.addressSpace;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    public final Object i() {
        return x(this.current);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final o getTable() {
        return this.table;
    }

    public final int l(int group) {
        return this.addressSpace.getGroups()[group];
    }

    public final long m() {
        return (((long) oq.b0.e(this.current)) & BodyPartID.bodyIdMax) | (((long) this.previousSibling) << 32);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    public final boolean p() {
        return this.table.isEmpty();
    }

    public final boolean q() {
        return (this.addressSpace.getGroups()[this.current + 4] & 8388608) == 8388608;
    }

    public final boolean r(int group) {
        return (f(group) & 8388608) == 8388608;
    }

    public final boolean s() {
        return (this.addressSpace.getGroups()[this.parent + 4] & 8388608) == 8388608;
    }

    public final long t(t sourceEditor, long sourceHandle, long destination) {
        int iB;
        long jM;
        sourceEditor.F(sourceHandle);
        if (fr.t.c(sourceEditor.addressSpace, this.addressSpace)) {
            iB = f.b(sourceHandle);
            sourceEditor.C(false);
        } else {
            iB = this.addressSpace.g(sourceEditor.addressSpace, f.b(sourceHandle));
            sourceEditor.C(true);
        }
        if (destination != -1) {
            jM = m();
            F(destination);
        } else {
            jM = -1;
        }
        int i15 = this.previousSibling;
        n(iB);
        this.previousSibling = i15;
        this.current = iB;
        long jE = (((long) i15) << 32) | (((long) oq.b0.e(iB)) & BodyPartID.bodyIdMax);
        if (jM != -1) {
            F(jM);
        }
        if (this.table.getRecordSourceInformation()) {
            this.addressSpace.w(iB, i15);
        }
        return jE;
    }

    public final void u(o sourceTable, long sourceHandle, long destination) {
        t tVarX = sourceTable.X();
        try {
            t(tVarX, sourceHandle, destination);
        } finally {
            tVarX.b();
        }
    }

    public final void w(int offset) {
        if (offset == 0) {
            return;
        }
        int i15 = this.current;
        int i16 = this.previousSibling;
        int[] groups = this.addressSpace.getGroups();
        int i17 = 0;
        int i18 = i15;
        int i19 = i16;
        while (i17 < offset) {
            int i25 = groups[i18 + 1];
            if (i25 == -1) {
                throw new IllegalStateException(("Offset(" + offset + ") too large").toString());
            }
            i17++;
            i19 = i18;
            i18 = i25;
        }
        int i26 = i18 + 1;
        groups[i19 + 1] = groups[i26];
        groups[i26] = i15;
        if (i16 == -1) {
            groups[this.parent + 3] = i18;
        } else {
            groups[i16 + 1] = i18;
        }
        this.current = i18;
    }

    public final Object x(int group) {
        int[] groups = this.addressSpace.getGroups();
        if ((groups[group + 4] & 8388608) == 8388608) {
            return this.addressSpace.getSlots()[groups[group + 5] >> 4];
        }
        return null;
    }

    public final int y(int groups) {
        int i15 = this.addressSpace.getGroups()[groups + 4];
        if ((i15 & 8388608) == 8388608) {
            return 1;
        }
        return i15 & 8388607;
    }

    public final int z(int group) {
        return this.addressSpace.getGroups()[group + 2];
    }
}
