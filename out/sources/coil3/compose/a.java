package coil3.compose;

import er.l;
import er.p;
import f3.j;
import f3.m;
import kc.s;
import mc.ContentPainterElement;
import n3.n1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p3.f;
import zc.ImageRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aß\u0001\u0010 \u001a\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!\u001a¡\u0001\u0010%\u001a\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0\f2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010&\u001a\u0085\u0001\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0\f2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"", "model", "", "contentDescription", "Lkc/s;", "imageLoader", "Lf3/m;", "modifier", "Landroidx/compose/ui/graphics/painter/a;", "placeholder", "error", "fallback", "Lkotlin/Function1;", "Lcoil3/compose/AsyncImagePainter$State$Loading;", "Loq/i0;", "onLoading", "Lcoil3/compose/AsyncImagePainter$State$Success;", "onSuccess", "Lcoil3/compose/AsyncImagePainter$State$Error;", "onError", "Lf3/c;", "alignment", "Le4/l;", "contentScale", "", "alpha", "Ln3/n1;", "colorFilter", "Ln3/v1;", "filterQuality", "", "clipToBounds", "c", "(Ljava/lang/Object;Ljava/lang/String;Lkc/s;Lf3/m;Landroidx/compose/ui/graphics/painter/a;Landroidx/compose/ui/graphics/painter/a;Landroidx/compose/ui/graphics/painter/a;Ler/l;Ler/l;Ler/l;Lf3/c;Le4/l;FLn3/n1;IZLm2/r;III)V", "Lcoil3/compose/AsyncImagePainter$State;", "transform", "onState", "d", "(Ljava/lang/Object;Ljava/lang/String;Lkc/s;Lf3/m;Ler/l;Ler/l;Lf3/c;Le4/l;FLn3/n1;IZLm2/r;III)V", "Lmc/c;", "state", "b", "(Lmc/c;Ljava/lang/String;Lf3/m;Ler/l;Ler/l;Lf3/c;Le4/l;FLn3/n1;IZLm2/r;II)V", "coil-compose-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    private static final void b(final mc.c cVar, final String str, final m mVar, final l<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> lVar, final l<? super AsyncImagePainter.State, i0> lVar2, final f3.c cVar2, final p036e4.l lVar3, final float f15, final n1 n1Var, final int i15, final boolean z15, r rVar, final int i16, final int i17) {
        mc.c cVar3;
        int i18;
        String str2;
        l<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> lVar4;
        l<? super AsyncImagePainter.State, i0> lVar5;
        f3.c cVar4;
        float f16;
        n1 n1Var2;
        int i19;
        int i25;
        r rVarH = rVar.h(1236588022);
        if ((i16 & 6) == 0) {
            cVar3 = cVar;
            i18 = (rVarH.W(cVar3) ? 4 : 2) | i16;
        } else {
            cVar3 = cVar;
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            str2 = str;
            i18 |= rVarH.W(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.W(mVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            lVar4 = lVar;
            i18 |= rVarH.G(lVar4) ? 2048 : 1024;
        } else {
            lVar4 = lVar;
        }
        if ((i16 & 24576) == 0) {
            lVar5 = lVar2;
            i18 |= rVarH.G(lVar5) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            lVar5 = lVar2;
        }
        if ((196608 & i16) == 0) {
            cVar4 = cVar2;
            i18 |= rVarH.W(cVar4) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            cVar4 = cVar2;
        }
        if ((1572864 & i16) == 0) {
            i18 |= rVarH.W(lVar3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i16) == 0) {
            f16 = f15;
            i18 |= rVarH.b(f16) ? 8388608 : 4194304;
        } else {
            f16 = f15;
        }
        if ((100663296 & i16) == 0) {
            n1Var2 = n1Var;
            i18 |= rVarH.W(n1Var2) ? 67108864 : 33554432;
        } else {
            n1Var2 = n1Var;
        }
        if ((805306368 & i16) == 0) {
            i19 = i15;
            i18 |= rVarH.c(i19) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            i19 = i15;
        }
        if ((i17 & 6) == 0) {
            i25 = i17 | (rVarH.a(z15) ? 4 : 2);
        } else {
            i25 = i17;
        }
        if (rVarH.r(((i18 & 306783379) == 306783378 && (i25 & 3) == 2) ? false : true, i18 & 1)) {
            if (t.k()) {
                t.o(1236588022, i18, i25, "coil3.compose.AsyncImage (AsyncImage.kt:152)");
            }
            ImageRequest imageRequestL = mc.m.l(cVar3.getModel(), lVar3, rVarH, (i18 >> 15) & 112);
            mc.m.u(imageRequestL);
            int i26 = i19;
            m mVarU = mVar.u(new ContentPainterElement(imageRequestL, cVar3.getImageLoader(), cVar3.getModelEqualityDelegate(), lVar4, lVar5, i26, cVar4, lVar3, f16, n1Var2, z15, mc.m.j(rVarH, 0), str2, null));
            w0 w0VarF = mc.m.f();
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            m mVarE = j.e(rVarH, mVarU);
            e0 e0VarT = rVarH.t();
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarF, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, mVarE, companion.e());
            p<androidx.compose.ui.node.c, Integer, i0> pVarC = companion.c();
            if (rVarC.getInserting() || !fr.t.c(rVarC.E(), Integer.valueOf(iHashCode))) {
                rVarC.v(Integer.valueOf(iHashCode));
                rVarC.j(Integer.valueOf(iHashCode), pVarC);
            }
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: lc.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return coil3.compose.a.e(cVar, str, mVar, lVar, lVar2, cVar2, lVar3, f15, n1Var, i15, z15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void c(Object obj, String str, s sVar, m mVar, androidx.compose.ui.graphics.painter.a aVar, androidx.compose.ui.graphics.painter.a aVar2, androidx.compose.ui.graphics.painter.a aVar3, l<? super AsyncImagePainter.State.Loading, i0> lVar, l<? super AsyncImagePainter.State.Success, i0> lVar2, l<? super AsyncImagePainter.State.Error, i0> lVar3, f3.c cVar, p036e4.l lVar4, float f15, n1 n1Var, int i15, boolean z15, r rVar, int i16, int i17, int i18) {
        m mVar2 = (i18 & 8) != 0 ? m.INSTANCE : mVar;
        androidx.compose.ui.graphics.painter.a aVar4 = (i18 & 16) != 0 ? null : aVar;
        androidx.compose.ui.graphics.painter.a aVar5 = (i18 & 32) != 0 ? null : aVar2;
        androidx.compose.ui.graphics.painter.a aVar6 = (i18 & 64) != 0 ? aVar5 : aVar3;
        l<? super AsyncImagePainter.State.Loading, i0> lVar5 = (i18 & 128) != 0 ? null : lVar;
        l<? super AsyncImagePainter.State.Success, i0> lVar6 = (i18 & 256) != 0 ? null : lVar2;
        l<? super AsyncImagePainter.State.Error, i0> lVar7 = (i18 & 512) != 0 ? null : lVar3;
        f3.c cVarE = (i18 & 1024) != 0 ? f3.c.INSTANCE.e() : cVar;
        p036e4.l lVarE = (i18 & 2048) != 0 ? p036e4.l.INSTANCE.e() : lVar4;
        float f16 = (i18 & PKIFailureInfo.certConfirmed) != 0 ? 1.0f : f15;
        n1 n1Var2 = (i18 & PKIFailureInfo.certRevoked) == 0 ? n1Var : null;
        int iB = (i18 & 16384) != 0 ? f.INSTANCE.b() : i15;
        boolean z16 = (i18 & 32768) != 0 ? true : z15;
        if (t.k()) {
            t.o(-1128374444, i16, i17, "coil3.compose.AsyncImage (AsyncImage.kt:72)");
        }
        int i19 = i17 << 15;
        b(new mc.c(obj, (lc.b) rVar.N(lc.j.c()), sVar), str, mVar2, mc.m.q(aVar4, aVar5, aVar6), mc.m.h(lVar5, lVar6, lVar7), cVarE, lVarE, f16, n1Var2, iB, z16, rVar, ((i16 >> 3) & 896) | (i16 & 112) | (458752 & i19) | (3670016 & i19) | (29360128 & i19) | (234881024 & i19) | (i19 & 1879048192), (i17 >> 15) & 14);
        if (t.k()) {
            t.n();
        }
    }

    public static final void d(Object obj, String str, s sVar, m mVar, l<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> lVar, l<? super AsyncImagePainter.State, i0> lVar2, f3.c cVar, p036e4.l lVar3, float f15, n1 n1Var, int i15, boolean z15, r rVar, int i16, int i17, int i18) {
        m mVar2 = (i18 & 8) != 0 ? m.INSTANCE : mVar;
        l<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> lVarA = (i18 & 16) != 0 ? AsyncImagePainter.INSTANCE.a() : lVar;
        l<? super AsyncImagePainter.State, i0> lVar4 = (i18 & 32) != 0 ? null : lVar2;
        f3.c cVarE = (i18 & 64) != 0 ? f3.c.INSTANCE.e() : cVar;
        p036e4.l lVarE = (i18 & 128) != 0 ? p036e4.l.INSTANCE.e() : lVar3;
        float f16 = (i18 & 256) != 0 ? 1.0f : f15;
        n1 n1Var2 = (i18 & 512) != 0 ? null : n1Var;
        int iB = (i18 & 1024) != 0 ? f.INSTANCE.b() : i15;
        boolean z16 = (i18 & 2048) != 0 ? true : z15;
        if (t.k()) {
            t.o(40041566, i16, i17, "coil3.compose.AsyncImage (AsyncImage.kt:125)");
        }
        int i19 = i16 >> 3;
        b(new mc.c(obj, (lc.b) rVar.N(lc.j.c()), sVar), str, mVar2, lVarA, lVar4, cVarE, lVarE, f16, n1Var2, iB, z16, rVar, (i16 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (29360128 & i19) | (i19 & 234881024) | ((i17 << 27) & 1879048192), (i17 >> 3) & 14);
        if (t.k()) {
            t.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(mc.c cVar, String str, m mVar, l lVar, l lVar2, f3.c cVar2, p036e4.l lVar3, float f15, n1 n1Var, int i15, boolean z15, int i16, int i17, r rVar, int i18) {
        b(cVar, str, mVar, lVar, lVar2, cVar2, lVar3, f15, n1Var, i15, z15, rVar, g4.a(i16 | 1), g4.a(i17));
        return i0.f148189a;
    }
}
