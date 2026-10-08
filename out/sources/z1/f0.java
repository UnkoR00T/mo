package z1;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p071kotlin.Metadata;
import p076m2.b4;
import q4.z3;
import x4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aU\u0010\u0017\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"J\u0010)\u001a$\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040 8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b!\u0010\"\u0012\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lz1/i0;", "selectedTextType", "Lx4/d;", "localeList", "Lz1/x;", "h", "(Lz1/i0;Lx4/d;Lm2/r;I)Lz1/x;", "Lz1/v1;", "", "text", "Lq4/z3;", "selection", "", "g", "(Lz1/v1;Ljava/lang/CharSequence;J)Z", "Lp1/a;", "Landroid/content/Context;", "context", "editable", "platformSelectionBehaviors", "Lkotlin/Function1;", "Loq/i0;", "child", "f", "(Lp1/a;Landroid/content/Context;ZLjava/lang/CharSequence;Lq4/z3;Lz1/x;Ler/l;)V", "Lm2/b4;", "Ltq/i;", "a", "Lm2/b4;", "getLocalTextClassifierCoroutineContext", "()Lm2/b4;", "LocalTextClassifierCoroutineContext", "Lkotlin/Function4;", "b", "Ler/r;", "getPlatformSelectionBehaviorsFactory", "()Ler/r;", "setPlatformSelectionBehaviorsFactory", "(Ler/r;)V", "getPlatformSelectionBehaviorsFactory$annotations", "()V", "PlatformSelectionBehaviorsFactory", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<tq.i> f232072a = p076m2.d0.j(new er.a() { // from class: z1.d0
        @Override // er.a
        public final Object a() {
            return f0.c();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.r<? super tq.i, ? super Context, ? super i0, ? super LocaleList, ? extends x> f232073b = new er.r() { // from class: z1.e0
        @Override // er.r
        public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
            return f0.d((tq.i) obj, (Context) obj2, (i0) obj3, (LocaleList) obj4);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final tq.i c() {
        return ju.g1.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 d(tq.i iVar, Context context, i0 i0Var, LocaleList localeList) {
        return new a0(iVar, context, i0Var, localeList);
    }

    public static final void f(p1.a aVar, Context context, boolean z15, CharSequence charSequence, z3 z3Var, x xVar, er.l<? super p1.a, oq.i0> lVar) {
        if (Build.VERSION.SDK_INT >= 28 && charSequence != null && z3Var != null && xVar != null && (xVar instanceof a0)) {
            ((a0) xVar).l(aVar, charSequence, z3Var.getPackedValue(), lVar);
            o1.e.b(aVar, context, z15, charSequence, z3Var.getPackedValue());
            return;
        }
        lVar.b(aVar);
        if (charSequence == null || z3Var == null) {
            return;
        }
        o1.e.b(aVar, context, z15, charSequence, z3Var.getPackedValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(TextClassificationResult textClassificationResult, CharSequence charSequence, long j15) {
        return z3.g(j15, textClassificationResult.getSelection()) && fr.t.c(charSequence, textClassificationResult.getText());
    }

    public static final x h(i0 i0Var, LocaleList localeList, p076m2.r rVar, int i15) {
        rVar.X(430530635);
        if (p076m2.t.k()) {
            p076m2.t.o(430530635, i15, -1, "androidx.compose.foundation.text.selection.rememberPlatformSelectionBehaviors (PlatformSelectionBehaviors.android.kt:95)");
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return null;
        }
        Context context = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        tq.i iVar = (tq.i) rVar.N(f232072a);
        boolean zW = rVar.W(iVar) | rVar.W(context) | ((((i15 & 14) ^ 6) > 4 && rVar.c(i0Var.ordinal())) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar.W(localeList)) || (i15 & 48) == 32);
        x xVarE = rVar.E();
        if (zW || xVarE == p076m2.r.INSTANCE.a()) {
            xVarE = f232073b.g(iVar, context, i0Var, localeList);
            rVar.v(xVarE);
        }
        x xVar = (x) xVarE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return xVar;
    }
}
