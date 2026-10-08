package pu;

import er.p;
import ju.b1;
import oq.i0;
import oq.t;
import oq.u;
import ou.j;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000f\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"R", "T", "Lkotlin/Function2;", "Ltq/e;", "", "receiver", "completion", "Loq/i0;", "b", "(Ler/p;Ljava/lang/Object;Ltq/e;)V", "fatalCompletion", "c", "(Ltq/e;Ltq/e;)V", "", "e", "a", "(Ltq/e;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    private static final void a(e<?> eVar, Throwable th4) throws Throwable {
        if (th4 instanceof b1) {
            th4 = ((b1) th4).getCause();
        }
        t.Companion companion = t.INSTANCE;
        eVar.i(t.b(u.a(th4)));
        throw th4;
    }

    public static final <R, T> void b(p<? super R, ? super e<? super T>, ? extends Object> pVar, R r15, e<? super T> eVar) {
        try {
            e eVarC = uq.b.c(uq.b.a(pVar, r15, eVar));
            t.Companion companion = t.INSTANCE;
            j.b(eVarC, t.b(i0.f148189a));
        } catch (Throwable th4) {
            a(eVar, th4);
        }
    }

    public static final void c(e<? super i0> eVar, e<?> eVar2) throws Throwable {
        try {
            e eVarC = uq.b.c(eVar);
            t.Companion companion = t.INSTANCE;
            j.b(eVarC, t.b(i0.f148189a));
        } catch (Throwable th4) {
            a(eVar2, th4);
        }
    }
}
