package n4;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import g4.i1;
import g4.j1;
import g4.p0;
import g4.s0;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\u0014*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b!\u0010\"J-\u0010(\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00140%H\u0002¢\u0006\u0004\b(\u0010)J9\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b+\u0010,J3\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b.\u0010/J\u0011\u00101\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0000H\u0000¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010>\u001a\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010AR\u0017\u0010G\u001a\u00020C8\u0006¢\u0006\f\n\u0004\b1\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010:R\u0014\u0010K\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010:R\u0014\u0010M\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010:R\u0011\u0010Q\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010T\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0011\u0010Z\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010\\\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b[\u0010SR\u0011\u0010_\u001a\u00020]8F¢\u0006\u0006\u001a\u0004\b^\u0010YR\u0011\u0010a\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b`\u0010SR\u0014\u0010c\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010SR\u0014\u0010e\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010:R\u0011\u0010g\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bf\u0010@R\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bk\u0010iR\u0013\u0010n\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bm\u00104¨\u0006o"}, d2 = {"Ln4/w;", "", "Lf3/m$c;", "outerSemanticsNode", "", "mergingEnabled", "Landroidx/compose/ui/node/g;", "layoutNode", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "<init>", "(Lf3/m$c;ZLandroidx/compose/ui/node/g;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "Le4/b0;", "nodeCoordinates", "Lm3/g;", "a", "(Le4/b0;)Lm3/g;", "", "unmergedChildren", "mergedConfig", "Loq/i0;", "E", "(Ljava/util/List;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "list", "includeDeactivatedNodes", "e", "(Landroidx/compose/ui/node/g;Ljava/util/List;Z)V", "", "g", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lg4/i1;", "i", "()Lg4/i1;", "c", "(Ljava/util/List;)V", "Ln4/l;", "role", "Lkotlin/Function1;", "Ln4/i0;", "properties", "d", "(Ln4/l;Ler/l;)Ln4/w;", "includeFakeNodes", "F", "(Ljava/util/List;ZZ)Ljava/util/List;", "includeReplacedSemantics", "n", "(ZZZ)Ljava/util/List;", "Landroidx/compose/ui/node/NodeCoordinator;", "f", "()Landroidx/compose/ui/node/NodeCoordinator;", "b", "()Ln4/w;", "Lf3/m$c;", "getOuterSemanticsNode$ui", "()Lf3/m$c;", "Z", "getMergingEnabled", "()Z", "Landroidx/compose/ui/node/g;", "s", "()Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "z", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Ln4/w;", "fakeNodeParent", "", "I", "q", "()I", "id", "B", "isMergingSemanticsOfDescendants", "A", "isFake", ip.a.f96138c, "isUnmergedLeafNode", "Le4/i0;", "r", "()Le4/i0;", "layoutInfo", "x", "()Lm3/g;", "touchBoundsInRoot", "y", "unclippedBoundsInRoot", "Lc5/r;", "w", "()J", "size", "k", "boundsInRoot", "Lm3/e;", "u", "positionInRoot", "l", "boundsInWindow", "j", "boundsInParent", "C", "isTransparent", "p", "config", "m", "()Ljava/util/List;", "children", "v", "replacedChildren", "t", "parent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f3.m.c outerSemanticsNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean mergingEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.node.g layoutNode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SemanticsConfiguration unmergedConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private w fakeNodeParent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int id;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<i0, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f131314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar) {
            super(1);
            this.f131314b = lVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(i0 i0Var) {
            c(i0Var);
            return oq.i0.f148189a;
        }

        public final void c(i0 i0Var) {
            f0.r0(i0Var, this.f131314b.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<i0, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f131315b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f131315b = str;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(i0 i0Var) {
            c(i0Var);
            return oq.i0.f148189a;
        }

        public final void c(i0 i0Var) {
            f0.c0(i0Var, this.f131315b);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"n4/w$c", "Lg4/i1;", "Lf3/m$c;", "Ln4/i0;", "Loq/i0;", "E2", "(Ln4/i0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends f3.m.c implements i1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ er.l<i0, oq.i0> f131316r;

        /* JADX WARN: Multi-variable type inference failed */
        c(er.l<? super i0, oq.i0> lVar) {
            this.f131316r = lVar;
        }

        @Override // g4.i1
        public void E2(i0 i0Var) {
            this.f131316r.b(i0Var);
        }
    }

    public w(f3.m.c cVar, boolean z15, androidx.compose.ui.node.g gVar, SemanticsConfiguration semanticsConfiguration) {
        this.outerSemanticsNode = cVar;
        this.mergingEnabled = z15;
        this.layoutNode = gVar;
        this.unmergedConfig = semanticsConfiguration;
        this.id = gVar.getSemanticsId();
    }

    private final boolean B() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    private final void E(List<w> unmergedChildren, SemanticsConfiguration mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        G(this, unmergedChildren, false, false, 6, null);
        int size = unmergedChildren.size();
        for (int size2 = unmergedChildren.size(); size2 < size; size2++) {
            w wVar = unmergedChildren.get(size2);
            if (!wVar.B()) {
                mergedConfig.u(wVar.unmergedConfig);
                wVar.E(unmergedChildren, mergedConfig);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List G(w wVar, List list, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        return wVar.F(list, z15, z16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    private final m3.g a(p036e4.b0 nodeCoordinates) {
        ?? L;
        w wVarT = t();
        if (wVarT == null) {
            return m3.g.INSTANCE.a();
        }
        p0 nodes = wVarT.layoutNode.getNodes();
        int iA = s0.a(8);
        if ((nodes.i() & iA) == 0) {
            L = 0;
            break;
        }
        f3.m.c head = nodes.getHead();
        loop0: while (true) {
            if (head != null) {
                if ((head.getKindSet() & iA) != 0) {
                    L = head;
                    n2.c cVar = null;
                    while (L != 0) {
                        if (L instanceof i1) {
                            if (((i1) L).R()) {
                                break loop0;
                            }
                        } else if ((L.getKindSet() & iA) != 0 && (L instanceof g4.j)) {
                            f3.m.c delegate = ((g4.j) L).getDelegate();
                            int i15 = 0;
                            L = L;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & iA) != 0) {
                                    i15++;
                                    if (i15 == 1) {
                                        L = delegate;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new n2.c(new f3.m.c[16], 0);
                                        }
                                        if (L != 0) {
                                            cVar.d(L);
                                            L = 0;
                                        }
                                        cVar.d(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                L = L;
                            }
                            if (i15 == 1) {
                            }
                        }
                        L = g4.h.l(cVar);
                    }
                }
                if ((head.getAggregateChildKindSet() & iA) != 0) {
                    head = head.getChild();
                }
            }
            L = 0;
            break;
        }
        i1 i1Var = (i1) L;
        NodeCoordinator nodeCoordinatorN = i1Var != null ? g4.h.n(i1Var, s0.a(8)) : null;
        return nodeCoordinatorN == null ? wVarT.a(nodeCoordinates) : p036e4.b0.z0(nodeCoordinatorN, nodeCoordinates, false, 2, null);
    }

    private final void c(List<w> unmergedChildren) {
        l lVarF = x.f(this);
        if (lVarF != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !unmergedChildren.isEmpty()) {
            unmergedChildren.add(d(lVarF, new a(lVarF)));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        c0 c0Var = c0.f131174a;
        if (semanticsConfiguration.g(c0Var.d()) && !unmergedChildren.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) q.a(this.unmergedConfig, c0Var.d());
            String str = list != null ? (String) pq.v.n0(list) : null;
            if (str != null) {
                unmergedChildren.add(0, d(null, new b(str)));
            }
        }
    }

    private final w d(l role, er.l<? super i0, oq.i0> properties) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.w(false);
        semanticsConfiguration.v(false);
        properties.b(semanticsConfiguration);
        w wVar = new w(new c(properties), false, new androidx.compose.ui.node.g(true, role != null ? x.g(this) : x.e(this)), semanticsConfiguration);
        wVar.fakeNodeParent = this;
        return wVar;
    }

    private final void e(androidx.compose.ui.node.g gVar, List<w> list, boolean z15) {
        n2.c<androidx.compose.ui.node.g> cVarK0 = gVar.K0();
        androidx.compose.ui.node.g[] gVarArr = cVarK0.content;
        int size = cVarK0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            androidx.compose.ui.node.g gVar2 = gVarArr[i15];
            if (gVar2.c() && (z15 || !gVar2.getIsDeactivated())) {
                if (gVar2.getNodes().q(s0.a(8))) {
                    list.add(x.a(gVar2, this.mergingEnabled));
                } else {
                    e(gVar2, list, z15);
                }
            }
        }
    }

    private final List<w> g(List<w> unmergedChildren, List<w> list) {
        G(this, unmergedChildren, false, false, 6, null);
        int size = unmergedChildren.size();
        for (int size2 = unmergedChildren.size(); size2 < size; size2++) {
            w wVar = unmergedChildren.get(size2);
            if (wVar.B()) {
                list.add(wVar);
            } else if (!wVar.unmergedConfig.getIsClearingSemantics()) {
                wVar.g(unmergedChildren, list);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List h(w wVar, List list, List list2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            list2 = new ArrayList();
        }
        return wVar.g(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    private final g4.i1 i() {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.w.i():g4.i1");
    }

    public static /* synthetic */ List o(w wVar, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = !wVar.mergingEnabled;
        }
        if ((i15 & 2) != 0) {
            z16 = false;
        }
        if ((i15 & 4) != 0) {
            z17 = false;
        }
        return wVar.n(z15, z16, z17);
    }

    public final boolean A() {
        return this.fakeNodeParent != null;
    }

    public final boolean C() {
        NodeCoordinator nodeCoordinatorF = f();
        if (nodeCoordinatorF != null) {
            return nodeCoordinatorF.C3();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean D() {
        if (A() || !v().isEmpty()) {
            return false;
        }
        androidx.compose.ui.node.g gVarC0 = this.layoutNode.C0();
        while (gVarC0 != null) {
            SemanticsConfiguration semanticsConfigurationF = gVarC0.f();
            if (semanticsConfigurationF != null && semanticsConfigurationF.getIsMergingSemanticsOfDescendants()) {
                if (gVarC0 == null) {
                    return true;
                }
                return false;
            }
            gVarC0 = gVarC0.C0();
        }
        gVarC0 = null;
        if (gVarC0 == null) {
            return true;
        }
        return false;
    }

    public final List<w> F(List<w> unmergedChildren, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (A()) {
            return pq.v.n();
        }
        e(this.layoutNode, unmergedChildren, includeDeactivatedNodes);
        if (includeFakeNodes) {
            c(unmergedChildren);
        }
        return unmergedChildren;
    }

    public final w b() {
        return new w(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final NodeCoordinator f() {
        NodeCoordinator nodeCoordinatorN;
        if (!A()) {
            i1 i1VarI = i();
            return (i1VarI == null || (nodeCoordinatorN = g4.h.n(i1VarI, s0.a(8))) == null) ? this.layoutNode.b0() : nodeCoordinatorN;
        }
        w wVarT = t();
        if (wVarT != null) {
            return wVarT.f();
        }
        return null;
    }

    public final m3.g j() {
        p036e4.b0 b0VarM;
        NodeCoordinator nodeCoordinatorF = f();
        if (nodeCoordinatorF != null) {
            if (!nodeCoordinatorF.c()) {
                nodeCoordinatorF = null;
            }
            if (nodeCoordinatorF != null && (b0VarM = nodeCoordinatorF.m()) != null) {
                return a(b0VarM);
            }
        }
        return m3.g.INSTANCE.a();
    }

    public final m3.g k() {
        m3.g gVarB;
        NodeCoordinator nodeCoordinatorF = f();
        if (nodeCoordinatorF != null) {
            if (!nodeCoordinatorF.c()) {
                nodeCoordinatorF = null;
            }
            if (nodeCoordinatorF != null && (gVarB = p036e4.c0.b(nodeCoordinatorF)) != null) {
                return gVarB;
            }
        }
        return m3.g.INSTANCE.a();
    }

    public final m3.g l() {
        m3.g gVarD;
        NodeCoordinator nodeCoordinatorF = f();
        if (nodeCoordinatorF != null) {
            if (!nodeCoordinatorF.c()) {
                nodeCoordinatorF = null;
            }
            if (nodeCoordinatorF != null && (gVarD = p036e4.c0.d(nodeCoordinatorF, false, 1, null)) != null) {
                return gVarD;
            }
        }
        return m3.g.INSTANCE.a();
    }

    public final List<w> m() {
        return o(this, false, false, false, 7, null);
    }

    public final List<w> n(boolean includeReplacedSemantics, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (!includeReplacedSemantics && this.unmergedConfig.getIsClearingSemantics()) {
            return pq.v.n();
        }
        ArrayList arrayList = new ArrayList();
        return B() ? h(this, arrayList, null, 2, null) : F(arrayList, includeFakeNodes, includeDeactivatedNodes);
    }

    public final SemanticsConfiguration p() {
        if (!B()) {
            return this.unmergedConfig;
        }
        SemanticsConfiguration semanticsConfigurationI = this.unmergedConfig.i();
        E(new ArrayList(), semanticsConfigurationI);
        return semanticsConfigurationI;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final p036e4.i0 r() {
        return this.layoutNode;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final androidx.compose.ui.node.g getLayoutNode() {
        return this.layoutNode;
    }

    public final w t() {
        androidx.compose.ui.node.g gVarC0;
        w wVar = this.fakeNodeParent;
        if (wVar != null) {
            return wVar;
        }
        if (!this.mergingEnabled) {
            gVarC0 = null;
            break;
        }
        gVarC0 = this.layoutNode.C0();
        while (true) {
            if (gVarC0 != null) {
                SemanticsConfiguration semanticsConfigurationF = gVarC0.f();
                if (semanticsConfigurationF != null && semanticsConfigurationF.getIsMergingSemanticsOfDescendants()) {
                    break;
                }
                gVarC0 = gVarC0.C0();
            } else {
                gVarC0 = null;
                break;
            }
        }
        if (gVarC0 == null) {
            gVarC0 = this.layoutNode.C0();
            while (gVarC0 != null) {
                if (!gVarC0.getNodes().q(s0.a(8))) {
                    gVarC0 = gVarC0.C0();
                }
            }
            gVarC0 = null;
        }
        if (gVarC0 == null) {
            return null;
        }
        return x.a(gVarC0, this.mergingEnabled);
    }

    public final long u() {
        NodeCoordinator nodeCoordinatorF = f();
        if (nodeCoordinatorF != null) {
            if (!nodeCoordinatorF.c()) {
                nodeCoordinatorF = null;
            }
            if (nodeCoordinatorF != null) {
                return p036e4.c0.g(nodeCoordinatorF);
            }
        }
        return m3.e.INSTANCE.c();
    }

    public final List<w> v() {
        return o(this, false, true, false, 4, null);
    }

    public final long w() {
        NodeCoordinator nodeCoordinatorF = f();
        return nodeCoordinatorF != null ? nodeCoordinatorF.b() : c5.r.INSTANCE.a();
    }

    public final m3.g x() {
        i1 i1VarI = i();
        return i1VarI == null ? this.layoutNode.b0().h4() : j1.b(i1VarI.getNode(), j1.c(this.unmergedConfig), true);
    }

    public final m3.g y() {
        i1 i1VarI = i();
        return i1VarI == null ? j1.a(this.layoutNode.b0(), false) : j1.b(i1VarI.getNode(), j1.c(this.unmergedConfig), false);
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }
}
