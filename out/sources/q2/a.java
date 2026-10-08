package q2;

import er.l;
import er.p;
import fr.w0;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.f4;
import p076m2.i5;
import p076m2.l0;
import p076m2.n;
import p076m2.r2;
import p076m2.s2;
import p076m2.u;
import p076m2.v;
import p076m2.v4;
import p2.SlotWriter;
import y2.IntRef;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J5\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0016\u001a\u00020\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010!\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010%\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\"2\u0006\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\b\u0010\u0019\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00072\u0006\u0010-\u001a\u00020#¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0007¢\u0006\u0004\b0\u0010\u0003J\r\u00101\u001a\u00020\u0007¢\u0006\u0004\b1\u0010\u0003J\u0017\u00103\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0007¢\u0006\u0004\b5\u0010\u0003J\u0015\u00106\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0007¢\u0006\u0004\b8\u0010\u0003J\r\u00109\u001a\u00020\u0007¢\u0006\u0004\b9\u0010\u0003J\r\u0010:\u001a\u00020\u0007¢\u0006\u0004\b:\u0010\u0003J\u001d\u0010=\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J%\u0010A\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010<\u001a\u00020;2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020#¢\u0006\u0004\bD\u0010/J)\u0010I\u001a\u00020\u00072\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00070E2\u0006\u0010H\u001a\u00020F¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u00072\b\u0010K\u001a\u0004\u0018\u00010\"¢\u0006\u0004\bL\u00104J;\u0010Q\u001a\u00020\u0007\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N2\u0006\u0010\u0019\u001a\u00028\u00012\u0018\u0010P\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070O¢\u0006\u0004\bQ\u0010RJ\u001d\u0010U\u001a\u00020\u00072\u0006\u0010S\u001a\u00020#2\u0006\u0010T\u001a\u00020#¢\u0006\u0004\bU\u0010VJ%\u0010X\u001a\u00020\u00072\u0006\u0010W\u001a\u00020#2\u0006\u0010<\u001a\u00020#2\u0006\u0010-\u001a\u00020#¢\u0006\u0004\bX\u0010YJ\u0015\u0010[\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020#¢\u0006\u0004\b[\u0010/J\u0015\u0010\\\u001a\u00020\u00072\u0006\u0010-\u001a\u00020#¢\u0006\u0004\b\\\u0010/J\u001d\u0010_\u001a\u00020\u00072\u000e\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0]¢\u0006\u0004\b_\u0010`J\u001b\u0010c\u001a\u00020\u00072\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00070a¢\u0006\u0004\bc\u0010dJ\u001d\u0010g\u001a\u00020\u00072\u0006\u0010f\u001a\u00020e2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\bg\u0010hJ%\u0010k\u001a\u00020\u00072\u000e\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0i2\u0006\u0010j\u001a\u00020e¢\u0006\u0004\bk\u0010lJ/\u0010r\u001a\u00020\u00072\b\u0010n\u001a\u0004\u0018\u00010m2\u0006\u0010p\u001a\u00020o2\u0006\u0010<\u001a\u00020q2\u0006\u0010W\u001a\u00020q¢\u0006\u0004\br\u0010sJ%\u0010v\u001a\u00020\u00072\u0006\u0010H\u001a\u00020t2\u0006\u0010p\u001a\u00020o2\u0006\u0010u\u001a\u00020q¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020\u0007¢\u0006\u0004\bx\u0010\u0003J!\u0010z\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u00002\n\b\u0002\u0010j\u001a\u0004\u0018\u00010e¢\u0006\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010}¨\u0006\u007f"}, d2 = {"Lq2/a;", "Lm2/i;", "<init>", "()V", "", "c", "()Z", "Loq/i0;", "a", "Lm2/i5;", "slotStorage", "Lm2/c;", "applier", "Lo2/e;", "rememberManager", "Le3/k;", "errorContext", "b", "(Lm2/i5;Lm2/c;Lo2/e;Le3/k;)V", "Lp2/o;", "slots", "Lq2/g;", "e", "(Lm2/c;Lp2/o;Lo2/e;Lq2/g;)V", "Lm2/v4;", "value", "y", "(Lm2/v4;)V", "Lm2/f4;", "scope", "z", "(Lm2/f4;)V", "F", "p", "", "", "groupSlotIndex", "K", "(Ljava/lang/Object;I)V", "Lp2/c;", "anchor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ljava/lang/Object;Lp2/c;I)V", "g", "(Lp2/c;Ljava/lang/Object;)V", "count", "G", "(I)V", "C", "j", "data", "I", "(Ljava/lang/Object;)V", "r", "q", "(Lp2/c;)V", "n", "E", "A", "Lp2/l;", "from", "t", "(Lp2/c;Lp2/l;)V", "Lq2/d;", "fixups", "u", "(Lp2/c;Lp2/l;Lq2/d;)V", "offset", "v", "Lkotlin/Function1;", "Lm2/u;", "action", "composition", "m", "(Ler/l;Lm2/u;)V", "node", "M", "T", "V", "Lkotlin/Function2;", "block", "J", "(Ljava/lang/Object;Ler/p;)V", "removeFrom", "moveCount", "B", "(II)V", "to", "w", "(III)V", "distance", "f", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "", "nodes", "l", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", ip.a.f96138c, "(Ler/a;)V", "Ly2/o;", "effectiveNodeIndexOut", "k", "(Ly2/o;Lp2/c;)V", "", "effectiveNodeIndex", "h", "(Ljava/util/List;Ly2/o;)V", "Lm2/r2;", "resolvedState", "Lm2/v;", "parentContext", "Lm2/s2;", "i", "(Lm2/r2;Lm2/v;Lm2/s2;Lm2/s2;)V", "Lm2/l0;", "reference", "x", "(Lm2/l0;Lm2/v;Lm2/s2;)V", "o", "changeList", "s", "(Lq2/a;Ly2/o;)V", "Lq2/j;", "Lq2/j;", "operations", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends p076m2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j operations = new j();

    public final void A() {
        this.operations.i(e.y.f163840c);
    }

    public final void B(int removeFrom, int moveCount) {
        j jVar = this.operations;
        e.z zVar = e.z.f163841c;
        jVar.j(zVar);
        j jVarA = j.b.a(jVar);
        int ints = jVarA.intArgsSize - jVarA.opCodes[jVarA.opCodesSize - 1].getInts();
        int[] iArr = jVarA.intArgs;
        iArr[ints] = removeFrom;
        iArr[ints + 1] = moveCount;
        jVar.c(zVar);
    }

    public final void C() {
        this.operations.i(e.a0.f163807c);
    }

    public final void D(er.a<i0> effect) {
        j jVar = this.operations;
        e.b0 b0Var = e.b0.f163809c;
        jVar.j(b0Var);
        j.b.b(j.b.a(jVar), e.t.a(0), effect);
        jVar.c(b0Var);
    }

    public final void E() {
        this.operations.i(e.c0.f163811c);
    }

    public final void F(f4 scope) {
        j jVar = this.operations;
        e.d0 d0Var = e.d0.f163813c;
        jVar.j(d0Var);
        j.b.b(j.b.a(jVar), e.t.a(0), scope);
        jVar.c(d0Var);
    }

    public final void G(int count) {
        j jVar = this.operations;
        e.e0 e0Var = e.e0.f163815c;
        jVar.j(e0Var);
        j jVarA = j.b.a(jVar);
        jVarA.intArgs[jVarA.intArgsSize - jVarA.opCodes[jVarA.opCodesSize - 1].getInts()] = count;
        jVar.c(e0Var);
    }

    public final void H(Object value, p2.c anchor, int groupSlotIndex) {
        j jVar = this.operations;
        e.f0 f0Var = e.f0.f163817c;
        jVar.j(f0Var);
        j jVarA = j.b.a(jVar);
        j.b.c(jVarA, e.t.a(0), value, e.t.a(1), anchor);
        jVarA.intArgs[jVarA.intArgsSize - jVarA.opCodes[jVarA.opCodesSize - 1].getInts()] = groupSlotIndex;
        jVar.c(f0Var);
    }

    public final void I(Object data) {
        j jVar = this.operations;
        e.g0 g0Var = e.g0.f163819c;
        jVar.j(g0Var);
        j.b.b(j.b.a(jVar), e.t.a(0), data);
        jVar.c(g0Var);
    }

    public final <T, V> void J(V value, p<? super T, ? super V, i0> block) {
        j jVar = this.operations;
        e.h0 h0Var = e.h0.f163821c;
        jVar.j(h0Var);
        j.b.c(j.b.a(jVar), e.t.a(0), value, e.t.a(1), (p) w0.g(block, 2));
        jVar.c(h0Var);
    }

    public final void K(Object value, int groupSlotIndex) {
        j jVar = this.operations;
        e.i0 i0Var = e.i0.f163823c;
        jVar.j(i0Var);
        j jVarA = j.b.a(jVar);
        j.b.b(jVarA, e.t.a(0), value);
        jVarA.intArgs[jVarA.intArgsSize - jVarA.opCodes[jVarA.opCodesSize - 1].getInts()] = groupSlotIndex;
        jVar.c(i0Var);
    }

    public final void L(int count) {
        j jVar = this.operations;
        e.j0 j0Var = e.j0.f163825c;
        jVar.j(j0Var);
        j jVarA = j.b.a(jVar);
        jVarA.intArgs[jVarA.intArgsSize - jVarA.opCodes[jVarA.opCodesSize - 1].getInts()] = count;
        jVar.c(j0Var);
    }

    public final void M(Object node) {
        if (node instanceof n) {
            this.operations.i(e.k0.f163827c);
        }
    }

    @Override // p076m2.i
    public void a() {
        this.operations.a();
    }

    @Override // p076m2.i
    public void b(i5 slotStorage, p076m2.c<?> applier, o2.e rememberManager, e3.k errorContext) {
        SlotWriter slotWriterV = p2.n.o(slotStorage).V();
        try {
            e(applier, slotWriterV, rememberManager, errorContext);
            i0 i0Var = i0.f148189a;
            boolean z15 = true;
        } finally {
            slotWriterV.K(false);
        }
    }

    @Override // p076m2.i
    public boolean c() {
        return this.operations.f();
    }

    public final void e(p076m2.c<?> applier, SlotWriter slots, o2.e rememberManager, g errorContext) {
        this.operations.d(applier, slots, rememberManager, errorContext);
    }

    public final void f(int distance) {
        j jVar = this.operations;
        e.a aVar = e.a.f163806c;
        jVar.j(aVar);
        j jVarA = j.b.a(jVar);
        jVarA.intArgs[jVarA.intArgsSize - jVarA.opCodes[jVarA.opCodesSize - 1].getInts()] = distance;
        jVar.c(aVar);
    }

    public final void g(p2.c anchor, Object value) {
        j jVar = this.operations;
        e.b bVar = e.b.f163808c;
        jVar.j(bVar);
        j.b.c(j.b.a(jVar), e.t.a(0), anchor, e.t.a(1), value);
        jVar.c(bVar);
    }

    public final void h(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        j jVar = this.operations;
        e.d dVar = e.d.f163812c;
        jVar.j(dVar);
        j.b.c(j.b.a(jVar), e.t.a(1), nodes, e.t.a(0), effectiveNodeIndex);
        jVar.c(dVar);
    }

    public final void i(r2 resolvedState, v parentContext, s2 from, s2 to4) {
        j jVar = this.operations;
        e.C4069e c4069e = e.C4069e.f163814c;
        jVar.j(c4069e);
        j.b.e(j.b.a(jVar), e.t.a(0), resolvedState, e.t.a(1), parentContext, e.t.a(3), to4, e.t.a(2), from);
        jVar.c(c4069e);
    }

    public final void j() {
        this.operations.i(e.f.f163816c);
    }

    public final void k(IntRef effectiveNodeIndexOut, p2.c anchor) {
        j jVar = this.operations;
        e.g gVar = e.g.f163818c;
        jVar.j(gVar);
        j.b.c(j.b.a(jVar), e.t.a(0), effectiveNodeIndexOut, e.t.a(1), anchor);
        jVar.c(gVar);
    }

    public final void l(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        j jVar = this.operations;
        e.h hVar = e.h.f163820c;
        jVar.j(hVar);
        j.b.b(j.b.a(jVar), e.t.a(0), nodes);
        jVar.c(hVar);
    }

    public final void m(l<? super u, i0> action, u composition) {
        j jVar = this.operations;
        e.i iVar = e.i.f163822c;
        jVar.j(iVar);
        j.b.c(j.b.a(jVar), e.t.a(0), action, e.t.a(1), composition);
        jVar.c(iVar);
    }

    public final void n() {
        this.operations.i(e.j.f163824c);
    }

    public final void o() {
        this.operations.i(e.k.f163826c);
    }

    public final void p(f4 scope) {
        j jVar = this.operations;
        e.l lVar = e.l.f163828c;
        jVar.j(lVar);
        j.b.b(j.b.a(jVar), e.t.a(0), scope);
        jVar.c(lVar);
    }

    public final void q(p2.c anchor) {
        j jVar = this.operations;
        e.m mVar = e.m.f163829c;
        jVar.j(mVar);
        j.b.b(j.b.a(jVar), e.t.a(0), anchor);
        jVar.c(mVar);
    }

    public final void r() {
        this.operations.i(e.n.f163830c);
    }

    public final void s(a changeList, IntRef effectiveNodeIndex) {
        if (changeList.d()) {
            j jVar = this.operations;
            e.c cVar = e.c.f163810c;
            jVar.j(cVar);
            j.b.c(j.b.a(jVar), e.t.a(0), changeList, e.t.a(1), effectiveNodeIndex);
            jVar.c(cVar);
        }
    }

    public final void t(p2.c anchor, p2.l from) {
        j jVar = this.operations;
        e.p pVar = e.p.f163832c;
        jVar.j(pVar);
        j.b.c(j.b.a(jVar), e.t.a(0), anchor, e.t.a(1), from);
        jVar.c(pVar);
    }

    public final void u(p2.c anchor, p2.l from, d fixups) {
        j jVar = this.operations;
        e.q qVar = e.q.f163833c;
        jVar.j(qVar);
        j.b.d(j.b.a(jVar), e.t.a(0), anchor, e.t.a(1), from, e.t.a(2), fixups);
        jVar.c(qVar);
    }

    public final void v(int offset) {
        j jVar = this.operations;
        e.r rVar = e.r.f163834c;
        jVar.j(rVar);
        j jVarA = j.b.a(jVar);
        jVarA.intArgs[jVarA.intArgsSize - jVarA.opCodes[jVarA.opCodesSize - 1].getInts()] = offset;
        jVar.c(rVar);
    }

    public final void w(int to4, int from, int count) {
        j jVar = this.operations;
        e.s sVar = e.s.f163835c;
        jVar.j(sVar);
        j jVarA = j.b.a(jVar);
        int ints = jVarA.intArgsSize - jVarA.opCodes[jVarA.opCodesSize - 1].getInts();
        int[] iArr = jVarA.intArgs;
        iArr[ints + 1] = to4;
        iArr[ints] = from;
        iArr[ints + 2] = count;
        jVar.c(sVar);
    }

    public final void x(l0 composition, v parentContext, s2 reference) {
        j jVar = this.operations;
        e.v vVar = e.v.f163837c;
        jVar.j(vVar);
        j.b.d(j.b.a(jVar), e.t.a(0), composition, e.t.a(1), parentContext, e.t.a(2), reference);
        jVar.c(vVar);
    }

    public final void y(v4 value) {
        j jVar = this.operations;
        e.w wVar = e.w.f163838c;
        jVar.j(wVar);
        j.b.b(j.b.a(jVar), e.t.a(0), value);
        jVar.c(wVar);
    }

    public final void z(f4 scope) {
        j jVar = this.operations;
        e.x xVar = e.x.f163839c;
        jVar.j(xVar);
        j.b.b(j.b.a(jVar), e.t.a(0), scope);
        jVar.c(xVar);
    }
}
