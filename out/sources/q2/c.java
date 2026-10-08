package q2;

import er.l;
import er.p;
import java.util.ArrayList;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.e1;
import p076m2.e6;
import p076m2.f4;
import p076m2.l0;
import p076m2.o1;
import p076m2.r2;
import p076m2.s2;
import p076m2.t;
import p076m2.u;
import p076m2.v;
import p076m2.v4;
import p2.SlotReader;
import y2.IntRef;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u00017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nJ\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b0\u0010/J\u0015\u00101\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b1\u0010/J\u001f\u00103\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u00102\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J'\u00105\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0018¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b9\u0010%J\r\u0010:\u001a\u00020\b¢\u0006\u0004\b:\u0010\nJ\u0017\u0010<\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\b¢\u0006\u0004\b>\u0010\nJ\r\u0010?\u001a\u00020\b¢\u0006\u0004\b?\u0010\nJ\r\u0010@\u001a\u00020\b¢\u0006\u0004\b@\u0010\nJ\r\u0010A\u001a\u00020\b¢\u0006\u0004\bA\u0010\nJ\u001d\u0010C\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020B¢\u0006\u0004\bC\u0010DJ%\u0010G\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020B2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u00020\u0018¢\u0006\u0004\bJ\u0010%J)\u0010O\u001a\u00020\b2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\b0K2\u0006\u0010N\u001a\u00020L¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\b2\b\u0010Q\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bR\u0010=J;\u0010V\u001a\u00020\b\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010S2\u0006\u0010)\u001a\u00028\u00012\u0018\u0010U\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0T¢\u0006\u0004\bV\u0010WJ\u001d\u0010Y\u001a\u00020\b2\u0006\u0010X\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bY\u0010\u001cJ%\u0010Z\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bZ\u0010!J\r\u0010[\u001a\u00020\b¢\u0006\u0004\b[\u0010\nJ\r\u0010\\\u001a\u00020\b¢\u0006\u0004\b\\\u0010\nJ\u001d\u0010^\u001a\u00020\b2\u0006\u0010X\u001a\u00020\u00182\u0006\u0010]\u001a\u00020\u0018¢\u0006\u0004\b^\u0010\u001cJ\r\u0010_\u001a\u00020\b¢\u0006\u0004\b_\u0010\nJ\u0017\u0010`\u001a\u00020\b2\b\u0010Q\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b`\u0010=J\u001b\u0010c\u001a\u00020\b2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\b0a¢\u0006\u0004\bc\u0010dJ\u001d\u0010g\u001a\u00020\b2\u0006\u0010f\u001a\u00020e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bg\u0010hJ%\u0010l\u001a\u00020\b2\u000e\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010i2\u0006\u0010k\u001a\u00020e¢\u0006\u0004\bl\u0010mJ/\u0010s\u001a\u00020\b2\b\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010q\u001a\u00020p2\u0006\u0010\u001e\u001a\u00020r2\u0006\u0010\u001d\u001a\u00020r¢\u0006\u0004\bs\u0010tJ%\u0010w\u001a\u00020\b2\u0006\u0010N\u001a\u00020u2\u0006\u0010q\u001a\u00020p2\u0006\u0010v\u001a\u00020r¢\u0006\u0004\bw\u0010xJ\r\u0010y\u001a\u00020\b¢\u0006\u0004\by\u0010\nJ!\u0010{\u001a\u00020\b2\u0006\u0010z\u001a\u00020\u00042\n\b\u0002\u0010k\u001a\u0004\u0018\u00010e¢\u0006\u0004\b{\u0010|J\r\u0010}\u001a\u00020\b¢\u0006\u0004\b}\u0010\nJ\r\u0010~\u001a\u00020\b¢\u0006\u0004\b~\u0010\nJ\r\u0010\u007f\u001a\u00020\b¢\u0006\u0004\b\u007f\u0010\nR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010\u0080\u0001R&\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bl\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0005\bS\u0010\u0084\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u00100R\u0017\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0087\u0001R&\u0010\u008c\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\bg\u00100\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0005\b\u008b\u0001\u0010\u000fR\u0017\u0010\u008d\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010\u0017R\u0017\u0010\u008e\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010\u0017R\u001f\u0010\u0091\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u008f\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\by\u0010\u0090\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010\u0017R\u0017\u0010\u0092\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\u0017R\u0017\u0010\u0093\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010\u0017R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0014\u0010\u0099\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u008a\u0001¨\u0006\u009a\u0001"}, d2 = {"Lq2/c;", "", "Lm2/e1;", "composer", "Lq2/a;", "changeList", "<init>", "(Lm2/e1;Lq2/a;)V", "Loq/i0;", "C", "()V", "E", "", "useParentSlot", "F", "(Z)V", "n", "Lp2/c;", "anchor", "m", "(Lp2/c;)V", "forParent", "J", "I", "", "removeFrom", "moveCount", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(II)V", "to", "from", "count", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(III)V", ip.a.f96138c, "location", "z", "(I)V", "A", "M", "Lm2/v4;", "value", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lm2/v4;)V", "Lm2/f4;", "scope", "Q", "(Lm2/f4;)V", "Z", "k", "groupSlotIndex", "e0", "(Ljava/lang/Object;I)V", "b0", "(Ljava/lang/Object;Lp2/c;I)V", "a", "(Lp2/c;Ljava/lang/Object;)V", "a0", "T", "data", "c0", "(Ljava/lang/Object;)V", "l", "g", "Y", "R", "Lp2/l;", "u", "(Lp2/c;Lp2/l;)V", "Lq2/d;", "fixups", "v", "(Lp2/c;Lp2/l;Lq2/d;)V", "offset", "w", "Lkotlin/Function1;", "Lm2/u;", "action", "composition", "f", "(Ler/l;Lm2/u;)V", "node", "f0", "V", "Lkotlin/Function2;", "block", "d0", "(Ljava/lang/Object;Ler/p;)V", "nodeIndex", ip.a.f96137b, "y", "N", "i", "group", "j", "B", "x", "Lkotlin/Function0;", "effect", "X", "(Ler/a;)V", "Ly2/o;", "effectiveNodeIndexOut", "e", "(Ly2/o;Lp2/c;)V", "", "nodes", "effectiveNodeIndex", "b", "(Ljava/util/List;Ly2/o;)V", "Lm2/r2;", "resolvedState", "Lm2/v;", "parentContext", "Lm2/s2;", "c", "(Lm2/r2;Lm2/v;Lm2/s2;Lm2/s2;)V", "Lm2/l0;", "reference", "O", "(Lm2/l0;Lm2/v;Lm2/s2;)V", "h", "other", "t", "(Lq2/a;Ly2/o;)V", "o", "U", "d", "Lm2/e1;", "Lq2/a;", "p", "()Lq2/a;", "(Lq2/a;)V", "startedGroup", "Lm2/o1;", "Lm2/o1;", "startedGroups", "q", "()Z", "W", "implicitRootStart", "writersReaderDelta", "pendingUps", "Lm2/e6;", "Ljava/util/ArrayList;", "pendingDownNodes", "moveFrom", "moveTo", "Lp2/j;", "s", "()Lp2/j;", "reader", "r", "pastParent", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f163789n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e1 composer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a changeList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean startedGroup;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int writersReaderDelta;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pendingUps;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int moveCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o1 startedGroups = new o1();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean implicitRootStart = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Object> pendingDownNodes = e6.c(null, 1, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int removeFrom = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int moveFrom = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int moveTo = -1;

    public c(e1 e1Var, a aVar) {
        this.composer = e1Var;
        this.changeList = aVar;
    }

    private final void C() {
        D();
    }

    private final void D() {
        int i15 = this.pendingUps;
        if (i15 > 0) {
            this.changeList.L(i15);
            this.pendingUps = 0;
        }
        if (e6.f(this.pendingDownNodes)) {
            this.changeList.l(e6.k(this.pendingDownNodes));
            e6.a(this.pendingDownNodes);
        }
    }

    private final void E() {
        K(this, false, 1, null);
        M();
    }

    private final void F(boolean useParentSlot) {
        J(useParentSlot);
    }

    static /* synthetic */ void G(c cVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        cVar.F(z15);
    }

    private final void H(int to4, int from, int count) {
        C();
        this.changeList.w(to4, from, count);
    }

    private final void I() {
        int i15 = this.moveCount;
        if (i15 > 0) {
            int i16 = this.removeFrom;
            if (i16 >= 0) {
                L(i16, i15);
                this.removeFrom = -1;
            } else {
                H(this.moveTo, this.moveFrom, i15);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void J(boolean forParent) {
        int parent = forParent ? s().getParent() : s().getCurrent();
        int i15 = parent - this.writersReaderDelta;
        if (!(i15 >= 0)) {
            t.b("Tried to seek backward");
        }
        if (i15 > 0) {
            this.changeList.f(i15);
            this.writersReaderDelta = parent;
        }
    }

    static /* synthetic */ void K(c cVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        cVar.J(z15);
    }

    private final void L(int removeFrom, int moveCount) {
        C();
        this.changeList.B(removeFrom, moveCount);
    }

    private final void m(p2.c anchor) {
        G(this, false, 1, null);
        this.changeList.q(anchor);
        this.startedGroup = true;
    }

    private final void n() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        G(this, false, 1, null);
        this.changeList.r();
        this.startedGroup = true;
    }

    private final SlotReader s() {
        return this.composer.getReader();
    }

    public final void A(int location) {
        this.writersReaderDelta = location;
    }

    public final void B() {
        I();
        if (e6.f(this.pendingDownNodes)) {
            e6.i(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }

    public final void M() {
        SlotReader slotReaderS;
        int parent;
        if (s().getGroupsSize() <= 0 || this.startedGroups.f(-2) == (parent = (slotReaderS = s()).getParent())) {
            return;
        }
        n();
        if (parent > 0) {
            p2.c cVarA = slotReaderS.a(parent);
            this.startedGroups.i(parent);
            m(cVarA);
        }
    }

    public final void N() {
        D();
        if (this.startedGroup) {
            Y();
            l();
        }
    }

    public final void O(l0 composition, v parentContext, s2 reference) {
        this.changeList.x(composition, parentContext, reference);
    }

    public final void P(v4 value) {
        this.changeList.y(value);
    }

    public final void Q(f4 scope) {
        this.changeList.z(scope);
    }

    public final void R() {
        E();
        this.changeList.A();
        this.writersReaderDelta += s().p();
    }

    public final void S(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                t.b("Invalid remove index " + nodeIndex);
            }
            if (this.removeFrom == nodeIndex) {
                this.moveCount += count;
                return;
            }
            I();
            this.removeFrom = nodeIndex;
            this.moveCount = count;
        }
    }

    public final void T() {
        this.changeList.C();
    }

    public final void U() {
        this.startedGroup = false;
        this.startedGroups.a();
        this.writersReaderDelta = 0;
        this.implicitRootStart = true;
        this.pendingUps = 0;
        e6.a(this.pendingDownNodes);
        this.removeFrom = -1;
        this.moveFrom = -1;
        this.moveTo = -1;
        this.moveCount = 0;
    }

    public final void V(a aVar) {
        this.changeList = aVar;
    }

    public final void W(boolean z15) {
        this.implicitRootStart = z15;
    }

    public final void X(er.a<i0> effect) {
        this.changeList.D(effect);
    }

    public final void Y() {
        this.changeList.E();
    }

    public final void Z(f4 scope) {
        this.changeList.F(scope);
    }

    public final void a(p2.c anchor, Object value) {
        this.changeList.g(anchor, value);
    }

    public final void a0(int count) {
        if (count > 0) {
            E();
            this.changeList.G(count);
        }
    }

    public final void b(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        this.changeList.h(nodes, effectiveNodeIndex);
    }

    public final void b0(Object value, p2.c anchor, int groupSlotIndex) {
        this.changeList.H(value, anchor, groupSlotIndex);
    }

    public final void c(r2 resolvedState, v parentContext, s2 from, s2 to4) {
        this.changeList.i(resolvedState, parentContext, from, to4);
    }

    public final void c0(Object data) {
        G(this, false, 1, null);
        this.changeList.I(data);
    }

    public final void d() {
        G(this, false, 1, null);
        this.changeList.j();
    }

    public final <T, V> void d0(V value, p<? super T, ? super V, i0> block) {
        C();
        this.changeList.J(value, block);
    }

    public final void e(IntRef effectiveNodeIndexOut, p2.c anchor) {
        D();
        this.changeList.k(effectiveNodeIndexOut, anchor);
    }

    public final void e0(Object value, int groupSlotIndex) {
        F(true);
        this.changeList.K(value, groupSlotIndex);
    }

    public final void f(l<? super u, i0> action, u composition) {
        this.changeList.m(action, composition);
    }

    public final void f0(Object node) {
        C();
        this.changeList.M(node);
    }

    public final void g() {
        int parent = s().getParent();
        if (!(this.startedGroups.f(-1) <= parent)) {
            t.b("Missed recording an endGroup");
        }
        if (this.startedGroups.f(-1) == parent) {
            G(this, false, 1, null);
            this.startedGroups.g();
            this.changeList.n();
        }
    }

    public final void h() {
        D();
        this.changeList.o();
        this.writersReaderDelta = 0;
    }

    public final void i() {
        I();
    }

    public final void j(int nodeIndex, int group) {
        i();
        D();
        int iO = s().K(group) ? 1 : s().O(group);
        if (iO > 0) {
            S(nodeIndex, iO);
        }
    }

    public final void k(f4 scope) {
        this.changeList.p(scope);
    }

    public final void l() {
        if (this.startedGroup) {
            G(this, false, 1, null);
            G(this, false, 1, null);
            this.changeList.n();
            this.startedGroup = false;
        }
    }

    public final void o() {
        D();
        if (this.startedGroups.tos == 0) {
            return;
        }
        t.b("Missed recording an endGroup()");
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final a getChangeList() {
        return this.changeList;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final boolean r() {
        return s().getParent() - this.writersReaderDelta < 0;
    }

    public final void t(a other, IntRef effectiveNodeIndex) {
        this.changeList.s(other, effectiveNodeIndex);
    }

    public final void u(p2.c anchor, p2.l from) {
        D();
        E();
        I();
        this.changeList.t(anchor, from);
    }

    public final void v(p2.c anchor, p2.l from, d fixups) {
        D();
        E();
        I();
        this.changeList.u(anchor, from, fixups);
    }

    public final void w(int offset) {
        E();
        this.changeList.v(offset);
    }

    public final void x(Object node) {
        I();
        e6.j(this.pendingDownNodes, node);
    }

    public final void y(int from, int to4, int count) {
        if (count > 0) {
            int i15 = this.moveCount;
            if (i15 > 0 && this.moveFrom == from - i15 && this.moveTo == to4 - i15) {
                this.moveCount = i15 + count;
                return;
            }
            I();
            this.moveFrom = from;
            this.moveTo = to4;
            this.moveCount = count;
        }
    }

    public final void z(int location) {
        this.writersReaderDelta += location - s().getCurrent();
    }
}
