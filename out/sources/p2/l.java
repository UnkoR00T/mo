package p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d4;
import p076m2.f4;
import p076m2.h1;
import p076m2.i5;
import p076m2.r2;
import p076m2.s2;
import p076m2.t;
import p076m2.w3;
import r0.a1;
import r0.f1;
import r0.g1;
import r0.j0;
import r0.k0;
import r0.q0;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u000bJ\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010%J?\u0010+\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u00112&\u0010*\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u00010'j\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u0001`)H\u0000¢\u0006\u0004\b+\u0010,J\u008f\u0001\u0010;\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00142\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00072\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102012\u0006\u00104\u001a\u00020\u00072\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020\t05j\b\u0012\u0004\u0012\u00020\t`62&\u0010*\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u00010'j\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u0001`)2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108H\u0000¢\u0006\u0004\b;\u0010<J\u0087\u0001\u0010=\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00072\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102012\u0006\u00104\u001a\u00020\u00072\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020\t05j\b\u0012\u0004\u0012\u00020\t`62&\u0010*\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u00010'j\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u0001`)2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108H\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u001b¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u0004\u0018\u00010(2\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u000eH\u0016¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010H\u001a\u00020\u000eH\u0016¢\u0006\u0004\bH\u0010\u0006J\u0017\u0010I\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\bI\u0010\u0010J\u000f\u0010J\u001a\u00020\u000eH\u0016¢\u0006\u0004\bJ\u0010\u0006J5\u0010R\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020Q0P2\n\u0010L\u001a\u0006\u0012\u0002\b\u00030K2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0MH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010T\u001a\u00020QH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u000eH\u0016¢\u0006\u0004\bW\u0010\u0006J!\u0010Y\u001a\u0004\u0018\u0001022\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0007H\u0000¢\u0006\u0004\bY\u0010ZJ\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00040[H\u0096\u0002¢\u0006\u0004\b\\\u0010]R$\u0010/\u001a\u00020.2\u0006\u0010^\u001a\u00020.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR$\u00100\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR4\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102012\u000e\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR$\u00104\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bk\u0010d\u001a\u0004\bl\u0010fR\u0016\u0010m\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010dR\u0018\u0010p\u001a\u000602j\u0002`n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010oR$\u0010-\u001a\u00020\u001b2\u0006\u0010^\u001a\u00020\u001b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bq\u0010DR\"\u0010u\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010d\u001a\u0004\br\u0010f\"\u0004\bs\u0010tR2\u00107\u001a\u0012\u0012\u0004\u0012\u00020\t05j\b\u0012\u0004\u0012\u00020\t`68\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{RC\u0010*\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u00010'j\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u0001`)8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\bU\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R/\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bR\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0086\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010D¨\u0006\u0087\u0001"}, d2 = {"Lp2/l;", "Lm2/i5;", "Le3/h;", "", "Le3/n;", "<init>", "()V", "", "index", "Lp2/c;", "b0", "(I)Lp2/c;", "Lo2/e;", "rememberManager", "Loq/i0;", "e", "(Lo2/e;)V", "Lp2/j;", "U", "()Lp2/j;", "Lp2/o;", "V", "()Lp2/o;", "u", "anchor", "v", "(Lp2/c;)I", "", "W", "(Lp2/c;)Z", "group", "Lm2/b;", "n", "(ILm2/b;)Z", "parent", "child", "o", "(Lm2/b;Lm2/b;)Z", "reader", "Ljava/util/HashMap;", "Lp2/e;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "w", "(Lp2/j;Ljava/util/HashMap;)V", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Lr0/j0;", "Lr0/k0;", "calledByMap", "x", "(Lp2/o;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lr0/j0;)V", "X", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lr0/j0;)V", "Lm2/f4;", "scope", "s", "(Lm2/f4;)Z", "z", "()Z", "Z", "(I)Lp2/e;", "f", "g", "h", "i", "Lm2/c;", "applier", "Lr0/a1;", "Lm2/s2;", "references", "Lr0/f1;", "Lm2/r2;", "l", "(Lm2/c;Lr0/a1;)Lr0/f1;", "state", "k", "(Lo2/e;Lm2/r2;)V", "q", "slotIndex", "Y", "(II)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "value", "a", "[I", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()[I", "b", "I", "M", "()I", "c", "[Ljava/lang/Object;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "()[Ljava/lang/Object;", "d", "Q", "readers", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "lock", "T", ip.a.f96137b, "setVersion$runtime", "(I)V", "version", "j", "Ljava/util/ArrayList;", "E", "()Ljava/util/ArrayList;", "setAnchors$runtime", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "R", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime", "(Ljava/util/HashMap;)V", "Lr0/j0;", "G", "()Lr0/j0;", "setCalledByMap$runtime", "(Lr0/j0;)V", "isEmpty", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends i5 implements e3.h, Iterable<e3.n>, gr.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int groupsSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int slotsSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int readers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean writer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int version;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private HashMap<c, e> sourceInformationMap;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private j0<k0> calledByMap;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] groups = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object[] slots = new Object[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private ArrayList<c> anchors = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer A(l lVar, s2 s2Var) {
        return Integer.valueOf(lVar.v(d.a(s2Var.getAnchor())));
    }

    private static final void B(SlotWriter slotWriter, int i15) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i15) {
            slotWriter.d1();
            slotWriter.S();
        }
    }

    private static final void C(SlotWriter slotWriter, int i15) {
        B(slotWriter, i15);
        while (slotWriter.getCurrentGroup() != i15 && !slotWriter.u0()) {
            if (i15 < n.r(slotWriter)) {
                slotWriter.m1();
            } else {
                slotWriter.c1();
            }
        }
        if (!(slotWriter.getCurrentGroup() == i15)) {
            t.b("Unexpected slot table structure");
        }
        slotWriter.m1();
    }

    private final c b0(int index) {
        int i15;
        if (this.writer) {
            t.b("use active SlotWriter to crate an anchor for location instead");
        }
        if (index < 0 || index >= (i15 = this.groupsSize)) {
            return null;
        }
        return n.q(this.anchors, index, i15);
    }

    public final ArrayList<c> E() {
        return this.anchors;
    }

    public final j0<k0> G() {
        return this.calledByMap;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final int[] getGroups() {
        return this.groups;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final Object[] getSlots() {
        return this.slots;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final HashMap<c, e> R() {
        return this.sourceInformationMap;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final SlotReader U() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter V() {
        if (this.writer) {
            t.b("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            t.b("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean W(c anchor) {
        int iW;
        return anchor.a() && (iW = n.w(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && fr.t.c(this.anchors.get(iW), anchor);
    }

    public final void X(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<c> anchors, HashMap<c, e> sourceInformationMap, j0<k0> calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public final Object Y(int group, int slotIndex) {
        int iX = n.x(this.groups, group);
        int i15 = group + 1;
        return (slotIndex < 0 || slotIndex >= (i15 < this.groupsSize ? this.groups[(i15 * 5) + 4] : this.slots.length) - iX) ? p076m2.r.INSTANCE.a() : this.slots[iX + slotIndex];
    }

    public final e Z(int group) {
        c cVarB0;
        HashMap<c, e> map = this.sourceInformationMap;
        if (map == null || (cVarB0 = b0(group)) == null) {
            return null;
        }
        return map.get(cVarB0);
    }

    @Override // p076m2.i5
    public void e(o2.e rememberManager) {
        SlotWriter slotWriterV = V();
        try {
            t.l(slotWriterV, rememberManager);
            i0 i0Var = i0.f148189a;
            boolean z15 = true;
        } finally {
            slotWriterV.K(false);
        }
    }

    @Override // p076m2.i5
    public void f() {
        this.calledByMap = new j0<>(0, 1, null);
    }

    @Override // p076m2.i5
    public void g() {
        this.sourceInformationMap = new HashMap<>();
    }

    @Override // p076m2.i5
    public void h(o2.e rememberManager) {
        SlotWriter slotWriterV = V();
        try {
            h1.u(slotWriterV, rememberManager);
            i0 i0Var = i0.f148189a;
            boolean z15 = true;
        } finally {
            slotWriterV.K(false);
        }
    }

    @Override // p076m2.i5
    public void i() {
    }

    @Override // p076m2.i5
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<e3.n> iterator() {
        return new f(this, 0, this.groupsSize);
    }

    @Override // p076m2.i5
    public void k(o2.e rememberManager, r2 state) {
        SlotWriter slotWriterV = V();
        try {
            t.l(slotWriterV, rememberManager);
            i0 i0Var = i0.f148189a;
            boolean z15 = true;
        } finally {
            slotWriterV.K(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p076m2.i5
    public f1<s2, r2> l(p076m2.c<?> applier, a1<s2> references) {
        Object[] objArr = references.content;
        int i15 = references._size;
        Object[] objArr2 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z15 = false;
        int i18 = 0;
        while (true) {
            boolean z16 = true;
            char c15 = 1;
            if (i18 >= i15) {
                break;
            }
            if (!W(d.a(((s2) objArr[i18]).getAnchor()))) {
                q0 q0Var = new q0(objArr2 == true ? 1 : 0, c15 == true ? 1 : 0, null);
                Object[] objArr3 = references.content;
                int i19 = references._size;
                for (int i25 = i16; i25 < i19; i25++) {
                    Object obj = objArr3[i25];
                    if (W(d.a(((s2) obj).getAnchor()))) {
                        q0Var.n(obj);
                    }
                }
                references = q0Var;
                break;
            }
            i18++;
        }
        a1 a1VarD = n2.a.d(references, new er.l() { // from class: p2.k
            @Override // er.l
            public final Object b(Object obj2) {
                return l.A(this.f151701a, (s2) obj2);
            }
        });
        if (a1VarD.g()) {
            return g1.a();
        }
        t0 t0VarC = g1.c();
        SlotWriter slotWriterV = V();
        try {
            Object[] objArr4 = a1VarD.content;
            int i26 = a1VarD._size;
            for (int i27 = i17; i27 < i26; i27++) {
                s2 s2Var = (s2) objArr4[i27];
                int iC = slotWriterV.C(d.a(s2Var.getAnchor()));
                int iL0 = slotWriterV.L0(iC);
                B(slotWriterV, iL0);
                C(slotWriterV, iL0);
                slotWriterV.A(iC - slotWriterV.getCurrentGroup());
                t0VarC.x(s2Var, t.d(s2Var.getComposition(), s2Var, slotWriterV, applier));
            }
            B(slotWriterV, Integer.MAX_VALUE);
            i0 i0Var = i0.f148189a;
            return t0VarC;
        } finally {
            slotWriterV.K(z15);
        }
    }

    @Override // p076m2.i5
    public boolean n(int group, p076m2.b anchor) {
        if (this.writer) {
            t.b("Writer is active");
        }
        if (!(group >= 0 && group < this.groupsSize)) {
            t.b("Invalid group index");
        }
        c cVarA = d.a(anchor);
        if (W(cVarA)) {
            int iS = n.s(this.groups, group) + group;
            int location = cVarA.getLocation();
            if (group <= location && location < iS) {
                return true;
            }
        }
        return false;
    }

    @Override // p076m2.i5
    public boolean o(p076m2.b parent, p076m2.b child) {
        int location = d.a(parent).getLocation();
        int iS = n.s(this.groups, location) + location;
        int location2 = d.a(child).getLocation();
        return location <= location2 && location2 < iS;
    }

    @Override // p076m2.i5
    public void q() {
        for (Object obj : this.slots) {
            d4 d4Var = obj instanceof d4 ? (d4) obj : null;
            if (d4Var != null) {
                d4Var.invalidate();
            }
        }
    }

    @Override // p076m2.i5
    public boolean s(f4 scope) {
        p076m2.b anchor = scope.getAnchor();
        return anchor != null && W(d.a(anchor));
    }

    public final c u(int index) {
        if (this.writer) {
            t.b("use active SlotWriter to create an anchor location instead");
        }
        boolean z15 = false;
        if (index >= 0 && index < this.groupsSize) {
            z15 = true;
        }
        if (!z15) {
            w3.a("Parameter index is out of range");
        }
        ArrayList<c> arrayList = this.anchors;
        int iW = n.w(arrayList, index, this.groupsSize);
        if (iW >= 0) {
            return arrayList.get(iW);
        }
        c cVar = new c(index);
        arrayList.add(-(iW + 1), cVar);
        return cVar;
    }

    public final int v(c anchor) {
        if (this.writer) {
            t.b("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.a()) {
            w3.a("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }

    public final void w(SlotReader reader, HashMap<c, e> sourceInformationMap) {
        if (!(reader.getTable() == this && this.readers > 0)) {
            t.b("Unexpected reader close()");
        }
        this.readers--;
        if (sourceInformationMap != null) {
            synchronized (this.lock) {
                try {
                    HashMap<c, e> map = this.sourceInformationMap;
                    if (map != null) {
                        map.putAll(sourceInformationMap);
                    } else {
                        this.sourceInformationMap = sourceInformationMap;
                    }
                    i0 i0Var = i0.f148189a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public final void x(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<c> anchors, HashMap<c, e> sourceInformationMap, j0<k0> calledByMap) {
        if (!(writer.getTable() == this && this.writer)) {
            w3.a("Unexpected writer close()");
        }
        this.writer = false;
        X(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }

    public final boolean z() {
        return this.groupsSize > 0 && (this.groups[1] & 67108864) != 0;
    }
}
