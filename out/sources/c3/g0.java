package c3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a9\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001a\"\u0018\u0010#\u001a\u00060 j\u0002`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"\"$\u0010&\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\"0\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018@X\u0080\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"T", "Lc3/f0;", "Lkotlin/Function1;", "", "", "block", "k", "(Lc3/f0;Ler/l;)Z", "Lc3/p0;", "", "currentModification", "Lt2/e;", "newList", "structural", "f", "(Lc3/p0;ILt2/e;Z)Z", "list", "Lc3/w0;", "l", "(Lc3/f0;Lt2/e;)Lc3/w0;", "size", "init", "a", "(ILer/l;)Lc3/f0;", "", "j", "()Ljava/lang/Void;", "index", "Loq/i0;", "m", "(II)V", "i", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "sync", "h", "(Lc3/f0;)I", "structure", "g", "(Lc3/f0;)Lc3/p0;", "getReadable$annotations", "(Lc3/f0;)V", "readable", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f22814a = new Object();

    public static final <T> SnapshotStateList<T> a(int i15, er.l<? super Integer, ? extends T> lVar) {
        if (i15 == 0) {
            return new SnapshotStateList<>();
        }
        t2.e.a aVarBuilder = t2.a.b().builder();
        for (int i16 = 0; i16 < i15; i16++) {
            aVarBuilder.add(lVar.b(Integer.valueOf(i16)));
        }
        return new SnapshotStateList<>(aVarBuilder.build());
    }

    public static final <T> boolean f(p0<T> p0Var, int i15, t2.e<? extends T> eVar, boolean z15) {
        boolean z16;
        synchronized (f22814a) {
            try {
                if (p0Var.getModification() == i15) {
                    p0Var.m(eVar);
                    z16 = true;
                    if (z15) {
                        p0Var.o(p0Var.getStructuralChange() + 1);
                    }
                    p0Var.n(p0Var.getModification() + 1);
                } else {
                    z16 = false;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z16;
    }

    public static final <T> p0<T> g(SnapshotStateList<T> snapshotStateList) {
        return (p0) w.c0((p0) snapshotStateList.getFirstStateRecord(), snapshotStateList);
    }

    public static final <T> int h(SnapshotStateList<T> snapshotStateList) {
        return ((p0) w.I((p0) snapshotStateList.getFirstStateRecord())).getStructuralChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void j() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final <T> boolean k(SnapshotStateList<T> snapshotStateList, er.l<? super List<T>, Boolean> lVar) {
        int iK;
        t2.e<T> eVarJ;
        Boolean boolB;
        l lVarC;
        boolean zF;
        do {
            synchronized (f22814a) {
                p0 p0Var = (p0) w.I((p0) snapshotStateList.getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e.a<T> aVarBuilder = eVarJ.builder();
            boolB = lVar.b(aVarBuilder);
            t2.e<T> eVarBuild = aVarBuilder.build();
            if (fr.t.c(eVarBuild, eVarJ)) {
                break;
            }
            p0 p0Var2 = (p0) snapshotStateList.getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = f((p0) w.n0(p0Var2, snapshotStateList, lVarC), iK, eVarBuild, true);
            }
            w.V(lVarC, snapshotStateList);
        } while (!zF);
        return boolB.booleanValue();
    }

    public static final <T> w0 l(SnapshotStateList<T> snapshotStateList, t2.e<? extends T> eVar) {
        l lVarK = w.K();
        p0 p0Var = new p0(lVarK.getSnapshotId(), eVar);
        if (!(lVarK instanceof b)) {
            p0Var.h(new p0(r.c(1), eVar));
        }
        return p0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(int i15, int i16) {
        if (i15 < 0 || i15 >= i16) {
            throw new IndexOutOfBoundsException("index (" + i15 + ") is out of bound of [0, " + i16 + ')');
        }
    }
}
