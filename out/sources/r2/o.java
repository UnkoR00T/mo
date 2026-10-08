package r2;

import java.util.Iterator;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d4;
import p076m2.f4;
import p076m2.i5;
import p076m2.o1;
import p076m2.r2;
import p076m2.s2;
import r0.a1;
import r0.f1;
import r0.g1;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u001e\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u0000 12\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001UB/\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001f\u001a\u00020\t2\n\u0010\u001e\u001a\u00060\u0005j\u0002`\u001dH\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0086\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\t2\n\u0010&\u001a\u00060\u0005j\u0002`%¢\u0006\u0004\b'\u0010 J\u0019\u0010(\u001a\u00020\t2\n\u0010\u001e\u001a\u00060\u0005j\u0002`\u001d¢\u0006\u0004\b(\u0010 J\u001d\u0010+\u001a\u00020\t2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020!¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00100J5\u00109\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000208072\n\u00103\u001a\u0006\u0012\u0002\b\u0003022\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\t2\u0006\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020;H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-2\u0006\u0010B\u001a\u000208H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000eH\u0016¢\u0006\u0004\bE\u0010\u0010J\u0017\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ'\u0010J\u001a\u00020\t2\n\u0010?\u001a\u00060\u0005j\u0002`\u001d2\n\u0010>\u001a\u00060\u0005j\u0002`\u001dH\u0000¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u000eH\u0016¢\u0006\u0004\bL\u0010\u0010J\u000f\u0010M\u001a\u00020\u000eH\u0016¢\u0006\u0004\bM\u0010\u0010J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040NH\u0096\u0002¢\u0006\u0004\bO\u0010PJ\u001b\u0010Q\u001a\u00020\u00052\n\u0010\u001e\u001a\u00060\u0005j\u0002`\u001dH\u0000¢\u0006\u0004\bQ\u0010RJ\u001b\u0010S\u001a\u00020\u00052\n\u0010\u001e\u001a\u00060\u0005j\u0002`\u001dH\u0000¢\u0006\u0004\bS\u0010RJ\u001b\u0010T\u001a\u00020\u00052\n\u0010\u001e\u001a\u00060\u0005j\u0002`\u001dH\u0000¢\u0006\u0004\bT\u0010RR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\b`\u0010cR\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010`\u001a\u0004\be\u0010b\"\u0004\bf\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010gR\u0016\u0010i\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010VR$\u0010l\u001a\u00020\u00052\u0006\u0010j\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010V\u001a\u0004\bk\u0010XR\u0014\u0010p\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001c\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010r0q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0011\u0010w\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bv\u0010bR\u0014\u0010x\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010b¨\u0006y"}, d2 = {"Lr2/o;", "Lm2/i5;", "Le3/h;", "", "Le3/n;", "", "root", "Lr2/q;", "addressSpace", "", "recordSourceInformation", "recordCallByInformation", "<init>", "(ILr2/q;ZZ)V", "Loq/i0;", "i", "()V", "Lr2/b0;", "Y", "()Lr2/b0;", "reader", "w", "(Lr2/b0;)V", "Lr2/t;", "X", "()Lr2/t;", "editor", "v", "(Lr2/t;)V", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "x", "(I)Z", "Lr2/i;", "anchor", "z", "(Lr2/i;)Z", "Landroidx/compose/runtime/composer/linkbuffer/GroupFlags;", "flags", "A", "T", "groupAnchor", "childAnchor", "U", "(Lr2/i;Lr2/i;)Z", "Lo2/e;", "rememberManager", "e", "(Lo2/e;)V", "h", "Lm2/c;", "applier", "Lr0/a1;", "Lm2/s2;", "references", "Lr0/f1;", "Lm2/r2;", "l", "(Lm2/c;Lr0/a1;)Lr0/f1;", "Lm2/b;", "n", "(ILm2/b;)Z", "parent", "child", "o", "(Lm2/b;Lm2/b;)Z", "state", "k", "(Lo2/e;Lm2/r2;)V", "q", "Lm2/f4;", "scope", "s", "(Lm2/f4;)Z", "V", "(II)Z", "g", "f", "", "iterator", "()Ljava/util/Iterator;", "W", "(I)I", "B", ip.a.f96137b, "a", "I", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "()I", "b0", "(I)V", "b", "Lr2/q;", "C", "()Lr2/q;", "c", "Z", "M", "()Z", "(Z)V", "d", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "setRecordCallByInformation", "Lr2/t;", "currentEditor", "openReaders", "value", "R", "version", "", "E", "()[I", "groups", "", "", "Q", "()[Ljava/lang/Object;", "slots", "G", "hasEditor", "isEmpty", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends i5 implements e3.h, Iterable<e3.n>, gr.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f170794j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q addressSpace;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean recordSourceInformation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean recordCallByInformation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private t currentEditor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int openReaders;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int version;

    /* JADX INFO: renamed from: r2.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr2/o$a;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public o() {
        this(0, null, false, false, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] E() {
        return this.addressSpace.getGroups();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] Q() {
        return this.addressSpace.getSlots();
    }

    public final boolean A(int flags) {
        return !isEmpty() && (this.addressSpace.getGroups()[this.root + 4] & flags) == flags;
    }

    public final int B(int group) {
        return E()[group + 3];
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final q getAddressSpace() {
        return this.addressSpace;
    }

    public final boolean G() {
        return this.currentEditor != null;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getRecordCallByInformation() {
        return this.recordCallByInformation;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final boolean getRecordSourceInformation() {
        return this.recordSourceInformation;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final int getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final int S(int group) {
        return E()[group + 4];
    }

    public final boolean T(int group) {
        int i15;
        int[] groups = this.addressSpace.getGroups();
        Object[] slots = this.addressSpace.getSlots();
        q addressSpace = getAddressSpace();
        if (group < 0) {
            return false;
        }
        o1 o1Var = new o1();
        int[] groups2 = addressSpace.getGroups();
        int iG = group;
        while (a0.l(slots, groups[iG + 5]) == null) {
            if (iG != group && (i15 = groups2[iG + 1]) >= 0) {
                o1Var.i(i15);
            }
            iG = groups2[iG + 3];
            if (iG < 0) {
                if (o1Var.tos == 0) {
                    return false;
                }
                iG = o1Var.g();
            }
        }
        return true;
    }

    public final boolean U(i groupAnchor, i childAnchor) {
        if (!groupAnchor.a() || !childAnchor.a()) {
            return false;
        }
        if (fr.t.c(groupAnchor, childAnchor)) {
            return true;
        }
        q qVar = this.addressSpace;
        if (!qVar.u(childAnchor) || !qVar.u(groupAnchor)) {
            return false;
        }
        int address = groupAnchor.getAddress();
        int address2 = childAnchor.getAddress();
        if (!qVar.f(address) || !qVar.f(address2)) {
            return false;
        }
        int[] groups = qVar.getGroups();
        int i15 = groups[address2 + 2];
        while (i15 > 0) {
            if (i15 == address) {
                return true;
            }
            if (address <= 0) {
                return false;
            }
            i15 = groups[i15 + 2];
        }
        if (!(i15 != 0)) {
            p076m2.t.b("Traversing parent of group not in the slot table: " + address2);
        }
        return false;
    }

    public final boolean V(int child, int parent) {
        int[] groups = getAddressSpace().getGroups();
        int i15 = child;
        while (true) {
            if (i15 <= 0) {
                if (!(i15 != 0)) {
                    p076m2.t.b("Traversing parent of group not in the slot table: " + child);
                }
                return false;
            }
            if (i15 == parent) {
                return true;
            }
            i15 = groups[i15 + 2];
        }
    }

    public final int W(int group) {
        return E()[group + 1];
    }

    public final t X() {
        if (G()) {
            p076m2.t.b("Cannot start a writer when another writer is pending");
        }
        if (!(this.openReaders <= 0)) {
            p076m2.t.b("Cannot start a writer when a reader is pending");
        }
        this.version++;
        t tVar = new t(this);
        this.currentEditor = tVar;
        return tVar;
    }

    public final b0 Y() {
        if (G()) {
            p076m2.t.b("Cannot read while a writer is pending");
        }
        this.openReaders++;
        return new b0(this);
    }

    public final void Z(boolean z15) {
        this.recordSourceInformation = z15;
    }

    public final void b0(int i15) {
        this.root = i15;
    }

    @Override // p076m2.i5
    public void e(o2.e rememberManager) {
        t tVarX = X();
        try {
            a0.m(tVarX, rememberManager);
            i0 i0Var = i0.f148189a;
        } finally {
            tVarX.b();
        }
    }

    @Override // p076m2.i5
    public void f() {
        this.recordCallByInformation = true;
    }

    @Override // p076m2.i5
    public void g() {
        this.recordSourceInformation = true;
    }

    @Override // p076m2.i5
    public void h(o2.e rememberManager) {
        t tVarX = X();
        try {
            a0.g(tVarX, rememberManager);
            i0 i0Var = i0.f148189a;
        } finally {
            tVarX.b();
        }
    }

    @Override // p076m2.i5
    public void i() {
        int i15 = this.root;
        if (i15 != -1) {
            this.addressSpace.k(i15);
            this.root = -1;
        }
    }

    @Override // p076m2.i5
    public boolean isEmpty() {
        return this.root == -1;
    }

    @Override // java.lang.Iterable
    public Iterator<e3.n> iterator() {
        return new g(this, this.root);
    }

    @Override // p076m2.i5
    public void k(o2.e rememberManager, r2 state) {
        t tVarX = X();
        try {
            a0.m(tVarX, rememberManager);
            i0 i0Var = i0.f148189a;
        } finally {
            tVarX.b();
        }
    }

    @Override // p076m2.i5
    public f1<s2, r2> l(p076m2.c<?> applier, a1<s2> references) {
        t0 t0VarC = g1.c();
        t tVarX = X();
        try {
            Object[] objArr = references.content;
            int i15 = references._size;
            for (int i16 = 0; i16 < i15; i16++) {
                s2 s2Var = (s2) objArr[i16];
                i iVarC = j.c(s2Var.getAnchor());
                if (tVarX.getTable().z(iVarC)) {
                    tVarX.G(iVarC);
                    t0VarC.x(s2Var, a0.i(s2Var.getComposition(), s2Var, tVarX, applier));
                }
            }
            i0 i0Var = i0.f148189a;
            return t0VarC;
        } finally {
            tVarX.b();
        }
    }

    @Override // p076m2.i5
    public boolean n(int group, p076m2.b anchor) {
        i iVarC = j.c(anchor);
        return this.addressSpace.u(iVarC) && V(iVarC.getAddress(), group);
    }

    @Override // p076m2.i5
    public boolean o(p076m2.b parent, p076m2.b child) {
        return U(j.c(parent), j.c(child));
    }

    @Override // p076m2.i5
    public void q() {
        if (G()) {
            p076m2.t.b("Cannot read while an editor is pending");
        }
        q addressSpace = getAddressSpace();
        int root = getRoot();
        if (root < 0) {
            return;
        }
        o1 o1Var = new o1();
        int[] groups = addressSpace.getGroups();
        while (true) {
            int i15 = E()[root + 5];
            if (i15 != -1) {
                q addressSpace2 = getAddressSpace();
                int iC = (i15 & 15) + 1;
                int i16 = i15 >> 4;
                if (iC > 15) {
                    iC = addressSpace2.o().c(i16);
                }
                for (int i17 = 0; i17 < iC; i17++) {
                    Object obj = Q()[i16 + i17];
                    if (fr.t.c(obj, p076m2.r.INSTANCE.a())) {
                        break;
                    }
                    d4 d4Var = obj instanceof d4 ? (d4) obj : null;
                    if (d4Var != null) {
                        d4Var.invalidate();
                    }
                }
            }
            int i18 = groups[root + 1];
            if (i18 >= 0) {
                o1Var.i(i18);
            }
            root = groups[root + 3];
            if (root < 0) {
                if (o1Var.tos == 0) {
                    return;
                } else {
                    root = o1Var.g();
                }
            }
        }
    }

    @Override // p076m2.i5
    public boolean s(f4 scope) {
        p076m2.b anchor = scope.getAnchor();
        if (anchor != null) {
            i iVarC = j.c(anchor);
            if (this.addressSpace.u(iVarC) && V(iVarC.getAddress(), this.root)) {
                return true;
            }
        }
        return false;
    }

    public final void v(t editor) {
        if (!(this.currentEditor == editor)) {
            p076m2.t.b("Attempted to close an editor that was not the current editor");
        }
        this.currentEditor = null;
    }

    public final void w(b0 reader) {
        if (!(reader.getTable() == this && this.openReaders > 0)) {
            p076m2.t.b("Unexpected reader close()");
        }
        this.openReaders--;
    }

    public final boolean x(int group) {
        if (group >= 0 && this.addressSpace.f(group)) {
            int[] groups = this.addressSpace.getGroups();
            int i15 = groups[group + 2];
            while (true) {
                if (i15 <= 0) {
                    if (!(i15 != 0)) {
                        p076m2.t.b("Traversing parent of group not in the slot table: " + group);
                        break;
                    }
                    break;
                }
                if (i15 == this.root) {
                    return true;
                }
                i15 = groups[i15 + 2];
            }
        }
        return false;
    }

    public final boolean z(i anchor) {
        return anchor.a() && this.addressSpace.u(anchor) && x(anchor.getAddress());
    }

    public o(int i15, q qVar, boolean z15, boolean z16) {
        this.root = i15;
        this.addressSpace = qVar;
        this.recordSourceInformation = z15;
        this.recordCallByInformation = z16;
    }

    public /* synthetic */ o(int i15, q qVar, boolean z15, boolean z16, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? -1 : i15, (i16 & 2) != 0 ? new q() : qVar, (i16 & 4) != 0 ? false : z15, (i16 & 8) != 0 ? false : z16);
    }
}
