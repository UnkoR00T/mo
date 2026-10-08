package j3;

import c5.r;
import er.l;
import er.p;
import f3.m;
import fr.k;
import fr.l0;
import fr.p0;
import fr.t;
import fr.w;
import g4.p1;
import g4.q1;
import g4.r1;
import g4.y;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00032\u00020\u0004:\u00019B?\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u001aR*\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0013R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lj3/e;", "Lf3/m$c;", "Lg4/q1;", "", "Lj3/g;", "Lkotlin/Function2;", "Lm3/e;", "Loq/i0;", "onStartTransfer", "Lkotlin/Function1;", "Lj3/c;", "onDropTargetValidate", "<init>", "(Ler/p;Ler/l;)V", "X2", "()V", "Lc5/r;", "size", "e", "(J)V", "startEvent", "", "n3", "(Lj3/c;)Z", "event", "t2", "(Lj3/c;)V", "o1", "o0", "k1", "Q1", "V1", "r", "Ler/p;", "s", "Ler/l;", "t", "Ljava/lang/Object;", "T", "()Ljava/lang/Object;", "traverseKey", "v", "Lj3/e;", "lastChildDragAndDropModifierNode", "w", "Lj3/g;", "thisDragAndDropTarget", "x", "J", "u3", "()J", "setSize-ozmzZPI$ui", "Lj3/d;", "t3", "()Lj3/d;", "dragAndDropManager", "y", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends m.c implements q1, g4.g, g, y {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final a f99080y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f99081z = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private p<Object, ? super m3.e, i0> onStartTransfer;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final l<j3.c, g> onDropTargetValidate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private e lastChildDragAndDropModifierNode;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private g thisDragAndDropTarget;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private long size;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lj3/e$a;", "", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: j3.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj3/e$a$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class C2327a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2327a f99088a = new C2327a();

            private C2327a() {
            }
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/e;", "currentNode", "Lg4/p1;", "c", "(Lj3/e;)Lg4/p1;"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements l<e, p1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j3.c f99089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f99090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l0 f99091d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j3.c cVar, e eVar, l0 l0Var) {
            super(1);
            this.f99089b = cVar;
            this.f99090c = eVar;
            this.f99091d = l0Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p1 b(e eVar) {
            if (!eVar.getIsAttached()) {
                return p1.SkipSubtreeAndContinueTraversal;
            }
            if (!(eVar.thisDragAndDropTarget == null)) {
                d4.a.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            l lVar = eVar.onDropTargetValidate;
            eVar.thisDragAndDropTarget = lVar != null ? (g) lVar.b(this.f99089b) : null;
            boolean z15 = eVar.thisDragAndDropTarget != null;
            if (z15) {
                this.f99090c.t3().b(eVar);
            }
            l0 l0Var = this.f99091d;
            l0Var.f66404a = l0Var.f66404a || z15;
            return p1.ContinueTraversal;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/e;", "currentNode", "Lg4/p1;", "c", "(Lj3/e;)Lg4/p1;"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements l<e, p1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j3.c f99092b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j3.c cVar) {
            super(1);
            this.f99092b = cVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p1 b(e eVar) {
            if (!eVar.getNode().getIsAttached()) {
                return p1.SkipSubtreeAndContinueTraversal;
            }
            g gVar = eVar.thisDragAndDropTarget;
            if (gVar != null) {
                gVar.V1(this.f99092b);
            }
            eVar.thisDragAndDropTarget = null;
            eVar.lastChildDragAndDropModifierNode = null;
            return p1.ContinueTraversal;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg4/q1;", "T", "child", "Lg4/p1;", "c", "(Lg4/q1;)Lg4/p1;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends w implements l<e, p1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f99093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f99094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j3.c f99095d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p0 p0Var, e eVar, j3.c cVar) {
            super(1);
            this.f99093b = p0Var;
            this.f99094c = eVar;
            this.f99095d = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p1 b(e eVar) {
            e eVar2 = eVar;
            if (!this.f99094c.t3().a(eVar2) || !f.d(eVar2, i.a(this.f99095d))) {
                return p1.ContinueTraversal;
            }
            this.f99093b.f66410a = eVar;
            return p1.CancelTraversal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j3.d t3() {
        return g4.h.t(this).getDragAndDropManager();
    }

    @Override // j3.g
    public boolean Q1(j3.c event) {
        e eVar = this.lastChildDragAndDropModifierNode;
        if (eVar != null) {
            return eVar.Q1(event);
        }
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            return gVar.Q1(event);
        }
        return false;
    }

    @Override // g4.q1
    /* JADX INFO: renamed from: T, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // j3.g
    public void V1(j3.c event) {
        f.f(this, new c(event));
    }

    @Override // f3.m.c
    public void X2() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // g4.y, g4.k0
    public void e(long size) {
        this.size = size;
    }

    @Override // j3.g
    public void k1(j3.c event) {
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            gVar.k1(event);
        }
        e eVar = this.lastChildDragAndDropModifierNode;
        if (eVar != null) {
            eVar.k1(event);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    public boolean n3(j3.c startEvent) {
        l0 l0Var = new l0();
        f.f(this, new b(startEvent, this, l0Var));
        return l0Var.f66404a;
    }

    @Override // j3.g
    public void o0(j3.c event) {
        q1 q1Var;
        e eVar;
        e eVar2 = this.lastChildDragAndDropModifierNode;
        if (eVar2 == null || !f.d(eVar2, i.a(event))) {
            if (getNode().getIsAttached()) {
                p0 p0Var = new p0();
                r1.f(this, new d(p0Var, this, event));
                q1Var = (q1) p0Var.f66410a;
            } else {
                q1Var = null;
            }
            eVar = (e) q1Var;
        } else {
            eVar = eVar2;
        }
        if (eVar != null && eVar2 == null) {
            f.e(eVar, event);
            g gVar = this.thisDragAndDropTarget;
            if (gVar != null) {
                gVar.k1(event);
            }
        } else if (eVar == null && eVar2 != null) {
            g gVar2 = this.thisDragAndDropTarget;
            if (gVar2 != null) {
                f.e(gVar2, event);
            }
            eVar2.k1(event);
        } else if (!t.c(eVar, eVar2)) {
            if (eVar != null) {
                f.e(eVar, event);
            }
            if (eVar2 != null) {
                eVar2.k1(event);
            }
        } else if (eVar != null) {
            eVar.o0(event);
        } else {
            g gVar3 = this.thisDragAndDropTarget;
            if (gVar3 != null) {
                gVar3.o0(event);
            }
        }
        this.lastChildDragAndDropModifierNode = eVar;
    }

    @Override // j3.g
    public void o1(j3.c event) {
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            gVar.o1(event);
            return;
        }
        e eVar = this.lastChildDragAndDropModifierNode;
        if (eVar != null) {
            eVar.o1(event);
        }
    }

    @Override // j3.g
    public void t2(j3.c event) {
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            gVar.t2(event);
            return;
        }
        e eVar = this.lastChildDragAndDropModifierNode;
        if (eVar != null) {
            eVar.t2(event);
        }
    }

    /* JADX INFO: renamed from: u3, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(p<Object, ? super m3.e, i0> pVar, l<? super j3.c, ? extends g> lVar) {
        this.onStartTransfer = pVar;
        this.onDropTargetValidate = lVar;
        this.traverseKey = a.C2327a.f99088a;
        this.size = r.INSTANCE.a();
    }

    public /* synthetic */ e(p pVar, l lVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : pVar, (i15 & 2) != 0 ? null : lVar);
    }
}
