package z9;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import p071kotlin.Metadata;
import p136y9.g1;
import p136y9.s1;
import p136y9.y0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\u00020\u00042\"\u0010\u0003\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000\"\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "Ly9/s1;", "Ly9/y0;", "navigators", "Ly9/g1;", "h", "([Ly9/s1;Lm2/r;I)Ly9/g1;", "Landroid/content/Context;", "context", "g", "(Landroid/content/Context;)Ly9/g1;", "Lb3/x;", "d", "(Landroid/content/Context;)Lb3/x;", "navigation-compose_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/compose/NavHostControllerKt")
final /* synthetic */ class y {
    private static final b3.x<g1, ?> d(final Context context) {
        return b3.a0.e(new er.p() { // from class: z9.w
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return y.e((b3.b0) obj, (g1) obj2);
            }
        }, new er.l() { // from class: z9.x
            @Override // er.l
            public final Object b(Object obj) {
                return y.f(context, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle e(b3.b0 b0Var, g1 g1Var) {
        return g1Var.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g1 f(Context context, Bundle bundle) {
        g1 g1VarG = g(context);
        g1VarG.P(bundle);
        return g1VarG;
    }

    private static final g1 g(Context context) {
        g1 g1Var = new g1(context);
        g1Var.w().c(new d(g1Var.w()));
        g1Var.w().c(new e());
        g1Var.w().c(new n());
        return g1Var;
    }

    public static final g1 h(s1<? extends y0>[] s1VarArr, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-342848815, i15, -1, "androidx.navigation.compose.rememberNavController (NavHostController.android.kt:33)");
        }
        final Context context = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        Object[] objArrCopyOf = Arrays.copyOf(s1VarArr, s1VarArr.length);
        b3.x<g1, ?> xVarD = d(context);
        boolean zG = rVar.G(context);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: z9.v
                @Override // er.a
                public final Object a() {
                    return y.i(context);
                }
            };
            rVar.v(objE);
        }
        g1 g1Var = (g1) b3.f.j(objArrCopyOf, xVarD, null, (er.a) objE, rVar, 0, 4);
        for (s1<? extends y0> s1Var : s1VarArr) {
            g1Var.w().c(s1Var);
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return g1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g1 i(Context context) {
        return g(context);
    }
}
