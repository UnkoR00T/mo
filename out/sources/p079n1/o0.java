package p079n1;

import android.os.Build;
import android.os.Trace;
import androidx.compose.ui.platform.g1;
import c5.d;
import er.a;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import p076m2.r;
import p076m2.t;
import pq.v;
import q4.Placeholder;
import q4.TextStyle;
import q4.b0;
import q4.c0;
import q4.c4;
import q4.e;
import u4.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u001f\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u001a\u0010#\u001a\u00020\u00128@X\u0081\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"", "text", "Lq4/b4;", "style", "Lu4/l$b;", "fontFamilyResolver", "Loq/i0;", "d", "(Ljava/lang/String;Lq4/b4;Lu4/l$b;Lm2/r;I)V", "Lq4/e;", "", "Lq4/e$d;", "Lq4/g0;", "placeholders", "e", "(Lq4/e;Lq4/b4;Lu4/l$b;Ljava/util/List;Lm2/r;I)V", "", "textLength", "", "j", "(I)Z", "Lm2/b4;", "Ljava/util/concurrent/Executor;", "a", "Lm2/b4;", "getLocalBackgroundTextMeasurementExecutor", "()Lm2/b4;", "LocalBackgroundTextMeasurementExecutor", "b", "Ljava/lang/Boolean;", "backingCoreCountSatisfactory", "i", "()Z", "getCoreCountSatisfactory$annotations", "()V", "coreCountSatisfactory", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<Executor> f130245a = d0.j(new a() { // from class: n1.m0
        @Override // er.a
        public final Object a() {
            return o0.h();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f130246b;

    public static final void d(final String str, final TextStyle textStyle, final l.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1589371739, i15, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:68)");
        }
        Executor executor = (Executor) rVar.N(f130245a);
        if (executor == null || !j(str.length())) {
            rVar.X(1255914055);
            rVar.R();
        } else {
            rVar.X(1254298614);
            final c5.t tVar = (c5.t) rVar.N(g1.l());
            final d dVar = (d) rVar.N(g1.f());
            try {
                executor.execute(new Runnable() { // from class: n1.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0.f(textStyle, tVar, str, dVar, bVar);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
    }

    public static final void e(final e eVar, final TextStyle textStyle, final l.b bVar, final List<e.Range<Placeholder>> list, r rVar, int i15) {
        if (t.k()) {
            t.o(-650368117, i15, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:112)");
        }
        Executor executor = (Executor) rVar.N(f130245a);
        if (executor == null || !j(eVar.length())) {
            rVar.X(-517090505);
            rVar.R();
        } else {
            rVar.X(-518737659);
            final c5.t tVar = (c5.t) rVar.N(g1.l());
            final d dVar = (d) rVar.N(g1.f());
            try {
                executor.execute(new Runnable() { // from class: n1.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0.g(textStyle, tVar, list, eVar, dVar, bVar);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(TextStyle textStyle, c5.t tVar, String str, d dVar, l.b bVar) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            c3.d dVarO = c3.l.Companion.o(c3.l.INSTANCE, null, null, 3, null);
            try {
                c3.l lVarL = dVarO.l();
                try {
                    b0 b0VarB = c0.b(str, c4.d(textStyle, tVar), v.n(), dVar, bVar, null, 32, null);
                    b0VarB.d();
                    b0VarB.f();
                    i0 i0Var = i0.f148189a;
                    dVarO.s(lVarL);
                    dVarO.C().a();
                    dVarO.d();
                    Trace.endSection();
                } catch (Throwable th4) {
                    dVarO.s(lVarL);
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    dVarO.d();
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            Trace.endSection();
            throw th7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(TextStyle textStyle, c5.t tVar, List list, e eVar, d dVar, l.b bVar) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            c3.d dVarO = c3.l.Companion.o(c3.l.INSTANCE, null, null, 3, null);
            try {
                c3.l lVarL = dVarO.l();
                try {
                    TextStyle textStyleD = c4.d(textStyle, tVar);
                    if (list == null) {
                        list = v.n();
                    }
                    q4.t tVar2 = new q4.t(eVar, textStyleD, list, dVar, bVar);
                    tVar2.d();
                    tVar2.f();
                    i0 i0Var = i0.f148189a;
                    dVarO.s(lVarL);
                    dVarO.C().a();
                    dVarO.d();
                    Trace.endSection();
                } catch (Throwable th4) {
                    dVarO.s(lVarL);
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    dVarO.d();
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            Trace.endSection();
            throw th7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor h() {
        return null;
    }

    public static final boolean i() {
        if (f130246b == null) {
            f130246b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
        }
        return f130246b.booleanValue();
    }

    public static final boolean j(int i15) {
        return Build.VERSION.SDK_INT >= 28 && i15 >= 8 && i15 < 1000 && i();
    }
}
