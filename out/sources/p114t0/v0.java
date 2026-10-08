package p114t0;

import androidx.compose.ui.graphics.Color;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.r;
import p076m2.t;
import u0.f;
import u0.l;
import u0.m;
import u0.q1;
import u0.y2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "targetValue", "Lu0/l;", "animationSpec", "", AnnotatedPrivateKey.LABEL, "Lkotlin/Function1;", "Loq/i0;", "finishedListener", "Lm2/f6;", "a", "(JLu0/l;Ljava/lang/String;Ler/l;Lm2/r;II)Lm2/f6;", "Lu0/q1;", "Lu0/q1;", "colorDefaultSpring", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q1<Color> f186478a = m.j(0.0f, 0.0f, null, 7, null);

    public static final f6<Color> a(long j15, l<Color> lVar, String str, er.l<? super Color, i0> lVar2, r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            lVar = f186478a;
        }
        l<Color> lVar3 = lVar;
        if ((i16 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i16 & 8) != 0) {
            lVar2 = null;
        }
        er.l<? super Color, i0> lVar4 = lVar2;
        if (t.k()) {
            t.o(-451899108, i15, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean zW = rVar.W(Color.m14getColorSpaceimpl(j15));
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = (y2) Function1.a(Color.INSTANCE).b(Color.m14getColorSpaceimpl(j15));
            rVar.v(objE);
        }
        int i17 = i15 << 6;
        f6<Color> f6VarG = f.g(Color.m0boximpl(j15), (y2) objE, lVar3, null, str2, lVar4, rVar, (i15 & 14) | ((i15 << 3) & 896) | (57344 & i17) | (i17 & 458752), 8);
        if (t.k()) {
            t.n();
        }
        return f6VarG;
    }
}
