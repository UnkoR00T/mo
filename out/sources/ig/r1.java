package ig;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends androidx.fragment.app.o implements i {
    private static final WeakHashMap G0 = new WeakHashMap();
    private final q1 F0 = new q1();

    public static r1 R1(androidx.fragment.app.p pVar) {
        r1 r1Var;
        FragmentManager fragmentManagerW0 = pVar.w0();
        WeakHashMap weakHashMap = G0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(pVar);
        if (weakReference != null && (r1Var = (r1) weakReference.get()) != null) {
            return r1Var;
        }
        try {
            r1 r1Var2 = (r1) fragmentManagerW0.j0("SLifecycleFragmentImpl");
            if (r1Var2 == null || r1Var2.n0()) {
                r1Var2 = new r1();
                fragmentManagerW0.o().e(r1Var2, "SLifecycleFragmentImpl").i();
            }
            weakHashMap.put(pVar, new WeakReference(r1Var2));
            return r1Var2;
        } catch (ClassCastException e15) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e15);
        }
    }

    @Override // androidx.fragment.app.o
    public final void C0() {
        super.C0();
        this.F0.i();
    }

    @Override // androidx.fragment.app.o
    public final void S0() {
        super.S0();
        this.F0.e();
    }

    @Override // androidx.fragment.app.o
    public final void T0(Bundle bundle) {
        super.T0(bundle);
        this.F0.g(bundle);
    }

    @Override // androidx.fragment.app.o
    public final void U0() {
        super.U0();
        this.F0.d();
    }

    @Override // androidx.fragment.app.o
    public final void V0() {
        super.V0();
        this.F0.h();
    }

    @Override // ig.i
    public final <T extends h> T c(String str, Class<T> cls) {
        return (T) this.F0.a(str, cls);
    }

    @Override // ig.i
    public final void d(String str, h hVar) {
        this.F0.b(str, hVar);
    }

    @Override // ig.i
    public final Activity g() {
        return r();
    }

    @Override // androidx.fragment.app.o
    public final void m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.m(str, fileDescriptor, printWriter, strArr);
        this.F0.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.fragment.app.o
    public final void s0(int i15, int i16, Intent intent) {
        super.s0(i15, i16, intent);
        this.F0.f(i15, i16, intent);
    }

    @Override // androidx.fragment.app.o
    public final void x0(Bundle bundle) {
        super.x0(bundle);
        this.F0.c(bundle);
    }
}
