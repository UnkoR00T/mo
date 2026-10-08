package coil3.compose;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import er.l;
import f3.m;
import kc.d0;
import n3.n1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import p3.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a×\u0001\u0010\u001e\u001a\u00020\f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0099\u0001\u0010#\u001a\u00020\f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\n2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f\u0018\u00010\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"", "model", "", "contentDescription", "Lf3/m;", "modifier", "Landroidx/compose/ui/graphics/painter/a;", "placeholder", "error", "fallback", "Lkotlin/Function1;", "Lcoil3/compose/AsyncImagePainter$State$Loading;", "Loq/i0;", "onLoading", "Lcoil3/compose/AsyncImagePainter$State$Success;", "onSuccess", "Lcoil3/compose/AsyncImagePainter$State$Error;", "onError", "Lf3/c;", "alignment", "Le4/l;", "contentScale", "", "alpha", "Ln3/n1;", "colorFilter", "Ln3/v1;", "filterQuality", "", "clipToBounds", "b", "(Ljava/lang/Object;Ljava/lang/String;Lf3/m;Landroidx/compose/ui/graphics/painter/a;Landroidx/compose/ui/graphics/painter/a;Landroidx/compose/ui/graphics/painter/a;Ler/l;Ler/l;Ler/l;Lf3/c;Le4/l;FLn3/n1;IZLm2/r;III)V", "Lcoil3/compose/AsyncImagePainter$State;", "transform", "onState", "a", "(Ljava/lang/Object;Ljava/lang/String;Lf3/m;Ler/l;Ler/l;Lf3/c;Le4/l;FLn3/n1;IZLm2/r;III)V", "coil-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final void a(Object obj, String str, m mVar, l<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> lVar, l<? super AsyncImagePainter.State, i0> lVar2, f3.c cVar, p036e4.l lVar3, float f15, n1 n1Var, int i15, boolean z15, r rVar, int i16, int i17, int i18) {
        m mVar2 = (i18 & 4) != 0 ? m.INSTANCE : mVar;
        l<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> lVarA = (i18 & 8) != 0 ? AsyncImagePainter.INSTANCE.a() : lVar;
        l<? super AsyncImagePainter.State, i0> lVar4 = (i18 & 16) != 0 ? null : lVar2;
        f3.c cVarE = (i18 & 32) != 0 ? f3.c.INSTANCE.e() : cVar;
        p036e4.l lVarE = (i18 & 64) != 0 ? p036e4.l.INSTANCE.e() : lVar3;
        float f16 = (i18 & 128) != 0 ? 1.0f : f15;
        n1 n1Var2 = (i18 & 256) != 0 ? null : n1Var;
        int iB = (i18 & 512) != 0 ? f.INSTANCE.b() : i15;
        boolean z16 = (i18 & 1024) != 0 ? true : z15;
        if (t.k()) {
            t.o(1976030921, i16, i17, "coil3.compose.AsyncImage (SingletonAsyncImage.kt:117)");
        }
        int i19 = i16 << 3;
        a.d(obj, str, d0.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c())), mVar2, lVarA, lVar4, cVarE, lVarE, f16, n1Var2, iB, z16, rVar, (i16 & 126) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (29360128 & i19) | (234881024 & i19) | (i19 & 1879048192), ((i16 >> 27) & 14) | ((i17 << 3) & 112), 0);
        if (t.k()) {
            t.n();
        }
    }

    public static final void b(Object obj, String str, m mVar, androidx.compose.ui.graphics.painter.a aVar, androidx.compose.ui.graphics.painter.a aVar2, androidx.compose.ui.graphics.painter.a aVar3, l<? super AsyncImagePainter.State.Loading, i0> lVar, l<? super AsyncImagePainter.State.Success, i0> lVar2, l<? super AsyncImagePainter.State.Error, i0> lVar3, f3.c cVar, p036e4.l lVar4, float f15, n1 n1Var, int i15, boolean z15, r rVar, int i16, int i17, int i18) {
        m mVar2 = (i18 & 4) != 0 ? m.INSTANCE : mVar;
        androidx.compose.ui.graphics.painter.a aVar4 = (i18 & 8) != 0 ? null : aVar;
        androidx.compose.ui.graphics.painter.a aVar5 = (i18 & 16) != 0 ? null : aVar2;
        androidx.compose.ui.graphics.painter.a aVar6 = (i18 & 32) != 0 ? aVar5 : aVar3;
        l<? super AsyncImagePainter.State.Loading, i0> lVar5 = (i18 & 64) != 0 ? null : lVar;
        l<? super AsyncImagePainter.State.Success, i0> lVar6 = (i18 & 128) != 0 ? null : lVar2;
        l<? super AsyncImagePainter.State.Error, i0> lVar7 = (i18 & 256) != 0 ? null : lVar3;
        f3.c cVarE = (i18 & 512) != 0 ? f3.c.INSTANCE.e() : cVar;
        p036e4.l lVarE = (i18 & 1024) != 0 ? p036e4.l.INSTANCE.e() : lVar4;
        float f16 = (i18 & 2048) != 0 ? 1.0f : f15;
        n1 n1Var2 = (i18 & PKIFailureInfo.certConfirmed) != 0 ? null : n1Var;
        int iB = (i18 & PKIFailureInfo.certRevoked) != 0 ? f.INSTANCE.b() : i15;
        boolean z16 = (i18 & 16384) != 0 ? true : z15;
        if (t.k()) {
            t.o(-846727149, i16, i17, "coil3.compose.AsyncImage (SingletonAsyncImage.kt:61)");
        }
        int i19 = i16 << 3;
        int i25 = i17 << 3;
        a.c(obj, str, d0.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c())), mVar2, aVar4, aVar5, aVar6, lVar5, lVar6, lVar7, cVarE, lVarE, f16, n1Var2, iB, z16, rVar, (i16 & 126) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (i19 & 1879048192), ((i16 >> 27) & 14) | (i25 & 112) | (i25 & 896) | (i25 & 7168) | (i25 & 57344) | (i25 & 458752), 0);
        if (t.k()) {
            t.n();
        }
    }
}
