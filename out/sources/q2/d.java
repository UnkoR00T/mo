package q2;

import er.p;
import fr.w0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.t;
import p2.SlotWriter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J3\u0010\u0011\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u001a\u001a\u00020\u00072\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0003J;\u0010\"\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001d\"\u0004\b\u0001\u0010\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010%¨\u0006("}, d2 = {"Lq2/d;", "Lq2/k;", "<init>", "()V", "", "e", "()Z", "Loq/i0;", "a", "Lm2/c;", "applier", "Lp2/o;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "d", "(Lm2/c;Lp2/o;Lo2/e;Lq2/g;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "Lp2/c;", "groupAnchor", "b", "(Ler/a;ILp2/c;)V", "c", "V", "T", "value", "Lkotlin/Function2;", "block", "f", "(Ljava/lang/Object;Ler/p;)V", "Lq2/j;", "Lq2/j;", "operations", "pendingOperations", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j operations = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j pendingOperations = new j();

    public final void a() {
        this.pendingOperations.a();
        this.operations.a();
    }

    public final void b(er.a<? extends Object> factory, int insertIndex, p2.c groupAnchor) {
        j jVar = this.operations;
        e.o oVar = e.o.f163831c;
        jVar.j(oVar);
        j jVarA = j.b.a(jVar);
        j.b.b(jVarA, e.t.a(0), factory);
        jVarA.intArgs[jVarA.intArgsSize - jVarA.opCodes[jVarA.opCodesSize - 1].getInts()] = insertIndex;
        j.b.b(jVarA, e.t.a(1), groupAnchor);
        jVar.c(oVar);
        j jVar2 = this.pendingOperations;
        e.u uVar = e.u.f163836c;
        jVar2.j(uVar);
        j jVarA2 = j.b.a(jVar2);
        jVarA2.intArgs[jVarA2.intArgsSize - jVarA2.opCodes[jVarA2.opCodesSize - 1].getInts()] = insertIndex;
        j.b.b(jVarA2, e.t.a(0), groupAnchor);
        jVar2.c(uVar);
    }

    public final void c() {
        if (!this.pendingOperations.g()) {
            t.b("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.h(this.operations);
    }

    public final void d(p076m2.c<?> applier, SlotWriter slots, o2.e rememberManager, g errorContext) {
        if (!this.pendingOperations.f()) {
            t.b("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.d(applier, slots, rememberManager, errorContext);
    }

    public final boolean e() {
        return this.operations.f();
    }

    public final <V, T> void f(V value, p<? super T, ? super V, i0> block) {
        j jVar = this.operations;
        e.h0 h0Var = e.h0.f163821c;
        jVar.j(h0Var);
        j jVarA = j.b.a(jVar);
        j.b.b(jVarA, e.t.a(0), value);
        j.b.b(jVarA, e.t.a(1), (p) w0.g(block, 2));
        jVar.c(h0Var);
    }
}
