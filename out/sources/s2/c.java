package s2;

import java.util.ArrayList;
import java.util.List;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.e6;
import p076m2.f2;
import p076m2.f4;
import p076m2.j2;
import p076m2.l0;
import p076m2.r2;
import p076m2.s2;
import p076m2.t;
import p076m2.u;
import p076m2.v;
import p076m2.v4;
import r2.b0;
import r2.o;
import y2.IntRef;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nJ#\u0010\u001f\u001a\u00020\b2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010(J\u0015\u0010*\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b*\u0010(J\u001d\u0010/\u001a\u00020\b2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\b2\u0006\u00101\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b4\u00105J!\u00108\u001a\u00020\b2\n\u00107\u001a\u00060\u000ej\u0002`62\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b8\u0010\u0012J\r\u00109\u001a\u00020\b¢\u0006\u0004\b9\u0010\nJ\u0017\u0010;\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b;\u00105J\r\u0010<\u001a\u00020\b¢\u0006\u0004\b<\u0010\nJ!\u0010@\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\n\u0010?\u001a\u00060\u001aj\u0002`\u001b¢\u0006\u0004\b@\u0010AJ)\u0010D\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\n\u0010?\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u000e¢\u0006\u0004\bG\u0010HJ)\u0010M\u001a\u00020\b2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0I2\u0006\u0010L\u001a\u00020J¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\b2\b\u0010O\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bP\u00105J;\u0010T\u001a\u00020\b\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010)2\u0006\u0010\"\u001a\u00028\u00012\u0018\u0010S\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0R¢\u0006\u0004\bT\u0010UJ\u001d\u0010V\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\bV\u0010\u0012J%\u0010Y\u001a\u00020\b2\u0006\u0010W\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\bY\u0010\u0017J\r\u0010Z\u001a\u00020\b¢\u0006\u0004\bZ\u0010\nJ!\u0010\\\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010[\u001a\u00060\u000ej\u0002`6¢\u0006\u0004\b\\\u0010\u0012J\r\u0010]\u001a\u00020\b¢\u0006\u0004\b]\u0010\nJ\u0017\u0010^\u001a\u00020\b2\b\u0010O\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b^\u00105J\u001b\u0010Q\u001a\u00020\b2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\b0_¢\u0006\u0004\bQ\u0010aJ!\u0010d\u001a\u00020\b2\u0006\u0010c\u001a\u00020b2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b¢\u0006\u0004\bd\u0010eJ%\u0010i\u001a\u00020\b2\u000e\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010f2\u0006\u0010h\u001a\u00020b¢\u0006\u0004\bi\u0010jJ/\u0010p\u001a\u00020\b2\b\u0010l\u001a\u0004\u0018\u00010k2\u0006\u0010n\u001a\u00020m2\u0006\u0010\u0014\u001a\u00020o2\u0006\u0010\u0013\u001a\u00020o¢\u0006\u0004\bp\u0010qJ%\u0010t\u001a\u00020\b2\u0006\u0010L\u001a\u00020r2\u0006\u0010n\u001a\u00020m2\u0006\u0010s\u001a\u00020o¢\u0006\u0004\bt\u0010uJ\r\u0010v\u001a\u00020\b¢\u0006\u0004\bv\u0010\nJ\u0017\u0010w\u001a\u00020\b2\b\u0010l\u001a\u0004\u0018\u00010k¢\u0006\u0004\bw\u0010xJ!\u0010z\u001a\u00020\b2\u0006\u0010y\u001a\u00020\u00042\n\b\u0002\u0010h\u001a\u0004\u0018\u00010b¢\u0006\u0004\bz\u0010{J\r\u0010|\u001a\u00020\b¢\u0006\u0004\b|\u0010\nJ\r\u0010}\u001a\u00020\b¢\u0006\u0004\b}\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R'\u0010\u008a\u0001\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b4\u00102\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010#R\u001f\u0010\u008e\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bp\u0010\u008d\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010#R\u0017\u0010\u0090\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010#R\u0017\u0010\u0091\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010#R\u0017\u0010\u0092\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010#R)\u0010\u0099\u0001\u001a\u00030\u0093\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bv\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010\u009a\u0001\u001a\u00060\u001aj\u0002`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010'R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0014\u0010 \u0001\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010\u0087\u0001¨\u0006¡\u0001"}, d2 = {"Ls2/c;", "", "Lm2/f2;", "composer", "Ls2/a;", "changeList", "<init>", "(Lm2/f2;Ls2/a;)V", "Loq/i0;", "A", "()V", "C", ip.a.f96138c, "F", "", "nodeIndex", "removeCount", "G", "(II)V", "to", "from", "count", "E", "(III)V", "B", "U", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "handle", "", "resetRelativeAddressing", "O", "(JZ)V", "Lm2/v4;", "value", "I", "(Lm2/v4;)V", "Lm2/f4;", "scope", "J", "(Lm2/f4;)V", "V", "m", "Lm2/j2;", "holder", "Lr2/i;", "after", "Y", "(Lm2/j2;Lr2/i;)V", "slotIndex", "Z", "(ILjava/lang/Object;)V", "c", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "firstTailGroupToRemove", "M", "N", "data", "W", "K", "Lr2/o;", "sourceTable", "source", "t", "(Lr2/o;J)V", "Ls2/e;", "fixups", "u", "(Lr2/o;JLs2/e;)V", "offset", "x", "(I)V", "Lkotlin/Function1;", "Lm2/u;", "action", "composition", "i", "(Ler/l;Lm2/u;)V", "node", "a0", "T", "Lkotlin/Function2;", "block", "X", "(Ljava/lang/Object;Ler/p;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "fromNodeIndex", "toNodeIndex", "y", "k", "group", "l", "z", "w", "Lkotlin/Function0;", "effect", "(Ler/a;)V", "Ly2/o;", "effectiveNodeIndexOut", "g", "(Ly2/o;J)V", "", "nodes", "effectiveNodeIndex", "d", "(Ljava/util/List;Ly2/o;)V", "Lm2/r2;", "resolvedState", "Lm2/v;", "parentContext", "Lm2/s2;", "e", "(Lm2/r2;Lm2/v;Lm2/s2;Lm2/s2;)V", "Lm2/l0;", "reference", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lm2/l0;Lm2/v;Lm2/s2;)V", "j", "h", "(Lm2/r2;)V", "other", "s", "(Ls2/a;Ly2/o;)V", "n", "f", "a", "Lm2/f2;", "b", "Ls2/a;", "p", "()Ls2/a;", "R", "(Ls2/a;)V", "q", "()Z", ip.a.f96137b, "(Z)V", "implicitRootStart", "pendingUps", "Lm2/e6;", "Ljava/util/ArrayList;", "pendingDownNodes", "removeFromNodeIndex", "moveFromNodeIndex", "moveToNodeIndex", "moveCount", "Ls2/d;", "Ls2/d;", "o", "()Ls2/d;", "Q", "(Ls2/d;)V", "addressMode", "editorCurrentPosition", "Lr2/b0;", "r", "()Lr2/b0;", "reader", "v", "isInAnchorMode", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f2 composer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private s2.a changeList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int pendingUps;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean implicitRootStart = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Object> pendingDownNodes = e6.c(null, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int removeFromNodeIndex = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int moveFromNodeIndex = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int moveToNodeIndex = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int moveCount = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private d addressMode = d.AbsoluteAddressing;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long editorCurrentPosition = -1;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f177539a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.AbsoluteAddressing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.AnchorAddressing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.RelativeAddressing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f177539a = iArr;
        }
    }

    public c(f2 f2Var, s2.a aVar) {
        this.composer = f2Var;
        this.changeList = aVar;
    }

    private final void A() {
        B();
    }

    private final void B() {
        int i15 = this.pendingUps;
        if (i15 > 0) {
            this.changeList.N(i15);
            this.pendingUps = 0;
        }
        if (e6.f(this.pendingDownNodes)) {
            this.changeList.n(e6.k(this.pendingDownNodes));
            e6.a(this.pendingDownNodes);
        }
    }

    private final void C() {
        long jI = r().I();
        if (this.editorCurrentPosition != jI) {
            P(this, jI, false, 2, null);
        }
    }

    private final void D() {
        P(this, r().I(), false, 2, null);
    }

    private final void E(int to4, int from, int count) {
        A();
        this.changeList.v(to4, from, count);
    }

    private final void F() {
        int i15 = this.moveCount;
        if (i15 > 0) {
            int i16 = this.removeFromNodeIndex;
            if (i16 >= 0) {
                G(i16, i15);
                this.removeFromNodeIndex = -1;
            } else {
                E(this.moveToNodeIndex, this.moveFromNodeIndex, i15);
                this.moveToNodeIndex = -1;
                this.moveFromNodeIndex = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void G(int nodeIndex, int removeCount) {
        A();
        this.changeList.A(nodeIndex, removeCount);
    }

    public static /* synthetic */ void P(c cVar, long j15, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        cVar.O(j15, z15);
    }

    private final b0 r() {
        return this.composer.getReader();
    }

    public final void H(l0 composition, v parentContext, s2 reference) {
        this.changeList.w(composition, parentContext, reference);
        this.editorCurrentPosition = -1L;
    }

    public final void I(v4 value) {
        C();
        this.changeList.x(value);
    }

    public final void J(f4 scope) {
        this.changeList.y(scope);
    }

    public final void K() {
        C();
        this.changeList.z();
    }

    public final void L(int nodeIndex, int count) {
        if (count > 0) {
            if (this.removeFromNodeIndex == nodeIndex) {
                this.moveCount += count;
                return;
            }
            F();
            this.removeFromNodeIndex = nodeIndex;
            this.moveCount = count;
        }
    }

    public final void M(int firstTailGroupToRemove, int count) {
        if (firstTailGroupToRemove >= 0 || count > 0) {
            C();
            this.changeList.B(firstTailGroupToRemove, count);
        }
    }

    public final void N() {
        this.changeList.C();
        this.editorCurrentPosition = -1L;
    }

    public final void O(long handle, boolean resetRelativeAddressing) {
        int i15 = a.f177539a[this.addressMode.ordinal()];
        if (i15 == 1) {
            this.changeList.E(handle);
        } else if (i15 == 2) {
            this.changeList.D(r().getTable().getAddressSpace(), handle);
        } else {
            if (i15 != 3) {
                throw new p();
            }
            int iB = r2.f.b(handle);
            int iA = iB == -1 ? r2.f.a(handle) : r().U(iB);
            if (!(iA == r2.f.b(this.editorCurrentPosition))) {
                t.b("Relative addressing only supports navigating to a child of the current group");
            }
            this.changeList.H();
            int iH = r().h(iA);
            while (iH != iB) {
                this.changeList.G();
                iH = r().R(iH);
            }
            if (resetRelativeAddressing) {
                this.addressMode = d.AbsoluteAddressing;
            }
        }
        this.editorCurrentPosition = handle;
    }

    public final void Q(d dVar) {
        this.addressMode = dVar;
    }

    public final void R(s2.a aVar) {
        this.changeList = aVar;
    }

    public final void S(boolean z15) {
        this.implicitRootStart = z15;
    }

    public final void T(er.a<i0> effect) {
        this.changeList.F(effect);
    }

    public final void U() {
        e6.a(this.pendingDownNodes);
        this.pendingUps = 0;
        this.removeFromNodeIndex = -1;
        this.moveFromNodeIndex = -1;
        this.moveToNodeIndex = -1;
        this.addressMode = d.AbsoluteAddressing;
        this.editorCurrentPosition = -1L;
    }

    public final void V(f4 scope) {
        this.changeList.I(scope);
    }

    public final void W(Object data) {
        C();
        this.changeList.J(data);
    }

    public final <T, V> void X(V value, er.p<? super T, ? super V, i0> block) {
        A();
        this.changeList.K(value, block);
    }

    public final void Y(j2 holder, r2.i after) {
        if (fr.t.c(holder.getAfter(), after)) {
            return;
        }
        this.changeList.M(holder, after);
    }

    public final void Z(int slotIndex, Object value) {
        C();
        this.changeList.L(slotIndex, value);
    }

    public final void a0(Object node) {
        A();
        this.changeList.O(node);
    }

    public final void c(Object value) {
        C();
        this.changeList.g(value);
    }

    public final void d(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        this.changeList.i(nodes, effectiveNodeIndex);
    }

    public final void e(r2 resolvedState, v parentContext, s2 from, s2 to4) {
        this.changeList.j(resolvedState, parentContext, from, to4);
    }

    public final void f() {
        C();
        this.changeList.k();
    }

    public final void g(IntRef effectiveNodeIndexOut, long handle) {
        B();
        this.changeList.l(effectiveNodeIndexOut, handle);
        this.editorCurrentPosition = handle;
    }

    public final void h(r2 resolvedState) {
        if (resolvedState != null) {
            this.changeList.m(resolvedState);
        }
    }

    public final void i(er.l<? super u, i0> action, u composition) {
        this.changeList.o(action, composition);
    }

    public final void j() {
        this.changeList.p();
        this.pendingUps = 0;
    }

    public final void k() {
        F();
    }

    public final void l(int nodeIndex, int group) {
        k();
        B();
        int i15 = r().i(group);
        L(nodeIndex, (i15 & 8388608) == 8388608 ? 1 : i15 & 8388607);
    }

    public final void m(f4 scope) {
        this.changeList.q(scope);
    }

    public final void n() {
        B();
        this.changeList.h();
        this.editorCurrentPosition = -1L;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final d getAddressMode() {
        return this.addressMode;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final s2.a getChangeList() {
        return this.changeList;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void s(s2.a other, IntRef effectiveNodeIndex) {
        this.changeList.r(other, effectiveNodeIndex);
    }

    public final void t(o sourceTable, long source) {
        if (!(source != -1)) {
            t.b("Tried moving from an unspecified position");
        }
        B();
        C();
        F();
        this.changeList.s(sourceTable, source);
    }

    public final void u(o sourceTable, long source, e fixups) {
        if (!(source != -1)) {
            t.b("Tried moving from an unspecified position");
        }
        B();
        C();
        F();
        this.changeList.t(sourceTable, source, fixups);
    }

    public final boolean v() {
        return this.addressMode == d.AnchorAddressing;
    }

    public final void w(Object node) {
        F();
        e6.j(this.pendingDownNodes, node);
    }

    public final void x(int offset) {
        if (!(offset >= 0)) {
            t.b("Offset must not be negative");
        }
        D();
        this.changeList.u(offset);
        this.editorCurrentPosition = -1L;
    }

    public final void y(int fromNodeIndex, int toNodeIndex, int count) {
        if (count > 0) {
            int i15 = this.moveCount;
            if (i15 > 0 && this.moveFromNodeIndex == fromNodeIndex && this.moveToNodeIndex == toNodeIndex) {
                this.moveCount = i15 + count;
                return;
            }
            F();
            this.moveToNodeIndex = toNodeIndex;
            this.moveFromNodeIndex = fromNodeIndex;
            this.moveCount = count;
        }
    }

    public final void z() {
        F();
        if (e6.f(this.pendingDownNodes)) {
            e6.i(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }
}
