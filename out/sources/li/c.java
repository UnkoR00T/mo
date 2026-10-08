package li;

import android.annotation.SuppressLint;
import com.google.android.libraries.places.internal.n41;

/* JADX INFO: loaded from: classes4.dex */
final class c extends androidx.recyclerview.widget.h.f {
    /* synthetic */ c(byte[] bArr) {
    }

    public static final boolean d(ii.h hVar, ii.h hVar2) {
        try {
            return hVar.c().equals(hVar2.c());
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // androidx.recyclerview.widget.h.f
    @SuppressLint({"DiffUtilEquals"})
    public final /* synthetic */ boolean a(Object obj, Object obj2) {
        return ((ii.h) obj).equals((ii.h) obj2);
    }

    @Override // androidx.recyclerview.widget.h.f
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return d((ii.h) obj, (ii.h) obj2);
    }
}
