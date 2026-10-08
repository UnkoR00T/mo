package p046f2;

import androidx.compose.foundation.layout.d;
import b1.l;
import c5.h;
import d1.a3;
import d1.i;
import d1.m3;
import d1.q3;
import d1.r3;
import er.a;
import er.p;
import er.q;
import f3.c;
import f3.j;
import f3.m;
import h2.y1;
import l2.k0;
import l2.k1;
import l2.u;
import l2.v;
import l2.w;
import l2.x;
import l2.y;
import n3.y2;
import n4.f0;
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
import p114t0.a0;
import p114t0.c0;
import p114t0.k;
import q4.TextStyle;

/* JADX INFO: renamed from: f2.rc, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b \u001ai\u0010\u000f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0081\u0001\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0081\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b\"\u0010#\"\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010(\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%\"\u0014\u0010*\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%\"\u0014\u0010,\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%\"\u0014\u0010.\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010%\"\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00104\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010%\"\u0014\u00106\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010%\"\u0014\u00108\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010%\"\u0014\u00109\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%\"\u0014\u0010;\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010%\"\u0014\u0010=\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00101\"\u0014\u0010?\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010%\"\u0014\u0010A\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010%\"\u0014\u0010B\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%\"\u0014\u0010C\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%\"\u0014\u0010E\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010%\"\u0014\u0010G\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00101\"\u0014\u0010I\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010%\"\u0014\u0010K\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010%\"\u0014\u0010M\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010%\"\u0014\u0010N\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%¨\u0006O"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onClick", "Lf3/m;", "modifier", "Ln3/y2;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lf2/gc;", "elevation", "Lb1/l;", "interactionSource", "content", "o", "(Ler/a;Lf3/m;Ln3/y2;JJLf2/gc;Lb1/l;Ler/p;Lm2/r;II)V", "Lq4/b4;", "textStyle", "Lc5/h;", "minWidth", "minHeight", "p", "(Ler/a;Lq4/b4;FFLf3/m;Ln3/y2;JJLf2/gc;Lb1/l;Ler/p;Lm2/r;III)V", "text", "icon", "", "expanded", "j", "(Ler/p;Ler/p;Ler/a;Lf3/m;ZLn3/y2;JJLf2/gc;Lb1/l;Lm2/r;II)V", "Lt0/e0;", "v", "(Lm2/r;I)Lt0/e0;", "Lt0/c0;", "w", "(Lm2/r;I)Lt0/c0;", "a", "F", "SmallExtendedFabMinimumWidth", "b", "SmallExtendedFabMinimumHeight", "c", "SmallExtendedFabPaddingStart", "d", "SmallExtendedFabPaddingEnd", "e", "SmallExtendedFabIconPadding", "Ll2/k1;", "f", "Ll2/k1;", "SmallExtendedFabTextStyle", "g", "MediumExtendedFabMinimumWidth", "h", "MediumExtendedFabMinimumHeight", "i", "MediumExtendedFabPaddingStart", "MediumExtendedFabPaddingEnd", "k", "MediumExtendedFabIconPadding", "l", "MediumExtendedFabTextStyle", "m", "LargeExtendedFabMinimumWidth", "n", "LargeExtendedFabMinimumHeight", "LargeExtendedFabPaddingStart", "LargeExtendedFabPaddingEnd", "q", "LargeExtendedFabIconPadding", "r", "LargeExtendedFabTextStyle", "s", "ExtendedFabStartIconPadding", "t", "ExtendedFabEndIconPadding", "u", "ExtendedFabTextPadding", "ExtendedFabMinimumWidth", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C6459rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f57521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f57522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f57523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f57524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f57525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k1 f57526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f57527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f57528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f57529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f57530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f57531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final k1 f57532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f57533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f57534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f57535o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f57536p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f57537q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final k1 f57538r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f57539s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f57540t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f57541u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f57542v;

    static {
        x xVar = x.f115347a;
        f57521a = xVar.a();
        f57522b = xVar.a();
        f57523c = xVar.c();
        f57524d = xVar.d();
        f57525e = xVar.b();
        f57526f = k1.TitleMedium;
        v vVar = v.f115276a;
        f57527g = vVar.a();
        f57528h = vVar.a();
        f57529i = vVar.b();
        f57530j = vVar.c();
        float f15 = 12;
        f57531k = h.n(f15);
        f57532l = k1.TitleLarge;
        u uVar = u.f115253a;
        f57533m = uVar.a();
        f57534n = uVar.a();
        f57535o = uVar.b();
        f57536p = uVar.c();
        float f16 = 16;
        f57537q = h.n(f16);
        f57538r = k1.HeadlineSmall;
        f57539s = h.n(f16);
        f57540t = h.n(f15);
        f57541u = h.n(20);
        f57542v = h.n(80);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x011c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0125  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:124:0x015e A[PHI: r6 r8 r9 r10 r12 r17 r20
      0x015e: PHI (r6v9 f3.m) = (r6v5 f3.m), (r6v2 f3.m) binds: [B:143:0x01c9, B:123:0x015c] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r8v6 boolean) = (r8v3 boolean), (r8v2 boolean) binds: [B:143:0x01c9, B:123:0x015c] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r9v15 n3.y2) = (r9v10 n3.y2), (r9v7 n3.y2) binds: [B:143:0x01c9, B:123:0x015c] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r10v7 long) = (r10v4 long), (r10v3 long) binds: [B:143:0x01c9, B:123:0x015c] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r12v11 f2.gc) = (r12v5 f2.gc), (r12v2 f2.gc) binds: [B:143:0x01c9, B:123:0x015c] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r17v16 int) = (r17v9 int), (r17v20 int) binds: [B:143:0x01c9, B:123:0x015c] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r20v5 long) = (r20v2 long), (r20v6 long) binds: [B:143:0x01c9, B:123:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x016c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0171  */
    /* JADX WARN: Code duplicated, block: B:132:0x0177  */
    /* JADX WARN: Code duplicated, block: B:135:0x0186  */
    /* JADX WARN: Code duplicated, block: B:138:0x0192  */
    /* JADX WARN: Code duplicated, block: B:139:0x019d  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:150:0x021f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0230  */
    /* JADX WARN: Code duplicated, block: B:155:0x0244  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x0104  */
    /* JADX WARN: Code duplicated, block: B:98:0x0107  */
    public static final void j(final p<? super r, ? super Integer, i0> pVar, final p<? super r, ? super Integer, i0> pVar2, final a<i0> aVar, m mVar, boolean z15, y2 y2Var, long j15, long j16, gc gcVar, l lVar, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        final boolean z16;
        int i19;
        y2 y2VarC;
        long jB;
        gc gcVarA;
        int i25;
        int i26;
        int i27;
        boolean z17;
        final m mVar3;
        final boolean z18;
        final y2 y2Var2;
        final long j17;
        final gc gcVar2;
        final long j18;
        final l lVar2;
        d5 d5VarM;
        long jE;
        l lVar3;
        int i28;
        int i29;
        int i35;
        int i36;
        r rVarH = rVar.h(-1161000600);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(aVar) ? 256 : 128;
        }
        int i37 = i16 & 8;
        if (i37 == 0) {
            if ((i15 & 3072) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 2048 : 1024;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i19;
                }
                if ((196608 & i15) == 0) {
                    if ((i16 & 32) == 0) {
                        y2VarC = y2Var;
                        if (rVarH.W(y2VarC)) {
                            i36 = PKIFailureInfo.unsupportedVersion;
                        }
                        i17 |= i36;
                    } else {
                        y2VarC = y2Var;
                    }
                    i36 = PKIFailureInfo.notAuthorized;
                    i17 |= i36;
                } else {
                    y2VarC = y2Var;
                }
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        jB = j15;
                        if (rVarH.d(jB)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        }
                        i17 |= i35;
                    } else {
                        jB = j15;
                    }
                    i35 = PKIFailureInfo.signerNotTrusted;
                    i17 |= i35;
                } else {
                    jB = j15;
                }
                if ((i15 & 12582912) != 0) {
                    if ((i16 & 128) == 0 || !rVarH.d(j16)) {
                        i29 = 4194304;
                    } else {
                        i29 = 8388608;
                    }
                    i17 |= i29;
                }
                if ((i15 & 100663296) == 0) {
                    if ((i16 & 256) == 0) {
                        gcVarA = gcVar;
                        int i38 = rVarH.W(gcVarA) ? 67108864 : 33554432;
                        i17 |= i38;
                    } else {
                        gcVarA = gcVar;
                    }
                    i17 |= i38;
                } else {
                    gcVarA = gcVar;
                }
                i25 = i16 & 512;
                if (i25 != 0) {
                    if ((805306368 & i15) == 0) {
                        if (rVarH.W(lVar)) {
                            i26 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i26 = 268435456;
                        }
                        i17 |= i26;
                    }
                    i27 = i17;
                    if ((i17 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i27 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0 || rVarH.Q()) {
                            if (i37 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 32) != 0) {
                                y2VarC = fc.f55847a.c(rVarH, 6);
                                i27 &= -458753;
                            }
                            if ((i16 & 64) != 0) {
                                jB = fc.f55847a.b(rVarH, 6);
                                i27 &= -3670017;
                            }
                            if ((i16 & 128) != 0) {
                                jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                                i27 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if ((i16 & 256) != 0) {
                                gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                                i27 &= -234881025;
                            }
                            if (i25 != 0) {
                                lVar3 = null;
                            }
                            long j19 = jB;
                            gc gcVar3 = gcVarA;
                            i28 = i27;
                            y2 y2Var3 = y2VarC;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-1161000600, i28, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:881)");
                            }
                            int i39 = i28 >> 6;
                            int i45 = i28 >> 9;
                            m mVar4 = mVar2;
                            o(aVar, mVar4, y2Var3, j19, jE, gcVar3, lVar3, y2.m.d(632971498, true, new p() { // from class: f2.kc
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6459rc.k(z16, pVar2, pVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, (i39 & 112) | (i39 & 14) | 12582912 | (i45 & 896) | (i45 & 7168) | (57344 & i45) | (458752 & i45) | (i45 & 3670016), 0);
                            if (t.k()) {
                                t.n();
                            }
                            z18 = z16;
                            mVar3 = mVar4;
                            y2Var2 = y2Var3;
                            j17 = j19;
                            j18 = jE;
                            gcVar2 = gcVar3;
                            lVar2 = lVar3;
                        } else {
                            rVarH.O();
                            if ((i16 & 32) != 0) {
                                i27 &= -458753;
                            }
                            if ((i16 & 64) != 0) {
                                i27 &= -3670017;
                            }
                            if ((i16 & 128) != 0) {
                                i27 &= -29360129;
                            }
                            if ((i16 & 256) != 0) {
                                i27 &= -234881025;
                            }
                            jE = j16;
                        }
                        lVar3 = lVar;
                        long j110 = jB;
                        gc gcVar4 = gcVarA;
                        i28 = i27;
                        y2 y2Var4 = y2VarC;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-1161000600, i28, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:881)");
                        }
                        int i310 = i28 >> 6;
                        int i46 = i28 >> 9;
                        m mVar5 = mVar2;
                        o(aVar, mVar5, y2Var4, j110, jE, gcVar4, lVar3, y2.m.d(632971498, true, new p() { // from class: f2.kc
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6459rc.k(z16, pVar2, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i310 & 112) | (i310 & 14) | 12582912 | (i46 & 896) | (i46 & 7168) | (57344 & i46) | (458752 & i46) | (i46 & 3670016), 0);
                        if (t.k()) {
                            t.n();
                        }
                        z18 = z16;
                        mVar3 = mVar5;
                        y2Var2 = y2Var4;
                        j17 = j110;
                        j18 = jE;
                        gcVar2 = gcVar4;
                        lVar2 = lVar3;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        z18 = z16;
                        y2Var2 = y2VarC;
                        j17 = jB;
                        gcVar2 = gcVarA;
                        j18 = j16;
                        lVar2 = lVar;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.lc
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6459rc.n(pVar, pVar2, aVar, mVar3, z18, y2Var2, j17, j18, gcVar2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 805306368;
                i27 = i17;
                if ((i17 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 32) != 0) {
                            y2VarC = fc.f55847a.c(rVarH, 6);
                            i27 &= -458753;
                        }
                        if ((i16 & 64) != 0) {
                            jB = fc.f55847a.b(rVarH, 6);
                            i27 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                            i27 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i16 & 256) != 0) {
                            gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                            i27 &= -234881025;
                        }
                        if (i25 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    } else {
                        if (i37 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 32) != 0) {
                            y2VarC = fc.f55847a.c(rVarH, 6);
                            i27 &= -458753;
                        }
                        if ((i16 & 64) != 0) {
                            jB = fc.f55847a.b(rVarH, 6);
                            i27 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                            i27 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i16 & 256) != 0) {
                            gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                            i27 &= -234881025;
                        }
                        if (i25 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    }
                    long j111 = jB;
                    gc gcVar5 = gcVarA;
                    i28 = i27;
                    y2 y2Var5 = y2VarC;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1161000600, i28, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:881)");
                    }
                    int i311 = i28 >> 6;
                    int i47 = i28 >> 9;
                    m mVar6 = mVar2;
                    o(aVar, mVar6, y2Var5, j111, jE, gcVar5, lVar3, y2.m.d(632971498, true, new p() { // from class: f2.kc
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6459rc.k(z16, pVar2, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i311 & 112) | (i311 & 14) | 12582912 | (i47 & 896) | (i47 & 7168) | (57344 & i47) | (458752 & i47) | (i47 & 3670016), 0);
                    if (t.k()) {
                        t.n();
                    }
                    z18 = z16;
                    mVar3 = mVar6;
                    y2Var2 = y2Var5;
                    j17 = j111;
                    j18 = jE;
                    gcVar2 = gcVar5;
                    lVar2 = lVar3;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarC;
                    j17 = jB;
                    gcVar2 = gcVarA;
                    j18 = j16;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.lc
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6459rc.n(pVar, pVar2, aVar, mVar3, z18, y2Var2, j17, j18, gcVar2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            z16 = z15;
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    y2VarC = y2Var;
                    if (rVarH.W(y2VarC)) {
                        i36 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i36;
                } else {
                    y2VarC = y2Var;
                }
                i36 = PKIFailureInfo.notAuthorized;
                i17 |= i36;
            } else {
                y2VarC = y2Var;
            }
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    jB = j15;
                    if (rVarH.d(jB)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    }
                    i17 |= i35;
                } else {
                    jB = j15;
                }
                i35 = PKIFailureInfo.signerNotTrusted;
                i17 |= i35;
            } else {
                jB = j15;
            }
            if ((i15 & 12582912) != 0) {
                if ((i16 & 128) == 0) {
                    i29 = 4194304;
                } else {
                    i29 = 4194304;
                }
                i17 |= i29;
            }
            if ((i15 & 100663296) == 0) {
                if ((i16 & 256) == 0) {
                    gcVarA = gcVar;
                    if (rVarH.W(gcVarA)) {
                    }
                    i17 |= i38;
                } else {
                    gcVarA = gcVar;
                }
                i17 |= i38;
            } else {
                gcVarA = gcVar;
            }
            i25 = i16 & 512;
            if (i25 != 0) {
                if ((805306368 & i15) == 0) {
                    if (rVarH.W(lVar)) {
                        i26 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i26 = 268435456;
                    }
                    i17 |= i26;
                }
                i27 = i17;
                if ((i17 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 32) != 0) {
                            y2VarC = fc.f55847a.c(rVarH, 6);
                            i27 &= -458753;
                        }
                        if ((i16 & 64) != 0) {
                            jB = fc.f55847a.b(rVarH, 6);
                            i27 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                            i27 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i16 & 256) != 0) {
                            gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                            i27 &= -234881025;
                        }
                        if (i25 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    } else {
                        if (i37 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 32) != 0) {
                            y2VarC = fc.f55847a.c(rVarH, 6);
                            i27 &= -458753;
                        }
                        if ((i16 & 64) != 0) {
                            jB = fc.f55847a.b(rVarH, 6);
                            i27 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                            i27 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i16 & 256) != 0) {
                            gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                            i27 &= -234881025;
                        }
                        if (i25 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    }
                    long j112 = jB;
                    gc gcVar6 = gcVarA;
                    i28 = i27;
                    y2 y2Var6 = y2VarC;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1161000600, i28, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:881)");
                    }
                    int i312 = i28 >> 6;
                    int i48 = i28 >> 9;
                    m mVar7 = mVar2;
                    o(aVar, mVar7, y2Var6, j112, jE, gcVar6, lVar3, y2.m.d(632971498, true, new p() { // from class: f2.kc
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6459rc.k(z16, pVar2, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i312 & 112) | (i312 & 14) | 12582912 | (i48 & 896) | (i48 & 7168) | (57344 & i48) | (458752 & i48) | (i48 & 3670016), 0);
                    if (t.k()) {
                        t.n();
                    }
                    z18 = z16;
                    mVar3 = mVar7;
                    y2Var2 = y2Var6;
                    j17 = j112;
                    j18 = jE;
                    gcVar2 = gcVar6;
                    lVar2 = lVar3;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarC;
                    j17 = jB;
                    gcVar2 = gcVarA;
                    j18 = j16;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.lc
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6459rc.n(pVar, pVar2, aVar, mVar3, z18, y2Var2, j17, j18, gcVar2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 805306368;
            i27 = i17;
            if ((i17 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i27 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 32) != 0) {
                        y2VarC = fc.f55847a.c(rVarH, 6);
                        i27 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i27 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                        i27 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i16 & 256) != 0) {
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i27 &= -234881025;
                    }
                    if (i25 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                } else {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 32) != 0) {
                        y2VarC = fc.f55847a.c(rVarH, 6);
                        i27 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i27 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                        i27 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i16 & 256) != 0) {
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i27 &= -234881025;
                    }
                    if (i25 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                }
                long j113 = jB;
                gc gcVar7 = gcVarA;
                i28 = i27;
                y2 y2Var7 = y2VarC;
                rVarH.y();
                if (t.k()) {
                    t.o(-1161000600, i28, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:881)");
                }
                int i313 = i28 >> 6;
                int i49 = i28 >> 9;
                m mVar8 = mVar2;
                o(aVar, mVar8, y2Var7, j113, jE, gcVar7, lVar3, y2.m.d(632971498, true, new p() { // from class: f2.kc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6459rc.k(z16, pVar2, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i313 & 112) | (i313 & 14) | 12582912 | (i49 & 896) | (i49 & 7168) | (57344 & i49) | (458752 & i49) | (i49 & 3670016), 0);
                if (t.k()) {
                    t.n();
                }
                z18 = z16;
                mVar3 = mVar8;
                y2Var2 = y2Var7;
                j17 = j113;
                j18 = jE;
                gcVar2 = gcVar7;
                lVar2 = lVar3;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
                y2Var2 = y2VarC;
                j17 = jB;
                gcVar2 = gcVarA;
                j18 = j16;
                lVar2 = lVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.lc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6459rc.n(pVar, pVar2, aVar, mVar3, z18, y2Var2, j17, j18, gcVar2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        mVar2 = mVar;
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    y2VarC = y2Var;
                    if (rVarH.W(y2VarC)) {
                        i36 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i36;
                } else {
                    y2VarC = y2Var;
                }
                i36 = PKIFailureInfo.notAuthorized;
                i17 |= i36;
            } else {
                y2VarC = y2Var;
            }
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    jB = j15;
                    if (rVarH.d(jB)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    }
                    i17 |= i35;
                } else {
                    jB = j15;
                }
                i35 = PKIFailureInfo.signerNotTrusted;
                i17 |= i35;
            } else {
                jB = j15;
            }
            if ((i15 & 12582912) != 0) {
                if ((i16 & 128) == 0) {
                    i29 = 4194304;
                } else {
                    i29 = 4194304;
                }
                i17 |= i29;
            }
            if ((i15 & 100663296) == 0) {
                if ((i16 & 256) == 0) {
                    gcVarA = gcVar;
                    if (rVarH.W(gcVarA)) {
                    }
                    i17 |= i38;
                } else {
                    gcVarA = gcVar;
                }
                i17 |= i38;
            } else {
                gcVarA = gcVar;
            }
            i25 = i16 & 512;
            if (i25 != 0) {
                if ((805306368 & i15) == 0) {
                    if (rVarH.W(lVar)) {
                        i26 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i26 = 268435456;
                    }
                    i17 |= i26;
                }
                i27 = i17;
                if ((i17 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 32) != 0) {
                            y2VarC = fc.f55847a.c(rVarH, 6);
                            i27 &= -458753;
                        }
                        if ((i16 & 64) != 0) {
                            jB = fc.f55847a.b(rVarH, 6);
                            i27 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                            i27 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i16 & 256) != 0) {
                            gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                            i27 &= -234881025;
                        }
                        if (i25 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    } else {
                        if (i37 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 32) != 0) {
                            y2VarC = fc.f55847a.c(rVarH, 6);
                            i27 &= -458753;
                        }
                        if ((i16 & 64) != 0) {
                            jB = fc.f55847a.b(rVarH, 6);
                            i27 &= -3670017;
                        }
                        if ((i16 & 128) != 0) {
                            jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                            i27 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i16 & 256) != 0) {
                            gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                            i27 &= -234881025;
                        }
                        if (i25 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    }
                    long j114 = jB;
                    gc gcVar8 = gcVarA;
                    i28 = i27;
                    y2 y2Var8 = y2VarC;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1161000600, i28, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:881)");
                    }
                    int i314 = i28 >> 6;
                    int i410 = i28 >> 9;
                    m mVar9 = mVar2;
                    o(aVar, mVar9, y2Var8, j114, jE, gcVar8, lVar3, y2.m.d(632971498, true, new p() { // from class: f2.kc
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6459rc.k(z16, pVar2, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i314 & 112) | (i314 & 14) | 12582912 | (i410 & 896) | (i410 & 7168) | (57344 & i410) | (458752 & i410) | (i410 & 3670016), 0);
                    if (t.k()) {
                        t.n();
                    }
                    z18 = z16;
                    mVar3 = mVar9;
                    y2Var2 = y2Var8;
                    j17 = j114;
                    j18 = jE;
                    gcVar2 = gcVar8;
                    lVar2 = lVar3;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarC;
                    j17 = jB;
                    gcVar2 = gcVarA;
                    j18 = j16;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.lc
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6459rc.n(pVar, pVar2, aVar, mVar3, z18, y2Var2, j17, j18, gcVar2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 805306368;
            i27 = i17;
            if ((i17 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i27 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 32) != 0) {
                        y2VarC = fc.f55847a.c(rVarH, 6);
                        i27 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i27 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                        i27 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i16 & 256) != 0) {
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i27 &= -234881025;
                    }
                    if (i25 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                } else {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 32) != 0) {
                        y2VarC = fc.f55847a.c(rVarH, 6);
                        i27 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i27 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                        i27 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i16 & 256) != 0) {
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i27 &= -234881025;
                    }
                    if (i25 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                }
                long j115 = jB;
                gc gcVar9 = gcVarA;
                i28 = i27;
                y2 y2Var9 = y2VarC;
                rVarH.y();
                if (t.k()) {
                    t.o(-1161000600, i28, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:881)");
                }
                int i315 = i28 >> 6;
                int i411 = i28 >> 9;
                m mVar10 = mVar2;
                o(aVar, mVar10, y2Var9, j115, jE, gcVar9, lVar3, y2.m.d(632971498, true, new p() { // from class: f2.kc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6459rc.k(z16, pVar2, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i315 & 112) | (i315 & 14) | 12582912 | (i411 & 896) | (i411 & 7168) | (57344 & i411) | (458752 & i411) | (i411 & 3670016), 0);
                if (t.k()) {
                    t.n();
                }
                z18 = z16;
                mVar3 = mVar10;
                y2Var2 = y2Var9;
                j17 = j115;
                j18 = jE;
                gcVar2 = gcVar9;
                lVar2 = lVar3;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
                y2Var2 = y2VarC;
                j17 = jB;
                gcVar2 = gcVarA;
                j18 = j16;
                lVar2 = lVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.lc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6459rc.n(pVar, pVar2, aVar, mVar3, z18, y2Var2, j17, j18, gcVar2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        z16 = z15;
        if ((196608 & i15) == 0) {
            if ((i16 & 32) == 0) {
                y2VarC = y2Var;
                if (rVarH.W(y2VarC)) {
                    i36 = PKIFailureInfo.unsupportedVersion;
                }
                i17 |= i36;
            } else {
                y2VarC = y2Var;
            }
            i36 = PKIFailureInfo.notAuthorized;
            i17 |= i36;
        } else {
            y2VarC = y2Var;
        }
        if ((1572864 & i15) == 0) {
            if ((i16 & 64) == 0) {
                jB = j15;
                if (rVarH.d(jB)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                }
                i17 |= i35;
            } else {
                jB = j15;
            }
            i35 = PKIFailureInfo.signerNotTrusted;
            i17 |= i35;
        } else {
            jB = j15;
        }
        if ((i15 & 12582912) != 0) {
            if ((i16 & 128) == 0) {
                i29 = 4194304;
            } else {
                i29 = 4194304;
            }
            i17 |= i29;
        }
        if ((i15 & 100663296) == 0) {
            if ((i16 & 256) == 0) {
                gcVarA = gcVar;
                if (rVarH.W(gcVarA)) {
                }
                i17 |= i38;
            } else {
                gcVarA = gcVar;
            }
            i17 |= i38;
        } else {
            gcVarA = gcVar;
        }
        i25 = i16 & 512;
        if (i25 != 0) {
            if ((805306368 & i15) == 0) {
                if (rVarH.W(lVar)) {
                    i26 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i26 = 268435456;
                }
                i17 |= i26;
            }
            i27 = i17;
            if ((i17 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i27 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 32) != 0) {
                        y2VarC = fc.f55847a.c(rVarH, 6);
                        i27 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i27 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                        i27 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i16 & 256) != 0) {
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i27 &= -234881025;
                    }
                    if (i25 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                } else {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 32) != 0) {
                        y2VarC = fc.f55847a.c(rVarH, 6);
                        i27 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i27 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                        i27 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i16 & 256) != 0) {
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i27 &= -234881025;
                    }
                    if (i25 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                }
                long j116 = jB;
                gc gcVar10 = gcVarA;
                i28 = i27;
                y2 y2Var10 = y2VarC;
                rVarH.y();
                if (t.k()) {
                    t.o(-1161000600, i28, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:881)");
                }
                int i316 = i28 >> 6;
                int i412 = i28 >> 9;
                m mVar11 = mVar2;
                o(aVar, mVar11, y2Var10, j116, jE, gcVar10, lVar3, y2.m.d(632971498, true, new p() { // from class: f2.kc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6459rc.k(z16, pVar2, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i316 & 112) | (i316 & 14) | 12582912 | (i412 & 896) | (i412 & 7168) | (57344 & i412) | (458752 & i412) | (i412 & 3670016), 0);
                if (t.k()) {
                    t.n();
                }
                z18 = z16;
                mVar3 = mVar11;
                y2Var2 = y2Var10;
                j17 = j116;
                j18 = jE;
                gcVar2 = gcVar10;
                lVar2 = lVar3;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
                y2Var2 = y2VarC;
                j17 = jB;
                gcVar2 = gcVarA;
                j18 = j16;
                lVar2 = lVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.lc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6459rc.n(pVar, pVar2, aVar, mVar3, z18, y2Var2, j17, j18, gcVar2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 805306368;
        i27 = i17;
        if ((i17 & 306783379) != 306783378) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i27 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i37 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if ((i16 & 32) != 0) {
                    y2VarC = fc.f55847a.c(rVarH, 6);
                    i27 &= -458753;
                }
                if ((i16 & 64) != 0) {
                    jB = fc.f55847a.b(rVarH, 6);
                    i27 &= -3670017;
                }
                if ((i16 & 128) != 0) {
                    jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                    i27 &= -29360129;
                } else {
                    jE = j16;
                }
                if ((i16 & 256) != 0) {
                    gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                    i27 &= -234881025;
                }
                if (i25 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
            } else {
                if (i37 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if ((i16 & 32) != 0) {
                    y2VarC = fc.f55847a.c(rVarH, 6);
                    i27 &= -458753;
                }
                if ((i16 & 64) != 0) {
                    jB = fc.f55847a.b(rVarH, 6);
                    i27 &= -3670017;
                }
                if ((i16 & 128) != 0) {
                    jE = g2.e(jB, rVarH, (i27 >> 18) & 14);
                    i27 &= -29360129;
                } else {
                    jE = j16;
                }
                if ((i16 & 256) != 0) {
                    gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                    i27 &= -234881025;
                }
                if (i25 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
            }
            long j117 = jB;
            gc gcVar11 = gcVarA;
            i28 = i27;
            y2 y2Var11 = y2VarC;
            rVarH.y();
            if (t.k()) {
                t.o(-1161000600, i28, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:881)");
            }
            int i317 = i28 >> 6;
            int i413 = i28 >> 9;
            m mVar12 = mVar2;
            o(aVar, mVar12, y2Var11, j117, jE, gcVar11, lVar3, y2.m.d(632971498, true, new p() { // from class: f2.kc
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6459rc.k(z16, pVar2, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, (i317 & 112) | (i317 & 14) | 12582912 | (i413 & 896) | (i413 & 7168) | (57344 & i413) | (458752 & i413) | (i413 & 3670016), 0);
            if (t.k()) {
                t.n();
            }
            z18 = z16;
            mVar3 = mVar12;
            y2Var2 = y2Var11;
            j17 = j117;
            j18 = jE;
            gcVar2 = gcVar11;
            lVar2 = lVar3;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            z18 = z16;
            y2Var2 = y2VarC;
            j17 = jB;
            gcVar2 = gcVarA;
            j18 = j16;
            lVar2 = lVar;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.lc
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6459rc.n(pVar, pVar2, aVar, mVar3, z18, y2Var2, j17, j18, gcVar2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(boolean z15, p pVar, final p pVar2, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(632971498, i15, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:891)");
            }
            m mVarR = a3.r(d.x(m.INSTANCE, z15 ? f57542v : y.f115379a.c(), 0.0f, 0.0f, 0.0f, 14, null), z15 ? f57539s : h.n(0), 0.0f, z15 ? f57541u : h.n(0), 0.0f, 10, null);
            c.InterfaceC1317c interfaceC1317cI = c.INSTANCE.i();
            i iVar = i.f39152a;
            w0 w0VarB = m3.b(z15 ? iVar.j() : iVar.e(), interfaceC1317cI, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarB, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            q3 q3Var = q3.f39261a;
            pVar.B(rVar, 0);
            k.f(q3Var, z15, null, w(rVar, 0), v(rVar, 0), null, y2.m.d(-660008666, true, new q() { // from class: f2.nc
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return C6459rc.l(pVar2, (p114t0.l) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 1572870, 18);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(p pVar, p114t0.l lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-660008666, i15, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:914)");
        }
        m.Companion companion = m.INSTANCE;
        Object objE = rVar.E();
        if (objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: f2.jc
                @Override // er.l
                public final Object b(Object obj) {
                    return C6459rc.m((n4.i0) obj);
                }
            };
            rVar.v(objE);
        }
        m mVarA = n4.v.a(companion, (er.l) objE);
        w0 w0VarB = m3.b(i.f39152a.j(), c.INSTANCE.l(), rVar, 0);
        int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
        e0 e0VarT = rVar.t();
        m mVarE = j.e(rVar, mVarA);
        androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
        a<androidx.compose.ui.node.c> aVarB = companion2.b();
        if (rVar.l() == null) {
            p076m2.m.d();
        }
        rVar.K();
        if (rVar.getInserting()) {
            rVar.H(aVarB);
        } else {
            rVar.u();
        }
        r rVarC = n6.c(rVar);
        n6.i(rVarC, w0VarB, companion2.d());
        n6.i(rVarC, e0VarT, companion2.f());
        n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
        n6.g(rVarC, companion2.a());
        n6.i(rVarC, mVarE, companion2.e());
        q3 q3Var = q3.f39261a;
        r3.a(d.y(companion, f57540t), rVar, 6);
        pVar.B(rVar, 0);
        rVar.x();
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(n4.i0 i0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(p pVar, p pVar2, a aVar, m mVar, boolean z15, y2 y2Var, long j15, long j16, gc gcVar, l lVar, int i15, int i16, r rVar, int i17) {
        j(pVar, pVar2, aVar, mVar, z15, y2Var, j15, j16, gcVar, lVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0131  */
    /* JADX WARN: Code duplicated, block: B:111:0x0136  */
    /* JADX WARN: Code duplicated, block: B:112:0x0141  */
    /* JADX WARN: Code duplicated, block: B:115:0x0147  */
    /* JADX WARN: Code duplicated, block: B:116:0x0150  */
    /* JADX WARN: Code duplicated, block: B:119:0x0155  */
    /* JADX WARN: Code duplicated, block: B:122:0x0166  */
    /* JADX WARN: Code duplicated, block: B:123:0x0182  */
    /* JADX WARN: Code duplicated, block: B:125:0x018b  */
    /* JADX WARN: Code duplicated, block: B:127:0x019c  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:133:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:135:0x020c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0220  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0070  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:54:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    public static final void o(final a<i0> aVar, m mVar, y2 y2Var, long j15, long j16, gc gcVar, l lVar, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        y2 y2Var2;
        long j17;
        long j18;
        gc gcVarA;
        int i18;
        l lVar2;
        int i19;
        p<? super r, ? super Integer, i0> pVar2;
        boolean z15;
        final m mVar3;
        final y2 y2Var3;
        final gc gcVar2;
        final long j19;
        final long j25;
        final l lVar3;
        d5 d5VarM;
        m mVar4;
        y2 y2VarD;
        long jB;
        int i25;
        int i26;
        l lVar4;
        y2 y2Var4;
        long j26;
        int i27;
        long j27;
        int i28;
        int i29;
        int i35;
        int i36;
        r rVarH = rVar.h(748201188);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i37 = i16 & 2;
        if (i37 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i16 & 4) == 0) {
                    y2Var2 = y2Var;
                    int i38 = rVarH.W(y2Var2) ? 256 : 128;
                    i17 |= i38;
                } else {
                    y2Var2 = y2Var;
                }
                i17 |= i38;
            } else {
                y2Var2 = y2Var;
            }
            if ((i15 & 3072) == 0) {
                j17 = j15;
                if ((i16 & 8) == 0 || !rVarH.d(j17)) {
                    i36 = 1024;
                } else {
                    i36 = 2048;
                }
                i17 |= i36;
            } else {
                j17 = j15;
            }
            if ((i15 & 24576) == 0) {
                j18 = j16;
                if ((i16 & 16) == 0 || !rVarH.d(j18)) {
                    i35 = PKIFailureInfo.certRevoked;
                } else {
                    i35 = 16384;
                }
                i17 |= i35;
            } else {
                j18 = j16;
            }
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    gcVarA = gcVar;
                    if (rVarH.W(gcVarA)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i29;
                } else {
                    gcVarA = gcVar;
                }
                i29 = PKIFailureInfo.notAuthorized;
                i17 |= i29;
            } else {
                gcVarA = gcVar;
            }
            i18 = i16 & 64;
            if (i18 != 0) {
                if ((1572864 & i15) == 0) {
                    lVar2 = lVar;
                    if (rVarH.W(lVar2)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i19;
                }
                if ((12582912 & i15) == 0) {
                    pVar2 = pVar;
                    if (rVarH.G(pVar2)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i17 |= i28;
                } else {
                    pVar2 = pVar;
                }
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0 || rVarH.Q()) {
                        if (i37 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            y2VarD = fc.f55847a.d(rVarH, 6);
                        } else {
                            y2VarD = y2Var2;
                        }
                        if ((i16 & 8) != 0) {
                            jB = fc.f55847a.b(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            jB = j17;
                        }
                        if ((i16 & 16) != 0) {
                            long jE = g2.e(jB, rVarH, (i17 >> 9) & 14);
                            i17 &= -57345;
                            j18 = jE;
                        }
                        i25 = i17;
                        if ((i16 & 32) != 0) {
                            i26 = 6;
                            gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                            i17 = i25 & (-458753);
                        } else {
                            i26 = 6;
                            i17 = i25;
                        }
                        if (i18 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar2;
                        }
                        y2Var4 = y2VarD;
                        j26 = jB;
                        i27 = 748201188;
                        j27 = j18;
                    } else {
                        rVarH.O();
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                        }
                        i26 = 6;
                        mVar4 = mVar2;
                        y2Var4 = y2Var2;
                        gcVarA = gcVarA;
                        j26 = j17;
                        j27 = j18;
                        lVar4 = lVar2;
                        i27 = 748201188;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(i27, i17, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:141)");
                    }
                    TextStyle textStyleE = ds.e(w.f115308a.b(), rVarH, i26);
                    y yVar = y.f115379a;
                    int i39 = i17 << 9;
                    p(aVar, textStyleE, yVar.c(), yVar.a(), mVar4, y2Var4, j26, j27, gcVarA, lVar4, pVar2, rVarH, (i17 & 14) | 3456 | (57344 & i39) | (458752 & i39) | (3670016 & i39) | (29360128 & i39) | (234881024 & i39) | (i39 & 1879048192), (i17 >> 21) & 14, 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar4;
                    y2Var3 = y2Var4;
                    j19 = j26;
                    j25 = j27;
                    gcVar2 = gcVarA;
                    lVar3 = lVar4;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    y2Var3 = y2Var2;
                    gcVar2 = gcVarA;
                    j19 = j17;
                    j25 = j18;
                    lVar3 = lVar2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.mc
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6459rc.q(aVar, mVar3, y2Var3, j19, j25, gcVar2, lVar3, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            lVar2 = lVar;
            if ((12582912 & i15) == 0) {
                pVar2 = pVar;
                if (rVarH.G(pVar2)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i17 |= i28;
            } else {
                pVar2 = pVar;
            }
            if ((i17 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        y2VarD = fc.f55847a.d(rVarH, 6);
                    } else {
                        y2VarD = y2Var2;
                    }
                    if ((i16 & 8) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        jB = j17;
                    }
                    if ((i16 & 16) != 0) {
                        long jE2 = g2.e(jB, rVarH, (i17 >> 9) & 14);
                        i17 &= -57345;
                        j18 = jE2;
                    }
                    i25 = i17;
                    if ((i16 & 32) != 0) {
                        i26 = 6;
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i17 = i25 & (-458753);
                    } else {
                        i26 = 6;
                        i17 = i25;
                    }
                    if (i18 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    y2Var4 = y2VarD;
                    j26 = jB;
                    i27 = 748201188;
                    j27 = j18;
                } else {
                    if (i37 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        y2VarD = fc.f55847a.d(rVarH, 6);
                    } else {
                        y2VarD = y2Var2;
                    }
                    if ((i16 & 8) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        jB = j17;
                    }
                    if ((i16 & 16) != 0) {
                        long jE3 = g2.e(jB, rVarH, (i17 >> 9) & 14);
                        i17 &= -57345;
                        j18 = jE3;
                    }
                    i25 = i17;
                    if ((i16 & 32) != 0) {
                        i26 = 6;
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i17 = i25 & (-458753);
                    } else {
                        i26 = 6;
                        i17 = i25;
                    }
                    if (i18 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    y2Var4 = y2VarD;
                    j26 = jB;
                    i27 = 748201188;
                    j27 = j18;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(i27, i17, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:141)");
                }
                TextStyle textStyleE2 = ds.e(w.f115308a.b(), rVarH, i26);
                y yVar2 = y.f115379a;
                int i310 = i17 << 9;
                p(aVar, textStyleE2, yVar2.c(), yVar2.a(), mVar4, y2Var4, j26, j27, gcVarA, lVar4, pVar2, rVarH, (i17 & 14) | 3456 | (57344 & i310) | (458752 & i310) | (3670016 & i310) | (29360128 & i310) | (234881024 & i310) | (i310 & 1879048192), (i17 >> 21) & 14, 0);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar4;
                y2Var3 = y2Var4;
                j19 = j26;
                j25 = j27;
                gcVar2 = gcVarA;
                lVar3 = lVar4;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                y2Var3 = y2Var2;
                gcVar2 = gcVarA;
                j19 = j17;
                j25 = j18;
                lVar3 = lVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.mc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6459rc.q(aVar, mVar3, y2Var3, j19, j25, gcVar2, lVar3, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) == 0) {
                y2Var2 = y2Var;
                if (rVarH.W(y2Var2)) {
                }
                i17 |= i38;
            } else {
                y2Var2 = y2Var;
            }
            i17 |= i38;
        } else {
            y2Var2 = y2Var;
        }
        if ((i15 & 3072) == 0) {
            j17 = j15;
            if ((i16 & 8) == 0) {
                i36 = 1024;
            } else {
                i36 = 1024;
            }
            i17 |= i36;
        } else {
            j17 = j15;
        }
        if ((i15 & 24576) == 0) {
            j18 = j16;
            if ((i16 & 16) == 0) {
                i35 = PKIFailureInfo.certRevoked;
            } else {
                i35 = PKIFailureInfo.certRevoked;
            }
            i17 |= i35;
        } else {
            j18 = j16;
        }
        if ((196608 & i15) == 0) {
            if ((i16 & 32) == 0) {
                gcVarA = gcVar;
                if (rVarH.W(gcVarA)) {
                    i29 = PKIFailureInfo.unsupportedVersion;
                }
                i17 |= i29;
            } else {
                gcVarA = gcVar;
            }
            i29 = PKIFailureInfo.notAuthorized;
            i17 |= i29;
        } else {
            gcVarA = gcVar;
        }
        i18 = i16 & 64;
        if (i18 != 0) {
            if ((1572864 & i15) == 0) {
                lVar2 = lVar;
                if (rVarH.W(lVar2)) {
                    i19 = PKIFailureInfo.badCertTemplate;
                } else {
                    i19 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i19;
            }
            if ((12582912 & i15) == 0) {
                pVar2 = pVar;
                if (rVarH.G(pVar2)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i17 |= i28;
            } else {
                pVar2 = pVar;
            }
            if ((i17 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        y2VarD = fc.f55847a.d(rVarH, 6);
                    } else {
                        y2VarD = y2Var2;
                    }
                    if ((i16 & 8) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        jB = j17;
                    }
                    if ((i16 & 16) != 0) {
                        long jE4 = g2.e(jB, rVarH, (i17 >> 9) & 14);
                        i17 &= -57345;
                        j18 = jE4;
                    }
                    i25 = i17;
                    if ((i16 & 32) != 0) {
                        i26 = 6;
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i17 = i25 & (-458753);
                    } else {
                        i26 = 6;
                        i17 = i25;
                    }
                    if (i18 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    y2Var4 = y2VarD;
                    j26 = jB;
                    i27 = 748201188;
                    j27 = j18;
                } else {
                    if (i37 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        y2VarD = fc.f55847a.d(rVarH, 6);
                    } else {
                        y2VarD = y2Var2;
                    }
                    if ((i16 & 8) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        jB = j17;
                    }
                    if ((i16 & 16) != 0) {
                        long jE5 = g2.e(jB, rVarH, (i17 >> 9) & 14);
                        i17 &= -57345;
                        j18 = jE5;
                    }
                    i25 = i17;
                    if ((i16 & 32) != 0) {
                        i26 = 6;
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i17 = i25 & (-458753);
                    } else {
                        i26 = 6;
                        i17 = i25;
                    }
                    if (i18 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    y2Var4 = y2VarD;
                    j26 = jB;
                    i27 = 748201188;
                    j27 = j18;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(i27, i17, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:141)");
                }
                TextStyle textStyleE3 = ds.e(w.f115308a.b(), rVarH, i26);
                y yVar3 = y.f115379a;
                int i311 = i17 << 9;
                p(aVar, textStyleE3, yVar3.c(), yVar3.a(), mVar4, y2Var4, j26, j27, gcVarA, lVar4, pVar2, rVarH, (i17 & 14) | 3456 | (57344 & i311) | (458752 & i311) | (3670016 & i311) | (29360128 & i311) | (234881024 & i311) | (i311 & 1879048192), (i17 >> 21) & 14, 0);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar4;
                y2Var3 = y2Var4;
                j19 = j26;
                j25 = j27;
                gcVar2 = gcVarA;
                lVar3 = lVar4;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                y2Var3 = y2Var2;
                gcVar2 = gcVarA;
                j19 = j17;
                j25 = j18;
                lVar3 = lVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.mc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6459rc.q(aVar, mVar3, y2Var3, j19, j25, gcVar2, lVar3, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 1572864;
        lVar2 = lVar;
        if ((12582912 & i15) == 0) {
            pVar2 = pVar;
            if (rVarH.G(pVar2)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i17 |= i28;
        } else {
            pVar2 = pVar;
        }
        if ((i17 & 4793491) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i37 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    y2VarD = fc.f55847a.d(rVarH, 6);
                } else {
                    y2VarD = y2Var2;
                }
                if ((i16 & 8) != 0) {
                    jB = fc.f55847a.b(rVarH, 6);
                    i17 &= -7169;
                } else {
                    jB = j17;
                }
                if ((i16 & 16) != 0) {
                    long jE6 = g2.e(jB, rVarH, (i17 >> 9) & 14);
                    i17 &= -57345;
                    j18 = jE6;
                }
                i25 = i17;
                if ((i16 & 32) != 0) {
                    i26 = 6;
                    gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                    i17 = i25 & (-458753);
                } else {
                    i26 = 6;
                    i17 = i25;
                }
                if (i18 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar2;
                }
                y2Var4 = y2VarD;
                j26 = jB;
                i27 = 748201188;
                j27 = j18;
            } else {
                if (i37 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    y2VarD = fc.f55847a.d(rVarH, 6);
                } else {
                    y2VarD = y2Var2;
                }
                if ((i16 & 8) != 0) {
                    jB = fc.f55847a.b(rVarH, 6);
                    i17 &= -7169;
                } else {
                    jB = j17;
                }
                if ((i16 & 16) != 0) {
                    long jE7 = g2.e(jB, rVarH, (i17 >> 9) & 14);
                    i17 &= -57345;
                    j18 = jE7;
                }
                i25 = i17;
                if ((i16 & 32) != 0) {
                    i26 = 6;
                    gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                    i17 = i25 & (-458753);
                } else {
                    i26 = 6;
                    i17 = i25;
                }
                if (i18 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar2;
                }
                y2Var4 = y2VarD;
                j26 = jB;
                i27 = 748201188;
                j27 = j18;
            }
            rVarH.y();
            if (t.k()) {
                t.o(i27, i17, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:141)");
            }
            TextStyle textStyleE4 = ds.e(w.f115308a.b(), rVarH, i26);
            y yVar4 = y.f115379a;
            int i312 = i17 << 9;
            p(aVar, textStyleE4, yVar4.c(), yVar4.a(), mVar4, y2Var4, j26, j27, gcVarA, lVar4, pVar2, rVarH, (i17 & 14) | 3456 | (57344 & i312) | (458752 & i312) | (3670016 & i312) | (29360128 & i312) | (234881024 & i312) | (i312 & 1879048192), (i17 >> 21) & 14, 0);
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar4;
            y2Var3 = y2Var4;
            j19 = j26;
            j25 = j27;
            gcVar2 = gcVarA;
            lVar3 = lVar4;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            y2Var3 = y2Var2;
            gcVar2 = gcVarA;
            j19 = j17;
            j25 = j18;
            lVar3 = lVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.mc
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6459rc.q(aVar, mVar3, y2Var3, j19, j25, gcVar2, lVar3, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0117  */
    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0135  */
    /* JADX WARN: Code duplicated, block: B:112:0x013e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0153  */
    /* JADX WARN: Code duplicated, block: B:130:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x018a  */
    /* JADX WARN: Code duplicated, block: B:132:0x018d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0192  */
    /* JADX WARN: Code duplicated, block: B:136:0x019d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:152:0x0202  */
    /* JADX WARN: Code duplicated, block: B:155:0x020e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0218  */
    /* JADX WARN: Code duplicated, block: B:159:0x022a  */
    /* JADX WARN: Code duplicated, block: B:161:0x0237  */
    /* JADX WARN: Code duplicated, block: B:164:0x024d  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:169:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:172:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:97:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0114  */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    private static final void p(final a<i0> aVar, final TextStyle textStyle, final float f15, final float f16, m mVar, y2 y2Var, long j15, long j16, gc gcVar, l lVar, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16, final int i17) {
        int i18;
        m mVar2;
        y2 y2Var2;
        int i19;
        long jE;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z15;
        final gc gcVar2;
        final l lVar2;
        final m mVar3;
        final y2 y2Var3;
        final long j17;
        final long j18;
        d5 d5VarM;
        m mVar4;
        y2 y2VarD;
        long jB;
        int i29;
        boolean z16;
        l lVar3;
        boolean z17;
        gc gcVarA;
        l lVar4;
        y2 y2Var4;
        long j19;
        long j25;
        ?? r15;
        l lVar5;
        Object objE;
        Object objE2;
        int i35;
        int i36;
        int i37;
        int i38;
        r rVarH = rVar.h(121669932);
        if ((i15 & 6) == 0) {
            i18 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= rVarH.W(textStyle) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.b(f15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= rVarH.b(f16) ? 2048 : 1024;
        }
        int i39 = i17 & 16;
        if (i39 == 0) {
            if ((i15 & 24576) == 0) {
                mVar2 = mVar;
                i18 |= rVarH.W(mVar2) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i15) == 0) {
                if ((i17 & 32) == 0) {
                    y2Var2 = y2Var;
                    if (rVarH.W(y2Var2)) {
                        i38 = PKIFailureInfo.unsupportedVersion;
                    }
                    i18 |= i38;
                } else {
                    y2Var2 = y2Var;
                }
                i38 = PKIFailureInfo.notAuthorized;
                i18 |= i38;
            } else {
                y2Var2 = y2Var;
            }
            if ((1572864 & i15) == 0) {
                int i45 = i18;
                if ((i17 & 64) == 0 || !rVarH.d(j15)) {
                    i37 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i37 = PKIFailureInfo.badCertTemplate;
                }
                i19 = i45 | i37;
            } else {
                i19 = i18;
            }
            if ((i15 & 12582912) == 0) {
                jE = j16;
                if ((i17 & 128) == 0 || !rVarH.d(jE)) {
                    i36 = 4194304;
                } else {
                    i36 = 8388608;
                }
                i19 |= i36;
            } else {
                jE = j16;
            }
            if ((i15 & 100663296) != 0) {
                i19 |= ((i17 & 256) == 0 || !rVarH.W(gcVar)) ? 33554432 : 67108864;
            }
            i25 = i17 & 512;
            if (i25 != 0) {
                if ((i15 & 805306368) == 0) {
                    if (rVarH.W(lVar)) {
                        i26 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i26 = 268435456;
                    }
                    i19 |= i26;
                }
                if ((i16 & 6) == 0) {
                    if (rVarH.G(pVar)) {
                        i35 = 4;
                    } else {
                        i35 = 2;
                    }
                    i27 = i16 | i35;
                } else {
                    i27 = i16;
                }
                i28 = i27;
                if ((i19 & 306783379) == 306783378 || (i28 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i19 & 1)) {
                    rVarH.I();
                    char c15 = 6;
                    if ((i15 & 1) != 0 || rVarH.Q()) {
                        if (i39 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 32) != 0) {
                            i19 &= -458753;
                            y2VarD = fc.f55847a.d(rVarH, 6);
                        } else {
                            y2VarD = y2Var2;
                        }
                        if ((i17 & 64) != 0) {
                            jB = fc.f55847a.b(rVarH, 6);
                            i19 &= -3670017;
                        } else {
                            jB = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jB, rVarH, (i19 >> 18) & 14);
                            i19 &= -29360129;
                        }
                        i29 = i19;
                        if ((i17 & 256) != 0) {
                            z16 = false;
                            lVar3 = null;
                            z17 = true;
                            gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                            i19 = i29 & (-234881025);
                        } else {
                            z16 = false;
                            lVar3 = null;
                            z17 = true;
                            gcVarA = gcVar;
                            i19 = i29;
                        }
                        mVar2 = mVar4;
                        if (i25 != 0) {
                            lVar4 = lVar3;
                        } else {
                            lVar4 = lVar;
                        }
                        y2Var4 = y2VarD;
                        j19 = jB;
                        j25 = jE;
                        r15 = z17;
                    } else {
                        rVarH.O();
                        if ((i17 & 32) != 0) {
                            i19 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            i19 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            i19 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            i19 &= -234881025;
                        }
                        j19 = j15;
                        z16 = false;
                        c15 = 6;
                        lVar3 = null;
                        j25 = jE;
                        i28 = i28;
                        r15 = 1;
                        gcVarA = gcVar;
                        lVar4 = lVar;
                        y2Var4 = y2Var2;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(121669932, i19, i28, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:168)");
                    }
                    if (lVar4 == null) {
                        rVarH.X(-282853233);
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = b1.k.a();
                            rVarH.v(objE2);
                        }
                        lVar5 = (l) objE2;
                        rVarH.R();
                    } else {
                        rVarH.X(960706376);
                        rVarH.R();
                        lVar5 = lVar4;
                    }
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.l() { // from class: f2.oc
                            @Override // er.l
                            public final Object b(Object obj) {
                                return C6459rc.r((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    final long j26 = j25;
                    int i46 = i19 >> 6;
                    androidx.compose.material3.l.i(aVar, n4.v.d(mVar2, z16, (er.l) objE, r15, lVar3), false, y2Var4, j19, j25, gcVarA.getDefaultElevation(), gcVarA.f(lVar5, rVarH, (i19 >> 21) & 112).getValue().getValue(), null, lVar5, y2.m.d(-1779603465, r15, new p() { // from class: f2.pc
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6459rc.s(j26, textStyle, f15, f16, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i19 & 14) | (i46 & 7168) | (57344 & i46) | (i46 & 458752), 6, 260);
                    if (t.k()) {
                        t.n();
                    }
                    gcVar2 = gcVarA;
                    lVar2 = lVar4;
                    mVar3 = mVar2;
                    y2Var3 = y2Var4;
                    j18 = j19;
                    j17 = j25;
                } else {
                    rVarH.O();
                    gcVar2 = gcVar;
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    y2Var3 = y2Var2;
                    j17 = jE;
                    j18 = j15;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.qc
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6459rc.u(aVar, textStyle, f15, f16, mVar3, y2Var3, j18, j17, gcVar2, lVar2, pVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 805306368;
            if ((i16 & 6) == 0) {
                if (rVarH.G(pVar)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i27 = i16 | i35;
            } else {
                i27 = i16;
            }
            i28 = i27;
            if ((i19 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (rVarH.r(z15, i19 & 1)) {
                rVarH.I();
                char c16 = 6;
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 32) != 0) {
                        i19 &= -458753;
                        y2VarD = fc.f55847a.d(rVarH, 6);
                    } else {
                        y2VarD = y2Var2;
                    }
                    if ((i17 & 64) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i19 &= -3670017;
                    } else {
                        jB = j15;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(jB, rVarH, (i19 >> 18) & 14);
                        i19 &= -29360129;
                    }
                    i29 = i19;
                    if ((i17 & 256) != 0) {
                        z16 = false;
                        lVar3 = null;
                        z17 = true;
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i19 = i29 & (-234881025);
                    } else {
                        z16 = false;
                        lVar3 = null;
                        z17 = true;
                        gcVarA = gcVar;
                        i19 = i29;
                    }
                    mVar2 = mVar4;
                    if (i25 != 0) {
                        lVar4 = lVar3;
                    } else {
                        lVar4 = lVar;
                    }
                    y2Var4 = y2VarD;
                    j19 = jB;
                    j25 = jE;
                    r15 = z17;
                } else {
                    if (i39 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 32) != 0) {
                        i19 &= -458753;
                        y2VarD = fc.f55847a.d(rVarH, 6);
                    } else {
                        y2VarD = y2Var2;
                    }
                    if ((i17 & 64) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i19 &= -3670017;
                    } else {
                        jB = j15;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(jB, rVarH, (i19 >> 18) & 14);
                        i19 &= -29360129;
                    }
                    i29 = i19;
                    if ((i17 & 256) != 0) {
                        z16 = false;
                        lVar3 = null;
                        z17 = true;
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i19 = i29 & (-234881025);
                    } else {
                        z16 = false;
                        lVar3 = null;
                        z17 = true;
                        gcVarA = gcVar;
                        i19 = i29;
                    }
                    mVar2 = mVar4;
                    if (i25 != 0) {
                        lVar4 = lVar3;
                    } else {
                        lVar4 = lVar;
                    }
                    y2Var4 = y2VarD;
                    j19 = jB;
                    j25 = jE;
                    r15 = z17;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(121669932, i19, i28, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:168)");
                }
                if (lVar4 == null) {
                    rVarH.X(-282853233);
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = b1.k.a();
                        rVarH.v(objE2);
                    }
                    lVar5 = (l) objE2;
                    rVarH.R();
                } else {
                    rVarH.X(960706376);
                    rVarH.R();
                    lVar5 = lVar4;
                }
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new er.l() { // from class: f2.oc
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6459rc.r((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                final long j27 = j25;
                int i47 = i19 >> 6;
                androidx.compose.material3.l.i(aVar, n4.v.d(mVar2, z16, (er.l) objE, r15, lVar3), false, y2Var4, j19, j25, gcVarA.getDefaultElevation(), gcVarA.f(lVar5, rVarH, (i19 >> 21) & 112).getValue().getValue(), null, lVar5, y2.m.d(-1779603465, r15, new p() { // from class: f2.pc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6459rc.s(j27, textStyle, f15, f16, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i19 & 14) | (i47 & 7168) | (57344 & i47) | (i47 & 458752), 6, 260);
                if (t.k()) {
                    t.n();
                }
                gcVar2 = gcVarA;
                lVar2 = lVar4;
                mVar3 = mVar2;
                y2Var3 = y2Var4;
                j18 = j19;
                j17 = j25;
            } else {
                rVarH.O();
                gcVar2 = gcVar;
                lVar2 = lVar;
                mVar3 = mVar2;
                y2Var3 = y2Var2;
                j17 = jE;
                j18 = j15;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.qc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6459rc.u(aVar, textStyle, f15, f16, mVar3, y2Var3, j18, j17, gcVar2, lVar2, pVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 24576;
        mVar2 = mVar;
        if ((196608 & i15) == 0) {
            if ((i17 & 32) == 0) {
                y2Var2 = y2Var;
                if (rVarH.W(y2Var2)) {
                    i38 = PKIFailureInfo.unsupportedVersion;
                }
                i18 |= i38;
            } else {
                y2Var2 = y2Var;
            }
            i38 = PKIFailureInfo.notAuthorized;
            i18 |= i38;
        } else {
            y2Var2 = y2Var;
        }
        if ((1572864 & i15) == 0) {
            int i48 = i18;
            if ((i17 & 64) == 0) {
                i37 = PKIFailureInfo.signerNotTrusted;
            } else {
                i37 = PKIFailureInfo.signerNotTrusted;
            }
            i19 = i48 | i37;
        } else {
            i19 = i18;
        }
        if ((i15 & 12582912) == 0) {
            jE = j16;
            if ((i17 & 128) == 0) {
                i36 = 4194304;
            } else {
                i36 = 4194304;
            }
            i19 |= i36;
        } else {
            jE = j16;
        }
        if ((i15 & 100663296) != 0) {
            i19 |= ((i17 & 256) == 0 || !rVarH.W(gcVar)) ? 33554432 : 67108864;
        }
        i25 = i17 & 512;
        if (i25 != 0) {
            if ((i15 & 805306368) == 0) {
                if (rVarH.W(lVar)) {
                    i26 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i26 = 268435456;
                }
                i19 |= i26;
            }
            if ((i16 & 6) == 0) {
                if (rVarH.G(pVar)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i27 = i16 | i35;
            } else {
                i27 = i16;
            }
            i28 = i27;
            if ((i19 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (rVarH.r(z15, i19 & 1)) {
                rVarH.I();
                char c17 = 6;
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 32) != 0) {
                        i19 &= -458753;
                        y2VarD = fc.f55847a.d(rVarH, 6);
                    } else {
                        y2VarD = y2Var2;
                    }
                    if ((i17 & 64) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i19 &= -3670017;
                    } else {
                        jB = j15;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(jB, rVarH, (i19 >> 18) & 14);
                        i19 &= -29360129;
                    }
                    i29 = i19;
                    if ((i17 & 256) != 0) {
                        z16 = false;
                        lVar3 = null;
                        z17 = true;
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i19 = i29 & (-234881025);
                    } else {
                        z16 = false;
                        lVar3 = null;
                        z17 = true;
                        gcVarA = gcVar;
                        i19 = i29;
                    }
                    mVar2 = mVar4;
                    if (i25 != 0) {
                        lVar4 = lVar3;
                    } else {
                        lVar4 = lVar;
                    }
                    y2Var4 = y2VarD;
                    j19 = jB;
                    j25 = jE;
                    r15 = z17;
                } else {
                    if (i39 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 32) != 0) {
                        i19 &= -458753;
                        y2VarD = fc.f55847a.d(rVarH, 6);
                    } else {
                        y2VarD = y2Var2;
                    }
                    if ((i17 & 64) != 0) {
                        jB = fc.f55847a.b(rVarH, 6);
                        i19 &= -3670017;
                    } else {
                        jB = j15;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(jB, rVarH, (i19 >> 18) & 14);
                        i19 &= -29360129;
                    }
                    i29 = i19;
                    if ((i17 & 256) != 0) {
                        z16 = false;
                        lVar3 = null;
                        z17 = true;
                        gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                        i19 = i29 & (-234881025);
                    } else {
                        z16 = false;
                        lVar3 = null;
                        z17 = true;
                        gcVarA = gcVar;
                        i19 = i29;
                    }
                    mVar2 = mVar4;
                    if (i25 != 0) {
                        lVar4 = lVar3;
                    } else {
                        lVar4 = lVar;
                    }
                    y2Var4 = y2VarD;
                    j19 = jB;
                    j25 = jE;
                    r15 = z17;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(121669932, i19, i28, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:168)");
                }
                if (lVar4 == null) {
                    rVarH.X(-282853233);
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = b1.k.a();
                        rVarH.v(objE2);
                    }
                    lVar5 = (l) objE2;
                    rVarH.R();
                } else {
                    rVarH.X(960706376);
                    rVarH.R();
                    lVar5 = lVar4;
                }
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new er.l() { // from class: f2.oc
                        @Override // er.l
                        public final Object b(Object obj) {
                            return C6459rc.r((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                final long j28 = j25;
                int i49 = i19 >> 6;
                androidx.compose.material3.l.i(aVar, n4.v.d(mVar2, z16, (er.l) objE, r15, lVar3), false, y2Var4, j19, j25, gcVarA.getDefaultElevation(), gcVarA.f(lVar5, rVarH, (i19 >> 21) & 112).getValue().getValue(), null, lVar5, y2.m.d(-1779603465, r15, new p() { // from class: f2.pc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6459rc.s(j28, textStyle, f15, f16, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i19 & 14) | (i49 & 7168) | (57344 & i49) | (i49 & 458752), 6, 260);
                if (t.k()) {
                    t.n();
                }
                gcVar2 = gcVarA;
                lVar2 = lVar4;
                mVar3 = mVar2;
                y2Var3 = y2Var4;
                j18 = j19;
                j17 = j25;
            } else {
                rVarH.O();
                gcVar2 = gcVar;
                lVar2 = lVar;
                mVar3 = mVar2;
                y2Var3 = y2Var2;
                j17 = jE;
                j18 = j15;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.qc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6459rc.u(aVar, textStyle, f15, f16, mVar3, y2Var3, j18, j17, gcVar2, lVar2, pVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 805306368;
        if ((i16 & 6) == 0) {
            if (rVarH.G(pVar)) {
                i35 = 4;
            } else {
                i35 = 2;
            }
            i27 = i16 | i35;
        } else {
            i27 = i16;
        }
        i28 = i27;
        if ((i19 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (rVarH.r(z15, i19 & 1)) {
            rVarH.I();
            char c18 = 6;
            if ((i15 & 1) != 0) {
                if (i39 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 32) != 0) {
                    i19 &= -458753;
                    y2VarD = fc.f55847a.d(rVarH, 6);
                } else {
                    y2VarD = y2Var2;
                }
                if ((i17 & 64) != 0) {
                    jB = fc.f55847a.b(rVarH, 6);
                    i19 &= -3670017;
                } else {
                    jB = j15;
                }
                if ((i17 & 128) != 0) {
                    jE = g2.e(jB, rVarH, (i19 >> 18) & 14);
                    i19 &= -29360129;
                }
                i29 = i19;
                if ((i17 & 256) != 0) {
                    z16 = false;
                    lVar3 = null;
                    z17 = true;
                    gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                    i19 = i29 & (-234881025);
                } else {
                    z16 = false;
                    lVar3 = null;
                    z17 = true;
                    gcVarA = gcVar;
                    i19 = i29;
                }
                mVar2 = mVar4;
                if (i25 != 0) {
                    lVar4 = lVar3;
                } else {
                    lVar4 = lVar;
                }
                y2Var4 = y2VarD;
                j19 = jB;
                j25 = jE;
                r15 = z17;
            } else {
                if (i39 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 32) != 0) {
                    i19 &= -458753;
                    y2VarD = fc.f55847a.d(rVarH, 6);
                } else {
                    y2VarD = y2Var2;
                }
                if ((i17 & 64) != 0) {
                    jB = fc.f55847a.b(rVarH, 6);
                    i19 &= -3670017;
                } else {
                    jB = j15;
                }
                if ((i17 & 128) != 0) {
                    jE = g2.e(jB, rVarH, (i19 >> 18) & 14);
                    i19 &= -29360129;
                }
                i29 = i19;
                if ((i17 & 256) != 0) {
                    z16 = false;
                    lVar3 = null;
                    z17 = true;
                    gcVarA = fc.f55847a.a(0.0f, 0.0f, 0.0f, 0.0f, rVarH, 24576, 15);
                    i19 = i29 & (-234881025);
                } else {
                    z16 = false;
                    lVar3 = null;
                    z17 = true;
                    gcVarA = gcVar;
                    i19 = i29;
                }
                mVar2 = mVar4;
                if (i25 != 0) {
                    lVar4 = lVar3;
                } else {
                    lVar4 = lVar;
                }
                y2Var4 = y2VarD;
                j19 = jB;
                j25 = jE;
                r15 = z17;
            }
            rVarH.y();
            if (t.k()) {
                t.o(121669932, i19, i28, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:168)");
            }
            if (lVar4 == null) {
                rVarH.X(-282853233);
                objE2 = rVarH.E();
                if (objE2 == r.INSTANCE.a()) {
                    objE2 = b1.k.a();
                    rVarH.v(objE2);
                }
                lVar5 = (l) objE2;
                rVarH.R();
            } else {
                rVarH.X(960706376);
                rVarH.R();
                lVar5 = lVar4;
            }
            objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: f2.oc
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6459rc.r((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            final long j29 = j25;
            int i410 = i19 >> 6;
            androidx.compose.material3.l.i(aVar, n4.v.d(mVar2, z16, (er.l) objE, r15, lVar3), false, y2Var4, j19, j25, gcVarA.getDefaultElevation(), gcVarA.f(lVar5, rVarH, (i19 >> 21) & 112).getValue().getValue(), null, lVar5, y2.m.d(-1779603465, r15, new p() { // from class: f2.pc
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6459rc.s(j29, textStyle, f15, f16, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, (i19 & 14) | (i410 & 7168) | (57344 & i410) | (i410 & 458752), 6, 260);
            if (t.k()) {
                t.n();
            }
            gcVar2 = gcVarA;
            lVar2 = lVar4;
            mVar3 = mVar2;
            y2Var3 = y2Var4;
            j18 = j19;
            j17 = j25;
        } else {
            rVarH.O();
            gcVar2 = gcVar;
            lVar2 = lVar;
            mVar3 = mVar2;
            y2Var3 = y2Var2;
            j17 = jE;
            j18 = j15;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.qc
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6459rc.u(aVar, textStyle, f15, f16, mVar3, y2Var3, j18, j17, gcVar2, lVar2, pVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(a aVar, m mVar, y2 y2Var, long j15, long j16, gc gcVar, l lVar, p pVar, int i15, int i16, r rVar, int i17) {
        o(aVar, mVar, y2Var, j15, j16, gcVar, lVar, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(n4.i0 i0Var) {
        f0.r0(i0Var, n4.l.INSTANCE.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(long j15, TextStyle textStyle, final float f15, final float f16, final p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1779603465, i15, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:181)");
            }
            y1.b(j15, textStyle, y2.m.d(-1767363041, true, new p() { // from class: f2.ic
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6459rc.t(f15, f16, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(float f15, float f16, p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1767363041, i15, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:182)");
            }
            m mVarA = d.a(m.INSTANCE, f15, f16);
            w0 w0VarI = d1.r.i(c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarA);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(a aVar, TextStyle textStyle, float f15, float f16, m mVar, y2 y2Var, long j15, long j16, gc gcVar, l lVar, p pVar, int i15, int i16, int i17, r rVar, int i18) {
        p(aVar, textStyle, f15, f16, mVar, y2Var, j15, j16, gcVar, lVar, pVar, rVar, g4.a(i15 | 1), g4.a(i16), i17);
        return i0.f148189a;
    }

    private static final p114t0.e0 v(r rVar, int i15) {
        if (t.k()) {
            t.o(-56172201, i15, -1, "androidx.compose.material3.extendedFabCollapseAnimation (FloatingActionButton.kt:1465)");
        }
        p114t0.e0 e0VarC = a0.q(of.b(k0.FastEffects, rVar, 6), 0.0f, 2, null).c(a0.w(of.b(k0.DefaultSpatial, rVar, 6), c.INSTANCE.k(), false, null, 12, null));
        if (t.k()) {
            t.n();
        }
        return e0VarC;
    }

    private static final c0 w(r rVar, int i15) {
        if (t.k()) {
            t.o(-719787506, i15, -1, "androidx.compose.material3.extendedFabExpandAnimation (FloatingActionButton.kt:1476)");
        }
        c0 c0VarC = a0.o(of.b(k0.DefaultEffects, rVar, 6), 0.0f, 2, null).c(a0.i(of.b(k0.FastSpatial, rVar, 6), c.INSTANCE.k(), false, null, 12, null));
        if (t.k()) {
            t.n();
        }
        return c0VarC;
    }
}
