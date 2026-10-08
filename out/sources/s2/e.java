package s2;

import er.p;
import fr.w0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J3\u0010\u0011\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u001b\u001a\u00020\u00072\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001f\u001a\u00020\u00072\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u0003J;\u0010'\u001a\u00020\u0007\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00002\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070%¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*¨\u0006-"}, d2 = {"Ls2/e;", "Lo2/a;", "<init>", "()V", "", "f", "()Z", "Loq/i0;", "a", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "e", "(Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "groupHandle", "b", "(Ler/a;IJ)V", "Lr2/i;", "anchor", "c", "(Ler/a;ILr2/i;)V", "d", "V", "T", "value", "Lkotlin/Function2;", "block", "g", "(Ljava/lang/Object;Ler/p;)V", "Ls2/l;", "Ls2/l;", "operations", "pendingOperations", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends o2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l operations = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l pendingOperations = new l();

    public final void a() {
        this.pendingOperations.b();
        this.operations.b();
    }

    public final void b(er.a<? extends Object> factory, int insertIndex, long groupHandle) {
        l lVar = this.operations;
        f.m mVar = f.m.f177574d;
        lVar.l(mVar);
        l lVarA = l.b.a(lVar);
        l.b.d(lVarA, f.s.a(0), factory);
        lVarA.intArgs[lVarA.intArgsSize - lVarA.opCodes[lVarA.opCodesSize - 1].getInts()] = insertIndex;
        l.b.c(lVarA, 1, 2, groupHandle);
        lVar.d(mVar);
        l lVar2 = this.pendingOperations;
        f.t tVar = f.t.f177582d;
        lVar2.l(tVar);
        l lVarA2 = l.b.a(lVar2);
        lVarA2.intArgs[lVarA2.intArgsSize - lVarA2.opCodes[lVarA2.opCodesSize - 1].getInts()] = insertIndex;
        l.b.c(lVarA2, 1, 2, groupHandle);
        lVar2.d(tVar);
    }

    public final void c(er.a<? extends Object> factory, int insertIndex, r2.i anchor) {
        l lVar = this.operations;
        f.n nVar = f.n.f177576d;
        lVar.l(nVar);
        l lVarA = l.b.a(lVar);
        l.b.d(lVarA, f.s.a(0), factory);
        lVarA.intArgs[lVarA.intArgsSize - lVarA.opCodes[lVarA.opCodesSize - 1].getInts()] = insertIndex;
        l.b.d(lVarA, f.s.a(1), anchor);
        lVar.d(nVar);
        l lVar2 = this.pendingOperations;
        f.u uVar = f.u.f177583d;
        lVar2.l(uVar);
        l lVarA2 = l.b.a(lVar2);
        lVarA2.intArgs[lVarA2.intArgsSize - lVarA2.opCodes[lVarA2.opCodesSize - 1].getInts()] = insertIndex;
        l.b.d(lVarA2, f.s.a(0), anchor);
        lVar2.d(uVar);
    }

    public final void d() {
        if (!this.pendingOperations.i()) {
            t.b("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.j(this.operations);
    }

    public final void e(p076m2.c<?> applier, r2.t slots, o2.e rememberManager, q2.g errorContext) {
        if (!this.pendingOperations.h()) {
            t.b("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.e(applier, slots, rememberManager, errorContext);
    }

    public final boolean f() {
        return this.operations.h();
    }

    public final <V, T> void g(V value, p<? super T, ? super V, i0> block) {
        l lVar = this.operations;
        f.j0 j0Var = f.j0.f177569d;
        lVar.l(j0Var);
        l lVarA = l.b.a(lVar);
        l.b.d(lVarA, f.s.a(0), value);
        l.b.d(lVarA, f.s.a(1), (p) w0.g(block, 2));
        lVar.d(j0Var);
    }
}
