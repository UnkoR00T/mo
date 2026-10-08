package p088nul;

import CON.s0;
import CON.x0;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import er.a;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lnul/w0;", "", "<init>", "()V", "Lm2/b4;", "LCON/s0;", "b", "Lm2/b4;", "LocalOnBackPressedDispatcherOwner", "c", "(Lm2/r;I)LCON/s0;", "current", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f138887a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b4<s0> LocalOnBackPressedDispatcherOwner = d0.h(null, new a() { // from class: nul.v0
        @Override // er.a
        public final Object a() {
            return w0.b();
        }
    }, 1, null);

    private w0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s0 b() {
        return null;
    }

    public final s0 c(r rVar, int i15) {
        if (t.k()) {
            t.o(-2068013981, i15, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:59)");
        }
        s0 s0VarA = (s0) rVar.N(LocalOnBackPressedDispatcherOwner);
        if (s0VarA == null) {
            rVar.X(1208426157);
            s0VarA = x0.a((View) rVar.N(AndroidCompositionLocals_androidKt.g()));
            rVar.R();
        } else {
            rVar.X(1208423708);
            rVar.R();
        }
        if (s0VarA == null) {
            rVar.X(1208428160);
            Object baseContext = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof s0) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            s0VarA = (s0) baseContext;
            rVar.R();
        } else {
            rVar.X(1208423789);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return s0VarA;
    }
}
