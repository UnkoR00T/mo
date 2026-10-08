package s2;

import er.p;
import fr.w0;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.f4;
import p076m2.i5;
import p076m2.j2;
import p076m2.l0;
import p076m2.n;
import p076m2.r2;
import p076m2.s2;
import p076m2.u;
import p076m2.v;
import p076m2.v4;
import r2.a0;
import r2.o;
import r2.q;
import r2.t;
import y2.IntRef;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003J5\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0017\u001a\u00020\b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010 J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010 J\u001d\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\b2\u0006\u0010*\u001a\u00020)2\b\u0010\u001a\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010+¢\u0006\u0004\b.\u0010/J!\u00103\u001a\u00020\b2\n\u00101\u001a\u00060)j\u0002`02\u0006\u00102\u001a\u00020)¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\b¢\u0006\u0004\b5\u0010\u0003J\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010\u0003J\u0017\u00108\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010+¢\u0006\u0004\b8\u0010/J\r\u00109\u001a\u00020\b¢\u0006\u0004\b9\u0010\u0003J!\u0010?\u001a\u00020\b2\u0006\u0010;\u001a\u00020:2\n\u0010>\u001a\u00060<j\u0002`=¢\u0006\u0004\b?\u0010@J)\u0010C\u001a\u00020\b2\u0006\u0010;\u001a\u00020:2\n\u0010>\u001a\u00060<j\u0002`=2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020)¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\b¢\u0006\u0004\bH\u0010\u0003J)\u0010M\u001a\u00020\b2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0I2\u0006\u0010L\u001a\u00020J¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\b2\b\u0010O\u001a\u0004\u0018\u00010+¢\u0006\u0004\bP\u0010/J;\u0010U\u001a\u00020\b\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R2\u0006\u0010\u001a\u001a\u00028\u00012\u0018\u0010T\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0S¢\u0006\u0004\bU\u0010VJ\u001d\u0010Y\u001a\u00020\b2\u0006\u0010W\u001a\u00020)2\u0006\u0010X\u001a\u00020)¢\u0006\u0004\bY\u00104J%\u0010\\\u001a\u00020\b2\u0006\u0010Z\u001a\u00020)2\u0006\u0010[\u001a\u00020)2\u0006\u00102\u001a\u00020)¢\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001a\u00020\b2\n\u0010^\u001a\u00060<j\u0002`=¢\u0006\u0004\b_\u0010`J!\u0010c\u001a\u00020\b2\u0006\u0010b\u001a\u00020a2\n\u0010^\u001a\u00060<j\u0002`=¢\u0006\u0004\bc\u0010dJ\r\u0010e\u001a\u00020\b¢\u0006\u0004\be\u0010\u0003J\r\u0010f\u001a\u00020\b¢\u0006\u0004\bf\u0010\u0003J\u0015\u0010g\u001a\u00020\b2\u0006\u00102\u001a\u00020)¢\u0006\u0004\bg\u0010GJ\u001d\u0010j\u001a\u00020\b2\u000e\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0h¢\u0006\u0004\bj\u0010kJ\u001b\u0010n\u001a\u00020\b2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\b0l¢\u0006\u0004\bn\u0010oJ!\u0010s\u001a\u00020\b2\u0006\u0010q\u001a\u00020p2\n\u0010r\u001a\u00060<j\u0002`=¢\u0006\u0004\bs\u0010tJ%\u0010w\u001a\u00020\b2\u000e\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0u2\u0006\u0010v\u001a\u00020p¢\u0006\u0004\bw\u0010xJ/\u0010~\u001a\u00020\b2\b\u0010z\u001a\u0004\u0018\u00010y2\u0006\u0010|\u001a\u00020{2\u0006\u0010[\u001a\u00020}2\u0006\u0010Z\u001a\u00020}¢\u0006\u0004\b~\u0010\u007fJ*\u0010\u0082\u0001\u001a\u00020\b2\u0007\u0010L\u001a\u00030\u0080\u00012\u0006\u0010|\u001a\u00020{2\u0007\u0010\u0081\u0001\u001a\u00020}¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020\b¢\u0006\u0005\b\u0084\u0001\u0010\u0003J\u0018\u0010\u0085\u0001\u001a\u00020\b2\u0006\u0010z\u001a\u00020y¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J%\u0010\u0088\u0001\u001a\u00020\b2\u0007\u0010\u0087\u0001\u001a\u00020\u00002\n\b\u0002\u0010v\u001a\u0004\u0018\u00010p¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008c\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u008b\u0001¨\u0006\u008d\u0001"}, d2 = {"Ls2/a;", "Lm2/i;", "<init>", "()V", "", "c", "()Z", "f", "Loq/i0;", "a", "Lm2/i5;", "slotStorage", "Lm2/c;", "applier", "Lo2/e;", "rememberManager", "Le3/k;", "errorContext", "b", "(Lm2/i5;Lm2/c;Lo2/e;Le3/k;)V", "Lr2/t;", "slots", "Lq2/g;", "e", "(Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "Lm2/v4;", "value", "x", "(Lm2/v4;)V", "Lm2/f4;", "scope", "y", "(Lm2/f4;)V", "I", "q", "Lm2/j2;", "holder", "Lr2/i;", "after", "M", "(Lm2/j2;Lr2/i;)V", "", "slotIndex", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(ILjava/lang/Object;)V", "g", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "firstTailGroupToRemove", "count", "B", "(II)V", "C", "k", "data", "J", "z", "Lr2/o;", "sourceTable", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "source", "s", "(Lr2/o;J)V", "Ls2/e;", "fixups", "t", "(Lr2/o;JLs2/e;)V", "offset", "u", "(I)V", "h", "Lkotlin/Function1;", "Lm2/u;", "action", "composition", "o", "(Ler/l;Lm2/u;)V", "node", "O", "T", "V", "Lkotlin/Function2;", "block", "K", "(Ljava/lang/Object;Ler/p;)V", "nodeIndex", "removeCount", "A", "to", "from", "v", "(III)V", "handle", "E", "(J)V", "Lr2/q;", "addressSpace", ip.a.f96138c, "(Lr2/q;J)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "G", "N", "", "nodes", "n", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "F", "(Ler/a;)V", "Ly2/o;", "effectiveNodeIndexOut", "groupHandle", "l", "(Ly2/o;J)V", "", "effectiveNodeIndex", "i", "(Ljava/util/List;Ly2/o;)V", "Lm2/r2;", "resolvedState", "Lm2/v;", "parentContext", "Lm2/s2;", "j", "(Lm2/r2;Lm2/v;Lm2/s2;Lm2/s2;)V", "Lm2/l0;", "reference", "w", "(Lm2/l0;Lm2/v;Lm2/s2;)V", "p", "m", "(Lm2/r2;)V", "changeList", "r", "(Ls2/a;Ly2/o;)V", "Ls2/l;", "Ls2/l;", "operations", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends p076m2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l operations = new l();

    public final void A(int nodeIndex, int removeCount) {
        l lVar = this.operations;
        f.z zVar = f.z.f177588d;
        lVar.l(zVar);
        l lVarA = l.b.a(lVar);
        int ints = lVarA.intArgsSize - lVarA.opCodes[lVarA.opCodesSize - 1].getInts();
        int[] iArr = lVarA.intArgs;
        iArr[ints] = nodeIndex;
        iArr[ints + 1] = removeCount;
        lVar.d(zVar);
    }

    public final void B(int firstTailGroupToRemove, int count) {
        l lVar = this.operations;
        f.a0 a0Var = f.a0.f177551d;
        lVar.l(a0Var);
        l lVarA = l.b.a(lVar);
        int ints = lVarA.intArgsSize - lVarA.opCodes[lVarA.opCodesSize - 1].getInts();
        int[] iArr = lVarA.intArgs;
        iArr[ints] = firstTailGroupToRemove;
        iArr[ints + 1] = count;
        lVar.d(a0Var);
    }

    public final void C() {
        this.operations.k(f.b0.f177553d);
    }

    public final void D(q addressSpace, long handle) {
        l lVar = this.operations;
        f.c0 c0Var = f.c0.f177555d;
        lVar.l(c0Var);
        l.b.d(l.b.a(lVar), f.s.a(0), r2.j.a(addressSpace, handle));
        lVar.d(c0Var);
    }

    public final void E(long handle) {
        l lVar = this.operations;
        f.d0 d0Var = f.d0.f177557d;
        lVar.l(d0Var);
        l.b.c(l.b.a(lVar), 0, 1, handle);
        lVar.d(d0Var);
    }

    public final void F(er.a<i0> effect) {
        l lVar = this.operations;
        f.e0 e0Var = f.e0.f177559d;
        lVar.l(e0Var);
        l.b.d(l.b.a(lVar), f.s.a(0), effect);
        lVar.d(e0Var);
    }

    public final void G() {
        this.operations.k(f.f0.f177561d);
    }

    public final void H() {
        this.operations.k(f.g0.f177563d);
    }

    public final void I(f4 scope) {
        l lVar = this.operations;
        f.h0 h0Var = f.h0.f177565d;
        lVar.l(h0Var);
        l.b.d(l.b.a(lVar), f.s.a(0), scope);
        lVar.d(h0Var);
    }

    public final void J(Object data) {
        l lVar = this.operations;
        f.i0 i0Var = f.i0.f177567d;
        lVar.l(i0Var);
        l.b.d(l.b.a(lVar), f.s.a(0), data);
        lVar.d(i0Var);
    }

    public final <T, V> void K(V value, p<? super T, ? super V, i0> block) {
        l lVar = this.operations;
        f.j0 j0Var = f.j0.f177569d;
        lVar.l(j0Var);
        l.b.e(l.b.a(lVar), f.s.a(0), value, f.s.a(1), (p) w0.g(block, 2));
        lVar.d(j0Var);
    }

    public final void L(int slotIndex, Object value) {
        l lVar = this.operations;
        f.l0 l0Var = f.l0.f177573d;
        lVar.l(l0Var);
        l lVarA = l.b.a(lVar);
        lVarA.intArgs[lVarA.intArgsSize - lVarA.opCodes[lVarA.opCodesSize - 1].getInts()] = slotIndex;
        l.b.d(lVarA, f.s.a(0), value);
        lVar.d(l0Var);
    }

    public final void M(j2 holder, r2.i after) {
        l lVar = this.operations;
        f.k0 k0Var = f.k0.f177571d;
        lVar.l(k0Var);
        l lVarA = l.b.a(lVar);
        l.b.d(lVarA, f.s.a(1), holder);
        l.b.d(lVarA, f.s.a(0), after);
        lVar.d(k0Var);
    }

    public final void N(int count) {
        l lVar = this.operations;
        f.m0 m0Var = f.m0.f177575d;
        lVar.l(m0Var);
        l lVarA = l.b.a(lVar);
        lVarA.intArgs[lVarA.intArgsSize - lVarA.opCodes[lVarA.opCodesSize - 1].getInts()] = count;
        lVar.d(m0Var);
    }

    public final void O(Object node) {
        if (node instanceof n) {
            this.operations.k(f.n0.f177577d);
        }
    }

    @Override // p076m2.i
    public void a() {
        this.operations.b();
    }

    @Override // p076m2.i
    public void b(i5 slotStorage, p076m2.c<?> applier, o2.e rememberManager, e3.k errorContext) {
        t tVarX = a0.f(slotStorage).X();
        try {
            e(applier, tVarX, rememberManager, errorContext);
            i0 i0Var = i0.f148189a;
        } finally {
            tVarX.b();
        }
    }

    @Override // p076m2.i
    public boolean c() {
        return this.operations.h();
    }

    public final void e(p076m2.c<?> applier, t slots, o2.e rememberManager, q2.g errorContext) {
        this.operations.e(applier, slots, rememberManager, errorContext);
    }

    public final boolean f() {
        return this.operations.getRequiresApplication();
    }

    public final void g(Object value) {
        l lVar = this.operations;
        f.a aVar = f.a.f177550d;
        lVar.l(aVar);
        l.b.d(l.b.a(lVar), f.s.a(0), value);
        lVar.d(aVar);
    }

    public final void h() {
        this.operations.k(f.c.f177554d);
    }

    public final void i(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        l lVar = this.operations;
        f.d dVar = f.d.f177556d;
        lVar.l(dVar);
        l.b.e(l.b.a(lVar), f.s.a(1), nodes, f.s.a(0), effectiveNodeIndex);
        lVar.d(dVar);
    }

    public final void j(r2 resolvedState, v parentContext, s2 from, s2 to4) {
        l lVar = this.operations;
        f.e eVar = f.e.f177558d;
        lVar.l(eVar);
        l.b.g(l.b.a(lVar), f.s.a(0), resolvedState, f.s.a(1), parentContext, f.s.a(3), to4, f.s.a(2), from);
        lVar.d(eVar);
    }

    public final void k() {
        this.operations.k(f.C4530f.f177560d);
    }

    public final void l(IntRef effectiveNodeIndexOut, long groupHandle) {
        l lVar = this.operations;
        f.g gVar = f.g.f177562d;
        lVar.l(gVar);
        l lVarA = l.b.a(lVar);
        l.b.d(lVarA, f.s.a(0), effectiveNodeIndexOut);
        l.b.c(lVarA, 1, 0, groupHandle);
        lVar.d(gVar);
    }

    public final void m(r2 resolvedState) {
        l lVar = this.operations;
        f.h hVar = f.h.f177564d;
        lVar.l(hVar);
        l.b.d(l.b.a(lVar), f.s.a(0), resolvedState);
        lVar.d(hVar);
    }

    public final void n(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        l lVar = this.operations;
        f.i iVar = f.i.f177566d;
        lVar.l(iVar);
        l.b.d(l.b.a(lVar), f.s.a(0), nodes);
        lVar.d(iVar);
    }

    public final void o(er.l<? super u, i0> action, u composition) {
        l lVar = this.operations;
        f.j jVar = f.j.f177568d;
        lVar.l(jVar);
        l.b.e(l.b.a(lVar), f.s.a(0), action, f.s.a(1), composition);
        lVar.d(jVar);
    }

    public final void p() {
        this.operations.k(f.k.f177570d);
    }

    public final void q(f4 scope) {
        l lVar = this.operations;
        f.l lVar2 = f.l.f177572d;
        lVar.l(lVar2);
        l.b.d(l.b.a(lVar), f.s.a(0), scope);
        lVar.d(lVar2);
    }

    public final void r(a changeList, IntRef effectiveNodeIndex) {
        if (changeList.d()) {
            l lVar = this.operations;
            f.b bVar = f.b.f177552d;
            lVar.l(bVar);
            l lVarA = l.b.a(lVar);
            l.b.e(lVarA, f.s.a(0), changeList, f.s.a(1), effectiveNodeIndex);
            if (changeList.operations.getRequiresApplication()) {
                l.b.b(lVarA);
            }
            lVar.d(bVar);
        }
    }

    public final void s(o sourceTable, long source) {
        l lVar = this.operations;
        f.o oVar = f.o.f177578d;
        lVar.l(oVar);
        l lVarA = l.b.a(lVar);
        l.b.c(lVarA, 0, 1, source);
        l.b.d(lVarA, f.s.a(0), sourceTable);
        lVar.d(oVar);
    }

    public final void t(o sourceTable, long source, e fixups) {
        l lVar = this.operations;
        f.p pVar = f.p.f177579d;
        lVar.l(pVar);
        l lVarA = l.b.a(lVar);
        l.b.c(lVarA, 0, 1, source);
        l.b.e(lVarA, f.s.a(0), sourceTable, f.s.a(1), fixups);
        lVar.d(pVar);
    }

    public final void u(int offset) {
        l lVar = this.operations;
        f.q qVar = f.q.f177580d;
        lVar.l(qVar);
        l lVarA = l.b.a(lVar);
        lVarA.intArgs[lVarA.intArgsSize - lVarA.opCodes[lVarA.opCodesSize - 1].getInts()] = offset;
        lVar.d(qVar);
    }

    public final void v(int to4, int from, int count) {
        l lVar = this.operations;
        f.r rVar = f.r.f177581d;
        lVar.l(rVar);
        l lVarA = l.b.a(lVar);
        int ints = lVarA.intArgsSize - lVarA.opCodes[lVarA.opCodesSize - 1].getInts();
        int[] iArr = lVarA.intArgs;
        iArr[ints + 1] = to4;
        iArr[ints] = from;
        iArr[ints + 2] = count;
        lVar.d(rVar);
    }

    public final void w(l0 composition, v parentContext, s2 reference) {
        l lVar = this.operations;
        f.v vVar = f.v.f177584d;
        lVar.l(vVar);
        l.b.f(l.b.a(lVar), f.s.a(0), composition, f.s.a(1), parentContext, f.s.a(2), reference);
        lVar.d(vVar);
    }

    public final void x(v4 value) {
        l lVar = this.operations;
        f.w wVar = f.w.f177585d;
        lVar.l(wVar);
        l.b.d(l.b.a(lVar), f.s.a(0), value);
        lVar.d(wVar);
    }

    public final void y(f4 scope) {
        l lVar = this.operations;
        f.x xVar = f.x.f177586d;
        lVar.l(xVar);
        l.b.d(l.b.a(lVar), f.s.a(0), scope);
        lVar.d(xVar);
    }

    public final void z() {
        this.operations.k(f.y.f177587d);
    }
}
